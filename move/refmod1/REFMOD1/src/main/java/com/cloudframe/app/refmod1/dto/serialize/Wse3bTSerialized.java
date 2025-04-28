package com.cloudframe.app.refmod1.dto.serialize;

/**
*  The class Wse3bTSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 06:59. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Wse3bTSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Wse3bTSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WSE_3B_T_LENGTH = 60;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginWse3bTFld1;
            protected  int beginWse3bTFld2;
            protected  int beginWse3bTFld3;
	
	/**
	* Constructor for Wse3bTSerialized
	**/
    public Wse3bTSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Wse3bTSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Wse3bTSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Wse3bTSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this Wse3bTSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in Wse3bTSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(WSE_3B_T_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginWse3bTFld1 = getStartOffset() + 0;	// set offset for serialization
  
             beginWse3bTFld2 = getStartOffset() + 10;	// set offset for serialization
  
             beginWse3bTFld3 = getStartOffset() + 30;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localWse3bTFld1Counter = -1;
     public boolean isWse3bTFld1Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse3bTFld1Counter != sharedCounter;
         localWse3bTFld1Counter = sharedCounter; return hasModified;
     }
	protected static final int WSE_3B_TFLD_1_LEN = 10;
	/**
	 * 	serialize this Wse3bTFld1
	 */
   protected void serializeWse3bTFld1(char[] wse3bTFld1) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wse3bTFld1,0,getStringValue(),beginWse3bTFld1,WSE_3B_TFLD_1_LEN);
       localWse3bTFld1Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWse3bTFld1Constraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshWse3bTFld1 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWse3bTFld1() {	 
   		return (substring(getStringValue(),beginWse3bTFld1,beginWse3bTFld1 + WSE_3B_TFLD_1_LEN));
   	}
     int localWse3bTFld2Counter = -1;
     public boolean isWse3bTFld2Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse3bTFld2Counter != sharedCounter;
         localWse3bTFld2Counter = sharedCounter; return hasModified;
     }
	protected static final int WSE_3B_TFLD_2_LEN = 20;
	/**
	 * 	serialize this Wse3bTFld2
	 */
   protected void serializeWse3bTFld2(char[] wse3bTFld2) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wse3bTFld2,0,getStringValue(),beginWse3bTFld2,WSE_3B_TFLD_2_LEN);
       localWse3bTFld2Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWse3bTFld2Constraints(char[] value) {
   			return super.checkConstraints(value , 20 ,false, false);
   }
    /**
	 *	refreshWse3bTFld2 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWse3bTFld2() {	 
   		return (substring(getStringValue(),beginWse3bTFld2,beginWse3bTFld2 + WSE_3B_TFLD_2_LEN));
   	}
     int localWse3bTFld3Counter = -1;
     public boolean isWse3bTFld3Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse3bTFld3Counter != sharedCounter;
         localWse3bTFld3Counter = sharedCounter; return hasModified;
     }
	protected static final int WSE_3B_TFLD_3_LEN = 30;
	/**
	 * 	serialize this Wse3bTFld3
	 */
   protected void serializeWse3bTFld3(char[] wse3bTFld3) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wse3bTFld3,0,getStringValue(),beginWse3bTFld3,WSE_3B_TFLD_3_LEN);
       localWse3bTFld3Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWse3bTFld3Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
    /**
	 *	refreshWse3bTFld3 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWse3bTFld3() {	 
   		return (substring(getStringValue(),beginWse3bTFld3,beginWse3bTFld3 + WSE_3B_TFLD_3_LEN));
   	}




}
  
