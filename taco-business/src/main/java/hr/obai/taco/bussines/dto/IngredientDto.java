package hr.obai.taco.bussines.dto;

import hr.obai.commons.dto.BaseDto;
import hr.obai.commons.validation.Validatable;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class IngredientDto extends BaseDto implements Validatable {

    private String name;
    private Float price;
    private String type;

    @Override
    public boolean isValid() {
        return true;
    }

    @Override
    public void setValid(boolean valid) {

    }
}
