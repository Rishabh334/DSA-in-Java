static void selection (int arr[],int c,int r ,int max){
if(r==0) return ;
if(c<r){
    if(arr[c]>=arr[max]){
selection(arr, c+1, r, c);
    }

    else selection(arr, c+1, r, max);
}

else{
    int temp=arr[max];
    arr[max]=arr[r-1];
    arr[r-1]=temp;
     selection(arr, c, r-1, max);
}
}
    

