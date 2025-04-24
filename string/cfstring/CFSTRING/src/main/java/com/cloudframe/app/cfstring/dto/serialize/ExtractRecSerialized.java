package com.cloudframe.app.cfstring.dto.serialize;

/**
*  The class ExtractRecSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:42. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class ExtractRecSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(ExtractRecSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int EXTRACT_REC_LENGTH = 1638;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginExtMtn;
            protected  int beginExtLname;
            protected  int beginExtFname;
            protected  int beginExtCarrierName;
            protected  int beginExtDeviceId;
            protected  int beginExtRegionCd;
            protected  int beginExtOutletId;
            protected  int beginExtMfgNme;
            protected  int beginExtProdNme;
            protected  int beginExtAddr1;
            protected  int beginExtAddr2;
            protected  int beginExtCity;
            protected  int beginExtState;
            protected  int beginExtZipCode;
            protected  int beginExtAnalogDigitalCd;
            protected  int beginExtTermnlOptCd;
            protected  int beginExtWarranty;
            protected  int beginExtMtnEffDt;
            protected  int beginExtActDeact;
            protected  int beginExtAuserCnt;
           protected int beginExtAuthUsers;
           protected static final int EXT_AUTH_USERS_SIZE = 10;
            protected  int beginExtIccid;
            protected  int beginExtDeviceIdType;
            protected  int beginDvcTransRsnCd;
            protected  int beginExtActvReqDt;
            protected  int beginExtCustTypeCd;
            protected  int beginExtSfoSpoIndicator;
            protected  int beginExtLevel;
            protected  int beginExtLineStatus;
            protected  int beginExtFinMarketCode;
            protected  int beginExtEmailAddr1;
            protected  int beginExtEmailAddr2;
            protected  int beginExtEmailAddr3;
            protected  int beginExtLocationState;
            protected  int beginExtUniqueId;
            protected  int beginExtBrandIdentifier;
            protected  int beginExtSlsRepId;
            protected  int beginExtSlsRepLname;
            protected  int beginExtSlsRepFname;
            protected  int beginExtChnlDetail;
            protected  int beginExtOutletName;
            protected  int beginExtDistrictDesc;
            protected  int beginExtVzMktDesc;
            protected  int beginExtUniqueIdLine;
            protected  int beginExtSvcAddr1;
            protected  int beginExtSvcAddr2;
            protected  int beginExtSvcCity;
            protected  int beginExtSvcState;
            protected  int beginExtSvcZipCode;
            protected  int beginExtSkuId;
	
	/**
	* Constructor for ExtractRecSerialized
	**/
    public ExtractRecSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in ExtractRecSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(EXTRACT_REC_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginExtMtn = getStartOffset() + 0;	// set offset for serialization
  
             beginExtLname = getStartOffset() + 10;	// set offset for serialization
  
             beginExtFname = getStartOffset() + 35;	// set offset for serialization
  
  
             beginExtCarrierName = getStartOffset() + 63;	// set offset for serialization
  
             beginExtDeviceId = getStartOffset() + 93;	// set offset for serialization
  
             beginExtRegionCd = getStartOffset() + 113;	// set offset for serialization
  
             beginExtOutletId = getStartOffset() + 115;	// set offset for serialization
  
             beginExtMfgNme = getStartOffset() + 124;	// set offset for serialization
  
             beginExtProdNme = getStartOffset() + 154;	// set offset for serialization
  
             beginExtAddr1 = getStartOffset() + 186;	// set offset for serialization
  
             beginExtAddr2 = getStartOffset() + 216;	// set offset for serialization
  
             beginExtCity = getStartOffset() + 246;	// set offset for serialization
  
             beginExtState = getStartOffset() + 276;	// set offset for serialization
  
             beginExtZipCode = getStartOffset() + 278;	// set offset for serialization
  
             beginExtAnalogDigitalCd = getStartOffset() + 287;	// set offset for serialization
  
             beginExtTermnlOptCd = getStartOffset() + 288;	// set offset for serialization
  
             beginExtWarranty = getStartOffset() + 289;	// set offset for serialization
  
             beginExtMtnEffDt = getStartOffset() + 290;	// set offset for serialization
  
  
             beginExtActDeact = getStartOffset() + 313;	// set offset for serialization
  
  
             beginExtAuserCnt = getStartOffset() + 343;	// set offset for serialization
  
	        beginExtAuthUsers = getStartOffset() + 345; // set offset for serialization
  
             beginExtIccid = getStartOffset() + 795;	// set offset for serialization
  
             beginExtDeviceIdType = getStartOffset() + 815;	// set offset for serialization
  
             beginDvcTransRsnCd = getStartOffset() + 818;	// set offset for serialization
  
             beginExtActvReqDt = getStartOffset() + 820;	// set offset for serialization
  
             beginExtCustTypeCd = getStartOffset() + 830;	// set offset for serialization
  
             beginExtSfoSpoIndicator = getStartOffset() + 832;	// set offset for serialization
  
             beginExtLevel = getStartOffset() + 835;	// set offset for serialization
  
             beginExtLineStatus = getStartOffset() + 836;	// set offset for serialization
  
             beginExtFinMarketCode = getStartOffset() + 838;	// set offset for serialization
  
             beginExtEmailAddr1 = getStartOffset() + 841;	// set offset for serialization
  
             beginExtEmailAddr2 = getStartOffset() + 901;	// set offset for serialization
  
             beginExtEmailAddr3 = getStartOffset() + 961;	// set offset for serialization
  
             beginExtLocationState = getStartOffset() + 1033;	// set offset for serialization
  
             beginExtUniqueId = getStartOffset() + 1035;	// set offset for serialization
  
             beginExtBrandIdentifier = getStartOffset() + 1045;	// set offset for serialization
  
  
  
             beginExtSlsRepId = getStartOffset() + 1066;	// set offset for serialization
  
             beginExtSlsRepLname = getStartOffset() + 1071;	// set offset for serialization
  
             beginExtSlsRepFname = getStartOffset() + 1096;	// set offset for serialization
  
             beginExtChnlDetail = getStartOffset() + 1116;	// set offset for serialization
  
             beginExtOutletName = getStartOffset() + 1136;	// set offset for serialization
  
             beginExtDistrictDesc = getStartOffset() + 1166;	// set offset for serialization
  
             beginExtVzMktDesc = getStartOffset() + 1186;	// set offset for serialization
  
             beginExtUniqueIdLine = getStartOffset() + 1206;	// set offset for serialization
  
             beginExtSvcAddr1 = getStartOffset() + 1231;	// set offset for serialization
  
             beginExtSvcAddr2 = getStartOffset() + 1261;	// set offset for serialization
  
             beginExtSvcCity = getStartOffset() + 1291;	// set offset for serialization
  
             beginExtSvcState = getStartOffset() + 1321;	// set offset for serialization
  
             beginExtSvcZipCode = getStartOffset() + 1323;	// set offset for serialization
  
  
             beginExtSkuId = getStartOffset() + 1608;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localExtMtnCounter = -1;
     public boolean isExtMtnModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localExtMtnCounter != sharedCounter;
         localExtMtnCounter = sharedCounter; return hasModified;
     }
	protected static final int EXT_MTN_LEN = 10;
	/**
	 * 	serialize this ExtMtn
	 */
   protected void serializeExtMtn(char[] extMtn) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(extMtn,0,getStringValue(),beginExtMtn,EXT_MTN_LEN);
       localExtMtnCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkExtMtnConstraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshExtMtn is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshExtMtn() {	 
   		return (substring(getStringValue(),beginExtMtn,beginExtMtn + EXT_MTN_LEN));
   	}
     int localExtLnameCounter = -1;
     public boolean isExtLnameModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localExtLnameCounter != sharedCounter;
         localExtLnameCounter = sharedCounter; return hasModified;
     }
	protected static final int EXT_LNAME_LEN = 25;
	/**
	 * 	serialize this ExtLname
	 */
   protected void serializeExtLname(char[] extLname) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(extLname,0,getStringValue(),beginExtLname,EXT_LNAME_LEN);
       localExtLnameCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkExtLnameConstraints(char[] value) {
   			return super.checkConstraints(value , 25 ,false, false);
   }
    /**
	 *	refreshExtLname is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshExtLname() {	 
   		return (substring(getStringValue(),beginExtLname,beginExtLname + EXT_LNAME_LEN));
   	}
     int localExtFnameCounter = -1;
     public boolean isExtFnameModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localExtFnameCounter != sharedCounter;
         localExtFnameCounter = sharedCounter; return hasModified;
     }
	protected static final int EXT_FNAME_LEN = 20;
	/**
	 * 	serialize this ExtFname
	 */
   protected void serializeExtFname(char[] extFname) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(extFname,0,getStringValue(),beginExtFname,EXT_FNAME_LEN);
       localExtFnameCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkExtFnameConstraints(char[] value) {
   			return super.checkConstraints(value , 20 ,false, false);
   }
    /**
	 *	refreshExtFname is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshExtFname() {	 
   		return (substring(getStringValue(),beginExtFname,beginExtFname + EXT_FNAME_LEN));
   	}
     int localExtCarrierNameCounter = -1;
     public boolean isExtCarrierNameModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localExtCarrierNameCounter != sharedCounter;
         localExtCarrierNameCounter = sharedCounter; return hasModified;
     }
	protected static final int EXT_CARRIER_NAME_LEN = 30;
	/**
	 * 	serialize this ExtCarrierName
	 */
   protected void serializeExtCarrierName(char[] extCarrierName) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(extCarrierName,0,getStringValue(),beginExtCarrierName,EXT_CARRIER_NAME_LEN);
       localExtCarrierNameCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkExtCarrierNameConstraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
    /**
	 *	refreshExtCarrierName is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshExtCarrierName() {	 
   		return (substring(getStringValue(),beginExtCarrierName,beginExtCarrierName + EXT_CARRIER_NAME_LEN));
   	}
     int localExtDeviceIdCounter = -1;
     public boolean isExtDeviceIdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localExtDeviceIdCounter != sharedCounter;
         localExtDeviceIdCounter = sharedCounter; return hasModified;
     }
	protected static final int EXT_DEVICE_ID_LEN = 20;
	/**
	 * 	serialize this ExtDeviceId
	 */
   protected void serializeExtDeviceId(char[] extDeviceId) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(extDeviceId,0,getStringValue(),beginExtDeviceId,EXT_DEVICE_ID_LEN);
       localExtDeviceIdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkExtDeviceIdConstraints(char[] value) {
   			return super.checkConstraints(value , 20 ,false, false);
   }
    /**
	 *	refreshExtDeviceId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshExtDeviceId() {	 
   		return (substring(getStringValue(),beginExtDeviceId,beginExtDeviceId + EXT_DEVICE_ID_LEN));
   	}
     int localExtRegionCdCounter = -1;
     public boolean isExtRegionCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localExtRegionCdCounter != sharedCounter;
         localExtRegionCdCounter = sharedCounter; return hasModified;
     }
	protected static final int EXT_REGION_CD_LEN = 2;
	/**
	 * 	serialize this ExtRegionCd
	 */
   protected void serializeExtRegionCd(char[] extRegionCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(extRegionCd,0,getStringValue(),beginExtRegionCd,EXT_REGION_CD_LEN);
       localExtRegionCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkExtRegionCdConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshExtRegionCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshExtRegionCd() {	 
   		return (substring(getStringValue(),beginExtRegionCd,beginExtRegionCd + EXT_REGION_CD_LEN));
   	}
     int localExtOutletIdCounter = -1;
     public boolean isExtOutletIdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localExtOutletIdCounter != sharedCounter;
         localExtOutletIdCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of extOutletId
	 *	@return extOutletId
	 */
	public char[]  getExtOutletIdString() {
	     return getCharArray(beginExtOutletId,EXT_OUTLET_ID_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean extOutletIdIsNumeric() {
	    return isNumeric(beginExtOutletId
	                    ,beginExtOutletId + EXT_OUTLET_ID_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int EXT_OUTLET_ID_LEN = 9;
  	/**
	 * serializeExtOutletId
	 */
	protected void serializeExtOutletId(long extOutletId) {
		 putNumber(beginExtOutletId,extOutletId,EXT_OUTLET_ID_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localExtOutletIdCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeExtOutletId
	 */
   	protected  long serializeExtOutletId(char[] value) {
	    long  extOutletId;
	    if(value.length >0 && value.length!= 9)
            value = new String(value).trim().toCharArray();
	    if (value.length < 9) value = pad(9, value, ' ', LEFT_PAD);
	    else if (value.length > 9) value = substring(value,0,9);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    extOutletId = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(9,value,false/*isSigned?*/)
		       ,beginExtOutletId
		       ,9
		      );
		 localExtOutletIdCounter = shareString.getSerializedField().getModifiedCounter();
		return  extOutletId;
    }

   protected long checkExtOutletIdMaxLimit(long number) {

        return checkMaxLimit(number , MAX_1G/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshExtOutletId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshExtOutletId() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginExtOutletId
			                 ,EXT_OUTLET_ID_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("extOutletId", beginExtOutletId,EXT_OUTLET_ID_LEN);
    }
   	}
     int localExtMfgNmeCounter = -1;
     public boolean isExtMfgNmeModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localExtMfgNmeCounter != sharedCounter;
         localExtMfgNmeCounter = sharedCounter; return hasModified;
     }
	protected static final int EXT_MFG_NME_LEN = 30;
	/**
	 * 	serialize this ExtMfgNme
	 */
   protected void serializeExtMfgNme(char[] extMfgNme) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(extMfgNme,0,getStringValue(),beginExtMfgNme,EXT_MFG_NME_LEN);
       localExtMfgNmeCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkExtMfgNmeConstraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
    /**
	 *	refreshExtMfgNme is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshExtMfgNme() {	 
   		return (substring(getStringValue(),beginExtMfgNme,beginExtMfgNme + EXT_MFG_NME_LEN));
   	}
     int localExtProdNmeCounter = -1;
     public boolean isExtProdNmeModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localExtProdNmeCounter != sharedCounter;
         localExtProdNmeCounter = sharedCounter; return hasModified;
     }
	protected static final int EXT_PROD_NME_LEN = 32;
	/**
	 * 	serialize this ExtProdNme
	 */
   protected void serializeExtProdNme(char[] extProdNme) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(extProdNme,0,getStringValue(),beginExtProdNme,EXT_PROD_NME_LEN);
       localExtProdNmeCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkExtProdNmeConstraints(char[] value) {
   			return super.checkConstraints(value , 32 ,false, false);
   }
    /**
	 *	refreshExtProdNme is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshExtProdNme() {	 
   		return (substring(getStringValue(),beginExtProdNme,beginExtProdNme + EXT_PROD_NME_LEN));
   	}
     int localExtAddr1Counter = -1;
     public boolean isExtAddr1Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localExtAddr1Counter != sharedCounter;
         localExtAddr1Counter = sharedCounter; return hasModified;
     }
	protected static final int EXT_ADDR_1_LEN = 30;
	/**
	 * 	serialize this ExtAddr1
	 */
   protected void serializeExtAddr1(char[] extAddr1) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(extAddr1,0,getStringValue(),beginExtAddr1,EXT_ADDR_1_LEN);
       localExtAddr1Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkExtAddr1Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
    /**
	 *	refreshExtAddr1 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshExtAddr1() {	 
   		return (substring(getStringValue(),beginExtAddr1,beginExtAddr1 + EXT_ADDR_1_LEN));
   	}
     int localExtAddr2Counter = -1;
     public boolean isExtAddr2Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localExtAddr2Counter != sharedCounter;
         localExtAddr2Counter = sharedCounter; return hasModified;
     }
	protected static final int EXT_ADDR_2_LEN = 30;
	/**
	 * 	serialize this ExtAddr2
	 */
   protected void serializeExtAddr2(char[] extAddr2) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(extAddr2,0,getStringValue(),beginExtAddr2,EXT_ADDR_2_LEN);
       localExtAddr2Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkExtAddr2Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
    /**
	 *	refreshExtAddr2 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshExtAddr2() {	 
   		return (substring(getStringValue(),beginExtAddr2,beginExtAddr2 + EXT_ADDR_2_LEN));
   	}
     int localExtCityCounter = -1;
     public boolean isExtCityModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localExtCityCounter != sharedCounter;
         localExtCityCounter = sharedCounter; return hasModified;
     }
	protected static final int EXT_CITY_LEN = 30;
	/**
	 * 	serialize this ExtCity
	 */
   protected void serializeExtCity(char[] extCity) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(extCity,0,getStringValue(),beginExtCity,EXT_CITY_LEN);
       localExtCityCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkExtCityConstraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
    /**
	 *	refreshExtCity is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshExtCity() {	 
   		return (substring(getStringValue(),beginExtCity,beginExtCity + EXT_CITY_LEN));
   	}
     int localExtStateCounter = -1;
     public boolean isExtStateModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localExtStateCounter != sharedCounter;
         localExtStateCounter = sharedCounter; return hasModified;
     }
	protected static final int EXT_STATE_LEN = 2;
	/**
	 * 	serialize this ExtState
	 */
   protected void serializeExtState(char[] extState) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(extState,0,getStringValue(),beginExtState,EXT_STATE_LEN);
       localExtStateCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkExtStateConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshExtState is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshExtState() {	 
   		return (substring(getStringValue(),beginExtState,beginExtState + EXT_STATE_LEN));
   	}
     int localExtZipCodeCounter = -1;
     public boolean isExtZipCodeModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localExtZipCodeCounter != sharedCounter;
         localExtZipCodeCounter = sharedCounter; return hasModified;
     }
	protected static final int EXT_ZIP_CODE_LEN = 9;
	/**
	 * 	serialize this ExtZipCode
	 */
   protected void serializeExtZipCode(char[] extZipCode) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(extZipCode,0,getStringValue(),beginExtZipCode,EXT_ZIP_CODE_LEN);
       localExtZipCodeCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkExtZipCodeConstraints(char[] value) {
   			return super.checkConstraints(value , 9 ,false, false);
   }
    /**
	 *	refreshExtZipCode is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshExtZipCode() {	 
   		return (substring(getStringValue(),beginExtZipCode,beginExtZipCode + EXT_ZIP_CODE_LEN));
   	}
     int localExtAnalogDigitalCdCounter = -1;
     public boolean isExtAnalogDigitalCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localExtAnalogDigitalCdCounter != sharedCounter;
         localExtAnalogDigitalCdCounter = sharedCounter; return hasModified;
     }
	protected static final int EXT_ANALOG_DIGITAL_CD_LEN = 1;
	/**
	 * 	serialize this ExtAnalogDigitalCd
	 */
   protected void serializeExtAnalogDigitalCd(char[] extAnalogDigitalCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(extAnalogDigitalCd,0,getStringValue(),beginExtAnalogDigitalCd,EXT_ANALOG_DIGITAL_CD_LEN);
       localExtAnalogDigitalCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkExtAnalogDigitalCdConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshExtAnalogDigitalCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshExtAnalogDigitalCd() {	 
   		return (substring(getStringValue(),beginExtAnalogDigitalCd,beginExtAnalogDigitalCd + EXT_ANALOG_DIGITAL_CD_LEN));
   	}
     int localExtTermnlOptCdCounter = -1;
     public boolean isExtTermnlOptCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localExtTermnlOptCdCounter != sharedCounter;
         localExtTermnlOptCdCounter = sharedCounter; return hasModified;
     }
	protected static final int EXT_TERMNL_OPT_CD_LEN = 1;
	/**
	 * 	serialize this ExtTermnlOptCd
	 */
   protected void serializeExtTermnlOptCd(char[] extTermnlOptCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(extTermnlOptCd,0,getStringValue(),beginExtTermnlOptCd,EXT_TERMNL_OPT_CD_LEN);
       localExtTermnlOptCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkExtTermnlOptCdConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshExtTermnlOptCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshExtTermnlOptCd() {	 
   		return (substring(getStringValue(),beginExtTermnlOptCd,beginExtTermnlOptCd + EXT_TERMNL_OPT_CD_LEN));
   	}
     int localExtWarrantyCounter = -1;
     public boolean isExtWarrantyModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localExtWarrantyCounter != sharedCounter;
         localExtWarrantyCounter = sharedCounter; return hasModified;
     }
	protected static final int EXT_WARRANTY_LEN = 1;
	/**
	 * 	serialize this ExtWarranty
	 */
   protected void serializeExtWarranty(char[] extWarranty) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(extWarranty,0,getStringValue(),beginExtWarranty,EXT_WARRANTY_LEN);
       localExtWarrantyCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkExtWarrantyConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshExtWarranty is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshExtWarranty() {	 
   		return (substring(getStringValue(),beginExtWarranty,beginExtWarranty + EXT_WARRANTY_LEN));
   	}
     int localExtMtnEffDtCounter = -1;
     public boolean isExtMtnEffDtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localExtMtnEffDtCounter != sharedCounter;
         localExtMtnEffDtCounter = sharedCounter; return hasModified;
     }
	protected static final int EXT_MTN_EFF_DT_LEN = 8;
	/**
	 * 	serialize this ExtMtnEffDt
	 */
   protected void serializeExtMtnEffDt(char[] extMtnEffDt) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(extMtnEffDt,0,getStringValue(),beginExtMtnEffDt,EXT_MTN_EFF_DT_LEN);
       localExtMtnEffDtCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkExtMtnEffDtConstraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshExtMtnEffDt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshExtMtnEffDt() {	 
   		return (substring(getStringValue(),beginExtMtnEffDt,beginExtMtnEffDt + EXT_MTN_EFF_DT_LEN));
   	}
     int localExtActDeactCounter = -1;
     public boolean isExtActDeactModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localExtActDeactCounter != sharedCounter;
         localExtActDeactCounter = sharedCounter; return hasModified;
     }
	protected static final int EXT_ACT_DEACT_LEN = 1;
	/**
	 * 	serialize this ExtActDeact
	 */
   protected void serializeExtActDeact(char[] extActDeact) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(extActDeact,0,getStringValue(),beginExtActDeact,EXT_ACT_DEACT_LEN);
       localExtActDeactCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkExtActDeactConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshExtActDeact is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshExtActDeact() {	 
   		return (substring(getStringValue(),beginExtActDeact,beginExtActDeact + EXT_ACT_DEACT_LEN));
   	}
     int localExtAuserCntCounter = -1;
     public boolean isExtAuserCntModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localExtAuserCntCounter != sharedCounter;
         localExtAuserCntCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of extAuserCnt
	 *	@return extAuserCnt
	 */
	public char[]  getExtAuserCntString() {
	     return getCharArray(beginExtAuserCnt,EXT_AUSER_CNT_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean extAuserCntIsNumeric() {
	    return isNumeric(beginExtAuserCnt
	                    ,beginExtAuserCnt + EXT_AUSER_CNT_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int EXT_AUSER_CNT_LEN = 2;
  	/**
	 * serializeExtAuserCnt
	 */
	protected void serializeExtAuserCnt(int extAuserCnt) {
		 putNumber(beginExtAuserCnt,extAuserCnt,EXT_AUSER_CNT_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localExtAuserCntCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeExtAuserCnt
	 */
   	protected  int serializeExtAuserCnt(char[] value) {
	    int  extAuserCnt;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    extAuserCnt = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginExtAuserCnt
		       ,2
		      );
		 localExtAuserCntCounter = shareString.getSerializedField().getModifiedCounter();
		return  extAuserCnt;
    }

   protected int checkExtAuserCntMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshExtAuserCnt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshExtAuserCnt() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginExtAuserCnt
			                 ,EXT_AUSER_CNT_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("extAuserCnt", beginExtAuserCnt,EXT_AUSER_CNT_LEN);
    }
   	}
     int localExtIccidCounter = -1;
     public boolean isExtIccidModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localExtIccidCounter != sharedCounter;
         localExtIccidCounter = sharedCounter; return hasModified;
     }
	protected static final int EXT_ICCID_LEN = 20;
	/**
	 * 	serialize this ExtIccid
	 */
   protected void serializeExtIccid(char[] extIccid) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(extIccid,0,getStringValue(),beginExtIccid,EXT_ICCID_LEN);
       localExtIccidCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkExtIccidConstraints(char[] value) {
   			return super.checkConstraints(value , 20 ,false, false);
   }
    /**
	 *	refreshExtIccid is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshExtIccid() {	 
   		return (substring(getStringValue(),beginExtIccid,beginExtIccid + EXT_ICCID_LEN));
   	}
     int localExtDeviceIdTypeCounter = -1;
     public boolean isExtDeviceIdTypeModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localExtDeviceIdTypeCounter != sharedCounter;
         localExtDeviceIdTypeCounter = sharedCounter; return hasModified;
     }
	protected static final int EXT_DEVICE_ID_TYPE_LEN = 3;
	/**
	 * 	serialize this ExtDeviceIdType
	 */
   protected void serializeExtDeviceIdType(char[] extDeviceIdType) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(extDeviceIdType,0,getStringValue(),beginExtDeviceIdType,EXT_DEVICE_ID_TYPE_LEN);
       localExtDeviceIdTypeCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkExtDeviceIdTypeConstraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshExtDeviceIdType is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshExtDeviceIdType() {	 
   		return (substring(getStringValue(),beginExtDeviceIdType,beginExtDeviceIdType + EXT_DEVICE_ID_TYPE_LEN));
   	}
     int localDvcTransRsnCdCounter = -1;
     public boolean isDvcTransRsnCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDvcTransRsnCdCounter != sharedCounter;
         localDvcTransRsnCdCounter = sharedCounter; return hasModified;
     }
	protected static final int DVC_TRANS_RSN_CD_LEN = 2;
	/**
	 * 	serialize this DvcTransRsnCd
	 */
   protected void serializeDvcTransRsnCd(char[] dvcTransRsnCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dvcTransRsnCd,0,getStringValue(),beginDvcTransRsnCd,DVC_TRANS_RSN_CD_LEN);
       localDvcTransRsnCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDvcTransRsnCdConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshDvcTransRsnCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDvcTransRsnCd() {	 
   		return (substring(getStringValue(),beginDvcTransRsnCd,beginDvcTransRsnCd + DVC_TRANS_RSN_CD_LEN));
   	}
     int localExtActvReqDtCounter = -1;
     public boolean isExtActvReqDtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localExtActvReqDtCounter != sharedCounter;
         localExtActvReqDtCounter = sharedCounter; return hasModified;
     }
	protected static final int EXT_ACTV_REQ_DT_LEN = 10;
	/**
	 * 	serialize this ExtActvReqDt
	 */
   protected void serializeExtActvReqDt(char[] extActvReqDt) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(extActvReqDt,0,getStringValue(),beginExtActvReqDt,EXT_ACTV_REQ_DT_LEN);
       localExtActvReqDtCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkExtActvReqDtConstraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshExtActvReqDt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshExtActvReqDt() {	 
   		return (substring(getStringValue(),beginExtActvReqDt,beginExtActvReqDt + EXT_ACTV_REQ_DT_LEN));
   	}
     int localExtCustTypeCdCounter = -1;
     public boolean isExtCustTypeCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localExtCustTypeCdCounter != sharedCounter;
         localExtCustTypeCdCounter = sharedCounter; return hasModified;
     }
	protected static final int EXT_CUST_TYPE_CD_LEN = 2;
	/**
	 * 	serialize this ExtCustTypeCd
	 */
   protected void serializeExtCustTypeCd(char[] extCustTypeCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(extCustTypeCd,0,getStringValue(),beginExtCustTypeCd,EXT_CUST_TYPE_CD_LEN);
       localExtCustTypeCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkExtCustTypeCdConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshExtCustTypeCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshExtCustTypeCd() {	 
   		return (substring(getStringValue(),beginExtCustTypeCd,beginExtCustTypeCd + EXT_CUST_TYPE_CD_LEN));
   	}
     int localExtSfoSpoIndicatorCounter = -1;
     public boolean isExtSfoSpoIndicatorModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localExtSfoSpoIndicatorCounter != sharedCounter;
         localExtSfoSpoIndicatorCounter = sharedCounter; return hasModified;
     }
	protected static final int EXT_SFO_SPO_INDICATOR_LEN = 3;
	/**
	 * 	serialize this ExtSfoSpoIndicator
	 */
   protected void serializeExtSfoSpoIndicator(char[] extSfoSpoIndicator) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(extSfoSpoIndicator,0,getStringValue(),beginExtSfoSpoIndicator,EXT_SFO_SPO_INDICATOR_LEN);
       localExtSfoSpoIndicatorCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkExtSfoSpoIndicatorConstraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshExtSfoSpoIndicator is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshExtSfoSpoIndicator() {	 
   		return (substring(getStringValue(),beginExtSfoSpoIndicator,beginExtSfoSpoIndicator + EXT_SFO_SPO_INDICATOR_LEN));
   	}
     int localExtLevelCounter = -1;
     public boolean isExtLevelModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localExtLevelCounter != sharedCounter;
         localExtLevelCounter = sharedCounter; return hasModified;
     }
	protected static final int EXT_LEVEL_LEN = 1;
	/**
	 * 	serialize this ExtLevel
	 */
   protected void serializeExtLevel(char[] extLevel) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(extLevel,0,getStringValue(),beginExtLevel,EXT_LEVEL_LEN);
       localExtLevelCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkExtLevelConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshExtLevel is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshExtLevel() {	 
   		return (substring(getStringValue(),beginExtLevel,beginExtLevel + EXT_LEVEL_LEN));
   	}
     int localExtLineStatusCounter = -1;
     public boolean isExtLineStatusModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localExtLineStatusCounter != sharedCounter;
         localExtLineStatusCounter = sharedCounter; return hasModified;
     }
	protected static final int EXT_LINE_STATUS_LEN = 2;
	/**
	 * 	serialize this ExtLineStatus
	 */
   protected void serializeExtLineStatus(char[] extLineStatus) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(extLineStatus,0,getStringValue(),beginExtLineStatus,EXT_LINE_STATUS_LEN);
       localExtLineStatusCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkExtLineStatusConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshExtLineStatus is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshExtLineStatus() {	 
   		return (substring(getStringValue(),beginExtLineStatus,beginExtLineStatus + EXT_LINE_STATUS_LEN));
   	}
     int localExtFinMarketCodeCounter = -1;
     public boolean isExtFinMarketCodeModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localExtFinMarketCodeCounter != sharedCounter;
         localExtFinMarketCodeCounter = sharedCounter; return hasModified;
     }
	protected static final int EXT_FIN_MARKET_CODE_LEN = 3;
	/**
	 * 	serialize this ExtFinMarketCode
	 */
   protected void serializeExtFinMarketCode(char[] extFinMarketCode) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(extFinMarketCode,0,getStringValue(),beginExtFinMarketCode,EXT_FIN_MARKET_CODE_LEN);
       localExtFinMarketCodeCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkExtFinMarketCodeConstraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshExtFinMarketCode is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshExtFinMarketCode() {	 
   		return (substring(getStringValue(),beginExtFinMarketCode,beginExtFinMarketCode + EXT_FIN_MARKET_CODE_LEN));
   	}
     int localExtEmailAddr1Counter = -1;
     public boolean isExtEmailAddr1Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localExtEmailAddr1Counter != sharedCounter;
         localExtEmailAddr1Counter = sharedCounter; return hasModified;
     }
	protected static final int EXT_EMAIL_ADDR_1_LEN = 60;
	/**
	 * 	serialize this ExtEmailAddr1
	 */
   protected void serializeExtEmailAddr1(char[] extEmailAddr1) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(extEmailAddr1,0,getStringValue(),beginExtEmailAddr1,EXT_EMAIL_ADDR_1_LEN);
       localExtEmailAddr1Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkExtEmailAddr1Constraints(char[] value) {
   			return super.checkConstraints(value , 60 ,false, false);
   }
    /**
	 *	refreshExtEmailAddr1 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshExtEmailAddr1() {	 
   		return (substring(getStringValue(),beginExtEmailAddr1,beginExtEmailAddr1 + EXT_EMAIL_ADDR_1_LEN));
   	}
     int localExtEmailAddr2Counter = -1;
     public boolean isExtEmailAddr2Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localExtEmailAddr2Counter != sharedCounter;
         localExtEmailAddr2Counter = sharedCounter; return hasModified;
     }
	protected static final int EXT_EMAIL_ADDR_2_LEN = 60;
	/**
	 * 	serialize this ExtEmailAddr2
	 */
   protected void serializeExtEmailAddr2(char[] extEmailAddr2) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(extEmailAddr2,0,getStringValue(),beginExtEmailAddr2,EXT_EMAIL_ADDR_2_LEN);
       localExtEmailAddr2Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkExtEmailAddr2Constraints(char[] value) {
   			return super.checkConstraints(value , 60 ,false, false);
   }
    /**
	 *	refreshExtEmailAddr2 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshExtEmailAddr2() {	 
   		return (substring(getStringValue(),beginExtEmailAddr2,beginExtEmailAddr2 + EXT_EMAIL_ADDR_2_LEN));
   	}
     int localExtEmailAddr3Counter = -1;
     public boolean isExtEmailAddr3Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localExtEmailAddr3Counter != sharedCounter;
         localExtEmailAddr3Counter = sharedCounter; return hasModified;
     }
	protected static final int EXT_EMAIL_ADDR_3_LEN = 60;
	/**
	 * 	serialize this ExtEmailAddr3
	 */
   protected void serializeExtEmailAddr3(char[] extEmailAddr3) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(extEmailAddr3,0,getStringValue(),beginExtEmailAddr3,EXT_EMAIL_ADDR_3_LEN);
       localExtEmailAddr3Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkExtEmailAddr3Constraints(char[] value) {
   			return super.checkConstraints(value , 60 ,false, false);
   }
    /**
	 *	refreshExtEmailAddr3 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshExtEmailAddr3() {	 
   		return (substring(getStringValue(),beginExtEmailAddr3,beginExtEmailAddr3 + EXT_EMAIL_ADDR_3_LEN));
   	}
     int localExtLocationStateCounter = -1;
     public boolean isExtLocationStateModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localExtLocationStateCounter != sharedCounter;
         localExtLocationStateCounter = sharedCounter; return hasModified;
     }
	protected static final int EXT_LOCATION_STATE_LEN = 2;
	/**
	 * 	serialize this ExtLocationState
	 */
   protected void serializeExtLocationState(char[] extLocationState) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(extLocationState,0,getStringValue(),beginExtLocationState,EXT_LOCATION_STATE_LEN);
       localExtLocationStateCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkExtLocationStateConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshExtLocationState is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshExtLocationState() {	 
   		return (substring(getStringValue(),beginExtLocationState,beginExtLocationState + EXT_LOCATION_STATE_LEN));
   	}
     int localExtUniqueIdCounter = -1;
     public boolean isExtUniqueIdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localExtUniqueIdCounter != sharedCounter;
         localExtUniqueIdCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of extUniqueId
	 *	@return extUniqueId
	 */
	public char[]  getExtUniqueIdString() {
	     return getCharArray(beginExtUniqueId,EXT_UNIQUE_ID_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean extUniqueIdIsNumeric() {
	    return isNumeric(beginExtUniqueId
	                    ,beginExtUniqueId + EXT_UNIQUE_ID_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int EXT_UNIQUE_ID_LEN = 10;
  	/**
	 * serializeExtUniqueId
	 */
	protected void serializeExtUniqueId(long extUniqueId) {
		 putNumber(beginExtUniqueId,extUniqueId,EXT_UNIQUE_ID_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localExtUniqueIdCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeExtUniqueId
	 */
   	protected  long serializeExtUniqueId(char[] value) {
	    long  extUniqueId;
	    if(value.length >0 && value.length!= 10)
            value = new String(value).trim().toCharArray();
	    if (value.length < 10) value = pad(10, value, ' ', LEFT_PAD);
	    else if (value.length > 10) value = substring(value,0,10);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    extUniqueId = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(10,value,false/*isSigned?*/)
		       ,beginExtUniqueId
		       ,10
		      );
		 localExtUniqueIdCounter = shareString.getSerializedField().getModifiedCounter();
		return  extUniqueId;
    }

   protected long checkExtUniqueIdMaxLimit(long number) {

        return checkMaxLimit(number , MAX_10G/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshExtUniqueId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshExtUniqueId() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginExtUniqueId
			                 ,EXT_UNIQUE_ID_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("extUniqueId", beginExtUniqueId,EXT_UNIQUE_ID_LEN);
    }
   	}
     int localExtBrandIdentifierCounter = -1;
     public boolean isExtBrandIdentifierModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localExtBrandIdentifierCounter != sharedCounter;
         localExtBrandIdentifierCounter = sharedCounter; return hasModified;
     }
	protected static final int EXT_BRAND_IDENTIFIER_LEN = 1;
	/**
	 * 	serialize this ExtBrandIdentifier
	 */
   protected void serializeExtBrandIdentifier(char[] extBrandIdentifier) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(extBrandIdentifier,0,getStringValue(),beginExtBrandIdentifier,EXT_BRAND_IDENTIFIER_LEN);
       localExtBrandIdentifierCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkExtBrandIdentifierConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshExtBrandIdentifier is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshExtBrandIdentifier() {	 
   		return (substring(getStringValue(),beginExtBrandIdentifier,beginExtBrandIdentifier + EXT_BRAND_IDENTIFIER_LEN));
   	}
     int localExtSlsRepIdCounter = -1;
     public boolean isExtSlsRepIdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localExtSlsRepIdCounter != sharedCounter;
         localExtSlsRepIdCounter = sharedCounter; return hasModified;
     }
	protected static final int EXT_SLS_REP_ID_LEN = 5;
	/**
	 * 	serialize this ExtSlsRepId
	 */
   protected void serializeExtSlsRepId(char[] extSlsRepId) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(extSlsRepId,0,getStringValue(),beginExtSlsRepId,EXT_SLS_REP_ID_LEN);
       localExtSlsRepIdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkExtSlsRepIdConstraints(char[] value) {
   			return super.checkConstraints(value , 5 ,false, false);
   }
    /**
	 *	refreshExtSlsRepId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshExtSlsRepId() {	 
   		return (substring(getStringValue(),beginExtSlsRepId,beginExtSlsRepId + EXT_SLS_REP_ID_LEN));
   	}
     int localExtSlsRepLnameCounter = -1;
     public boolean isExtSlsRepLnameModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localExtSlsRepLnameCounter != sharedCounter;
         localExtSlsRepLnameCounter = sharedCounter; return hasModified;
     }
	protected static final int EXT_SLS_REP_LNAME_LEN = 25;
	/**
	 * 	serialize this ExtSlsRepLname
	 */
   protected void serializeExtSlsRepLname(char[] extSlsRepLname) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(extSlsRepLname,0,getStringValue(),beginExtSlsRepLname,EXT_SLS_REP_LNAME_LEN);
       localExtSlsRepLnameCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkExtSlsRepLnameConstraints(char[] value) {
   			return super.checkConstraints(value , 25 ,false, false);
   }
    /**
	 *	refreshExtSlsRepLname is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshExtSlsRepLname() {	 
   		return (substring(getStringValue(),beginExtSlsRepLname,beginExtSlsRepLname + EXT_SLS_REP_LNAME_LEN));
   	}
     int localExtSlsRepFnameCounter = -1;
     public boolean isExtSlsRepFnameModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localExtSlsRepFnameCounter != sharedCounter;
         localExtSlsRepFnameCounter = sharedCounter; return hasModified;
     }
	protected static final int EXT_SLS_REP_FNAME_LEN = 20;
	/**
	 * 	serialize this ExtSlsRepFname
	 */
   protected void serializeExtSlsRepFname(char[] extSlsRepFname) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(extSlsRepFname,0,getStringValue(),beginExtSlsRepFname,EXT_SLS_REP_FNAME_LEN);
       localExtSlsRepFnameCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkExtSlsRepFnameConstraints(char[] value) {
   			return super.checkConstraints(value , 20 ,false, false);
   }
    /**
	 *	refreshExtSlsRepFname is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshExtSlsRepFname() {	 
   		return (substring(getStringValue(),beginExtSlsRepFname,beginExtSlsRepFname + EXT_SLS_REP_FNAME_LEN));
   	}
     int localExtChnlDetailCounter = -1;
     public boolean isExtChnlDetailModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localExtChnlDetailCounter != sharedCounter;
         localExtChnlDetailCounter = sharedCounter; return hasModified;
     }
	protected static final int EXT_CHNL_DETAIL_LEN = 20;
	/**
	 * 	serialize this ExtChnlDetail
	 */
   protected void serializeExtChnlDetail(char[] extChnlDetail) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(extChnlDetail,0,getStringValue(),beginExtChnlDetail,EXT_CHNL_DETAIL_LEN);
       localExtChnlDetailCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkExtChnlDetailConstraints(char[] value) {
   			return super.checkConstraints(value , 20 ,false, false);
   }
    /**
	 *	refreshExtChnlDetail is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshExtChnlDetail() {	 
   		return (substring(getStringValue(),beginExtChnlDetail,beginExtChnlDetail + EXT_CHNL_DETAIL_LEN));
   	}
     int localExtOutletNameCounter = -1;
     public boolean isExtOutletNameModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localExtOutletNameCounter != sharedCounter;
         localExtOutletNameCounter = sharedCounter; return hasModified;
     }
	protected static final int EXT_OUTLET_NAME_LEN = 30;
	/**
	 * 	serialize this ExtOutletName
	 */
   protected void serializeExtOutletName(char[] extOutletName) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(extOutletName,0,getStringValue(),beginExtOutletName,EXT_OUTLET_NAME_LEN);
       localExtOutletNameCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkExtOutletNameConstraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
    /**
	 *	refreshExtOutletName is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshExtOutletName() {	 
   		return (substring(getStringValue(),beginExtOutletName,beginExtOutletName + EXT_OUTLET_NAME_LEN));
   	}
     int localExtDistrictDescCounter = -1;
     public boolean isExtDistrictDescModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localExtDistrictDescCounter != sharedCounter;
         localExtDistrictDescCounter = sharedCounter; return hasModified;
     }
	protected static final int EXT_DISTRICT_DESC_LEN = 20;
	/**
	 * 	serialize this ExtDistrictDesc
	 */
   protected void serializeExtDistrictDesc(char[] extDistrictDesc) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(extDistrictDesc,0,getStringValue(),beginExtDistrictDesc,EXT_DISTRICT_DESC_LEN);
       localExtDistrictDescCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkExtDistrictDescConstraints(char[] value) {
   			return super.checkConstraints(value , 20 ,false, false);
   }
    /**
	 *	refreshExtDistrictDesc is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshExtDistrictDesc() {	 
   		return (substring(getStringValue(),beginExtDistrictDesc,beginExtDistrictDesc + EXT_DISTRICT_DESC_LEN));
   	}
     int localExtVzMktDescCounter = -1;
     public boolean isExtVzMktDescModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localExtVzMktDescCounter != sharedCounter;
         localExtVzMktDescCounter = sharedCounter; return hasModified;
     }
	protected static final int EXT_VZ_MKT_DESC_LEN = 20;
	/**
	 * 	serialize this ExtVzMktDesc
	 */
   protected void serializeExtVzMktDesc(char[] extVzMktDesc) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(extVzMktDesc,0,getStringValue(),beginExtVzMktDesc,EXT_VZ_MKT_DESC_LEN);
       localExtVzMktDescCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkExtVzMktDescConstraints(char[] value) {
   			return super.checkConstraints(value , 20 ,false, false);
   }
    /**
	 *	refreshExtVzMktDesc is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshExtVzMktDesc() {	 
   		return (substring(getStringValue(),beginExtVzMktDesc,beginExtVzMktDesc + EXT_VZ_MKT_DESC_LEN));
   	}
     int localExtUniqueIdLineCounter = -1;
     public boolean isExtUniqueIdLineModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localExtUniqueIdLineCounter != sharedCounter;
         localExtUniqueIdLineCounter = sharedCounter; return hasModified;
     }
	protected static final int EXT_UNIQUE_ID_LINE_LEN = 25;
	/**
	 * 	serialize this ExtUniqueIdLine
	 */
   protected void serializeExtUniqueIdLine(char[] extUniqueIdLine) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(extUniqueIdLine,0,getStringValue(),beginExtUniqueIdLine,EXT_UNIQUE_ID_LINE_LEN);
       localExtUniqueIdLineCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkExtUniqueIdLineConstraints(char[] value) {
   			return super.checkConstraints(value , 25 ,false, false);
   }
    /**
	 *	refreshExtUniqueIdLine is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshExtUniqueIdLine() {	 
   		return (substring(getStringValue(),beginExtUniqueIdLine,beginExtUniqueIdLine + EXT_UNIQUE_ID_LINE_LEN));
   	}
     int localExtSvcAddr1Counter = -1;
     public boolean isExtSvcAddr1Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localExtSvcAddr1Counter != sharedCounter;
         localExtSvcAddr1Counter = sharedCounter; return hasModified;
     }
	protected static final int EXT_SVC_ADDR_1_LEN = 30;
	/**
	 * 	serialize this ExtSvcAddr1
	 */
   protected void serializeExtSvcAddr1(char[] extSvcAddr1) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(extSvcAddr1,0,getStringValue(),beginExtSvcAddr1,EXT_SVC_ADDR_1_LEN);
       localExtSvcAddr1Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkExtSvcAddr1Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
    /**
	 *	refreshExtSvcAddr1 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshExtSvcAddr1() {	 
   		return (substring(getStringValue(),beginExtSvcAddr1,beginExtSvcAddr1 + EXT_SVC_ADDR_1_LEN));
   	}
     int localExtSvcAddr2Counter = -1;
     public boolean isExtSvcAddr2Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localExtSvcAddr2Counter != sharedCounter;
         localExtSvcAddr2Counter = sharedCounter; return hasModified;
     }
	protected static final int EXT_SVC_ADDR_2_LEN = 30;
	/**
	 * 	serialize this ExtSvcAddr2
	 */
   protected void serializeExtSvcAddr2(char[] extSvcAddr2) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(extSvcAddr2,0,getStringValue(),beginExtSvcAddr2,EXT_SVC_ADDR_2_LEN);
       localExtSvcAddr2Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkExtSvcAddr2Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
    /**
	 *	refreshExtSvcAddr2 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshExtSvcAddr2() {	 
   		return (substring(getStringValue(),beginExtSvcAddr2,beginExtSvcAddr2 + EXT_SVC_ADDR_2_LEN));
   	}
     int localExtSvcCityCounter = -1;
     public boolean isExtSvcCityModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localExtSvcCityCounter != sharedCounter;
         localExtSvcCityCounter = sharedCounter; return hasModified;
     }
	protected static final int EXT_SVC_CITY_LEN = 30;
	/**
	 * 	serialize this ExtSvcCity
	 */
   protected void serializeExtSvcCity(char[] extSvcCity) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(extSvcCity,0,getStringValue(),beginExtSvcCity,EXT_SVC_CITY_LEN);
       localExtSvcCityCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkExtSvcCityConstraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
    /**
	 *	refreshExtSvcCity is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshExtSvcCity() {	 
   		return (substring(getStringValue(),beginExtSvcCity,beginExtSvcCity + EXT_SVC_CITY_LEN));
   	}
     int localExtSvcStateCounter = -1;
     public boolean isExtSvcStateModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localExtSvcStateCounter != sharedCounter;
         localExtSvcStateCounter = sharedCounter; return hasModified;
     }
	protected static final int EXT_SVC_STATE_LEN = 2;
	/**
	 * 	serialize this ExtSvcState
	 */
   protected void serializeExtSvcState(char[] extSvcState) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(extSvcState,0,getStringValue(),beginExtSvcState,EXT_SVC_STATE_LEN);
       localExtSvcStateCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkExtSvcStateConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshExtSvcState is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshExtSvcState() {	 
   		return (substring(getStringValue(),beginExtSvcState,beginExtSvcState + EXT_SVC_STATE_LEN));
   	}
     int localExtSvcZipCodeCounter = -1;
     public boolean isExtSvcZipCodeModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localExtSvcZipCodeCounter != sharedCounter;
         localExtSvcZipCodeCounter = sharedCounter; return hasModified;
     }
	protected static final int EXT_SVC_ZIP_CODE_LEN = 9;
	/**
	 * 	serialize this ExtSvcZipCode
	 */
   protected void serializeExtSvcZipCode(char[] extSvcZipCode) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(extSvcZipCode,0,getStringValue(),beginExtSvcZipCode,EXT_SVC_ZIP_CODE_LEN);
       localExtSvcZipCodeCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkExtSvcZipCodeConstraints(char[] value) {
   			return super.checkConstraints(value , 9 ,false, false);
   }
    /**
	 *	refreshExtSvcZipCode is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshExtSvcZipCode() {	 
   		return (substring(getStringValue(),beginExtSvcZipCode,beginExtSvcZipCode + EXT_SVC_ZIP_CODE_LEN));
   	}
     int localExtSkuIdCounter = -1;
     public boolean isExtSkuIdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localExtSkuIdCounter != sharedCounter;
         localExtSkuIdCounter = sharedCounter; return hasModified;
     }
	protected static final int EXT_SKU_ID_LEN = 20;
	/**
	 * 	serialize this ExtSkuId
	 */
   protected void serializeExtSkuId(char[] extSkuId) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(extSkuId,0,getStringValue(),beginExtSkuId,EXT_SKU_ID_LEN);
       localExtSkuIdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkExtSkuIdConstraints(char[] value) {
   			return super.checkConstraints(value , 20 ,false, false);
   }
    /**
	 *	refreshExtSkuId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshExtSkuId() {	 
   		return (substring(getStringValue(),beginExtSkuId,beginExtSkuId + EXT_SKU_ID_LEN));
   	}

		public int extAuthUsersSize() {
			return EXT_AUTH_USERS_SIZE;
		}



}
  
