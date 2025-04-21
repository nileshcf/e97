package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Wse9bSSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:06. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Wse9bSSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Wse9bSSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WSE_9B_S_LENGTH = 60;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginWse9bSFld1;
            protected  int beginWse9bSFld2;
	
	/**
	* Constructor for Wse9bSSerialized
	**/
    public Wse9bSSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Wse9bSSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Wse9bSSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Wse9bSSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,3); // serialize this field at offset 3 by default 
    }
    
	/**
	* sets parent for this Wse9bSSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 3 by default
    }    
	/**
	* initializes the field in Wse9bSSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(WSE_9B_S_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginWse9bSFld1 = getStartOffset() + 0;	// set offset for serialization
  
             beginWse9bSFld2 = getStartOffset() + 30;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localWse9bSFld1Counter = -1;
     public boolean isWse9bSFld1Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse9bSFld1Counter != sharedCounter;
         localWse9bSFld1Counter = sharedCounter; return hasModified;
     }
	protected static final int WSE_9B_SFLD_1_LEN = 30;
	/**
	 * 	serialize this Wse9bSFld1
	 */
   protected void serializeWse9bSFld1(char[] wse9bSFld1) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wse9bSFld1,0,getStringValue(),beginWse9bSFld1,WSE_9B_SFLD_1_LEN);
       localWse9bSFld1Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWse9bSFld1Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
    /**
	 *	refreshWse9bSFld1 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWse9bSFld1() {	 
   		return (substring(getStringValue(),beginWse9bSFld1,beginWse9bSFld1 + WSE_9B_SFLD_1_LEN));
   	}
     int localWse9bSFld2Counter = -1;
     public boolean isWse9bSFld2Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse9bSFld2Counter != sharedCounter;
         localWse9bSFld2Counter = sharedCounter; return hasModified;
     }
	protected static final int WSE_9B_SFLD_2_LEN = 30;
	/**
	 * 	serialize this Wse9bSFld2
	 */
   protected void serializeWse9bSFld2(char[] wse9bSFld2) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wse9bSFld2,0,getStringValue(),beginWse9bSFld2,WSE_9B_SFLD_2_LEN);
       localWse9bSFld2Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWse9bSFld2Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
    /**
	 *	refreshWse9bSFld2 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWse9bSFld2() {	 
   		return (substring(getStringValue(),beginWse9bSFld2,beginWse9bSFld2 + WSE_9B_SFLD_2_LEN));
   	}




}
  
