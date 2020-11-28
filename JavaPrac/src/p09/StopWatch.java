package p09;

public class StopWatch 
{
	private long startTime;
	private long endTime;
	
	public StopWatch()
	{
	}
	
	public long start()
	{
		startTime = System.currentTimeMillis();
		return startTime;
	}
	
	public long stop()
	{
		endTime = System.currentTimeMillis();
		return endTime;
	}
	
	public long getElapsedTime()
	{
		//return (endTime - startTime) / 1000;
		return (endTime - startTime);
	}
	
	
	
	
	public long getStartTime() {
		return startTime;
	}
	public long getEndTime() {
		return endTime;
	}
	
}
