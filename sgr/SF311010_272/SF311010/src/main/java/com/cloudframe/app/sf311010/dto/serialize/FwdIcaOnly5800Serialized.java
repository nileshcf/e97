package com.cloudframe.app.sf311010.dto.serialize;

/**
*  The class FwdIcaOnly5800Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:23. using version 5.0.0.257
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class FwdIcaOnly5800Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(FwdIcaOnly5800Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int FWD_ICA_ONLY_5800_LENGTH = 5;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginFwdIcaOnly4800;
	
	/**
	* Constructor for FwdIcaOnly5800Serialized
	**/
    public FwdIcaOnly5800Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for FwdIcaOnly5800Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public FwdIcaOnly5800Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this FwdIcaOnly5800Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,1); // serialize this field at offset 1 by default 
    }
    
	/**
	* sets parent for this FwdIcaOnly5800Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 1 by default
    }    
	/**
	* initializes the field in FwdIcaOnly5800Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(FWD_ICA_ONLY_5800_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginFwdIcaOnly4800 = getStartOffset() + 1;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localFwdIcaOnly4800Counter = -1;
     public boolean isFwdIcaOnly4800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFwdIcaOnly4800Counter != sharedCounter;
         localFwdIcaOnly4800Counter = sharedCounter; return hasModified;
     }
	protected static final int FWD_ICA_ONLY_4800_LEN = 4;
	/**
	 * 	serialize this FwdIcaOnly4800
	 */
   protected void serializeFwdIcaOnly4800(char[] fwdIcaOnly4800) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(fwdIcaOnly4800,0,getStringValue(),beginFwdIcaOnly4800,FWD_ICA_ONLY_4800_LEN);
       localFwdIcaOnly4800Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkFwdIcaOnly4800Constraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshFwdIcaOnly4800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshFwdIcaOnly4800() {	 
   		return (substring(getStringValue(),beginFwdIcaOnly4800,beginFwdIcaOnly4800 + FWD_ICA_ONLY_4800_LEN));
   	}




}
  
