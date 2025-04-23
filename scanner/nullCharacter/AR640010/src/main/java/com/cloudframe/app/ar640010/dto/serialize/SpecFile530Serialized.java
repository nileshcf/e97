package com.cloudframe.app.ar640010.dto.serialize;

/**
*  The class SpecFile530Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:11. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class SpecFile530Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(SpecFile530Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int SPEC_FILE_530_LENGTH = 52;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginSpecDsn530;
            protected  int beginSpecExt530;
	
	/**
	* Constructor for SpecFile530Serialized
	**/
    public SpecFile530Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for SpecFile530Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public SpecFile530Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this SpecFile530Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,8); // serialize this field at offset 8 by default 
    }
    
	/**
	* sets parent for this SpecFile530Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 8 by default
    }    
	/**
	* initializes the field in SpecFile530Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(SPEC_FILE_530_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginSpecDsn530 = getStartOffset() + 0;	// set offset for serialization
  
             beginSpecExt530 = getStartOffset() + 44;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localSpecDsn530Counter = -1;
     public boolean isSpecDsn530Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSpecDsn530Counter != sharedCounter;
         localSpecDsn530Counter = sharedCounter; return hasModified;
     }
	protected static final int SPEC_DSN_530_LEN = 44;
	/**
	 * 	serialize this SpecDsn530
	 */
   protected void serializeSpecDsn530(char[] specDsn530) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(specDsn530,0,getStringValue(),beginSpecDsn530,SPEC_DSN_530_LEN);
       localSpecDsn530Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSpecDsn530Constraints(char[] value) {
   			return super.checkConstraints(value , 44 ,false, false);
   }
    /**
	 *	refreshSpecDsn530 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSpecDsn530() {	 
   		return (substring(getStringValue(),beginSpecDsn530,beginSpecDsn530 + SPEC_DSN_530_LEN));
   	}
     int localSpecExt530Counter = -1;
     public boolean isSpecExt530Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSpecExt530Counter != sharedCounter;
         localSpecExt530Counter = sharedCounter; return hasModified;
     }
	protected static final int SPEC_EXT_530_LEN = 8;
	/**
	 * 	serialize this SpecExt530
	 */
   protected void serializeSpecExt530(char[] specExt530) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(specExt530,0,getStringValue(),beginSpecExt530,SPEC_EXT_530_LEN);
       localSpecExt530Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSpecExt530Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshSpecExt530 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSpecExt530() {	 
   		return (substring(getStringValue(),beginSpecExt530,beginSpecExt530 + SPEC_EXT_530_LEN));
   	}




}
  
