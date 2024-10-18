package com.example.investor

data class ProgressCheckItem(
    val id: Int,
    val projectName: String,
    val category: String,
    val amount: String,
    val investor: String,
    val status: String,
    val description: String
)
