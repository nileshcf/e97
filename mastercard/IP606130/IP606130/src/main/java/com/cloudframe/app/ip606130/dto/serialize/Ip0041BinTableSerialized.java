package com.cloudframe.app.ip606130.dto.serialize;

/**
*  The class Ip0041BinTableSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:32. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip0041BinTableSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip0041BinTableSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_0041_BIN_TABLE_LENGTH = 130;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp0041EffectiveDate;
            protected  int beginIp0041ActiveInactive;
	
	/**
	* Constructor for Ip0041BinTableSerialized
	**/
    public Ip0041BinTableSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in Ip0041BinTableSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_0041_BIN_TABLE_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp0041EffectiveDate = getStartOffset() + 0;	// set offset for serialization
  
             beginIp0041ActiveInactive = getStartOffset() + 10;	// set offset for serialization
  
  
  
	   /*  end of offset */
	}
     int localIp0041EffectiveDateCounter = -1;
     public boolean isIp0041EffectiveDateModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp0041EffectiveDateCounter != sharedCounter;
         localIp0041EffectiveDateCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_0041_EFFECTIVE_DATE_LEN = 10;
	/**
	 * 	serialize this Ip0041EffectiveDate
	 */
   protected void serializeIp0041EffectiveDate(char[] ip0041EffectiveDate) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip0041EffectiveDate,0,getStringValue(),beginIp0041EffectiveDate,IP_0041_EFFECTIVE_DATE_LEN);
       localIp0041EffectiveDateCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp0041EffectiveDateConstraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshIp0041EffectiveDate is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp0041EffectiveDate() {	 
   		return (substring(getStringValue(),beginIp0041EffectiveDate,beginIp0041EffectiveDate + IP_0041_EFFECTIVE_DATE_LEN));
   	}
     int localIp0041ActiveInactiveCounter = -1;
     public boolean isIp0041ActiveInactiveModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp0041ActiveInactiveCounter != sharedCounter;
         localIp0041ActiveInactiveCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_0041_ACTIVE_INACTIVE_LEN = 1;
	/**
	 * 	serialize this Ip0041ActiveInactive
	 */
   protected void serializeIp0041ActiveInactive(char[] ip0041ActiveInactive) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip0041ActiveInactive,0,getStringValue(),beginIp0041ActiveInactive,IP_0041_ACTIVE_INACTIVE_LEN);
       localIp0041ActiveInactiveCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp0041ActiveInactiveConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp0041ActiveInactive is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp0041ActiveInactive() {	 
   		return (substring(getStringValue(),beginIp0041ActiveInactive,beginIp0041ActiveInactive + IP_0041_ACTIVE_INACTIVE_LEN));
   	}




}
  
