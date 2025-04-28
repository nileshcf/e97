package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class BS15Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 08:03. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class BS15Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(BS15Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int B_S_15_LENGTH = 70;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginBSFld115;
            protected  int beginBSFld215;
	
	/**
	* Constructor for BS15Serialized
	**/
    public BS15Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for BS15Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public BS15Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this BS15Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,3); // serialize this field at offset 3 by default 
    }
    
	/**
	* sets parent for this BS15Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 3 by default
    }    
	/**
	* initializes the field in BS15Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(B_S_15_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginBSFld115 = getStartOffset() + 0;	// set offset for serialization
  
             beginBSFld215 = getStartOffset() + 30;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localBSFld115Counter = -1;
     public boolean isBSFld115Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBSFld115Counter != sharedCounter;
         localBSFld115Counter = sharedCounter; return hasModified;
     }
	protected static final int B_SFLD_115_LEN = 30;
	/**
	 * 	serialize this BSFld115
	 */
   protected void serializeBSFld115(char[] bSFld115) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bSFld115,0,getStringValue(),beginBSFld115,B_SFLD_115_LEN);
       localBSFld115Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBSFld115Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
    /**
	 *	refreshBSFld115 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBSFld115() {	 
   		return (substring(getStringValue(),beginBSFld115,beginBSFld115 + B_SFLD_115_LEN));
   	}
     int localBSFld215Counter = -1;
     public boolean isBSFld215Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBSFld215Counter != sharedCounter;
         localBSFld215Counter = sharedCounter; return hasModified;
     }
	protected static final int B_SFLD_215_LEN = 40;
	/**
	 * 	serialize this BSFld215
	 */
   protected void serializeBSFld215(char[] bSFld215) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bSFld215,0,getStringValue(),beginBSFld215,B_SFLD_215_LEN);
       localBSFld215Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBSFld215Constraints(char[] value) {
   			return super.checkConstraints(value , 40 ,false, false);
   }
    /**
	 *	refreshBSFld215 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBSFld215() {	 
   		return (substring(getStringValue(),beginBSFld215,beginBSFld215 + B_SFLD_215_LEN));
   	}




}
  
