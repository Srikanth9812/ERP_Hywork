package utilities;

import java.io.FileInputStream;


import java.util.Properties;

public class PropertyFileUtil {
public static String getValueForKey(String key) throws Throwable
{
	Properties config=new Properties();
	config.load(new FileInputStream("E:\\OJTLiveProject\\ERP_Hywork\\PropertyFile\\Environment.properties"));
	return config.getProperty(key);
			
}
}
