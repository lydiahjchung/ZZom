package io.zzom.service

import io.zzom.entity.Habits
import io.zzom.entity.Users
import io.zzom.repository.UsersRepository
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
class UsersService(private val usersRepository: UsersRepository, private val habitsService: HabitsService) {
    @Transactional
    fun signUp(user: Users): Users {
        return this.usersRepository.save(user)
    }

    @Transactional(readOnly = true)
    fun getHabits(userId: Long): List<Habits> {
        return this.habitsService.getHabitsByUserId(userId)
    }
}