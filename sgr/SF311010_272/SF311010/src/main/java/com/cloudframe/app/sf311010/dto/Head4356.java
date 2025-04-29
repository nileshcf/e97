package com.cloudframe.app.sf311010.dto;

/**
*  The class Head4356 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:36. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class Head4356 extends Head4356Serialized {
   

						@Getter @Setter private char[] head4ReportId356 = new char[1];

						@Getter @Setter private char[] head4CarCon356 = new char[1];



	
	/**
	* Constructor for Head4356
	**/
    public Head4356() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setHead4ReportId356(fillSpace(1));
								setHead4CarCon356(fillSpace(1));
       replaceValue( // serialize and save the value
             fillSpace(48)
             , getStartOffset() + 2
             ,48
             );
       replaceValue( // serialize and save the value
             ("RECORD").toCharArray()
             , getStartOffset() + 50
             ,6
             );
       replaceValue( // serialize and save the value
             pad(74," ".toCharArray(),' ',RIGHT_PAD)
             , getStartOffset() + 56
             ,74
             );
    }





}
  
