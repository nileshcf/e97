package com.cloudframe.app.refmod1.dto.serialize;

/**
*  The class Wse4bTSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:23. using version 5.0.0.257
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Wse4bTSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Wse4bTSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WSE_4B_T_LENGTH = 60;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginWse4bTFld1;
            protected  int beginWse4bTFld2;
            protected  int beginWse4bTFld3;
	
	/**
	* Constructor for Wse4bTSerialized
	**/
    public Wse4bTSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Wse4bTSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Wse4bTSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Wse4bTSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this Wse4bTSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in Wse4bTSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(WSE_4B_T_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginWse4bTFld1 = getStartOffset() + 0;	// set offset for serialization
  
             beginWse4bTFld2 = getStartOffset() + 10;	// set offset for serialization
  
             beginWse4bTFld3 = getStartOffset() + 30;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localWse4bTFld1Counter = -1;
     public boolean isWse4bTFld1Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse4bTFld1Counter != sharedCounter;
         localWse4bTFld1Counter = sharedCounter; return hasModified;
     }
	protected static final int WSE_4B_TFLD_1_LEN = 10;
	/**
	 * 	serialize this Wse4bTFld1
	 */
   protected void serializeWse4bTFld1(char[] wse4bTFld1) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wse4bTFld1,0,getStringValue(),beginWse4bTFld1,WSE_4B_TFLD_1_LEN);
       localWse4bTFld1Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWse4bTFld1Constraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshWse4bTFld1 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWse4bTFld1() {	 
   		return (substring(getStringValue(),beginWse4bTFld1,beginWse4bTFld1 + WSE_4B_TFLD_1_LEN));
   	}
     int localWse4bTFld2Counter = -1;
     public boolean isWse4bTFld2Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse4bTFld2Counter != sharedCounter;
         localWse4bTFld2Counter = sharedCounter; return hasModified;
     }
	protected static final int WSE_4B_TFLD_2_LEN = 20;
	/**
	 * 	serialize this Wse4bTFld2
	 */
   protected void serializeWse4bTFld2(char[] wse4bTFld2) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wse4bTFld2,0,getStringValue(),beginWse4bTFld2,WSE_4B_TFLD_2_LEN);
       localWse4bTFld2Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWse4bTFld2Constraints(char[] value) {
   			return super.checkConstraints(value , 20 ,false, false);
   }
    /**
	 *	refreshWse4bTFld2 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWse4bTFld2() {	 
   		return (substring(getStringValue(),beginWse4bTFld2,beginWse4bTFld2 + WSE_4B_TFLD_2_LEN));
   	}
     int localWse4bTFld3Counter = -1;
     public boolean isWse4bTFld3Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse4bTFld3Counter != sharedCounter;
         localWse4bTFld3Counter = sharedCounter; return hasModified;
     }
	protected static final int WSE_4B_TFLD_3_LEN = 30;
	/**
	 * 	serialize this Wse4bTFld3
	 */
   protected void serializeWse4bTFld3(char[] wse4bTFld3) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wse4bTFld3,0,getStringValue(),beginWse4bTFld3,WSE_4B_TFLD_3_LEN);
       localWse4bTFld3Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWse4bTFld3Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
    /**
	 *	refreshWse4bTFld3 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWse4bTFld3() {	 
   		return (substring(getStringValue(),beginWse4bTFld3,beginWse4bTFld3 + WSE_4B_TFLD_3_LEN));
   	}




}
  
