package src.main.kotlin.shapes

import shapes.Line
import shapes.Point
import kotlin.test.*

class LineTest {
    @Test fun testLength() {
        val line = Line(0.0, 0.0, 3.0, 4.0)
        assertEquals(5.0, line.length(), 0.0001)
    }

    @Test fun testSlope() {
        val line = Line(0.0, 0.0, 3.0, 4.0)
        assertEquals(4.0 / 3.0, line.slope(), 0.0001)
    }

    @Test fun testMove() {
        val line = Line(0.0, 0.0, 3.0, 4.0)
        line.move(1.0, 1.0)
        assertEquals(1.0, line.getP1().x)
        assertEquals(1.0, line.getP1().y)
        assertEquals(4.0, line.getP2().x);
        assertEquals(5.0, line.getP2().y);
    }

    @Test fun testClone() {
        val line = Line(0.0, 0.0, 3.0, 4.0)
        val cloned = line.clone()
        assertEquals(line.length(), cloned.length(), 0.0001)
        assertNotSame(line, cloned)
    }

    @Test fun testInvalidConstructorArgsThrows() {
        assertFailsWith<IllegalArgumentException> {
            Line(Point(1.0, 1.0), Point(1.0, 1.0))
        }
    }
}