package com.example.chessprojectfinal

import java.lang.Math.abs

class KnightCheck(var mainActivity: ChessActivity?) {
    fun check(init_block: ChessBlock, tar_block: ChessBlock): Boolean {
        if (init_block == tar_block) {
            return false
        }
        if (   tar_block.pos - init_block.pos == 17 || tar_block.pos - init_block.pos == 15
            || tar_block.pos - init_block.pos == 10 || tar_block.pos - init_block.pos == 6
            || tar_block.pos - init_block.pos == -17 || tar_block.pos - init_block.pos == -15
            || tar_block.pos - init_block.pos == -10 || tar_block.pos - init_block.pos == -6
        ) {
            if (tar_block.chesspiece == null || tar_block.chesspiece!!.color != init_block.chesspiece?.color)
                return true
        }
        return false
    }
}