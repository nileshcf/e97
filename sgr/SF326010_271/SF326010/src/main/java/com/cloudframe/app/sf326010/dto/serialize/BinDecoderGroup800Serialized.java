package com.cloudframe.app.sf326010.dto.serialize;

/**
*  The class BinDecoderGroup800Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:05. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class BinDecoderGroup800Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(BinDecoderGroup800Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int BIN_DECODER_GROUP_800_LENGTH = 2;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginBinDecoder800;
	
	/**
	* Constructor for BinDecoderGroup800Serialized
	**/
    public BinDecoderGroup800Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in BinDecoderGroup800Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(BIN_DECODER_GROUP_800_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginBinDecoder800 = getStartOffset() + 0;	// set offset for serialization
  
  
	   /*  end of offset */
	}
         int localBinDecoder800Counter = -1;
         public boolean isBinDecoder800Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localBinDecoder800Counter != sharedCounter;
            localBinDecoder800Counter = sharedCounter; return hasModified; 
         }
   protected static final int BIN_DECODER_800_LEN = 2;
  	/**
	 * serializeBinDecoder800
	 */
	protected void serializeBinDecoder800(short binDecoder800) {
           replaceValue( //  save the value as string
                   getBinaryString( binDecoder800,BIN_DECODER_800_LEN)
                  ,beginBinDecoder800
                  ,BIN_DECODER_800_LEN
                 );
            localBinDecoder800Counter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkBinDecoder800MaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshBinDecoder800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshBinDecoder800() {	 
			return (getShort(beginBinDecoder800));
   	}




}
  
