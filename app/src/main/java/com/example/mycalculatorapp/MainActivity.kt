package com.example.mycalculatorapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import com.example.mycalculatorapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var tvAnswer:TextView
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        tvAnswer = findViewById(R.id.tvAnswer)


    }

    fun onClickDigit(view: View){

        if(binding.tvAnswer.text.toString() == "0"){
            binding.tvAnswer.text = (view as Button).text
        }else{
            tvAnswer.append((view as Button).text)
        }

    }

    fun onClickCancel(view: View){
        binding.tvAnswer.text = binding.tvAnswer.text.toString().substring(0,binding.tvAnswer.text.length-1)
        if (binding.tvAnswer.text.toString() == ""){
            binding.tvAnswer.text = "0"
        }
    }

    fun onClear(view: View){
        binding.tvAnswer.text = "0"
    }
}