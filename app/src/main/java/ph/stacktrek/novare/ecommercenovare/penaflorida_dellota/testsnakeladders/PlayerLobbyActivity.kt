package ph.stacktrek.novare.ecommercenovare.penaflorida_dellota.testsnakeladders

import android.app.AlertDialog
import android.app.Dialog
import android.content.DialogInterface
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.LinearLayoutManager
import ph.stacktrek.novare.ecommercenovare.penaflorida_dellota.testsnakeladders.adapter.PlayerAdapter
import ph.stacktrek.novare.ecommercenovare.penaflorida_dellota.testsnakeladders.databinding.ActivityMainBinding
import ph.stacktrek.novare.ecommercenovare.penaflorida_dellota.testsnakeladders.databinding.ActivityPlayerLobbyBinding
import ph.stacktrek.novare.ecommercenovare.penaflorida_dellota.testsnakeladders.databinding.DialogAddPlayerBinding
import ph.stacktrek.novare.ecommercenovare.penaflorida_dellota.testsnakeladders.utility.PlayerNameUtility

class PlayerLobbyActivity : AppCompatActivity() {

    private lateinit var binding:ActivityPlayerLobbyBinding
    private val playerList = mutableListOf<String>()
    private lateinit var playerAdapter: PlayerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPlayerLobbyBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Display player names in RecyclerView
        val playerAdapter = PlayerAdapter(playerList)
        binding.playerNamesList.layoutManager = LinearLayoutManager(this@PlayerLobbyActivity)
        binding.playerNamesList.adapter = playerAdapter

        PlayerNameUtility(applicationContext).apply {
            // Load existing player names
            val sharedPref = getSharedPreferences("MyPref", MODE_PRIVATE)
            val playerNames = sharedPref.getStringSet("playerNames", emptySet())
            if (playerNames != null) {
                playerList.addAll(playerNames)
            }
        }

        binding.fabAddPlayerButton.setOnClickListener(){
            showAddPlayerDialog().show()
        }

        binding.fabAddPlayerButton.setOnClickListener(){
            showAddPlayerDialog().show()
        }

        binding.proceedButton.setOnClickListener(){
            val goToGameActivity = Intent(applicationContext,GameActivity::class.java
            )
            goToGameActivity.putExtra("playerNames", playerList.toTypedArray())
            startActivity(goToGameActivity)
        }
    }
    fun showAddPlayerDialog(): Dialog {
        return this!!.let{
            val builder = AlertDialog.Builder(it)
            var dialogAddPlayerBinding:DialogAddPlayerBinding=
                DialogAddPlayerBinding.inflate(it.layoutInflater)
            with(builder){
                setPositiveButton("ADD", DialogInterface.OnClickListener{ dialog, id->

                    val playerName = dialogAddPlayerBinding.playerName.text.toString()
                    PlayerNameUtility(applicationContext).addPlayerName(playerName)
                    playerList.add(playerName)

//                    // Update the displayed player names
//                    binding.playerNamesList.text = playerList.joinToString("\n")
                })
                setNegativeButton("CANCEL", DialogInterface.OnClickListener{ dialog, id->
                })
                setView(dialogAddPlayerBinding.root)
                create()
            }
        }
    }
}