package entity

import javax.persistence.*

/**
 * Created by kritiuns on 09/07/17.
 */
@Entity
data class Player(
     var nickName:String,
     var password:String,
     var email:String,
     @OneToOne
     var summoner: Summoner,
     var createdDate: Long,
     var lastLogin: Long,
     @Id @GeneratedValue(strategy = GenerationType.AUTO)
     var id: Long = 0
)