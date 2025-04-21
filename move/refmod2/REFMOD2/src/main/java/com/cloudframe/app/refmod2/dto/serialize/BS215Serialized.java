package com.cloudframe.app.refmod2.dto.serialize;

/**
*  The class BS215Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:00. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class BS215Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(BS215Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int B_S_215_LENGTH = 70;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginBSFld1215;
            protected  int beginBSFld2215;
	
	/**
	* Constructor for BS215Serialized
	**/
    public BS215Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for BS215Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public BS215Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this BS215Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,3); // serialize this field at offset 3 by default 
    }
    
	/**
	* sets parent for this BS215Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 3 by default
    }    
	/**
	* initializes the field in BS215Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(B_S_215_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginBSFld1215 = getStartOffset() + 0;	// set offset for serialization
  
             beginBSFld2215 = getStartOffset() + 30;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localBSFld1215Counter = -1;
     public boolean isBSFld1215Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBSFld1215Counter != sharedCounter;
         localBSFld1215Counter = sharedCounter; return hasModified;
     }
	protected static final int B_SFLD_1215_LEN = 30;
	/**
	 * 	serialize this BSFld1215
	 */
   protected void serializeBSFld1215(char[] bSFld1215) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bSFld1215,0,getStringValue(),beginBSFld1215,B_SFLD_1215_LEN);
       localBSFld1215Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBSFld1215Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
    /**
	 *	refreshBSFld1215 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBSFld1215() {	 
   		return (substring(getStringValue(),beginBSFld1215,beginBSFld1215 + B_SFLD_1215_LEN));
   	}
     int localBSFld2215Counter = -1;
     public boolean isBSFld2215Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBSFld2215Counter != sharedCounter;
         localBSFld2215Counter = sharedCounter; return hasModified;
     }
	protected static final int B_SFLD_2215_LEN = 40;
	/**
	 * 	serialize this BSFld2215
	 */
   protected void serializeBSFld2215(char[] bSFld2215) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bSFld2215,0,getStringValue(),beginBSFld2215,B_SFLD_2215_LEN);
       localBSFld2215Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBSFld2215Constraints(char[] value) {
   			return super.checkConstraints(value , 40 ,false, false);
   }
    /**
	 *	refreshBSFld2215 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBSFld2215() {	 
   		return (substring(getStringValue(),beginBSFld2215,beginBSFld2215 + B_SFLD_2215_LEN));
   	}




}
  
