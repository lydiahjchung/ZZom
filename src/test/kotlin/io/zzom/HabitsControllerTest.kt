package io.zzom

import io.zzom.web.domain.Day
import io.zzom.repository.HabitsRepository
import io.zzom.controller.dto.AddHabitsRequest
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
        val userId = 290L

        var requestDto: AddHabitsRequest = AddHabitsRequest(
            habit = habit,
            day = day,
            alertTime = alertTime,
            userId = userId
        )

        //when
        //then
    }

}