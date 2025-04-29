package com.cloudframe.app.ms00d363.dto;

/**
*  The class DtPage3Ln1 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:42. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class DtPage3Ln1 extends DtPage3Ln1Serialized {
   

						@Getter @Setter private char[] dt31Cc = new char[1];




						@Getter @Setter private char[] dt31AcqtrnDbAmt = Field.fillLowValue(18);


						@Getter @Setter private char[] dt31AcqtrnCrAmt = Field.fillLowValue(18);


						@Getter @Setter private char[] dt31AcqtrnNetAmt = Field.fillLowValue(18);


						@Getter @Setter private char[] dt31AcqtrnInd = new char[2];

	
	/**
	* Constructor for DtPage3Ln1
	**/
    public DtPage3Ln1() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setDt31Cc(("0").toCharArray());
       replaceValue( // serialize and save the value
             fillSpace(3)
             , getStartOffset() + 1
             ,3
             );
       replaceValue( // serialize and save the value
             ("TRANSACTIONS    ").toCharArray()
             , getStartOffset() + 4
             ,16
             );
       replaceValue( // serialize and save the value
             fillSpace(14)
             , getStartOffset() + 20
             ,14
             );
       replaceValue( // serialize and save the value
             fillSpace(13)
             , getStartOffset() + 52
             ,13
             );
       replaceValue( // serialize and save the value
             fillSpace(10)
             , getStartOffset() + 83
             ,10
             );
       replaceValue( // serialize and save the value
             fillSpace(6)
             , getStartOffset() + 111
             ,6
             );
								setDt31AcqtrnInd(fillSpace(2));
       replaceValue( // serialize and save the value
             fillSpace(13)
             , getStartOffset() + 119
             ,13
             );
    }





}
  
