package com.mybank.controller

import com.mybank.model.AccountHolder
import com.mybank.service.AccountHolderService
import io.micronaut.http.MediaType
import io.micronaut.http.annotation.Consumes
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.Post
import javax.validation.Valid

@Controller("/accountholders")
class AccountHolderController(private val accountHolderService: AccountHolderService) {

    @Post
    @Consumes(MediaType.APPLICATION_JSON)
    fun addAccountHolder(accountHolder: AccountHolder): AccountHolder {
        return accountHolderService.addAccountHolder(accountHolder)
    }

    @Get
    fun getAccountHolder(id: Long): AccountHolder{
        return accountHolderService.findAccountHolderById(id)
    }
}