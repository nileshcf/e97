package com.cloudframe.app.casecb00.dto.serialize;

/**
*  The class WorkSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:10. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class WorkSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(WorkSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WORK_LENGTH = 5;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginEdit;
	
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
  
  
  
  
             beginEdit = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
         int localS1Counter = -1;
         public boolean isS1Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localS1Counter != sharedCounter;
            localS1Counter = sharedCounter; return hasModified; 
         }
       
      
   protected short checkS1MaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
         int localS2Counter = -1;
         public boolean isS2Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localS2Counter != sharedCounter;
            localS2Counter = sharedCounter; return hasModified; 
         }
       
      
   protected short checkS2MaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
         int localS3Counter = -1;
         public boolean isS3Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localS3Counter != sharedCounter;
            localS3Counter = sharedCounter; return hasModified; 
         }
       
      
   protected short checkS3MaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
         int localS4Counter = -1;
         public boolean isS4Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localS4Counter != sharedCounter;
            localS4Counter = sharedCounter; return hasModified; 
         }
       
      
   protected short checkS4MaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     int localEditCounter = -1;
     public boolean isEditModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localEditCounter != sharedCounter;
         localEditCounter = sharedCounter; return hasModified;
     }
	protected static final int EDIT_LEN = 5;
	/**
	 * 	serialize this Edit
	 */
   protected void serializeEdit(char[] edit) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(edit,0,getStringValue(),beginEdit,EDIT_LEN);
       localEditCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkEditConstraints(char[] value) {
   			return super.checkConstraints(value , 5 ,false, false);
   }
    /**
	 *	refreshEdit is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshEdit() {	 
   		return (substring(getStringValue(),beginEdit,beginEdit + EDIT_LEN));
   	}




}
  
