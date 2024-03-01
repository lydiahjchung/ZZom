package io.zzom.controller

import io.zzom.controller.dto.UserHabitsResponse
import io.zzom.service.UsersService
import io.zzom.controller.dto.SignUpRequest
import io.zzom.entity.Users
import io.zzom.service.HabitsService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/user")
class UserController(private val usersService: UsersService) {
    @PostMapping
    fun signUp(@RequestBody requestDto: SignUpRequest): Users {
        return this.usersService.signUp(Users.toEntity(requestDto))
    }

    @GetMapping("/{userId}/habits")
    fun getHabits(@PathVariable("userId") userId: Long): Unit { //나중에 List?
        // findbyuserid 로 유저아이디가 가진 해빗아이디 찾고
        // 해빗 아이디로 스케쥴에서 스케쥴 다 뽑기 )
        return this.usersService.getHabits(userId)
    }
}