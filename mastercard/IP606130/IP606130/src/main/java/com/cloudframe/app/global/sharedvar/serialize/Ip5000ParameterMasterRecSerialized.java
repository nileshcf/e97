package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip5000ParameterMasterRecSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 09:59. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip5000ParameterMasterRecSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip5000ParameterMasterRecSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_5000_PARAMETER_MASTER_REC_LENGTH = 32756;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp5000EffectiveDate;
            protected  int beginIp5000ActionCode;
	
	/**
	* Constructor for Ip5000ParameterMasterRecSerialized
	**/
    public Ip5000ParameterMasterRecSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* initializes the field in Ip5000ParameterMasterRecSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_5000_PARAMETER_MASTER_REC_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp5000EffectiveDate = getStartOffset() + 0;	// set offset for serialization
  
             beginIp5000ActionCode = getStartOffset() + 10;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localIp5000EffectiveDateCounter = -1;
     public boolean isIp5000EffectiveDateModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp5000EffectiveDateCounter != sharedCounter;
         localIp5000EffectiveDateCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_5000_EFFECTIVE_DATE_LEN = 10;
	/**
	 * 	serialize this Ip5000EffectiveDate
	 */
   protected void serializeIp5000EffectiveDate(char[] ip5000EffectiveDate) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip5000EffectiveDate,0,getStringValue(),beginIp5000EffectiveDate,IP_5000_EFFECTIVE_DATE_LEN);
       localIp5000EffectiveDateCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp5000EffectiveDateConstraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshIp5000EffectiveDate is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp5000EffectiveDate() {	 
   		return (substring(getStringValue(),beginIp5000EffectiveDate,beginIp5000EffectiveDate + IP_5000_EFFECTIVE_DATE_LEN));
   	}
     int localIp5000ActionCodeCounter = -1;
     public boolean isIp5000ActionCodeModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp5000ActionCodeCounter != sharedCounter;
         localIp5000ActionCodeCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_5000_ACTION_CODE_LEN = 1;
	/**
	 * 	serialize this Ip5000ActionCode
	 */
   protected void serializeIp5000ActionCode(char[] ip5000ActionCode) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip5000ActionCode,0,getStringValue(),beginIp5000ActionCode,IP_5000_ACTION_CODE_LEN);
       localIp5000ActionCodeCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp5000ActionCodeConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp5000ActionCode is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp5000ActionCode() {	 
   		return (substring(getStringValue(),beginIp5000ActionCode,beginIp5000ActionCode + IP_5000_ACTION_CODE_LEN));
   	}




}
  
