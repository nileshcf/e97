package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class AT19Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:13. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class AT19Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(AT19Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int A_T_19_LENGTH = 60;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginATFld119;
            protected  int beginATFld219;
	
	/**
	* Constructor for AT19Serialized
	**/
    public AT19Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for AT19Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public AT19Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this AT19Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,5); // serialize this field at offset 5 by default 
    }
    
	/**
	* sets parent for this AT19Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 5 by default
    }    
	/**
	* initializes the field in AT19Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(A_T_19_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginATFld119 = getStartOffset() + 0;	// set offset for serialization
  
             beginATFld219 = getStartOffset() + 20;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localATFld119Counter = -1;
     public boolean isATFld119Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localATFld119Counter != sharedCounter;
         localATFld119Counter = sharedCounter; return hasModified;
     }
	protected static final int A_TFLD_119_LEN = 20;
	/**
	 * 	serialize this ATFld119
	 */
   protected void serializeATFld119(char[] aTFld119) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(aTFld119,0,getStringValue(),beginATFld119,A_TFLD_119_LEN);
       localATFld119Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkATFld119Constraints(char[] value) {
   			return super.checkConstraints(value , 20 ,false, false);
   }
    /**
	 *	refreshATFld119 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshATFld119() {	 
   		return (substring(getStringValue(),beginATFld119,beginATFld119 + A_TFLD_119_LEN));
   	}
     int localATFld219Counter = -1;
     public boolean isATFld219Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localATFld219Counter != sharedCounter;
         localATFld219Counter = sharedCounter; return hasModified;
     }
	protected static final int A_TFLD_219_LEN = 40;
	/**
	 * 	serialize this ATFld219
	 */
   protected void serializeATFld219(char[] aTFld219) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(aTFld219,0,getStringValue(),beginATFld219,A_TFLD_219_LEN);
       localATFld219Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkATFld219Constraints(char[] value) {
   			return super.checkConstraints(value , 40 ,false, false);
   }
    /**
	 *	refreshATFld219 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshATFld219() {	 
   		return (substring(getStringValue(),beginATFld219,beginATFld219 + A_TFLD_219_LEN));
   	}




}
  
