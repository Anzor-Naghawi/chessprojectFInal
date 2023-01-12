package com.example.chessprojectfinal

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableStateFlow

class SnakeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_snake)
        var homebutton : Button = findViewById(R.id.homepagebutton2)
        homebutton.setOnClickListener(){
            finish()
        }
        this.engine.activity = this
        this.a1 = ChessBlock(findViewById(R.id.a1),0,null, null, a1p, engine, "checkers")
        this.a2 = ChessBlock(findViewById(R.id.a2),8,null, null, null, engine, "checkers")
        this.a3 = ChessBlock(findViewById(R.id.a3),16, null, null, a3p, engine, "checkers")
        this.a4 = ChessBlock(findViewById(R.id.a4),24, null, null, null, engine, "checkers")
        this.a5 = ChessBlock(findViewById(R.id.a5),32, null, null, null, engine, "checkers")
        this.a6 = ChessBlock(findViewById(R.id.a6),40, null, null, null, engine, "checkers")
        this.a7 = ChessBlock(findViewById(R.id.a7),48, null, null, a7p, engine, "checkers")
        this.a8 = ChessBlock(findViewById(R.id.a8),56, null, null, null, engine, "checkers")
        // b file
        this.b1 = ChessBlock(findViewById(R.id.b1),1,null, null, null, engine, "checkers")
        this.b2 = ChessBlock(findViewById(R.id.b2),9,null, null, b2p, engine, "checkers")
        this.b3 = ChessBlock(findViewById(R.id.b3),17, null, null, null, engine, "checkers")
        this.b4 = ChessBlock(findViewById(R.id.b4),25, null, null, null, engine, "checkers")
        this.b5 = ChessBlock(findViewById(R.id.b5),33, null, null, null, engine, "checkers")
        this.b6 = ChessBlock(findViewById(R.id.b6),41, null, null, b6p, engine, "checkers")
        this.b7 = ChessBlock(findViewById(R.id.b7),49, null, null, null, engine, "checkers")
        this.b8 = ChessBlock(findViewById(R.id.b8),57, null, null, b8p, engine, "checkers")
        // c file
        this.c1 = ChessBlock(findViewById(R.id.c1),2,null, null, c1p, engine, "checkers")
        this.c2 = ChessBlock(findViewById(R.id.c2),10,null, null, null, engine, "checkers")
        this.c3 = ChessBlock(findViewById(R.id.c3),18, null, null, c3p, engine, "checkers")
        this.c4 = ChessBlock(findViewById(R.id.c4),26, null, null, null, engine, "checkers")
        this.c5 = ChessBlock(findViewById(R.id.c5),34, null, null, null, engine, "checkers")
        this.c6 = ChessBlock(findViewById(R.id.c6),42, null, null, null, engine, "checkers")
        this.c7 = ChessBlock(findViewById(R.id.c7),50, null, null, c7p, engine, "checkers")
        this.c8 = ChessBlock(findViewById(R.id.c8),58, null, null, null, engine, "checkers")
        // d file
        this.d1 = ChessBlock(findViewById(R.id.d1),3,null, null, null, engine, "checkers")
        this.d2 = ChessBlock(findViewById(R.id.d2),11,null, null, d2p, engine, "checkers")
        this.d3 = ChessBlock(findViewById(R.id.d3),19, null, null, null, engine, "checkers")
        this.d4 = ChessBlock(findViewById(R.id.d4),27, null, null, null, engine, "checkers")
        this.d5 = ChessBlock(findViewById(R.id.d5),35, null, null, null, engine, "checkers")
        this.d6 = ChessBlock(findViewById(R.id.d6),43, null, null, d6p, engine, "checkers")
        this.d7 = ChessBlock(findViewById(R.id.d7),51, null, null, null, engine, "checkers")
        this.d8 = ChessBlock(findViewById(R.id.d8),59, null, null, d8p, engine, "checkers")
        // e file
        this.e1 = ChessBlock(findViewById(R.id.e1),4,null, null, e1p, engine, "checkers")
        this.e2 = ChessBlock(findViewById(R.id.e2),12,null, null, null, engine, "checkers")
        this.e3 = ChessBlock(findViewById(R.id.e3),20, null, null, e3p, engine, "checkers")
        this.e4 = ChessBlock(findViewById(R.id.e4),28, null, null, null, engine, "checkers")
        this.e5 = ChessBlock(findViewById(R.id.e5),36, null, null, null, engine, "checkers")
        this.e6 = ChessBlock(findViewById(R.id.e6),44, null, null, null, engine, "checkers")
        this.e7 = ChessBlock(findViewById(R.id.e7),52, null, null, e7p, engine, "checkers")
        this.e8 = ChessBlock(findViewById(R.id.e8),60, null, null, null, engine, "checkers")
        // f file
        this.f1 = ChessBlock(findViewById(R.id.f1),5,null, null, null, engine, "checkers")
        this.f2 = ChessBlock(findViewById(R.id.f2),13,null, null, f2p, engine, "checkers")
        this.f3 = ChessBlock(findViewById(R.id.f3),21, null, null, null, engine, "checkers")
        this.f4 = ChessBlock(findViewById(R.id.f4),29, null, null, null, engine, "checkers")
        this.f5 = ChessBlock(findViewById(R.id.f5),37, null, null, null, engine, "checkers")
        this.f6 = ChessBlock(findViewById(R.id.f6),45, null, null, f6p, engine, "checkers")
        this.f7 = ChessBlock(findViewById(R.id.f7),53, null, null, null, engine, "checkers")
        this.f8 = ChessBlock(findViewById(R.id.f8),61, null, null, f8p, engine, "checkers")
        // g file
        this.g1 = ChessBlock(findViewById(R.id.g1),6,null, null, g1p, engine, "checkers")
        this.g2 = ChessBlock(findViewById(R.id.g2),14,null, null, null, engine, "checkers")
        this.g3 = ChessBlock(findViewById(R.id.g3),22, null, null, g3p, engine, "checkers")
        this.g4 = ChessBlock(findViewById(R.id.g4),30, null, null, null, engine, "checkers")
        this.g5 = ChessBlock(findViewById(R.id.g5),38, null, null, null, engine, "checkers")
        this.g6 = ChessBlock(findViewById(R.id.g6),46, null, null, null, engine, "checkers")
        this.g7 = ChessBlock(findViewById(R.id.g7),54, null, null, g7p, engine, "checkers")
        this.g8 = ChessBlock(findViewById(R.id.g8),62, null, null, null, engine, "checkers")
        // h file
        this.h1 = ChessBlock(findViewById(R.id.h1),7,null, null, null, engine, "checkers")
        this.h2 = ChessBlock(findViewById(R.id.h2),15,null, null, h2p, engine, "checkers")
        this.h3 = ChessBlock(findViewById(R.id.h3),23, null, null, null, engine, "checkers")
        this.h4 = ChessBlock(findViewById(R.id.h4),31, null, null, null, engine, "checkers")
        this.h5 = ChessBlock(findViewById(R.id.h5),39, null, null, null, engine, "checkers")
        this.h6 = ChessBlock(findViewById(R.id.h6),47, null, null, h6p, engine, "checkers")
        this.h7 = ChessBlock(findViewById(R.id.h7),55, null, null, null, engine, "checkers")
        this.h8 = ChessBlock(findViewById(R.id.h8),63, null, null, h8p, engine, "checkers")
    }
    var engine = CheckersEngine(null)

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

    // Black pieces
    var a1p : CheckersPiece = CheckersPiece("white", 0,  this.a1, "peasant")
    var a3p : CheckersPiece = CheckersPiece("white", 16, this.a3, "peasant")
    var b2p : CheckersPiece = CheckersPiece("white", 9,  this.b2, "peasant")
    var c1p : CheckersPiece = CheckersPiece("white", 2,  this.c1, "peasant")
    var c3p : CheckersPiece = CheckersPiece("white", 18, this.c3, "peasant")
    var d2p : CheckersPiece = CheckersPiece("white", 11, this.d2, "peasant")
    var e1p : CheckersPiece = CheckersPiece("white", 4,  this.e1, "peasant")
    var e3p : CheckersPiece = CheckersPiece("white", 20, this.e3, "peasant")
    var f2p : CheckersPiece = CheckersPiece("white", 13, this.f2, "peasant")
    var g1p : CheckersPiece = CheckersPiece("white", 6,  this.g1, "peasant")
    var g3p : CheckersPiece = CheckersPiece("white", 22, this.g3, "peasant")
    var h2p : CheckersPiece = CheckersPiece("white", 15, this.h2, "peasant")

    // White pieces
    var a7p : CheckersPiece = CheckersPiece("red", 48, this.a7, "peasant")
    var b8p : CheckersPiece = CheckersPiece("red", 57, this.b8, "peasant")
    var b6p : CheckersPiece = CheckersPiece("red", 41, this.b6, "peasant")
    var c7p : CheckersPiece = CheckersPiece("red", 50, this.c7, "peasant")
    var d8p : CheckersPiece = CheckersPiece("red", 59, this.d8, "peasant")
    var d6p : CheckersPiece = CheckersPiece("red", 43, this.d6, "peasant")
    var e7p : CheckersPiece = CheckersPiece("red", 52, this.e7, "peasant")
    var f8p : CheckersPiece = CheckersPiece("red", 61, this.f8, "peasant")
    var f6p : CheckersPiece = CheckersPiece("red", 45, this.f6, "peasant")
    var g7p : CheckersPiece = CheckersPiece("red", 54, this.g7, "peasant")
    var h8p : CheckersPiece = CheckersPiece("red", 63, this.h8, "peasant")
    var h6p : CheckersPiece = CheckersPiece("red", 47, this.h6, "peasant")
}
