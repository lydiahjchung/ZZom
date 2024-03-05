package io.zzom.repository

import io.zzom.entity.Users
import org.springframework.data.jpa.repository.JpaRepository

interface UsersRepository: JpaRepository<Users, Long> {
}