package tofoli.leonardo.avengers.application.web.resource.request

import jakarta.validation.constraints.NotBlank
import jakarta.validation.constraints.NotEmpty
import jakarta.validation.constraints.NotNull
import tofoli.leonardo.avengers.domain.avenger.Avenger

data class AvengerRequest(
        @field:NotNull
        @field:NotBlank
        @field:NotEmpty
        val nick: String,

        @field:NotNull
        @field:NotBlank
        @field:NotEmpty
        val person: String,

        val description: String? = "",
        val history: String? = ""
){
        fun toAvenger() = Avenger(null, nick, person, description, history)
}