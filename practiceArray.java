package interviewPractice;

public class practiceArray {
    public static void doSingleArray(){
        int []arr = {1, 2, 3, 4, 5, 6};
        for (int i =0; i<arr.length; i++){
            System.out.println(i);
        }

        //Max number of Array
        int max = arr[0];
        for (int i =0; i< arr.length; i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println(max);

        //Min number of Array
        int min = arr[0];
        for (int i =0; i< arr.length; i++){
            if(arr[i]<min){
                min = arr[i];
            }

        }
        System.out.println(min);
    }



    public static void main(String[] args) {
        doSingleArray();

        int array[] = {33, 36, 48, 50, 61, 63};
        for (int i =0; i< array.length; i++){
            for (int j =0; j< array.length-1; j++){
                if(array[j]<array[j+1]){
                    int temp = array[j];
                    array[j]= array[j+1];
                    array[j+1] = temp;

                }
            }
    }
        for (int desc: array){
            System.out.println(desc);

        }

    }
    }

