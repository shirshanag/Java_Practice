class Main{
    public static void main(String args[]){
        int arr[][]={{1,2,3},{5,6,7,8,10}};
        System.out.println("Accessing an element:"+arr[1][2]);
        arr[1][2]=9;
        System.out.println("Updating an element in  array:"+arr[1][2]);
        System.out.println("No. of rows:"+arr.length);
        System.out.println("No of Columns for row 1:"+arr[0].length);
        System.out.println("No of Columns for row 2:"+arr[1].length);
        System.out.println("All the elements of array!!");
        for(int [] num : arr){
            for(int row : num ){
                System.out.println(row);
            }
        }
        
