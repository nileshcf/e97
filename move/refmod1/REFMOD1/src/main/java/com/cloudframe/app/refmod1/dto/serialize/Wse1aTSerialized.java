package com.cloudframe.app.refmod1.dto.serialize;

/**
*  The class Wse1aTSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:01. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Wse1aTSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Wse1aTSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WSE_1A_T_LENGTH = 60;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginWse1aTFld1;
            protected  int beginWse1aTFld2;
	
	/**
	* Constructor for Wse1aTSerialized
	**/
    public Wse1aTSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Wse1aTSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Wse1aTSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Wse1aTSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this Wse1aTSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in Wse1aTSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(WSE_1A_T_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginWse1aTFld1 = getStartOffset() + 0;	// set offset for serialization
  
             beginWse1aTFld2 = getStartOffset() + 20;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localWse1aTFld1Counter = -1;
     public boolean isWse1aTFld1Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse1aTFld1Counter != sharedCounter;
         localWse1aTFld1Counter = sharedCounter; return hasModified;
     }
	protected static final int WSE_1A_TFLD_1_LEN = 20;
	/**
	 * 	serialize this Wse1aTFld1
	 */
   protected void serializeWse1aTFld1(char[] wse1aTFld1) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wse1aTFld1,0,getStringValue(),beginWse1aTFld1,WSE_1A_TFLD_1_LEN);
       localWse1aTFld1Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWse1aTFld1Constraints(char[] value) {
   			return super.checkConstraints(value , 20 ,false, false);
   }
    /**
	 *	refreshWse1aTFld1 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWse1aTFld1() {	 
   		return (substring(getStringValue(),beginWse1aTFld1,beginWse1aTFld1 + WSE_1A_TFLD_1_LEN));
   	}
     int localWse1aTFld2Counter = -1;
     public boolean isWse1aTFld2Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse1aTFld2Counter != sharedCounter;
         localWse1aTFld2Counter = sharedCounter; return hasModified;
     }
	protected static final int WSE_1A_TFLD_2_LEN = 40;
	/**
	 * 	serialize this Wse1aTFld2
	 */
   protected void serializeWse1aTFld2(char[] wse1aTFld2) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wse1aTFld2,0,getStringValue(),beginWse1aTFld2,WSE_1A_TFLD_2_LEN);
       localWse1aTFld2Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWse1aTFld2Constraints(char[] value) {
   			return super.checkConstraints(value , 40 ,false, false);
   }
    /**
	 *	refreshWse1aTFld2 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWse1aTFld2() {	 
   		return (substring(getStringValue(),beginWse1aTFld2,beginWse1aTFld2 + WSE_1A_TFLD_2_LEN));
   	}




}
  
