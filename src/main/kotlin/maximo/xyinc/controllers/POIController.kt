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
        // tentativa de fazer uma validação, caso um POI ja exista, porém nao consegui dar um response 400, apeneas consigo disparar um 500
//        val poiExists: POI = poiRepository.findPOIByNameAndXAndY(poi.name, poi.x, poi.y)
//
//        if(poiExists != emptyList<POI>().toList()) {
//            return error("POI already exists!")
//        }

        return poiRepository.save(poi)
    }

}


