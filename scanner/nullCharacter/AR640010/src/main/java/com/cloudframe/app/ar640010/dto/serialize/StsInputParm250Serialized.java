package com.cloudframe.app.ar640010.dto.serialize;

/**
*  The class StsInputParm250Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:28. using version 5.0.0.257
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class StsInputParm250Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(StsInputParm250Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int STS_INPUT_PARM_250_LENGTH = 4;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginStsRefId250;
	
	/**
	* Constructor for StsInputParm250Serialized
	**/
    public StsInputParm250Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for StsInputParm250Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public StsInputParm250Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this StsInputParm250Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this StsInputParm250Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in StsInputParm250Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(STS_INPUT_PARM_250_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginStsRefId250 = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localStsRefId250Counter = -1;
     public boolean isStsRefId250Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localStsRefId250Counter != sharedCounter;
         localStsRefId250Counter = sharedCounter; return hasModified;
     }
	protected static final int STS_REF_ID_250_LEN = 4;
	/**
	 * 	serialize this StsRefId250
	 */
   protected void serializeStsRefId250(char[] stsRefId250) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(stsRefId250,0,getStringValue(),beginStsRefId250,STS_REF_ID_250_LEN);
       localStsRefId250Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkStsRefId250Constraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshStsRefId250 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshStsRefId250() {	 
   		return (substring(getStringValue(),beginStsRefId250,beginStsRefId250 + STS_REF_ID_250_LEN));
   	}




}
  
