package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Wse5aTSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:13. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Wse5aTSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Wse5aTSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WSE_5A_T_LENGTH = 60;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginWse5aTFld1;
            protected  int beginWse5aTFld2;
	
	/**
	* Constructor for Wse5aTSerialized
	**/
    public Wse5aTSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Wse5aTSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Wse5aTSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Wse5aTSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this Wse5aTSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in Wse5aTSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(WSE_5A_T_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginWse5aTFld1 = getStartOffset() + 0;	// set offset for serialization
  
             beginWse5aTFld2 = getStartOffset() + 20;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localWse5aTFld1Counter = -1;
     public boolean isWse5aTFld1Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse5aTFld1Counter != sharedCounter;
         localWse5aTFld1Counter = sharedCounter; return hasModified;
     }
	protected static final int WSE_5A_TFLD_1_LEN = 20;
	/**
	 * 	serialize this Wse5aTFld1
	 */
   protected void serializeWse5aTFld1(char[] wse5aTFld1) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wse5aTFld1,0,getStringValue(),beginWse5aTFld1,WSE_5A_TFLD_1_LEN);
       localWse5aTFld1Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWse5aTFld1Constraints(char[] value) {
   			return super.checkConstraints(value , 20 ,false, false);
   }
    /**
	 *	refreshWse5aTFld1 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWse5aTFld1() {	 
   		return (substring(getStringValue(),beginWse5aTFld1,beginWse5aTFld1 + WSE_5A_TFLD_1_LEN));
   	}
     int localWse5aTFld2Counter = -1;
     public boolean isWse5aTFld2Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse5aTFld2Counter != sharedCounter;
         localWse5aTFld2Counter = sharedCounter; return hasModified;
     }
	protected static final int WSE_5A_TFLD_2_LEN = 40;
	/**
	 * 	serialize this Wse5aTFld2
	 */
   protected void serializeWse5aTFld2(char[] wse5aTFld2) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wse5aTFld2,0,getStringValue(),beginWse5aTFld2,WSE_5A_TFLD_2_LEN);
       localWse5aTFld2Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWse5aTFld2Constraints(char[] value) {
   			return super.checkConstraints(value , 40 ,false, false);
   }
    /**
	 *	refreshWse5aTFld2 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWse5aTFld2() {	 
   		return (substring(getStringValue(),beginWse5aTFld2,beginWse5aTFld2 + WSE_5A_TFLD_2_LEN));
   	}




}
  
