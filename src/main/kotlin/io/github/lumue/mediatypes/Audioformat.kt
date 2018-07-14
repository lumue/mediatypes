package io.github.lumue.mediatypes

import com.fasterxml.jackson.annotation.JsonProperty

data class Audioformat(
        @JsonProperty("channels") val channels: Int,
        @JsonProperty("codec") val codec: String,
        @JsonProperty("language") val language: String
)