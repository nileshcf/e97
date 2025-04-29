package com.cloudframe.app.refmod1.dto.serialize;

/**
*  The class Wse2aTSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:29. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Wse2aTSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Wse2aTSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WSE_2A_T_LENGTH = 60;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginWse2aTFld1;
            protected  int beginWse2aTFld2;
	
	/**
	* Constructor for Wse2aTSerialized
	**/
    public Wse2aTSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Wse2aTSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Wse2aTSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Wse2aTSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this Wse2aTSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in Wse2aTSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(WSE_2A_T_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginWse2aTFld1 = getStartOffset() + 0;	// set offset for serialization
  
             beginWse2aTFld2 = getStartOffset() + 20;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localWse2aTFld1Counter = -1;
     public boolean isWse2aTFld1Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse2aTFld1Counter != sharedCounter;
         localWse2aTFld1Counter = sharedCounter; return hasModified;
     }
	protected static final int WSE_2A_TFLD_1_LEN = 20;
	/**
	 * 	serialize this Wse2aTFld1
	 */
   protected void serializeWse2aTFld1(char[] wse2aTFld1) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wse2aTFld1,0,getStringValue(),beginWse2aTFld1,WSE_2A_TFLD_1_LEN);
       localWse2aTFld1Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWse2aTFld1Constraints(char[] value) {
   			return super.checkConstraints(value , 20 ,false, false);
   }
    /**
	 *	refreshWse2aTFld1 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWse2aTFld1() {	 
   		return (substring(getStringValue(),beginWse2aTFld1,beginWse2aTFld1 + WSE_2A_TFLD_1_LEN));
   	}
     int localWse2aTFld2Counter = -1;
     public boolean isWse2aTFld2Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse2aTFld2Counter != sharedCounter;
         localWse2aTFld2Counter = sharedCounter; return hasModified;
     }
	protected static final int WSE_2A_TFLD_2_LEN = 40;
	/**
	 * 	serialize this Wse2aTFld2
	 */
   protected void serializeWse2aTFld2(char[] wse2aTFld2) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wse2aTFld2,0,getStringValue(),beginWse2aTFld2,WSE_2A_TFLD_2_LEN);
       localWse2aTFld2Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWse2aTFld2Constraints(char[] value) {
   			return super.checkConstraints(value , 40 ,false, false);
   }
    /**
	 *	refreshWse2aTFld2 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWse2aTFld2() {	 
   		return (substring(getStringValue(),beginWse2aTFld2,beginWse2aTFld2 + WSE_2A_TFLD_2_LEN));
   	}




}
  
