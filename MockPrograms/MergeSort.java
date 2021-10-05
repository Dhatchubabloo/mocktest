package MockPrograms;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int array[] = {7,3,8,10,34,22,6};
        sort(array,0,array.length-1);
        System.out.println(Arrays.toString(array));
    }

    public static void sort(int[] arr, int left, int right) {
        if(left<right){
            int mid = (left+right)/2;
            sort(arr,left,mid);
            sort(arr,mid+1,right);
            merge(arr,left,mid,right);
        }
    }

    public static void merge(int[] arr, int left, int mid, int right) {
        int lRange = mid-left+1;
        int rRange = right-mid;

        int leftArray[] = new int[lRange];
        int rightArray[] = new int[rRange];

        for(int i=0;i<lRange;i++){
            leftArray[i] = arr[left+i];
        }
        for(int j=0;j<rRange;j++){
            rightArray[j] = arr[mid+1+j];
        }

        int i=0,j=0,k=left;
        while(i<lRange&&j<rRange){
            if(leftArray[i]<rightArray[j]){
                arr[k] = leftArray[i];
                i++;
            }
            else{
                arr[k] = rightArray[j];
                j++;
            }
            k++;
        }
        while(i<lRange){
            arr[k] = leftArray[i];
            i++;k++;
        }
        while(j<rRange){
            arr[k] = rightArray[j];
            j++;k++;
        }
    }

}
