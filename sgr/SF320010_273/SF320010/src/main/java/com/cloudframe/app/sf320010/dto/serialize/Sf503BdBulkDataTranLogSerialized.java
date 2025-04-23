package com.cloudframe.app.sf320010.dto.serialize;

/**
*  The class Sf503BdBulkDataTranLogSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:12. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Sf503BdBulkDataTranLogSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Sf503BdBulkDataTranLogSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int SF_503_BD_BULK_DATA_TRAN_LOG_LENGTH = 32737;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginSf503BdBulkId;
            protected  int beginSf503BdMipId;
            protected  int beginSf503BdPathId;
            protected  int beginSf503BdStatus;
            protected  int beginSf503BdErrorCode;
            protected  int beginSf503BdJulianDay;
            protected  int beginSf503BdTime;
            protected  int beginSf503BdNbr1kSpoolRcds;
            protected  int beginSf503BdNbrBytesTrans;
            protected  int beginSf503BdNbrBlocksTrans;
	
	/**
	* Constructor for Sf503BdBulkDataTranLogSerialized
	**/
    public Sf503BdBulkDataTranLogSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Sf503BdBulkDataTranLogSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Sf503BdBulkDataTranLogSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Sf503BdBulkDataTranLogSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,15); // serialize this field at offset 15 by default 
    }
    
	/**
	* sets parent for this Sf503BdBulkDataTranLogSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 15 by default
    }    
	/**
	* initializes the field in Sf503BdBulkDataTranLogSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(SF_503_BD_BULK_DATA_TRAN_LOG_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginSf503BdBulkId = getStartOffset() + 1;	// set offset for serialization
  
             beginSf503BdMipId = getStartOffset() + 15;	// set offset for serialization
  
             beginSf503BdPathId = getStartOffset() + 18;	// set offset for serialization
  
             beginSf503BdStatus = getStartOffset() + 19;	// set offset for serialization
  
             beginSf503BdErrorCode = getStartOffset() + 20;	// set offset for serialization
  
             beginSf503BdJulianDay = getStartOffset() + 21;	// set offset for serialization
  
             beginSf503BdTime = getStartOffset() + 24;	// set offset for serialization
  
             beginSf503BdNbr1kSpoolRcds = getStartOffset() + 30;	// set offset for serialization
  
             beginSf503BdNbrBytesTrans = getStartOffset() + 34;	// set offset for serialization
  
             beginSf503BdNbrBlocksTrans = getStartOffset() + 38;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localSf503BdBulkIdCounter = -1;
     public boolean isSf503BdBulkIdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSf503BdBulkIdCounter != sharedCounter;
         localSf503BdBulkIdCounter = sharedCounter; return hasModified;
     }
	protected static final int SF_503_BD_BULK_ID_LEN = 14;
	/**
	 * 	serialize this Sf503BdBulkId
	 */
   protected void serializeSf503BdBulkId(char[] sf503BdBulkId) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sf503BdBulkId,0,getStringValue(),beginSf503BdBulkId,SF_503_BD_BULK_ID_LEN);
       localSf503BdBulkIdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSf503BdBulkIdConstraints(char[] value) {
   			return super.checkConstraints(value , 14 ,false, false);
   }
    /**
	 *	refreshSf503BdBulkId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSf503BdBulkId() {	 
   		return (substring(getStringValue(),beginSf503BdBulkId,beginSf503BdBulkId + SF_503_BD_BULK_ID_LEN));
   	}
     int localSf503BdMipIdCounter = -1;
     public boolean isSf503BdMipIdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSf503BdMipIdCounter != sharedCounter;
         localSf503BdMipIdCounter = sharedCounter; return hasModified;
     }
	protected static final int SF_503_BD_MIP_ID_LEN = 3;
	/**
	 * 	serialize this Sf503BdMipId
	 */
   protected void serializeSf503BdMipId(char[] sf503BdMipId) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sf503BdMipId,0,getStringValue(),beginSf503BdMipId,SF_503_BD_MIP_ID_LEN);
       localSf503BdMipIdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSf503BdMipIdConstraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshSf503BdMipId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSf503BdMipId() {	 
   		return (substring(getStringValue(),beginSf503BdMipId,beginSf503BdMipId + SF_503_BD_MIP_ID_LEN));
   	}
     int localSf503BdPathIdCounter = -1;
     public boolean isSf503BdPathIdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSf503BdPathIdCounter != sharedCounter;
         localSf503BdPathIdCounter = sharedCounter; return hasModified;
     }
	protected static final int SF_503_BD_PATH_ID_LEN = 1;
	/**
	 * 	serialize this Sf503BdPathId
	 */
   protected void serializeSf503BdPathId(char[] sf503BdPathId) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sf503BdPathId,0,getStringValue(),beginSf503BdPathId,SF_503_BD_PATH_ID_LEN);
       localSf503BdPathIdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSf503BdPathIdConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshSf503BdPathId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSf503BdPathId() {	 
   		return (substring(getStringValue(),beginSf503BdPathId,beginSf503BdPathId + SF_503_BD_PATH_ID_LEN));
   	}
     int localSf503BdStatusCounter = -1;
     public boolean isSf503BdStatusModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSf503BdStatusCounter != sharedCounter;
         localSf503BdStatusCounter = sharedCounter; return hasModified;
     }
	protected static final int SF_503_BD_STATUS_LEN = 1;
	/**
	 * 	serialize this Sf503BdStatus
	 */
   protected void serializeSf503BdStatus(char[] sf503BdStatus) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sf503BdStatus,0,getStringValue(),beginSf503BdStatus,SF_503_BD_STATUS_LEN);
       localSf503BdStatusCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSf503BdStatusConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshSf503BdStatus is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSf503BdStatus() {	 
   		return (substring(getStringValue(),beginSf503BdStatus,beginSf503BdStatus + SF_503_BD_STATUS_LEN));
   	}
     int localSf503BdErrorCodeCounter = -1;
     public boolean isSf503BdErrorCodeModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSf503BdErrorCodeCounter != sharedCounter;
         localSf503BdErrorCodeCounter = sharedCounter; return hasModified;
     }
	protected static final int SF_503_BD_ERROR_CODE_LEN = 1;
	/**
	 * 	serialize this Sf503BdErrorCode
	 */
   protected void serializeSf503BdErrorCode(char[] sf503BdErrorCode) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sf503BdErrorCode,0,getStringValue(),beginSf503BdErrorCode,SF_503_BD_ERROR_CODE_LEN);
       localSf503BdErrorCodeCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSf503BdErrorCodeConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshSf503BdErrorCode is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSf503BdErrorCode() {	 
   		return (substring(getStringValue(),beginSf503BdErrorCode,beginSf503BdErrorCode + SF_503_BD_ERROR_CODE_LEN));
   	}
     int localSf503BdJulianDayCounter = -1;
     public boolean isSf503BdJulianDayModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSf503BdJulianDayCounter != sharedCounter;
         localSf503BdJulianDayCounter = sharedCounter; return hasModified;
     }
	protected static final int SF_503_BD_JULIAN_DAY_LEN = 3;
	/**
	 * 	serialize this Sf503BdJulianDay
	 */
   protected void serializeSf503BdJulianDay(char[] sf503BdJulianDay) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sf503BdJulianDay,0,getStringValue(),beginSf503BdJulianDay,SF_503_BD_JULIAN_DAY_LEN);
       localSf503BdJulianDayCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSf503BdJulianDayConstraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshSf503BdJulianDay is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSf503BdJulianDay() {	 
   		return (substring(getStringValue(),beginSf503BdJulianDay,beginSf503BdJulianDay + SF_503_BD_JULIAN_DAY_LEN));
   	}
     int localSf503BdTimeCounter = -1;
     public boolean isSf503BdTimeModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSf503BdTimeCounter != sharedCounter;
         localSf503BdTimeCounter = sharedCounter; return hasModified;
     }
	protected static final int SF_503_BD_TIME_LEN = 6;
	/**
	 * 	serialize this Sf503BdTime
	 */
   protected void serializeSf503BdTime(char[] sf503BdTime) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sf503BdTime,0,getStringValue(),beginSf503BdTime,SF_503_BD_TIME_LEN);
       localSf503BdTimeCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSf503BdTimeConstraints(char[] value) {
   			return super.checkConstraints(value , 6 ,false, false);
   }
    /**
	 *	refreshSf503BdTime is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSf503BdTime() {	 
   		return (substring(getStringValue(),beginSf503BdTime,beginSf503BdTime + SF_503_BD_TIME_LEN));
   	}
         int localSf503BdNbr1kSpoolRcdsCounter = -1;
         public boolean isSf503BdNbr1kSpoolRcdsModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSf503BdNbr1kSpoolRcdsCounter != sharedCounter;
            localSf503BdNbr1kSpoolRcdsCounter = sharedCounter; return hasModified; 
         }
   protected static final int SF_503_BD_NBR_1K_SPOOL_RCDS_LEN = 4;
  	/**
	 * serializeSf503BdNbr1kSpoolRcds
	 */
	protected void serializeSf503BdNbr1kSpoolRcds(long sf503BdNbr1kSpoolRcds) {
           replaceValue( //  save the value as string
                   getBinaryString( sf503BdNbr1kSpoolRcds,SF_503_BD_NBR_1K_SPOOL_RCDS_LEN)
                  ,beginSf503BdNbr1kSpoolRcds
                  ,SF_503_BD_NBR_1K_SPOOL_RCDS_LEN
                 );
            localSf503BdNbr1kSpoolRcdsCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected long checkSf503BdNbr1kSpoolRcdsMaxLimit(long number) {
        return checkMaxLimit(number, false/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshSf503BdNbr1kSpoolRcds is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshSf503BdNbr1kSpoolRcds() {	 
			return (getUnsignedInt(beginSf503BdNbr1kSpoolRcds));
   	}
         int localSf503BdNbrBytesTransCounter = -1;
         public boolean isSf503BdNbrBytesTransModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSf503BdNbrBytesTransCounter != sharedCounter;
            localSf503BdNbrBytesTransCounter = sharedCounter; return hasModified; 
         }
   protected static final int SF_503_BD_NBR_BYTES_TRANS_LEN = 4;
  	/**
	 * serializeSf503BdNbrBytesTrans
	 */
	protected void serializeSf503BdNbrBytesTrans(long sf503BdNbrBytesTrans) {
           replaceValue( //  save the value as string
                   getBinaryString( sf503BdNbrBytesTrans,SF_503_BD_NBR_BYTES_TRANS_LEN)
                  ,beginSf503BdNbrBytesTrans
                  ,SF_503_BD_NBR_BYTES_TRANS_LEN
                 );
            localSf503BdNbrBytesTransCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected long checkSf503BdNbrBytesTransMaxLimit(long number) {
        return checkMaxLimit(number, false/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshSf503BdNbrBytesTrans is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshSf503BdNbrBytesTrans() {	 
			return (getUnsignedInt(beginSf503BdNbrBytesTrans));
   	}
         int localSf503BdNbrBlocksTransCounter = -1;
         public boolean isSf503BdNbrBlocksTransModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSf503BdNbrBlocksTransCounter != sharedCounter;
            localSf503BdNbrBlocksTransCounter = sharedCounter; return hasModified; 
         }
   protected static final int SF_503_BD_NBR_BLOCKS_TRANS_LEN = 4;
  	/**
	 * serializeSf503BdNbrBlocksTrans
	 */
	protected void serializeSf503BdNbrBlocksTrans(long sf503BdNbrBlocksTrans) {
           replaceValue( //  save the value as string
                   getBinaryString( sf503BdNbrBlocksTrans,SF_503_BD_NBR_BLOCKS_TRANS_LEN)
                  ,beginSf503BdNbrBlocksTrans
                  ,SF_503_BD_NBR_BLOCKS_TRANS_LEN
                 );
            localSf503BdNbrBlocksTransCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected long checkSf503BdNbrBlocksTransMaxLimit(long number) {
        return checkMaxLimit(number, false/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshSf503BdNbrBlocksTrans is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshSf503BdNbrBlocksTrans() {	 
			return (getUnsignedInt(beginSf503BdNbrBlocksTrans));
   	}




}
  
