package za.co.varsitycollege.st10480288.st10480288practicumexam

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class songsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_songs)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val questions = arrayOf(
            "Humble - Kendrick Lamar - Rap",
            "Blessings - Calvin Harris - Dance Song",
            "Summer too Hot - Chris Brown - Best Love Song",
            "Yellow - ColdPlay - Memories"
        )

        val songBtn = findViewById<Button>(R.id.songsBtn)
        val averageBtn = findViewById<Button>(R.id.averageBtn)
        val mainBtn = findViewById<Button>(R.id.mainBtn)

        listOf(this,"Rap = 5/5, Dance song = 2/5, Best Love song = 3/5, Memories = 1/5 ", Toast.LENGTH_SHORT.toString())

        findViewById<Button>(R.id.mainBtn).setOnClickListener {
            startActivity(Intent(this,songsActivity::class.java))

            averageBtn.text = "Average rating"



        }





    }
}