package com.mybank.repository

import com.mybank.model.AccountHolder
import io.micronaut.data.repository.CrudRepository
import io.micronaut.context.annotation.Executable
import io.micronaut.data.annotation.*

@Repository
interface AccountHolderRepository: CrudRepository<AccountHolder, Long> {
    @Executable
    fun find(name: String): AccountHolder
}