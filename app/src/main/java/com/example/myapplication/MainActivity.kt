package com.example.myapplication
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.EditText
import android.widget.TextView


class MainActivity: AppCompatActivity()






{




    public override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)





    }




    fun  getSet(view: View)
    {
val nametxt = findViewById<EditText>(R.id.nameefox)
        val msg= nametxt.text.toString()
        val txtview = findViewById<TextView>(R.id.enter_info).apply {
            text=msg
        }



    }


}



