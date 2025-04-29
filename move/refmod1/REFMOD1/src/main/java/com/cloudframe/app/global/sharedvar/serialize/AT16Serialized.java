package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class AT16Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:23. using version 5.0.0.257
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class AT16Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(AT16Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int A_T_16_LENGTH = 60;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginATFld116;
            protected  int beginATFld216;
	
	/**
	* Constructor for AT16Serialized
	**/
    public AT16Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for AT16Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public AT16Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this AT16Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this AT16Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in AT16Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(A_T_16_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginATFld116 = getStartOffset() + 0;	// set offset for serialization
  
             beginATFld216 = getStartOffset() + 20;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localATFld116Counter = -1;
     public boolean isATFld116Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localATFld116Counter != sharedCounter;
         localATFld116Counter = sharedCounter; return hasModified;
     }
	protected static final int A_TFLD_116_LEN = 20;
	/**
	 * 	serialize this ATFld116
	 */
   protected void serializeATFld116(char[] aTFld116) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(aTFld116,0,getStringValue(),beginATFld116,A_TFLD_116_LEN);
       localATFld116Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkATFld116Constraints(char[] value) {
   			return super.checkConstraints(value , 20 ,false, false);
   }
    /**
	 *	refreshATFld116 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshATFld116() {	 
   		return (substring(getStringValue(),beginATFld116,beginATFld116 + A_TFLD_116_LEN));
   	}
     int localATFld216Counter = -1;
     public boolean isATFld216Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localATFld216Counter != sharedCounter;
         localATFld216Counter = sharedCounter; return hasModified;
     }
	protected static final int A_TFLD_216_LEN = 40;
	/**
	 * 	serialize this ATFld216
	 */
   protected void serializeATFld216(char[] aTFld216) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(aTFld216,0,getStringValue(),beginATFld216,A_TFLD_216_LEN);
       localATFld216Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkATFld216Constraints(char[] value) {
   			return super.checkConstraints(value , 40 ,false, false);
   }
    /**
	 *	refreshATFld216 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshATFld216() {	 
   		return (substring(getStringValue(),beginATFld216,beginATFld216 + A_TFLD_216_LEN));
   	}




}
  
