package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip30331FaFileIdStatusTblSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:04. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip30331FaFileIdStatusTblSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip30331FaFileIdStatusTblSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_30331_FA_FILE_ID_STATUS_TBL_LENGTH = 26;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp30331MessageNumber;
            protected  int beginIp30331EditStatus;
            protected  int beginIp30331CorpIncentFlag;
            protected  int beginIp303312ndlvlCorpIncntFlag;
	
	/**
	* Constructor for Ip30331FaFileIdStatusTblSerialized
	**/
    public Ip30331FaFileIdStatusTblSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ip30331FaFileIdStatusTblSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip30331FaFileIdStatusTblSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ip30331FaFileIdStatusTblSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,4); // serialize this field at offset 4 by default 
    }
    
	/**
	* sets parent for this Ip30331FaFileIdStatusTblSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 4 by default
    }    
	/**
	* initializes the field in Ip30331FaFileIdStatusTblSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_30331_FA_FILE_ID_STATUS_TBL_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp30331MessageNumber = getStartOffset() + 0;	// set offset for serialization
  
  
  
             beginIp30331EditStatus = getStartOffset() + 23;	// set offset for serialization
  
             beginIp30331CorpIncentFlag = getStartOffset() + 24;	// set offset for serialization
  
             beginIp303312ndlvlCorpIncntFlag = getStartOffset() + 25;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localIp30331MessageNumberCounter = -1;
     public boolean isIp30331MessageNumberModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp30331MessageNumberCounter != sharedCounter;
         localIp30331MessageNumberCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ip30331MessageNumber
	 *	@return ip30331MessageNumber
	 */
	public char[]  getIp30331MessageNumberString() {
	     return getCharArray(beginIp30331MessageNumber,IP_30331_MESSAGE_NUMBER_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip30331MessageNumberIsNumeric() {
	    return isNumeric(beginIp30331MessageNumber
	                    ,beginIp30331MessageNumber + IP_30331_MESSAGE_NUMBER_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int IP_30331_MESSAGE_NUMBER_LEN = 8;
  	/**
	 * serializeIp30331MessageNumber
	 */
	protected void serializeIp30331MessageNumber(long ip30331MessageNumber) {
		 putNumber(beginIp30331MessageNumber,ip30331MessageNumber,IP_30331_MESSAGE_NUMBER_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localIp30331MessageNumberCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeIp30331MessageNumber
	 */
   	protected  long serializeIp30331MessageNumber(char[] value) {
	    long  ip30331MessageNumber;
	    if(value.length >0 && value.length!= 8)
            value = new String(value).trim().toCharArray();
	    if (value.length < 8) value = pad(8, value, ' ', LEFT_PAD);
	    else if (value.length > 8) value = substring(value,0,8);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ip30331MessageNumber = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(8,value,false/*isSigned?*/)
		       ,beginIp30331MessageNumber
		       ,8
		      );
		 localIp30331MessageNumberCounter = shareString.getSerializedField().getModifiedCounter();
		return  ip30331MessageNumber;
    }

   protected long checkIp30331MessageNumberMaxLimit(long number) {

        return checkMaxLimit(number , MAX_100M/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshIp30331MessageNumber is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshIp30331MessageNumber() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginIp30331MessageNumber
			                 ,IP_30331_MESSAGE_NUMBER_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ip30331MessageNumber", beginIp30331MessageNumber,IP_30331_MESSAGE_NUMBER_LEN);
    }
   	}
     int localIp30331EditStatusCounter = -1;
     public boolean isIp30331EditStatusModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp30331EditStatusCounter != sharedCounter;
         localIp30331EditStatusCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_30331_EDIT_STATUS_LEN = 1;
	/**
	 * 	serialize this Ip30331EditStatus
	 */
   protected void serializeIp30331EditStatus(char[] ip30331EditStatus) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip30331EditStatus,0,getStringValue(),beginIp30331EditStatus,IP_30331_EDIT_STATUS_LEN);
       localIp30331EditStatusCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp30331EditStatusConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp30331EditStatus is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp30331EditStatus() {	 
   		return (substring(getStringValue(),beginIp30331EditStatus,beginIp30331EditStatus + IP_30331_EDIT_STATUS_LEN));
   	}
     int localIp30331CorpIncentFlagCounter = -1;
     public boolean isIp30331CorpIncentFlagModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp30331CorpIncentFlagCounter != sharedCounter;
         localIp30331CorpIncentFlagCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_30331_CORP_INCENT_FLAG_LEN = 1;
	/**
	 * 	serialize this Ip30331CorpIncentFlag
	 */
   protected void serializeIp30331CorpIncentFlag(char[] ip30331CorpIncentFlag) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip30331CorpIncentFlag,0,getStringValue(),beginIp30331CorpIncentFlag,IP_30331_CORP_INCENT_FLAG_LEN);
       localIp30331CorpIncentFlagCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp30331CorpIncentFlagConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp30331CorpIncentFlag is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp30331CorpIncentFlag() {	 
   		return (substring(getStringValue(),beginIp30331CorpIncentFlag,beginIp30331CorpIncentFlag + IP_30331_CORP_INCENT_FLAG_LEN));
   	}
     int localIp303312ndlvlCorpIncntFlagCounter = -1;
     public boolean isIp303312ndlvlCorpIncntFlagModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp303312ndlvlCorpIncntFlagCounter != sharedCounter;
         localIp303312ndlvlCorpIncntFlagCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_303312NDLVL_CORP_INCNT_FLAG_LEN = 1;
	/**
	 * 	serialize this Ip303312ndlvlCorpIncntFlag
	 */
   protected void serializeIp303312ndlvlCorpIncntFlag(char[] ip303312ndlvlCorpIncntFlag) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip303312ndlvlCorpIncntFlag,0,getStringValue(),beginIp303312ndlvlCorpIncntFlag,IP_303312NDLVL_CORP_INCNT_FLAG_LEN);
       localIp303312ndlvlCorpIncntFlagCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp303312ndlvlCorpIncntFlagConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp303312ndlvlCorpIncntFlag is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp303312ndlvlCorpIncntFlag() {	 
   		return (substring(getStringValue(),beginIp303312ndlvlCorpIncntFlag,beginIp303312ndlvlCorpIncntFlag + IP_303312NDLVL_CORP_INCNT_FLAG_LEN));
   	}




}
  
