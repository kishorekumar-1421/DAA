import java.util.Random; 

public class SeqSort {
    static int searchcount=0; 
    static int sortcount=0;
    
    public static void sequentialSearch(int[] a, int key) 
    { 
        int n = a.length;
        int i;
        for ( i = 0; i < n; i++) 
        { 
            searchcount++;
            if(a[i]==key)
            {
                break;
            }
        }
            if(i<n)
            {
                System.out.println("key found at"+i);
            }
            else
            {
                System.out.println("key not found");
            }
    } 
    public static void selectionSort(int[] a) { 
        int n = a.length; 
        for (int i = 0; i < n - 1; i++) { 
            int min = i; 
            for (int j = i + 1; j < n; j++) 
            { 
                sortcount++; 
                if (a[j] < a[min]) 
                { 
                    min = j; 
                } 
            }
            int temp = a[min]; 
            a[min] = a[i]; 
            a[i] = temp; 
        } 
    } 
    public static void main(String[] args) { 
        
        Random r = new Random(); 
        System.out.print(" the number of elements is 4000 "); 
        int n = 4000; 
        int[] a = new int[n]; 
        for (int i = 0; i < n; i++) { 
            a[i] = r.nextInt(10000);
        } 
        int rnd = r.nextInt(a.length); 
        System.out.println("random number is:"+a[rnd]); 
        System.out.print(" the key to search: is 200 "); 
        int key = 200; 
        sequentialSearch(a,key);
        System.out.println("Number of basic operations for searching is: "+searchcount); 
        selectionSort(a); 
        System.out.println("Sorted numbers are:"); 
        for(int i=0;i<5;i++) 
            System.out.println(a[i]); 
        System.out.println("Number of basic operations for sorting is: "+sortcount); 
        } 
} 
