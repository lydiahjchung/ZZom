package io.zzom.service

import io.zzom.entity.Habits
import io.zzom.entity.Schedules
import io.zzom.repository.SchedulesRepository
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
class SchedulesService(private val schedulesRepository: SchedulesRepository) {
    @Transactional
    fun addSchedule(schedule: Schedules): Schedules {
        return this.schedulesRepository.save(schedule)
    }
}