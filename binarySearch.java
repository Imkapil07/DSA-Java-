public class binarySearch {
     public static int search(int[] nums, int target) {
        int start=0 , end= nums.length -1;
        while(start <= end){
            int mid = (start + end)/2;
            if(nums[mid] == target){
                return mid;
            }
            if(nums[mid] < target){
                start = mid + 1;
            } else{
                end = mid - 1;
            }
         } 
         return -1;
        }

         public static void main(String[] args) {
            int[] nums ={2,3,4,5,6};
            int target = 5;
            System.out.println(search(nums, target)); 
     }
}
