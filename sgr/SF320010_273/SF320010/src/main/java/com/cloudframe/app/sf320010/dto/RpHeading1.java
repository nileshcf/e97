package com.cloudframe.app.sf320010.dto;

/**
*  The class RpHeading1 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:43. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class RpHeading1 extends RpHeading1Serialized {
   



						@Getter @Setter private char[] rpH1RptCode = Field.fillLowValue(2);





						@Getter @Setter private char[] rpH1CurrentDate = Field.fillLowValue(8);



						@Getter @Setter private char[] rpH1Curtime = Field.fillLowValue(8);
	
	/**
	* Constructor for RpHeading1
	**/
    public RpHeading1() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             ("1").toCharArray()
             , getStartOffset() + 0
             ,1
             );
       replaceValue( // serialize and save the value
             ("SF320010-").toCharArray()
             , getStartOffset() + 1
             ,9
             );
       replaceValue( // serialize and save the value
             fillSpace(41)
             , getStartOffset() + 12
             ,41
             );
       replaceValue( // serialize and save the value
             ("MASTERCARD INTERNATIONAL INC.").toCharArray()
             , getStartOffset() + 53
             ,29
             );
       replaceValue( // serialize and save the value
             fillSpace(17)
             , getStartOffset() + 82
             ,17
             );
       replaceValue( // serialize and save the value
             ("RUN DATE ").toCharArray()
             , getStartOffset() + 99
             ,9
             );
       replaceValue( // serialize and save the value
             fillSpace(4)
             , getStartOffset() + 116
             ,4
             );
       replaceValue( // serialize and save the value
             ("TIME ").toCharArray()
             , getStartOffset() + 120
             ,5
             );
    }





}
  
