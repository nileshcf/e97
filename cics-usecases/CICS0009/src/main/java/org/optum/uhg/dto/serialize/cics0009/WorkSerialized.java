package org.optum.uhg.dto.serialize.cics0009;

/**
*  The class WorkSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2024-11-20 at 23:15. using version 5.0.0.158
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class WorkSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(WorkSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WORK_LENGTH = 4;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginRequestPtr;
	
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
  
  
             beginRequestPtr = getStartOffset() + 0;	// set offset for serialization
  
  
  
  
  
	   /*  end of offset */
	}
         int localCicsrespCounter = -1;
         public boolean isCicsrespModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localCicsrespCounter != sharedCounter;
            localCicsrespCounter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkCicsrespMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
         int localCicsresp2Counter = -1;
         public boolean isCicsresp2Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localCicsresp2Counter != sharedCounter;
            localCicsresp2Counter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkCicsresp2MaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     int localRequestPtrCounter = -1;
     public boolean isRequestPtrModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRequestPtrCounter != sharedCounter;
         localRequestPtrCounter = sharedCounter; return hasModified; 
     }
   protected static final int REQUEST_PTR_LEN = 4;
  	/**
	 * serializeRequestPtr
	 */
	protected void serializeRequestPtr(int requestPtr) {
           replaceValue( //  save the value as string
                   getBinaryString( requestPtr,REQUEST_PTR_LEN)
                  ,beginRequestPtr
                  ,REQUEST_PTR_LEN
                 );
            localRequestPtrCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkRequestPtrMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshRequestPtr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshRequestPtr() {	 
			return (getInt(beginRequestPtr));
   	}
     int localRequestData002Counter = -1;
     public boolean isRequestData002Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRequestData002Counter != sharedCounter;
         localRequestData002Counter = sharedCounter; return hasModified;
     }

   protected char[] checkRequestData002Constraints(char[] value) {
   			return super.checkConstraints(value , 100 ,false, false);
   }
     int localContainerNameCounter = -1;
     public boolean isContainerNameModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localContainerNameCounter != sharedCounter;
         localContainerNameCounter = sharedCounter; return hasModified;
     }

   protected char[] checkContainerNameConstraints(char[] value) {
   			return super.checkConstraints(value , 16 ,false, false);
   }
     int localChannelNameCounter = -1;
     public boolean isChannelNameModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localChannelNameCounter != sharedCounter;
         localChannelNameCounter = sharedCounter; return hasModified;
     }

   protected char[] checkChannelNameConstraints(char[] value) {
   			return super.checkConstraints(value , 16 ,false, false);
   }
         int localContainerLengthCounter = -1;
         public boolean isContainerLengthModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localContainerLengthCounter != sharedCounter;
            localContainerLengthCounter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkContainerLengthMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }




}
  
