package controllers

import entity.Player
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RestController
import repositories.PlayerRepository

/**
 * Created by kritiuns on 09/07/17.
 */
@RestController
@RequestMapping("/register")
class RegisterController @Autowired constructor(val playerRepository: PlayerRepository) {

    @RequestMapping("/include-player", method = arrayOf(RequestMethod.POST))
    fun includePlayer(@RequestBody player: Player): String{
        var returnedPlayer = playerRepository.save(player)

        if(returnedPlayer != null){
            return "OK"
        }else{
            return "Error"
        }
    }
}