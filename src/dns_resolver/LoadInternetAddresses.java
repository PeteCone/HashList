package dns_resolver;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import data_structures.Hash;
import data_structures.HashI;
import exceptions.FileFormatException;


/**
 * The LoadInternetAddresses class should take a filename as a string, uses BufferedReader
 * to read the file, split the lines into URLs and IPAddresses, and create the appropriate
 * objects. It should add those objects to a hash, and finally, after reading the whole file
 * it should return the instance of the hash.
 * 
 * If there is an error with the file format, you should throw a new FileFormatException error
 * with an appropriate message.
 *  
 * @author 
 *
 */
public class LoadInternetAddresses {

	
	
	public HashI<URL, IPAddress> load_addresses(String filename) throws FileFormatException {
		HashI<URL, IPAddress> hash = 
		return null;
	}
}
