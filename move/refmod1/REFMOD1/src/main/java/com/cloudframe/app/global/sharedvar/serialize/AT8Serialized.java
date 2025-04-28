package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class AT8Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 08:03. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class AT8Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(AT8Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int A_T_8_LENGTH = 60;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginATFld18;
            protected  int beginATFld28;
	
	/**
	* Constructor for AT8Serialized
	**/
    public AT8Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for AT8Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public AT8Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this AT8Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,5); // serialize this field at offset 5 by default 
    }
    
	/**
	* sets parent for this AT8Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 5 by default
    }    
	/**
	* initializes the field in AT8Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(A_T_8_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginATFld18 = getStartOffset() + 0;	// set offset for serialization
  
             beginATFld28 = getStartOffset() + 20;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localATFld18Counter = -1;
     public boolean isATFld18Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localATFld18Counter != sharedCounter;
         localATFld18Counter = sharedCounter; return hasModified;
     }
	protected static final int A_TFLD_18_LEN = 20;
	/**
	 * 	serialize this ATFld18
	 */
   protected void serializeATFld18(char[] aTFld18) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(aTFld18,0,getStringValue(),beginATFld18,A_TFLD_18_LEN);
       localATFld18Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkATFld18Constraints(char[] value) {
   			return super.checkConstraints(value , 20 ,false, false);
   }
    /**
	 *	refreshATFld18 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshATFld18() {	 
   		return (substring(getStringValue(),beginATFld18,beginATFld18 + A_TFLD_18_LEN));
   	}
     int localATFld28Counter = -1;
     public boolean isATFld28Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localATFld28Counter != sharedCounter;
         localATFld28Counter = sharedCounter; return hasModified;
     }
	protected static final int A_TFLD_28_LEN = 40;
	/**
	 * 	serialize this ATFld28
	 */
   protected void serializeATFld28(char[] aTFld28) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(aTFld28,0,getStringValue(),beginATFld28,A_TFLD_28_LEN);
       localATFld28Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkATFld28Constraints(char[] value) {
   			return super.checkConstraints(value , 40 ,false, false);
   }
    /**
	 *	refreshATFld28 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshATFld28() {	 
   		return (substring(getStringValue(),beginATFld28,beginATFld28 + A_TFLD_28_LEN));
   	}




}
  
