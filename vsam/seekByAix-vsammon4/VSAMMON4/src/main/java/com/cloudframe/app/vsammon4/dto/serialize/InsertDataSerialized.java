package com.cloudframe.app.vsammon4.dto.serialize;

/**
*  The class InsertDataSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:23. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class InsertDataSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(InsertDataSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int INSERT_DATA_LENGTH = 31;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIInsertKey;
            protected  int beginITaskNo;
            protected  int beginIReqSize;
            protected  int beginIDataLen;
	
	/**
	* Constructor for InsertDataSerialized
	**/
    public InsertDataSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for InsertDataSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public InsertDataSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this InsertDataSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,7); // serialize this field at offset 7 by default 
    }
    
	/**
	* sets parent for this InsertDataSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 7 by default
    }    
	/**
	* initializes the field in InsertDataSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(INSERT_DATA_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIInsertKey = getStartOffset() + 0;	// set offset for serialization
  
             beginITaskNo = getStartOffset() + 10;	// set offset for serialization
  
             beginIReqSize = getStartOffset() + 18;	// set offset for serialization
  
             beginIDataLen = getStartOffset() + 28;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localIInsertKeyCounter = -1;
     public boolean isIInsertKeyModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIInsertKeyCounter != sharedCounter;
         localIInsertKeyCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of iInsertKey
	 *	@return iInsertKey
	 */
	public char[]  getIInsertKeyString() {
	     return getCharArray(beginIInsertKey,I_INSERT_KEY_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean iInsertKeyIsNumeric() {
	    return isNumeric(beginIInsertKey
	                    ,beginIInsertKey + I_INSERT_KEY_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int I_INSERT_KEY_LEN = 9;
  	/**
	 * serializeIInsertKey
	 */
	protected void serializeIInsertKey(long iInsertKey) {
		 putNumber(beginIInsertKey,iInsertKey,I_INSERT_KEY_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localIInsertKeyCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeIInsertKey
	 */
   	protected  long serializeIInsertKey(char[] value) {
	    long  iInsertKey;
	    if(value.length >0 && value.length!= 9)
            value = new String(value).trim().toCharArray();
	    if (value.length < 9) value = pad(9, value, ' ', LEFT_PAD);
	    else if (value.length > 9) value = substring(value,0,9);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    iInsertKey = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(9,value,false/*isSigned?*/)
		       ,beginIInsertKey
		       ,9
		      );
		 localIInsertKeyCounter = shareString.getSerializedField().getModifiedCounter();
		return  iInsertKey;
    }

   protected long checkIInsertKeyMaxLimit(long number) {

        return checkMaxLimit(number , MAX_1G/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshIInsertKey is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshIInsertKey() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginIInsertKey
			                 ,I_INSERT_KEY_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("iInsertKey", beginIInsertKey,I_INSERT_KEY_LEN);
    }
   	}
     int localITaskNoCounter = -1;
     public boolean isITaskNoModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localITaskNoCounter != sharedCounter;
         localITaskNoCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of iTaskNo
	 *	@return iTaskNo
	 */
	public char[]  getITaskNoString() {
	     return getCharArray(beginITaskNo,I_TASK_NO_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean iTaskNoIsNumeric() {
	    return isNumeric(beginITaskNo
	                    ,beginITaskNo + I_TASK_NO_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int I_TASK_NO_LEN = 7;
  	/**
	 * serializeITaskNo
	 */
	protected void serializeITaskNo(long iTaskNo) {
		 putNumber(beginITaskNo,iTaskNo,I_TASK_NO_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localITaskNoCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeITaskNo
	 */
   	protected  long serializeITaskNo(char[] value) {
	    long  iTaskNo;
	    if(value.length >0 && value.length!= 7)
            value = new String(value).trim().toCharArray();
	    if (value.length < 7) value = pad(7, value, ' ', LEFT_PAD);
	    else if (value.length > 7) value = substring(value,0,7);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    iTaskNo = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(7,value,false/*isSigned?*/)
		       ,beginITaskNo
		       ,7
		      );
		 localITaskNoCounter = shareString.getSerializedField().getModifiedCounter();
		return  iTaskNo;
    }

   protected long checkITaskNoMaxLimit(long number) {

        return checkMaxLimit(number , MAX_10M/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshITaskNo is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshITaskNo() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginITaskNo
			                 ,I_TASK_NO_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("iTaskNo", beginITaskNo,I_TASK_NO_LEN);
    }
   	}
     int localIReqSizeCounter = -1;
     public boolean isIReqSizeModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIReqSizeCounter != sharedCounter;
         localIReqSizeCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of iReqSize
	 *	@return iReqSize
	 */
	public char[]  getIReqSizeString() {
	     return getCharArray(beginIReqSize,I_REQ_SIZE_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean iReqSizeIsNumeric() {
	    return isNumeric(beginIReqSize
	                    ,beginIReqSize + I_REQ_SIZE_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int I_REQ_SIZE_LEN = 9;
  	/**
	 * serializeIReqSize
	 */
	protected void serializeIReqSize(long iReqSize) {
		 putNumber(beginIReqSize,iReqSize,I_REQ_SIZE_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localIReqSizeCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeIReqSize
	 */
   	protected  long serializeIReqSize(char[] value) {
	    long  iReqSize;
	    if(value.length >0 && value.length!= 9)
            value = new String(value).trim().toCharArray();
	    if (value.length < 9) value = pad(9, value, ' ', LEFT_PAD);
	    else if (value.length > 9) value = substring(value,0,9);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    iReqSize = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(9,value,false/*isSigned?*/)
		       ,beginIReqSize
		       ,9
		      );
		 localIReqSizeCounter = shareString.getSerializedField().getModifiedCounter();
		return  iReqSize;
    }

   protected long checkIReqSizeMaxLimit(long number) {

        return checkMaxLimit(number , MAX_1G/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshIReqSize is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshIReqSize() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginIReqSize
			                 ,I_REQ_SIZE_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("iReqSize", beginIReqSize,I_REQ_SIZE_LEN);
    }
   	}
     int localIDataLenCounter = -1;
     public boolean isIDataLenModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIDataLenCounter != sharedCounter;
         localIDataLenCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of iDataLen
	 *	@return iDataLen
	 */
	public char[]  getIDataLenString() {
	     return getCharArray(beginIDataLen,I_DATA_LEN_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean iDataLenIsNumeric() {
	    return isNumeric(beginIDataLen
	                    ,beginIDataLen + I_DATA_LEN_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int I_DATA_LEN_LEN = 3;
  	/**
	 * serializeIDataLen
	 */
	protected void serializeIDataLen(int iDataLen) {
		 putNumber(beginIDataLen,iDataLen,I_DATA_LEN_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localIDataLenCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeIDataLen
	 */
   	protected  int serializeIDataLen(char[] value) {
	    int  iDataLen;
	    if(value.length >0 && value.length!= 3)
            value = new String(value).trim().toCharArray();
	    if (value.length < 3) value = pad(3, value, ' ', LEFT_PAD);
	    else if (value.length > 3) value = substring(value,0,3);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    iDataLen = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(3,value,false/*isSigned?*/)
		       ,beginIDataLen
		       ,3
		      );
		 localIDataLenCounter = shareString.getSerializedField().getModifiedCounter();
		return  iDataLen;
    }

   protected int checkIDataLenMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_1000/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshIDataLen is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshIDataLen() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginIDataLen
			                 ,I_DATA_LEN_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("iDataLen", beginIDataLen,I_DATA_LEN_LEN);
    }
   	}




}
  
