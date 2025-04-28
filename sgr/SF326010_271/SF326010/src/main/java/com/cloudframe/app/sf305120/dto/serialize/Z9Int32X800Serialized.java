package com.cloudframe.app.sf305120.dto.serialize;

/**
*  The class Z9Int32X800Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 08:03. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Z9Int32X800Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Z9Int32X800Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int Z_9_INT_32_X_800_LENGTH = 4;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginZ9Int32B1800;
            protected  int beginZ9Int32B2800;
            protected  int beginZ9Int32B3800;
            protected  int beginZ9Int32B4800;
	
	/**
	* Constructor for Z9Int32X800Serialized
	**/
    public Z9Int32X800Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Z9Int32X800Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Z9Int32X800Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Z9Int32X800Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this Z9Int32X800Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in Z9Int32X800Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(Z_9_INT_32_X_800_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginZ9Int32B1800 = getStartOffset() + 0;	// set offset for serialization
  
             beginZ9Int32B2800 = getStartOffset() + 1;	// set offset for serialization
  
             beginZ9Int32B3800 = getStartOffset() + 2;	// set offset for serialization
  
             beginZ9Int32B4800 = getStartOffset() + 3;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localZ9Int32B1800Counter = -1;
     public boolean isZ9Int32B1800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localZ9Int32B1800Counter != sharedCounter;
         localZ9Int32B1800Counter = sharedCounter; return hasModified;
     }
	protected static final int Z_9_INT_32_B_1800_LEN = 1;
	/**
	 * 	serialize this Z9Int32B1800
	 */
   protected void serializeZ9Int32B1800(char[] z9Int32B1800) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(z9Int32B1800,0,getStringValue(),beginZ9Int32B1800,Z_9_INT_32_B_1800_LEN);
       localZ9Int32B1800Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkZ9Int32B1800Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshZ9Int32B1800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshZ9Int32B1800() {	 
   		return (substring(getStringValue(),beginZ9Int32B1800,beginZ9Int32B1800 + Z_9_INT_32_B_1800_LEN));
   	}
     int localZ9Int32B2800Counter = -1;
     public boolean isZ9Int32B2800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localZ9Int32B2800Counter != sharedCounter;
         localZ9Int32B2800Counter = sharedCounter; return hasModified;
     }
	protected static final int Z_9_INT_32_B_2800_LEN = 1;
	/**
	 * 	serialize this Z9Int32B2800
	 */
   protected void serializeZ9Int32B2800(char[] z9Int32B2800) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(z9Int32B2800,0,getStringValue(),beginZ9Int32B2800,Z_9_INT_32_B_2800_LEN);
       localZ9Int32B2800Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkZ9Int32B2800Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshZ9Int32B2800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshZ9Int32B2800() {	 
   		return (substring(getStringValue(),beginZ9Int32B2800,beginZ9Int32B2800 + Z_9_INT_32_B_2800_LEN));
   	}
     int localZ9Int32B3800Counter = -1;
     public boolean isZ9Int32B3800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localZ9Int32B3800Counter != sharedCounter;
         localZ9Int32B3800Counter = sharedCounter; return hasModified;
     }
	protected static final int Z_9_INT_32_B_3800_LEN = 1;
	/**
	 * 	serialize this Z9Int32B3800
	 */
   protected void serializeZ9Int32B3800(char[] z9Int32B3800) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(z9Int32B3800,0,getStringValue(),beginZ9Int32B3800,Z_9_INT_32_B_3800_LEN);
       localZ9Int32B3800Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkZ9Int32B3800Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshZ9Int32B3800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshZ9Int32B3800() {	 
   		return (substring(getStringValue(),beginZ9Int32B3800,beginZ9Int32B3800 + Z_9_INT_32_B_3800_LEN));
   	}
     int localZ9Int32B4800Counter = -1;
     public boolean isZ9Int32B4800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localZ9Int32B4800Counter != sharedCounter;
         localZ9Int32B4800Counter = sharedCounter; return hasModified;
     }
	protected static final int Z_9_INT_32_B_4800_LEN = 1;
	/**
	 * 	serialize this Z9Int32B4800
	 */
   protected void serializeZ9Int32B4800(char[] z9Int32B4800) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(z9Int32B4800,0,getStringValue(),beginZ9Int32B4800,Z_9_INT_32_B_4800_LEN);
       localZ9Int32B4800Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkZ9Int32B4800Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshZ9Int32B4800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshZ9Int32B4800() {	 
   		return (substring(getStringValue(),beginZ9Int32B4800,beginZ9Int32B4800 + Z_9_INT_32_B_4800_LEN));
   	}




}
  
