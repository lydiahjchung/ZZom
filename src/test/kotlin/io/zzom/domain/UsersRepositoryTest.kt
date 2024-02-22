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
        val userName: String="lydia"

        usersRepository.save(Users(
            userName = userName
        ))

        //when
        val usersList: List<Users> = usersRepository.findAll()

        //then
        val users: Users = usersList.get(0)

        assertEquals(userName, users.userName)
    }
}