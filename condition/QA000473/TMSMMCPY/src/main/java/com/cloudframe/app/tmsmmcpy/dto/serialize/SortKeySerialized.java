package com.cloudframe.app.tmsmmcpy.dto.serialize;

/**
*  The class SortKeySerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:22. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class SortKeySerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(SortKeySerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int SORT_KEY_LENGTH = 100;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginSortDdrKey;
            protected  int beginSortBatchKey;
            protected  int beginSortExtCapXptId;
            protected  int beginSortDsrvId;
            protected  int beginSortField3;
            protected  int beginSortField1;
	
	/**
	* Constructor for SortKeySerialized
	**/
    public SortKeySerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in SortKeySerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(SORT_KEY_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginSortDdrKey = getStartOffset() + 0;	// set offset for serialization
  
             beginSortBatchKey = getStartOffset() + 10;	// set offset for serialization
  
             beginSortExtCapXptId = getStartOffset() + 20;	// set offset for serialization
  
             beginSortDsrvId = getStartOffset() + 36;	// set offset for serialization
  
             beginSortField3 = getStartOffset() + 40;	// set offset for serialization
  
             beginSortField1 = getStartOffset() + 70;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localSortDdrKeyCounter = -1;
     public boolean isSortDdrKeyModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSortDdrKeyCounter != sharedCounter;
         localSortDdrKeyCounter = sharedCounter; return hasModified;
     }
	protected static final int SORT_DDR_KEY_LEN = 10;
	/**
	 * 	serialize this SortDdrKey
	 */
   protected void serializeSortDdrKey(char[] sortDdrKey) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sortDdrKey,0,getStringValue(),beginSortDdrKey,SORT_DDR_KEY_LEN);
       localSortDdrKeyCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSortDdrKeyConstraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshSortDdrKey is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSortDdrKey() {	 
   		return (substring(getStringValue(),beginSortDdrKey,beginSortDdrKey + SORT_DDR_KEY_LEN));
   	}
     int localSortBatchKeyCounter = -1;
     public boolean isSortBatchKeyModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSortBatchKeyCounter != sharedCounter;
         localSortBatchKeyCounter = sharedCounter; return hasModified;
     }
	protected static final int SORT_BATCH_KEY_LEN = 10;
	/**
	 * 	serialize this SortBatchKey
	 */
   protected void serializeSortBatchKey(char[] sortBatchKey) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sortBatchKey,0,getStringValue(),beginSortBatchKey,SORT_BATCH_KEY_LEN);
       localSortBatchKeyCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSortBatchKeyConstraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshSortBatchKey is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSortBatchKey() {	 
   		return (substring(getStringValue(),beginSortBatchKey,beginSortBatchKey + SORT_BATCH_KEY_LEN));
   	}
     int localSortExtCapXptIdCounter = -1;
     public boolean isSortExtCapXptIdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSortExtCapXptIdCounter != sharedCounter;
         localSortExtCapXptIdCounter = sharedCounter; return hasModified;
     }
	protected static final int SORT_EXT_CAP_XPT_ID_LEN = 16;
	/**
	 * 	serialize this SortExtCapXptId
	 */
   protected void serializeSortExtCapXptId(char[] sortExtCapXptId) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sortExtCapXptId,0,getStringValue(),beginSortExtCapXptId,SORT_EXT_CAP_XPT_ID_LEN);
       localSortExtCapXptIdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSortExtCapXptIdConstraints(char[] value) {
   			return super.checkConstraints(value , 16 ,false, false);
   }
    /**
	 *	refreshSortExtCapXptId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSortExtCapXptId() {	 
   		return (substring(getStringValue(),beginSortExtCapXptId,beginSortExtCapXptId + SORT_EXT_CAP_XPT_ID_LEN));
   	}
     int localSortDsrvIdCounter = -1;
     public boolean isSortDsrvIdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSortDsrvIdCounter != sharedCounter;
         localSortDsrvIdCounter = sharedCounter; return hasModified;
     }
	protected static final int SORT_DSRV_ID_LEN = 4;
	/**
	 * 	serialize this SortDsrvId
	 */
   protected void serializeSortDsrvId(char[] sortDsrvId) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sortDsrvId,0,getStringValue(),beginSortDsrvId,SORT_DSRV_ID_LEN);
       localSortDsrvIdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSortDsrvIdConstraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshSortDsrvId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSortDsrvId() {	 
   		return (substring(getStringValue(),beginSortDsrvId,beginSortDsrvId + SORT_DSRV_ID_LEN));
   	}
     int localSortField3Counter = -1;
     public boolean isSortField3Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSortField3Counter != sharedCounter;
         localSortField3Counter = sharedCounter; return hasModified;
     }
	protected static final int SORT_FIELD_3_LEN = 30;
	/**
	 * 	serialize this SortField3
	 */
   protected void serializeSortField3(char[] sortField3) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sortField3,0,getStringValue(),beginSortField3,SORT_FIELD_3_LEN);
       localSortField3Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSortField3Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
    /**
	 *	refreshSortField3 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSortField3() {	 
   		return (substring(getStringValue(),beginSortField3,beginSortField3 + SORT_FIELD_3_LEN));
   	}
     int localSortField1Counter = -1;
     public boolean isSortField1Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSortField1Counter != sharedCounter;
         localSortField1Counter = sharedCounter; return hasModified;
     }
	protected static final int SORT_FIELD_1_LEN = 30;
	/**
	 * 	serialize this SortField1
	 */
   protected void serializeSortField1(char[] sortField1) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sortField1,0,getStringValue(),beginSortField1,SORT_FIELD_1_LEN);
       localSortField1Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSortField1Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
    /**
	 *	refreshSortField1 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSortField1() {	 
   		return (substring(getStringValue(),beginSortField1,beginSortField1 + SORT_FIELD_1_LEN));
   	}




}
  
