package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Wse15aTSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:23. using version 5.0.0.257
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Wse15aTSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Wse15aTSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WSE_15A_T_LENGTH = 60;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginWse15aTFld1;
            protected  int beginWse15aTFld2;
	
	/**
	* Constructor for Wse15aTSerialized
	**/
    public Wse15aTSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Wse15aTSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Wse15aTSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Wse15aTSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this Wse15aTSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in Wse15aTSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(WSE_15A_T_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginWse15aTFld1 = getStartOffset() + 0;	// set offset for serialization
  
             beginWse15aTFld2 = getStartOffset() + 30;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localWse15aTFld1Counter = -1;
     public boolean isWse15aTFld1Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse15aTFld1Counter != sharedCounter;
         localWse15aTFld1Counter = sharedCounter; return hasModified;
     }
	protected static final int WSE_15A_TFLD_1_LEN = 30;
	/**
	 * 	serialize this Wse15aTFld1
	 */
   protected void serializeWse15aTFld1(char[] wse15aTFld1) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wse15aTFld1,0,getStringValue(),beginWse15aTFld1,WSE_15A_TFLD_1_LEN);
       localWse15aTFld1Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWse15aTFld1Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
    /**
	 *	refreshWse15aTFld1 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWse15aTFld1() {	 
   		return (substring(getStringValue(),beginWse15aTFld1,beginWse15aTFld1 + WSE_15A_TFLD_1_LEN));
   	}
     int localWse15aTFld2Counter = -1;
     public boolean isWse15aTFld2Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse15aTFld2Counter != sharedCounter;
         localWse15aTFld2Counter = sharedCounter; return hasModified;
     }
	protected static final int WSE_15A_TFLD_2_LEN = 30;
	/**
	 * 	serialize this Wse15aTFld2
	 */
   protected void serializeWse15aTFld2(char[] wse15aTFld2) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wse15aTFld2,0,getStringValue(),beginWse15aTFld2,WSE_15A_TFLD_2_LEN);
       localWse15aTFld2Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWse15aTFld2Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
    /**
	 *	refreshWse15aTFld2 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWse15aTFld2() {	 
   		return (substring(getStringValue(),beginWse15aTFld2,beginWse15aTFld2 + WSE_15A_TFLD_2_LEN));
   	}




}
  
