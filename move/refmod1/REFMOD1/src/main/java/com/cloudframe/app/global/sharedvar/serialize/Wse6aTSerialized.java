package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Wse6aTSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:01. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Wse6aTSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Wse6aTSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WSE_6A_T_LENGTH = 60;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginWse6aTFld1;
            protected  int beginWse6aTFld2;
	
	/**
	* Constructor for Wse6aTSerialized
	**/
    public Wse6aTSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Wse6aTSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Wse6aTSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Wse6aTSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this Wse6aTSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in Wse6aTSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(WSE_6A_T_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginWse6aTFld1 = getStartOffset() + 0;	// set offset for serialization
  
             beginWse6aTFld2 = getStartOffset() + 20;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localWse6aTFld1Counter = -1;
     public boolean isWse6aTFld1Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse6aTFld1Counter != sharedCounter;
         localWse6aTFld1Counter = sharedCounter; return hasModified;
     }
	protected static final int WSE_6A_TFLD_1_LEN = 20;
	/**
	 * 	serialize this Wse6aTFld1
	 */
   protected void serializeWse6aTFld1(char[] wse6aTFld1) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wse6aTFld1,0,getStringValue(),beginWse6aTFld1,WSE_6A_TFLD_1_LEN);
       localWse6aTFld1Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWse6aTFld1Constraints(char[] value) {
   			return super.checkConstraints(value , 20 ,false, false);
   }
    /**
	 *	refreshWse6aTFld1 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWse6aTFld1() {	 
   		return (substring(getStringValue(),beginWse6aTFld1,beginWse6aTFld1 + WSE_6A_TFLD_1_LEN));
   	}
     int localWse6aTFld2Counter = -1;
     public boolean isWse6aTFld2Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse6aTFld2Counter != sharedCounter;
         localWse6aTFld2Counter = sharedCounter; return hasModified;
     }
	protected static final int WSE_6A_TFLD_2_LEN = 40;
	/**
	 * 	serialize this Wse6aTFld2
	 */
   protected void serializeWse6aTFld2(char[] wse6aTFld2) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wse6aTFld2,0,getStringValue(),beginWse6aTFld2,WSE_6A_TFLD_2_LEN);
       localWse6aTFld2Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWse6aTFld2Constraints(char[] value) {
   			return super.checkConstraints(value , 40 ,false, false);
   }
    /**
	 *	refreshWse6aTFld2 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWse6aTFld2() {	 
   		return (substring(getStringValue(),beginWse6aTFld2,beginWse6aTFld2 + WSE_6A_TFLD_2_LEN));
   	}




}
  
