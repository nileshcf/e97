package com.cloudframe.app.ip829010.dto;

/**
*  The class Ip82921FacData is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:37. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class Ip82921FacData extends Ip82921FacDataSerialized { 
   

						@Getter @Setter private char[] ip82921InsertTimestamp = Field.fillLowValue(26);

								@Getter @Setter private int ip82921CycleIndicator;

								@Getter @Setter private long ip82921MsgRsnCd;

								@Getter @Setter private long ip82921ChargebackAmt;

								@Getter @Setter private int ip82921ChargebackCurrCd;

						@Getter @Setter private char[] ip82921ChargebackExpCd = Field.fillLowValue(1);

						@Getter @Setter private char[] ip82921ReversalIndicator = Field.fillLowValue(1);

						@Getter @Setter private char[] ip82921ChargebackRefNo = Field.fillLowValue(10);

								@Getter @Setter private int ip82921FuncCd;

						@Getter @Setter private char[] ip82921SwitchSerialNum = Field.fillLowValue(9);

						@Getter @Setter private char[] ip82921SourceCd = Field.fillLowValue(4);

								@Getter @Setter private short ip82921CntCd;

						@Getter @Setter private char[] ip82921OrigSwSerNum = Field.fillLowValue(9);
				@Getter @Setter private Ip82921CloseDt ip82921CloseDt = new Ip82921CloseDt();

								@Getter @Setter private int ip82921ChgbkCnt;

						@Getter @Setter private char[] ip82921RejRsn1Cd = Field.fillLowValue(4);

						@Getter @Setter private char[] ip82921RejRsn2Cd = Field.fillLowValue(4);

						@Getter @Setter private char[] ip82921VrtlAcctNum = Field.fillLowValue(19);
	
	/**
	* Constructor for Ip82921FacData
	**/
    public Ip82921FacData() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Ip82921FacData. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip82921FacData(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
					getIp82921CloseDt().setParent(this,getStartOffset() + 89);
    } 

	/**
	 * 	initializes Ip82921FacData
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setIp82921InsertTimestamp(CONSTANTS.SPACE_26);
                     setIp82921CycleIndicator(0);
                     setIp82921MsgRsnCd(0);
                     setIp82921ChargebackAmt(0);
                     setIp82921ChargebackCurrCd(0);
         setIp82921ChargebackExpCd(CONSTANTS.SPACE);
         setIp82921ReversalIndicator(CONSTANTS.SPACE);
         setIp82921ChargebackRefNo(CONSTANTS.SPACE_10);
                     setIp82921FuncCd(0);
         setIp82921SwitchSerialNum(CONSTANTS.SPACE_9);
         setIp82921SourceCd(CONSTANTS.SPACE_4);
         	setIp82921CntCd((short)0);
         setIp82921OrigSwSerNum(CONSTANTS.SPACE_9);
          getIp82921CloseDt().initialize();
     
                     setIp82921ChgbkCnt(0);
         setIp82921RejRsn1Cd(CONSTANTS.SPACE_4);
         setIp82921RejRsn2Cd(CONSTANTS.SPACE_4);
         setIp82921VrtlAcctNum(CONSTANTS.SPACE_19);
   }


}
  
