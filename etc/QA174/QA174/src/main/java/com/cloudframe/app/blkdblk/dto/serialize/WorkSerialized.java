package com.cloudframe.app.blkdblk.dto.serialize;

/**
*  The class WorkSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:38. using version 5.0.0.254
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
     int localUmodeBufferCounter = -1;
     public boolean isUmodeBufferModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localUmodeBufferCounter != sharedCounter;
         localUmodeBufferCounter = sharedCounter; return hasModified;
     }

   protected char[] checkUmodeBufferConstraints(char[] value) {
   			return super.checkConstraints(value , 40000 ,false, false);
   }
         int localUmodePosCounter = -1;
         public boolean isUmodePosModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localUmodePosCounter != sharedCounter;
            localUmodePosCounter = sharedCounter; return hasModified; 
         }
       
      
   protected long checkUmodePosMaxLimit(long number) {
        return checkMaxLimit(number, false/*isSigned*/,4/*dataLen*/);
   }
         int localUmodeLenCounter = -1;
         public boolean isUmodeLenModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localUmodeLenCounter != sharedCounter;
            localUmodeLenCounter = sharedCounter; return hasModified; 
         }
       
      
   protected long checkUmodeLenMaxLimit(long number) {
        return checkMaxLimit(number, false/*isSigned*/,4/*dataLen*/);
   }
         int localUmodeCntCounter = -1;
         public boolean isUmodeCntModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localUmodeCntCounter != sharedCounter;
            localUmodeCntCounter = sharedCounter; return hasModified; 
         }
       
      
   protected long checkUmodeCntMaxLimit(long number) {
        return checkMaxLimit(number, false/*isSigned*/,4/*dataLen*/);
   }
         int localVbsCntCounter = -1;
         public boolean isVbsCntModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localVbsCntCounter != sharedCounter;
            localVbsCntCounter = sharedCounter; return hasModified; 
         }
       
      
   protected long checkVbsCntMaxLimit(long number) {
        return checkMaxLimit(number, false/*isSigned*/,4/*dataLen*/);
   }
         int localUmodeMessageLenCounter = -1;
         public boolean isUmodeMessageLenModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localUmodeMessageLenCounter != sharedCounter;
            localUmodeMessageLenCounter = sharedCounter; return hasModified; 
         }
       
      
   protected long checkUmodeMessageLenMaxLimit(long number) {
        return checkMaxLimit(number, false/*isSigned*/,4/*dataLen*/);
   }
     int localUmodeFileStatusCounter = -1;
     public boolean isUmodeFileStatusModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localUmodeFileStatusCounter != sharedCounter;
         localUmodeFileStatusCounter = sharedCounter; return hasModified;
     }

   protected char[] checkUmodeFileStatusConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
     int localVbsFileStatusCounter = -1;
     public boolean isVbsFileStatusModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localVbsFileStatusCounter != sharedCounter;
         localVbsFileStatusCounter = sharedCounter; return hasModified;
     }

   protected char[] checkVbsFileStatusConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
         int localIp66102IpmMsgLngthCounter = -1;
         public boolean isIp66102IpmMsgLngthModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp66102IpmMsgLngthCounter != sharedCounter;
            localIp66102IpmMsgLngthCounter = sharedCounter; return hasModified; 
         }
       
      
   protected long checkIp66102IpmMsgLngthMaxLimit(long number) {
        return checkMaxLimit(number, false/*isSigned*/,4/*dataLen*/);
   }
         int localICounter = -1;
         public boolean isIModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localICounter != sharedCounter;
            localICounter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkIMaxLimit(long number) {
	   return (int)checkMaxLimit(number, false/*isSigned*/,2/*dataLen*/);
   }




}
  
