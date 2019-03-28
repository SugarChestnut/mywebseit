package com.shaohuayishi.service;


import com.shaohuayishi.domain.Account;

/**
 * @anthor: ren
 * @date: 2019/3/26
 */
public interface AccountService {

    /**
     *
     * @param id
     * @return
     */
    public Account findById(Integer id);
}
