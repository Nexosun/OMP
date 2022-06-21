package UE09.Aufgabe1;

public class IntArrSearchRight implements Runnable{
    int searchInt;
    int[] searchArr;
    boolean rightFound;

    public IntArrSearchRight(int searchNumber, int[] intArray){
    searchInt = searchNumber;
    searchArr = intArray;
    }

    @Override
    public void run() {
        for (int i = searchArr.length / 2; i < searchArr.length; i++) {         // iterate trough array
            if (searchArr[i] == searchInt) {
                rightFound = true;
            }
        }

        if (rightFound == true) {
            System.out.println("Thread 2: found");
        } else {
            System.out.println("Thread 2: not found");
        }
    }
}
