package shapes

import shapes.interfaces.ICloneable
import shapes.interfaces.IMoveable

class Line(private val p1: Point, private val p2: Point): IMoveable, ICloneable<Line> {
    init {
        require(p1.getX() != p2.getX() || p1.getY() != p2.getY()) { "Line cannot have length of zero" }
    }

    fun getP1(): Point = p1.clone()
    fun getP2(): Point = p2.clone()

    fun slope(): Double = (p2.getY() - p1.getY()) / (p2.getX() - p1.getX())

    fun length(): Double = Math.hypot(p2.getX() - p1.getX(), p2.getY() - p1.getY())

    override fun move(dx: Double, dy: Double) {
        p1.move(dx, dy);
        p2.move(dx, dy);
    }

    override fun clone(): Line = Line(p1.clone(), p2.clone())
}