package annotation;

import javax.annotation.processing.AbstractProcessor;
import javax.annotation.processing.RoundEnvironment;
import javax.annotation.processing.SupportedAnnotationTypes;
import javax.annotation.processing.SupportedSourceVersion;
import javax.lang.model.SourceVersion;
import javax.lang.model.element.Element;
import javax.lang.model.element.TypeElement;
import java.util.Set;
import java.util.concurrent.Flow;

@SupportedAnnotationTypes("main.java.annotation.Documentation")
@SupportedSourceVersion(SourceVersion.RELEASE_18)
public class DocumentationProcessor extends AbstractProcessor {

    @Override
    public boolean process(Set <? extends TypeElement> annotations, RoundEnvironment roundEnv) {
        for (TypeElement annotation : annotations) {
            Set <? extends Element> annotatedElements = roundEnv.getElementsAnnotatedWith(annotation);
            for (Element element : annotatedElements) {
                Documentation documentation;
                documentation = element.getAnnotation(Documentation.class);
                System.out.println("--------------");
                System.out.println(Flow.Publisher.class.getName());
                System.out.println("--------------");
                System.out.println(documentation.name());
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