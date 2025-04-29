public class MajorityElement {
    public static void main(String[] args) {
        int[] arr = {3, 3, 4, 2, 3, 3, 3, 2, 4, 3};
        int candidate = -1, count = 0;

        for (int num : arr) {
            if (count == 0) {
                candidate = num;
            }
            count += (num == candidate) ? 1 : -1;
        }

        count = 0;
        for (int num : arr) {
            if (num == candidate) {
                count++;
            }
        }

        System.out.println((count > arr.length / 2) ? candidate : "No Majority Element");
    }
}