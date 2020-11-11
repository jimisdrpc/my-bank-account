package com.mybank.controller

import com.mybank.model.AccountHolder
import com.mybank.service.AccountHolderService
import io.micronaut.http.MediaType
import io.micronaut.http.annotation.*

@Controller("/accountholders")
class AccountHolderController(private val accountHolderService: AccountHolderService) {

    @Post
    @Consumes(MediaType.APPLICATION_JSON)
    fun addAccountHolder(@Body accountHolder: AccountHolder): AccountHolder {
        return accountHolderService.addAccountHolder(accountHolder)
    }

    @Get
    fun getAccountHolder(id: Long): AccountHolder{
        return accountHolderService.findAccountHolderById(id)
    }
}