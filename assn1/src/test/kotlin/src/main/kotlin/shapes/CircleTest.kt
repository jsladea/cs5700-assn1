package src.main.kotlin.shapes

import shapes.Circle
import shapes.Point
import kotlin.test.*
import kotlin.math.PI

class CircleTest {
    @Test fun testArea() {
        val c = Circle(Point(0.0, 0.0), 4.0)
        assertEquals(PI * 16, c.area(), 0.0001)
    }

    @Test fun testMove() {
        val c = Circle(Point(0.0, 0.0), 4.0)
        c.move(-2.0, -2.0)
        assertEquals(-2.0, c.getCenter().x)
    }

    @Test fun testClone() {
        val c = Circle(Point(0.0, 0.0), 4.0)
        val cloned = c.clone()
        assertEquals(PI * 16, cloned.area(), 0.0001)
    }

    @Test fun testInvalidConstructorArgsThrows() {
        assertFailsWith<IllegalArgumentException> {
            Circle(Point(0.0, 0.0), 0.0)
        }
    }
}