package com.cloudframe.app.ms00d363.dto;

/**
*  The class DtPage3Ln10 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:42. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class DtPage3Ln10 extends DtPage3Ln10Serialized {
   

						@Getter @Setter private char[] dt310Cc = new char[1];



						@Getter @Setter private char[] dt310Ica = new char[6];


						@Getter @Setter private char[] dt310GcmacqNetAmt = Field.fillLowValue(18);

						@Getter @Setter private char[] dt310GcmacqInd = new char[2];


						@Getter @Setter private char[] dt310GcmacqFeeAmt = Field.fillLowValue(16);

						@Getter @Setter private char[] dt310GcmacqFeeInd = new char[2];

						@Getter @Setter private char[] dt310GcmissNetAmt = Field.fillLowValue(18);

						@Getter @Setter private char[] dt310GcmissInd = new char[2];


						@Getter @Setter private char[] dt310GcmissFeeAmt = Field.fillLowValue(16);

						@Getter @Setter private char[] dt310GcmissFeeInd = new char[2];

	
	/**
	* Constructor for DtPage3Ln10
	**/
    public DtPage3Ln10() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setDt310Cc(("0").toCharArray());
       replaceValue( // serialize and save the value
             fillSpace(8)
             , getStartOffset() + 1
             ,8
             );
       replaceValue( // serialize and save the value
             ("ICA: ").toCharArray()
             , getStartOffset() + 9
             ,5
             );
								setDt310Ica(fillSpace(6));
       replaceValue( // serialize and save the value
             fillSpace(4)
             , getStartOffset() + 20
             ,4
             );
								setDt310GcmacqInd(fillSpace(2));
       replaceValue( // serialize and save the value
             fillSpace(1)
             , getStartOffset() + 44
             ,1
             );
								setDt310GcmacqFeeInd(fillSpace(2));
								setDt310GcmissInd(fillSpace(2));
       replaceValue( // serialize and save the value
             fillSpace(2)
             , getStartOffset() + 83
             ,2
             );
								setDt310GcmissFeeInd(fillSpace(2));
       replaceValue( // serialize and save the value
             fillSpace(30)
             , getStartOffset() + 103
             ,30
             );
    }





}
  
