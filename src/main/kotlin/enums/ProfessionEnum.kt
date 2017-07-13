package enums

/**
 * Created by kritiuns on 09/07/17.
 */
enum class ProfessionEnum(name: String,
          element: ElementEnum,
          strength:Int,
          defense:Int,
          magicPower:Int,
          magicDefense:Int,
          bonusLife:Int) {

    WIZARD("Wizard", ElementEnum.FIRE, 0, 2, 10, 5, 2),
    PALADIN("Paladin", ElementEnum.AIR, 5, 0, 5, 2, 5),
    KNIGHT("Knight", ElementEnum.NON, 10, 5, 0, 2, 7),
    DRUID("Druid", ElementEnum.WATER, 0, 2, 5, 10, 2),
    BARBARIAN("Barbarian", ElementEnum.EARTH, 5, 10, 0, 2, 8)
}