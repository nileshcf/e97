package com.cloudframe.app.ip829010.dto;

/**
*  The class FnsPayloadFacData is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:37. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class FnsPayloadFacData extends FnsPayloadFacDataSerialized { 
   

						@Getter @Setter private char[] fnsPayloadInsertTimestamp = Field.fillLowValue(26);

								@Getter @Setter private int fnsPayloadCycleIndicator;

								@Getter @Setter private long fnsPayloadMsgRsnCd;

								@Getter @Setter private long fnsPayloadChargebackAmt;

								@Getter @Setter private int fnsPayloadChargebackCurrCd;

						@Getter @Setter private char[] fnsPayloadChargebackExpCd = Field.fillLowValue(1);

						@Getter @Setter private char[] fnsPayloadReversalIndicator = Field.fillLowValue(1);

						@Getter @Setter private char[] fnsPayloadChargebackRefNo = Field.fillLowValue(10);

								@Getter @Setter private int fnsPayloadFuncCd;

						@Getter @Setter private char[] fnsPayloadSwitchSerialNum = Field.fillLowValue(9);

						@Getter @Setter private char[] fnsPayloadSourceCd = Field.fillLowValue(4);

								@Getter @Setter private short fnsPayloadCntCd;

						@Getter @Setter private char[] fnsPayloadOrigSwSerNum = Field.fillLowValue(9);
				@Getter @Setter private FnsPayloadCloseDt fnsPayloadCloseDt = new FnsPayloadCloseDt();

								@Getter @Setter private int fnsPayloadChgbkCnt;

						@Getter @Setter private char[] fnsPayloadRejRsn1Cd = Field.fillLowValue(4);

						@Getter @Setter private char[] fnsPayloadRejRsn2Cd = Field.fillLowValue(4);

						@Getter @Setter private char[] fnsPayloadVrtlAcctNum = Field.fillLowValue(19);
	
	/**
	* Constructor for FnsPayloadFacData
	**/
    public FnsPayloadFacData() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for FnsPayloadFacData. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public FnsPayloadFacData(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
					getFnsPayloadCloseDt().setParent(this,getStartOffset() + 89);
    } 

	/**
	 * 	initializes FnsPayloadFacData
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setFnsPayloadInsertTimestamp(CONSTANTS.SPACE_26);
                     setFnsPayloadCycleIndicator(0);
                     setFnsPayloadMsgRsnCd(0);
                     setFnsPayloadChargebackAmt(0);
                     setFnsPayloadChargebackCurrCd(0);
         setFnsPayloadChargebackExpCd(CONSTANTS.SPACE);
         setFnsPayloadReversalIndicator(CONSTANTS.SPACE);
         setFnsPayloadChargebackRefNo(CONSTANTS.SPACE_10);
                     setFnsPayloadFuncCd(0);
         setFnsPayloadSwitchSerialNum(CONSTANTS.SPACE_9);
         setFnsPayloadSourceCd(CONSTANTS.SPACE_4);
         	setFnsPayloadCntCd((short)0);
         setFnsPayloadOrigSwSerNum(CONSTANTS.SPACE_9);
          getFnsPayloadCloseDt().initialize();
     
                     setFnsPayloadChgbkCnt(0);
         setFnsPayloadRejRsn1Cd(CONSTANTS.SPACE_4);
         setFnsPayloadRejRsn2Cd(CONSTANTS.SPACE_4);
         setFnsPayloadVrtlAcctNum(CONSTANTS.SPACE_19);
   }


}
  
