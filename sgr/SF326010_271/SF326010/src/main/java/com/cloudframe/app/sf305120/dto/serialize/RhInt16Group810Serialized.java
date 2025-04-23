package com.cloudframe.app.sf305120.dto.serialize;

/**
*  The class RhInt16Group810Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:25. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class RhInt16Group810Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(RhInt16Group810Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int RH_INT_16_GROUP_810_LENGTH = 2;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginRhInt16810;
	
	/**
	* Constructor for RhInt16Group810Serialized
	**/
    public RhInt16Group810Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in RhInt16Group810Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(RH_INT_16_GROUP_810_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginRhInt16810 = getStartOffset() + 0;	// set offset for serialization
  
  
	   /*  end of offset */
	}
         int localRhInt16810Counter = -1;
         public boolean isRhInt16810Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localRhInt16810Counter != sharedCounter;
            localRhInt16810Counter = sharedCounter; return hasModified; 
         }
   protected static final int RH_INT_16810_LEN = 2;
  	/**
	 * serializeRhInt16810
	 */
	protected void serializeRhInt16810(short rhInt16810) {
           replaceValue( //  save the value as string
                   getBinaryString( rhInt16810,RH_INT_16810_LEN)
                  ,beginRhInt16810
                  ,RH_INT_16810_LEN
                 );
            localRhInt16810Counter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkRhInt16810MaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshRhInt16810 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshRhInt16810() {	 
			return (getShort(beginRhInt16810));
   	}




}
  
