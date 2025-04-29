package com.cloudframe.app.ms00d363.dto;

/**
*  The class BalRecord is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:42. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class BalRecord extends BalRecordSerialized {
   

						@Getter @Setter private char[] balReportType = Field.fillLowValue(10);

						@Getter @Setter private char[] balReportId = Field.fillLowValue(5);

						@Getter @Setter private char[] balCutoffNum = Field.fillLowValue(3);

						@Getter @Setter private char[] balSettlSvc = Field.fillLowValue(3);

						@Getter @Setter private char[] balProcessorId = Field.fillLowValue(10);

						@Getter @Setter private char[] balIca = Field.fillLowValue(6);

						@Getter @Setter private char[] balAcqIssFlag = Field.fillLowValue(1);

								@Getter @Setter private int balCurrCode;

								@Getter @Setter private int balCurrExp;

								@Getter @Setter private long balCmpltdAmt;

						@Getter @Setter private char[] balCmpltdAmtInd = Field.fillLowValue(1);

								@Getter @Setter private long balIntrchgAmt;

						@Getter @Setter private char[] balIntrchgAmtInd = Field.fillLowValue(1);

								@Getter @Setter private long balSettlAmt;

						@Getter @Setter private char[] balSettlAmtInd = Field.fillLowValue(1);

								@Getter @Setter private long balRecordCnt;

						@Getter @Setter private char[] balFiller = Field.fillLowValue(95);
	
	/**
	* Constructor for BalRecord
	**/
    public BalRecord() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }



	/**
	 * 	initializes BalRecord
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setBalReportType(CONSTANTS.SPACE_10);
         setBalReportId(CONSTANTS.SPACE_5);
         setBalCutoffNum(CONSTANTS.SPACE_3);
         setBalSettlSvc(CONSTANTS.SPACE_3);
         setBalProcessorId(CONSTANTS.SPACE_10);
         setBalIca(CONSTANTS.SPACE_6);
         setBalAcqIssFlag(CONSTANTS.SPACE);
                     setBalCurrCode(0);
                     setBalCurrExp(0);
                     setBalCmpltdAmt(0);
         setBalCmpltdAmtInd(CONSTANTS.SPACE);
                     setBalIntrchgAmt(0);
         setBalIntrchgAmtInd(CONSTANTS.SPACE);
                     setBalSettlAmt(0);
         setBalSettlAmtInd(CONSTANTS.SPACE);
                     setBalRecordCnt(0);
         setBalFiller(CONSTANTS.SPACE_95);
   }


}
  
