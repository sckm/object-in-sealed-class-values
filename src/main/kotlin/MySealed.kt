sealed class MySealed {
  object A : MySealed()
  object B : MySealed()
  object C : MySealed()
  object D : MySealed()

  companion object {
    @JvmField
    val values = listOf(
        A,
        B,
        C,
        D
    )
  }
}

val mySealedValues: List<MySealed> = listOf(
    MySealed.A,
    MySealed.B,
    MySealed.C,
    MySealed.D
)