package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Wse18aTSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:36. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Wse18aTSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Wse18aTSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WSE_18A_T_LENGTH = 60;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginWse18aTFld1;
            protected  int beginWse18aTFld2;
	
	/**
	* Constructor for Wse18aTSerialized
	**/
    public Wse18aTSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Wse18aTSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Wse18aTSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Wse18aTSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,5); // serialize this field at offset 5 by default 
    }
    
	/**
	* sets parent for this Wse18aTSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 5 by default
    }    
	/**
	* initializes the field in Wse18aTSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(WSE_18A_T_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginWse18aTFld1 = getStartOffset() + 0;	// set offset for serialization
  
             beginWse18aTFld2 = getStartOffset() + 30;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localWse18aTFld1Counter = -1;
     public boolean isWse18aTFld1Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse18aTFld1Counter != sharedCounter;
         localWse18aTFld1Counter = sharedCounter; return hasModified;
     }
	protected static final int WSE_18A_TFLD_1_LEN = 30;
	/**
	 * 	serialize this Wse18aTFld1
	 */
   protected void serializeWse18aTFld1(char[] wse18aTFld1) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wse18aTFld1,0,getStringValue(),beginWse18aTFld1,WSE_18A_TFLD_1_LEN);
       localWse18aTFld1Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWse18aTFld1Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
    /**
	 *	refreshWse18aTFld1 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWse18aTFld1() {	 
   		return (substring(getStringValue(),beginWse18aTFld1,beginWse18aTFld1 + WSE_18A_TFLD_1_LEN));
   	}
     int localWse18aTFld2Counter = -1;
     public boolean isWse18aTFld2Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse18aTFld2Counter != sharedCounter;
         localWse18aTFld2Counter = sharedCounter; return hasModified;
     }
	protected static final int WSE_18A_TFLD_2_LEN = 30;
	/**
	 * 	serialize this Wse18aTFld2
	 */
   protected void serializeWse18aTFld2(char[] wse18aTFld2) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wse18aTFld2,0,getStringValue(),beginWse18aTFld2,WSE_18A_TFLD_2_LEN);
       localWse18aTFld2Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWse18aTFld2Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
    /**
	 *	refreshWse18aTFld2 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWse18aTFld2() {	 
   		return (substring(getStringValue(),beginWse18aTFld2,beginWse18aTFld2 + WSE_18A_TFLD_2_LEN));
   	}




}
  
