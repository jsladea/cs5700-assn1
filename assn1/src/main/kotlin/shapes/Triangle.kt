package shapes

import shapes.interfaces.IMoveable
import shapes.interfaces.ICloneable
import shapes.interfaces.IClosedShape

class Triangle(private val p1: Point, private val p2: Point, private val p3: Point) : IMoveable, ICloneable<Triangle>, IClosedShape {
    init {
        val area = 0.5 * kotlin.math.abs(
            p1.x * (p2.y - p3.y) +
                    p2.x * (p3.y - p1.y) +
                    p3.x * (p1.y - p2.y)
        )
        require(area > 0.0) { "Triangle area must be non-zero" }
    }

    fun getP1(): Point = p1.clone()
    fun getP2(): Point = p2.clone()
    fun getP3(): Point = p3.clone()

    override fun area(): Double = 0.5 * kotlin.math.abs(
        p1.x * (p2.y - p3.y) +
                p2.x * (p3.y - p1.y) +
                p3.x * (p1.y - p2.y)
    )

    override fun move(dx: Double, dy: Double) {
        p1.move(dx, dy)
        p2.move(dx, dy)
        p3.move(dx, dy)
    }

    override fun clone(): Triangle = Triangle(p1.clone(), p2.clone(), p3.clone())
}