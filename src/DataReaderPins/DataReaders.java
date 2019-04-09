package DataReaderPins;

public class DataReaders {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		readXLS(); 
		
	}

	
	public static void readXLS() {
	String filename = "C:\\Users\\Ayobami\\Documents\\tess.xls";	
	String [][] data = Utilities.Excel.get(filename);
	for (String[] record:data) {
		System.out.println(record[1]);

		
	}
	
}
}

