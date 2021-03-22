package com.example.kotlin_lesson_2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView


class MainActivity : AppCompatActivity() {

    private var number1: Int = 6
    private var number2: Int = 3

    ////даем возможность вставлять в строку другое значение
    private var text: String = "В магазине осталось $number2 яблок"

//    //даем возможность вставлять в строку другое значение, сразу из функции
//    private var text: String = "В магазине осталось ${getNumber()} яблок"


    private var helloWorld: TextView? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //связываем
        helloWorld = findViewById(R.id.helloWorld)


        //устанавливаем текст
        helloWorld?.setText(text)
        //станавливаем сразу сумму метода
//        helloWorld?.setText(getNumber().toString())

    }


    //возвращаем результат метода в Инт
    private fun getNumber(): Int {

        return number1 + number2
    }


}