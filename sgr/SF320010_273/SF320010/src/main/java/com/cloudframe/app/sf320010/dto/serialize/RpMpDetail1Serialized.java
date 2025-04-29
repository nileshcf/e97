package com.cloudframe.app.sf320010.dto.serialize;

/**
*  The class RpMpDetail1Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:29. using version 5.0.0.257
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class RpMpDetail1Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(RpMpDetail1Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int RP_MP_DETAIL_1_LENGTH = 133;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginRpMpCc1;
            protected  int beginRpMpMipId;
            protected  int beginRpMpLogDate;
            protected  int beginRpMpLogTime;
            protected  int beginRpMpRclFileInd;
            protected  int beginRpMpNegFileAvailInd;
            protected  int beginRpMpMbrDelayFileInd;
            protected  int beginRpMpLocalNegFileInd;
	
	/**
	* Constructor for RpMpDetail1Serialized
	**/
    public RpMpDetail1Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in RpMpDetail1Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(RP_MP_DETAIL_1_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginRpMpCc1 = getStartOffset() + 0;	// set offset for serialization
  
  
             beginRpMpMipId = getStartOffset() + 11;	// set offset for serialization
  
  
             beginRpMpLogDate = getStartOffset() + 27;	// set offset for serialization
  
  
             beginRpMpLogTime = getStartOffset() + 46;	// set offset for serialization
  
  
             beginRpMpRclFileInd = getStartOffset() + 68;	// set offset for serialization
  
  
             beginRpMpNegFileAvailInd = getStartOffset() + 88;	// set offset for serialization
  
  
             beginRpMpMbrDelayFileInd = getStartOffset() + 109;	// set offset for serialization
  
  
             beginRpMpLocalNegFileInd = getStartOffset() + 129;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localRpMpCc1Counter = -1;
     public boolean isRpMpCc1Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRpMpCc1Counter != sharedCounter;
         localRpMpCc1Counter = sharedCounter; return hasModified;
     }
	protected static final int RP_MP_CC_1_LEN = 1;
	/**
	 * 	serialize this RpMpCc1
	 */
   protected void serializeRpMpCc1(char[] rpMpCc1) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(rpMpCc1,0,getStringValue(),beginRpMpCc1,RP_MP_CC_1_LEN);
       localRpMpCc1Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkRpMpCc1Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshRpMpCc1 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshRpMpCc1() {	 
   		return (substring(getStringValue(),beginRpMpCc1,beginRpMpCc1 + RP_MP_CC_1_LEN));
   	}
     int localRpMpMipIdCounter = -1;
     public boolean isRpMpMipIdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRpMpMipIdCounter != sharedCounter;
         localRpMpMipIdCounter = sharedCounter; return hasModified;
     }
	protected static final int RP_MP_MIP_ID_LEN = 3;
	/**
	 * 	serialize this RpMpMipId
	 */
   protected void serializeRpMpMipId(char[] rpMpMipId) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(rpMpMipId,0,getStringValue(),beginRpMpMipId,RP_MP_MIP_ID_LEN);
       localRpMpMipIdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkRpMpMipIdConstraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshRpMpMipId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshRpMpMipId() {	 
   		return (substring(getStringValue(),beginRpMpMipId,beginRpMpMipId + RP_MP_MIP_ID_LEN));
   	}
     int localRpMpLogDateCounter = -1;
     public boolean isRpMpLogDateModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRpMpLogDateCounter != sharedCounter;
         localRpMpLogDateCounter = sharedCounter; return hasModified;
     }
	protected static final int RP_MP_LOG_DATE_LEN = 6;
	/**
	 * 	serialize this RpMpLogDate
	 */
   protected void serializeRpMpLogDate(char[] rpMpLogDate) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(rpMpLogDate,0,getStringValue(),beginRpMpLogDate,RP_MP_LOG_DATE_LEN);
       localRpMpLogDateCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkRpMpLogDateConstraints(char[] value) {
   			return super.checkConstraints(value , 6 ,false, false);
   }
    /**
	 *	refreshRpMpLogDate is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshRpMpLogDate() {	 
   		return (substring(getStringValue(),beginRpMpLogDate,beginRpMpLogDate + RP_MP_LOG_DATE_LEN));
   	}
     int localRpMpLogTimeCounter = -1;
     public boolean isRpMpLogTimeModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRpMpLogTimeCounter != sharedCounter;
         localRpMpLogTimeCounter = sharedCounter; return hasModified;
     }
	protected static final int RP_MP_LOG_TIME_LEN = 6;
	/**
	 * 	serialize this RpMpLogTime
	 */
   protected void serializeRpMpLogTime(char[] rpMpLogTime) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(rpMpLogTime,0,getStringValue(),beginRpMpLogTime,RP_MP_LOG_TIME_LEN);
       localRpMpLogTimeCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkRpMpLogTimeConstraints(char[] value) {
   			return super.checkConstraints(value , 6 ,false, false);
   }
    /**
	 *	refreshRpMpLogTime is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshRpMpLogTime() {	 
   		return (substring(getStringValue(),beginRpMpLogTime,beginRpMpLogTime + RP_MP_LOG_TIME_LEN));
   	}
     int localRpMpRclFileIndCounter = -1;
     public boolean isRpMpRclFileIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRpMpRclFileIndCounter != sharedCounter;
         localRpMpRclFileIndCounter = sharedCounter; return hasModified;
     }
	protected static final int RP_MP_RCL_FILE_IND_LEN = 1;
	/**
	 * 	serialize this RpMpRclFileInd
	 */
   protected void serializeRpMpRclFileInd(char[] rpMpRclFileInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(rpMpRclFileInd,0,getStringValue(),beginRpMpRclFileInd,RP_MP_RCL_FILE_IND_LEN);
       localRpMpRclFileIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkRpMpRclFileIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshRpMpRclFileInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshRpMpRclFileInd() {	 
   		return (substring(getStringValue(),beginRpMpRclFileInd,beginRpMpRclFileInd + RP_MP_RCL_FILE_IND_LEN));
   	}
     int localRpMpNegFileAvailIndCounter = -1;
     public boolean isRpMpNegFileAvailIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRpMpNegFileAvailIndCounter != sharedCounter;
         localRpMpNegFileAvailIndCounter = sharedCounter; return hasModified;
     }
	protected static final int RP_MP_NEG_FILE_AVAIL_IND_LEN = 1;
	/**
	 * 	serialize this RpMpNegFileAvailInd
	 */
   protected void serializeRpMpNegFileAvailInd(char[] rpMpNegFileAvailInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(rpMpNegFileAvailInd,0,getStringValue(),beginRpMpNegFileAvailInd,RP_MP_NEG_FILE_AVAIL_IND_LEN);
       localRpMpNegFileAvailIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkRpMpNegFileAvailIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshRpMpNegFileAvailInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshRpMpNegFileAvailInd() {	 
   		return (substring(getStringValue(),beginRpMpNegFileAvailInd,beginRpMpNegFileAvailInd + RP_MP_NEG_FILE_AVAIL_IND_LEN));
   	}
     int localRpMpMbrDelayFileIndCounter = -1;
     public boolean isRpMpMbrDelayFileIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRpMpMbrDelayFileIndCounter != sharedCounter;
         localRpMpMbrDelayFileIndCounter = sharedCounter; return hasModified;
     }
	protected static final int RP_MP_MBR_DELAY_FILE_IND_LEN = 1;
	/**
	 * 	serialize this RpMpMbrDelayFileInd
	 */
   protected void serializeRpMpMbrDelayFileInd(char[] rpMpMbrDelayFileInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(rpMpMbrDelayFileInd,0,getStringValue(),beginRpMpMbrDelayFileInd,RP_MP_MBR_DELAY_FILE_IND_LEN);
       localRpMpMbrDelayFileIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkRpMpMbrDelayFileIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshRpMpMbrDelayFileInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshRpMpMbrDelayFileInd() {	 
   		return (substring(getStringValue(),beginRpMpMbrDelayFileInd,beginRpMpMbrDelayFileInd + RP_MP_MBR_DELAY_FILE_IND_LEN));
   	}
     int localRpMpLocalNegFileIndCounter = -1;
     public boolean isRpMpLocalNegFileIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRpMpLocalNegFileIndCounter != sharedCounter;
         localRpMpLocalNegFileIndCounter = sharedCounter; return hasModified;
     }
	protected static final int RP_MP_LOCAL_NEG_FILE_IND_LEN = 1;
	/**
	 * 	serialize this RpMpLocalNegFileInd
	 */
   protected void serializeRpMpLocalNegFileInd(char[] rpMpLocalNegFileInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(rpMpLocalNegFileInd,0,getStringValue(),beginRpMpLocalNegFileInd,RP_MP_LOCAL_NEG_FILE_IND_LEN);
       localRpMpLocalNegFileIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkRpMpLocalNegFileIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshRpMpLocalNegFileInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshRpMpLocalNegFileInd() {	 
   		return (substring(getStringValue(),beginRpMpLocalNegFileInd,beginRpMpLocalNegFileInd + RP_MP_LOCAL_NEG_FILE_IND_LEN));
   	}




}
  
