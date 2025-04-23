package com.cloudframe.app.refmod2.dto.serialize;

/**
*  The class Wse213aTSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:25. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Wse213aTSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Wse213aTSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WSE_213A_T_LENGTH = 60;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginWse213aTFld1;
            protected  int beginWse213aTFld2;
	
	/**
	* Constructor for Wse213aTSerialized
	**/
    public Wse213aTSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Wse213aTSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Wse213aTSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Wse213aTSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,5); // serialize this field at offset 5 by default 
    }
    
	/**
	* sets parent for this Wse213aTSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 5 by default
    }    
	/**
	* initializes the field in Wse213aTSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(WSE_213A_T_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginWse213aTFld1 = getStartOffset() + 0;	// set offset for serialization
  
             beginWse213aTFld2 = getStartOffset() + 30;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localWse213aTFld1Counter = -1;
     public boolean isWse213aTFld1Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse213aTFld1Counter != sharedCounter;
         localWse213aTFld1Counter = sharedCounter; return hasModified;
     }
	protected static final int WSE_213A_TFLD_1_LEN = 30;
	/**
	 * 	serialize this Wse213aTFld1
	 */
   protected void serializeWse213aTFld1(char[] wse213aTFld1) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wse213aTFld1,0,getStringValue(),beginWse213aTFld1,WSE_213A_TFLD_1_LEN);
       localWse213aTFld1Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWse213aTFld1Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
    /**
	 *	refreshWse213aTFld1 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWse213aTFld1() {	 
   		return (substring(getStringValue(),beginWse213aTFld1,beginWse213aTFld1 + WSE_213A_TFLD_1_LEN));
   	}
     int localWse213aTFld2Counter = -1;
     public boolean isWse213aTFld2Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse213aTFld2Counter != sharedCounter;
         localWse213aTFld2Counter = sharedCounter; return hasModified;
     }
	protected static final int WSE_213A_TFLD_2_LEN = 30;
	/**
	 * 	serialize this Wse213aTFld2
	 */
   protected void serializeWse213aTFld2(char[] wse213aTFld2) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wse213aTFld2,0,getStringValue(),beginWse213aTFld2,WSE_213A_TFLD_2_LEN);
       localWse213aTFld2Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWse213aTFld2Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
    /**
	 *	refreshWse213aTFld2 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWse213aTFld2() {	 
   		return (substring(getStringValue(),beginWse213aTFld2,beginWse213aTFld2 + WSE_213A_TFLD_2_LEN));
   	}




}
  
