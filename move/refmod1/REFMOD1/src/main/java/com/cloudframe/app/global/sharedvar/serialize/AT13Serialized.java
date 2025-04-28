package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class AT13Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 06:59. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class AT13Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(AT13Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int A_T_13_LENGTH = 60;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginATFld113;
            protected  int beginATFld213;
	
	/**
	* Constructor for AT13Serialized
	**/
    public AT13Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for AT13Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public AT13Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this AT13Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,5); // serialize this field at offset 5 by default 
    }
    
	/**
	* sets parent for this AT13Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 5 by default
    }    
	/**
	* initializes the field in AT13Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(A_T_13_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginATFld113 = getStartOffset() + 0;	// set offset for serialization
  
             beginATFld213 = getStartOffset() + 20;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localATFld113Counter = -1;
     public boolean isATFld113Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localATFld113Counter != sharedCounter;
         localATFld113Counter = sharedCounter; return hasModified;
     }
	protected static final int A_TFLD_113_LEN = 20;
	/**
	 * 	serialize this ATFld113
	 */
   protected void serializeATFld113(char[] aTFld113) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(aTFld113,0,getStringValue(),beginATFld113,A_TFLD_113_LEN);
       localATFld113Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkATFld113Constraints(char[] value) {
   			return super.checkConstraints(value , 20 ,false, false);
   }
    /**
	 *	refreshATFld113 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshATFld113() {	 
   		return (substring(getStringValue(),beginATFld113,beginATFld113 + A_TFLD_113_LEN));
   	}
     int localATFld213Counter = -1;
     public boolean isATFld213Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localATFld213Counter != sharedCounter;
         localATFld213Counter = sharedCounter; return hasModified;
     }
	protected static final int A_TFLD_213_LEN = 40;
	/**
	 * 	serialize this ATFld213
	 */
   protected void serializeATFld213(char[] aTFld213) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(aTFld213,0,getStringValue(),beginATFld213,A_TFLD_213_LEN);
       localATFld213Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkATFld213Constraints(char[] value) {
   			return super.checkConstraints(value , 40 ,false, false);
   }
    /**
	 *	refreshATFld213 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshATFld213() {	 
   		return (substring(getStringValue(),beginATFld213,beginATFld213 + A_TFLD_213_LEN));
   	}




}
  
