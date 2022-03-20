package AnnotationsAssignment;

public class UseCustomAnnotation {
    @CustomAnnotation(AuthorID = "007",date = "21/02/2022",time = "20:12:45",version = 1.1860034)
    public void wassup(){

    }

    public static void main(String[] args) {
        UseCustomAnnotation custom = new UseCustomAnnotation();
        
        System.out.println(custom);
    }
}
