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
                for (x in 1..1) {
                    if (i1!!.x >= 432 && k == 1) {
                        b1 = i1!!.y
                        i1!!.y = b1 - 48
                        move1 = move1 * -1
                        k = 0
                        continue
                    }
                    if (i1!!.x <= 15 && k == 1) {
                        b1 = i1!!.y
                        i1!!.y = b1 - 48
                        move1 = move1 * -1
                        k = 0
                        continue
                    }
                    a1 = i1!!.x
                    i1!!.x = a1 + move1
                    k = 1
                }
                count1++
            } else if (rollednumber == 2) {
                iv_dice!!.setImageResource(R.drawable.b)
                for (x in 1..2) {
                    if (i1!!.x >= 432 && k == 1) {
                        b1 = i1!!.y
                        i1!!.y = b1 - 48
                        move1 = move1 * -1
                        k = 0
                        continue
                    }
                    if (i1!!.x <= 15 && k == 1) {
                        b1 = i1!!.y
                        i1!!.y = b1 - 48
                        move1 = move1 * -1
                        k = 0
                        continue
                    }
                    a1 = i1!!.x
                    i1!!.x = a1 + move1
                    k = 1
                }
                count1 += 2
            } else if (rollednumber == 3) {
                iv_dice!!.setImageResource(R.drawable.c)
                for (x in 1..3) {
                    if (i1!!.x >= 432 && k == 1) {
                        b1 = i1!!.y
                        i1!!.y = b1 - 48
                        move1 = move1 * -1
                        k = 0
                        continue
                    }
                    if (i1!!.x <= 15 && k == 1) {
                        b1 = i1!!.y
                        i1!!.y = b1 - 48
                        move1 = move1 * -1
                        k = 0
                        continue
                    }
                    a1 = i1!!.x
                    i1!!.x = a1 + move1
                    k = 1
                }
                count1 += 3
            } else if (rollednumber == 4) {
                iv_dice!!.setImageResource(R.drawable.d)
                for (x in 1..4) {
                    if (i1!!.x >= 432 && k == 1) {
                        b1 = i1!!.y
                        i1!!.y = b1 - 48
                        move1 = move1 * -1
                        k = 0
                        continue
                    }
                    if (i1!!.x <= 15 && k == 1) {
                        b1 = i1!!.y
                        i1!!.y = b1 - 48
                        move1 = move1 * -1
                        k = 0
                        continue
                    }
                    a1 = i1!!.x
                    i1!!.x = a1 + move1
                    k = 1
                }
                count1 += 4
            } else if (rollednumber == 5) {
                iv_dice!!.setImageResource(R.drawable.e)
                for (x in 1..5) {
                    if (i1!!.x >= 432 && k == 1) {
                        b1 = i1!!.y
                        i1!!.y = b1 - 48
                        move1 = move1 * -1
                        k = 0
                        continue
                    }
                    if (i1!!.x <= 15 && k == 1) {
                        b1 = i1!!.y
                        i1!!.y = b1 - 48
                        move1 = move1 * -1
                        k = 0
                        continue
                    }
                    a1 = i1!!.x
                    i1!!.x = a1 + move1
                    k = 1
                }
                count1 += 5
            } else if (rollednumber == 6) {
                iv_dice!!.setImageResource(R.drawable.f)
                for (x in 1..6) {
                    if (i1!!.x >= 432 && k == 1) {
                        b1 = i1!!.y
                        i1!!.y = b1 - 48
                        move1 = move1 * -1
                        k = 0
                        continue
                    }
                    if (i1!!.x <= 15 && k == 1) {
                        b1 = i1!!.y
                        i1!!.y = b1 - 48
                        move1 = move1 * -1
                        k = 0
                        continue
                    }
                    a1 = i1!!.x
                    i1!!.x = a1 + move1
                    k = 1
                }
                count1 += 6
            }

            //snakes
            if (count1 == 98) {
                b1 = i1!!.y
                i1!!.y = b1 + 48 * 2
                count1 = 78
            }
            if (count1 == 94) {
                a1 = i1!!.x
                b1 = i1!!.y
                i1!!.y = b1 + 48 * 2
                i1!!.x = a1 - 48 * 3
                count1 = 77
            }
            if (count1 == 81) {
                b1 = i1!!.y
                i1!!.y = b1 + 48 * 3
                move1 = move1 * -1
                count1 = 58
            }
            if (count1 == 70) {
                a1 = i1!!.x
                b1 = i1!!.y
                i1!!.y = b1 + 48 * 4
                i1!!.x = a1 - 48 * 3
                count1 = 33
            }
            if (count1 == 51) {
                a1 = i1!!.x
                b1 = i1!!.y
                i1!!.y = b1 + 48 * 2
                i1!!.x = a1 - 48 * 6
                count1 = 37
            }
            if (count1 == 46) {
                a1 = i1!!.x
                b1 = i1!!.y
                i1!!.y = b1 + 48 * 1
                i1!!.x = a1 + 48 * 2
                move1 = move1 * -1
                count1 = 31
            }
            if (count1 == 34) {
                a1 = i1!!.x
                b1 = i1!!.y
                i1!!.y = b1 + 48 * 2
                i1!!.x = a1 - 48 * 3
                count1 = 17
            }
            if (count1 == 28) {
                a1 = i1!!.x
                b1 = i1!!.y
                i1!!.y = b1 + 48 * 1
                i1!!.x = a1 - 48 * 3
                move1 = move1 * -1
                count1 = 14
            }
            if (count1 == 22) {
                a1 = i1!!.x
                b1 = i1!!.y
                i1!!.y = b1 + 48 * 2
                i1!!.x = a1 + 48 * 3
                count1 = 5
            }
            if (count1 == 20) {
                a1 = i1!!.x
                b1 = i1!!.y
                i1!!.y = b1 + 48 * 1
                i1!!.x = a1 + 48 * 5
                move1 = move1 * -1
                count1 = 14
            }


            //ladders
            if (count1 == 1) {
                a1 = i1!!.x
                b1 = i1!!.y
                i1!!.y = b1 - 48 * 1
                i1!!.x = a1 + 48
                move1 = move1 * -1
                count1 = 17
            }
            if (count1 == 10) {
                a1 = i1!!.x
                b1 = i1!!.y
                i1!!.y = b1 - 48 * 2
                count1 = 30
            }
            if (count1 == 11) {
                a1 = i1!!.x
                b1 = i1!!.y
                i1!!.y = b1 - 48
                i1!!.x = a1 - 48
                move1 = move1 * -1
                count1 = 27
            }
            if (count1 == 21) {
                a1 = i1!!.x
                b1 = i1!!.y
                i1!!.y = b1 - 48 * 1
                i1!!.x = a1 - 48 * 1
                move1 = move1 * -1
                count1 = 39
            }
            if (count1 == 40) {
                a1 = i1!!.x
                b1 = i1!!.y
                i1!!.y = b1 - 48 * 1
                i1!!.x = a1 + 48 * 1
                move1 = move1 * -1
                count1 = 58
            }
            if (count1 == 45) {
                a1 = i1!!.x
                b1 = i1!!.y
                i1!!.y = b1 - 48 * 1
                move1 = move1 * -1
                count1 = 54
            }
            if (count1 == 35) {
                a1 = i1!!.x
                b1 = i1!!.y
                i1!!.y = b1 - 48 * 3
                i1!!.x = a1 - 48 * 3
                move1 = move1 * -1
                count1 = 61
            }
            if (count1 == 69) {
                a1 = i1!!.x
                b1 = i1!!.y
                i1!!.y = b1 - 48 * 3
                i1!!.x = a1 - 48 * 3
                move1 = move1 * -1
                count1 = 93
            }
            if (count1 == 76) {
                a1 = i1!!.x
                b1 = i1!!.y
                i1!!.y = b1 - 48 * 1
                move1 = move1 * -1
                count1 = 83
            }
            if (count1 == 84) {
                a1 = i1!!.x
                b1 = i1!!.y
                i1!!.y = b1 - 48 * 1
                i1!!.x = a1 - 48 * 1
                move1 = move1 * -1
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
                    for (x in 1..1) {
                        if (i2!!.x >= 432 && j == 1) {
                            b = i2!!.y
                            i2!!.y = b - 48
                            move = move * -1
                            j = 0
                            continue
                        }
                        if (i2!!.x <= 15 && j == 1) {
                            b = i2!!.y
                            i2!!.y = b - 48
                            move = move * -1
                            j = 0
                            continue
                        }
                        a = i2!!.x
                        i2!!.x = a + move
                        j = 1
                    }
                    count++
                } else if (rollednumber == 2) {
                    iv_dice!!.setImageResource(R.drawable.b)
                    for (x in 1..2) {
                        if (i2!!.x >= 432 && j == 1) {
                            b = i2!!.y
                            i2!!.y = b - 48
                            move = move * -1
                            j = 0
                            continue
                        }
                        if (i2!!.x <= 15 && j == 1) {
                            b = i2!!.y
                            i2!!.y = b - 48
                            move = move * -1
                            j = 0
                            continue
                        }
                        a = i2!!.x
                        i2!!.x = a + move
                        j = 1
                    }
                    count += 2
                } else if (rollednumber == 3) {
                    iv_dice!!.setImageResource(R.drawable.c)
                    for (x in 1..3) {
                        if (i2!!.x >= 432 && j == 1) {
                            b = i2!!.y
                            i2!!.y = b - 48
                            move = move * -1
                            j = 0
                            continue
                        }
                        if (i2!!.x <= 15 && j == 1) {
                            b = i2!!.y
                            i2!!.y = b - 48
                            move = move * -1
                            j = 0
                            continue
                        }
                        a = i2!!.x
                        i2!!.x = a + move
                        j = 1
                    }
                    count += 3
                } else if (rollednumber == 4) {
                    iv_dice!!.setImageResource(R.drawable.d)
                    for (x in 1..4) {
                        if (i2!!.x >= 432 && j == 1) {
                            b = i2!!.y
                            i2!!.y = b - 48
                            move = move * -1
                            j = 0
                            continue
                        }
                        if (i2!!.x <= 15 && j == 1) {
                            b = i2!!.y
                            i2!!.y = b - 48
                            move = move * -1
                            j = 0
                            continue
                        }
                        a = i2!!.x
                        i2!!.x = a + move
                        j = 1
                    }
                    count += 4
                } else if (rollednumber == 5) {
                    iv_dice!!.setImageResource(R.drawable.e)
                    for (x in 1..5) {
                        if (i2!!.x >= 432 && j == 1) {
                            b = i2!!.y
                            i2!!.y = b - 48
                            move = move * -1
                            j = 0
                            continue
                        }
                        if (i2!!.x <= 15 && j == 1) {
                            b = i2!!.y
                            i2!!.y = b - 48
                            move = move * -1
                            j = 0
                            continue
                        }
                        a = i2!!.x
                        i2!!.x = a + move
                        j = 1
                    }
                    count += 5
                } else if (rollednumber == 6) {
                    iv_dice!!.setImageResource(R.drawable.f)
                    for (x in 1..6) {
                        if (i2!!.x >= 432 && j == 1) {
                            b = i2!!.y
                            i2!!.y = b - 48
                            move = move * -1
                            j = 0
                            continue
                        }
                        if (i2!!.x <= 15 && j == 1) {
                            b = i2!!.y
                            i2!!.y = b - 48
                            move = move * -1
                            j = 0
                            continue
                        }
                        a = i2!!.x
                        i2!!.x = a + move
                        j = 1
                    }
                    count = count + 6
                }


                //snakes
                if (count == 98) {
                    b = i2!!.y
                    i2!!.y = b + 48 * 2
                    count = 78
                }
                if (count == 94) {
                    a = i2!!.x
                    b = i2!!.y
                    i2!!.y = b + 48 * 2
                    i2!!.x = a - 48 * 3
                    count = 77
                }
                if (count == 81) {
                    b = i2!!.y
                    i2!!.y = b + 48 * 3
                    move = move * -1
                    count = 58
                }
                if (count == 70) {
                    a = i2!!.x
                    b = i2!!.y
                    i2!!.y = b + 48 * 4
                    i2!!.x = a - 48 * 3
                    count = 33
                }
                if (count == 51) {
                    a = i2!!.x
                    b = i2!!.y
                    i2!!.y = b + 48 * 2
                    i2!!.x = a - 48 * 6
                    count = 37
                }
                if (count == 46) {
                    a = i2!!.x
                    b = i2!!.y
                    i2!!.y = b + 48 * 1
                    i2!!.x = a + 48 * 2
                    count = 31
                    move = move * -1
                }
                if (count == 34) {
                    a = i2!!.x
                    b = i2!!.y
                    i2!!.y = b + 48 * 2
                    i2!!.x = a - 48 * 3
                    count = 17
                }
                if (count == 28) {
                    a = i2!!.x
                    b = i2!!.y
                    i2!!.y = b + 48 * 1
                    i2!!.x = a - 48 * 3
                    move = move * -1
                    count = 14
                }
                if (count == 22) {
                    a = i2!!.x
                    b = i2!!.y
                    i2!!.y = b + 48 * 2
                    i2!!.x = a + 48 * 3
                    count = 5
                }
                if (count == 20) {
                    a = i2!!.x
                    b = i2!!.y
                    i2!!.y = b + 48 * 1
                    i2!!.x = a + 48 * 5
                    move = move * -1
                    count = 14
                }


                //ladders
                if (count == 1) {
                    a = i2!!.x
                    b = i2!!.y
                    i2!!.y = b - 48 * 1
                    i2!!.x = a + 48
                    move = move * -1
                    count = 17
                }
                if (count == 10) {
                    a = i2!!.x
                    b = i2!!.y
                    i2!!.y = b - 48 * 2
                    count = 30
                }
                if (count == 11) {
                    a = i2!!.x
                    b = i2!!.y
                    i2!!.y = b - 48
                    i2!!.x = a - 48
                    move = move * -1
                    count = 27
                }
                if (count == 21) {
                    a = i2!!.x
                    b = i2!!.y
                    i2!!.y = b - 48 * 1
                    i2!!.x = a - 48 * 1
                    move = move * -1
                    count = 39
                }
                if (count == 40) {
                    a = i2!!.x
                    b = i2!!.y
                    i2!!.y = b - 48 * 1
                    i2!!.x = a + 48 * 1
                    move = move * -1
                    count = 58
                }
                if (count == 45) {
                    a = i2!!.x
                    b = i2!!.y
                    var b1_roll: Button
                    var iv_dice: ImageView
                    var r: Random
                    var move = 48f
                    val move1 = 48f
                    var a: Float
                    var a1: Float
                    var b: Float
                    var b1: Float
                    var j: Int
                    var k: Int
                    val count: Int
                    var count1: Int
                    var rollednumber: Int
                    var i1: ImageView
                    var i2: ImageView
                    //                        public void AI() {
//
//                            rollednumber = r.nextInt(6) + 1;
//
//                            if (count1 <= 99 && ((count1 + rollednumber) <= 99)) {
//
//                                if (rollednumber == 1) {
//                                    iv_dice.setImageResource(R.drawable.a);
//                                    for (int x = 1; x < 2; x++) {
//                                        if (i1.getX() >= 432 && k == 1) {
//                                            b1 = i1.getY();
//                                            i1.setY(b1 - 48);
//                                            move1 = move1 * -1;
//                                            k = 0;
//                                            continue;
//                                        }
//                                        if (i1.getX() <= 15 && k == 1) {
//                                            b1 = i1.getY();
//                                            i1.setY(b1 - 48);
//                                            move1 = move1 * -1;
//                                            k = 0;
//                                            continue;
//                                        }
//                                        a1 = i1.getX();
//                                        i1.setX(a1 + (move1));
//                                        k = 1;
//                                    }
//                                    count1++;
//                                } else if (rollednumber == 2) {
//                                    iv_dice.setImageResource(R.drawable.b);
//                                    for (int x = 1; x < 3; x++) {
//                                        if (i1.getX() >= 432 && k == 1) {
//                                            b1 = i1.getY();
//                                            i1.setY(b1 - 48);
//                                            move1 = move1 * -1;
//                                            k = 0;
//                                            continue;
//                                        }
//                                        if (i1.getX() <= 15 && k == 1) {
//                                            b1 = i1.getY();
//                                            i1.setY(b1 - 48);
//                                            move1 = move1 * -1;
//                                            k = 0;
//                                            continue;
//                                        }
//                                        a1 = i1.getX();
//                                        i1.setX(a1 + (move1));
//                                        k = 1;
//                                    }
//                                    count1 += 2;
//
//                                } else if (rollednumber == 3) {
//                                    iv_dice.setImageResource(R.drawable.c);
//                                    for (int x = 1; x < 4; x++) {
//                                        if (i1.getX() >= 432 && k == 1) {
//                                            b1 = i1.getY();
//                                            i1.setY(b1 - 48);
//                                            move1 = move1 * -1;
//                                            k = 0;
//                                            continue;
//                                        }
//                                        if (i1.getX() <= 15 && k == 1) {
//                                            b1 = i1.getY();
//                                            i1.setY(b1 - 48);
//                                            move1 = move1 * -1;
//                                            k = 0;
//                                            continue;
//                                        }
//                                        a1 = i1.getX();
//                                        i1.setX(a1 + (move1));
//                                        k = 1;
//                                    }
//                                    count1 += 3;
//
//                                } else if (rollednumber == 4) {
//                                    iv_dice.setImageResource(R.drawable.d);
//                                    for (int x = 1; x < 5; x++) {
//                                        if (i1.getX() >= 432 && k == 1) {
//                                            b1 = i1.getY();
//                                            i1.setY(b1 - 48);
//                                            move1 = move1 * -1;
//                                            k = 0;
//                                            continue;
//                                        }
//                                        if (i1.getX() <= 15 && k == 1) {
//                                            b1 = i1.getY();
//                                            i1.setY(b1 - 48);
//                                            move1 = move1 * -1;
//                                            k = 0;
//                                            continue;
//                                        }
//                                        a1 = i1.getX();
//                                        i1.setX(a1 + (move1));
//                                        k = 1;
//                                    }
//                                    count1 += 4;
//
//
//                                } else if (rollednumber == 5) {
//                                    iv_dice.setImageResource(R.drawable.e);
//
//                                    for (int x = 1; x < 6; x++) {
//                                        if (i1.getX() >= 432 && k == 1) {
//                                            b1 = i1.getY();
//                                            i1.setY(b1 - 48);
//                                            move1 = move1 * -1;
//                                            k = 0;
//                                            continue;
//                                        }
//                                        if (i1.getX() <= 15 && k == 1) {
//                                            b1 = i1.getY();
//                                            i1.setY(b1 - 48);
//                                            move1 = move1 * -1;
//                                            k = 0;
//                                            continue;
//                                        }
//                                        a1 = i1.getX();
//                                        i1.setX(a1 + (move1));
//                                        k = 1;
//                                    }
//                                    count1 += 5;
//                                } else if (rollednumber == 6) {
//                                    iv_dice.setImageResource(R.drawable.f);
//
//                                    for (int x = 1; x < 7; x++) {
//                                        if (i1.getX() >= 432 && k == 1) {
//                                            b1 = i1.getY();
//                                            i1.setY(b1 - 48);
//                                            move1 = move1 * -1;
//                                            k = 0;
//                                            continue;
//
//                                        }
//                                        if (i1.getX() <= 15 && k == 1) {
//                                            b1 = i1.getY();
//                                            i1.setY(b1 - 48);
//                                            move1 = move1 * -1;
//                                            k = 0;
//                                            continue;
//                                        }
//                                        a1 = i1.getX();
//                                        i1.setX(a1 + (move1));
//                                        k = 1;
//                                    }
//                                    count1 += 6;
//
//                                }
//
//                                //snakes
//                                if (count1 == 98) {
//                                    b1 = i1.getY();
//                                    i1.setY(b1 + (48 * 2));
//                                    count1 = 78;
//                                }
//                                if (count1 == 94) {
//                                    a1 = i1.getX();
//                                    b1 = i1.getY();
//                                    i1.setY(b1 + (48 * 2));
//                                    i1.setX(a1 - (48 * 3));
//                                    count1 = 77;
//                                }
//                                if (count1 == 81) {
//                                    b1 = i1.getY();
//                                    i1.setY(b1 + (48 * 3));
//                                    move1 = move1 * -1;
//                                    count1 = 58;
//                                }
//                                if (count1 == 70) {
//                                    a1 = i1.getX();
//                                    b1 = i1.getY();
//                                    i1.setY(b1 + (48 * 4));
//                                    i1.setX(a1 - (48 * 3));
//                                    count1 = 33;
//                                }
//                                if (count1 == 51) {
//                                    a1 = i1.getX();
//                                    b1 = i1.getY();
//                                    i1.setY(b1 + (48 * 2));
//                                    i1.setX(a1 - (48 * 6));
//                                    count1 = 37;
//                                }
//                                if (count1 == 46) {
//                                    a1 = i1.getX();
//                                    b1 = i1.getY();
//                                    i1.setY(b1 + (48 * 1));
//                                    i1.setX(a1 + (48 * 2));
//                                    move1 = move1 * -1;
//                                    count1 = 31;
//                                }
//                                if (count1 == 34) {
//                                    a1 = i1.getX();
//                                    b1 = i1.getY();
//                                    i1.setY(b1 + (48 * 2));
//                                    i1.setX(a1 - (48 * 3));
//                                    count1 = 17;
//                                }
//                                if (count1 == 28) {
//                                    a1 = i1.getX();
//                                    b1 = i1.getY();
//                                    i1.setY(b1 + (48 * 1));
//                                    i1.setX(a1 - (48 * 3));
//                                    move1 = move1 * -1;
//                                    count1 = 14;
//                                }
//                                if (count1 == 22) {
//                                    a1 = i1.getX();
//                                    b1 = i1.getY();
//                                    i1.setY(b1 + (48 * 2));
//                                    i1.setX(a1 + (48 * 3));
//                                    count1 = 5;
//                                }
//                                if (count1 == 20) {
//                                    a1 = i1.getX();
//                                    b1 = i1.getY();
//                                    i1.setY(b1 + (48 * 1));
//                                    i1.setX(a1 + (48 * 5));
//                                    move1 = move1 * -1;
//                                    count1 = 14;
//                                }
//
//
//                                //ladders
//                                if (count1 == 1) {
//                                    a1 = i1.getX();
//                                    b1 = i1.getY();
//                                    i1.setY(b1 - (48 * 1));
//                                    i1.setX(a1 + (48));
//                                    move1 = move1 * -1;
//
//                                    count1 = 17;
//                                }
//                                if (count1 == 10) {
//                                    a1 = i1.getX();
//                                    b1 = i1.getY();
//                                    i1.setY(b1 - (48 * 2));
//
//                                    count1 = 30;
//                                }
//                                if (count1 == 11) {
//                                    a1 = i1.getX();
//                                    b1 = i1.getY();
//                                    i1.setY(b1 - (48));
//                                    i1.setX(a1 - (48));
//                                    move1 = move1 * -1;
//
//                                    count1 = 27;
//                                }
//                                if (count1 == 21) {
//                                    a1 = i1.getX();
//                                    b1 = i1.getY();
//                                    i1.setY(b1 - (48 * 1));
//                                    i1.setX(a1 - (48 * 1));
//                                    move1 = move1 * -1;
//
//                                    count1 = 39;
//                                }
//                                if (count1 == 40) {
//                                    a1 = i1.getX();
//                                    b1 = i1.getY();
//                                    i1.setY(b1 - (48 * 1));
//                                    i1.setX(a1 + (48 * 1));
//                                    move1 = move1 * -1;
//
//                                    count1 = 58;
//                                }
//                                if (count1 == 45) {
//                                    a1 = i1.getX();
//                                    b1 = i1.getY();
//                                    i1.setY(b1 - (48 * 1));
//                                    move1 = move1 * -1;
//
//                                    count1 = 54;
//                                }
//                                if (count1 == 35) {
//                                    a1 = i1.getX();
//                                    b1 = i1.getY();
//                                    i1.setY(b1 - (48 * 3));
//                                    i1.setX(a1 - (48 * 3));
//                                    move1 = move1 * -1;
//
//                                    count1 = 61;
//                                }
//                                if (count1 == 69) {
//                                    a1 = i1.getX();
//                                    b1 = i1.getY();
//                                    i1.setY(b1 - (48 * 3));
//                                    i1.setX(a1 - (48 * 3));
//                                    move1 = move1 * -1;
//
//                                    count1 = 93;
//                                }
//                                if (count1 == 76) {
//                                    a1 = i1.getX();
//                                    b1 = i1.getY();
//                                    i1.setY(b1 - (48 * 1));
//                                    move1 = move1 * -1;
//
//                                    count1 = 83;
//                                }
//                                if (count1 == 84) {
//                                    a1 = i1.getX();
//                                    b1 = i1.getY();
//                                    i1.setY(b1 - (48 * 1));
//                                    i1.setX(a1 - (48 * 1));
//                                    move1 = move1 * -1;
//
//                                    count1 = 96;
//                                }
//
//
//                            }
//                            if(count1==99){
//                                AlertDialog alertDialog = new  AlertDialog.Builder(Main2Activity.this).create();
//                                alertDialog.setTitle("Awww");
//                                alertDialog.setMessage("You have lost :(");
//                                alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "OK",
//                                    new DialogInterface.OnClickListener() {
//                                        public void onClick(DialogInterface dialog, int which) {
//                                            dialog.dismiss();
//                                        }
//                                    });
//                                alertDialog.show();
//                                count=100;
//                                count1=100;}
//                        }
//                        @Override
//                        protected void onCreate(Bundle savedInstanceState) {
//                            super.onCreate(savedInstanceState);
//                            setContentView(R.layout.activity_main2);
//                            i1 = (ImageView) findViewById(R.id.imageView5);
//                            i2 = (ImageView) findViewById(R.id.imageView6);
//                            b1_roll = (Button) findViewById(R.id.b1_roll);
//                            iv_dice = (ImageView) findViewById(R.id.iv_dice);
//                            r = new Random();
//
//
//
//                            b1_roll.setOnClickListener(new View.OnClickListener() {
//                                @Override
//                                public void onClick(View v) {
//
//                                    rollednumber = r.nextInt(6) + 1;
//
//                                    if (count <= 99 && ((count + rollednumber) <= 99)) {
//                                        if (rollednumber == 1) {
//                                            iv_dice.setImageResource(R.drawable.a);
//                                            for (int x = 1; x < 2; x++) {
//                                                if (i2.getX() >= 432 && j == 1) {
//                                                    b = i2.getY();
//                                                    i2.setY(b - 48);
//                                                    move = move * -1;
//                                                    j = 0;
//                                                    continue;
//                                                }
//                                                if (i2.getX() <= 15 && j == 1) {
//                                                    b = i2.getY();
//                                                    i2.setY(b - 48);
//                                                    move = move * -1;
//                                                    j = 0;
//                                                    continue;
//                                                }
//                                                a = i2.getX();
//                                                i2.setX(a + (move));
//                                                j = 1;
//                                            }
//                                            count++;
//
//                                        } else if (rollednumber == 2) {
//                                            iv_dice.setImageResource(R.drawable.b);
//                                            for (int x = 1; x < 3; x++) {
//                                                if (i2.getX() >= 432 && j == 1) {
//                                                    b = i2.getY();
//                                                    i2.setY(b - 48);
//                                                    move = move * -1;
//                                                    j = 0;
//                                                    continue;
//                                                }
//                                                if (i2.getX() <= 15 && j == 1) {
//                                                    b = i2.getY();
//                                                    i2.setY(b - 48);
//                                                    move = move * -1;
//                                                    j = 0;
//                                                    continue;
//                                                }
//                                                a = i2.getX();
//                                                i2.setX(a + (move));
//                                                j = 1;
//                                            }
//                                            count += 2;
//                                        } else if (rollednumber == 3) {
//                                            iv_dice.setImageResource(R.drawable.c);
//                                            for (int x = 1; x < 4; x++) {
//                                                if (i2.getX() >= 432 && j == 1) {
//                                                    b = i2.getY();
//                                                    i2.setY(b - 48);
//                                                    move = move * -1;
//                                                    j = 0;
//                                                    continue;
//                                                }
//                                                if (i2.getX() <= 15 && j == 1) {
//                                                    b = i2.getY();
//                                                    i2.setY(b - 48);
//                                                    move = move * -1;
//                                                    j = 0;
//                                                    continue;
//                                                }
//                                                a = i2.getX();
//                                                i2.setX(a + (move));
//                                                j = 1;
//                                            }
//                                            count += 3;
//
//                                        } else if (rollednumber == 4) {
//                                            iv_dice.setImageResource(R.drawable.d);
//                                            for (int x = 1; x < 5; x++) {
//                                                if (i2.getX() >= 432 && j == 1) {
//                                                    b = i2.getY();
//                                                    i2.setY(b - 48);
//                                                    move = move * -1;
//                                                    j = 0;
//                                                    continue;
//                                                }
//                                                if (i2.getX() <= 15 && j == 1) {
//                                                    b = i2.getY();
//                                                    i2.setY(b - 48);
//                                                    move = move * -1;
//                                                    j = 0;
//                                                    continue;
//                                                }
//                                                a = i2.getX();
//                                                i2.setX(a + (move));
//                                                j = 1;
//                                            }
//                                            count += 4;
//
//                                        } else if (rollednumber == 5) {
//                                            iv_dice.setImageResource(R.drawable.e);
//
//                                            for (int x = 1; x < 6; x++) {
//                                                if (i2.getX() >= 432 && j == 1) {
//                                                    b = i2.getY();
//                                                    i2.setY(b - 48);
//                                                    move = move * -1;
//                                                    j = 0;
//                                                    continue;
//                                                }
//                                                if (i2.getX() <= 15 && j == 1) {
//                                                    b = i2.getY();
//                                                    i2.setY(b - 48);
//                                                    move = move * -1;
//                                                    j = 0;
//                                                    continue;
//                                                }
//                                                a = i2.getX();
//                                                i2.setX(a + (move));
//                                                j = 1;
//                                            }
//                                            count += 5;
//
//                                        } else if (rollednumber == 6) {
//                                            iv_dice.setImageResource(R.drawable.f);
//
//                                            for (int x = 1; x < 7; x++) {
//                                                if (i2.getX() >= 432 && j == 1) {
//                                                    b = i2.getY();
//                                                    i2.setY(b - 48);
//                                                    move = move * -1;
//                                                    j = 0;
//                                                    continue;
//
//                                                }
//                                                if (i2.getX() <= 15 && j == 1) {
//                                                    b = i2.getY();
//                                                    i2.setY(b - 48);
//                                                    move = move * -1;
//                                                    j = 0;
//                                                    continue;
//                                                }
//                                                a = i2.getX();
//                                                i2.setX(a + (move));
//                                                j = 1;
//                                            }
//                                            count = count + 6;
//
//                                        }
//
//
//                                        //snakes
//                                        if (count == 98) {
//                                            b = i2.getY();
//                                            i2.setY(b + (48 * 2));
//                                            count = 78;
//
//                                        }
//                                        if (count == 94) {
//                                            a = i2.getX();
//                                            b = i2.getY();
//                                            i2.setY(b + (48 * 2));
//                                            i2.setX(a - (48 * 3));
//                                            count = 77;
//                                        }
//                                        if (count == 81) {
//                                            b = i2.getY();
//                                            i2.setY(b + (48 * 3));
//                                            move = move * -1;
//                                            count = 58;
//
//                                        }
//                                        if (count == 70) {
//                                            a = i2.getX();
//                                            b = i2.getY();
//                                            i2.setY(b + (48 * 4));
//                                            i2.setX(a - (48 * 3));
//                                            count = 33;
//
//                                        }
//                                        if (count == 51) {
//                                            a = i2.getX();
//                                            b = i2.getY();
//                                            i2.setY(b + (48 * 2));
//                                            i2.setX(a - (48 * 6));
//                                            count = 37;
//
//                                        }
//                                        if (count == 46) {
//                                            a = i2.getX();
//                                            b = i2.getY();
//                                            i2.setY(b + (48 * 1));
//                                            i2.setX(a + (48 * 2));
//                                            count = 31;
//                                            move = move * -1;
//
//                                        }
//                                        if (count == 34) {
//                                            a = i2.getX();
//                                            b = i2.getY();
//                                            i2.setY(b + (48 * 2));
//                                            i2.setX(a - (48 * 3));
//                                            count = 17;
//                                        }
//                                        if (count == 28) {
//                                            a = i2.getX();
//                                            b = i2.getY();
//                                            i2.setY(b + (48 * 1));
//                                            i2.setX(a - (48 * 3));
//                                            move = move * -1;
//                                            count = 14;
//                                        }
//                                        if (count == 22) {
//                                            a = i2.getX();
//                                            b = i2.getY();
//                                            i2.setY(b + (48 * 2));
//                                            i2.setX(a + (48 * 3));
//                                            count = 5;
//                                        }
//                                        if (count == 20) {
//                                            a = i2.getX();
//                                            b = i2.getY();
//                                            i2.setY(b + (48 * 1));
//                                            i2.setX(a + (48 * 5));
//                                            move = move * -1;
//                                            count = 14;
//                                        }
//
//
//                                        //ladders
//                                        if (count == 1) {
//                                            a = i2.getX();
//                                            b = i2.getY();
//                                            i2.setY(b - (48 * 1));
//                                            i2.setX(a + (48));
//                                            move = move * -1;
//                                            count = 17;
//                                        }
//                                        if (count == 10) {
//                                            a = i2.getX();
//                                            b = i2.getY();
//                                            i2.setY(b - (48 * 2));
//                                            count = 30;
//                                        }
//                                        if (count == 11) {
//                                            a = i2.getX();
//                                            b = i2.getY();
//                                            i2.setY(b - (48));
//                                            i2.setX(a - (48));
//                                            move = move * -1;
//                                            count = 27;
//                                        }
//                                        if (count == 21) {
//                                            a = i2.getX();
//                                            b = i2.getY();
//                                            i2.setY(b - (48 * 1));
//                                            i2.setX(a - (48 * 1));
//                                            move = move * -1;
//                                            count = 39;
//                                        }
//                                        if (count == 40) {
//                                            a = i2.getX();
//                                            b = i2.getY();
//                                            i2.setY(b - (48 * 1));
//                                            i2.setX(a + (48 * 1));
//                                            move = move * -1;
//                                            count = 58;
//                                        }
//                                        if (count == 45) {
//                                            a = i2.getX();
//                                            b = i2.getY();
//                                            i2.setY(b - (48 * 1));
//                                            move = move * -1;
//                                            count = 54;
//                                        }
//                                        if (count == 35) {
//                                            a = i2.getX();
//                                            b = i2.getY();
//                                            i2.setY(b - (48 * 3));
//                                            i2.setX(a - (48 * 3));
//                                            move = move * -1;
//                                            count = 61;
//                                        }
//                                        if (count == 69) {
//                                            a = i2.getX();
//                                            b = i2.getY();
//                                            i2.setY(b - (48 * 3));
//                                            i2.setX(a - (48 * 3));
//                                            move = move * -1;
//                                            count = 93;
//                                        }
//                                        if (count == 76) {
//                                            a = i2.getX();
//                                            b = i2.getY();
//                                            i2.setY(b - (48 * 1));
//                                            move = move * -1;
//                                            count = 83;
//                                        }
//                                        if (count == 84) {
//                                            a = i2.getX();
//                                            b = i2.getY();
//                                            i2.setY(b - (48 * 1));
//                                            i2.setX(a - (48 * 1));
//                                            move = move * -1;
//                                            count = 96;
//                                        }
//
//
//
//                                    }
//                                    b1_roll.setEnabled(false);
//                                    b1_roll.postDelayed(new Runnable() {
//                                        @Override
//                                        public void run() {
//                                            AI();
//                                            b1_roll.setEnabled(true);
//                                            if(count==99){
//                                                AlertDialog alertDialog = new  AlertDialog.Builder(Main2Activity.this).create();
//                                                alertDialog.setTitle("Yay");
//                                                alertDialog.setMessage("You have won!!!");
//                                                alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "OK",
//                                                    new DialogInterface.OnClickListener() {
//                                                        public void onClick(DialogInterface dialog, int which) {
//                                                            dialog.dismiss();
//                                                        }
//                                                    });
//                                                alertDialog.show();
//                                                count=100;
//                                                count1=100;}
//                                        }
//                                    }, 1000);
//
//
//
//                                }
//
//                            });
//
//
//                        }
//                        i2.setY(b - (48 * 1));
                    move = move * -1
                    count = 54
                }
                if (count == 35) {
                    a = i2!!.x
                    b = i2!!.y
                    i2!!.y = b - 48 * 3
                    i2!!.x = a - 48 * 3
                    move = move * -1
                    count = 61
                }
                if (count == 69) {
                    a = i2!!.x
                    b = i2!!.y
                    i2!!.y = b - 48 * 3
                    i2!!.x = a - 48 * 3
                    move = move * -1
                    count = 93
                }
                if (count == 76) {
                    a = i2!!.x
                    b = i2!!.y
                    i2!!.y = b - 48 * 1
                    move = move * -1
                    count = 83
                }
                if (count == 84) {
                    a = i2!!.x
                    b = i2!!.y
                    i2!!.y = b - 48 * 1
                    i2!!.x = a - 48 * 1
                    move = move * -1
                    count = 96
                }
            }
            b1_roll!!.isEnabled = false
            b1_roll!!.postDelayed({
                AI()
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
                }
            }, 1000)
        }
    }
}