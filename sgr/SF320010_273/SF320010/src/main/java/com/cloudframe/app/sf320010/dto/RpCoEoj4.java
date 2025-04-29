package com.cloudframe.app.sf320010.dto;

/**
*  The class RpCoEoj4 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:43. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class RpCoEoj4 extends RpCoEoj4Serialized {
   



								@Getter @Setter private char[] rpCoEoj4TotalBulk = Field.fillLowValue(6);

	
	/**
	* Constructor for RpCoEoj4
	**/
    public RpCoEoj4() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             ("0").toCharArray()
             , getStartOffset() + 0
             ,1
             );
       replaceValue( // serialize and save the value
             ("BULK DATA TRANSMISSION LOG RECORDS READ  - ").toCharArray()
             , getStartOffset() + 1
             ,43
             );
       replaceValue( // serialize and save the value
             pad(84," ".toCharArray(),' ',RIGHT_PAD)
             , getStartOffset() + 50
             ,84
             );
    }





}
  
