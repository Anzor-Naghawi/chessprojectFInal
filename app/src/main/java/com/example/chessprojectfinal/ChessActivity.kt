package com.example.chessprojectfinal

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class ChessActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chess)
        val homebutton: Button = findViewById(R.id.homepagebutton2)
        this.debugText= findViewById(R.id.debugText)
        this.turnText= findViewById(R.id.turnText)
        homebutton.setOnClickListener(){
            finish()
        }
        this.engine.mainActivity = this
        this.engine.updateMainActivity()
        // a file
        this.a1 = ChessBlock(findViewById(R.id.a1),0,a1rook, engine, null, null, "chess")
        this.a2 = ChessBlock(findViewById(R.id.a2),8,a2pawn, engine, null, null, "chess")
        this.a3 = ChessBlock(findViewById(R.id.a3),16, null, engine, null, null, "chess")
        this.a4 = ChessBlock(findViewById(R.id.a4),24, null, engine, null, null, "chess")
        this.a5 = ChessBlock(findViewById(R.id.a5),32, null, engine, null, null, "chess")
        this.a6 = ChessBlock(findViewById(R.id.a6),40, null, engine, null, null, "chess")
        this.a7 = ChessBlock(findViewById(R.id.a7),48, a7pawn, engine, null, null, "chess")
        this.a8 = ChessBlock(findViewById(R.id.a8),56, a8rook, engine, null, null, "chess")
        // b file
        this.b1 = ChessBlock(findViewById(R.id.b1),1,b1knight, engine, null, null, "chess")
        this.b2 = ChessBlock(findViewById(R.id.b2),9,b2pawn, engine, null, null, "chess")
        this.b3 = ChessBlock(findViewById(R.id.b3),17, null, engine, null, null, "chess")
        this.b4 = ChessBlock(findViewById(R.id.b4),25, null, engine, null, null, "chess")
        this.b5 = ChessBlock(findViewById(R.id.b5),33, null, engine, null, null, "chess")
        this.b6 = ChessBlock(findViewById(R.id.b6),41, null, engine, null, null, "chess")
        this.b7 = ChessBlock(findViewById(R.id.b7),49, b7pawn, engine, null, null, "chess")
        this.b8 = ChessBlock(findViewById(R.id.b8),57, b8knight, engine, null, null, "chess")
        // c file
        this.c1 = ChessBlock(findViewById(R.id.c1),2,c1bishop, engine, null, null, "chess")
        this.c2 = ChessBlock(findViewById(R.id.c2),10,c2pawn, engine, null, null, "chess")
        this.c3 = ChessBlock(findViewById(R.id.c3),18, null, engine, null, null, "chess")
        this.c4 = ChessBlock(findViewById(R.id.c4),26, null, engine, null, null, "chess")
        this.c5 = ChessBlock(findViewById(R.id.c5),34, null, engine, null, null, "chess")
        this.c6 = ChessBlock(findViewById(R.id.c6),42, null, engine, null, null, "chess")
        this.c7 = ChessBlock(findViewById(R.id.c7),50, c7pawn, engine, null, null, "chess")
        this.c8 = ChessBlock(findViewById(R.id.c8),58, c8bishop, engine, null, null, "chess")
        // d file
        this.d1 = ChessBlock(findViewById(R.id.d1),3,whqueen, engine, null, null, "chess")
        this.d2 = ChessBlock(findViewById(R.id.d2),11,d2pawn, engine, null, null, "chess")
        this.d3 = ChessBlock(findViewById(R.id.d3),19, null, engine, null, null, "chess")
        this.d4 = ChessBlock(findViewById(R.id.d4),27, null, engine, null, null, "chess")
        this.d5 = ChessBlock(findViewById(R.id.d5),35, null, engine, null, null, "chess")
        this.d6 = ChessBlock(findViewById(R.id.d6),43, null, engine, null, null, "chess")
        this.d7 = ChessBlock(findViewById(R.id.d7),51, d7pawn, engine, null, null, "chess")
        this.d8 = ChessBlock(findViewById(R.id.d8),59, blqueen, engine, null, null, "chess")
        // e file
        this.e1 = ChessBlock(findViewById(R.id.e1),4,whking, engine, null, null, "chess")
        this.e2 = ChessBlock(findViewById(R.id.e2),12,e2pawn, engine, null, null, "chess")
        this.e3 = ChessBlock(findViewById(R.id.e3),20, null, engine, null, null, "chess")
        this.e4 = ChessBlock(findViewById(R.id.e4),28, null, engine, null, null, "chess")
        this.e5 = ChessBlock(findViewById(R.id.e5),36, null, engine, null, null, "chess")
        this.e6 = ChessBlock(findViewById(R.id.e6),44, null, engine, null, null, "chess")
        this.e7 = ChessBlock(findViewById(R.id.e7),52, e7pawn, engine, null, null, "chess")
        this.e8 = ChessBlock(findViewById(R.id.e8),60, blking, engine, null, null, "chess")
        // f file
        this.f1 = ChessBlock(findViewById(R.id.f1),5,f1bishop, engine, null, null, "chess")
        this.f2 = ChessBlock(findViewById(R.id.f2),13,f2pawn, engine, null, null, "chess")
        this.f3 = ChessBlock(findViewById(R.id.f3),21, null, engine, null, null, "chess")
        this.f4 = ChessBlock(findViewById(R.id.f4),29, null, engine, null, null, "chess")
        this.f5 = ChessBlock(findViewById(R.id.f5),37, null, engine, null, null, "chess")
        this.f6 = ChessBlock(findViewById(R.id.f6),45, null, engine, null, null, "chess")
        this.f7 = ChessBlock(findViewById(R.id.f7),53, f7pawn, engine, null, null, "chess")
        this.f8 = ChessBlock(findViewById(R.id.f8),61, f8bishop, engine, null, null, "chess")
        // g file
        this.g1 = ChessBlock(findViewById(R.id.g1),6,g1knight, engine, null, null, "chess")
        this.g2 = ChessBlock(findViewById(R.id.g2),14,g2pawn, engine, null, null, "chess")
        this.g3 = ChessBlock(findViewById(R.id.g3),22, null, engine, null, null, "chess")
        this.g4 = ChessBlock(findViewById(R.id.g4),30, null, engine, null, null, "chess")
        this.g5 = ChessBlock(findViewById(R.id.g5),38, null, engine, null, null, "chess")
        this.g6 = ChessBlock(findViewById(R.id.g6),46, null, engine, null, null, "chess")
        this.g7 = ChessBlock(findViewById(R.id.g7),54, g7pawn, engine, null, null, "chess")
        this.g8 = ChessBlock(findViewById(R.id.g8),62, g8knight, engine, null, null, "chess")
        // h file
        this.h1 = ChessBlock(findViewById(R.id.h1),7,h1rook, engine, null, null, "chess")
        this.h2 = ChessBlock(findViewById(R.id.h2),15,h2pawn, engine, null, null, "chess")
        this.h3 = ChessBlock(findViewById(R.id.h3),23, null, engine, null, null, "chess")
        this.h4 = ChessBlock(findViewById(R.id.h4),31, null, engine, null, null, "chess")
        this.h5 = ChessBlock(findViewById(R.id.h5),39, null, engine, null, null, "chess")
        this.h6 = ChessBlock(findViewById(R.id.h6),47, null, engine, null, null, "chess")
        this.h7 = ChessBlock(findViewById(R.id.h7),55, h7pawn, engine, null, null, "chess")
        this.h8 = ChessBlock(findViewById(R.id.h8),63, h8rook, engine, null, null, "chess")
    }
    var engine = ChessEngine(null)
    var debugText: TextView? = null
    var turnText: TextView? = null
    // WHITE PIECES
    // white rooks
    val a1rook = ChessPiece("rook", "white", 0, 0)
    var h1rook = ChessPiece("rook", "white", 7, 7)

    // white Knights
    val b1knight = ChessPiece("knight", "white", 1, 1)
    var g1knight = ChessPiece("knight", "white", 6, 6)

    // white bishops
    val c1bishop = ChessPiece("bishop", "white", 2, 2)
    var f1bishop = ChessPiece("bishop", "white", 5, 5)

    // white royal
    val whqueen = ChessPiece("queen", "white", 3, 3)
    val whking = ChessPiece("king", "white", 4, 4)

    // white pawns

    val a2pawn = ChessPiece("pawn","white", 8, 8)
    val b2pawn = ChessPiece("pawn","white", 9, 9)
    val c2pawn = ChessPiece("pawn","white", 10,10)
    val d2pawn = ChessPiece("pawn","white", 11,11)
    val e2pawn = ChessPiece("pawn","white", 12,12)
    var f2pawn = ChessPiece("pawn","white", 13,13)
    var g2pawn = ChessPiece("pawn","white", 14,14)
    var h2pawn = ChessPiece("pawn","white", 15,15)

    // BLACK PIECES
    // black rooks
    val a8rook = ChessPiece("rook", "black", 56, 0)
    val h8rook = ChessPiece("rook", "black", 63, 7)

    // black Knights
    val b8knight = ChessPiece("knight", "black", 57, 1)
    val g8knight = ChessPiece("knight", "black", 62, 6)

    // black bishops
    val c8bishop = ChessPiece("bishop", "black", 58, 2)
    val f8bishop = ChessPiece("bishop", "black", 61, 5)

    // black royal
    val blqueen = ChessPiece("queen", "black", 59, 3)
    val blking = ChessPiece("king", "black", 60, 4)

    // black pawns

    val a7pawn = ChessPiece("pawn","black", 48,8)
    val b7pawn = ChessPiece("pawn","black", 49,9)
    val c7pawn = ChessPiece("pawn","black", 50,10)
    val d7pawn = ChessPiece("pawn","black", 51,11)
    val e7pawn = ChessPiece("pawn","black", 52,12)
    val f7pawn = ChessPiece("pawn","black", 53,13)
    val g7pawn = ChessPiece("pawn","black", 54,14)
    val h7pawn = ChessPiece("pawn","black", 55,15)



    // BLOCK INITIALIZING
    // a file

    var a1 : ChessBlock? = null
    var a2 : ChessBlock? = null
    var a3 : ChessBlock? = null
    var a4 : ChessBlock? = null
    var a5 : ChessBlock? = null
    var a6 : ChessBlock? = null
    var a7 : ChessBlock? = null
    var a8 : ChessBlock? = null
    // b file
    var b1 : ChessBlock? = null
    var b2 : ChessBlock? = null
    var b3 : ChessBlock? = null
    var b4 : ChessBlock? = null
    var b5 : ChessBlock? = null
    var b6 : ChessBlock? = null
    var b7 : ChessBlock? = null
    var b8 : ChessBlock? = null
    // c file
    var c1 : ChessBlock? = null
    var c2 : ChessBlock? = null
    var c3 : ChessBlock? = null
    var c4 : ChessBlock? = null
    var c5 : ChessBlock? = null
    var c6 : ChessBlock? = null
    var c7 : ChessBlock? = null
    var c8 : ChessBlock? = null
    // d file
    var d1 : ChessBlock? = null
    var d2 : ChessBlock? = null
    var d3 : ChessBlock? = null
    var d4 : ChessBlock? = null
    var d5 : ChessBlock? = null
    var d6 : ChessBlock? = null
    var d7 : ChessBlock? = null
    var d8 : ChessBlock? = null
    // e file
    var e1 : ChessBlock? = null
    var e2 : ChessBlock? = null
    var e3 : ChessBlock? = null
    var e4 : ChessBlock? = null
    var e5 : ChessBlock? = null
    var e6 : ChessBlock? = null
    var e7 : ChessBlock? = null
    var e8 : ChessBlock? = null
    // f file
    var f1 : ChessBlock? = null
    var f2 : ChessBlock? = null
    var f3 : ChessBlock? = null
    var f4 : ChessBlock? = null
    var f5 : ChessBlock? = null
    var f6 : ChessBlock? = null
    var f7 : ChessBlock? = null
    var f8 : ChessBlock? = null
    // g file
    var g1 : ChessBlock? = null
    var g2 : ChessBlock? = null
    var g3 : ChessBlock? = null
    var g4 : ChessBlock? = null
    var g5 : ChessBlock? = null
    var g6 : ChessBlock? = null
    var g7 : ChessBlock? = null
    var g8 : ChessBlock? = null
    // h file
    var h1 : ChessBlock? = null
    var h2 : ChessBlock? = null
    var h3 : ChessBlock? = null
    var h4 : ChessBlock? = null
    var h5 : ChessBlock? = null
    var h6 : ChessBlock? = null
    var h7 : ChessBlock? = null
    var h8 : ChessBlock? = null

}