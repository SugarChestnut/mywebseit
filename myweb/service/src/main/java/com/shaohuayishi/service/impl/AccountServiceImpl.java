package com.shaohuayishi.service.impl;

import com.shaohuayishi.domain.Account;
import com.shaohuayishi.mapper.AccountMapper;
import com.shaohuayishi.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @anthor: ren
 * @date: 2019/3/26
 */
@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountMapper accountMapper;

    @Override
    public Account findById(Integer id) {
        return accountMapper.findById(id);
    }
}
