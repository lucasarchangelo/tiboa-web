package repository

import entity.Magic
import org.springframework.data.jpa.repository.JpaRepository

/**
 * Created by kritiuns on 11/07/17.
 */
interface MagicShopRepository: JpaRepository<Magic, Long> {
}