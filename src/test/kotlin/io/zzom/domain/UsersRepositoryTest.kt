package io.zzom.domain

import io.zzom.web.domain.Users
import io.zzom.web.domain.UsersRepository
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class UsersRepositoryTest {

    @Autowired
    lateinit var usersRepository: UsersRepository

    @Test
    fun load_saved() {
        //given
        val userId: String="lydia"

        usersRepository.save(Users(
            userId = userId
        ))

        //when
        val usersList: List<Users> = usersRepository.findAll()

        //then
        val users: Users = usersList.get(0)

        assertEquals(userId, users.userId)
    }
}