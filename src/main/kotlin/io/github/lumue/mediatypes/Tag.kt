package io.github.lumue.mediatypes

import com.fasterxml.jackson.annotation.JsonProperty

data class Tag(
        @JsonProperty("id") val id: String,
        @JsonProperty("name") val name: String
)