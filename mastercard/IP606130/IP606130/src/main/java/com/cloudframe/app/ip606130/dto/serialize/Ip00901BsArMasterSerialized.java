package com.cloudframe.app.ip606130.dto.serialize;

/**
*  The class Ip00901BsArMasterSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:17. using version 5.0.0.257
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip00901BsArMasterSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip00901BsArMasterSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_00901_BS_AR_MASTER_LENGTH = 80;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp00901EffectiveDate;
            protected  int beginIp00901ActiveInactive;
	
	/**
	* Constructor for Ip00901BsArMasterSerialized
	**/
    public Ip00901BsArMasterSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in Ip00901BsArMasterSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_00901_BS_AR_MASTER_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp00901EffectiveDate = getStartOffset() + 0;	// set offset for serialization
  
             beginIp00901ActiveInactive = getStartOffset() + 10;	// set offset for serialization
  
  
  
	   /*  end of offset */
	}
     int localIp00901EffectiveDateCounter = -1;
     public boolean isIp00901EffectiveDateModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp00901EffectiveDateCounter != sharedCounter;
         localIp00901EffectiveDateCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_00901_EFFECTIVE_DATE_LEN = 10;
	/**
	 * 	serialize this Ip00901EffectiveDate
	 */
   protected void serializeIp00901EffectiveDate(char[] ip00901EffectiveDate) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip00901EffectiveDate,0,getStringValue(),beginIp00901EffectiveDate,IP_00901_EFFECTIVE_DATE_LEN);
       localIp00901EffectiveDateCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp00901EffectiveDateConstraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshIp00901EffectiveDate is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp00901EffectiveDate() {	 
   		return (substring(getStringValue(),beginIp00901EffectiveDate,beginIp00901EffectiveDate + IP_00901_EFFECTIVE_DATE_LEN));
   	}
     int localIp00901ActiveInactiveCounter = -1;
     public boolean isIp00901ActiveInactiveModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp00901ActiveInactiveCounter != sharedCounter;
         localIp00901ActiveInactiveCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_00901_ACTIVE_INACTIVE_LEN = 1;
	/**
	 * 	serialize this Ip00901ActiveInactive
	 */
   protected void serializeIp00901ActiveInactive(char[] ip00901ActiveInactive) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip00901ActiveInactive,0,getStringValue(),beginIp00901ActiveInactive,IP_00901_ACTIVE_INACTIVE_LEN);
       localIp00901ActiveInactiveCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp00901ActiveInactiveConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp00901ActiveInactive is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp00901ActiveInactive() {	 
   		return (substring(getStringValue(),beginIp00901ActiveInactive,beginIp00901ActiveInactive + IP_00901_ACTIVE_INACTIVE_LEN));
   	}




}
  
