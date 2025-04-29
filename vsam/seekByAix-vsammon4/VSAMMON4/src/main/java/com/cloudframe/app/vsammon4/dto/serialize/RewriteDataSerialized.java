package com.cloudframe.app.vsammon4.dto.serialize;

/**
*  The class RewriteDataSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:19. using version 5.0.0.257
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class RewriteDataSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(RewriteDataSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int REWRITE_DATA_LENGTH = 31;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginRwKey;
            protected  int beginRwTaskNo;
            protected  int beginRwReqSize;
            protected  int beginRwDataLen;
	
	/**
	* Constructor for RewriteDataSerialized
	**/
    public RewriteDataSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for RewriteDataSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public RewriteDataSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this RewriteDataSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,7); // serialize this field at offset 7 by default 
    }
    
	/**
	* sets parent for this RewriteDataSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 7 by default
    }    
	/**
	* initializes the field in RewriteDataSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(REWRITE_DATA_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginRwKey = getStartOffset() + 0;	// set offset for serialization
  
             beginRwTaskNo = getStartOffset() + 10;	// set offset for serialization
  
             beginRwReqSize = getStartOffset() + 18;	// set offset for serialization
  
             beginRwDataLen = getStartOffset() + 28;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localRwKeyCounter = -1;
     public boolean isRwKeyModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRwKeyCounter != sharedCounter;
         localRwKeyCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of rwKey
	 *	@return rwKey
	 */
	public char[]  getRwKeyString() {
	     return getCharArray(beginRwKey,RW_KEY_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean rwKeyIsNumeric() {
	    return isNumeric(beginRwKey
	                    ,beginRwKey + RW_KEY_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int RW_KEY_LEN = 9;
  	/**
	 * serializeRwKey
	 */
	protected void serializeRwKey(long rwKey) {
		 putNumber(beginRwKey,rwKey,RW_KEY_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localRwKeyCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeRwKey
	 */
   	protected  long serializeRwKey(char[] value) {
	    long  rwKey;
	    if(value.length >0 && value.length!= 9)
            value = new String(value).trim().toCharArray();
	    if (value.length < 9) value = pad(9, value, ' ', LEFT_PAD);
	    else if (value.length > 9) value = substring(value,0,9);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    rwKey = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(9,value,false/*isSigned?*/)
		       ,beginRwKey
		       ,9
		      );
		 localRwKeyCounter = shareString.getSerializedField().getModifiedCounter();
		return  rwKey;
    }

   protected long checkRwKeyMaxLimit(long number) {

        return checkMaxLimit(number , MAX_1G/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshRwKey is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshRwKey() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginRwKey
			                 ,RW_KEY_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("rwKey", beginRwKey,RW_KEY_LEN);
    }
   	}
     int localRwTaskNoCounter = -1;
     public boolean isRwTaskNoModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRwTaskNoCounter != sharedCounter;
         localRwTaskNoCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of rwTaskNo
	 *	@return rwTaskNo
	 */
	public char[]  getRwTaskNoString() {
	     return getCharArray(beginRwTaskNo,RW_TASK_NO_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean rwTaskNoIsNumeric() {
	    return isNumeric(beginRwTaskNo
	                    ,beginRwTaskNo + RW_TASK_NO_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int RW_TASK_NO_LEN = 7;
  	/**
	 * serializeRwTaskNo
	 */
	protected void serializeRwTaskNo(long rwTaskNo) {
		 putNumber(beginRwTaskNo,rwTaskNo,RW_TASK_NO_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localRwTaskNoCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeRwTaskNo
	 */
   	protected  long serializeRwTaskNo(char[] value) {
	    long  rwTaskNo;
	    if(value.length >0 && value.length!= 7)
            value = new String(value).trim().toCharArray();
	    if (value.length < 7) value = pad(7, value, ' ', LEFT_PAD);
	    else if (value.length > 7) value = substring(value,0,7);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    rwTaskNo = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(7,value,false/*isSigned?*/)
		       ,beginRwTaskNo
		       ,7
		      );
		 localRwTaskNoCounter = shareString.getSerializedField().getModifiedCounter();
		return  rwTaskNo;
    }

   protected long checkRwTaskNoMaxLimit(long number) {

        return checkMaxLimit(number , MAX_10M/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshRwTaskNo is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshRwTaskNo() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginRwTaskNo
			                 ,RW_TASK_NO_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("rwTaskNo", beginRwTaskNo,RW_TASK_NO_LEN);
    }
   	}
     int localRwReqSizeCounter = -1;
     public boolean isRwReqSizeModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRwReqSizeCounter != sharedCounter;
         localRwReqSizeCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of rwReqSize
	 *	@return rwReqSize
	 */
	public char[]  getRwReqSizeString() {
	     return getCharArray(beginRwReqSize,RW_REQ_SIZE_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean rwReqSizeIsNumeric() {
	    return isNumeric(beginRwReqSize
	                    ,beginRwReqSize + RW_REQ_SIZE_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int RW_REQ_SIZE_LEN = 9;
  	/**
	 * serializeRwReqSize
	 */
	protected void serializeRwReqSize(long rwReqSize) {
		 putNumber(beginRwReqSize,rwReqSize,RW_REQ_SIZE_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localRwReqSizeCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeRwReqSize
	 */
   	protected  long serializeRwReqSize(char[] value) {
	    long  rwReqSize;
	    if(value.length >0 && value.length!= 9)
            value = new String(value).trim().toCharArray();
	    if (value.length < 9) value = pad(9, value, ' ', LEFT_PAD);
	    else if (value.length > 9) value = substring(value,0,9);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    rwReqSize = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(9,value,false/*isSigned?*/)
		       ,beginRwReqSize
		       ,9
		      );
		 localRwReqSizeCounter = shareString.getSerializedField().getModifiedCounter();
		return  rwReqSize;
    }

   protected long checkRwReqSizeMaxLimit(long number) {

        return checkMaxLimit(number , MAX_1G/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshRwReqSize is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshRwReqSize() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginRwReqSize
			                 ,RW_REQ_SIZE_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("rwReqSize", beginRwReqSize,RW_REQ_SIZE_LEN);
    }
   	}
     int localRwDataLenCounter = -1;
     public boolean isRwDataLenModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRwDataLenCounter != sharedCounter;
         localRwDataLenCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of rwDataLen
	 *	@return rwDataLen
	 */
	public char[]  getRwDataLenString() {
	     return getCharArray(beginRwDataLen,RW_DATA_LEN_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean rwDataLenIsNumeric() {
	    return isNumeric(beginRwDataLen
	                    ,beginRwDataLen + RW_DATA_LEN_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int RW_DATA_LEN_LEN = 3;
  	/**
	 * serializeRwDataLen
	 */
	protected void serializeRwDataLen(int rwDataLen) {
		 putNumber(beginRwDataLen,rwDataLen,RW_DATA_LEN_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localRwDataLenCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeRwDataLen
	 */
   	protected  int serializeRwDataLen(char[] value) {
	    int  rwDataLen;
	    if(value.length >0 && value.length!= 3)
            value = new String(value).trim().toCharArray();
	    if (value.length < 3) value = pad(3, value, ' ', LEFT_PAD);
	    else if (value.length > 3) value = substring(value,0,3);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    rwDataLen = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(3,value,false/*isSigned?*/)
		       ,beginRwDataLen
		       ,3
		      );
		 localRwDataLenCounter = shareString.getSerializedField().getModifiedCounter();
		return  rwDataLen;
    }

   protected int checkRwDataLenMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_1000/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshRwDataLen is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshRwDataLen() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginRwDataLen
			                 ,RW_DATA_LEN_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("rwDataLen", beginRwDataLen,RW_DATA_LEN_LEN);
    }
   	}




}
  
