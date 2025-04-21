package com.cloudframe.app.sf305120.dto.serialize;

/**
*  The class Z9Int16Group800Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:05. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Z9Int16Group800Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Z9Int16Group800Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int Z_9_INT_16_GROUP_800_LENGTH = 2;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginZ9Int16800;
	
	/**
	* Constructor for Z9Int16Group800Serialized
	**/
    public Z9Int16Group800Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in Z9Int16Group800Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(Z_9_INT_16_GROUP_800_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginZ9Int16800 = getStartOffset() + 0;	// set offset for serialization
  
  
	   /*  end of offset */
	}
         int localZ9Int16800Counter = -1;
         public boolean isZ9Int16800Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localZ9Int16800Counter != sharedCounter;
            localZ9Int16800Counter = sharedCounter; return hasModified; 
         }
   protected static final int Z_9_INT_16800_LEN = 2;
  	/**
	 * serializeZ9Int16800
	 */
	protected void serializeZ9Int16800(short z9Int16800) {
           replaceValue( //  save the value as string
                   getBinaryString( z9Int16800,Z_9_INT_16800_LEN)
                  ,beginZ9Int16800
                  ,Z_9_INT_16800_LEN
                 );
            localZ9Int16800Counter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkZ9Int16800MaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshZ9Int16800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshZ9Int16800() {	 
			return (getShort(beginZ9Int16800));
   	}




}
  
