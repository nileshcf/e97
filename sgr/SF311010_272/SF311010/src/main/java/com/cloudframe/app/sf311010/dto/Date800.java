package com.cloudframe.app.sf311010.dto;

/**
*  The class Date800 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:36. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class Date800 extends Date800Serialized {
   

						@Getter @Setter private char[] dateMonth800 = new char[2];


						@Getter @Setter private char[] dateDay800 = new char[2];


						@Getter @Setter private char[] dateYear800 = new char[2];
	
	/**
	* Constructor for Date800
	**/
    public Date800() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setDateMonth800(fillSpace(2));
       replaceValue( // serialize and save the value
             ("/").toCharArray()
             , getStartOffset() + 2
             ,1
             );
								setDateDay800(fillSpace(2));
       replaceValue( // serialize and save the value
             ("/").toCharArray()
             , getStartOffset() + 5
             ,1
             );
								setDateYear800(fillSpace(2));
    }





}
  
