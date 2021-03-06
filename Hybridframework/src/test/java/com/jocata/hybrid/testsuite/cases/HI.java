package com.jocata.hybrid.testsuite.cases;

import org.json.simple.parser.JSONParser;

import net.sf.json.JSONException;
import net.sf.json.JSONSerializer;

public class HI {

	
	JSONParser parser = new JSONParser();
	ResultSet rs = preparedStatement.executeQuery();

	while (rs.next()) {
	    for (String column : columnsList.split(",")) {
	        //check whether rs.getString(column) is a valid JSON String?
	        try{ 
	            parser.parse(rs.getString(column)); 
	            System.out.println("Valid JSON String data");
	        } catch (ParseException e) {
	            System.out.printlnn("Invalid JSON String data");
	        }
	    }
	}

	}





