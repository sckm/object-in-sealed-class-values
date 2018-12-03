import org.hamcrest.CoreMatchers.`is`
import org.junit.Assert.assertThat
import org.junit.Assert.assertTrue
import org.junit.Test

class MySealedTest {
  @Test fun valuesNotNulls() {
    assertThat(MySealed.values.none { it == null }, `is`(true))
  }

  // valuesNotNulls2 だけ実行すると valuesで返却されるリストでMySealed.Bに該当するものがnullになる
  @Test fun valuesNotNulls2() {
    System.out.println(MySealed.B)
    System.out.println(MySealed.values.joinToString())
    assertTrue(MySealed.values.none { it == null })
  }

  @Test fun valuesNotNulls3() {
    assertTrue(mySealedValues.none { it == null })
  }

  @Test fun valuesNotNulls4() {
    System.out.println(MySealed.B)
    System.out.println(mySealedValues.joinToString())
    assertTrue(mySealedValues.none { it == null })
  }
}