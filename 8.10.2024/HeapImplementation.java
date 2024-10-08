class HeapImplementation {
    public static void main(String[] args) {
        int arr[] = {12 , 11 , 13 , 5 , 6 , 7} ;
        HeapSort h1 = new HeapSort() ;
        h1.sort(arr) ;

        for(int i=0 ; i<arr.length ; i++) {
            System.out.println(arr[i]);
        }
    }
}

class HeapSort {
    void sort(int arr[]) {
        int n = arr.length ;
        
        // n/2 -> pehla non-leaf node
        for(int i=(n/2)-1 ; i>=0 ; i--) {
            heapify(arr , i , n) ;
        }
        
        // jb ek element sort hogya to ab sort hoga last se and size ek se kam hoga
        for(int i=n-1 ; i>=0 ; i--) {
            // swap
            int temp = arr[0] ;
            arr[0] = arr[i] ;
            arr[i] = temp ;
            
            heapify(arr , 0 , i) ; // i-> har loop mei piche se size kam ho raha hai 
        }
    }
    
    void heapify(int arr[] , int idx , int len) {
        int parent = idx ;
        int left = 2*parent+1 ; // left child
        int right = 2*parent+2 ; // right child
        
        // index check krna pyega nahi ta index out of bound hojega
        if(left<len && arr[parent] < arr[left]) {
            parent = left ;
        }

        if(right<len && arr[parent] < arr[right]) {
            parent = right ;
        }

        // swap hoyega if parent index de equal nahi hai
        if(parent != idx) {
            int temp = arr[parent] ;
            arr[parent] = arr[idx] ;
            arr[idx] = temp ;

            // recursive call 
            heapify(arr, parent, len);
        }
    }
}