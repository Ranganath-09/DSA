//  reverse an array 

public class problem1 {
    public static void main(String[] args) {
   int[] arr={1,2,3,4,5};
   
int n=arr.length;
    
swap(arr, n);
}
static void swap(int[] arr,int n){
    int[] temp =new int[n];
    for(int i=0;i<n;i++){
        temp[i]=arr[n-i-1];
        //  n-1=1 2 3 4 5  n-i-1=5 4 3 2 1  
    }
    for(int i=0;i<n;i++){
        arr[i]=temp[i];
        
        System.out.print(arr[i] + " ");
    }
    
}

}
