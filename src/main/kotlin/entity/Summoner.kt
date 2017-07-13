package entity

import enums.FarmEnum
import enums.ProfessionEnum
import javax.persistence.*

/**
 * Created by kritiuns on 09/07/17.
 */
@Entity
data class Summoner(
     var name:String,
     var profession:ProfessionEnum,
     @ManyToOne
     var equipedWeapon:Equip,
     @ManyToOne
     var equipedArmor:Equip,
     var gold:Double,
     var level:Int,
     var life:Int,
     var farmStats: FarmEnum,
     @ManyToMany
     var equipList: List<Equip>,
     @Id @GeneratedValue(strategy = GenerationType.AUTO)
     var id: Long = 0
)