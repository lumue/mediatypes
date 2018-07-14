package io.github.lumue.mediatypes

import com.fasterxml.jackson.annotation.JsonProperty
import java.time.Duration

data class Videoformat(
        @JsonProperty("aspect") val aspect: Double,
        @JsonProperty("codec") val codec: String,
        @JsonProperty("duration") val duration: Duration,
        @JsonProperty("height") val height: Int,
        @JsonProperty("language") val language: String,
        @JsonProperty("stereomode") val stereomode: String,
        @JsonProperty("width") val width: Int
)