package Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class test2
{
    public static void main(String[] args)
    {
        int a = 1;
        int b = 1;
        int c = 2;
        int d = 1;
        System.out.println(solution2(a,b,c,d));
    }


    public static boolean solution2(int a, int b, int c, int d)
    {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(a,b,c,d));

        int A = 0;
        int B = 0;
        int C = 0;
        int D = -1;

        int count=0;

        while(true) {

            if (A == 2 && B == 3 && C == 5 && D == 9) {
                break;
            } else {
                D++;

                if (D > 9) {
                    D = 0;
                    C++;
                }
                if (C > 5) {
                    C = 0;
                    B++;
                }
                if (B > 9) {
                    B = 0;
                    A++;
                }
                System.out.println(A + "" + B + ":" + C + "" + D);


                List<Integer> e = new ArrayList<>(numbers);
                while(true){
                    for (int i = e.size() - 1 ; i >= 0 ; i--){
                        if(e.get(i) == A) {
                            e.remove(i);
                            for (i = e.size() - 1; i >= 0; i--) {
                                if (e.get(i) == B) {
                                    e.remove(i);
                                    for (i = e.size() - 1; i >= 0; i--) {
                                        if (e.get(i) == C) {
                                            e.remove(i);
                                            for (i = e.size() - 1; i >= 0; i--) {
                                                if (e.get(i) == D) {
                                                    count = count + 1;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    break;
                }
            }
        }
        System.out.println(count);
        return false;
    }
}
