package com.cloudframe.app.refmod3.dto.serialize;

/**
*  The class Wse219aTSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:04. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Wse219aTSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Wse219aTSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WSE_219A_T_LENGTH = 60;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginWse219aTFld1;
            protected  int beginWse219aTFld2;
	
	/**
	* Constructor for Wse219aTSerialized
	**/
    public Wse219aTSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Wse219aTSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Wse219aTSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Wse219aTSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,5); // serialize this field at offset 5 by default 
    }
    
	/**
	* sets parent for this Wse219aTSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 5 by default
    }    
	/**
	* initializes the field in Wse219aTSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(WSE_219A_T_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginWse219aTFld1 = getStartOffset() + 0;	// set offset for serialization
  
             beginWse219aTFld2 = getStartOffset() + 30;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localWse219aTFld1Counter = -1;
     public boolean isWse219aTFld1Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse219aTFld1Counter != sharedCounter;
         localWse219aTFld1Counter = sharedCounter; return hasModified;
     }
	protected static final int WSE_219A_TFLD_1_LEN = 30;
	/**
	 * 	serialize this Wse219aTFld1
	 */
   protected void serializeWse219aTFld1(char[] wse219aTFld1) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wse219aTFld1,0,getStringValue(),beginWse219aTFld1,WSE_219A_TFLD_1_LEN);
       localWse219aTFld1Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWse219aTFld1Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
    /**
	 *	refreshWse219aTFld1 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWse219aTFld1() {	 
   		return (substring(getStringValue(),beginWse219aTFld1,beginWse219aTFld1 + WSE_219A_TFLD_1_LEN));
   	}
     int localWse219aTFld2Counter = -1;
     public boolean isWse219aTFld2Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse219aTFld2Counter != sharedCounter;
         localWse219aTFld2Counter = sharedCounter; return hasModified;
     }
	protected static final int WSE_219A_TFLD_2_LEN = 30;
	/**
	 * 	serialize this Wse219aTFld2
	 */
   protected void serializeWse219aTFld2(char[] wse219aTFld2) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wse219aTFld2,0,getStringValue(),beginWse219aTFld2,WSE_219A_TFLD_2_LEN);
       localWse219aTFld2Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWse219aTFld2Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
    /**
	 *	refreshWse219aTFld2 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWse219aTFld2() {	 
   		return (substring(getStringValue(),beginWse219aTFld2,beginWse219aTFld2 + WSE_219A_TFLD_2_LEN));
   	}




}
  
