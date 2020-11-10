package com.mybank.model

import javax.persistence.*

@Entity
@Table(name = "accounts")
data class Account (@Id
@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "account_generator")
@SequenceGenerator(name="account_generator", sequenceName = "account_seq")
var id: Long? = null,
var name : String? = null)