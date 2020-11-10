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
                         @GeneratedValue //(strategy = GenerationType.SEQUENCE, generator = "account_generator")
                         //@SequenceGenerator(name="account_generator", sequenceName = "account_seq")
                         var id: Long? = null,
                         var name: String? = null,
                         var age: Int,
                         @field:JsonFormat(pattern = "yyyy-MM-dd")
                         @field:JsonSerialize(using = LocalDateSerializer::class)
                         @field:JsonDeserialize(using = LocalDateDeserializer::class)
                         var birthDate: LocalDate,
                         var category: Category
)

