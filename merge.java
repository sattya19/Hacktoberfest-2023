
public class Main
{
    
    static void Merge(int[] a,int l,int mid,int r){
        int i=l;
        int j=mid+1;
        int k=l;
        int[] b=new int[a.length];
        while(i<=mid && j<=r){
            if(a[i]<a[j]){
                b[k]=a[i];
                i++;
            }
            else{
                b[k]=a[j];
                j++;
            }
            k++;
        }
        if(i>mid){
            while(j<=r){
                b[k]=a[j];
                k++;
                j++;
            }
        }
        else{
            while(i<=mid){
                b[k]=a[i];
                k++;
                i++;
            }
        }
        
        for(int h=l;h<=r;h++){
            a[h]=b[h];    
        }
    }
    
    
    static void MergeSort(int[] a,int l,int r){
        if(l<r){
            int mid=(l+r)/2;
            MergeSort(a,l,mid);
            MergeSort(a,mid+1,r);
            Merge(a,l,mid,r);
        }
    }
    
    
    
    static void print(int[] ar,int len){
        for(int i=0;i<len;i++){
            System.out.print(ar[i]+" ");
        }
        System.out.println();
    }
    
    
    
	public static void main(String[] args) {
// 		 int a[] = { 12, 31, 25, 8, 32, 17, 40, 42 };
          int a[] = {2, 4, 1, 3, 5};
		 System.out.println("Before sorting");
		 print(a,a.length);
		 System.out.println("After sorting");
		 MergeSort(a,0,a.length-1);
		 print(a,a.length);
	}
}


