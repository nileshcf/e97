package com.cloudframe.app.refmod2.dto.serialize;

/**
*  The class Wse213bTSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:03. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Wse213bTSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Wse213bTSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WSE_213B_T_LENGTH = 60;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginWse213bTFld1;
            protected  int beginWse213bTFld2;
            protected  int beginWse213bTFld3;
	
	/**
	* Constructor for Wse213bTSerialized
	**/
    public Wse213bTSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Wse213bTSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Wse213bTSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Wse213bTSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,5); // serialize this field at offset 5 by default 
    }
    
	/**
	* sets parent for this Wse213bTSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 5 by default
    }    
	/**
	* initializes the field in Wse213bTSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(WSE_213B_T_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginWse213bTFld1 = getStartOffset() + 0;	// set offset for serialization
  
             beginWse213bTFld2 = getStartOffset() + 10;	// set offset for serialization
  
             beginWse213bTFld3 = getStartOffset() + 30;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localWse213bTFld1Counter = -1;
     public boolean isWse213bTFld1Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse213bTFld1Counter != sharedCounter;
         localWse213bTFld1Counter = sharedCounter; return hasModified;
     }
	protected static final int WSE_213B_TFLD_1_LEN = 10;
	/**
	 * 	serialize this Wse213bTFld1
	 */
   protected void serializeWse213bTFld1(char[] wse213bTFld1) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wse213bTFld1,0,getStringValue(),beginWse213bTFld1,WSE_213B_TFLD_1_LEN);
       localWse213bTFld1Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWse213bTFld1Constraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshWse213bTFld1 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWse213bTFld1() {	 
   		return (substring(getStringValue(),beginWse213bTFld1,beginWse213bTFld1 + WSE_213B_TFLD_1_LEN));
   	}
     int localWse213bTFld2Counter = -1;
     public boolean isWse213bTFld2Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse213bTFld2Counter != sharedCounter;
         localWse213bTFld2Counter = sharedCounter; return hasModified;
     }
	protected static final int WSE_213B_TFLD_2_LEN = 20;
	/**
	 * 	serialize this Wse213bTFld2
	 */
   protected void serializeWse213bTFld2(char[] wse213bTFld2) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wse213bTFld2,0,getStringValue(),beginWse213bTFld2,WSE_213B_TFLD_2_LEN);
       localWse213bTFld2Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWse213bTFld2Constraints(char[] value) {
   			return super.checkConstraints(value , 20 ,false, false);
   }
    /**
	 *	refreshWse213bTFld2 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWse213bTFld2() {	 
   		return (substring(getStringValue(),beginWse213bTFld2,beginWse213bTFld2 + WSE_213B_TFLD_2_LEN));
   	}
     int localWse213bTFld3Counter = -1;
     public boolean isWse213bTFld3Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse213bTFld3Counter != sharedCounter;
         localWse213bTFld3Counter = sharedCounter; return hasModified;
     }
	protected static final int WSE_213B_TFLD_3_LEN = 30;
	/**
	 * 	serialize this Wse213bTFld3
	 */
   protected void serializeWse213bTFld3(char[] wse213bTFld3) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wse213bTFld3,0,getStringValue(),beginWse213bTFld3,WSE_213B_TFLD_3_LEN);
       localWse213bTFld3Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWse213bTFld3Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
    /**
	 *	refreshWse213bTFld3 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWse213bTFld3() {	 
   		return (substring(getStringValue(),beginWse213bTFld3,beginWse213bTFld3 + WSE_213B_TFLD_3_LEN));
   	}




}
  
