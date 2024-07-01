package org.example.Shapes

import org.example.Shape

class Point (
    var x: Double,
    var y: Double
) : Shape() {
    fun clone () : Point {
        return Point(x, y)
    }

    override fun move(deltaX: Double, deltaY: Double) {
        x += deltaX
        y += deltaY
    }

}