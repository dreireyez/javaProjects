public class Seat 
{
    private int row, col;
    private String preference;
    private boolean available;
    
    public Seat(int row, int col, String preference)
    {
        this.row = row;
        this.col = col;
        this.preference = preference;
        this.available = true;
    }

    int getRow()
    {
        return row;
    }

    int getCol()
    {
        return col;
    }

    String getPreference()
    {
        return preference;
    }

    boolean isAvailable()
    {
        return available;
    }

    void assignPassenger()
    {
        available = false;
    }
}
