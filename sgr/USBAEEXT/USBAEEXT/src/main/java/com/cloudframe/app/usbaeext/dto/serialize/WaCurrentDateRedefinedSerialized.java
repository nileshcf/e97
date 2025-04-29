package com.cloudframe.app.usbaeext.dto.serialize;

/**
*  The class WaCurrentDateRedefinedSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:29. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class WaCurrentDateRedefinedSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(WaCurrentDateRedefinedSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WA_CURRENT_DATE_REDEFINED_LENGTH = 21;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginWaCdYyyy;
            protected  int beginWaCdMm;
            protected  int beginWaCdDd;
	
	/**
	* Constructor for WaCurrentDateRedefinedSerialized
	**/
    public WaCurrentDateRedefinedSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for WaCurrentDateRedefinedSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public WaCurrentDateRedefinedSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this WaCurrentDateRedefinedSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this WaCurrentDateRedefinedSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in WaCurrentDateRedefinedSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(WA_CURRENT_DATE_REDEFINED_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginWaCdYyyy = getStartOffset() + 0;	// set offset for serialization
  
             beginWaCdMm = getStartOffset() + 4;	// set offset for serialization
  
             beginWaCdDd = getStartOffset() + 6;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localWaCdYyyyCounter = -1;
     public boolean isWaCdYyyyModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWaCdYyyyCounter != sharedCounter;
         localWaCdYyyyCounter = sharedCounter; return hasModified;
     }
	protected static final int WA_CD_YYYY_LEN = 4;
	/**
	 * 	serialize this WaCdYyyy
	 */
   protected void serializeWaCdYyyy(char[] waCdYyyy) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(waCdYyyy,0,getStringValue(),beginWaCdYyyy,WA_CD_YYYY_LEN);
       localWaCdYyyyCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWaCdYyyyConstraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshWaCdYyyy is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWaCdYyyy() {	 
   		return (substring(getStringValue(),beginWaCdYyyy,beginWaCdYyyy + WA_CD_YYYY_LEN));
   	}
     int localWaCdMmCounter = -1;
     public boolean isWaCdMmModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWaCdMmCounter != sharedCounter;
         localWaCdMmCounter = sharedCounter; return hasModified;
     }
	protected static final int WA_CD_MM_LEN = 2;
	/**
	 * 	serialize this WaCdMm
	 */
   protected void serializeWaCdMm(char[] waCdMm) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(waCdMm,0,getStringValue(),beginWaCdMm,WA_CD_MM_LEN);
       localWaCdMmCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWaCdMmConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshWaCdMm is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWaCdMm() {	 
   		return (substring(getStringValue(),beginWaCdMm,beginWaCdMm + WA_CD_MM_LEN));
   	}
     int localWaCdDdCounter = -1;
     public boolean isWaCdDdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWaCdDdCounter != sharedCounter;
         localWaCdDdCounter = sharedCounter; return hasModified;
     }
	protected static final int WA_CD_DD_LEN = 2;
	/**
	 * 	serialize this WaCdDd
	 */
   protected void serializeWaCdDd(char[] waCdDd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(waCdDd,0,getStringValue(),beginWaCdDd,WA_CD_DD_LEN);
       localWaCdDdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWaCdDdConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshWaCdDd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWaCdDd() {	 
   		return (substring(getStringValue(),beginWaCdDd,beginWaCdDd + WA_CD_DD_LEN));
   	}




}
  
