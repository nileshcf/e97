package com.cloudframe.app.refmod2.dto.serialize;

/**
*  The class Wse210aTSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:36. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Wse210aTSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Wse210aTSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WSE_210A_T_LENGTH = 60;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginWse210aTFld1;
            protected  int beginWse210aTFld2;
	
	/**
	* Constructor for Wse210aTSerialized
	**/
    public Wse210aTSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Wse210aTSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Wse210aTSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Wse210aTSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,5); // serialize this field at offset 5 by default 
    }
    
	/**
	* sets parent for this Wse210aTSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 5 by default
    }    
	/**
	* initializes the field in Wse210aTSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(WSE_210A_T_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginWse210aTFld1 = getStartOffset() + 0;	// set offset for serialization
  
             beginWse210aTFld2 = getStartOffset() + 30;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localWse210aTFld1Counter = -1;
     public boolean isWse210aTFld1Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse210aTFld1Counter != sharedCounter;
         localWse210aTFld1Counter = sharedCounter; return hasModified;
     }
	protected static final int WSE_210A_TFLD_1_LEN = 30;
	/**
	 * 	serialize this Wse210aTFld1
	 */
   protected void serializeWse210aTFld1(char[] wse210aTFld1) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wse210aTFld1,0,getStringValue(),beginWse210aTFld1,WSE_210A_TFLD_1_LEN);
       localWse210aTFld1Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWse210aTFld1Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
    /**
	 *	refreshWse210aTFld1 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWse210aTFld1() {	 
   		return (substring(getStringValue(),beginWse210aTFld1,beginWse210aTFld1 + WSE_210A_TFLD_1_LEN));
   	}
     int localWse210aTFld2Counter = -1;
     public boolean isWse210aTFld2Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse210aTFld2Counter != sharedCounter;
         localWse210aTFld2Counter = sharedCounter; return hasModified;
     }
	protected static final int WSE_210A_TFLD_2_LEN = 30;
	/**
	 * 	serialize this Wse210aTFld2
	 */
   protected void serializeWse210aTFld2(char[] wse210aTFld2) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wse210aTFld2,0,getStringValue(),beginWse210aTFld2,WSE_210A_TFLD_2_LEN);
       localWse210aTFld2Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWse210aTFld2Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
    /**
	 *	refreshWse210aTFld2 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWse210aTFld2() {	 
   		return (substring(getStringValue(),beginWse210aTFld2,beginWse210aTFld2 + WSE_210A_TFLD_2_LEN));
   	}




}
  
