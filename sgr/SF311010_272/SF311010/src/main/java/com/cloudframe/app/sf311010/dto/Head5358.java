package com.cloudframe.app.sf311010.dto;

/**
*  The class Head5358 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:36. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class Head5358 extends Head5358Serialized {
   

						@Getter @Setter private char[] head5ReportId358 = new char[1];

						@Getter @Setter private char[] head5CarCon358 = new char[1];







	
	/**
	* Constructor for Head5358
	**/
    public Head5358() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setHead5ReportId358(fillSpace(1));
								setHead5CarCon358(fillSpace(1));
       replaceValue( // serialize and save the value
             fillSpace(8)
             , getStartOffset() + 2
             ,8
             );
       replaceValue( // serialize and save the value
             ("LOG TYPE").toCharArray()
             , getStartOffset() + 10
             ,8
             );
       replaceValue( // serialize and save the value
             fillSpace(17)
             , getStartOffset() + 18
             ,17
             );
       replaceValue( // serialize and save the value
             ("CLASS").toCharArray()
             , getStartOffset() + 35
             ,5
             );
       replaceValue( // serialize and save the value
             fillSpace(10)
             , getStartOffset() + 40
             ,10
             );
       replaceValue( // serialize and save the value
             ("COUNT").toCharArray()
             , getStartOffset() + 50
             ,5
             );
       replaceValue( // serialize and save the value
             pad(75," ".toCharArray(),' ',RIGHT_PAD)
             , getStartOffset() + 55
             ,75
             );
    }





}
  
