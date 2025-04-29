package com.cloudframe.app.ms00d363.dto;

/**
*  The class DtPage3Ln2 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:42. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class DtPage3Ln2 extends DtPage3Ln2Serialized {
   

						@Getter @Setter private char[] dt32Cc = new char[1];




						@Getter @Setter private char[] dt32AcqexpDbAmt = Field.fillLowValue(18);


						@Getter @Setter private char[] dt32AcqexpCrAmt = Field.fillLowValue(18);


						@Getter @Setter private char[] dt32AcqexpNetAmt = Field.fillLowValue(18);


						@Getter @Setter private char[] dt32AcqexpInd = new char[2];

	
	/**
	* Constructor for DtPage3Ln2
	**/
    public DtPage3Ln2() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setDt32Cc(("0").toCharArray());
       replaceValue( // serialize and save the value
             fillSpace(3)
             , getStartOffset() + 1
             ,3
             );
       replaceValue( // serialize and save the value
             ("EXCEPTION ITEMS ").toCharArray()
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
								setDt32AcqexpInd(fillSpace(2));
       replaceValue( // serialize and save the value
             fillSpace(13)
             , getStartOffset() + 119
             ,13
             );
    }





}
  
