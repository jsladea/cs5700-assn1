package src.main.kotlin.shapes

import shapes.Ellipse
import shapes.Point
import kotlin.test.*
import kotlin.math.PI

class EllipseTest {
    @Test fun testArea() {
        val e = Ellipse(Point(0.0, 0.0), 3.0, 2.0)
        assertEquals(PI * 3 * 2, e.area(), 0.0001)
    }

    @Test fun testMove() {
        val e = Ellipse(Point(0.0, 0.0), 3.0, 2.0)
        e.move(5.0, 5.0)
        assertEquals(5.0, e.getCenter().x)
    }

    @Test fun testClone() {
        val e = Ellipse(Point(0.0, 0.0), 3.0, 2.0)
        val cloned = e.clone()
        assertEquals(PI * 3 * 2, cloned.area(), 0.0001)
    }

    @Test fun testInvalidConstructorArgsThrows() {
        assertFailsWith<IllegalArgumentException> {
            Ellipse(Point(0.0, 0.0), 0.0, 5.0)
        }
    }
}