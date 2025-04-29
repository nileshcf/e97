package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip50005oClearingDtTmSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:28. using version 5.0.0.257
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip50005oClearingDtTmSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip50005oClearingDtTmSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_50005O_CLEARING_DT_TM_LENGTH = 10;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp50005oClearingDt;
            protected  int beginIp50005oClearingTm;
	
	/**
	* Constructor for Ip50005oClearingDtTmSerialized
	**/
    public Ip50005oClearingDtTmSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* initializes the field in Ip50005oClearingDtTmSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_50005O_CLEARING_DT_TM_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp50005oClearingDt = getStartOffset() + 0;	// set offset for serialization
  
             beginIp50005oClearingTm = getStartOffset() + 8;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localIp50005oClearingDtCounter = -1;
     public boolean isIp50005oClearingDtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp50005oClearingDtCounter != sharedCounter;
         localIp50005oClearingDtCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_50005O_CLEARING_DT_LEN = 8;
	/**
	 * 	serialize this Ip50005oClearingDt
	 */
   protected void serializeIp50005oClearingDt(char[] ip50005oClearingDt) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip50005oClearingDt,0,getStringValue(),beginIp50005oClearingDt,IP_50005O_CLEARING_DT_LEN);
       localIp50005oClearingDtCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp50005oClearingDtConstraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshIp50005oClearingDt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp50005oClearingDt() {	 
   		return (substring(getStringValue(),beginIp50005oClearingDt,beginIp50005oClearingDt + IP_50005O_CLEARING_DT_LEN));
   	}
     int localIp50005oClearingTmCounter = -1;
     public boolean isIp50005oClearingTmModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp50005oClearingTmCounter != sharedCounter;
         localIp50005oClearingTmCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_50005O_CLEARING_TM_LEN = 2;
	/**
	 * 	serialize this Ip50005oClearingTm
	 */
   protected void serializeIp50005oClearingTm(char[] ip50005oClearingTm) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip50005oClearingTm,0,getStringValue(),beginIp50005oClearingTm,IP_50005O_CLEARING_TM_LEN);
       localIp50005oClearingTmCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp50005oClearingTmConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshIp50005oClearingTm is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp50005oClearingTm() {	 
   		return (substring(getStringValue(),beginIp50005oClearingTm,beginIp50005oClearingTm + IP_50005O_CLEARING_TM_LEN));
   	}




}
  
