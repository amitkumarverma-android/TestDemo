package com.mmi.presentation.mappers


import com.mmi.domain.entities.DomainEntities.*
import com.mmi.presentation.models.*

fun MatchResponse.map() = DomainMatchResponse(
    matches = matches.map { it.map() }
)

fun DomainMatchResponse.map() = MatchResponse(
    matches = matches.map {
        it.map()
    }
)

fun Match.map() = DomainMatch(
    id = id,
    competition = competition?.map(),
    season = season.map(),
    utcDate = utcDate,
    status = status,
    matchday = matchday,
    stage = stage,
    group = group,
    lastUpdated = lastUpdated,
    score = score.map(),
    homeTeam = homeTeam.map(),
    awayTeam = awayTeam.map()
)

fun DomainMatch.map() = Match(
    id = id,
    competition = competition?.map(),
    season = season.map(),
    utcDate = utcDate,
    status = status,
    matchday = matchday,
    stage = stage,
    group = group?:"",
    lastUpdated = lastUpdated,
    score = score.map(),
    homeTeam = homeTeam.map(),
    awayTeam = awayTeam.map()
)

fun Season.map() = DomainSeason(id = id, startDate = startDate, endDate = endDate)

fun DomainSeason.map() = Season(id = id, startDate = startDate, endDate = endDate)

fun Score.map() =
    DomainScore(halfTime = halfTime.map(), fullTime = fullTime.map(), duration = duration)

fun DomainScore.map() =
    Score(halfTime = halfTime.map(), fullTime = fullTime.map(), duration = duration)

fun SubScores.map() = DomainSubScores(homeTeam = homeTeam, awayTeam = awayTeam)

fun DomainSubScores.map() = SubScores(homeTeam = homeTeam, awayTeam = awayTeam)

fun SubTeams.map() = DomainSubTeams(id = id, name = name)

fun DomainSubTeams.map() = SubTeams(id = id, name = name)

fun CompetitionResponse.map() = DomainCompetitionResponse(
    competitions = competitions.map { it.map() }
)

fun DomainCompetitionResponse.map() = CompetitionResponse(
    competitions = competitions.map { it.map() }
)

fun Competitions.map() =
    DomainCompetitions(id = id, name = name, currentSeason = currentSeason.map())

fun DomainCompetitions.map() =
    Competitions(id = id, name = name, currentSeason = currentSeason.map())




