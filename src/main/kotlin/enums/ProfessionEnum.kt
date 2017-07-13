package enums

/**
 * Created by kritiuns on 09/07/17.
 */
enum class ProfessionEnum(id:Int,
          name: String,
          element: ElementEnum,
          strength:Int,
          defense:Int,
          magicPower:Int,
          magicDefense:Int,
          bonusLife:Int) {

    WIZARD(0, "Wizard", ElementEnum.FIRE, 0, 2, 10, 5, 2),
    PALADIN(1, "Paladin", ElementEnum.AIR, 5, 0, 5, 2, 5),
    KNIGHT(2, "Knight", ElementEnum.NON, 10, 5, 0, 2, 7),
    DRUID(3, "Druid", ElementEnum.WATER, 0, 2, 5, 10, 2),
    BARBARIAN(4, "Barbarian", ElementEnum.EARTH, 5, 10, 0, 2, 8)
}