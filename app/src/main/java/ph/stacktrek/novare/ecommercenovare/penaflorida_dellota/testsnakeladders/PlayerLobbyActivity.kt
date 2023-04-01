package ph.stacktrek.novare.ecommercenovare.penaflorida_dellota.testsnakeladders

import android.app.AlertDialog
import android.app.Dialog
import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import ph.stacktrek.novare.ecommercenovare.penaflorida_dellota.testsnakeladders.databinding.ActivityMainBinding
import ph.stacktrek.novare.ecommercenovare.penaflorida_dellota.testsnakeladders.databinding.ActivityPlayerLobbyBinding
import ph.stacktrek.novare.ecommercenovare.penaflorida_dellota.testsnakeladders.databinding.DialogAddPlayerBinding

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

        // Set player name to TextView
        binding.playerList.text =playerName

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
                   // dialogAddPlayerBinding.playerName.text.toString()

                    //Added code for shared preference

                    val sharedPref = getSharedPreferences("MyPref", MODE_PRIVATE)
                    val editor = sharedPref.edit()
                    editor.putString("playerName", dialogAddPlayerBinding.playerName.text.toString())
                    editor.apply()

                })
                setNegativeButton("CANCEL", DialogInterface.OnClickListener{ dialog, id->

                })
                setView(dialogAddPlayerBinding.root)
                create()
            }
        }
    }
}