package recap;

public class CompareArrays {

    private static final int MAX = 50;
    private static int[] arrOne = new int[MAX];
    private static int arrTwo[] = new int[MAX];

    public boolean checkArray(int[] arr) {
        if(arr.length == MAX){
            System.out.println("The array is full");
            return true;
        }else if(arr.length > 0 && arr.length < MAX){
            System.out.println("The array is NOT full");
            return true;
        }else{
            System.out.println("The array is empty");
            return false;
        }
    }

    public int[] fillArrayOne(){
        for(int i = 0; i < MAX; i++){
            arrOne[i] = (int) (Math.random() * 100);
            System.out.print(arrOne[i] + " ");
        }
        System.out.println();
        return arrOne;
    }

    public int[] fillArrayTwo(){
        for(int i = 0; i < MAX; i++){
            arrTwo[i] = (int) (Math.random() * 100);
            System.out.print(arrTwo[i] + " ");
        }
        System.out.println();
        return arrTwo;
    }
}
