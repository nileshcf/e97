package com.cloudframe.app.sf328010.dto;

/**
*  The class Message6008002 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:33. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class Message6008002 extends Message6008002Serialized {
   


								@Getter @Setter private char[] sys201Written6008002 = Field.fillLowValue(11);
	
	/**
	* Constructor for Message6008002
	**/
    public Message6008002() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             ("SF328010-8002  TOTAL Z LOG RECORDS WRITTEN       =").toCharArray()
             , getStartOffset() + 0
             ,50
             );
    }





}
  
