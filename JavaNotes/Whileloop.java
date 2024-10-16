public class Whileloop {
    public static void main(String[] args) {
        int marks = 0;
        while(marks<=10){
if (marks%2==0)
            {
                System.out.println("even number is printing "+ marks);
                if(marks==4){
                    break;
                }
        }
else {
    System.out.println(marks + " is an odd number");
}
            marks = marks+1;
    }
}}
