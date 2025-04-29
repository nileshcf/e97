package com.cloudframe.app.ms00d363.dto;

/**
*  The class HdPage1Ln5 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:42. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class HdPage1Ln5 extends HdPage1Ln5Serialized {
   

						@Getter @Setter private char[] hd15Cc = new char[1];




						@Getter @Setter private char[] hd15ProcId = new char[10];






	
	/**
	* Constructor for HdPage1Ln5
	**/
    public HdPage1Ln5() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setHd15Cc(fillSpace(1));
       replaceValue( // serialize and save the value
             fillSpace(1)
             , getStartOffset() + 1
             ,1
             );
       replaceValue( // serialize and save the value
             ("PROCESSOR ID       :").toCharArray()
             , getStartOffset() + 2
             ,20
             );
       replaceValue( // serialize and save the value
             fillSpace(1)
             , getStartOffset() + 22
             ,1
             );
								setHd15ProcId(fillSpace(10));
       replaceValue( // serialize and save the value
             fillSpace(1)
             , getStartOffset() + 33
             ,1
             );
       replaceValue( // serialize and save the value
             fillSpace(25)
             , getStartOffset() + 34
             ,25
             );
       replaceValue( // serialize and save the value
             fillSpace(29)
             , getStartOffset() + 59
             ,29
             );
       replaceValue( // serialize and save the value
             fillSpace(16)
             , getStartOffset() + 88
             ,16
             );
       replaceValue( // serialize and save the value
             fillSpace(6)
             , getStartOffset() + 104
             ,6
             );
       replaceValue( // serialize and save the value
             fillSpace(23)
             , getStartOffset() + 110
             ,23
             );
    }





}
  
