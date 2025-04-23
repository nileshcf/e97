package com.cloudframe.app.sf320010.dto.serialize;

/**
*  The class RpC9DetailSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:12. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class RpC9DetailSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(RpC9DetailSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int RP_C_9_DETAIL_LENGTH = 132;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginRpC9DetCc;
            protected  int beginRpC9DetLogType;
            protected  int beginRpC9DetLogDesc;
            protected  int beginRpC9DetTotal;
	
	/**
	* Constructor for RpC9DetailSerialized
	**/
    public RpC9DetailSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in RpC9DetailSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(RP_C_9_DETAIL_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginRpC9DetCc = getStartOffset() + 0;	// set offset for serialization
  
  
             beginRpC9DetLogType = getStartOffset() + 9;	// set offset for serialization
  
  
             beginRpC9DetLogDesc = getStartOffset() + 19;	// set offset for serialization
  
  
             beginRpC9DetTotal = getStartOffset() + 71;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localRpC9DetCcCounter = -1;
     public boolean isRpC9DetCcModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRpC9DetCcCounter != sharedCounter;
         localRpC9DetCcCounter = sharedCounter; return hasModified;
     }
	protected static final int RP_C_9_DET_CC_LEN = 1;
	/**
	 * 	serialize this RpC9DetCc
	 */
   protected void serializeRpC9DetCc(char[] rpC9DetCc) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(rpC9DetCc,0,getStringValue(),beginRpC9DetCc,RP_C_9_DET_CC_LEN);
       localRpC9DetCcCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkRpC9DetCcConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshRpC9DetCc is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshRpC9DetCc() {	 
   		return (substring(getStringValue(),beginRpC9DetCc,beginRpC9DetCc + RP_C_9_DET_CC_LEN));
   	}
     int localRpC9DetLogTypeCounter = -1;
     public boolean isRpC9DetLogTypeModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRpC9DetLogTypeCounter != sharedCounter;
         localRpC9DetLogTypeCounter = sharedCounter; return hasModified;
     }
	protected static final int RP_C_9_DET_LOG_TYPE_LEN = 2;
	/**
	 * 	serialize this RpC9DetLogType
	 */
   protected void serializeRpC9DetLogType(char[] rpC9DetLogType) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(rpC9DetLogType,0,getStringValue(),beginRpC9DetLogType,RP_C_9_DET_LOG_TYPE_LEN);
       localRpC9DetLogTypeCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkRpC9DetLogTypeConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshRpC9DetLogType is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshRpC9DetLogType() {	 
   		return (substring(getStringValue(),beginRpC9DetLogType,beginRpC9DetLogType + RP_C_9_DET_LOG_TYPE_LEN));
   	}
     int localRpC9DetLogDescCounter = -1;
     public boolean isRpC9DetLogDescModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRpC9DetLogDescCounter != sharedCounter;
         localRpC9DetLogDescCounter = sharedCounter; return hasModified;
     }
	protected static final int RP_C_9_DET_LOG_DESC_LEN = 45;
	/**
	 * 	serialize this RpC9DetLogDesc
	 */
   protected void serializeRpC9DetLogDesc(char[] rpC9DetLogDesc) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(rpC9DetLogDesc,0,getStringValue(),beginRpC9DetLogDesc,RP_C_9_DET_LOG_DESC_LEN);
       localRpC9DetLogDescCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkRpC9DetLogDescConstraints(char[] value) {
   			return super.checkConstraints(value , 45 ,false, false);
   }
    /**
	 *	refreshRpC9DetLogDesc is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshRpC9DetLogDesc() {	 
   		return (substring(getStringValue(),beginRpC9DetLogDesc,beginRpC9DetLogDesc + RP_C_9_DET_LOG_DESC_LEN));
   	}
     int localRpC9DetTotalCounter = -1;
     public boolean isRpC9DetTotalModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRpC9DetTotalCounter != sharedCounter;
         localRpC9DetTotalCounter = sharedCounter; return hasModified;
     }
	protected static final int RP_C_9_DET_TOTAL_LEN = 9;
	/**
	 * 	serialize this RpC9DetTotal
	 */
   protected void serializeRpC9DetTotal(char[] rpC9DetTotal) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(rpC9DetTotal,0,getStringValue(),beginRpC9DetTotal,RP_C_9_DET_TOTAL_LEN);
       localRpC9DetTotalCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkRpC9DetTotalConstraints(char[] value) {
   			return super.checkConstraints(value , 9 ,false, false);
   }
    /**
	 *	refreshRpC9DetTotal is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshRpC9DetTotal() {	 
   		return (substring(getStringValue(),beginRpC9DetTotal,beginRpC9DetTotal + RP_C_9_DET_TOTAL_LEN));
   	}




}
  
