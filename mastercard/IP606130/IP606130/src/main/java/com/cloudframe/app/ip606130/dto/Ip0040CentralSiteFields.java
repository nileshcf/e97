package com.cloudframe.app.ip606130.dto;

/**
*  The class Ip0040CentralSiteFields is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:29. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class Ip0040CentralSiteFields extends Ip0040CentralSiteFieldsSerialized { 
   

						@Getter @Setter private char[] ip0040ChbConvExclId = Field.fillLowValue(1);

								@Getter @Setter private long ip0040ChbConvExclExpire;

						@Getter @Setter private char[] ip0040HardshipIndicator = Field.fillLowValue(1);

								@Getter @Setter private long ip0040HardshipEffective;

								@Getter @Setter private long ip0040HardshipExpiration;

						@Getter @Setter private char[] ip0040GamingCountrySw = Field.fillLowValue(1);

								@Getter @Setter private int ip0040CrossBorderInd;

						@Getter @Setter private char[] ip0040RecPaymtCanSw = Field.fillLowValue(1);

						@Getter @Setter private char[] ip0040DomDbtParticipSw = Field.fillLowValue(1);
				@Getter @Setter private Ip0040GrpCode ip0040GrpCode = new Ip0040GrpCode();

						@Getter @Setter private char[] ip0040IpcFraudCtlSw = Field.fillLowValue(1);

						@Getter @Setter private char[] ip0040IccrParticipInd = Field.fillLowValue(1);

						@Getter @Setter private char[] ip0040RevCreditInd = Field.fillLowValue(1);

						@Getter @Setter private char[] ip0040ChgbkBkoutInd = Field.fillLowValue(1);

						@Getter @Setter private char[] ip0040RtnTrnstNum = Field.fillLowValue(10);

								@Getter @Setter private long ip0040TrueIssuerIca;

						@Getter @Setter private char[] ip0040MerchantTaxIdSw = Field.fillLowValue(1);

						@Getter @Setter private char[] ip0040InstallServSw = Field.fillLowValue(1);

						@Getter @Setter private char[] ip0040TokenServiceInd = Field.fillLowValue(1);

						@Getter @Setter private char[] ip0040GbsBillInd = Field.fillLowValue(1);

						@Getter @Setter private char[] ip0040InstallAuthSw = Field.fillLowValue(1);

						@Getter @Setter private char[] ip0040SeqServiceInd = Field.fillLowValue(1);

						@Getter @Setter private char[] ip0040CbfmParticipInd = Field.fillLowValue(1);

						@Getter @Setter private char[] ip0040CbcmParticipInd = Field.fillLowValue(1);

						@Getter @Setter private char[] ip0040CbfmDccSw = Field.fillLowValue(1);

						@Getter @Setter private char[] ip0040InstApiGcmsSw = Field.fillLowValue(1);

						@Getter @Setter private char[] ip0040InsEnabApiInd = Field.fillLowValue(1);

						@Getter @Setter private char[] ip0040InstApiUiSw = Field.fillLowValue(1);

						@Getter @Setter private char[] ip0040MstrpassAchProgInd = Field.fillLowValue(1);

						@Getter @Setter private char[] ip0040OboInd = Field.fillLowValue(1);

						@Getter @Setter private char[] ip0040MultCurrSw = Field.fillLowValue(1);

								@Getter @Setter private long ip0040AnonIndEffDate;
	
	/**
	* Constructor for Ip0040CentralSiteFields
	**/
    public Ip0040CentralSiteFields() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Ip0040CentralSiteFields. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip0040CentralSiteFields(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
					getIp0040GrpCode().setParent(this,getStartOffset() + 24);
    } 

	/**
	 * 	initializes Ip0040CentralSiteFields
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setIp0040ChbConvExclId(CONSTANTS.SPACE);
                     setIp0040ChbConvExclExpire(0);
         setIp0040HardshipIndicator(CONSTANTS.SPACE);
                     setIp0040HardshipEffective(0);
                     setIp0040HardshipExpiration(0);
         setIp0040GamingCountrySw(CONSTANTS.SPACE);
                     setIp0040CrossBorderInd(0);
         setIp0040RecPaymtCanSw(CONSTANTS.SPACE);
         setIp0040DomDbtParticipSw(CONSTANTS.SPACE);
          getIp0040GrpCode().initialize();
     
         setIp0040IpcFraudCtlSw(CONSTANTS.SPACE);
         setIp0040IccrParticipInd(CONSTANTS.SPACE);
         setIp0040RevCreditInd(CONSTANTS.SPACE);
         setIp0040ChgbkBkoutInd(CONSTANTS.SPACE);
         setIp0040RtnTrnstNum(CONSTANTS.SPACE_10);
                     setIp0040TrueIssuerIca(0);
         setIp0040MerchantTaxIdSw(CONSTANTS.SPACE);
         setIp0040InstallServSw(CONSTANTS.SPACE);
         setIp0040TokenServiceInd(CONSTANTS.SPACE);
         setIp0040GbsBillInd(CONSTANTS.SPACE);
         setIp0040InstallAuthSw(CONSTANTS.SPACE);
         setIp0040SeqServiceInd(CONSTANTS.SPACE);
         setIp0040CbfmParticipInd(CONSTANTS.SPACE);
         setIp0040CbcmParticipInd(CONSTANTS.SPACE);
         setIp0040CbfmDccSw(CONSTANTS.SPACE);
         setIp0040InstApiGcmsSw(CONSTANTS.SPACE);
         setIp0040InsEnabApiInd(CONSTANTS.SPACE);
         setIp0040InstApiUiSw(CONSTANTS.SPACE);
         setIp0040MstrpassAchProgInd(CONSTANTS.SPACE);
         setIp0040OboInd(CONSTANTS.SPACE);
         setIp0040MultCurrSw(CONSTANTS.SPACE);
                     setIp0040AnonIndEffDate(0);
   }


}
  
