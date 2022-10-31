class Solution {
    public int earliestFullBloom(int[] plantTime, int[] growTime) {
        
        
        List<bloom> flower=new ArrayList<>();
        for(int i=0;i<growTime.length;i++){
            flower.add(new bloom(plantTime[i],growTime[i]));
        }
        
        Collections.sort(flower, (a,b)->(b.growTime - a.growTime));

		int time=0;
		int max=0;
		
		for(int i=0;i<plantTime.length;i++){
			time += flower.get(i).plantTime;
			max = Math.max(max,time+flower.get(i).growTime);
		}
		return max;
    }

        private class bloom{
            int plantTime;
            int growTime;

            public bloom(int pt,int gt){
                this.plantTime=pt;
                this.growTime=gt;
            }

        }
}

