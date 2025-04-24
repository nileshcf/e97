package com.cloudframe.app.refmod1.dto.serialize;

/**
*  The class Wse2bTSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:36. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Wse2bTSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Wse2bTSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WSE_2B_T_LENGTH = 60;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginWse2bTFld1;
            protected  int beginWse2bTFld2;
            protected  int beginWse2bTFld3;
	
	/**
	* Constructor for Wse2bTSerialized
	**/
    public Wse2bTSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Wse2bTSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Wse2bTSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Wse2bTSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this Wse2bTSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in Wse2bTSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(WSE_2B_T_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginWse2bTFld1 = getStartOffset() + 0;	// set offset for serialization
  
             beginWse2bTFld2 = getStartOffset() + 10;	// set offset for serialization
  
             beginWse2bTFld3 = getStartOffset() + 30;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localWse2bTFld1Counter = -1;
     public boolean isWse2bTFld1Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse2bTFld1Counter != sharedCounter;
         localWse2bTFld1Counter = sharedCounter; return hasModified;
     }
	protected static final int WSE_2B_TFLD_1_LEN = 10;
	/**
	 * 	serialize this Wse2bTFld1
	 */
   protected void serializeWse2bTFld1(char[] wse2bTFld1) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wse2bTFld1,0,getStringValue(),beginWse2bTFld1,WSE_2B_TFLD_1_LEN);
       localWse2bTFld1Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWse2bTFld1Constraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshWse2bTFld1 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWse2bTFld1() {	 
   		return (substring(getStringValue(),beginWse2bTFld1,beginWse2bTFld1 + WSE_2B_TFLD_1_LEN));
   	}
     int localWse2bTFld2Counter = -1;
     public boolean isWse2bTFld2Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse2bTFld2Counter != sharedCounter;
         localWse2bTFld2Counter = sharedCounter; return hasModified;
     }
	protected static final int WSE_2B_TFLD_2_LEN = 20;
	/**
	 * 	serialize this Wse2bTFld2
	 */
   protected void serializeWse2bTFld2(char[] wse2bTFld2) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wse2bTFld2,0,getStringValue(),beginWse2bTFld2,WSE_2B_TFLD_2_LEN);
       localWse2bTFld2Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWse2bTFld2Constraints(char[] value) {
   			return super.checkConstraints(value , 20 ,false, false);
   }
    /**
	 *	refreshWse2bTFld2 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWse2bTFld2() {	 
   		return (substring(getStringValue(),beginWse2bTFld2,beginWse2bTFld2 + WSE_2B_TFLD_2_LEN));
   	}
     int localWse2bTFld3Counter = -1;
     public boolean isWse2bTFld3Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse2bTFld3Counter != sharedCounter;
         localWse2bTFld3Counter = sharedCounter; return hasModified;
     }
	protected static final int WSE_2B_TFLD_3_LEN = 30;
	/**
	 * 	serialize this Wse2bTFld3
	 */
   protected void serializeWse2bTFld3(char[] wse2bTFld3) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wse2bTFld3,0,getStringValue(),beginWse2bTFld3,WSE_2B_TFLD_3_LEN);
       localWse2bTFld3Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWse2bTFld3Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
    /**
	 *	refreshWse2bTFld3 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWse2bTFld3() {	 
   		return (substring(getStringValue(),beginWse2bTFld3,beginWse2bTFld3 + WSE_2B_TFLD_3_LEN));
   	}




}
  
