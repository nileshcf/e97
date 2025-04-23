package com.cloudframe.app.refmod2.dto.serialize;

/**
*  The class AT29Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:25. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class AT29Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(AT29Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int A_T_29_LENGTH = 60;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginATFld129;
            protected  int beginATFld229;
	
	/**
	* Constructor for AT29Serialized
	**/
    public AT29Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for AT29Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public AT29Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this AT29Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,5); // serialize this field at offset 5 by default 
    }
    
	/**
	* sets parent for this AT29Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 5 by default
    }    
	/**
	* initializes the field in AT29Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(A_T_29_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginATFld129 = getStartOffset() + 0;	// set offset for serialization
  
             beginATFld229 = getStartOffset() + 20;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localATFld129Counter = -1;
     public boolean isATFld129Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localATFld129Counter != sharedCounter;
         localATFld129Counter = sharedCounter; return hasModified;
     }
	protected static final int A_TFLD_129_LEN = 20;
	/**
	 * 	serialize this ATFld129
	 */
   protected void serializeATFld129(char[] aTFld129) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(aTFld129,0,getStringValue(),beginATFld129,A_TFLD_129_LEN);
       localATFld129Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkATFld129Constraints(char[] value) {
   			return super.checkConstraints(value , 20 ,false, false);
   }
    /**
	 *	refreshATFld129 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshATFld129() {	 
   		return (substring(getStringValue(),beginATFld129,beginATFld129 + A_TFLD_129_LEN));
   	}
     int localATFld229Counter = -1;
     public boolean isATFld229Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localATFld229Counter != sharedCounter;
         localATFld229Counter = sharedCounter; return hasModified;
     }
	protected static final int A_TFLD_229_LEN = 40;
	/**
	 * 	serialize this ATFld229
	 */
   protected void serializeATFld229(char[] aTFld229) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(aTFld229,0,getStringValue(),beginATFld229,A_TFLD_229_LEN);
       localATFld229Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkATFld229Constraints(char[] value) {
   			return super.checkConstraints(value , 40 ,false, false);
   }
    /**
	 *	refreshATFld229 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshATFld229() {	 
   		return (substring(getStringValue(),beginATFld229,beginATFld229 + A_TFLD_229_LEN));
   	}




}
  
