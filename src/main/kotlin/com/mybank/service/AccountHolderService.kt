package com.mybank.service

import com.mybank.model.Account
import com.mybank.model.AccountHolder
import com.mybank.repository.AccountHolderRepository
import io.micronaut.aop.Around
import io.micronaut.transaction.annotation.TransactionalAdvice
import javax.inject.Inject
import javax.inject.Singleton
import javax.persistence.EntityManager
import javax.persistence.Id
import javax.persistence.PersistenceContext
import javax.transaction.Transactional

@Singleton
class AccountHolderService () {
    @Inject
    lateinit var accountHolderRepository: AccountHolderRepository

    fun addAccountHolder(ah: AccountHolder) : AccountHolder {
        accountHolderRepository.save(ah)
        return ah
    }

    fun findAccountHolderById(id: Long): AccountHolder{
        return accountHolderRepository.findById(id).orElse(null)

    }
}

//@Singleton
//@Around
//class AccountHolderService (@PersistenceContext val entityManager: EntityManager) {
//
//    fun findAccountHolder(email : String) : AccountHolder? {
//        return try {
//            entityManager.createQuery("SELECT ah FROM AccountHolder ah WHERE name = :name", AccountHolder::class.java)
//                    .setParameter("email", email)
//                    .singleResult
//        } catch (e : Exception) {
//            null
//        }
//    }
//
//    @TransactionalAdvice
//    fun addAccountHolder(ah: AccountHolder) : AccountHolder {
//        entityManager.persist(ah)
//        return ah
//    }
//}