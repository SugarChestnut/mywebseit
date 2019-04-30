package cn.rentaotao.controller;

import cn.rentaotao.pojo.Result;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.*;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

/**
 * @anthor: ren
 * @date: 2019/4/24
 */

@RestController
@RequestMapping("/python")
public class PythonController {

    @RequestMapping("/getPage")
    public Result getPage() {

        //获取指定文件路径
        String filePath = getFilePath("mzitu.txt");
        if (filePath == null) {
            return new Result(false, filePath, null);
        }
        File file = new File(filePath);
        //结果
        String str = "";
        //行数据
        String line = "";
        //字符缓冲流
        BufferedReader br = null;
        try {
            br = new BufferedReader(new InputStreamReader(new FileInputStream(file), Charset.forName("utf-8")));
            //读取文件
            while ((line = br.readLine()) != null) {
                //替换空格为实体
                line.replaceAll(" ", "&nbsp;");
                str += line + "</br>";
            }
            return new Result(true, "filePath", str);
        } catch (Exception e) {
            System.out.println("文件读取失败");
        } finally {
            if (br != null) {
                try {
                    //关闭缓冲流
                    br.close();
                } catch (Exception e) {
                    //
                }
            }
        }

        return new Result(false, "filePath", null);
    }


    private String getFilePath(String fileName) {
        //获取系统路径分隔符
        String fileSeparator = File.separator;
        //根路径
        String classPath = this.getClass().getResource("/").getPath();
        //webapp路径
        String webAppRoot = classPath.replaceAll("WEB-INF/classes/", "");
        //文件存储路径
        String dirPath = webAppRoot + "study";

        List<String> list = new ArrayList<>();
        File file = new File(dirPath);
        if (file.exists() && file.isDirectory()) {
            loopTheFile(list, file);
        }
        for (int i = 0; i < list.size(); i++) {
            String[] strs = list.get(i).split("\\\\");
            if (strs[strs.length - 1].equals(fileName)) {
                return list.get(i);
            }
        }
        return null;
    }

    private void loopTheFile(List<String> list, File dir) {
        //获得文件夹下的所有文件
        File[] files = dir.listFiles();
        if (files.length != 0) {
            for (File file : files) {
                if (file.isFile()) {
                    list.add(file.getAbsolutePath());
                }
                if (file.isDirectory()) {
                    loopTheFile(list, file);
                }
            }
        }
    }
}
