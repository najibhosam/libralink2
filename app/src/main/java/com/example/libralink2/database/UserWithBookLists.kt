package com.example.libralink2.database

import androidx.room.Embedded
import androidx.room.Relation

data class UserWithBookLists(
    @Embedded val user: User,
    @Relation(
        parentColumn = "userId" ,
        entityColumn = "userCreatorId"
    )
    val bookLists : List<Listen>
)
