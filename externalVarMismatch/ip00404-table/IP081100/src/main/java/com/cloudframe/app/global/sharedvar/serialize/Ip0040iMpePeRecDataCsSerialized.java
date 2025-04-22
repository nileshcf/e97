package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip0040iMpePeRecDataCsSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:17. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip0040iMpePeRecDataCsSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip0040iMpePeRecDataCsSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_0040I_MPE_PE_REC_DATA_CS_LENGTH = 199;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp0040iProductType;
            protected  int beginIp0040iEndpoint;
            protected  int beginIp0040iCountry;
            protected  int beginIp0040iCountryNum;
            protected  int beginIp0040iProductClass;
            protected  int beginIp0040iTranRoutingInd;
            protected  int beginIp0040iPrsProdReassgnSw;
            protected  int beginIp0040iProdReassignmentSw;
            protected  int beginIp0040iOptInFlag;
            protected  int beginIp0040iLicensedProdId;
            protected  int beginIp0040iVirtFundPanInd;
            protected  int beginIp0040iAcctCatgPartSw;
            protected  int beginIp0040iAcctCatgActvnDate;
            protected  int beginIp0040iChipConversionSw;
            protected  int beginIp0040iCoBrandSw;
            protected  int beginIp0040iSpendControlRcnSw;
            protected  int beginIp0040iMerchCleanServPart;
            protected  int beginIp0040iMerchCleanActvDate;
            protected  int beginIp0040iPaypassEnabledInd;
            protected  int beginIp0040iRateTypeIndicator;
            protected  int beginIp0040iRoutePsnIndicator;
            protected  int beginIp0040iCbwpIndicator;
            protected  int beginIp0040iFlexParticipInd;
            protected  int beginIp0040iRepwrRldInd;
            protected  int beginIp0040iMoneySendInd;
            protected  int beginIp0040iRegulatedRateIndSw;
            protected  int beginIp0040iCashAccessSw;
            protected  int beginIp0040iPersonPresentInd;
            protected  int beginIp0040iCrossBdrException;
            protected  int beginIp0040iIssTargetMarketInd;
            protected  int beginIp0040iPostDateServSw;
            protected  int beginIp0040iMealVoucherInd;
            protected  int beginIp0040iNonRldblPrpdSw;
            protected  int beginIp0040iFasterFundsInd;
            protected  int beginIp0040iAnonPrepaidInd;
            protected  int beginIp0040iDccStatusInd;
            protected  int beginIp0040iPayByAcctInd;
            protected  int beginIp0040iIssGamParticipSw;
            protected  int beginIp0040iMemberFiller;
            protected  int beginIp0040iChbConvExclId;
            protected  int beginIp0040iChbConvExclExpire;
            protected  int beginIp0040iHardshipIndicator;
            protected  int beginIp0040iHardshipEffective;
            protected  int beginIp0040iHardshipExpiration;
            protected  int beginIp0040iGamingCountrySw;
            protected  int beginIp0040iCrossBorderInd;
            protected  int beginIp0040iRecPaymtCanSw;
            protected  int beginIp0040iDomDbtParticipSw;
            protected  int beginIp0040iIpcFraudCtlSw;
            protected  int beginIp0040iIccrParticipInd;
            protected  int beginIp0040iRevCreditInd;
            protected  int beginIp0040iChgbkBkoutInd;
            protected  int beginIp0040iRtnTrnstNum;
            protected  int beginIp0040iTrueIssuerIca;
            protected  int beginIp0040iMerchantTaxIdSw;
            protected  int beginIp0040iInstallServSw;
            protected  int beginIp0040iTokenServiceInd;
            protected  int beginIp0040iGbsBillInd;
            protected  int beginIp0040iInstallAuthSw;
            protected  int beginIp0040iSeqServiceInd;
            protected  int beginIp0040iCbfmParticipInd;
            protected  int beginIp0040iCbcmParticipInd;
            protected  int beginIp0040iCbfmDccSw;
            protected  int beginIp0040iInstApiGcmsSw;
            protected  int beginIp0040iInsEnabApiInd;
            protected  int beginIp0040iInstApiUiSw;
            protected  int beginIp0040iFiller;
            protected  int beginIp0040iOboServiceInd;
            protected  int beginIp0040iMultCurrSw;
            protected  int beginIp0040iAnonIndEffDate;
            protected  int beginIp0040iCbfmEcbRateParInd;
            protected  int beginIp0040iAlmXbOptOutInd;
            protected  int beginIp0040iJpnNonmdesTknrngSw;
	
	/**
	* Constructor for Ip0040iMpePeRecDataCsSerialized
	**/
    public Ip0040iMpePeRecDataCsSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ip0040iMpePeRecDataCsSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip0040iMpePeRecDataCsSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ip0040iMpePeRecDataCsSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,25); // serialize this field at offset 25 by default 
    }
    
	/**
	* sets parent for this Ip0040iMpePeRecDataCsSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 25 by default
    }    
	/**
	* initializes the field in Ip0040iMpePeRecDataCsSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_0040I_MPE_PE_REC_DATA_CS_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp0040iProductType = getStartOffset() + 0;	// set offset for serialization
  
             beginIp0040iEndpoint = getStartOffset() + 1;	// set offset for serialization
  
             beginIp0040iCountry = getStartOffset() + 8;	// set offset for serialization
  
             beginIp0040iCountryNum = getStartOffset() + 11;	// set offset for serialization
  
  
             beginIp0040iProductClass = getStartOffset() + 15;	// set offset for serialization
  
             beginIp0040iTranRoutingInd = getStartOffset() + 18;	// set offset for serialization
  
             beginIp0040iPrsProdReassgnSw = getStartOffset() + 19;	// set offset for serialization
  
             beginIp0040iProdReassignmentSw = getStartOffset() + 20;	// set offset for serialization
  
             beginIp0040iOptInFlag = getStartOffset() + 21;	// set offset for serialization
  
             beginIp0040iLicensedProdId = getStartOffset() + 22;	// set offset for serialization
  
             beginIp0040iVirtFundPanInd = getStartOffset() + 25;	// set offset for serialization
  
             beginIp0040iAcctCatgPartSw = getStartOffset() + 26;	// set offset for serialization
  
             beginIp0040iAcctCatgActvnDate = getStartOffset() + 27;	// set offset for serialization
  
  
             beginIp0040iChipConversionSw = getStartOffset() + 65;	// set offset for serialization
  
  
             beginIp0040iCoBrandSw = getStartOffset() + 72;	// set offset for serialization
  
             beginIp0040iSpendControlRcnSw = getStartOffset() + 73;	// set offset for serialization
  
             beginIp0040iMerchCleanServPart = getStartOffset() + 74;	// set offset for serialization
  
             beginIp0040iMerchCleanActvDate = getStartOffset() + 77;	// set offset for serialization
  
             beginIp0040iPaypassEnabledInd = getStartOffset() + 83;	// set offset for serialization
  
             beginIp0040iRateTypeIndicator = getStartOffset() + 84;	// set offset for serialization
  
             beginIp0040iRoutePsnIndicator = getStartOffset() + 85;	// set offset for serialization
  
             beginIp0040iCbwpIndicator = getStartOffset() + 86;	// set offset for serialization
  
             beginIp0040iFlexParticipInd = getStartOffset() + 87;	// set offset for serialization
  
             beginIp0040iRepwrRldInd = getStartOffset() + 88;	// set offset for serialization
  
             beginIp0040iMoneySendInd = getStartOffset() + 89;	// set offset for serialization
  
             beginIp0040iRegulatedRateIndSw = getStartOffset() + 90;	// set offset for serialization
  
             beginIp0040iCashAccessSw = getStartOffset() + 91;	// set offset for serialization
  
             beginIp0040iPersonPresentInd = getStartOffset() + 92;	// set offset for serialization
  
             beginIp0040iCrossBdrException = getStartOffset() + 93;	// set offset for serialization
  
             beginIp0040iIssTargetMarketInd = getStartOffset() + 94;	// set offset for serialization
  
             beginIp0040iPostDateServSw = getStartOffset() + 95;	// set offset for serialization
  
             beginIp0040iMealVoucherInd = getStartOffset() + 96;	// set offset for serialization
  
             beginIp0040iNonRldblPrpdSw = getStartOffset() + 97;	// set offset for serialization
  
             beginIp0040iFasterFundsInd = getStartOffset() + 99;	// set offset for serialization
  
             beginIp0040iAnonPrepaidInd = getStartOffset() + 100;	// set offset for serialization
  
             beginIp0040iDccStatusInd = getStartOffset() + 101;	// set offset for serialization
  
             beginIp0040iPayByAcctInd = getStartOffset() + 102;	// set offset for serialization
  
             beginIp0040iIssGamParticipSw = getStartOffset() + 103;	// set offset for serialization
  
             beginIp0040iMemberFiller = getStartOffset() + 104;	// set offset for serialization
  
             beginIp0040iChbConvExclId = getStartOffset() + 116;	// set offset for serialization
  
             beginIp0040iChbConvExclExpire = getStartOffset() + 117;	// set offset for serialization
  
             beginIp0040iHardshipIndicator = getStartOffset() + 123;	// set offset for serialization
  
             beginIp0040iHardshipEffective = getStartOffset() + 124;	// set offset for serialization
  
             beginIp0040iHardshipExpiration = getStartOffset() + 130;	// set offset for serialization
  
             beginIp0040iGamingCountrySw = getStartOffset() + 136;	// set offset for serialization
  
             beginIp0040iCrossBorderInd = getStartOffset() + 137;	// set offset for serialization
  
             beginIp0040iRecPaymtCanSw = getStartOffset() + 138;	// set offset for serialization
  
             beginIp0040iDomDbtParticipSw = getStartOffset() + 139;	// set offset for serialization
  
  
             beginIp0040iIpcFraudCtlSw = getStartOffset() + 150;	// set offset for serialization
  
             beginIp0040iIccrParticipInd = getStartOffset() + 151;	// set offset for serialization
  
             beginIp0040iRevCreditInd = getStartOffset() + 152;	// set offset for serialization
  
             beginIp0040iChgbkBkoutInd = getStartOffset() + 153;	// set offset for serialization
  
             beginIp0040iRtnTrnstNum = getStartOffset() + 154;	// set offset for serialization
  
             beginIp0040iTrueIssuerIca = getStartOffset() + 164;	// set offset for serialization
  
             beginIp0040iMerchantTaxIdSw = getStartOffset() + 175;	// set offset for serialization
  
             beginIp0040iInstallServSw = getStartOffset() + 176;	// set offset for serialization
  
             beginIp0040iTokenServiceInd = getStartOffset() + 177;	// set offset for serialization
  
             beginIp0040iGbsBillInd = getStartOffset() + 178;	// set offset for serialization
  
             beginIp0040iInstallAuthSw = getStartOffset() + 179;	// set offset for serialization
  
             beginIp0040iSeqServiceInd = getStartOffset() + 180;	// set offset for serialization
  
             beginIp0040iCbfmParticipInd = getStartOffset() + 181;	// set offset for serialization
  
             beginIp0040iCbcmParticipInd = getStartOffset() + 182;	// set offset for serialization
  
             beginIp0040iCbfmDccSw = getStartOffset() + 183;	// set offset for serialization
  
             beginIp0040iInstApiGcmsSw = getStartOffset() + 184;	// set offset for serialization
  
             beginIp0040iInsEnabApiInd = getStartOffset() + 185;	// set offset for serialization
  
             beginIp0040iInstApiUiSw = getStartOffset() + 186;	// set offset for serialization
  
             beginIp0040iFiller = getStartOffset() + 187;	// set offset for serialization
  
             beginIp0040iOboServiceInd = getStartOffset() + 188;	// set offset for serialization
  
             beginIp0040iMultCurrSw = getStartOffset() + 189;	// set offset for serialization
  
             beginIp0040iAnonIndEffDate = getStartOffset() + 190;	// set offset for serialization
  
             beginIp0040iCbfmEcbRateParInd = getStartOffset() + 196;	// set offset for serialization
  
             beginIp0040iAlmXbOptOutInd = getStartOffset() + 197;	// set offset for serialization
  
             beginIp0040iJpnNonmdesTknrngSw = getStartOffset() + 198;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localIp0040iProductTypeCounter = -1;
     public boolean isIp0040iProductTypeModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp0040iProductTypeCounter != sharedCounter;
         localIp0040iProductTypeCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_0040I_PRODUCT_TYPE_LEN = 1;
	/**
	 * 	serialize this Ip0040iProductType
	 */
   protected void serializeIp0040iProductType(char[] ip0040iProductType) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip0040iProductType,0,getStringValue(),beginIp0040iProductType,IP_0040I_PRODUCT_TYPE_LEN);
       localIp0040iProductTypeCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp0040iProductTypeConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp0040iProductType is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp0040iProductType() {	 
   		return (substring(getStringValue(),beginIp0040iProductType,beginIp0040iProductType + IP_0040I_PRODUCT_TYPE_LEN));
   	}
     int localIp0040iEndpointCounter = -1;
     public boolean isIp0040iEndpointModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp0040iEndpointCounter != sharedCounter;
         localIp0040iEndpointCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ip0040iEndpoint
	 *	@return ip0040iEndpoint
	 */
	public char[]  getIp0040iEndpointString() {
	     return getCharArray(beginIp0040iEndpoint,IP_0040I_ENDPOINT_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip0040iEndpointIsNumeric() {
	    return isNumeric(beginIp0040iEndpoint
	                    ,beginIp0040iEndpoint + IP_0040I_ENDPOINT_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int IP_0040I_ENDPOINT_LEN = 7;
  	/**
	 * serializeIp0040iEndpoint
	 */
	protected void serializeIp0040iEndpoint(long ip0040iEndpoint) {
		 putNumber(beginIp0040iEndpoint,ip0040iEndpoint,IP_0040I_ENDPOINT_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localIp0040iEndpointCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeIp0040iEndpoint
	 */
   	protected  long serializeIp0040iEndpoint(char[] value) {
	    long  ip0040iEndpoint;
	    if(value.length >0 && value.length!= 7)
            value = new String(value).trim().toCharArray();
	    if (value.length < 7) value = pad(7, value, ' ', LEFT_PAD);
	    else if (value.length > 7) value = substring(value,0,7);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ip0040iEndpoint = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(7,value,false/*isSigned?*/)
		       ,beginIp0040iEndpoint
		       ,7
		      );
		 localIp0040iEndpointCounter = shareString.getSerializedField().getModifiedCounter();
		return  ip0040iEndpoint;
    }

   protected long checkIp0040iEndpointMaxLimit(long number) {

        return checkMaxLimit(number , MAX_10M/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshIp0040iEndpoint is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshIp0040iEndpoint() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginIp0040iEndpoint
			                 ,IP_0040I_ENDPOINT_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ip0040iEndpoint", beginIp0040iEndpoint,IP_0040I_ENDPOINT_LEN);
    }
   	}
     int localIp0040iCountryCounter = -1;
     public boolean isIp0040iCountryModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp0040iCountryCounter != sharedCounter;
         localIp0040iCountryCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_0040I_COUNTRY_LEN = 3;
	/**
	 * 	serialize this Ip0040iCountry
	 */
   protected void serializeIp0040iCountry(char[] ip0040iCountry) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip0040iCountry,0,getStringValue(),beginIp0040iCountry,IP_0040I_COUNTRY_LEN);
       localIp0040iCountryCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp0040iCountryConstraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshIp0040iCountry is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp0040iCountry() {	 
   		return (substring(getStringValue(),beginIp0040iCountry,beginIp0040iCountry + IP_0040I_COUNTRY_LEN));
   	}
     int localIp0040iCountryNumCounter = -1;
     public boolean isIp0040iCountryNumModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp0040iCountryNumCounter != sharedCounter;
         localIp0040iCountryNumCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ip0040iCountryNum
	 *	@return ip0040iCountryNum
	 */
	public char[]  getIp0040iCountryNumString() {
	     return getCharArray(beginIp0040iCountryNum,IP_0040I_COUNTRY_NUM_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip0040iCountryNumIsNumeric() {
	    return isNumeric(beginIp0040iCountryNum
	                    ,beginIp0040iCountryNum + IP_0040I_COUNTRY_NUM_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int IP_0040I_COUNTRY_NUM_LEN = 3;
  	/**
	 * serializeIp0040iCountryNum
	 */
	protected void serializeIp0040iCountryNum(int ip0040iCountryNum) {
		 putNumber(beginIp0040iCountryNum,ip0040iCountryNum,IP_0040I_COUNTRY_NUM_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localIp0040iCountryNumCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeIp0040iCountryNum
	 */
   	protected  int serializeIp0040iCountryNum(char[] value) {
	    int  ip0040iCountryNum;
	    if(value.length >0 && value.length!= 3)
            value = new String(value).trim().toCharArray();
	    if (value.length < 3) value = pad(3, value, ' ', LEFT_PAD);
	    else if (value.length > 3) value = substring(value,0,3);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ip0040iCountryNum = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(3,value,false/*isSigned?*/)
		       ,beginIp0040iCountryNum
		       ,3
		      );
		 localIp0040iCountryNumCounter = shareString.getSerializedField().getModifiedCounter();
		return  ip0040iCountryNum;
    }

   protected int checkIp0040iCountryNumMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_1000/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshIp0040iCountryNum is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshIp0040iCountryNum() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginIp0040iCountryNum
			                 ,IP_0040I_COUNTRY_NUM_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ip0040iCountryNum", beginIp0040iCountryNum,IP_0040I_COUNTRY_NUM_LEN);
    }
   	}
     int localIp0040iProductClassCounter = -1;
     public boolean isIp0040iProductClassModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp0040iProductClassCounter != sharedCounter;
         localIp0040iProductClassCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_0040I_PRODUCT_CLASS_LEN = 3;
	/**
	 * 	serialize this Ip0040iProductClass
	 */
   protected void serializeIp0040iProductClass(char[] ip0040iProductClass) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip0040iProductClass,0,getStringValue(),beginIp0040iProductClass,IP_0040I_PRODUCT_CLASS_LEN);
       localIp0040iProductClassCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp0040iProductClassConstraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshIp0040iProductClass is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp0040iProductClass() {	 
   		return (substring(getStringValue(),beginIp0040iProductClass,beginIp0040iProductClass + IP_0040I_PRODUCT_CLASS_LEN));
   	}
     int localIp0040iTranRoutingIndCounter = -1;
     public boolean isIp0040iTranRoutingIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp0040iTranRoutingIndCounter != sharedCounter;
         localIp0040iTranRoutingIndCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_0040I_TRAN_ROUTING_IND_LEN = 1;
	/**
	 * 	serialize this Ip0040iTranRoutingInd
	 */
   protected void serializeIp0040iTranRoutingInd(char[] ip0040iTranRoutingInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip0040iTranRoutingInd,0,getStringValue(),beginIp0040iTranRoutingInd,IP_0040I_TRAN_ROUTING_IND_LEN);
       localIp0040iTranRoutingIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp0040iTranRoutingIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp0040iTranRoutingInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp0040iTranRoutingInd() {	 
   		return (substring(getStringValue(),beginIp0040iTranRoutingInd,beginIp0040iTranRoutingInd + IP_0040I_TRAN_ROUTING_IND_LEN));
   	}
     int localIp0040iPrsProdReassgnSwCounter = -1;
     public boolean isIp0040iPrsProdReassgnSwModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp0040iPrsProdReassgnSwCounter != sharedCounter;
         localIp0040iPrsProdReassgnSwCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_0040I_PRS_PROD_REASSGN_SW_LEN = 1;
	/**
	 * 	serialize this Ip0040iPrsProdReassgnSw
	 */
   protected void serializeIp0040iPrsProdReassgnSw(char[] ip0040iPrsProdReassgnSw) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip0040iPrsProdReassgnSw,0,getStringValue(),beginIp0040iPrsProdReassgnSw,IP_0040I_PRS_PROD_REASSGN_SW_LEN);
       localIp0040iPrsProdReassgnSwCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp0040iPrsProdReassgnSwConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp0040iPrsProdReassgnSw is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp0040iPrsProdReassgnSw() {	 
   		return (substring(getStringValue(),beginIp0040iPrsProdReassgnSw,beginIp0040iPrsProdReassgnSw + IP_0040I_PRS_PROD_REASSGN_SW_LEN));
   	}
     int localIp0040iProdReassignmentSwCounter = -1;
     public boolean isIp0040iProdReassignmentSwModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp0040iProdReassignmentSwCounter != sharedCounter;
         localIp0040iProdReassignmentSwCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_0040I_PROD_REASSIGNMENT_SW_LEN = 1;
	/**
	 * 	serialize this Ip0040iProdReassignmentSw
	 */
   protected void serializeIp0040iProdReassignmentSw(char[] ip0040iProdReassignmentSw) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip0040iProdReassignmentSw,0,getStringValue(),beginIp0040iProdReassignmentSw,IP_0040I_PROD_REASSIGNMENT_SW_LEN);
       localIp0040iProdReassignmentSwCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp0040iProdReassignmentSwConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp0040iProdReassignmentSw is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp0040iProdReassignmentSw() {	 
   		return (substring(getStringValue(),beginIp0040iProdReassignmentSw,beginIp0040iProdReassignmentSw + IP_0040I_PROD_REASSIGNMENT_SW_LEN));
   	}
     int localIp0040iOptInFlagCounter = -1;
     public boolean isIp0040iOptInFlagModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp0040iOptInFlagCounter != sharedCounter;
         localIp0040iOptInFlagCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_0040I_OPT_IN_FLAG_LEN = 1;
	/**
	 * 	serialize this Ip0040iOptInFlag
	 */
   protected void serializeIp0040iOptInFlag(char[] ip0040iOptInFlag) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip0040iOptInFlag,0,getStringValue(),beginIp0040iOptInFlag,IP_0040I_OPT_IN_FLAG_LEN);
       localIp0040iOptInFlagCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp0040iOptInFlagConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp0040iOptInFlag is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp0040iOptInFlag() {	 
   		return (substring(getStringValue(),beginIp0040iOptInFlag,beginIp0040iOptInFlag + IP_0040I_OPT_IN_FLAG_LEN));
   	}
     int localIp0040iLicensedProdIdCounter = -1;
     public boolean isIp0040iLicensedProdIdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp0040iLicensedProdIdCounter != sharedCounter;
         localIp0040iLicensedProdIdCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_0040I_LICENSED_PROD_ID_LEN = 3;
	/**
	 * 	serialize this Ip0040iLicensedProdId
	 */
   protected void serializeIp0040iLicensedProdId(char[] ip0040iLicensedProdId) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip0040iLicensedProdId,0,getStringValue(),beginIp0040iLicensedProdId,IP_0040I_LICENSED_PROD_ID_LEN);
       localIp0040iLicensedProdIdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp0040iLicensedProdIdConstraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshIp0040iLicensedProdId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp0040iLicensedProdId() {	 
   		return (substring(getStringValue(),beginIp0040iLicensedProdId,beginIp0040iLicensedProdId + IP_0040I_LICENSED_PROD_ID_LEN));
   	}
     int localIp0040iVirtFundPanIndCounter = -1;
     public boolean isIp0040iVirtFundPanIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp0040iVirtFundPanIndCounter != sharedCounter;
         localIp0040iVirtFundPanIndCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_0040I_VIRT_FUND_PAN_IND_LEN = 1;
	/**
	 * 	serialize this Ip0040iVirtFundPanInd
	 */
   protected void serializeIp0040iVirtFundPanInd(char[] ip0040iVirtFundPanInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip0040iVirtFundPanInd,0,getStringValue(),beginIp0040iVirtFundPanInd,IP_0040I_VIRT_FUND_PAN_IND_LEN);
       localIp0040iVirtFundPanIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp0040iVirtFundPanIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp0040iVirtFundPanInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp0040iVirtFundPanInd() {	 
   		return (substring(getStringValue(),beginIp0040iVirtFundPanInd,beginIp0040iVirtFundPanInd + IP_0040I_VIRT_FUND_PAN_IND_LEN));
   	}
     int localIp0040iAcctCatgPartSwCounter = -1;
     public boolean isIp0040iAcctCatgPartSwModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp0040iAcctCatgPartSwCounter != sharedCounter;
         localIp0040iAcctCatgPartSwCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_0040I_ACCT_CATG_PART_SW_LEN = 1;
	/**
	 * 	serialize this Ip0040iAcctCatgPartSw
	 */
   protected void serializeIp0040iAcctCatgPartSw(char[] ip0040iAcctCatgPartSw) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip0040iAcctCatgPartSw,0,getStringValue(),beginIp0040iAcctCatgPartSw,IP_0040I_ACCT_CATG_PART_SW_LEN);
       localIp0040iAcctCatgPartSwCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp0040iAcctCatgPartSwConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp0040iAcctCatgPartSw is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp0040iAcctCatgPartSw() {	 
   		return (substring(getStringValue(),beginIp0040iAcctCatgPartSw,beginIp0040iAcctCatgPartSw + IP_0040I_ACCT_CATG_PART_SW_LEN));
   	}
     int localIp0040iAcctCatgActvnDateCounter = -1;
     public boolean isIp0040iAcctCatgActvnDateModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp0040iAcctCatgActvnDateCounter != sharedCounter;
         localIp0040iAcctCatgActvnDateCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ip0040iAcctCatgActvnDate
	 *	@return ip0040iAcctCatgActvnDate
	 */
	public char[]  getIp0040iAcctCatgActvnDateString() {
	     return getCharArray(beginIp0040iAcctCatgActvnDate,IP_0040I_ACCT_CATG_ACTVN_DATE_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip0040iAcctCatgActvnDateIsNumeric() {
	    return isNumeric(beginIp0040iAcctCatgActvnDate
	                    ,beginIp0040iAcctCatgActvnDate + IP_0040I_ACCT_CATG_ACTVN_DATE_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int IP_0040I_ACCT_CATG_ACTVN_DATE_LEN = 6;
  	/**
	 * serializeIp0040iAcctCatgActvnDate
	 */
	protected void serializeIp0040iAcctCatgActvnDate(long ip0040iAcctCatgActvnDate) {
		 putNumber(beginIp0040iAcctCatgActvnDate,ip0040iAcctCatgActvnDate,IP_0040I_ACCT_CATG_ACTVN_DATE_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localIp0040iAcctCatgActvnDateCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeIp0040iAcctCatgActvnDate
	 */
   	protected  long serializeIp0040iAcctCatgActvnDate(char[] value) {
	    long  ip0040iAcctCatgActvnDate;
	    if(value.length >0 && value.length!= 6)
            value = new String(value).trim().toCharArray();
	    if (value.length < 6) value = pad(6, value, ' ', LEFT_PAD);
	    else if (value.length > 6) value = substring(value,0,6);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ip0040iAcctCatgActvnDate = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(6,value,false/*isSigned?*/)
		       ,beginIp0040iAcctCatgActvnDate
		       ,6
		      );
		 localIp0040iAcctCatgActvnDateCounter = shareString.getSerializedField().getModifiedCounter();
		return  ip0040iAcctCatgActvnDate;
    }

   protected long checkIp0040iAcctCatgActvnDateMaxLimit(long number) {

        return checkMaxLimit(number , MAX_1M/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshIp0040iAcctCatgActvnDate is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshIp0040iAcctCatgActvnDate() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginIp0040iAcctCatgActvnDate
			                 ,IP_0040I_ACCT_CATG_ACTVN_DATE_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ip0040iAcctCatgActvnDate", beginIp0040iAcctCatgActvnDate,IP_0040I_ACCT_CATG_ACTVN_DATE_LEN);
    }
   	}
     int localIp0040iChipConversionSwCounter = -1;
     public boolean isIp0040iChipConversionSwModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp0040iChipConversionSwCounter != sharedCounter;
         localIp0040iChipConversionSwCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_0040I_CHIP_CONVERSION_SW_LEN = 1;
	/**
	 * 	serialize this Ip0040iChipConversionSw
	 */
   protected void serializeIp0040iChipConversionSw(char[] ip0040iChipConversionSw) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip0040iChipConversionSw,0,getStringValue(),beginIp0040iChipConversionSw,IP_0040I_CHIP_CONVERSION_SW_LEN);
       localIp0040iChipConversionSwCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp0040iChipConversionSwConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp0040iChipConversionSw is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp0040iChipConversionSw() {	 
   		return (substring(getStringValue(),beginIp0040iChipConversionSw,beginIp0040iChipConversionSw + IP_0040I_CHIP_CONVERSION_SW_LEN));
   	}
     int localIp0040iCoBrandSwCounter = -1;
     public boolean isIp0040iCoBrandSwModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp0040iCoBrandSwCounter != sharedCounter;
         localIp0040iCoBrandSwCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_0040I_CO_BRAND_SW_LEN = 1;
	/**
	 * 	serialize this Ip0040iCoBrandSw
	 */
   protected void serializeIp0040iCoBrandSw(char[] ip0040iCoBrandSw) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip0040iCoBrandSw,0,getStringValue(),beginIp0040iCoBrandSw,IP_0040I_CO_BRAND_SW_LEN);
       localIp0040iCoBrandSwCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp0040iCoBrandSwConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp0040iCoBrandSw is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp0040iCoBrandSw() {	 
   		return (substring(getStringValue(),beginIp0040iCoBrandSw,beginIp0040iCoBrandSw + IP_0040I_CO_BRAND_SW_LEN));
   	}
     int localIp0040iSpendControlRcnSwCounter = -1;
     public boolean isIp0040iSpendControlRcnSwModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp0040iSpendControlRcnSwCounter != sharedCounter;
         localIp0040iSpendControlRcnSwCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_0040I_SPEND_CONTROL_RCN_SW_LEN = 1;
	/**
	 * 	serialize this Ip0040iSpendControlRcnSw
	 */
   protected void serializeIp0040iSpendControlRcnSw(char[] ip0040iSpendControlRcnSw) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip0040iSpendControlRcnSw,0,getStringValue(),beginIp0040iSpendControlRcnSw,IP_0040I_SPEND_CONTROL_RCN_SW_LEN);
       localIp0040iSpendControlRcnSwCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp0040iSpendControlRcnSwConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp0040iSpendControlRcnSw is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp0040iSpendControlRcnSw() {	 
   		return (substring(getStringValue(),beginIp0040iSpendControlRcnSw,beginIp0040iSpendControlRcnSw + IP_0040I_SPEND_CONTROL_RCN_SW_LEN));
   	}
     int localIp0040iMerchCleanServPartCounter = -1;
     public boolean isIp0040iMerchCleanServPartModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp0040iMerchCleanServPartCounter != sharedCounter;
         localIp0040iMerchCleanServPartCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_0040I_MERCH_CLEAN_SERV_PART_LEN = 3;
	/**
	 * 	serialize this Ip0040iMerchCleanServPart
	 */
   protected void serializeIp0040iMerchCleanServPart(char[] ip0040iMerchCleanServPart) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip0040iMerchCleanServPart,0,getStringValue(),beginIp0040iMerchCleanServPart,IP_0040I_MERCH_CLEAN_SERV_PART_LEN);
       localIp0040iMerchCleanServPartCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp0040iMerchCleanServPartConstraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshIp0040iMerchCleanServPart is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp0040iMerchCleanServPart() {	 
   		return (substring(getStringValue(),beginIp0040iMerchCleanServPart,beginIp0040iMerchCleanServPart + IP_0040I_MERCH_CLEAN_SERV_PART_LEN));
   	}
     int localIp0040iMerchCleanActvDateCounter = -1;
     public boolean isIp0040iMerchCleanActvDateModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp0040iMerchCleanActvDateCounter != sharedCounter;
         localIp0040iMerchCleanActvDateCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ip0040iMerchCleanActvDate
	 *	@return ip0040iMerchCleanActvDate
	 */
	public char[]  getIp0040iMerchCleanActvDateString() {
	     return getCharArray(beginIp0040iMerchCleanActvDate,IP_0040I_MERCH_CLEAN_ACTV_DATE_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip0040iMerchCleanActvDateIsNumeric() {
	    return isNumeric(beginIp0040iMerchCleanActvDate
	                    ,beginIp0040iMerchCleanActvDate + IP_0040I_MERCH_CLEAN_ACTV_DATE_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int IP_0040I_MERCH_CLEAN_ACTV_DATE_LEN = 6;
  	/**
	 * serializeIp0040iMerchCleanActvDate
	 */
	protected void serializeIp0040iMerchCleanActvDate(long ip0040iMerchCleanActvDate) {
		 putNumber(beginIp0040iMerchCleanActvDate,ip0040iMerchCleanActvDate,IP_0040I_MERCH_CLEAN_ACTV_DATE_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localIp0040iMerchCleanActvDateCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeIp0040iMerchCleanActvDate
	 */
   	protected  long serializeIp0040iMerchCleanActvDate(char[] value) {
	    long  ip0040iMerchCleanActvDate;
	    if(value.length >0 && value.length!= 6)
            value = new String(value).trim().toCharArray();
	    if (value.length < 6) value = pad(6, value, ' ', LEFT_PAD);
	    else if (value.length > 6) value = substring(value,0,6);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ip0040iMerchCleanActvDate = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(6,value,false/*isSigned?*/)
		       ,beginIp0040iMerchCleanActvDate
		       ,6
		      );
		 localIp0040iMerchCleanActvDateCounter = shareString.getSerializedField().getModifiedCounter();
		return  ip0040iMerchCleanActvDate;
    }

   protected long checkIp0040iMerchCleanActvDateMaxLimit(long number) {

        return checkMaxLimit(number , MAX_1M/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshIp0040iMerchCleanActvDate is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshIp0040iMerchCleanActvDate() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginIp0040iMerchCleanActvDate
			                 ,IP_0040I_MERCH_CLEAN_ACTV_DATE_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ip0040iMerchCleanActvDate", beginIp0040iMerchCleanActvDate,IP_0040I_MERCH_CLEAN_ACTV_DATE_LEN);
    }
   	}
     int localIp0040iPaypassEnabledIndCounter = -1;
     public boolean isIp0040iPaypassEnabledIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp0040iPaypassEnabledIndCounter != sharedCounter;
         localIp0040iPaypassEnabledIndCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_0040I_PAYPASS_ENABLED_IND_LEN = 1;
	/**
	 * 	serialize this Ip0040iPaypassEnabledInd
	 */
   protected void serializeIp0040iPaypassEnabledInd(char[] ip0040iPaypassEnabledInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip0040iPaypassEnabledInd,0,getStringValue(),beginIp0040iPaypassEnabledInd,IP_0040I_PAYPASS_ENABLED_IND_LEN);
       localIp0040iPaypassEnabledIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp0040iPaypassEnabledIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp0040iPaypassEnabledInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp0040iPaypassEnabledInd() {	 
   		return (substring(getStringValue(),beginIp0040iPaypassEnabledInd,beginIp0040iPaypassEnabledInd + IP_0040I_PAYPASS_ENABLED_IND_LEN));
   	}
     int localIp0040iRateTypeIndicatorCounter = -1;
     public boolean isIp0040iRateTypeIndicatorModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp0040iRateTypeIndicatorCounter != sharedCounter;
         localIp0040iRateTypeIndicatorCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_0040I_RATE_TYPE_INDICATOR_LEN = 1;
	/**
	 * 	serialize this Ip0040iRateTypeIndicator
	 */
   protected void serializeIp0040iRateTypeIndicator(char[] ip0040iRateTypeIndicator) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip0040iRateTypeIndicator,0,getStringValue(),beginIp0040iRateTypeIndicator,IP_0040I_RATE_TYPE_INDICATOR_LEN);
       localIp0040iRateTypeIndicatorCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp0040iRateTypeIndicatorConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp0040iRateTypeIndicator is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp0040iRateTypeIndicator() {	 
   		return (substring(getStringValue(),beginIp0040iRateTypeIndicator,beginIp0040iRateTypeIndicator + IP_0040I_RATE_TYPE_INDICATOR_LEN));
   	}
     int localIp0040iRoutePsnIndicatorCounter = -1;
     public boolean isIp0040iRoutePsnIndicatorModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp0040iRoutePsnIndicatorCounter != sharedCounter;
         localIp0040iRoutePsnIndicatorCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_0040I_ROUTE_PSN_INDICATOR_LEN = 1;
	/**
	 * 	serialize this Ip0040iRoutePsnIndicator
	 */
   protected void serializeIp0040iRoutePsnIndicator(char[] ip0040iRoutePsnIndicator) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip0040iRoutePsnIndicator,0,getStringValue(),beginIp0040iRoutePsnIndicator,IP_0040I_ROUTE_PSN_INDICATOR_LEN);
       localIp0040iRoutePsnIndicatorCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp0040iRoutePsnIndicatorConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp0040iRoutePsnIndicator is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp0040iRoutePsnIndicator() {	 
   		return (substring(getStringValue(),beginIp0040iRoutePsnIndicator,beginIp0040iRoutePsnIndicator + IP_0040I_ROUTE_PSN_INDICATOR_LEN));
   	}
     int localIp0040iCbwpIndicatorCounter = -1;
     public boolean isIp0040iCbwpIndicatorModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp0040iCbwpIndicatorCounter != sharedCounter;
         localIp0040iCbwpIndicatorCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_0040I_CBWP_INDICATOR_LEN = 1;
	/**
	 * 	serialize this Ip0040iCbwpIndicator
	 */
   protected void serializeIp0040iCbwpIndicator(char[] ip0040iCbwpIndicator) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip0040iCbwpIndicator,0,getStringValue(),beginIp0040iCbwpIndicator,IP_0040I_CBWP_INDICATOR_LEN);
       localIp0040iCbwpIndicatorCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp0040iCbwpIndicatorConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp0040iCbwpIndicator is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp0040iCbwpIndicator() {	 
   		return (substring(getStringValue(),beginIp0040iCbwpIndicator,beginIp0040iCbwpIndicator + IP_0040I_CBWP_INDICATOR_LEN));
   	}
     int localIp0040iFlexParticipIndCounter = -1;
     public boolean isIp0040iFlexParticipIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp0040iFlexParticipIndCounter != sharedCounter;
         localIp0040iFlexParticipIndCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_0040I_FLEX_PARTICIP_IND_LEN = 1;
	/**
	 * 	serialize this Ip0040iFlexParticipInd
	 */
   protected void serializeIp0040iFlexParticipInd(char[] ip0040iFlexParticipInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip0040iFlexParticipInd,0,getStringValue(),beginIp0040iFlexParticipInd,IP_0040I_FLEX_PARTICIP_IND_LEN);
       localIp0040iFlexParticipIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp0040iFlexParticipIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp0040iFlexParticipInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp0040iFlexParticipInd() {	 
   		return (substring(getStringValue(),beginIp0040iFlexParticipInd,beginIp0040iFlexParticipInd + IP_0040I_FLEX_PARTICIP_IND_LEN));
   	}
     int localIp0040iRepwrRldIndCounter = -1;
     public boolean isIp0040iRepwrRldIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp0040iRepwrRldIndCounter != sharedCounter;
         localIp0040iRepwrRldIndCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_0040I_REPWR_RLD_IND_LEN = 1;
	/**
	 * 	serialize this Ip0040iRepwrRldInd
	 */
   protected void serializeIp0040iRepwrRldInd(char[] ip0040iRepwrRldInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip0040iRepwrRldInd,0,getStringValue(),beginIp0040iRepwrRldInd,IP_0040I_REPWR_RLD_IND_LEN);
       localIp0040iRepwrRldIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp0040iRepwrRldIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp0040iRepwrRldInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp0040iRepwrRldInd() {	 
   		return (substring(getStringValue(),beginIp0040iRepwrRldInd,beginIp0040iRepwrRldInd + IP_0040I_REPWR_RLD_IND_LEN));
   	}
     int localIp0040iMoneySendIndCounter = -1;
     public boolean isIp0040iMoneySendIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp0040iMoneySendIndCounter != sharedCounter;
         localIp0040iMoneySendIndCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_0040I_MONEY_SEND_IND_LEN = 1;
	/**
	 * 	serialize this Ip0040iMoneySendInd
	 */
   protected void serializeIp0040iMoneySendInd(char[] ip0040iMoneySendInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip0040iMoneySendInd,0,getStringValue(),beginIp0040iMoneySendInd,IP_0040I_MONEY_SEND_IND_LEN);
       localIp0040iMoneySendIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp0040iMoneySendIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp0040iMoneySendInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp0040iMoneySendInd() {	 
   		return (substring(getStringValue(),beginIp0040iMoneySendInd,beginIp0040iMoneySendInd + IP_0040I_MONEY_SEND_IND_LEN));
   	}
     int localIp0040iRegulatedRateIndSwCounter = -1;
     public boolean isIp0040iRegulatedRateIndSwModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp0040iRegulatedRateIndSwCounter != sharedCounter;
         localIp0040iRegulatedRateIndSwCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_0040I_REGULATED_RATE_IND_SW_LEN = 1;
	/**
	 * 	serialize this Ip0040iRegulatedRateIndSw
	 */
   protected void serializeIp0040iRegulatedRateIndSw(char[] ip0040iRegulatedRateIndSw) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip0040iRegulatedRateIndSw,0,getStringValue(),beginIp0040iRegulatedRateIndSw,IP_0040I_REGULATED_RATE_IND_SW_LEN);
       localIp0040iRegulatedRateIndSwCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp0040iRegulatedRateIndSwConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp0040iRegulatedRateIndSw is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp0040iRegulatedRateIndSw() {	 
   		return (substring(getStringValue(),beginIp0040iRegulatedRateIndSw,beginIp0040iRegulatedRateIndSw + IP_0040I_REGULATED_RATE_IND_SW_LEN));
   	}
     int localIp0040iCashAccessSwCounter = -1;
     public boolean isIp0040iCashAccessSwModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp0040iCashAccessSwCounter != sharedCounter;
         localIp0040iCashAccessSwCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_0040I_CASH_ACCESS_SW_LEN = 1;
	/**
	 * 	serialize this Ip0040iCashAccessSw
	 */
   protected void serializeIp0040iCashAccessSw(char[] ip0040iCashAccessSw) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip0040iCashAccessSw,0,getStringValue(),beginIp0040iCashAccessSw,IP_0040I_CASH_ACCESS_SW_LEN);
       localIp0040iCashAccessSwCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp0040iCashAccessSwConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp0040iCashAccessSw is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp0040iCashAccessSw() {	 
   		return (substring(getStringValue(),beginIp0040iCashAccessSw,beginIp0040iCashAccessSw + IP_0040I_CASH_ACCESS_SW_LEN));
   	}
     int localIp0040iPersonPresentIndCounter = -1;
     public boolean isIp0040iPersonPresentIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp0040iPersonPresentIndCounter != sharedCounter;
         localIp0040iPersonPresentIndCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ip0040iPersonPresentInd
	 *	@return ip0040iPersonPresentInd
	 */
	public char[]  getIp0040iPersonPresentIndString() {
	     return getCharArray(beginIp0040iPersonPresentInd,IP_0040I_PERSON_PRESENT_IND_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip0040iPersonPresentIndIsNumeric() {
	    return isNumeric(beginIp0040iPersonPresentInd
	                    ,beginIp0040iPersonPresentInd + IP_0040I_PERSON_PRESENT_IND_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int IP_0040I_PERSON_PRESENT_IND_LEN = 1;
  	/**
	 * serializeIp0040iPersonPresentInd
	 */
	protected void serializeIp0040iPersonPresentInd(int ip0040iPersonPresentInd) {
		 putNumber(beginIp0040iPersonPresentInd,ip0040iPersonPresentInd,IP_0040I_PERSON_PRESENT_IND_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localIp0040iPersonPresentIndCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeIp0040iPersonPresentInd
	 */
   	protected  int serializeIp0040iPersonPresentInd(char[] value) {
	    int  ip0040iPersonPresentInd;
	    if(value.length >0 && value.length!= 1)
            value = new String(value).trim().toCharArray();
	    if (value.length < 1) value = pad(1, value, ' ', LEFT_PAD);
	    else if (value.length > 1) value = substring(value,0,1);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ip0040iPersonPresentInd = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(1,value,false/*isSigned?*/)
		       ,beginIp0040iPersonPresentInd
		       ,1
		      );
		 localIp0040iPersonPresentIndCounter = shareString.getSerializedField().getModifiedCounter();
		return  ip0040iPersonPresentInd;
    }

   protected int checkIp0040iPersonPresentIndMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshIp0040iPersonPresentInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshIp0040iPersonPresentInd() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginIp0040iPersonPresentInd
			                 ,IP_0040I_PERSON_PRESENT_IND_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ip0040iPersonPresentInd", beginIp0040iPersonPresentInd,IP_0040I_PERSON_PRESENT_IND_LEN);
    }
   	}
     int localIp0040iCrossBdrExceptionCounter = -1;
     public boolean isIp0040iCrossBdrExceptionModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp0040iCrossBdrExceptionCounter != sharedCounter;
         localIp0040iCrossBdrExceptionCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_0040I_CROSS_BDR_EXCEPTION_LEN = 1;
	/**
	 * 	serialize this Ip0040iCrossBdrException
	 */
   protected void serializeIp0040iCrossBdrException(char[] ip0040iCrossBdrException) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip0040iCrossBdrException,0,getStringValue(),beginIp0040iCrossBdrException,IP_0040I_CROSS_BDR_EXCEPTION_LEN);
       localIp0040iCrossBdrExceptionCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp0040iCrossBdrExceptionConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp0040iCrossBdrException is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp0040iCrossBdrException() {	 
   		return (substring(getStringValue(),beginIp0040iCrossBdrException,beginIp0040iCrossBdrException + IP_0040I_CROSS_BDR_EXCEPTION_LEN));
   	}
     int localIp0040iIssTargetMarketIndCounter = -1;
     public boolean isIp0040iIssTargetMarketIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp0040iIssTargetMarketIndCounter != sharedCounter;
         localIp0040iIssTargetMarketIndCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_0040I_ISS_TARGET_MARKET_IND_LEN = 1;
	/**
	 * 	serialize this Ip0040iIssTargetMarketInd
	 */
   protected void serializeIp0040iIssTargetMarketInd(char[] ip0040iIssTargetMarketInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip0040iIssTargetMarketInd,0,getStringValue(),beginIp0040iIssTargetMarketInd,IP_0040I_ISS_TARGET_MARKET_IND_LEN);
       localIp0040iIssTargetMarketIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp0040iIssTargetMarketIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp0040iIssTargetMarketInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp0040iIssTargetMarketInd() {	 
   		return (substring(getStringValue(),beginIp0040iIssTargetMarketInd,beginIp0040iIssTargetMarketInd + IP_0040I_ISS_TARGET_MARKET_IND_LEN));
   	}
     int localIp0040iPostDateServSwCounter = -1;
     public boolean isIp0040iPostDateServSwModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp0040iPostDateServSwCounter != sharedCounter;
         localIp0040iPostDateServSwCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_0040I_POST_DATE_SERV_SW_LEN = 1;
	/**
	 * 	serialize this Ip0040iPostDateServSw
	 */
   protected void serializeIp0040iPostDateServSw(char[] ip0040iPostDateServSw) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip0040iPostDateServSw,0,getStringValue(),beginIp0040iPostDateServSw,IP_0040I_POST_DATE_SERV_SW_LEN);
       localIp0040iPostDateServSwCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp0040iPostDateServSwConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp0040iPostDateServSw is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp0040iPostDateServSw() {	 
   		return (substring(getStringValue(),beginIp0040iPostDateServSw,beginIp0040iPostDateServSw + IP_0040I_POST_DATE_SERV_SW_LEN));
   	}
     int localIp0040iMealVoucherIndCounter = -1;
     public boolean isIp0040iMealVoucherIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp0040iMealVoucherIndCounter != sharedCounter;
         localIp0040iMealVoucherIndCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_0040I_MEAL_VOUCHER_IND_LEN = 1;
	/**
	 * 	serialize this Ip0040iMealVoucherInd
	 */
   protected void serializeIp0040iMealVoucherInd(char[] ip0040iMealVoucherInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip0040iMealVoucherInd,0,getStringValue(),beginIp0040iMealVoucherInd,IP_0040I_MEAL_VOUCHER_IND_LEN);
       localIp0040iMealVoucherIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp0040iMealVoucherIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp0040iMealVoucherInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp0040iMealVoucherInd() {	 
   		return (substring(getStringValue(),beginIp0040iMealVoucherInd,beginIp0040iMealVoucherInd + IP_0040I_MEAL_VOUCHER_IND_LEN));
   	}
     int localIp0040iNonRldblPrpdSwCounter = -1;
     public boolean isIp0040iNonRldblPrpdSwModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp0040iNonRldblPrpdSwCounter != sharedCounter;
         localIp0040iNonRldblPrpdSwCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_0040I_NON_RLDBL_PRPD_SW_LEN = 2;
	/**
	 * 	serialize this Ip0040iNonRldblPrpdSw
	 */
   protected void serializeIp0040iNonRldblPrpdSw(char[] ip0040iNonRldblPrpdSw) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip0040iNonRldblPrpdSw,0,getStringValue(),beginIp0040iNonRldblPrpdSw,IP_0040I_NON_RLDBL_PRPD_SW_LEN);
       localIp0040iNonRldblPrpdSwCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp0040iNonRldblPrpdSwConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshIp0040iNonRldblPrpdSw is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp0040iNonRldblPrpdSw() {	 
   		return (substring(getStringValue(),beginIp0040iNonRldblPrpdSw,beginIp0040iNonRldblPrpdSw + IP_0040I_NON_RLDBL_PRPD_SW_LEN));
   	}
     int localIp0040iFasterFundsIndCounter = -1;
     public boolean isIp0040iFasterFundsIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp0040iFasterFundsIndCounter != sharedCounter;
         localIp0040iFasterFundsIndCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_0040I_FASTER_FUNDS_IND_LEN = 1;
	/**
	 * 	serialize this Ip0040iFasterFundsInd
	 */
   protected void serializeIp0040iFasterFundsInd(char[] ip0040iFasterFundsInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip0040iFasterFundsInd,0,getStringValue(),beginIp0040iFasterFundsInd,IP_0040I_FASTER_FUNDS_IND_LEN);
       localIp0040iFasterFundsIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp0040iFasterFundsIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp0040iFasterFundsInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp0040iFasterFundsInd() {	 
   		return (substring(getStringValue(),beginIp0040iFasterFundsInd,beginIp0040iFasterFundsInd + IP_0040I_FASTER_FUNDS_IND_LEN));
   	}
     int localIp0040iAnonPrepaidIndCounter = -1;
     public boolean isIp0040iAnonPrepaidIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp0040iAnonPrepaidIndCounter != sharedCounter;
         localIp0040iAnonPrepaidIndCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_0040I_ANON_PREPAID_IND_LEN = 1;
	/**
	 * 	serialize this Ip0040iAnonPrepaidInd
	 */
   protected void serializeIp0040iAnonPrepaidInd(char[] ip0040iAnonPrepaidInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip0040iAnonPrepaidInd,0,getStringValue(),beginIp0040iAnonPrepaidInd,IP_0040I_ANON_PREPAID_IND_LEN);
       localIp0040iAnonPrepaidIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp0040iAnonPrepaidIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp0040iAnonPrepaidInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp0040iAnonPrepaidInd() {	 
   		return (substring(getStringValue(),beginIp0040iAnonPrepaidInd,beginIp0040iAnonPrepaidInd + IP_0040I_ANON_PREPAID_IND_LEN));
   	}
     int localIp0040iDccStatusIndCounter = -1;
     public boolean isIp0040iDccStatusIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp0040iDccStatusIndCounter != sharedCounter;
         localIp0040iDccStatusIndCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_0040I_DCC_STATUS_IND_LEN = 1;
	/**
	 * 	serialize this Ip0040iDccStatusInd
	 */
   protected void serializeIp0040iDccStatusInd(char[] ip0040iDccStatusInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip0040iDccStatusInd,0,getStringValue(),beginIp0040iDccStatusInd,IP_0040I_DCC_STATUS_IND_LEN);
       localIp0040iDccStatusIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp0040iDccStatusIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp0040iDccStatusInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp0040iDccStatusInd() {	 
   		return (substring(getStringValue(),beginIp0040iDccStatusInd,beginIp0040iDccStatusInd + IP_0040I_DCC_STATUS_IND_LEN));
   	}
     int localIp0040iPayByAcctIndCounter = -1;
     public boolean isIp0040iPayByAcctIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp0040iPayByAcctIndCounter != sharedCounter;
         localIp0040iPayByAcctIndCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_0040I_PAY_BY_ACCT_IND_LEN = 1;
	/**
	 * 	serialize this Ip0040iPayByAcctInd
	 */
   protected void serializeIp0040iPayByAcctInd(char[] ip0040iPayByAcctInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip0040iPayByAcctInd,0,getStringValue(),beginIp0040iPayByAcctInd,IP_0040I_PAY_BY_ACCT_IND_LEN);
       localIp0040iPayByAcctIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp0040iPayByAcctIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp0040iPayByAcctInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp0040iPayByAcctInd() {	 
   		return (substring(getStringValue(),beginIp0040iPayByAcctInd,beginIp0040iPayByAcctInd + IP_0040I_PAY_BY_ACCT_IND_LEN));
   	}
     int localIp0040iIssGamParticipSwCounter = -1;
     public boolean isIp0040iIssGamParticipSwModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp0040iIssGamParticipSwCounter != sharedCounter;
         localIp0040iIssGamParticipSwCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_0040I_ISS_GAM_PARTICIP_SW_LEN = 1;
	/**
	 * 	serialize this Ip0040iIssGamParticipSw
	 */
   protected void serializeIp0040iIssGamParticipSw(char[] ip0040iIssGamParticipSw) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip0040iIssGamParticipSw,0,getStringValue(),beginIp0040iIssGamParticipSw,IP_0040I_ISS_GAM_PARTICIP_SW_LEN);
       localIp0040iIssGamParticipSwCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp0040iIssGamParticipSwConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp0040iIssGamParticipSw is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp0040iIssGamParticipSw() {	 
   		return (substring(getStringValue(),beginIp0040iIssGamParticipSw,beginIp0040iIssGamParticipSw + IP_0040I_ISS_GAM_PARTICIP_SW_LEN));
   	}
     int localIp0040iMemberFillerCounter = -1;
     public boolean isIp0040iMemberFillerModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp0040iMemberFillerCounter != sharedCounter;
         localIp0040iMemberFillerCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_0040I_MEMBER_FILLER_LEN = 12;
	/**
	 * 	serialize this Ip0040iMemberFiller
	 */
   protected void serializeIp0040iMemberFiller(char[] ip0040iMemberFiller) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip0040iMemberFiller,0,getStringValue(),beginIp0040iMemberFiller,IP_0040I_MEMBER_FILLER_LEN);
       localIp0040iMemberFillerCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp0040iMemberFillerConstraints(char[] value) {
   			return super.checkConstraints(value , 12 ,false, false);
   }
    /**
	 *	refreshIp0040iMemberFiller is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp0040iMemberFiller() {	 
   		return (substring(getStringValue(),beginIp0040iMemberFiller,beginIp0040iMemberFiller + IP_0040I_MEMBER_FILLER_LEN));
   	}
     int localIp0040iChbConvExclIdCounter = -1;
     public boolean isIp0040iChbConvExclIdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp0040iChbConvExclIdCounter != sharedCounter;
         localIp0040iChbConvExclIdCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_0040I_CHB_CONV_EXCL_ID_LEN = 1;
	/**
	 * 	serialize this Ip0040iChbConvExclId
	 */
   protected void serializeIp0040iChbConvExclId(char[] ip0040iChbConvExclId) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip0040iChbConvExclId,0,getStringValue(),beginIp0040iChbConvExclId,IP_0040I_CHB_CONV_EXCL_ID_LEN);
       localIp0040iChbConvExclIdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp0040iChbConvExclIdConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp0040iChbConvExclId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp0040iChbConvExclId() {	 
   		return (substring(getStringValue(),beginIp0040iChbConvExclId,beginIp0040iChbConvExclId + IP_0040I_CHB_CONV_EXCL_ID_LEN));
   	}
     int localIp0040iChbConvExclExpireCounter = -1;
     public boolean isIp0040iChbConvExclExpireModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp0040iChbConvExclExpireCounter != sharedCounter;
         localIp0040iChbConvExclExpireCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ip0040iChbConvExclExpire
	 *	@return ip0040iChbConvExclExpire
	 */
	public char[]  getIp0040iChbConvExclExpireString() {
	     return getCharArray(beginIp0040iChbConvExclExpire,IP_0040I_CHB_CONV_EXCL_EXPIRE_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip0040iChbConvExclExpireIsNumeric() {
	    return isNumeric(beginIp0040iChbConvExclExpire
	                    ,beginIp0040iChbConvExclExpire + IP_0040I_CHB_CONV_EXCL_EXPIRE_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int IP_0040I_CHB_CONV_EXCL_EXPIRE_LEN = 6;
  	/**
	 * serializeIp0040iChbConvExclExpire
	 */
	protected void serializeIp0040iChbConvExclExpire(long ip0040iChbConvExclExpire) {
		 putNumber(beginIp0040iChbConvExclExpire,ip0040iChbConvExclExpire,IP_0040I_CHB_CONV_EXCL_EXPIRE_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localIp0040iChbConvExclExpireCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeIp0040iChbConvExclExpire
	 */
   	protected  long serializeIp0040iChbConvExclExpire(char[] value) {
	    long  ip0040iChbConvExclExpire;
	    if(value.length >0 && value.length!= 6)
            value = new String(value).trim().toCharArray();
	    if (value.length < 6) value = pad(6, value, ' ', LEFT_PAD);
	    else if (value.length > 6) value = substring(value,0,6);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ip0040iChbConvExclExpire = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(6,value,false/*isSigned?*/)
		       ,beginIp0040iChbConvExclExpire
		       ,6
		      );
		 localIp0040iChbConvExclExpireCounter = shareString.getSerializedField().getModifiedCounter();
		return  ip0040iChbConvExclExpire;
    }

   protected long checkIp0040iChbConvExclExpireMaxLimit(long number) {

        return checkMaxLimit(number , MAX_1M/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshIp0040iChbConvExclExpire is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshIp0040iChbConvExclExpire() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginIp0040iChbConvExclExpire
			                 ,IP_0040I_CHB_CONV_EXCL_EXPIRE_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ip0040iChbConvExclExpire", beginIp0040iChbConvExclExpire,IP_0040I_CHB_CONV_EXCL_EXPIRE_LEN);
    }
   	}
     int localIp0040iHardshipIndicatorCounter = -1;
     public boolean isIp0040iHardshipIndicatorModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp0040iHardshipIndicatorCounter != sharedCounter;
         localIp0040iHardshipIndicatorCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_0040I_HARDSHIP_INDICATOR_LEN = 1;
	/**
	 * 	serialize this Ip0040iHardshipIndicator
	 */
   protected void serializeIp0040iHardshipIndicator(char[] ip0040iHardshipIndicator) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip0040iHardshipIndicator,0,getStringValue(),beginIp0040iHardshipIndicator,IP_0040I_HARDSHIP_INDICATOR_LEN);
       localIp0040iHardshipIndicatorCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp0040iHardshipIndicatorConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp0040iHardshipIndicator is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp0040iHardshipIndicator() {	 
   		return (substring(getStringValue(),beginIp0040iHardshipIndicator,beginIp0040iHardshipIndicator + IP_0040I_HARDSHIP_INDICATOR_LEN));
   	}
     int localIp0040iHardshipEffectiveCounter = -1;
     public boolean isIp0040iHardshipEffectiveModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp0040iHardshipEffectiveCounter != sharedCounter;
         localIp0040iHardshipEffectiveCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ip0040iHardshipEffective
	 *	@return ip0040iHardshipEffective
	 */
	public char[]  getIp0040iHardshipEffectiveString() {
	     return getCharArray(beginIp0040iHardshipEffective,IP_0040I_HARDSHIP_EFFECTIVE_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip0040iHardshipEffectiveIsNumeric() {
	    return isNumeric(beginIp0040iHardshipEffective
	                    ,beginIp0040iHardshipEffective + IP_0040I_HARDSHIP_EFFECTIVE_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int IP_0040I_HARDSHIP_EFFECTIVE_LEN = 6;
  	/**
	 * serializeIp0040iHardshipEffective
	 */
	protected void serializeIp0040iHardshipEffective(long ip0040iHardshipEffective) {
		 putNumber(beginIp0040iHardshipEffective,ip0040iHardshipEffective,IP_0040I_HARDSHIP_EFFECTIVE_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localIp0040iHardshipEffectiveCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeIp0040iHardshipEffective
	 */
   	protected  long serializeIp0040iHardshipEffective(char[] value) {
	    long  ip0040iHardshipEffective;
	    if(value.length >0 && value.length!= 6)
            value = new String(value).trim().toCharArray();
	    if (value.length < 6) value = pad(6, value, ' ', LEFT_PAD);
	    else if (value.length > 6) value = substring(value,0,6);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ip0040iHardshipEffective = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(6,value,false/*isSigned?*/)
		       ,beginIp0040iHardshipEffective
		       ,6
		      );
		 localIp0040iHardshipEffectiveCounter = shareString.getSerializedField().getModifiedCounter();
		return  ip0040iHardshipEffective;
    }

   protected long checkIp0040iHardshipEffectiveMaxLimit(long number) {

        return checkMaxLimit(number , MAX_1M/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshIp0040iHardshipEffective is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshIp0040iHardshipEffective() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginIp0040iHardshipEffective
			                 ,IP_0040I_HARDSHIP_EFFECTIVE_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ip0040iHardshipEffective", beginIp0040iHardshipEffective,IP_0040I_HARDSHIP_EFFECTIVE_LEN);
    }
   	}
     int localIp0040iHardshipExpirationCounter = -1;
     public boolean isIp0040iHardshipExpirationModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp0040iHardshipExpirationCounter != sharedCounter;
         localIp0040iHardshipExpirationCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ip0040iHardshipExpiration
	 *	@return ip0040iHardshipExpiration
	 */
	public char[]  getIp0040iHardshipExpirationString() {
	     return getCharArray(beginIp0040iHardshipExpiration,IP_0040I_HARDSHIP_EXPIRATION_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip0040iHardshipExpirationIsNumeric() {
	    return isNumeric(beginIp0040iHardshipExpiration
	                    ,beginIp0040iHardshipExpiration + IP_0040I_HARDSHIP_EXPIRATION_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int IP_0040I_HARDSHIP_EXPIRATION_LEN = 6;
  	/**
	 * serializeIp0040iHardshipExpiration
	 */
	protected void serializeIp0040iHardshipExpiration(long ip0040iHardshipExpiration) {
		 putNumber(beginIp0040iHardshipExpiration,ip0040iHardshipExpiration,IP_0040I_HARDSHIP_EXPIRATION_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localIp0040iHardshipExpirationCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeIp0040iHardshipExpiration
	 */
   	protected  long serializeIp0040iHardshipExpiration(char[] value) {
	    long  ip0040iHardshipExpiration;
	    if(value.length >0 && value.length!= 6)
            value = new String(value).trim().toCharArray();
	    if (value.length < 6) value = pad(6, value, ' ', LEFT_PAD);
	    else if (value.length > 6) value = substring(value,0,6);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ip0040iHardshipExpiration = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(6,value,false/*isSigned?*/)
		       ,beginIp0040iHardshipExpiration
		       ,6
		      );
		 localIp0040iHardshipExpirationCounter = shareString.getSerializedField().getModifiedCounter();
		return  ip0040iHardshipExpiration;
    }

   protected long checkIp0040iHardshipExpirationMaxLimit(long number) {

        return checkMaxLimit(number , MAX_1M/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshIp0040iHardshipExpiration is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshIp0040iHardshipExpiration() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginIp0040iHardshipExpiration
			                 ,IP_0040I_HARDSHIP_EXPIRATION_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ip0040iHardshipExpiration", beginIp0040iHardshipExpiration,IP_0040I_HARDSHIP_EXPIRATION_LEN);
    }
   	}
     int localIp0040iGamingCountrySwCounter = -1;
     public boolean isIp0040iGamingCountrySwModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp0040iGamingCountrySwCounter != sharedCounter;
         localIp0040iGamingCountrySwCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_0040I_GAMING_COUNTRY_SW_LEN = 1;
	/**
	 * 	serialize this Ip0040iGamingCountrySw
	 */
   protected void serializeIp0040iGamingCountrySw(char[] ip0040iGamingCountrySw) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip0040iGamingCountrySw,0,getStringValue(),beginIp0040iGamingCountrySw,IP_0040I_GAMING_COUNTRY_SW_LEN);
       localIp0040iGamingCountrySwCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp0040iGamingCountrySwConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp0040iGamingCountrySw is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp0040iGamingCountrySw() {	 
   		return (substring(getStringValue(),beginIp0040iGamingCountrySw,beginIp0040iGamingCountrySw + IP_0040I_GAMING_COUNTRY_SW_LEN));
   	}
     int localIp0040iCrossBorderIndCounter = -1;
     public boolean isIp0040iCrossBorderIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp0040iCrossBorderIndCounter != sharedCounter;
         localIp0040iCrossBorderIndCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ip0040iCrossBorderInd
	 *	@return ip0040iCrossBorderInd
	 */
	public char[]  getIp0040iCrossBorderIndString() {
	     return getCharArray(beginIp0040iCrossBorderInd,IP_0040I_CROSS_BORDER_IND_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip0040iCrossBorderIndIsNumeric() {
	    return isNumeric(beginIp0040iCrossBorderInd
	                    ,beginIp0040iCrossBorderInd + IP_0040I_CROSS_BORDER_IND_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int IP_0040I_CROSS_BORDER_IND_LEN = 1;
  	/**
	 * serializeIp0040iCrossBorderInd
	 */
	protected void serializeIp0040iCrossBorderInd(int ip0040iCrossBorderInd) {
		 putNumber(beginIp0040iCrossBorderInd,ip0040iCrossBorderInd,IP_0040I_CROSS_BORDER_IND_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localIp0040iCrossBorderIndCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeIp0040iCrossBorderInd
	 */
   	protected  int serializeIp0040iCrossBorderInd(char[] value) {
	    int  ip0040iCrossBorderInd;
	    if(value.length >0 && value.length!= 1)
            value = new String(value).trim().toCharArray();
	    if (value.length < 1) value = pad(1, value, ' ', LEFT_PAD);
	    else if (value.length > 1) value = substring(value,0,1);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ip0040iCrossBorderInd = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(1,value,false/*isSigned?*/)
		       ,beginIp0040iCrossBorderInd
		       ,1
		      );
		 localIp0040iCrossBorderIndCounter = shareString.getSerializedField().getModifiedCounter();
		return  ip0040iCrossBorderInd;
    }

   protected int checkIp0040iCrossBorderIndMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshIp0040iCrossBorderInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshIp0040iCrossBorderInd() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginIp0040iCrossBorderInd
			                 ,IP_0040I_CROSS_BORDER_IND_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ip0040iCrossBorderInd", beginIp0040iCrossBorderInd,IP_0040I_CROSS_BORDER_IND_LEN);
    }
   	}
     int localIp0040iRecPaymtCanSwCounter = -1;
     public boolean isIp0040iRecPaymtCanSwModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp0040iRecPaymtCanSwCounter != sharedCounter;
         localIp0040iRecPaymtCanSwCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_0040I_REC_PAYMT_CAN_SW_LEN = 1;
	/**
	 * 	serialize this Ip0040iRecPaymtCanSw
	 */
   protected void serializeIp0040iRecPaymtCanSw(char[] ip0040iRecPaymtCanSw) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip0040iRecPaymtCanSw,0,getStringValue(),beginIp0040iRecPaymtCanSw,IP_0040I_REC_PAYMT_CAN_SW_LEN);
       localIp0040iRecPaymtCanSwCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp0040iRecPaymtCanSwConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp0040iRecPaymtCanSw is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp0040iRecPaymtCanSw() {	 
   		return (substring(getStringValue(),beginIp0040iRecPaymtCanSw,beginIp0040iRecPaymtCanSw + IP_0040I_REC_PAYMT_CAN_SW_LEN));
   	}
     int localIp0040iDomDbtParticipSwCounter = -1;
     public boolean isIp0040iDomDbtParticipSwModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp0040iDomDbtParticipSwCounter != sharedCounter;
         localIp0040iDomDbtParticipSwCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_0040I_DOM_DBT_PARTICIP_SW_LEN = 1;
	/**
	 * 	serialize this Ip0040iDomDbtParticipSw
	 */
   protected void serializeIp0040iDomDbtParticipSw(char[] ip0040iDomDbtParticipSw) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip0040iDomDbtParticipSw,0,getStringValue(),beginIp0040iDomDbtParticipSw,IP_0040I_DOM_DBT_PARTICIP_SW_LEN);
       localIp0040iDomDbtParticipSwCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp0040iDomDbtParticipSwConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp0040iDomDbtParticipSw is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp0040iDomDbtParticipSw() {	 
   		return (substring(getStringValue(),beginIp0040iDomDbtParticipSw,beginIp0040iDomDbtParticipSw + IP_0040I_DOM_DBT_PARTICIP_SW_LEN));
   	}
     int localIp0040iIpcFraudCtlSwCounter = -1;
     public boolean isIp0040iIpcFraudCtlSwModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp0040iIpcFraudCtlSwCounter != sharedCounter;
         localIp0040iIpcFraudCtlSwCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_0040I_IPC_FRAUD_CTL_SW_LEN = 1;
	/**
	 * 	serialize this Ip0040iIpcFraudCtlSw
	 */
   protected void serializeIp0040iIpcFraudCtlSw(char[] ip0040iIpcFraudCtlSw) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip0040iIpcFraudCtlSw,0,getStringValue(),beginIp0040iIpcFraudCtlSw,IP_0040I_IPC_FRAUD_CTL_SW_LEN);
       localIp0040iIpcFraudCtlSwCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp0040iIpcFraudCtlSwConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp0040iIpcFraudCtlSw is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp0040iIpcFraudCtlSw() {	 
   		return (substring(getStringValue(),beginIp0040iIpcFraudCtlSw,beginIp0040iIpcFraudCtlSw + IP_0040I_IPC_FRAUD_CTL_SW_LEN));
   	}
     int localIp0040iIccrParticipIndCounter = -1;
     public boolean isIp0040iIccrParticipIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp0040iIccrParticipIndCounter != sharedCounter;
         localIp0040iIccrParticipIndCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_0040I_ICCR_PARTICIP_IND_LEN = 1;
	/**
	 * 	serialize this Ip0040iIccrParticipInd
	 */
   protected void serializeIp0040iIccrParticipInd(char[] ip0040iIccrParticipInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip0040iIccrParticipInd,0,getStringValue(),beginIp0040iIccrParticipInd,IP_0040I_ICCR_PARTICIP_IND_LEN);
       localIp0040iIccrParticipIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp0040iIccrParticipIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp0040iIccrParticipInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp0040iIccrParticipInd() {	 
   		return (substring(getStringValue(),beginIp0040iIccrParticipInd,beginIp0040iIccrParticipInd + IP_0040I_ICCR_PARTICIP_IND_LEN));
   	}
     int localIp0040iRevCreditIndCounter = -1;
     public boolean isIp0040iRevCreditIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp0040iRevCreditIndCounter != sharedCounter;
         localIp0040iRevCreditIndCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_0040I_REV_CREDIT_IND_LEN = 1;
	/**
	 * 	serialize this Ip0040iRevCreditInd
	 */
   protected void serializeIp0040iRevCreditInd(char[] ip0040iRevCreditInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip0040iRevCreditInd,0,getStringValue(),beginIp0040iRevCreditInd,IP_0040I_REV_CREDIT_IND_LEN);
       localIp0040iRevCreditIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp0040iRevCreditIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp0040iRevCreditInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp0040iRevCreditInd() {	 
   		return (substring(getStringValue(),beginIp0040iRevCreditInd,beginIp0040iRevCreditInd + IP_0040I_REV_CREDIT_IND_LEN));
   	}
     int localIp0040iChgbkBkoutIndCounter = -1;
     public boolean isIp0040iChgbkBkoutIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp0040iChgbkBkoutIndCounter != sharedCounter;
         localIp0040iChgbkBkoutIndCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_0040I_CHGBK_BKOUT_IND_LEN = 1;
	/**
	 * 	serialize this Ip0040iChgbkBkoutInd
	 */
   protected void serializeIp0040iChgbkBkoutInd(char[] ip0040iChgbkBkoutInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip0040iChgbkBkoutInd,0,getStringValue(),beginIp0040iChgbkBkoutInd,IP_0040I_CHGBK_BKOUT_IND_LEN);
       localIp0040iChgbkBkoutIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp0040iChgbkBkoutIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp0040iChgbkBkoutInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp0040iChgbkBkoutInd() {	 
   		return (substring(getStringValue(),beginIp0040iChgbkBkoutInd,beginIp0040iChgbkBkoutInd + IP_0040I_CHGBK_BKOUT_IND_LEN));
   	}
     int localIp0040iRtnTrnstNumCounter = -1;
     public boolean isIp0040iRtnTrnstNumModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp0040iRtnTrnstNumCounter != sharedCounter;
         localIp0040iRtnTrnstNumCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_0040I_RTN_TRNST_NUM_LEN = 10;
	/**
	 * 	serialize this Ip0040iRtnTrnstNum
	 */
   protected void serializeIp0040iRtnTrnstNum(char[] ip0040iRtnTrnstNum) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip0040iRtnTrnstNum,0,getStringValue(),beginIp0040iRtnTrnstNum,IP_0040I_RTN_TRNST_NUM_LEN);
       localIp0040iRtnTrnstNumCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp0040iRtnTrnstNumConstraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshIp0040iRtnTrnstNum is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp0040iRtnTrnstNum() {	 
   		return (substring(getStringValue(),beginIp0040iRtnTrnstNum,beginIp0040iRtnTrnstNum + IP_0040I_RTN_TRNST_NUM_LEN));
   	}
     int localIp0040iTrueIssuerIcaCounter = -1;
     public boolean isIp0040iTrueIssuerIcaModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp0040iTrueIssuerIcaCounter != sharedCounter;
         localIp0040iTrueIssuerIcaCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ip0040iTrueIssuerIca
	 *	@return ip0040iTrueIssuerIca
	 */
	public char[]  getIp0040iTrueIssuerIcaString() {
	     return getCharArray(beginIp0040iTrueIssuerIca,IP_0040I_TRUE_ISSUER_ICA_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip0040iTrueIssuerIcaIsNumeric() {
	    return isNumeric(beginIp0040iTrueIssuerIca
	                    ,beginIp0040iTrueIssuerIca + IP_0040I_TRUE_ISSUER_ICA_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int IP_0040I_TRUE_ISSUER_ICA_LEN = 11;
  	/**
	 * serializeIp0040iTrueIssuerIca
	 */
	protected void serializeIp0040iTrueIssuerIca(long ip0040iTrueIssuerIca) {
		 putNumber(beginIp0040iTrueIssuerIca,ip0040iTrueIssuerIca,IP_0040I_TRUE_ISSUER_ICA_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localIp0040iTrueIssuerIcaCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeIp0040iTrueIssuerIca
	 */
   	protected  long serializeIp0040iTrueIssuerIca(char[] value) {
	    long  ip0040iTrueIssuerIca;
	    if(value.length >0 && value.length!= 11)
            value = new String(value).trim().toCharArray();
	    if (value.length < 11) value = pad(11, value, ' ', LEFT_PAD);
	    else if (value.length > 11) value = substring(value,0,11);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ip0040iTrueIssuerIca = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(11,value,false/*isSigned?*/)
		       ,beginIp0040iTrueIssuerIca
		       ,11
		      );
		 localIp0040iTrueIssuerIcaCounter = shareString.getSerializedField().getModifiedCounter();
		return  ip0040iTrueIssuerIca;
    }

   protected long checkIp0040iTrueIssuerIcaMaxLimit(long number) {

        return checkMaxLimit(number , MAX_100G/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshIp0040iTrueIssuerIca is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshIp0040iTrueIssuerIca() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginIp0040iTrueIssuerIca
			                 ,IP_0040I_TRUE_ISSUER_ICA_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ip0040iTrueIssuerIca", beginIp0040iTrueIssuerIca,IP_0040I_TRUE_ISSUER_ICA_LEN);
    }
   	}
     int localIp0040iMerchantTaxIdSwCounter = -1;
     public boolean isIp0040iMerchantTaxIdSwModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp0040iMerchantTaxIdSwCounter != sharedCounter;
         localIp0040iMerchantTaxIdSwCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_0040I_MERCHANT_TAX_ID_SW_LEN = 1;
	/**
	 * 	serialize this Ip0040iMerchantTaxIdSw
	 */
   protected void serializeIp0040iMerchantTaxIdSw(char[] ip0040iMerchantTaxIdSw) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip0040iMerchantTaxIdSw,0,getStringValue(),beginIp0040iMerchantTaxIdSw,IP_0040I_MERCHANT_TAX_ID_SW_LEN);
       localIp0040iMerchantTaxIdSwCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp0040iMerchantTaxIdSwConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp0040iMerchantTaxIdSw is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp0040iMerchantTaxIdSw() {	 
   		return (substring(getStringValue(),beginIp0040iMerchantTaxIdSw,beginIp0040iMerchantTaxIdSw + IP_0040I_MERCHANT_TAX_ID_SW_LEN));
   	}
     int localIp0040iInstallServSwCounter = -1;
     public boolean isIp0040iInstallServSwModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp0040iInstallServSwCounter != sharedCounter;
         localIp0040iInstallServSwCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_0040I_INSTALL_SERV_SW_LEN = 1;
	/**
	 * 	serialize this Ip0040iInstallServSw
	 */
   protected void serializeIp0040iInstallServSw(char[] ip0040iInstallServSw) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip0040iInstallServSw,0,getStringValue(),beginIp0040iInstallServSw,IP_0040I_INSTALL_SERV_SW_LEN);
       localIp0040iInstallServSwCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp0040iInstallServSwConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp0040iInstallServSw is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp0040iInstallServSw() {	 
   		return (substring(getStringValue(),beginIp0040iInstallServSw,beginIp0040iInstallServSw + IP_0040I_INSTALL_SERV_SW_LEN));
   	}
     int localIp0040iTokenServiceIndCounter = -1;
     public boolean isIp0040iTokenServiceIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp0040iTokenServiceIndCounter != sharedCounter;
         localIp0040iTokenServiceIndCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_0040I_TOKEN_SERVICE_IND_LEN = 1;
	/**
	 * 	serialize this Ip0040iTokenServiceInd
	 */
   protected void serializeIp0040iTokenServiceInd(char[] ip0040iTokenServiceInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip0040iTokenServiceInd,0,getStringValue(),beginIp0040iTokenServiceInd,IP_0040I_TOKEN_SERVICE_IND_LEN);
       localIp0040iTokenServiceIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp0040iTokenServiceIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp0040iTokenServiceInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp0040iTokenServiceInd() {	 
   		return (substring(getStringValue(),beginIp0040iTokenServiceInd,beginIp0040iTokenServiceInd + IP_0040I_TOKEN_SERVICE_IND_LEN));
   	}
     int localIp0040iGbsBillIndCounter = -1;
     public boolean isIp0040iGbsBillIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp0040iGbsBillIndCounter != sharedCounter;
         localIp0040iGbsBillIndCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_0040I_GBS_BILL_IND_LEN = 1;
	/**
	 * 	serialize this Ip0040iGbsBillInd
	 */
   protected void serializeIp0040iGbsBillInd(char[] ip0040iGbsBillInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip0040iGbsBillInd,0,getStringValue(),beginIp0040iGbsBillInd,IP_0040I_GBS_BILL_IND_LEN);
       localIp0040iGbsBillIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp0040iGbsBillIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp0040iGbsBillInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp0040iGbsBillInd() {	 
   		return (substring(getStringValue(),beginIp0040iGbsBillInd,beginIp0040iGbsBillInd + IP_0040I_GBS_BILL_IND_LEN));
   	}
     int localIp0040iInstallAuthSwCounter = -1;
     public boolean isIp0040iInstallAuthSwModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp0040iInstallAuthSwCounter != sharedCounter;
         localIp0040iInstallAuthSwCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_0040I_INSTALL_AUTH_SW_LEN = 1;
	/**
	 * 	serialize this Ip0040iInstallAuthSw
	 */
   protected void serializeIp0040iInstallAuthSw(char[] ip0040iInstallAuthSw) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip0040iInstallAuthSw,0,getStringValue(),beginIp0040iInstallAuthSw,IP_0040I_INSTALL_AUTH_SW_LEN);
       localIp0040iInstallAuthSwCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp0040iInstallAuthSwConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp0040iInstallAuthSw is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp0040iInstallAuthSw() {	 
   		return (substring(getStringValue(),beginIp0040iInstallAuthSw,beginIp0040iInstallAuthSw + IP_0040I_INSTALL_AUTH_SW_LEN));
   	}
     int localIp0040iSeqServiceIndCounter = -1;
     public boolean isIp0040iSeqServiceIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp0040iSeqServiceIndCounter != sharedCounter;
         localIp0040iSeqServiceIndCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_0040I_SEQ_SERVICE_IND_LEN = 1;
	/**
	 * 	serialize this Ip0040iSeqServiceInd
	 */
   protected void serializeIp0040iSeqServiceInd(char[] ip0040iSeqServiceInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip0040iSeqServiceInd,0,getStringValue(),beginIp0040iSeqServiceInd,IP_0040I_SEQ_SERVICE_IND_LEN);
       localIp0040iSeqServiceIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp0040iSeqServiceIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp0040iSeqServiceInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp0040iSeqServiceInd() {	 
   		return (substring(getStringValue(),beginIp0040iSeqServiceInd,beginIp0040iSeqServiceInd + IP_0040I_SEQ_SERVICE_IND_LEN));
   	}
     int localIp0040iCbfmParticipIndCounter = -1;
     public boolean isIp0040iCbfmParticipIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp0040iCbfmParticipIndCounter != sharedCounter;
         localIp0040iCbfmParticipIndCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_0040I_CBFM_PARTICIP_IND_LEN = 1;
	/**
	 * 	serialize this Ip0040iCbfmParticipInd
	 */
   protected void serializeIp0040iCbfmParticipInd(char[] ip0040iCbfmParticipInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip0040iCbfmParticipInd,0,getStringValue(),beginIp0040iCbfmParticipInd,IP_0040I_CBFM_PARTICIP_IND_LEN);
       localIp0040iCbfmParticipIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp0040iCbfmParticipIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp0040iCbfmParticipInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp0040iCbfmParticipInd() {	 
   		return (substring(getStringValue(),beginIp0040iCbfmParticipInd,beginIp0040iCbfmParticipInd + IP_0040I_CBFM_PARTICIP_IND_LEN));
   	}
     int localIp0040iCbcmParticipIndCounter = -1;
     public boolean isIp0040iCbcmParticipIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp0040iCbcmParticipIndCounter != sharedCounter;
         localIp0040iCbcmParticipIndCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_0040I_CBCM_PARTICIP_IND_LEN = 1;
	/**
	 * 	serialize this Ip0040iCbcmParticipInd
	 */
   protected void serializeIp0040iCbcmParticipInd(char[] ip0040iCbcmParticipInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip0040iCbcmParticipInd,0,getStringValue(),beginIp0040iCbcmParticipInd,IP_0040I_CBCM_PARTICIP_IND_LEN);
       localIp0040iCbcmParticipIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp0040iCbcmParticipIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp0040iCbcmParticipInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp0040iCbcmParticipInd() {	 
   		return (substring(getStringValue(),beginIp0040iCbcmParticipInd,beginIp0040iCbcmParticipInd + IP_0040I_CBCM_PARTICIP_IND_LEN));
   	}
     int localIp0040iCbfmDccSwCounter = -1;
     public boolean isIp0040iCbfmDccSwModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp0040iCbfmDccSwCounter != sharedCounter;
         localIp0040iCbfmDccSwCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_0040I_CBFM_DCC_SW_LEN = 1;
	/**
	 * 	serialize this Ip0040iCbfmDccSw
	 */
   protected void serializeIp0040iCbfmDccSw(char[] ip0040iCbfmDccSw) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip0040iCbfmDccSw,0,getStringValue(),beginIp0040iCbfmDccSw,IP_0040I_CBFM_DCC_SW_LEN);
       localIp0040iCbfmDccSwCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp0040iCbfmDccSwConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp0040iCbfmDccSw is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp0040iCbfmDccSw() {	 
   		return (substring(getStringValue(),beginIp0040iCbfmDccSw,beginIp0040iCbfmDccSw + IP_0040I_CBFM_DCC_SW_LEN));
   	}
     int localIp0040iInstApiGcmsSwCounter = -1;
     public boolean isIp0040iInstApiGcmsSwModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp0040iInstApiGcmsSwCounter != sharedCounter;
         localIp0040iInstApiGcmsSwCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_0040I_INST_API_GCMS_SW_LEN = 1;
	/**
	 * 	serialize this Ip0040iInstApiGcmsSw
	 */
   protected void serializeIp0040iInstApiGcmsSw(char[] ip0040iInstApiGcmsSw) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip0040iInstApiGcmsSw,0,getStringValue(),beginIp0040iInstApiGcmsSw,IP_0040I_INST_API_GCMS_SW_LEN);
       localIp0040iInstApiGcmsSwCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp0040iInstApiGcmsSwConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp0040iInstApiGcmsSw is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp0040iInstApiGcmsSw() {	 
   		return (substring(getStringValue(),beginIp0040iInstApiGcmsSw,beginIp0040iInstApiGcmsSw + IP_0040I_INST_API_GCMS_SW_LEN));
   	}
     int localIp0040iInsEnabApiIndCounter = -1;
     public boolean isIp0040iInsEnabApiIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp0040iInsEnabApiIndCounter != sharedCounter;
         localIp0040iInsEnabApiIndCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_0040I_INS_ENAB_API_IND_LEN = 1;
	/**
	 * 	serialize this Ip0040iInsEnabApiInd
	 */
   protected void serializeIp0040iInsEnabApiInd(char[] ip0040iInsEnabApiInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip0040iInsEnabApiInd,0,getStringValue(),beginIp0040iInsEnabApiInd,IP_0040I_INS_ENAB_API_IND_LEN);
       localIp0040iInsEnabApiIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp0040iInsEnabApiIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp0040iInsEnabApiInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp0040iInsEnabApiInd() {	 
   		return (substring(getStringValue(),beginIp0040iInsEnabApiInd,beginIp0040iInsEnabApiInd + IP_0040I_INS_ENAB_API_IND_LEN));
   	}
     int localIp0040iInstApiUiSwCounter = -1;
     public boolean isIp0040iInstApiUiSwModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp0040iInstApiUiSwCounter != sharedCounter;
         localIp0040iInstApiUiSwCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_0040I_INST_API_UI_SW_LEN = 1;
	/**
	 * 	serialize this Ip0040iInstApiUiSw
	 */
   protected void serializeIp0040iInstApiUiSw(char[] ip0040iInstApiUiSw) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip0040iInstApiUiSw,0,getStringValue(),beginIp0040iInstApiUiSw,IP_0040I_INST_API_UI_SW_LEN);
       localIp0040iInstApiUiSwCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp0040iInstApiUiSwConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp0040iInstApiUiSw is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp0040iInstApiUiSw() {	 
   		return (substring(getStringValue(),beginIp0040iInstApiUiSw,beginIp0040iInstApiUiSw + IP_0040I_INST_API_UI_SW_LEN));
   	}
     int localIp0040iFillerCounter = -1;
     public boolean isIp0040iFillerModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp0040iFillerCounter != sharedCounter;
         localIp0040iFillerCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_0040I_FILLER_LEN = 1;
	/**
	 * 	serialize this Ip0040iFiller
	 */
   protected void serializeIp0040iFiller(char[] ip0040iFiller) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip0040iFiller,0,getStringValue(),beginIp0040iFiller,IP_0040I_FILLER_LEN);
       localIp0040iFillerCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp0040iFillerConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp0040iFiller is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp0040iFiller() {	 
   		return (substring(getStringValue(),beginIp0040iFiller,beginIp0040iFiller + IP_0040I_FILLER_LEN));
   	}
     int localIp0040iOboServiceIndCounter = -1;
     public boolean isIp0040iOboServiceIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp0040iOboServiceIndCounter != sharedCounter;
         localIp0040iOboServiceIndCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_0040I_OBO_SERVICE_IND_LEN = 1;
	/**
	 * 	serialize this Ip0040iOboServiceInd
	 */
   protected void serializeIp0040iOboServiceInd(char[] ip0040iOboServiceInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip0040iOboServiceInd,0,getStringValue(),beginIp0040iOboServiceInd,IP_0040I_OBO_SERVICE_IND_LEN);
       localIp0040iOboServiceIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp0040iOboServiceIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp0040iOboServiceInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp0040iOboServiceInd() {	 
   		return (substring(getStringValue(),beginIp0040iOboServiceInd,beginIp0040iOboServiceInd + IP_0040I_OBO_SERVICE_IND_LEN));
   	}
     int localIp0040iMultCurrSwCounter = -1;
     public boolean isIp0040iMultCurrSwModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp0040iMultCurrSwCounter != sharedCounter;
         localIp0040iMultCurrSwCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_0040I_MULT_CURR_SW_LEN = 1;
	/**
	 * 	serialize this Ip0040iMultCurrSw
	 */
   protected void serializeIp0040iMultCurrSw(char[] ip0040iMultCurrSw) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip0040iMultCurrSw,0,getStringValue(),beginIp0040iMultCurrSw,IP_0040I_MULT_CURR_SW_LEN);
       localIp0040iMultCurrSwCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp0040iMultCurrSwConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp0040iMultCurrSw is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp0040iMultCurrSw() {	 
   		return (substring(getStringValue(),beginIp0040iMultCurrSw,beginIp0040iMultCurrSw + IP_0040I_MULT_CURR_SW_LEN));
   	}
     int localIp0040iAnonIndEffDateCounter = -1;
     public boolean isIp0040iAnonIndEffDateModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp0040iAnonIndEffDateCounter != sharedCounter;
         localIp0040iAnonIndEffDateCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ip0040iAnonIndEffDate
	 *	@return ip0040iAnonIndEffDate
	 */
	public char[]  getIp0040iAnonIndEffDateString() {
	     return getCharArray(beginIp0040iAnonIndEffDate,IP_0040I_ANON_IND_EFF_DATE_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip0040iAnonIndEffDateIsNumeric() {
	    return isNumeric(beginIp0040iAnonIndEffDate
	                    ,beginIp0040iAnonIndEffDate + IP_0040I_ANON_IND_EFF_DATE_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int IP_0040I_ANON_IND_EFF_DATE_LEN = 6;
  	/**
	 * serializeIp0040iAnonIndEffDate
	 */
	protected void serializeIp0040iAnonIndEffDate(long ip0040iAnonIndEffDate) {
		 putNumber(beginIp0040iAnonIndEffDate,ip0040iAnonIndEffDate,IP_0040I_ANON_IND_EFF_DATE_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localIp0040iAnonIndEffDateCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeIp0040iAnonIndEffDate
	 */
   	protected  long serializeIp0040iAnonIndEffDate(char[] value) {
	    long  ip0040iAnonIndEffDate;
	    if(value.length >0 && value.length!= 6)
            value = new String(value).trim().toCharArray();
	    if (value.length < 6) value = pad(6, value, ' ', LEFT_PAD);
	    else if (value.length > 6) value = substring(value,0,6);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ip0040iAnonIndEffDate = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(6,value,false/*isSigned?*/)
		       ,beginIp0040iAnonIndEffDate
		       ,6
		      );
		 localIp0040iAnonIndEffDateCounter = shareString.getSerializedField().getModifiedCounter();
		return  ip0040iAnonIndEffDate;
    }

   protected long checkIp0040iAnonIndEffDateMaxLimit(long number) {

        return checkMaxLimit(number , MAX_1M/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshIp0040iAnonIndEffDate is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshIp0040iAnonIndEffDate() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginIp0040iAnonIndEffDate
			                 ,IP_0040I_ANON_IND_EFF_DATE_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ip0040iAnonIndEffDate", beginIp0040iAnonIndEffDate,IP_0040I_ANON_IND_EFF_DATE_LEN);
    }
   	}
     int localIp0040iCbfmEcbRateParIndCounter = -1;
     public boolean isIp0040iCbfmEcbRateParIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp0040iCbfmEcbRateParIndCounter != sharedCounter;
         localIp0040iCbfmEcbRateParIndCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_0040I_CBFM_ECB_RATE_PAR_IND_LEN = 1;
	/**
	 * 	serialize this Ip0040iCbfmEcbRateParInd
	 */
   protected void serializeIp0040iCbfmEcbRateParInd(char[] ip0040iCbfmEcbRateParInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip0040iCbfmEcbRateParInd,0,getStringValue(),beginIp0040iCbfmEcbRateParInd,IP_0040I_CBFM_ECB_RATE_PAR_IND_LEN);
       localIp0040iCbfmEcbRateParIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp0040iCbfmEcbRateParIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp0040iCbfmEcbRateParInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp0040iCbfmEcbRateParInd() {	 
   		return (substring(getStringValue(),beginIp0040iCbfmEcbRateParInd,beginIp0040iCbfmEcbRateParInd + IP_0040I_CBFM_ECB_RATE_PAR_IND_LEN));
   	}
     int localIp0040iAlmXbOptOutIndCounter = -1;
     public boolean isIp0040iAlmXbOptOutIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp0040iAlmXbOptOutIndCounter != sharedCounter;
         localIp0040iAlmXbOptOutIndCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_0040I_ALM_XB_OPT_OUT_IND_LEN = 1;
	/**
	 * 	serialize this Ip0040iAlmXbOptOutInd
	 */
   protected void serializeIp0040iAlmXbOptOutInd(char[] ip0040iAlmXbOptOutInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip0040iAlmXbOptOutInd,0,getStringValue(),beginIp0040iAlmXbOptOutInd,IP_0040I_ALM_XB_OPT_OUT_IND_LEN);
       localIp0040iAlmXbOptOutIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp0040iAlmXbOptOutIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp0040iAlmXbOptOutInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp0040iAlmXbOptOutInd() {	 
   		return (substring(getStringValue(),beginIp0040iAlmXbOptOutInd,beginIp0040iAlmXbOptOutInd + IP_0040I_ALM_XB_OPT_OUT_IND_LEN));
   	}
     int localIp0040iJpnNonmdesTknrngSwCounter = -1;
     public boolean isIp0040iJpnNonmdesTknrngSwModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp0040iJpnNonmdesTknrngSwCounter != sharedCounter;
         localIp0040iJpnNonmdesTknrngSwCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_0040I_JPN_NONMDES_TKNRNG_SW_LEN = 1;
	/**
	 * 	serialize this Ip0040iJpnNonmdesTknrngSw
	 */
   protected void serializeIp0040iJpnNonmdesTknrngSw(char[] ip0040iJpnNonmdesTknrngSw) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip0040iJpnNonmdesTknrngSw,0,getStringValue(),beginIp0040iJpnNonmdesTknrngSw,IP_0040I_JPN_NONMDES_TKNRNG_SW_LEN);
       localIp0040iJpnNonmdesTknrngSwCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp0040iJpnNonmdesTknrngSwConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp0040iJpnNonmdesTknrngSw is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp0040iJpnNonmdesTknrngSw() {	 
   		return (substring(getStringValue(),beginIp0040iJpnNonmdesTknrngSw,beginIp0040iJpnNonmdesTknrngSw + IP_0040I_JPN_NONMDES_TKNRNG_SW_LEN));
   	}




}
  
