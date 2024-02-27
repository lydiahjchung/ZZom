package io.zzom.controller.dto

import io.zzom.entity.Users

data class SignUpRequest(
    var userName: String
) {
    fun toEntity(): Users {
        return Users(
            userName = userName,
        )
    }
}