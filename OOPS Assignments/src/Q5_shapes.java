abstract class Q5_shapes{
    abstract public String draw();
    public static class Rectangle extends Q5_shapes{
        public String draw(){
            return "Rectangle";
        };
    }
    public static class Line extends Q5_shapes{
        public String draw(){
            return "Line";
        };
    }
    public static class Cube extends Q5_shapes{
        public String draw(){
            return "Cube";
        };
    }

    public static void main(String[] args) {
        Q5_shapes.Rectangle shape = new Q5_shapes.Rectangle();

        System.out.println(shape.draw());
    }
}