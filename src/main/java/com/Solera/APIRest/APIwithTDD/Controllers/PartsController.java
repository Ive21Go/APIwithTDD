package com.Solera.APIRest.APIwithTDD.Controllers;

import com.Solera.APIRest.APIwithTDD.Models.PartsClass;
import com.Solera.APIRest.APIwithTDD.Models.VehiclesClass;
import com.Solera.APIRest.APIwithTDD.Repository.PartsRepository;
import com.Solera.APIRest.APIwithTDD.Repository.VehiclesRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/API/Parts")

public class PartsController {

    //private PartsRepository partsRepository;
    private PartsRepository partsRepository;
    public void First (PartsRepository crudMethods){partsRepository = crudMethods;}

    // CRUD methods (Create, Read, Update, Delete)
    @GetMapping("/Parts/{id}")
    public String getPartsId (@PathVariable Long id) {
        PartsClass PartsService = partsRepository.findById(id);
        // Check if the part exists
        if(partsRepository == null) {
            return "Part with ID " + id + " not found.";
        }
        return "Part found: " + partsRepository.findById(id);
    }
    @PostMapping("/Parts/all")
    public ResponseEntity<String> postMappingVehicle (@RequestBody PartsRepository partsRepository) {
        return null;
    }

    @DeleteMapping("/Vehicles/{id}")
    public String deletePartsById (@PathVariable Long id) {
        partsRepository.deleteById(id);
        return "Parts with ID " + id + " has been deleted successfully";
    }
}
