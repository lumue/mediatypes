package io.github.lumue.mediatypes

import com.fasterxml.jackson.annotation.JsonProperty
import java.time.LocalDateTime
import java.time.LocalDate
import java.time.Duration

data class Movie(
        @JsonProperty("id") val id: String,
        @JsonProperty("dateadded") val dateadded: LocalDateTime,
        @JsonProperty("runtime") val duration: Duration,
        @JsonProperty("streamdetails") val streamdetails: Streamdetails,
        @JsonProperty("label") var label: String,
        @JsonProperty("title") var title: String,
        @JsonProperty("originaltitle") var originaltitle: String,
        @JsonProperty("tagline") var tagline: String,
        @JsonProperty("thumbnail") var thumbnail: String,
        @JsonProperty("cast") val cast: MutableList<Person> = mutableListOf(),
        @JsonProperty("director") val director: MutableList<Person> = mutableListOf(),
        @JsonProperty("writer") val writer: MutableList<Person> = mutableListOf(),
        @JsonProperty("country") val country: MutableList<Country> = mutableListOf(),
        @JsonProperty("genre") var genre: MutableList<Genre> = mutableListOf(),
        @JsonProperty("imdbnumber") var imdbnumber: String,
        @JsonProperty("lastplayed") var lastplayed: LocalDateTime,
        @JsonProperty("mpaa") var mpaa: String,
        @JsonProperty("playcount") var playcount: Int,
        @JsonProperty("plot") var plot: String,
        @JsonProperty("plotoutline") var plotoutline: String,
        @JsonProperty("premiered") var premiered: LocalDate,
        @JsonProperty("resume") var resume: ResumePosition,
        @JsonProperty("studio") val studio: MutableList<Studio> = mutableListOf(),
        @JsonProperty("tag") val tag: MutableList<Tag> = mutableListOf(),
        @JsonProperty("userrating") var userrating: Int,
        @JsonProperty("votes") var votes: String,
        @JsonProperty("rating") var rating: Int
) {


    data class ResumePosition(
            @JsonProperty("position") val position: Double,
            @JsonProperty("total") val total: Double
    )


    data class Streamdetails(
            @JsonProperty("audioformat") val audioformat: MutableList<Audioformat> = mutableListOf(),
            @JsonProperty("videoformat") val videoformat: MutableList<Videoformat> = mutableListOf()
    )

}