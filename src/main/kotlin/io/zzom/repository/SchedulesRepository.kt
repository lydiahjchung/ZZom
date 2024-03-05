package io.zzom.repository

import io.zzom.entity.Schedules
import org.springframework.data.jpa.repository.JpaRepository
import java.time.DayOfWeek
import java.time.LocalTime

interface SchedulesRepository: JpaRepository<Schedules, Long> {

    fun findAllByHabitId(habitId: Long): List<Schedules>

    fun findAllByDayAndAlertTime(day: DayOfWeek, alertTime: LocalTime): List<Schedules>
}