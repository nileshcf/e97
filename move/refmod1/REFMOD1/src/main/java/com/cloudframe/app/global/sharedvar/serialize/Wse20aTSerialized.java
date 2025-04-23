package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Wse20aTSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:04. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Wse20aTSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Wse20aTSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WSE_20A_T_LENGTH = 60;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginWse20aTFld1;
            protected  int beginWse20aTFld2;
	
	/**
	* Constructor for Wse20aTSerialized
	**/
    public Wse20aTSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Wse20aTSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Wse20aTSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Wse20aTSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,5); // serialize this field at offset 5 by default 
    }
    
	/**
	* sets parent for this Wse20aTSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 5 by default
    }    
	/**
	* initializes the field in Wse20aTSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(WSE_20A_T_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginWse20aTFld1 = getStartOffset() + 0;	// set offset for serialization
  
             beginWse20aTFld2 = getStartOffset() + 30;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localWse20aTFld1Counter = -1;
     public boolean isWse20aTFld1Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse20aTFld1Counter != sharedCounter;
         localWse20aTFld1Counter = sharedCounter; return hasModified;
     }
	protected static final int WSE_20A_TFLD_1_LEN = 30;
	/**
	 * 	serialize this Wse20aTFld1
	 */
   protected void serializeWse20aTFld1(char[] wse20aTFld1) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wse20aTFld1,0,getStringValue(),beginWse20aTFld1,WSE_20A_TFLD_1_LEN);
       localWse20aTFld1Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWse20aTFld1Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
    /**
	 *	refreshWse20aTFld1 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWse20aTFld1() {	 
   		return (substring(getStringValue(),beginWse20aTFld1,beginWse20aTFld1 + WSE_20A_TFLD_1_LEN));
   	}
     int localWse20aTFld2Counter = -1;
     public boolean isWse20aTFld2Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse20aTFld2Counter != sharedCounter;
         localWse20aTFld2Counter = sharedCounter; return hasModified;
     }
	protected static final int WSE_20A_TFLD_2_LEN = 30;
	/**
	 * 	serialize this Wse20aTFld2
	 */
   protected void serializeWse20aTFld2(char[] wse20aTFld2) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wse20aTFld2,0,getStringValue(),beginWse20aTFld2,WSE_20A_TFLD_2_LEN);
       localWse20aTFld2Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWse20aTFld2Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
    /**
	 *	refreshWse20aTFld2 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWse20aTFld2() {	 
   		return (substring(getStringValue(),beginWse20aTFld2,beginWse20aTFld2 + WSE_20A_TFLD_2_LEN));
   	}




}
  
