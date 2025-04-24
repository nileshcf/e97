package com.cloudframe.app.sf311010.dto.serialize;

/**
*  The class AcquirerIcaOnly5800Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:38. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class AcquirerIcaOnly5800Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(AcquirerIcaOnly5800Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int ACQUIRER_ICA_ONLY_5800_LENGTH = 5;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginAcquirerIcaOnly4800;
            protected  int beginAcqFiller1800;
	
	/**
	* Constructor for AcquirerIcaOnly5800Serialized
	**/
    public AcquirerIcaOnly5800Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for AcquirerIcaOnly5800Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public AcquirerIcaOnly5800Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this AcquirerIcaOnly5800Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this AcquirerIcaOnly5800Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in AcquirerIcaOnly5800Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(ACQUIRER_ICA_ONLY_5800_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginAcquirerIcaOnly4800 = getStartOffset() + 0;	// set offset for serialization
  
             beginAcqFiller1800 = getStartOffset() + 4;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localAcquirerIcaOnly4800Counter = -1;
     public boolean isAcquirerIcaOnly4800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localAcquirerIcaOnly4800Counter != sharedCounter;
         localAcquirerIcaOnly4800Counter = sharedCounter; return hasModified;
     }
	protected static final int ACQUIRER_ICA_ONLY_4800_LEN = 4;
	/**
	 * 	serialize this AcquirerIcaOnly4800
	 */
   protected void serializeAcquirerIcaOnly4800(char[] acquirerIcaOnly4800) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(acquirerIcaOnly4800,0,getStringValue(),beginAcquirerIcaOnly4800,ACQUIRER_ICA_ONLY_4800_LEN);
       localAcquirerIcaOnly4800Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkAcquirerIcaOnly4800Constraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshAcquirerIcaOnly4800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshAcquirerIcaOnly4800() {	 
   		return (substring(getStringValue(),beginAcquirerIcaOnly4800,beginAcquirerIcaOnly4800 + ACQUIRER_ICA_ONLY_4800_LEN));
   	}
     int localAcqFiller1800Counter = -1;
     public boolean isAcqFiller1800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localAcqFiller1800Counter != sharedCounter;
         localAcqFiller1800Counter = sharedCounter; return hasModified;
     }
	protected static final int ACQ_FILLER_1800_LEN = 1;
	/**
	 * 	serialize this AcqFiller1800
	 */
   protected void serializeAcqFiller1800(char[] acqFiller1800) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(acqFiller1800,0,getStringValue(),beginAcqFiller1800,ACQ_FILLER_1800_LEN);
       localAcqFiller1800Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkAcqFiller1800Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshAcqFiller1800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshAcqFiller1800() {	 
   		return (substring(getStringValue(),beginAcqFiller1800,beginAcqFiller1800 + ACQ_FILLER_1800_LEN));
   	}




}
  
