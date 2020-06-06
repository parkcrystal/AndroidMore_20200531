package com.phis.androidmore_20200531

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setUpEvents()
        setValues()
        
        Log.d("메인화면", "onCreate 실행")
    }

    override fun setUpEvents() {

        moveBtn.setOnClickListener {
            val myIntent = Intent(mContext, OtherActivity::class.java)
            startActivity(myIntent)
        }

    }

    override fun onResume() {
        super.onResume()

        Log.d("메인화면", "onResume 실행")
    }

    override fun onPause() {
        super.onPause()
        Log.d("메인화면", "onPause 실행")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("메인화면", "onDestroy 실행")
    }

    override fun onStop() {
        super.onStop()
        Log.d("메인화면", "onStop 실행")
    }

    override fun setValues() {

        val users = ArrayList<String>()
        users.add("조경진")
        users.add("박보영")
        users.add("강동원")
        users.add("장동건")
        users.add("원빈")
        users.add("고수")
        users.add("이효리")
        users.add("비")
        users.add("설리")

        for(u in users) {
            Log.d("사용자이름", u)
        }

        for(u in 0..5) {
            Log.d("숫자반복", "${u}")
        }

        for(i in users.indices) {
            Log.d("숫자", "$i")
            Log.d("사람이름", users[i])
        }
    }

}
