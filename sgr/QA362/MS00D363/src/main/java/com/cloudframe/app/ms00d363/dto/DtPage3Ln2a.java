package com.cloudframe.app.ms00d363.dto;

/**
*  The class DtPage3Ln2a is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:42. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class DtPage3Ln2a extends DtPage3Ln2aSerialized {
   

						@Getter @Setter private char[] dt32aCc = new char[1];




								@Getter @Setter private char[] dt32aTotalAmt = Field.fillLowValue(22);


						@Getter @Setter private char[] dt32aInd = Field.fillLowValue(1);

	
	/**
	* Constructor for DtPage3Ln2a
	**/
    public DtPage3Ln2a() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setDt32aCc(fillSpace(1));
       replaceValue( // serialize and save the value
             fillSpace(2)
             , getStartOffset() + 1
             ,2
             );
       replaceValue( // serialize and save the value
             ("TOTAL:").toCharArray()
             , getStartOffset() + 3
             ,6
             );
       replaceValue( // serialize and save the value
             pad(65," ".toCharArray(),' ',RIGHT_PAD)
             , getStartOffset() + 9
             ,65
             );
       replaceValue( // serialize and save the value
             fillSpace(1)
             , getStartOffset() + 96
             ,1
             );
       replaceValue( // serialize and save the value
             fillSpace(30)
             , getStartOffset() + 98
             ,30
             );
    }





}
  
