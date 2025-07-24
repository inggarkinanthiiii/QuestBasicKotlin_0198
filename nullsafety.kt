package com.example.test

fun nullSafety() {
    // neverNull has String type
    var neverNull: String = "This can't be null"

    // Throws a compiler error
    // neverNull = null
