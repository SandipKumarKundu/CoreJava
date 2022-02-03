package annotation;

import java.lang.annotation.Documented;

@Documented
@interface CustomAnnotation {
    String name();
    String comment();
    String publishedOn();
}
