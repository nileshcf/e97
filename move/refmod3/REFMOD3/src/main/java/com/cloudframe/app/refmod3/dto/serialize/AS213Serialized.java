package com.cloudframe.app.refmod3.dto.serialize;

/**
*  The class AS213Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:10. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class AS213Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(AS213Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int A_S_213_LENGTH = 70;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginASFld1213;
            protected  int beginASFld2213;
	
	/**
	* Constructor for AS213Serialized
	**/
    public AS213Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for AS213Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public AS213Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this AS213Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,3); // serialize this field at offset 3 by default 
    }
    
	/**
	* sets parent for this AS213Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 3 by default
    }    
	/**
	* initializes the field in AS213Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(A_S_213_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginASFld1213 = getStartOffset() + 0;	// set offset for serialization
  
             beginASFld2213 = getStartOffset() + 30;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localASFld1213Counter = -1;
     public boolean isASFld1213Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localASFld1213Counter != sharedCounter;
         localASFld1213Counter = sharedCounter; return hasModified;
     }
	protected static final int A_SFLD_1213_LEN = 30;
	/**
	 * 	serialize this ASFld1213
	 */
   protected void serializeASFld1213(char[] aSFld1213) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(aSFld1213,0,getStringValue(),beginASFld1213,A_SFLD_1213_LEN);
       localASFld1213Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkASFld1213Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
    /**
	 *	refreshASFld1213 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshASFld1213() {	 
   		return (substring(getStringValue(),beginASFld1213,beginASFld1213 + A_SFLD_1213_LEN));
   	}
     int localASFld2213Counter = -1;
     public boolean isASFld2213Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localASFld2213Counter != sharedCounter;
         localASFld2213Counter = sharedCounter; return hasModified;
     }
	protected static final int A_SFLD_2213_LEN = 40;
	/**
	 * 	serialize this ASFld2213
	 */
   protected void serializeASFld2213(char[] aSFld2213) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(aSFld2213,0,getStringValue(),beginASFld2213,A_SFLD_2213_LEN);
       localASFld2213Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkASFld2213Constraints(char[] value) {
   			return super.checkConstraints(value , 40 ,false, false);
   }
    /**
	 *	refreshASFld2213 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshASFld2213() {	 
   		return (substring(getStringValue(),beginASFld2213,beginASFld2213 + A_SFLD_2213_LEN));
   	}




}
  
