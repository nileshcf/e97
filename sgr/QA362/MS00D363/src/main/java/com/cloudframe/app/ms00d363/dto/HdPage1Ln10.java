package com.cloudframe.app.ms00d363.dto;

/**
*  The class HdPage1Ln10 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:42. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class HdPage1Ln10 extends HdPage1Ln10Serialized {
   

						@Getter @Setter private char[] hd110Cc = new char[1];


						@Getter @Setter private char[] hd110Desc = Field.fillLowValue(25);

	
	/**
	* Constructor for HdPage1Ln10
	**/
    public HdPage1Ln10() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setHd110Cc(("0").toCharArray());
       replaceValue( // serialize and save the value
             fillSpace(1)
             , getStartOffset() + 1
             ,1
             );
       replaceValue( // serialize and save the value
             fillSpace(24)
             , getStartOffset() + 27
             ,24
             );
    }





}
  
