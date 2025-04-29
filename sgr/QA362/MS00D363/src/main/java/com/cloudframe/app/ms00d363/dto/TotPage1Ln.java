package com.cloudframe.app.ms00d363.dto;

/**
*  The class TotPage1Ln is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:42. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class TotPage1Ln extends TotPage1LnSerialized {
   

						@Getter @Setter private char[] tot1Cc = new char[1];


						@Getter @Setter private char[] tot1Desc = new char[16];

								@Getter @Setter private char[] tot1FinNbr = Field.fillLowValue(11);


								@Getter @Setter private char[] tot1FinNbrDen = Field.fillLowValue(9);


						@Getter @Setter private char[] tot1FinAmt = Field.fillLowValue(18);

						@Getter @Setter private char[] tot1FinAmtInd = new char[2];


								@Getter @Setter private char[] tot1FinFeeNbr = Field.fillLowValue(9);


								@Getter @Setter private char[] tot1PctFeeNbr = Field.fillLowValue(9);


								@Getter @Setter private char[] tot1NfinFeeNbr = Field.fillLowValue(9);


								@Getter @Setter private char[] tot1NbilFeeNbr = Field.fillLowValue(9);


						@Getter @Setter private char[] tot1FeeAmtNet = Field.fillLowValue(20);

						@Getter @Setter private char[] tot1FeeAmtInd = Field.fillLowValue(2);

	
	/**
	* Constructor for TotPage1Ln
	**/
    public TotPage1Ln() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setTot1Cc(fillSpace(1));
       replaceValue( // serialize and save the value
             fillSpace(3)
             , getStartOffset() + 1
             ,3
             );
								setTot1Desc(("    TOTALS      ").toCharArray());
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
								setTot1FinAmtInd(fillSpace(2));
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
  
