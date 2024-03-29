package io.zzom.domain

import io.zzom.web.domain.Day
import io.zzom.entity.Habits
import io.zzom.repository.HabitsRepository
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class HabitsRepositoryTest() {

    @Autowired
    lateinit var habitsRepository: HabitsRepository

    @Test
    fun load_saved() {
        //given
        val habit: String = "drink water"
        val day: Day = Day.MON
        val alertTime: String = "19:30"
        val userId: Long = 290L

        habitsRepository.save(
            Habits(
            habit = habit,
            day = day,
            alertTime = alertTime,
            userId = userId
        )
        )

        //when
        val habitsList: List<Habits> = habitsRepository.findAll()

        //then
        val habits: Habits = habitsList.get(0)
        assertEquals(habit, habits.habit)
        assertEquals(day, habits.day)
        assertEquals(alertTime, habits.alertTime)
        assertEquals(userId, habits.userId)

        habitsRepository.deleteAll()
    }
}