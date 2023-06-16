package com.blueaitech.bottomnavigationtokotlin

import android.os.Bundle
import android.view.MenuItem
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    //變數宣告
    lateinit var tvHello : TextView
    lateinit var bottomNavigationView : BottomNavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //xml 和程式關聯
        tvHello = findViewById(R.id.textHello)
        bottomNavigationView = findViewById(R.id.navigation)

        //bottomNavigationView 設定
        bottomNavigationView.menu.setGroupCheckable(0, false, false)
        bottomNavigationView.menu.getItem(1).isEnabled = false

        //bottomNavigationView Item 點擊處理
        bottomNavigationView.setOnItemSelectedListener { item: MenuItem ->
            when (item.itemId) {
                R.id.nav1 -> tvHello.text = "點選相機"
                R.id.nav2 -> tvHello.text = "點選下載"
                R.id.nav3 -> tvHello.text = "點選音樂"
                R.id.nav4 -> tvHello.text = "點選設定"
            }
            true
        }
    }
}