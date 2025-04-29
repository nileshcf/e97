package com.cloudframe.app.ms00d363.dto;

/**
*  The class DtPage2Ln4a is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:42. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class DtPage2Ln4a extends DtPage2Ln4aSerialized {
   

						@Getter @Setter private char[] dt24aCc = new char[1];



								@Getter @Setter private char[] dt24aNsdDbNbr = Field.fillLowValue(12);


								@Getter @Setter private char[] dt24aNsdCrNbr = Field.fillLowValue(12);

	
	/**
	* Constructor for DtPage2Ln4a
	**/
    public DtPage2Ln4a() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setDt24aCc(("0").toCharArray());
       replaceValue( // serialize and save the value
             fillSpace(3)
             , getStartOffset() + 1
             ,3
             );
       replaceValue( // serialize and save the value
             ("NON-SAME DAY,NON-FINANCIAL ").toCharArray()
             , getStartOffset() + 4
             ,27
             );
       replaceValue( // serialize and save the value
             fillSpace(27)
             , getStartOffset() + 43
             ,27
             );
       replaceValue( // serialize and save the value
             fillSpace(55)
             , getStartOffset() + 82
             ,55
             );
    }





}
  
