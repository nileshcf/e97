package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Wse16aTSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:01. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Wse16aTSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Wse16aTSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WSE_16A_T_LENGTH = 60;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginWse16aTFld1;
            protected  int beginWse16aTFld2;
	
	/**
	* Constructor for Wse16aTSerialized
	**/
    public Wse16aTSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Wse16aTSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Wse16aTSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Wse16aTSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this Wse16aTSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in Wse16aTSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(WSE_16A_T_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginWse16aTFld1 = getStartOffset() + 0;	// set offset for serialization
  
             beginWse16aTFld2 = getStartOffset() + 30;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localWse16aTFld1Counter = -1;
     public boolean isWse16aTFld1Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse16aTFld1Counter != sharedCounter;
         localWse16aTFld1Counter = sharedCounter; return hasModified;
     }
	protected static final int WSE_16A_TFLD_1_LEN = 30;
	/**
	 * 	serialize this Wse16aTFld1
	 */
   protected void serializeWse16aTFld1(char[] wse16aTFld1) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wse16aTFld1,0,getStringValue(),beginWse16aTFld1,WSE_16A_TFLD_1_LEN);
       localWse16aTFld1Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWse16aTFld1Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
    /**
	 *	refreshWse16aTFld1 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWse16aTFld1() {	 
   		return (substring(getStringValue(),beginWse16aTFld1,beginWse16aTFld1 + WSE_16A_TFLD_1_LEN));
   	}
     int localWse16aTFld2Counter = -1;
     public boolean isWse16aTFld2Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse16aTFld2Counter != sharedCounter;
         localWse16aTFld2Counter = sharedCounter; return hasModified;
     }
	protected static final int WSE_16A_TFLD_2_LEN = 30;
	/**
	 * 	serialize this Wse16aTFld2
	 */
   protected void serializeWse16aTFld2(char[] wse16aTFld2) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wse16aTFld2,0,getStringValue(),beginWse16aTFld2,WSE_16A_TFLD_2_LEN);
       localWse16aTFld2Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWse16aTFld2Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
    /**
	 *	refreshWse16aTFld2 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWse16aTFld2() {	 
   		return (substring(getStringValue(),beginWse16aTFld2,beginWse16aTFld2 + WSE_16A_TFLD_2_LEN));
   	}




}
  
