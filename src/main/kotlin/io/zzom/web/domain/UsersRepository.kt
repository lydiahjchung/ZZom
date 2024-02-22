package io.zzom.web.domain

import org.springframework.data.jpa.repository.JpaRepository

interface UsersRepository: JpaRepository<Users, Long> {
}