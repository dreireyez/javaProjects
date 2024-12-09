public class Airplane 
{
    private Seat[][] firstClass;
    private Seat[][] economyClass;

    public Airplane()
    {
        initializeSeats();
    } 

    private void initializeSeats()
    {
        firstClass = new Seat[5][2];
        economyClass = new Seat[10][4];

        //First Class
        for(int i=0; i<firstClass.length; i++)
        {
            for(int j=0; j<firstClass[i].length; j++)
            {
                //Since there are only two columns, all seats are window seats
                firstClass[i][j] = new Seat(i, j, "W");
            }
        }

        //Economy Class
        for(int i=0; i<economyClass.length; i++)
        {
            for(int j=0; j<economyClass[i].length; j++)
            {
                //Assigns which seats are window and aisle seats
                if(i == 0 || i == 3)
                economyClass[i][j] = new Seat(i, j, "W");
                else
                economyClass[i][j] = new Seat(i, j, "A");
            }
        }
    }
    
   String addPassengers(String classType, int numPassengers, String preference) {
    // Checks passenger class type
    String seatAssignment = "Assigned seats: ";

    if (classType.equals("F")) 
    {
        // Adds the given number of passengers to seat of their preference (First Class)
        for (int i = 0; i < numPassengers; i++) 
        {
            for (int j = 0; j < 2; j++) { // j is the number of columns in first class
                if (firstClass[i][j].isAvailable()) 
                {
                    firstClass[i][j].assignPassenger();
                    seatAssignment += (i + 1);
                    switch (j) 
                    {
                        case 0:
                            seatAssignment += "A ";
                            break;

                        case 1:
                            seatAssignment += "B ";
                            break;
                    }
                    numPassengers--;
                }
            }
        }  
    } 
    
    else 
    {
        // Adds the given number of passengers to seat of their preference (Economy Class)
        for (int i = 0; i < numPassengers; i++) 
        {
            // Stores the number of passengers assigned to a window seat in a row
            int windowAssignment = 0;
            for (int j = 0; j < 4; j++) // j is the number of columns in economy class
            { 
                if (preference.equals("W")) 
                {
                    if (j == 0 || j == 3) 
                    {
                        if (economyClass[i][j].isAvailable()) 
                        {
                            economyClass[i][j].assignPassenger(); // Window Seat
                            seatAssignment += (i + 1);
                            switch (j) 
                            {
                                case 0:
                                    seatAssignment += "A ";
                                    break;

                                case 3:
                                    seatAssignment += "D ";
                                    break;
                            }
                            windowAssignment++;
                            numPassengers--;

                            if (windowAssignment == 2)
                                break;
                        }
                    }
                } else 
                {
                    if (economyClass[i][j].isAvailable()) 
                    {
                        economyClass[i][j].assignPassenger();
                        seatAssignment += (i + 1);
                        switch (j) {
                            case 1:
                                seatAssignment += "B ";
                                break;

                            case 2:
                                seatAssignment += "C ";
                                break;
                    }
                    numPassengers--;
                }
            }
        }
    }
}
    return seatAssignment;
}


    String showSeating()
    {
        //Initializing seatPlan variable
        String seatPlan;
        //Displays first class passengers
        seatPlan = "\nFirst Class:\n";
        seatPlan += printSeats(firstClass);
        
        //Displays economy class passengers
        seatPlan += "\nEconomy Class:\n";
        seatPlan += printSeats(economyClass);

        return seatPlan;
    }

    String printSeats(Seat[][] seats)
    {
        //Initializing seating variable
        String seating="";
        int rowNumber;
        
        for(int i=0; i<seats.length; i++)
        {   
            rowNumber = i+1;
            for(int j=0; j<seats[i].length; j++)
            {
                //Prints row number
                seating += rowNumber;
                //Prints column 
                switch (j) {
                    case 0:
                        seating += " A";
                        break;
                
                    case 1:
                        seating += " B";
                        break;
                    
                    case 2:
                        seating += " C";
                        break;

                    case 3:
                        seating += " D";
                        break;
                }

                //Checks if seat is available or not
                if(seats[i][j].isAvailable())
                {
                    seating += " Available";
                }
                else
                {
                    seating += " Assigned";
                }
                //Displays next seat
                seating += "\t";
            }
            //Displays next row
            seating += "\n";
        }

        return seating;
    }
}