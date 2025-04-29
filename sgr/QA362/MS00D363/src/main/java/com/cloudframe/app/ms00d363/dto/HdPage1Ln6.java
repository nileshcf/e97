package com.cloudframe.app.ms00d363.dto;

/**
*  The class HdPage1Ln6 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:42. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class HdPage1Ln6 extends HdPage1Ln6Serialized {
   

						@Getter @Setter private char[] hd16Cc = new char[1];




						@Getter @Setter private char[] hd16Currency = new char[3];


						@Getter @Setter private char[] hd16CurrDesc = new char[30];

	
	/**
	* Constructor for HdPage1Ln6
	**/
    public HdPage1Ln6() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setHd16Cc(fillSpace(1));
       replaceValue( // serialize and save the value
             fillSpace(1)
             , getStartOffset() + 1
             ,1
             );
       replaceValue( // serialize and save the value
             ("CURRENCY           :").toCharArray()
             , getStartOffset() + 2
             ,20
             );
       replaceValue( // serialize and save the value
             fillSpace(1)
             , getStartOffset() + 22
             ,1
             );
								setHd16Currency(fillSpace(3));
       replaceValue( // serialize and save the value
             fillSpace(3)
             , getStartOffset() + 26
             ,3
             );
								setHd16CurrDesc(fillSpace(30));
       replaceValue( // serialize and save the value
             pad(74," ".toCharArray(),' ',RIGHT_PAD)
             , getStartOffset() + 59
             ,74
             );
    }





}
  
