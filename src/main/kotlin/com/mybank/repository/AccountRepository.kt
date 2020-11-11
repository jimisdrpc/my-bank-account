package com.mybank.repository

import com.mybank.model.Account
import io.micronaut.data.annotation.Repository
import io.micronaut.data.repository.CrudRepository

@Repository
interface AccountRepository : CrudRepository<Account, Long> {
}