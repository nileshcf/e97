package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip00404MpePeRecDataCsSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:27. using version 5.0.0.257
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip00404MpePeRecDataCsSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip00404MpePeRecDataCsSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_00404_MPE_PE_REC_DATA_CS_LENGTH = 199;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp00404ProductType;
            protected  int beginIp00404Endpoint;
            protected  int beginIp00404Country;
            protected  int beginIp00404CountryNum;
            protected  int beginIp00404ProductClass;
            protected  int beginIp00404TranRoutingInd;
            protected  int beginIp00404PrsProdReassgnSw;
            protected  int beginIp00404ProdReassignmentSw;
            protected  int beginIp00404OptInFlag;
            protected  int beginIp00404LicensedProdId;
            protected  int beginIp00404VirtFundPanInd;
            protected  int beginIp00404AcctCatgPartSw;
            protected  int beginIp00404AcctCatgActvnDate;
            protected  int beginIp00404ChipConversionSw;
            protected  int beginIp00404CoBrandSw;
            protected  int beginIp00404SpendControlRcnSw;
            protected  int beginIp00404MerchCleanServPart;
            protected  int beginIp00404MerchCleanActvDate;
            protected  int beginIp00404PaypassEnabledInd;
            protected  int beginIp00404RateTypeIndicator;
            protected  int beginIp00404RoutePsnIndicator;
            protected  int beginIp00404CbwpIndicator;
            protected  int beginIp00404FlexParticipInd;
            protected  int beginIp00404RepwrRldInd;
            protected  int beginIp00404MoneySendInd;
            protected  int beginIp00404RegulatedRateIndSw;
            protected  int beginIp00404CashAccessSw;
            protected  int beginIp00404PersonPresentInd;
            protected  int beginIp00404CrossBdrException;
            protected  int beginIp00404IssTargetMarketInd;
            protected  int beginIp00404PostDateServSw;
            protected  int beginIp00404MealVoucherInd;
            protected  int beginIp00404NonRldblPrpdSw;
            protected  int beginIp00404FasterFundsInd;
            protected  int beginIp00404AnonPrepaidInd;
            protected  int beginIp00404DccStatusInd;
            protected  int beginIp00404PayByAcctInd;
            protected  int beginIp00404IssGamParticipSw;
            protected  int beginIp00404MemberFiller;
            protected  int beginIp00404ChbConvExclId;
            protected  int beginIp00404ChbConvExclExpire;
            protected  int beginIp00404HardshipIndicator;
            protected  int beginIp00404HardshipEffective;
            protected  int beginIp00404HardshipExpiration;
            protected  int beginIp00404GamingCountrySw;
            protected  int beginIp00404CrossBorderInd;
            protected  int beginIp00404RecPaymtCanSw;
            protected  int beginIp00404DomDbtParticipSw;
            protected  int beginIp00404IpcFraudCtlSw;
            protected  int beginIp00404IccrParticipInd;
            protected  int beginIp00404RevCreditInd;
            protected  int beginIp00404ChgbkBkoutInd;
            protected  int beginIp00404RtnTrnstNum;
            protected  int beginIp00404TrueIssuerIca;
            protected  int beginIp00404MerchantTaxIdSw;
            protected  int beginIp00404InstallServSw;
            protected  int beginIp00404TokenServiceInd;
            protected  int beginIp00404GbsBillInd;
            protected  int beginIp00404InstallAuthSw;
            protected  int beginIp00404SeqServiceInd;
            protected  int beginIp00404CbfmParticipInd;
            protected  int beginIp00404CbcmParticipInd;
            protected  int beginIp00404CbfmDccSw;
            protected  int beginIp00404InstApiGcmsSw;
            protected  int beginIp00404InsEnabApiInd;
            protected  int beginIp00404InstApiUiSw;
            protected  int beginIp00404Filler;
            protected  int beginIp00404MstrpassAchProgInd;
            protected  int beginIp00404OboServiceInd;
            protected  int beginIp00404MultCurrSw;
            protected  int beginIp00404AnonIndEffDate;
            protected  int beginIp00404CbfmEcbRateParInd;
            protected  int beginIp00404AlmXbOptOutInd;
            protected  int beginIp00404JpnNonmdesTknrngSw;
	
	/**
	* Constructor for Ip00404MpePeRecDataCsSerialized
	**/
    public Ip00404MpePeRecDataCsSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ip00404MpePeRecDataCsSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip00404MpePeRecDataCsSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ip00404MpePeRecDataCsSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,67); // serialize this field at offset 67 by default 
    }
    
	/**
	* sets parent for this Ip00404MpePeRecDataCsSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 67 by default
    }    
	/**
	* initializes the field in Ip00404MpePeRecDataCsSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_00404_MPE_PE_REC_DATA_CS_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp00404ProductType = getStartOffset() + 0;	// set offset for serialization
  
             beginIp00404Endpoint = getStartOffset() + 1;	// set offset for serialization
  
             beginIp00404Country = getStartOffset() + 8;	// set offset for serialization
  
             beginIp00404CountryNum = getStartOffset() + 11;	// set offset for serialization
  
  
             beginIp00404ProductClass = getStartOffset() + 15;	// set offset for serialization
  
             beginIp00404TranRoutingInd = getStartOffset() + 18;	// set offset for serialization
  
             beginIp00404PrsProdReassgnSw = getStartOffset() + 19;	// set offset for serialization
  
             beginIp00404ProdReassignmentSw = getStartOffset() + 20;	// set offset for serialization
  
             beginIp00404OptInFlag = getStartOffset() + 21;	// set offset for serialization
  
             beginIp00404LicensedProdId = getStartOffset() + 22;	// set offset for serialization
  
             beginIp00404VirtFundPanInd = getStartOffset() + 25;	// set offset for serialization
  
             beginIp00404AcctCatgPartSw = getStartOffset() + 26;	// set offset for serialization
  
             beginIp00404AcctCatgActvnDate = getStartOffset() + 27;	// set offset for serialization
  
  
             beginIp00404ChipConversionSw = getStartOffset() + 65;	// set offset for serialization
  
  
             beginIp00404CoBrandSw = getStartOffset() + 72;	// set offset for serialization
  
             beginIp00404SpendControlRcnSw = getStartOffset() + 73;	// set offset for serialization
  
             beginIp00404MerchCleanServPart = getStartOffset() + 74;	// set offset for serialization
  
             beginIp00404MerchCleanActvDate = getStartOffset() + 77;	// set offset for serialization
  
             beginIp00404PaypassEnabledInd = getStartOffset() + 83;	// set offset for serialization
  
             beginIp00404RateTypeIndicator = getStartOffset() + 84;	// set offset for serialization
  
             beginIp00404RoutePsnIndicator = getStartOffset() + 85;	// set offset for serialization
  
             beginIp00404CbwpIndicator = getStartOffset() + 86;	// set offset for serialization
  
             beginIp00404FlexParticipInd = getStartOffset() + 87;	// set offset for serialization
  
             beginIp00404RepwrRldInd = getStartOffset() + 88;	// set offset for serialization
  
             beginIp00404MoneySendInd = getStartOffset() + 89;	// set offset for serialization
  
             beginIp00404RegulatedRateIndSw = getStartOffset() + 90;	// set offset for serialization
  
             beginIp00404CashAccessSw = getStartOffset() + 91;	// set offset for serialization
  
             beginIp00404PersonPresentInd = getStartOffset() + 92;	// set offset for serialization
  
             beginIp00404CrossBdrException = getStartOffset() + 93;	// set offset for serialization
  
             beginIp00404IssTargetMarketInd = getStartOffset() + 94;	// set offset for serialization
  
             beginIp00404PostDateServSw = getStartOffset() + 95;	// set offset for serialization
  
             beginIp00404MealVoucherInd = getStartOffset() + 96;	// set offset for serialization
  
             beginIp00404NonRldblPrpdSw = getStartOffset() + 97;	// set offset for serialization
  
             beginIp00404FasterFundsInd = getStartOffset() + 99;	// set offset for serialization
  
             beginIp00404AnonPrepaidInd = getStartOffset() + 100;	// set offset for serialization
  
             beginIp00404DccStatusInd = getStartOffset() + 101;	// set offset for serialization
  
             beginIp00404PayByAcctInd = getStartOffset() + 102;	// set offset for serialization
  
             beginIp00404IssGamParticipSw = getStartOffset() + 103;	// set offset for serialization
  
             beginIp00404MemberFiller = getStartOffset() + 104;	// set offset for serialization
  
             beginIp00404ChbConvExclId = getStartOffset() + 116;	// set offset for serialization
  
             beginIp00404ChbConvExclExpire = getStartOffset() + 117;	// set offset for serialization
  
             beginIp00404HardshipIndicator = getStartOffset() + 123;	// set offset for serialization
  
             beginIp00404HardshipEffective = getStartOffset() + 124;	// set offset for serialization
  
             beginIp00404HardshipExpiration = getStartOffset() + 130;	// set offset for serialization
  
             beginIp00404GamingCountrySw = getStartOffset() + 136;	// set offset for serialization
  
             beginIp00404CrossBorderInd = getStartOffset() + 137;	// set offset for serialization
  
             beginIp00404RecPaymtCanSw = getStartOffset() + 138;	// set offset for serialization
  
             beginIp00404DomDbtParticipSw = getStartOffset() + 139;	// set offset for serialization
  
  
             beginIp00404IpcFraudCtlSw = getStartOffset() + 150;	// set offset for serialization
  
             beginIp00404IccrParticipInd = getStartOffset() + 151;	// set offset for serialization
  
             beginIp00404RevCreditInd = getStartOffset() + 152;	// set offset for serialization
  
             beginIp00404ChgbkBkoutInd = getStartOffset() + 153;	// set offset for serialization
  
             beginIp00404RtnTrnstNum = getStartOffset() + 154;	// set offset for serialization
  
             beginIp00404TrueIssuerIca = getStartOffset() + 164;	// set offset for serialization
  
             beginIp00404MerchantTaxIdSw = getStartOffset() + 175;	// set offset for serialization
  
             beginIp00404InstallServSw = getStartOffset() + 176;	// set offset for serialization
  
             beginIp00404TokenServiceInd = getStartOffset() + 177;	// set offset for serialization
  
             beginIp00404GbsBillInd = getStartOffset() + 178;	// set offset for serialization
  
             beginIp00404InstallAuthSw = getStartOffset() + 179;	// set offset for serialization
  
             beginIp00404SeqServiceInd = getStartOffset() + 180;	// set offset for serialization
  
             beginIp00404CbfmParticipInd = getStartOffset() + 181;	// set offset for serialization
  
             beginIp00404CbcmParticipInd = getStartOffset() + 182;	// set offset for serialization
  
             beginIp00404CbfmDccSw = getStartOffset() + 183;	// set offset for serialization
  
             beginIp00404InstApiGcmsSw = getStartOffset() + 184;	// set offset for serialization
  
             beginIp00404InsEnabApiInd = getStartOffset() + 185;	// set offset for serialization
  
             beginIp00404InstApiUiSw = getStartOffset() + 186;	// set offset for serialization
  
             beginIp00404Filler = getStartOffset() + 187;	// set offset for serialization
  
             beginIp00404MstrpassAchProgInd = getStartOffset() + 187;	// set offset for serialization
  
             beginIp00404OboServiceInd = getStartOffset() + 188;	// set offset for serialization
  
             beginIp00404MultCurrSw = getStartOffset() + 189;	// set offset for serialization
  
             beginIp00404AnonIndEffDate = getStartOffset() + 190;	// set offset for serialization
  
             beginIp00404CbfmEcbRateParInd = getStartOffset() + 196;	// set offset for serialization
  
             beginIp00404AlmXbOptOutInd = getStartOffset() + 197;	// set offset for serialization
  
             beginIp00404JpnNonmdesTknrngSw = getStartOffset() + 198;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localIp00404ProductTypeCounter = -1;
     public boolean isIp00404ProductTypeModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp00404ProductTypeCounter != sharedCounter;
         localIp00404ProductTypeCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_00404_PRODUCT_TYPE_LEN = 1;
	/**
	 * 	serialize this Ip00404ProductType
	 */
   protected void serializeIp00404ProductType(char[] ip00404ProductType) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip00404ProductType,0,getStringValue(),beginIp00404ProductType,IP_00404_PRODUCT_TYPE_LEN);
       localIp00404ProductTypeCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp00404ProductTypeConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp00404ProductType is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp00404ProductType() {	 
   		return (substring(getStringValue(),beginIp00404ProductType,beginIp00404ProductType + IP_00404_PRODUCT_TYPE_LEN));
   	}
     int localIp00404EndpointCounter = -1;
     public boolean isIp00404EndpointModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp00404EndpointCounter != sharedCounter;
         localIp00404EndpointCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ip00404Endpoint
	 *	@return ip00404Endpoint
	 */
	public char[]  getIp00404EndpointString() {
	     return getCharArray(beginIp00404Endpoint,IP_00404_ENDPOINT_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip00404EndpointIsNumeric() {
	    return isNumeric(beginIp00404Endpoint
	                    ,beginIp00404Endpoint + IP_00404_ENDPOINT_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int IP_00404_ENDPOINT_LEN = 7;
  	/**
	 * serializeIp00404Endpoint
	 */
	protected void serializeIp00404Endpoint(long ip00404Endpoint) {
		 putNumber(beginIp00404Endpoint,ip00404Endpoint,IP_00404_ENDPOINT_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localIp00404EndpointCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeIp00404Endpoint
	 */
   	protected  long serializeIp00404Endpoint(char[] value) {
	    long  ip00404Endpoint;
	    if(value.length >0 && value.length!= 7)
            value = new String(value).trim().toCharArray();
	    if (value.length < 7) value = pad(7, value, ' ', LEFT_PAD);
	    else if (value.length > 7) value = substring(value,0,7);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ip00404Endpoint = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(7,value,false/*isSigned?*/)
		       ,beginIp00404Endpoint
		       ,7
		      );
		 localIp00404EndpointCounter = shareString.getSerializedField().getModifiedCounter();
		return  ip00404Endpoint;
    }

   protected long checkIp00404EndpointMaxLimit(long number) {

        return checkMaxLimit(number , MAX_10M/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshIp00404Endpoint is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshIp00404Endpoint() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginIp00404Endpoint
			                 ,IP_00404_ENDPOINT_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ip00404Endpoint", beginIp00404Endpoint,IP_00404_ENDPOINT_LEN);
    }
   	}
     int localIp00404CountryCounter = -1;
     public boolean isIp00404CountryModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp00404CountryCounter != sharedCounter;
         localIp00404CountryCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_00404_COUNTRY_LEN = 3;
	/**
	 * 	serialize this Ip00404Country
	 */
   protected void serializeIp00404Country(char[] ip00404Country) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip00404Country,0,getStringValue(),beginIp00404Country,IP_00404_COUNTRY_LEN);
       localIp00404CountryCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp00404CountryConstraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshIp00404Country is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp00404Country() {	 
   		return (substring(getStringValue(),beginIp00404Country,beginIp00404Country + IP_00404_COUNTRY_LEN));
   	}
     int localIp00404CountryNumCounter = -1;
     public boolean isIp00404CountryNumModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp00404CountryNumCounter != sharedCounter;
         localIp00404CountryNumCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ip00404CountryNum
	 *	@return ip00404CountryNum
	 */
	public char[]  getIp00404CountryNumString() {
	     return getCharArray(beginIp00404CountryNum,IP_00404_COUNTRY_NUM_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip00404CountryNumIsNumeric() {
	    return isNumeric(beginIp00404CountryNum
	                    ,beginIp00404CountryNum + IP_00404_COUNTRY_NUM_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int IP_00404_COUNTRY_NUM_LEN = 3;
  	/**
	 * serializeIp00404CountryNum
	 */
	protected void serializeIp00404CountryNum(int ip00404CountryNum) {
		 putNumber(beginIp00404CountryNum,ip00404CountryNum,IP_00404_COUNTRY_NUM_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localIp00404CountryNumCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeIp00404CountryNum
	 */
   	protected  int serializeIp00404CountryNum(char[] value) {
	    int  ip00404CountryNum;
	    if(value.length >0 && value.length!= 3)
            value = new String(value).trim().toCharArray();
	    if (value.length < 3) value = pad(3, value, ' ', LEFT_PAD);
	    else if (value.length > 3) value = substring(value,0,3);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ip00404CountryNum = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(3,value,false/*isSigned?*/)
		       ,beginIp00404CountryNum
		       ,3
		      );
		 localIp00404CountryNumCounter = shareString.getSerializedField().getModifiedCounter();
		return  ip00404CountryNum;
    }

   protected int checkIp00404CountryNumMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_1000/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshIp00404CountryNum is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshIp00404CountryNum() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginIp00404CountryNum
			                 ,IP_00404_COUNTRY_NUM_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ip00404CountryNum", beginIp00404CountryNum,IP_00404_COUNTRY_NUM_LEN);
    }
   	}
     int localIp00404ProductClassCounter = -1;
     public boolean isIp00404ProductClassModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp00404ProductClassCounter != sharedCounter;
         localIp00404ProductClassCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_00404_PRODUCT_CLASS_LEN = 3;
	/**
	 * 	serialize this Ip00404ProductClass
	 */
   protected void serializeIp00404ProductClass(char[] ip00404ProductClass) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip00404ProductClass,0,getStringValue(),beginIp00404ProductClass,IP_00404_PRODUCT_CLASS_LEN);
       localIp00404ProductClassCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp00404ProductClassConstraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshIp00404ProductClass is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp00404ProductClass() {	 
   		return (substring(getStringValue(),beginIp00404ProductClass,beginIp00404ProductClass + IP_00404_PRODUCT_CLASS_LEN));
   	}
     int localIp00404TranRoutingIndCounter = -1;
     public boolean isIp00404TranRoutingIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp00404TranRoutingIndCounter != sharedCounter;
         localIp00404TranRoutingIndCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_00404_TRAN_ROUTING_IND_LEN = 1;
	/**
	 * 	serialize this Ip00404TranRoutingInd
	 */
   protected void serializeIp00404TranRoutingInd(char[] ip00404TranRoutingInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip00404TranRoutingInd,0,getStringValue(),beginIp00404TranRoutingInd,IP_00404_TRAN_ROUTING_IND_LEN);
       localIp00404TranRoutingIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp00404TranRoutingIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp00404TranRoutingInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp00404TranRoutingInd() {	 
   		return (substring(getStringValue(),beginIp00404TranRoutingInd,beginIp00404TranRoutingInd + IP_00404_TRAN_ROUTING_IND_LEN));
   	}
     int localIp00404PrsProdReassgnSwCounter = -1;
     public boolean isIp00404PrsProdReassgnSwModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp00404PrsProdReassgnSwCounter != sharedCounter;
         localIp00404PrsProdReassgnSwCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_00404_PRS_PROD_REASSGN_SW_LEN = 1;
	/**
	 * 	serialize this Ip00404PrsProdReassgnSw
	 */
   protected void serializeIp00404PrsProdReassgnSw(char[] ip00404PrsProdReassgnSw) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip00404PrsProdReassgnSw,0,getStringValue(),beginIp00404PrsProdReassgnSw,IP_00404_PRS_PROD_REASSGN_SW_LEN);
       localIp00404PrsProdReassgnSwCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp00404PrsProdReassgnSwConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp00404PrsProdReassgnSw is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp00404PrsProdReassgnSw() {	 
   		return (substring(getStringValue(),beginIp00404PrsProdReassgnSw,beginIp00404PrsProdReassgnSw + IP_00404_PRS_PROD_REASSGN_SW_LEN));
   	}
     int localIp00404ProdReassignmentSwCounter = -1;
     public boolean isIp00404ProdReassignmentSwModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp00404ProdReassignmentSwCounter != sharedCounter;
         localIp00404ProdReassignmentSwCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_00404_PROD_REASSIGNMENT_SW_LEN = 1;
	/**
	 * 	serialize this Ip00404ProdReassignmentSw
	 */
   protected void serializeIp00404ProdReassignmentSw(char[] ip00404ProdReassignmentSw) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip00404ProdReassignmentSw,0,getStringValue(),beginIp00404ProdReassignmentSw,IP_00404_PROD_REASSIGNMENT_SW_LEN);
       localIp00404ProdReassignmentSwCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp00404ProdReassignmentSwConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp00404ProdReassignmentSw is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp00404ProdReassignmentSw() {	 
   		return (substring(getStringValue(),beginIp00404ProdReassignmentSw,beginIp00404ProdReassignmentSw + IP_00404_PROD_REASSIGNMENT_SW_LEN));
   	}
     int localIp00404OptInFlagCounter = -1;
     public boolean isIp00404OptInFlagModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp00404OptInFlagCounter != sharedCounter;
         localIp00404OptInFlagCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_00404_OPT_IN_FLAG_LEN = 1;
	/**
	 * 	serialize this Ip00404OptInFlag
	 */
   protected void serializeIp00404OptInFlag(char[] ip00404OptInFlag) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip00404OptInFlag,0,getStringValue(),beginIp00404OptInFlag,IP_00404_OPT_IN_FLAG_LEN);
       localIp00404OptInFlagCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp00404OptInFlagConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp00404OptInFlag is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp00404OptInFlag() {	 
   		return (substring(getStringValue(),beginIp00404OptInFlag,beginIp00404OptInFlag + IP_00404_OPT_IN_FLAG_LEN));
   	}
     int localIp00404LicensedProdIdCounter = -1;
     public boolean isIp00404LicensedProdIdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp00404LicensedProdIdCounter != sharedCounter;
         localIp00404LicensedProdIdCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_00404_LICENSED_PROD_ID_LEN = 3;
	/**
	 * 	serialize this Ip00404LicensedProdId
	 */
   protected void serializeIp00404LicensedProdId(char[] ip00404LicensedProdId) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip00404LicensedProdId,0,getStringValue(),beginIp00404LicensedProdId,IP_00404_LICENSED_PROD_ID_LEN);
       localIp00404LicensedProdIdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp00404LicensedProdIdConstraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshIp00404LicensedProdId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp00404LicensedProdId() {	 
   		return (substring(getStringValue(),beginIp00404LicensedProdId,beginIp00404LicensedProdId + IP_00404_LICENSED_PROD_ID_LEN));
   	}
     int localIp00404VirtFundPanIndCounter = -1;
     public boolean isIp00404VirtFundPanIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp00404VirtFundPanIndCounter != sharedCounter;
         localIp00404VirtFundPanIndCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_00404_VIRT_FUND_PAN_IND_LEN = 1;
	/**
	 * 	serialize this Ip00404VirtFundPanInd
	 */
   protected void serializeIp00404VirtFundPanInd(char[] ip00404VirtFundPanInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip00404VirtFundPanInd,0,getStringValue(),beginIp00404VirtFundPanInd,IP_00404_VIRT_FUND_PAN_IND_LEN);
       localIp00404VirtFundPanIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp00404VirtFundPanIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp00404VirtFundPanInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp00404VirtFundPanInd() {	 
   		return (substring(getStringValue(),beginIp00404VirtFundPanInd,beginIp00404VirtFundPanInd + IP_00404_VIRT_FUND_PAN_IND_LEN));
   	}
     int localIp00404AcctCatgPartSwCounter = -1;
     public boolean isIp00404AcctCatgPartSwModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp00404AcctCatgPartSwCounter != sharedCounter;
         localIp00404AcctCatgPartSwCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_00404_ACCT_CATG_PART_SW_LEN = 1;
	/**
	 * 	serialize this Ip00404AcctCatgPartSw
	 */
   protected void serializeIp00404AcctCatgPartSw(char[] ip00404AcctCatgPartSw) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip00404AcctCatgPartSw,0,getStringValue(),beginIp00404AcctCatgPartSw,IP_00404_ACCT_CATG_PART_SW_LEN);
       localIp00404AcctCatgPartSwCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp00404AcctCatgPartSwConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp00404AcctCatgPartSw is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp00404AcctCatgPartSw() {	 
   		return (substring(getStringValue(),beginIp00404AcctCatgPartSw,beginIp00404AcctCatgPartSw + IP_00404_ACCT_CATG_PART_SW_LEN));
   	}
     int localIp00404AcctCatgActvnDateCounter = -1;
     public boolean isIp00404AcctCatgActvnDateModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp00404AcctCatgActvnDateCounter != sharedCounter;
         localIp00404AcctCatgActvnDateCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ip00404AcctCatgActvnDate
	 *	@return ip00404AcctCatgActvnDate
	 */
	public char[]  getIp00404AcctCatgActvnDateString() {
	     return getCharArray(beginIp00404AcctCatgActvnDate,IP_00404_ACCT_CATG_ACTVN_DATE_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip00404AcctCatgActvnDateIsNumeric() {
	    return isNumeric(beginIp00404AcctCatgActvnDate
	                    ,beginIp00404AcctCatgActvnDate + IP_00404_ACCT_CATG_ACTVN_DATE_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int IP_00404_ACCT_CATG_ACTVN_DATE_LEN = 6;
  	/**
	 * serializeIp00404AcctCatgActvnDate
	 */
	protected void serializeIp00404AcctCatgActvnDate(long ip00404AcctCatgActvnDate) {
		 putNumber(beginIp00404AcctCatgActvnDate,ip00404AcctCatgActvnDate,IP_00404_ACCT_CATG_ACTVN_DATE_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localIp00404AcctCatgActvnDateCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeIp00404AcctCatgActvnDate
	 */
   	protected  long serializeIp00404AcctCatgActvnDate(char[] value) {
	    long  ip00404AcctCatgActvnDate;
	    if(value.length >0 && value.length!= 6)
            value = new String(value).trim().toCharArray();
	    if (value.length < 6) value = pad(6, value, ' ', LEFT_PAD);
	    else if (value.length > 6) value = substring(value,0,6);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ip00404AcctCatgActvnDate = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(6,value,false/*isSigned?*/)
		       ,beginIp00404AcctCatgActvnDate
		       ,6
		      );
		 localIp00404AcctCatgActvnDateCounter = shareString.getSerializedField().getModifiedCounter();
		return  ip00404AcctCatgActvnDate;
    }

   protected long checkIp00404AcctCatgActvnDateMaxLimit(long number) {

        return checkMaxLimit(number , MAX_1M/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshIp00404AcctCatgActvnDate is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshIp00404AcctCatgActvnDate() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginIp00404AcctCatgActvnDate
			                 ,IP_00404_ACCT_CATG_ACTVN_DATE_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ip00404AcctCatgActvnDate", beginIp00404AcctCatgActvnDate,IP_00404_ACCT_CATG_ACTVN_DATE_LEN);
    }
   	}
     int localIp00404ChipConversionSwCounter = -1;
     public boolean isIp00404ChipConversionSwModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp00404ChipConversionSwCounter != sharedCounter;
         localIp00404ChipConversionSwCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_00404_CHIP_CONVERSION_SW_LEN = 1;
	/**
	 * 	serialize this Ip00404ChipConversionSw
	 */
   protected void serializeIp00404ChipConversionSw(char[] ip00404ChipConversionSw) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip00404ChipConversionSw,0,getStringValue(),beginIp00404ChipConversionSw,IP_00404_CHIP_CONVERSION_SW_LEN);
       localIp00404ChipConversionSwCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp00404ChipConversionSwConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp00404ChipConversionSw is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp00404ChipConversionSw() {	 
   		return (substring(getStringValue(),beginIp00404ChipConversionSw,beginIp00404ChipConversionSw + IP_00404_CHIP_CONVERSION_SW_LEN));
   	}
     int localIp00404CoBrandSwCounter = -1;
     public boolean isIp00404CoBrandSwModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp00404CoBrandSwCounter != sharedCounter;
         localIp00404CoBrandSwCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_00404_CO_BRAND_SW_LEN = 1;
	/**
	 * 	serialize this Ip00404CoBrandSw
	 */
   protected void serializeIp00404CoBrandSw(char[] ip00404CoBrandSw) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip00404CoBrandSw,0,getStringValue(),beginIp00404CoBrandSw,IP_00404_CO_BRAND_SW_LEN);
       localIp00404CoBrandSwCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp00404CoBrandSwConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp00404CoBrandSw is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp00404CoBrandSw() {	 
   		return (substring(getStringValue(),beginIp00404CoBrandSw,beginIp00404CoBrandSw + IP_00404_CO_BRAND_SW_LEN));
   	}
     int localIp00404SpendControlRcnSwCounter = -1;
     public boolean isIp00404SpendControlRcnSwModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp00404SpendControlRcnSwCounter != sharedCounter;
         localIp00404SpendControlRcnSwCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_00404_SPEND_CONTROL_RCN_SW_LEN = 1;
	/**
	 * 	serialize this Ip00404SpendControlRcnSw
	 */
   protected void serializeIp00404SpendControlRcnSw(char[] ip00404SpendControlRcnSw) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip00404SpendControlRcnSw,0,getStringValue(),beginIp00404SpendControlRcnSw,IP_00404_SPEND_CONTROL_RCN_SW_LEN);
       localIp00404SpendControlRcnSwCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp00404SpendControlRcnSwConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp00404SpendControlRcnSw is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp00404SpendControlRcnSw() {	 
   		return (substring(getStringValue(),beginIp00404SpendControlRcnSw,beginIp00404SpendControlRcnSw + IP_00404_SPEND_CONTROL_RCN_SW_LEN));
   	}
     int localIp00404MerchCleanServPartCounter = -1;
     public boolean isIp00404MerchCleanServPartModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp00404MerchCleanServPartCounter != sharedCounter;
         localIp00404MerchCleanServPartCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_00404_MERCH_CLEAN_SERV_PART_LEN = 3;
	/**
	 * 	serialize this Ip00404MerchCleanServPart
	 */
   protected void serializeIp00404MerchCleanServPart(char[] ip00404MerchCleanServPart) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip00404MerchCleanServPart,0,getStringValue(),beginIp00404MerchCleanServPart,IP_00404_MERCH_CLEAN_SERV_PART_LEN);
       localIp00404MerchCleanServPartCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp00404MerchCleanServPartConstraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshIp00404MerchCleanServPart is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp00404MerchCleanServPart() {	 
   		return (substring(getStringValue(),beginIp00404MerchCleanServPart,beginIp00404MerchCleanServPart + IP_00404_MERCH_CLEAN_SERV_PART_LEN));
   	}
     int localIp00404MerchCleanActvDateCounter = -1;
     public boolean isIp00404MerchCleanActvDateModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp00404MerchCleanActvDateCounter != sharedCounter;
         localIp00404MerchCleanActvDateCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ip00404MerchCleanActvDate
	 *	@return ip00404MerchCleanActvDate
	 */
	public char[]  getIp00404MerchCleanActvDateString() {
	     return getCharArray(beginIp00404MerchCleanActvDate,IP_00404_MERCH_CLEAN_ACTV_DATE_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip00404MerchCleanActvDateIsNumeric() {
	    return isNumeric(beginIp00404MerchCleanActvDate
	                    ,beginIp00404MerchCleanActvDate + IP_00404_MERCH_CLEAN_ACTV_DATE_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int IP_00404_MERCH_CLEAN_ACTV_DATE_LEN = 6;
  	/**
	 * serializeIp00404MerchCleanActvDate
	 */
	protected void serializeIp00404MerchCleanActvDate(long ip00404MerchCleanActvDate) {
		 putNumber(beginIp00404MerchCleanActvDate,ip00404MerchCleanActvDate,IP_00404_MERCH_CLEAN_ACTV_DATE_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localIp00404MerchCleanActvDateCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeIp00404MerchCleanActvDate
	 */
   	protected  long serializeIp00404MerchCleanActvDate(char[] value) {
	    long  ip00404MerchCleanActvDate;
	    if(value.length >0 && value.length!= 6)
            value = new String(value).trim().toCharArray();
	    if (value.length < 6) value = pad(6, value, ' ', LEFT_PAD);
	    else if (value.length > 6) value = substring(value,0,6);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ip00404MerchCleanActvDate = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(6,value,false/*isSigned?*/)
		       ,beginIp00404MerchCleanActvDate
		       ,6
		      );
		 localIp00404MerchCleanActvDateCounter = shareString.getSerializedField().getModifiedCounter();
		return  ip00404MerchCleanActvDate;
    }

   protected long checkIp00404MerchCleanActvDateMaxLimit(long number) {

        return checkMaxLimit(number , MAX_1M/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshIp00404MerchCleanActvDate is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshIp00404MerchCleanActvDate() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginIp00404MerchCleanActvDate
			                 ,IP_00404_MERCH_CLEAN_ACTV_DATE_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ip00404MerchCleanActvDate", beginIp00404MerchCleanActvDate,IP_00404_MERCH_CLEAN_ACTV_DATE_LEN);
    }
   	}
     int localIp00404PaypassEnabledIndCounter = -1;
     public boolean isIp00404PaypassEnabledIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp00404PaypassEnabledIndCounter != sharedCounter;
         localIp00404PaypassEnabledIndCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_00404_PAYPASS_ENABLED_IND_LEN = 1;
	/**
	 * 	serialize this Ip00404PaypassEnabledInd
	 */
   protected void serializeIp00404PaypassEnabledInd(char[] ip00404PaypassEnabledInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip00404PaypassEnabledInd,0,getStringValue(),beginIp00404PaypassEnabledInd,IP_00404_PAYPASS_ENABLED_IND_LEN);
       localIp00404PaypassEnabledIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp00404PaypassEnabledIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp00404PaypassEnabledInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp00404PaypassEnabledInd() {	 
   		return (substring(getStringValue(),beginIp00404PaypassEnabledInd,beginIp00404PaypassEnabledInd + IP_00404_PAYPASS_ENABLED_IND_LEN));
   	}
     int localIp00404RateTypeIndicatorCounter = -1;
     public boolean isIp00404RateTypeIndicatorModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp00404RateTypeIndicatorCounter != sharedCounter;
         localIp00404RateTypeIndicatorCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_00404_RATE_TYPE_INDICATOR_LEN = 1;
	/**
	 * 	serialize this Ip00404RateTypeIndicator
	 */
   protected void serializeIp00404RateTypeIndicator(char[] ip00404RateTypeIndicator) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip00404RateTypeIndicator,0,getStringValue(),beginIp00404RateTypeIndicator,IP_00404_RATE_TYPE_INDICATOR_LEN);
       localIp00404RateTypeIndicatorCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp00404RateTypeIndicatorConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp00404RateTypeIndicator is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp00404RateTypeIndicator() {	 
   		return (substring(getStringValue(),beginIp00404RateTypeIndicator,beginIp00404RateTypeIndicator + IP_00404_RATE_TYPE_INDICATOR_LEN));
   	}
     int localIp00404RoutePsnIndicatorCounter = -1;
     public boolean isIp00404RoutePsnIndicatorModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp00404RoutePsnIndicatorCounter != sharedCounter;
         localIp00404RoutePsnIndicatorCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_00404_ROUTE_PSN_INDICATOR_LEN = 1;
	/**
	 * 	serialize this Ip00404RoutePsnIndicator
	 */
   protected void serializeIp00404RoutePsnIndicator(char[] ip00404RoutePsnIndicator) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip00404RoutePsnIndicator,0,getStringValue(),beginIp00404RoutePsnIndicator,IP_00404_ROUTE_PSN_INDICATOR_LEN);
       localIp00404RoutePsnIndicatorCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp00404RoutePsnIndicatorConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp00404RoutePsnIndicator is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp00404RoutePsnIndicator() {	 
   		return (substring(getStringValue(),beginIp00404RoutePsnIndicator,beginIp00404RoutePsnIndicator + IP_00404_ROUTE_PSN_INDICATOR_LEN));
   	}
     int localIp00404CbwpIndicatorCounter = -1;
     public boolean isIp00404CbwpIndicatorModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp00404CbwpIndicatorCounter != sharedCounter;
         localIp00404CbwpIndicatorCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_00404_CBWP_INDICATOR_LEN = 1;
	/**
	 * 	serialize this Ip00404CbwpIndicator
	 */
   protected void serializeIp00404CbwpIndicator(char[] ip00404CbwpIndicator) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip00404CbwpIndicator,0,getStringValue(),beginIp00404CbwpIndicator,IP_00404_CBWP_INDICATOR_LEN);
       localIp00404CbwpIndicatorCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp00404CbwpIndicatorConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp00404CbwpIndicator is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp00404CbwpIndicator() {	 
   		return (substring(getStringValue(),beginIp00404CbwpIndicator,beginIp00404CbwpIndicator + IP_00404_CBWP_INDICATOR_LEN));
   	}
     int localIp00404FlexParticipIndCounter = -1;
     public boolean isIp00404FlexParticipIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp00404FlexParticipIndCounter != sharedCounter;
         localIp00404FlexParticipIndCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_00404_FLEX_PARTICIP_IND_LEN = 1;
	/**
	 * 	serialize this Ip00404FlexParticipInd
	 */
   protected void serializeIp00404FlexParticipInd(char[] ip00404FlexParticipInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip00404FlexParticipInd,0,getStringValue(),beginIp00404FlexParticipInd,IP_00404_FLEX_PARTICIP_IND_LEN);
       localIp00404FlexParticipIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp00404FlexParticipIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp00404FlexParticipInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp00404FlexParticipInd() {	 
   		return (substring(getStringValue(),beginIp00404FlexParticipInd,beginIp00404FlexParticipInd + IP_00404_FLEX_PARTICIP_IND_LEN));
   	}
     int localIp00404RepwrRldIndCounter = -1;
     public boolean isIp00404RepwrRldIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp00404RepwrRldIndCounter != sharedCounter;
         localIp00404RepwrRldIndCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_00404_REPWR_RLD_IND_LEN = 1;
	/**
	 * 	serialize this Ip00404RepwrRldInd
	 */
   protected void serializeIp00404RepwrRldInd(char[] ip00404RepwrRldInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip00404RepwrRldInd,0,getStringValue(),beginIp00404RepwrRldInd,IP_00404_REPWR_RLD_IND_LEN);
       localIp00404RepwrRldIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp00404RepwrRldIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp00404RepwrRldInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp00404RepwrRldInd() {	 
   		return (substring(getStringValue(),beginIp00404RepwrRldInd,beginIp00404RepwrRldInd + IP_00404_REPWR_RLD_IND_LEN));
   	}
     int localIp00404MoneySendIndCounter = -1;
     public boolean isIp00404MoneySendIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp00404MoneySendIndCounter != sharedCounter;
         localIp00404MoneySendIndCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_00404_MONEY_SEND_IND_LEN = 1;
	/**
	 * 	serialize this Ip00404MoneySendInd
	 */
   protected void serializeIp00404MoneySendInd(char[] ip00404MoneySendInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip00404MoneySendInd,0,getStringValue(),beginIp00404MoneySendInd,IP_00404_MONEY_SEND_IND_LEN);
       localIp00404MoneySendIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp00404MoneySendIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp00404MoneySendInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp00404MoneySendInd() {	 
   		return (substring(getStringValue(),beginIp00404MoneySendInd,beginIp00404MoneySendInd + IP_00404_MONEY_SEND_IND_LEN));
   	}
     int localIp00404RegulatedRateIndSwCounter = -1;
     public boolean isIp00404RegulatedRateIndSwModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp00404RegulatedRateIndSwCounter != sharedCounter;
         localIp00404RegulatedRateIndSwCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_00404_REGULATED_RATE_IND_SW_LEN = 1;
	/**
	 * 	serialize this Ip00404RegulatedRateIndSw
	 */
   protected void serializeIp00404RegulatedRateIndSw(char[] ip00404RegulatedRateIndSw) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip00404RegulatedRateIndSw,0,getStringValue(),beginIp00404RegulatedRateIndSw,IP_00404_REGULATED_RATE_IND_SW_LEN);
       localIp00404RegulatedRateIndSwCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp00404RegulatedRateIndSwConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp00404RegulatedRateIndSw is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp00404RegulatedRateIndSw() {	 
   		return (substring(getStringValue(),beginIp00404RegulatedRateIndSw,beginIp00404RegulatedRateIndSw + IP_00404_REGULATED_RATE_IND_SW_LEN));
   	}
     int localIp00404CashAccessSwCounter = -1;
     public boolean isIp00404CashAccessSwModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp00404CashAccessSwCounter != sharedCounter;
         localIp00404CashAccessSwCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_00404_CASH_ACCESS_SW_LEN = 1;
	/**
	 * 	serialize this Ip00404CashAccessSw
	 */
   protected void serializeIp00404CashAccessSw(char[] ip00404CashAccessSw) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip00404CashAccessSw,0,getStringValue(),beginIp00404CashAccessSw,IP_00404_CASH_ACCESS_SW_LEN);
       localIp00404CashAccessSwCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp00404CashAccessSwConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp00404CashAccessSw is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp00404CashAccessSw() {	 
   		return (substring(getStringValue(),beginIp00404CashAccessSw,beginIp00404CashAccessSw + IP_00404_CASH_ACCESS_SW_LEN));
   	}
     int localIp00404PersonPresentIndCounter = -1;
     public boolean isIp00404PersonPresentIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp00404PersonPresentIndCounter != sharedCounter;
         localIp00404PersonPresentIndCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ip00404PersonPresentInd
	 *	@return ip00404PersonPresentInd
	 */
	public char[]  getIp00404PersonPresentIndString() {
	     return getCharArray(beginIp00404PersonPresentInd,IP_00404_PERSON_PRESENT_IND_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip00404PersonPresentIndIsNumeric() {
	    return isNumeric(beginIp00404PersonPresentInd
	                    ,beginIp00404PersonPresentInd + IP_00404_PERSON_PRESENT_IND_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int IP_00404_PERSON_PRESENT_IND_LEN = 1;
  	/**
	 * serializeIp00404PersonPresentInd
	 */
	protected void serializeIp00404PersonPresentInd(int ip00404PersonPresentInd) {
		 putNumber(beginIp00404PersonPresentInd,ip00404PersonPresentInd,IP_00404_PERSON_PRESENT_IND_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localIp00404PersonPresentIndCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeIp00404PersonPresentInd
	 */
   	protected  int serializeIp00404PersonPresentInd(char[] value) {
	    int  ip00404PersonPresentInd;
	    if(value.length >0 && value.length!= 1)
            value = new String(value).trim().toCharArray();
	    if (value.length < 1) value = pad(1, value, ' ', LEFT_PAD);
	    else if (value.length > 1) value = substring(value,0,1);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ip00404PersonPresentInd = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(1,value,false/*isSigned?*/)
		       ,beginIp00404PersonPresentInd
		       ,1
		      );
		 localIp00404PersonPresentIndCounter = shareString.getSerializedField().getModifiedCounter();
		return  ip00404PersonPresentInd;
    }

   protected int checkIp00404PersonPresentIndMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshIp00404PersonPresentInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshIp00404PersonPresentInd() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginIp00404PersonPresentInd
			                 ,IP_00404_PERSON_PRESENT_IND_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ip00404PersonPresentInd", beginIp00404PersonPresentInd,IP_00404_PERSON_PRESENT_IND_LEN);
    }
   	}
     int localIp00404CrossBdrExceptionCounter = -1;
     public boolean isIp00404CrossBdrExceptionModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp00404CrossBdrExceptionCounter != sharedCounter;
         localIp00404CrossBdrExceptionCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_00404_CROSS_BDR_EXCEPTION_LEN = 1;
	/**
	 * 	serialize this Ip00404CrossBdrException
	 */
   protected void serializeIp00404CrossBdrException(char[] ip00404CrossBdrException) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip00404CrossBdrException,0,getStringValue(),beginIp00404CrossBdrException,IP_00404_CROSS_BDR_EXCEPTION_LEN);
       localIp00404CrossBdrExceptionCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp00404CrossBdrExceptionConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp00404CrossBdrException is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp00404CrossBdrException() {	 
   		return (substring(getStringValue(),beginIp00404CrossBdrException,beginIp00404CrossBdrException + IP_00404_CROSS_BDR_EXCEPTION_LEN));
   	}
     int localIp00404IssTargetMarketIndCounter = -1;
     public boolean isIp00404IssTargetMarketIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp00404IssTargetMarketIndCounter != sharedCounter;
         localIp00404IssTargetMarketIndCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_00404_ISS_TARGET_MARKET_IND_LEN = 1;
	/**
	 * 	serialize this Ip00404IssTargetMarketInd
	 */
   protected void serializeIp00404IssTargetMarketInd(char[] ip00404IssTargetMarketInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip00404IssTargetMarketInd,0,getStringValue(),beginIp00404IssTargetMarketInd,IP_00404_ISS_TARGET_MARKET_IND_LEN);
       localIp00404IssTargetMarketIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp00404IssTargetMarketIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp00404IssTargetMarketInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp00404IssTargetMarketInd() {	 
   		return (substring(getStringValue(),beginIp00404IssTargetMarketInd,beginIp00404IssTargetMarketInd + IP_00404_ISS_TARGET_MARKET_IND_LEN));
   	}
     int localIp00404PostDateServSwCounter = -1;
     public boolean isIp00404PostDateServSwModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp00404PostDateServSwCounter != sharedCounter;
         localIp00404PostDateServSwCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_00404_POST_DATE_SERV_SW_LEN = 1;
	/**
	 * 	serialize this Ip00404PostDateServSw
	 */
   protected void serializeIp00404PostDateServSw(char[] ip00404PostDateServSw) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip00404PostDateServSw,0,getStringValue(),beginIp00404PostDateServSw,IP_00404_POST_DATE_SERV_SW_LEN);
       localIp00404PostDateServSwCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp00404PostDateServSwConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp00404PostDateServSw is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp00404PostDateServSw() {	 
   		return (substring(getStringValue(),beginIp00404PostDateServSw,beginIp00404PostDateServSw + IP_00404_POST_DATE_SERV_SW_LEN));
   	}
     int localIp00404MealVoucherIndCounter = -1;
     public boolean isIp00404MealVoucherIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp00404MealVoucherIndCounter != sharedCounter;
         localIp00404MealVoucherIndCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_00404_MEAL_VOUCHER_IND_LEN = 1;
	/**
	 * 	serialize this Ip00404MealVoucherInd
	 */
   protected void serializeIp00404MealVoucherInd(char[] ip00404MealVoucherInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip00404MealVoucherInd,0,getStringValue(),beginIp00404MealVoucherInd,IP_00404_MEAL_VOUCHER_IND_LEN);
       localIp00404MealVoucherIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp00404MealVoucherIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp00404MealVoucherInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp00404MealVoucherInd() {	 
   		return (substring(getStringValue(),beginIp00404MealVoucherInd,beginIp00404MealVoucherInd + IP_00404_MEAL_VOUCHER_IND_LEN));
   	}
     int localIp00404NonRldblPrpdSwCounter = -1;
     public boolean isIp00404NonRldblPrpdSwModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp00404NonRldblPrpdSwCounter != sharedCounter;
         localIp00404NonRldblPrpdSwCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_00404_NON_RLDBL_PRPD_SW_LEN = 2;
	/**
	 * 	serialize this Ip00404NonRldblPrpdSw
	 */
   protected void serializeIp00404NonRldblPrpdSw(char[] ip00404NonRldblPrpdSw) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip00404NonRldblPrpdSw,0,getStringValue(),beginIp00404NonRldblPrpdSw,IP_00404_NON_RLDBL_PRPD_SW_LEN);
       localIp00404NonRldblPrpdSwCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp00404NonRldblPrpdSwConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshIp00404NonRldblPrpdSw is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp00404NonRldblPrpdSw() {	 
   		return (substring(getStringValue(),beginIp00404NonRldblPrpdSw,beginIp00404NonRldblPrpdSw + IP_00404_NON_RLDBL_PRPD_SW_LEN));
   	}
     int localIp00404FasterFundsIndCounter = -1;
     public boolean isIp00404FasterFundsIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp00404FasterFundsIndCounter != sharedCounter;
         localIp00404FasterFundsIndCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_00404_FASTER_FUNDS_IND_LEN = 1;
	/**
	 * 	serialize this Ip00404FasterFundsInd
	 */
   protected void serializeIp00404FasterFundsInd(char[] ip00404FasterFundsInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip00404FasterFundsInd,0,getStringValue(),beginIp00404FasterFundsInd,IP_00404_FASTER_FUNDS_IND_LEN);
       localIp00404FasterFundsIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp00404FasterFundsIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp00404FasterFundsInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp00404FasterFundsInd() {	 
   		return (substring(getStringValue(),beginIp00404FasterFundsInd,beginIp00404FasterFundsInd + IP_00404_FASTER_FUNDS_IND_LEN));
   	}
     int localIp00404AnonPrepaidIndCounter = -1;
     public boolean isIp00404AnonPrepaidIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp00404AnonPrepaidIndCounter != sharedCounter;
         localIp00404AnonPrepaidIndCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_00404_ANON_PREPAID_IND_LEN = 1;
	/**
	 * 	serialize this Ip00404AnonPrepaidInd
	 */
   protected void serializeIp00404AnonPrepaidInd(char[] ip00404AnonPrepaidInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip00404AnonPrepaidInd,0,getStringValue(),beginIp00404AnonPrepaidInd,IP_00404_ANON_PREPAID_IND_LEN);
       localIp00404AnonPrepaidIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp00404AnonPrepaidIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp00404AnonPrepaidInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp00404AnonPrepaidInd() {	 
   		return (substring(getStringValue(),beginIp00404AnonPrepaidInd,beginIp00404AnonPrepaidInd + IP_00404_ANON_PREPAID_IND_LEN));
   	}
     int localIp00404DccStatusIndCounter = -1;
     public boolean isIp00404DccStatusIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp00404DccStatusIndCounter != sharedCounter;
         localIp00404DccStatusIndCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_00404_DCC_STATUS_IND_LEN = 1;
	/**
	 * 	serialize this Ip00404DccStatusInd
	 */
   protected void serializeIp00404DccStatusInd(char[] ip00404DccStatusInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip00404DccStatusInd,0,getStringValue(),beginIp00404DccStatusInd,IP_00404_DCC_STATUS_IND_LEN);
       localIp00404DccStatusIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp00404DccStatusIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp00404DccStatusInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp00404DccStatusInd() {	 
   		return (substring(getStringValue(),beginIp00404DccStatusInd,beginIp00404DccStatusInd + IP_00404_DCC_STATUS_IND_LEN));
   	}
     int localIp00404PayByAcctIndCounter = -1;
     public boolean isIp00404PayByAcctIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp00404PayByAcctIndCounter != sharedCounter;
         localIp00404PayByAcctIndCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_00404_PAY_BY_ACCT_IND_LEN = 1;
	/**
	 * 	serialize this Ip00404PayByAcctInd
	 */
   protected void serializeIp00404PayByAcctInd(char[] ip00404PayByAcctInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip00404PayByAcctInd,0,getStringValue(),beginIp00404PayByAcctInd,IP_00404_PAY_BY_ACCT_IND_LEN);
       localIp00404PayByAcctIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp00404PayByAcctIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp00404PayByAcctInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp00404PayByAcctInd() {	 
   		return (substring(getStringValue(),beginIp00404PayByAcctInd,beginIp00404PayByAcctInd + IP_00404_PAY_BY_ACCT_IND_LEN));
   	}
     int localIp00404IssGamParticipSwCounter = -1;
     public boolean isIp00404IssGamParticipSwModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp00404IssGamParticipSwCounter != sharedCounter;
         localIp00404IssGamParticipSwCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_00404_ISS_GAM_PARTICIP_SW_LEN = 1;
	/**
	 * 	serialize this Ip00404IssGamParticipSw
	 */
   protected void serializeIp00404IssGamParticipSw(char[] ip00404IssGamParticipSw) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip00404IssGamParticipSw,0,getStringValue(),beginIp00404IssGamParticipSw,IP_00404_ISS_GAM_PARTICIP_SW_LEN);
       localIp00404IssGamParticipSwCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp00404IssGamParticipSwConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp00404IssGamParticipSw is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp00404IssGamParticipSw() {	 
   		return (substring(getStringValue(),beginIp00404IssGamParticipSw,beginIp00404IssGamParticipSw + IP_00404_ISS_GAM_PARTICIP_SW_LEN));
   	}
     int localIp00404MemberFillerCounter = -1;
     public boolean isIp00404MemberFillerModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp00404MemberFillerCounter != sharedCounter;
         localIp00404MemberFillerCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_00404_MEMBER_FILLER_LEN = 14;
	/**
	 * 	serialize this Ip00404MemberFiller
	 */
   protected void serializeIp00404MemberFiller(char[] ip00404MemberFiller) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip00404MemberFiller,0,getStringValue(),beginIp00404MemberFiller,IP_00404_MEMBER_FILLER_LEN);
       localIp00404MemberFillerCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp00404MemberFillerConstraints(char[] value) {
   			return super.checkConstraints(value , 14 ,false, false);
   }
    /**
	 *	refreshIp00404MemberFiller is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp00404MemberFiller() {	 
   		return (substring(getStringValue(),beginIp00404MemberFiller,beginIp00404MemberFiller + IP_00404_MEMBER_FILLER_LEN));
   	}
     int localIp00404ChbConvExclIdCounter = -1;
     public boolean isIp00404ChbConvExclIdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp00404ChbConvExclIdCounter != sharedCounter;
         localIp00404ChbConvExclIdCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_00404_CHB_CONV_EXCL_ID_LEN = 1;
	/**
	 * 	serialize this Ip00404ChbConvExclId
	 */
   protected void serializeIp00404ChbConvExclId(char[] ip00404ChbConvExclId) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip00404ChbConvExclId,0,getStringValue(),beginIp00404ChbConvExclId,IP_00404_CHB_CONV_EXCL_ID_LEN);
       localIp00404ChbConvExclIdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp00404ChbConvExclIdConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp00404ChbConvExclId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp00404ChbConvExclId() {	 
   		return (substring(getStringValue(),beginIp00404ChbConvExclId,beginIp00404ChbConvExclId + IP_00404_CHB_CONV_EXCL_ID_LEN));
   	}
     int localIp00404ChbConvExclExpireCounter = -1;
     public boolean isIp00404ChbConvExclExpireModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp00404ChbConvExclExpireCounter != sharedCounter;
         localIp00404ChbConvExclExpireCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ip00404ChbConvExclExpire
	 *	@return ip00404ChbConvExclExpire
	 */
	public char[]  getIp00404ChbConvExclExpireString() {
	     return getCharArray(beginIp00404ChbConvExclExpire,IP_00404_CHB_CONV_EXCL_EXPIRE_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip00404ChbConvExclExpireIsNumeric() {
	    return isNumeric(beginIp00404ChbConvExclExpire
	                    ,beginIp00404ChbConvExclExpire + IP_00404_CHB_CONV_EXCL_EXPIRE_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int IP_00404_CHB_CONV_EXCL_EXPIRE_LEN = 6;
  	/**
	 * serializeIp00404ChbConvExclExpire
	 */
	protected void serializeIp00404ChbConvExclExpire(long ip00404ChbConvExclExpire) {
		 putNumber(beginIp00404ChbConvExclExpire,ip00404ChbConvExclExpire,IP_00404_CHB_CONV_EXCL_EXPIRE_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localIp00404ChbConvExclExpireCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeIp00404ChbConvExclExpire
	 */
   	protected  long serializeIp00404ChbConvExclExpire(char[] value) {
	    long  ip00404ChbConvExclExpire;
	    if(value.length >0 && value.length!= 6)
            value = new String(value).trim().toCharArray();
	    if (value.length < 6) value = pad(6, value, ' ', LEFT_PAD);
	    else if (value.length > 6) value = substring(value,0,6);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ip00404ChbConvExclExpire = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(6,value,false/*isSigned?*/)
		       ,beginIp00404ChbConvExclExpire
		       ,6
		      );
		 localIp00404ChbConvExclExpireCounter = shareString.getSerializedField().getModifiedCounter();
		return  ip00404ChbConvExclExpire;
    }

   protected long checkIp00404ChbConvExclExpireMaxLimit(long number) {

        return checkMaxLimit(number , MAX_1M/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshIp00404ChbConvExclExpire is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshIp00404ChbConvExclExpire() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginIp00404ChbConvExclExpire
			                 ,IP_00404_CHB_CONV_EXCL_EXPIRE_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ip00404ChbConvExclExpire", beginIp00404ChbConvExclExpire,IP_00404_CHB_CONV_EXCL_EXPIRE_LEN);
    }
   	}
     int localIp00404HardshipIndicatorCounter = -1;
     public boolean isIp00404HardshipIndicatorModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp00404HardshipIndicatorCounter != sharedCounter;
         localIp00404HardshipIndicatorCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_00404_HARDSHIP_INDICATOR_LEN = 1;
	/**
	 * 	serialize this Ip00404HardshipIndicator
	 */
   protected void serializeIp00404HardshipIndicator(char[] ip00404HardshipIndicator) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip00404HardshipIndicator,0,getStringValue(),beginIp00404HardshipIndicator,IP_00404_HARDSHIP_INDICATOR_LEN);
       localIp00404HardshipIndicatorCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp00404HardshipIndicatorConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp00404HardshipIndicator is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp00404HardshipIndicator() {	 
   		return (substring(getStringValue(),beginIp00404HardshipIndicator,beginIp00404HardshipIndicator + IP_00404_HARDSHIP_INDICATOR_LEN));
   	}
     int localIp00404HardshipEffectiveCounter = -1;
     public boolean isIp00404HardshipEffectiveModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp00404HardshipEffectiveCounter != sharedCounter;
         localIp00404HardshipEffectiveCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ip00404HardshipEffective
	 *	@return ip00404HardshipEffective
	 */
	public char[]  getIp00404HardshipEffectiveString() {
	     return getCharArray(beginIp00404HardshipEffective,IP_00404_HARDSHIP_EFFECTIVE_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip00404HardshipEffectiveIsNumeric() {
	    return isNumeric(beginIp00404HardshipEffective
	                    ,beginIp00404HardshipEffective + IP_00404_HARDSHIP_EFFECTIVE_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int IP_00404_HARDSHIP_EFFECTIVE_LEN = 6;
  	/**
	 * serializeIp00404HardshipEffective
	 */
	protected void serializeIp00404HardshipEffective(long ip00404HardshipEffective) {
		 putNumber(beginIp00404HardshipEffective,ip00404HardshipEffective,IP_00404_HARDSHIP_EFFECTIVE_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localIp00404HardshipEffectiveCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeIp00404HardshipEffective
	 */
   	protected  long serializeIp00404HardshipEffective(char[] value) {
	    long  ip00404HardshipEffective;
	    if(value.length >0 && value.length!= 6)
            value = new String(value).trim().toCharArray();
	    if (value.length < 6) value = pad(6, value, ' ', LEFT_PAD);
	    else if (value.length > 6) value = substring(value,0,6);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ip00404HardshipEffective = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(6,value,false/*isSigned?*/)
		       ,beginIp00404HardshipEffective
		       ,6
		      );
		 localIp00404HardshipEffectiveCounter = shareString.getSerializedField().getModifiedCounter();
		return  ip00404HardshipEffective;
    }

   protected long checkIp00404HardshipEffectiveMaxLimit(long number) {

        return checkMaxLimit(number , MAX_1M/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshIp00404HardshipEffective is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshIp00404HardshipEffective() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginIp00404HardshipEffective
			                 ,IP_00404_HARDSHIP_EFFECTIVE_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ip00404HardshipEffective", beginIp00404HardshipEffective,IP_00404_HARDSHIP_EFFECTIVE_LEN);
    }
   	}
     int localIp00404HardshipExpirationCounter = -1;
     public boolean isIp00404HardshipExpirationModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp00404HardshipExpirationCounter != sharedCounter;
         localIp00404HardshipExpirationCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ip00404HardshipExpiration
	 *	@return ip00404HardshipExpiration
	 */
	public char[]  getIp00404HardshipExpirationString() {
	     return getCharArray(beginIp00404HardshipExpiration,IP_00404_HARDSHIP_EXPIRATION_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip00404HardshipExpirationIsNumeric() {
	    return isNumeric(beginIp00404HardshipExpiration
	                    ,beginIp00404HardshipExpiration + IP_00404_HARDSHIP_EXPIRATION_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int IP_00404_HARDSHIP_EXPIRATION_LEN = 6;
  	/**
	 * serializeIp00404HardshipExpiration
	 */
	protected void serializeIp00404HardshipExpiration(long ip00404HardshipExpiration) {
		 putNumber(beginIp00404HardshipExpiration,ip00404HardshipExpiration,IP_00404_HARDSHIP_EXPIRATION_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localIp00404HardshipExpirationCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeIp00404HardshipExpiration
	 */
   	protected  long serializeIp00404HardshipExpiration(char[] value) {
	    long  ip00404HardshipExpiration;
	    if(value.length >0 && value.length!= 6)
            value = new String(value).trim().toCharArray();
	    if (value.length < 6) value = pad(6, value, ' ', LEFT_PAD);
	    else if (value.length > 6) value = substring(value,0,6);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ip00404HardshipExpiration = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(6,value,false/*isSigned?*/)
		       ,beginIp00404HardshipExpiration
		       ,6
		      );
		 localIp00404HardshipExpirationCounter = shareString.getSerializedField().getModifiedCounter();
		return  ip00404HardshipExpiration;
    }

   protected long checkIp00404HardshipExpirationMaxLimit(long number) {

        return checkMaxLimit(number , MAX_1M/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshIp00404HardshipExpiration is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshIp00404HardshipExpiration() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginIp00404HardshipExpiration
			                 ,IP_00404_HARDSHIP_EXPIRATION_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ip00404HardshipExpiration", beginIp00404HardshipExpiration,IP_00404_HARDSHIP_EXPIRATION_LEN);
    }
   	}
     int localIp00404GamingCountrySwCounter = -1;
     public boolean isIp00404GamingCountrySwModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp00404GamingCountrySwCounter != sharedCounter;
         localIp00404GamingCountrySwCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_00404_GAMING_COUNTRY_SW_LEN = 1;
	/**
	 * 	serialize this Ip00404GamingCountrySw
	 */
   protected void serializeIp00404GamingCountrySw(char[] ip00404GamingCountrySw) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip00404GamingCountrySw,0,getStringValue(),beginIp00404GamingCountrySw,IP_00404_GAMING_COUNTRY_SW_LEN);
       localIp00404GamingCountrySwCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp00404GamingCountrySwConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp00404GamingCountrySw is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp00404GamingCountrySw() {	 
   		return (substring(getStringValue(),beginIp00404GamingCountrySw,beginIp00404GamingCountrySw + IP_00404_GAMING_COUNTRY_SW_LEN));
   	}
     int localIp00404CrossBorderIndCounter = -1;
     public boolean isIp00404CrossBorderIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp00404CrossBorderIndCounter != sharedCounter;
         localIp00404CrossBorderIndCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ip00404CrossBorderInd
	 *	@return ip00404CrossBorderInd
	 */
	public char[]  getIp00404CrossBorderIndString() {
	     return getCharArray(beginIp00404CrossBorderInd,IP_00404_CROSS_BORDER_IND_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip00404CrossBorderIndIsNumeric() {
	    return isNumeric(beginIp00404CrossBorderInd
	                    ,beginIp00404CrossBorderInd + IP_00404_CROSS_BORDER_IND_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int IP_00404_CROSS_BORDER_IND_LEN = 1;
  	/**
	 * serializeIp00404CrossBorderInd
	 */
	protected void serializeIp00404CrossBorderInd(int ip00404CrossBorderInd) {
		 putNumber(beginIp00404CrossBorderInd,ip00404CrossBorderInd,IP_00404_CROSS_BORDER_IND_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localIp00404CrossBorderIndCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeIp00404CrossBorderInd
	 */
   	protected  int serializeIp00404CrossBorderInd(char[] value) {
	    int  ip00404CrossBorderInd;
	    if(value.length >0 && value.length!= 1)
            value = new String(value).trim().toCharArray();
	    if (value.length < 1) value = pad(1, value, ' ', LEFT_PAD);
	    else if (value.length > 1) value = substring(value,0,1);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ip00404CrossBorderInd = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(1,value,false/*isSigned?*/)
		       ,beginIp00404CrossBorderInd
		       ,1
		      );
		 localIp00404CrossBorderIndCounter = shareString.getSerializedField().getModifiedCounter();
		return  ip00404CrossBorderInd;
    }

   protected int checkIp00404CrossBorderIndMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshIp00404CrossBorderInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshIp00404CrossBorderInd() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginIp00404CrossBorderInd
			                 ,IP_00404_CROSS_BORDER_IND_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ip00404CrossBorderInd", beginIp00404CrossBorderInd,IP_00404_CROSS_BORDER_IND_LEN);
    }
   	}
     int localIp00404RecPaymtCanSwCounter = -1;
     public boolean isIp00404RecPaymtCanSwModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp00404RecPaymtCanSwCounter != sharedCounter;
         localIp00404RecPaymtCanSwCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_00404_REC_PAYMT_CAN_SW_LEN = 1;
	/**
	 * 	serialize this Ip00404RecPaymtCanSw
	 */
   protected void serializeIp00404RecPaymtCanSw(char[] ip00404RecPaymtCanSw) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip00404RecPaymtCanSw,0,getStringValue(),beginIp00404RecPaymtCanSw,IP_00404_REC_PAYMT_CAN_SW_LEN);
       localIp00404RecPaymtCanSwCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp00404RecPaymtCanSwConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp00404RecPaymtCanSw is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp00404RecPaymtCanSw() {	 
   		return (substring(getStringValue(),beginIp00404RecPaymtCanSw,beginIp00404RecPaymtCanSw + IP_00404_REC_PAYMT_CAN_SW_LEN));
   	}
     int localIp00404DomDbtParticipSwCounter = -1;
     public boolean isIp00404DomDbtParticipSwModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp00404DomDbtParticipSwCounter != sharedCounter;
         localIp00404DomDbtParticipSwCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_00404_DOM_DBT_PARTICIP_SW_LEN = 1;
	/**
	 * 	serialize this Ip00404DomDbtParticipSw
	 */
   protected void serializeIp00404DomDbtParticipSw(char[] ip00404DomDbtParticipSw) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip00404DomDbtParticipSw,0,getStringValue(),beginIp00404DomDbtParticipSw,IP_00404_DOM_DBT_PARTICIP_SW_LEN);
       localIp00404DomDbtParticipSwCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp00404DomDbtParticipSwConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp00404DomDbtParticipSw is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp00404DomDbtParticipSw() {	 
   		return (substring(getStringValue(),beginIp00404DomDbtParticipSw,beginIp00404DomDbtParticipSw + IP_00404_DOM_DBT_PARTICIP_SW_LEN));
   	}
     int localIp00404IpcFraudCtlSwCounter = -1;
     public boolean isIp00404IpcFraudCtlSwModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp00404IpcFraudCtlSwCounter != sharedCounter;
         localIp00404IpcFraudCtlSwCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_00404_IPC_FRAUD_CTL_SW_LEN = 1;
	/**
	 * 	serialize this Ip00404IpcFraudCtlSw
	 */
   protected void serializeIp00404IpcFraudCtlSw(char[] ip00404IpcFraudCtlSw) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip00404IpcFraudCtlSw,0,getStringValue(),beginIp00404IpcFraudCtlSw,IP_00404_IPC_FRAUD_CTL_SW_LEN);
       localIp00404IpcFraudCtlSwCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp00404IpcFraudCtlSwConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp00404IpcFraudCtlSw is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp00404IpcFraudCtlSw() {	 
   		return (substring(getStringValue(),beginIp00404IpcFraudCtlSw,beginIp00404IpcFraudCtlSw + IP_00404_IPC_FRAUD_CTL_SW_LEN));
   	}
     int localIp00404IccrParticipIndCounter = -1;
     public boolean isIp00404IccrParticipIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp00404IccrParticipIndCounter != sharedCounter;
         localIp00404IccrParticipIndCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_00404_ICCR_PARTICIP_IND_LEN = 1;
	/**
	 * 	serialize this Ip00404IccrParticipInd
	 */
   protected void serializeIp00404IccrParticipInd(char[] ip00404IccrParticipInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip00404IccrParticipInd,0,getStringValue(),beginIp00404IccrParticipInd,IP_00404_ICCR_PARTICIP_IND_LEN);
       localIp00404IccrParticipIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp00404IccrParticipIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp00404IccrParticipInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp00404IccrParticipInd() {	 
   		return (substring(getStringValue(),beginIp00404IccrParticipInd,beginIp00404IccrParticipInd + IP_00404_ICCR_PARTICIP_IND_LEN));
   	}
     int localIp00404RevCreditIndCounter = -1;
     public boolean isIp00404RevCreditIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp00404RevCreditIndCounter != sharedCounter;
         localIp00404RevCreditIndCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_00404_REV_CREDIT_IND_LEN = 1;
	/**
	 * 	serialize this Ip00404RevCreditInd
	 */
   protected void serializeIp00404RevCreditInd(char[] ip00404RevCreditInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip00404RevCreditInd,0,getStringValue(),beginIp00404RevCreditInd,IP_00404_REV_CREDIT_IND_LEN);
       localIp00404RevCreditIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp00404RevCreditIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp00404RevCreditInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp00404RevCreditInd() {	 
   		return (substring(getStringValue(),beginIp00404RevCreditInd,beginIp00404RevCreditInd + IP_00404_REV_CREDIT_IND_LEN));
   	}
     int localIp00404ChgbkBkoutIndCounter = -1;
     public boolean isIp00404ChgbkBkoutIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp00404ChgbkBkoutIndCounter != sharedCounter;
         localIp00404ChgbkBkoutIndCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_00404_CHGBK_BKOUT_IND_LEN = 1;
	/**
	 * 	serialize this Ip00404ChgbkBkoutInd
	 */
   protected void serializeIp00404ChgbkBkoutInd(char[] ip00404ChgbkBkoutInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip00404ChgbkBkoutInd,0,getStringValue(),beginIp00404ChgbkBkoutInd,IP_00404_CHGBK_BKOUT_IND_LEN);
       localIp00404ChgbkBkoutIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp00404ChgbkBkoutIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp00404ChgbkBkoutInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp00404ChgbkBkoutInd() {	 
   		return (substring(getStringValue(),beginIp00404ChgbkBkoutInd,beginIp00404ChgbkBkoutInd + IP_00404_CHGBK_BKOUT_IND_LEN));
   	}
     int localIp00404RtnTrnstNumCounter = -1;
     public boolean isIp00404RtnTrnstNumModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp00404RtnTrnstNumCounter != sharedCounter;
         localIp00404RtnTrnstNumCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_00404_RTN_TRNST_NUM_LEN = 10;
	/**
	 * 	serialize this Ip00404RtnTrnstNum
	 */
   protected void serializeIp00404RtnTrnstNum(char[] ip00404RtnTrnstNum) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip00404RtnTrnstNum,0,getStringValue(),beginIp00404RtnTrnstNum,IP_00404_RTN_TRNST_NUM_LEN);
       localIp00404RtnTrnstNumCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp00404RtnTrnstNumConstraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshIp00404RtnTrnstNum is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp00404RtnTrnstNum() {	 
   		return (substring(getStringValue(),beginIp00404RtnTrnstNum,beginIp00404RtnTrnstNum + IP_00404_RTN_TRNST_NUM_LEN));
   	}
     int localIp00404TrueIssuerIcaCounter = -1;
     public boolean isIp00404TrueIssuerIcaModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp00404TrueIssuerIcaCounter != sharedCounter;
         localIp00404TrueIssuerIcaCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ip00404TrueIssuerIca
	 *	@return ip00404TrueIssuerIca
	 */
	public char[]  getIp00404TrueIssuerIcaString() {
	     return getCharArray(beginIp00404TrueIssuerIca,IP_00404_TRUE_ISSUER_ICA_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip00404TrueIssuerIcaIsNumeric() {
	    return isNumeric(beginIp00404TrueIssuerIca
	                    ,beginIp00404TrueIssuerIca + IP_00404_TRUE_ISSUER_ICA_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int IP_00404_TRUE_ISSUER_ICA_LEN = 11;
  	/**
	 * serializeIp00404TrueIssuerIca
	 */
	protected void serializeIp00404TrueIssuerIca(long ip00404TrueIssuerIca) {
		 putNumber(beginIp00404TrueIssuerIca,ip00404TrueIssuerIca,IP_00404_TRUE_ISSUER_ICA_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localIp00404TrueIssuerIcaCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeIp00404TrueIssuerIca
	 */
   	protected  long serializeIp00404TrueIssuerIca(char[] value) {
	    long  ip00404TrueIssuerIca;
	    if(value.length >0 && value.length!= 11)
            value = new String(value).trim().toCharArray();
	    if (value.length < 11) value = pad(11, value, ' ', LEFT_PAD);
	    else if (value.length > 11) value = substring(value,0,11);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ip00404TrueIssuerIca = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(11,value,false/*isSigned?*/)
		       ,beginIp00404TrueIssuerIca
		       ,11
		      );
		 localIp00404TrueIssuerIcaCounter = shareString.getSerializedField().getModifiedCounter();
		return  ip00404TrueIssuerIca;
    }

   protected long checkIp00404TrueIssuerIcaMaxLimit(long number) {

        return checkMaxLimit(number , MAX_100G/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshIp00404TrueIssuerIca is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshIp00404TrueIssuerIca() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginIp00404TrueIssuerIca
			                 ,IP_00404_TRUE_ISSUER_ICA_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ip00404TrueIssuerIca", beginIp00404TrueIssuerIca,IP_00404_TRUE_ISSUER_ICA_LEN);
    }
   	}
     int localIp00404MerchantTaxIdSwCounter = -1;
     public boolean isIp00404MerchantTaxIdSwModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp00404MerchantTaxIdSwCounter != sharedCounter;
         localIp00404MerchantTaxIdSwCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_00404_MERCHANT_TAX_ID_SW_LEN = 1;
	/**
	 * 	serialize this Ip00404MerchantTaxIdSw
	 */
   protected void serializeIp00404MerchantTaxIdSw(char[] ip00404MerchantTaxIdSw) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip00404MerchantTaxIdSw,0,getStringValue(),beginIp00404MerchantTaxIdSw,IP_00404_MERCHANT_TAX_ID_SW_LEN);
       localIp00404MerchantTaxIdSwCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp00404MerchantTaxIdSwConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp00404MerchantTaxIdSw is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp00404MerchantTaxIdSw() {	 
   		return (substring(getStringValue(),beginIp00404MerchantTaxIdSw,beginIp00404MerchantTaxIdSw + IP_00404_MERCHANT_TAX_ID_SW_LEN));
   	}
     int localIp00404InstallServSwCounter = -1;
     public boolean isIp00404InstallServSwModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp00404InstallServSwCounter != sharedCounter;
         localIp00404InstallServSwCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_00404_INSTALL_SERV_SW_LEN = 1;
	/**
	 * 	serialize this Ip00404InstallServSw
	 */
   protected void serializeIp00404InstallServSw(char[] ip00404InstallServSw) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip00404InstallServSw,0,getStringValue(),beginIp00404InstallServSw,IP_00404_INSTALL_SERV_SW_LEN);
       localIp00404InstallServSwCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp00404InstallServSwConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp00404InstallServSw is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp00404InstallServSw() {	 
   		return (substring(getStringValue(),beginIp00404InstallServSw,beginIp00404InstallServSw + IP_00404_INSTALL_SERV_SW_LEN));
   	}
     int localIp00404TokenServiceIndCounter = -1;
     public boolean isIp00404TokenServiceIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp00404TokenServiceIndCounter != sharedCounter;
         localIp00404TokenServiceIndCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_00404_TOKEN_SERVICE_IND_LEN = 1;
	/**
	 * 	serialize this Ip00404TokenServiceInd
	 */
   protected void serializeIp00404TokenServiceInd(char[] ip00404TokenServiceInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip00404TokenServiceInd,0,getStringValue(),beginIp00404TokenServiceInd,IP_00404_TOKEN_SERVICE_IND_LEN);
       localIp00404TokenServiceIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp00404TokenServiceIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp00404TokenServiceInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp00404TokenServiceInd() {	 
   		return (substring(getStringValue(),beginIp00404TokenServiceInd,beginIp00404TokenServiceInd + IP_00404_TOKEN_SERVICE_IND_LEN));
   	}
     int localIp00404GbsBillIndCounter = -1;
     public boolean isIp00404GbsBillIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp00404GbsBillIndCounter != sharedCounter;
         localIp00404GbsBillIndCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_00404_GBS_BILL_IND_LEN = 1;
	/**
	 * 	serialize this Ip00404GbsBillInd
	 */
   protected void serializeIp00404GbsBillInd(char[] ip00404GbsBillInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip00404GbsBillInd,0,getStringValue(),beginIp00404GbsBillInd,IP_00404_GBS_BILL_IND_LEN);
       localIp00404GbsBillIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp00404GbsBillIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp00404GbsBillInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp00404GbsBillInd() {	 
   		return (substring(getStringValue(),beginIp00404GbsBillInd,beginIp00404GbsBillInd + IP_00404_GBS_BILL_IND_LEN));
   	}
     int localIp00404InstallAuthSwCounter = -1;
     public boolean isIp00404InstallAuthSwModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp00404InstallAuthSwCounter != sharedCounter;
         localIp00404InstallAuthSwCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_00404_INSTALL_AUTH_SW_LEN = 1;
	/**
	 * 	serialize this Ip00404InstallAuthSw
	 */
   protected void serializeIp00404InstallAuthSw(char[] ip00404InstallAuthSw) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip00404InstallAuthSw,0,getStringValue(),beginIp00404InstallAuthSw,IP_00404_INSTALL_AUTH_SW_LEN);
       localIp00404InstallAuthSwCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp00404InstallAuthSwConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp00404InstallAuthSw is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp00404InstallAuthSw() {	 
   		return (substring(getStringValue(),beginIp00404InstallAuthSw,beginIp00404InstallAuthSw + IP_00404_INSTALL_AUTH_SW_LEN));
   	}
     int localIp00404SeqServiceIndCounter = -1;
     public boolean isIp00404SeqServiceIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp00404SeqServiceIndCounter != sharedCounter;
         localIp00404SeqServiceIndCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_00404_SEQ_SERVICE_IND_LEN = 1;
	/**
	 * 	serialize this Ip00404SeqServiceInd
	 */
   protected void serializeIp00404SeqServiceInd(char[] ip00404SeqServiceInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip00404SeqServiceInd,0,getStringValue(),beginIp00404SeqServiceInd,IP_00404_SEQ_SERVICE_IND_LEN);
       localIp00404SeqServiceIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp00404SeqServiceIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp00404SeqServiceInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp00404SeqServiceInd() {	 
   		return (substring(getStringValue(),beginIp00404SeqServiceInd,beginIp00404SeqServiceInd + IP_00404_SEQ_SERVICE_IND_LEN));
   	}
     int localIp00404CbfmParticipIndCounter = -1;
     public boolean isIp00404CbfmParticipIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp00404CbfmParticipIndCounter != sharedCounter;
         localIp00404CbfmParticipIndCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_00404_CBFM_PARTICIP_IND_LEN = 1;
	/**
	 * 	serialize this Ip00404CbfmParticipInd
	 */
   protected void serializeIp00404CbfmParticipInd(char[] ip00404CbfmParticipInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip00404CbfmParticipInd,0,getStringValue(),beginIp00404CbfmParticipInd,IP_00404_CBFM_PARTICIP_IND_LEN);
       localIp00404CbfmParticipIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp00404CbfmParticipIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp00404CbfmParticipInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp00404CbfmParticipInd() {	 
   		return (substring(getStringValue(),beginIp00404CbfmParticipInd,beginIp00404CbfmParticipInd + IP_00404_CBFM_PARTICIP_IND_LEN));
   	}
     int localIp00404CbcmParticipIndCounter = -1;
     public boolean isIp00404CbcmParticipIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp00404CbcmParticipIndCounter != sharedCounter;
         localIp00404CbcmParticipIndCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_00404_CBCM_PARTICIP_IND_LEN = 1;
	/**
	 * 	serialize this Ip00404CbcmParticipInd
	 */
   protected void serializeIp00404CbcmParticipInd(char[] ip00404CbcmParticipInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip00404CbcmParticipInd,0,getStringValue(),beginIp00404CbcmParticipInd,IP_00404_CBCM_PARTICIP_IND_LEN);
       localIp00404CbcmParticipIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp00404CbcmParticipIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp00404CbcmParticipInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp00404CbcmParticipInd() {	 
   		return (substring(getStringValue(),beginIp00404CbcmParticipInd,beginIp00404CbcmParticipInd + IP_00404_CBCM_PARTICIP_IND_LEN));
   	}
     int localIp00404CbfmDccSwCounter = -1;
     public boolean isIp00404CbfmDccSwModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp00404CbfmDccSwCounter != sharedCounter;
         localIp00404CbfmDccSwCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_00404_CBFM_DCC_SW_LEN = 1;
	/**
	 * 	serialize this Ip00404CbfmDccSw
	 */
   protected void serializeIp00404CbfmDccSw(char[] ip00404CbfmDccSw) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip00404CbfmDccSw,0,getStringValue(),beginIp00404CbfmDccSw,IP_00404_CBFM_DCC_SW_LEN);
       localIp00404CbfmDccSwCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp00404CbfmDccSwConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp00404CbfmDccSw is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp00404CbfmDccSw() {	 
   		return (substring(getStringValue(),beginIp00404CbfmDccSw,beginIp00404CbfmDccSw + IP_00404_CBFM_DCC_SW_LEN));
   	}
     int localIp00404InstApiGcmsSwCounter = -1;
     public boolean isIp00404InstApiGcmsSwModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp00404InstApiGcmsSwCounter != sharedCounter;
         localIp00404InstApiGcmsSwCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_00404_INST_API_GCMS_SW_LEN = 1;
	/**
	 * 	serialize this Ip00404InstApiGcmsSw
	 */
   protected void serializeIp00404InstApiGcmsSw(char[] ip00404InstApiGcmsSw) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip00404InstApiGcmsSw,0,getStringValue(),beginIp00404InstApiGcmsSw,IP_00404_INST_API_GCMS_SW_LEN);
       localIp00404InstApiGcmsSwCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp00404InstApiGcmsSwConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp00404InstApiGcmsSw is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp00404InstApiGcmsSw() {	 
   		return (substring(getStringValue(),beginIp00404InstApiGcmsSw,beginIp00404InstApiGcmsSw + IP_00404_INST_API_GCMS_SW_LEN));
   	}
     int localIp00404InsEnabApiIndCounter = -1;
     public boolean isIp00404InsEnabApiIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp00404InsEnabApiIndCounter != sharedCounter;
         localIp00404InsEnabApiIndCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_00404_INS_ENAB_API_IND_LEN = 1;
	/**
	 * 	serialize this Ip00404InsEnabApiInd
	 */
   protected void serializeIp00404InsEnabApiInd(char[] ip00404InsEnabApiInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip00404InsEnabApiInd,0,getStringValue(),beginIp00404InsEnabApiInd,IP_00404_INS_ENAB_API_IND_LEN);
       localIp00404InsEnabApiIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp00404InsEnabApiIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp00404InsEnabApiInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp00404InsEnabApiInd() {	 
   		return (substring(getStringValue(),beginIp00404InsEnabApiInd,beginIp00404InsEnabApiInd + IP_00404_INS_ENAB_API_IND_LEN));
   	}
     int localIp00404InstApiUiSwCounter = -1;
     public boolean isIp00404InstApiUiSwModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp00404InstApiUiSwCounter != sharedCounter;
         localIp00404InstApiUiSwCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_00404_INST_API_UI_SW_LEN = 1;
	/**
	 * 	serialize this Ip00404InstApiUiSw
	 */
   protected void serializeIp00404InstApiUiSw(char[] ip00404InstApiUiSw) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip00404InstApiUiSw,0,getStringValue(),beginIp00404InstApiUiSw,IP_00404_INST_API_UI_SW_LEN);
       localIp00404InstApiUiSwCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp00404InstApiUiSwConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp00404InstApiUiSw is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp00404InstApiUiSw() {	 
   		return (substring(getStringValue(),beginIp00404InstApiUiSw,beginIp00404InstApiUiSw + IP_00404_INST_API_UI_SW_LEN));
   	}
     int localIp00404FillerCounter = -1;
     public boolean isIp00404FillerModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp00404FillerCounter != sharedCounter;
         localIp00404FillerCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_00404_FILLER_LEN = 1;
	/**
	 * 	serialize this Ip00404Filler
	 */
   protected void serializeIp00404Filler(char[] ip00404Filler) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip00404Filler,0,getStringValue(),beginIp00404Filler,IP_00404_FILLER_LEN);
       localIp00404FillerCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp00404FillerConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp00404Filler is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp00404Filler() {	 
   		return (substring(getStringValue(),beginIp00404Filler,beginIp00404Filler + IP_00404_FILLER_LEN));
   	}
     int localIp00404MstrpassAchProgIndCounter = -1;
     public boolean isIp00404MstrpassAchProgIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp00404MstrpassAchProgIndCounter != sharedCounter;
         localIp00404MstrpassAchProgIndCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_00404_MSTRPASS_ACH_PROG_IND_LEN = 1;
	/**
	 * 	serialize this Ip00404MstrpassAchProgInd
	 */
   protected void serializeIp00404MstrpassAchProgInd(char[] ip00404MstrpassAchProgInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip00404MstrpassAchProgInd,0,getStringValue(),beginIp00404MstrpassAchProgInd,IP_00404_MSTRPASS_ACH_PROG_IND_LEN);
       localIp00404MstrpassAchProgIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp00404MstrpassAchProgIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp00404MstrpassAchProgInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp00404MstrpassAchProgInd() {	 
   		return (substring(getStringValue(),beginIp00404MstrpassAchProgInd,beginIp00404MstrpassAchProgInd + IP_00404_MSTRPASS_ACH_PROG_IND_LEN));
   	}
     int localIp00404OboServiceIndCounter = -1;
     public boolean isIp00404OboServiceIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp00404OboServiceIndCounter != sharedCounter;
         localIp00404OboServiceIndCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_00404_OBO_SERVICE_IND_LEN = 1;
	/**
	 * 	serialize this Ip00404OboServiceInd
	 */
   protected void serializeIp00404OboServiceInd(char[] ip00404OboServiceInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip00404OboServiceInd,0,getStringValue(),beginIp00404OboServiceInd,IP_00404_OBO_SERVICE_IND_LEN);
       localIp00404OboServiceIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp00404OboServiceIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp00404OboServiceInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp00404OboServiceInd() {	 
   		return (substring(getStringValue(),beginIp00404OboServiceInd,beginIp00404OboServiceInd + IP_00404_OBO_SERVICE_IND_LEN));
   	}
     int localIp00404MultCurrSwCounter = -1;
     public boolean isIp00404MultCurrSwModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp00404MultCurrSwCounter != sharedCounter;
         localIp00404MultCurrSwCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_00404_MULT_CURR_SW_LEN = 1;
	/**
	 * 	serialize this Ip00404MultCurrSw
	 */
   protected void serializeIp00404MultCurrSw(char[] ip00404MultCurrSw) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip00404MultCurrSw,0,getStringValue(),beginIp00404MultCurrSw,IP_00404_MULT_CURR_SW_LEN);
       localIp00404MultCurrSwCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp00404MultCurrSwConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp00404MultCurrSw is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp00404MultCurrSw() {	 
   		return (substring(getStringValue(),beginIp00404MultCurrSw,beginIp00404MultCurrSw + IP_00404_MULT_CURR_SW_LEN));
   	}
     int localIp00404AnonIndEffDateCounter = -1;
     public boolean isIp00404AnonIndEffDateModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp00404AnonIndEffDateCounter != sharedCounter;
         localIp00404AnonIndEffDateCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ip00404AnonIndEffDate
	 *	@return ip00404AnonIndEffDate
	 */
	public char[]  getIp00404AnonIndEffDateString() {
	     return getCharArray(beginIp00404AnonIndEffDate,IP_00404_ANON_IND_EFF_DATE_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip00404AnonIndEffDateIsNumeric() {
	    return isNumeric(beginIp00404AnonIndEffDate
	                    ,beginIp00404AnonIndEffDate + IP_00404_ANON_IND_EFF_DATE_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int IP_00404_ANON_IND_EFF_DATE_LEN = 6;
  	/**
	 * serializeIp00404AnonIndEffDate
	 */
	protected void serializeIp00404AnonIndEffDate(long ip00404AnonIndEffDate) {
		 putNumber(beginIp00404AnonIndEffDate,ip00404AnonIndEffDate,IP_00404_ANON_IND_EFF_DATE_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localIp00404AnonIndEffDateCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeIp00404AnonIndEffDate
	 */
   	protected  long serializeIp00404AnonIndEffDate(char[] value) {
	    long  ip00404AnonIndEffDate;
	    if(value.length >0 && value.length!= 6)
            value = new String(value).trim().toCharArray();
	    if (value.length < 6) value = pad(6, value, ' ', LEFT_PAD);
	    else if (value.length > 6) value = substring(value,0,6);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ip00404AnonIndEffDate = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(6,value,false/*isSigned?*/)
		       ,beginIp00404AnonIndEffDate
		       ,6
		      );
		 localIp00404AnonIndEffDateCounter = shareString.getSerializedField().getModifiedCounter();
		return  ip00404AnonIndEffDate;
    }

   protected long checkIp00404AnonIndEffDateMaxLimit(long number) {

        return checkMaxLimit(number , MAX_1M/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshIp00404AnonIndEffDate is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshIp00404AnonIndEffDate() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginIp00404AnonIndEffDate
			                 ,IP_00404_ANON_IND_EFF_DATE_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ip00404AnonIndEffDate", beginIp00404AnonIndEffDate,IP_00404_ANON_IND_EFF_DATE_LEN);
    }
   	}
     int localIp00404CbfmEcbRateParIndCounter = -1;
     public boolean isIp00404CbfmEcbRateParIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp00404CbfmEcbRateParIndCounter != sharedCounter;
         localIp00404CbfmEcbRateParIndCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_00404_CBFM_ECB_RATE_PAR_IND_LEN = 1;
	/**
	 * 	serialize this Ip00404CbfmEcbRateParInd
	 */
   protected void serializeIp00404CbfmEcbRateParInd(char[] ip00404CbfmEcbRateParInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip00404CbfmEcbRateParInd,0,getStringValue(),beginIp00404CbfmEcbRateParInd,IP_00404_CBFM_ECB_RATE_PAR_IND_LEN);
       localIp00404CbfmEcbRateParIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp00404CbfmEcbRateParIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp00404CbfmEcbRateParInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp00404CbfmEcbRateParInd() {	 
   		return (substring(getStringValue(),beginIp00404CbfmEcbRateParInd,beginIp00404CbfmEcbRateParInd + IP_00404_CBFM_ECB_RATE_PAR_IND_LEN));
   	}
     int localIp00404AlmXbOptOutIndCounter = -1;
     public boolean isIp00404AlmXbOptOutIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp00404AlmXbOptOutIndCounter != sharedCounter;
         localIp00404AlmXbOptOutIndCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_00404_ALM_XB_OPT_OUT_IND_LEN = 1;
	/**
	 * 	serialize this Ip00404AlmXbOptOutInd
	 */
   protected void serializeIp00404AlmXbOptOutInd(char[] ip00404AlmXbOptOutInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip00404AlmXbOptOutInd,0,getStringValue(),beginIp00404AlmXbOptOutInd,IP_00404_ALM_XB_OPT_OUT_IND_LEN);
       localIp00404AlmXbOptOutIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp00404AlmXbOptOutIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp00404AlmXbOptOutInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp00404AlmXbOptOutInd() {	 
   		return (substring(getStringValue(),beginIp00404AlmXbOptOutInd,beginIp00404AlmXbOptOutInd + IP_00404_ALM_XB_OPT_OUT_IND_LEN));
   	}
     int localIp00404JpnNonmdesTknrngSwCounter = -1;
     public boolean isIp00404JpnNonmdesTknrngSwModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp00404JpnNonmdesTknrngSwCounter != sharedCounter;
         localIp00404JpnNonmdesTknrngSwCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_00404_JPN_NONMDES_TKNRNG_SW_LEN = 1;
	/**
	 * 	serialize this Ip00404JpnNonmdesTknrngSw
	 */
   protected void serializeIp00404JpnNonmdesTknrngSw(char[] ip00404JpnNonmdesTknrngSw) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip00404JpnNonmdesTknrngSw,0,getStringValue(),beginIp00404JpnNonmdesTknrngSw,IP_00404_JPN_NONMDES_TKNRNG_SW_LEN);
       localIp00404JpnNonmdesTknrngSwCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp00404JpnNonmdesTknrngSwConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp00404JpnNonmdesTknrngSw is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp00404JpnNonmdesTknrngSw() {	 
   		return (substring(getStringValue(),beginIp00404JpnNonmdesTknrngSw,beginIp00404JpnNonmdesTknrngSw + IP_00404_JPN_NONMDES_TKNRNG_SW_LEN));
   	}




}
  
