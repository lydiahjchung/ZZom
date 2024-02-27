package io.zzom.service

import io.zzom.repository.HabitsRepository
import io.zzom.controller.dto.AddHabitsRequest
import io.zzom.entity.Habits
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
class HabitsService(private val habitsRepository: HabitsRepository) {
    @Transactional
    fun addHabits(habit: Habits): Habits {
        return this.habitsRepository.save(habit)
    }

//    fun findById(id: Long): HabitsResponseDto {
//
//    }
}