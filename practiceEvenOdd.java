package interviewPractice;

public class practiceEvenOdd {
    public void doIfOrElse(){
        for (int x = 1; x<=10; x++){
            if (x%2==0){
                System.out.println(x+ " This is an even number");
            } else {
                System.out.println(x+ " This is odd number");
            }
        }

        int x = 1;
        while(x<=20){
            if (x%2==0){
                System.out.println(x+ " This is an even number");
            } else {
                System.out.println(x+ " This is odd number");
            } x=x+1;

        }

    }

    public static void main(String[] args) {
        practiceEvenOdd obj = new practiceEvenOdd();
        obj.doIfOrElse();
    }
}
