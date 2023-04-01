package ph.stacktrek.novare.ecommercenovare.penaflorida_dellota.testsnakeladders

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import ph.stacktrek.novare.ecommercenovare.penaflorida_dellota.testsnakeladders.databinding.ActivityMainBinding
import ph.stacktrek.novare.ecommercenovare.penaflorida_dellota.testsnakeladders.databinding.ActivityPlayerLobbyBinding

class PlayerLobbyActivity : AppCompatActivity() {

    private lateinit var binding:ActivityPlayerLobbyBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_player_lobby)
        binding = ActivityPlayerLobbyBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}