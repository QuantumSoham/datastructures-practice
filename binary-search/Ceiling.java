import java.util.*;
public class Ceiling {
    static int ceiling(int arr[],int number)
    {
         int start=0;
            int end=arr.length-1;
            int ans=-1;
            while(start<=end)
            {
                int mid=start+(end-start)/2;
                if(arr[mid]<number)
                {
                    start=mid+1;
                }
                else if(arr[mid] > number)
                {
                    end=mid-1;
                }
                ans=mid;
            }
            return ans;
    }
    public static void main(String[] args) {
        int[] arr={-18,-7,-1,0, 2, 3, 56, 121};
        int number=2;
        int ans=ceiling(arr,number);
        System.out.println(ans);
    }
}
