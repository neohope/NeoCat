package org.neocat.factory;

import org.apache.catalina.UserDatabase;
import org.apache.catalina.users.MemoryUserDatabase;

public class NeoFactory {
    /**
     * Load UserDatabase from tomcat-users.xml
     */
	public static final UserDatabase getUserDatabase() throws Exception {
		MemoryUserDatabase database = new MemoryUserDatabase("UserDatabase");
		database.setPathname("conf/tomcat-users.xml");
		database.setReadonly(true);
        database.open();
        return database;
	}
}
