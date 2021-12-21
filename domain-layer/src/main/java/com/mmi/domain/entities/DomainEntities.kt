package com.mmi.domain.entities



import java.util.ArrayList

sealed class DomainEntities {
    /**
     * Data classes for Matches
     */
    data class DomainMatchResponse(
        var matches: List<DomainMatch> = ArrayList()
    ) : DomainEntities()

    data class DomainMatch(
         var id: Long = 0L,
        /*var competition: DomainSubTeams? = null,
        var season: DomainSeason = DomainSeason(),*/
      var utcDate: String = "",
      var status: String = "",
    var matchday: Int = 0,
      var stage: String = "",
      var group: String = "",
     var lastUpdated: String = "",
        /*var score: DomainScore = DomainScore(),
        var homeTeam: DomainSubTeams = DomainSubTeams(),
        var awayTeam: DomainSubTeams = DomainSubTeams()*/
    ) : DomainEntities()


    /**
     * Data classes for Competitions
     */
    data class DomainCompetitionResponse(
        var competitions: List<DomainCompetitions> = ArrayList()
    ) : DomainEntities()


    data class DomainCompetitions(
        var id: Long = 0L,
      var name: String = "",
        /* var currentSeason: DomainSeason = DomainSeason()*/
    ) : DomainEntities()
}