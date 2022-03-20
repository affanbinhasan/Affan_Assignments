package AnnotationsAssignment;

public class UseTestAnnotation {
    @TestAnnotation("test-case")
    public void wassup(){
        
    }

    public static void main(String[] args) {
        UseTestAnnotation test = new UseTestAnnotation();

        //test.wassup();
        System.out.println(test);
    }
}
