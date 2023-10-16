import java.util.ArrayList;

public class Search {

    public static int linearSearch(int[] array, int value) {
        for (int i=0;i<array.length;i++){
            if(array[i]==value){
                return i;
            }
        }
        return -1;

    }

    public static int linearSearch(ArrayList<String> list, String string) {
        for(int i=0;i<list.size();i++){
            if(list.get(i).equals(string)){
                return i;
            }

        }

        return -1;

    }


    public static int binarySearch(int[] array, int value) {
    int left=0;
    int right=array.length-1;
    int middle;
    while (left<=right){
        middle=(left+right)/2;
        if(array[middle]==value){
            return middle;
        }
        else if (array[middle]>value){
            right=middle-1;
        }
        else{left=middle+1;}
    }
        return -1;

    }

    public static int binarySearch(String[] array, String string) {
        int left=0;
        int right=array.length-1;
        int middle;
        while (left<=right){
            middle=(left+right)/2;
            if(array[middle].equals(string)){
                return middle;
            }
            else if (array[middle].compareTo(string)>0){
                right=middle-1;
            }
            else{left=middle+1;}
        }
        return -1;
    }
}
