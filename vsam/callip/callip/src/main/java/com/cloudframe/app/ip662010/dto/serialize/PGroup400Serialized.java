package com.cloudframe.app.ip662010.dto.serialize;

/**
*  The class PGroup400Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:58. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class PGroup400Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(PGroup400Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int P_GROUP_400_LENGTH = 2;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginP400;
	
	/**
	* Constructor for PGroup400Serialized
	**/
    public PGroup400Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in PGroup400Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(P_GROUP_400_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginP400 = getStartOffset() + 0;	// set offset for serialization
  
  
	   /*  end of offset */
	}
         int localP400Counter = -1;
         public boolean isP400Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localP400Counter != sharedCounter;
            localP400Counter = sharedCounter; return hasModified; 
         }
   protected static final int P_400_LEN = 2;
  	/**
	 * serializeP400
	 */
	protected void serializeP400(short p400) {
           replaceValue( //  save the value as string
                   getBinaryString( p400,P_400_LEN)
                  ,beginP400
                  ,P_400_LEN
                 );
            localP400Counter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkP400MaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshP400 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshP400() {	 
			return (getShort(beginP400));
   	}




}
  
