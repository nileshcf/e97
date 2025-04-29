package com.cloudframe.app.sf311010.dto;

/**
*  The class Head6360 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:36. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class Head6360 extends Head6360Serialized {
   

						@Getter @Setter private char[] head6ReportId360 = new char[1];

						@Getter @Setter private char[] head6CarCon360 = new char[1];







	
	/**
	* Constructor for Head6360
	**/
    public Head6360() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setHead6ReportId360(fillSpace(1));
								setHead6CarCon360(fillSpace(1));
       replaceValue( // serialize and save the value
             fillSpace(8)
             , getStartOffset() + 2
             ,8
             );
       replaceValue( // serialize and save the value
             String.join("", java.util.Collections.nCopies(18, "-")).toCharArray()
             , getStartOffset() + 10
             ,18
             );
       replaceValue( // serialize and save the value
             fillSpace(7)
             , getStartOffset() + 28
             ,7
             );
       replaceValue( // serialize and save the value
             String.join("", java.util.Collections.nCopies(5, "-")).toCharArray()
             , getStartOffset() + 35
             ,5
             );
       replaceValue( // serialize and save the value
             fillSpace(8)
             , getStartOffset() + 40
             ,8
             );
       replaceValue( // serialize and save the value
             String.join("", java.util.Collections.nCopies(10, "-")).toCharArray()
             , getStartOffset() + 48
             ,10
             );
       replaceValue( // serialize and save the value
             pad(72," ".toCharArray(),' ',RIGHT_PAD)
             , getStartOffset() + 58
             ,72
             );
    }





}
  
