package com.cloudframe.app.search0.dto.serialize;

/**
*  The class WorkSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:29. using version 5.0.0.257
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
     int localSearchCounter = -1;
     public boolean isSearchModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSearchCounter != sharedCounter;
         localSearchCounter = sharedCounter; return hasModified;
     }

   protected char[] checkSearchConstraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
         int localTb05323FinEvntNoCounter = -1;
         public boolean isTb05323FinEvntNoModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTb05323FinEvntNoCounter != sharedCounter;
            localTb05323FinEvntNoCounter = sharedCounter; return hasModified; 
         }
       
      
   protected long checkTb05323FinEvntNoMaxLimit(long number) {
        return checkMaxLimit(number, false/*isSigned*/,4/*dataLen*/);
   }
     int localTb05323FinMktIdCounter = -1;
     public boolean isTb05323FinMktIdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTb05323FinMktIdCounter != sharedCounter;
         localTb05323FinMktIdCounter = sharedCounter; return hasModified;
     }

   protected char[] checkTb05323FinMktIdConstraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
         int localFinancialCategoryCounter = -1;
         public boolean isFinancialCategoryModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localFinancialCategoryCounter != sharedCounter;
            localFinancialCategoryCounter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkFinancialCategoryMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
         int localFinShortCategoryCounter = -1;
         public boolean isFinShortCategoryModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localFinShortCategoryCounter != sharedCounter;
            localFinShortCategoryCounter = sharedCounter; return hasModified; 
         }
       
      
   protected short checkFinShortCategoryMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }




}
  
