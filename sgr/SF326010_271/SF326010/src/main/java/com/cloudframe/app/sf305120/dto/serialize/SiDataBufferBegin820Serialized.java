package com.cloudframe.app.sf305120.dto.serialize;

/**
*  The class SiDataBufferBegin820Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:29. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class SiDataBufferBegin820Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(SiDataBufferBegin820Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int SI_DATA_BUFFER_BEGIN_820_LENGTH = 8157;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginSiDataBuffer820;
	
	/**
	* Constructor for SiDataBufferBegin820Serialized
	**/
    public SiDataBufferBegin820Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for SiDataBufferBegin820Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public SiDataBufferBegin820Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this SiDataBufferBegin820Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,15); // serialize this field at offset 15 by default 
    }
    
	/**
	* sets parent for this SiDataBufferBegin820Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 15 by default
    }    
	/**
	* initializes the field in SiDataBufferBegin820Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(SI_DATA_BUFFER_BEGIN_820_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginSiDataBuffer820 = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localSiDataBuffer820Counter = -1;
     public boolean isSiDataBuffer820Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSiDataBuffer820Counter != sharedCounter;
         localSiDataBuffer820Counter = sharedCounter; return hasModified;
     }
	protected static final int SI_DATA_BUFFER_820_LEN = 8157;
	/**
	 * 	serialize this SiDataBuffer820
	 */
   protected void serializeSiDataBuffer820(char[] siDataBuffer820) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(siDataBuffer820,0,getStringValue(),beginSiDataBuffer820,SI_DATA_BUFFER_820_LEN);
       localSiDataBuffer820Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSiDataBuffer820Constraints(char[] value) {
   			return super.checkConstraints(value , 8157 ,false, false);
   }
    /**
	 *	refreshSiDataBuffer820 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSiDataBuffer820() {	 
   		return (substring(getStringValue(),beginSiDataBuffer820,beginSiDataBuffer820 + SI_DATA_BUFFER_820_LEN));
   	}




}
  
