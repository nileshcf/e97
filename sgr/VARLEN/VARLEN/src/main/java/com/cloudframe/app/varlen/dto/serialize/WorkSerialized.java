package com.cloudframe.app.varlen.dto.serialize;

/**
*  The class WorkSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:26. using version 5.0.0.257
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class WorkSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(WorkSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WORK_LENGTH = 11400;
   /*  offset of each of Child Fields when serialized as a String */
           protected int beginRevo3SvcProdArrayOut;
           protected static final int REVO_3_SVC_PROD_ARRAY_OUT_SIZE = 200;
	
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
  
  
	        beginRevo3SvcProdArrayOut = getStartOffset() + 0; // set offset for serialization
  
  
	   /*  end of offset */
	}
         int localActiveSvcProdCntCounter = -1;
         public boolean isActiveSvcProdCntModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localActiveSvcProdCntCounter != sharedCounter;
            localActiveSvcProdCntCounter = sharedCounter; return hasModified; 
         }
       
      
   protected short checkActiveSvcProdCntMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
         int localDisplayLenCounter = -1;
         public boolean isDisplayLenModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localDisplayLenCounter != sharedCounter;
            localDisplayLenCounter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkDisplayLenMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
 
   
  protected  static final int REVO_3_SVC_PROD_ARRAY_OUT_LEN = 57;
   /**
	 *	serializeRevo3SvcProdArrayOut as String
	 *  @param index
	 *	@param value
	 */
   protected void serializeRevo3SvcProdArrayOut(int index, char[] value) {
   	  replaceValue( 
   	          value
   	          ,(beginRevo3SvcProdArrayOut + index*REVO_3_SVC_PROD_ARRAY_OUT_LEN)
   	          , REVO_3_SVC_PROD_ARRAY_OUT_LEN 
   	          );
   }
         int localActiveFeatCntCounter = -1;
         public boolean isActiveFeatCntModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localActiveFeatCntCounter != sharedCounter;
            localActiveFeatCntCounter = sharedCounter; return hasModified; 
         }
       
      
   protected short checkActiveFeatCntMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }

		public int revo3SvcProdArrayOutSize() {
			return REVO_3_SVC_PROD_ARRAY_OUT_SIZE;
		}



}
  
