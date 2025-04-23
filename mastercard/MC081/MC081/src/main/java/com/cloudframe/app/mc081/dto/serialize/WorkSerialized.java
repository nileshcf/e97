package com.cloudframe.app.mc081.dto.serialize;

/**
*  The class WorkSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:23. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class WorkSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(WorkSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WORK_LENGTH = 32752;
   /*  offset of each of Child Fields when serialized as a String */
           protected int beginVbsRecordArray1;
           protected static final int VBS_RECORD_ARRAY_1_SIZE = 32752;
	
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
  
  
	        beginVbsRecordArray1 = getStartOffset() + 0; // set offset for serialization
  
  
	   /*  end of offset */
	}
     int localFbBigRecCounter = -1;
     public boolean isFbBigRecModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFbBigRecCounter != sharedCounter;
         localFbBigRecCounter = sharedCounter; return hasModified;
     }

   protected char[] checkFbBigRecConstraints(char[] value) {
   			return super.checkConstraints(value , 134 ,false, false);
   }
         int localVbsRecordLenCounter = -1;
         public boolean isVbsRecordLenModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localVbsRecordLenCounter != sharedCounter;
            localVbsRecordLenCounter = sharedCounter; return hasModified; 
         }
       
      
   protected short checkVbsRecordLenMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
 
   
  protected  static final int VBS_RECORD_ARRAY_1_LEN = 1;
   /**
	 *	serializeVbsRecordArray1 as String
	 *  @param index
	 *	@param value
	 */
   protected void serializeVbsRecordArray1(int index, char[] value) {
   	  replaceValue( 
   	          value
   	          ,(beginVbsRecordArray1 + index*VBS_RECORD_ARRAY_1_LEN)
   	          , VBS_RECORD_ARRAY_1_LEN 
   	          );
   }
     int localFbFileStatusCounter = -1;
     public boolean isFbFileStatusModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFbFileStatusCounter != sharedCounter;
         localFbFileStatusCounter = sharedCounter; return hasModified;
     }

   protected char[] checkFbFileStatusConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }

		public int vbsRecordArray1Size() {
			return VBS_RECORD_ARRAY_1_SIZE;
		}



}
  
