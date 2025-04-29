package com.cloudframe.app.sf320010.dto;

/**
*  The class RpC9Heading4 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:43. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class RpC9Heading4 extends RpC9Heading4Serialized {
   



						@Getter @Setter private char[] rpC9H4MipId = Field.fillLowValue(3);


						@Getter @Setter private char[] rpC9H4DtStamp = Field.fillLowValue(8);
	
	/**
	* Constructor for RpC9Heading4
	**/
    public RpC9Heading4() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             ("0").toCharArray()
             , getStartOffset() + 0
             ,1
             );
       replaceValue( // serialize and save the value
             ("  MIP IDENTIFICATION -  ").toCharArray()
             , getStartOffset() + 1
             ,24
             );
       replaceValue( // serialize and save the value
             ("         JULIAN DATE -  ").toCharArray()
             , getStartOffset() + 28
             ,24
             );
    }





}
  
