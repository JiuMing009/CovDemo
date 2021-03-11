package com.jy.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.springframework.core.convert.converter.Converter;

public class MyDateConverter implements Converter<String, Date> {

	@Override
	public Date convert(String s1) {
		// TODO Auto-generated method stub
		Date date = null;
		
		//创建对象
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
		try {
			date = sdf.parse(s1);
		} 
		catch (ParseException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		return date;
	}

}
