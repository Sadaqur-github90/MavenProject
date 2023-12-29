package interviewPractice;

public class practiceCondition {

    public void doCondition(){
        int x = 100;

        if (x>100){
            System.out.println(x+" it's greater than");
        } else if (x<=98) {
            System.out.println(x+" it's equal");

        }else{
            System.out.println(x+" not equal");
        }

    }

    public static void main(String[] args) {
        practiceCondition con = new practiceCondition();
        con.doCondition();
    }
}
