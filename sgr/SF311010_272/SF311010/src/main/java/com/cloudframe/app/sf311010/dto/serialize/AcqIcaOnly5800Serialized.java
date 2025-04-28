package com.cloudframe.app.sf311010.dto.serialize;

/**
*  The class AcqIcaOnly5800Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:01. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class AcqIcaOnly5800Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(AcqIcaOnly5800Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int ACQ_ICA_ONLY_5800_LENGTH = 5;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginAcqIcaOnly4800;
	
	/**
	* Constructor for AcqIcaOnly5800Serialized
	**/
    public AcqIcaOnly5800Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for AcqIcaOnly5800Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public AcqIcaOnly5800Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this AcqIcaOnly5800Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,1); // serialize this field at offset 1 by default 
    }
    
	/**
	* sets parent for this AcqIcaOnly5800Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 1 by default
    }    
	/**
	* initializes the field in AcqIcaOnly5800Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(ACQ_ICA_ONLY_5800_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginAcqIcaOnly4800 = getStartOffset() + 1;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localAcqIcaOnly4800Counter = -1;
     public boolean isAcqIcaOnly4800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localAcqIcaOnly4800Counter != sharedCounter;
         localAcqIcaOnly4800Counter = sharedCounter; return hasModified;
     }
	protected static final int ACQ_ICA_ONLY_4800_LEN = 4;
	/**
	 * 	serialize this AcqIcaOnly4800
	 */
   protected void serializeAcqIcaOnly4800(char[] acqIcaOnly4800) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(acqIcaOnly4800,0,getStringValue(),beginAcqIcaOnly4800,ACQ_ICA_ONLY_4800_LEN);
       localAcqIcaOnly4800Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkAcqIcaOnly4800Constraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshAcqIcaOnly4800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshAcqIcaOnly4800() {	 
   		return (substring(getStringValue(),beginAcqIcaOnly4800,beginAcqIcaOnly4800 + ACQ_ICA_ONLY_4800_LEN));
   	}




}
  
