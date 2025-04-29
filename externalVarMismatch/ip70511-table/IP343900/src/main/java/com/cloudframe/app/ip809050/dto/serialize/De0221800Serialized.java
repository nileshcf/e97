package com.cloudframe.app.ip809050.dto.serialize;

/**
*  The class De0221800Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:32. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class De0221800Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(De0221800Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int DE_0221800_LENGTH = 14;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginDe022800;
	
	/**
	* Constructor for De0221800Serialized
	**/
    public De0221800Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for De0221800Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public De0221800Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this De0221800Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,343); // serialize this field at offset 343 by default 
    }
    
	/**
	* sets parent for this De0221800Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 343 by default
    }    
	/**
	* initializes the field in De0221800Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(DE_0221800_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
             beginDe022800 = getStartOffset() + 1;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localDe022800Counter = -1;
     public boolean isDe022800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDe022800Counter != sharedCounter;
         localDe022800Counter = sharedCounter; return hasModified;
     }
	protected static final int DE_022800_LEN = 12;
	/**
	 * 	serialize this De022800
	 */
   protected void serializeDe022800(char[] de022800) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(de022800,0,getStringValue(),beginDe022800,DE_022800_LEN);
       localDe022800Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDe022800Constraints(char[] value) {
   			return super.checkConstraints(value , 12 ,false, false);
   }
    /**
	 *	refreshDe022800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDe022800() {	 
   		return (substring(getStringValue(),beginDe022800,beginDe022800 + DE_022800_LEN));
   	}




}
  
