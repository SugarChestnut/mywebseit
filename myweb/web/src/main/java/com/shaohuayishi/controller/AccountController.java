package com.shaohuayishi.controller;

import com.shaohuayishi.domain.Account;
import com.shaohuayishi.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @anthor: ren
 * @date: 2019/3/26
 */
@Controller
@RequestMapping("/account")
public class AccountController {

    @Autowired
    private AccountService accountService;

    @RequestMapping("/find")
    public String findById(Model model) {
        Account account = accountService.findById(1);
        System.out.println(account);
        model.addAttribute("account", account);
        return "itemDetail";
    }
}
