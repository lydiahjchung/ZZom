package io.zzom

import io.zzom.web.domain.Day
import io.zzom.web.domain.HabitsRepository
import io.zzom.web.dto.HabitsAddRequestDto
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.test.web.client.TestRestTemplate
import org.springframework.boot.test.web.server.LocalServerPort

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class HabitsControllerTest {

    @LocalServerPort
    private val port: Int?=null

    @Autowired
    lateinit var restTemplate: TestRestTemplate

    @Autowired
    lateinit var habitsRepository: HabitsRepository

    @Test
    fun add_habits(): Unit {
        //given
        val habit: String = "drink water"
        val day: Day = Day.MON
        val alertTime = "19:30"
        val userId = "lydia"

        var requestDto: HabitsAddRequestDto = HabitsAddRequestDto(
            habit = habit,
            day = day,
            alertTime = alertTime,
            userId = userId
        )

        //when
        //then
    }

}