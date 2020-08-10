import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Counter class for reading, counting and summarize numbers from text file
 * @author Theetouch Kasemarnontana
 *
 */
public class Counter {
	//initialize variables
	Scanner input = null;
	int count = 0;
	double sum = 0;

	/**
	 * read the file to count and sum numbers from the text file by using 
	 * filename as parameter
	 * @param filename
	 */
	public void readfile(String filename) {
		try {
			//point the Scanner to the file using File class
			input = new Scanner(new File(filename));
			//while the text file still have next line(s)
			while (input.hasNextLine()) {
				//store a line value to String
				String line = input.nextLine();
				try {
					//try parse a String to Double, if its int or double it will pass the condition
					double num = Double.parseDouble(line);
					//count and add its value to 'sum' variable
					count++;
					sum += num;
				} catch (NumberFormatException e) {
				}
			}
		} catch (FileNotFoundException e) {
			//show a message when file not found
			System.out.println("File not found:" + filename);
		}
	}

	/**
	 * 
	 * @return counted number
	 */
	public int getCount() {
		return count;
	}

	/**
	 * 
	 * @return the sum number
	 */
	public double getTotal() {
		return sum;
	}
}