package shapes

class Circle(center: Point, radius: Double) : Ellipse(center, radius, radius) {
    override fun clone(): Circle = Circle(getCenter(), getR1())
}