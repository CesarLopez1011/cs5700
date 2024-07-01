package org.example.Shapes

import org.example.Shape

class Triangle(
    var point1: Point,
    var point2: Point,
    var point3: Point
) : Shape() {
    init {
        require(!areCollinear(point1, point2, point3)) { "A triangle must not have an area of 0" }
    }

    private fun areCollinear(p1: Point, p2: Point, p3: Point): Boolean {
        return (p1.y - p2.y) * (p1.x - p3.x) == (p1.y - p3.y) * (p1.x - p2.x)
    }

    fun getArea(): Double {
        return Math.abs(
            point1.x * (point2.y - point3.y) +
                    point2.x * (point3.y - point1.y) +
                    point3.x * (point1.y - point2.y)
        ) / 2.0
    }

    override fun move(deltaX: Double, deltaY: Double) {
        point1.x += deltaX
        point1.y += deltaY
        point2.x += deltaX
        point2.y += deltaY
        point3.x += deltaX
        point3.y += deltaY


    }
}