package za.co.varsitycollege.st10480288.st10480288practicumexam

import android.os.Bundle
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
        "Humble - Kendrick Lamar - Rap"
        "Blessings - Calvin Harris - Dance Song"
        "Summer too Hot - Chris Brown - Best Love Song"
        "Yellow - ColdPlay - Memories"
        )

        val answers = booleanArrayOf(4, 1, 2, 3)



    }
}