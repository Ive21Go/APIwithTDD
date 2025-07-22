package com.Solera.APIRest.APIwithTDD.Service;

import com.Solera.APIRest.APIwithTDD.Contracts.IServiceWorkshop;
import com.Solera.APIRest.APIwithTDD.Models.WorkshopClass;
import com.Solera.APIRest.APIwithTDD.Repository.WorkshopRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WorkshopService implements IServiceWorkshop {
    private final WorkshopRepository workshopRepository;
    public WorkshopService (WorkshopRepository workshopRepository) {this.workshopRepository = workshopRepository;}


    @Override
    public Boolean save(WorkshopClass workshop) {
        if (workshopRepository.save(workshop).getName() != null)
            return true;
        return false;
    }

    @Override
    public Boolean deleteById(Long id) {
        workshopRepository.deleteById(id);
        return true;
    }

    @Override
    public WorkshopClass findById(Long id) {
        if(workshopRepository.findById(id)
                .isPresent()) {
            return workshopRepository.findById(id).get();
        }
        return null;
    }

    @Override
    public List<WorkshopClass> findAll() {
        List<WorkshopClass> workshops = (List<WorkshopClass>) workshopRepository.findAll();
        return workshops;
    }
}
