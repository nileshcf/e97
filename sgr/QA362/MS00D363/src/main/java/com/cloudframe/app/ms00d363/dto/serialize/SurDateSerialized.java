package com.cloudframe.app.ms00d363.dto.serialize;

/**
*  The class SurDateSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:32. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class SurDateSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(SurDateSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int SUR_DATE_LENGTH = 8;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginSurDateCc;
            protected  int beginSurDateYy;
            protected  int beginSurDateMm;
            protected  int beginSurDateDd;
	
	/**
	* Constructor for SurDateSerialized
	**/
    public SurDateSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in SurDateSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(SUR_DATE_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginSurDateCc = getStartOffset() + 0;	// set offset for serialization
  
             beginSurDateYy = getStartOffset() + 2;	// set offset for serialization
  
             beginSurDateMm = getStartOffset() + 4;	// set offset for serialization
  
             beginSurDateDd = getStartOffset() + 6;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localSurDateCcCounter = -1;
     public boolean isSurDateCcModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSurDateCcCounter != sharedCounter;
         localSurDateCcCounter = sharedCounter; return hasModified;
     }
	protected static final int SUR_DATE_CC_LEN = 2;
	/**
	 * 	serialize this SurDateCc
	 */
   protected void serializeSurDateCc(char[] surDateCc) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(surDateCc,0,getStringValue(),beginSurDateCc,SUR_DATE_CC_LEN);
       localSurDateCcCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSurDateCcConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshSurDateCc is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSurDateCc() {	 
   		return (substring(getStringValue(),beginSurDateCc,beginSurDateCc + SUR_DATE_CC_LEN));
   	}
     int localSurDateYyCounter = -1;
     public boolean isSurDateYyModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSurDateYyCounter != sharedCounter;
         localSurDateYyCounter = sharedCounter; return hasModified;
     }
	protected static final int SUR_DATE_YY_LEN = 2;
	/**
	 * 	serialize this SurDateYy
	 */
   protected void serializeSurDateYy(char[] surDateYy) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(surDateYy,0,getStringValue(),beginSurDateYy,SUR_DATE_YY_LEN);
       localSurDateYyCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSurDateYyConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshSurDateYy is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSurDateYy() {	 
   		return (substring(getStringValue(),beginSurDateYy,beginSurDateYy + SUR_DATE_YY_LEN));
   	}
     int localSurDateMmCounter = -1;
     public boolean isSurDateMmModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSurDateMmCounter != sharedCounter;
         localSurDateMmCounter = sharedCounter; return hasModified;
     }
	protected static final int SUR_DATE_MM_LEN = 2;
	/**
	 * 	serialize this SurDateMm
	 */
   protected void serializeSurDateMm(char[] surDateMm) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(surDateMm,0,getStringValue(),beginSurDateMm,SUR_DATE_MM_LEN);
       localSurDateMmCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSurDateMmConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshSurDateMm is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSurDateMm() {	 
   		return (substring(getStringValue(),beginSurDateMm,beginSurDateMm + SUR_DATE_MM_LEN));
   	}
     int localSurDateDdCounter = -1;
     public boolean isSurDateDdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSurDateDdCounter != sharedCounter;
         localSurDateDdCounter = sharedCounter; return hasModified;
     }
	protected static final int SUR_DATE_DD_LEN = 2;
	/**
	 * 	serialize this SurDateDd
	 */
   protected void serializeSurDateDd(char[] surDateDd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(surDateDd,0,getStringValue(),beginSurDateDd,SUR_DATE_DD_LEN);
       localSurDateDdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSurDateDdConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshSurDateDd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSurDateDd() {	 
   		return (substring(getStringValue(),beginSurDateDd,beginSurDateDd + SUR_DATE_DD_LEN));
   	}




}
  
