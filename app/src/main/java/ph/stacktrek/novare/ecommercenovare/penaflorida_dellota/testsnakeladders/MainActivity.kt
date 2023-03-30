package ph.stacktrek.novare.ecommercenovare.penaflorida_dellota.testsnakeladders

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.view.animation.AnimationUtils
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val floatingImage = findViewById<ImageView>(R.id.floating_image)
        val floatAnimation = AnimationUtils.loadAnimation(this, R.anim.float_animation)
        floatingImage.startAnimation(floatAnimation)
    }

    fun gotos(view: View?) {
        val nextpage = Intent(this@MainActivity, Main2Activity::class.java)
        startActivity(nextpage)
    }

    fun gotox(view: View?) {
        val nextpages = Intent(this@MainActivity, Instruction::class.java)
        startActivity(nextpages)
    }
}