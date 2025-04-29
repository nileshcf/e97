package com.cloudframe.app.ms00d363.dto;

/**
*  The class DtPage3Ln1a is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:42. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.utility.CFUtil;


@Data
public class DtPage3Ln1a extends DtPage3Ln1aSerialized {
   

						@Getter @Setter private char[] dt31aCc = new char[1];


								@Getter @Setter private char[] dt31aSerNo = new char[2];
							


								@Getter @Setter private char[] dt31aCreditAmt = Field.fillLowValue(20);




								@Getter @Setter private char[] dt31aDebitAmt = Field.fillLowValue(20);




								@Getter @Setter private char[] dt31aNetAmt = Field.fillLowValue(20);


						@Getter @Setter private char[] dt31aInd = Field.fillLowValue(1);

	
	/**
	* Constructor for DtPage3Ln1a
	**/
    public DtPage3Ln1a() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setDt31aCc(fillSpace(1));
       replaceValue( // serialize and save the value
             fillSpace(2)
             , getStartOffset() + 1
             ,2
             );
								setDt31aSerNo(CFUtil.cobolNumberFormatter("Z9".toCharArray(),"0".toCharArray()));
       replaceValue( // serialize and save the value
             fillSpace(13)
             , getStartOffset() + 5
             ,13
             );
       replaceValue( // serialize and save the value
             fillSpace(1)
             , getStartOffset() + 38
             ,1
             );
       replaceValue( // serialize and save the value
             ("C").toCharArray()
             , getStartOffset() + 39
             ,1
             );
       replaceValue( // serialize and save the value
             fillSpace(8)
             , getStartOffset() + 40
             ,8
             );
       replaceValue( // serialize and save the value
             fillSpace(1)
             , getStartOffset() + 68
             ,1
             );
       replaceValue( // serialize and save the value
             ("D").toCharArray()
             , getStartOffset() + 69
             ,1
             );
       replaceValue( // serialize and save the value
             fillSpace(6)
             , getStartOffset() + 70
             ,6
             );
       replaceValue( // serialize and save the value
             fillSpace(1)
             , getStartOffset() + 96
             ,1
             );
       replaceValue( // serialize and save the value
             fillSpace(37)
             , getStartOffset() + 98
             ,37
             );
    }





}
  
