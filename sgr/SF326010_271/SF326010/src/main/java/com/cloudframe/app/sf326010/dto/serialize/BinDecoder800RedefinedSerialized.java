package com.cloudframe.app.sf326010.dto.serialize;

/**
*  The class BinDecoder800RedefinedSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 08:03. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class BinDecoder800RedefinedSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(BinDecoder800RedefinedSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int BIN_DECODER_800_REDEFINED_LENGTH = 2;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginBinDecoderByt2800;
	
	/**
	* Constructor for BinDecoder800RedefinedSerialized
	**/
    public BinDecoder800RedefinedSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for BinDecoder800RedefinedSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public BinDecoder800RedefinedSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this BinDecoder800RedefinedSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this BinDecoder800RedefinedSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in BinDecoder800RedefinedSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(BIN_DECODER_800_REDEFINED_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginBinDecoderByt2800 = getStartOffset() + 1;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localBinDecoderByt2800Counter = -1;
     public boolean isBinDecoderByt2800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBinDecoderByt2800Counter != sharedCounter;
         localBinDecoderByt2800Counter = sharedCounter; return hasModified;
     }
	protected static final int BIN_DECODER_BYT_2800_LEN = 1;
	/**
	 * 	serialize this BinDecoderByt2800
	 */
   protected void serializeBinDecoderByt2800(char[] binDecoderByt2800) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(binDecoderByt2800,0,getStringValue(),beginBinDecoderByt2800,BIN_DECODER_BYT_2800_LEN);
       localBinDecoderByt2800Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBinDecoderByt2800Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshBinDecoderByt2800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBinDecoderByt2800() {	 
   		return (substring(getStringValue(),beginBinDecoderByt2800,beginBinDecoderByt2800 + BIN_DECODER_BYT_2800_LEN));
   	}




}
  
