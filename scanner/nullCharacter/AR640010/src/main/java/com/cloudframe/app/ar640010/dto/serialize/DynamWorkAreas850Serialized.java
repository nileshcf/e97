package com.cloudframe.app.ar640010.dto.serialize;

/**
*  The class DynamWorkAreas850Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:33. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class DynamWorkAreas850Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(DynamWorkAreas850Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int DYNAM_WORK_AREAS_850_LENGTH = 318;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginDynamPointer850;
	
	/**
	* Constructor for DynamWorkAreas850Serialized
	**/
    public DynamWorkAreas850Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in DynamWorkAreas850Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(DYNAM_WORK_AREAS_850_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginDynamPointer850 = getStartOffset() + 0;	// set offset for serialization
  
  
  
  
  
	   /*  end of offset */
	}
     int localDynamPointer850Counter = -1;
     public boolean isDynamPointer850Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDynamPointer850Counter != sharedCounter;
         localDynamPointer850Counter = sharedCounter; return hasModified; 
     }
   protected static final int DYNAM_POINTER_850_LEN = 4;
  	/**
	 * serializeDynamPointer850
	 */
	protected void serializeDynamPointer850(int dynamPointer850) {
           replaceValue( //  save the value as string
                   getBinaryString( dynamPointer850,DYNAM_POINTER_850_LEN)
                  ,beginDynamPointer850
                  ,DYNAM_POINTER_850_LEN
                 );
            localDynamPointer850Counter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkDynamPointer850MaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshDynamPointer850 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshDynamPointer850() {	 
			return (getInt(beginDynamPointer850));
   	}




}
  
