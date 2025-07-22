package com.Solera.APIRest.APIwithTDD.Contracts;

import com.Solera.APIRest.APIwithTDD.Models.PartsClass;

import java.util.List;

public interface IServiceParts {
        Boolean save(PartsClass entity);
        Boolean deleteById(Long id);
        PartsClass findById(Long id);
        List<PartsClass> findAll();
}
