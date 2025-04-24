package com.cloudframe.app.ar640010.dto.serialize;

/**
*  The class RecfmEntry520Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:49. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class RecfmEntry520Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(RecfmEntry520Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int RECFM_ENTRY_520_LENGTH = 5;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginRecfm2520;
            protected  int beginRecfm3520;
	
	/**
	* Constructor for RecfmEntry520Serialized
	**/
    public RecfmEntry520Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for RecfmEntry520Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public RecfmEntry520Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this RecfmEntry520Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,2); // serialize this field at offset 2 by default 
    }
    
	/**
	* sets parent for this RecfmEntry520Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 2 by default
    }    
	/**
	* initializes the field in RecfmEntry520Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(RECFM_ENTRY_520_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginRecfm2520 = getStartOffset() + 0;	// set offset for serialization
  
             beginRecfm3520 = getStartOffset() + 2;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localRecfm2520Counter = -1;
     public boolean isRecfm2520Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRecfm2520Counter != sharedCounter;
         localRecfm2520Counter = sharedCounter; return hasModified;
     }
	protected static final int RECFM_2520_LEN = 2;
	/**
	 * 	serialize this Recfm2520
	 */
   protected void serializeRecfm2520(char[] recfm2520) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(recfm2520,0,getStringValue(),beginRecfm2520,RECFM_2520_LEN);
       localRecfm2520Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkRecfm2520Constraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshRecfm2520 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshRecfm2520() {	 
   		return (substring(getStringValue(),beginRecfm2520,beginRecfm2520 + RECFM_2520_LEN));
   	}
     int localRecfm3520Counter = -1;
     public boolean isRecfm3520Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRecfm3520Counter != sharedCounter;
         localRecfm3520Counter = sharedCounter; return hasModified;
     }
	protected static final int RECFM_3520_LEN = 3;
	/**
	 * 	serialize this Recfm3520
	 */
   protected void serializeRecfm3520(char[] recfm3520) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(recfm3520,0,getStringValue(),beginRecfm3520,RECFM_3520_LEN);
       localRecfm3520Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkRecfm3520Constraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshRecfm3520 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshRecfm3520() {	 
   		return (substring(getStringValue(),beginRecfm3520,beginRecfm3520 + RECFM_3520_LEN));
   	}




}
  
