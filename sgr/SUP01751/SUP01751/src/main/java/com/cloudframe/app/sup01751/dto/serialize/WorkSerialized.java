package com.cloudframe.app.sup01751.dto.serialize;

/**
*  The class WorkSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:36. using version 5.0.0.254
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
         int localRowCountCounter = -1;
         public boolean isRowCountModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localRowCountCounter != sharedCounter;
            localRowCountCounter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkRowCountMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     int localDb2DateCurrBusCounter = -1;
     public boolean isDb2DateCurrBusModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDb2DateCurrBusCounter != sharedCounter;
         localDb2DateCurrBusCounter = sharedCounter; return hasModified;
     }

   protected char[] checkDb2DateCurrBusConstraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
     int localCdeTranStaInPrgCounter = -1;
     public boolean isCdeTranStaInPrgModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCdeTranStaInPrgCounter != sharedCounter;
         localCdeTranStaInPrgCounter = sharedCounter; return hasModified;
     }

   protected char[] checkCdeTranStaInPrgConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
     int localCdeTranTypDepCounter = -1;
     public boolean isCdeTranTypDepModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCdeTranTypDepCounter != sharedCounter;
         localCdeTranTypDepCounter = sharedCounter; return hasModified;
     }

   protected char[] checkCdeTranTypDepConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
     int localCdeStaPkgReadyCounter = -1;
     public boolean isCdeStaPkgReadyModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCdeStaPkgReadyCounter != sharedCounter;
         localCdeStaPkgReadyCounter = sharedCounter; return hasModified;
     }

   protected char[] checkCdeStaPkgReadyConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }




}
  
