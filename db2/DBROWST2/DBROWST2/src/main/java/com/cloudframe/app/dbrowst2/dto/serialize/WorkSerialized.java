package com.cloudframe.app.dbrowst2.dto.serialize;

/**
*  The class WorkSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:21. using version 5.0.0.257
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class WorkSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(WorkSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WORK_LENGTH = 4;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginSqlcode_Ws;
	
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
  
  
	   /*  end of offset */
	}
         int localMaxRowsCounter = -1;
         public boolean isMaxRowsModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localMaxRowsCounter != sharedCounter;
            localMaxRowsCounter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkMaxRowsMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
         int localIxCounter = -1;
         public boolean isIxModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIxCounter != sharedCounter;
            localIxCounter = sharedCounter; return hasModified; 
         }
       
      
   protected short checkIxMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
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
         int localDsnnrowsCounter = -1;
         public boolean isDsnnrowsModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localDsnnrowsCounter != sharedCounter;
            localDsnnrowsCounter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkDsnnrowsMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }




}
  
