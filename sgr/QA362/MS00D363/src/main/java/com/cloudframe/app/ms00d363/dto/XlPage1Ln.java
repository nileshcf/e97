package com.cloudframe.app.ms00d363.dto;

/**
*  The class XlPage1Ln is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:42. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class XlPage1Ln extends XlPage1LnSerialized {
   


						@Getter @Setter private char[] xl1ProcId = new char[10];


						@Getter @Setter private char[] xl1InstId = new char[10];


						@Getter @Setter private char[] xl1Currency = new char[3];


						@Getter @Setter private char[] xl1SettIca = new char[6];


						@Getter @Setter private char[] xl1Ssc = new char[3];


						@Getter @Setter private char[] xl1Isis = new char[4];


						@Getter @Setter private char[] xl1ProdDesc = new char[25];


						@Getter @Setter private char[] xl1AcqIss = new char[9];


						@Getter @Setter private char[] xl1Desc = new char[17];


								@Getter @Setter private char[] xl1FinNbr = Field.fillLowValue(10);


								@Getter @Setter private char[] xl1FinNbrDen = Field.fillLowValue(9);


						@Getter @Setter private char[] xl1FinAmt = new char[18];

						@Getter @Setter private char[] xl1FinAmtInd = new char[2];


								@Getter @Setter private char[] xl1FinFeeNbr = Field.fillLowValue(9);


								@Getter @Setter private char[] xl1PctFeeNbr = Field.fillLowValue(9);


								@Getter @Setter private char[] xl1NfinFeeNbr = Field.fillLowValue(8);


								@Getter @Setter private char[] xl1NbilFeeNbr = Field.fillLowValue(8);


						@Getter @Setter private char[] xl1FeeAmtDb = Field.fillLowValue(16);


						@Getter @Setter private char[] xl1FeeAmtCr = Field.fillLowValue(16);


						@Getter @Setter private char[] xl1BinId = Field.fillLowValue(11);


						@Getter @Setter private char[] xl1GcmsSamAchInd = Field.fillLowValue(4);


	
	/**
	* Constructor for XlPage1Ln
	**/
    public XlPage1Ln() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             fillSpace(1)
             , getStartOffset() + 0
             ,1
             );
								setXl1ProcId(fillSpace(10));
       replaceValue( // serialize and save the value
             ("^").toCharArray()
             , getStartOffset() + 11
             ,1
             );
								setXl1InstId(fillSpace(10));
       replaceValue( // serialize and save the value
             ("^").toCharArray()
             , getStartOffset() + 22
             ,1
             );
								setXl1Currency(fillSpace(3));
       replaceValue( // serialize and save the value
             ("^").toCharArray()
             , getStartOffset() + 26
             ,1
             );
								setXl1SettIca(fillSpace(6));
       replaceValue( // serialize and save the value
             ("^").toCharArray()
             , getStartOffset() + 33
             ,1
             );
								setXl1Ssc(fillSpace(3));
       replaceValue( // serialize and save the value
             ("^").toCharArray()
             , getStartOffset() + 37
             ,1
             );
								setXl1Isis(fillSpace(4));
       replaceValue( // serialize and save the value
             ("^").toCharArray()
             , getStartOffset() + 42
             ,1
             );
								setXl1ProdDesc(fillSpace(25));
       replaceValue( // serialize and save the value
             ("^").toCharArray()
             , getStartOffset() + 68
             ,1
             );
								setXl1AcqIss(fillSpace(9));
       replaceValue( // serialize and save the value
             ("^").toCharArray()
             , getStartOffset() + 78
             ,1
             );
								setXl1Desc(fillSpace(17));
       replaceValue( // serialize and save the value
             ("^").toCharArray()
             , getStartOffset() + 96
             ,1
             );
       replaceValue( // serialize and save the value
             ("^").toCharArray()
             , getStartOffset() + 107
             ,1
             );
       replaceValue( // serialize and save the value
             ("^").toCharArray()
             , getStartOffset() + 117
             ,1
             );
								setXl1FinAmt(fillSpace(18));
								setXl1FinAmtInd(fillSpace(2));
       replaceValue( // serialize and save the value
             ("^").toCharArray()
             , getStartOffset() + 138
             ,1
             );
       replaceValue( // serialize and save the value
             ("^").toCharArray()
             , getStartOffset() + 148
             ,1
             );
       replaceValue( // serialize and save the value
             ("^").toCharArray()
             , getStartOffset() + 158
             ,1
             );
       replaceValue( // serialize and save the value
             ("^").toCharArray()
             , getStartOffset() + 167
             ,1
             );
       replaceValue( // serialize and save the value
             ("^").toCharArray()
             , getStartOffset() + 176
             ,1
             );
       replaceValue( // serialize and save the value
             ("^").toCharArray()
             , getStartOffset() + 193
             ,1
             );
       replaceValue( // serialize and save the value
             ("^").toCharArray()
             , getStartOffset() + 210
             ,1
             );
       replaceValue( // serialize and save the value
             ("^").toCharArray()
             , getStartOffset() + 222
             ,1
             );
       replaceValue( // serialize and save the value
             ("^").toCharArray()
             , getStartOffset() + 227
             ,1
             );
       replaceValue( // serialize and save the value
             pad(270," ".toCharArray(),' ',RIGHT_PAD)
             , getStartOffset() + 228
             ,270
             );
    }





}
  
