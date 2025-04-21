package com.cloudframe.app.refmod2.dto.serialize;

/**
*  The class BS25Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:00. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class BS25Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(BS25Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int B_S_25_LENGTH = 70;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginBSFld125;
            protected  int beginBSFld225;
	
	/**
	* Constructor for BS25Serialized
	**/
    public BS25Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for BS25Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public BS25Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this BS25Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,3); // serialize this field at offset 3 by default 
    }
    
	/**
	* sets parent for this BS25Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 3 by default
    }    
	/**
	* initializes the field in BS25Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(B_S_25_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginBSFld125 = getStartOffset() + 0;	// set offset for serialization
  
             beginBSFld225 = getStartOffset() + 30;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localBSFld125Counter = -1;
     public boolean isBSFld125Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBSFld125Counter != sharedCounter;
         localBSFld125Counter = sharedCounter; return hasModified;
     }
	protected static final int B_SFLD_125_LEN = 30;
	/**
	 * 	serialize this BSFld125
	 */
   protected void serializeBSFld125(char[] bSFld125) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bSFld125,0,getStringValue(),beginBSFld125,B_SFLD_125_LEN);
       localBSFld125Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBSFld125Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
    /**
	 *	refreshBSFld125 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBSFld125() {	 
   		return (substring(getStringValue(),beginBSFld125,beginBSFld125 + B_SFLD_125_LEN));
   	}
     int localBSFld225Counter = -1;
     public boolean isBSFld225Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBSFld225Counter != sharedCounter;
         localBSFld225Counter = sharedCounter; return hasModified;
     }
	protected static final int B_SFLD_225_LEN = 40;
	/**
	 * 	serialize this BSFld225
	 */
   protected void serializeBSFld225(char[] bSFld225) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bSFld225,0,getStringValue(),beginBSFld225,B_SFLD_225_LEN);
       localBSFld225Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBSFld225Constraints(char[] value) {
   			return super.checkConstraints(value , 40 ,false, false);
   }
    /**
	 *	refreshBSFld225 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBSFld225() {	 
   		return (substring(getStringValue(),beginBSFld225,beginBSFld225 + B_SFLD_225_LEN));
   	}




}
  
