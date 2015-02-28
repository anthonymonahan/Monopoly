package edu.ncsu.monopoly;

public abstract class Cell implements IOwnable {
	private boolean available = true;
	private String name;
	protected Player theOwner;

	public String getName() {
		return name;
	}

	public Player getTheOwner() {
		return getTheOwner();
	}
	
	public int getPrice() {
		return 0;
	}
	

	public boolean isAvailable() {
		return available;
	}
	
	public abstract boolean playAction(String msg);

	public void setAvailable(boolean available) {
		this.available = available;
	}
	
	void setName(String name) {
		this.name = name;
	}

	public void setTheOwner(Player theOwner) {
		this.theOwner = theOwner;
	}
    
    public String toString() {
        return name;
    }
}
