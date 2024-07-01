import org.example.Shapes.Point
import org.junit.jupiter.api.Assertions.assertEquals
import kotlin.test.Test

class PointTest {
    @Test
    fun testPointConstruction() {
        val point = Point(3.0, 4.0)
        assertEquals(3.0, point.x)
        assertEquals(4.0, point.y)

    }
    @Test
    fun testPointMove() {
        val point = Point(3.0, 4.0)
        point.move(2.0, 3.0)
        assertEquals(5.0, point.x)
        assertEquals(7.0, point.y)
    }
    @Test
    fun testPointClone() {
        val point = Point(3.0, 4.0)
        val clone = point.clone()
        assertEquals(point.x, clone.x)
        assertEquals(point.y, clone.y)
    }
}