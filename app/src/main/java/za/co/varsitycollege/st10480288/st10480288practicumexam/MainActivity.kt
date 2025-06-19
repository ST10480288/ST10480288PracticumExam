package za.co.varsitycollege.st10480288.st10480288practicumexam

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val startBtn = findViewById<Button>(R.id.startBtn)
        val txtView = findViewById<TextView>(R.id.txtView)
        val startBtn2 = findViewById<Button>(R.id.startBtn2)
        val startBtn3 = findViewById<Button>(R.id.startBtn3)

        findViewById<Button>(R.id.startBtn).setOnClickListener {
            startActivity(Intent(this, songsActivity::class.java))
        }




    }
}