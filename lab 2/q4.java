abstract class Item
{
	private int id;
	private String title;
	private int no_of_copies;
	
	public Item(int id, String title, int no_of_copies)
	{
	this.id=id;
	this.title=title;
	this.no_of_copies=no_of_copies;
	}
	
	abstract void print{}
	
	abstract void checkOut{}
	
	abstract void checkIn{}
	
	abstract void addItem{}
	
	public void setId(int id)
	{
		this.id=id;
	}
	public int getId()
	{
		return id;
	}
	
	public void setTitle(String title)
	{
		this.title=title;
	}
	public String getTitle()
	{
		return title;
	}
	
	public void setNoOfCopies(int no_of_copies)
	{
		this.no_of_copies=no_of_copies;
	}
	public int getNoOfCopies()
	{
		return no_of_copies;
	}
	
	public String toString()
	{
		return id+" "+title+" "+no_of_copies;
	}
	
	public boolean equals()
	{
	}
}

abstract class MediaItem extends Item
{
	private int runtime;
	
	public MediaItem(int runtime)
	{
		this.runtime=runtime;
	}
	
	public void setRuntime(int runtime)
	{
		this.runtime=runtime;
	}
	public int getRuntime()
	{
		return runtime;
	}
	
	abstract void print{}
	
	void checkOut{}
	
	void checkIn{}
	
	void addItem{}
}