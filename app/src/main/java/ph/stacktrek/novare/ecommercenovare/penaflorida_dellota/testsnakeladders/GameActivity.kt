package ph.stacktrek.novare.ecommercenovare.penaflorida_dellota.testsnakeladders

import android.os.Bundle

import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.isInvisible

import ph.stacktrek.novare.ecommercenovare.penaflorida_dellota.testsnakeladders.databinding.ActivityGameBinding
import ph.stacktrek.novare.ecommercenovare.penaflorida_dellota.testsnakeladders.model.Player



import java.util.*


class GameActivity : AppCompatActivity() {
    var b1_roll: Button? = null
    var iv_dice: ImageView? = null
    var turn: Int = 0
    var player1: ImageView? = null
    var player2: ImageView? = null
    var playerList: List<Player>? = null
    var imageviews: List<ImageView>? = null
    private lateinit var binding: ActivityGameBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityGameBinding.inflate(layoutInflater)
        setContentView(binding.root)

        b1_roll = binding.b1Roll
        iv_dice = binding.ivDice

        playerList = listOf<Player>(
            Player("jhunel"),
            //Player("joash")
        )

        player1 = binding.player1PawnRed
        player2 = binding.player2PawnBlack

        imageviews = listOf(
            player1!!, player2!!
        )
        playerList!!.forEachIndexed { index, player ->
            player.pon = imageviews!![index]
            player.pon!!.isInvisible=false
        }

        b1_roll!!.setOnClickListener {
            println(playerList!![turn].name + " is now at position " + playerList!![turn].position)
            roll(playerList!![turn])
            if ((playerList!![turn].position) / 10 % 2 == 0) {
                playerList!![turn].pon!!.x = playerList!![turn].position % 10.toFloat() * 108
                playerList!![turn].pon!!.y = 1275f - ((playerList!![turn].position) / 10) * 108
            } else {
                playerList!![turn].pon!!.x = (9 - playerList!![turn].position % 10.toFloat()) * 108
                playerList!![turn].pon!!.y = 1275f - ((playerList!![turn].position) / 10) * 108
            }

            if (turn < playerList!!.size - 1) {
                turn += 1
            } else {
                turn = 0
            }
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