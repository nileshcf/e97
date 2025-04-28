package com.cloudframe.app.ip809050.dto.serialize;

/**
*  The class De0311800Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 08:07. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class De0311800Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(De0311800Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int DE_0311800_LENGTH = 25;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginDe031800;
	
	/**
	* Constructor for De0311800Serialized
	**/
    public De0311800Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for De0311800Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public De0311800Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this De0311800Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,295); // serialize this field at offset 295 by default 
    }
    
	/**
	* sets parent for this De0311800Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 295 by default
    }    
	/**
	* initializes the field in De0311800Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(DE_0311800_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
             beginDe031800 = getStartOffset() + 1;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localDe031800Counter = -1;
     public boolean isDe031800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDe031800Counter != sharedCounter;
         localDe031800Counter = sharedCounter; return hasModified;
     }
	protected static final int DE_031800_LEN = 23;
	/**
	 * 	serialize this De031800
	 */
   protected void serializeDe031800(char[] de031800) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(de031800,0,getStringValue(),beginDe031800,DE_031800_LEN);
       localDe031800Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDe031800Constraints(char[] value) {
   			return super.checkConstraints(value , 23 ,false, false);
   }
    /**
	 *	refreshDe031800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDe031800() {	 
   		return (substring(getStringValue(),beginDe031800,beginDe031800 + DE_031800_LEN));
   	}




}
  
