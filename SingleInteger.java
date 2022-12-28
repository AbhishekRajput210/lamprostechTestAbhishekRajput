import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    int size,i,j,temp,ans=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("How Many Numbers You Want To Enter");
		size = sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter Array Elements");
		for(i=0;i<size;i++){
		    arr[i] = sc.nextInt();
		}
	
		for(i=0;i<size;i++){
		    for(j=0;j<size;j++){
		        if(arr[i]<arr[j]){
		            temp=arr[i];
		            arr[i]=arr[j];
		            arr[j]=temp;
		        }
		    }
		}
		for(i=0;i<size;i++){
		    for(j=1;j<size;j++){
		        if(arr[i]!=arr[j]){
		            ans=arr[i];
		        }
		    }
		}
		System.out.println("Single :"+ans);
		}
}
