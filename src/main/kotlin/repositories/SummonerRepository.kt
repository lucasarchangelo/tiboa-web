package repositories

import entity.Summoner
import enums.FarmEnum
import org.springframework.data.jpa.repository.JpaRepository

/**
 * Created by kritiuns on 09/07/17.
 */
interface SummonerRepository: JpaRepository<Summoner, Long> {
    fun findByFarmStats(farmStats: FarmEnum):List<Summoner>
}