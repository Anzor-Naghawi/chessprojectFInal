package com.example.chessprojectfinal

import android.graphics.Color
import android.util.TypedValue
import android.widget.Button
import android.widget.ImageButton

class ChessBlock(val button: ImageButton, val pos: Int, var chesspiece: ChessPiece?, val engine: ChessEngine?, var checkerspiece: CheckersPiece?, var checkersEngine: CheckersEngine?, var gametype: String){
    init {
        if(gametype == "chess"){

            if (this.chesspiece?.color == "white") {
                when(this.chesspiece?.type){
                    "pawn" -> this.button.setImageResource(R.mipmap.whitepawn_foreground)
                    "rook" -> this.button.setImageResource(R.mipmap.whiterook_foreground_foreground)
                    "knight" -> this.button.setImageResource(R.mipmap.whiteknight_foreground)
                    "bishop" -> this.button.setImageResource(R.mipmap.whitebishop_foreground)
                    "king" -> this.button.setImageResource(R.mipmap.whiteking_foreground)
                    "queen" -> this.button.setImageResource(R.mipmap.whitekqueen_foreground)
                }
            }
            else if (this.chesspiece?.color == "black") {
                when (this.chesspiece?.type) {
                    "pawn" -> this.button.setImageResource(R.mipmap.blackpawn_foreground)
                    "rook" -> this.button.setImageResource(R.mipmap.blackrook_foreground)
                    "knight" -> this.button.setImageResource(R.mipmap.blackknight_foreground)
                    "bishop" -> this.button.setImageResource(R.mipmap.blackbishop_foreground)
                    "king" -> this.button.setImageResource(R.mipmap.blackking_foreground)
                    "queen" -> this.button.setImageResource(R.mipmap.blackkqueen_foreground)
                }
            }
            this.button.setOnClickListener() {
                this.engine?.move(this)
            }
        }
        if(this.gametype == "checkers"){
            if (this.checkerspiece?.team == "white"){

                this.button.setImageResource(R.drawable.whitechecker_foreground)
            }
            else if(this.checkerspiece?.team == "red"){
                this.button.setImageResource(R.drawable.redchecker_foreground)
            }
            this.button.setOnClickListener() {
                this.checkersEngine?.move(this)
            }
        }
    }
}