package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Wse19aTSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 08:03. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Wse19aTSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Wse19aTSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WSE_19A_T_LENGTH = 60;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginWse19aTFld1;
            protected  int beginWse19aTFld2;
	
	/**
	* Constructor for Wse19aTSerialized
	**/
    public Wse19aTSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Wse19aTSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Wse19aTSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Wse19aTSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,5); // serialize this field at offset 5 by default 
    }
    
	/**
	* sets parent for this Wse19aTSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 5 by default
    }    
	/**
	* initializes the field in Wse19aTSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(WSE_19A_T_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginWse19aTFld1 = getStartOffset() + 0;	// set offset for serialization
  
             beginWse19aTFld2 = getStartOffset() + 30;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localWse19aTFld1Counter = -1;
     public boolean isWse19aTFld1Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse19aTFld1Counter != sharedCounter;
         localWse19aTFld1Counter = sharedCounter; return hasModified;
     }
	protected static final int WSE_19A_TFLD_1_LEN = 30;
	/**
	 * 	serialize this Wse19aTFld1
	 */
   protected void serializeWse19aTFld1(char[] wse19aTFld1) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wse19aTFld1,0,getStringValue(),beginWse19aTFld1,WSE_19A_TFLD_1_LEN);
       localWse19aTFld1Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWse19aTFld1Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
    /**
	 *	refreshWse19aTFld1 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWse19aTFld1() {	 
   		return (substring(getStringValue(),beginWse19aTFld1,beginWse19aTFld1 + WSE_19A_TFLD_1_LEN));
   	}
     int localWse19aTFld2Counter = -1;
     public boolean isWse19aTFld2Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse19aTFld2Counter != sharedCounter;
         localWse19aTFld2Counter = sharedCounter; return hasModified;
     }
	protected static final int WSE_19A_TFLD_2_LEN = 30;
	/**
	 * 	serialize this Wse19aTFld2
	 */
   protected void serializeWse19aTFld2(char[] wse19aTFld2) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wse19aTFld2,0,getStringValue(),beginWse19aTFld2,WSE_19A_TFLD_2_LEN);
       localWse19aTFld2Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWse19aTFld2Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
    /**
	 *	refreshWse19aTFld2 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWse19aTFld2() {	 
   		return (substring(getStringValue(),beginWse19aTFld2,beginWse19aTFld2 + WSE_19A_TFLD_2_LEN));
   	}




}
  
