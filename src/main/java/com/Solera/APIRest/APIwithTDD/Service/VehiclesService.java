package com.Solera.APIRest.APIwithTDD.Service;

import com.Solera.APIRest.APIwithTDD.Contracts.IServiceVehicles;
import com.Solera.APIRest.APIwithTDD.Models.VehiclesClass;
import com.Solera.APIRest.APIwithTDD.Repository.VehiclesRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VehiclesService implements IServiceVehicles {
    private final VehiclesRepository vehiclesRepository;
    public VehiclesService (VehiclesRepository vehiclesRepository) {this.vehiclesRepository = vehiclesRepository;}


    @Override
    public Boolean save(VehiclesClass vehicle) {
        if (vehiclesRepository.save(vehicle).getModel() != null)
            return true;
        return false;
    }

    @Override
    public Boolean deleteById(Long id) {
        vehiclesRepository.deleteById(id);
        return true;
    }

    @Override
    public VehiclesClass findById(Long id) {
        if(vehiclesRepository.findById(id)
                .isPresent()) {
            return vehiclesRepository.findById(id).get();
        }
        return null;
    }

    @Override
    public List<VehiclesClass> findAll() {
        List<VehiclesClass> vehicles = (List<VehiclesClass>) vehiclesRepository.findAll();
        return vehicles;
    }

}
