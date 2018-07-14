package io.github.lumue.mediatypes

import com.fasterxml.jackson.annotation.JsonProperty

data class Studio(
        @JsonProperty("id") val id: String,
        @JsonProperty("name") val name: String
)