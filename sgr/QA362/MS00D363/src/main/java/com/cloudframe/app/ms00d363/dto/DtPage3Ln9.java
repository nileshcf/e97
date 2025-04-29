package com.cloudframe.app.ms00d363.dto;

/**
*  The class DtPage3Ln9 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:42. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class DtPage3Ln9 extends DtPage3Ln9Serialized {
   

						@Getter @Setter private char[] dt39Cc = new char[1];








						@Getter @Setter private char[] dt39AchtotNetAmt = Field.fillLowValue(18);


						@Getter @Setter private char[] dt39AchtotInd = new char[2];

	
	/**
	* Constructor for DtPage3Ln9
	**/
    public DtPage3Ln9() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setDt39Cc(("0").toCharArray());
       replaceValue( // serialize and save the value
             fillSpace(1)
             , getStartOffset() + 1
             ,1
             );
       replaceValue( // serialize and save the value
             ("NET SETTLEMENT (ACH)").toCharArray()
             , getStartOffset() + 2
             ,20
             );
       replaceValue( // serialize and save the value
             fillSpace(14)
             , getStartOffset() + 22
             ,14
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
								setDt39AchtotInd(fillSpace(2));
       replaceValue( // serialize and save the value
             fillSpace(13)
             , getStartOffset() + 119
             ,13
             );
    }





}
  
