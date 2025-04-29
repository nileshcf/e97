package com.cloudframe.app.refmod3.dto.serialize;

/**
*  The class AT213Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:20. using version 5.0.0.257
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class AT213Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(AT213Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int A_T_213_LENGTH = 60;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginATFld1213;
            protected  int beginATFld2213;
	
	/**
	* Constructor for AT213Serialized
	**/
    public AT213Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for AT213Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public AT213Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this AT213Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,5); // serialize this field at offset 5 by default 
    }
    
	/**
	* sets parent for this AT213Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 5 by default
    }    
	/**
	* initializes the field in AT213Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(A_T_213_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginATFld1213 = getStartOffset() + 0;	// set offset for serialization
  
             beginATFld2213 = getStartOffset() + 20;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localATFld1213Counter = -1;
     public boolean isATFld1213Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localATFld1213Counter != sharedCounter;
         localATFld1213Counter = sharedCounter; return hasModified;
     }
	protected static final int A_TFLD_1213_LEN = 20;
	/**
	 * 	serialize this ATFld1213
	 */
   protected void serializeATFld1213(char[] aTFld1213) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(aTFld1213,0,getStringValue(),beginATFld1213,A_TFLD_1213_LEN);
       localATFld1213Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkATFld1213Constraints(char[] value) {
   			return super.checkConstraints(value , 20 ,false, false);
   }
    /**
	 *	refreshATFld1213 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshATFld1213() {	 
   		return (substring(getStringValue(),beginATFld1213,beginATFld1213 + A_TFLD_1213_LEN));
   	}
     int localATFld2213Counter = -1;
     public boolean isATFld2213Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localATFld2213Counter != sharedCounter;
         localATFld2213Counter = sharedCounter; return hasModified;
     }
	protected static final int A_TFLD_2213_LEN = 40;
	/**
	 * 	serialize this ATFld2213
	 */
   protected void serializeATFld2213(char[] aTFld2213) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(aTFld2213,0,getStringValue(),beginATFld2213,A_TFLD_2213_LEN);
       localATFld2213Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkATFld2213Constraints(char[] value) {
   			return super.checkConstraints(value , 40 ,false, false);
   }
    /**
	 *	refreshATFld2213 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshATFld2213() {	 
   		return (substring(getStringValue(),beginATFld2213,beginATFld2213 + A_TFLD_2213_LEN));
   	}




}
  
