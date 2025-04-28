package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip30331Pds501ValueSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 06:50. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip30331Pds501ValueSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip30331Pds501ValueSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_30331_PDS_501_VALUE_LENGTH = 5;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp30331UsageCode;
            protected  int beginIp30331IndstyRefNum;
	
	/**
	* Constructor for Ip30331Pds501ValueSerialized
	**/
    public Ip30331Pds501ValueSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ip30331Pds501ValueSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip30331Pds501ValueSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ip30331Pds501ValueSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,22); // serialize this field at offset 22 by default 
    }
    
	/**
	* sets parent for this Ip30331Pds501ValueSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 22 by default
    }    
	/**
	* initializes the field in Ip30331Pds501ValueSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_30331_PDS_501_VALUE_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp30331UsageCode = getStartOffset() + 0;	// set offset for serialization
  
             beginIp30331IndstyRefNum = getStartOffset() + 2;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localIp30331UsageCodeCounter = -1;
     public boolean isIp30331UsageCodeModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp30331UsageCodeCounter != sharedCounter;
         localIp30331UsageCodeCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_30331_USAGE_CODE_LEN = 2;
	/**
	 * 	serialize this Ip30331UsageCode
	 */
   protected void serializeIp30331UsageCode(char[] ip30331UsageCode) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip30331UsageCode,0,getStringValue(),beginIp30331UsageCode,IP_30331_USAGE_CODE_LEN);
       localIp30331UsageCodeCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp30331UsageCodeConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshIp30331UsageCode is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp30331UsageCode() {	 
   		return (substring(getStringValue(),beginIp30331UsageCode,beginIp30331UsageCode + IP_30331_USAGE_CODE_LEN));
   	}
     int localIp30331IndstyRefNumCounter = -1;
     public boolean isIp30331IndstyRefNumModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp30331IndstyRefNumCounter != sharedCounter;
         localIp30331IndstyRefNumCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_30331_INDSTY_REF_NUM_LEN = 3;
	/**
	 * 	serialize this Ip30331IndstyRefNum
	 */
   protected void serializeIp30331IndstyRefNum(char[] ip30331IndstyRefNum) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip30331IndstyRefNum,0,getStringValue(),beginIp30331IndstyRefNum,IP_30331_INDSTY_REF_NUM_LEN);
       localIp30331IndstyRefNumCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp30331IndstyRefNumConstraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshIp30331IndstyRefNum is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp30331IndstyRefNum() {	 
   		return (substring(getStringValue(),beginIp30331IndstyRefNum,beginIp30331IndstyRefNum + IP_30331_INDSTY_REF_NUM_LEN));
   	}




}
  
