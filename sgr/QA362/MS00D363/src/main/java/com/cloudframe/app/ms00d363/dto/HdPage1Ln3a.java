package com.cloudframe.app.ms00d363.dto;

/**
*  The class HdPage1Ln3a is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:42. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class HdPage1Ln3a extends HdPage1Ln3aSerialized {
   

						@Getter @Setter private char[] hd13aCc = new char[1];





	
	/**
	* Constructor for HdPage1Ln3a
	**/
    public HdPage1Ln3a() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setHd13aCc(fillSpace(1));
       replaceValue( // serialize and save the value
             fillSpace(53)
             , getStartOffset() + 1
             ,53
             );
       replaceValue( // serialize and save the value
             ("SAM ADVISEMENT RECONCILIATION ").toCharArray()
             , getStartOffset() + 54
             ,30
             );
       replaceValue( // serialize and save the value
             fillSpace(37)
             , getStartOffset() + 84
             ,37
             );
       replaceValue( // serialize and save the value
             ("PAGE:").toCharArray()
             , getStartOffset() + 121
             ,5
             );
       replaceValue( // serialize and save the value
             fillSpace(1)
             , getStartOffset() + 131
             ,1
             );
    }





}
  
