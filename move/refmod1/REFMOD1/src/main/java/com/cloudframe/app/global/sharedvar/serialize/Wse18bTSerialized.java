package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Wse18bTSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:23. using version 5.0.0.257
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Wse18bTSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Wse18bTSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WSE_18B_T_LENGTH = 60;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginWse18bTFld1;
            protected  int beginWse18bTFld2;
            protected  int beginWse18bTFld3;
	
	/**
	* Constructor for Wse18bTSerialized
	**/
    public Wse18bTSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Wse18bTSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Wse18bTSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Wse18bTSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,5); // serialize this field at offset 5 by default 
    }
    
	/**
	* sets parent for this Wse18bTSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 5 by default
    }    
	/**
	* initializes the field in Wse18bTSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(WSE_18B_T_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginWse18bTFld1 = getStartOffset() + 0;	// set offset for serialization
  
             beginWse18bTFld2 = getStartOffset() + 10;	// set offset for serialization
  
             beginWse18bTFld3 = getStartOffset() + 30;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localWse18bTFld1Counter = -1;
     public boolean isWse18bTFld1Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse18bTFld1Counter != sharedCounter;
         localWse18bTFld1Counter = sharedCounter; return hasModified;
     }
	protected static final int WSE_18B_TFLD_1_LEN = 10;
	/**
	 * 	serialize this Wse18bTFld1
	 */
   protected void serializeWse18bTFld1(char[] wse18bTFld1) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wse18bTFld1,0,getStringValue(),beginWse18bTFld1,WSE_18B_TFLD_1_LEN);
       localWse18bTFld1Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWse18bTFld1Constraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshWse18bTFld1 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWse18bTFld1() {	 
   		return (substring(getStringValue(),beginWse18bTFld1,beginWse18bTFld1 + WSE_18B_TFLD_1_LEN));
   	}
     int localWse18bTFld2Counter = -1;
     public boolean isWse18bTFld2Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse18bTFld2Counter != sharedCounter;
         localWse18bTFld2Counter = sharedCounter; return hasModified;
     }
	protected static final int WSE_18B_TFLD_2_LEN = 20;
	/**
	 * 	serialize this Wse18bTFld2
	 */
   protected void serializeWse18bTFld2(char[] wse18bTFld2) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wse18bTFld2,0,getStringValue(),beginWse18bTFld2,WSE_18B_TFLD_2_LEN);
       localWse18bTFld2Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWse18bTFld2Constraints(char[] value) {
   			return super.checkConstraints(value , 20 ,false, false);
   }
    /**
	 *	refreshWse18bTFld2 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWse18bTFld2() {	 
   		return (substring(getStringValue(),beginWse18bTFld2,beginWse18bTFld2 + WSE_18B_TFLD_2_LEN));
   	}
     int localWse18bTFld3Counter = -1;
     public boolean isWse18bTFld3Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse18bTFld3Counter != sharedCounter;
         localWse18bTFld3Counter = sharedCounter; return hasModified;
     }
	protected static final int WSE_18B_TFLD_3_LEN = 30;
	/**
	 * 	serialize this Wse18bTFld3
	 */
   protected void serializeWse18bTFld3(char[] wse18bTFld3) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wse18bTFld3,0,getStringValue(),beginWse18bTFld3,WSE_18B_TFLD_3_LEN);
       localWse18bTFld3Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWse18bTFld3Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
    /**
	 *	refreshWse18bTFld3 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWse18bTFld3() {	 
   		return (substring(getStringValue(),beginWse18bTFld3,beginWse18bTFld3 + WSE_18B_TFLD_3_LEN));
   	}




}
  
