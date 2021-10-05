package com.example.tetris.storage.models

import java.lang.IllegalArgumentException

enum class Shape(val frameCount: Int, val startPosition: Int) {
    Tetromino(2 ,2) {
        override fun getFrame(frameNubmer: Int): Frame {
            return when (frameNubmer) {
                0 -> Frame(4).addRow("1111")
                1 -> Frame(1)
                    .addRow("1")
                    .addRow("1")
                    .addRow("1")
                    .addRow("1")

                else -> throw IllegalArgumentException("$frameNubmer is an invalid frame number.")
            }
        }
    };
    abstract fun getFrame(frameNubmer: Int): Frame
}