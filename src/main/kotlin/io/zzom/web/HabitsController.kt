package io.zzom.web

import io.zzom.service.HabitsService
import io.zzom.web.domain.Habits
import io.zzom.web.dto.HabitsAddRequestDto
import io.zzom.web.dto.HabitsResponseDto
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping
class HabitsController(private val habitsService: HabitsService) {
    @PostMapping("/habit")
    fun add(@RequestBody requestDto: HabitsAddRequestDto): HabitsResponseDto {
        return habitsService.save(requestDto)
    }
}