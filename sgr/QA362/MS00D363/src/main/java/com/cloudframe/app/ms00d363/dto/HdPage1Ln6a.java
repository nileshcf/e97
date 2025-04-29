package com.cloudframe.app.ms00d363.dto;

/**
*  The class HdPage1Ln6a is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:42. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class HdPage1Ln6a extends HdPage1Ln6aSerialized {
   

						@Getter @Setter private char[] hd16aCc = new char[1];




						@Getter @Setter private char[] hd16aSsc = new char[3];


	
	/**
	* Constructor for HdPage1Ln6a
	**/
    public HdPage1Ln6a() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setHd16aCc(fillSpace(1));
       replaceValue( // serialize and save the value
             fillSpace(1)
             , getStartOffset() + 1
             ,1
             );
       replaceValue( // serialize and save the value
             ("SETTLEMENT SERVICE :").toCharArray()
             , getStartOffset() + 2
             ,20
             );
       replaceValue( // serialize and save the value
             fillSpace(1)
             , getStartOffset() + 22
             ,1
             );
								setHd16aSsc(fillSpace(3));
       replaceValue( // serialize and save the value
             fillSpace(40)
             , getStartOffset() + 26
             ,40
             );
       replaceValue( // serialize and save the value
             pad(67," ".toCharArray(),' ',RIGHT_PAD)
             , getStartOffset() + 66
             ,67
             );
    }





}
  
