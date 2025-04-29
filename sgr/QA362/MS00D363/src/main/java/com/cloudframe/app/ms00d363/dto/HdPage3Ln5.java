package com.cloudframe.app.ms00d363.dto;

/**
*  The class HdPage3Ln5 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:42. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class HdPage3Ln5 extends HdPage3Ln5Serialized {
   

						@Getter @Setter private char[] hd35Cc = new char[1];

						@Getter @Setter private char[] hd3VatMsg = new char[17];

	
	/**
	* Constructor for HdPage3Ln5
	**/
    public HdPage3Ln5() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setHd35Cc(fillSpace(1));
								setHd3VatMsg(("DAILY VAT RECAP  ").toCharArray());
       replaceValue( // serialize and save the value
             pad(115," ".toCharArray(),' ',RIGHT_PAD)
             , getStartOffset() + 18
             ,115
             );
    }





}
  
