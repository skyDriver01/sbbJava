package annotation;

import javax.annotation.processing.AbstractProcessor;
import javax.annotation.processing.RoundEnvironment;
import javax.annotation.processing.SupportedAnnotationTypes;
import javax.annotation.processing.SupportedSourceVersion;
import javax.lang.model.SourceVersion;
import javax.lang.model.element.Element;
import javax.lang.model.element.TypeElement;
import java.util.Arrays;
import java.util.Set;

@SupportedAnnotationTypes("annotation.Documentation")
@SupportedSourceVersion(SourceVersion.RELEASE_18)
public class DocumentationProcessor extends AbstractProcessor {

    @Override
    public boolean process(Set <? extends TypeElement> annotations, RoundEnvironment roundEnv) {
        for (TypeElement annotation : annotations) {
            Set <? extends Element> annotatedElements = roundEnv.getElementsAnnotatedWith(annotation);
            for (Element element : annotatedElements) {
                Documentation documentation = element.getAnnotation(Documentation.class);
                System.out.println("--------------");
                System.out.println(element.getSimpleName());
                System.out.println("--------------");
                System.out.println(Arrays.toString(documentation.names()));
                System.out.println(documentation.description());
                System.out.println(documentation.version());
            }
        }
        return false;
    }
}
/*
cd .\main\
cd .\java\
javac annotation/Documentation.java
javac annotation/DocumentationProcessor.java
javac -processor annotation.DocumentationProcessor annotation/Book.java
 */