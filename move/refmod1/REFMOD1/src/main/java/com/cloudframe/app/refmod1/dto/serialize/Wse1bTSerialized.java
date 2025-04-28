package com.cloudframe.app.refmod1.dto.serialize;

/**
*  The class Wse1bTSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 06:59. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Wse1bTSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Wse1bTSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WSE_1B_T_LENGTH = 60;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginWse1bTFld1;
            protected  int beginWse1bTFld2;
            protected  int beginWse1bTFld3;
	
	/**
	* Constructor for Wse1bTSerialized
	**/
    public Wse1bTSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Wse1bTSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Wse1bTSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Wse1bTSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this Wse1bTSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in Wse1bTSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(WSE_1B_T_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginWse1bTFld1 = getStartOffset() + 0;	// set offset for serialization
  
             beginWse1bTFld2 = getStartOffset() + 10;	// set offset for serialization
  
             beginWse1bTFld3 = getStartOffset() + 30;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localWse1bTFld1Counter = -1;
     public boolean isWse1bTFld1Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse1bTFld1Counter != sharedCounter;
         localWse1bTFld1Counter = sharedCounter; return hasModified;
     }
	protected static final int WSE_1B_TFLD_1_LEN = 10;
	/**
	 * 	serialize this Wse1bTFld1
	 */
   protected void serializeWse1bTFld1(char[] wse1bTFld1) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wse1bTFld1,0,getStringValue(),beginWse1bTFld1,WSE_1B_TFLD_1_LEN);
       localWse1bTFld1Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWse1bTFld1Constraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshWse1bTFld1 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWse1bTFld1() {	 
   		return (substring(getStringValue(),beginWse1bTFld1,beginWse1bTFld1 + WSE_1B_TFLD_1_LEN));
   	}
     int localWse1bTFld2Counter = -1;
     public boolean isWse1bTFld2Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse1bTFld2Counter != sharedCounter;
         localWse1bTFld2Counter = sharedCounter; return hasModified;
     }
	protected static final int WSE_1B_TFLD_2_LEN = 20;
	/**
	 * 	serialize this Wse1bTFld2
	 */
   protected void serializeWse1bTFld2(char[] wse1bTFld2) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wse1bTFld2,0,getStringValue(),beginWse1bTFld2,WSE_1B_TFLD_2_LEN);
       localWse1bTFld2Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWse1bTFld2Constraints(char[] value) {
   			return super.checkConstraints(value , 20 ,false, false);
   }
    /**
	 *	refreshWse1bTFld2 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWse1bTFld2() {	 
   		return (substring(getStringValue(),beginWse1bTFld2,beginWse1bTFld2 + WSE_1B_TFLD_2_LEN));
   	}
     int localWse1bTFld3Counter = -1;
     public boolean isWse1bTFld3Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse1bTFld3Counter != sharedCounter;
         localWse1bTFld3Counter = sharedCounter; return hasModified;
     }
	protected static final int WSE_1B_TFLD_3_LEN = 30;
	/**
	 * 	serialize this Wse1bTFld3
	 */
   protected void serializeWse1bTFld3(char[] wse1bTFld3) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wse1bTFld3,0,getStringValue(),beginWse1bTFld3,WSE_1B_TFLD_3_LEN);
       localWse1bTFld3Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWse1bTFld3Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
    /**
	 *	refreshWse1bTFld3 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWse1bTFld3() {	 
   		return (substring(getStringValue(),beginWse1bTFld3,beginWse1bTFld3 + WSE_1B_TFLD_3_LEN));
   	}




}
  
