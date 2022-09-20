package com.example.journal.feature_note.domain.use_case.util

sealed class OrderType{
    object Ascending: OrderType()
    object Descending: OrderType()
}
