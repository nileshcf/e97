package com.cloudframe.app.ip606130.dto.serialize;

/**
*  The class Ip0040ArMasterSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:01. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip0040ArMasterSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip0040ArMasterSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_0040_AR_MASTER_LENGTH = 277;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp0040EffectiveDate;
            protected  int beginIp0040ActiveInactive;
            protected  int beginIp0040Filler;
	
	/**
	* Constructor for Ip0040ArMasterSerialized
	**/
    public Ip0040ArMasterSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in Ip0040ArMasterSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_0040_AR_MASTER_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp0040EffectiveDate = getStartOffset() + 0;	// set offset for serialization
  
             beginIp0040ActiveInactive = getStartOffset() + 10;	// set offset for serialization
  
  
  
             beginIp0040Filler = getStartOffset() + 272;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localIp0040EffectiveDateCounter = -1;
     public boolean isIp0040EffectiveDateModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp0040EffectiveDateCounter != sharedCounter;
         localIp0040EffectiveDateCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_0040_EFFECTIVE_DATE_LEN = 10;
	/**
	 * 	serialize this Ip0040EffectiveDate
	 */
   protected void serializeIp0040EffectiveDate(char[] ip0040EffectiveDate) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip0040EffectiveDate,0,getStringValue(),beginIp0040EffectiveDate,IP_0040_EFFECTIVE_DATE_LEN);
       localIp0040EffectiveDateCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp0040EffectiveDateConstraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshIp0040EffectiveDate is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp0040EffectiveDate() {	 
   		return (substring(getStringValue(),beginIp0040EffectiveDate,beginIp0040EffectiveDate + IP_0040_EFFECTIVE_DATE_LEN));
   	}
     int localIp0040ActiveInactiveCounter = -1;
     public boolean isIp0040ActiveInactiveModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp0040ActiveInactiveCounter != sharedCounter;
         localIp0040ActiveInactiveCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_0040_ACTIVE_INACTIVE_LEN = 1;
	/**
	 * 	serialize this Ip0040ActiveInactive
	 */
   protected void serializeIp0040ActiveInactive(char[] ip0040ActiveInactive) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip0040ActiveInactive,0,getStringValue(),beginIp0040ActiveInactive,IP_0040_ACTIVE_INACTIVE_LEN);
       localIp0040ActiveInactiveCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp0040ActiveInactiveConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp0040ActiveInactive is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp0040ActiveInactive() {	 
   		return (substring(getStringValue(),beginIp0040ActiveInactive,beginIp0040ActiveInactive + IP_0040_ACTIVE_INACTIVE_LEN));
   	}
     int localIp0040FillerCounter = -1;
     public boolean isIp0040FillerModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp0040FillerCounter != sharedCounter;
         localIp0040FillerCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_0040_FILLER_LEN = 5;
	/**
	 * 	serialize this Ip0040Filler
	 */
   protected void serializeIp0040Filler(char[] ip0040Filler) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip0040Filler,0,getStringValue(),beginIp0040Filler,IP_0040_FILLER_LEN);
       localIp0040FillerCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp0040FillerConstraints(char[] value) {
   			return super.checkConstraints(value , 5 ,false, false);
   }
    /**
	 *	refreshIp0040Filler is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp0040Filler() {	 
   		return (substring(getStringValue(),beginIp0040Filler,beginIp0040Filler + IP_0040_FILLER_LEN));
   	}




}
  
