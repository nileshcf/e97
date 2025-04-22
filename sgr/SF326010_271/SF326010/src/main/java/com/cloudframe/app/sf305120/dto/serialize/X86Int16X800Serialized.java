package com.cloudframe.app.sf305120.dto.serialize;

/**
*  The class X86Int16X800Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:12. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class X86Int16X800Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(X86Int16X800Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int X_86_INT_16_X_800_LENGTH = 2;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginX86Int16B2800;
            protected  int beginX86Int16B1800;
	
	/**
	* Constructor for X86Int16X800Serialized
	**/
    public X86Int16X800Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for X86Int16X800Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public X86Int16X800Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this X86Int16X800Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this X86Int16X800Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in X86Int16X800Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(X_86_INT_16_X_800_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginX86Int16B2800 = getStartOffset() + 0;	// set offset for serialization
  
             beginX86Int16B1800 = getStartOffset() + 1;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localX86Int16B2800Counter = -1;
     public boolean isX86Int16B2800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localX86Int16B2800Counter != sharedCounter;
         localX86Int16B2800Counter = sharedCounter; return hasModified;
     }
	protected static final int X_86_INT_16_B_2800_LEN = 1;
	/**
	 * 	serialize this X86Int16B2800
	 */
   protected void serializeX86Int16B2800(char[] x86Int16B2800) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(x86Int16B2800,0,getStringValue(),beginX86Int16B2800,X_86_INT_16_B_2800_LEN);
       localX86Int16B2800Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkX86Int16B2800Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshX86Int16B2800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshX86Int16B2800() {	 
   		return (substring(getStringValue(),beginX86Int16B2800,beginX86Int16B2800 + X_86_INT_16_B_2800_LEN));
   	}
     int localX86Int16B1800Counter = -1;
     public boolean isX86Int16B1800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localX86Int16B1800Counter != sharedCounter;
         localX86Int16B1800Counter = sharedCounter; return hasModified;
     }
	protected static final int X_86_INT_16_B_1800_LEN = 1;
	/**
	 * 	serialize this X86Int16B1800
	 */
   protected void serializeX86Int16B1800(char[] x86Int16B1800) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(x86Int16B1800,0,getStringValue(),beginX86Int16B1800,X_86_INT_16_B_1800_LEN);
       localX86Int16B1800Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkX86Int16B1800Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshX86Int16B1800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshX86Int16B1800() {	 
   		return (substring(getStringValue(),beginX86Int16B1800,beginX86Int16B1800 + X_86_INT_16_B_1800_LEN));
   	}




}
  
