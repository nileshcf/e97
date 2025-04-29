package com.cloudframe.app.sf320010.dto;

/**
*  The class WaDate is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:43. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class WaDate extends WaDateSerialized {
   

						@Getter @Setter private char[] waDateMonth = Field.fillLowValue(2);


						@Getter @Setter private char[] waDateDay = Field.fillLowValue(2);


						@Getter @Setter private char[] waDateYear = Field.fillLowValue(2);
	
	/**
	* Constructor for WaDate
	**/
    public WaDate() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             ("/").toCharArray()
             , getStartOffset() + 2
             ,1
             );
       replaceValue( // serialize and save the value
             ("/").toCharArray()
             , getStartOffset() + 5
             ,1
             );
    }





}
  
