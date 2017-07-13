package entity

import enums.ElementEnum
import enums.EquipTypeEnum
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

/**
 * Created by kritiuns on 09/07/17.
 */
@Entity
data class Equip(
        var name:String,
        var power:Int,
        var defense:Int,
        var element:ElementEnum,
        var priceBuy:Double,
        var priceSell:Double,
        var type:EquipTypeEnum,
        @Id @GeneratedValue(strategy = GenerationType.AUTO)
        var id: Long = 0
)