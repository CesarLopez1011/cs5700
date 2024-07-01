import org.example.Shapes.Point
import org.example.Shapes.Line
import org.junit.jupiter.api.Assertions.assertEquals
import kotlin.test.Test
import kotlin.test.assertFails
import kotlin.test.assertFailsWith

class LineTest(){
    @Test
    fun testLineConstruction() {
        val line = Line(Point(3.0, 5.0), Point(3.0, 4.0))
        assertEquals(3.0, line.start.x)
        assertEquals(5.0, line.start.y)
        assertEquals(3.0, line.end.x)
        assertEquals(4.0, line.end.y)
    }
    @Test
    fun testLineMove() {
        val line = Line(Point(3.0, 5.0), Point(3.0, 4.0))
        line.move(2.0, 2.0)
        assertEquals(5.0, line.start.x)
        assertEquals(7.0, line.start.y)
        assertEquals(5.0, line.end.x)
        assertEquals(6.0, line.end.y)
    }
    @Test
    fun testLineLength() {
        val line = Line(Point(3.0, 5.0), Point(3.0, 4.0))
        assertEquals(1.0, line.getLength())
    }
    @Test
    fun testLineSlope(){
        val line = Line(Point(2.0, 5.0), Point(3.0, 4.0))
        assertEquals(-1.0,line.getSlope())
    }
}

