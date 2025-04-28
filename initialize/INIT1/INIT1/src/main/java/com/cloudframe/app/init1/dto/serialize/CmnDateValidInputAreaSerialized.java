package com.cloudframe.app.init1.dto.serialize;

/**
*  The class CmnDateValidInputAreaSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 06:52. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class CmnDateValidInputAreaSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(CmnDateValidInputAreaSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int CMN_DATE_VALID_INPUT_AREA_LENGTH = 10;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginCmnDateValidInput;
	
	/**
	* Constructor for CmnDateValidInputAreaSerialized
	**/
    public CmnDateValidInputAreaSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for CmnDateValidInputAreaSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public CmnDateValidInputAreaSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this CmnDateValidInputAreaSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,1024); // serialize this field at offset 1024 by default 
    }
    
	/**
	* sets parent for this CmnDateValidInputAreaSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 1024 by default
    }    
	/**
	* initializes the field in CmnDateValidInputAreaSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(CMN_DATE_VALID_INPUT_AREA_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginCmnDateValidInput = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localCmnDateValidInputCounter = -1;
     public boolean isCmnDateValidInputModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCmnDateValidInputCounter != sharedCounter;
         localCmnDateValidInputCounter = sharedCounter; return hasModified;
     }
	protected static final int CMN_DATE_VALID_INPUT_LEN = 10;
	/**
	 * 	serialize this CmnDateValidInput
	 */
   protected void serializeCmnDateValidInput(char[] cmnDateValidInput) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(cmnDateValidInput,0,getStringValue(),beginCmnDateValidInput,CMN_DATE_VALID_INPUT_LEN);
       localCmnDateValidInputCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCmnDateValidInputConstraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshCmnDateValidInput is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCmnDateValidInput() {	 
   		return (substring(getStringValue(),beginCmnDateValidInput,beginCmnDateValidInput + CMN_DATE_VALID_INPUT_LEN));
   	}




}
  
