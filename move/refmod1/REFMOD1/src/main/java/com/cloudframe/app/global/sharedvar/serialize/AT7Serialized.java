package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class AT7Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 08:03. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class AT7Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(AT7Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int A_T_7_LENGTH = 60;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginATFld17;
            protected  int beginATFld27;
	
	/**
	* Constructor for AT7Serialized
	**/
    public AT7Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for AT7Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public AT7Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this AT7Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,5); // serialize this field at offset 5 by default 
    }
    
	/**
	* sets parent for this AT7Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 5 by default
    }    
	/**
	* initializes the field in AT7Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(A_T_7_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginATFld17 = getStartOffset() + 0;	// set offset for serialization
  
             beginATFld27 = getStartOffset() + 20;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localATFld17Counter = -1;
     public boolean isATFld17Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localATFld17Counter != sharedCounter;
         localATFld17Counter = sharedCounter; return hasModified;
     }
	protected static final int A_TFLD_17_LEN = 20;
	/**
	 * 	serialize this ATFld17
	 */
   protected void serializeATFld17(char[] aTFld17) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(aTFld17,0,getStringValue(),beginATFld17,A_TFLD_17_LEN);
       localATFld17Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkATFld17Constraints(char[] value) {
   			return super.checkConstraints(value , 20 ,false, false);
   }
    /**
	 *	refreshATFld17 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshATFld17() {	 
   		return (substring(getStringValue(),beginATFld17,beginATFld17 + A_TFLD_17_LEN));
   	}
     int localATFld27Counter = -1;
     public boolean isATFld27Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localATFld27Counter != sharedCounter;
         localATFld27Counter = sharedCounter; return hasModified;
     }
	protected static final int A_TFLD_27_LEN = 40;
	/**
	 * 	serialize this ATFld27
	 */
   protected void serializeATFld27(char[] aTFld27) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(aTFld27,0,getStringValue(),beginATFld27,A_TFLD_27_LEN);
       localATFld27Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkATFld27Constraints(char[] value) {
   			return super.checkConstraints(value , 40 ,false, false);
   }
    /**
	 *	refreshATFld27 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshATFld27() {	 
   		return (substring(getStringValue(),beginATFld27,beginATFld27 + A_TFLD_27_LEN));
   	}




}
  
