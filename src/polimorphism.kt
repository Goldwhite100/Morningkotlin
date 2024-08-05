 open class Shape{
        open fun draw(){
            println("Drawing a shape")
        }
    }
//Child classes
class Rectangle:Shape(){
    override fun draw() {
        println("Drawing a shape")
}

}
class Circle:Shape(){
    override fun draw(){
        println("Drawing circle")
    }

}

 fun main(){
     var myshape = Shape()
     myshape.draw()

     var myrectangle = Rectangle()
     myrectangle.draw()

     var mycircle = Circle()
     mycircle.draw()

 }