package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip00724CentralSiteFields is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:37. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class Ip00724CentralSiteFields extends Ip00724CentralSiteFieldsSerialized { 
   

								@Getter @Setter private long ip00724JpnCustId;

						@Getter @Setter private char[] ip00724GamingPartcptnSw = Field.fillLowValue(1);

						@Getter @Setter private char[] ip00724AckDtlPrsnmnt = Field.fillLowValue(1);

						@Getter @Setter private char[] ip00724AckDtlChgbk = Field.fillLowValue(1);

						@Getter @Setter private char[] ip00724AckDtlFeeColl = Field.fillLowValue(1);

						@Getter @Setter private char[] ip00724NotDtlPrsnmnt = Field.fillLowValue(1);

						@Getter @Setter private char[] ip00724NotDtlChgbk = Field.fillLowValue(1);

						@Getter @Setter private char[] ip00724NotDtlFeeColl = Field.fillLowValue(1);

						@Getter @Setter private char[] ip00724McSendPart = Field.fillLowValue(1);

						@Getter @Setter private char[] ip00724RegEcomOptoutSw = Field.fillLowValue(1);

						@Getter @Setter private char[] ip00724De54OptionInd = Field.fillLowValue(1);

						@Getter @Setter private char[] ip00724AcqAlmOptinFlag = Field.fillLowValue(1);

						@Getter @Setter private char[] ip00724VatExclusionFlag = Field.fillLowValue(1);

						@Getter @Setter private char[] ip00724DupOptOutInd = Field.fillLowValue(1);

						@Getter @Setter private char[] ip00724IcaMcsystemFlag = Field.fillLowValue(1);

						@Getter @Setter private char[] ip00724Filler2 = Field.fillLowValue(1);
	
	/**
	* Constructor for Ip00724CentralSiteFields
	**/
    public Ip00724CentralSiteFields() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Ip00724CentralSiteFields. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip00724CentralSiteFields(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes Ip00724CentralSiteFields
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setIp00724JpnCustId(0);
         setIp00724GamingPartcptnSw(CONSTANTS.SPACE);
         setIp00724AckDtlPrsnmnt(CONSTANTS.SPACE);
         setIp00724AckDtlChgbk(CONSTANTS.SPACE);
         setIp00724AckDtlFeeColl(CONSTANTS.SPACE);
         setIp00724NotDtlPrsnmnt(CONSTANTS.SPACE);
         setIp00724NotDtlChgbk(CONSTANTS.SPACE);
         setIp00724NotDtlFeeColl(CONSTANTS.SPACE);
         setIp00724McSendPart(CONSTANTS.SPACE);
         setIp00724RegEcomOptoutSw(CONSTANTS.SPACE);
         setIp00724De54OptionInd(CONSTANTS.SPACE);
         setIp00724AcqAlmOptinFlag(CONSTANTS.SPACE);
         setIp00724VatExclusionFlag(CONSTANTS.SPACE);
         setIp00724DupOptOutInd(CONSTANTS.SPACE);
         setIp00724IcaMcsystemFlag(CONSTANTS.SPACE);
         setIp00724Filler2(CONSTANTS.SPACE);
   }


}
  
