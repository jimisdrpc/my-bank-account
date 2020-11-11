package com.mybank.model

import javax.persistence.*

@Entity
@Table(name = "accounts")
@NoArg
data class Account(@Id
                   //@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "account_generator")
                   //@SequenceGenerator(name = "account_generator", sequenceName = "account_seq")
                   @Column(name="ID_ACCOUNT", nullable=false)
                   //@GeneratedValue(strategy=GenerationType.SEQUENCE)
                   @GeneratedValue(strategy=GenerationType.IDENTITY)
                   var accountId: Long,
                   var name: String? = null,


                   @ManyToOne(fetch = FetchType.LAZY, optional = true)
                   @JoinColumn(name = "ACCOUNTHOLDER_ID", nullable=true, insertable=false, updatable=false)
                   val accountHolder: AccountHolder

)

