package repository

import entity.Player
import org.springframework.data.jpa.repository.JpaRepository

/**
 * Created by kritiuns on 09/07/17.
 */
interface PlayerRepository : JpaRepository<Player, Long> {
}