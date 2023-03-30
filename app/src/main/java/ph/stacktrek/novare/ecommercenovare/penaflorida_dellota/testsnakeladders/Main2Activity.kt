package ph.stacktrek.novare.ecommercenovare.penaflorida_dellota.testsnakeladders

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import java.util.*

class Main2Activity : AppCompatActivity() {
    var b1_roll: Button? = null
    var iv_dice: ImageView? = null
    var r: Random? = null
    var move = 48f
    var move1 = 48f
    var a = 0f
    var a1 = 0f
    var b = 0f
    var b1 = 0f
    var j = 0
    var k = 0
    var count = 0
    var count1 = 0
    var rollednumber = 0
    var i1: ImageView? = null
    var i2: ImageView? = null
    fun AI() {
        rollednumber = r!!.nextInt(6) + 1
        if (count1 <= 99 && count1 + rollednumber <= 99) {
            if (rollednumber == 1) {
                iv_dice!!.setImageResource(R.drawable.a)
                count1++
            } else if (rollednumber == 2) {
                iv_dice!!.setImageResource(R.drawable.b)
                count1 += 2
            } else if (rollednumber == 3) {
                iv_dice!!.setImageResource(R.drawable.c)
                count1 += 3
            } else if (rollednumber == 4) {
                iv_dice!!.setImageResource(R.drawable.d)
                count1 += 4
            } else if (rollednumber == 5) {
                iv_dice!!.setImageResource(R.drawable.e)
                count1 += 5
            } else if (rollednumber == 6) {
                iv_dice!!.setImageResource(R.drawable.f)
                count1 += 6
            }

            //snakes
            if (count1 == 98) {
                count1 = 78
            }
            if (count1 == 94) {
                count1 = 77
            }
            if (count1 == 81) {
                count1 = 58
            }
            if (count1 == 70) {
                count1 = 33
            }
            if (count1 == 51) {
                count1 = 37
            }
            if (count1 == 46) {
                count1 = 31
            }
            if (count1 == 34) {
                count1 = 17
            }
            if (count1 == 28) {
                count1 = 14
            }
            if (count1 == 22) {
                count1 = 5
            }
            if (count1 == 20) {
                count1 = 14
            }


            //ladders
            if (count1 == 1) {
                count1 = 17
            }
            if (count1 == 10) {
                count1 = 30
            }
            if (count1 == 11) {
                count1 = 27
            }
            if (count1 == 21) {
                count1 = 39
            }
            if (count1 == 40) {
                count1 = 58
            }
            if (count1 == 45) {
                count1 = 54
            }
            if (count1 == 35) {
                count1 = 61
            }
            if (count1 == 69) {
                count1 = 93
            }
            if (count1 == 76) {
                count1 = 83
            }
            if (count1 == 84) {
                count1 = 96
            }
        }
        if (count1 == 99) {
            val alertDialog = AlertDialog.Builder(this@Main2Activity).create()
            alertDialog.setTitle("Awww")
            alertDialog.setMessage("You have lost :(")
            alertDialog.setButton(
                AlertDialog.BUTTON_NEUTRAL, "OK"
            ) { dialog, which -> dialog.dismiss() }
            alertDialog.show()
            count = 100
            count1 = 100
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        i1 = findViewById<View>(R.id.imageView5) as ImageView
        i2 = findViewById<View>(R.id.imageView6) as ImageView
        b1_roll = findViewById<View>(R.id.b1_roll) as Button
        iv_dice = findViewById<View>(R.id.iv_dice) as ImageView
        r = Random()
        b1_roll!!.setOnClickListener {
            rollednumber = r!!.nextInt(6) + 1
            if (count <= 99 && count + rollednumber <= 99) {
                if (rollednumber == 1) {
                    iv_dice!!.setImageResource(R.drawable.a)
                    count++
                } else if (rollednumber == 2) {
                    iv_dice!!.setImageResource(R.drawable.b)
                    count += 2
                } else if (rollednumber == 3) {
                    iv_dice!!.setImageResource(R.drawable.c)
                    count += 3
                } else if (rollednumber == 4) {
                    iv_dice!!.setImageResource(R.drawable.d)
                    count += 4
                } else if (rollednumber == 5) {
                    iv_dice!!.setImageResource(R.drawable.e)
                    count += 5
                } else if (rollednumber == 6) {
                    iv_dice!!.setImageResource(R.drawable.f)
                    count += 6
                }


                //snakes
                if (count == 98) {
                    count = 78
                }
                if (count == 94) {
                    count = 77
                }
                if (count == 81) {
                    count = 58
                }
                if (count == 70) {
                    count = 33
                }
                if (count == 51) {
                    count = 37
                }
                if (count == 46) {
                    count = 31
                }
                if (count == 34) {
                    count = 17
                }
                if (count == 28) {
                    count = 14
                }
                if (count == 22) {
                    count = 5
                }
                if (count == 20) {
                    count = 14
                }


                //ladders
                if (count == 1) {
                    count = 17
                }
                if (count == 10) {
                    count = 30
                }
                if (count == 11) {
                    count = 27
                }
                if (count == 21) {
                    count = 39
                }
                if (count == 40) {
                    count = 58
                }
                if (count == 45) {
                    count = 54
                }
                if (count == 35) {
                    count = 61
                }
                if (count == 69) {
                    count = 93
                }
                if (count == 76) {
                    count = 83
                }
                if (count == 84) {
                    count = 96
                }

            }

            b1_roll!!.isEnabled = false
            b1_roll!!.postDelayed({
//                AI()

                b1_roll!!.isEnabled = true
                if (count == 99) {
                    val alertDialog = AlertDialog.Builder(this@Main2Activity).create()
                    alertDialog.setTitle("Yay")
                    alertDialog.setMessage("You have won!!!")
                    alertDialog.setButton(
                        AlertDialog.BUTTON_NEUTRAL, "OK"
                    ) { dialog, which -> dialog.dismiss() }
                    alertDialog.show()
                    count = 100
                    count1 = 100
                    i2!!.x= 1f
                    i2!!.y= 150f

                }
                //display position
                else if (count<10){
                    i2!!.x= count.toFloat() *110
                    i2!!.y= 1250f
                }
                else if((count)/10%2==0){
                    i2!!.x= count%10.toFloat()*110
                    i2!!.y= 1250f-((count)/10)*110
                }
                else {
                    i2!!.x= (9-count%10.toFloat())*110
                    i2!!.y= 1250f-((count)/10)*110
                }
//                AI()
//                if (count1<10){
//                    i1!!.x= count1.toFloat() *110
//                    i1!!.y= 1250f
//                }
//                else if((count1)/10%2==0){
//                    i1!!.x= count1%10.toFloat()*110
//                    i1!!.y= 1250f-((count1)/10)*110
//                }
//                else {
//                    i1!!.x= (9-count1%10.toFloat())*110
//                    i1!!.y= 1250f-(count1/10)*110
//                }

            }, 1000)
        }
    }
}