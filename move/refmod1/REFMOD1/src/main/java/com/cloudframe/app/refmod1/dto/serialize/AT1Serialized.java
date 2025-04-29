package com.cloudframe.app.refmod1.dto.serialize;

/**
*  The class AT1Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:29. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class AT1Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(AT1Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int A_T_1_LENGTH = 60;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginATFld11;
            protected  int beginATFld21;
	
	/**
	* Constructor for AT1Serialized
	**/
    public AT1Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for AT1Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public AT1Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this AT1Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this AT1Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in AT1Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(A_T_1_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginATFld11 = getStartOffset() + 0;	// set offset for serialization
  
             beginATFld21 = getStartOffset() + 20;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localATFld11Counter = -1;
     public boolean isATFld11Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localATFld11Counter != sharedCounter;
         localATFld11Counter = sharedCounter; return hasModified;
     }
	protected static final int A_TFLD_11_LEN = 20;
	/**
	 * 	serialize this ATFld11
	 */
   protected void serializeATFld11(char[] aTFld11) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(aTFld11,0,getStringValue(),beginATFld11,A_TFLD_11_LEN);
       localATFld11Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkATFld11Constraints(char[] value) {
   			return super.checkConstraints(value , 20 ,false, false);
   }
    /**
	 *	refreshATFld11 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshATFld11() {	 
   		return (substring(getStringValue(),beginATFld11,beginATFld11 + A_TFLD_11_LEN));
   	}
     int localATFld21Counter = -1;
     public boolean isATFld21Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localATFld21Counter != sharedCounter;
         localATFld21Counter = sharedCounter; return hasModified;
     }
	protected static final int A_TFLD_21_LEN = 40;
	/**
	 * 	serialize this ATFld21
	 */
   protected void serializeATFld21(char[] aTFld21) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(aTFld21,0,getStringValue(),beginATFld21,A_TFLD_21_LEN);
       localATFld21Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkATFld21Constraints(char[] value) {
   			return super.checkConstraints(value , 40 ,false, false);
   }
    /**
	 *	refreshATFld21 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshATFld21() {	 
   		return (substring(getStringValue(),beginATFld21,beginATFld21 + A_TFLD_21_LEN));
   	}




}
  
