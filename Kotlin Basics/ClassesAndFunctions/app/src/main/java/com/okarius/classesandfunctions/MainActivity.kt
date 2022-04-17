package com.okarius.classesandfunctions

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.okarius.classesandfunctions.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private var name = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        test()

        //Void - Unit
        //mySum(10,20)

        //Return

        val result = myMultiply(10,20)
        //textView.text = "Result: ${result}"


        /*
        button.setOnClickListener {
            println("clicked")
        }
         */

        //Class

        //Object & Instance

        val homer = Simpson("Homer Simpson",50,"Nuclear")

        homer.hairColor = "Yellow"

        //homer.age = 60
        //homer.job = "Nuc"
        //homer.name = "Homer"

        println(homer.hairColor)

        //Nullability
        // Nullable (?) && Non-null
        // !! vs ?

        var myString : String? = null
        var myAge : Int? = null


        //1)Null safety

        if (myAge != null) {
            println(myAge * 10)
        } else {
            println("myAge null")
        }

        //2)safe call

        println(myAge?.compareTo(2))

        //3)elvis

        val myResult = myAge?.compareTo(2) ?: -100
        println(myResult)



    }


    fun test(){
        println("test function")
    }

    //Input & Return

    fun mySum(a: Int,b: Int ) {
        //textView.text = "Result: ${a+b}"
    }

    fun myMultiply(x:Int, y:Int) : Int {
        return x * y
    }

    fun makeSimpson(view : View) {

        name = binding.nameText.text.toString()
        var age = binding.ageText.text.toString().toIntOrNull()
        if (age == null) {
            age = 0
        }
        val job = binding.jobText.text.toString()

        val simpson = Simpson(name,age,job)

        binding.resultText.text = "Name : ${simpson.name}, Age: ${simpson.age}, Job: ${simpson.job}"





    }

    fun scopeExample(view : View) {
        //Scope

        println(name)


    }



}