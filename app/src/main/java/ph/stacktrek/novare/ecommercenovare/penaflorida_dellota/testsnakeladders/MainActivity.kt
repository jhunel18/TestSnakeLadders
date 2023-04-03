    package ph.stacktrek.novare.ecommercenovare.penaflorida_dellota.testsnakeladders


    import android.content.Intent
    import android.os.Bundle
    import android.view.animation.AnimationUtils
    import androidx.appcompat.app.AppCompatActivity
    import ph.stacktrek.novare.ecommercenovare.penaflorida_dellota.testsnakeladders.databinding.ActivityMainBinding

    class MainActivity : AppCompatActivity() {

        private lateinit var binding: ActivityMainBinding
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)

            binding = ActivityMainBinding.inflate(layoutInflater)
            setContentView(binding.root)

            val floatingImage = binding.floatingImage
            val floatAnimation = AnimationUtils.loadAnimation(this, R.anim.float_animation)
            floatingImage.startAnimation(floatAnimation)

            binding.buttonGame.setOnClickListener{
                val goToPlayerLobby =Intent(applicationContext,PlayerLobbyActivity::class.java
                )
                startActivity(goToPlayerLobby)
            }

            binding.buttonInstruction.setOnClickListener{
                val goToInstruction =Intent(applicationContext,Instruction::class.java
                )
                startActivity(goToInstruction)
            }
        }

    }