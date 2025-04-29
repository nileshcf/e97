package com.cloudframe.app.sf320010.dto;

/**
*  The class RpCoEoj3 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:43. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class RpCoEoj3 extends RpCoEoj3Serialized {
   



								@Getter @Setter private char[] rpCoEoj3TotalStats = Field.fillLowValue(6);

	
	/**
	* Constructor for RpCoEoj3
	**/
    public RpCoEoj3() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             ("0").toCharArray()
             , getStartOffset() + 0
             ,1
             );
       replaceValue( // serialize and save the value
             ("STATISTICS & ERROR LOG RECORDS READ      - ").toCharArray()
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
  
