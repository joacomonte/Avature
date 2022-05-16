package test1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class test1 {

    public static void main(String[] args) {
        clock();
    }

    public static boolean checkAndDelete(List nums, int[] time) {

        List<Integer> e = new ArrayList<>(nums);

        for (int index = 0; index < time.length; index++) {
            for (int i = e.size() - 1; i >= 0; i--) {
                if (e.get(i).equals(time[index])) {
                    e.remove(i);
                    if (e.size() == 0) return true;
                    break;
                }
            }
        }
        return false;
    }



    public static void clock() {

        List<Integer> numbers = new ArrayList<>(Arrays.asList(2, 3, 3, 2));

        int count=0;
        int[] time = {0, 0, 0, -1};

        while (true) {
            if (time[0] == 2 && time[1] == 3 && time[2] == 5 && time[3] == 9) {
                break;
            } else {
                time[3]++;

                if (time[3] > 9) {
                    time[3] = 0;
                    time[2]++;
                }
                if (time[2] > 5) {
                    time[2] = 0;
                    time[1]++;
                }
                if (time[1] > 9) {
                    time[1] = 0;
                    time[0]++;
                }
//                System.out.println(time[0] + "" + time[1] + ":" + time[2] + "" + time[3]);
                if(checkAndDelete(numbers,time)){
                    count=count+1;
                };
            }
        }
        System.out.println(count);
    }
}


