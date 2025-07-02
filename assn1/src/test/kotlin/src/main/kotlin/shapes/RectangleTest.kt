package src.main.kotlin.shapes

import shapes.Rectangle
import kotlin.test.*

class RectangleTest {
    @Test fun testArea() {
        val rect = Rectangle(0.0, 0.0, 4.0, 3.0)
        assertEquals(12.0, rect.area())
    }

    @Test fun testMove() {
        val rect = Rectangle(0.0, 0.0, 4.0, 3.0)
        rect.move(1.0, 2.0)
        assertEquals(1.0, rect.getPoint1().x)
    }

    @Test fun testClone() {
        val rect = Rectangle(0.0, 0.0, 4.0, 3.0)
        val cloned = rect.clone()
        assertEquals(12.0, cloned.area())
    }

    @Test fun testInvalidConstructorArgsThrows() {
        assertFailsWith<IllegalArgumentException> {
            Rectangle(2.0, 3.0, 2.0, 3.0)
        }
    }
}