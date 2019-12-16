package maximo.xyinc.models

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
class POI (@Id @GeneratedValue val id: Long = 0L, val name: String, val x: Int, val y: Int)