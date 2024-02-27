package io.zzom.domain

import io.zzom.entity.Users
import io.zzom.repository.UsersRepository
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest

@DataJpaTest
class UsersRepositoryTest {

    @Autowired
    lateinit var usersRepository: UsersRepository

    @Test
    fun save() {
        //given
        val userName: String = "lydia"

        //when
        var newUser = usersRepository.save(
                Users(
                    userName = userName
                )
            )

        //then
//        assertThat(newUser, is(Users))
    }
}