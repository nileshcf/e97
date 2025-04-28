package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip7052pmrProcDelaySerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:01. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip7052pmrProcDelaySerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip7052pmrProcDelaySerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_7052PMR_PROC_DELAY_LENGTH = 16;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp7052pmrNoOfTrans;
            protected  int beginIp7052pmrTimeDelay;
	
	/**
	* Constructor for Ip7052pmrProcDelaySerialized
	**/
    public Ip7052pmrProcDelaySerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ip7052pmrProcDelaySerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip7052pmrProcDelaySerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ip7052pmrProcDelaySerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,4000252); // serialize this field at offset 4000252 by default 
    }
    
	/**
	* sets parent for this Ip7052pmrProcDelaySerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 4000252 by default
    }    
	/**
	* initializes the field in Ip7052pmrProcDelaySerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_7052PMR_PROC_DELAY_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp7052pmrNoOfTrans = getStartOffset() + 0;	// set offset for serialization
  
             beginIp7052pmrTimeDelay = getStartOffset() + 8;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localIp7052pmrNoOfTransCounter = -1;
     public boolean isIp7052pmrNoOfTransModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp7052pmrNoOfTransCounter != sharedCounter;
         localIp7052pmrNoOfTransCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ip7052pmrNoOfTrans
	 *	@return ip7052pmrNoOfTrans
	 */
	public char[]  getIp7052pmrNoOfTransString() {
	     return getCharArray(beginIp7052pmrNoOfTrans,IP_7052PMR_NO_OF_TRANS_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip7052pmrNoOfTransIsNumeric() {
	    return isNumeric(beginIp7052pmrNoOfTrans
	                    ,beginIp7052pmrNoOfTrans + IP_7052PMR_NO_OF_TRANS_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int IP_7052PMR_NO_OF_TRANS_LEN = 8;
  	/**
	 * serializeIp7052pmrNoOfTrans
	 */
	protected void serializeIp7052pmrNoOfTrans(long ip7052pmrNoOfTrans) {
		 putNumber(beginIp7052pmrNoOfTrans,ip7052pmrNoOfTrans,IP_7052PMR_NO_OF_TRANS_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localIp7052pmrNoOfTransCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeIp7052pmrNoOfTrans
	 */
   	protected  long serializeIp7052pmrNoOfTrans(char[] value) {
	    long  ip7052pmrNoOfTrans;
	    if(value.length >0 && value.length!= 8)
            value = new String(value).trim().toCharArray();
	    if (value.length < 8) value = pad(8, value, ' ', LEFT_PAD);
	    else if (value.length > 8) value = substring(value,0,8);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ip7052pmrNoOfTrans = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(8,value,false/*isSigned?*/)
		       ,beginIp7052pmrNoOfTrans
		       ,8
		      );
		 localIp7052pmrNoOfTransCounter = shareString.getSerializedField().getModifiedCounter();
		return  ip7052pmrNoOfTrans;
    }

   protected long checkIp7052pmrNoOfTransMaxLimit(long number) {

        return checkMaxLimit(number , MAX_100M/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshIp7052pmrNoOfTrans is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshIp7052pmrNoOfTrans() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginIp7052pmrNoOfTrans
			                 ,IP_7052PMR_NO_OF_TRANS_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ip7052pmrNoOfTrans", beginIp7052pmrNoOfTrans,IP_7052PMR_NO_OF_TRANS_LEN);
    }
   	}
     int localIp7052pmrTimeDelayCounter = -1;
     public boolean isIp7052pmrTimeDelayModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp7052pmrTimeDelayCounter != sharedCounter;
         localIp7052pmrTimeDelayCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_7052PMR_TIME_DELAY_LEN = 8;
	/**
	 * 	serialize this Ip7052pmrTimeDelay
	 */
   protected void serializeIp7052pmrTimeDelay(char[] ip7052pmrTimeDelay) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip7052pmrTimeDelay,0,getStringValue(),beginIp7052pmrTimeDelay,IP_7052PMR_TIME_DELAY_LEN);
       localIp7052pmrTimeDelayCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp7052pmrTimeDelayConstraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshIp7052pmrTimeDelay is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp7052pmrTimeDelay() {	 
   		return (substring(getStringValue(),beginIp7052pmrTimeDelay,beginIp7052pmrTimeDelay + IP_7052PMR_TIME_DELAY_LEN));
   	}




}
  
