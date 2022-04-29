package com.example.githubtesting

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        method()

        printMessage()

        worldType()
    }

    private fun worldType() {
        println("Hey this is new method")
    }

    private fun printMessage() {
        println("Hello World")
    }

    private fun method() {
        println("Vikas Suthar")
    }
}
