class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] arr=new int[nums1.length+nums2.length];
        int count=0;

        for(int i=0;i<nums1.length;i++){
            arr[i]=nums1[i];
            count++;
        }
        for(int i=0;i<nums2.length;i++){
            arr[count]=nums2[i];
            count++;
        }
        Arrays.sort(arr);

        if(arr.length%2==0){
            return (arr[arr.length/2]+arr[(arr.length/2)-1])/(double)2.0;
        }
        return arr[arr.length/2];

        
    }
}