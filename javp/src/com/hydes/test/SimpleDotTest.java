package com.hydes.test;
class SimpleDotCom
{
	int [] locationOfHits;
	int noOfHits;
	public void setLocationOfHits(int[] locationOfHits) {
		this.locationOfHits = locationOfHits;
	}
	public String checkYour(String guss)
	{
		int gues= Integer.parseInt(guss);
		String result= "miss";
		for(int cell : locationOfHits)
		{
			if(gues==cell)
			{
				result="hit";
				noOfHits++;
				break;
			}
		
		}
		if(noOfHits==locationOfHits.length)
		{
			result="kill";
		}
		System.out.println(result);
		return result;
		
		
	}
}

public class SimpleDotTest {

	public static void main(String[] args) {
		SimpleDotCom sdc = new SimpleDotCom();
		int location[]= {2,3,4};
		sdc.setLocationOfHits(location);
		String guss="2";
		String result= sdc.checkYour(guss); 
	}

}
