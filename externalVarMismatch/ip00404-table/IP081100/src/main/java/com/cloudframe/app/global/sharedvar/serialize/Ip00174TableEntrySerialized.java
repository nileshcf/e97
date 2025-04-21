package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip00174TableEntrySerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:11. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip00174TableEntrySerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip00174TableEntrySerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_00174_TABLE_ENTRY_LENGTH = 13;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp00174AlphaCurCode;
            protected  int beginIp00174CurExpCode;
            protected  int beginIp00174Filler;
	
	/**
	* Constructor for Ip00174TableEntrySerialized
	**/
    public Ip00174TableEntrySerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* initializes the field in Ip00174TableEntrySerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_00174_TABLE_ENTRY_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
             beginIp00174AlphaCurCode = getStartOffset() + 3;	// set offset for serialization
  
             beginIp00174CurExpCode = getStartOffset() + 6;	// set offset for serialization
  
  
             beginIp00174Filler = getStartOffset() + 8;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localIp00174AlphaCurCodeCounter = -1;
     public boolean isIp00174AlphaCurCodeModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp00174AlphaCurCodeCounter != sharedCounter;
         localIp00174AlphaCurCodeCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_00174_ALPHA_CUR_CODE_LEN = 3;
	/**
	 * 	serialize this Ip00174AlphaCurCode
	 */
   protected void serializeIp00174AlphaCurCode(char[] ip00174AlphaCurCode) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip00174AlphaCurCode,0,getStringValue(),beginIp00174AlphaCurCode,IP_00174_ALPHA_CUR_CODE_LEN);
       localIp00174AlphaCurCodeCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp00174AlphaCurCodeConstraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshIp00174AlphaCurCode is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp00174AlphaCurCode() {	 
   		return (substring(getStringValue(),beginIp00174AlphaCurCode,beginIp00174AlphaCurCode + IP_00174_ALPHA_CUR_CODE_LEN));
   	}
     int localIp00174CurExpCodeCounter = -1;
     public boolean isIp00174CurExpCodeModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp00174CurExpCodeCounter != sharedCounter;
         localIp00174CurExpCodeCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ip00174CurExpCode
	 *	@return ip00174CurExpCode
	 */
	public char[]  getIp00174CurExpCodeString() {
	     return getCharArray(beginIp00174CurExpCode,IP_00174_CUR_EXP_CODE_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip00174CurExpCodeIsNumeric() {
	    return isNumeric(beginIp00174CurExpCode
	                    ,beginIp00174CurExpCode + IP_00174_CUR_EXP_CODE_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int IP_00174_CUR_EXP_CODE_LEN = 1;
  	/**
	 * serializeIp00174CurExpCode
	 */
	protected void serializeIp00174CurExpCode(int ip00174CurExpCode) {
		 putNumber(beginIp00174CurExpCode,ip00174CurExpCode,IP_00174_CUR_EXP_CODE_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localIp00174CurExpCodeCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeIp00174CurExpCode
	 */
   	protected  int serializeIp00174CurExpCode(char[] value) {
	    int  ip00174CurExpCode;
	    if(value.length >0 && value.length!= 1)
            value = new String(value).trim().toCharArray();
	    if (value.length < 1) value = pad(1, value, ' ', LEFT_PAD);
	    else if (value.length > 1) value = substring(value,0,1);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ip00174CurExpCode = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(1,value,false/*isSigned?*/)
		       ,beginIp00174CurExpCode
		       ,1
		      );
		 localIp00174CurExpCodeCounter = shareString.getSerializedField().getModifiedCounter();
		return  ip00174CurExpCode;
    }

   protected int checkIp00174CurExpCodeMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshIp00174CurExpCode is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshIp00174CurExpCode() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginIp00174CurExpCode
			                 ,IP_00174_CUR_EXP_CODE_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ip00174CurExpCode", beginIp00174CurExpCode,IP_00174_CUR_EXP_CODE_LEN);
    }
   	}
     int localIp00174FillerCounter = -1;
     public boolean isIp00174FillerModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp00174FillerCounter != sharedCounter;
         localIp00174FillerCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_00174_FILLER_LEN = 5;
	/**
	 * 	serialize this Ip00174Filler
	 */
   protected void serializeIp00174Filler(char[] ip00174Filler) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip00174Filler,0,getStringValue(),beginIp00174Filler,IP_00174_FILLER_LEN);
       localIp00174FillerCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp00174FillerConstraints(char[] value) {
   			return super.checkConstraints(value , 5 ,false, false);
   }
    /**
	 *	refreshIp00174Filler is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp00174Filler() {	 
   		return (substring(getStringValue(),beginIp00174Filler,beginIp00174Filler + IP_00174_FILLER_LEN));
   	}




}
  
