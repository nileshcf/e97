package com.cloudframe.app.sf320010.dto;

/**
*  The class RpC7Heading3 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:43. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class RpC7Heading3 extends RpC7Heading3Serialized {
   






								@Getter @Setter private char[] rpC7H3Pagenumber = Field.fillLowValue(4);
	
	/**
	* Constructor for RpC7Heading3
	**/
    public RpC7Heading3() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             fillSpace(1)
             , getStartOffset() + 0
             ,1
             );
       replaceValue( // serialize and save the value
             fillSpace(45)
             , getStartOffset() + 1
             ,45
             );
       replaceValue( // serialize and save the value
             ("TYPE II PASS-THRU UNDELIVERED TRANSACTIONS").toCharArray()
             , getStartOffset() + 46
             ,42
             );
       replaceValue( // serialize and save the value
             fillSpace(32)
             , getStartOffset() + 88
             ,32
             );
       replaceValue( // serialize and save the value
             ("PAGE NO. ").toCharArray()
             , getStartOffset() + 120
             ,9
             );
    }





}
  
