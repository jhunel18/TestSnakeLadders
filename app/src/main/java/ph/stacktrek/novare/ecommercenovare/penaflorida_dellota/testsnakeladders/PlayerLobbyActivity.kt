package ph.stacktrek.novare.ecommercenovare.penaflorida_dellota.testsnakeladders

import android.app.AlertDialog
import android.app.Dialog
import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.LinearLayoutManager
import ph.stacktrek.novare.ecommercenovare.penaflorida_dellota.testsnakeladders.databinding.ActivityMainBinding
import ph.stacktrek.novare.ecommercenovare.penaflorida_dellota.testsnakeladders.databinding.ActivityPlayerLobbyBinding
import ph.stacktrek.novare.ecommercenovare.penaflorida_dellota.testsnakeladders.databinding.DialogAddPlayerBinding
import ph.stacktrek.novare.ecommercenovare.penaflorida_dellota.testsnakeladders.utility.PreferenceUtility

class PlayerLobbyActivity : AppCompatActivity() {

    private lateinit var binding:ActivityPlayerLobbyBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPlayerLobbyBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Get player name from shared preferences
        val sharedPref = getSharedPreferences("MyPref", MODE_PRIVATE)
        val playerName = sharedPref.getString("playerName", "")

        // Debug logs
        Log.d("PlayerLobbyActivity", "Player name retrieved: $playerName")
        Log.d("PlayerLobbyActivity", "Shared preferences: $sharedPref")

//        with(binding.playerList){
//            layoutManager = LinearLayoutManager(applicationContext,
//                LinearLayoutManager.VERTICAL,
//                false)
//        }

        binding.fabAddPlayerButton.setOnClickListener(){
            showAddPlayerDialog().show()
        }
    }
    fun showAddPlayerDialog(): Dialog {
        return this!!.let{
            val builder = AlertDialog.Builder(it)
            var dialogAddPlayerBinding:DialogAddPlayerBinding=
                DialogAddPlayerBinding.inflate(it.layoutInflater)
            with(builder){
                setPositiveButton("ADD", DialogInterface.OnClickListener{ dialog, id->

                    PreferenceUtility(applicationContext).apply {
                        saveStringPreferences("playerName", dialogAddPlayerBinding.playerName.text.toString())
                    }
                })
                setNegativeButton("CANCEL", DialogInterface.OnClickListener{ dialog, id->

                })
                setView(dialogAddPlayerBinding.root)
                create()
            }
        }
    }
}