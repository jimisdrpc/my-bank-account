package com.mybank.service

import com.mybank.model.Account
import com.mybank.repository.AccountRepository
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class AccountService {

    @Inject
    lateinit var accountRepository: AccountRepository

    fun addAccount(a: Account) : Account {
        accountRepository.save(a)
        return a
    }

    fun findAccountById(id: Long): Account {
        return accountRepository.findById(id).orElse(null)

    }
}