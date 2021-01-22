package com.example.QuizApp

import android.content.Intent
import android.graphics.Color
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.ContextCompat
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_quiz_quetions.*

class QuizQuetionsActivity : AppCompatActivity(),View.OnClickListener {
    private var mCurrentPosition:Int= 1
    private var mQuestionList:ArrayList<MyQuestion>?=null
    private var mSelectedOptionPosition:Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz_quetions)

        mQuestionList = Constatnts.getQuestions()
        setQuestion()
        textViewOpt1.setOnClickListener(this)
        textViewOpt2.setOnClickListener(this)
        textViewOpt3.setOnClickListener(this)
        textViewOpt4.setOnClickListener(this)
        buttonSubmit.setOnClickListener(this)
    }
    private fun setQuestion(){
       // mCurrentPosition = 1
        val question= mQuestionList!!.get(mCurrentPosition-1)
        defaultOptionView()

        if (mCurrentPosition==mQuestionList!!.size){
            buttonSubmit.text = "FINISH"
        }else{
            buttonSubmit.text = "SUBMIT"
        }
        progressbar.progress=mCurrentPosition
        textViewProgress.text = "$mCurrentPosition" + "/" + progressbar.max
        textViewQuestion.text = question!!.question
        imageViewFlag.setImageResource(question.image)
        textViewOpt1.text = question.optionOne
        textViewOpt2.text = question.optionTwo
        textViewOpt3.text = question.optionThree
        textViewOpt4.text = question.optionFour

    }

    private fun defaultOptionView(){
        val options = ArrayList<TextView>()
        options.add(0,textViewOpt1)
        options.add(1,textViewOpt2)
        options.add(2,textViewOpt3)
        options.add(3,textViewOpt4)

        for (option in options){
            option.setTextColor(Color.GRAY)
            option.typeface = Typeface.DEFAULT
            option.background = ContextCompat.getDrawable(
                this,
                R.drawable.tv_bg
            )
        }
    }

    override fun onClick(v: View?) {
        when(v?.id){
            R.id.textViewOpt1 ->{
                selectedOptionView(textViewOpt1,1)
            }
            R.id.textViewOpt2 ->{
                selectedOptionView(textViewOpt2,2)
            }
            R.id.textViewOpt3 ->{
                selectedOptionView(textViewOpt3,3)
            }
            R.id.textViewOpt4 ->{
                selectedOptionView(textViewOpt4,4)
            }
            R.id.buttonSubmit ->{
                if (mSelectedOptionPosition==0){
                    mCurrentPosition++

                    when{
                        mCurrentPosition <=mQuestionList!!.size ->{
                            setQuestion()
                        }
                        else ->{
                            Toast.makeText(this,
                                "you have successfully completed quiz",
                                Toast.LENGTH_SHORT).show()
                        }
                    }
                }else{
                    val question = mQuestionList?.get(mCurrentPosition-1)

                    if (question!!.correctAns!=mSelectedOptionPosition){
                        answerView(mSelectedOptionPosition,R.drawable.wrong_option_border_bg)
                    }
                    answerView(question.correctAns,R.drawable.correct_option_border_bg)

                    if (mCurrentPosition==mQuestionList!!.size){
                        buttonSubmit.text = "FINISH"
                    }else{
                        buttonSubmit.text = "Go to Next Question"
                    }
                    mSelectedOptionPosition=0
                }
            }
        }
    }
    private fun selectedOptionView(textView:TextView,selectedOptionNumber:Int){
        defaultOptionView()
        mSelectedOptionPosition = selectedOptionNumber

        textView.setTextColor(Color.BLACK)
        textView.setTypeface(textView.typeface,Typeface.BOLD)
        textView.background = ContextCompat.getDrawable(
            this,
            R.drawable.select_option_border_bg)

    }

    private fun answerView(answer:Int,drwableView:Int){
        when(answer){
            1 ->{
                textViewOpt1.background = ContextCompat.getDrawable(this,drwableView)
            }
            2 ->{
                textViewOpt2.background = ContextCompat.getDrawable(this,drwableView)
            }
            3 ->{
                textViewOpt3.background = ContextCompat.getDrawable(this,drwableView)
            }
            4 ->{
                textViewOpt4.background = ContextCompat.getDrawable(this,drwableView)
            }
        }
    }
}
