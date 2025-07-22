package com.Solera.APIRest.APIwithTDD.Controllers;

import com.Solera.APIRest.APIwithTDD.Models.WorkshopClass;
import com.Solera.APIRest.APIwithTDD.Repository.WorkshopRepository;
import com.Solera.APIRest.APIwithTDD.Service.PartsService;
import com.Solera.APIRest.APIwithTDD.Service.WorkshopService;
import models.PartsClass;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping ("/API/v1")

public class WorkshopController {

    //private WorkshopRepository workshopRepository;
    private WorkshopRepository workshopRepository;
    public void First (WorkshopRepository crudMethods){workshopRepository = crudMethods};

// CRUD methods (Create, Read, Update, Delete)
@GetMapping("/Workshop/{id}")
public String getProductById (@PathVariable Long id) {
    WorkshopClass workshopService = workshopRepository.findById(id);
    // Check if the product exists
    if(workshopService == null) {
        return "Workshop with ID " + id + " not found.";
    }
    return "Workshop found: " + workshopService.toString();
}
@PostMapping("/workshop/all")
    public ResponseEntity<String> postMappingWorkshop (@RequestBody WorkshopRepository workshopRepository) {
        //Return "The product name is " + product.Name;
        WorkshopRepository.save(workshopRepository);
        return new ResponseEntity<String>("The workshop correspond: Vehicle" +
                "and needed Parts:" + PartsClass.getId() + PartsClass.getName() + PartsClass.getDescription() + );
    }

    @DeleteMapping("/workshop/{id}")
    public String deleteWorkshop(@PathVariable Long id) {
        workshopRepository.deleteById(id);
        return "Workshop with ID " + id + " has been deleted successfully";
    }


}
