package io.zzom.web.dto

import io.zzom.web.domain.Users

class UsersSignRequestDto(
    var userId: String
) {
    fun toEntity(): Users {
        return Users(
            userId = userId,
        )
    }
}