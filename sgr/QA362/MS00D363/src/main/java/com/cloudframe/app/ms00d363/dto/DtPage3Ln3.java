package com.cloudframe.app.ms00d363.dto;

/**
*  The class DtPage3Ln3 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:42. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class DtPage3Ln3 extends DtPage3Ln3Serialized {
   

						@Getter @Setter private char[] dt33Cc = new char[1];




						@Getter @Setter private char[] dt33AcqintDbAmt = Field.fillLowValue(20);


						@Getter @Setter private char[] dt33AcqintCrAmt = Field.fillLowValue(20);


						@Getter @Setter private char[] dt33AcqintNetAmt = Field.fillLowValue(20);


						@Getter @Setter private char[] dt33AcqintInd = new char[2];

	
	/**
	* Constructor for DtPage3Ln3
	**/
    public DtPage3Ln3() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setDt33Cc(("0").toCharArray());
       replaceValue( // serialize and save the value
             fillSpace(3)
             , getStartOffset() + 1
             ,3
             );
       replaceValue( // serialize and save the value
             ("INTERCHANGE FEES").toCharArray()
             , getStartOffset() + 4
             ,16
             );
       replaceValue( // serialize and save the value
             fillSpace(16)
             , getStartOffset() + 20
             ,16
             );
       replaceValue( // serialize and save the value
             fillSpace(11)
             , getStartOffset() + 56
             ,11
             );
       replaceValue( // serialize and save the value
             fillSpace(8)
             , getStartOffset() + 87
             ,8
             );
       replaceValue( // serialize and save the value
             fillSpace(2)
             , getStartOffset() + 115
             ,2
             );
								setDt33AcqintInd(fillSpace(2));
       replaceValue( // serialize and save the value
             fillSpace(13)
             , getStartOffset() + 119
             ,13
             );
    }





}
  
