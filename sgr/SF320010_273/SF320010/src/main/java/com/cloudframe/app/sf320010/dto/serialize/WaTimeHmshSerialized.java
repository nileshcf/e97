package com.cloudframe.app.sf320010.dto.serialize;

/**
*  The class WaTimeHmshSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:29. using version 5.0.0.257
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class WaTimeHmshSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(WaTimeHmshSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WA_TIME_HMSH_LENGTH = 8;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginWaTimeHh;
            protected  int beginWaTimeMm;
            protected  int beginWaTimeSs;
	
	/**
	* Constructor for WaTimeHmshSerialized
	**/
    public WaTimeHmshSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in WaTimeHmshSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(WA_TIME_HMSH_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginWaTimeHh = getStartOffset() + 0;	// set offset for serialization
  
             beginWaTimeMm = getStartOffset() + 2;	// set offset for serialization
  
             beginWaTimeSs = getStartOffset() + 4;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localWaTimeHhCounter = -1;
     public boolean isWaTimeHhModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWaTimeHhCounter != sharedCounter;
         localWaTimeHhCounter = sharedCounter; return hasModified;
     }
	protected static final int WA_TIME_HH_LEN = 2;
	/**
	 * 	serialize this WaTimeHh
	 */
   protected void serializeWaTimeHh(char[] waTimeHh) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(waTimeHh,0,getStringValue(),beginWaTimeHh,WA_TIME_HH_LEN);
       localWaTimeHhCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWaTimeHhConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshWaTimeHh is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWaTimeHh() {	 
   		return (substring(getStringValue(),beginWaTimeHh,beginWaTimeHh + WA_TIME_HH_LEN));
   	}
     int localWaTimeMmCounter = -1;
     public boolean isWaTimeMmModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWaTimeMmCounter != sharedCounter;
         localWaTimeMmCounter = sharedCounter; return hasModified;
     }
	protected static final int WA_TIME_MM_LEN = 2;
	/**
	 * 	serialize this WaTimeMm
	 */
   protected void serializeWaTimeMm(char[] waTimeMm) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(waTimeMm,0,getStringValue(),beginWaTimeMm,WA_TIME_MM_LEN);
       localWaTimeMmCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWaTimeMmConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshWaTimeMm is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWaTimeMm() {	 
   		return (substring(getStringValue(),beginWaTimeMm,beginWaTimeMm + WA_TIME_MM_LEN));
   	}
     int localWaTimeSsCounter = -1;
     public boolean isWaTimeSsModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWaTimeSsCounter != sharedCounter;
         localWaTimeSsCounter = sharedCounter; return hasModified;
     }
	protected static final int WA_TIME_SS_LEN = 2;
	/**
	 * 	serialize this WaTimeSs
	 */
   protected void serializeWaTimeSs(char[] waTimeSs) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(waTimeSs,0,getStringValue(),beginWaTimeSs,WA_TIME_SS_LEN);
       localWaTimeSsCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWaTimeSsConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshWaTimeSs is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWaTimeSs() {	 
   		return (substring(getStringValue(),beginWaTimeSs,beginWaTimeSs + WA_TIME_SS_LEN));
   	}




}
  
