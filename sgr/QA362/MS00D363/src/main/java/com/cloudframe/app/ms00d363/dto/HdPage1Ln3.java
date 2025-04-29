package com.cloudframe.app.ms00d363.dto;

/**
*  The class HdPage1Ln3 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:42. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class HdPage1Ln3 extends HdPage1Ln3Serialized {
   

						@Getter @Setter private char[] hd13Cc = new char[1];


						@Getter @Setter private char[] hd13AcqIss = new char[9];

						@Getter @Setter private char[] hd13Proc = new char[13];




								@Getter @Setter private char[] hd13Page = Field.fillLowValue(5);

	
	/**
	* Constructor for HdPage1Ln3
	**/
    public HdPage1Ln3() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setHd13Cc(fillSpace(1));
       replaceValue( // serialize and save the value
             fillSpace(58)
             , getStartOffset() + 1
             ,58
             );
								setHd13AcqIss(("ACQUIRING").toCharArray());
								setHd13Proc((" PROCESSOR   ").toCharArray());
       replaceValue( // serialize and save the value
             fillSpace(4)
             , getStartOffset() + 81
             ,4
             );
       replaceValue( // serialize and save the value
             fillSpace(36)
             , getStartOffset() + 85
             ,36
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
  
