package shapes

import shapes.interfaces.ICloneable
import shapes.interfaces.IMoveable
import kotlin.math.hypot

class Line(private val p1: Point, private val p2: Point): IMoveable, ICloneable<Line> {
    init {
        require(p1.x != p2.x || p1.y != p2.y) { "Line cannot have length of zero" }
    }

    constructor(x1: Double, y1: Double, x2: Double, y2: Double) : this(Point(x1, y1), Point(x2, y2))

    fun getP1(): Point = p1.clone()
    fun getP2(): Point = p2.clone()

    fun slope(): Double = (p2.y - p1.y) / (p2.x - p1.x)

    fun length(): Double = hypot(p2.x - p1.x, p2.y - p1.y)

    override fun move(dx: Double, dy: Double) {
        p1.move(dx, dy);
        p2.move(dx, dy);
    }

    override fun clone(): Line = Line(p1.clone(), p2.clone())
}