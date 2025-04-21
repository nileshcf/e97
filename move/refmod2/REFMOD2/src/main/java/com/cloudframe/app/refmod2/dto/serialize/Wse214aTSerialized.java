package com.cloudframe.app.refmod2.dto.serialize;

/**
*  The class Wse214aTSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:00. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Wse214aTSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Wse214aTSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WSE_214A_T_LENGTH = 60;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginWse214aTFld1;
            protected  int beginWse214aTFld2;
	
	/**
	* Constructor for Wse214aTSerialized
	**/
    public Wse214aTSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Wse214aTSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Wse214aTSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Wse214aTSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,5); // serialize this field at offset 5 by default 
    }
    
	/**
	* sets parent for this Wse214aTSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 5 by default
    }    
	/**
	* initializes the field in Wse214aTSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(WSE_214A_T_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginWse214aTFld1 = getStartOffset() + 0;	// set offset for serialization
  
             beginWse214aTFld2 = getStartOffset() + 30;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localWse214aTFld1Counter = -1;
     public boolean isWse214aTFld1Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse214aTFld1Counter != sharedCounter;
         localWse214aTFld1Counter = sharedCounter; return hasModified;
     }
	protected static final int WSE_214A_TFLD_1_LEN = 30;
	/**
	 * 	serialize this Wse214aTFld1
	 */
   protected void serializeWse214aTFld1(char[] wse214aTFld1) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wse214aTFld1,0,getStringValue(),beginWse214aTFld1,WSE_214A_TFLD_1_LEN);
       localWse214aTFld1Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWse214aTFld1Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
    /**
	 *	refreshWse214aTFld1 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWse214aTFld1() {	 
   		return (substring(getStringValue(),beginWse214aTFld1,beginWse214aTFld1 + WSE_214A_TFLD_1_LEN));
   	}
     int localWse214aTFld2Counter = -1;
     public boolean isWse214aTFld2Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse214aTFld2Counter != sharedCounter;
         localWse214aTFld2Counter = sharedCounter; return hasModified;
     }
	protected static final int WSE_214A_TFLD_2_LEN = 30;
	/**
	 * 	serialize this Wse214aTFld2
	 */
   protected void serializeWse214aTFld2(char[] wse214aTFld2) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wse214aTFld2,0,getStringValue(),beginWse214aTFld2,WSE_214A_TFLD_2_LEN);
       localWse214aTFld2Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWse214aTFld2Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
    /**
	 *	refreshWse214aTFld2 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWse214aTFld2() {	 
   		return (substring(getStringValue(),beginWse214aTFld2,beginWse214aTFld2 + WSE_214A_TFLD_2_LEN));
   	}




}
  
