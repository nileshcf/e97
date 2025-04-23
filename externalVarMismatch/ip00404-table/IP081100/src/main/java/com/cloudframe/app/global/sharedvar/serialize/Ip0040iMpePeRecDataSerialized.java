package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip0040iMpePeRecDataSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:08. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip0040iMpePeRecDataSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip0040iMpePeRecDataSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_0040I_MPE_PE_REC_DATA_LENGTH = 25;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp0040iAccountRangeId;
            protected  int beginIp0040iAb;
            protected  int beginIp0040iPriorityCode;
            protected  int beginIp0040iPrfxIca;
            protected  int beginIp0040iProdId;
	
	/**
	* Constructor for Ip0040iMpePeRecDataSerialized
	**/
    public Ip0040iMpePeRecDataSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ip0040iMpePeRecDataSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip0040iMpePeRecDataSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ip0040iMpePeRecDataSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this Ip0040iMpePeRecDataSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in Ip0040iMpePeRecDataSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_0040I_MPE_PE_REC_DATA_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp0040iAccountRangeId = getStartOffset() + 0;	// set offset for serialization
  
             beginIp0040iAb = getStartOffset() + 6;	// set offset for serialization
  
             beginIp0040iPriorityCode = getStartOffset() + 9;	// set offset for serialization
  
             beginIp0040iPrfxIca = getStartOffset() + 11;	// set offset for serialization
  
             beginIp0040iProdId = getStartOffset() + 22;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localIp0040iAccountRangeIdCounter = -1;
     public boolean isIp0040iAccountRangeIdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp0040iAccountRangeIdCounter != sharedCounter;
         localIp0040iAccountRangeIdCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ip0040iAccountRangeId
	 *	@return ip0040iAccountRangeId
	 */
	public char[]  getIp0040iAccountRangeIdString() {
	     return getCharArray(beginIp0040iAccountRangeId,IP_0040I_ACCOUNT_RANGE_ID_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip0040iAccountRangeIdIsNumeric() {
	    return isNumeric(beginIp0040iAccountRangeId
	                    ,beginIp0040iAccountRangeId + IP_0040I_ACCOUNT_RANGE_ID_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int IP_0040I_ACCOUNT_RANGE_ID_LEN = 6;
  	/**
	 * serializeIp0040iAccountRangeId
	 */
	protected void serializeIp0040iAccountRangeId(long ip0040iAccountRangeId) {
		 putNumber(beginIp0040iAccountRangeId,ip0040iAccountRangeId,IP_0040I_ACCOUNT_RANGE_ID_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localIp0040iAccountRangeIdCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeIp0040iAccountRangeId
	 */
   	protected  long serializeIp0040iAccountRangeId(char[] value) {
	    long  ip0040iAccountRangeId;
	    if(value.length >0 && value.length!= 6)
            value = new String(value).trim().toCharArray();
	    if (value.length < 6) value = pad(6, value, ' ', LEFT_PAD);
	    else if (value.length > 6) value = substring(value,0,6);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ip0040iAccountRangeId = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(6,value,false/*isSigned?*/)
		       ,beginIp0040iAccountRangeId
		       ,6
		      );
		 localIp0040iAccountRangeIdCounter = shareString.getSerializedField().getModifiedCounter();
		return  ip0040iAccountRangeId;
    }

   protected long checkIp0040iAccountRangeIdMaxLimit(long number) {

        return checkMaxLimit(number , MAX_1M/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshIp0040iAccountRangeId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshIp0040iAccountRangeId() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginIp0040iAccountRangeId
			                 ,IP_0040I_ACCOUNT_RANGE_ID_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ip0040iAccountRangeId", beginIp0040iAccountRangeId,IP_0040I_ACCOUNT_RANGE_ID_LEN);
    }
   	}
     int localIp0040iAbCounter = -1;
     public boolean isIp0040iAbModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp0040iAbCounter != sharedCounter;
         localIp0040iAbCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_0040I_AB_LEN = 3;
	/**
	 * 	serialize this Ip0040iAb
	 */
   protected void serializeIp0040iAb(char[] ip0040iAb) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip0040iAb,0,getStringValue(),beginIp0040iAb,IP_0040I_AB_LEN);
       localIp0040iAbCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp0040iAbConstraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshIp0040iAb is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp0040iAb() {	 
   		return (substring(getStringValue(),beginIp0040iAb,beginIp0040iAb + IP_0040I_AB_LEN));
   	}
     int localIp0040iPriorityCodeCounter = -1;
     public boolean isIp0040iPriorityCodeModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp0040iPriorityCodeCounter != sharedCounter;
         localIp0040iPriorityCodeCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ip0040iPriorityCode
	 *	@return ip0040iPriorityCode
	 */
	public char[]  getIp0040iPriorityCodeString() {
	     return getCharArray(beginIp0040iPriorityCode,IP_0040I_PRIORITY_CODE_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip0040iPriorityCodeIsNumeric() {
	    return isNumeric(beginIp0040iPriorityCode
	                    ,beginIp0040iPriorityCode + IP_0040I_PRIORITY_CODE_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int IP_0040I_PRIORITY_CODE_LEN = 2;
  	/**
	 * serializeIp0040iPriorityCode
	 */
	protected void serializeIp0040iPriorityCode(int ip0040iPriorityCode) {
		 putNumber(beginIp0040iPriorityCode,ip0040iPriorityCode,IP_0040I_PRIORITY_CODE_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localIp0040iPriorityCodeCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeIp0040iPriorityCode
	 */
   	protected  int serializeIp0040iPriorityCode(char[] value) {
	    int  ip0040iPriorityCode;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ip0040iPriorityCode = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginIp0040iPriorityCode
		       ,2
		      );
		 localIp0040iPriorityCodeCounter = shareString.getSerializedField().getModifiedCounter();
		return  ip0040iPriorityCode;
    }

   protected int checkIp0040iPriorityCodeMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshIp0040iPriorityCode is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshIp0040iPriorityCode() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginIp0040iPriorityCode
			                 ,IP_0040I_PRIORITY_CODE_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ip0040iPriorityCode", beginIp0040iPriorityCode,IP_0040I_PRIORITY_CODE_LEN);
    }
   	}
     int localIp0040iPrfxIcaCounter = -1;
     public boolean isIp0040iPrfxIcaModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp0040iPrfxIcaCounter != sharedCounter;
         localIp0040iPrfxIcaCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ip0040iPrfxIca
	 *	@return ip0040iPrfxIca
	 */
	public char[]  getIp0040iPrfxIcaString() {
	     return getCharArray(beginIp0040iPrfxIca,IP_0040I_PRFX_ICA_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip0040iPrfxIcaIsNumeric() {
	    return isNumeric(beginIp0040iPrfxIca
	                    ,beginIp0040iPrfxIca + IP_0040I_PRFX_ICA_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int IP_0040I_PRFX_ICA_LEN = 11;
  	/**
	 * serializeIp0040iPrfxIca
	 */
	protected void serializeIp0040iPrfxIca(long ip0040iPrfxIca) {
		 putNumber(beginIp0040iPrfxIca,ip0040iPrfxIca,IP_0040I_PRFX_ICA_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localIp0040iPrfxIcaCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeIp0040iPrfxIca
	 */
   	protected  long serializeIp0040iPrfxIca(char[] value) {
	    long  ip0040iPrfxIca;
	    if(value.length >0 && value.length!= 11)
            value = new String(value).trim().toCharArray();
	    if (value.length < 11) value = pad(11, value, ' ', LEFT_PAD);
	    else if (value.length > 11) value = substring(value,0,11);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ip0040iPrfxIca = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(11,value,false/*isSigned?*/)
		       ,beginIp0040iPrfxIca
		       ,11
		      );
		 localIp0040iPrfxIcaCounter = shareString.getSerializedField().getModifiedCounter();
		return  ip0040iPrfxIca;
    }

   protected long checkIp0040iPrfxIcaMaxLimit(long number) {

        return checkMaxLimit(number , MAX_100G/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshIp0040iPrfxIca is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshIp0040iPrfxIca() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginIp0040iPrfxIca
			                 ,IP_0040I_PRFX_ICA_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ip0040iPrfxIca", beginIp0040iPrfxIca,IP_0040I_PRFX_ICA_LEN);
    }
   	}
     int localIp0040iProdIdCounter = -1;
     public boolean isIp0040iProdIdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp0040iProdIdCounter != sharedCounter;
         localIp0040iProdIdCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_0040I_PROD_ID_LEN = 3;
	/**
	 * 	serialize this Ip0040iProdId
	 */
   protected void serializeIp0040iProdId(char[] ip0040iProdId) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip0040iProdId,0,getStringValue(),beginIp0040iProdId,IP_0040I_PROD_ID_LEN);
       localIp0040iProdIdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp0040iProdIdConstraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshIp0040iProdId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp0040iProdId() {	 
   		return (substring(getStringValue(),beginIp0040iProdId,beginIp0040iProdId + IP_0040I_PROD_ID_LEN));
   	}




}
  
