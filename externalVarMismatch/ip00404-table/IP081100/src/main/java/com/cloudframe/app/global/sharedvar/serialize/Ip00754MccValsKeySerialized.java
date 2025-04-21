package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip00754MccValsKeySerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:11. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip00754MccValsKeySerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip00754MccValsKeySerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_00754_MCC_VALS_KEY_LENGTH = 4;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp00754MccVals;
	
	/**
	* Constructor for Ip00754MccValsKeySerialized
	**/
    public Ip00754MccValsKeySerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ip00754MccValsKeySerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip00754MccValsKeySerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ip00754MccValsKeySerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this Ip00754MccValsKeySerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in Ip00754MccValsKeySerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_00754_MCC_VALS_KEY_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp00754MccVals = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localIp00754MccValsCounter = -1;
     public boolean isIp00754MccValsModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp00754MccValsCounter != sharedCounter;
         localIp00754MccValsCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ip00754MccVals
	 *	@return ip00754MccVals
	 */
	public char[]  getIp00754MccValsString() {
	     return getCharArray(beginIp00754MccVals,IP_00754_MCC_VALS_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip00754MccValsIsNumeric() {
	    return isNumeric(beginIp00754MccVals
	                    ,beginIp00754MccVals + IP_00754_MCC_VALS_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int IP_00754_MCC_VALS_LEN = 4;
  	/**
	 * serializeIp00754MccVals
	 */
	protected void serializeIp00754MccVals(int ip00754MccVals) {
		 putNumber(beginIp00754MccVals,ip00754MccVals,IP_00754_MCC_VALS_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localIp00754MccValsCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeIp00754MccVals
	 */
   	protected  int serializeIp00754MccVals(char[] value) {
	    int  ip00754MccVals;
	    if(value.length >0 && value.length!= 4)
            value = new String(value).trim().toCharArray();
	    if (value.length < 4) value = pad(4, value, ' ', LEFT_PAD);
	    else if (value.length > 4) value = substring(value,0,4);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ip00754MccVals = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(4,value,false/*isSigned?*/)
		       ,beginIp00754MccVals
		       ,4
		      );
		 localIp00754MccValsCounter = shareString.getSerializedField().getModifiedCounter();
		return  ip00754MccVals;
    }

   protected int checkIp00754MccValsMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10K/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshIp00754MccVals is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshIp00754MccVals() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginIp00754MccVals
			                 ,IP_00754_MCC_VALS_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ip00754MccVals", beginIp00754MccVals,IP_00754_MCC_VALS_LEN);
    }
   	}




}
  
