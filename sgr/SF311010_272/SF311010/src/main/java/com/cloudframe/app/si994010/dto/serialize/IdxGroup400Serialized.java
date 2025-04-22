package com.cloudframe.app.si994010.dto.serialize;

/**
*  The class IdxGroup400Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:14. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class IdxGroup400Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(IdxGroup400Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IDX_GROUP_400_LENGTH = 2;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIdx400;
	
	/**
	* Constructor for IdxGroup400Serialized
	**/
    public IdxGroup400Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in IdxGroup400Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IDX_GROUP_400_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIdx400 = getStartOffset() + 0;	// set offset for serialization
  
  
	   /*  end of offset */
	}
         int localIdx400Counter = -1;
         public boolean isIdx400Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIdx400Counter != sharedCounter;
            localIdx400Counter = sharedCounter; return hasModified; 
         }
   protected static final int IDX_400_LEN = 2;
  	/**
	 * serializeIdx400
	 */
	protected void serializeIdx400(short idx400) {
           replaceValue( //  save the value as string
                   getBinaryString( idx400,IDX_400_LEN)
                  ,beginIdx400
                  ,IDX_400_LEN
                 );
            localIdx400Counter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIdx400MaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIdx400 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIdx400() {	 
			return (getShort(beginIdx400));
   	}




}
  
