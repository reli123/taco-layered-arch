package hr.obai.taco.data;

import hr.obai.commons.repository.criteria.CriteriaEnhancedSpecificationBuilderTemplate;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class IngredientSpecification extends CriteriaEnhancedSpecificationBuilderTemplate<Ingredient, IngredientCriteria> {

    @Override
    public Specification<Ingredient> buildSpecification(IngredientCriteria criteria) {
        List<Specification<Ingredient>> specifications = new ArrayList<>();
        specifications.add(buildSpecification());

        if(criteria.getName() != null)
            specifications.add(buildSpecification(criteria.getName(), Ingredient_.name));

        if (criteria.getId() != null)
            specifications.add(buildSpecification(criteria.getId(), Ingredient_.id));

        return specifications.stream().reduce(Specification::and).orElse(buildSpecification());
    }
}
