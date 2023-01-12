package com.example.chessprojectfinal

class KingCheck(var mainActivity: ChessActivity?) {
    fun check(init_block: ChessBlock, tar_block: ChessBlock): Boolean {
        if (init_block == tar_block) {
            return false
        }
        if (   tar_block.pos - init_block.pos == -1 || tar_block.pos - init_block.pos == 1
            || tar_block.pos - init_block.pos == 7 || tar_block.pos - init_block.pos == 8
            || tar_block.pos - init_block.pos == -9 || tar_block.pos - init_block.pos == -7
            || tar_block.pos - init_block.pos == -8 || tar_block.pos - init_block.pos == -9
        ) {
            if (tar_block.chesspiece == null || tar_block.chesspiece!!.color != init_block.chesspiece?.color)
                return true
        }
        return false
    }
}
