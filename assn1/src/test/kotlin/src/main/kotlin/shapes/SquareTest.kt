package src.main.kotlin.shapes

import shapes.Square
import kotlin.test.*

class SquareTest {
    @Test fun testArea() {
        val square = Square(1.0, 2.0, 5.0)
        assertEquals(25.0, square.area())
    }

    @Test fun testMove() {
        val square = Square(1.0, 2.0, 5.0)
        val x2 = square.getPoint2().x;
        val y2 = square.getPoint2().y;
        square.move(-1.0, -2.0)
        assertEquals(0.0, square.getPoint1().x)
        assertEquals(0.0, square.getPoint1().y)
        assertEquals(x2-1.0, square.getPoint2().x)
        assertEquals(y2-2.0, square.getPoint2().y)
    }

    @Test fun testClone() {
        val square = Square(1.0, 2.0, 5.0)
        val cloned = square.clone()
        assertEquals(25.0, cloned.area())
    }

    @Test fun testInvalidConstructorArgsThrows() {
        assertFailsWith<IllegalArgumentException> {
            Square(1.0, 1.0, 0.0)
        }
    }
}