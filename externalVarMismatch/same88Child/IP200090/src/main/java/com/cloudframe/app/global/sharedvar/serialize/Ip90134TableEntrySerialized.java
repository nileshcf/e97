package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip90134TableEntrySerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:27. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip90134TableEntrySerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip90134TableEntrySerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_90134_TABLE_ENTRY_LENGTH = 21;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp90134PositionStart;
            protected  int beginIp90134PositionEnd;
	
	/**
	* Constructor for Ip90134TableEntrySerialized
	**/
    public Ip90134TableEntrySerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* initializes the field in Ip90134TableEntrySerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_90134_TABLE_ENTRY_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
             beginIp90134PositionStart = getStartOffset() + 15;	// set offset for serialization
  
             beginIp90134PositionEnd = getStartOffset() + 18;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localIp90134PositionStartCounter = -1;
     public boolean isIp90134PositionStartModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp90134PositionStartCounter != sharedCounter;
         localIp90134PositionStartCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ip90134PositionStart
	 *	@return ip90134PositionStart
	 */
	public char[]  getIp90134PositionStartString() {
	     return getCharArray(beginIp90134PositionStart,IP_90134_POSITION_START_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip90134PositionStartIsNumeric() {
	    return isNumeric(beginIp90134PositionStart
	                    ,beginIp90134PositionStart + IP_90134_POSITION_START_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int IP_90134_POSITION_START_LEN = 3;
  	/**
	 * serializeIp90134PositionStart
	 */
	protected void serializeIp90134PositionStart(int ip90134PositionStart) {
		 putNumber(beginIp90134PositionStart,ip90134PositionStart,IP_90134_POSITION_START_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localIp90134PositionStartCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeIp90134PositionStart
	 */
   	protected  int serializeIp90134PositionStart(char[] value) {
	    int  ip90134PositionStart;
	    if(value.length >0 && value.length!= 3)
            value = new String(value).trim().toCharArray();
	    if (value.length < 3) value = pad(3, value, ' ', LEFT_PAD);
	    else if (value.length > 3) value = substring(value,0,3);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ip90134PositionStart = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(3,value,false/*isSigned?*/)
		       ,beginIp90134PositionStart
		       ,3
		      );
		 localIp90134PositionStartCounter = shareString.getSerializedField().getModifiedCounter();
		return  ip90134PositionStart;
    }

   protected int checkIp90134PositionStartMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_1000/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshIp90134PositionStart is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshIp90134PositionStart() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginIp90134PositionStart
			                 ,IP_90134_POSITION_START_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ip90134PositionStart", beginIp90134PositionStart,IP_90134_POSITION_START_LEN);
    }
   	}
     int localIp90134PositionEndCounter = -1;
     public boolean isIp90134PositionEndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp90134PositionEndCounter != sharedCounter;
         localIp90134PositionEndCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ip90134PositionEnd
	 *	@return ip90134PositionEnd
	 */
	public char[]  getIp90134PositionEndString() {
	     return getCharArray(beginIp90134PositionEnd,IP_90134_POSITION_END_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip90134PositionEndIsNumeric() {
	    return isNumeric(beginIp90134PositionEnd
	                    ,beginIp90134PositionEnd + IP_90134_POSITION_END_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int IP_90134_POSITION_END_LEN = 3;
  	/**
	 * serializeIp90134PositionEnd
	 */
	protected void serializeIp90134PositionEnd(int ip90134PositionEnd) {
		 putNumber(beginIp90134PositionEnd,ip90134PositionEnd,IP_90134_POSITION_END_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localIp90134PositionEndCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeIp90134PositionEnd
	 */
   	protected  int serializeIp90134PositionEnd(char[] value) {
	    int  ip90134PositionEnd;
	    if(value.length >0 && value.length!= 3)
            value = new String(value).trim().toCharArray();
	    if (value.length < 3) value = pad(3, value, ' ', LEFT_PAD);
	    else if (value.length > 3) value = substring(value,0,3);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ip90134PositionEnd = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(3,value,false/*isSigned?*/)
		       ,beginIp90134PositionEnd
		       ,3
		      );
		 localIp90134PositionEndCounter = shareString.getSerializedField().getModifiedCounter();
		return  ip90134PositionEnd;
    }

   protected int checkIp90134PositionEndMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_1000/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshIp90134PositionEnd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshIp90134PositionEnd() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginIp90134PositionEnd
			                 ,IP_90134_POSITION_END_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ip90134PositionEnd", beginIp90134PositionEnd,IP_90134_POSITION_END_LEN);
    }
   	}




}
  
