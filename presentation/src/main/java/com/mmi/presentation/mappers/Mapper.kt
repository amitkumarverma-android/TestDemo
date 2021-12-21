package com.mmi.presentation.mappers


import com.mmi.domain.entities.DomainEntities.*
import com.mmi.presentation.models.Match
import com.mmi.presentation.models.MatchResponse

fun MatchResponse.map() = DomainMatchResponse(
    matches = matches.map { it.map() }
)

fun DomainMatchResponse.map() = MatchResponse(
    matches = matches.map { it.map() }
)

fun Match.map() = DomainMatch(
    id = id,
   /* competition = competition?.map(),
    season = season.map(),*/
    utcDate = utcDate,
    status = status,
    matchday = matchday,
    stage = stage,
    group = group,
    lastUpdated = lastUpdated
  /*  score = score.map(),
    homeTeam = homeTeam.map(),
    awayTeam = awayTeam.map()*/
)

fun DomainMatch.map() = Match(
    id = id,
   /* competition = competition?.map(),
    season = season.map(),*/
    utcDate = utcDate,
    status = status,
    matchday = matchday,
    stage = stage,
    group = group,
    lastUpdated = lastUpdated
  /*  score = score.map(),
    homeTeam = homeTeam.map(),
    awayTeam = awayTeam.map()*/
)

