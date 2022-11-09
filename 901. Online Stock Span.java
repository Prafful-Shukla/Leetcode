class StockSpanner {
    
    Stack<Integer> priceStack;//for price of a stock
    Stack<Integer> spanStack;//for the span count
    
    public StockSpanner() {
        priceStack=new Stack<>();
        spanStack=new Stack<>();
    }
     
    public int next(int price) {
        // pop, check, then push 
        
        int spancount =1;
        
        // pop till element is smaller or when u find the bigger element than current  
        //stack empty means index will be zero to index , so difference=index
        while(!priceStack.isEmpty() && priceStack.peek() <=price){
            priceStack.pop();
            spancount=spancount+spanStack.pop();
        }
        priceStack.push(price);
        spanStack.push(spancount);
        return spancount;//u need to return count i.e spam
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */
