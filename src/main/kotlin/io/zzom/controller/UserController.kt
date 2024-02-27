package io.zzom.controller

import io.zzom.service.UsersService
import io.zzom.controller.dto.SignUpRequest
import io.zzom.entity.Users
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/user")
class UserController(private val usersService: UsersService) {
    @PostMapping
    fun signUp(@RequestBody requestDto: SignUpRequest): Users {
        return usersService.signUp(Users.toEntity(requestDto))
    }
}