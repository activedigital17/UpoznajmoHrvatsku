package com.quizapp

import android.content.Intent
import android.graphics.Color
import android.graphics.LightingColorFilter
import android.graphics.Typeface
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import kotlinx.android.synthetic.main.activity_quiz_questions.*
import org.w3c.dom.Text


class QuizQuestionsActivity : AppCompatActivity(), View.OnClickListener {

    private var mCurrentPosition:Int= 1
    private var mQuestionList:ArrayList<Questions>? = null
    private var mSelectedOptionPosition:Int = 0
    private var mCorrectAnswers: Int = 0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz_questions)



        //promjena boje buttona kod klikanja
        //submit_btn.background.colorFilter = LightingColorFilter(-0x1, -0x960000)

        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_IMMERSIVE
        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN


        //povlačimo sva pitanja
        mQuestionList = Constants.getQuestions()


        setQuestion()

        option_one.setOnClickListener(this)
        option_two.setOnClickListener(this)
        option_three.setOnClickListener(this)
        option_four.setOnClickListener(this)
        submit_btn.setOnClickListener(this)


        }


    private fun answerView(answer:Int, drawableView:Int){

        when(answer){
            1->{option_one.background=ContextCompat.getDrawable(this, drawableView)}
            2->{option_two.background = ContextCompat.getDrawable(this,drawableView)}
            3->{option_three.background = ContextCompat.getDrawable(this,drawableView)}
            4->{option_four.background = ContextCompat.getDrawable(this,drawableView)}

        }
    }

    override fun onClick(v: View?) {

        when(v?.id){
            R.id.option_one ->{
                SelectedOptionView(option_one, 1)
            }
            R.id.option_two ->{
                SelectedOptionView(option_two, 2)
            }
            R.id.option_three ->{
                SelectedOptionView(option_three, 3)
            }
            R.id.option_four ->{
                SelectedOptionView(option_four, 4)
            }
            R.id.submit_btn->{
                if(mSelectedOptionPosition == 0){
                    mCurrentPosition++

                    when{
                        mCurrentPosition<=mQuestionList!!.size->{
                            setQuestion()
                        }else->{

                        val intent = Intent(this,ResultActivity::class.java)
                        intent.putExtra(Constants.TOTAL_QUESTIONS,mQuestionList!!.size )
                        intent.putExtra(Constants.CORRECT_ANSWERS, mCorrectAnswers)
                        startActivity(intent)
                    }

                    }
                }else{
                    val question = mQuestionList?.get(mCurrentPosition-1)
                    if (question!!.correctAnswer != mSelectedOptionPosition){
                        answerView(mSelectedOptionPosition,R.drawable.wrong_options_bg)
                    }else{
                        mCorrectAnswers++
                    }
                    answerView(question.correctAnswer,R.drawable.correct_options_bg)

                    if (mCurrentPosition == mQuestionList!!.size){

                        submit_btn.text = "ZAVRŠI"
                    } else {
                        submit_btn.text="SLJEDEĆE PITANJE"
                    }
                    mSelectedOptionPosition=0
                }
            }
        }
    }
    private fun SelectedOptionView(tv:TextView,selectedOptionNum:Int){


        defaultOptionsView()
        mSelectedOptionPosition = selectedOptionNum

        tv.setTypeface(tv.typeface, Typeface.BOLD)
        tv.background = ContextCompat.getDrawable(this, R.drawable.selected_options_bg)
        tv.setTextColor(Color.parseColor("#FFFFFF"))


    }


    private fun setQuestion(){

        val question = mQuestionList!![mCurrentPosition-1]

        defaultOptionsView()

        if(mCurrentPosition-1 == mQuestionList!!.size){

            submit_btn.text = "ZAVRŠI"
        }else{

            submit_btn.text = "POTVRDI"
        }

        progress_bar.progress = mCurrentPosition
        tv_progress_text.text = "$mCurrentPosition / ${mQuestionList!!.size}"
        tv_question.text = question.question
        option_one.text = question.optionOne
        option_two.text = question.optionTwo
        option_three.text= question.optionThree
        option_four.text = question.optionFour

    }

    private fun defaultOptionsView(){

        val options = ArrayList<TextView>()
        options.add(0,option_one)
        options.add(1,option_two)
        options.add(2, option_three)
        options.add(3,option_four)

        for (option in options){

            option.setTextColor(Color.parseColor("#000000"))
            option.typeface = Typeface.DEFAULT
            option.background = ContextCompat.getDrawable(this,R.drawable.default_options_bg)

        }




    }



}
