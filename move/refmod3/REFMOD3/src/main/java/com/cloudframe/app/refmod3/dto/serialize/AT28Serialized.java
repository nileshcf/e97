package com.cloudframe.app.refmod3.dto.serialize;

/**
*  The class AT28Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 10:59. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class AT28Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(AT28Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int A_T_28_LENGTH = 60;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginATFld128;
            protected  int beginATFld228;
	
	/**
	* Constructor for AT28Serialized
	**/
    public AT28Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for AT28Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public AT28Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this AT28Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,5); // serialize this field at offset 5 by default 
    }
    
	/**
	* sets parent for this AT28Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 5 by default
    }    
	/**
	* initializes the field in AT28Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(A_T_28_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginATFld128 = getStartOffset() + 0;	// set offset for serialization
  
             beginATFld228 = getStartOffset() + 20;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localATFld128Counter = -1;
     public boolean isATFld128Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localATFld128Counter != sharedCounter;
         localATFld128Counter = sharedCounter; return hasModified;
     }
	protected static final int A_TFLD_128_LEN = 20;
	/**
	 * 	serialize this ATFld128
	 */
   protected void serializeATFld128(char[] aTFld128) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(aTFld128,0,getStringValue(),beginATFld128,A_TFLD_128_LEN);
       localATFld128Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkATFld128Constraints(char[] value) {
   			return super.checkConstraints(value , 20 ,false, false);
   }
    /**
	 *	refreshATFld128 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshATFld128() {	 
   		return (substring(getStringValue(),beginATFld128,beginATFld128 + A_TFLD_128_LEN));
   	}
     int localATFld228Counter = -1;
     public boolean isATFld228Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localATFld228Counter != sharedCounter;
         localATFld228Counter = sharedCounter; return hasModified;
     }
	protected static final int A_TFLD_228_LEN = 40;
	/**
	 * 	serialize this ATFld228
	 */
   protected void serializeATFld228(char[] aTFld228) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(aTFld228,0,getStringValue(),beginATFld228,A_TFLD_228_LEN);
       localATFld228Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkATFld228Constraints(char[] value) {
   			return super.checkConstraints(value , 40 ,false, false);
   }
    /**
	 *	refreshATFld228 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshATFld228() {	 
   		return (substring(getStringValue(),beginATFld228,beginATFld228 + A_TFLD_228_LEN));
   	}




}
  
