package com.cloudframe.app.ms00d363.dto;

/**
*  The class HdPage1Ln4a is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:42. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class HdPage1Ln4a extends HdPage1Ln4aSerialized {
   

						@Getter @Setter private char[] hd14aCc = new char[1];




						@Getter @Setter private char[] hd15ProcDesc = new char[25];

	
	/**
	* Constructor for HdPage1Ln4a
	**/
    public HdPage1Ln4a() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setHd14aCc(fillSpace(1));
       replaceValue( // serialize and save the value
             fillSpace(1)
             , getStartOffset() + 1
             ,1
             );
       replaceValue( // serialize and save the value
             ("PROCESSOR          :").toCharArray()
             , getStartOffset() + 2
             ,20
             );
       replaceValue( // serialize and save the value
             fillSpace(1)
             , getStartOffset() + 22
             ,1
             );
								setHd15ProcDesc(fillSpace(25));
       replaceValue( // serialize and save the value
             pad(85," ".toCharArray(),' ',RIGHT_PAD)
             , getStartOffset() + 48
             ,85
             );
    }





}
  
