package com.cloudframe.app.calldrvr.dto.serialize;

/**
*  The class Pgm4Parm4GroupSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:15. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Pgm4Parm4GroupSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Pgm4Parm4GroupSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int PGM_4_PARM_4_GROUP_LENGTH = 8;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginPgm4Parm4;
	
	/**
	* Constructor for Pgm4Parm4GroupSerialized
	**/
    public Pgm4Parm4GroupSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Pgm4Parm4GroupSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Pgm4Parm4GroupSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Pgm4Parm4GroupSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,13); // serialize this field at offset 13 by default 
    }
    
	/**
	* sets parent for this Pgm4Parm4GroupSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 13 by default
    }    
	/**
	* initializes the field in Pgm4Parm4GroupSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(PGM_4_PARM_4_GROUP_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginPgm4Parm4 = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localPgm4Parm4Counter = -1;
     public boolean isPgm4Parm4Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPgm4Parm4Counter != sharedCounter;
         localPgm4Parm4Counter = sharedCounter; return hasModified;
     }
	protected static final int PGM_4_PARM_4_LEN = 8;
	/**
	 * 	serialize this Pgm4Parm4
	 */
   protected void serializePgm4Parm4(char[] pgm4Parm4) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(pgm4Parm4,0,getStringValue(),beginPgm4Parm4,PGM_4_PARM_4_LEN);
       localPgm4Parm4Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkPgm4Parm4Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshPgm4Parm4 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshPgm4Parm4() {	 
   		return (substring(getStringValue(),beginPgm4Parm4,beginPgm4Parm4 + PGM_4_PARM_4_LEN));
   	}




}
  
