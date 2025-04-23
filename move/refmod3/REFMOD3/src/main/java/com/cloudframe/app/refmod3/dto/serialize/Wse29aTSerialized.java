package com.cloudframe.app.refmod3.dto.serialize;

/**
*  The class Wse29aTSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:24. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Wse29aTSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Wse29aTSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WSE_29A_T_LENGTH = 60;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginWse29aTFld1;
            protected  int beginWse29aTFld2;
	
	/**
	* Constructor for Wse29aTSerialized
	**/
    public Wse29aTSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Wse29aTSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Wse29aTSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Wse29aTSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,5); // serialize this field at offset 5 by default 
    }
    
	/**
	* sets parent for this Wse29aTSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 5 by default
    }    
	/**
	* initializes the field in Wse29aTSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(WSE_29A_T_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginWse29aTFld1 = getStartOffset() + 0;	// set offset for serialization
  
             beginWse29aTFld2 = getStartOffset() + 30;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localWse29aTFld1Counter = -1;
     public boolean isWse29aTFld1Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse29aTFld1Counter != sharedCounter;
         localWse29aTFld1Counter = sharedCounter; return hasModified;
     }
	protected static final int WSE_29A_TFLD_1_LEN = 30;
	/**
	 * 	serialize this Wse29aTFld1
	 */
   protected void serializeWse29aTFld1(char[] wse29aTFld1) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wse29aTFld1,0,getStringValue(),beginWse29aTFld1,WSE_29A_TFLD_1_LEN);
       localWse29aTFld1Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWse29aTFld1Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
    /**
	 *	refreshWse29aTFld1 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWse29aTFld1() {	 
   		return (substring(getStringValue(),beginWse29aTFld1,beginWse29aTFld1 + WSE_29A_TFLD_1_LEN));
   	}
     int localWse29aTFld2Counter = -1;
     public boolean isWse29aTFld2Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse29aTFld2Counter != sharedCounter;
         localWse29aTFld2Counter = sharedCounter; return hasModified;
     }
	protected static final int WSE_29A_TFLD_2_LEN = 30;
	/**
	 * 	serialize this Wse29aTFld2
	 */
   protected void serializeWse29aTFld2(char[] wse29aTFld2) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wse29aTFld2,0,getStringValue(),beginWse29aTFld2,WSE_29A_TFLD_2_LEN);
       localWse29aTFld2Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWse29aTFld2Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
    /**
	 *	refreshWse29aTFld2 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWse29aTFld2() {	 
   		return (substring(getStringValue(),beginWse29aTFld2,beginWse29aTFld2 + WSE_29A_TFLD_2_LEN));
   	}




}
  
