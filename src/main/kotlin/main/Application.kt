package main

import entity.Equip
import entity.Player
import entity.Summoner
import enums.ElementEnum
import enums.EquipTypeEnum
import enums.FarmEnum
import enums.ProfessionEnum
import org.slf4j.LoggerFactory
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.domain.EntityScan
import org.springframework.context.annotation.Bean
import org.springframework.data.jpa.repository.config.EnableJpaRepositories
import repository.EquipShopRepository
import repository.PlayerRepository
import repository.SummonerRepository
import java.util.*

/**
 * Created by kritiuns on 09/07/17.
 */
@SpringBootApplication
@EnableJpaRepositories("repository")
@EntityScan("entity")
open class Application{

    private val log = LoggerFactory.getLogger(Application::class.java)
    @Bean
    open fun init(playerRepository: PlayerRepository, equipRepository: EquipShopRepository, summonerRepository: SummonerRepository) = CommandLineRunner{
        //Starting test...
        var armor = Equip("Test armor", 0, 1, ElementEnum.NON, 5.0, 0.0, EquipTypeEnum.ARMOR)
        var weapon = Equip("Test Sword", 1, 0, ElementEnum.NON, 5.0, 0.0, EquipTypeEnum.WEAPON)
        armor = equipRepository.save(armor)
        weapon = equipRepository.save(weapon)

        var equips:List<Equip> = mutableListOf(armor, weapon)

        var summoner = Summoner("Kritiuns", ProfessionEnum.KNIGHT, weapon, armor,
                10.0, 1, 100, FarmEnum.INSIDEVILLAGE, equips)
        summoner = summonerRepository.save(summoner)
        var date = Date().time

        playerRepository.save(Player("kritiuns", "12345", "lustreet@gmail.com", summoner ,date, date))
    }

    companion object {
        @JvmStatic fun main(args: Array<String>) {
            SpringApplication.run(Application::class.java, *args)
        }
    }
}