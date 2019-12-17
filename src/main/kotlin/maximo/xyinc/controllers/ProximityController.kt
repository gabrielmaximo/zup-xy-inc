package maximo.xyinc.controllers

import maximo.xyinc.models.POI
import maximo.xyinc.repositories.POIRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import kotlin.math.sqrt

@RestController
@RequestMapping("/POIs")
class ProximityController {
    @Autowired
    lateinit var poiRepository: POIRepository

    @GetMapping("/proximities")
    fun index(@RequestParam("x") x: Int, @RequestParam("y")  y: Int, @RequestParam("d")  d: Int): List<POI> {
        var distance: Double
        val p: List<POI> = poiRepository.findAll().toList()
        var response: MutableList<POI> = emptyList<POI>().toMutableList()

        for(e in p) {
            distance = sqrt((((x - e.x) * (x - e.x)) + ((y - e.y) * (y - e.y))).toDouble())

            if(distance <= d) {
                response.add(e)
            }
        }

        return response
    }

}