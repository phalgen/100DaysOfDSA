public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        int nums1[]={1,2,3,0,0,0};
        int nums2[]={2,5,6};
        int m=3;
        int n=3;
        int i = m - 1;  // Index for the last element in nums1
        int j = n - 1;  // Index for the last element in nums2
        int k = m + n - 1;  // Index for the last position in the merged array

        // Merge the arrays by comparing elements using a for loop
        for (; i >= 0 && j >= 0; k--) {
            if (nums1[i] > nums2[j]) {
                nums1[k] = nums1[i--];
            } else {
                nums1[k] = nums2[j--];
            }
        }

        // If there are remaining elements in nums2, copy them to nums1
        for (; j >= 0; k--) {
            nums1[k] = nums2[j--];
        }
        for (int num : nums1) {
            System.out.print(num + " ");
        }




    }
}