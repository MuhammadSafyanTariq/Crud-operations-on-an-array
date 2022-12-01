class CRUDandARRAY{


CRUDandARRAY(Integer[] array) {this.array=array;}
  
  Integer array[];
 void printArray() {
   //this. array=array;
   Integer arrayLength=array.length;
   Integer i=0;
   while(i<arrayLength){
         System.out.println(array[i]);
     i++;

   }
 }




  void insertNum(Integer num, Integer index) {
   //this. array=array;
   Integer arrayLength=array.length;
   Integer i=arrayLength;
    
   while(i<=index){
    array[i+1]=array[i];
     i--;
   }
    array [index]=num;
 }

  void deleteNum(Integer index) {
   //this. array=array;
   Integer arrayLength=array.length;
   Integer i=arrayLength-1;
    Integer j=index;
   while(j<i){
    array[j]=array[j+1];
     j++;
   }
    
    array[i]=null;
 }


     
void changeNum(Integer index1, Integer index2) {
  Integer temp=array[index1];
  array[index1]=array[index2];
array[index2]=temp;

 }




  
}






class Main {
  public static void main(String[] args) {
    
    
    Integer[] array={1,2,3,4,5};
    CRUDandARRAY c=new CRUDandARRAY(array);
    c. printArray() ;
    System.out.println("_______");
    c.insertNum(9, 2);
    c. printArray() ;
    System.out.println("_______");
    c.deleteNum(3);
    c. printArray() ;
    c. changeNum(1, 2);
    c. printArray() ;

  }
}