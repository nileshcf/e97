package com.cloudframe.app.ms00d363.dto;

/**
*  The class HdPage1Ln6b is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:42. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class HdPage1Ln6b extends HdPage1Ln6bSerialized {
   

						@Getter @Setter private char[] hd16bCc = new char[1];




						@Getter @Setter private char[] hd16bIsis = new char[4];


	
	/**
	* Constructor for HdPage1Ln6b
	**/
    public HdPage1Ln6b() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setHd16bCc(fillSpace(1));
       replaceValue( // serialize and save the value
             fillSpace(1)
             , getStartOffset() + 1
             ,1
             );
       replaceValue( // serialize and save the value
             ("ISIS AGREEMENT NBR :").toCharArray()
             , getStartOffset() + 2
             ,20
             );
       replaceValue( // serialize and save the value
             fillSpace(1)
             , getStartOffset() + 22
             ,1
             );
								setHd16bIsis(fillSpace(4));
       replaceValue( // serialize and save the value
             fillSpace(40)
             , getStartOffset() + 27
             ,40
             );
       replaceValue( // serialize and save the value
             pad(66," ".toCharArray(),' ',RIGHT_PAD)
             , getStartOffset() + 67
             ,66
             );
    }





}
  
