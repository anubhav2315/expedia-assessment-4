sealed class Shape {
    abstract fun calculateArea(): Double
}

data class Circle(val radius: Double) : Shape() {
    override fun calculateArea(): Double {
        return Math.PI * radius * radius
    }
}

data class Rectangle(val width: Double, val height: Double) : Shape() {
    override fun calculateArea(): Double {
        return width * height
    }
}

fun calculateArea(shape: Shape): Double {
    return shape.calculateArea()
}

fun main() {
    val circle = Circle(radius = 5.0)
    val rectangle = Rectangle(width = 4.0, height = 6.0)

    println("Area of the circle: ${calculateArea(circle)}")
    println("Area of the rectangle: ${calculateArea(rectangle)}")
}
