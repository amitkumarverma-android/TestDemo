package com.mmi.presentation.models


import android.os.Parcelable
import kotlinx.android.parcel.Parcelize
import java.util.*

/**
 * Data classes for Matches
 */
data class MatchResponse(
    var matches: List<Match> = ArrayList()
)

@Parcelize
data class Match(
    var id: Long = 0L,
    var competition: SubTeams? = null,
    var season: Season = Season(),
    var utcDate: String = "",
    var status: String = "",
    var matchday: Int = 0,
    var stage: String = "",
    var group: String = "",
    var lastUpdated: String = "",
    var score: Score = Score(),
    var homeTeam: SubTeams = SubTeams(),
    var awayTeam: SubTeams = SubTeams()
) : Parcelable

@Parcelize
data class Season(
    var id: Long = 0L,
    var startDate: String? = "",
    var endDate: String? = ""
) : Parcelable

@Parcelize
data class Score(
    var fullTime: SubScores = SubScores(),
    var halfTime: SubScores = SubScores(),
    var duration: String = ""
) : Parcelable

@Parcelize
data class SubScores(
    var homeTeam: Int? = 0,
    var awayTeam: Int? = 0
) : Parcelable

@Parcelize
data class SubTeams(
    var id: Long = 0L,
    var name: String = ""
) : Parcelable

/**
 * Data classes for Competitions
 */
data class CompetitionResponse(
    var competitions: List<Competitions> = ArrayList()
)

@Parcelize
data class Competitions(
    var id: Long = 0L,
    var name: String = "",
    var currentSeason: Season = Season()
) : Parcelable

