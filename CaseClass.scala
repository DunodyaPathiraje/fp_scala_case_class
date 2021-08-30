//19001101 - FP Assignment Case Class

package Case_class {
  object CaseClass {
    def main(args: Array[String]): Unit = {
      val p1 = Point(2, 0)
      val p2 = Point(5,5)
      val p3 = Point(1,9)


      //1. Add p1+p2
      val p4 = p1.add(p2)
      println("After adding p1 and p2 pints =>"+p4)

      // 2. move a point by given value
      val p5 = p2.move(6,5)
      println("p2 moved by (6,5) => "+p5)

      //3. distance between given two points
      println("Distance between p1 and p2 => "+p1.distance(p2))

      //4. switch coordinate values
      println("Switch p3's x and y coordinates => "+p3.invert())

    }
  }
}

