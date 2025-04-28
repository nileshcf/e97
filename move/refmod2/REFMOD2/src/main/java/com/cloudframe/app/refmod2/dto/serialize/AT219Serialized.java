package com.cloudframe.app.refmod2.dto.serialize;

/**
*  The class AT219Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 08:02. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class AT219Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(AT219Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int A_T_219_LENGTH = 60;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginATFld1219;
            protected  int beginATFld2219;
	
	/**
	* Constructor for AT219Serialized
	**/
    public AT219Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for AT219Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public AT219Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this AT219Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,5); // serialize this field at offset 5 by default 
    }
    
	/**
	* sets parent for this AT219Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 5 by default
    }    
	/**
	* initializes the field in AT219Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(A_T_219_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginATFld1219 = getStartOffset() + 0;	// set offset for serialization
  
             beginATFld2219 = getStartOffset() + 20;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localATFld1219Counter = -1;
     public boolean isATFld1219Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localATFld1219Counter != sharedCounter;
         localATFld1219Counter = sharedCounter; return hasModified;
     }
	protected static final int A_TFLD_1219_LEN = 20;
	/**
	 * 	serialize this ATFld1219
	 */
   protected void serializeATFld1219(char[] aTFld1219) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(aTFld1219,0,getStringValue(),beginATFld1219,A_TFLD_1219_LEN);
       localATFld1219Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkATFld1219Constraints(char[] value) {
   			return super.checkConstraints(value , 20 ,false, false);
   }
    /**
	 *	refreshATFld1219 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshATFld1219() {	 
   		return (substring(getStringValue(),beginATFld1219,beginATFld1219 + A_TFLD_1219_LEN));
   	}
     int localATFld2219Counter = -1;
     public boolean isATFld2219Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localATFld2219Counter != sharedCounter;
         localATFld2219Counter = sharedCounter; return hasModified;
     }
	protected static final int A_TFLD_2219_LEN = 40;
	/**
	 * 	serialize this ATFld2219
	 */
   protected void serializeATFld2219(char[] aTFld2219) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(aTFld2219,0,getStringValue(),beginATFld2219,A_TFLD_2219_LEN);
       localATFld2219Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkATFld2219Constraints(char[] value) {
   			return super.checkConstraints(value , 40 ,false, false);
   }
    /**
	 *	refreshATFld2219 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshATFld2219() {	 
   		return (substring(getStringValue(),beginATFld2219,beginATFld2219 + A_TFLD_2219_LEN));
   	}




}
  
