package com.picsniff.uitilities;

import java.io.FileInputStream;
import java.util.Properties;

import javax.management.RuntimeErrorException;

public class ReadConfig {
	
	Properties properties;
	String path = "D:\\JavaProjects\\PicSniff\\Configurations\\config.properties";
	public ReadConfig() {
		
		try {
			properties = new Properties();
			FileInputStream fis = new FileInputStream(path);
properties.load(fis);
	}catch (Exception e) {
		e.printStackTrace();
		}
	}
	public String getGalleryLink() {
		String value = properties.getProperty("galleryUrl");
		if (value!=null)
		return value;
		else
			throw new RuntimeException("Gallery link not specified in config file");
		}
	public String getGalleryLink1() {
		String value = properties.getProperty("galleryUrl1");
		if (value!=null)
		return value;
		else
			throw new RuntimeException("Gallery link not specified in config file");
		}
	public String getGooglePageLink() {
		String value = properties.getProperty("glink");
		if (value!=null)
		return value;
		else
			throw new RuntimeException("Gallery link not specified in config file");
		}

	public String getBrowser() {
		String value = properties.getProperty("browser");
		if (value!=null)
		return value;
		else
			throw new RuntimeException("Browser not specified in config file");
		}
	public String getPhoto() {
		String value = properties.getProperty("photo");
		if (value!=null)
		return value;
		else
			throw new RuntimeException("Photo not specified in config file");
		}
	public String getPhoto1() {
		String value = properties.getProperty("photo1");
		if (value!=null)
		return value;
		else
			throw new RuntimeException("Photo not specified in config file");
		}
	public String getCommonEmail() {
		String value = properties.getProperty("commontestemail");
	if (value!=null)
		return value;
	else
		throw new RuntimeException("Common test email is not specified in config file");
		
	}
	public String getAlgomageLoginLink() {
		String value = properties.getProperty("algomageloginlink");
	if (value!=null)
		return value;
	else
		throw new RuntimeException("Algomage login page link is not specified in config file");
		
	}
	public String getAlgomageEmailAddress() {
		String value = properties.getProperty("algomageuseremail");
	if (value!=null)
		return value;
	else
		throw new RuntimeException("Algomage user email address is not specified in config file");
		
	}
	public String getAlgomageUserPassword() {
		String value = properties.getProperty("algomageuserpassword");
	if (value!=null)
		return value;
	else
		throw new RuntimeException("Algomage user password is not specified in config file");
		
	}
	
}
