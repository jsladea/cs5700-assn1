package shapes

import shapes.interfaces.IMoveable
import shapes.interfaces.ICloneable
import shapes.interfaces.IClosedShape

open class Ellipse(private val center: Point, private val r1: Double, private val r2: Double) : IMoveable, ICloneable<Ellipse>, IClosedShape {
    init {
        require(r1 > 0 && r2 > 0) { "Radii must be positive" }
    }

    fun getCenter(): Point = center.clone()
    fun getR1(): Double = r1
    fun getR2(): Double = r2

    override fun area(): Double = Math.PI * r1 * r2

    override fun move(dx: Double, dy: Double) {
        center.move(dx, dy)
    }

    override fun clone(): Ellipse = Ellipse(center.clone(), r1, r2)
}