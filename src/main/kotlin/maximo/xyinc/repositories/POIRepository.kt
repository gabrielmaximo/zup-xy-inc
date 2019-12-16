package maximo.xyinc.repositories

import maximo.xyinc.models.POI
import org.springframework.data.repository.CrudRepository

interface POIRepository : CrudRepository<POI, Long> {
    fun findPOIByNameAndXAndY(name: String, x: Int, y: Int): POI
}