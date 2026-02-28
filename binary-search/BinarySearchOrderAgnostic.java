import java.util.*;
public class BinarySearchOrderAgnostic {


    public static void main(String[] args) 
    {
        int arr[]={-1,0,1,2,3,4,5};
        boolean isasc=(arr[0] <= arr[arr.length-1]);
        int target=2; int ans= -1;
        if(isasc)
        {

            int start=0;
            int end=arr.length-1;
            while(start<=end)
            {
                int mid=start+(end-start)/2;
                if(arr[mid]<target)
                {
                    start=mid+1;
                }
                else if(arr[mid] > target)
                {
                    end=mid-1;
                }
                else
                {
                    ans=mid;
                    break;
                }
            }
        }
        else
        {
            int start=0;
            int end=arr.length-1;
            while(start <= end)
            {
                int mid=start+(end-start)/2;
                if(arr[mid] < target)
                {
                    start=mid+1;
                }
                else if(arr[mid] > target)
                {
                    end=mid-1;
                }
                else
                {
                    ans=mid;
                    break;
                }
            }
        }
        System.out.println(ans);
        
    
    }
}