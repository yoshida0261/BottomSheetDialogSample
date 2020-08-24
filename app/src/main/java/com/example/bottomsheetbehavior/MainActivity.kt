package com.example.bottomsheetbehavior

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button1.setOnClickListener {
            val sample = SampleBottomSheetBeheavierDialog.newInstance()
            sample?.show(
                supportFragmentManager,
                "add_photo_dialog_fragment"
            )
        }
    }
}