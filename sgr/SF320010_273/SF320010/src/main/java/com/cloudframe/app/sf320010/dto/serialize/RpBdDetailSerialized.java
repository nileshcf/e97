package com.cloudframe.app.sf320010.dto.serialize;

/**
*  The class RpBdDetailSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:34. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class RpBdDetailSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(RpBdDetailSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int RP_BD_DETAIL_LENGTH = 133;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginRpBdCc;
            protected  int beginRpBdBulkId;
            protected  int beginRpBdMipId;
            protected  int beginRpBdPathId;
            protected  int beginRpBdStatus;
            protected  int beginRpBdErrorCode;
            protected  int beginRpBdJulianDay;
            protected  int beginRpBdTime;
            protected  int beginRpBdNbr1kSpoolRcds;
            protected  int beginRpBdNbrBytesTrans;
            protected  int beginRpBdNbrBlocksTrans;
	
	/**
	* Constructor for RpBdDetailSerialized
	**/
    public RpBdDetailSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in RpBdDetailSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(RP_BD_DETAIL_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginRpBdCc = getStartOffset() + 0;	// set offset for serialization
  
  
             beginRpBdBulkId = getStartOffset() + 8;	// set offset for serialization
  
  
             beginRpBdMipId = getStartOffset() + 27;	// set offset for serialization
  
  
             beginRpBdPathId = getStartOffset() + 37;	// set offset for serialization
  
  
             beginRpBdStatus = getStartOffset() + 46;	// set offset for serialization
  
  
             beginRpBdErrorCode = getStartOffset() + 56;	// set offset for serialization
  
  
             beginRpBdJulianDay = getStartOffset() + 67;	// set offset for serialization
  
  
             beginRpBdTime = getStartOffset() + 77;	// set offset for serialization
  
  
             beginRpBdNbr1kSpoolRcds = getStartOffset() + 88;	// set offset for serialization
  
  
             beginRpBdNbrBytesTrans = getStartOffset() + 102;	// set offset for serialization
  
  
             beginRpBdNbrBlocksTrans = getStartOffset() + 114;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localRpBdCcCounter = -1;
     public boolean isRpBdCcModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRpBdCcCounter != sharedCounter;
         localRpBdCcCounter = sharedCounter; return hasModified;
     }
	protected static final int RP_BD_CC_LEN = 1;
	/**
	 * 	serialize this RpBdCc
	 */
   protected void serializeRpBdCc(char[] rpBdCc) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(rpBdCc,0,getStringValue(),beginRpBdCc,RP_BD_CC_LEN);
       localRpBdCcCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkRpBdCcConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshRpBdCc is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshRpBdCc() {	 
   		return (substring(getStringValue(),beginRpBdCc,beginRpBdCc + RP_BD_CC_LEN));
   	}
     int localRpBdBulkIdCounter = -1;
     public boolean isRpBdBulkIdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRpBdBulkIdCounter != sharedCounter;
         localRpBdBulkIdCounter = sharedCounter; return hasModified;
     }
	protected static final int RP_BD_BULK_ID_LEN = 14;
	/**
	 * 	serialize this RpBdBulkId
	 */
   protected void serializeRpBdBulkId(char[] rpBdBulkId) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(rpBdBulkId,0,getStringValue(),beginRpBdBulkId,RP_BD_BULK_ID_LEN);
       localRpBdBulkIdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkRpBdBulkIdConstraints(char[] value) {
   			return super.checkConstraints(value , 14 ,false, false);
   }
    /**
	 *	refreshRpBdBulkId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshRpBdBulkId() {	 
   		return (substring(getStringValue(),beginRpBdBulkId,beginRpBdBulkId + RP_BD_BULK_ID_LEN));
   	}
     int localRpBdMipIdCounter = -1;
     public boolean isRpBdMipIdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRpBdMipIdCounter != sharedCounter;
         localRpBdMipIdCounter = sharedCounter; return hasModified;
     }
	protected static final int RP_BD_MIP_ID_LEN = 3;
	/**
	 * 	serialize this RpBdMipId
	 */
   protected void serializeRpBdMipId(char[] rpBdMipId) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(rpBdMipId,0,getStringValue(),beginRpBdMipId,RP_BD_MIP_ID_LEN);
       localRpBdMipIdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkRpBdMipIdConstraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshRpBdMipId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshRpBdMipId() {	 
   		return (substring(getStringValue(),beginRpBdMipId,beginRpBdMipId + RP_BD_MIP_ID_LEN));
   	}
     int localRpBdPathIdCounter = -1;
     public boolean isRpBdPathIdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRpBdPathIdCounter != sharedCounter;
         localRpBdPathIdCounter = sharedCounter; return hasModified;
     }
	protected static final int RP_BD_PATH_ID_LEN = 1;
	/**
	 * 	serialize this RpBdPathId
	 */
   protected void serializeRpBdPathId(char[] rpBdPathId) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(rpBdPathId,0,getStringValue(),beginRpBdPathId,RP_BD_PATH_ID_LEN);
       localRpBdPathIdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkRpBdPathIdConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshRpBdPathId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshRpBdPathId() {	 
   		return (substring(getStringValue(),beginRpBdPathId,beginRpBdPathId + RP_BD_PATH_ID_LEN));
   	}
     int localRpBdStatusCounter = -1;
     public boolean isRpBdStatusModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRpBdStatusCounter != sharedCounter;
         localRpBdStatusCounter = sharedCounter; return hasModified;
     }
	protected static final int RP_BD_STATUS_LEN = 1;
	/**
	 * 	serialize this RpBdStatus
	 */
   protected void serializeRpBdStatus(char[] rpBdStatus) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(rpBdStatus,0,getStringValue(),beginRpBdStatus,RP_BD_STATUS_LEN);
       localRpBdStatusCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkRpBdStatusConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshRpBdStatus is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshRpBdStatus() {	 
   		return (substring(getStringValue(),beginRpBdStatus,beginRpBdStatus + RP_BD_STATUS_LEN));
   	}
     int localRpBdErrorCodeCounter = -1;
     public boolean isRpBdErrorCodeModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRpBdErrorCodeCounter != sharedCounter;
         localRpBdErrorCodeCounter = sharedCounter; return hasModified;
     }
	protected static final int RP_BD_ERROR_CODE_LEN = 1;
	/**
	 * 	serialize this RpBdErrorCode
	 */
   protected void serializeRpBdErrorCode(char[] rpBdErrorCode) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(rpBdErrorCode,0,getStringValue(),beginRpBdErrorCode,RP_BD_ERROR_CODE_LEN);
       localRpBdErrorCodeCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkRpBdErrorCodeConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshRpBdErrorCode is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshRpBdErrorCode() {	 
   		return (substring(getStringValue(),beginRpBdErrorCode,beginRpBdErrorCode + RP_BD_ERROR_CODE_LEN));
   	}
     int localRpBdJulianDayCounter = -1;
     public boolean isRpBdJulianDayModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRpBdJulianDayCounter != sharedCounter;
         localRpBdJulianDayCounter = sharedCounter; return hasModified;
     }
	protected static final int RP_BD_JULIAN_DAY_LEN = 3;
	/**
	 * 	serialize this RpBdJulianDay
	 */
   protected void serializeRpBdJulianDay(char[] rpBdJulianDay) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(rpBdJulianDay,0,getStringValue(),beginRpBdJulianDay,RP_BD_JULIAN_DAY_LEN);
       localRpBdJulianDayCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkRpBdJulianDayConstraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshRpBdJulianDay is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshRpBdJulianDay() {	 
   		return (substring(getStringValue(),beginRpBdJulianDay,beginRpBdJulianDay + RP_BD_JULIAN_DAY_LEN));
   	}
     int localRpBdTimeCounter = -1;
     public boolean isRpBdTimeModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRpBdTimeCounter != sharedCounter;
         localRpBdTimeCounter = sharedCounter; return hasModified;
     }
	protected static final int RP_BD_TIME_LEN = 6;
	/**
	 * 	serialize this RpBdTime
	 */
   protected void serializeRpBdTime(char[] rpBdTime) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(rpBdTime,0,getStringValue(),beginRpBdTime,RP_BD_TIME_LEN);
       localRpBdTimeCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkRpBdTimeConstraints(char[] value) {
   			return super.checkConstraints(value , 6 ,false, false);
   }
    /**
	 *	refreshRpBdTime is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshRpBdTime() {	 
   		return (substring(getStringValue(),beginRpBdTime,beginRpBdTime + RP_BD_TIME_LEN));
   	}
     int localRpBdNbr1kSpoolRcdsCounter = -1;
     public boolean isRpBdNbr1kSpoolRcdsModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRpBdNbr1kSpoolRcdsCounter != sharedCounter;
         localRpBdNbr1kSpoolRcdsCounter = sharedCounter; return hasModified;
     }
	protected static final int RP_BD_NBR_1K_SPOOL_RCDS_LEN = 9;
	/**
	 * 	serialize this RpBdNbr1kSpoolRcds
	 */
   protected void serializeRpBdNbr1kSpoolRcds(char[] rpBdNbr1kSpoolRcds) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(rpBdNbr1kSpoolRcds,0,getStringValue(),beginRpBdNbr1kSpoolRcds,RP_BD_NBR_1K_SPOOL_RCDS_LEN);
       localRpBdNbr1kSpoolRcdsCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkRpBdNbr1kSpoolRcdsConstraints(char[] value) {
   			return super.checkConstraints(value , 9 ,false, false);
   }
    /**
	 *	refreshRpBdNbr1kSpoolRcds is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshRpBdNbr1kSpoolRcds() {	 
   		return (substring(getStringValue(),beginRpBdNbr1kSpoolRcds,beginRpBdNbr1kSpoolRcds + RP_BD_NBR_1K_SPOOL_RCDS_LEN));
   	}
     int localRpBdNbrBytesTransCounter = -1;
     public boolean isRpBdNbrBytesTransModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRpBdNbrBytesTransCounter != sharedCounter;
         localRpBdNbrBytesTransCounter = sharedCounter; return hasModified;
     }
	protected static final int RP_BD_NBR_BYTES_TRANS_LEN = 9;
	/**
	 * 	serialize this RpBdNbrBytesTrans
	 */
   protected void serializeRpBdNbrBytesTrans(char[] rpBdNbrBytesTrans) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(rpBdNbrBytesTrans,0,getStringValue(),beginRpBdNbrBytesTrans,RP_BD_NBR_BYTES_TRANS_LEN);
       localRpBdNbrBytesTransCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkRpBdNbrBytesTransConstraints(char[] value) {
   			return super.checkConstraints(value , 9 ,false, false);
   }
    /**
	 *	refreshRpBdNbrBytesTrans is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshRpBdNbrBytesTrans() {	 
   		return (substring(getStringValue(),beginRpBdNbrBytesTrans,beginRpBdNbrBytesTrans + RP_BD_NBR_BYTES_TRANS_LEN));
   	}
     int localRpBdNbrBlocksTransCounter = -1;
     public boolean isRpBdNbrBlocksTransModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRpBdNbrBlocksTransCounter != sharedCounter;
         localRpBdNbrBlocksTransCounter = sharedCounter; return hasModified;
     }
	protected static final int RP_BD_NBR_BLOCKS_TRANS_LEN = 9;
	/**
	 * 	serialize this RpBdNbrBlocksTrans
	 */
   protected void serializeRpBdNbrBlocksTrans(char[] rpBdNbrBlocksTrans) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(rpBdNbrBlocksTrans,0,getStringValue(),beginRpBdNbrBlocksTrans,RP_BD_NBR_BLOCKS_TRANS_LEN);
       localRpBdNbrBlocksTransCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkRpBdNbrBlocksTransConstraints(char[] value) {
   			return super.checkConstraints(value , 9 ,false, false);
   }
    /**
	 *	refreshRpBdNbrBlocksTrans is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshRpBdNbrBlocksTrans() {	 
   		return (substring(getStringValue(),beginRpBdNbrBlocksTrans,beginRpBdNbrBlocksTrans + RP_BD_NBR_BLOCKS_TRANS_LEN));
   	}




}
  
