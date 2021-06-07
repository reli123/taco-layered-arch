package hr.obai.tacocodegen;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.apache.commons.beanutils.BeanUtils;

import java.lang.reflect.InvocationTargetException;
import java.util.Map;
@Getter
@Setter
@Builder
public class ControllerGenMetadata {
    private String packageName;
    private String controllerTemplatePackage;
    private String controllerTemplateName;
    private String serviceImplPackage;
    private String serviceClassName;
    private String dtoPackage;
    private String criteriaPackage;
    private String resourcePath;
    private String controllerClassName;
    private String dtoName;
    private String criteriaClassName;

    public Map<String, String> toMap() {
        Map<String, String> map = null;
        try {
            map = BeanUtils.describe(this);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        return map;
    }
}
