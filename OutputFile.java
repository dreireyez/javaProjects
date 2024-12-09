import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class OutputFile 
{
    static Scanner inputFile;
    static FileWriter fileWriter;
    static FileWriter sampleTexWriter;
    static PrintWriter outputFile;
    public static void main(String[] args) throws IOException 
    {
        openFile();
        processFile();
        closeFile();
    }
    
    public static void openFile() throws FileNotFoundException
    {
        try 
        {
            inputFile =  new Scanner(new FileReader("SampleText.txt"));
            outputFile = new PrintWriter("SampleOutputText.txt");
        } 
        
        catch (FileNotFoundException e) 
        {
            System.out.println("An error occured.");
        }
    }

    public static void processFile() throws IOException
    {   
        File file = new File("SampleText.txt");

        //File Handling Assessment No. 2
        //while (inputFile.hasNextLine()) //Runs until there are no more lines to read.
        //{
        //        String quote = inputFile.nextLine(); //Reads next line.
        //        System.out.println(quote);
        //}
        
        //File Handling Assessment No. 4
        sampleTexWriter = new FileWriter("SampleText.txt", true);

        sampleTexWriter.write("\nThis little light of mine, I'm gonna let it shine");
        sampleTexWriter.close();

        try 
        {
            //File Handling Assessment No. 3
            fileWriter = new FileWriter("SampleOutputText.txt");

            //File Handling Assessment No. 3
            fileWriter.write(file.getName()); //Displays file name.
            fileWriter.write("\nLength: "+ file.length()+" bytes"); //Displays file size in bytes.
            fileWriter.write("\nPath: "+ file.getAbsolutePath()); //Displays file path or location.
        
            int wordCount = 0; //Tracks number of words in document
            while (inputFile.hasNext()) //Runs until there are no more lines to read.
            {
                inputFile.next(); //Reads next line.
                wordCount++; 
            }

            fileWriter.write("\nWords: "+ wordCount); //Displays number of words in file.

            fileWriter.close();
            
        }
        catch (IOException e) 
        {
            System.out.println("An error occured.");
        }
    }

    public static void closeFile()
    {
        inputFile.close();
        outputFile.close();
    }
}
