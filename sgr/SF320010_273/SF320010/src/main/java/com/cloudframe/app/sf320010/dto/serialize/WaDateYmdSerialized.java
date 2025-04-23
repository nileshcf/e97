package com.cloudframe.app.sf320010.dto.serialize;

/**
*  The class WaDateYmdSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:34. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class WaDateYmdSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(WaDateYmdSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WA_DATE_YMD_LENGTH = 6;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginWaDateYy;
            protected  int beginWaDateMm;
            protected  int beginWaDateDd;
	
	/**
	* Constructor for WaDateYmdSerialized
	**/
    public WaDateYmdSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in WaDateYmdSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(WA_DATE_YMD_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginWaDateYy = getStartOffset() + 0;	// set offset for serialization
  
             beginWaDateMm = getStartOffset() + 2;	// set offset for serialization
  
             beginWaDateDd = getStartOffset() + 4;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localWaDateYyCounter = -1;
     public boolean isWaDateYyModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWaDateYyCounter != sharedCounter;
         localWaDateYyCounter = sharedCounter; return hasModified;
     }
	protected static final int WA_DATE_YY_LEN = 2;
	/**
	 * 	serialize this WaDateYy
	 */
   protected void serializeWaDateYy(char[] waDateYy) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(waDateYy,0,getStringValue(),beginWaDateYy,WA_DATE_YY_LEN);
       localWaDateYyCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWaDateYyConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshWaDateYy is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWaDateYy() {	 
   		return (substring(getStringValue(),beginWaDateYy,beginWaDateYy + WA_DATE_YY_LEN));
   	}
     int localWaDateMmCounter = -1;
     public boolean isWaDateMmModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWaDateMmCounter != sharedCounter;
         localWaDateMmCounter = sharedCounter; return hasModified;
     }
	protected static final int WA_DATE_MM_LEN = 2;
	/**
	 * 	serialize this WaDateMm
	 */
   protected void serializeWaDateMm(char[] waDateMm) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(waDateMm,0,getStringValue(),beginWaDateMm,WA_DATE_MM_LEN);
       localWaDateMmCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWaDateMmConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshWaDateMm is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWaDateMm() {	 
   		return (substring(getStringValue(),beginWaDateMm,beginWaDateMm + WA_DATE_MM_LEN));
   	}
     int localWaDateDdCounter = -1;
     public boolean isWaDateDdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWaDateDdCounter != sharedCounter;
         localWaDateDdCounter = sharedCounter; return hasModified;
     }
	protected static final int WA_DATE_DD_LEN = 2;
	/**
	 * 	serialize this WaDateDd
	 */
   protected void serializeWaDateDd(char[] waDateDd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(waDateDd,0,getStringValue(),beginWaDateDd,WA_DATE_DD_LEN);
       localWaDateDdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWaDateDdConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshWaDateDd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWaDateDd() {	 
   		return (substring(getStringValue(),beginWaDateDd,beginWaDateDd + WA_DATE_DD_LEN));
   	}




}
  
