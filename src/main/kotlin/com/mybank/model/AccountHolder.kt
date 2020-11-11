package com.mybank.model


import com.fasterxml.jackson.annotation.JsonFormat
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.annotation.JsonSerialize
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateDeserializer
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateSerializer
import java.time.LocalDate
import javax.persistence.*


@Entity
data class AccountHolder(@Id
                         //@GeneratedValue //(strategy = GenerationType.SEQUENCE, generator = "account_generator")
                         //@SequenceGenerator(name="account_generator", sequenceName = "account_seq")
                         @Column(name="accountHolderId", nullable=false)
                         //@GeneratedValue(strategy=GenerationType.SEQUENCE)
                         @GeneratedValue(strategy=GenerationType.IDENTITY)
                         var accountHolderId: Long,
                         var name: String? = null,
                         var age: Int,
                         @field:JsonFormat(pattern = "yyyy-MM-dd")
                         @field:JsonSerialize(using = LocalDateSerializer::class)
                         @field:JsonDeserialize(using = LocalDateDeserializer::class)
                         var birthDate: LocalDate,
                         var category: Category,
                         @Column(nullable = true)
                         @OneToMany(cascade = [CascadeType.ALL], fetch = FetchType.LAZY, mappedBy = "accountId")
                         val account: List<Account>? = null

)

