package com.Solera.APIRest.APIwithTDD.Controllers;

import com.Solera.APIRest.APIwithTDD.Models.WorkshopClass;
import com.Solera.APIRest.APIwithTDD.Repository.WorkshopRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping ("/API/workshop")

public class WorkshopController {

    private final WorkshopRepository workshopRepository;

    public WorkshopController(WorkshopRepository crudMethods) {
        this.workshopRepository = crudMethods;
    }

    // CRUD methods (Create, Read, Update, Delete)
    @GetMapping("/workshop/{id}")
    public ResponseEntity<WorkshopClass> getWorkshopById(@PathVariable Long id) {
        Optional<WorkshopClass> workshop = workshopRepository.findById(id);
        if (workshop.isPresent()) {
            return ResponseEntity.ok(workshop.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("/workshop")
    public ResponseEntity<Iterable<WorkshopClass>> getAllWorkshops() {
        Iterable<WorkshopClass> workshops = workshopRepository.findAll();
        return ResponseEntity.ok(workshops);
    }

    @PostMapping("/workshop")
    public ResponseEntity<WorkshopClass> createWorkshop(@RequestBody WorkshopClass workshop) {
        WorkshopClass savedWorkshop = workshopRepository.save(workshop);
        return ResponseEntity.ok(savedWorkshop);
    }

    @DeleteMapping("/workshop/{id}")
    public String deleteWorkshopById (@PathVariable Long id) {
        workshopRepository.deleteById(id);
        return "Workshop with ID " + id + " has been deleted successfully";
    }

}
