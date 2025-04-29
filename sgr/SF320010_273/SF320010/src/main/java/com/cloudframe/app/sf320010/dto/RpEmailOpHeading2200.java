package com.cloudframe.app.sf320010.dto;

/**
*  The class RpEmailOpHeading2200 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:43. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class RpEmailOpHeading2200 extends RpEmailOpHeading2200Serialized {
   





								@Getter @Setter private char[] rpOpPagenumber1200 = Field.fillLowValue(4);
	
	/**
	* Constructor for RpEmailOpHeading2200
	**/
    public RpEmailOpHeading2200() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             fillSpace(50)
             , getStartOffset() + 0
             ,50
             );
       replaceValue( // serialize and save the value
             ("          OPERATOR LOG          ").toCharArray()
             , getStartOffset() + 50
             ,32
             );
       replaceValue( // serialize and save the value
             fillSpace(37)
             , getStartOffset() + 82
             ,37
             );
       replaceValue( // serialize and save the value
             ("PAGE NO. ").toCharArray()
             , getStartOffset() + 119
             ,9
             );
    }





}
  
