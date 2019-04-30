package cn.rentaotao.pojo;

/**
 * @anthor: ren
 * @date: 2019/4/25
 */
public class Result {

    private boolean state;

    private String message;

    private String pageContent;

    public Result(boolean state, String message, String pageContent) {
        this.state = state;
        this.message = message;
        this.pageContent = pageContent;
    }

    public boolean isState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getPageContent() {
        return pageContent;
    }

    public void setPageContent(String pageContent) {
        this.pageContent = pageContent;
    }
}
