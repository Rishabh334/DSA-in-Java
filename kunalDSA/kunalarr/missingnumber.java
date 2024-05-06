import java.util.*;

public class missingnumber {
    public static void main(String[] args) {
    Scanner sc= new Scanner (System.in);
    int n=sc.nextInt();
    int arr[]=new int [n];
    int sum=0;

for(int i=0;i<=n;i++){
sum=sum+i;

}

int sum2=0;

for(int i=0;i<n;i++){
    arr[i]=sc.nextInt();

}
for(int j=0;j<n;j++){
    sum2=sum2+arr[j];

}
System.out.println(sum - sum2);
}
}
