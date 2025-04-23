package com.cloudframe.app.sf305120.dto.serialize;

/**
*  The class HalfWordGroup800Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:03. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class HalfWordGroup800Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(HalfWordGroup800Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int HALF_WORD_GROUP_800_LENGTH = 2;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginHalfWord800;
	
	/**
	* Constructor for HalfWordGroup800Serialized
	**/
    public HalfWordGroup800Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in HalfWordGroup800Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(HALF_WORD_GROUP_800_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginHalfWord800 = getStartOffset() + 0;	// set offset for serialization
  
  
	   /*  end of offset */
	}
         int localHalfWord800Counter = -1;
         public boolean isHalfWord800Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localHalfWord800Counter != sharedCounter;
            localHalfWord800Counter = sharedCounter; return hasModified; 
         }
   protected static final int HALF_WORD_800_LEN = 2;
  	/**
	 * serializeHalfWord800
	 */
	protected void serializeHalfWord800(short halfWord800) {
           replaceValue( //  save the value as string
                   getBinaryString( halfWord800,HALF_WORD_800_LEN)
                  ,beginHalfWord800
                  ,HALF_WORD_800_LEN
                 );
            localHalfWord800Counter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkHalfWord800MaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshHalfWord800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshHalfWord800() {	 
			return (getShort(beginHalfWord800));
   	}




}
  
