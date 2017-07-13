package repository

import entity.Equip
import org.springframework.data.jpa.repository.JpaRepository

/**
 * Created by kritiuns on 11/07/17.
 */
interface EquipShopRepository: JpaRepository<Equip, Long> {
}