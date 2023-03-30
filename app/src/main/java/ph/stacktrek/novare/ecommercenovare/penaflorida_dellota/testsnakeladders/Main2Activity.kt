package ph.stacktrek.novare.ecommercenovare.penaflorida_dellota.testsnakeladders




import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import java.util.*

class Main2Activity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")

    lateinit var b1_roll: Button
    lateinit var iv_dice: ImageView
    lateinit var r: Random
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

    lateinit var i1: ImageView
    lateinit var i2:ImageView

    fun AI(){
        rollednumber = Random().nextInt(6) + 1
        if (count1 <= 99 && count1 + rollednumber <= 99){
            if (rollednumber == 1) {
                iv_dice.setImageResource(R.drawable.a)
                for (x in 1 until 2) {
                    if (i1.x >= 432 && k == 1) {
                        b1 = i1.y
                        i1.y = b1 - 48
                        move1 *= -1
                        k = 0
                        continue
                    }
                    if (i1.x <= 15 && k == 1) {
                        b1 = i1.y
                        i1.y = b1 - 48
                        move1 *= -1
                        k = 0
                        continue
                    }
                    a1 = i1.x
                    i1.x = a1 + move1
                    k = 1
                }
                count1++
            }
            else if (rollednumber == 2) {
                iv_dice.setImageResource(R.drawable.b)
                for (x in 1..2) {
                    if (i1.x >= 432 && k == 1) {
                        b1 = i1.y
                        i1.y = b1 - 48
                        move1 = move1 * -1
                        k = 0
                        continue
                    }
                    if (i1.x <= 15 && k == 1) {
                        b1 = i1.y
                        i1.y = b1 - 48
                        move1 = move1 * -1
                        k = 0
                        continue
                    }
                    a1 = i1.x
                    i1.x = a1 + move1
                    k = 1
                }
                count1 += 2
            }
            else if (rollednumber == 3) {
                iv_dice.setImageResource(R.drawable.c)
                for (x in 1..3) {
                    if (i1.x >= 432f && k == 1) {
                        b1 = i1.y
                        i1.y = b1 - 48f
                        move1 *= -1
                        k = 0
                        continue
                    }
                    if (i1.x <= 15f && k == 1) {
                        b1 = i1.y
                        i1.y = b1 - 48f
                        move1 *= -1
                        k = 0
                        continue
                    }
                    a1 = i1.x
                    i1.x = a1 + move1
                    k = 1
                }
                count1 += 3
            }
            else if (rollednumber == 4) {
                iv_dice.setImageResource(R.drawable.d)
                for (x in 1..4) {
                    if (i1.x >= 432 && k == 1) {
                        b1 = i1.y
                        i1.y = b1 - 48
                        move1 *= -1
                        k = 0
                        continue
                    }
                    if (i1.x <= 15 && k == 1) {
                        b1 = i1.y
                        i1.y = b1 - 48
                        move1 *= -1
                        k = 0
                        continue
                    }
                    a1 = i1.x
                    i1.x = a1 + move1
                    k = 1
                }
                count1 += 4
            }
            else if (rollednumber == 5) {
                iv_dice.setImageResource(R.drawable.e)

                for (x in 1 until 6) {
                    if (i1.x >= 432 && k == 1) {
                        val b1 = i1.y
                        i1.y = b1 - 48
                        move1 *= -1
                        k = 0
                        continue
                    }
                    if (i1.x <= 15 && k == 1) {
                        val b1 = i1.y
                        i1.y = b1 - 48
                        move1 *= -1
                        k = 0
                        continue
                    }
                    val a1 = i1.x
                    i1.x = a1 + move1
                    k = 1
                }
                count1 += 5
            }
            if (rollednumber == 6) {
                iv_dice.setImageResource(R.drawable.f)

                for (x in 1 until 7) {
                    if (i1.x >= 432 && k == 1) {
                        val b1 = i1.y
                        i1.y = b1 - 48
                        move1 *= -1
                        k = 0
                        continue
                    }
                    if (i1.x <= 15 && k == 1) {
                        val b1 = i1.y
                        i1.y = b1 - 48
                        move1 *= -1
                        k = 0
                        continue
                    }
                    val a1 = i1.x
                    i1.x = a1 + move1
                    k = 1
                }
                count1 += 6
            }

            //snakes

            //snakes
            if (count1 == 98) {
                b1 = i1.y
                i1.y = b1 + 48 * 2
                count1 = 78
            }
            if (count1 == 94) {
                a1 = i1.x
                b1 = i1.y
                i1.y = b1 + 48 * 2
                i1.x = a1 - 48 * 3
                count1 = 77
            }
            if (count1 == 81) {
                b1 = i1.y
                i1.y = b1 + 48 * 3
                move1 *= -1
                count1 = 58
            }
            if (count1 == 70) {
                a1 = i1.x
                b1 = i1.y
                i1.y = b1 + 48 * 4
                i1.x = a1 - 48 * 3
                count1 = 33
            }
            if (count1 == 51) {
                a1 = i1.x
                b1 = i1.y
                i1.y = b1 + 48 * 2
                i1.x = a1 - 48 * 6
                count1 = 37
            }
            if (count1 == 46) {
                a1 = i1.x
                b1 = i1.y
                i1.y = b1 + 48 * 1
                i1.x = a1 + 48 * 2
                move1 *= -1
                count1 = 31
            }
            if (count1 == 34) {
                a1 = i1.x
                b1 = i1.y
                i1.y = b1 + 48 * 2
                i1.x = a1 - 48 * 3
                count1 = 17
            }
            if (count1 == 28) {
                a1 = i1.x
                b1 = i1.y
                i1.y = b1 + 48 * 1
                i1.x = a1 - 48 * 3
                move1 *= -1
                count1 = 14
            }
            if (count1 == 22) {
                a1 = i1.x
                b1 = i1.y
                i1.y = b1 + 48 * 2
                i1.x = a1 + 48 * 3
                count1 = 5
            }
            if (count1 == 20) {
                a1 = i1.x
                b1 = i1.y
                i1.y = b1 + 48 * 1
                i1.x = a1 + 48 * 5
                move1 *= -1
                count1 = 14
            }
            //ladders


            //ladders
            if (count1 == 1) {
                a1 = i1.x
                b1 = i1.y
                i1.y = b1 - 48 * 1
                i1.x = a1 + 48
                move1 *= -1
                count1 = 17
            }
            if (count1 == 10) {
                a1 = i1.x
                b1 = i1.y
                i1.y = b1 - 48 * 2
                count1 = 30
            }
            if (count1 == 11) {
                a1 = i1.x
                b1 = i1.y
                i1.y = b1 - 48
                i1.x = a1 - 48
                move1 *= -1
                count1 = 27
            }
            if (count1 == 21) {
                a1 = i1.x
                b1 = i1.y
                i1.y = b1 - 48 * 1
                i1.x = a1 - 48 * 1
                move1 *= -1
                count1 = 39
            }
            if (count1 == 40) {
                a1 = i1.x
                b1 = i1.y
                i1.y = b1 - 48 * 1
                i1.x = a1 + 48 * 1
                move1 *= -1
                count1 = 58
            }
            if (count1 == 45) {
                a1 = i1.x
                b1 = i1.y
                i1.y = b1 - 48 * 1
                move1 *= -1
                count1 = 54
            }
            if (count1 == 35) {
                a1 = i1.x
                b1 = i1.y
                i1.y = b1 - 48 * 3
                i1.x = a1 - 48 * 3
                move1 *= -1
                count1 = 61
            }
            if (count1 == 69) {
                a1 = i1.x
                b1 = i1.y
                i1.y = b1 - 48 * 3
                i1.x = a1 - 48 * 3
                move1 *= -1
                count1 = 93
            }
            if (count1 == 76) {
                a1 = i1.x
                b1 = i1.y
                i1.y = b1 - 48 * 1
                move1 *= -1
                count1 = 83
            }
            if (count1 == 84) {
                a1 = i1.x
                b1 = i1.y
                i1.y = b1 - 48 * 1
                i1.x = a1 - 48 * 1
                move1 *= -1
                count1 = 96
            }
        }

        if (count1 == 99) {
            val alertDialog = AlertDialog.Builder(this@Main2Activity).create()
            alertDialog.setTitle("Awww")
            alertDialog.setMessage("You have lost :(")
            alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "OK") { dialog, which -> dialog.dismiss() }
            alertDialog.show()
            count = 100
            count1 = 100
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        i1 = findViewById(R.id.imageView5)
        i2 = findViewById(R.id.imageView6)
        b1_roll = findViewById(R.id.b1_roll)
        iv_dice = findViewById(R.id.iv_dice)
        r = Random()

        b1_roll.setOnClickListener {
            fun onClick(v: View) {
                rollednumber = r.nextInt(6) + 1

                if (count <= 99 && (count + rollednumber) <= 99) {
                    if (rollednumber == 1) {
                        iv_dice.setImageResource(R.drawable.a)
                        for (x in 1 until 2) {
                            when {
                                i2.x >= 432 && j == 1 -> {
                                    val b = i2.y
                                    i2.y = b - 48
                                    move *= -1
                                    j = 0
                                    continue
                                }
                                i2.x <= 15 && j == 1 -> {
                                    val b = i2.y
                                    i2.y = b - 48
                                    move *= -1
                                    j = 0
                                    continue
                                }
                                else -> {
                                    val a = i2.x
                                    i2.x = a + move
                                    j = 1
                                }
                            }
                        }
                        count++
                    }
                    else if (rollednumber == 2) {
                        iv_dice.setImageResource(R.drawable.b)
                        for (x in 1 until 3) {
                            when {
                                i2.x >= 432 && j == 1 -> {
                                    val b = i2.y
                                    i2.y = b - 48
                                    move *= -1
                                    j = 0
                                    continue
                                }
                                i2.x <= 15 && j == 1 -> {
                                    val b = i2.y
                                    i2.y = b - 48
                                    move *= -1
                                    j = 0
                                    continue
                                }
                                else -> {
                                    val a = i2.x
                                    i2.x = a + move
                                    j = 1
                                }
                            }
                        }
                        count += 2
                    }
                    else if (rollednumber == 3) {
                        iv_dice.setImageResource(R.drawable.c)
                        for (x in 1 until 4) {
                            when {
                                i2.x >= 432 && j == 1 -> {
                                    val b = i2.y
                                    i2.y = b - 48
                                    move *= -1
                                    j = 0
                                    continue
                                }
                                i2.x <= 15 && j == 1 -> {
                                    val b = i2.y
                                    i2.y = b - 48
                                    move *= -1
                                    j = 0
                                    continue
                                }
                                else -> {
                                    val a = i2.x
                                    i2.x = a + move
                                    j = 1
                                }
                            }
                        }
                        count += 3
                    }
                    else if (rollednumber == 4) {
                        iv_dice.setImageResource(R.drawable.d)
                        for (x in 1 until 5) {
                            when {
                                i2.x >= 432 && j == 1 -> {
                                    val b = i2.y
                                    i2.y = b - 48
                                    move *= -1
                                    j = 0
                                    continue
                                }
                                i2.x <= 15 && j == 1 -> {
                                    val b = i2.y
                                    i2.y = b - 48
                                    move *= -1
                                    j = 0
                                    continue
                                }
                                else -> {
                                    val a = i2.x
                                    i2.x = a + move
                                    j = 1
                                }
                            }
                        }
                        count += 4
                    }
                    else if (rollednumber == 5) {
                        iv_dice.setImageResource(R.drawable.e)

                        for (x in 1 until 6) {
                            if (i2.x >= 432 && j == 1) {
                                var b = i2.y
                                i2.y = b - 48
                                move *= -1
                                j = 0
                                continue
                            }
                            if (i2.x <= 15 && j == 1) {
                                var b = i2.y
                                i2.y = b - 48
                                move *= -1
                                j = 0
                                continue
                            }
                            val a = i2.x
                            i2.x = a + move
                            j = 1
                        }
                        count += 5
                    }
                    if (rollednumber == 6) {
                        iv_dice.setImageResource(R.drawable.f)

                        for (x in 1 until 7) {
                            if (i2.x >= 432 && j == 1) {
                                var b = i2.y
                                i2.y = b - 48
                                move *= -1
                                j = 0
                                continue
                            }
                            if (i2.x <= 15 && j == 1) {
                                var b = i2.y
                                i2.y = b - 48
                                move *= -1
                                j = 0
                                continue
                            }
                            val a = i2.x
                            i2.x = a + move
                            j = 1
                        }
                        count += 6
                    }

                    //snakes

                    if (count == 98) {
                        var b = i2.y
                        i2.y = b + (48 * 2)
                        count = 78
                    }
                    if (count == 94) {
                        val a = i2.x
                        var b = i2.y
                        i2.y = b + (48 * 2)
                        i2.x = a - (48 * 3)
                        count = 77
                    }
                    if (count == 81) {
                        var b = i2.y
                        i2.y = b + (48 * 3)
                        move *= -1
                        count = 58
                    }
                    if (count == 70) {
                        val a = i2.x
                        var b = i2.y
                        i2.y = b + (48 * 4)
                        i2.x = a - (48 * 3)
                        count = 33
                    }
                    if (count == 51) {
                        val a = i2.x
                        var b = i2.y
                        i2.y = b + (48 * 2)
                        i2.x = a - (48 * 6)
                        count = 37
                    }
                    if (count == 46) {
                        val a = i2.x
                        var b = i2.y
                        i2.y = b + (48 * 1)
                        i2.x = a + (48 * 2)
                        count = 31
                        move *= -1
                    }
                    if (count == 34) {
                        val a = i2.x
                        var b = i2.y
                        i2.y = b + (48 * 2)
                        i2.x = a - (48 * 3)
                        count = 17
                    }
                    if (count == 28) {
                        val a = i2.x
                        var b = i2.y
                        i2.y = b + (48 * 1)
                        i2.x = a - (48 * 3)
                        move *= -1
                        count = 14
                    }
                    if (count == 22) {
                        val a = i2.x
                        var b = i2.y
                        i2.y = b + (48 * 2)
                        i2.x = a + (48 * 3)
                        count = 5
                    }
                    if (count == 20) {
                        val a = i2.x
                        var b = i2.y
                        i2.y = b + (48 * 1)
                        i2.x = a + (48 * 5)
                        move *= -1
                        count = 14
                    }


                    //ladders
                    if (count == 1) {
                        a = i2.x;
                        b = i2.y;
                        i2.y = b - (48 * 1);
                        i2.x = a + (48);
                        move *= -1;
                        count = 17;
                    }
                    if (count == 10) {
                        a = i2.x
                        b = i2.y
                        i2.y = b - (48 * 2);
                        count = 30;
                    }
                    if (count == 11) {
                        a = i2.x
                        b = i2.y
                        i2.y = b - (48);
                        i2.x = a - (48);
                        move *= -1;
                        count = 27;
                    }
                    if (count == 21) {
                        a = i2.x
                        b = i2.y
                        i2.y = b - (48 * 1);
                        i2.x = a - (48 * 1);
                        move *= -1;
                        count = 39;
                    }
                    if (count == 40) {
                        a = i2.x;
                        b = i2.y;
                        i2.y = b - (48 * 1);
                        i2.setX(a + (48 * 1));
                        move *= -1;
                        count = 58;
                    }
                    if (count == 45) {
                        a = i2.x
                        b = i2.y
                        var b1_roll: Button
                        lateinit var iv_dice: ImageView
                        lateinit var r: Random
                        var move = 48f
                        var move1 = 48f
                        var a:Int
                        var a1:Int
                        var b = 0
                        var b1 = 0
                        var j = 0
                        var k=0
                        var count = 0
                        var count1 = 0
                        var rolledNumber:Int
                        lateinit var i1: ImageView
                        lateinit var i2: ImageView

                        fun AI(){
                            rollednumber = r.nextInt(6) + 1
                            if (count1 <= 99 && ((count1 + rollednumber) <= 99)) {
                                if (rollednumber == 1) {
                                    iv_dice.setImageResource(R.drawable.a)
                                    for (x in 1..1) {
                                        if (i1.x >= 432 && k == 1) {
                                            b1 = i1.y.toInt()
                                            i1.y = (b1 - 48).toFloat()
                                            move1 *= -1
                                            k = 0
                                            continue
                                        }
                                        if (i1.x <= 15 && k == 1) {
                                            b1 = i1.y.toInt()
                                            i1.y = (b1 - 48).toFloat()
                                            move1 *= -1
                                            k = 0
                                            continue
                                        }
                                        a1 = i1.x.toInt()
                                        i1.x = a1 + move1
                                        k = 1
                                    }
                                    count1++
                                }
                                else if (rollednumber == 2) {
                                    iv_dice.setImageResource(R.drawable.b)
                                    for (x in 1 until 3) {
                                        if (i1.x >= 432 && k == 1) {
                                            b1 = i1.y.toInt()
                                            i1.y = (b1 - 48).toFloat()
                                            move1 *= -1
                                            k = 0
                                            continue
                                        }
                                        if (i1.x <= 15 && k == 1) {
                                            b1 = i1.y.toInt()
                                            i1.y = (b1 - 48).toFloat()
                                            move1 *= -1
                                            k = 0
                                            continue
                                        }
                                        a1 = i1.x.toInt()
                                        i1.x = a1 + move1
                                        k = 1
                                    }
                                    count1 += 2
                                }
                                else if (rollednumber == 3) {
                                    iv_dice.setImageResource(R.drawable.c)
                                    for (x in 1..3) {
                                        if (i1.x >= 432 && k == 1) {
                                            b1 = i1.y.toInt()
                                            i1.y = (b1 - 48).toFloat()
                                            move1 *= -1
                                            k = 0
                                            continue
                                        }
                                        if (i1.x <= 15 && k == 1) {
                                            b1 = i1.y.toInt()
                                            i1.y = (b1 - 48).toFloat()
                                            move1 *= -1
                                            k = 0
                                            continue
                                        }
                                        a1 = i1.x.toInt()
                                        i1.x = a1 + move1
                                        k = 1
                                    }
                                    count1 += 3
                                }
                                else if (rollednumber == 4) {
                                    iv_dice.setImageResource(R.drawable.d)
                                    for (x in 1..4) {
                                        if (i1.x >= 432 && k == 1) {
                                            b1 = i1.y.toInt()
                                            i1.y = (b1 - 48).toFloat()
                                            move1 *= -1
                                            k = 0
                                            continue
                                        }
                                        if (i1.x <= 15 && k == 1) {
                                            b1 = i1.y.toInt()
                                            i1.y = (b1 - 48).toFloat()
                                            move1 *= -1
                                            k = 0
                                            continue
                                        }
                                        a1 = i1.x.toInt()
                                        i1.x = a1 + move1
                                        k = 1
                                    }
                                    count1 += 4
                                }
                                if (rollednumber == 5) {
                                    iv_dice.setImageResource(R.drawable.e)

                                    for (x in 1 until 6) {
                                        if (i1.x >= 432 && k == 1) {
                                            val b1 = i1.y
                                            i1.y = b1 - 48
                                            move1 *= -1
                                            k = 0
                                            continue
                                        }
                                        if (i1.x <= 15 && k == 1) {
                                            val b1 = i1.y
                                            i1.y = b1 - 48
                                            move1 *= -1
                                            k = 0
                                            continue
                                        }
                                        val a1 = i1.x
                                        i1.x = a1 + move1
                                        k = 1
                                    }
                                    count1 += 5
                                }

                                if (rollednumber == 6) {
                                    iv_dice.setImageResource(R.drawable.f)

                                    for (x in 1 until 7) {
                                        if (i1.x >= 432 && k == 1) {
                                            val b1 = i1.y
                                            i1.y = b1 - 48
                                            move1 *= -1
                                            k = 0
                                            continue
                                        }
                                        if (i1.x <= 15 && k == 1) {
                                            val b1 = i1.y
                                            i1.y = b1 - 48
                                            move1 *= -1
                                            k = 0
                                            continue
                                        }
                                        val a1 = i1.x
                                        i1.x = a1 + move1
                                        k = 1
                                    }
                                    count1 += 6
                                }

                                //snakes
                                if (count1 == 98) {
                                    b1 = i1.y.toInt()
                                    i1.y = (b1 + (48 * 2)).toFloat()
                                    count1 = 78
                                }
                                if (count1 == 94) {
                                    a1 = i1.x.toInt()
                                    b1 = i1.y.toInt()
                                    i1.y = (b1 + (48 * 2)).toFloat()
                                    i1.x = (a1 - (48 * 3)).toFloat()
                                    count1 = 77
                                }
                                if (count1 == 81) {
                                    b1 = i1.y.toInt()
                                    i1.y = (b1 + (48 * 3)).toFloat()
                                    move1 *= -1
                                    count1 = 58
                                }
                                if (count1 == 70) {
                                    a1 = i1.x.toInt()
                                    b1 = i1.y.toInt()
                                    i1.y = (b1 + (48 * 4)).toFloat()
                                    i1.x = (a1 - (48 * 3)).toFloat()
                                    count1 = 33
                                }
                                if (count1 == 51) {
                                    a1 = i1.x.toInt()
                                    b1 = i1.y.toInt()
                                    i1.y = (b1 + (48 * 2)).toFloat()
                                    i1.x = (a1 - (48 * 6)).toFloat()
                                    count1 = 37
                                }
                                if (count1 == 46) {
                                    a1 = i1.x.toInt()
                                    b1 = i1.y.toInt()
                                    i1.y = (b1 + (48 * 1)).toFloat()
                                    i1.x = (a1 + (48 * 2)).toFloat()
                                    move1 *= -1
                                    count1 = 31
                                }
                                if (count1 == 34) {
                                    a1 = i1.x.toInt()
                                    b1 = i1.y.toInt()
                                    i1.y = (b1 + (48 * 2)).toFloat()
                                    i1.x = (a1 - (48 * 3)).toFloat()
                                    count1 = 17
                                }
                                if (count1 == 28) {
                                    a1 = i1.x.toInt()
                                    b1 = i1.y.toInt()
                                    i1.y = (b1 + (48 * 1)).toFloat()
                                    i1.x = (a1 - (48 * 3)).toFloat()
                                    move1 *= -1
                                    count1 = 14
                                }
                                if (count1 == 22) {
                                    a1 = i1.x.toInt()
                                    b1 = i1.y.toInt()
                                    i1.y = (b1 + (48 * 2)).toFloat()
                                    i1.x = (a1 + (48 * 3)).toFloat()
                                    count1 = 5
                                }
                                if (count1 == 20) {
                                    a1 = i1.x.toInt()
                                    b1 = i1.y.toInt()
                                    i1.y = (b1 + (48 * 1)).toFloat()
                                    i1.x = (a1 + (48 * 5)).toFloat()
                                    move1 *= -1
                                    count1 = 14
                                }

                                //ladders

                                if (count1 == 1) {
                                    val a1 = i1.x
                                    val b1 = i1.y
                                    i1.y = b1 - (48 * 1)
                                    i1.x = a1 + 48
                                    move1 *= -1
                                    count1 = 17
                                }
                                if (count1 == 10) {
                                    val a1 = i1.x
                                    val b1 = i1.y
                                    i1.y = b1 - (48 * 2)
                                    count1 = 30
                                }
                                if (count1 == 11) {
                                    val a1 = i1.x
                                    val b1 = i1.y
                                    i1.y = b1 - 48
                                    i1.x = a1 - 48
                                    move1 *= -1
                                    count1 = 27
                                }
                                if (count1 == 21) {
                                    val a1 = i1.x
                                    val b1 = i1.y
                                    i1.y = b1 - (48 * 1)
                                    i1.x = a1 - (48 * 1)
                                    move1 *= -1
                                    count1 = 39
                                }
                                if (count1 == 40) {
                                    val a1 = i1.x
                                    val b1 = i1.y
                                    i1.y = b1 - (48 * 1)
                                    i1.x = a1 + (48 * 1)
                                    move1 *= -1
                                    count1 = 58
                                }
                                if (count1 == 45) {
                                    val a1 = i1.x
                                    val b1 = i1.y
                                    i1.y = b1 - (48 * 1)
                                    move1 *= -1
                                    count1 = 54
                                }
                                if (count1 == 35) {
                                    val a1 = i1.x
                                    val b1 = i1.y
                                    i1.y = b1 - (48 * 3)
                                    i1.x = a1 - (48 * 3)
                                    move1 *= -1
                                    count1 = 61
                                }
                                if (count1 == 69) {
                                    val a1 = i1.x
                                    val b1 = i1.y
                                    i1.y = b1 - (48 * 3)
                                    i1.x = a1 - (48 * 3)
                                    move1 *= -1
                                    count1 = 93
                                }
                                if (count1 == 76) {
                                    val a1 = i1.x
                                    val b1 = i1.y
                                    i1.y = b1 - (48 * 1)
                                    move1 *= -1
                                    count1 = 83
                                }
                                if (count1 == 84) {
                                    val a1 = i1.x
                                    val b1 = i1.y
                                    i1.y = b1 - (48 * 1)
                                    i1.x = a1 - (48 * 1)
                                    move1 *= -1
                                    count1 = 96
                                }


                                fun onCreate(savedInstanceState: Bundle?) {
                                    onCreate(savedInstanceState)
                                    setContentView(R.layout.activity_main2)
                                    i1 = findViewById(R.id.imageView5)
                                    i2 = findViewById(R.id.imageView6)
                                    b1_roll = findViewById(R.id.b1_roll)
                                    iv_dice = findViewById(R.id.iv_dice)
                                    r = Random()

                                    b1_roll.setOnClickListener {
                                        fun onClick(v: View) {
                                            val rolledNumber = (1..6).random()
                                            if (count <= 99 && (count + rolledNumber <= 99)) {
                                                if (rolledNumber == 1) {
                                                    iv_dice.setImageResource(R.drawable.a)
                                                    for (x in 1 until 2) {
                                                        if (i2.x >= 432 && j == 1) {
                                                            val b = i2.y
                                                            i2.y = b - 48
                                                            move *= -1
                                                            j = 0
                                                            continue
                                                        }
                                                        if (i2.x <= 15 && j == 1) {
                                                            val b = i2.y
                                                            i2.y = b - 48
                                                            move *= -1
                                                            j = 0
                                                            continue
                                                        }
                                                        val a = i2.x
                                                        i2.x = a + move
                                                        j = 1
                                                    }
                                                    count++
                                                } else if (rolledNumber == 2) {
                                                    iv_dice.setImageResource(R.drawable.b)
                                                    for (x in 1 until 3) {
                                                        if (i2.x >= 432 && j == 1) {
                                                            val b = i2.y
                                                            i2.y = b - 48
                                                            move *= -1
                                                            j = 0
                                                            continue
                                                        }
                                                        if (i2.x <= 15 && j == 1) {
                                                            val b = i2.y
                                                            i2.y = b - 48
                                                            move *= -1
                                                            j = 0
                                                            continue
                                                        }
                                                        val a = i2.x
                                                        i2.x = a + move
                                                        j = 1
                                                    }
                                                    count += 2
                                                } else if (rolledNumber == 3) {
                                                    iv_dice.setImageResource(R.drawable.c)
                                                    for (x in 1 until 4) {
                                                        if (i2.x >= 432 && j == 1) {
                                                            val b = i2.y
                                                            i2.y = b - 48
                                                            move *= -1
                                                            j = 0
                                                            continue
                                                        }
                                                        if (i2.x <= 15 && j == 1) {
                                                            val b = i2.y
                                                            i2.y = b - 48
                                                            move *= -1
                                                            j = 0
                                                            continue
                                                        }
                                                        val a = i2.x
                                                        i2.x = a + move
                                                        j = 1
                                                    }
                                                    count += 3
                                                } else if (rolledNumber == 4) {
                                                    iv_dice.setImageResource(R.drawable.d)
                                                    for (x in 1 until 5) {
                                                        if (i2.x >= 432 && j == 1) {
                                                            val b = i2.y
                                                            i2.y = b - 48
                                                            move *= -1
                                                            j = 0
                                                            continue
                                                        }
                                                        if (i2.x <= 15 && j == 1) {
                                                            val b = i2.y
                                                            i2.y = b - 48
                                                            move *= -1
                                                            j = 0
                                                            continue
                                                        }
                                                        val a = i2.x
                                                        i2.x = a + move
                                                        j = 1
                                                    }
                                                    count += 4
                                                } else if (rollednumber == 5) {
                                                    iv_dice.setImageResource(R.drawable.e)

                                                    for (x in 1 until 6) {
                                                        if (i2.x >= 432 && j == 1) {
                                                            b = i2.y.toInt()
                                                            i2.y = (b - 48).toFloat()
                                                            move *= -1
                                                            j = 0
                                                            continue
                                                        }
                                                        if (i2.x <= 15 && j == 1) {
                                                            b = i2.y.toInt()
                                                            i2.y = (b - 48).toFloat()
                                                            move *= -1
                                                            j = 0
                                                            continue
                                                        }
                                                        a = i2.x.toInt()
                                                        i2.x = a + move
                                                        j = 1
                                                    }
                                                    count += 5

                                                } else if (rollednumber == 6) {
                                                    iv_dice.setImageResource(R.drawable.f)

                                                    for (x in 1 until 7) {
                                                        if (i2.x >= 432 && j == 1) {
                                                            b = i2.y.toInt()
                                                            i2.y = (b - 48).toFloat()
                                                            move *= -1
                                                            j = 0
                                                            continue
                                                        }
                                                        if (i2.x <= 15 && j == 1) {
                                                            b = i2.y.toInt()
                                                            i2.y = (b - 48).toFloat()
                                                            move *= -1
                                                            j = 0
                                                            continue
                                                        }
                                                        a = i2.x.toInt()
                                                        i2.x = a + move
                                                        j = 1
                                                    }
                                                    count += 6
                                                }

                                                //snakes
                                                if (count == 98) {
                                                    b = i2.y.toInt()
                                                    i2.y = (b + (48 * 2)).toFloat()
                                                    count = 78
                                                }
                                                if (count == 94) {
                                                    a = i2.x.toInt()
                                                    b = i2.y.toInt()
                                                    i2.y = (b + (48 * 2)).toFloat()
                                                    i2.x = (a - (48 * 3)).toFloat()
                                                    count = 77
                                                }
                                                if (count == 81) {
                                                    b = i2.y.toInt()
                                                    i2.y = (b + (48 * 3)).toFloat()
                                                    move *= -1
                                                    count = 58
                                                }
                                                if (count == 70) {
                                                    a = i2.x.toInt()
                                                    b = i2.y.toInt()
                                                    i2.y = (b + (48 * 4)).toFloat()
                                                    i2.x = (a - (48 * 3)).toFloat()
                                                    count = 33
                                                }
                                                if (count == 51) {
                                                    a = i2.x.toInt()
                                                    b = i2.y.toInt()
                                                    i2.y = (b + (48 * 2)).toFloat()
                                                    i2.x = (a - (48 * 6)).toFloat()
                                                    count = 37
                                                }
                                                if (count == 46) {
                                                    a = i2.x.toInt()
                                                    b = i2.y.toInt()
                                                    i2.y = (b + (48 * 1)).toFloat()
                                                    i2.x = (a + (48 * 2)).toFloat()
                                                    count = 31
                                                    move = move * -1
                                                }
                                                if (count == 34) {
                                                    a = i2.x.toInt()
                                                    b = i2.y.toInt()
                                                    i2.y = (b + (48 * 2)).toFloat()
                                                    i2.x = (a - (48 * 3)).toFloat()
                                                    count = 17
                                                }
                                                if (count == 28) {
                                                    a = i2.x.toInt()
                                                    b = i2.y.toInt()
                                                    i2.y = (b + (48 * 1)).toFloat()
                                                    i2.x = (a - (48 * 3)).toFloat()
                                                    move *= -1
                                                    count = 14
                                                }
                                                if (count == 22) {
                                                    a = i2.x.toInt()
                                                    b = i2.y.toInt()
                                                    i2.y = (b + (48 * 2)).toFloat()
                                                    i2.x = (a + (48 * 3)).toFloat()
                                                    count = 5
                                                }
                                                if (count == 20) {
                                                    a = i2.x.toInt()
                                                    b = i2.y.toInt()
                                                    i2.y = (b + (48 * 1)).toFloat()
                                                    i2.x = (a + (48 * 5)).toFloat()
                                                    move *= -1
                                                    count = 14
                                                }
                                                //ladders
                                                if (count == 1) {
                                                    val a = i2.x
                                                    val b = i2.y
                                                    i2.y = b - (48 * 1)
                                                    i2.x = a + 48
                                                    move *= -1
                                                    count = 17
                                                }
                                                if (count == 10) {
                                                    val a = i2.x
                                                    val b = i2.y
                                                    i2.y = b - (48 * 2)
                                                    count = 30
                                                }
                                                if (count == 11) {
                                                    val a = i2.x
                                                    val b = i2.y
                                                    i2.y = b - 48
                                                    i2.x = a - 48
                                                    move *= -1
                                                    count = 27
                                                }
                                                if (count == 21) {
                                                    val a = i2.x
                                                    val b = i2.y
                                                    i2.y = b - (48 * 1)
                                                    i2.x = a - (48 * 1)
                                                    move *= -1
                                                    count = 39
                                                }
                                                if (count == 40) {
                                                    val a = i2.x
                                                    val b = i2.y
                                                    i2.y = b - (48 * 1)
                                                    i2.x = a + (48 * 1)
                                                    move *= -1
                                                    count = 58
                                                }
                                                if (count == 45) {
                                                    val b = i2.y
                                                    i2.y = b - (48 * 1)
                                                    move *= -1
                                                    count = 54
                                                }
                                                if (count == 35) {
                                                    val a = i2.x
                                                    val b = i2.y
                                                    i2.y = b - (48 * 3)
                                                    i2.x = a - (48 * 3)
                                                    move *= -1
                                                    count = 61
                                                }
                                                if (count == 69) {
                                                    val a = i2.x
                                                    val b = i2.y
                                                    i2.y = b - (48 * 3)
                                                    i2.x = a - (48 * 3)
                                                    move *= -1
                                                    count = 93
                                                }
                                                if (count == 76) {
                                                    val b = i2.y
                                                    i2.y = b - (48 * 1)
                                                    move *= -1
                                                    count = 83
                                                }
                                                if (count == 84) {
                                                    val a = i2.x
                                                    val b = i2.y
                                                    i2.y = b - (48 * 1)
                                                    i2.x = a - (48 * 1)
                                                    move *= -1
                                                    count = 96
                                                }
                                            }

                                        }
                                    }

                                }
                                i2.y = (b - (48 * 1)).toFloat()
                                move *= -1
                                count = 54
                            }

                        }

                    }
                    if (count == 35) {
                        val a = i2.x
                        val b = i2.y
                        i2.y = b - (48 * 3)
                        i2.x = a - (48 * 3)
                        move *= -1
                        count = 61
                    }
                    if (count == 69) {
                        a = i2.x
                        b = i2.y
                        i2.y = b - (48 * 3)
                        i2.x = a - (48 * 3)
                        move *= -1
                        count = 93
                    }
                    if (count == 76) {
                        val a = i2.x
                        val b = i2.y
                        i2.y = b - (48 * 1)
                        move *= -1
                        count = 83
                    }
                    if (count == 84) {
                        val a = i2.x
                        val b = i2.y
                        i2.y = b - (48 * 1)
                        i2.x = a - (48 * 1)
                        move *= -1
                        count = 96
                    }
                    }
                //Another code goes here
                b1_roll.isEnabled = false
                b1_roll.postDelayed({
                    AI()
                    b1_roll.isEnabled = true
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
                    }
                }, 1000);
                }
        }

    }


}
