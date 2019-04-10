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


class Video extends MediaItem
{
	private String director;
	private String genre;
	private int year_released;
	
	public Video(String director, String genre, int year_released)
	{
		this.director=director;
		this.genre=genre;
		this.year_released=year_released;
	}
	
	public void setDirector(String director)
	{
		this.director=director;
	}
	public String getDirector()
	{
		return director;
	}
	
	public void setGenre(String genre)
	{
		this.genre=genre;
	}
	public String getGenre()
	{
		return genre;
	}
	
	public void setYearReleased(int year_released)
	{
		this.year_released=year_released;
	}
	public String getYearReleased()
	{
		return year_released;
	}
	
	abstract void print{}
	
	abstract void checkOut{}
	
	abstract void checkIn{}
	
	abstract void addItem{}
	
}

class CD extends MediaItem
{
	private String artist;
	private String genre;
	
	public CD(String artist, String genre)
	{
		this.artist=artist;
		this.genre=genre;
		
	}
	
	public void setArtist(String artist)
	{
		this.artist=artist;
	}
	public String getArtist()
	{
		return artist;
	}
	
	public void setGenre(String genre)
	{
		this.genre=genre;
	}
	public String getGenre()
	{
		return genre;
	}
	
	abstract void print{}
	
	abstract void checkOut{}
	
	abstract void checkIn{}
	
	abstract void addItem{}
}