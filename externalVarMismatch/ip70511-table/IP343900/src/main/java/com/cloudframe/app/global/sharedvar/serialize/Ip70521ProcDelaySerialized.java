package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip70521ProcDelaySerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:09. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip70521ProcDelaySerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip70521ProcDelaySerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_70521_PROC_DELAY_LENGTH = 16;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp70521NoOfTrans;
            protected  int beginIp70521TimeDelay;
	
	/**
	* Constructor for Ip70521ProcDelaySerialized
	**/
    public Ip70521ProcDelaySerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ip70521ProcDelaySerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip70521ProcDelaySerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ip70521ProcDelaySerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,4000252); // serialize this field at offset 4000252 by default 
    }
    
	/**
	* sets parent for this Ip70521ProcDelaySerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 4000252 by default
    }    
	/**
	* initializes the field in Ip70521ProcDelaySerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_70521_PROC_DELAY_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp70521NoOfTrans = getStartOffset() + 0;	// set offset for serialization
  
             beginIp70521TimeDelay = getStartOffset() + 8;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localIp70521NoOfTransCounter = -1;
     public boolean isIp70521NoOfTransModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp70521NoOfTransCounter != sharedCounter;
         localIp70521NoOfTransCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ip70521NoOfTrans
	 *	@return ip70521NoOfTrans
	 */
	public char[]  getIp70521NoOfTransString() {
	     return getCharArray(beginIp70521NoOfTrans,IP_70521_NO_OF_TRANS_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip70521NoOfTransIsNumeric() {
	    return isNumeric(beginIp70521NoOfTrans
	                    ,beginIp70521NoOfTrans + IP_70521_NO_OF_TRANS_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int IP_70521_NO_OF_TRANS_LEN = 8;
  	/**
	 * serializeIp70521NoOfTrans
	 */
	protected void serializeIp70521NoOfTrans(long ip70521NoOfTrans) {
		 putNumber(beginIp70521NoOfTrans,ip70521NoOfTrans,IP_70521_NO_OF_TRANS_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localIp70521NoOfTransCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeIp70521NoOfTrans
	 */
   	protected  long serializeIp70521NoOfTrans(char[] value) {
	    long  ip70521NoOfTrans;
	    if(value.length >0 && value.length!= 8)
            value = new String(value).trim().toCharArray();
	    if (value.length < 8) value = pad(8, value, ' ', LEFT_PAD);
	    else if (value.length > 8) value = substring(value,0,8);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ip70521NoOfTrans = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(8,value,false/*isSigned?*/)
		       ,beginIp70521NoOfTrans
		       ,8
		      );
		 localIp70521NoOfTransCounter = shareString.getSerializedField().getModifiedCounter();
		return  ip70521NoOfTrans;
    }

   protected long checkIp70521NoOfTransMaxLimit(long number) {

        return checkMaxLimit(number , MAX_100M/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshIp70521NoOfTrans is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshIp70521NoOfTrans() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginIp70521NoOfTrans
			                 ,IP_70521_NO_OF_TRANS_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ip70521NoOfTrans", beginIp70521NoOfTrans,IP_70521_NO_OF_TRANS_LEN);
    }
   	}
     int localIp70521TimeDelayCounter = -1;
     public boolean isIp70521TimeDelayModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp70521TimeDelayCounter != sharedCounter;
         localIp70521TimeDelayCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_70521_TIME_DELAY_LEN = 8;
	/**
	 * 	serialize this Ip70521TimeDelay
	 */
   protected void serializeIp70521TimeDelay(char[] ip70521TimeDelay) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip70521TimeDelay,0,getStringValue(),beginIp70521TimeDelay,IP_70521_TIME_DELAY_LEN);
       localIp70521TimeDelayCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp70521TimeDelayConstraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshIp70521TimeDelay is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp70521TimeDelay() {	 
   		return (substring(getStringValue(),beginIp70521TimeDelay,beginIp70521TimeDelay + IP_70521_TIME_DELAY_LEN));
   	}




}
  
