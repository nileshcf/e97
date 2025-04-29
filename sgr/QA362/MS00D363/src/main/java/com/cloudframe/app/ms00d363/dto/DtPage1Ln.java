package com.cloudframe.app.ms00d363.dto;

/**
*  The class DtPage1Ln is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:42. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class DtPage1Ln extends DtPage1LnSerialized {
   

						@Getter @Setter private char[] dt1Cc = new char[1];


						@Getter @Setter private char[] dt1Desc = Field.fillLowValue(18);

								@Getter @Setter private char[] dt1FinNbr = Field.fillLowValue(9);


								@Getter @Setter private char[] dt1FinNbrDen = Field.fillLowValue(9);


						@Getter @Setter private char[] dt1FinAmt = Field.fillLowValue(18);

						@Getter @Setter private char[] dt1FinAmtInd = new char[2];


								@Getter @Setter private char[] dt1FinFeeNbr = Field.fillLowValue(9);


								@Getter @Setter private char[] dt1PctFeeNbr = Field.fillLowValue(9);


								@Getter @Setter private char[] dt1NfinFeeNbr = Field.fillLowValue(9);


								@Getter @Setter private char[] dt1NbilFeeNbr = Field.fillLowValue(9);


						@Getter @Setter private char[] dt1FeeAmtNet = Field.fillLowValue(20);

						@Getter @Setter private char[] dt1FeeAmtInd = Field.fillLowValue(2);

	
	/**
	* Constructor for DtPage1Ln
	**/
    public DtPage1Ln() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setDt1Cc(fillSpace(1));
       replaceValue( // serialize and save the value
             fillSpace(3)
             , getStartOffset() + 1
             ,3
             );
       replaceValue( // serialize and save the value
             fillSpace(1)
             , getStartOffset() + 31
             ,1
             );
       replaceValue( // serialize and save the value
             fillSpace(1)
             , getStartOffset() + 41
             ,1
             );
								setDt1FinAmtInd(fillSpace(2));
       replaceValue( // serialize and save the value
             fillSpace(1)
             , getStartOffset() + 62
             ,1
             );
       replaceValue( // serialize and save the value
             fillSpace(1)
             , getStartOffset() + 72
             ,1
             );
       replaceValue( // serialize and save the value
             fillSpace(1)
             , getStartOffset() + 82
             ,1
             );
       replaceValue( // serialize and save the value
             fillSpace(1)
             , getStartOffset() + 92
             ,1
             );
       replaceValue( // serialize and save the value
             fillSpace(4)
             , getStartOffset() + 102
             ,4
             );
       replaceValue( // serialize and save the value
             fillSpace(5)
             , getStartOffset() + 128
             ,5
             );
    }





}
  
