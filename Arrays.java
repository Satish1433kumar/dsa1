// 1) Java Program to copy all elements of one array into another array 
// 2) Java Program to find the frequency of each element in the array 
// 3) Java Program to left rotate the elements of an array 
// 4) Java Program to print the duplicate elements of an array 
// 5) Java Program to print the elements of an array 
// 6) Java Program to print the elements of an array in reverse order 
// 7) Java Program to print the elements of an array present on even position 
// 8) Java Program to print the elements of an array present on odd position
// 9) Java Program to print the largest element in an array
// 10) Java Program to print the smallest element in an array
// 11) Java Program to print the number of elements present in an array
// 12) Java Program to print the sum of all the items of the array
// 13) Java Program to right rotate the elements of an array
// 14) Java Program to sort the elements of an array in ascending order 
// 15) Java Program to sort the elements of an array in descending order
// 16) Find 3rd Largest Number in an Array 
// 17) Find 2nd Largest Number in an Array
// 18) Find 2nd Smallest Number in an Array
// 19) Remove Duplicate Element in an Array
// 20) Print Odd and Even Number from an Array 
// 21) Java Program to find the frequency of odd & even numbers in the given matrix
// 22) Maximum Sum Sub Array (Kadane's Algorithm) 
// 23) Dutch National Flag Algorithm 
// 24) Boyer Moore Algorithm(Majority Element) 
// 25) two Sum problem 
// 26) maximumsum subarray of size k



import java.util.*;

import java.util.ArrayList;
import java.util.HashMap;

public class Arrays { 
    //1)Java Program to copy all elements of one array into another array
    public static int[] copyArray(int a[]){
        int[] b =new int[a.length];
        for(int i=0;i<a.length;i++){
            b[i] = a[i];
        }
        return b;
    }
    // 2) Java Program to find the frequency of each element in the array
    public static void frequencyOfItems(int a[]){
        int VisitedArray[] = new int[a.length];
        int visited = -1;
        for(int i=0;i<a.length;i++){
            int count = 1;
            for(int j=i+1;j<a.length;j++){
                if(a[i]==a[j]){
                    count++;
                    VisitedArray[j] = visited;
                }
            }
            if(VisitedArray[i]!=visited){
                VisitedArray[i]=count;
            }
        }
        for(int i = 0;i<VisitedArray.length;i++){
            if(VisitedArray[i]!=visited){
                System.out.println("The number "+a[i]+" appears :"+VisitedArray[i]);
            }
        }
    }

   
    // 3) Java Program to left rotate the elements of an array
   public static void leftRotate(int a[]){
    for(int i = 0;i<3;i++){
        int first = a[0];
        for(int j=0;j<a.length-1;j++){
            a[j]=a[j+1];
        }
        a[a.length-1] = first;
    }
    System.out.println("Left rotated array : ");
    for(int i:a){
        System.out.print(i+" ");
    }
   }

   // 4) Java Program to print the duplicate elements of an array
   public static void duplicateElements(int a[]){
    for(int i = 0;i<a.length;i++){
        for(int j=i+1;j<a.length;j++){
            if(a[i]==a[j]){
                System.out.print(a[j]); 
            }
        }
    }
   }
    
    //5)Java Program to print the elements of an array
    public static int[] printArr(int a[]){
        System.out.println("Elements of the array:");
        for(int i:a){
            System.out.print(i+" ");
        }
        return a;
    }
    //6) Java Program to print the elements of an array in reverse order
    public static int[] revArr(int[] a){
        for(int i=a.length;i>0;i--){
            System.out.print(a[i-1]+" ");
        }
        return a;
        }

    // 7) Java Program to print the elements of an array present on even position 
    public static void evenPostionArrElements(int a[]){
        System.out.println("\nElements at even positions : ");
        for(int i=0;i<a.length;i++){
            if(i%2==0){
                System.out.println(a[i]);
            }
        }
   }
    // 8) Java Program to print the elements of an array present on odd position
    public static void oddPositionArrElements(int []a ){
        System.out.println("\nElements at odd positions : ");
        for(int i=0;i<a.length;i++){
            if(i%2!=0){
                System.out.println(a[i]);
            }
        }
    }

    // 9) Find Largest Number in an Array
    public static int largeNum(int a[]){
        int max = Integer.MIN_VALUE;
        for(int i : a){
            if(i>max){
                max=i;
            }
        }
        return max;
    }

    // 10) Find Smallest Number in an Array
    public static int smallNum(int a[]){
        int min =Integer.MAX_VALUE;
        for(int i:a){
            if(i<min){
                min=i;
            }
        }
        return  min;
    }




    //11) Java Program to print the number of elements present in an array
    public static int noOfElements(int[] a){
        return a.length;
    }
    // 12) Java Program to print the sum of all the items of the array
    public static int sumOffArr(int a[]){
        int sum=0;
        for(int i=0;i<a.length;i++){
            sum+=a[i];
        }
        return sum;
    }

    // 13) Java Program to right rotate the elements of an array
    public static void rightRotateArray(int a[]) {
        int size = a.length;
        for (int i = 0; i < 3; i++) {
            int last = a[size - 1];
            for (int j = size - 1; j > 0; j--) {
                a[j] = a[j - 1];
            }
            a[0] = last;
        }
        System.out.println("Right rotated array : ");
        for (int i = 0;i<a.length;i++) {
            System.out.print(a[i] + " ");
        }
    }
    
    
    // 14) Java Program to sort the elements of an array in ascending order
    public static void sortArr(int [] a){
        for(int i=0;i<a.length-1;i++){
         if(a[i]>a[i+1]){
            int temp=a[i];
            a[i]=a[i+1];
            a[i+1]=temp;
         }
        }
        System.out.print("The sorted array is:");
        for(int j:a){
            System.out.print(j+" ");
            }
        }
    
    // 15) Java Program to sort the elements of an array in descending order
       public static void sortArrDes(int []a){
        int n = a.length;
        int temp;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (a[j] < a[j + 1]) {
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                    }
                }
       }
       System.out.println("\n The sorted array in descending order is :");
       for (int d : a) {
        System.out.print(d + " ");
        }
        
    }
    // 16) Find 3rd Largest Number in an Array
    public static void getThirdLargest(int a[]) {
        int large1 = Integer.MIN_VALUE;
        int large2 = Integer.MIN_VALUE;
        int large3 = Integer.MIN_VALUE;
    
        for (int i : a) {
            if (i > large1) {
                large3 = large2;
                large2 = large1;
                large1 = i;
            } else if (i > large2 && i != large1) {
                large3 = large2;
                large2 = i;
            } else if (i > large3 && i != large1 && i != large2) {
                large3 = i;
            }
        }
    
        System.out.println("Third largest number: " + large3);
    }
    
       
    // 17) Find 2nd Largest Number in an Array
    public static void getSecondlargest(int a[]){
        int large1 = Integer.MIN_VALUE;
        int large2 =Integer.MIN_VALUE;
        for(int i:a){
            if(i>large1){
                large2 = large1;
                large1=i;
            }
            else if (i > large2 && i != large1) {
                large2 = i;
            }
        }
        System.out.println(large2);
    }


    

    // 18) Find 2nd Smallest Number in an Array
    public static void getSecondSmallest(int a[]){
        int small1 = Integer.MAX_VALUE;
        int small2 =Integer.MAX_VALUE;
        for(int i:a){
            if(i<small1){
                small2 = small1;
                small1=i;
            }
            else if (i < small2 && i != small1) {
                small2 = i;
            }
        }
        System.out.println(small2);
    }

    


    //19)Remove Duplicate Element in an Array
    
        public static void removeDuplicateElements(int a[]) {
            for(int i = 0;i<a.length;i++){
                for(int j=i+1;j<a.length;j++){
                    if(a[i]==a[j]){
                        a[i]=-1;
                    }
                }
                
               
                
                }
                for(int j:a){
                    if(j!=-1){
                        System.out.print(j);
            }}
        }


    // 20) Print Odd and Even Number from an Array 
    public static void printOddEven(int a[]){
        for(int i = 0;i < a.length;i++){
            if(a[i]%2==0){
                System.out.println("Even : "+a[i]+" ");
            }
            
            }
        for(int i=0;i<a.length;i++){
            if(a[i]%2!=0){
                System.out.println("Odd : "+a[i]);
            }
        }
        }

    // 22) Maximum Sum Sub Array (Kadane's Algorithm)
 public static int kadanesAlgorithm(int[] a){
        int currentSum=0;
        int maxSum=Integer.MIN_VALUE;
        int start=0;
        int end=0;
        for(int i =0; i<a.length;i++){
            currentSum+=a[i];
            if(currentSum<0){
                currentSum=0;
                start=i+1;
            }
            if(maxSum<=currentSum){
                maxSum=currentSum;
                end=i;
            }
        }
        System.out.println("SubArray indexes:"+start+","+end);
    return maxSum;
    }
    
       
        // 23) Dutch National Flag Algorithm
        public static void DutchNAtionalFlag(int[] a){
            int low = 0 ,mid =0 , high = a.length-1;
            while(mid<=high){
                if(a[mid]==0){
                    int temp = a[low];
                    a[low] = a[mid];
                    a[mid] = temp;
                    low++;
                    mid++;
                }
                else if(a[mid]==1){
                    mid++;                       // why ? 
                }
                else{
                    int temp = a[mid];
                    a[mid] = a[high];
                    a[high] = temp;
                    high--;
                }
            }
          
            
            for(int i=0;i<a.length;i++){
                System.out.print(a[i]+" ");
        }
        }
   
    // 24) Boyer Moore Algorithm(Majority Element)
    public static void boyerMooreAlgorithm(int[] a) {
        int votes = 1;
        int majorityElement = a[0];
        for (int i = 1; i < a.length; i++) {
            if (votes == 0) {
                majorityElement = a[i];
                votes++;
            } else if (majorityElement != a[i]) {
                votes--;
            } else {
                votes++;
            }
        }
    
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == majorityElement) {
                count++;
            }
        }
    
        if (count > a.length / 2) {
            System.out.println("Majority Element: " + majorityElement);
        }
    }
    
    // 25) two Sum problem 
    public static int[] twoSum(int[] nums, int target){
        HashMap<Integer,Integer>map = new HashMap<>();
        int[] ans = new int[2];
        for(int i= 0;i<nums.length;i++){
            if(map.containsKey(target-nums[i])){
                ans[0]=i;
                ans[1]=map.get(target-nums[i]);
            }
            else{
                map.put(nums[i],i);
            }

    }
    return ans;
    }

    // 26) maximumsum subarray of size k

    static long maximumSumSubarray(int K, ArrayList<Integer> Arr,int N){
        // code here
        int left=0;
        int right=K;
        long maxSum = Integer.MIN_VALUE;
        long sum=0;
        for(int i=0;i<K;i++){
            sum+=Arr.get(i);
        }
        maxSum=Math.max(sum,maxSum);
        while(right<N){
            sum+=Arr.get(right);
            sum-=Arr.get(left);
            left++;
            maxSum=Math.max(maxSum,sum);
            right++;
        }
        return maxSum;

    }
    
    

    public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int a[] = new int[n];
//         for(int i = 0;i<n;i++){
//             a[i] = sc.nextInt();
//         }
//          int[] c=copyArray(a);
//          System.out.println("Original Array");
//         for (int i : a){
//              System.out.print(i+" ");
//    }
//          System.out.println();
//          System.out.println("Copied array : ");
//          for(int i = 0 ;i<c.length;i++){
//              System.out.print(c[i]+" ,");
//          }
        //5)printArr(a);
        int a[] = {1,2,3,4,5,6,7,8,9,10};
        revArr(a);
       
        // System.out.println("The largest number in");
        // for(int i : a){
        //     System.out.print(i+" ");
        // }
        // System.out.println("is"+" " +large);
        
        // System.out.println("The smallest number in : ");
        // for(int i:a){
        //     System.out.print(i+" re");
        // }
        // System.out.println("Is "+" "+small);
        
        // 20) printOddEven(a);
        //19)getSecondSmallest(a);
        //17)getSecondlargest(a);
        // 12)int s=sumOffArr(a);
        // System.out.println("Sum of elements in an array : "+s);
        //7)evenPostionArrElements(a);
        //8)oddPositionArrElements(a);;
    // 12)   int s= noOfElements(a);
    //    System.out.println("Number of elements in an array : "+s);
    //14)sortArr(a);
    //15)sortArrDes(a);
    //  System.out.println("Original array : ");
    //   for(int i :a){
    //       System.out.print(i+" ");
    //   }
    // // 3) leftRotate(a);
    //rightRotateArray(a);
    //16)getThirdLargest(a);
    //2)frequencyOfItems(a);
    //int d[] = {1,1,1,1,3,3,3,4,5,5,5,5,};
    //   for(int i:d){
    //     System.out.print(i);
    //   }
    //4)duplicateElements(d);
    //removeDuplicateElements(d);
//    int a[] = {-1,-2,-4,-1,-2,-1,-5,-3};
//    kadanesAlgorithm(a);
    // int maxSum=kadanesAlgorithm(a);
    // System.out.println("Max Sum of given array is "+maxSum);
    //sc.close();
    // int a[] = {2,0,1,1,2,0,1,0,2};
    // 23)DutchNAtionalFlag(a);
    // int a[] = {1,1,1,1,1,1,1,1,2,2,2,2,3,3,3,4,4,};
    // 25)boyerMooreAlgorithm(a);

    //  26)int[] res = twoSum(a, 14);
    //  for(int i = 0;i<res.length;i++){
    //     System.out.print(res[i]+ " ");
    //  }
    Scanner sc=new Scanner(System.in);
    int N= sc.nextInt();
    int K = sc.nextInt();
    ArrayList<Integer> Arr = new ArrayList<Integer>(N);

    for(int i=0;i<N;i++){
        int x= sc.nextInt();
        Arr.add(x);
    }

    maximumSumSubarray(K,Arr,N);
     
     }
    }
