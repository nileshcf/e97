package com.cloudframe.app.sf320010.dto.serialize;

/**
*  The class RpC7DetailSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:29. using version 5.0.0.257
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class RpC7DetailSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(RpC7DetailSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int RP_C_7_DETAIL_LENGTH = 132;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginRpC7DetCc;
            protected  int beginRpC7DetLogType;
            protected  int beginRpC7DetLogDesc;
            protected  int beginRpC7DetTotal;
	
	/**
	* Constructor for RpC7DetailSerialized
	**/
    public RpC7DetailSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in RpC7DetailSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(RP_C_7_DETAIL_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginRpC7DetCc = getStartOffset() + 0;	// set offset for serialization
  
  
             beginRpC7DetLogType = getStartOffset() + 9;	// set offset for serialization
  
  
             beginRpC7DetLogDesc = getStartOffset() + 19;	// set offset for serialization
  
  
             beginRpC7DetTotal = getStartOffset() + 71;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localRpC7DetCcCounter = -1;
     public boolean isRpC7DetCcModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRpC7DetCcCounter != sharedCounter;
         localRpC7DetCcCounter = sharedCounter; return hasModified;
     }
	protected static final int RP_C_7_DET_CC_LEN = 1;
	/**
	 * 	serialize this RpC7DetCc
	 */
   protected void serializeRpC7DetCc(char[] rpC7DetCc) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(rpC7DetCc,0,getStringValue(),beginRpC7DetCc,RP_C_7_DET_CC_LEN);
       localRpC7DetCcCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkRpC7DetCcConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshRpC7DetCc is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshRpC7DetCc() {	 
   		return (substring(getStringValue(),beginRpC7DetCc,beginRpC7DetCc + RP_C_7_DET_CC_LEN));
   	}
     int localRpC7DetLogTypeCounter = -1;
     public boolean isRpC7DetLogTypeModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRpC7DetLogTypeCounter != sharedCounter;
         localRpC7DetLogTypeCounter = sharedCounter; return hasModified;
     }
	protected static final int RP_C_7_DET_LOG_TYPE_LEN = 1;
	/**
	 * 	serialize this RpC7DetLogType
	 */
   protected void serializeRpC7DetLogType(char[] rpC7DetLogType) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(rpC7DetLogType,0,getStringValue(),beginRpC7DetLogType,RP_C_7_DET_LOG_TYPE_LEN);
       localRpC7DetLogTypeCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkRpC7DetLogTypeConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshRpC7DetLogType is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshRpC7DetLogType() {	 
   		return (substring(getStringValue(),beginRpC7DetLogType,beginRpC7DetLogType + RP_C_7_DET_LOG_TYPE_LEN));
   	}
     int localRpC7DetLogDescCounter = -1;
     public boolean isRpC7DetLogDescModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRpC7DetLogDescCounter != sharedCounter;
         localRpC7DetLogDescCounter = sharedCounter; return hasModified;
     }
	protected static final int RP_C_7_DET_LOG_DESC_LEN = 45;
	/**
	 * 	serialize this RpC7DetLogDesc
	 */
   protected void serializeRpC7DetLogDesc(char[] rpC7DetLogDesc) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(rpC7DetLogDesc,0,getStringValue(),beginRpC7DetLogDesc,RP_C_7_DET_LOG_DESC_LEN);
       localRpC7DetLogDescCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkRpC7DetLogDescConstraints(char[] value) {
   			return super.checkConstraints(value , 45 ,false, false);
   }
    /**
	 *	refreshRpC7DetLogDesc is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshRpC7DetLogDesc() {	 
   		return (substring(getStringValue(),beginRpC7DetLogDesc,beginRpC7DetLogDesc + RP_C_7_DET_LOG_DESC_LEN));
   	}
     int localRpC7DetTotalCounter = -1;
     public boolean isRpC7DetTotalModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRpC7DetTotalCounter != sharedCounter;
         localRpC7DetTotalCounter = sharedCounter; return hasModified;
     }
	protected static final int RP_C_7_DET_TOTAL_LEN = 9;
	/**
	 * 	serialize this RpC7DetTotal
	 */
   protected void serializeRpC7DetTotal(char[] rpC7DetTotal) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(rpC7DetTotal,0,getStringValue(),beginRpC7DetTotal,RP_C_7_DET_TOTAL_LEN);
       localRpC7DetTotalCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkRpC7DetTotalConstraints(char[] value) {
   			return super.checkConstraints(value , 9 ,false, false);
   }
    /**
	 *	refreshRpC7DetTotal is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshRpC7DetTotal() {	 
   		return (substring(getStringValue(),beginRpC7DetTotal,beginRpC7DetTotal + RP_C_7_DET_TOTAL_LEN));
   	}




}
  
