package com.cloudframe.app.sf320010.dto;

/**
*  The class RpC9Heading3 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:43. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class RpC9Heading3 extends RpC9Heading3Serialized {
   






								@Getter @Setter private char[] rpC9H3Pagenumber = Field.fillLowValue(4);
	
	/**
	* Constructor for RpC9Heading3
	**/
    public RpC9Heading3() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             fillSpace(1)
             , getStartOffset() + 0
             ,1
             );
       replaceValue( // serialize and save the value
             fillSpace(58)
             , getStartOffset() + 1
             ,58
             );
       replaceValue( // serialize and save the value
             ("X9.2 ACTIVITY LOG").toCharArray()
             , getStartOffset() + 59
             ,17
             );
       replaceValue( // serialize and save the value
             fillSpace(44)
             , getStartOffset() + 76
             ,44
             );
       replaceValue( // serialize and save the value
             ("PAGE NO. ").toCharArray()
             , getStartOffset() + 120
             ,9
             );
    }





}
  
