package com.samsdollarsbank.util;
import com.samsdollarsbank.model.Accounts;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;



public class FileStorage {

	File da = new File("Accountz.sql");
	
	public void saveAccountInfo(List<Accounts> accList) {
		try { 
			da.delete(); 
			/*
			 * I created my own sql database file to access and modify data
			 * with MySQL workbench to illustrate dummy data....
			*/
			da = new File("Accountz.sql");
			
			FileOutputStream out = new FileOutputStream(da);
			ObjectOutputStream writer = new ObjectOutputStream(out);
			for(Accounts acc : accList) {
				writer.writeObject(acc);
			}
			writer.close();
		} catch (FileNotFoundException e) {
			System.out.println("File not found");
		}catch (IOException e) {
			System.out.println("IO Exception");
		}
		
	}
	
	public List<Accounts> findAccountInfo() {
		try {
			FileInputStream out = new FileInputStream(da);
			ObjectInputStream reader = new ObjectInputStream(out);
			List<Accounts> accList = new ArrayList<Accounts>();
			while(true) {
				try {
					accList.add( (Accounts) reader.readObject());
				} catch (EOFException e) {
					System.out.println(ColorsUtil.GREEN + "\n *********** Processing/Reading data from SQL database file: ***********" + ColorsUtil.RESET);
					break;
				}
				
			}
			reader.close();
			return accList; 
			
		}catch (ClassNotFoundException e) {
				System.out.println("IO Exception");
				return null; 
		}catch (IOException e) {
			System.out.println("IO Exception");
			return null;
		}
		
		
	}
	
}