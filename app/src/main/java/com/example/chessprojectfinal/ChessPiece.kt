package com.example.chessprojectfinal

import android.annotation.SuppressLint
import android.graphics.Color
import android.widget.Button

class ChessPiece(val type: String, val color: String, var pos: Int, var tar_block: Int){
    var firstclick = true
    var init_Block : ChessBlock? = null
    var tar_Block : ChessBlock? = null

    }
