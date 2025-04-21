package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class AT6Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:06. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class AT6Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(AT6Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int A_T_6_LENGTH = 60;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginATFld16;
            protected  int beginATFld26;
	
	/**
	* Constructor for AT6Serialized
	**/
    public AT6Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for AT6Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public AT6Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this AT6Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this AT6Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in AT6Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(A_T_6_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginATFld16 = getStartOffset() + 0;	// set offset for serialization
  
             beginATFld26 = getStartOffset() + 20;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localATFld16Counter = -1;
     public boolean isATFld16Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localATFld16Counter != sharedCounter;
         localATFld16Counter = sharedCounter; return hasModified;
     }
	protected static final int A_TFLD_16_LEN = 20;
	/**
	 * 	serialize this ATFld16
	 */
   protected void serializeATFld16(char[] aTFld16) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(aTFld16,0,getStringValue(),beginATFld16,A_TFLD_16_LEN);
       localATFld16Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkATFld16Constraints(char[] value) {
   			return super.checkConstraints(value , 20 ,false, false);
   }
    /**
	 *	refreshATFld16 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshATFld16() {	 
   		return (substring(getStringValue(),beginATFld16,beginATFld16 + A_TFLD_16_LEN));
   	}
     int localATFld26Counter = -1;
     public boolean isATFld26Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localATFld26Counter != sharedCounter;
         localATFld26Counter = sharedCounter; return hasModified;
     }
	protected static final int A_TFLD_26_LEN = 40;
	/**
	 * 	serialize this ATFld26
	 */
   protected void serializeATFld26(char[] aTFld26) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(aTFld26,0,getStringValue(),beginATFld26,A_TFLD_26_LEN);
       localATFld26Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkATFld26Constraints(char[] value) {
   			return super.checkConstraints(value , 40 ,false, false);
   }
    /**
	 *	refreshATFld26 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshATFld26() {	 
   		return (substring(getStringValue(),beginATFld26,beginATFld26 + A_TFLD_26_LEN));
   	}




}
  
