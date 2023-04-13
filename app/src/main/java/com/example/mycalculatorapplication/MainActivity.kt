package com.example.mycalculatorapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    //Instanciate the user interface elements
    lateinit var Answer:TextView
    lateinit var FirstNum:EditText
    lateinit var SecondNum:EditText
    lateinit var  Add:Button
    lateinit var  Sub:Button
    lateinit var  Div:Button
    lateinit var  Mul:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Answer = findViewById(R.id.Answer)
        FirstNum = findViewById(R.id.Decimal_No)
        SecondNum = findViewById(R.id.DecimalNo2)
        Add = findViewById(R.id.AddButton)
        Sub = findViewById(R.id.SubButton)
        Div = findViewById(R.id.Divbutton)
        Mul = findViewById(R.id.Mulbutton)

        // Set on click listeners on the Button
        Add.setOnClickListener {
            //receive the nubers for computation
            var FirstNumber = FirstNum.text.toString().trim()
            var SecondNumber = SecondNum.text.toString().trim()
            if (FirstNumber.isEmpty()|| SecondNumber.isEmpty()) {
                Answer.text = "Please enter valid numbers!!!"
            }
            else{
                    //Proceed to compute the numbers
                    var jibu = FirstNumber.toDouble() + SecondNumber.toDouble()
                //Display the answer on the textview  answer
                Answer.text = jibu.toString()

            }

        }
        Sub.setOnClickListener {
            var FirstNumber = FirstNum.text.toString().trim()
            var SecondNumber = SecondNum.text.toString().trim()
            if (FirstNumber.isEmpty()|| SecondNumber.isEmpty()) {
                Answer.text = "Please enter valid numbers!!!"
            }
            else{
                //Proceed to compute the numbers
                var jibu = FirstNumber.toDouble() - SecondNumber.toDouble()
                //Display the answer on the textview  answer
                Answer.text = jibu.toString()

            }

        }
        Div.setOnClickListener {
            var FirstNumber = FirstNum.text.toString().trim()
            var SecondNumber = SecondNum.text.toString().trim()
            if (FirstNumber.isEmpty()|| SecondNumber.isEmpty()) {
                Answer.text = "Please enter valid numbers!!!"
            }
            else{
                //Proceed to compute the numbers
                var jibu = FirstNumber.toDouble() / SecondNumber.toDouble()
                //Display the answer on the textview  answer
                Answer.text = jibu.toString()

            }

        }
        Mul.setOnClickListener {
            var FirstNumber = FirstNum.text.toString().trim()
            var SecondNumber = SecondNum.text.toString().trim()
            if (FirstNumber.isEmpty()|| SecondNumber.isEmpty()) {
                Answer.text = "Please enter valid numbers!!!"
            }
            else{
                //Proceed to compute the numbers
                var jibu = FirstNumber.toDouble() * SecondNumber.toDouble()
                //Display the answer on the textview  answer
                Answer.text = jibu.toString()

            }
        }
























    }
}