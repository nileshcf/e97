package com.cloudframe.app.global.sharedvar;

/**
*  The class FnsPldRdFacData is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:37. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class FnsPldRdFacData extends FnsPldRdFacDataSerialized { 
   

						@Getter @Setter private char[] fnsPldRdInsertTimestamp = Field.fillLowValue(26);

								@Getter @Setter private int fnsPldRdCycleIndicator;

								@Getter @Setter private long fnsPldRdMsgRsnCd;

								@Getter @Setter private long fnsPldRdChargebackAmt;

								@Getter @Setter private int fnsPldRdChargebackCurrCd;

						@Getter @Setter private char[] fnsPldRdChargebackExpCd = Field.fillLowValue(1);

						@Getter @Setter private char[] fnsPldRdReversalIndicator = Field.fillLowValue(1);

						@Getter @Setter private char[] fnsPldRdChargebackRefNo = Field.fillLowValue(10);

								@Getter @Setter private int fnsPldRdFuncCd;

						@Getter @Setter private char[] fnsPldRdSwitchSerialNum = Field.fillLowValue(9);

						@Getter @Setter private char[] fnsPldRdSourceCd = Field.fillLowValue(4);

								@Getter @Setter private short fnsPldRdCntCd;

						@Getter @Setter private char[] fnsPldRdOrigSwSerNum = Field.fillLowValue(9);
				@Getter @Setter private FnsPldRdCloseDt fnsPldRdCloseDt = new FnsPldRdCloseDt();

								@Getter @Setter private int fnsPldRdChgbkCnt;

						@Getter @Setter private char[] fnsPldRdRejRsn1Cd = Field.fillLowValue(4);

						@Getter @Setter private char[] fnsPldRdRejRsn2Cd = Field.fillLowValue(4);

						@Getter @Setter private char[] fnsPldRdVrtlAcctNum = Field.fillLowValue(19);
	
	/**
	* Constructor for FnsPldRdFacData
	**/
    public FnsPldRdFacData() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for FnsPldRdFacData. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public FnsPldRdFacData(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
					getFnsPldRdCloseDt().setParent(this,getStartOffset() + 89);
    } 

	/**
	 * 	initializes FnsPldRdFacData
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setFnsPldRdInsertTimestamp(CONSTANTS.SPACE_26);
                     setFnsPldRdCycleIndicator(0);
                     setFnsPldRdMsgRsnCd(0);
                     setFnsPldRdChargebackAmt(0);
                     setFnsPldRdChargebackCurrCd(0);
         setFnsPldRdChargebackExpCd(CONSTANTS.SPACE);
         setFnsPldRdReversalIndicator(CONSTANTS.SPACE);
         setFnsPldRdChargebackRefNo(CONSTANTS.SPACE_10);
                     setFnsPldRdFuncCd(0);
         setFnsPldRdSwitchSerialNum(CONSTANTS.SPACE_9);
         setFnsPldRdSourceCd(CONSTANTS.SPACE_4);
         	setFnsPldRdCntCd((short)0);
         setFnsPldRdOrigSwSerNum(CONSTANTS.SPACE_9);
          getFnsPldRdCloseDt().initialize();
     
                     setFnsPldRdChgbkCnt(0);
         setFnsPldRdRejRsn1Cd(CONSTANTS.SPACE_4);
         setFnsPldRdRejRsn2Cd(CONSTANTS.SPACE_4);
         setFnsPldRdVrtlAcctNum(CONSTANTS.SPACE_19);
   }


}
  
