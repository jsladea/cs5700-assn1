package src.main.kotlin.shapes

import shapes.Point
import shapes.Triangle
import kotlin.test.*

class TriangleTest {
    @Test fun testArea() {
        val tri = Triangle(Point(0.0, 0.0), Point(4.0, 0.0), Point(0.0, 3.0))
        assertEquals(6.0, tri.area(), 0.0001)
    }

    @Test fun testMove() {
        val tri = Triangle(Point(0.0, 0.0), Point(4.0, 0.0), Point(0.0, 3.0))
        tri.move(1.0, 1.0)
        assertEquals(1.0, tri.getP1().x)
        assertEquals(1.0, tri.getP1().y)
        assertEquals(5.0, tri.getP2().x)
        assertEquals(1.0, tri.getP2().y)
        assertEquals(1.0, tri.getP3().x)
        assertEquals(4.0, tri.getP3().y)
    }

    @Test fun testClone() {
        val tri = Triangle(Point(0.0, 0.0), Point(4.0, 0.0), Point(0.0, 3.0))
        val cloned = tri.clone()
        assertEquals(6.0, cloned.area(), 0.0001)
    }

    @Test fun testInvalidConstructorArgsThrows() {
        assertFailsWith<IllegalArgumentException> {
            Triangle(Point(0.0, 0.0), Point(1.0, 1.0), Point(2.0, 2.0))
        }
    }
}