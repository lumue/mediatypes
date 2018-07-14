package io.github.lumue.mediatypes

import com.fasterxml.jackson.annotation.JsonProperty

data class Person(
        @JsonProperty("id") val id: String,
        @JsonProperty("name") val name: String,
        @JsonProperty("firstname") val firstname: String
)