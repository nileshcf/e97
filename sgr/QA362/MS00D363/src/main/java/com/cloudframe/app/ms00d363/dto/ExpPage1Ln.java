package com.cloudframe.app.ms00d363.dto;

/**
*  The class ExpPage1Ln is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:42. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class ExpPage1Ln extends ExpPage1LnSerialized {
   

						@Getter @Setter private char[] exp1Cc = new char[1];


						@Getter @Setter private char[] exp1Desc = new char[18];

								@Getter @Setter private char[] exp1FinNbr = Field.fillLowValue(9);


								@Getter @Setter private char[] exp1FinNbrDen = Field.fillLowValue(9);


						@Getter @Setter private char[] exp1FinAmt = Field.fillLowValue(18);

						@Getter @Setter private char[] exp1FinAmtInd = new char[2];


								@Getter @Setter private char[] exp1FinFeeNbr = Field.fillLowValue(9);


								@Getter @Setter private char[] exp1PctFeeNbr = Field.fillLowValue(9);


								@Getter @Setter private char[] exp1NfinFeeNbr = Field.fillLowValue(9);


								@Getter @Setter private char[] exp1NbilFeeNbr = Field.fillLowValue(9);


						@Getter @Setter private char[] exp1FeeAmtNet = Field.fillLowValue(16);

						@Getter @Setter private char[] exp1FeeAmtInd = Field.fillLowValue(2);

	
	/**
	* Constructor for ExpPage1Ln
	**/
    public ExpPage1Ln() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setExp1Cc(("0").toCharArray());
       replaceValue( // serialize and save the value
             fillSpace(3)
             , getStartOffset() + 1
             ,3
             );
								setExp1Desc(("EXCEPTION ITEMS   ").toCharArray());
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
								setExp1FinAmtInd(fillSpace(2));
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
             fillSpace(8)
             , getStartOffset() + 102
             ,8
             );
       replaceValue( // serialize and save the value
             fillSpace(5)
             , getStartOffset() + 128
             ,5
             );
    }





}
  
