package com.example.chessprojectfinal

import android.annotation.SuppressLint
import android.content.ContentValues
import android.content.ContentResolver
import android.content.ContentProvider
import android.content.ContentUris
import android.content.Context
import android.database.Cursor
import android.graphics.Color
import android.view.View
import com.release.gfg1.DBHelper


class ChessEngine (var mainActivity: ChessActivity?){
    var firstclick = true
    var init_Block: ChessBlock? = null
    var tar_Block: ChessBlock? = null
    var turn = "white"
    var bishopmove = BishopCheck(null)
    var rookmove = RookCheck(null)
    var knightmove = KnightCheck(null)
    var kingmove = KingCheck(null)
    var db : DBHelper? = null
    fun updateMainActivity(){
        bishopmove = BishopCheck(mainActivity)
        rookmove = RookCheck(mainActivity)
        knightmove = KnightCheck(mainActivity)
        kingmove = KingCheck(mainActivity)
        db = DBHelper(mainActivity!!, null)
    }
    fun islegal(init_block: ChessBlock, tar_block: ChessBlock) :Boolean{
        // TODO: Bishop, Knight, Queen, King
        // white pawn move rules // ATTACKS INCLUDED
        if(init_block.chesspiece?.type == "pawn" && init_block.chesspiece?.color == "white")
        {
            if (tar_block.pos.minus(init_block.pos) == 16) {
                when (init_block.pos) {
                    8 -> if (mainActivity?.a3?.chesspiece != null) return false
                    9 -> if (mainActivity?.b3?.chesspiece != null) return false
                    10 -> if (mainActivity?.c3?.chesspiece != null) return false
                    11 -> if (mainActivity?.d3?.chesspiece != null) return false
                    12 -> if (mainActivity?.e3?.chesspiece != null) return false
                    13 -> if (mainActivity?.f3?.chesspiece != null) return false
                    14 -> if (mainActivity?.g3?.chesspiece != null) return false
                    15 -> if (mainActivity?.h3?.chesspiece != null) return false
                }
                return tar_block.chesspiece == null
            }
            if (tar_block.pos.minus(init_block.pos) == 8){
                return tar_block.chesspiece == null
            }
            if (tar_block.pos.minus(init_block.pos) == 7 || tar_block.pos.minus(init_block.pos) == 9){
                return tar_block.chesspiece != null && tar_block.chesspiece?.color != init_block.chesspiece?.color
            }
        }
        // black pawn move rules // ATTACKS INCLUDED
        if(init_block.chesspiece?.type == "pawn" && init_block.chesspiece?.color == "black")
        {
            if (tar_block.pos.minus(init_block.pos) == -16) {
                when (init_block.pos) {
                    44 -> if (mainActivity?.a6?.chesspiece != null) return false
                    45 -> if (mainActivity?.b6?.chesspiece != null) return false
                    46 -> if (mainActivity?.c6?.chesspiece != null) return false
                    47 -> if (mainActivity?.d6?.chesspiece != null) return false
                    48 -> if (mainActivity?.e6?.chesspiece != null) return false
                    49 -> if (mainActivity?.f6?.chesspiece != null) return false
                    50 -> if (mainActivity?.g6?.chesspiece != null) return false
                    51 -> if (mainActivity?.h6?.chesspiece != null) return false
                }
                return tar_block.chesspiece == null
            }
            if (tar_block.pos.minus(init_block.pos) == -8){
                return tar_block.chesspiece == null
            }
            if (tar_block.pos.minus(init_block.pos) == -7 || tar_block.pos.minus(init_block.pos) == -9){
                return tar_block.chesspiece != null && tar_block.chesspiece?.color != init_block.chesspiece?.color
            }
        }
        // rook move rules SHARED // ATTACKS INCLUDED
        if(init_block.chesspiece?.type == "rook")
        {
            return rookmove.check(init_block, tar_block)
        }
        if(init_block.chesspiece?.type == "bishop"){
            return bishopmove.check(init_block,tar_block)
        }
        if(init_block.chesspiece?.type == "knight"){
            return knightmove.check(init_block,tar_block)
        }
        if(init_block.chesspiece?.type == "queen"){
            return rookmove.check(init_block, tar_block) || bishopmove.check(init_block,tar_block)
        }
        if(init_block.chesspiece?.type == "king"){
            return kingmove.check(init_block, tar_block)
        }
        return false
    }



    @SuppressLint("ResourceAsColor")
    fun move(chessBlock: ChessBlock): Boolean? {
        // validate turn
        if(this.turn != chessBlock.chesspiece?.color && chessBlock.chesspiece != null && firstclick)
            return null
        // get piece to move
        if (this.firstclick && chessBlock.chesspiece != null) {
            println("First Click!")
            this.init_Block = chessBlock
            this.mainActivity?.debugText!!.text = "Moving " + (this.init_Block!!.chesspiece?.type) + " on block " + this.init_Block!!.chesspiece?.pos
            this.tar_Block = null
            this.firstclick = false
        } else {
            this.tar_Block = chessBlock
            this.mainActivity?.debugText!!.text = "No Piece Selected"
            // debugging purposes
            println("drag attempt for piece {${this.init_Block?.chesspiece?.type} from {${this.init_Block?.pos}}, to [${this.tar_Block?.pos}}")
            // if legal, commit the move.
            if (islegal(this.init_Block!!, this.tar_Block!!)) {
                println("Legal move")
                val move_col = "FROM " + (this.init_Block!!.pos).toString() +" TO "+ (this.tar_Block!!.pos).toString()

                val piece = "TEAM " + (this.init_Block!!.chesspiece?.color).toString() + " TYPE " + (this.init_Block!!.chesspiece?.type).toString()

                db!!.addItem(move_col, piece)
                // make the move
                tar_Block?.chesspiece = init_Block?.chesspiece
                init_Block?.chesspiece = null
                init_Block?.button?.setImageResource(android.R.color.transparent)
                if (this.tar_Block?.chesspiece?.color == "white") {
                    when (this.tar_Block?.chesspiece?.type) {
                        "pawn" -> this.tar_Block?.button?.setImageResource(R.mipmap.whitepawn_foreground)
                        "rook" -> this.tar_Block?.button?.setImageResource(R.mipmap.whiterook_foreground_foreground)
                        "knight" -> this.tar_Block?.button?.setImageResource(R.mipmap.whiteknight_foreground)
                        "bishop" -> this.tar_Block?.button?.setImageResource(R.mipmap.whitebishop_foreground)
                        "king" -> this.tar_Block?.button?.setImageResource(R.mipmap.whiteking_foreground)
                        "queen" -> this.tar_Block?.button?.setImageResource(R.mipmap.whitekqueen_foreground)
                    }
                    }
                else {
                    when (this.tar_Block?.chesspiece?.type) {
                        "pawn" -> this.tar_Block?.button?.setImageResource(R.mipmap.blackpawn_foreground)
                        "rook" -> this.tar_Block?.button?.setImageResource(R.mipmap.blackrook_foreground)
                        "knight" -> this.tar_Block?.button?.setImageResource(R.mipmap.blackknight_foreground)
                        "bishop" -> this.tar_Block?.button?.setImageResource(R.mipmap.blackbishop_foreground)
                        "king" -> this.tar_Block?.button?.setImageResource(R.mipmap.blackking_foreground)
                        "queen" -> this.tar_Block?.button?.setImageResource(R.mipmap.blackkqueen_foreground)
                    }
                }
                this.firstclick = true
                this.db!!.closedb()
                // switch turns
                if(this.turn == "white"){
                    this.mainActivity!!.turnText?.text = "Blacks turn!"
                    this.turn = "black"
                    }
                else {
                    this.turn = "white"
                    this.mainActivity!!.turnText?.text = "White turn!"
                }

            }
            this.firstclick = true
        }
        return true
    }
}