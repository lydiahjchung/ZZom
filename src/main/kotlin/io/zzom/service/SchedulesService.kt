package io.zzom.service

import io.zzom.entity.Habits
import io.zzom.entity.Schedules
import io.zzom.repository.SchedulesRepository
import org.springframework.scheduling.annotation.Scheduled
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional
import java.time.LocalTime
import java.time.ZonedDateTime

@Service
class SchedulesService(private val schedulesRepository: SchedulesRepository) {
    @Transactional
    fun addSchedule(schedule: Schedules): Schedules {
        return this.schedulesRepository.save(schedule)
    }

    @Transactional(readOnly = true)
    fun getSchedules(habitId: Long): List<Schedules> {
        return this.schedulesRepository.findAllByHabitId(habitId)
    }

    @Scheduled(fixedDelay = 60000) // every minute
    fun check(): Unit {
        val now = ZonedDateTime.now()
        val day = now.dayOfWeek
//        val time = now.format(DateTimeFormatter.ofPattern("HH:mm"))
        val time = LocalTime.of(20, 20)
        var checking = this.schedulesRepository.findAllByDayAndAlertTime(day, time)

        return
    }
}