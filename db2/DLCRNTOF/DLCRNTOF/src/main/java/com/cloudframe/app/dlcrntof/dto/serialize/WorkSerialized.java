package com.cloudframe.app.dlcrntof.dto.serialize;

/**
*  The class WorkSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:27. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class WorkSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(WorkSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WORK_LENGTH = 8;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginSqlcode_Ws;
            protected  int beginDispSecnt;
	
	/**
	* Constructor for WorkSerialized
	**/
    public WorkSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in WorkSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(WORK_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginSqlcode_Ws = getStartOffset() + 0;	// set offset for serialization
  
  
             beginDispSecnt = getStartOffset() + 4;	// set offset for serialization
  
  
  
  
	   /*  end of offset */
	}
     int localSqlcode_WsCounter = -1;
     public boolean isSqlcode_WsModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSqlcode_WsCounter != sharedCounter;
         localSqlcode_WsCounter = sharedCounter; return hasModified;
     }
	protected static final int SQLCODE__WS_LEN = 4;
	/**
	 * 	serialize this Sqlcode_Ws
	 */
   protected void serializeSqlcode_Ws(char[] sqlcode_Ws) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sqlcode_Ws,0,getStringValue(),beginSqlcode_Ws,SQLCODE__WS_LEN);
       localSqlcode_WsCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSqlcode_WsConstraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshSqlcode_Ws is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSqlcode_Ws() {	 
   		return (substring(getStringValue(),beginSqlcode_Ws,beginSqlcode_Ws + SQLCODE__WS_LEN));
   	}
         int localSecntCounter = -1;
         public boolean isSecntModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSecntCounter != sharedCounter;
            localSecntCounter = sharedCounter; return hasModified; 
         }
       
      
   protected short checkSecntMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     int localDispSecntCounter = -1;
     public boolean isDispSecntModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDispSecntCounter != sharedCounter;
         localDispSecntCounter = sharedCounter; return hasModified;
     }
	protected static final int DISP_SECNT_LEN = 4;
	/**
	 * 	serialize this DispSecnt
	 */
   protected void serializeDispSecnt(char[] dispSecnt) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dispSecnt,0,getStringValue(),beginDispSecnt,DISP_SECNT_LEN);
       localDispSecntCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDispSecntConstraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshDispSecnt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDispSecnt() {	 
   		return (substring(getStringValue(),beginDispSecnt,beginDispSecnt + DISP_SECNT_LEN));
   	}
         int localChkpFreqCounter = -1;
         public boolean isChkpFreqModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localChkpFreqCounter != sharedCounter;
            localChkpFreqCounter = sharedCounter; return hasModified; 
         }
       
      
   protected short checkChkpFreqMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
         int localDeleteCntCounter = -1;
         public boolean isDeleteCntModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localDeleteCntCounter != sharedCounter;
            localDeleteCntCounter = sharedCounter; return hasModified; 
         }
       
      
   protected short checkDeleteCntMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
         int localRecordsLoaded400Counter = -1;
         public boolean isRecordsLoaded400Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localRecordsLoaded400Counter != sharedCounter;
            localRecordsLoaded400Counter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkRecordsLoaded400MaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }




}
  
