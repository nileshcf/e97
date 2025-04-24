package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip7052f4ProcDelaySerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:39. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip7052f4ProcDelaySerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip7052f4ProcDelaySerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_7052F_4_PROC_DELAY_LENGTH = 16;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp7052f4NoOfTrans;
            protected  int beginIp7052f4TimeDelay;
	
	/**
	* Constructor for Ip7052f4ProcDelaySerialized
	**/
    public Ip7052f4ProcDelaySerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ip7052f4ProcDelaySerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip7052f4ProcDelaySerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ip7052f4ProcDelaySerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,4000252); // serialize this field at offset 4000252 by default 
    }
    
	/**
	* sets parent for this Ip7052f4ProcDelaySerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 4000252 by default
    }    
	/**
	* initializes the field in Ip7052f4ProcDelaySerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_7052F_4_PROC_DELAY_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp7052f4NoOfTrans = getStartOffset() + 0;	// set offset for serialization
  
             beginIp7052f4TimeDelay = getStartOffset() + 8;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localIp7052f4NoOfTransCounter = -1;
     public boolean isIp7052f4NoOfTransModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp7052f4NoOfTransCounter != sharedCounter;
         localIp7052f4NoOfTransCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ip7052f4NoOfTrans
	 *	@return ip7052f4NoOfTrans
	 */
	public char[]  getIp7052f4NoOfTransString() {
	     return getCharArray(beginIp7052f4NoOfTrans,IP_7052F_4_NO_OF_TRANS_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip7052f4NoOfTransIsNumeric() {
	    return isNumeric(beginIp7052f4NoOfTrans
	                    ,beginIp7052f4NoOfTrans + IP_7052F_4_NO_OF_TRANS_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int IP_7052F_4_NO_OF_TRANS_LEN = 8;
  	/**
	 * serializeIp7052f4NoOfTrans
	 */
	protected void serializeIp7052f4NoOfTrans(long ip7052f4NoOfTrans) {
		 putNumber(beginIp7052f4NoOfTrans,ip7052f4NoOfTrans,IP_7052F_4_NO_OF_TRANS_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localIp7052f4NoOfTransCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeIp7052f4NoOfTrans
	 */
   	protected  long serializeIp7052f4NoOfTrans(char[] value) {
	    long  ip7052f4NoOfTrans;
	    if(value.length >0 && value.length!= 8)
            value = new String(value).trim().toCharArray();
	    if (value.length < 8) value = pad(8, value, ' ', LEFT_PAD);
	    else if (value.length > 8) value = substring(value,0,8);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ip7052f4NoOfTrans = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(8,value,false/*isSigned?*/)
		       ,beginIp7052f4NoOfTrans
		       ,8
		      );
		 localIp7052f4NoOfTransCounter = shareString.getSerializedField().getModifiedCounter();
		return  ip7052f4NoOfTrans;
    }

   protected long checkIp7052f4NoOfTransMaxLimit(long number) {

        return checkMaxLimit(number , MAX_100M/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshIp7052f4NoOfTrans is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshIp7052f4NoOfTrans() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginIp7052f4NoOfTrans
			                 ,IP_7052F_4_NO_OF_TRANS_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ip7052f4NoOfTrans", beginIp7052f4NoOfTrans,IP_7052F_4_NO_OF_TRANS_LEN);
    }
   	}
     int localIp7052f4TimeDelayCounter = -1;
     public boolean isIp7052f4TimeDelayModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp7052f4TimeDelayCounter != sharedCounter;
         localIp7052f4TimeDelayCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_7052F_4_TIME_DELAY_LEN = 8;
	/**
	 * 	serialize this Ip7052f4TimeDelay
	 */
   protected void serializeIp7052f4TimeDelay(char[] ip7052f4TimeDelay) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip7052f4TimeDelay,0,getStringValue(),beginIp7052f4TimeDelay,IP_7052F_4_TIME_DELAY_LEN);
       localIp7052f4TimeDelayCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp7052f4TimeDelayConstraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshIp7052f4TimeDelay is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp7052f4TimeDelay() {	 
   		return (substring(getStringValue(),beginIp7052f4TimeDelay,beginIp7052f4TimeDelay + IP_7052F_4_TIME_DELAY_LEN));
   	}




}
  
