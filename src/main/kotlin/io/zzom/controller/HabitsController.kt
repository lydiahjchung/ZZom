package io.zzom.controller

import io.zzom.service.HabitsService
import io.zzom.controller.dto.AddHabitsRequest
import io.zzom.controller.dto.HabitsResponse
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/habit")
class HabitsController(private val habitsService: HabitsService) {
    @PostMapping
    fun addHabit(@RequestBody request: AddHabitsRequest): HabitsResponse {
        return this.habitsService.addHabit(request)
    }

    @GetMapping("/{habitId}")
    fun getHabit(@PathVariable("habitId") habitId: Long): HabitsResponse {
        return this.habitsService.getHabitById(habitId)
    }
}