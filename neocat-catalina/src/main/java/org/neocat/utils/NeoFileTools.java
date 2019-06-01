package org.neocat.utils;

import java.io.File;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NeoFileTools {

	static Logger log = LoggerFactory.getLogger(NeoFileTools.class);

	/**
	 * delete directory by path
	 */
	public static void deleteDir(String dir) {
		if (!dir.endsWith(File.separator)) {
			dir = dir + File.separator;
		}
		
		File dirFile = new File(dir);
		if ((!dirFile.exists()) || (!dirFile.isDirectory())) {
			log.warn("folder not exist: " + dir);
			return;
		}
		
		deleteDir(dirFile);
	}
	
	/**
	 * delete directory by File
	 */
	public static void deleteDir(File dirFile) {
		File[] contents = dirFile.listFiles();
	    if (contents != null) {
	        for (File f : contents) {
	            deleteDir(f);
	        }
	    }
	    dirFile.delete();
	}
}
