package com.Solera.APIRest.APIwithTDD.Contracts;
import com.Solera.APIRest.APIwithTDD.Models.VehiclesClass;

import java.util.List;

public interface IServiceVehicles {
    Boolean save(VehiclesClass entity);
    Boolean deleteById(Long id);
    VehiclesClass findById(Long id);
    List<VehiclesClass> findAll();
}
