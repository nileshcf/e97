package com.cloudframe.app.refmod3.dto.serialize;

/**
*  The class Wse212aTSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 08:00. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Wse212aTSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Wse212aTSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WSE_212A_T_LENGTH = 60;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginWse212aTFld1;
            protected  int beginWse212aTFld2;
	
	/**
	* Constructor for Wse212aTSerialized
	**/
    public Wse212aTSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Wse212aTSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Wse212aTSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Wse212aTSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,5); // serialize this field at offset 5 by default 
    }
    
	/**
	* sets parent for this Wse212aTSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 5 by default
    }    
	/**
	* initializes the field in Wse212aTSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(WSE_212A_T_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginWse212aTFld1 = getStartOffset() + 0;	// set offset for serialization
  
             beginWse212aTFld2 = getStartOffset() + 30;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localWse212aTFld1Counter = -1;
     public boolean isWse212aTFld1Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse212aTFld1Counter != sharedCounter;
         localWse212aTFld1Counter = sharedCounter; return hasModified;
     }
	protected static final int WSE_212A_TFLD_1_LEN = 30;
	/**
	 * 	serialize this Wse212aTFld1
	 */
   protected void serializeWse212aTFld1(char[] wse212aTFld1) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wse212aTFld1,0,getStringValue(),beginWse212aTFld1,WSE_212A_TFLD_1_LEN);
       localWse212aTFld1Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWse212aTFld1Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
    /**
	 *	refreshWse212aTFld1 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWse212aTFld1() {	 
   		return (substring(getStringValue(),beginWse212aTFld1,beginWse212aTFld1 + WSE_212A_TFLD_1_LEN));
   	}
     int localWse212aTFld2Counter = -1;
     public boolean isWse212aTFld2Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse212aTFld2Counter != sharedCounter;
         localWse212aTFld2Counter = sharedCounter; return hasModified;
     }
	protected static final int WSE_212A_TFLD_2_LEN = 30;
	/**
	 * 	serialize this Wse212aTFld2
	 */
   protected void serializeWse212aTFld2(char[] wse212aTFld2) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wse212aTFld2,0,getStringValue(),beginWse212aTFld2,WSE_212A_TFLD_2_LEN);
       localWse212aTFld2Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWse212aTFld2Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
    /**
	 *	refreshWse212aTFld2 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWse212aTFld2() {	 
   		return (substring(getStringValue(),beginWse212aTFld2,beginWse212aTFld2 + WSE_212A_TFLD_2_LEN));
   	}




}
  
