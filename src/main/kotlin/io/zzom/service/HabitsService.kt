package io.zzom.service

import io.zzom.repository.HabitsRepository
import io.zzom.controller.dto.AddHabitsRequest
import io.zzom.controller.dto.HabitsResponse
import io.zzom.entity.Habits
import io.zzom.entity.Schedules
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
class HabitsService(private val habitsRepository: HabitsRepository, private val schedulesService: SchedulesService) {
    @Transactional
    fun addHabit(request: AddHabitsRequest): HabitsResponse {
        val newHabit = this.habitsRepository.save(Habits.of(request.userId, request.habit))
        request.day.forEach{ day -> this.schedulesService.addSchedule(Schedules.of(newHabit.id, day, request.alertTime))}

        return HabitsResponse(newHabit.id, request.userId, request.habit, request.day, request.alertTime)
    }

    @Transactional(readOnly = true)
    fun getHabitById(habitId: Long): HabitsResponse {
        val habit = this.habitsRepository.findById(habitId).orElseThrow()
        val schedules = this.schedulesService.getSchedules(habitId)
        val days = schedules.map { it.day }

        return HabitsResponse(habitId, habit.userId, habit.habit, days, schedules.get(0).alertTime)
    }

    @Transactional(readOnly = true)
    fun getHabitsByUserId(userId: Long): List<Habits> {
        return this.habitsRepository.findAllByUserId(userId)
    }
}