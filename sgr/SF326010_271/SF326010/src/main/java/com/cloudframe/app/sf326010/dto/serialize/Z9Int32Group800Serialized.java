package com.cloudframe.app.sf326010.dto.serialize;

/**
*  The class Z9Int32Group800Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:36. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Z9Int32Group800Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Z9Int32Group800Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int Z_9_INT_32_GROUP_800_LENGTH = 4;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginZ9Int32800;
	
	/**
	* Constructor for Z9Int32Group800Serialized
	**/
    public Z9Int32Group800Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in Z9Int32Group800Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(Z_9_INT_32_GROUP_800_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginZ9Int32800 = getStartOffset() + 0;	// set offset for serialization
  
  
	   /*  end of offset */
	}
         int localZ9Int32800Counter = -1;
         public boolean isZ9Int32800Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localZ9Int32800Counter != sharedCounter;
            localZ9Int32800Counter = sharedCounter; return hasModified; 
         }
   protected static final int Z_9_INT_32800_LEN = 4;
  	/**
	 * serializeZ9Int32800
	 */
	protected void serializeZ9Int32800(int z9Int32800) {
           replaceValue( //  save the value as string
                   getBinaryString( z9Int32800,Z_9_INT_32800_LEN)
                  ,beginZ9Int32800
                  ,Z_9_INT_32800_LEN
                 );
            localZ9Int32800Counter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkZ9Int32800MaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshZ9Int32800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshZ9Int32800() {	 
			return (getInt(beginZ9Int32800));
   	}




}
  
