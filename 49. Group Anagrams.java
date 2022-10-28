class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
       Map<String,List<String>>map=new HashMap<>();
           
        for(int i=0;i<strs.length;i++){
            //traversing through each string of strs
            //sorting and storing
            char[] ch=strs[i].toCharArray();
            Arrays.sort(ch);
            String strSort=String.valueOf(ch);
            if(!map.containsKey(strSort)){//not contain key
                map.put(strSort,new ArrayList<String>());
                //key:sortedstring
                //value:coresponding string as list of strings
                //so basically we check if after sorting if that element is
                //present in map,if yes we add the orignal string to list i.e value of map
                //if not we input new key(sorted array) in map and value(orignal string)
              }
            map.get(strSort).add(strs[i]);//arraylist name.add//here value is arraylist
        }
        List<List<String>> answer=new ArrayList<List<String>>();
        answer.addAll(map.values());
        // addall method appends all the elements from the given collection to the end of the list. The order of insertion depends on the order in which the collection iterator returns them.
        return answer;
    }
}
