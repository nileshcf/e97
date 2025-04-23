package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Wse9aTSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:26. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Wse9aTSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Wse9aTSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WSE_9A_T_LENGTH = 60;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginWse9aTFld1;
            protected  int beginWse9aTFld2;
	
	/**
	* Constructor for Wse9aTSerialized
	**/
    public Wse9aTSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Wse9aTSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Wse9aTSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Wse9aTSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,5); // serialize this field at offset 5 by default 
    }
    
	/**
	* sets parent for this Wse9aTSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 5 by default
    }    
	/**
	* initializes the field in Wse9aTSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(WSE_9A_T_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginWse9aTFld1 = getStartOffset() + 0;	// set offset for serialization
  
             beginWse9aTFld2 = getStartOffset() + 30;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localWse9aTFld1Counter = -1;
     public boolean isWse9aTFld1Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse9aTFld1Counter != sharedCounter;
         localWse9aTFld1Counter = sharedCounter; return hasModified;
     }
	protected static final int WSE_9A_TFLD_1_LEN = 30;
	/**
	 * 	serialize this Wse9aTFld1
	 */
   protected void serializeWse9aTFld1(char[] wse9aTFld1) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wse9aTFld1,0,getStringValue(),beginWse9aTFld1,WSE_9A_TFLD_1_LEN);
       localWse9aTFld1Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWse9aTFld1Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
    /**
	 *	refreshWse9aTFld1 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWse9aTFld1() {	 
   		return (substring(getStringValue(),beginWse9aTFld1,beginWse9aTFld1 + WSE_9A_TFLD_1_LEN));
   	}
     int localWse9aTFld2Counter = -1;
     public boolean isWse9aTFld2Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse9aTFld2Counter != sharedCounter;
         localWse9aTFld2Counter = sharedCounter; return hasModified;
     }
	protected static final int WSE_9A_TFLD_2_LEN = 30;
	/**
	 * 	serialize this Wse9aTFld2
	 */
   protected void serializeWse9aTFld2(char[] wse9aTFld2) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wse9aTFld2,0,getStringValue(),beginWse9aTFld2,WSE_9A_TFLD_2_LEN);
       localWse9aTFld2Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWse9aTFld2Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
    /**
	 *	refreshWse9aTFld2 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWse9aTFld2() {	 
   		return (substring(getStringValue(),beginWse9aTFld2,beginWse9aTFld2 + WSE_9A_TFLD_2_LEN));
   	}




}
  
