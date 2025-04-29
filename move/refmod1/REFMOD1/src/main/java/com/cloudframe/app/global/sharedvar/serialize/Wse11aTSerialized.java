package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Wse11aTSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:23. using version 5.0.0.257
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Wse11aTSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Wse11aTSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WSE_11A_T_LENGTH = 60;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginWse11aTFld1;
            protected  int beginWse11aTFld2;
	
	/**
	* Constructor for Wse11aTSerialized
	**/
    public Wse11aTSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Wse11aTSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Wse11aTSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Wse11aTSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,5); // serialize this field at offset 5 by default 
    }
    
	/**
	* sets parent for this Wse11aTSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 5 by default
    }    
	/**
	* initializes the field in Wse11aTSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(WSE_11A_T_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginWse11aTFld1 = getStartOffset() + 0;	// set offset for serialization
  
             beginWse11aTFld2 = getStartOffset() + 30;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localWse11aTFld1Counter = -1;
     public boolean isWse11aTFld1Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse11aTFld1Counter != sharedCounter;
         localWse11aTFld1Counter = sharedCounter; return hasModified;
     }
	protected static final int WSE_11A_TFLD_1_LEN = 30;
	/**
	 * 	serialize this Wse11aTFld1
	 */
   protected void serializeWse11aTFld1(char[] wse11aTFld1) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wse11aTFld1,0,getStringValue(),beginWse11aTFld1,WSE_11A_TFLD_1_LEN);
       localWse11aTFld1Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWse11aTFld1Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
    /**
	 *	refreshWse11aTFld1 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWse11aTFld1() {	 
   		return (substring(getStringValue(),beginWse11aTFld1,beginWse11aTFld1 + WSE_11A_TFLD_1_LEN));
   	}
     int localWse11aTFld2Counter = -1;
     public boolean isWse11aTFld2Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse11aTFld2Counter != sharedCounter;
         localWse11aTFld2Counter = sharedCounter; return hasModified;
     }
	protected static final int WSE_11A_TFLD_2_LEN = 30;
	/**
	 * 	serialize this Wse11aTFld2
	 */
   protected void serializeWse11aTFld2(char[] wse11aTFld2) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wse11aTFld2,0,getStringValue(),beginWse11aTFld2,WSE_11A_TFLD_2_LEN);
       localWse11aTFld2Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWse11aTFld2Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
    /**
	 *	refreshWse11aTFld2 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWse11aTFld2() {	 
   		return (substring(getStringValue(),beginWse11aTFld2,beginWse11aTFld2 + WSE_11A_TFLD_2_LEN));
   	}




}
  
