package com.cloudframe.app.ip661020.dto.serialize;

/**
*  The class WorkSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:07. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class WorkSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(WorkSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WORK_LENGTH = 0;
   /*  offset of each of Child Fields when serialized as a String */
	
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
  
  
  
	   /*  end of offset */
	}
     int localIsInputFileOpen100Counter = -1;
     public boolean isIsInputFileOpen100Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIsInputFileOpen100Counter != sharedCounter;
         localIsInputFileOpen100Counter = sharedCounter; return hasModified;
     }

   protected char[] checkIsInputFileOpen100Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
     int localTerminatingMessage600Counter = -1;
     public boolean isTerminatingMessage600Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTerminatingMessage600Counter != sharedCounter;
         localTerminatingMessage600Counter = sharedCounter; return hasModified;
     }

   protected char[] checkTerminatingMessage600Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
         int localAbendCode900Counter = -1;
         public boolean isAbendCode900Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localAbendCode900Counter != sharedCounter;
            localAbendCode900Counter = sharedCounter; return hasModified; 
         }
       
      
   protected short checkAbendCode900MaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }




}
  
