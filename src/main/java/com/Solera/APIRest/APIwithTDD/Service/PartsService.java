package com.Solera.APIRest.APIwithTDD.Service;
import com.Solera.APIRest.APIwithTDD.Contracts.IServiceParts;
import com.Solera.APIRest.APIwithTDD.Models.PartsClass;
import com.Solera.APIRest.APIwithTDD.Repository.PartsRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class PartsService implements IServiceParts {
    private final PartsRepository partsRepository;
    public PartsService (PartsRepository partsRepository) {this.partsRepository = partsRepository;}


    @Override
    public Boolean save(PartsClass parts) {
        if (partsRepository.save(parts).getName() != null)
            return true;
        return false;
    }

    @Override
    public Boolean deleteById(Long id) {
       partsRepository.deleteById(id);
        return true;
    }

    @Override
    public PartsClass findById(Long id) {
        if(partsRepository.findById(id)
                .isPresent()) {
            return partsRepository.findById(id).get();
        }
        return null;
    }

    @Override
    public List<PartsClass> findAll() {
        List<PartsClass> parts = (List<PartsClass>) partsRepository.findAll();
        return parts;
    }


}
