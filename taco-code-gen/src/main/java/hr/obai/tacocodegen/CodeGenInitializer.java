package hr.obai.tacocodegen;

import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.VelocityEngine;
import org.apache.velocity.runtime.RuntimeConstants;
import org.apache.velocity.runtime.resource.loader.ClasspathResourceLoader;

import java.io.FileWriter;
import java.io.IOException;
import java.io.StringWriter;

public class CodeGenInitializer {
    public static void main(String[] args) throws IOException {
        VelocityEngine velocityEngine = new VelocityEngine();
        velocityEngine.setProperty(RuntimeConstants.RESOURCE_LOADER, "classpath");
        velocityEngine.setProperty("classpath.resource.loader.class", ClasspathResourceLoader.class.getName());
        velocityEngine.init();

        ConfProperties confProperties = new ConfProperties();

        VelocityContext context = new VelocityContext();
        ControllerGenMetadata controllerGenMetadata = ControllerGenMetadata.builder()
                .packageName("hr.oabi.taco.api")
                .controllerTemplatePackage("hr.obai.commons.controller")
                .controllerClassName("IngredientController")
                .controllerTemplateName("CrudControllerTemplate")
                .serviceImplPackage("hr.obai.taco.bussines")
                .serviceClassName("IngredientServiceImpl")
                .dtoPackage("hr.obai.taco.bussines.dto")
                .criteriaPackage("hr.obai.taco.data")
                .resourcePath("ingredients")
                .dtoName("IngredientDto")
                .criteriaClassName("IngredientCriteria")
                .build();
        controllerGenMetadata.toMap().forEach(context::put);

        Template controllerTemplate = velocityEngine.getTemplate("template/DefaultController.vm");
        StringWriter writer = new StringWriter();
        controllerTemplate.merge( context, writer );

        FileWriter myWriter = new FileWriter(controllerGenMetadata.getControllerClassName() + ".java");
        myWriter.write(writer.toString());
        myWriter.close();
    }
}
