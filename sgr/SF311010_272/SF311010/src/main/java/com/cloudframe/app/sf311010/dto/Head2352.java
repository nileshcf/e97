package com.cloudframe.app.sf311010.dto;

/**
*  The class Head2352 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:36. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class Head2352 extends Head2352Serialized {
   

						@Getter @Setter private char[] head2ReportId352 = new char[1];

						@Getter @Setter private char[] head2CarCon352 = new char[1];




						@Getter @Setter private char[] head2Time352 = new char[8];
	
	/**
	* Constructor for Head2352
	**/
    public Head2352() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setHead2ReportId352(fillSpace(1));
								setHead2CarCon352(fillSpace(1));
       replaceValue( // serialize and save the value
             fillSpace(47)
             , getStartOffset() + 2
             ,47
             );
       replaceValue( // serialize and save the value
             pad(63,"BANKNET TRANSACTION LOG CONTROL TOTALS".toCharArray(),' ',RIGHT_PAD)
             , getStartOffset() + 49
             ,63
             );
       replaceValue( // serialize and save the value
             ("RUN TIME: ").toCharArray()
             , getStartOffset() + 112
             ,10
             );
								setHead2Time352(fillSpace(8));
    }





}
  
