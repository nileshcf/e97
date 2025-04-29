package com.cloudframe.app.sf311010.dto.serialize;

/**
*  The class ForwardIcaOnly5800Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:30. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class ForwardIcaOnly5800Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(ForwardIcaOnly5800Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int FORWARD_ICA_ONLY_5800_LENGTH = 5;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginForwardIcaOnly4800;
            protected  int beginFwdFiller1800;
	
	/**
	* Constructor for ForwardIcaOnly5800Serialized
	**/
    public ForwardIcaOnly5800Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for ForwardIcaOnly5800Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public ForwardIcaOnly5800Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this ForwardIcaOnly5800Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this ForwardIcaOnly5800Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in ForwardIcaOnly5800Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(FORWARD_ICA_ONLY_5800_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginForwardIcaOnly4800 = getStartOffset() + 0;	// set offset for serialization
  
             beginFwdFiller1800 = getStartOffset() + 4;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localForwardIcaOnly4800Counter = -1;
     public boolean isForwardIcaOnly4800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localForwardIcaOnly4800Counter != sharedCounter;
         localForwardIcaOnly4800Counter = sharedCounter; return hasModified;
     }
	protected static final int FORWARD_ICA_ONLY_4800_LEN = 4;
	/**
	 * 	serialize this ForwardIcaOnly4800
	 */
   protected void serializeForwardIcaOnly4800(char[] forwardIcaOnly4800) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(forwardIcaOnly4800,0,getStringValue(),beginForwardIcaOnly4800,FORWARD_ICA_ONLY_4800_LEN);
       localForwardIcaOnly4800Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkForwardIcaOnly4800Constraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshForwardIcaOnly4800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshForwardIcaOnly4800() {	 
   		return (substring(getStringValue(),beginForwardIcaOnly4800,beginForwardIcaOnly4800 + FORWARD_ICA_ONLY_4800_LEN));
   	}
     int localFwdFiller1800Counter = -1;
     public boolean isFwdFiller1800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFwdFiller1800Counter != sharedCounter;
         localFwdFiller1800Counter = sharedCounter; return hasModified;
     }
	protected static final int FWD_FILLER_1800_LEN = 1;
	/**
	 * 	serialize this FwdFiller1800
	 */
   protected void serializeFwdFiller1800(char[] fwdFiller1800) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(fwdFiller1800,0,getStringValue(),beginFwdFiller1800,FWD_FILLER_1800_LEN);
       localFwdFiller1800Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkFwdFiller1800Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshFwdFiller1800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshFwdFiller1800() {	 
   		return (substring(getStringValue(),beginFwdFiller1800,beginFwdFiller1800 + FWD_FILLER_1800_LEN));
   	}




}
  
