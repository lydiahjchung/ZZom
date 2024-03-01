package io.zzom.service

import io.zzom.entity.Users
import io.zzom.repository.UsersRepository
import io.zzom.controller.dto.SignUpRequest
import io.zzom.entity.Habits
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
class UsersService(private val usersRepository: UsersRepository) {
    @Transactional
    fun signUp(user: Users): Users {
        return this.usersRepository.save(user)
    }

    @Transactional(readOnly = true)
    fun getHabits(userId: Long): Unit {
        //유저 아이디로 해빗 찾는 방법을 찾아내야 . . .

        return
    }
}