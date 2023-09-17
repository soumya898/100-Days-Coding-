public class SelectionSort{


 
public static void main(String[] args) {
    
     int []arr={7,2,9,6,1,5,4};
      
     for( int i=0;i<arr.length-1;i++){

        int minIdx=i;
        for(int j=i+1;j<arr.length;j++){

            if(arr[j]<arr[minIdx]){

                   // upadte 
                   
                     minIdx=j;

            }
        }
        if(minIdx!=i){
 
            // swap
            int temp=arr[i];
            arr[i]=arr[minIdx];
            arr[minIdx]=temp;

        }

     }

       for(int i=0;i<arr.length;i++){
             System.out.print(arr[i]+ " ");
       }




}



}