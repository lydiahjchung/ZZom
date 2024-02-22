package io.zzom.service

import io.zzom.web.domain.Habits
import io.zzom.web.domain.HabitsRepository
import io.zzom.web.dto.HabitsAddRequestDto
import io.zzom.web.dto.HabitsResponseDto
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional
import java.util.*

@Service
class HabitsService(private val habitsRepository: HabitsRepository) {
    @Transactional
    fun save(requestDto: HabitsAddRequestDto): HabitsResponseDto {
        var newHabit: Habits = habitsRepository.save(requestDto.toEntity())
        return HabitsResponseDto(newHabit)
    }

//    fun findById(id: Long): HabitsResponseDto {
//
//    }
}