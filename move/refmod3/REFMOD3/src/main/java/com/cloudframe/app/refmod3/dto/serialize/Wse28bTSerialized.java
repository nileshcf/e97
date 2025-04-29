package com.cloudframe.app.refmod3.dto.serialize;

/**
*  The class Wse28bTSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:27. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Wse28bTSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Wse28bTSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WSE_28B_T_LENGTH = 60;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginWse28bTFld1;
            protected  int beginWse28bTFld2;
            protected  int beginWse28bTFld3;
	
	/**
	* Constructor for Wse28bTSerialized
	**/
    public Wse28bTSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Wse28bTSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Wse28bTSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Wse28bTSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,5); // serialize this field at offset 5 by default 
    }
    
	/**
	* sets parent for this Wse28bTSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 5 by default
    }    
	/**
	* initializes the field in Wse28bTSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(WSE_28B_T_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginWse28bTFld1 = getStartOffset() + 0;	// set offset for serialization
  
             beginWse28bTFld2 = getStartOffset() + 10;	// set offset for serialization
  
             beginWse28bTFld3 = getStartOffset() + 30;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localWse28bTFld1Counter = -1;
     public boolean isWse28bTFld1Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse28bTFld1Counter != sharedCounter;
         localWse28bTFld1Counter = sharedCounter; return hasModified;
     }
	protected static final int WSE_28B_TFLD_1_LEN = 10;
	/**
	 * 	serialize this Wse28bTFld1
	 */
   protected void serializeWse28bTFld1(char[] wse28bTFld1) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wse28bTFld1,0,getStringValue(),beginWse28bTFld1,WSE_28B_TFLD_1_LEN);
       localWse28bTFld1Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWse28bTFld1Constraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshWse28bTFld1 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWse28bTFld1() {	 
   		return (substring(getStringValue(),beginWse28bTFld1,beginWse28bTFld1 + WSE_28B_TFLD_1_LEN));
   	}
     int localWse28bTFld2Counter = -1;
     public boolean isWse28bTFld2Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse28bTFld2Counter != sharedCounter;
         localWse28bTFld2Counter = sharedCounter; return hasModified;
     }
	protected static final int WSE_28B_TFLD_2_LEN = 20;
	/**
	 * 	serialize this Wse28bTFld2
	 */
   protected void serializeWse28bTFld2(char[] wse28bTFld2) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wse28bTFld2,0,getStringValue(),beginWse28bTFld2,WSE_28B_TFLD_2_LEN);
       localWse28bTFld2Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWse28bTFld2Constraints(char[] value) {
   			return super.checkConstraints(value , 20 ,false, false);
   }
    /**
	 *	refreshWse28bTFld2 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWse28bTFld2() {	 
   		return (substring(getStringValue(),beginWse28bTFld2,beginWse28bTFld2 + WSE_28B_TFLD_2_LEN));
   	}
     int localWse28bTFld3Counter = -1;
     public boolean isWse28bTFld3Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse28bTFld3Counter != sharedCounter;
         localWse28bTFld3Counter = sharedCounter; return hasModified;
     }
	protected static final int WSE_28B_TFLD_3_LEN = 30;
	/**
	 * 	serialize this Wse28bTFld3
	 */
   protected void serializeWse28bTFld3(char[] wse28bTFld3) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wse28bTFld3,0,getStringValue(),beginWse28bTFld3,WSE_28B_TFLD_3_LEN);
       localWse28bTFld3Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWse28bTFld3Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
    /**
	 *	refreshWse28bTFld3 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWse28bTFld3() {	 
   		return (substring(getStringValue(),beginWse28bTFld3,beginWse28bTFld3 + WSE_28B_TFLD_3_LEN));
   	}




}
  
