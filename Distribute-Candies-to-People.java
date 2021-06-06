class Solution {
    public int[] distributeCandies(int candies, int num_people) {
        int i=0,dist=1;
        int[] arr=new int[num_people];
        while(candies>0){
            if(dist>candies) arr[i]=arr[i]+candies;
            else{
                arr[i]=arr[i]+dist; 
                i++; 
            }
            candies=candies-dist; 
            dist++; 
            if(i==num_people) i=0;
        }
        return arr;
    }
}
