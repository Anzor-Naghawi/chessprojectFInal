
package com.release.gfg1

import android.content.ContentValues
import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class DBHelper(context: Context, factory: SQLiteDatabase.CursorFactory?) :
    SQLiteOpenHelper(context, DATABASE_NAME, factory, DATABASE_VERSION) {


    override fun onCreate(db: SQLiteDatabase) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME)
        val query = ("CREATE TABLE " + TABLE_NAME + " ("
                + ID_COL + " INTEGER PRIMARY KEY, " +
                MOVE_COL + " TEXT," +
                PIECE + " TEXT" + ")")
        db.execSQL(query)
    }

    override fun onUpgrade(db: SQLiteDatabase, p1: Int, p2: Int) {

        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME)
        onCreate(db)
    }

    fun addItem(move : String, piece : String ){


        val values = ContentValues()

        values.put(MOVE_COL, move)
        values.put(PIECE, piece)

        val db = this.writableDatabase

        db.insert(TABLE_NAME, null, values)


    }

    fun closedb(){
        val db = this.writableDatabase
        db.close()
    }

    companion object{

        private val DATABASE_NAME = "CHESS_GAME3"


        private val DATABASE_VERSION = 3

        val TABLE_NAME = "MOVEMENT_TABLE"

        val ID_COL = "id"


        val MOVE_COL = "FROM_TO"


        val PIECE = "TEAM_PIECE"
    }
}