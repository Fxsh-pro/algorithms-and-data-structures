import java.util.List;

public class binary_search {

    public static int binarySearch(List<Integer> arr, int val, int low, int high ){
        if(high>=low && low <= arr.size()-1) {
            int middle = (low + high) / 2;
            int middleNum = arr.get(middle);

            if (middleNum == val)
                return middle;
            if (val < middleNum)
                return binarySearch(arr, val, low, middle - 1);
            else if (val > middleNum)
                return binarySearch(arr, val, middle + 1, high);
        }
        return -1;
    }

}
