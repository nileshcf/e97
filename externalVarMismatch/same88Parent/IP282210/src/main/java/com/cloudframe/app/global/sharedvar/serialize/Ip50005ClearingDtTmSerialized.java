package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip50005ClearingDtTmSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:30. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip50005ClearingDtTmSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip50005ClearingDtTmSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_50005_CLEARING_DT_TM_LENGTH = 10;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp50005ClearingDt;
            protected  int beginIp50005ClearingTm;
	
	/**
	* Constructor for Ip50005ClearingDtTmSerialized
	**/
    public Ip50005ClearingDtTmSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* initializes the field in Ip50005ClearingDtTmSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_50005_CLEARING_DT_TM_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp50005ClearingDt = getStartOffset() + 0;	// set offset for serialization
  
             beginIp50005ClearingTm = getStartOffset() + 8;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localIp50005ClearingDtCounter = -1;
     public boolean isIp50005ClearingDtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp50005ClearingDtCounter != sharedCounter;
         localIp50005ClearingDtCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_50005_CLEARING_DT_LEN = 8;
	/**
	 * 	serialize this Ip50005ClearingDt
	 */
   protected void serializeIp50005ClearingDt(char[] ip50005ClearingDt) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip50005ClearingDt,0,getStringValue(),beginIp50005ClearingDt,IP_50005_CLEARING_DT_LEN);
       localIp50005ClearingDtCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp50005ClearingDtConstraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshIp50005ClearingDt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp50005ClearingDt() {	 
   		return (substring(getStringValue(),beginIp50005ClearingDt,beginIp50005ClearingDt + IP_50005_CLEARING_DT_LEN));
   	}
     int localIp50005ClearingTmCounter = -1;
     public boolean isIp50005ClearingTmModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp50005ClearingTmCounter != sharedCounter;
         localIp50005ClearingTmCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_50005_CLEARING_TM_LEN = 2;
	/**
	 * 	serialize this Ip50005ClearingTm
	 */
   protected void serializeIp50005ClearingTm(char[] ip50005ClearingTm) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip50005ClearingTm,0,getStringValue(),beginIp50005ClearingTm,IP_50005_CLEARING_TM_LEN);
       localIp50005ClearingTmCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp50005ClearingTmConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshIp50005ClearingTm is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp50005ClearingTm() {	 
   		return (substring(getStringValue(),beginIp50005ClearingTm,beginIp50005ClearingTm + IP_50005_CLEARING_TM_LEN));
   	}




}
  
