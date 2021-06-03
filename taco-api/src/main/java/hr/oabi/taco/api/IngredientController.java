package hr.oabi.taco.api;


import hr.obai.commons.controller.CrudControllerTemplate;
import hr.obai.taco.bussines.IngredientServiceImpl;
import hr.obai.taco.bussines.dto.IngredientDto;
import hr.obai.taco.data.IngredientCriteria;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ingredients")
public class IngredientController extends CrudControllerTemplate<IngredientDto, IngredientCriteria> {

    protected IngredientController(IngredientServiceImpl service) {
        super(service);
    }
}
