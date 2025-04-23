package com.cloudframe.app.mcindex.dto.serialize;

/**
*  The class IndexVal800Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:23. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class IndexVal800Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(IndexVal800Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int INDEX_VAL_800_LENGTH = 4;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIndex800;
	
	/**
	* Constructor for IndexVal800Serialized
	**/
    public IndexVal800Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in IndexVal800Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(INDEX_VAL_800_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIndex800 = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
         int localIndex800Counter = -1;
         public boolean isIndex800Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIndex800Counter != sharedCounter;
            localIndex800Counter = sharedCounter; return hasModified; 
         }
   protected static final int INDEX_800_LEN = 4;
  	/**
	 * serializeIndex800
	 */
	protected void serializeIndex800(int index800) {
           replaceValue( //  save the value as string
                   getBinaryString( index800,INDEX_800_LEN)
                  ,beginIndex800
                  ,INDEX_800_LEN
                 );
            localIndex800Counter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkIndex800MaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshIndex800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshIndex800() {	 
			return (getInt(beginIndex800));
   	}




}
  
