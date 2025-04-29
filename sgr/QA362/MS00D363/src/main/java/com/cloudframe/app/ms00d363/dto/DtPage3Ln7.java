package com.cloudframe.app.ms00d363.dto;

/**
*  The class DtPage3Ln7 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:42. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class DtPage3Ln7 extends DtPage3Ln7Serialized {
   

						@Getter @Setter private char[] dt37Cc = new char[1];




						@Getter @Setter private char[] dt37IssintDbAmt = Field.fillLowValue(20);


						@Getter @Setter private char[] dt37IssintCrAmt = Field.fillLowValue(20);


						@Getter @Setter private char[] dt37IssintNetAmt = Field.fillLowValue(20);


						@Getter @Setter private char[] dt37IssintInd = new char[2];

	
	/**
	* Constructor for DtPage3Ln7
	**/
    public DtPage3Ln7() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setDt37Cc(("0").toCharArray());
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
								setDt37IssintInd(fillSpace(2));
       replaceValue( // serialize and save the value
             fillSpace(13)
             , getStartOffset() + 119
             ,13
             );
    }





}
  
