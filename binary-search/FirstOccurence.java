import java.util.*;
public class FirstOccurence 
{
         
    
    static int search(int arr[], int target, boolean firstOccurenceFlag)
    {
        int start =0;
        int end=arr.length-1;
        int ans=-1;
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            if(arr[mid]<target)
            {
                start=mid+1;
            }
            else if(arr[mid]>target)
            {
                end=mid-1;
            }
            else 
            {
                if(firstOccurenceFlag)
                {

                     ans=mid;//store the ans , potential first element
                     end=mid-1;//still start bin search from left in hopes of a smaller ocurence
                }
                else
                {
                    ans=mid;//store the ans , potential first element
                    start=mid+1;//search left space in hopes of a bigger index occurence
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) 
    {
        int arr[]={1,2,3,4,7,7,7,8,9};
        int target=7;
        int first=search(arr,target,true);
        int last=search(arr,target,false);
        System.out.println(first+","+last);
    }
}
