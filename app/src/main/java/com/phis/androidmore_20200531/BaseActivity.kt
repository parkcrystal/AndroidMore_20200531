package com.phis.androidmore_20200531

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

abstract class BaseActivity : AppCompatActivity() {


    val mContext = this

    abstract fun setUpEvents()
    abstract fun setValues()


}
