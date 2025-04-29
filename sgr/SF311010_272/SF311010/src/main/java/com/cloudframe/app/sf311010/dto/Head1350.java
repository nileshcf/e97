package com.cloudframe.app.sf311010.dto;

/**
*  The class Head1350 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:36. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class Head1350 extends Head1350Serialized {
   

						@Getter @Setter private char[] head1ReportId350 = new char[1];

						@Getter @Setter private char[] head1CarCon350 = new char[1];




						@Getter @Setter private char[] head1Date350 = new char[8];
	
	/**
	* Constructor for Head1350
	**/
    public Head1350() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setHead1ReportId350(fillSpace(1));
								setHead1CarCon350(fillSpace(1));
       replaceValue( // serialize and save the value
             ("SF311010-AA                                       ").toCharArray()
             , getStartOffset() + 2
             ,50
             );
       replaceValue( // serialize and save the value
             pad(60,"MASTERCARD INTERNATIONAL INC.".toCharArray(),' ',RIGHT_PAD)
             , getStartOffset() + 52
             ,60
             );
       replaceValue( // serialize and save the value
             ("RUN DATE: ").toCharArray()
             , getStartOffset() + 112
             ,10
             );
								setHead1Date350(fillSpace(8));
    }





}
  
