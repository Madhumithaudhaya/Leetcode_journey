class Solution {
    public int maxProfit(int[] prices) {
        int minPrice=Integer.MAX_VALUE;
        int maxProfit=0;

        for(int price: prices)
        {
            if(price<minPrice)
            {
                minPrice=price;
            }
            else
            {
            maxProfit=Math.max(maxProfit, price-minPrice);
            }
        }        
        return maxProfit;
    }
    public static void main(String []args)
    {
        Scanner scanner =new Scanner(System.in);
        int []prices=new int[20];
        Solution ob=new Solution();
        System.out.println(ob.maxProfit(prices));
    }
}