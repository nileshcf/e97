package com.cloudframe.app.ar640010.dto.serialize;

/**
*  The class BulkMsg601Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:19. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class BulkMsg601Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(BulkMsg601Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int BULK_MSG_601_LENGTH = 75;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginBulkId601;
            protected  int beginBulkTtlNam601;
	
	/**
	* Constructor for BulkMsg601Serialized
	**/
    public BulkMsg601Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in BulkMsg601Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(BULK_MSG_601_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
             beginBulkId601 = getStartOffset() + 18;	// set offset for serialization
  
  
             beginBulkTtlNam601 = getStartOffset() + 25;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localBulkId601Counter = -1;
     public boolean isBulkId601Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBulkId601Counter != sharedCounter;
         localBulkId601Counter = sharedCounter; return hasModified;
     }
	protected static final int BULK_ID_601_LEN = 4;
	/**
	 * 	serialize this BulkId601
	 */
   protected void serializeBulkId601(char[] bulkId601) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bulkId601,0,getStringValue(),beginBulkId601,BULK_ID_601_LEN);
       localBulkId601Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBulkId601Constraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshBulkId601 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBulkId601() {	 
   		return (substring(getStringValue(),beginBulkId601,beginBulkId601 + BULK_ID_601_LEN));
   	}
     int localBulkTtlNam601Counter = -1;
     public boolean isBulkTtlNam601Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBulkTtlNam601Counter != sharedCounter;
         localBulkTtlNam601Counter = sharedCounter; return hasModified;
     }
	protected static final int BULK_TTL_NAM_601_LEN = 50;
	/**
	 * 	serialize this BulkTtlNam601
	 */
   protected void serializeBulkTtlNam601(char[] bulkTtlNam601) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bulkTtlNam601,0,getStringValue(),beginBulkTtlNam601,BULK_TTL_NAM_601_LEN);
       localBulkTtlNam601Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBulkTtlNam601Constraints(char[] value) {
   			return super.checkConstraints(value , 50 ,false, false);
   }
    /**
	 *	refreshBulkTtlNam601 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBulkTtlNam601() {	 
   		return (substring(getStringValue(),beginBulkTtlNam601,beginBulkTtlNam601 + BULK_TTL_NAM_601_LEN));
   	}




}
  
