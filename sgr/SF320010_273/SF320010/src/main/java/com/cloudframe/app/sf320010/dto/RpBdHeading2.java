package com.cloudframe.app.sf320010.dto;

/**
*  The class RpBdHeading2 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:43. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class RpBdHeading2 extends RpBdHeading2Serialized {
   






								@Getter @Setter private char[] rpBdH2Pagenumber = Field.fillLowValue(4);
	
	/**
	* Constructor for RpBdHeading2
	**/
    public RpBdHeading2() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             ("0").toCharArray()
             , getStartOffset() + 0
             ,1
             );
       replaceValue( // serialize and save the value
             fillSpace(50)
             , getStartOffset() + 1
             ,50
             );
       replaceValue( // serialize and save the value
             ("   BULK DATA TRANSMISSION LOG   ").toCharArray()
             , getStartOffset() + 51
             ,32
             );
       replaceValue( // serialize and save the value
             fillSpace(37)
             , getStartOffset() + 83
             ,37
             );
       replaceValue( // serialize and save the value
             ("PAGE NO. ").toCharArray()
             , getStartOffset() + 120
             ,9
             );
    }





}
  
