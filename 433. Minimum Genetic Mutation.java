class Solution {
    public int minMutation(String start, String end, String[] bank) {
       
    //implementing BFS
     
        Queue<String> q = new LinkedList<>(); // for BFS
        
        Set<String> vis = new HashSet<>(); //string as a node is visited or not
        
        q.add(start);
        vis.add(start); // initial condition
        
        char[] ch=new char[]{'A','C','G','T'};
        int steps = 0;//answer
        
        while(!q.isEmpty())
        {
            int size = q.size();
            for(int j=0;j<size;j++)
            {
                // base condition
                
                String node = q.remove();
                if(node.equals(end)) // if start=end return total steps involved hypothetically
                {
                    return steps;
                }
                
                for(char c : ch)
                {
                    for(int i=0;i<node.length();i++)//string check 
                    {
                        String neighbour = node.substring(0,i) + c + node.substring(i+1);
                        if(!vis.contains(neighbour) && Arrays.asList(bank).contains(neighbour))
                        {
                            // only if the neighbour not visited before and contains in bank we will add to queue and make it visited and this is what bfs says
                            
                            q.add(neighbour);
                            vis.add(neighbour);
                            
                        }
                    }
                }
            }
            steps++;
        }
        return -1;
        
        
    }
}
