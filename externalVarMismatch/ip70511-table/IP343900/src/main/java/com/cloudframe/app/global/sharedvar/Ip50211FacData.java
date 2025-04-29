package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip50211FacData is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:37. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class Ip50211FacData extends Ip50211FacDataSerialized { 
   

						@Getter @Setter private char[] ip50211InsertTimestamp = Field.fillLowValue(26);

								@Getter @Setter private int ip50211CycleIndicator;

								@Getter @Setter private long ip50211MsgRsnCd;

								@Getter @Setter private long ip50211ChargebackAmt;

								@Getter @Setter private int ip50211ChargebackCurrCd;

						@Getter @Setter private char[] ip50211ChargebackExpCd = Field.fillLowValue(1);

						@Getter @Setter private char[] ip50211ReversalIndicator = Field.fillLowValue(1);

						@Getter @Setter private char[] ip50211ChargebackRefNo = Field.fillLowValue(10);

								@Getter @Setter private int ip50211FuncCd;

						@Getter @Setter private char[] ip50211SwitchSerialNum = Field.fillLowValue(9);

						@Getter @Setter private char[] ip50211SourceCd = Field.fillLowValue(4);

								@Getter @Setter private short ip50211CntCd;

						@Getter @Setter private char[] ip50211OrigSwSerNum = Field.fillLowValue(9);
				@Getter @Setter private Ip50211CloseDt ip50211CloseDt = new Ip50211CloseDt();

								@Getter @Setter private int ip50211ChgbkCnt;

						@Getter @Setter private char[] ip50211RejRsn1Cd = Field.fillLowValue(4);

						@Getter @Setter private char[] ip50211RejRsn2Cd = Field.fillLowValue(4);

						@Getter @Setter private char[] ip50211VrtlAcctNum = Field.fillLowValue(19);
	
	/**
	* Constructor for Ip50211FacData
	**/
    public Ip50211FacData() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Ip50211FacData. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip50211FacData(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
					getIp50211CloseDt().setParent(this,getStartOffset() + 89);
    } 

	/**
	 * 	initializes Ip50211FacData
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setIp50211InsertTimestamp(CONSTANTS.SPACE_26);
                     setIp50211CycleIndicator(0);
                     setIp50211MsgRsnCd(0);
                     setIp50211ChargebackAmt(0);
                     setIp50211ChargebackCurrCd(0);
         setIp50211ChargebackExpCd(CONSTANTS.SPACE);
         setIp50211ReversalIndicator(CONSTANTS.SPACE);
         setIp50211ChargebackRefNo(CONSTANTS.SPACE_10);
                     setIp50211FuncCd(0);
         setIp50211SwitchSerialNum(CONSTANTS.SPACE_9);
         setIp50211SourceCd(CONSTANTS.SPACE_4);
         	setIp50211CntCd((short)0);
         setIp50211OrigSwSerNum(CONSTANTS.SPACE_9);
          getIp50211CloseDt().initialize();
     
                     setIp50211ChgbkCnt(0);
         setIp50211RejRsn1Cd(CONSTANTS.SPACE_4);
         setIp50211RejRsn2Cd(CONSTANTS.SPACE_4);
         setIp50211VrtlAcctNum(CONSTANTS.SPACE_19);
   }


}
  
