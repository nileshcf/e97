package com.cloudframe.app.iovb32k.dto.serialize;

/**
*  The class LsParmSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:37. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class LsParmSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(LsParmSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int LS_PARM_LENGTH = 15;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginLsParmLen;
	
	/**
	* Constructor for LsParmSerialized
	**/
    public LsParmSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in LsParmSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(LS_PARM_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginLsParmLen = getStartOffset() + 0;	// set offset for serialization
  
  
	   /*  end of offset */
	}
         int localLsParmLenCounter = -1;
         public boolean isLsParmLenModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localLsParmLenCounter != sharedCounter;
            localLsParmLenCounter = sharedCounter; return hasModified; 
         }
   protected static final int LS_PARM_LEN_LEN = 2;
  	/**
	 * serializeLsParmLen
	 */
	protected void serializeLsParmLen(short lsParmLen) {
           replaceValue( //  save the value as string
                   getBinaryString( lsParmLen,LS_PARM_LEN_LEN)
                  ,beginLsParmLen
                  ,LS_PARM_LEN_LEN
                 );
            localLsParmLenCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkLsParmLenMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshLsParmLen is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshLsParmLen() {	 
			return (getShort(beginLsParmLen));
   	}




}
  
