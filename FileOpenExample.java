import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class FileOpenExample 
{
    public static void main(String[] args) 
    {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter file name: ");
        String filename = sc.nextLine();

        try {
            Scanner fileReader = new Scanner(new File(filename));
            System.out.println("File opened successfully!");
            fileReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
        }

        sc.close();
    }
}
