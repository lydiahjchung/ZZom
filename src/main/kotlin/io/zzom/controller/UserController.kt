package io.zzom.controller

import io.zzom.controller.dto.SignUpRequest
import io.zzom.entity.Habits
import io.zzom.service.UsersService
import io.zzom.entity.Users
import io.zzom.service.SchedulesService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/user")
class UserController(private val usersService: UsersService, private val schedulesService: SchedulesService) {
    @PostMapping
    fun signUp(@RequestBody request: SignUpRequest): Users {
        return this.usersService.signUp(Users.of(request.userName))
    }

    @GetMapping("/{userId}/habits")
    fun getHabits(@PathVariable("userId") userId: Long): List<Habits> {
        return this.usersService.getHabits(userId)
    }

    @GetMapping
    fun sendNotification(): Unit {
        return this.schedulesService.check()
    }
}