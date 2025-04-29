package com.cloudframe.app.ms00d363.dto;

/**
*  The class DtPage3Ln9a is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:42. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class DtPage3Ln9a extends DtPage3Ln9aSerialized {
   

						@Getter @Setter private char[] dt39aCc = new char[1];





						@Getter @Setter private char[] dt39aSsc = Field.fillLowValue(3);






						@Getter @Setter private char[] dt39aTottotNetAmt = Field.fillLowValue(18);


						@Getter @Setter private char[] dt39aTottotInd = new char[2];

	
	/**
	* Constructor for DtPage3Ln9a
	**/
    public DtPage3Ln9a() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setDt39aCc(("0").toCharArray());
       replaceValue( // serialize and save the value
             fillSpace(1)
             , getStartOffset() + 1
             ,1
             );
       replaceValue( // serialize and save the value
             ("NET SETTLEMENT TOTAL").toCharArray()
             , getStartOffset() + 2
             ,20
             );
       replaceValue( // serialize and save the value
             fillSpace(3)
             , getStartOffset() + 22
             ,3
             );
       replaceValue( // serialize and save the value
             ("SSC : ").toCharArray()
             , getStartOffset() + 25
             ,6
             );
       replaceValue( // serialize and save the value
             fillSpace(2)
             , getStartOffset() + 34
             ,2
             );
       replaceValue( // serialize and save the value
             fillSpace(15)
             , getStartOffset() + 36
             ,15
             );
       replaceValue( // serialize and save the value
             fillSpace(17)
             , getStartOffset() + 51
             ,17
             );
       replaceValue( // serialize and save the value
             fillSpace(15)
             , getStartOffset() + 68
             ,15
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
								setDt39aTottotInd(fillSpace(2));
       replaceValue( // serialize and save the value
             fillSpace(13)
             , getStartOffset() + 119
             ,13
             );
    }





}
  
