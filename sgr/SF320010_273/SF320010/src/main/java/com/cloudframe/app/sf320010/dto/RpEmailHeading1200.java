package com.cloudframe.app.sf320010.dto;

/**
*  The class RpEmailHeading1200 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:43. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class RpEmailHeading1200 extends RpEmailHeading1200Serialized {
   


						@Getter @Setter private char[] rpH1RptCode1200 = new char[2];





						@Getter @Setter private char[] rpH1CurrentDate1200 = new char[8];



						@Getter @Setter private char[] rpH1Curtime1200 = new char[8];
	
	/**
	* Constructor for RpEmailHeading1200
	**/
    public RpEmailHeading1200() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             ("SF320010-").toCharArray()
             , getStartOffset() + 0
             ,9
             );
								setRpH1RptCode1200(fillSpace(2));
       replaceValue( // serialize and save the value
             fillSpace(41)
             , getStartOffset() + 11
             ,41
             );
       replaceValue( // serialize and save the value
             ("MASTERCARD INTERNATIONAL INC.").toCharArray()
             , getStartOffset() + 52
             ,29
             );
       replaceValue( // serialize and save the value
             fillSpace(17)
             , getStartOffset() + 81
             ,17
             );
       replaceValue( // serialize and save the value
             ("RUN DATE ").toCharArray()
             , getStartOffset() + 98
             ,9
             );
								setRpH1CurrentDate1200(fillSpace(8));
       replaceValue( // serialize and save the value
             fillSpace(4)
             , getStartOffset() + 115
             ,4
             );
       replaceValue( // serialize and save the value
             ("TIME ").toCharArray()
             , getStartOffset() + 119
             ,5
             );
								setRpH1Curtime1200(fillSpace(8));
    }





}
  
