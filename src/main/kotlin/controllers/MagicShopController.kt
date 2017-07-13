package controllers

import entity.Magic
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RestController
import repositories.MagicShopRepository

/**
 * Created by kritiuns on 09/07/17.
 */

@RestController
@RequestMapping("/magic-shop")
class MagicShopController @Autowired constructor(val magicShopRepository: MagicShopRepository){

    @RequestMapping("/listAll", method = arrayOf(RequestMethod.GET))
    fun findAll(): List<Magic>{
        return magicShopRepository.findAll()
    }
}