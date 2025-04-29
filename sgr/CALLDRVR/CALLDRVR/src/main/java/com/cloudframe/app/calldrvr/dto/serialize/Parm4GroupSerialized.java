package com.cloudframe.app.calldrvr.dto.serialize;

/**
*  The class Parm4GroupSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:38. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Parm4GroupSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Parm4GroupSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int PARM_4_GROUP_LENGTH = 8;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginParm4;
	
	/**
	* Constructor for Parm4GroupSerialized
	**/
    public Parm4GroupSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Parm4GroupSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Parm4GroupSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Parm4GroupSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,13); // serialize this field at offset 13 by default 
    }
    
	/**
	* sets parent for this Parm4GroupSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 13 by default
    }    
	/**
	* initializes the field in Parm4GroupSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(PARM_4_GROUP_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginParm4 = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localParm4Counter = -1;
     public boolean isParm4Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localParm4Counter != sharedCounter;
         localParm4Counter = sharedCounter; return hasModified;
     }
	protected static final int PARM_4_LEN = 8;
	/**
	 * 	serialize this Parm4
	 */
   protected void serializeParm4(char[] parm4) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(parm4,0,getStringValue(),beginParm4,PARM_4_LEN);
       localParm4Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkParm4Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshParm4 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshParm4() {	 
   		return (substring(getStringValue(),beginParm4,beginParm4 + PARM_4_LEN));
   	}




}
  
