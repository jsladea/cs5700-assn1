package shapes

import shapes.interfaces.ICloneable
import shapes.interfaces.IMoveable

class Point(private var _x: Double, private var _y: Double): IMoveable, ICloneable<Point> {
    var x: Double
        get() = _x
        private set(value) { _x = value}

    var y:Double
        get() = _y
        private set(value) { _y = value}

    override fun move(dx: Double, dy: Double) {
        _x += dx
        _y += dy
    }

    override fun clone(): Point = Point(_x, _y);
}