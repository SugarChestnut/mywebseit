package com.shaohuayishi.mapper;

import com.shaohuayishi.domain.Account;

/**
 * @anthor: ren
 * @date: 2019/3/26
 */
public interface AccountMapper {

    /**
     * 根据id查询账户
     * @param id
     * @return
     */
    public Account findById(Integer id);
}
