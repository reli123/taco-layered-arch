package hr.obai.taco.data;

import hr.obai.commons.repository.BaseJpaRepository;

import java.util.List;

public interface IngredientRepository extends BaseJpaRepository<Ingredient> {
    List<Ingredient> findAllByIdGreaterThan(Long id);
}
