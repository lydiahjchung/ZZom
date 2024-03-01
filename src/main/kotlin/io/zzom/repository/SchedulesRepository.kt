package io.zzom.repository

import io.zzom.entity.Schedules
import org.springframework.data.jpa.repository.JpaRepository

interface SchedulesRepository: JpaRepository<Schedules, Long> {
}