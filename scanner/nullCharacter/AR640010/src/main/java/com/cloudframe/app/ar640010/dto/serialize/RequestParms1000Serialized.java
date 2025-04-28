package com.cloudframe.app.ar640010.dto.serialize;

/**
*  The class RequestParms1000Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:11. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class RequestParms1000Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(RequestParms1000Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int REQUEST_PARMS_1000_LENGTH = 332;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginFunctionRequest1000;
            protected  int beginBulkId1000;
            protected  int beginEndptId1000;
            protected  int beginDeleteInd1000;
            protected  int beginCyclNum1000;
            protected  int beginListBroadcastDd1000;
            protected  int beginBroadcastResult1000;
            protected  int beginRecCount1000;
            protected  int beginByteCount1000;
            protected  int beginRecCountLarge1000;
            protected  int beginByteCountLarge1000;
            protected  int beginTknname1000;
	
	/**
	* Constructor for RequestParms1000Serialized
	**/
    public RequestParms1000Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in RequestParms1000Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(REQUEST_PARMS_1000_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginFunctionRequest1000 = getStartOffset() + 0;	// set offset for serialization
  
             beginBulkId1000 = getStartOffset() + 1;	// set offset for serialization
  
             beginEndptId1000 = getStartOffset() + 5;	// set offset for serialization
  
             beginDeleteInd1000 = getStartOffset() + 12;	// set offset for serialization
  
             beginCyclNum1000 = getStartOffset() + 13;	// set offset for serialization
  
  
             beginListBroadcastDd1000 = getStartOffset() + 16;	// set offset for serialization
  
  
  
  
             beginBroadcastResult1000 = getStartOffset() + 112;	// set offset for serialization
  
  
             beginRecCount1000 = getStartOffset() + 130;	// set offset for serialization
  
             beginByteCount1000 = getStartOffset() + 134;	// set offset for serialization
  
  
             beginRecCountLarge1000 = getStartOffset() + 192;	// set offset for serialization
  
             beginByteCountLarge1000 = getStartOffset() + 196;	// set offset for serialization
  
             beginTknname1000 = getStartOffset() + 204;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localFunctionRequest1000Counter = -1;
     public boolean isFunctionRequest1000Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFunctionRequest1000Counter != sharedCounter;
         localFunctionRequest1000Counter = sharedCounter; return hasModified;
     }
	protected static final int FUNCTION_REQUEST_1000_LEN = 1;
	/**
	 * 	serialize this FunctionRequest1000
	 */
   protected void serializeFunctionRequest1000(char[] functionRequest1000) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(functionRequest1000,0,getStringValue(),beginFunctionRequest1000,FUNCTION_REQUEST_1000_LEN);
       localFunctionRequest1000Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkFunctionRequest1000Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshFunctionRequest1000 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshFunctionRequest1000() {	 
   		return (substring(getStringValue(),beginFunctionRequest1000,beginFunctionRequest1000 + FUNCTION_REQUEST_1000_LEN));
   	}
     int localBulkId1000Counter = -1;
     public boolean isBulkId1000Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBulkId1000Counter != sharedCounter;
         localBulkId1000Counter = sharedCounter; return hasModified;
     }
	protected static final int BULK_ID_1000_LEN = 4;
	/**
	 * 	serialize this BulkId1000
	 */
   protected void serializeBulkId1000(char[] bulkId1000) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bulkId1000,0,getStringValue(),beginBulkId1000,BULK_ID_1000_LEN);
       localBulkId1000Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBulkId1000Constraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshBulkId1000 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBulkId1000() {	 
   		return (substring(getStringValue(),beginBulkId1000,beginBulkId1000 + BULK_ID_1000_LEN));
   	}
     int localEndptId1000Counter = -1;
     public boolean isEndptId1000Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localEndptId1000Counter != sharedCounter;
         localEndptId1000Counter = sharedCounter; return hasModified;
     }
	protected static final int ENDPT_ID_1000_LEN = 7;
	/**
	 * 	serialize this EndptId1000
	 */
   protected void serializeEndptId1000(char[] endptId1000) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(endptId1000,0,getStringValue(),beginEndptId1000,ENDPT_ID_1000_LEN);
       localEndptId1000Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkEndptId1000Constraints(char[] value) {
   			return super.checkConstraints(value , 7 ,false, false);
   }
    /**
	 *	refreshEndptId1000 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshEndptId1000() {	 
   		return (substring(getStringValue(),beginEndptId1000,beginEndptId1000 + ENDPT_ID_1000_LEN));
   	}
     int localDeleteInd1000Counter = -1;
     public boolean isDeleteInd1000Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDeleteInd1000Counter != sharedCounter;
         localDeleteInd1000Counter = sharedCounter; return hasModified;
     }
	protected static final int DELETE_IND_1000_LEN = 1;
	/**
	 * 	serialize this DeleteInd1000
	 */
   protected void serializeDeleteInd1000(char[] deleteInd1000) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(deleteInd1000,0,getStringValue(),beginDeleteInd1000,DELETE_IND_1000_LEN);
       localDeleteInd1000Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDeleteInd1000Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshDeleteInd1000 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDeleteInd1000() {	 
   		return (substring(getStringValue(),beginDeleteInd1000,beginDeleteInd1000 + DELETE_IND_1000_LEN));
   	}
     int localCyclNum1000Counter = -1;
     public boolean isCyclNum1000Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCyclNum1000Counter != sharedCounter;
         localCyclNum1000Counter = sharedCounter; return hasModified;
     }
	protected static final int CYCL_NUM_1000_LEN = 3;
	/**
	 * 	serialize this CyclNum1000
	 */
   protected void serializeCyclNum1000(char[] cyclNum1000) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(cyclNum1000,0,getStringValue(),beginCyclNum1000,CYCL_NUM_1000_LEN);
       localCyclNum1000Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCyclNum1000Constraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshCyclNum1000 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCyclNum1000() {	 
   		return (substring(getStringValue(),beginCyclNum1000,beginCyclNum1000 + CYCL_NUM_1000_LEN));
   	}
     int localListBroadcastDd1000Counter = -1;
     public boolean isListBroadcastDd1000Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localListBroadcastDd1000Counter != sharedCounter;
         localListBroadcastDd1000Counter = sharedCounter; return hasModified;
     }
	protected static final int LIST_BROADCAST_DD_1000_LEN = 8;
	/**
	 * 	serialize this ListBroadcastDd1000
	 */
   protected void serializeListBroadcastDd1000(char[] listBroadcastDd1000) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(listBroadcastDd1000,0,getStringValue(),beginListBroadcastDd1000,LIST_BROADCAST_DD_1000_LEN);
       localListBroadcastDd1000Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkListBroadcastDd1000Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshListBroadcastDd1000 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshListBroadcastDd1000() {	 
   		return (substring(getStringValue(),beginListBroadcastDd1000,beginListBroadcastDd1000 + LIST_BROADCAST_DD_1000_LEN));
   	}
     int localBroadcastResult1000Counter = -1;
     public boolean isBroadcastResult1000Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBroadcastResult1000Counter != sharedCounter;
         localBroadcastResult1000Counter = sharedCounter; return hasModified;
     }
	protected static final int BROADCAST_RESULT_1000_LEN = 8;
	/**
	 * 	serialize this BroadcastResult1000
	 */
   protected void serializeBroadcastResult1000(char[] broadcastResult1000) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(broadcastResult1000,0,getStringValue(),beginBroadcastResult1000,BROADCAST_RESULT_1000_LEN);
       localBroadcastResult1000Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBroadcastResult1000Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshBroadcastResult1000 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBroadcastResult1000() {	 
   		return (substring(getStringValue(),beginBroadcastResult1000,beginBroadcastResult1000 + BROADCAST_RESULT_1000_LEN));
   	}
         int localRecCount1000Counter = -1;
         public boolean isRecCount1000Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localRecCount1000Counter != sharedCounter;
            localRecCount1000Counter = sharedCounter; return hasModified; 
         }
   protected static final int REC_COUNT_1000_LEN = 4;
  	/**
	 * serializeRecCount1000
	 */
	protected void serializeRecCount1000(int recCount1000) {
           replaceValue( //  save the value as string
                   getBinaryString( recCount1000,REC_COUNT_1000_LEN)
                  ,beginRecCount1000
                  ,REC_COUNT_1000_LEN
                 );
            localRecCount1000Counter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkRecCount1000MaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshRecCount1000 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshRecCount1000() {	 
			return (getInt(beginRecCount1000));
   	}
         int localByteCount1000Counter = -1;
         public boolean isByteCount1000Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localByteCount1000Counter != sharedCounter;
            localByteCount1000Counter = sharedCounter; return hasModified; 
         }
   protected static final int BYTE_COUNT_1000_LEN = 4;
  	/**
	 * serializeByteCount1000
	 */
	protected void serializeByteCount1000(int byteCount1000) {
           replaceValue( //  save the value as string
                   getBinaryString( byteCount1000,BYTE_COUNT_1000_LEN)
                  ,beginByteCount1000
                  ,BYTE_COUNT_1000_LEN
                 );
            localByteCount1000Counter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkByteCount1000MaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshByteCount1000 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshByteCount1000() {	 
			return (getInt(beginByteCount1000));
   	}
         int localRecCountLarge1000Counter = -1;
         public boolean isRecCountLarge1000Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localRecCountLarge1000Counter != sharedCounter;
            localRecCountLarge1000Counter = sharedCounter; return hasModified; 
         }
   protected static final int REC_COUNT_LARGE_1000_LEN = 4;
  	/**
	 * serializeRecCountLarge1000
	 */
	protected void serializeRecCountLarge1000(int recCountLarge1000) {
           replaceValue( //  save the value as string
                   getBinaryString( recCountLarge1000,REC_COUNT_LARGE_1000_LEN)
                  ,beginRecCountLarge1000
                  ,REC_COUNT_LARGE_1000_LEN
                 );
            localRecCountLarge1000Counter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkRecCountLarge1000MaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshRecCountLarge1000 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshRecCountLarge1000() {	 
			return (getInt(beginRecCountLarge1000));
   	}
         int localByteCountLarge1000Counter = -1;
         public boolean isByteCountLarge1000Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localByteCountLarge1000Counter != sharedCounter;
            localByteCountLarge1000Counter = sharedCounter; return hasModified; 
         }
   protected static final int BYTE_COUNT_LARGE_1000_LEN = 8;
  	/**
	 * serializeByteCountLarge1000
	 */
	protected void serializeByteCountLarge1000(long byteCountLarge1000) {
           replaceValue( //  save the value as string
                   getBinaryString( byteCountLarge1000,BYTE_COUNT_LARGE_1000_LEN)
                  ,beginByteCountLarge1000
                  ,BYTE_COUNT_LARGE_1000_LEN
                 );
            localByteCountLarge1000Counter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected long checkByteCountLarge1000MaxLimit(long number) {
        return checkMaxLimit(number, true/*isSigned*/,8/*dataLen*/);
   }
     /**
	 *	refreshByteCountLarge1000 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshByteCountLarge1000() {	 
			return (getLong(beginByteCountLarge1000));
   	}
     int localTknname1000Counter = -1;
     public boolean isTknname1000Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTknname1000Counter != sharedCounter;
         localTknname1000Counter = sharedCounter; return hasModified;
     }
	protected static final int TKNNAME_1000_LEN = 128;
	/**
	 * 	serialize this Tknname1000
	 */
   protected void serializeTknname1000(char[] tknname1000) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(tknname1000,0,getStringValue(),beginTknname1000,TKNNAME_1000_LEN);
       localTknname1000Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTknname1000Constraints(char[] value) {
   			return super.checkConstraints(value , 128 ,false, false);
   }
    /**
	 *	refreshTknname1000 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTknname1000() {	 
   		return (substring(getStringValue(),beginTknname1000,beginTknname1000 + TKNNAME_1000_LEN));
   	}




}
  
