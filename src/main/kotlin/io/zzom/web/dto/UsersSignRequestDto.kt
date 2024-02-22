package io.zzom.web.dto

import io.zzom.web.domain.Users

class UsersSignRequestDto(
    var userName: String
) {
    fun toEntity(): Users {
        return Users(
            userName = userName,
        )
    }
}