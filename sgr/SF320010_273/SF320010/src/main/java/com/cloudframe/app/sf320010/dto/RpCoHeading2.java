package com.cloudframe.app.sf320010.dto;

/**
*  The class RpCoHeading2 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:43. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class RpCoHeading2 extends RpCoHeading2Serialized {
   






								@Getter @Setter private char[] rpCoH2Pagenumber = Field.fillLowValue(4);
	
	/**
	* Constructor for RpCoHeading2
	**/
    public RpCoHeading2() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             ("0").toCharArray()
             , getStartOffset() + 0
             ,1
             );
       replaceValue( // serialize and save the value
             fillSpace(46)
             , getStartOffset() + 1
             ,46
             );
       replaceValue( // serialize and save the value
             ("STATISTICS AND ERROR LOG CONTROL TOTALS").toCharArray()
             , getStartOffset() + 47
             ,39
             );
       replaceValue( // serialize and save the value
             fillSpace(34)
             , getStartOffset() + 86
             ,34
             );
       replaceValue( // serialize and save the value
             ("PAGE NO. ").toCharArray()
             , getStartOffset() + 120
             ,9
             );
    }





}
  
