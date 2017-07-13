package entity

import enums.ElementEnum
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

/**
 * Created by kritiuns on 09/07/17.
 */
@Entity
data class Magic(
        var name: String,
        var magicPower: Int,
        var element: ElementEnum,
        @Id @GeneratedValue(strategy = GenerationType.AUTO)
        var id: Long = 0
)