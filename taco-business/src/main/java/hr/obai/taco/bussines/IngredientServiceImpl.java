package hr.obai.taco.bussines;

import hr.obai.commons.service.CrudServiceTemplate;
import hr.obai.taco.bussines.dto.IngredientDto;
import hr.obai.taco.bussines.mapper.IngredientMapper;
import hr.obai.taco.data.IngredientCriteria;
import hr.obai.taco.data.Ingredient;
import hr.obai.taco.data.IngredientRepository;
import hr.obai.taco.data.IngredientRepositoryWrapper;
import lombok.NonNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IngredientServiceImpl extends CrudServiceTemplate<
        IngredientDto,
        Ingredient,
        IngredientRepository,
        IngredientCriteria> {

    @Autowired
    protected IngredientServiceImpl(@NonNull IngredientRepositoryWrapper repositoryWrapper, @NonNull IngredientMapper mapper) {
        super(repositoryWrapper, mapper);
    }
}
