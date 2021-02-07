package com.example.assignment6_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val a = Toast.makeText(applicationContext,"กรอกให้ครบทุกช่อง.",Toast.LENGTH_LONG)
        val b = Toast.makeText(applicationContext,"กรอกค่า Num2 หรือห้ามกรอกค่า Num2 = 0.",Toast.LENGTH_LONG)
        var num1 = 0.0
        var num2 = 0.0
        var cal = 0.0

        btPlus.setOnClickListener() {
            if (this.plainTextNum1.text.toString() == "" && this.plainTextNum2.text.toString() == "") {
                a.show()
            }else if(this.plainTextNum2.text.toString() == ""){
                b.show()
            }else{
                textViewCalculator.setText("+")
                num1=this.plainTextNum1.text.toString().toDouble()
                num2=this.plainTextNum2.text.toString().toDouble()
                cal = num1+num2
                Result.setText(cal.toString())
            }
        }

        btMinus.setOnClickListener(){
            if (this.plainTextNum1.text.toString() == "" && this.plainTextNum2.text.toString() == "") {
                a.show()
            }else if(this.plainTextNum2.text.toString() == ""){
                b.show()
            }else{
                textViewCalculator.setText("-")
                num1=this.plainTextNum1.text.toString().toDouble()
                num2=this.plainTextNum2.text.toString().toDouble()
                cal = num1-num2
                Result.setText(cal.toString())
            }
        }

        btMultiply.setOnClickListener(){
            if (this.plainTextNum1.text.toString() == "" && this.plainTextNum2.text.toString() == "") {
                a.show()
            }else if(this.plainTextNum2.text.toString() == ""){
                b.show()
            }else{
                textViewCalculator.setText("x")
                num1=this.plainTextNum1.text.toString().toDouble()
                num2=this.plainTextNum2.text.toString().toDouble()
                cal = num1*num2
                Result.setText(cal.toString())
            }
        }

        btDivider.setOnClickListener(){
            if (this.plainTextNum1.text.toString() == "" && this.plainTextNum2.text.toString() == "") {
                a.show()
            }else if(this.plainTextNum2.text.toString() == ""){
                b.show()
            }else{
                textViewCalculator.setText("÷")
                num1=this.plainTextNum1.text.toString().toDouble()
                num2=this.plainTextNum2.text.toString().toDouble()
                cal = num1/num2
                Result.setText("$cal")
            }
        }

        btModulo.setOnClickListener(){
            if (this.plainTextNum1.text.toString() == "" && this.plainTextNum2.text.toString() == "") {
                a.show()
            }else if(this.plainTextNum2.text.toString() == ""){
                b.show()
            }else{
                textViewCalculator.setText("%")
                num1=this.plainTextNum1.text.toString().toDouble()
                num2=this.plainTextNum2.text.toString().toDouble()
                cal = num1%num2
                Result.setText(cal.toString())
            }
        }

        btClear.setOnClickListener(){
            plainTextNum1.setText(null)
            plainTextNum2.setText(null)
            Result.setText(null)
            textViewCalculator.setText(null)
        }
    }
}