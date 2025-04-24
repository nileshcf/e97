package com.cloudframe.app.ip606130.dto.serialize;

/**
*  The class Ip0040TableDataFieldsSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:32. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip0040TableDataFieldsSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip0040TableDataFieldsSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_0040_TABLE_DATA_FIELDS_LENGTH = 151;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp0040AccRangeH;
            protected  int beginIp0040Ab;
            protected  int beginIp0040PriorityCode;
            protected  int beginIp0040PrfxIca;
            protected  int beginIp0040ProductType;
            protected  int beginIp0040Endpoint;
            protected  int beginIp0040Country;
            protected  int beginIp0040CountryNum;
            protected  int beginIp0040ProductClass;
            protected  int beginIp0040TranRoutingInd;
            protected  int beginIp0040PrsProdReassgnSw;
            protected  int beginIp0040ProdReassignmentSw;
            protected  int beginIp0040OptInFlag;
            protected  int beginIp0040LicensedProdId;
            protected  int beginIp0040VirtFundPanInd;
            protected  int beginIp0040AcctCatgPartSw;
            protected  int beginIp0040AcctCatgActvnDate;
            protected  int beginIp0040ChipConversionSw;
            protected  int beginIp0040CoBrandSw;
            protected  int beginIp0040SpendControlRcnSw;
            protected  int beginIp0040MerchCleanServPart;
            protected  int beginIp0040MerchCleanActvDate;
            protected  int beginIp0040PaypassEnabledInd;
            protected  int beginIp0040RateTypeIndicator;
            protected  int beginIp0040RoutePsnIndicator;
            protected  int beginIp0040CbwpIndicator;
            protected  int beginIp0040FlexParticipInd;
            protected  int beginIp0040RepwrRldInd;
            protected  int beginIp0040MoneySendInd;
            protected  int beginIp0040RegulatedRateIndSw;
            protected  int beginIp0040CashAccessSw;
            protected  int beginIp0040PersonPresentInd;
            protected  int beginIp0040CrossBdrException;
            protected  int beginIp0040IssTargetMarketInd;
            protected  int beginIp0040PostDateServSw;
            protected  int beginIp0040MealVoucherInd;
            protected  int beginIp0040NonRldblPrpdSw;
            protected  int beginIp0040FasterFundsInd;
            protected  int beginIp0040AnonPrepaidInd;
            protected  int beginIp0040DccStatusInd;
            protected  int beginIp0040MemberFiller;
	
	/**
	* Constructor for Ip0040TableDataFieldsSerialized
	**/
    public Ip0040TableDataFieldsSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ip0040TableDataFieldsSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip0040TableDataFieldsSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ip0040TableDataFieldsSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,41); // serialize this field at offset 41 by default 
    }
    
	/**
	* sets parent for this Ip0040TableDataFieldsSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 41 by default
    }    
	/**
	* initializes the field in Ip0040TableDataFieldsSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_0040_TABLE_DATA_FIELDS_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp0040AccRangeH = getStartOffset() + 0;	// set offset for serialization
  
             beginIp0040Ab = getStartOffset() + 19;	// set offset for serialization
  
             beginIp0040PriorityCode = getStartOffset() + 22;	// set offset for serialization
  
             beginIp0040PrfxIca = getStartOffset() + 24;	// set offset for serialization
  
             beginIp0040ProductType = getStartOffset() + 35;	// set offset for serialization
  
             beginIp0040Endpoint = getStartOffset() + 36;	// set offset for serialization
  
             beginIp0040Country = getStartOffset() + 43;	// set offset for serialization
  
             beginIp0040CountryNum = getStartOffset() + 46;	// set offset for serialization
  
  
             beginIp0040ProductClass = getStartOffset() + 50;	// set offset for serialization
  
             beginIp0040TranRoutingInd = getStartOffset() + 53;	// set offset for serialization
  
             beginIp0040PrsProdReassgnSw = getStartOffset() + 54;	// set offset for serialization
  
             beginIp0040ProdReassignmentSw = getStartOffset() + 55;	// set offset for serialization
  
             beginIp0040OptInFlag = getStartOffset() + 56;	// set offset for serialization
  
             beginIp0040LicensedProdId = getStartOffset() + 57;	// set offset for serialization
  
             beginIp0040VirtFundPanInd = getStartOffset() + 60;	// set offset for serialization
  
             beginIp0040AcctCatgPartSw = getStartOffset() + 61;	// set offset for serialization
  
             beginIp0040AcctCatgActvnDate = getStartOffset() + 62;	// set offset for serialization
  
  
             beginIp0040ChipConversionSw = getStartOffset() + 100;	// set offset for serialization
  
  
             beginIp0040CoBrandSw = getStartOffset() + 107;	// set offset for serialization
  
             beginIp0040SpendControlRcnSw = getStartOffset() + 108;	// set offset for serialization
  
             beginIp0040MerchCleanServPart = getStartOffset() + 109;	// set offset for serialization
  
             beginIp0040MerchCleanActvDate = getStartOffset() + 112;	// set offset for serialization
  
             beginIp0040PaypassEnabledInd = getStartOffset() + 118;	// set offset for serialization
  
             beginIp0040RateTypeIndicator = getStartOffset() + 119;	// set offset for serialization
  
             beginIp0040RoutePsnIndicator = getStartOffset() + 120;	// set offset for serialization
  
             beginIp0040CbwpIndicator = getStartOffset() + 121;	// set offset for serialization
  
             beginIp0040FlexParticipInd = getStartOffset() + 122;	// set offset for serialization
  
             beginIp0040RepwrRldInd = getStartOffset() + 123;	// set offset for serialization
  
             beginIp0040MoneySendInd = getStartOffset() + 124;	// set offset for serialization
  
             beginIp0040RegulatedRateIndSw = getStartOffset() + 125;	// set offset for serialization
  
             beginIp0040CashAccessSw = getStartOffset() + 126;	// set offset for serialization
  
             beginIp0040PersonPresentInd = getStartOffset() + 127;	// set offset for serialization
  
             beginIp0040CrossBdrException = getStartOffset() + 128;	// set offset for serialization
  
             beginIp0040IssTargetMarketInd = getStartOffset() + 129;	// set offset for serialization
  
             beginIp0040PostDateServSw = getStartOffset() + 130;	// set offset for serialization
  
             beginIp0040MealVoucherInd = getStartOffset() + 131;	// set offset for serialization
  
             beginIp0040NonRldblPrpdSw = getStartOffset() + 132;	// set offset for serialization
  
             beginIp0040FasterFundsInd = getStartOffset() + 134;	// set offset for serialization
  
             beginIp0040AnonPrepaidInd = getStartOffset() + 135;	// set offset for serialization
  
             beginIp0040DccStatusInd = getStartOffset() + 136;	// set offset for serialization
  
             beginIp0040MemberFiller = getStartOffset() + 137;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localIp0040AccRangeHCounter = -1;
     public boolean isIp0040AccRangeHModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp0040AccRangeHCounter != sharedCounter;
         localIp0040AccRangeHCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_0040_ACC_RANGE_H_LEN = 19;
	/**
	 * 	serialize this Ip0040AccRangeH
	 */
   protected void serializeIp0040AccRangeH(char[] ip0040AccRangeH) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip0040AccRangeH,0,getStringValue(),beginIp0040AccRangeH,IP_0040_ACC_RANGE_H_LEN);
       localIp0040AccRangeHCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp0040AccRangeHConstraints(char[] value) {
   			return super.checkConstraints(value , 19 ,false, false);
   }
    /**
	 *	refreshIp0040AccRangeH is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp0040AccRangeH() {	 
   		return (substring(getStringValue(),beginIp0040AccRangeH,beginIp0040AccRangeH + IP_0040_ACC_RANGE_H_LEN));
   	}
     int localIp0040AbCounter = -1;
     public boolean isIp0040AbModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp0040AbCounter != sharedCounter;
         localIp0040AbCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_0040_AB_LEN = 3;
	/**
	 * 	serialize this Ip0040Ab
	 */
   protected void serializeIp0040Ab(char[] ip0040Ab) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip0040Ab,0,getStringValue(),beginIp0040Ab,IP_0040_AB_LEN);
       localIp0040AbCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp0040AbConstraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshIp0040Ab is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp0040Ab() {	 
   		return (substring(getStringValue(),beginIp0040Ab,beginIp0040Ab + IP_0040_AB_LEN));
   	}
     int localIp0040PriorityCodeCounter = -1;
     public boolean isIp0040PriorityCodeModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp0040PriorityCodeCounter != sharedCounter;
         localIp0040PriorityCodeCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ip0040PriorityCode
	 *	@return ip0040PriorityCode
	 */
	public char[]  getIp0040PriorityCodeString() {
	     return getCharArray(beginIp0040PriorityCode,IP_0040_PRIORITY_CODE_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip0040PriorityCodeIsNumeric() {
	    return isNumeric(beginIp0040PriorityCode
	                    ,beginIp0040PriorityCode + IP_0040_PRIORITY_CODE_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int IP_0040_PRIORITY_CODE_LEN = 2;
  	/**
	 * serializeIp0040PriorityCode
	 */
	protected void serializeIp0040PriorityCode(int ip0040PriorityCode) {
		 putNumber(beginIp0040PriorityCode,ip0040PriorityCode,IP_0040_PRIORITY_CODE_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localIp0040PriorityCodeCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeIp0040PriorityCode
	 */
   	protected  int serializeIp0040PriorityCode(char[] value) {
	    int  ip0040PriorityCode;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ip0040PriorityCode = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginIp0040PriorityCode
		       ,2
		      );
		 localIp0040PriorityCodeCounter = shareString.getSerializedField().getModifiedCounter();
		return  ip0040PriorityCode;
    }

   protected int checkIp0040PriorityCodeMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshIp0040PriorityCode is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshIp0040PriorityCode() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginIp0040PriorityCode
			                 ,IP_0040_PRIORITY_CODE_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ip0040PriorityCode", beginIp0040PriorityCode,IP_0040_PRIORITY_CODE_LEN);
    }
   	}
     int localIp0040PrfxIcaCounter = -1;
     public boolean isIp0040PrfxIcaModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp0040PrfxIcaCounter != sharedCounter;
         localIp0040PrfxIcaCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ip0040PrfxIca
	 *	@return ip0040PrfxIca
	 */
	public char[]  getIp0040PrfxIcaString() {
	     return getCharArray(beginIp0040PrfxIca,IP_0040_PRFX_ICA_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip0040PrfxIcaIsNumeric() {
	    return isNumeric(beginIp0040PrfxIca
	                    ,beginIp0040PrfxIca + IP_0040_PRFX_ICA_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int IP_0040_PRFX_ICA_LEN = 11;
  	/**
	 * serializeIp0040PrfxIca
	 */
	protected void serializeIp0040PrfxIca(long ip0040PrfxIca) {
		 putNumber(beginIp0040PrfxIca,ip0040PrfxIca,IP_0040_PRFX_ICA_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localIp0040PrfxIcaCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeIp0040PrfxIca
	 */
   	protected  long serializeIp0040PrfxIca(char[] value) {
	    long  ip0040PrfxIca;
	    if(value.length >0 && value.length!= 11)
            value = new String(value).trim().toCharArray();
	    if (value.length < 11) value = pad(11, value, ' ', LEFT_PAD);
	    else if (value.length > 11) value = substring(value,0,11);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ip0040PrfxIca = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(11,value,false/*isSigned?*/)
		       ,beginIp0040PrfxIca
		       ,11
		      );
		 localIp0040PrfxIcaCounter = shareString.getSerializedField().getModifiedCounter();
		return  ip0040PrfxIca;
    }

   protected long checkIp0040PrfxIcaMaxLimit(long number) {

        return checkMaxLimit(number , MAX_100G/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshIp0040PrfxIca is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshIp0040PrfxIca() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginIp0040PrfxIca
			                 ,IP_0040_PRFX_ICA_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ip0040PrfxIca", beginIp0040PrfxIca,IP_0040_PRFX_ICA_LEN);
    }
   	}
     int localIp0040ProductTypeCounter = -1;
     public boolean isIp0040ProductTypeModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp0040ProductTypeCounter != sharedCounter;
         localIp0040ProductTypeCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_0040_PRODUCT_TYPE_LEN = 1;
	/**
	 * 	serialize this Ip0040ProductType
	 */
   protected void serializeIp0040ProductType(char[] ip0040ProductType) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip0040ProductType,0,getStringValue(),beginIp0040ProductType,IP_0040_PRODUCT_TYPE_LEN);
       localIp0040ProductTypeCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp0040ProductTypeConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp0040ProductType is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp0040ProductType() {	 
   		return (substring(getStringValue(),beginIp0040ProductType,beginIp0040ProductType + IP_0040_PRODUCT_TYPE_LEN));
   	}
     int localIp0040EndpointCounter = -1;
     public boolean isIp0040EndpointModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp0040EndpointCounter != sharedCounter;
         localIp0040EndpointCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ip0040Endpoint
	 *	@return ip0040Endpoint
	 */
	public char[]  getIp0040EndpointString() {
	     return getCharArray(beginIp0040Endpoint,IP_0040_ENDPOINT_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip0040EndpointIsNumeric() {
	    return isNumeric(beginIp0040Endpoint
	                    ,beginIp0040Endpoint + IP_0040_ENDPOINT_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int IP_0040_ENDPOINT_LEN = 7;
  	/**
	 * serializeIp0040Endpoint
	 */
	protected void serializeIp0040Endpoint(long ip0040Endpoint) {
		 putNumber(beginIp0040Endpoint,ip0040Endpoint,IP_0040_ENDPOINT_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localIp0040EndpointCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeIp0040Endpoint
	 */
   	protected  long serializeIp0040Endpoint(char[] value) {
	    long  ip0040Endpoint;
	    if(value.length >0 && value.length!= 7)
            value = new String(value).trim().toCharArray();
	    if (value.length < 7) value = pad(7, value, ' ', LEFT_PAD);
	    else if (value.length > 7) value = substring(value,0,7);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ip0040Endpoint = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(7,value,false/*isSigned?*/)
		       ,beginIp0040Endpoint
		       ,7
		      );
		 localIp0040EndpointCounter = shareString.getSerializedField().getModifiedCounter();
		return  ip0040Endpoint;
    }

   protected long checkIp0040EndpointMaxLimit(long number) {

        return checkMaxLimit(number , MAX_10M/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshIp0040Endpoint is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshIp0040Endpoint() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginIp0040Endpoint
			                 ,IP_0040_ENDPOINT_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ip0040Endpoint", beginIp0040Endpoint,IP_0040_ENDPOINT_LEN);
    }
   	}
     int localIp0040CountryCounter = -1;
     public boolean isIp0040CountryModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp0040CountryCounter != sharedCounter;
         localIp0040CountryCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_0040_COUNTRY_LEN = 3;
	/**
	 * 	serialize this Ip0040Country
	 */
   protected void serializeIp0040Country(char[] ip0040Country) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip0040Country,0,getStringValue(),beginIp0040Country,IP_0040_COUNTRY_LEN);
       localIp0040CountryCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp0040CountryConstraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshIp0040Country is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp0040Country() {	 
   		return (substring(getStringValue(),beginIp0040Country,beginIp0040Country + IP_0040_COUNTRY_LEN));
   	}
     int localIp0040CountryNumCounter = -1;
     public boolean isIp0040CountryNumModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp0040CountryNumCounter != sharedCounter;
         localIp0040CountryNumCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ip0040CountryNum
	 *	@return ip0040CountryNum
	 */
	public char[]  getIp0040CountryNumString() {
	     return getCharArray(beginIp0040CountryNum,IP_0040_COUNTRY_NUM_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip0040CountryNumIsNumeric() {
	    return isNumeric(beginIp0040CountryNum
	                    ,beginIp0040CountryNum + IP_0040_COUNTRY_NUM_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int IP_0040_COUNTRY_NUM_LEN = 3;
  	/**
	 * serializeIp0040CountryNum
	 */
	protected void serializeIp0040CountryNum(int ip0040CountryNum) {
		 putNumber(beginIp0040CountryNum,ip0040CountryNum,IP_0040_COUNTRY_NUM_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localIp0040CountryNumCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeIp0040CountryNum
	 */
   	protected  int serializeIp0040CountryNum(char[] value) {
	    int  ip0040CountryNum;
	    if(value.length >0 && value.length!= 3)
            value = new String(value).trim().toCharArray();
	    if (value.length < 3) value = pad(3, value, ' ', LEFT_PAD);
	    else if (value.length > 3) value = substring(value,0,3);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ip0040CountryNum = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(3,value,false/*isSigned?*/)
		       ,beginIp0040CountryNum
		       ,3
		      );
		 localIp0040CountryNumCounter = shareString.getSerializedField().getModifiedCounter();
		return  ip0040CountryNum;
    }

   protected int checkIp0040CountryNumMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_1000/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshIp0040CountryNum is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshIp0040CountryNum() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginIp0040CountryNum
			                 ,IP_0040_COUNTRY_NUM_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ip0040CountryNum", beginIp0040CountryNum,IP_0040_COUNTRY_NUM_LEN);
    }
   	}
     int localIp0040ProductClassCounter = -1;
     public boolean isIp0040ProductClassModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp0040ProductClassCounter != sharedCounter;
         localIp0040ProductClassCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_0040_PRODUCT_CLASS_LEN = 3;
	/**
	 * 	serialize this Ip0040ProductClass
	 */
   protected void serializeIp0040ProductClass(char[] ip0040ProductClass) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip0040ProductClass,0,getStringValue(),beginIp0040ProductClass,IP_0040_PRODUCT_CLASS_LEN);
       localIp0040ProductClassCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp0040ProductClassConstraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshIp0040ProductClass is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp0040ProductClass() {	 
   		return (substring(getStringValue(),beginIp0040ProductClass,beginIp0040ProductClass + IP_0040_PRODUCT_CLASS_LEN));
   	}
     int localIp0040TranRoutingIndCounter = -1;
     public boolean isIp0040TranRoutingIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp0040TranRoutingIndCounter != sharedCounter;
         localIp0040TranRoutingIndCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_0040_TRAN_ROUTING_IND_LEN = 1;
	/**
	 * 	serialize this Ip0040TranRoutingInd
	 */
   protected void serializeIp0040TranRoutingInd(char[] ip0040TranRoutingInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip0040TranRoutingInd,0,getStringValue(),beginIp0040TranRoutingInd,IP_0040_TRAN_ROUTING_IND_LEN);
       localIp0040TranRoutingIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp0040TranRoutingIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp0040TranRoutingInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp0040TranRoutingInd() {	 
   		return (substring(getStringValue(),beginIp0040TranRoutingInd,beginIp0040TranRoutingInd + IP_0040_TRAN_ROUTING_IND_LEN));
   	}
     int localIp0040PrsProdReassgnSwCounter = -1;
     public boolean isIp0040PrsProdReassgnSwModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp0040PrsProdReassgnSwCounter != sharedCounter;
         localIp0040PrsProdReassgnSwCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_0040_PRS_PROD_REASSGN_SW_LEN = 1;
	/**
	 * 	serialize this Ip0040PrsProdReassgnSw
	 */
   protected void serializeIp0040PrsProdReassgnSw(char[] ip0040PrsProdReassgnSw) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip0040PrsProdReassgnSw,0,getStringValue(),beginIp0040PrsProdReassgnSw,IP_0040_PRS_PROD_REASSGN_SW_LEN);
       localIp0040PrsProdReassgnSwCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp0040PrsProdReassgnSwConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp0040PrsProdReassgnSw is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp0040PrsProdReassgnSw() {	 
   		return (substring(getStringValue(),beginIp0040PrsProdReassgnSw,beginIp0040PrsProdReassgnSw + IP_0040_PRS_PROD_REASSGN_SW_LEN));
   	}
     int localIp0040ProdReassignmentSwCounter = -1;
     public boolean isIp0040ProdReassignmentSwModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp0040ProdReassignmentSwCounter != sharedCounter;
         localIp0040ProdReassignmentSwCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_0040_PROD_REASSIGNMENT_SW_LEN = 1;
	/**
	 * 	serialize this Ip0040ProdReassignmentSw
	 */
   protected void serializeIp0040ProdReassignmentSw(char[] ip0040ProdReassignmentSw) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip0040ProdReassignmentSw,0,getStringValue(),beginIp0040ProdReassignmentSw,IP_0040_PROD_REASSIGNMENT_SW_LEN);
       localIp0040ProdReassignmentSwCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp0040ProdReassignmentSwConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp0040ProdReassignmentSw is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp0040ProdReassignmentSw() {	 
   		return (substring(getStringValue(),beginIp0040ProdReassignmentSw,beginIp0040ProdReassignmentSw + IP_0040_PROD_REASSIGNMENT_SW_LEN));
   	}
     int localIp0040OptInFlagCounter = -1;
     public boolean isIp0040OptInFlagModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp0040OptInFlagCounter != sharedCounter;
         localIp0040OptInFlagCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_0040_OPT_IN_FLAG_LEN = 1;
	/**
	 * 	serialize this Ip0040OptInFlag
	 */
   protected void serializeIp0040OptInFlag(char[] ip0040OptInFlag) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip0040OptInFlag,0,getStringValue(),beginIp0040OptInFlag,IP_0040_OPT_IN_FLAG_LEN);
       localIp0040OptInFlagCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp0040OptInFlagConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp0040OptInFlag is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp0040OptInFlag() {	 
   		return (substring(getStringValue(),beginIp0040OptInFlag,beginIp0040OptInFlag + IP_0040_OPT_IN_FLAG_LEN));
   	}
     int localIp0040LicensedProdIdCounter = -1;
     public boolean isIp0040LicensedProdIdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp0040LicensedProdIdCounter != sharedCounter;
         localIp0040LicensedProdIdCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_0040_LICENSED_PROD_ID_LEN = 3;
	/**
	 * 	serialize this Ip0040LicensedProdId
	 */
   protected void serializeIp0040LicensedProdId(char[] ip0040LicensedProdId) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip0040LicensedProdId,0,getStringValue(),beginIp0040LicensedProdId,IP_0040_LICENSED_PROD_ID_LEN);
       localIp0040LicensedProdIdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp0040LicensedProdIdConstraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshIp0040LicensedProdId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp0040LicensedProdId() {	 
   		return (substring(getStringValue(),beginIp0040LicensedProdId,beginIp0040LicensedProdId + IP_0040_LICENSED_PROD_ID_LEN));
   	}
     int localIp0040VirtFundPanIndCounter = -1;
     public boolean isIp0040VirtFundPanIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp0040VirtFundPanIndCounter != sharedCounter;
         localIp0040VirtFundPanIndCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_0040_VIRT_FUND_PAN_IND_LEN = 1;
	/**
	 * 	serialize this Ip0040VirtFundPanInd
	 */
   protected void serializeIp0040VirtFundPanInd(char[] ip0040VirtFundPanInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip0040VirtFundPanInd,0,getStringValue(),beginIp0040VirtFundPanInd,IP_0040_VIRT_FUND_PAN_IND_LEN);
       localIp0040VirtFundPanIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp0040VirtFundPanIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp0040VirtFundPanInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp0040VirtFundPanInd() {	 
   		return (substring(getStringValue(),beginIp0040VirtFundPanInd,beginIp0040VirtFundPanInd + IP_0040_VIRT_FUND_PAN_IND_LEN));
   	}
     int localIp0040AcctCatgPartSwCounter = -1;
     public boolean isIp0040AcctCatgPartSwModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp0040AcctCatgPartSwCounter != sharedCounter;
         localIp0040AcctCatgPartSwCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_0040_ACCT_CATG_PART_SW_LEN = 1;
	/**
	 * 	serialize this Ip0040AcctCatgPartSw
	 */
   protected void serializeIp0040AcctCatgPartSw(char[] ip0040AcctCatgPartSw) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip0040AcctCatgPartSw,0,getStringValue(),beginIp0040AcctCatgPartSw,IP_0040_ACCT_CATG_PART_SW_LEN);
       localIp0040AcctCatgPartSwCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp0040AcctCatgPartSwConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp0040AcctCatgPartSw is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp0040AcctCatgPartSw() {	 
   		return (substring(getStringValue(),beginIp0040AcctCatgPartSw,beginIp0040AcctCatgPartSw + IP_0040_ACCT_CATG_PART_SW_LEN));
   	}
     int localIp0040AcctCatgActvnDateCounter = -1;
     public boolean isIp0040AcctCatgActvnDateModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp0040AcctCatgActvnDateCounter != sharedCounter;
         localIp0040AcctCatgActvnDateCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ip0040AcctCatgActvnDate
	 *	@return ip0040AcctCatgActvnDate
	 */
	public char[]  getIp0040AcctCatgActvnDateString() {
	     return getCharArray(beginIp0040AcctCatgActvnDate,IP_0040_ACCT_CATG_ACTVN_DATE_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip0040AcctCatgActvnDateIsNumeric() {
	    return isNumeric(beginIp0040AcctCatgActvnDate
	                    ,beginIp0040AcctCatgActvnDate + IP_0040_ACCT_CATG_ACTVN_DATE_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int IP_0040_ACCT_CATG_ACTVN_DATE_LEN = 6;
  	/**
	 * serializeIp0040AcctCatgActvnDate
	 */
	protected void serializeIp0040AcctCatgActvnDate(long ip0040AcctCatgActvnDate) {
		 putNumber(beginIp0040AcctCatgActvnDate,ip0040AcctCatgActvnDate,IP_0040_ACCT_CATG_ACTVN_DATE_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localIp0040AcctCatgActvnDateCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeIp0040AcctCatgActvnDate
	 */
   	protected  long serializeIp0040AcctCatgActvnDate(char[] value) {
	    long  ip0040AcctCatgActvnDate;
	    if(value.length >0 && value.length!= 6)
            value = new String(value).trim().toCharArray();
	    if (value.length < 6) value = pad(6, value, ' ', LEFT_PAD);
	    else if (value.length > 6) value = substring(value,0,6);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ip0040AcctCatgActvnDate = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(6,value,false/*isSigned?*/)
		       ,beginIp0040AcctCatgActvnDate
		       ,6
		      );
		 localIp0040AcctCatgActvnDateCounter = shareString.getSerializedField().getModifiedCounter();
		return  ip0040AcctCatgActvnDate;
    }

   protected long checkIp0040AcctCatgActvnDateMaxLimit(long number) {

        return checkMaxLimit(number , MAX_1M/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshIp0040AcctCatgActvnDate is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshIp0040AcctCatgActvnDate() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginIp0040AcctCatgActvnDate
			                 ,IP_0040_ACCT_CATG_ACTVN_DATE_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ip0040AcctCatgActvnDate", beginIp0040AcctCatgActvnDate,IP_0040_ACCT_CATG_ACTVN_DATE_LEN);
    }
   	}
     int localIp0040ChipConversionSwCounter = -1;
     public boolean isIp0040ChipConversionSwModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp0040ChipConversionSwCounter != sharedCounter;
         localIp0040ChipConversionSwCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_0040_CHIP_CONVERSION_SW_LEN = 1;
	/**
	 * 	serialize this Ip0040ChipConversionSw
	 */
   protected void serializeIp0040ChipConversionSw(char[] ip0040ChipConversionSw) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip0040ChipConversionSw,0,getStringValue(),beginIp0040ChipConversionSw,IP_0040_CHIP_CONVERSION_SW_LEN);
       localIp0040ChipConversionSwCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp0040ChipConversionSwConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp0040ChipConversionSw is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp0040ChipConversionSw() {	 
   		return (substring(getStringValue(),beginIp0040ChipConversionSw,beginIp0040ChipConversionSw + IP_0040_CHIP_CONVERSION_SW_LEN));
   	}
     int localIp0040CoBrandSwCounter = -1;
     public boolean isIp0040CoBrandSwModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp0040CoBrandSwCounter != sharedCounter;
         localIp0040CoBrandSwCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_0040_CO_BRAND_SW_LEN = 1;
	/**
	 * 	serialize this Ip0040CoBrandSw
	 */
   protected void serializeIp0040CoBrandSw(char[] ip0040CoBrandSw) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip0040CoBrandSw,0,getStringValue(),beginIp0040CoBrandSw,IP_0040_CO_BRAND_SW_LEN);
       localIp0040CoBrandSwCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp0040CoBrandSwConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp0040CoBrandSw is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp0040CoBrandSw() {	 
   		return (substring(getStringValue(),beginIp0040CoBrandSw,beginIp0040CoBrandSw + IP_0040_CO_BRAND_SW_LEN));
   	}
     int localIp0040SpendControlRcnSwCounter = -1;
     public boolean isIp0040SpendControlRcnSwModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp0040SpendControlRcnSwCounter != sharedCounter;
         localIp0040SpendControlRcnSwCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_0040_SPEND_CONTROL_RCN_SW_LEN = 1;
	/**
	 * 	serialize this Ip0040SpendControlRcnSw
	 */
   protected void serializeIp0040SpendControlRcnSw(char[] ip0040SpendControlRcnSw) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip0040SpendControlRcnSw,0,getStringValue(),beginIp0040SpendControlRcnSw,IP_0040_SPEND_CONTROL_RCN_SW_LEN);
       localIp0040SpendControlRcnSwCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp0040SpendControlRcnSwConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp0040SpendControlRcnSw is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp0040SpendControlRcnSw() {	 
   		return (substring(getStringValue(),beginIp0040SpendControlRcnSw,beginIp0040SpendControlRcnSw + IP_0040_SPEND_CONTROL_RCN_SW_LEN));
   	}
     int localIp0040MerchCleanServPartCounter = -1;
     public boolean isIp0040MerchCleanServPartModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp0040MerchCleanServPartCounter != sharedCounter;
         localIp0040MerchCleanServPartCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_0040_MERCH_CLEAN_SERV_PART_LEN = 3;
	/**
	 * 	serialize this Ip0040MerchCleanServPart
	 */
   protected void serializeIp0040MerchCleanServPart(char[] ip0040MerchCleanServPart) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip0040MerchCleanServPart,0,getStringValue(),beginIp0040MerchCleanServPart,IP_0040_MERCH_CLEAN_SERV_PART_LEN);
       localIp0040MerchCleanServPartCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp0040MerchCleanServPartConstraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshIp0040MerchCleanServPart is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp0040MerchCleanServPart() {	 
   		return (substring(getStringValue(),beginIp0040MerchCleanServPart,beginIp0040MerchCleanServPart + IP_0040_MERCH_CLEAN_SERV_PART_LEN));
   	}
     int localIp0040MerchCleanActvDateCounter = -1;
     public boolean isIp0040MerchCleanActvDateModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp0040MerchCleanActvDateCounter != sharedCounter;
         localIp0040MerchCleanActvDateCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ip0040MerchCleanActvDate
	 *	@return ip0040MerchCleanActvDate
	 */
	public char[]  getIp0040MerchCleanActvDateString() {
	     return getCharArray(beginIp0040MerchCleanActvDate,IP_0040_MERCH_CLEAN_ACTV_DATE_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip0040MerchCleanActvDateIsNumeric() {
	    return isNumeric(beginIp0040MerchCleanActvDate
	                    ,beginIp0040MerchCleanActvDate + IP_0040_MERCH_CLEAN_ACTV_DATE_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int IP_0040_MERCH_CLEAN_ACTV_DATE_LEN = 6;
  	/**
	 * serializeIp0040MerchCleanActvDate
	 */
	protected void serializeIp0040MerchCleanActvDate(long ip0040MerchCleanActvDate) {
		 putNumber(beginIp0040MerchCleanActvDate,ip0040MerchCleanActvDate,IP_0040_MERCH_CLEAN_ACTV_DATE_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localIp0040MerchCleanActvDateCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeIp0040MerchCleanActvDate
	 */
   	protected  long serializeIp0040MerchCleanActvDate(char[] value) {
	    long  ip0040MerchCleanActvDate;
	    if(value.length >0 && value.length!= 6)
            value = new String(value).trim().toCharArray();
	    if (value.length < 6) value = pad(6, value, ' ', LEFT_PAD);
	    else if (value.length > 6) value = substring(value,0,6);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ip0040MerchCleanActvDate = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(6,value,false/*isSigned?*/)
		       ,beginIp0040MerchCleanActvDate
		       ,6
		      );
		 localIp0040MerchCleanActvDateCounter = shareString.getSerializedField().getModifiedCounter();
		return  ip0040MerchCleanActvDate;
    }

   protected long checkIp0040MerchCleanActvDateMaxLimit(long number) {

        return checkMaxLimit(number , MAX_1M/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshIp0040MerchCleanActvDate is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshIp0040MerchCleanActvDate() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginIp0040MerchCleanActvDate
			                 ,IP_0040_MERCH_CLEAN_ACTV_DATE_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ip0040MerchCleanActvDate", beginIp0040MerchCleanActvDate,IP_0040_MERCH_CLEAN_ACTV_DATE_LEN);
    }
   	}
     int localIp0040PaypassEnabledIndCounter = -1;
     public boolean isIp0040PaypassEnabledIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp0040PaypassEnabledIndCounter != sharedCounter;
         localIp0040PaypassEnabledIndCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_0040_PAYPASS_ENABLED_IND_LEN = 1;
	/**
	 * 	serialize this Ip0040PaypassEnabledInd
	 */
   protected void serializeIp0040PaypassEnabledInd(char[] ip0040PaypassEnabledInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip0040PaypassEnabledInd,0,getStringValue(),beginIp0040PaypassEnabledInd,IP_0040_PAYPASS_ENABLED_IND_LEN);
       localIp0040PaypassEnabledIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp0040PaypassEnabledIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp0040PaypassEnabledInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp0040PaypassEnabledInd() {	 
   		return (substring(getStringValue(),beginIp0040PaypassEnabledInd,beginIp0040PaypassEnabledInd + IP_0040_PAYPASS_ENABLED_IND_LEN));
   	}
     int localIp0040RateTypeIndicatorCounter = -1;
     public boolean isIp0040RateTypeIndicatorModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp0040RateTypeIndicatorCounter != sharedCounter;
         localIp0040RateTypeIndicatorCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_0040_RATE_TYPE_INDICATOR_LEN = 1;
	/**
	 * 	serialize this Ip0040RateTypeIndicator
	 */
   protected void serializeIp0040RateTypeIndicator(char[] ip0040RateTypeIndicator) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip0040RateTypeIndicator,0,getStringValue(),beginIp0040RateTypeIndicator,IP_0040_RATE_TYPE_INDICATOR_LEN);
       localIp0040RateTypeIndicatorCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp0040RateTypeIndicatorConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp0040RateTypeIndicator is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp0040RateTypeIndicator() {	 
   		return (substring(getStringValue(),beginIp0040RateTypeIndicator,beginIp0040RateTypeIndicator + IP_0040_RATE_TYPE_INDICATOR_LEN));
   	}
     int localIp0040RoutePsnIndicatorCounter = -1;
     public boolean isIp0040RoutePsnIndicatorModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp0040RoutePsnIndicatorCounter != sharedCounter;
         localIp0040RoutePsnIndicatorCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_0040_ROUTE_PSN_INDICATOR_LEN = 1;
	/**
	 * 	serialize this Ip0040RoutePsnIndicator
	 */
   protected void serializeIp0040RoutePsnIndicator(char[] ip0040RoutePsnIndicator) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip0040RoutePsnIndicator,0,getStringValue(),beginIp0040RoutePsnIndicator,IP_0040_ROUTE_PSN_INDICATOR_LEN);
       localIp0040RoutePsnIndicatorCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp0040RoutePsnIndicatorConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp0040RoutePsnIndicator is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp0040RoutePsnIndicator() {	 
   		return (substring(getStringValue(),beginIp0040RoutePsnIndicator,beginIp0040RoutePsnIndicator + IP_0040_ROUTE_PSN_INDICATOR_LEN));
   	}
     int localIp0040CbwpIndicatorCounter = -1;
     public boolean isIp0040CbwpIndicatorModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp0040CbwpIndicatorCounter != sharedCounter;
         localIp0040CbwpIndicatorCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_0040_CBWP_INDICATOR_LEN = 1;
	/**
	 * 	serialize this Ip0040CbwpIndicator
	 */
   protected void serializeIp0040CbwpIndicator(char[] ip0040CbwpIndicator) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip0040CbwpIndicator,0,getStringValue(),beginIp0040CbwpIndicator,IP_0040_CBWP_INDICATOR_LEN);
       localIp0040CbwpIndicatorCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp0040CbwpIndicatorConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp0040CbwpIndicator is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp0040CbwpIndicator() {	 
   		return (substring(getStringValue(),beginIp0040CbwpIndicator,beginIp0040CbwpIndicator + IP_0040_CBWP_INDICATOR_LEN));
   	}
     int localIp0040FlexParticipIndCounter = -1;
     public boolean isIp0040FlexParticipIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp0040FlexParticipIndCounter != sharedCounter;
         localIp0040FlexParticipIndCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_0040_FLEX_PARTICIP_IND_LEN = 1;
	/**
	 * 	serialize this Ip0040FlexParticipInd
	 */
   protected void serializeIp0040FlexParticipInd(char[] ip0040FlexParticipInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip0040FlexParticipInd,0,getStringValue(),beginIp0040FlexParticipInd,IP_0040_FLEX_PARTICIP_IND_LEN);
       localIp0040FlexParticipIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp0040FlexParticipIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp0040FlexParticipInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp0040FlexParticipInd() {	 
   		return (substring(getStringValue(),beginIp0040FlexParticipInd,beginIp0040FlexParticipInd + IP_0040_FLEX_PARTICIP_IND_LEN));
   	}
     int localIp0040RepwrRldIndCounter = -1;
     public boolean isIp0040RepwrRldIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp0040RepwrRldIndCounter != sharedCounter;
         localIp0040RepwrRldIndCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_0040_REPWR_RLD_IND_LEN = 1;
	/**
	 * 	serialize this Ip0040RepwrRldInd
	 */
   protected void serializeIp0040RepwrRldInd(char[] ip0040RepwrRldInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip0040RepwrRldInd,0,getStringValue(),beginIp0040RepwrRldInd,IP_0040_REPWR_RLD_IND_LEN);
       localIp0040RepwrRldIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp0040RepwrRldIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp0040RepwrRldInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp0040RepwrRldInd() {	 
   		return (substring(getStringValue(),beginIp0040RepwrRldInd,beginIp0040RepwrRldInd + IP_0040_REPWR_RLD_IND_LEN));
   	}
     int localIp0040MoneySendIndCounter = -1;
     public boolean isIp0040MoneySendIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp0040MoneySendIndCounter != sharedCounter;
         localIp0040MoneySendIndCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_0040_MONEY_SEND_IND_LEN = 1;
	/**
	 * 	serialize this Ip0040MoneySendInd
	 */
   protected void serializeIp0040MoneySendInd(char[] ip0040MoneySendInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip0040MoneySendInd,0,getStringValue(),beginIp0040MoneySendInd,IP_0040_MONEY_SEND_IND_LEN);
       localIp0040MoneySendIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp0040MoneySendIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp0040MoneySendInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp0040MoneySendInd() {	 
   		return (substring(getStringValue(),beginIp0040MoneySendInd,beginIp0040MoneySendInd + IP_0040_MONEY_SEND_IND_LEN));
   	}
     int localIp0040RegulatedRateIndSwCounter = -1;
     public boolean isIp0040RegulatedRateIndSwModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp0040RegulatedRateIndSwCounter != sharedCounter;
         localIp0040RegulatedRateIndSwCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_0040_REGULATED_RATE_IND_SW_LEN = 1;
	/**
	 * 	serialize this Ip0040RegulatedRateIndSw
	 */
   protected void serializeIp0040RegulatedRateIndSw(char[] ip0040RegulatedRateIndSw) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip0040RegulatedRateIndSw,0,getStringValue(),beginIp0040RegulatedRateIndSw,IP_0040_REGULATED_RATE_IND_SW_LEN);
       localIp0040RegulatedRateIndSwCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp0040RegulatedRateIndSwConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp0040RegulatedRateIndSw is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp0040RegulatedRateIndSw() {	 
   		return (substring(getStringValue(),beginIp0040RegulatedRateIndSw,beginIp0040RegulatedRateIndSw + IP_0040_REGULATED_RATE_IND_SW_LEN));
   	}
     int localIp0040CashAccessSwCounter = -1;
     public boolean isIp0040CashAccessSwModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp0040CashAccessSwCounter != sharedCounter;
         localIp0040CashAccessSwCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_0040_CASH_ACCESS_SW_LEN = 1;
	/**
	 * 	serialize this Ip0040CashAccessSw
	 */
   protected void serializeIp0040CashAccessSw(char[] ip0040CashAccessSw) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip0040CashAccessSw,0,getStringValue(),beginIp0040CashAccessSw,IP_0040_CASH_ACCESS_SW_LEN);
       localIp0040CashAccessSwCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp0040CashAccessSwConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp0040CashAccessSw is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp0040CashAccessSw() {	 
   		return (substring(getStringValue(),beginIp0040CashAccessSw,beginIp0040CashAccessSw + IP_0040_CASH_ACCESS_SW_LEN));
   	}
     int localIp0040PersonPresentIndCounter = -1;
     public boolean isIp0040PersonPresentIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp0040PersonPresentIndCounter != sharedCounter;
         localIp0040PersonPresentIndCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ip0040PersonPresentInd
	 *	@return ip0040PersonPresentInd
	 */
	public char[]  getIp0040PersonPresentIndString() {
	     return getCharArray(beginIp0040PersonPresentInd,IP_0040_PERSON_PRESENT_IND_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip0040PersonPresentIndIsNumeric() {
	    return isNumeric(beginIp0040PersonPresentInd
	                    ,beginIp0040PersonPresentInd + IP_0040_PERSON_PRESENT_IND_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int IP_0040_PERSON_PRESENT_IND_LEN = 1;
  	/**
	 * serializeIp0040PersonPresentInd
	 */
	protected void serializeIp0040PersonPresentInd(int ip0040PersonPresentInd) {
		 putNumber(beginIp0040PersonPresentInd,ip0040PersonPresentInd,IP_0040_PERSON_PRESENT_IND_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localIp0040PersonPresentIndCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeIp0040PersonPresentInd
	 */
   	protected  int serializeIp0040PersonPresentInd(char[] value) {
	    int  ip0040PersonPresentInd;
	    if(value.length >0 && value.length!= 1)
            value = new String(value).trim().toCharArray();
	    if (value.length < 1) value = pad(1, value, ' ', LEFT_PAD);
	    else if (value.length > 1) value = substring(value,0,1);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ip0040PersonPresentInd = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(1,value,false/*isSigned?*/)
		       ,beginIp0040PersonPresentInd
		       ,1
		      );
		 localIp0040PersonPresentIndCounter = shareString.getSerializedField().getModifiedCounter();
		return  ip0040PersonPresentInd;
    }

   protected int checkIp0040PersonPresentIndMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshIp0040PersonPresentInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshIp0040PersonPresentInd() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginIp0040PersonPresentInd
			                 ,IP_0040_PERSON_PRESENT_IND_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ip0040PersonPresentInd", beginIp0040PersonPresentInd,IP_0040_PERSON_PRESENT_IND_LEN);
    }
   	}
     int localIp0040CrossBdrExceptionCounter = -1;
     public boolean isIp0040CrossBdrExceptionModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp0040CrossBdrExceptionCounter != sharedCounter;
         localIp0040CrossBdrExceptionCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_0040_CROSS_BDR_EXCEPTION_LEN = 1;
	/**
	 * 	serialize this Ip0040CrossBdrException
	 */
   protected void serializeIp0040CrossBdrException(char[] ip0040CrossBdrException) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip0040CrossBdrException,0,getStringValue(),beginIp0040CrossBdrException,IP_0040_CROSS_BDR_EXCEPTION_LEN);
       localIp0040CrossBdrExceptionCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp0040CrossBdrExceptionConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp0040CrossBdrException is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp0040CrossBdrException() {	 
   		return (substring(getStringValue(),beginIp0040CrossBdrException,beginIp0040CrossBdrException + IP_0040_CROSS_BDR_EXCEPTION_LEN));
   	}
     int localIp0040IssTargetMarketIndCounter = -1;
     public boolean isIp0040IssTargetMarketIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp0040IssTargetMarketIndCounter != sharedCounter;
         localIp0040IssTargetMarketIndCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_0040_ISS_TARGET_MARKET_IND_LEN = 1;
	/**
	 * 	serialize this Ip0040IssTargetMarketInd
	 */
   protected void serializeIp0040IssTargetMarketInd(char[] ip0040IssTargetMarketInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip0040IssTargetMarketInd,0,getStringValue(),beginIp0040IssTargetMarketInd,IP_0040_ISS_TARGET_MARKET_IND_LEN);
       localIp0040IssTargetMarketIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp0040IssTargetMarketIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp0040IssTargetMarketInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp0040IssTargetMarketInd() {	 
   		return (substring(getStringValue(),beginIp0040IssTargetMarketInd,beginIp0040IssTargetMarketInd + IP_0040_ISS_TARGET_MARKET_IND_LEN));
   	}
     int localIp0040PostDateServSwCounter = -1;
     public boolean isIp0040PostDateServSwModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp0040PostDateServSwCounter != sharedCounter;
         localIp0040PostDateServSwCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_0040_POST_DATE_SERV_SW_LEN = 1;
	/**
	 * 	serialize this Ip0040PostDateServSw
	 */
   protected void serializeIp0040PostDateServSw(char[] ip0040PostDateServSw) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip0040PostDateServSw,0,getStringValue(),beginIp0040PostDateServSw,IP_0040_POST_DATE_SERV_SW_LEN);
       localIp0040PostDateServSwCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp0040PostDateServSwConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp0040PostDateServSw is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp0040PostDateServSw() {	 
   		return (substring(getStringValue(),beginIp0040PostDateServSw,beginIp0040PostDateServSw + IP_0040_POST_DATE_SERV_SW_LEN));
   	}
     int localIp0040MealVoucherIndCounter = -1;
     public boolean isIp0040MealVoucherIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp0040MealVoucherIndCounter != sharedCounter;
         localIp0040MealVoucherIndCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_0040_MEAL_VOUCHER_IND_LEN = 1;
	/**
	 * 	serialize this Ip0040MealVoucherInd
	 */
   protected void serializeIp0040MealVoucherInd(char[] ip0040MealVoucherInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip0040MealVoucherInd,0,getStringValue(),beginIp0040MealVoucherInd,IP_0040_MEAL_VOUCHER_IND_LEN);
       localIp0040MealVoucherIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp0040MealVoucherIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp0040MealVoucherInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp0040MealVoucherInd() {	 
   		return (substring(getStringValue(),beginIp0040MealVoucherInd,beginIp0040MealVoucherInd + IP_0040_MEAL_VOUCHER_IND_LEN));
   	}
     int localIp0040NonRldblPrpdSwCounter = -1;
     public boolean isIp0040NonRldblPrpdSwModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp0040NonRldblPrpdSwCounter != sharedCounter;
         localIp0040NonRldblPrpdSwCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_0040_NON_RLDBL_PRPD_SW_LEN = 2;
	/**
	 * 	serialize this Ip0040NonRldblPrpdSw
	 */
   protected void serializeIp0040NonRldblPrpdSw(char[] ip0040NonRldblPrpdSw) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip0040NonRldblPrpdSw,0,getStringValue(),beginIp0040NonRldblPrpdSw,IP_0040_NON_RLDBL_PRPD_SW_LEN);
       localIp0040NonRldblPrpdSwCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp0040NonRldblPrpdSwConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshIp0040NonRldblPrpdSw is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp0040NonRldblPrpdSw() {	 
   		return (substring(getStringValue(),beginIp0040NonRldblPrpdSw,beginIp0040NonRldblPrpdSw + IP_0040_NON_RLDBL_PRPD_SW_LEN));
   	}
     int localIp0040FasterFundsIndCounter = -1;
     public boolean isIp0040FasterFundsIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp0040FasterFundsIndCounter != sharedCounter;
         localIp0040FasterFundsIndCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_0040_FASTER_FUNDS_IND_LEN = 1;
	/**
	 * 	serialize this Ip0040FasterFundsInd
	 */
   protected void serializeIp0040FasterFundsInd(char[] ip0040FasterFundsInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip0040FasterFundsInd,0,getStringValue(),beginIp0040FasterFundsInd,IP_0040_FASTER_FUNDS_IND_LEN);
       localIp0040FasterFundsIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp0040FasterFundsIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp0040FasterFundsInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp0040FasterFundsInd() {	 
   		return (substring(getStringValue(),beginIp0040FasterFundsInd,beginIp0040FasterFundsInd + IP_0040_FASTER_FUNDS_IND_LEN));
   	}
     int localIp0040AnonPrepaidIndCounter = -1;
     public boolean isIp0040AnonPrepaidIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp0040AnonPrepaidIndCounter != sharedCounter;
         localIp0040AnonPrepaidIndCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_0040_ANON_PREPAID_IND_LEN = 1;
	/**
	 * 	serialize this Ip0040AnonPrepaidInd
	 */
   protected void serializeIp0040AnonPrepaidInd(char[] ip0040AnonPrepaidInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip0040AnonPrepaidInd,0,getStringValue(),beginIp0040AnonPrepaidInd,IP_0040_ANON_PREPAID_IND_LEN);
       localIp0040AnonPrepaidIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp0040AnonPrepaidIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp0040AnonPrepaidInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp0040AnonPrepaidInd() {	 
   		return (substring(getStringValue(),beginIp0040AnonPrepaidInd,beginIp0040AnonPrepaidInd + IP_0040_ANON_PREPAID_IND_LEN));
   	}
     int localIp0040DccStatusIndCounter = -1;
     public boolean isIp0040DccStatusIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp0040DccStatusIndCounter != sharedCounter;
         localIp0040DccStatusIndCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_0040_DCC_STATUS_IND_LEN = 1;
	/**
	 * 	serialize this Ip0040DccStatusInd
	 */
   protected void serializeIp0040DccStatusInd(char[] ip0040DccStatusInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip0040DccStatusInd,0,getStringValue(),beginIp0040DccStatusInd,IP_0040_DCC_STATUS_IND_LEN);
       localIp0040DccStatusIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp0040DccStatusIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp0040DccStatusInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp0040DccStatusInd() {	 
   		return (substring(getStringValue(),beginIp0040DccStatusInd,beginIp0040DccStatusInd + IP_0040_DCC_STATUS_IND_LEN));
   	}
     int localIp0040MemberFillerCounter = -1;
     public boolean isIp0040MemberFillerModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp0040MemberFillerCounter != sharedCounter;
         localIp0040MemberFillerCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_0040_MEMBER_FILLER_LEN = 14;
	/**
	 * 	serialize this Ip0040MemberFiller
	 */
   protected void serializeIp0040MemberFiller(char[] ip0040MemberFiller) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip0040MemberFiller,0,getStringValue(),beginIp0040MemberFiller,IP_0040_MEMBER_FILLER_LEN);
       localIp0040MemberFillerCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp0040MemberFillerConstraints(char[] value) {
   			return super.checkConstraints(value , 14 ,false, false);
   }
    /**
	 *	refreshIp0040MemberFiller is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp0040MemberFiller() {	 
   		return (substring(getStringValue(),beginIp0040MemberFiller,beginIp0040MemberFiller + IP_0040_MEMBER_FILLER_LEN));
   	}




}
  
