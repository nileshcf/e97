package com.cloudframe.app.refmod1.dto.serialize;

/**
*  The class AT2Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:26. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class AT2Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(AT2Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int A_T_2_LENGTH = 60;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginATFld12;
            protected  int beginATFld22;
	
	/**
	* Constructor for AT2Serialized
	**/
    public AT2Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for AT2Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public AT2Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this AT2Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this AT2Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in AT2Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(A_T_2_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginATFld12 = getStartOffset() + 0;	// set offset for serialization
  
             beginATFld22 = getStartOffset() + 20;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localATFld12Counter = -1;
     public boolean isATFld12Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localATFld12Counter != sharedCounter;
         localATFld12Counter = sharedCounter; return hasModified;
     }
	protected static final int A_TFLD_12_LEN = 20;
	/**
	 * 	serialize this ATFld12
	 */
   protected void serializeATFld12(char[] aTFld12) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(aTFld12,0,getStringValue(),beginATFld12,A_TFLD_12_LEN);
       localATFld12Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkATFld12Constraints(char[] value) {
   			return super.checkConstraints(value , 20 ,false, false);
   }
    /**
	 *	refreshATFld12 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshATFld12() {	 
   		return (substring(getStringValue(),beginATFld12,beginATFld12 + A_TFLD_12_LEN));
   	}
     int localATFld22Counter = -1;
     public boolean isATFld22Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localATFld22Counter != sharedCounter;
         localATFld22Counter = sharedCounter; return hasModified;
     }
	protected static final int A_TFLD_22_LEN = 40;
	/**
	 * 	serialize this ATFld22
	 */
   protected void serializeATFld22(char[] aTFld22) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(aTFld22,0,getStringValue(),beginATFld22,A_TFLD_22_LEN);
       localATFld22Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkATFld22Constraints(char[] value) {
   			return super.checkConstraints(value , 40 ,false, false);
   }
    /**
	 *	refreshATFld22 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshATFld22() {	 
   		return (substring(getStringValue(),beginATFld22,beginATFld22 + A_TFLD_22_LEN));
   	}




}
  
