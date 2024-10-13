package com.cokimutai.kmp_room.domain

import androidx.room.Entity

@Entity(tableName = "book")
data class Book(
    @PrimaryKey(autoGenerate = true)
    val _id: Int = 0,
    val image: String,
    val title: String,
    val summary: String,
    val isFavorite: Boolean,
    val category: String,
    val tags: List<String>,
    val author: String
)