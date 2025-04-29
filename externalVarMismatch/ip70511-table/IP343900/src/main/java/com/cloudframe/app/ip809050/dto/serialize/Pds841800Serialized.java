package com.cloudframe.app.ip809050.dto.serialize;

/**
*  The class Pds841800Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:26. using version 5.0.0.257
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Pds841800Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Pds841800Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int PDS_841800_LENGTH = 8;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginPds841S1800;
	
	/**
	* Constructor for Pds841800Serialized
	**/
    public Pds841800Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Pds841800Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Pds841800Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Pds841800Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this Pds841800Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in Pds841800Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(PDS_841800_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginPds841S1800 = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localPds841S1800Counter = -1;
     public boolean isPds841S1800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPds841S1800Counter != sharedCounter;
         localPds841S1800Counter = sharedCounter; return hasModified;
     }
	protected static final int PDS_841_S_1800_LEN = 4;
	/**
	 * 	serialize this Pds841S1800
	 */
   protected void serializePds841S1800(char[] pds841S1800) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(pds841S1800,0,getStringValue(),beginPds841S1800,PDS_841_S_1800_LEN);
       localPds841S1800Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkPds841S1800Constraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshPds841S1800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshPds841S1800() {	 
   		return (substring(getStringValue(),beginPds841S1800,beginPds841S1800 + PDS_841_S_1800_LEN));
   	}




}
  
