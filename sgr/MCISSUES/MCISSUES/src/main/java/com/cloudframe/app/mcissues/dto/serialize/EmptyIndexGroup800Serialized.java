package com.cloudframe.app.mcissues.dto.serialize;

/**
*  The class EmptyIndexGroup800Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:33. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class EmptyIndexGroup800Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(EmptyIndexGroup800Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int EMPTY_INDEX_GROUP_800_LENGTH = 4;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginEmptyIndex800;
            protected  int beginEmptyIndexVal800;
	
	/**
	* Constructor for EmptyIndexGroup800Serialized
	**/
    public EmptyIndexGroup800Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in EmptyIndexGroup800Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(EMPTY_INDEX_GROUP_800_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginEmptyIndex800 = getStartOffset() + 0;	// set offset for serialization
  
             beginEmptyIndexVal800 = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
         int localEmptyIndex800Counter = -1;
         public boolean isEmptyIndex800Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localEmptyIndex800Counter != sharedCounter;
            localEmptyIndex800Counter = sharedCounter; return hasModified; 
         }
   protected static final int EMPTY_INDEX_800_LEN = 4;
  	/**
	 * serializeEmptyIndex800
	 */
	protected void serializeEmptyIndex800(int emptyIndex800) {
           replaceValue( //  save the value as string
                   getBinaryString( emptyIndex800,EMPTY_INDEX_800_LEN)
                  ,beginEmptyIndex800
                  ,EMPTY_INDEX_800_LEN
                 );
            localEmptyIndex800Counter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkEmptyIndex800MaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshEmptyIndex800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshEmptyIndex800() {	 
			return (getInt(beginEmptyIndex800));
   	}
         int localEmptyIndexVal800Counter = -1;
         public boolean isEmptyIndexVal800Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localEmptyIndexVal800Counter != sharedCounter;
            localEmptyIndexVal800Counter = sharedCounter; return hasModified; 
         }
   protected static final int EMPTY_INDEX_VAL_800_LEN = 4;
  	/**
	 * serializeEmptyIndexVal800
	 */
	protected void serializeEmptyIndexVal800(int emptyIndexVal800) {
           replaceValue( //  save the value as string
                   getBinaryString( emptyIndexVal800,EMPTY_INDEX_VAL_800_LEN)
                  ,beginEmptyIndexVal800
                  ,EMPTY_INDEX_VAL_800_LEN
                 );
            localEmptyIndexVal800Counter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkEmptyIndexVal800MaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshEmptyIndexVal800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshEmptyIndexVal800() {	 
			return (getInt(beginEmptyIndexVal800));
   	}




}
  
