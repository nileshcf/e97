package com.cloudframe.app.refmod2.dto.serialize;

/**
*  The class Wse210bTSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 08:02. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Wse210bTSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Wse210bTSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WSE_210B_T_LENGTH = 60;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginWse210bTFld1;
            protected  int beginWse210bTFld2;
            protected  int beginWse210bTFld3;
	
	/**
	* Constructor for Wse210bTSerialized
	**/
    public Wse210bTSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Wse210bTSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Wse210bTSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Wse210bTSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,5); // serialize this field at offset 5 by default 
    }
    
	/**
	* sets parent for this Wse210bTSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 5 by default
    }    
	/**
	* initializes the field in Wse210bTSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(WSE_210B_T_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginWse210bTFld1 = getStartOffset() + 0;	// set offset for serialization
  
             beginWse210bTFld2 = getStartOffset() + 10;	// set offset for serialization
  
             beginWse210bTFld3 = getStartOffset() + 30;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localWse210bTFld1Counter = -1;
     public boolean isWse210bTFld1Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse210bTFld1Counter != sharedCounter;
         localWse210bTFld1Counter = sharedCounter; return hasModified;
     }
	protected static final int WSE_210B_TFLD_1_LEN = 10;
	/**
	 * 	serialize this Wse210bTFld1
	 */
   protected void serializeWse210bTFld1(char[] wse210bTFld1) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wse210bTFld1,0,getStringValue(),beginWse210bTFld1,WSE_210B_TFLD_1_LEN);
       localWse210bTFld1Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWse210bTFld1Constraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshWse210bTFld1 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWse210bTFld1() {	 
   		return (substring(getStringValue(),beginWse210bTFld1,beginWse210bTFld1 + WSE_210B_TFLD_1_LEN));
   	}
     int localWse210bTFld2Counter = -1;
     public boolean isWse210bTFld2Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse210bTFld2Counter != sharedCounter;
         localWse210bTFld2Counter = sharedCounter; return hasModified;
     }
	protected static final int WSE_210B_TFLD_2_LEN = 20;
	/**
	 * 	serialize this Wse210bTFld2
	 */
   protected void serializeWse210bTFld2(char[] wse210bTFld2) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wse210bTFld2,0,getStringValue(),beginWse210bTFld2,WSE_210B_TFLD_2_LEN);
       localWse210bTFld2Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWse210bTFld2Constraints(char[] value) {
   			return super.checkConstraints(value , 20 ,false, false);
   }
    /**
	 *	refreshWse210bTFld2 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWse210bTFld2() {	 
   		return (substring(getStringValue(),beginWse210bTFld2,beginWse210bTFld2 + WSE_210B_TFLD_2_LEN));
   	}
     int localWse210bTFld3Counter = -1;
     public boolean isWse210bTFld3Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse210bTFld3Counter != sharedCounter;
         localWse210bTFld3Counter = sharedCounter; return hasModified;
     }
	protected static final int WSE_210B_TFLD_3_LEN = 30;
	/**
	 * 	serialize this Wse210bTFld3
	 */
   protected void serializeWse210bTFld3(char[] wse210bTFld3) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wse210bTFld3,0,getStringValue(),beginWse210bTFld3,WSE_210B_TFLD_3_LEN);
       localWse210bTFld3Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWse210bTFld3Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
    /**
	 *	refreshWse210bTFld3 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWse210bTFld3() {	 
   		return (substring(getStringValue(),beginWse210bTFld3,beginWse210bTFld3 + WSE_210B_TFLD_3_LEN));
   	}




}
  
