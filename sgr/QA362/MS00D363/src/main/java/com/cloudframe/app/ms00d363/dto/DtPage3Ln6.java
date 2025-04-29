package com.cloudframe.app.ms00d363.dto;

/**
*  The class DtPage3Ln6 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:42. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class DtPage3Ln6 extends DtPage3Ln6Serialized {
   

						@Getter @Setter private char[] dt36Cc = new char[1];




						@Getter @Setter private char[] dt36IssexpDbAmt = Field.fillLowValue(18);


						@Getter @Setter private char[] dt36IssexpCrAmt = Field.fillLowValue(18);

						@Getter @Setter private char[] filllr = new char[10];

						@Getter @Setter private char[] dt36IssexpNetAmt = Field.fillLowValue(18);


						@Getter @Setter private char[] dt36IssexpInd = new char[2];

	
	/**
	* Constructor for DtPage3Ln6
	**/
    public DtPage3Ln6() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setDt36Cc(("0").toCharArray());
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
								setFilllr(fillSpace(10));
       replaceValue( // serialize and save the value
             fillSpace(6)
             , getStartOffset() + 111
             ,6
             );
								setDt36IssexpInd(fillSpace(2));
       replaceValue( // serialize and save the value
             fillSpace(13)
             , getStartOffset() + 119
             ,13
             );
    }





}
  
