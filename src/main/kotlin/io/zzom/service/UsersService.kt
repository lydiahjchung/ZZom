package io.zzom.service

import io.zzom.entity.Users
import io.zzom.repository.UsersRepository
import io.zzom.controller.dto.SignUpRequest
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
class UsersService(private val usersRepository: UsersRepository) {
    @Transactional
    fun signUp(user: Users): Users {
        return this.usersRepository.save(user)
    }
}