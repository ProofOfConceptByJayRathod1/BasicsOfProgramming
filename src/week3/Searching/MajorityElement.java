package week3.Searching;



//User function Template for Java

class MajorityElement
{
  static boolean check(int arr[], int index){
      int count=0;
      for(int i=0; i<arr.length; i++){
          if(arr[i] == arr[index]){
              count++;
          }
      }
      int majority = arr.length/2;
      if(count > majority){
          return true;
      }
      else{
          return false;
      }
  }
  
  static int majorityElement(int a[], int size){
      int index = 0;
      int count = 1;
      for(int i=0; i<size; i++){
          if(a[i] == a[index]){
              count++;
          }
          else{
              count--;
          }
          if(count == 0){
              index = i;
              count = 1;
          }
      }
      if(check(a, index)){
          return a[index];
      }
      else{
          return -1;
      }
  }
}