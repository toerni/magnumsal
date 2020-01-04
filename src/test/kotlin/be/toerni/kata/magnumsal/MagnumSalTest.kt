package be.toerni.kata.magnumsal

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test

class MagnumSalTest {

    @Test
    fun `Magnum Sal game can be created`() {
        //given
        val actual = MagnumSal()
        //when

        //then
        Assertions.assertThat(actual).isNotNull
    }
}