package MavenBasics;

public class problemSolving {
    /* If we list all the natural numbers below 10 that are multiples of 3 or 7, after that we get 3,6,7, and 9.
    The sum of multiples of 25. What is the sum of multiples of 3,7 for the natural numbers of below 1000?
     */

  public void doSum(){
      int sum= 0;
      for (int i=1; i<1000; i++) {
          if (i%3==0 ||i%7==0) {
              sum =sum +i;
          }
      }
        System.out.println(sum);
    }

    public void doSum1() {
      int sum = 0;
      for (int z=1; z<1000; z++) {
          if (z%3==0 || z%7==0) {
              sum = sum+z;
          }
      }
        System.out.println(sum);
    }

    public void addSum2() {
        int sum = 0;
        for (int j=1; j<1000; j++) {
            if (j%3==0 || j%7==0) {
                sum = sum+j;
            }
        }
        System.out.println(sum);
    }

    public void addSum3() {
      int addition=0;
      for (int k=1; k<1000; k++){
          if (k%3==0 || k%7==0){
              addition=addition+k;
          }
      }
        System.out.println(addition);
    }

        public void doSum4(){
        int add=0;
        for (int s=1; s<1000; s++){
            if (s%3==0 ||s%7==0){
                add= add+s;
            }
        }
            System.out.println(add);
        }

        public void setParameter(int num) { //Non-return type (parameterised Method)
            int parameter=0;
            for (int p=1; p<num; p++){
                if (p%3==0 || p%7==0) {
                    parameter=parameter+p;
                }
        }
            System.out.println(parameter);

    }
    public static void main(String[] args) {
        int adds = 0;
        for (int i=1; i<10; i++) {
            if (i%3==0 || i%7==0) {
                adds = adds + i;
            }
            System.out.println(adds);
        }

        int sum =0;
        for (int i=1; i<1000; i++) {
            if (i % 3 == 0 || i % 7 == 0) {
                sum = sum + i;
            }
            System.out.println(sum);
        }

        int add = 0;
        for (int i = 0;i<20; i++) {
            if (i% 5 ==0 || i% 7 ==0){
                add = add +i;
            }
            System.out.println(add);
        }


        problemSolving obj = new problemSolving();
        obj.doSum();
        obj.doSum1();
        obj.addSum2();
        obj.addSum3();
        obj.doSum4();
        obj.setParameter(30);
        obj.setParameter(100);
        obj.setParameter(300);
        obj.setParameter(1000);
    }

}
