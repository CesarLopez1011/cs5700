package org.example.Shapes

import org.example.Shape

class Line(
    var start: Point,
    var end: Point
) : Shape() {

    init {
        //verify that points are not the same making it have a zero length.
        require(start.x != end.x || start.y != end.y) {
            "A line cannot have 0 length"
        }
    }
    fun getSlope():Double{
        return (end.y - start.y) / (end.x - start.x)
    }

    fun getLength():Double{
        return Math.sqrt(Math.pow((end.x - start.x), 2.0) + Math.pow((end.y - start.y), 2.0))
    }
    override fun move(deltaX: Double, deltaY: Double) {
        start.x += deltaX
        start.y += deltaY
        end.x += deltaX
        end.y += deltaY
    }
}