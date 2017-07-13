package enums

/**
 * Created by kritiuns on 09/07/17.
 */
enum class FarmEnum(name: String,
                    advantageATK: Int,
                    advantageDEF: Int,
                    bonusGold: Int,
                    bonusXP: Int,
                    lifeBonus: Int) {
    INSIDEVILLAGE("Inside my village", 0, 0, 0, 0, 3),
    CLOSEVILLAGE("Close to my village", 2, 2, 2, 2, -2),
    FARVILLAGE("Far from my village", -3, -3, 10, 10, -5)
}