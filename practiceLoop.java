package interviewPractice;

public class practiceLoop {
    public void doWhLoop(){
        int i = 1;
        while (i<=20){
            System.out.println(i);
            i = i+1;
        }
    }

    public void learnWhileLoop(){
        int z =1;
        do{
            System.out.println(z);
            z++;
        }while (z<=15);
    }
    public static void main(String[] args) {
        practiceLoop loop = new practiceLoop();
        loop.doWhLoop();
        loop.learnWhileLoop();
    }
}
