package com.example.chessprojectfinal

import android.graphics.Color
import android.widget.Toast

class CheckersEngine(var activity: SnakeActivity?) {
    // TODO: Establish socket / db connection
    var firstclick = true
    var init_Block: ChessBlock? = null
    var tar_Block: ChessBlock? = null
    var turn = "white"
    var redpieces = 12
    var whitepieces = 12
    fun islegal(init_block: ChessBlock?, tar_block: ChessBlock?): Boolean {
        if(init_block == null || tar_block == null){
            return false
        }
        println(tar_block!!.pos - init_block!!.pos)
        // NON QUEEN MOVEMENT!
        if(init_block.checkerspiece?.queen == "peasant") {
            if (((tar_block.pos - init_block.pos == 9 || tar_block.pos - init_block.pos == 7) && init_Block!!.checkerspiece?.team == "white") && tar_block.checkerspiece == null) {
                return true
            }
            if (((tar_block.pos - init_block.pos == -9 || tar_block.pos - init_block.pos == -7) && init_Block!!.checkerspiece?.team == "red") && tar_block.checkerspiece == null) {
                return true
            }
            // WHITE ATTACK
            if (((tar_block.pos - init_block.pos == 18) && init_Block!!.checkerspiece?.team == "white") && tar_block.checkerspiece == null) {
                when (init_block) {
                    activity!!.a1 -> if (activity!!.b2!!.checkerspiece != null && activity!!.b2!!.checkerspiece!!.team != init_block.checkerspiece!!.team) {
                        activity!!.b2!!.checkerspiece = null
                        activity!!.b2!!.button.setImageResource(android.R.color.transparent)
                        redpieces = redpieces - 1
                        return true
                    }
                    activity!!.c1 -> if (activity!!.d2!!.checkerspiece != null && activity!!.d2!!.checkerspiece!!.team != init_block.checkerspiece!!.team) {
                        activity!!.d2!!.checkerspiece = null
                        activity!!.d2!!.button.setImageResource(android.R.color.transparent)
                        redpieces = redpieces - 1
                        return true
                    }
                    activity!!.e1 -> if (activity!!.f2!!.checkerspiece != null && activity!!.f2!!.checkerspiece!!.team != init_block.checkerspiece!!.team) {
                        activity!!.e2!!.checkerspiece = null
                        activity!!.e2!!.button.setImageResource(android.R.color.transparent)
                        redpieces = redpieces - 1
                        return true
                    }
                    activity!!.a3 -> if (activity!!.b4!!.checkerspiece != null && activity!!.b4!!.checkerspiece!!.team != init_block.checkerspiece!!.team) {
                        activity!!.b4!!.checkerspiece = null
                        activity!!.b4!!.button.setImageResource(android.R.color.transparent)
                        redpieces = redpieces - 1
                        return true
                    }
                    activity!!.c3 -> if (activity!!.d4!!.checkerspiece != null && activity!!.d4!!.checkerspiece!!.team != init_block.checkerspiece!!.team) {
                        activity!!.d4!!.checkerspiece = null
                        activity!!.d4!!.button.setImageResource(android.R.color.transparent)
                        redpieces = redpieces - 1
                        return true
                    }
                    activity!!.e3 -> if (activity!!.f4!!.checkerspiece != null && activity!!.f4!!.checkerspiece!!.team != init_block.checkerspiece!!.team) {
                        activity!!.f4!!.checkerspiece = null
                        activity!!.f4!!.button.setImageResource(android.R.color.transparent)
                        redpieces = redpieces - 1
                        return true
                    }
                    activity!!.g3 -> if (activity!!.h4!!.checkerspiece != null && activity!!.h4!!.checkerspiece!!.team != init_block.checkerspiece!!.team) {
                        activity!!.h4!!.checkerspiece = null
                        activity!!.h4!!.button.setImageResource(android.R.color.transparent)
                        redpieces = redpieces - 1
                        return true
                    }
                    activity!!.a5 -> if (activity!!.b6!!.checkerspiece != null && activity!!.b6!!.checkerspiece!!.team != init_block.checkerspiece!!.team) {
                        activity!!.b6!!.checkerspiece = null
                        activity!!.b6!!.button.setImageResource(android.R.color.transparent)
                        redpieces = redpieces - 1
                        return true
                    }
                    activity!!.c5 -> if (activity!!.d6!!.checkerspiece != null && activity!!.d6!!.checkerspiece!!.team != init_block.checkerspiece!!.team) {
                        activity!!.d6!!.checkerspiece = null
                        activity!!.d6!!.button.setImageResource(android.R.color.transparent)
                        redpieces = redpieces - 1
                        return true
                    }
                    activity!!.e5 -> if (activity!!.f6!!.checkerspiece != null && activity!!.f6!!.checkerspiece!!.team != init_block.checkerspiece!!.team) {
                        activity!!.f6!!.checkerspiece = null
                        activity!!.f6!!.button.setImageResource(android.R.color.transparent)
                        redpieces = redpieces - 1
                        return true
                    }
                    activity!!.a7 -> if (activity!!.b8!!.checkerspiece != null && activity!!.b8!!.checkerspiece!!.team != init_block.checkerspiece!!.team) {
                        activity!!.b8!!.checkerspiece = null
                        activity!!.b8!!.button.setImageResource(android.R.color.transparent)
                        redpieces = redpieces - 1
                        return true
                    }
                    activity!!.c7 -> if (activity!!.d8!!.checkerspiece != null && activity!!.d8!!.checkerspiece!!.team != init_block.checkerspiece!!.team) {
                        activity!!.d8!!.checkerspiece = null
                        activity!!.d8!!.button.setImageResource(android.R.color.transparent)
                        redpieces = redpieces - 1
                        return true
                    }
                    activity!!.e7 -> if (activity!!.f8!!.checkerspiece != null && activity!!.f8!!.checkerspiece!!.team != init_block.checkerspiece!!.team) {
                        activity!!.f8!!.checkerspiece = null
                        activity!!.f8!!.button.setImageResource(android.R.color.transparent)
                        redpieces = redpieces - 1
                        return true
                    }

                    // Secondary black
                    activity!!.b2 -> if (activity!!.c3!!.checkerspiece != null && activity!!.c3!!.checkerspiece!!.team != init_block.checkerspiece!!.team) {
                        activity!!.c3!!.checkerspiece = null
                        activity!!.c3!!.button.setImageResource(android.R.color.transparent)
                        redpieces = redpieces - 1
                        return true
                    }
                    activity!!.b4 -> if (activity!!.c5!!.checkerspiece != null && activity!!.c5!!.checkerspiece!!.team != init_block.checkerspiece!!.team) {
                        activity!!.c5!!.checkerspiece = null
                        activity!!.c5!!.button.setImageResource(android.R.color.transparent)
                        redpieces = redpieces - 1
                        return true
                    }
                    activity!!.b6 -> if (activity!!.c7!!.checkerspiece != null && activity!!.c7!!.checkerspiece!!.team != init_block.checkerspiece!!.team) {
                        activity!!.c7!!.checkerspiece = null
                        activity!!.c7!!.button.setImageResource(android.R.color.transparent)
                        redpieces = redpieces - 1
                        return true
                    }

                    activity!!.d2 -> if (activity!!.e3!!.checkerspiece != null && activity!!.e3!!.checkerspiece!!.team != init_block.checkerspiece!!.team) {
                        activity!!.e3!!.checkerspiece = null
                        activity!!.e3!!.button.setImageResource(android.R.color.transparent)
                        redpieces = redpieces - 1
                        return true
                    }
                    activity!!.d4 -> if (activity!!.e5!!.checkerspiece != null && activity!!.e5!!.checkerspiece!!.team != init_block.checkerspiece!!.team) {
                        activity!!.e5!!.checkerspiece = null
                        activity!!.e5!!.button.setImageResource(android.R.color.transparent)
                        redpieces = redpieces - 1
                        return true
                    }
                    activity!!.d6 -> if (activity!!.e7!!.checkerspiece != null && activity!!.e7!!.checkerspiece!!.team != init_block.checkerspiece!!.team) {
                        activity!!.e7!!.checkerspiece = null
                        activity!!.e7!!.button.setImageResource(android.R.color.transparent)
                        redpieces = redpieces - 1
                        return true
                    }

                    activity!!.f2 -> if (activity!!.g3!!.checkerspiece != null && activity!!.g3!!.checkerspiece!!.team != init_block.checkerspiece!!.team) {
                        activity!!.g3!!.checkerspiece = null
                        activity!!.g3!!.button.setImageResource(android.R.color.transparent)
                        redpieces = redpieces - 1
                        return true
                    }
                    activity!!.f4 -> if (activity!!.g5!!.checkerspiece != null && activity!!.g5!!.checkerspiece!!.team != init_block.checkerspiece!!.team) {
                        activity!!.g5!!.checkerspiece = null
                        activity!!.g5!!.button.setImageResource(android.R.color.transparent)
                        redpieces = redpieces - 1
                        return true
                    }
                    activity!!.f6 -> if (activity!!.g7!!.checkerspiece != null && activity!!.g7!!.checkerspiece!!.team != init_block.checkerspiece!!.team) {
                        activity!!.g7!!.checkerspiece = null
                        activity!!.g7!!.button.setImageResource(android.R.color.transparent)
                        redpieces = redpieces - 1
                        return true
                    }
                }
            } // ->
            if (((tar_block.pos - init_block.pos == 14) && init_Block!!.checkerspiece?.team == "white") && tar_block.checkerspiece == null) {
                when (init_block) {
                    // Initial black
                    activity!!.c1 -> if (activity!!.b2!!.checkerspiece != null && activity!!.b2!!.checkerspiece!!.team != init_block.checkerspiece!!.team) {
                        activity!!.b2!!.checkerspiece = null
                        activity!!.b2!!.button.setImageResource(android.R.color.transparent)
                        redpieces = redpieces - 1
                        return true
                    }
                    activity!!.e1 -> if (activity!!.d2!!.checkerspiece != null && activity!!.d2!!.checkerspiece!!.team != init_block.checkerspiece!!.team) {
                        activity!!.d2!!.checkerspiece = null
                        activity!!.d2!!.button.setImageResource(android.R.color.transparent)
                        redpieces = redpieces - 1
                        return true
                    }
                    activity!!.g1 -> if (activity!!.f2!!.checkerspiece != null && activity!!.f2!!.checkerspiece!!.team != init_block.checkerspiece!!.team) {
                        activity!!.f2!!.checkerspiece = null
                        activity!!.f2!!.button.setImageResource(android.R.color.transparent)
                        redpieces = redpieces - 1
                        return true
                    }
                    activity!!.c3 -> if (activity!!.b4!!.checkerspiece != null && activity!!.b4!!.checkerspiece!!.team != init_block.checkerspiece!!.team) {
                        activity!!.b4!!.checkerspiece = null
                        activity!!.b4!!.button.setImageResource(android.R.color.transparent)
                        redpieces = redpieces - 1
                        return true
                    }
                    activity!!.e3 -> if (activity!!.d4!!.checkerspiece != null && activity!!.d4!!.checkerspiece!!.team != init_block.checkerspiece!!.team) {
                        activity!!.d4!!.checkerspiece = null
                        activity!!.d4!!.button.setImageResource(android.R.color.transparent)
                        redpieces = redpieces - 1
                        return true
                    }
                    activity!!.g3 -> if (activity!!.f4!!.checkerspiece != null && activity!!.f4!!.checkerspiece!!.team != init_block.checkerspiece!!.team) {
                        activity!!.f4!!.checkerspiece = null
                        activity!!.f4!!.button.setImageResource(android.R.color.transparent)
                        redpieces = redpieces - 1
                        return true
                    }
                    activity!!.c5 -> if (activity!!.b6!!.checkerspiece != null && activity!!.b6!!.checkerspiece!!.team != init_block.checkerspiece!!.team) {
                        activity!!.b6!!.checkerspiece = null
                        activity!!.b6!!.button.setImageResource(android.R.color.transparent)
                        redpieces = redpieces - 1
                        return true
                    }
                    activity!!.e5 -> if (activity!!.d6!!.checkerspiece != null && activity!!.d6!!.checkerspiece!!.team != init_block.checkerspiece!!.team) {
                        activity!!.d6!!.checkerspiece = null
                        activity!!.d6!!.button.setImageResource(android.R.color.transparent)
                        redpieces = redpieces - 1
                        return true
                    }
                    activity!!.g5 -> if (activity!!.f6!!.checkerspiece != null && activity!!.f6!!.checkerspiece!!.team != init_block.checkerspiece!!.team) {
                        activity!!.f6!!.checkerspiece = null
                        activity!!.f6!!.button.setImageResource(android.R.color.transparent)
                        redpieces = redpieces - 1
                        return true
                    }

                    // Secondary black

                    activity!!.d2 -> if (activity!!.c3!!.checkerspiece != null && activity!!.c3!!.checkerspiece!!.team != init_block.checkerspiece!!.team) {
                        activity!!.c3!!.checkerspiece = null
                        activity!!.c3!!.button.setImageResource(android.R.color.transparent)
                        redpieces = redpieces - 1
                        return true
                    }
                    activity!!.d4 -> if (activity!!.c6!!.checkerspiece != null && activity!!.c6!!.checkerspiece!!.team != init_block.checkerspiece!!.team) {
                        activity!!.c6!!.checkerspiece = null
                        activity!!.c6!!.button.setImageResource(android.R.color.transparent)
                        redpieces = redpieces - 1
                        return true
                    }
                    activity!!.d6 -> if (activity!!.c7!!.checkerspiece != null && activity!!.c7!!.checkerspiece!!.team != init_block.checkerspiece!!.team) {
                        activity!!.c7!!.checkerspiece = null
                        activity!!.c7!!.button.setImageResource(android.R.color.transparent)
                        redpieces = redpieces - 1
                        return true
                    }

                    activity!!.f2 -> if (activity!!.e3!!.checkerspiece != null && activity!!.e3!!.checkerspiece!!.team != init_block.checkerspiece!!.team) {
                        activity!!.e3!!.checkerspiece = null
                        activity!!.e3!!.button.setImageResource(android.R.color.transparent)
                        redpieces = redpieces - 1
                        return true
                    }
                    activity!!.f4 -> if (activity!!.e5!!.checkerspiece != null && activity!!.e5!!.checkerspiece!!.team != init_block.checkerspiece!!.team) {
                        activity!!.e5!!.checkerspiece = null
                        activity!!.e5!!.button.setImageResource(android.R.color.transparent)
                        redpieces = redpieces - 1
                        return true
                    }
                    activity!!.f6 -> if (activity!!.e7!!.checkerspiece != null && activity!!.e7!!.checkerspiece!!.team != init_block.checkerspiece!!.team) {
                        activity!!.e7!!.checkerspiece = null
                        activity!!.e7!!.button.setImageResource(android.R.color.transparent)
                        redpieces = redpieces - 1
                        return true
                    }
                    activity!!.h2 -> if (activity!!.g3!!.checkerspiece != null && activity!!.g3!!.checkerspiece!!.team != init_block.checkerspiece!!.team) {
                        activity!!.g3!!.checkerspiece = null
                        activity!!.g3!!.button.setImageResource(android.R.color.transparent)
                        redpieces = redpieces - 1
                        return true
                    }
                    activity!!.h4 -> if (activity!!.g5!!.checkerspiece != null && activity!!.g5!!.checkerspiece!!.team != init_block.checkerspiece!!.team) {
                        activity!!.g5!!.checkerspiece = null
                        activity!!.g5!!.button.setImageResource(android.R.color.transparent)
                        redpieces = redpieces - 1
                        return true
                    }
                    activity!!.h6 -> if (activity!!.g7!!.checkerspiece != null && activity!!.g7!!.checkerspiece!!.team != init_block.checkerspiece!!.team) {
                        activity!!.g7!!.checkerspiece = null
                        activity!!.g7!!.button.setImageResource(android.R.color.transparent)
                        redpieces = redpieces - 1
                        return true
                    }
                }
            } // <-

            // RED ATTACK
            if (((tar_block.pos - init_block.pos == -18) && init_Block!!.checkerspiece?.team == "red") && tar_block.checkerspiece == null) {
                when (init_block) {
                    activity!!.d8 -> if (activity!!.c7!!.checkerspiece != null && activity!!.c7!!.checkerspiece!!.team != init_block.checkerspiece!!.team) {
                        activity!!.c7!!.checkerspiece = null
                        activity!!.c7!!.button.setImageResource(android.R.color.transparent)
                        whitepieces = whitepieces - 1
                        return true
                    }
                    activity!!.d6 -> if (activity!!.c5!!.checkerspiece != null && activity!!.c5!!.checkerspiece!!.team != init_block.checkerspiece!!.team) {
                        activity!!.c5!!.checkerspiece = null
                        activity!!.c5!!.button.setImageResource(android.R.color.transparent)
                        whitepieces = whitepieces - 1
                        return true
                    }
                    activity!!.d4 -> if (activity!!.c3!!.checkerspiece != null && activity!!.c3!!.checkerspiece!!.team != init_block.checkerspiece!!.team) {
                        activity!!.c3!!.checkerspiece = null
                        activity!!.c3!!.button.setImageResource(android.R.color.transparent)
                        whitepieces = whitepieces - 1
                        return true
                    }
                    activity!!.f8 -> if (activity!!.e7!!.checkerspiece != null && activity!!.e7!!.checkerspiece!!.team != init_block.checkerspiece!!.team) {
                        activity!!.e7!!.checkerspiece = null
                        activity!!.e7!!.button.setImageResource(android.R.color.transparent)
                        whitepieces = whitepieces - 1
                        return true
                    }
                    activity!!.f6 -> if (activity!!.e5!!.checkerspiece != null && activity!!.e5!!.checkerspiece!!.team != init_block.checkerspiece!!.team) {
                        activity!!.e5!!.checkerspiece = null
                        activity!!.e5!!.button.setImageResource(android.R.color.transparent)
                        whitepieces = whitepieces - 1
                        return true
                    }
                    activity!!.f4 -> if (activity!!.e3!!.checkerspiece != null && activity!!.e4!!.checkerspiece!!.team != init_block.checkerspiece!!.team) {
                        activity!!.e4!!.checkerspiece = null
                        activity!!.e4!!.button.setImageResource(android.R.color.transparent)
                        whitepieces = whitepieces - 1
                        return true
                    }
                    activity!!.h8 -> if (activity!!.g7!!.checkerspiece != null && activity!!.g7!!.checkerspiece!!.team != init_block.checkerspiece!!.team) {
                        activity!!.g7!!.checkerspiece = null
                        activity!!.g7!!.button.setImageResource(android.R.color.transparent)
                        whitepieces = whitepieces - 1
                        return true
                    }
                    activity!!.h6 -> if (activity!!.g5!!.checkerspiece != null && activity!!.g5!!.checkerspiece!!.team != init_block.checkerspiece!!.team) {
                        activity!!.g5!!.checkerspiece = null
                        activity!!.g5!!.button.setImageResource(android.R.color.transparent)
                        whitepieces = whitepieces - 1
                        return true
                    }
                    activity!!.h4 -> if (activity!!.g3!!.checkerspiece != null && activity!!.g3!!.checkerspiece!!.team != init_block.checkerspiece!!.team) {
                        activity!!.g3!!.checkerspiece = null
                        activity!!.g3!!.button.setImageResource(android.R.color.transparent)
                        whitepieces = whitepieces - 1
                        return true
                    }
                    // Secondary black
                    activity!!.g7 -> if (activity!!.f6!!.checkerspiece != null && activity!!.f6!!.checkerspiece!!.team != init_block.checkerspiece!!.team) {
                        activity!!.f6!!.checkerspiece = null
                        activity!!.f6!!.button.setImageResource(android.R.color.transparent)
                        whitepieces = whitepieces - 1
                        return true
                    }
                    activity!!.g5 -> if (activity!!.f4!!.checkerspiece != null && activity!!.f4!!.checkerspiece!!.team != init_block.checkerspiece!!.team) {
                        activity!!.f4!!.checkerspiece = null
                        activity!!.f4!!.button.setImageResource(android.R.color.transparent)
                        whitepieces = whitepieces - 1
                        return true
                    }
                    activity!!.g3 -> if (activity!!.f2!!.checkerspiece != null && activity!!.f2!!.checkerspiece!!.team != init_block.checkerspiece!!.team) {
                        activity!!.f2!!.checkerspiece = null
                        activity!!.f2!!.button.setImageResource(android.R.color.transparent)
                        whitepieces = whitepieces - 1
                        return true
                    }

                    activity!!.e7 -> if (activity!!.d6!!.checkerspiece != null && activity!!.d6!!.checkerspiece!!.team != init_block.checkerspiece!!.team) {
                        activity!!.d6!!.checkerspiece = null
                        activity!!.d6!!.button.setImageResource(android.R.color.transparent)
                        whitepieces = whitepieces - 1
                        return true
                    }
                    activity!!.e5 -> if (activity!!.d4!!.checkerspiece != null && activity!!.d4!!.checkerspiece!!.team != init_block.checkerspiece!!.team) {
                        activity!!.d4!!.checkerspiece = null
                        activity!!.d4!!.button.setImageResource(android.R.color.transparent)
                        whitepieces = whitepieces - 1
                        return true
                    }
                    activity!!.e3 -> if (activity!!.d2!!.checkerspiece != null && activity!!.d2!!.checkerspiece!!.team != init_block.checkerspiece!!.team) {
                        activity!!.d2!!.checkerspiece = null
                        activity!!.d2!!.button.setImageResource(android.R.color.transparent)
                        whitepieces = whitepieces - 1
                        return true
                    }

                    activity!!.c7 -> if (activity!!.b6!!.checkerspiece != null && activity!!.b6!!.checkerspiece!!.team != init_block.checkerspiece!!.team) {
                        activity!!.b6!!.checkerspiece = null
                        activity!!.b6!!.button.setImageResource(android.R.color.transparent)
                        whitepieces = whitepieces - 1
                        return true
                    }
                    activity!!.c5 -> if (activity!!.b4!!.checkerspiece != null && activity!!.b4!!.checkerspiece!!.team != init_block.checkerspiece!!.team) {
                        activity!!.b4!!.checkerspiece = null
                        activity!!.b4!!.button.setImageResource(android.R.color.transparent)
                        whitepieces = whitepieces - 1
                        return true
                    }
                    activity!!.c3 -> if (activity!!.b2!!.checkerspiece != null && activity!!.b2!!.checkerspiece!!.team != init_block.checkerspiece!!.team) {
                        activity!!.b2!!.checkerspiece = null
                        activity!!.b2!!.button.setImageResource(android.R.color.transparent)
                        whitepieces = whitepieces - 1
                        return true
                    }
                }
            } // <-
            if (((tar_block.pos - init_block.pos == -14) && init_Block!!.checkerspiece?.team == "red") && tar_block.checkerspiece == null) {
                when (init_block) {
                    activity!!.d8 -> if (activity!!.e7!!.checkerspiece != null && activity!!.e7!!.checkerspiece!!.team != init_block.checkerspiece!!.team) {
                        activity!!.e7!!.checkerspiece = null
                        activity!!.e7!!.button.setImageResource(android.R.color.transparent)
                        whitepieces = whitepieces - 1
                        return true
                    }
                    activity!!.d6 -> if (activity!!.e5!!.checkerspiece != null && activity!!.e5!!.checkerspiece!!.team != init_block.checkerspiece!!.team) {
                        activity!!.e5!!.checkerspiece = null
                        activity!!.e5!!.button.setImageResource(android.R.color.transparent)
                        whitepieces = whitepieces - 1
                        return true
                    }
                    activity!!.d4 -> if (activity!!.e3!!.checkerspiece != null && activity!!.e3!!.checkerspiece!!.team != init_block.checkerspiece!!.team) {
                        activity!!.e3!!.checkerspiece = null
                        activity!!.e3!!.button.setImageResource(android.R.color.transparent)
                        whitepieces = whitepieces - 1
                        return true
                    }
                    activity!!.f8 -> if (activity!!.g7!!.checkerspiece != null && activity!!.g7!!.checkerspiece!!.team != init_block.checkerspiece!!.team) {
                        activity!!.g7!!.checkerspiece = null
                        activity!!.g7!!.button.setImageResource(android.R.color.transparent)
                        whitepieces = whitepieces - 1
                        return true
                    }
                    activity!!.f6 -> if (activity!!.g5!!.checkerspiece != null && activity!!.g5!!.checkerspiece!!.team != init_block.checkerspiece!!.team) {
                        activity!!.g5!!.checkerspiece = null
                        activity!!.g5!!.button.setImageResource(android.R.color.transparent)
                        whitepieces = whitepieces - 1
                        return true
                    }
                    activity!!.f4 -> if (activity!!.g3!!.checkerspiece != null && activity!!.g4!!.checkerspiece!!.team != init_block.checkerspiece!!.team) {
                        activity!!.g4!!.checkerspiece = null
                        activity!!.g4!!.button.setImageResource(android.R.color.transparent)
                        whitepieces = whitepieces - 1
                        return true
                    }
                    activity!!.b8 -> if (activity!!.c7!!.checkerspiece != null && activity!!.c7!!.checkerspiece!!.team != init_block.checkerspiece!!.team) {
                        activity!!.c7!!.checkerspiece = null
                        activity!!.c7!!.button.setImageResource(android.R.color.transparent)
                        whitepieces = whitepieces - 1
                        return true
                    }
                    activity!!.b6 -> if (activity!!.c5!!.checkerspiece != null) {
                        activity!!.c5!!.checkerspiece = null
                        activity!!.c5!!.button.setImageResource(android.R.color.transparent)
                        whitepieces = whitepieces - 1
                        return true
                    }
                    activity!!.b4 -> if (activity!!.c3!!.checkerspiece != null && activity!!.c3!!.checkerspiece!!.team != init_block.checkerspiece!!.team) {
                        activity!!.c3!!.checkerspiece = null
                        activity!!.c3!!.button.setImageResource(android.R.color.transparent)
                        whitepieces = whitepieces - 1
                        return true
                    }
                    // Secondary black

                    activity!!.e7 -> if (activity!!.f6!!.checkerspiece != null && activity!!.f6!!.checkerspiece!!.team != init_block.checkerspiece!!.team) {
                        activity!!.f6!!.checkerspiece = null
                        activity!!.f6!!.button.setImageResource(android.R.color.transparent)
                        whitepieces = whitepieces - 1
                        return true
                    }
                    activity!!.e5 -> if (activity!!.f4!!.checkerspiece != null && activity!!.f4!!.checkerspiece!!.team != init_block.checkerspiece!!.team) {
                        activity!!.f4!!.checkerspiece = null
                        activity!!.f4!!.button.setImageResource(android.R.color.transparent)
                        whitepieces = whitepieces - 1
                        return true
                    }
                    activity!!.e3 -> if (activity!!.f2!!.checkerspiece != null && activity!!.f2!!.checkerspiece!!.team != init_block.checkerspiece!!.team) {
                        activity!!.f2!!.checkerspiece = null
                        activity!!.f2!!.button.setImageResource(android.R.color.transparent)
                        whitepieces = whitepieces - 1
                        return true
                    }

                    activity!!.c7 -> if (activity!!.d6!!.checkerspiece != null && activity!!.d6!!.checkerspiece!!.team != init_block.checkerspiece!!.team) {
                        activity!!.d6!!.checkerspiece = null
                        activity!!.d6!!.button.setImageResource(android.R.color.transparent)
                        whitepieces = whitepieces - 1
                        return true
                    }
                    activity!!.c5 -> if (activity!!.d4!!.checkerspiece != null && activity!!.d4!!.checkerspiece!!.team != init_block.checkerspiece!!.team) {
                        activity!!.d4!!.checkerspiece = null
                        activity!!.d4!!.button.setImageResource(android.R.color.transparent)
                        whitepieces = whitepieces - 1
                        return true
                    }
                    activity!!.c3 -> if (activity!!.d2!!.checkerspiece != null && activity!!.d2!!.checkerspiece!!.team != init_block.checkerspiece!!.team) {
                        activity!!.d2!!.checkerspiece = null
                        activity!!.d2!!.button.setImageResource(android.R.color.transparent)
                        whitepieces = whitepieces - 1
                        return true
                    }
                }
                return false
            } // ->
            return false
        }
        // QUEEN MOVEMENTS
        else{
            if (((tar_block.pos - init_block.pos == 9 || tar_block.pos - init_block.pos == 7)) && tar_block.checkerspiece == null) {
                return true
            }
            if (((tar_block.pos - init_block.pos == -9 || tar_block.pos - init_block.pos == -7)) && tar_block.checkerspiece == null) {
                return true
            }

            if (((tar_block.pos - init_block.pos == 18)) && tar_block.checkerspiece == null) {
                when (init_block) {
                    activity!!.a1 -> if (activity!!.b2!!.checkerspiece != null && activity!!.b2!!.checkerspiece!!.team != init_block.checkerspiece!!.team) {
                        activity!!.b2!!.checkerspiece = null
                        activity!!.b2!!.button.setImageResource(android.R.color.transparent)
                        redpieces = redpieces - 1
                        return true
                    }
                    activity!!.c1 -> if (activity!!.d2!!.checkerspiece != null && activity!!.d2!!.checkerspiece!!.team != init_block.checkerspiece!!.team) {
                        activity!!.d2!!.checkerspiece = null
                        activity!!.d2!!.button.setImageResource(android.R.color.transparent)
                        redpieces = redpieces - 1
                        return true
                    }
                    activity!!.e1 -> if (activity!!.f2!!.checkerspiece != null && activity!!.f2!!.checkerspiece!!.team != init_block.checkerspiece!!.team) {
                        activity!!.e2!!.checkerspiece = null
                        activity!!.e2!!.button.setImageResource(android.R.color.transparent)
                        redpieces = redpieces - 1
                        return true
                    }
                    activity!!.a3 -> if (activity!!.b4!!.checkerspiece != null && activity!!.b4!!.checkerspiece!!.team != init_block.checkerspiece!!.team) {
                        activity!!.b4!!.checkerspiece = null
                        activity!!.b4!!.button.setImageResource(android.R.color.transparent)
                        redpieces = redpieces - 1
                        return true
                    }
                    activity!!.c3 -> if (activity!!.d4!!.checkerspiece != null && activity!!.d4!!.checkerspiece!!.team != init_block.checkerspiece!!.team) {
                        activity!!.d4!!.checkerspiece = null
                        activity!!.d4!!.button.setImageResource(android.R.color.transparent)
                        redpieces = redpieces - 1
                        return true
                    }
                    activity!!.e3 -> if (activity!!.f4!!.checkerspiece != null && activity!!.f4!!.checkerspiece!!.team != init_block.checkerspiece!!.team) {
                        activity!!.f4!!.checkerspiece = null
                        activity!!.f4!!.button.setImageResource(android.R.color.transparent)
                        redpieces = redpieces - 1
                        return true
                    }
                    activity!!.g3 -> if (activity!!.h4!!.checkerspiece != null && activity!!.h4!!.checkerspiece!!.team != init_block.checkerspiece!!.team) {
                        activity!!.h4!!.checkerspiece = null
                        activity!!.h4!!.button.setImageResource(android.R.color.transparent)
                        redpieces = redpieces - 1
                        return true
                    }
                    activity!!.a5 -> if (activity!!.b6!!.checkerspiece != null && activity!!.b6!!.checkerspiece!!.team != init_block.checkerspiece!!.team) {
                        activity!!.b6!!.checkerspiece = null
                        activity!!.b6!!.button.setImageResource(android.R.color.transparent)
                        redpieces = redpieces - 1
                        return true
                    }
                    activity!!.c5 -> if (activity!!.d6!!.checkerspiece != null && activity!!.d6!!.checkerspiece!!.team != init_block.checkerspiece!!.team) {
                        activity!!.d6!!.checkerspiece = null
                        activity!!.d6!!.button.setImageResource(android.R.color.transparent)
                        redpieces = redpieces - 1
                        return true
                    }
                    activity!!.e5 -> if (activity!!.f6!!.checkerspiece != null && activity!!.f6!!.checkerspiece!!.team != init_block.checkerspiece!!.team) {
                        activity!!.f6!!.checkerspiece = null
                        activity!!.f6!!.button.setImageResource(android.R.color.transparent)
                        redpieces = redpieces - 1
                        return true
                    }
                    activity!!.a7 -> if (activity!!.b8!!.checkerspiece != null && activity!!.b8!!.checkerspiece!!.team != init_block.checkerspiece!!.team) {
                        activity!!.b8!!.checkerspiece = null
                        activity!!.b8!!.button.setImageResource(android.R.color.transparent)
                        redpieces = redpieces - 1
                        return true
                    }
                    activity!!.c7 -> if (activity!!.d8!!.checkerspiece != null && activity!!.d8!!.checkerspiece!!.team != init_block.checkerspiece!!.team) {
                        activity!!.d8!!.checkerspiece = null
                        activity!!.d8!!.button.setImageResource(android.R.color.transparent)
                        redpieces = redpieces - 1
                        return true
                    }
                    activity!!.e7 -> if (activity!!.f8!!.checkerspiece != null && activity!!.f8!!.checkerspiece!!.team != init_block.checkerspiece!!.team) {
                        activity!!.f8!!.checkerspiece = null
                        activity!!.f8!!.button.setImageResource(android.R.color.transparent)
                        redpieces = redpieces - 1
                        return true
                    }

                    // Secondary black
                    activity!!.b2 -> if (activity!!.c3!!.checkerspiece != null && activity!!.c3!!.checkerspiece!!.team != init_block.checkerspiece!!.team) {
                        activity!!.c3!!.checkerspiece = null
                        activity!!.c3!!.button.setImageResource(android.R.color.transparent)
                        redpieces = redpieces - 1
                        return true
                    }
                    activity!!.b4 -> if (activity!!.c5!!.checkerspiece != null && activity!!.c5!!.checkerspiece!!.team != init_block.checkerspiece!!.team) {
                        activity!!.c5!!.checkerspiece = null
                        activity!!.c5!!.button.setImageResource(android.R.color.transparent)
                        redpieces = redpieces - 1
                        return true
                    }
                    activity!!.b6 -> if (activity!!.c7!!.checkerspiece != null && activity!!.c7!!.checkerspiece!!.team != init_block.checkerspiece!!.team) {
                        activity!!.c7!!.checkerspiece = null
                        activity!!.c7!!.button.setImageResource(android.R.color.transparent)
                        redpieces = redpieces - 1
                        return true
                    }

                    activity!!.d2 -> if (activity!!.e3!!.checkerspiece != null && activity!!.e3!!.checkerspiece!!.team != init_block.checkerspiece!!.team) {
                        activity!!.e3!!.checkerspiece = null
                        activity!!.e3!!.button.setImageResource(android.R.color.transparent)
                        redpieces = redpieces - 1
                        return true
                    }
                    activity!!.d4 -> if (activity!!.e5!!.checkerspiece != null && activity!!.e5!!.checkerspiece!!.team != init_block.checkerspiece!!.team) {
                        activity!!.e5!!.checkerspiece = null
                        activity!!.e5!!.button.setImageResource(android.R.color.transparent)
                        redpieces = redpieces - 1
                        return true
                    }
                    activity!!.d6 -> if (activity!!.e7!!.checkerspiece != null && activity!!.e7!!.checkerspiece!!.team != init_block.checkerspiece!!.team) {
                        activity!!.e7!!.checkerspiece = null
                        activity!!.e7!!.button.setImageResource(android.R.color.transparent)
                        redpieces = redpieces - 1
                        return true
                    }

                    activity!!.f2 -> if (activity!!.g3!!.checkerspiece != null && activity!!.g3!!.checkerspiece!!.team != init_block.checkerspiece!!.team) {
                        activity!!.g3!!.checkerspiece = null
                        activity!!.g3!!.button.setImageResource(android.R.color.transparent)
                        redpieces = redpieces - 1
                        return true
                    }
                    activity!!.f4 -> if (activity!!.g5!!.checkerspiece != null && activity!!.g5!!.checkerspiece!!.team != init_block.checkerspiece!!.team) {
                        activity!!.g5!!.checkerspiece = null
                        activity!!.g5!!.button.setImageResource(android.R.color.transparent)
                        redpieces = redpieces - 1
                        return true
                    }
                    activity!!.f6 -> if (activity!!.g7!!.checkerspiece != null && activity!!.g7!!.checkerspiece!!.team != init_block.checkerspiece!!.team) {
                        activity!!.g7!!.checkerspiece = null
                        activity!!.g7!!.button.setImageResource(android.R.color.transparent)
                        redpieces = redpieces - 1
                        return true
                    }
                }
            } // ->
            if (((tar_block.pos - init_block.pos == 14)) && tar_block.checkerspiece == null) {
                when (init_block) {
                    // Initial black
                    activity!!.c1 -> if (activity!!.b2!!.checkerspiece != null && activity!!.b2!!.checkerspiece!!.team != init_block.checkerspiece!!.team) {
                        activity!!.b2!!.checkerspiece = null
                        activity!!.b2!!.button.setImageResource(android.R.color.transparent)
                        redpieces = redpieces - 1
                        return true
                    }
                    activity!!.e1 -> if (activity!!.d2!!.checkerspiece != null && activity!!.d2!!.checkerspiece!!.team != init_block.checkerspiece!!.team) {
                        activity!!.d2!!.checkerspiece = null
                        activity!!.d2!!.button.setImageResource(android.R.color.transparent)
                        redpieces = redpieces - 1
                        return true
                    }
                    activity!!.g1 -> if (activity!!.f2!!.checkerspiece != null && activity!!.f2!!.checkerspiece!!.team != init_block.checkerspiece!!.team) {
                        activity!!.f2!!.checkerspiece = null
                        activity!!.f2!!.button.setImageResource(android.R.color.transparent)
                        redpieces = redpieces - 1
                        return true
                    }
                    activity!!.c3 -> if (activity!!.b4!!.checkerspiece != null && activity!!.b4!!.checkerspiece!!.team != init_block.checkerspiece!!.team) {
                        activity!!.b4!!.checkerspiece = null
                        activity!!.b4!!.button.setImageResource(android.R.color.transparent)
                        redpieces = redpieces - 1
                        return true
                    }
                    activity!!.e3 -> if (activity!!.d4!!.checkerspiece != null && activity!!.d4!!.checkerspiece!!.team != init_block.checkerspiece!!.team) {
                        activity!!.d4!!.checkerspiece = null
                        activity!!.d4!!.button.setImageResource(android.R.color.transparent)
                        redpieces = redpieces - 1
                        return true
                    }
                    activity!!.g3 -> if (activity!!.f4!!.checkerspiece != null && activity!!.f4!!.checkerspiece!!.team != init_block.checkerspiece!!.team) {
                        activity!!.f4!!.checkerspiece = null
                        activity!!.f4!!.button.setImageResource(android.R.color.transparent)
                        redpieces = redpieces - 1
                        return true
                    }
                    activity!!.c5 -> if (activity!!.b6!!.checkerspiece != null && activity!!.b6!!.checkerspiece!!.team != init_block.checkerspiece!!.team) {
                        activity!!.b6!!.checkerspiece = null
                        activity!!.b6!!.button.setImageResource(android.R.color.transparent)
                        redpieces = redpieces - 1
                        return true
                    }
                    activity!!.e5 -> if (activity!!.d6!!.checkerspiece != null && activity!!.d6!!.checkerspiece!!.team != init_block.checkerspiece!!.team) {
                        activity!!.d6!!.checkerspiece = null
                        activity!!.d6!!.button.setImageResource(android.R.color.transparent)
                        redpieces = redpieces - 1
                        return true
                    }
                    activity!!.g5 -> if (activity!!.f6!!.checkerspiece != null && activity!!.f6!!.checkerspiece!!.team != init_block.checkerspiece!!.team) {
                        activity!!.f6!!.checkerspiece = null
                        activity!!.f6!!.button.setImageResource(android.R.color.transparent)
                        redpieces = redpieces - 1
                        return true
                    }

                    // Secondary black

                    activity!!.d2 -> if (activity!!.c3!!.checkerspiece != null && activity!!.c3!!.checkerspiece!!.team != init_block.checkerspiece!!.team) {
                        activity!!.c3!!.checkerspiece = null
                        activity!!.c3!!.button.setImageResource(android.R.color.transparent)
                        redpieces = redpieces - 1
                        return true
                    }
                    activity!!.d4 -> if (activity!!.c6!!.checkerspiece != null && activity!!.c6!!.checkerspiece!!.team != init_block.checkerspiece!!.team) {
                        activity!!.c6!!.checkerspiece = null
                        activity!!.c6!!.button.setImageResource(android.R.color.transparent)
                        redpieces = redpieces - 1
                        return true
                    }
                    activity!!.d6 -> if (activity!!.c7!!.checkerspiece != null && activity!!.c7!!.checkerspiece!!.team != init_block.checkerspiece!!.team) {
                        activity!!.c7!!.checkerspiece = null
                        activity!!.c7!!.button.setImageResource(android.R.color.transparent)
                        redpieces = redpieces - 1
                        return true
                    }

                    activity!!.f2 -> if (activity!!.e3!!.checkerspiece != null && activity!!.e3!!.checkerspiece!!.team != init_block.checkerspiece!!.team) {
                        activity!!.e3!!.checkerspiece = null
                        activity!!.e3!!.button.setImageResource(android.R.color.transparent)
                        redpieces = redpieces - 1
                        return true
                    }
                    activity!!.f4 -> if (activity!!.e5!!.checkerspiece != null && activity!!.e5!!.checkerspiece!!.team != init_block.checkerspiece!!.team) {
                        activity!!.e5!!.checkerspiece = null
                        activity!!.e5!!.button.setImageResource(android.R.color.transparent)
                        redpieces = redpieces - 1
                        return true
                    }
                    activity!!.f6 -> if (activity!!.e7!!.checkerspiece != null && activity!!.e7!!.checkerspiece!!.team != init_block.checkerspiece!!.team) {
                        activity!!.e7!!.checkerspiece = null
                        activity!!.e7!!.button.setImageResource(android.R.color.transparent)
                        redpieces = redpieces - 1
                        return true
                    }
                    activity!!.h2 -> if (activity!!.g3!!.checkerspiece != null && activity!!.g3!!.checkerspiece!!.team != init_block.checkerspiece!!.team) {
                        activity!!.g3!!.checkerspiece = null
                        activity!!.g3!!.button.setImageResource(android.R.color.transparent)
                        redpieces = redpieces - 1
                        return true
                    }
                    activity!!.h4 -> if (activity!!.g5!!.checkerspiece != null && activity!!.g5!!.checkerspiece!!.team != init_block.checkerspiece!!.team) {
                        activity!!.g5!!.checkerspiece = null
                        activity!!.g5!!.button.setImageResource(android.R.color.transparent)
                        redpieces = redpieces - 1
                        return true
                    }
                    activity!!.h6 -> if (activity!!.g7!!.checkerspiece != null && activity!!.g7!!.checkerspiece!!.team != init_block.checkerspiece!!.team) {
                        activity!!.g7!!.checkerspiece = null
                        activity!!.g7!!.button.setImageResource(android.R.color.transparent)
                        redpieces = redpieces - 1
                        return true
                    }
                }
            } // <-

            // RED ATTACK
            if (((tar_block.pos - init_block.pos == -18)) && tar_block.checkerspiece == null) {
                when (init_block) {
                    activity!!.d8 -> if (activity!!.c7!!.checkerspiece != null && activity!!.c7!!.checkerspiece!!.team != init_block.checkerspiece!!.team) {
                        activity!!.c7!!.checkerspiece = null
                        activity!!.c7!!.button.setImageResource(android.R.color.transparent)
                        whitepieces = whitepieces - 1
                        return true
                    }
                    activity!!.d6 -> if (activity!!.c5!!.checkerspiece != null && activity!!.c5!!.checkerspiece!!.team != init_block.checkerspiece!!.team) {
                        activity!!.c5!!.checkerspiece = null
                        activity!!.c5!!.button.setImageResource(android.R.color.transparent)
                        whitepieces = whitepieces - 1
                        return true
                    }
                    activity!!.d4 -> if (activity!!.c3!!.checkerspiece != null && activity!!.c3!!.checkerspiece!!.team != init_block.checkerspiece!!.team) {
                        activity!!.c3!!.checkerspiece = null
                        activity!!.c3!!.button.setImageResource(android.R.color.transparent)
                        whitepieces = whitepieces - 1
                        return true
                    }
                    activity!!.f8 -> if (activity!!.e7!!.checkerspiece != null && activity!!.e7!!.checkerspiece!!.team != init_block.checkerspiece!!.team) {
                        activity!!.e7!!.checkerspiece = null
                        activity!!.e7!!.button.setImageResource(android.R.color.transparent)
                        whitepieces = whitepieces - 1
                        return true
                    }
                    activity!!.f6 -> if (activity!!.e5!!.checkerspiece != null && activity!!.e5!!.checkerspiece!!.team != init_block.checkerspiece!!.team) {
                        activity!!.e5!!.checkerspiece = null
                        activity!!.e5!!.button.setImageResource(android.R.color.transparent)
                        whitepieces = whitepieces - 1
                        return true
                    }
                    activity!!.f4 -> if (activity!!.e3!!.checkerspiece != null && activity!!.e4!!.checkerspiece!!.team != init_block.checkerspiece!!.team) {
                        activity!!.e4!!.checkerspiece = null
                        activity!!.e4!!.button.setImageResource(android.R.color.transparent)
                        whitepieces = whitepieces - 1
                        return true
                    }
                    activity!!.h8 -> if (activity!!.g7!!.checkerspiece != null && activity!!.g7!!.checkerspiece!!.team != init_block.checkerspiece!!.team) {
                        activity!!.g7!!.checkerspiece = null
                        activity!!.g7!!.button.setImageResource(android.R.color.transparent)
                        whitepieces = whitepieces - 1
                        return true
                    }
                    activity!!.h6 -> if (activity!!.g5!!.checkerspiece != null && activity!!.g5!!.checkerspiece!!.team != init_block.checkerspiece!!.team) {
                        activity!!.g5!!.checkerspiece = null
                        activity!!.g5!!.button.setImageResource(android.R.color.transparent)
                        whitepieces = whitepieces - 1
                        return true
                    }
                    activity!!.h4 -> if (activity!!.g3!!.checkerspiece != null && activity!!.g3!!.checkerspiece!!.team != init_block.checkerspiece!!.team) {
                        activity!!.g3!!.checkerspiece = null
                        activity!!.g3!!.button.setImageResource(android.R.color.transparent)
                        whitepieces = whitepieces - 1
                        return true
                    }
                    // Secondary black
                    activity!!.g7 -> if (activity!!.f6!!.checkerspiece != null && activity!!.f6!!.checkerspiece!!.team != init_block.checkerspiece!!.team) {
                        activity!!.f6!!.checkerspiece = null
                        activity!!.f6!!.button.setImageResource(android.R.color.transparent)
                        whitepieces = whitepieces - 1
                        return true
                    }
                    activity!!.g5 -> if (activity!!.f4!!.checkerspiece != null && activity!!.f4!!.checkerspiece!!.team != init_block.checkerspiece!!.team) {
                        activity!!.f4!!.checkerspiece = null
                        activity!!.f4!!.button.setImageResource(android.R.color.transparent)
                        whitepieces = whitepieces - 1
                        return true
                    }
                    activity!!.g3 -> if (activity!!.f2!!.checkerspiece != null && activity!!.f2!!.checkerspiece!!.team != init_block.checkerspiece!!.team) {
                        activity!!.f2!!.checkerspiece = null
                        activity!!.f2!!.button.setImageResource(android.R.color.transparent)
                        whitepieces = whitepieces - 1
                        return true
                    }

                    activity!!.e7 -> if (activity!!.d6!!.checkerspiece != null && activity!!.d6!!.checkerspiece!!.team != init_block.checkerspiece!!.team) {
                        activity!!.d6!!.checkerspiece = null
                        activity!!.d6!!.button.setImageResource(android.R.color.transparent)
                        whitepieces = whitepieces - 1
                        return true
                    }
                    activity!!.e5 -> if (activity!!.d4!!.checkerspiece != null && activity!!.d4!!.checkerspiece!!.team != init_block.checkerspiece!!.team) {
                        activity!!.d4!!.checkerspiece = null
                        activity!!.d4!!.button.setImageResource(android.R.color.transparent)
                        whitepieces = whitepieces - 1
                        return true
                    }
                    activity!!.e3 -> if (activity!!.d2!!.checkerspiece != null && activity!!.d2!!.checkerspiece!!.team != init_block.checkerspiece!!.team) {
                        activity!!.d2!!.checkerspiece = null
                        activity!!.d2!!.button.setImageResource(android.R.color.transparent)
                        whitepieces = whitepieces - 1
                        return true
                    }

                    activity!!.c7 -> if (activity!!.b6!!.checkerspiece != null && activity!!.b6!!.checkerspiece!!.team != init_block.checkerspiece!!.team) {
                        activity!!.b6!!.checkerspiece = null
                        activity!!.b6!!.button.setImageResource(android.R.color.transparent)
                        whitepieces = whitepieces - 1
                        return true
                    }
                    activity!!.c5 -> if (activity!!.b4!!.checkerspiece != null && activity!!.b4!!.checkerspiece!!.team != init_block.checkerspiece!!.team) {
                        activity!!.b4!!.checkerspiece = null
                        activity!!.b4!!.button.setImageResource(android.R.color.transparent)
                        whitepieces = whitepieces - 1
                        return true
                    }
                    activity!!.c3 -> if (activity!!.b2!!.checkerspiece != null && activity!!.b2!!.checkerspiece!!.team != init_block.checkerspiece!!.team) {
                        activity!!.b2!!.checkerspiece = null
                        activity!!.b2!!.button.setImageResource(android.R.color.transparent)
                        whitepieces = whitepieces - 1
                        return true
                    }
                }
            } // <-
            if (((tar_block.pos - init_block.pos == -14)) && tar_block.checkerspiece == null) {
                when (init_block) {
                    activity!!.d8 -> if (activity!!.e7!!.checkerspiece != null && activity!!.e7!!.checkerspiece!!.team != init_block.checkerspiece!!.team) {
                        activity!!.e7!!.checkerspiece = null
                        activity!!.e7!!.button.setImageResource(android.R.color.transparent)
                        whitepieces = whitepieces - 1
                        return true
                    }
                    activity!!.d6 -> if (activity!!.e5!!.checkerspiece != null && activity!!.e5!!.checkerspiece!!.team != init_block.checkerspiece!!.team) {
                        activity!!.e5!!.checkerspiece = null
                        activity!!.e5!!.button.setImageResource(android.R.color.transparent)
                        whitepieces = whitepieces - 1
                        return true
                    }
                    activity!!.d4 -> if (activity!!.e3!!.checkerspiece != null && activity!!.e3!!.checkerspiece!!.team != init_block.checkerspiece!!.team) {
                        activity!!.e3!!.checkerspiece = null
                        activity!!.e3!!.button.setImageResource(android.R.color.transparent)
                        whitepieces = whitepieces - 1
                        return true
                    }
                    activity!!.f8 -> if (activity!!.g7!!.checkerspiece != null && activity!!.g7!!.checkerspiece!!.team != init_block.checkerspiece!!.team) {
                        activity!!.g7!!.checkerspiece = null
                        activity!!.g7!!.button.setImageResource(android.R.color.transparent)
                        whitepieces = whitepieces - 1
                        return true
                    }
                    activity!!.f6 -> if (activity!!.g5!!.checkerspiece != null && activity!!.g5!!.checkerspiece!!.team != init_block.checkerspiece!!.team) {
                        activity!!.g5!!.checkerspiece = null
                        activity!!.g5!!.button.setImageResource(android.R.color.transparent)
                        whitepieces = whitepieces - 1
                        return true
                    }
                    activity!!.f4 -> if (activity!!.g3!!.checkerspiece != null && activity!!.g4!!.checkerspiece!!.team != init_block.checkerspiece!!.team) {
                        activity!!.g4!!.checkerspiece = null
                        activity!!.g4!!.button.setImageResource(android.R.color.transparent)
                        whitepieces = whitepieces - 1
                        return true
                    }
                    activity!!.b8 -> if (activity!!.c7!!.checkerspiece != null && activity!!.c7!!.checkerspiece!!.team != init_block.checkerspiece!!.team) {
                        activity!!.c7!!.checkerspiece = null
                        activity!!.c7!!.button.setImageResource(android.R.color.transparent)
                        whitepieces = whitepieces - 1
                        return true
                    }
                    activity!!.b6 -> if (activity!!.c5!!.checkerspiece != null) {
                        activity!!.c5!!.checkerspiece = null
                        activity!!.c5!!.button.setImageResource(android.R.color.transparent)
                        whitepieces = whitepieces - 1
                        return true
                    }
                    activity!!.b4 -> if (activity!!.c3!!.checkerspiece != null && activity!!.c3!!.checkerspiece!!.team != init_block.checkerspiece!!.team) {
                        activity!!.c3!!.checkerspiece = null
                        activity!!.c3!!.button.setImageResource(android.R.color.transparent)
                        whitepieces = whitepieces - 1
                        return true
                    }
                    // Secondary black

                    activity!!.e7 -> if (activity!!.f6!!.checkerspiece != null && activity!!.f6!!.checkerspiece!!.team != init_block.checkerspiece!!.team) {
                        activity!!.f6!!.checkerspiece = null
                        activity!!.f6!!.button.setImageResource(android.R.color.transparent)
                        whitepieces = whitepieces - 1
                        return true
                    }
                    activity!!.e5 -> if (activity!!.f4!!.checkerspiece != null && activity!!.f4!!.checkerspiece!!.team != init_block.checkerspiece!!.team) {
                        activity!!.f4!!.checkerspiece = null
                        activity!!.f4!!.button.setImageResource(android.R.color.transparent)
                        whitepieces = whitepieces - 1
                        return true
                    }
                    activity!!.e3 -> if (activity!!.f2!!.checkerspiece != null && activity!!.f2!!.checkerspiece!!.team != init_block.checkerspiece!!.team) {
                        activity!!.f2!!.checkerspiece = null
                        activity!!.f2!!.button.setImageResource(android.R.color.transparent)
                        whitepieces = whitepieces - 1
                        return true
                    }

                    activity!!.c7 -> if (activity!!.d6!!.checkerspiece != null && activity!!.d6!!.checkerspiece!!.team != init_block.checkerspiece!!.team) {
                        activity!!.d6!!.checkerspiece = null
                        activity!!.d6!!.button.setImageResource(android.R.color.transparent)
                        whitepieces = whitepieces - 1
                        return true
                    }
                    activity!!.c5 -> if (activity!!.d4!!.checkerspiece != null && activity!!.d4!!.checkerspiece!!.team != init_block.checkerspiece!!.team) {
                        activity!!.d4!!.checkerspiece = null
                        activity!!.d4!!.button.setImageResource(android.R.color.transparent)
                        whitepieces = whitepieces - 1
                        return true
                    }
                    activity!!.c3 -> if (activity!!.d2!!.checkerspiece != null && activity!!.d2!!.checkerspiece!!.team != init_block.checkerspiece!!.team) {
                        activity!!.d2!!.checkerspiece = null
                        activity!!.d2!!.button.setImageResource(android.R.color.transparent)
                        whitepieces = whitepieces - 1
                        return true
                    }
                }
                return false
            } // ->
            return false
        }
    }

    fun move(chessBlock: ChessBlock): Boolean? {
            if (this.turn != chessBlock.checkerspiece?.team && chessBlock.checkerspiece != null && firstclick) {
                return null
            }
            if (this.firstclick && chessBlock.checkerspiece != null) {
                println("First Click!")
                this.init_Block = chessBlock
                this.tar_Block = null
                this.firstclick = false
            } else {
                this.tar_Block = chessBlock
                // debugging purposes
                println("drag attempt for piece {${this.init_Block?.checkerspiece?.team} from {${this.init_Block?.pos}}, to [${this.tar_Block?.pos}}")
                if (islegal(this.init_Block, this.tar_Block)) {
                    println("Legal move")
                    this.init_Block?.button?.setImageResource(android.R.color.transparent)
                    tar_Block?.checkerspiece = init_Block?.checkerspiece
                    init_Block?.checkerspiece = null
                    if (this.tar_Block?.checkerspiece?.team == "white")
                        this.tar_Block?.button?.setImageResource(R.drawable.whitechecker_foreground)
                    else
                        this.tar_Block?.button?.setImageResource(R.drawable.redchecker_foreground)
                    this.firstclick = true
                    // Promoted ?
                    if(tar_Block!!.checkerspiece!!.team == "red") {
                        when (tar_Block) {
                            this.activity!!.a1 -> tar_Block?.checkerspiece?.queen = "queen"
                            this.activity!!.c1 -> tar_Block?.checkerspiece?.queen = "queen"
                            this.activity!!.e1 -> tar_Block?.checkerspiece?.queen = "queen"
                            this.activity!!.g1 -> tar_Block?.checkerspiece?.queen = "queen"
                        }
                    }else{
                        when (tar_Block){
                            this.activity!!.b8 -> tar_Block?.checkerspiece?.queen = "queen"
                            this.activity!!.d8 -> tar_Block?.checkerspiece?.queen = "queen"
                            this.activity!!.f8 -> tar_Block?.checkerspiece?.queen = "queen"
                            this.activity!!.h8 -> tar_Block?.checkerspiece?.queen = "queen"
                        }
                    }
                    // switch turns
                    if (this.turn == "white")
                        this.turn = "red"
                    else
                        this.turn = "white"
                }
                if(redpieces == 0 || whitepieces == 0){
                    activity?.finish()
                }
                println("Illegal move")
                this.init_Block = null
                this.tar_Block = null
                this.firstclick = true
            }
            return true
        }

    fun caneat(checkerspiece: CheckersPiece): Boolean? {
            return true
    }
    }

class CheckersPiece(var team: String, var pos: Int, var block: ChessBlock?, var queen: String) {

    }