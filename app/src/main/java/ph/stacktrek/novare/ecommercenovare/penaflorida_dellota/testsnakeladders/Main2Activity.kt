package ph.stacktrek.novare.ecommercenovare.penaflorida_dellota.testsnakeladders

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class Main2Activity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        var i1 = findViewById<ImageView>(R.id.imageView5)
        var i2 = findViewById<ImageView>(R.id.imageView6)
        var b1_roll = findViewById<Button>(R.id.b1_roll)
        var iv_dice = findViewById<ImageView>(R.id.iv_dice)
    }
}