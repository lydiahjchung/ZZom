package io.zzom.controller

import io.zzom.service.HabitsService
import io.zzom.controller.dto.AddHabitsRequest
import io.zzom.entity.Habits
import io.zzom.entity.Schedules
import io.zzom.service.SchedulesService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/habit")
class HabitsController(private val habitsService: HabitsService, private val schedulesService: SchedulesService) {
    @PostMapping
    fun addHabit(@RequestBody requestDto: AddHabitsRequest): Habits {
        val newHabit: Habits = this.habitsService.addHabit(Habits.toEntity(requestDto))
        this.schedulesService.addSchedule(Schedules.toEntity(newHabit.id, requestDto))
        return newHabit
    }

    @GetMapping("/{habitId}")
    fun getHabit(@PathVariable("habitId") habitId: Long): Habits {
        return this.habitsService.getHabit(habitId)
    }
}