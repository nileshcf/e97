package com.cloudframe.app.ar640010.dto.serialize;

/**
*  The class WtoInboundMsg700Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:07. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class WtoInboundMsg700Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(WtoInboundMsg700Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WTO_INBOUND_MSG_700_LENGTH = 115;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginWtoIbJobName700;
            protected  int beginWtoIbBulkId700;
            protected  int beginWtoIbCyclNum700;
            protected  int beginWtoIbEndptId700;
            protected  int beginWtoIbFileDsn700;
	
	/**
	* Constructor for WtoInboundMsg700Serialized
	**/
    public WtoInboundMsg700Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in WtoInboundMsg700Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(WTO_INBOUND_MSG_700_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginWtoIbJobName700 = getStartOffset() + 0;	// set offset for serialization
  
  
             beginWtoIbBulkId700 = getStartOffset() + 35;	// set offset for serialization
  
  
             beginWtoIbCyclNum700 = getStartOffset() + 46;	// set offset for serialization
  
  
             beginWtoIbEndptId700 = getStartOffset() + 57;	// set offset for serialization
  
  
             beginWtoIbFileDsn700 = getStartOffset() + 69;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localWtoIbJobName700Counter = -1;
     public boolean isWtoIbJobName700Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWtoIbJobName700Counter != sharedCounter;
         localWtoIbJobName700Counter = sharedCounter; return hasModified;
     }
	protected static final int WTO_IB_JOB_NAME_700_LEN = 8;
	/**
	 * 	serialize this WtoIbJobName700
	 */
   protected void serializeWtoIbJobName700(char[] wtoIbJobName700) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wtoIbJobName700,0,getStringValue(),beginWtoIbJobName700,WTO_IB_JOB_NAME_700_LEN);
       localWtoIbJobName700Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWtoIbJobName700Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshWtoIbJobName700 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWtoIbJobName700() {	 
   		return (substring(getStringValue(),beginWtoIbJobName700,beginWtoIbJobName700 + WTO_IB_JOB_NAME_700_LEN));
   	}
     int localWtoIbBulkId700Counter = -1;
     public boolean isWtoIbBulkId700Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWtoIbBulkId700Counter != sharedCounter;
         localWtoIbBulkId700Counter = sharedCounter; return hasModified;
     }
	protected static final int WTO_IB_BULK_ID_700_LEN = 4;
	/**
	 * 	serialize this WtoIbBulkId700
	 */
   protected void serializeWtoIbBulkId700(char[] wtoIbBulkId700) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wtoIbBulkId700,0,getStringValue(),beginWtoIbBulkId700,WTO_IB_BULK_ID_700_LEN);
       localWtoIbBulkId700Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWtoIbBulkId700Constraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshWtoIbBulkId700 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWtoIbBulkId700() {	 
   		return (substring(getStringValue(),beginWtoIbBulkId700,beginWtoIbBulkId700 + WTO_IB_BULK_ID_700_LEN));
   	}
     int localWtoIbCyclNum700Counter = -1;
     public boolean isWtoIbCyclNum700Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWtoIbCyclNum700Counter != sharedCounter;
         localWtoIbCyclNum700Counter = sharedCounter; return hasModified;
     }
	protected static final int WTO_IB_CYCL_NUM_700_LEN = 3;
	/**
	 * 	serialize this WtoIbCyclNum700
	 */
   protected void serializeWtoIbCyclNum700(char[] wtoIbCyclNum700) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wtoIbCyclNum700,0,getStringValue(),beginWtoIbCyclNum700,WTO_IB_CYCL_NUM_700_LEN);
       localWtoIbCyclNum700Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWtoIbCyclNum700Constraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshWtoIbCyclNum700 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWtoIbCyclNum700() {	 
   		return (substring(getStringValue(),beginWtoIbCyclNum700,beginWtoIbCyclNum700 + WTO_IB_CYCL_NUM_700_LEN));
   	}
     int localWtoIbEndptId700Counter = -1;
     public boolean isWtoIbEndptId700Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWtoIbEndptId700Counter != sharedCounter;
         localWtoIbEndptId700Counter = sharedCounter; return hasModified;
     }
	protected static final int WTO_IB_ENDPT_ID_700_LEN = 7;
	/**
	 * 	serialize this WtoIbEndptId700
	 */
   protected void serializeWtoIbEndptId700(char[] wtoIbEndptId700) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wtoIbEndptId700,0,getStringValue(),beginWtoIbEndptId700,WTO_IB_ENDPT_ID_700_LEN);
       localWtoIbEndptId700Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWtoIbEndptId700Constraints(char[] value) {
   			return super.checkConstraints(value , 7 ,false, false);
   }
    /**
	 *	refreshWtoIbEndptId700 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWtoIbEndptId700() {	 
   		return (substring(getStringValue(),beginWtoIbEndptId700,beginWtoIbEndptId700 + WTO_IB_ENDPT_ID_700_LEN));
   	}
     int localWtoIbFileDsn700Counter = -1;
     public boolean isWtoIbFileDsn700Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWtoIbFileDsn700Counter != sharedCounter;
         localWtoIbFileDsn700Counter = sharedCounter; return hasModified;
     }
	protected static final int WTO_IB_FILE_DSN_700_LEN = 44;
	/**
	 * 	serialize this WtoIbFileDsn700
	 */
   protected void serializeWtoIbFileDsn700(char[] wtoIbFileDsn700) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wtoIbFileDsn700,0,getStringValue(),beginWtoIbFileDsn700,WTO_IB_FILE_DSN_700_LEN);
       localWtoIbFileDsn700Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWtoIbFileDsn700Constraints(char[] value) {
   			return super.checkConstraints(value , 44 ,false, false);
   }
    /**
	 *	refreshWtoIbFileDsn700 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWtoIbFileDsn700() {	 
   		return (substring(getStringValue(),beginWtoIbFileDsn700,beginWtoIbFileDsn700 + WTO_IB_FILE_DSN_700_LEN));
   	}




}
  
