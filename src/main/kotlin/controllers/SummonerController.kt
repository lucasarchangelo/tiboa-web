package controllers

import entity.Summoner
import enums.FarmEnum
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RestController
import repositories.SummonerRepository

/**
 * Created by kritiuns on 09/07/17.
 */

@RestController
@RequestMapping("/summoners")
class SummonerController @Autowired constructor(val summonerRepository: SummonerRepository){

    @RequestMapping("/listAll", method = arrayOf(RequestMethod.GET))
    fun findAll(): List<Summoner>{
        return summonerRepository.findAll()
    }

    @RequestMapping("/listCloseVillage", method = arrayOf(RequestMethod.GET))
    fun listCloseVillage(): List<Summoner>{
        return summonerRepository.findByFarmStats(FarmEnum.CLOSEVILLAGE)
    }

    @RequestMapping("/listFarVillage", method = arrayOf(RequestMethod.GET))
    fun listFarVillage(): List<Summoner>{
        return summonerRepository.findByFarmStats(FarmEnum.FARVILLAGE)
    }

    @RequestMapping("/listInsideVillage", method = arrayOf(RequestMethod.GET))
    fun listInsideVillage(): List<Summoner>{
        return summonerRepository.findByFarmStats(FarmEnum.INSIDEVILLAGE)
    }
}