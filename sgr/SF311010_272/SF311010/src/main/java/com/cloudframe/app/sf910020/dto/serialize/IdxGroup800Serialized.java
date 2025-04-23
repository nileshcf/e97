package com.cloudframe.app.sf910020.dto.serialize;

/**
*  The class IdxGroup800Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:05. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class IdxGroup800Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(IdxGroup800Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IDX_GROUP_800_LENGTH = 2;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIdx800;
	
	/**
	* Constructor for IdxGroup800Serialized
	**/
    public IdxGroup800Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in IdxGroup800Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IDX_GROUP_800_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIdx800 = getStartOffset() + 0;	// set offset for serialization
  
  
	   /*  end of offset */
	}
         int localIdx800Counter = -1;
         public boolean isIdx800Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIdx800Counter != sharedCounter;
            localIdx800Counter = sharedCounter; return hasModified; 
         }
   protected static final int IDX_800_LEN = 2;
  	/**
	 * serializeIdx800
	 */
	protected void serializeIdx800(short idx800) {
           replaceValue( //  save the value as string
                   getBinaryString( idx800,IDX_800_LEN)
                  ,beginIdx800
                  ,IDX_800_LEN
                 );
            localIdx800Counter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIdx800MaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIdx800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIdx800() {	 
			return (getShort(beginIdx800));
   	}




}
  
