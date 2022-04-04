package org.configuration_helper;

import java.io.IOException;

public class File_read_manager {
	private File_read_manager() {

	}

	public static File_read_manager get_FRM() {
		File_read_manager read = new File_read_manager();
		return read;

	}

	public Configuration_Reader get_CR() throws IOException  {
		Configuration_Reader reader = new Configuration_Reader();
		return reader;
	}

	
}
