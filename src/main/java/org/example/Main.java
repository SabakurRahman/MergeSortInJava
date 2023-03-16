package org.example;

public class Main {
    public static void conquer(int[] arr,int si,int mid,int ei){
        int[] merge = new int[ei-si+1];
        int ind1=si;
        int ind2=mid+1;
        int x=0;

        while(ind1<=mid && ind2<=ei){
            if(arr[ind1]<arr[ind2]){
                merge[x]=arr[ind1];
                x++;ind1++;
            }
            else{
                merge[x]=arr[ind2];
                x++;ind2++;
            }

        }
        while(ind1<=mid){
            merge[x]=arr[ind1];
            x++;ind1++;

        }
        while(ind2<=ei){
            merge[x]=arr[ind2];
            x++;ind2++;

        }

        for (int i=0, j=si;i<merge.length;i++,j++){
            arr[j]=merge[i];


        }






    }

    public static void divided(int[] arr,int si,int ei){
        //int mid=si+(ei-si)/2;
        if(si>=ei){
            return;
        }

        int mid = (si+ei)/2;

        divided(arr,si,mid);
        divided(arr,(mid+1),ei);
        conquer(arr,si,mid,ei);

       // System.out.println(ei);

    }
    public static void main(String[] args) {
      int[] arr = {6,4,3,9,7,8};
      int n = arr.length;
      divided(arr,0,n-1);

      for (int i=0;i<arr.length;i++){
          System.out.print(arr[i]+" ");
      }


    }
}