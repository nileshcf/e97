package com.cloudframe.app.ip606130.dto.serialize;

/**
*  The class Ip00911BsBinMasterSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 09:59. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip00911BsBinMasterSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip00911BsBinMasterSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_00911_BS_BIN_MASTER_LENGTH = 45;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp00911EffectiveDate;
            protected  int beginIp00911ActiveInactive;
	
	/**
	* Constructor for Ip00911BsBinMasterSerialized
	**/
    public Ip00911BsBinMasterSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in Ip00911BsBinMasterSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_00911_BS_BIN_MASTER_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp00911EffectiveDate = getStartOffset() + 0;	// set offset for serialization
  
             beginIp00911ActiveInactive = getStartOffset() + 10;	// set offset for serialization
  
  
  
	   /*  end of offset */
	}
     int localIp00911EffectiveDateCounter = -1;
     public boolean isIp00911EffectiveDateModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp00911EffectiveDateCounter != sharedCounter;
         localIp00911EffectiveDateCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_00911_EFFECTIVE_DATE_LEN = 10;
	/**
	 * 	serialize this Ip00911EffectiveDate
	 */
   protected void serializeIp00911EffectiveDate(char[] ip00911EffectiveDate) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip00911EffectiveDate,0,getStringValue(),beginIp00911EffectiveDate,IP_00911_EFFECTIVE_DATE_LEN);
       localIp00911EffectiveDateCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp00911EffectiveDateConstraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshIp00911EffectiveDate is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp00911EffectiveDate() {	 
   		return (substring(getStringValue(),beginIp00911EffectiveDate,beginIp00911EffectiveDate + IP_00911_EFFECTIVE_DATE_LEN));
   	}
     int localIp00911ActiveInactiveCounter = -1;
     public boolean isIp00911ActiveInactiveModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp00911ActiveInactiveCounter != sharedCounter;
         localIp00911ActiveInactiveCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_00911_ACTIVE_INACTIVE_LEN = 1;
	/**
	 * 	serialize this Ip00911ActiveInactive
	 */
   protected void serializeIp00911ActiveInactive(char[] ip00911ActiveInactive) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip00911ActiveInactive,0,getStringValue(),beginIp00911ActiveInactive,IP_00911_ACTIVE_INACTIVE_LEN);
       localIp00911ActiveInactiveCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp00911ActiveInactiveConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp00911ActiveInactive is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp00911ActiveInactive() {	 
   		return (substring(getStringValue(),beginIp00911ActiveInactive,beginIp00911ActiveInactive + IP_00911_ACTIVE_INACTIVE_LEN));
   	}




}
  
