package com.cloudframe.app.refmod2.dto.serialize;

/**
*  The class Wse213bSSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:29. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Wse213bSSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Wse213bSSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WSE_213B_S_LENGTH = 60;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginWse213bSFld1;
            protected  int beginWse213bSFld2;
	
	/**
	* Constructor for Wse213bSSerialized
	**/
    public Wse213bSSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Wse213bSSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Wse213bSSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Wse213bSSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,3); // serialize this field at offset 3 by default 
    }
    
	/**
	* sets parent for this Wse213bSSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 3 by default
    }    
	/**
	* initializes the field in Wse213bSSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(WSE_213B_S_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginWse213bSFld1 = getStartOffset() + 0;	// set offset for serialization
  
             beginWse213bSFld2 = getStartOffset() + 30;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localWse213bSFld1Counter = -1;
     public boolean isWse213bSFld1Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse213bSFld1Counter != sharedCounter;
         localWse213bSFld1Counter = sharedCounter; return hasModified;
     }
	protected static final int WSE_213B_SFLD_1_LEN = 30;
	/**
	 * 	serialize this Wse213bSFld1
	 */
   protected void serializeWse213bSFld1(char[] wse213bSFld1) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wse213bSFld1,0,getStringValue(),beginWse213bSFld1,WSE_213B_SFLD_1_LEN);
       localWse213bSFld1Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWse213bSFld1Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
    /**
	 *	refreshWse213bSFld1 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWse213bSFld1() {	 
   		return (substring(getStringValue(),beginWse213bSFld1,beginWse213bSFld1 + WSE_213B_SFLD_1_LEN));
   	}
     int localWse213bSFld2Counter = -1;
     public boolean isWse213bSFld2Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse213bSFld2Counter != sharedCounter;
         localWse213bSFld2Counter = sharedCounter; return hasModified;
     }
	protected static final int WSE_213B_SFLD_2_LEN = 30;
	/**
	 * 	serialize this Wse213bSFld2
	 */
   protected void serializeWse213bSFld2(char[] wse213bSFld2) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wse213bSFld2,0,getStringValue(),beginWse213bSFld2,WSE_213B_SFLD_2_LEN);
       localWse213bSFld2Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWse213bSFld2Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
    /**
	 *	refreshWse213bSFld2 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWse213bSFld2() {	 
   		return (substring(getStringValue(),beginWse213bSFld2,beginWse213bSFld2 + WSE_213B_SFLD_2_LEN));
   	}




}
  
