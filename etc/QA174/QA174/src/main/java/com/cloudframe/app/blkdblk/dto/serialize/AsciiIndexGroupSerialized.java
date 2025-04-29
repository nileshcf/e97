package com.cloudframe.app.blkdblk.dto.serialize;

/**
*  The class AsciiIndexGroupSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:24. using version 5.0.0.257
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class AsciiIndexGroupSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(AsciiIndexGroupSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int ASCII_INDEX_GROUP_LENGTH = 2;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginAsciiIndex;
	
	/**
	* Constructor for AsciiIndexGroupSerialized
	**/
    public AsciiIndexGroupSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in AsciiIndexGroupSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(ASCII_INDEX_GROUP_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginAsciiIndex = getStartOffset() + 0;	// set offset for serialization
  
  
	   /*  end of offset */
	}
         int localAsciiIndexCounter = -1;
         public boolean isAsciiIndexModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localAsciiIndexCounter != sharedCounter;
            localAsciiIndexCounter = sharedCounter; return hasModified; 
         }
   protected static final int ASCII_INDEX_LEN = 2;
  	/**
	 * serializeAsciiIndex
	 */
	protected void serializeAsciiIndex(short asciiIndex) {
           replaceValue( //  save the value as string
                   getBinaryString( asciiIndex,ASCII_INDEX_LEN)
                  ,beginAsciiIndex
                  ,ASCII_INDEX_LEN
                 );
            localAsciiIndexCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkAsciiIndexMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshAsciiIndex is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshAsciiIndex() {	 
			return (getShort(beginAsciiIndex));
   	}




}
  
