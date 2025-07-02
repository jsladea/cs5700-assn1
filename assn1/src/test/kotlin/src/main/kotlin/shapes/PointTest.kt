package src.main.kotlin.shapes

import shapes.Point
import kotlin.test.*

class PointTest {
    @Test
    fun testMoveX() {
        val p = Point(2.0, 3.0)
        p.move(1.0, 0.0)
        assertEquals(3.0, p.x)
    }

    @Test
    fun testMoveY() {
        val p = Point(2.0, 3.0)
        p.move(0.0, -1.0)
        assertEquals(2.0, p.y)
    }

    @Test
    fun testClone() {
        val p = Point(2.0, 3.0)
        val p2 = p.clone()
        assertEquals<Double>(p.x, p2.x)
        assertEquals<Double>(p.y, p2.y)
        assertNotSame<Point>(p, p2)
    }
}