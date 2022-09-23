package ss_14;
import java.util.Arrays;
public class cai_dat_sap_xep {
    static double[] list = {1, 2, 4.5, 1.6, -95.7, -4.5};

    public static void main(String[] args) {
        insertionSort(list);
        System.out.println(Arrays.toString(list));
    }

    private static void insertionSort(double[] list) {
        for (int i = 1; i < list.length; i++) {
            double currentElement = list[i];
            int k = 0;
            for (k = i - 1; k >= 0 && list[k] < currentElement; k--) {
                list[k + 1] = list[k];
            }
            list[k + 1] = currentElement;
        }
    }
}
