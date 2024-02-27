package io.zzom.repository

import io.zzom.entity.Habits
import org.springframework.data.jpa.repository.JpaRepository

interface HabitsRepository: JpaRepository<Habits, Long> {
}