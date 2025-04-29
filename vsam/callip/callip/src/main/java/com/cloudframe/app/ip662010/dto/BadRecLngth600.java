package com.cloudframe.app.ip662010.dto;

/**
*  The class BadRecLngth600 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:30. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class BadRecLngth600 extends BadRecLngth600Serialized {
   


								@Getter @Setter private char[] parsedLngth600 = Field.fillLowValue(6);


								@Getter @Setter private char[] rdwLngth600 = Field.fillLowValue(6);

	
	/**
	* Constructor for BadRecLngth600
	**/
    public BadRecLngth600() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             ("PARSED MSG LENGTH ( ").toCharArray()
             , getStartOffset() + 0
             ,20
             );
       replaceValue( // serialize and save the value
             (") NOT EQUAL TO RECORD LENGTH (").toCharArray()
             , getStartOffset() + 26
             ,30
             );
       replaceValue( // serialize and save the value
             (").").toCharArray()
             , getStartOffset() + 62
             ,2
             );
    }





}
  
