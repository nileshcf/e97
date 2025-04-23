package com.cloudframe.app.xmlpars2.dto.serialize;

/**
*  The class WorkSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:08. using version 5.0.0.254
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
     int localElemNmCounter = -1;
     public boolean isElemNmModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localElemNmCounter != sharedCounter;
         localElemNmCounter = sharedCounter; return hasModified;
     }

   protected char[] checkElemNmConstraints(char[] value) {
   			return super.checkConstraints(value , 20 ,false, false);
   }
     int localAttrNmCounter = -1;
     public boolean isAttrNmModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localAttrNmCounter != sharedCounter;
         localAttrNmCounter = sharedCounter; return hasModified;
     }

   protected char[] checkAttrNmConstraints(char[] value) {
   			return super.checkConstraints(value , 20 ,false, false);
   }
         int localElemLenCounter = -1;
         public boolean isElemLenModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localElemLenCounter != sharedCounter;
            localElemLenCounter = sharedCounter; return hasModified; 
         }
       
      
   protected short checkElemLenMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
         int localAttrLenCounter = -1;
         public boolean isAttrLenModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localAttrLenCounter != sharedCounter;
            localAttrLenCounter = sharedCounter; return hasModified; 
         }
       
      
   protected short checkAttrLenMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
         int localICounter = -1;
         public boolean isIModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localICounter != sharedCounter;
            localICounter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkIMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     int localVXmlCounter = -1;
     public boolean isVXmlModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localVXmlCounter != sharedCounter;
         localVXmlCounter = sharedCounter; return hasModified;
     }

   protected char[] checkVXmlConstraints(char[] value) {
   			return super.checkConstraints(value , 478 ,false, false);
   }




}
  
