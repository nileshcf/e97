package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Wse11bTSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:04. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Wse11bTSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Wse11bTSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WSE_11B_T_LENGTH = 60;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginWse11bTFld1;
            protected  int beginWse11bTFld2;
            protected  int beginWse11bTFld3;
	
	/**
	* Constructor for Wse11bTSerialized
	**/
    public Wse11bTSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Wse11bTSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Wse11bTSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Wse11bTSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,5); // serialize this field at offset 5 by default 
    }
    
	/**
	* sets parent for this Wse11bTSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 5 by default
    }    
	/**
	* initializes the field in Wse11bTSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(WSE_11B_T_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginWse11bTFld1 = getStartOffset() + 0;	// set offset for serialization
  
             beginWse11bTFld2 = getStartOffset() + 10;	// set offset for serialization
  
             beginWse11bTFld3 = getStartOffset() + 30;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localWse11bTFld1Counter = -1;
     public boolean isWse11bTFld1Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse11bTFld1Counter != sharedCounter;
         localWse11bTFld1Counter = sharedCounter; return hasModified;
     }
	protected static final int WSE_11B_TFLD_1_LEN = 10;
	/**
	 * 	serialize this Wse11bTFld1
	 */
   protected void serializeWse11bTFld1(char[] wse11bTFld1) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wse11bTFld1,0,getStringValue(),beginWse11bTFld1,WSE_11B_TFLD_1_LEN);
       localWse11bTFld1Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWse11bTFld1Constraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshWse11bTFld1 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWse11bTFld1() {	 
   		return (substring(getStringValue(),beginWse11bTFld1,beginWse11bTFld1 + WSE_11B_TFLD_1_LEN));
   	}
     int localWse11bTFld2Counter = -1;
     public boolean isWse11bTFld2Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse11bTFld2Counter != sharedCounter;
         localWse11bTFld2Counter = sharedCounter; return hasModified;
     }
	protected static final int WSE_11B_TFLD_2_LEN = 20;
	/**
	 * 	serialize this Wse11bTFld2
	 */
   protected void serializeWse11bTFld2(char[] wse11bTFld2) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wse11bTFld2,0,getStringValue(),beginWse11bTFld2,WSE_11B_TFLD_2_LEN);
       localWse11bTFld2Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWse11bTFld2Constraints(char[] value) {
   			return super.checkConstraints(value , 20 ,false, false);
   }
    /**
	 *	refreshWse11bTFld2 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWse11bTFld2() {	 
   		return (substring(getStringValue(),beginWse11bTFld2,beginWse11bTFld2 + WSE_11B_TFLD_2_LEN));
   	}
     int localWse11bTFld3Counter = -1;
     public boolean isWse11bTFld3Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse11bTFld3Counter != sharedCounter;
         localWse11bTFld3Counter = sharedCounter; return hasModified;
     }
	protected static final int WSE_11B_TFLD_3_LEN = 30;
	/**
	 * 	serialize this Wse11bTFld3
	 */
   protected void serializeWse11bTFld3(char[] wse11bTFld3) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wse11bTFld3,0,getStringValue(),beginWse11bTFld3,WSE_11B_TFLD_3_LEN);
       localWse11bTFld3Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWse11bTFld3Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
    /**
	 *	refreshWse11bTFld3 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWse11bTFld3() {	 
   		return (substring(getStringValue(),beginWse11bTFld3,beginWse11bTFld3 + WSE_11B_TFLD_3_LEN));
   	}




}
  
