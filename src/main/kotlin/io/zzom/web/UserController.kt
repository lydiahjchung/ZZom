package io.zzom.web

import io.zzom.service.UsersService
import io.zzom.web.dto.UsersAddRequestDto
import io.zzom.web.dto.UsersResponseDto
import io.zzom.web.dto.UsersSignRequestDto
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class UserController {
    lateinit var usersService: UsersService

    @PostMapping("/user")
    fun signUp(@RequestBody requestDto: UsersSignRequestDto): UsersResponseDto {
        return usersService.save(requestDto)
    }
}