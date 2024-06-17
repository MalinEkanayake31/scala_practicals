
  def Area(radius: Double): Double = {
    val Pi = Math.PI
    Pi * radius * radius
  }


  def cTof(celsius: Double): Double = {
    celsius * 1.8 + 32.0
  }


  def Volume(radius: Double): Double = {
    val Pi = Math.PI
    (4.0 / 3.0) * Pi * Math.pow(radius, 3)
  }


  def TotalCost(copies: Int): Double = {
    val coverPrice = 24.95
    val discount = 0.4
    val discountedPrice = coverPrice * (1 - discount)
    val shippingCost = if (copies <= 50) {
      3.0
    } else {
      3.0 + (copies - 50) * 0.75
    }
    copies * discountedPrice + shippingCost
  }


  def totalRunningTime(): Int = {
    val easyPace = 8 
    val tempoPace = 7 
    val totalMinutes = (2 * easyPace) + (3 * tempoPace) + (2 * easyPace)
    totalMinutes
  }