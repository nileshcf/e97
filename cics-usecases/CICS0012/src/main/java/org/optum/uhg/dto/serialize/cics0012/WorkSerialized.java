package org.optum.uhg.dto.serialize.cics0012;

/**
*  The class WorkSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2024-11-20 at 23:12. using version 5.0.0.158
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
         int localICounter = -1;
         public boolean isIModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localICounter != sharedCounter;
            localICounter = sharedCounter; return hasModified; 
         }
       
      
   protected short checkIMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     int localEofSwCounter = -1;
     public boolean isEofSwModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localEofSwCounter != sharedCounter;
         localEofSwCounter = sharedCounter; return hasModified;
     }

   protected char[] checkEofSwConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
         int localKeylenCounter = -1;
         public boolean isKeylenModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localKeylenCounter != sharedCounter;
            localKeylenCounter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkKeylenMaxLimit(long number) {
	   return (int)checkMaxLimit(number, false/*isSigned*/,2/*dataLen*/);
   }
     int localVssecu00Counter = -1;
     public boolean isVssecu00Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localVssecu00Counter != sharedCounter;
         localVssecu00Counter = sharedCounter; return hasModified;
     }

   protected char[] checkVssecu00Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
     int localVssecu01Counter = -1;
     public boolean isVssecu01Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localVssecu01Counter != sharedCounter;
         localVssecu01Counter = sharedCounter; return hasModified;
     }

   protected char[] checkVssecu01Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
     int localVssecu02Counter = -1;
     public boolean isVssecu02Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localVssecu02Counter != sharedCounter;
         localVssecu02Counter = sharedCounter; return hasModified;
     }

   protected char[] checkVssecu02Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
     int localVssecu03Counter = -1;
     public boolean isVssecu03Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localVssecu03Counter != sharedCounter;
         localVssecu03Counter = sharedCounter; return hasModified;
     }

   protected char[] checkVssecu03Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
     int localVssecu04Counter = -1;
     public boolean isVssecu04Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localVssecu04Counter != sharedCounter;
         localVssecu04Counter = sharedCounter; return hasModified;
     }

   protected char[] checkVssecu04Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }




}
  
