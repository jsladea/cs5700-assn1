package shapes

class Square : Rectangle {
    constructor(p1: Point, sideLength: Double) : super(p1, Point(p1.x + sideLength, p1.y + sideLength)) {
        require(sideLength > 0) { "Side length must be positive" }
    }

    constructor(x: Double, y: Double, sideLength: Double) : this(Point(x, y), sideLength)

    override fun clone(): Square = Square(getP1(), getP2().x - getP1().x)
}