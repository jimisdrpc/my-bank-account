package com.mybank.controller

import io.micronaut.http.HttpResponse
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get

@Controller("/accounts")
class AccountController {

    @Get("/")
    fun index(): HttpResponse<String> {
        return HttpResponse.ok("teste")
    }
}