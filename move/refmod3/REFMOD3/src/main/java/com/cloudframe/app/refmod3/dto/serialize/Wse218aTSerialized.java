package com.cloudframe.app.refmod3.dto.serialize;

/**
*  The class Wse218aTSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:02. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Wse218aTSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Wse218aTSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WSE_218A_T_LENGTH = 60;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginWse218aTFld1;
            protected  int beginWse218aTFld2;
	
	/**
	* Constructor for Wse218aTSerialized
	**/
    public Wse218aTSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Wse218aTSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Wse218aTSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Wse218aTSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,5); // serialize this field at offset 5 by default 
    }
    
	/**
	* sets parent for this Wse218aTSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 5 by default
    }    
	/**
	* initializes the field in Wse218aTSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(WSE_218A_T_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginWse218aTFld1 = getStartOffset() + 0;	// set offset for serialization
  
             beginWse218aTFld2 = getStartOffset() + 30;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localWse218aTFld1Counter = -1;
     public boolean isWse218aTFld1Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse218aTFld1Counter != sharedCounter;
         localWse218aTFld1Counter = sharedCounter; return hasModified;
     }
	protected static final int WSE_218A_TFLD_1_LEN = 30;
	/**
	 * 	serialize this Wse218aTFld1
	 */
   protected void serializeWse218aTFld1(char[] wse218aTFld1) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wse218aTFld1,0,getStringValue(),beginWse218aTFld1,WSE_218A_TFLD_1_LEN);
       localWse218aTFld1Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWse218aTFld1Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
    /**
	 *	refreshWse218aTFld1 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWse218aTFld1() {	 
   		return (substring(getStringValue(),beginWse218aTFld1,beginWse218aTFld1 + WSE_218A_TFLD_1_LEN));
   	}
     int localWse218aTFld2Counter = -1;
     public boolean isWse218aTFld2Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse218aTFld2Counter != sharedCounter;
         localWse218aTFld2Counter = sharedCounter; return hasModified;
     }
	protected static final int WSE_218A_TFLD_2_LEN = 30;
	/**
	 * 	serialize this Wse218aTFld2
	 */
   protected void serializeWse218aTFld2(char[] wse218aTFld2) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wse218aTFld2,0,getStringValue(),beginWse218aTFld2,WSE_218A_TFLD_2_LEN);
       localWse218aTFld2Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWse218aTFld2Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
    /**
	 *	refreshWse218aTFld2 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWse218aTFld2() {	 
   		return (substring(getStringValue(),beginWse218aTFld2,beginWse218aTFld2 + WSE_218A_TFLD_2_LEN));
   	}




}
  
