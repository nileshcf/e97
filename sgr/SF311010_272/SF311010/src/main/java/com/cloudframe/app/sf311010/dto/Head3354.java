package com.cloudframe.app.sf311010.dto;

/**
*  The class Head3354 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:36. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class Head3354 extends Head3354Serialized {
   

						@Getter @Setter private char[] head3ReportId354 = new char[1];

						@Getter @Setter private char[] head3CarCon354 = new char[1];




								@Getter @Setter private char[] head3Page354 = Field.fillLowValue(3);

	
	/**
	* Constructor for Head3354
	**/
    public Head3354() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setHead3ReportId354(fillSpace(1));
								setHead3CarCon354(fillSpace(1));
       replaceValue( // serialize and save the value
             fillSpace(11)
             , getStartOffset() + 2
             ,11
             );
       replaceValue( // serialize and save the value
             pad(99," ".toCharArray(),' ',RIGHT_PAD)
             , getStartOffset() + 13
             ,99
             );
       replaceValue( // serialize and save the value
             ("PAGE: ").toCharArray()
             , getStartOffset() + 112
             ,6
             );
       replaceValue( // serialize and save the value
             fillSpace(9)
             , getStartOffset() + 121
             ,9
             );
    }





}
  
