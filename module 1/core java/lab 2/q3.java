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

abstract class WrittenItem extends Item
{
	private String author;
	
	public Item(String author)
	{
		this.author=author;
	}
	public void setAuthor(String author)
	{
		this.author=author;
	}
	public String getAuthor()
	{
		return author;
	}
	
	
	abstract void print{}
	
	void checkOut{}
	
	void checkIn{}
	
	void addItem{}
	
}

class book extends WrittenItem
{
	void print{}
	
	void checkOut{}
	
	void checkIn{}
	
	void addItem{}
	
}

class JournalPaper extends WrittenItem
{
	private int year_published;
	
	public JournalPaper(int year_published)
	{
		this.year_published=year_published;
	}
	
	public void setYearPublished(int year_published)
	{
		this.year_published=year_published;
	}
	public int getYearPublished()
	{
		return year_published;
	}
	void print{}
	
	void checkOut{}
	
	void checkIn{}
	
	void addItem{}
	
	
}