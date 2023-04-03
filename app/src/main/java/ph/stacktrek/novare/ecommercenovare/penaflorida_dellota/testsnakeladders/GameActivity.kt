package ph.stacktrek.novare.ecommercenovare.penaflorida_dellota.testsnakeladders


import android.graphics.Color
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.isInvisible
import ph.stacktrek.novare.ecommercenovare.penaflorida_dellota.testsnakeladders.databinding.ActivityGameBinding
import ph.stacktrek.novare.ecommercenovare.penaflorida_dellota.testsnakeladders.model.Player
import java.util.*


class GameActivity : AppCompatActivity() {
    var board: ImageView? = null
    var ratio: Float? = null
    var height: Float? = null
    var b1_roll: Button? = null
    var iv_dice: ImageView? = null
    var turn: Int = 0
    var player1: ImageView? = null
    var player2: ImageView? = null
    var player3: ImageView? = null
    var player4: ImageView? = null
    var player5: ImageView? = null
    var playerList: MutableList<Player>? = null
    var colorList: List<String>?=null
    var turnIndicator:TextView? = null

    var imageviews: List<ImageView>? = null
    private lateinit var binding: ActivityGameBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityGameBinding.inflate(layoutInflater)
        setContentView(binding.root)
        board = binding.board

        turnIndicator = binding.turnIndicator
        b1_roll = binding.b1Roll
        iv_dice = binding.ivDice

        ratio = (board!!.width.toFloat()) / 10
        playerList = mutableListOf()
        // Retrieve the player names from the Intent extra
        val playerNames = intent.getStringArrayExtra("playerNames")

        if (playerNames != null) {
            for (name in playerNames) {
                playerList!!.add(Player(name))
            }
        }

        player1 = binding.player1PawnRed
        player2 = binding.player2PawnBlack
        player3 = binding.player3PawnYellow
        player4 = binding.player4PawnGreen
        player5 = binding.player5PawnBlue

        imageviews = listOf(
            player1!!, player2!!, player3!!, player4!!, player5!!
        )

        colorList= listOf(
            "#BF1D1D","#000000","#DCC713","#2AB52F","#2637A5"
        )



        playerList!!.forEachIndexed { index, player ->
            player.pon = imageviews!![index]
            player.pon!!.isInvisible = false
            board!!.post {
                ratio = (board!!.width.toFloat()) / 10
                height = board!!.height.toFloat()
                playerList!![index].pon!!.x =
                    ((playerList!![index].position % 10.toFloat() * ratio!!)) + (ratio!! * index / 10)
                playerList!![index].pon!!.y =
                    height!! / 2 - ((playerList!![turn].position / 10) * ratio!!) + (ratio!! * 4) + (ratio!! * index / 10)
                turnIndicator!!.setBackgroundColor(Color.parseColor(colorList!![turn]))
                turnIndicator!!.setText(playerList!![turn].name).toString()
            }
        }

        b1_roll!!.setOnClickListener {

            roll(playerList!![turn])
            if ((playerList!![turn].position) / 10 % 2 == 0) {
                playerList!![turn].pon!!.x =
                    ((playerList!![turn].position % 10.toFloat() * ratio!!)) + (ratio!! * turn / 10)
                playerList!![turn].pon!!.y =
                    height!! / 2 - ((playerList!![turn].position / 10) * ratio!!) + (ratio!! * 4) + (ratio!! * turn / 10)
            } else {
                playerList!![turn].pon!!.x =
                    ((9 - playerList!![turn].position % 10.toFloat()) * ratio!!) + (ratio!! * turn / 10)
                playerList!![turn].pon!!.y =
                    height!! / 2 - ((playerList!![turn].position / 10) * ratio!!) + (ratio!! * 4) + (ratio!! * turn / 10)
            }
            if (playerList!!.size > 1) {
                if (turn < playerList!!.size - 1) {
                    turn += 1
                } else {
                    turn = 0
                }
            }
            turnIndicator!!.setBackgroundColor(Color.parseColor(colorList!![turn]))
            turnIndicator!!.setText(playerList!![turn].name).toString()
        }


    }

    private fun roll(player: Player) {
        val r = Random()
        val rolledNumber = r.nextInt(6) + 1
        var count: Int = player.position
        if (count <= 99 && count + rolledNumber <= 99) {
            when (rolledNumber) {
                1 -> {
                    iv_dice!!.setImageResource(R.drawable.a)
                }
                2 -> {
                    iv_dice!!.setImageResource(R.drawable.b)
                }
                3 -> {
                    iv_dice!!.setImageResource(R.drawable.c)
                }
                4 -> {
                    iv_dice!!.setImageResource(R.drawable.d)
                }
                5 -> {
                    iv_dice!!.setImageResource(R.drawable.e)
                }
                6 -> {
                    iv_dice!!.setImageResource(R.drawable.f)
                }
            }
            count += rolledNumber

            //snakes
            when (count) {
                98 -> {
                    count = 78
                }
                94 -> {
                    count = 77
                }
                81 -> {
                    count = 58
                }
                70 -> {
                    count = 33
                }
                51 -> {
                    count = 37
                }
                46 -> {
                    count = 31
                }
                34 -> {
                    count = 17
                }
                28 -> {
                    count = 14
                }
                22 -> {
                    count = 5
                }
                20 -> {
                    count = 14
                }

                //ladders
                1 -> {
                    count = 17
                }
                10 -> {
                    count = 30
                }
                11 -> {
                    count = 27
                }
                21 -> {
                    count = 39
                }
                40 -> {
                    count = 58
                }
                45 -> {
                    count = 54
                }
                35 -> {
                    count = 61
                }
                69 -> {
                    count = 93
                }
                76 -> {
                    count = 83
                }
                84 -> {
                    count = 96
                }
                99 -> {
                    val alertDialog = AlertDialog.Builder(this@GameActivity).create()
                    alertDialog.setTitle("Yay")
                    alertDialog.setMessage("${player.name} has won!!!")
                    alertDialog.setButton(
                        AlertDialog.BUTTON_NEUTRAL, "OK"
                    ) { dialog, which -> dialog.dismiss() }
                    alertDialog.show()
                }

            }

        }
        player.position = count
    }
}