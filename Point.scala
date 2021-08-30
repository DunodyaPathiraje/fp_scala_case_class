//19001101 - FP Assignment Case Class

package Case_class
import scala.math._

case class Point(x: Int, y: Int) {
  def a: Int = x
  def b: Int = y

  def add(p:Point):Point = Point(this.x+p.x , this.y+p.y)
  def move(dx:Int, dy:Int):Point = Point(this.x+dx, this.y+dy)
  def distance(p:Point):Double = {
    sqrt(pow(this.x-p.x, 2) + pow(this.y-p.y, 2))
  }
  def invert():Point = Point(this.y, this.x)
}
