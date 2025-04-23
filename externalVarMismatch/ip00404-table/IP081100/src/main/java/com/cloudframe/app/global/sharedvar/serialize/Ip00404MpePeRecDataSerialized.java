package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip00404MpePeRecDataSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:08. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip00404MpePeRecDataSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip00404MpePeRecDataSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_00404_MPE_PE_REC_DATA_LENGTH = 25;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp00404AccountRangeId;
            protected  int beginIp00404Ab;
            protected  int beginIp00404PriorityCode;
            protected  int beginIp00404PrfxIca;
            protected  int beginIp00404ProdId;
	
	/**
	* Constructor for Ip00404MpePeRecDataSerialized
	**/
    public Ip00404MpePeRecDataSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ip00404MpePeRecDataSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip00404MpePeRecDataSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ip00404MpePeRecDataSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,42); // serialize this field at offset 42 by default 
    }
    
	/**
	* sets parent for this Ip00404MpePeRecDataSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 42 by default
    }    
	/**
	* initializes the field in Ip00404MpePeRecDataSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_00404_MPE_PE_REC_DATA_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp00404AccountRangeId = getStartOffset() + 0;	// set offset for serialization
  
             beginIp00404Ab = getStartOffset() + 6;	// set offset for serialization
  
             beginIp00404PriorityCode = getStartOffset() + 9;	// set offset for serialization
  
             beginIp00404PrfxIca = getStartOffset() + 11;	// set offset for serialization
  
             beginIp00404ProdId = getStartOffset() + 22;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localIp00404AccountRangeIdCounter = -1;
     public boolean isIp00404AccountRangeIdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp00404AccountRangeIdCounter != sharedCounter;
         localIp00404AccountRangeIdCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ip00404AccountRangeId
	 *	@return ip00404AccountRangeId
	 */
	public char[]  getIp00404AccountRangeIdString() {
	     return getCharArray(beginIp00404AccountRangeId,IP_00404_ACCOUNT_RANGE_ID_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip00404AccountRangeIdIsNumeric() {
	    return isNumeric(beginIp00404AccountRangeId
	                    ,beginIp00404AccountRangeId + IP_00404_ACCOUNT_RANGE_ID_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int IP_00404_ACCOUNT_RANGE_ID_LEN = 6;
  	/**
	 * serializeIp00404AccountRangeId
	 */
	protected void serializeIp00404AccountRangeId(long ip00404AccountRangeId) {
		 putNumber(beginIp00404AccountRangeId,ip00404AccountRangeId,IP_00404_ACCOUNT_RANGE_ID_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localIp00404AccountRangeIdCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeIp00404AccountRangeId
	 */
   	protected  long serializeIp00404AccountRangeId(char[] value) {
	    long  ip00404AccountRangeId;
	    if(value.length >0 && value.length!= 6)
            value = new String(value).trim().toCharArray();
	    if (value.length < 6) value = pad(6, value, ' ', LEFT_PAD);
	    else if (value.length > 6) value = substring(value,0,6);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ip00404AccountRangeId = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(6,value,false/*isSigned?*/)
		       ,beginIp00404AccountRangeId
		       ,6
		      );
		 localIp00404AccountRangeIdCounter = shareString.getSerializedField().getModifiedCounter();
		return  ip00404AccountRangeId;
    }

   protected long checkIp00404AccountRangeIdMaxLimit(long number) {

        return checkMaxLimit(number , MAX_1M/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshIp00404AccountRangeId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshIp00404AccountRangeId() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginIp00404AccountRangeId
			                 ,IP_00404_ACCOUNT_RANGE_ID_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ip00404AccountRangeId", beginIp00404AccountRangeId,IP_00404_ACCOUNT_RANGE_ID_LEN);
    }
   	}
     int localIp00404AbCounter = -1;
     public boolean isIp00404AbModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp00404AbCounter != sharedCounter;
         localIp00404AbCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_00404_AB_LEN = 3;
	/**
	 * 	serialize this Ip00404Ab
	 */
   protected void serializeIp00404Ab(char[] ip00404Ab) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip00404Ab,0,getStringValue(),beginIp00404Ab,IP_00404_AB_LEN);
       localIp00404AbCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp00404AbConstraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshIp00404Ab is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp00404Ab() {	 
   		return (substring(getStringValue(),beginIp00404Ab,beginIp00404Ab + IP_00404_AB_LEN));
   	}
     int localIp00404PriorityCodeCounter = -1;
     public boolean isIp00404PriorityCodeModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp00404PriorityCodeCounter != sharedCounter;
         localIp00404PriorityCodeCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ip00404PriorityCode
	 *	@return ip00404PriorityCode
	 */
	public char[]  getIp00404PriorityCodeString() {
	     return getCharArray(beginIp00404PriorityCode,IP_00404_PRIORITY_CODE_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip00404PriorityCodeIsNumeric() {
	    return isNumeric(beginIp00404PriorityCode
	                    ,beginIp00404PriorityCode + IP_00404_PRIORITY_CODE_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int IP_00404_PRIORITY_CODE_LEN = 2;
  	/**
	 * serializeIp00404PriorityCode
	 */
	protected void serializeIp00404PriorityCode(int ip00404PriorityCode) {
		 putNumber(beginIp00404PriorityCode,ip00404PriorityCode,IP_00404_PRIORITY_CODE_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localIp00404PriorityCodeCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeIp00404PriorityCode
	 */
   	protected  int serializeIp00404PriorityCode(char[] value) {
	    int  ip00404PriorityCode;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ip00404PriorityCode = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginIp00404PriorityCode
		       ,2
		      );
		 localIp00404PriorityCodeCounter = shareString.getSerializedField().getModifiedCounter();
		return  ip00404PriorityCode;
    }

   protected int checkIp00404PriorityCodeMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshIp00404PriorityCode is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshIp00404PriorityCode() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginIp00404PriorityCode
			                 ,IP_00404_PRIORITY_CODE_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ip00404PriorityCode", beginIp00404PriorityCode,IP_00404_PRIORITY_CODE_LEN);
    }
   	}
     int localIp00404PrfxIcaCounter = -1;
     public boolean isIp00404PrfxIcaModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp00404PrfxIcaCounter != sharedCounter;
         localIp00404PrfxIcaCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ip00404PrfxIca
	 *	@return ip00404PrfxIca
	 */
	public char[]  getIp00404PrfxIcaString() {
	     return getCharArray(beginIp00404PrfxIca,IP_00404_PRFX_ICA_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip00404PrfxIcaIsNumeric() {
	    return isNumeric(beginIp00404PrfxIca
	                    ,beginIp00404PrfxIca + IP_00404_PRFX_ICA_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int IP_00404_PRFX_ICA_LEN = 11;
  	/**
	 * serializeIp00404PrfxIca
	 */
	protected void serializeIp00404PrfxIca(long ip00404PrfxIca) {
		 putNumber(beginIp00404PrfxIca,ip00404PrfxIca,IP_00404_PRFX_ICA_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localIp00404PrfxIcaCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeIp00404PrfxIca
	 */
   	protected  long serializeIp00404PrfxIca(char[] value) {
	    long  ip00404PrfxIca;
	    if(value.length >0 && value.length!= 11)
            value = new String(value).trim().toCharArray();
	    if (value.length < 11) value = pad(11, value, ' ', LEFT_PAD);
	    else if (value.length > 11) value = substring(value,0,11);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ip00404PrfxIca = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(11,value,false/*isSigned?*/)
		       ,beginIp00404PrfxIca
		       ,11
		      );
		 localIp00404PrfxIcaCounter = shareString.getSerializedField().getModifiedCounter();
		return  ip00404PrfxIca;
    }

   protected long checkIp00404PrfxIcaMaxLimit(long number) {

        return checkMaxLimit(number , MAX_100G/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshIp00404PrfxIca is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshIp00404PrfxIca() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginIp00404PrfxIca
			                 ,IP_00404_PRFX_ICA_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ip00404PrfxIca", beginIp00404PrfxIca,IP_00404_PRFX_ICA_LEN);
    }
   	}
     int localIp00404ProdIdCounter = -1;
     public boolean isIp00404ProdIdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp00404ProdIdCounter != sharedCounter;
         localIp00404ProdIdCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_00404_PROD_ID_LEN = 3;
	/**
	 * 	serialize this Ip00404ProdId
	 */
   protected void serializeIp00404ProdId(char[] ip00404ProdId) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip00404ProdId,0,getStringValue(),beginIp00404ProdId,IP_00404_PROD_ID_LEN);
       localIp00404ProdIdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp00404ProdIdConstraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshIp00404ProdId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp00404ProdId() {	 
   		return (substring(getStringValue(),beginIp00404ProdId,beginIp00404ProdId + IP_00404_PROD_ID_LEN));
   	}




}
  
