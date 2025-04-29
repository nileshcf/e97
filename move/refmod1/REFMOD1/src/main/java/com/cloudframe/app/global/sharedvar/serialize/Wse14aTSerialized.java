package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Wse14aTSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:29. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Wse14aTSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Wse14aTSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WSE_14A_T_LENGTH = 60;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginWse14aTFld1;
            protected  int beginWse14aTFld2;
	
	/**
	* Constructor for Wse14aTSerialized
	**/
    public Wse14aTSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Wse14aTSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Wse14aTSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Wse14aTSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,5); // serialize this field at offset 5 by default 
    }
    
	/**
	* sets parent for this Wse14aTSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 5 by default
    }    
	/**
	* initializes the field in Wse14aTSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(WSE_14A_T_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginWse14aTFld1 = getStartOffset() + 0;	// set offset for serialization
  
             beginWse14aTFld2 = getStartOffset() + 30;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localWse14aTFld1Counter = -1;
     public boolean isWse14aTFld1Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse14aTFld1Counter != sharedCounter;
         localWse14aTFld1Counter = sharedCounter; return hasModified;
     }
	protected static final int WSE_14A_TFLD_1_LEN = 30;
	/**
	 * 	serialize this Wse14aTFld1
	 */
   protected void serializeWse14aTFld1(char[] wse14aTFld1) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wse14aTFld1,0,getStringValue(),beginWse14aTFld1,WSE_14A_TFLD_1_LEN);
       localWse14aTFld1Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWse14aTFld1Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
    /**
	 *	refreshWse14aTFld1 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWse14aTFld1() {	 
   		return (substring(getStringValue(),beginWse14aTFld1,beginWse14aTFld1 + WSE_14A_TFLD_1_LEN));
   	}
     int localWse14aTFld2Counter = -1;
     public boolean isWse14aTFld2Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse14aTFld2Counter != sharedCounter;
         localWse14aTFld2Counter = sharedCounter; return hasModified;
     }
	protected static final int WSE_14A_TFLD_2_LEN = 30;
	/**
	 * 	serialize this Wse14aTFld2
	 */
   protected void serializeWse14aTFld2(char[] wse14aTFld2) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wse14aTFld2,0,getStringValue(),beginWse14aTFld2,WSE_14A_TFLD_2_LEN);
       localWse14aTFld2Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWse14aTFld2Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
    /**
	 *	refreshWse14aTFld2 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWse14aTFld2() {	 
   		return (substring(getStringValue(),beginWse14aTFld2,beginWse14aTFld2 + WSE_14A_TFLD_2_LEN));
   	}




}
  
