class Codechef
{
    
    public static void main(String[] args){
        Scanner in =new Scanner(System.in);
        ArrayList<ArrayList<Integer>> list=new ArrayList<>();
        //initialisation
        for (int i=0;i<3;i++){
            list.add(new ArrayList<>());
        }
        // Add elements in the Array
        for (int i=0;i<3;i++){ //row 
            for (int j=0;j<2;j++){ //column
                list.get(i).add(in.nextInt());
        }
    }
        System.out.println(list);
}
}
