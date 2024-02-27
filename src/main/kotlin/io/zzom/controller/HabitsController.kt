package io.zzom.controller

import io.zzom.service.HabitsService
import io.zzom.controller.dto.AddHabitsRequest
import io.zzom.entity.Habits
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/habit")
class HabitsController(private val habitsService: HabitsService) {
    @PostMapping
    fun add(@RequestBody requestDto: AddHabitsRequest): Habits {
        return this.habitsService.addHabits(Habits.toEntity(requestDto))
    }
}