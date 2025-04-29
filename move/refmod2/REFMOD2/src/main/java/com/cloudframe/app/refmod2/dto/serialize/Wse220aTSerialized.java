package com.cloudframe.app.refmod2.dto.serialize;

/**
*  The class Wse220aTSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:29. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Wse220aTSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Wse220aTSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WSE_220A_T_LENGTH = 60;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginWse220aTFld1;
            protected  int beginWse220aTFld2;
	
	/**
	* Constructor for Wse220aTSerialized
	**/
    public Wse220aTSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Wse220aTSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Wse220aTSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Wse220aTSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,5); // serialize this field at offset 5 by default 
    }
    
	/**
	* sets parent for this Wse220aTSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 5 by default
    }    
	/**
	* initializes the field in Wse220aTSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(WSE_220A_T_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginWse220aTFld1 = getStartOffset() + 0;	// set offset for serialization
  
             beginWse220aTFld2 = getStartOffset() + 30;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localWse220aTFld1Counter = -1;
     public boolean isWse220aTFld1Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse220aTFld1Counter != sharedCounter;
         localWse220aTFld1Counter = sharedCounter; return hasModified;
     }
	protected static final int WSE_220A_TFLD_1_LEN = 30;
	/**
	 * 	serialize this Wse220aTFld1
	 */
   protected void serializeWse220aTFld1(char[] wse220aTFld1) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wse220aTFld1,0,getStringValue(),beginWse220aTFld1,WSE_220A_TFLD_1_LEN);
       localWse220aTFld1Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWse220aTFld1Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
    /**
	 *	refreshWse220aTFld1 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWse220aTFld1() {	 
   		return (substring(getStringValue(),beginWse220aTFld1,beginWse220aTFld1 + WSE_220A_TFLD_1_LEN));
   	}
     int localWse220aTFld2Counter = -1;
     public boolean isWse220aTFld2Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse220aTFld2Counter != sharedCounter;
         localWse220aTFld2Counter = sharedCounter; return hasModified;
     }
	protected static final int WSE_220A_TFLD_2_LEN = 30;
	/**
	 * 	serialize this Wse220aTFld2
	 */
   protected void serializeWse220aTFld2(char[] wse220aTFld2) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wse220aTFld2,0,getStringValue(),beginWse220aTFld2,WSE_220A_TFLD_2_LEN);
       localWse220aTFld2Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWse220aTFld2Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
    /**
	 *	refreshWse220aTFld2 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWse220aTFld2() {	 
   		return (substring(getStringValue(),beginWse220aTFld2,beginWse220aTFld2 + WSE_220A_TFLD_2_LEN));
   	}




}
  
