package com.cloudframe.app.refmod2.dto.serialize;

/**
*  The class BS29Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:29. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class BS29Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(BS29Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int B_S_29_LENGTH = 70;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginBSFld129;
            protected  int beginBSFld229;
	
	/**
	* Constructor for BS29Serialized
	**/
    public BS29Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for BS29Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public BS29Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this BS29Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,3); // serialize this field at offset 3 by default 
    }
    
	/**
	* sets parent for this BS29Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 3 by default
    }    
	/**
	* initializes the field in BS29Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(B_S_29_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginBSFld129 = getStartOffset() + 0;	// set offset for serialization
  
             beginBSFld229 = getStartOffset() + 30;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localBSFld129Counter = -1;
     public boolean isBSFld129Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBSFld129Counter != sharedCounter;
         localBSFld129Counter = sharedCounter; return hasModified;
     }
	protected static final int B_SFLD_129_LEN = 30;
	/**
	 * 	serialize this BSFld129
	 */
   protected void serializeBSFld129(char[] bSFld129) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bSFld129,0,getStringValue(),beginBSFld129,B_SFLD_129_LEN);
       localBSFld129Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBSFld129Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
    /**
	 *	refreshBSFld129 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBSFld129() {	 
   		return (substring(getStringValue(),beginBSFld129,beginBSFld129 + B_SFLD_129_LEN));
   	}
     int localBSFld229Counter = -1;
     public boolean isBSFld229Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBSFld229Counter != sharedCounter;
         localBSFld229Counter = sharedCounter; return hasModified;
     }
	protected static final int B_SFLD_229_LEN = 40;
	/**
	 * 	serialize this BSFld229
	 */
   protected void serializeBSFld229(char[] bSFld229) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bSFld229,0,getStringValue(),beginBSFld229,B_SFLD_229_LEN);
       localBSFld229Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBSFld229Constraints(char[] value) {
   			return super.checkConstraints(value , 40 ,false, false);
   }
    /**
	 *	refreshBSFld229 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBSFld229() {	 
   		return (substring(getStringValue(),beginBSFld229,beginBSFld229 + B_SFLD_229_LEN));
   	}




}
  
