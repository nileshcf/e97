package com.cloudframe.app.ms00d363.dto;

/**
*  The class HdPage3Ln3 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:42. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class HdPage3Ln3 extends HdPage3Ln3Serialized {
   

						@Getter @Setter private char[] hd33Cc = new char[1];



						@Getter @Setter private char[] hd33GcmsOrSam = new char[6];









	
	/**
	* Constructor for HdPage3Ln3
	**/
    public HdPage3Ln3() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setHd33Cc(("-").toCharArray());
       replaceValue( // serialize and save the value
             fillSpace(1)
             , getStartOffset() + 1
             ,1
             );
       replaceValue( // serialize and save the value
             ("NET SETTLEMENT ").toCharArray()
             , getStartOffset() + 2
             ,15
             );
								setHd33GcmsOrSam(("(GCMS)").toCharArray());
       replaceValue( // serialize and save the value
             fillSpace(12)
             , getStartOffset() + 23
             ,12
             );
       replaceValue( // serialize and save the value
             ("NETACQ").toCharArray()
             , getStartOffset() + 35
             ,6
             );
       replaceValue( // serialize and save the value
             fillSpace(13)
             , getStartOffset() + 41
             ,13
             );
       replaceValue( // serialize and save the value
             ("FEEACQ").toCharArray()
             , getStartOffset() + 54
             ,6
             );
       replaceValue( // serialize and save the value
             fillSpace(13)
             , getStartOffset() + 60
             ,13
             );
       replaceValue( // serialize and save the value
             ("NETISS").toCharArray()
             , getStartOffset() + 73
             ,6
             );
       replaceValue( // serialize and save the value
             fillSpace(13)
             , getStartOffset() + 79
             ,13
             );
       replaceValue( // serialize and save the value
             ("FEEISS").toCharArray()
             , getStartOffset() + 92
             ,6
             );
       replaceValue( // serialize and save the value
             fillSpace(35)
             , getStartOffset() + 98
             ,35
             );
    }





}
  
