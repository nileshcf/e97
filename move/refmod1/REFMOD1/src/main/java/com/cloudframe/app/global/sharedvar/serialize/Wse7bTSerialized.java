package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Wse7bTSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:26. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Wse7bTSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Wse7bTSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WSE_7B_T_LENGTH = 60;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginWse7bTFld1;
            protected  int beginWse7bTFld2;
            protected  int beginWse7bTFld3;
	
	/**
	* Constructor for Wse7bTSerialized
	**/
    public Wse7bTSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Wse7bTSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Wse7bTSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Wse7bTSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,5); // serialize this field at offset 5 by default 
    }
    
	/**
	* sets parent for this Wse7bTSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 5 by default
    }    
	/**
	* initializes the field in Wse7bTSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(WSE_7B_T_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginWse7bTFld1 = getStartOffset() + 0;	// set offset for serialization
  
             beginWse7bTFld2 = getStartOffset() + 10;	// set offset for serialization
  
             beginWse7bTFld3 = getStartOffset() + 30;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localWse7bTFld1Counter = -1;
     public boolean isWse7bTFld1Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse7bTFld1Counter != sharedCounter;
         localWse7bTFld1Counter = sharedCounter; return hasModified;
     }
	protected static final int WSE_7B_TFLD_1_LEN = 10;
	/**
	 * 	serialize this Wse7bTFld1
	 */
   protected void serializeWse7bTFld1(char[] wse7bTFld1) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wse7bTFld1,0,getStringValue(),beginWse7bTFld1,WSE_7B_TFLD_1_LEN);
       localWse7bTFld1Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWse7bTFld1Constraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshWse7bTFld1 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWse7bTFld1() {	 
   		return (substring(getStringValue(),beginWse7bTFld1,beginWse7bTFld1 + WSE_7B_TFLD_1_LEN));
   	}
     int localWse7bTFld2Counter = -1;
     public boolean isWse7bTFld2Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse7bTFld2Counter != sharedCounter;
         localWse7bTFld2Counter = sharedCounter; return hasModified;
     }
	protected static final int WSE_7B_TFLD_2_LEN = 20;
	/**
	 * 	serialize this Wse7bTFld2
	 */
   protected void serializeWse7bTFld2(char[] wse7bTFld2) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wse7bTFld2,0,getStringValue(),beginWse7bTFld2,WSE_7B_TFLD_2_LEN);
       localWse7bTFld2Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWse7bTFld2Constraints(char[] value) {
   			return super.checkConstraints(value , 20 ,false, false);
   }
    /**
	 *	refreshWse7bTFld2 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWse7bTFld2() {	 
   		return (substring(getStringValue(),beginWse7bTFld2,beginWse7bTFld2 + WSE_7B_TFLD_2_LEN));
   	}
     int localWse7bTFld3Counter = -1;
     public boolean isWse7bTFld3Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse7bTFld3Counter != sharedCounter;
         localWse7bTFld3Counter = sharedCounter; return hasModified;
     }
	protected static final int WSE_7B_TFLD_3_LEN = 30;
	/**
	 * 	serialize this Wse7bTFld3
	 */
   protected void serializeWse7bTFld3(char[] wse7bTFld3) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wse7bTFld3,0,getStringValue(),beginWse7bTFld3,WSE_7B_TFLD_3_LEN);
       localWse7bTFld3Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWse7bTFld3Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
    /**
	 *	refreshWse7bTFld3 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWse7bTFld3() {	 
   		return (substring(getStringValue(),beginWse7bTFld3,beginWse7bTFld3 + WSE_7B_TFLD_3_LEN));
   	}




}
  
