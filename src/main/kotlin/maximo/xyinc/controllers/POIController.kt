package maximo.xyinc.controllers

import maximo.xyinc.models.POI
import maximo.xyinc.repositories.POIRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/POIs")
class POIController {
    @Autowired
    lateinit var poiRepository: POIRepository

    @GetMapping("/list")
    fun index(): List<POI> {
        return poiRepository.findAll().toList()
    }

    @PostMapping("/create")
    fun store(@RequestBody poi: POI): POI {
        return poiRepository.save(poi)
    }

}

