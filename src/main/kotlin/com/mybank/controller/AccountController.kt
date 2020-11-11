package com.mybank.controller

import com.mybank.model.Account
import com.mybank.service.AccountService
import io.micronaut.http.MediaType
import io.micronaut.http.annotation.*

@Controller("/accounts")
class AccountController(private val accountService: AccountService)
{

    @Post
    @Consumes(MediaType.APPLICATION_JSON)
    fun addAccount(@Body account: Account): Account {
        return accountService.addAccount(account)
    }

    @Get
    fun getAccount(id: Long): Account {
        return accountService.findAccountById(id)
    }
}