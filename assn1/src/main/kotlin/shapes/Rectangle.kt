package shapes

import shapes.interfaces.ICloneable
import shapes.interfaces.IClosedShape
import shapes.interfaces.IMoveable

open class Rectangle(private val p1: Point, private val p2: Point) : IMoveable, ICloneable<Rectangle>, IClosedShape {
    init {
        require(p1.x != p2.x && p1.y != p2.y) { "Rectangle must have non-zero width and height" }
    }

    constructor(x1: Double, y1: Double, x2: Double, y2: Double) : this(Point(x1, y1), Point(x2, y2))

    fun getP1(): Point = p1.clone()
    fun getP2(): Point = p2.clone()

    override fun area(): Double = kotlin.math.abs((p2.x - p1.x) * (p2.y - p1.y))

    override fun move(dx: Double, dy: Double) {
        p1.move(dx, dy)
        p2.move(dx, dy)
    }

    override fun clone(): Rectangle = Rectangle(p1.clone(), p2.clone())
}