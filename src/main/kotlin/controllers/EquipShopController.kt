package controllers

import entity.Equip
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RestController
import repository.EquipShopRepository

/**
 * Created by kritiuns on 09/07/17.
 */

@RestController
@RequestMapping("/equip-shop")
class EquipShopController @Autowired constructor(val equipShopRepository: EquipShopRepository){

    @RequestMapping("/listAll", method = arrayOf(RequestMethod.GET))
    fun findAll(): List<Equip>{
        return equipShopRepository.findAll()
    }
}