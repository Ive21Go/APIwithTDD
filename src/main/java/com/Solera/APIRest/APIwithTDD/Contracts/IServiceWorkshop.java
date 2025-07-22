package com.Solera.APIRest.APIwithTDD.Contracts;
import com.Solera.APIRest.APIwithTDD.Models.WorkshopClass;

import java.util.List;

public interface IServiceWorkshop {
    Boolean save(WorkshopClass entity);
    Boolean deleteById(Long id);
    WorkshopClass findById(Long id);
    List<WorkshopClass> findAll();
}
