import java.util.*;
public class Floor {
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
                else
                {
                    return mid;
                }
            }
            return end;
    }
    public static void main(String[] args) {
        int[] arr={1,4,6,8};
        int number=7;
        int ans=ceiling(arr,number);
        if(ans >= 0)
            System.out.println(arr[ans]);
        else
            System.out.println("Number lesser than smallest element.");
    }
}
