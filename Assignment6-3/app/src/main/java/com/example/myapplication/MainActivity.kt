package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        ok.setOnClickListener {
            var a:Double = s1.text.toString().toDouble()
            val b:Double=a*3/100
            val c:Double=a+b
            val d:Double=(c*3/100)
            val e:Double=c+d
            val f:Double=(e*3/100)
            val g:Double=e+f
            val h:Double=(g*5/100)
            val i:Double=g+h
            val j:Double=(i*5/100)
            val k:Double=i+j
            val l:Double=(k*5/100)
            val m:Double=k+l
            val n:Double=(m*5/100)
            val o:Double=m+n
            val p:Double=(o*7/100)
            val q:Double=o+p
            val r:Double=(q*7/100)
            val s:Double=q+r
            val t:Double=(s*7/100)
            val z:Double=b+d+f+h+j+l+n+p+r+t
            val u:Double=s+t
            i1.setText("$z")
            r1.setText("$u")
        }
        clear.setOnClickListener {
            i1.setText("")
            r1.setText("")
            s1.setText("")
        }

    }
}