package com.Solera.APIRest.APIwithTDD.Controllers;

import com.Solera.APIRest.APIwithTDD.Models.VehiclesClass;
import com.Solera.APIRest.APIwithTDD.Models.WorkshopClass;
import com.Solera.APIRest.APIwithTDD.Repository.VehiclesRepository;
import com.Solera.APIRest.APIwithTDD.Repository.WorkshopRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/API/Vehicles")

public class VehiclesController {
    //private VehiclesRepository vehiclesRepository;
    private VehiclesRepository vehiclesRepository;
    public void First (VehiclesRepository crudMethods){vehiclesRepository = crudMethods;}

    // CRUD methods (Create, Read, Update, Delete)
    @GetMapping("/Vehicles/{id}")
    public String getWorkshopById (@PathVariable Long id) {
        VehiclesClass vehicleService = vehiclesRepository.findById(id);
        // Check if the Vehicle exists
        if(vehicleService == null) {
            return "Vehicle with ID " + id + " not found.";
        }
        return "Vehicle found: " + vehiclesRepository.findById(id);
    }
    @PostMapping("/Vehicles/all")
    public ResponseEntity<String> postMappingVehicle (@RequestBody VehiclesRepository vehiclesRepository) {
        return null;
    }

    @DeleteMapping("/Vehicles/{id}")
    public String deleteVehicleById (@PathVariable Long id) {
        vehiclesRepository.deleteById(id);
        return "Vehicle with ID " + id + " has been deleted successfully";
    }
}
