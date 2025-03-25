package org.optum.uhg.dto.serialize.cics0012;

/**
*  The class DfhcommareaSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2024-11-20 at 23:12. using version 5.0.0.158
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class DfhcommareaSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(DfhcommareaSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int DFHCOMMAREA_LENGTH = 70062;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginLsApiRequestType;
            protected  int beginLsApiRequestKey;
            protected  int beginLsIsinKey;
            protected  int beginLsCountryCodeKey;
            protected  int beginLsCurrencyCodeKey;
            protected  int beginLsIndustryKey;
            protected  int beginLsSectorKey;
            protected  int beginLsReturnCode;
            protected  int beginLsEibresp;
            protected  int beginLsEibresp2;
            protected  int beginLsOutputCount;
           protected int beginLsOutputData;
           protected static final int LS_OUTPUT_DATA_SIZE = 400;
	
	/**
	* Constructor for DfhcommareaSerialized
	**/
    public DfhcommareaSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in DfhcommareaSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(DFHCOMMAREA_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginLsApiRequestType = getStartOffset() + 0;	// set offset for serialization
  
             beginLsApiRequestKey = getStartOffset() + 1;	// set offset for serialization
  
             beginLsIsinKey = getStartOffset() + 1;	// set offset for serialization
  
             beginLsCountryCodeKey = getStartOffset() + 1;	// set offset for serialization
  
             beginLsCurrencyCodeKey = getStartOffset() + 1;	// set offset for serialization
  
             beginLsIndustryKey = getStartOffset() + 1;	// set offset for serialization
  
             beginLsSectorKey = getStartOffset() + 1;	// set offset for serialization
  
             beginLsReturnCode = getStartOffset() + 41;	// set offset for serialization
  
             beginLsEibresp = getStartOffset() + 43;	// set offset for serialization
  
             beginLsEibresp2 = getStartOffset() + 51;	// set offset for serialization
  
             beginLsOutputCount = getStartOffset() + 59;	// set offset for serialization
  
	        beginLsOutputData = getStartOffset() + 62; // set offset for serialization
  
	   /*  end of offset */
	}
     int localLsApiRequestTypeCounter = -1;
     public boolean isLsApiRequestTypeModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localLsApiRequestTypeCounter != sharedCounter;
         localLsApiRequestTypeCounter = sharedCounter; return hasModified;
     }
	protected static final int LS_API_REQUEST_TYPE_LEN = 1;
	/**
	 * 	serialize this LsApiRequestType
	 */
   protected void serializeLsApiRequestType(char[] lsApiRequestType) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(lsApiRequestType,0,getStringValue(),beginLsApiRequestType,LS_API_REQUEST_TYPE_LEN);
       localLsApiRequestTypeCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkLsApiRequestTypeConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshLsApiRequestType is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshLsApiRequestType() {	 
   		return (substring(getStringValue(),beginLsApiRequestType,beginLsApiRequestType + LS_API_REQUEST_TYPE_LEN));
   	}
     int localLsApiRequestKeyCounter = -1;
     public boolean isLsApiRequestKeyModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localLsApiRequestKeyCounter != sharedCounter;
         localLsApiRequestKeyCounter = sharedCounter; return hasModified;
     }
	protected static final int LS_API_REQUEST_KEY_LEN = 40;
	/**
	 * 	serialize this LsApiRequestKey
	 */
   protected void serializeLsApiRequestKey(char[] lsApiRequestKey) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(lsApiRequestKey,0,getStringValue(),beginLsApiRequestKey,LS_API_REQUEST_KEY_LEN);
       localLsApiRequestKeyCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkLsApiRequestKeyConstraints(char[] value) {
   			return super.checkConstraints(value , 40 ,false, false);
   }
    /**
	 *	refreshLsApiRequestKey is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshLsApiRequestKey() {	 
   		return (substring(getStringValue(),beginLsApiRequestKey,beginLsApiRequestKey + LS_API_REQUEST_KEY_LEN));
   	}
     int localLsIsinKeyCounter = -1;
     public boolean isLsIsinKeyModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localLsIsinKeyCounter != sharedCounter;
         localLsIsinKeyCounter = sharedCounter; return hasModified;
     }
	protected static final int LS_ISIN_KEY_LEN = 12;
	/**
	 * 	serialize this LsIsinKey
	 */
   protected void serializeLsIsinKey(char[] lsIsinKey) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(lsIsinKey,0,getStringValue(),beginLsIsinKey,LS_ISIN_KEY_LEN);
       localLsIsinKeyCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkLsIsinKeyConstraints(char[] value) {
   			return super.checkConstraints(value , 12 ,false, false);
   }
    /**
	 *	refreshLsIsinKey is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshLsIsinKey() {	 
   		return (substring(getStringValue(),beginLsIsinKey,beginLsIsinKey + LS_ISIN_KEY_LEN));
   	}
     int localLsCountryCodeKeyCounter = -1;
     public boolean isLsCountryCodeKeyModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localLsCountryCodeKeyCounter != sharedCounter;
         localLsCountryCodeKeyCounter = sharedCounter; return hasModified;
     }
	protected static final int LS_COUNTRY_CODE_KEY_LEN = 2;
	/**
	 * 	serialize this LsCountryCodeKey
	 */
   protected void serializeLsCountryCodeKey(char[] lsCountryCodeKey) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(lsCountryCodeKey,0,getStringValue(),beginLsCountryCodeKey,LS_COUNTRY_CODE_KEY_LEN);
       localLsCountryCodeKeyCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkLsCountryCodeKeyConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshLsCountryCodeKey is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshLsCountryCodeKey() {	 
   		return (substring(getStringValue(),beginLsCountryCodeKey,beginLsCountryCodeKey + LS_COUNTRY_CODE_KEY_LEN));
   	}
     int localLsCurrencyCodeKeyCounter = -1;
     public boolean isLsCurrencyCodeKeyModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localLsCurrencyCodeKeyCounter != sharedCounter;
         localLsCurrencyCodeKeyCounter = sharedCounter; return hasModified;
     }
	protected static final int LS_CURRENCY_CODE_KEY_LEN = 3;
	/**
	 * 	serialize this LsCurrencyCodeKey
	 */
   protected void serializeLsCurrencyCodeKey(char[] lsCurrencyCodeKey) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(lsCurrencyCodeKey,0,getStringValue(),beginLsCurrencyCodeKey,LS_CURRENCY_CODE_KEY_LEN);
       localLsCurrencyCodeKeyCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkLsCurrencyCodeKeyConstraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshLsCurrencyCodeKey is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshLsCurrencyCodeKey() {	 
   		return (substring(getStringValue(),beginLsCurrencyCodeKey,beginLsCurrencyCodeKey + LS_CURRENCY_CODE_KEY_LEN));
   	}
     int localLsIndustryKeyCounter = -1;
     public boolean isLsIndustryKeyModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localLsIndustryKeyCounter != sharedCounter;
         localLsIndustryKeyCounter = sharedCounter; return hasModified;
     }
	protected static final int LS_INDUSTRY_KEY_LEN = 40;
	/**
	 * 	serialize this LsIndustryKey
	 */
   protected void serializeLsIndustryKey(char[] lsIndustryKey) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(lsIndustryKey,0,getStringValue(),beginLsIndustryKey,LS_INDUSTRY_KEY_LEN);
       localLsIndustryKeyCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkLsIndustryKeyConstraints(char[] value) {
   			return super.checkConstraints(value , 40 ,false, false);
   }
    /**
	 *	refreshLsIndustryKey is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshLsIndustryKey() {	 
   		return (substring(getStringValue(),beginLsIndustryKey,beginLsIndustryKey + LS_INDUSTRY_KEY_LEN));
   	}
     int localLsSectorKeyCounter = -1;
     public boolean isLsSectorKeyModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localLsSectorKeyCounter != sharedCounter;
         localLsSectorKeyCounter = sharedCounter; return hasModified;
     }
	protected static final int LS_SECTOR_KEY_LEN = 40;
	/**
	 * 	serialize this LsSectorKey
	 */
   protected void serializeLsSectorKey(char[] lsSectorKey) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(lsSectorKey,0,getStringValue(),beginLsSectorKey,LS_SECTOR_KEY_LEN);
       localLsSectorKeyCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkLsSectorKeyConstraints(char[] value) {
   			return super.checkConstraints(value , 40 ,false, false);
   }
    /**
	 *	refreshLsSectorKey is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshLsSectorKey() {	 
   		return (substring(getStringValue(),beginLsSectorKey,beginLsSectorKey + LS_SECTOR_KEY_LEN));
   	}
         int localLsReturnCodeCounter = -1;
         public boolean isLsReturnCodeModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localLsReturnCodeCounter != sharedCounter;
            localLsReturnCodeCounter = sharedCounter; return hasModified; 
         }
   protected static final int LS_RETURN_CODE_LEN = 2;
  	/**
	 * serializeLsReturnCode
	 */
	protected void serializeLsReturnCode(short lsReturnCode) {
           replaceValue( //  save the value as string
                   getBinaryString( lsReturnCode,LS_RETURN_CODE_LEN)
                  ,beginLsReturnCode
                  ,LS_RETURN_CODE_LEN
                 );
            localLsReturnCodeCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkLsReturnCodeMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshLsReturnCode is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshLsReturnCode() {	 
			return (getShort(beginLsReturnCode));
   	}
     int localLsEibrespCounter = -1;
     public boolean isLsEibrespModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localLsEibrespCounter != sharedCounter;
         localLsEibrespCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of lsEibresp
	 *	@return lsEibresp
	 */
	public char[]  getLsEibrespString() {
	     return getCharArray(beginLsEibresp,LS_EIBRESP_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean lsEibrespIsNumeric() {
	    return isNumeric(beginLsEibresp
	                    ,beginLsEibresp + LS_EIBRESP_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int LS_EIBRESP_LEN = 8;
  	/**
	 * serializeLsEibresp
	 */
	protected void serializeLsEibresp(long lsEibresp) {
		 putNumber(beginLsEibresp,lsEibresp,LS_EIBRESP_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localLsEibrespCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeLsEibresp
	 */
   	protected  long serializeLsEibresp(char[] value) {
	    long  lsEibresp;
	    if(value.length >0 && value.length!= 8)
            value = new String(value).trim().toCharArray();
	    if (value.length < 8) value = pad(8, value, ' ', LEFT_PAD);
	    else if (value.length > 8) value = substring(value,0,8);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    lsEibresp = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(8,value,false/*isSigned?*/)
		       ,beginLsEibresp
		       ,8
		      );
		 localLsEibrespCounter = shareString.getSerializedField().getModifiedCounter();
		return  lsEibresp;
    }

   protected long checkLsEibrespMaxLimit(long number) {

        return checkMaxLimit(number , MAX_100M/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshLsEibresp is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshLsEibresp() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginLsEibresp
			                 ,LS_EIBRESP_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("lsEibresp", beginLsEibresp,LS_EIBRESP_LEN);
    }
   	}
     int localLsEibresp2Counter = -1;
     public boolean isLsEibresp2Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localLsEibresp2Counter != sharedCounter;
         localLsEibresp2Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of lsEibresp2
	 *	@return lsEibresp2
	 */
	public char[]  getLsEibresp2String() {
	     return getCharArray(beginLsEibresp2,LS_EIBRESP_2_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean lsEibresp2IsNumeric() {
	    return isNumeric(beginLsEibresp2
	                    ,beginLsEibresp2 + LS_EIBRESP_2_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int LS_EIBRESP_2_LEN = 8;
  	/**
	 * serializeLsEibresp2
	 */
	protected void serializeLsEibresp2(long lsEibresp2) {
		 putNumber(beginLsEibresp2,lsEibresp2,LS_EIBRESP_2_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localLsEibresp2Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeLsEibresp2
	 */
   	protected  long serializeLsEibresp2(char[] value) {
	    long  lsEibresp2;
	    if(value.length >0 && value.length!= 8)
            value = new String(value).trim().toCharArray();
	    if (value.length < 8) value = pad(8, value, ' ', LEFT_PAD);
	    else if (value.length > 8) value = substring(value,0,8);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    lsEibresp2 = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(8,value,false/*isSigned?*/)
		       ,beginLsEibresp2
		       ,8
		      );
		 localLsEibresp2Counter = shareString.getSerializedField().getModifiedCounter();
		return  lsEibresp2;
    }

   protected long checkLsEibresp2MaxLimit(long number) {

        return checkMaxLimit(number , MAX_100M/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshLsEibresp2 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshLsEibresp2() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginLsEibresp2
			                 ,LS_EIBRESP_2_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("lsEibresp2", beginLsEibresp2,LS_EIBRESP_2_LEN);
    }
   	}
     int localLsOutputCountCounter = -1;
     public boolean isLsOutputCountModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localLsOutputCountCounter != sharedCounter;
         localLsOutputCountCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of lsOutputCount
	 *	@return lsOutputCount
	 */
	public char[]  getLsOutputCountString() {
	     return getCharArray(beginLsOutputCount,LS_OUTPUT_COUNT_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean lsOutputCountIsNumeric() {
	    return isNumeric(beginLsOutputCount
	                    ,beginLsOutputCount + LS_OUTPUT_COUNT_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int LS_OUTPUT_COUNT_LEN = 3;
  	/**
	 * serializeLsOutputCount
	 */
	protected void serializeLsOutputCount(int lsOutputCount) {
		 putNumber(beginLsOutputCount,lsOutputCount,LS_OUTPUT_COUNT_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localLsOutputCountCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeLsOutputCount
	 */
   	protected  int serializeLsOutputCount(char[] value) {
	    int  lsOutputCount;
	    if(value.length >0 && value.length!= 3)
            value = new String(value).trim().toCharArray();
	    if (value.length < 3) value = pad(3, value, ' ', LEFT_PAD);
	    else if (value.length > 3) value = substring(value,0,3);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    lsOutputCount = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(3,value,false/*isSigned?*/)
		       ,beginLsOutputCount
		       ,3
		      );
		 localLsOutputCountCounter = shareString.getSerializedField().getModifiedCounter();
		return  lsOutputCount;
    }

   protected int checkLsOutputCountMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_1000/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshLsOutputCount is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshLsOutputCount() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginLsOutputCount
			                 ,LS_OUTPUT_COUNT_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("lsOutputCount", beginLsOutputCount,LS_OUTPUT_COUNT_LEN);
    }
   	}

		public int lsOutputDataSize() {
			return LS_OUTPUT_DATA_SIZE;
		}



}
  
