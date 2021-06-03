package hr.obai.taco.bussines.mapper;

import hr.obai.commons.repository.mapper.DtoToEntityBidirectionalMapper;
import hr.obai.taco.bussines.dto.IngredientDto;
import hr.obai.taco.data.Ingredient;
import hr.obai.taco.data.IngredientType;
import org.springframework.stereotype.Component;

@Component
public class IngredientMapper implements DtoToEntityBidirectionalMapper<IngredientDto, Ingredient> {

    @Override
    public IngredientDto toDto(Ingredient ingredient) {
        IngredientDto dto = new IngredientDto();
        dto.setName(ingredient.getName());
        dto.setPrice(ingredient.getPrice());
        dto.setType(ingredient.getType().toString());
        return dto;
    }

    @Override
    public Ingredient toEntity(IngredientDto dto) {
        Ingredient entity = new Ingredient();
        entity.setName(dto.getName());
        entity.setPrice(dto.getPrice());
        entity.setType(IngredientType.valueOf(dto.getType()));
        return entity;
    }
}
