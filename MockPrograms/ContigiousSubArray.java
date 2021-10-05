package MockPrograms;

public class ContigiousSubArray {
    public static void main(String[] args) {
        int array[] = {1,2,3,7,5};
        int target = 12;
        int count=0;
        for(int i=0;i< array.length;i++){
            int sum=array[i];
            for(int j=i+1;j< array.length;j++){
                sum+=array[j];
                if(sum==target){
                    System.out.print(i+1+",");
                    System.out.println(j+1);
                    count++;
                    break;
                }
                if(sum>target)
                    break;
            }
            if(count>0)
                break;
        }
    }
}
