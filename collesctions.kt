package com.example.test

fun main() {
    ContohList()
    println()
    ContohSet()
    println()
    ContohMap()
}

fun ContohList() {
    println("// List Read-Only")
    // List Read-Only adalah daftar data yang disusun secara berurutan.
    // List bersifat ordered, artinya data yang dimasukkan akan memiliki posisi sesuai urutan
    // List bersifat Read-Only dan bukan mutabel, artinya data yang dimasukkan dapat diubah dan tidak dapat diubah
    // List Read-Only menggunakan listOf
    // List Mutable menggunakan mutableListOf

    val listReadOnly: List<String> = listOf("A", "B", "C")
    println(listReadOnly)
    println(listReadOnly[0])

    println("\n// List Mutable")
    val shape: MutableList<String> = mutableListOf("Circle", "Square", "Triangle")
    println(shape)

    // Menambahkan data ke dalam List Mutable
    shape.add("Rectangle")
    println(shape)

    // Menghapus data dari List Mutable
    shape.remove("Square")
    println(shape)

    // Mengubah data di dalam List Mutable
    shape[0] = "Oval"
    println(shape)

    println("\n// List Read-Only = shape")
    val printShapesLocked: List<String> = shape
    println(printShapesLocked)
}

