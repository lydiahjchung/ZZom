package io.zzom

import io.zzom.repository.HabitsRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.test.web.client.TestRestTemplate
import org.springframework.boot.test.web.server.LocalServerPort

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class HabitsControllerTest {

    @LocalServerPort
    private val port: Int?=null

    @Autowired
    lateinit var restTemplate: TestRestTemplate

    @Autowired
    lateinit var habitsRepository: HabitsRepository

}