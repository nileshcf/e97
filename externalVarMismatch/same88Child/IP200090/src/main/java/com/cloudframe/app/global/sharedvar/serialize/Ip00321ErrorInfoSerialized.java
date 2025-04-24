package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip00321ErrorInfoSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:38. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip00321ErrorInfoSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip00321ErrorInfoSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_00321_ERROR_INFO_LENGTH = 19;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp00321ErrorMsgSevCd;
            protected  int beginIp00321ErrorNumber;
            protected  int beginIp00321ErrorMessageNumber;
            protected  int beginIp00321IpmFieldType;
            protected  int beginIp00321IpmFieldNumber;
            protected  int beginIp00321IpmSubfieldNumber;
	
	/**
	* Constructor for Ip00321ErrorInfoSerialized
	**/
    public Ip00321ErrorInfoSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ip00321ErrorInfoSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip00321ErrorInfoSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ip00321ErrorInfoSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,176021); // serialize this field at offset 176021 by default 
    }
    
	/**
	* sets parent for this Ip00321ErrorInfoSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 176021 by default
    }    
	/**
	* initializes the field in Ip00321ErrorInfoSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_00321_ERROR_INFO_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp00321ErrorMsgSevCd = getStartOffset() + 0;	// set offset for serialization
  
             beginIp00321ErrorNumber = getStartOffset() + 2;	// set offset for serialization
  
             beginIp00321ErrorMessageNumber = getStartOffset() + 6;	// set offset for serialization
  
             beginIp00321IpmFieldType = getStartOffset() + 10;	// set offset for serialization
  
             beginIp00321IpmFieldNumber = getStartOffset() + 11;	// set offset for serialization
  
             beginIp00321IpmSubfieldNumber = getStartOffset() + 15;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localIp00321ErrorMsgSevCdCounter = -1;
     public boolean isIp00321ErrorMsgSevCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp00321ErrorMsgSevCdCounter != sharedCounter;
         localIp00321ErrorMsgSevCdCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ip00321ErrorMsgSevCd
	 *	@return ip00321ErrorMsgSevCd
	 */
	public char[]  getIp00321ErrorMsgSevCdString() {
	     return getCharArray(beginIp00321ErrorMsgSevCd,IP_00321_ERROR_MSG_SEV_CD_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip00321ErrorMsgSevCdIsNumeric() {
	    return isNumeric(beginIp00321ErrorMsgSevCd
	                    ,beginIp00321ErrorMsgSevCd + IP_00321_ERROR_MSG_SEV_CD_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int IP_00321_ERROR_MSG_SEV_CD_LEN = 2;
  	/**
	 * serializeIp00321ErrorMsgSevCd
	 */
	protected void serializeIp00321ErrorMsgSevCd(int ip00321ErrorMsgSevCd) {
		 putNumber(beginIp00321ErrorMsgSevCd,ip00321ErrorMsgSevCd,IP_00321_ERROR_MSG_SEV_CD_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localIp00321ErrorMsgSevCdCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeIp00321ErrorMsgSevCd
	 */
   	protected  int serializeIp00321ErrorMsgSevCd(char[] value) {
	    int  ip00321ErrorMsgSevCd;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ip00321ErrorMsgSevCd = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginIp00321ErrorMsgSevCd
		       ,2
		      );
		 localIp00321ErrorMsgSevCdCounter = shareString.getSerializedField().getModifiedCounter();
		return  ip00321ErrorMsgSevCd;
    }

   protected int checkIp00321ErrorMsgSevCdMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshIp00321ErrorMsgSevCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshIp00321ErrorMsgSevCd() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginIp00321ErrorMsgSevCd
			                 ,IP_00321_ERROR_MSG_SEV_CD_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ip00321ErrorMsgSevCd", beginIp00321ErrorMsgSevCd,IP_00321_ERROR_MSG_SEV_CD_LEN);
    }
   	}
     int localIp00321ErrorNumberCounter = -1;
     public boolean isIp00321ErrorNumberModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp00321ErrorNumberCounter != sharedCounter;
         localIp00321ErrorNumberCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ip00321ErrorNumber
	 *	@return ip00321ErrorNumber
	 */
	public char[]  getIp00321ErrorNumberString() {
	     return getCharArray(beginIp00321ErrorNumber,IP_00321_ERROR_NUMBER_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip00321ErrorNumberIsNumeric() {
	    return isNumeric(beginIp00321ErrorNumber
	                    ,beginIp00321ErrorNumber + IP_00321_ERROR_NUMBER_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int IP_00321_ERROR_NUMBER_LEN = 4;
  	/**
	 * serializeIp00321ErrorNumber
	 */
	protected void serializeIp00321ErrorNumber(int ip00321ErrorNumber) {
		 putNumber(beginIp00321ErrorNumber,ip00321ErrorNumber,IP_00321_ERROR_NUMBER_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localIp00321ErrorNumberCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeIp00321ErrorNumber
	 */
   	protected  int serializeIp00321ErrorNumber(char[] value) {
	    int  ip00321ErrorNumber;
	    if(value.length >0 && value.length!= 4)
            value = new String(value).trim().toCharArray();
	    if (value.length < 4) value = pad(4, value, ' ', LEFT_PAD);
	    else if (value.length > 4) value = substring(value,0,4);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ip00321ErrorNumber = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(4,value,false/*isSigned?*/)
		       ,beginIp00321ErrorNumber
		       ,4
		      );
		 localIp00321ErrorNumberCounter = shareString.getSerializedField().getModifiedCounter();
		return  ip00321ErrorNumber;
    }

   protected int checkIp00321ErrorNumberMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10K/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshIp00321ErrorNumber is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshIp00321ErrorNumber() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginIp00321ErrorNumber
			                 ,IP_00321_ERROR_NUMBER_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ip00321ErrorNumber", beginIp00321ErrorNumber,IP_00321_ERROR_NUMBER_LEN);
    }
   	}
     int localIp00321ErrorMessageNumberCounter = -1;
     public boolean isIp00321ErrorMessageNumberModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp00321ErrorMessageNumberCounter != sharedCounter;
         localIp00321ErrorMessageNumberCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ip00321ErrorMessageNumber
	 *	@return ip00321ErrorMessageNumber
	 */
	public char[]  getIp00321ErrorMessageNumberString() {
	     return getCharArray(beginIp00321ErrorMessageNumber,IP_00321_ERROR_MESSAGE_NUMBER_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip00321ErrorMessageNumberIsNumeric() {
	    return isNumeric(beginIp00321ErrorMessageNumber
	                    ,beginIp00321ErrorMessageNumber + IP_00321_ERROR_MESSAGE_NUMBER_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int IP_00321_ERROR_MESSAGE_NUMBER_LEN = 4;
  	/**
	 * serializeIp00321ErrorMessageNumber
	 */
	protected void serializeIp00321ErrorMessageNumber(int ip00321ErrorMessageNumber) {
		 putNumber(beginIp00321ErrorMessageNumber,ip00321ErrorMessageNumber,IP_00321_ERROR_MESSAGE_NUMBER_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localIp00321ErrorMessageNumberCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeIp00321ErrorMessageNumber
	 */
   	protected  int serializeIp00321ErrorMessageNumber(char[] value) {
	    int  ip00321ErrorMessageNumber;
	    if(value.length >0 && value.length!= 4)
            value = new String(value).trim().toCharArray();
	    if (value.length < 4) value = pad(4, value, ' ', LEFT_PAD);
	    else if (value.length > 4) value = substring(value,0,4);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ip00321ErrorMessageNumber = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(4,value,false/*isSigned?*/)
		       ,beginIp00321ErrorMessageNumber
		       ,4
		      );
		 localIp00321ErrorMessageNumberCounter = shareString.getSerializedField().getModifiedCounter();
		return  ip00321ErrorMessageNumber;
    }

   protected int checkIp00321ErrorMessageNumberMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10K/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshIp00321ErrorMessageNumber is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshIp00321ErrorMessageNumber() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginIp00321ErrorMessageNumber
			                 ,IP_00321_ERROR_MESSAGE_NUMBER_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ip00321ErrorMessageNumber", beginIp00321ErrorMessageNumber,IP_00321_ERROR_MESSAGE_NUMBER_LEN);
    }
   	}
     int localIp00321IpmFieldTypeCounter = -1;
     public boolean isIp00321IpmFieldTypeModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp00321IpmFieldTypeCounter != sharedCounter;
         localIp00321IpmFieldTypeCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_00321_IPM_FIELD_TYPE_LEN = 1;
	/**
	 * 	serialize this Ip00321IpmFieldType
	 */
   protected void serializeIp00321IpmFieldType(char[] ip00321IpmFieldType) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip00321IpmFieldType,0,getStringValue(),beginIp00321IpmFieldType,IP_00321_IPM_FIELD_TYPE_LEN);
       localIp00321IpmFieldTypeCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp00321IpmFieldTypeConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp00321IpmFieldType is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp00321IpmFieldType() {	 
   		return (substring(getStringValue(),beginIp00321IpmFieldType,beginIp00321IpmFieldType + IP_00321_IPM_FIELD_TYPE_LEN));
   	}
         int localIp00321IpmFieldNumberCounter = -1;
         public boolean isIp00321IpmFieldNumberModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp00321IpmFieldNumberCounter != sharedCounter;
            localIp00321IpmFieldNumberCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_00321_IPM_FIELD_NUMBER_LEN = 4;
  	/**
	 * serializeIp00321IpmFieldNumber
	 */
	protected void serializeIp00321IpmFieldNumber(long ip00321IpmFieldNumber) {
           replaceValue( //  save the value as string
                   getBinaryString( ip00321IpmFieldNumber,IP_00321_IPM_FIELD_NUMBER_LEN)
                  ,beginIp00321IpmFieldNumber
                  ,IP_00321_IPM_FIELD_NUMBER_LEN
                 );
            localIp00321IpmFieldNumberCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected long checkIp00321IpmFieldNumberMaxLimit(long number) {
        return checkMaxLimit(number, false/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshIp00321IpmFieldNumber is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshIp00321IpmFieldNumber() {	 
			return (getUnsignedInt(beginIp00321IpmFieldNumber));
   	}
         int localIp00321IpmSubfieldNumberCounter = -1;
         public boolean isIp00321IpmSubfieldNumberModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp00321IpmSubfieldNumberCounter != sharedCounter;
            localIp00321IpmSubfieldNumberCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_00321_IPM_SUBFIELD_NUMBER_LEN = 4;
  	/**
	 * serializeIp00321IpmSubfieldNumber
	 */
	protected void serializeIp00321IpmSubfieldNumber(long ip00321IpmSubfieldNumber) {
           replaceValue( //  save the value as string
                   getBinaryString( ip00321IpmSubfieldNumber,IP_00321_IPM_SUBFIELD_NUMBER_LEN)
                  ,beginIp00321IpmSubfieldNumber
                  ,IP_00321_IPM_SUBFIELD_NUMBER_LEN
                 );
            localIp00321IpmSubfieldNumberCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected long checkIp00321IpmSubfieldNumberMaxLimit(long number) {
        return checkMaxLimit(number, false/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshIp00321IpmSubfieldNumber is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshIp00321IpmSubfieldNumber() {	 
			return (getUnsignedInt(beginIp00321IpmSubfieldNumber));
   	}




}
  
