
import java.util.*;
import java.util.Random;
public class Main {

    public static void sort(List<Integer> arr,int left, int right) {
        int top, bot;
        int com;
        top = left;
        bot = right;
        com = arr.get((left+right)/2);
        do {
            while  ((arr.get(top) < com) && (top < right)) top++;
            while  ((arr.get(bot) > com) && (bot > left)) bot--;
            if (top <= bot){
                Collections.swap(arr,top,bot);
                top++;
                bot--;
            }
        }while (top<=bot);
        if(left<bot) sort(arr,left,bot);
        if(top<right) sort(arr,top,right);
        return;
    }

    public static void main(String[] args){
        List<Integer> arr = new ArrayList<>();
        Random rand = new Random();
        for (int i =0; i <10;i++)
            arr.add(rand.nextInt(100));
        System.out.println(arr);
        sort(arr,0,arr.size()-1);
        System.out.println(arr);

        }
    }



