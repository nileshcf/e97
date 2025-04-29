package com.cloudframe.app.refmod1.dto.serialize;

/**
*  The class AT3Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:23. using version 5.0.0.257
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class AT3Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(AT3Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int A_T_3_LENGTH = 60;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginATFld13;
            protected  int beginATFld23;
	
	/**
	* Constructor for AT3Serialized
	**/
    public AT3Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for AT3Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public AT3Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this AT3Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this AT3Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in AT3Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(A_T_3_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginATFld13 = getStartOffset() + 0;	// set offset for serialization
  
             beginATFld23 = getStartOffset() + 20;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localATFld13Counter = -1;
     public boolean isATFld13Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localATFld13Counter != sharedCounter;
         localATFld13Counter = sharedCounter; return hasModified;
     }
	protected static final int A_TFLD_13_LEN = 20;
	/**
	 * 	serialize this ATFld13
	 */
   protected void serializeATFld13(char[] aTFld13) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(aTFld13,0,getStringValue(),beginATFld13,A_TFLD_13_LEN);
       localATFld13Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkATFld13Constraints(char[] value) {
   			return super.checkConstraints(value , 20 ,false, false);
   }
    /**
	 *	refreshATFld13 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshATFld13() {	 
   		return (substring(getStringValue(),beginATFld13,beginATFld13 + A_TFLD_13_LEN));
   	}
     int localATFld23Counter = -1;
     public boolean isATFld23Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localATFld23Counter != sharedCounter;
         localATFld23Counter = sharedCounter; return hasModified;
     }
	protected static final int A_TFLD_23_LEN = 40;
	/**
	 * 	serialize this ATFld23
	 */
   protected void serializeATFld23(char[] aTFld23) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(aTFld23,0,getStringValue(),beginATFld23,A_TFLD_23_LEN);
       localATFld23Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkATFld23Constraints(char[] value) {
   			return super.checkConstraints(value , 40 ,false, false);
   }
    /**
	 *	refreshATFld23 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshATFld23() {	 
   		return (substring(getStringValue(),beginATFld23,beginATFld23 + A_TFLD_23_LEN));
   	}




}
  
