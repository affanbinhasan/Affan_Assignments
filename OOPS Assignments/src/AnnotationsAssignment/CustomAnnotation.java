package AnnotationsAssignment;

public @interface CustomAnnotation {
    String AuthorID();
    String name() default "Affan";
    String supervisor() default "Amit";
    String date();
    String time();
    double version();
    String description() default "Going to test this Custom Annotation";
}
