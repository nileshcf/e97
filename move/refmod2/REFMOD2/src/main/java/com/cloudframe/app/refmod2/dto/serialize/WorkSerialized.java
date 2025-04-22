package com.cloudframe.app.refmod2.dto.serialize;

/**
*  The class WorkSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:12. using version 5.0.0.254
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
         int localSLen2Counter = -1;
         public boolean isSLen2Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSLen2Counter != sharedCounter;
            localSLen2Counter = sharedCounter; return hasModified; 
         }
       
      
   protected short checkSLen2MaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
         int localTLen2Counter = -1;
         public boolean isTLen2Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTLen2Counter != sharedCounter;
            localTLen2Counter = sharedCounter; return hasModified; 
         }
       
      
   protected short checkTLen2MaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     int localAS22Counter = -1;
     public boolean isAS22Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localAS22Counter != sharedCounter;
         localAS22Counter = sharedCounter; return hasModified;
     }

   protected char[] checkAS22Constraints(char[] value) {
   			return super.checkConstraints(value , 70 ,false, false);
   }
     int localBS22Counter = -1;
     public boolean isBS22Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBS22Counter != sharedCounter;
         localBS22Counter = sharedCounter; return hasModified;
     }

   protected char[] checkBS22Constraints(char[] value) {
   			return super.checkConstraints(value , 70 ,false, false);
   }
     int localAS24Counter = -1;
     public boolean isAS24Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localAS24Counter != sharedCounter;
         localAS24Counter = sharedCounter; return hasModified;
     }

   protected char[] checkAS24Constraints(char[] value) {
   			return super.checkConstraints(value , 70 ,false, false);
   }
     int localBS24Counter = -1;
     public boolean isBS24Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBS24Counter != sharedCounter;
         localBS24Counter = sharedCounter; return hasModified;
     }

   protected char[] checkBS24Constraints(char[] value) {
   			return super.checkConstraints(value , 70 ,false, false);
   }
     int localAS28Counter = -1;
     public boolean isAS28Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localAS28Counter != sharedCounter;
         localAS28Counter = sharedCounter; return hasModified;
     }

   protected char[] checkAS28Constraints(char[] value) {
   			return super.checkConstraints(value , 70 ,false, false);
   }
     int localBS28Counter = -1;
     public boolean isBS28Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBS28Counter != sharedCounter;
         localBS28Counter = sharedCounter; return hasModified;
     }

   protected char[] checkBS28Constraints(char[] value) {
   			return super.checkConstraints(value , 70 ,false, false);
   }
     int localAS212Counter = -1;
     public boolean isAS212Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localAS212Counter != sharedCounter;
         localAS212Counter = sharedCounter; return hasModified;
     }

   protected char[] checkAS212Constraints(char[] value) {
   			return super.checkConstraints(value , 70 ,false, false);
   }
     int localBS212Counter = -1;
     public boolean isBS212Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBS212Counter != sharedCounter;
         localBS212Counter = sharedCounter; return hasModified;
     }

   protected char[] checkBS212Constraints(char[] value) {
   			return super.checkConstraints(value , 70 ,false, false);
   }
     int localAS218Counter = -1;
     public boolean isAS218Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localAS218Counter != sharedCounter;
         localAS218Counter = sharedCounter; return hasModified;
     }

   protected char[] checkAS218Constraints(char[] value) {
   			return super.checkConstraints(value , 70 ,false, false);
   }
     int localBS218Counter = -1;
     public boolean isBS218Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBS218Counter != sharedCounter;
         localBS218Counter = sharedCounter; return hasModified;
     }

   protected char[] checkBS218Constraints(char[] value) {
   			return super.checkConstraints(value , 70 ,false, false);
   }
     int localAS220Counter = -1;
     public boolean isAS220Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localAS220Counter != sharedCounter;
         localAS220Counter = sharedCounter; return hasModified;
     }

   protected char[] checkAS220Constraints(char[] value) {
   			return super.checkConstraints(value , 70 ,false, false);
   }
     int localBS220Counter = -1;
     public boolean isBS220Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBS220Counter != sharedCounter;
         localBS220Counter = sharedCounter; return hasModified;
     }

   protected char[] checkBS220Constraints(char[] value) {
   			return super.checkConstraints(value , 70 ,false, false);
   }
     int localWse22aSCounter = -1;
     public boolean isWse22aSModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse22aSCounter != sharedCounter;
         localWse22aSCounter = sharedCounter; return hasModified;
     }

   protected char[] checkWse22aSConstraints(char[] value) {
   			return super.checkConstraints(value , 60 ,false, false);
   }
     int localWse22bSCounter = -1;
     public boolean isWse22bSModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse22bSCounter != sharedCounter;
         localWse22bSCounter = sharedCounter; return hasModified;
     }

   protected char[] checkWse22bSConstraints(char[] value) {
   			return super.checkConstraints(value , 60 ,false, false);
   }
     int localWse24aSCounter = -1;
     public boolean isWse24aSModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse24aSCounter != sharedCounter;
         localWse24aSCounter = sharedCounter; return hasModified;
     }

   protected char[] checkWse24aSConstraints(char[] value) {
   			return super.checkConstraints(value , 60 ,false, false);
   }
     int localWse24bSCounter = -1;
     public boolean isWse24bSModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse24bSCounter != sharedCounter;
         localWse24bSCounter = sharedCounter; return hasModified;
     }

   protected char[] checkWse24bSConstraints(char[] value) {
   			return super.checkConstraints(value , 60 ,false, false);
   }
     int localWse28aSCounter = -1;
     public boolean isWse28aSModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse28aSCounter != sharedCounter;
         localWse28aSCounter = sharedCounter; return hasModified;
     }

   protected char[] checkWse28aSConstraints(char[] value) {
   			return super.checkConstraints(value , 60 ,false, false);
   }
     int localWse28bSCounter = -1;
     public boolean isWse28bSModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse28bSCounter != sharedCounter;
         localWse28bSCounter = sharedCounter; return hasModified;
     }

   protected char[] checkWse28bSConstraints(char[] value) {
   			return super.checkConstraints(value , 60 ,false, false);
   }
     int localWse212aSCounter = -1;
     public boolean isWse212aSModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse212aSCounter != sharedCounter;
         localWse212aSCounter = sharedCounter; return hasModified;
     }

   protected char[] checkWse212aSConstraints(char[] value) {
   			return super.checkConstraints(value , 60 ,false, false);
   }
     int localWse212bSCounter = -1;
     public boolean isWse212bSModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse212bSCounter != sharedCounter;
         localWse212bSCounter = sharedCounter; return hasModified;
     }

   protected char[] checkWse212bSConstraints(char[] value) {
   			return super.checkConstraints(value , 60 ,false, false);
   }
     int localWse218aSCounter = -1;
     public boolean isWse218aSModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse218aSCounter != sharedCounter;
         localWse218aSCounter = sharedCounter; return hasModified;
     }

   protected char[] checkWse218aSConstraints(char[] value) {
   			return super.checkConstraints(value , 60 ,false, false);
   }
     int localWse218bSCounter = -1;
     public boolean isWse218bSModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse218bSCounter != sharedCounter;
         localWse218bSCounter = sharedCounter; return hasModified;
     }

   protected char[] checkWse218bSConstraints(char[] value) {
   			return super.checkConstraints(value , 60 ,false, false);
   }
     int localWse220aSCounter = -1;
     public boolean isWse220aSModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse220aSCounter != sharedCounter;
         localWse220aSCounter = sharedCounter; return hasModified;
     }

   protected char[] checkWse220aSConstraints(char[] value) {
   			return super.checkConstraints(value , 60 ,false, false);
   }
     int localWse220bSCounter = -1;
     public boolean isWse220bSModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse220bSCounter != sharedCounter;
         localWse220bSCounter = sharedCounter; return hasModified;
     }

   protected char[] checkWse220bSConstraints(char[] value) {
   			return super.checkConstraints(value , 60 ,false, false);
   }
     int localWse220cTCounter = -1;
     public boolean isWse220cTModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse220cTCounter != sharedCounter;
         localWse220cTCounter = sharedCounter; return hasModified;
     }

   protected char[] checkWse220cTConstraints(char[] value) {
   			return super.checkConstraints(value , 60 ,false, false);
   }




}
  
