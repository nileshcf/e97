package com.cloudframe.app.refmod3.dto.serialize;

/**
*  The class Wse218bTSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:04. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Wse218bTSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Wse218bTSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WSE_218B_T_LENGTH = 60;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginWse218bTFld1;
            protected  int beginWse218bTFld2;
            protected  int beginWse218bTFld3;
	
	/**
	* Constructor for Wse218bTSerialized
	**/
    public Wse218bTSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Wse218bTSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Wse218bTSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Wse218bTSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,5); // serialize this field at offset 5 by default 
    }
    
	/**
	* sets parent for this Wse218bTSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 5 by default
    }    
	/**
	* initializes the field in Wse218bTSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(WSE_218B_T_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginWse218bTFld1 = getStartOffset() + 0;	// set offset for serialization
  
             beginWse218bTFld2 = getStartOffset() + 10;	// set offset for serialization
  
             beginWse218bTFld3 = getStartOffset() + 30;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localWse218bTFld1Counter = -1;
     public boolean isWse218bTFld1Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse218bTFld1Counter != sharedCounter;
         localWse218bTFld1Counter = sharedCounter; return hasModified;
     }
	protected static final int WSE_218B_TFLD_1_LEN = 10;
	/**
	 * 	serialize this Wse218bTFld1
	 */
   protected void serializeWse218bTFld1(char[] wse218bTFld1) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wse218bTFld1,0,getStringValue(),beginWse218bTFld1,WSE_218B_TFLD_1_LEN);
       localWse218bTFld1Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWse218bTFld1Constraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshWse218bTFld1 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWse218bTFld1() {	 
   		return (substring(getStringValue(),beginWse218bTFld1,beginWse218bTFld1 + WSE_218B_TFLD_1_LEN));
   	}
     int localWse218bTFld2Counter = -1;
     public boolean isWse218bTFld2Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse218bTFld2Counter != sharedCounter;
         localWse218bTFld2Counter = sharedCounter; return hasModified;
     }
	protected static final int WSE_218B_TFLD_2_LEN = 20;
	/**
	 * 	serialize this Wse218bTFld2
	 */
   protected void serializeWse218bTFld2(char[] wse218bTFld2) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wse218bTFld2,0,getStringValue(),beginWse218bTFld2,WSE_218B_TFLD_2_LEN);
       localWse218bTFld2Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWse218bTFld2Constraints(char[] value) {
   			return super.checkConstraints(value , 20 ,false, false);
   }
    /**
	 *	refreshWse218bTFld2 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWse218bTFld2() {	 
   		return (substring(getStringValue(),beginWse218bTFld2,beginWse218bTFld2 + WSE_218B_TFLD_2_LEN));
   	}
     int localWse218bTFld3Counter = -1;
     public boolean isWse218bTFld3Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse218bTFld3Counter != sharedCounter;
         localWse218bTFld3Counter = sharedCounter; return hasModified;
     }
	protected static final int WSE_218B_TFLD_3_LEN = 30;
	/**
	 * 	serialize this Wse218bTFld3
	 */
   protected void serializeWse218bTFld3(char[] wse218bTFld3) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wse218bTFld3,0,getStringValue(),beginWse218bTFld3,WSE_218B_TFLD_3_LEN);
       localWse218bTFld3Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWse218bTFld3Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
    /**
	 *	refreshWse218bTFld3 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWse218bTFld3() {	 
   		return (substring(getStringValue(),beginWse218bTFld3,beginWse218bTFld3 + WSE_218B_TFLD_3_LEN));
   	}




}
  
