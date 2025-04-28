package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Wse8aTSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 06:59. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Wse8aTSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Wse8aTSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WSE_8A_T_LENGTH = 60;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginWse8aTFld1;
            protected  int beginWse8aTFld2;
	
	/**
	* Constructor for Wse8aTSerialized
	**/
    public Wse8aTSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Wse8aTSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Wse8aTSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Wse8aTSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,5); // serialize this field at offset 5 by default 
    }
    
	/**
	* sets parent for this Wse8aTSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 5 by default
    }    
	/**
	* initializes the field in Wse8aTSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(WSE_8A_T_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginWse8aTFld1 = getStartOffset() + 0;	// set offset for serialization
  
             beginWse8aTFld2 = getStartOffset() + 30;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localWse8aTFld1Counter = -1;
     public boolean isWse8aTFld1Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse8aTFld1Counter != sharedCounter;
         localWse8aTFld1Counter = sharedCounter; return hasModified;
     }
	protected static final int WSE_8A_TFLD_1_LEN = 30;
	/**
	 * 	serialize this Wse8aTFld1
	 */
   protected void serializeWse8aTFld1(char[] wse8aTFld1) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wse8aTFld1,0,getStringValue(),beginWse8aTFld1,WSE_8A_TFLD_1_LEN);
       localWse8aTFld1Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWse8aTFld1Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
    /**
	 *	refreshWse8aTFld1 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWse8aTFld1() {	 
   		return (substring(getStringValue(),beginWse8aTFld1,beginWse8aTFld1 + WSE_8A_TFLD_1_LEN));
   	}
     int localWse8aTFld2Counter = -1;
     public boolean isWse8aTFld2Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse8aTFld2Counter != sharedCounter;
         localWse8aTFld2Counter = sharedCounter; return hasModified;
     }
	protected static final int WSE_8A_TFLD_2_LEN = 30;
	/**
	 * 	serialize this Wse8aTFld2
	 */
   protected void serializeWse8aTFld2(char[] wse8aTFld2) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wse8aTFld2,0,getStringValue(),beginWse8aTFld2,WSE_8A_TFLD_2_LEN);
       localWse8aTFld2Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWse8aTFld2Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
    /**
	 *	refreshWse8aTFld2 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWse8aTFld2() {	 
   		return (substring(getStringValue(),beginWse8aTFld2,beginWse8aTFld2 + WSE_8A_TFLD_2_LEN));
   	}




}
  
