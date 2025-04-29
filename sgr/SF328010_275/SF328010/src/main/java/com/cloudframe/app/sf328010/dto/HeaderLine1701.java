package com.cloudframe.app.sf328010.dto;

/**
*  The class HeaderLine1701 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:33. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class HeaderLine1701 extends HeaderLine1701Serialized {
   





						@Getter @Setter private char[] runDate701 = new char[2];


						@Getter @Setter private char[] runMonth701 = new char[3];


						@Getter @Setter private char[] runYear701 = new char[4];

	
	/**
	* Constructor for HeaderLine1701
	**/
    public HeaderLine1701() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             ("SF328010-AA                           ").toCharArray()
             , getStartOffset() + 0
             ,38
             );
       replaceValue( // serialize and save the value
             ("      MASTERCARD WORLDWIDE        ").toCharArray()
             , getStartOffset() + 38
             ,34
             );
       replaceValue( // serialize and save the value
             fillSpace(35)
             , getStartOffset() + 72
             ,35
             );
       replaceValue( // serialize and save the value
             ("RUN DATE :").toCharArray()
             , getStartOffset() + 107
             ,10
             );
								setRunDate701(fillSpace(2));
       replaceValue( // serialize and save the value
             ("-").toCharArray()
             , getStartOffset() + 119
             ,1
             );
								setRunMonth701(fillSpace(3));
       replaceValue( // serialize and save the value
             ("-").toCharArray()
             , getStartOffset() + 123
             ,1
             );
								setRunYear701(fillSpace(4));
       replaceValue( // serialize and save the value
             fillSpace(14)
             , getStartOffset() + 128
             ,14
             );
    }





}
  
