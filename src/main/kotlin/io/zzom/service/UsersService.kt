package io.zzom.service

import io.zzom.web.domain.Habits
import io.zzom.web.domain.Users
import io.zzom.web.domain.UsersRepository
import io.zzom.web.dto.HabitsResponseDto
import io.zzom.web.dto.UsersResponseDto
import io.zzom.web.dto.UsersSignRequestDto
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
class UsersService(private val usersRepository: UsersRepository) {
    @Transactional
    fun save(requestDto: UsersSignRequestDto): UsersResponseDto {
        var newUser: Users = usersRepository.save(requestDto.toEntity())

        return UsersResponseDto(newUser)
    }
}