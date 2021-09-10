package model;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class InfrastructureDepartment {
	
	public InfrastructureDepartment() {
		
	}
	
	public String addBillboard(double width, double height, boolean usage, String brand) {
		String msg = "";
		
		return msg;

	}
	

	public String showBillboard() {
		String msg = "";

		return msg;
	}
	

	public String exportDangerousBillboardReport() {
		String msg = "";

		return msg;

	}
	
	public void importData() {

		try {
			File f = new File("BillboardDataExported.csv");
			FileInputStream fis = new FileInputStream(f);
			ByteArrayOutputStream baos = new ByteArrayOutputStream();
			byte[] buffer = new byte[1024];
			int read = 0;
			while ((read = fis.read(buffer)) != -1) {

				baos.write(buffer, 0, read);

			}
			fis.close();
			baos.close();

			String csv = baos.toString();

		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
