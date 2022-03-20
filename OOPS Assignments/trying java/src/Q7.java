public class Q7 {
    public static void main(String[] args) {
        int arr[] = {5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
        int x =19;
        int i =0;
        for (i=0;i<arr.length;i++){
            if (arr[i] == x){
                System.out.println("found the value you were looking for! It is at : position");
                System.out.println(i+1);
            }
        }
    }
}
