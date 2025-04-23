package com.cloudframe.app.refmod3.dto.serialize;

/**
*  The class Wse29bTSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:02. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Wse29bTSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Wse29bTSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WSE_29B_T_LENGTH = 60;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginWse29bTFld1;
            protected  int beginWse29bTFld2;
            protected  int beginWse29bTFld3;
	
	/**
	* Constructor for Wse29bTSerialized
	**/
    public Wse29bTSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Wse29bTSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Wse29bTSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Wse29bTSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,5); // serialize this field at offset 5 by default 
    }
    
	/**
	* sets parent for this Wse29bTSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 5 by default
    }    
	/**
	* initializes the field in Wse29bTSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(WSE_29B_T_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginWse29bTFld1 = getStartOffset() + 0;	// set offset for serialization
  
             beginWse29bTFld2 = getStartOffset() + 10;	// set offset for serialization
  
             beginWse29bTFld3 = getStartOffset() + 30;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localWse29bTFld1Counter = -1;
     public boolean isWse29bTFld1Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse29bTFld1Counter != sharedCounter;
         localWse29bTFld1Counter = sharedCounter; return hasModified;
     }
	protected static final int WSE_29B_TFLD_1_LEN = 10;
	/**
	 * 	serialize this Wse29bTFld1
	 */
   protected void serializeWse29bTFld1(char[] wse29bTFld1) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wse29bTFld1,0,getStringValue(),beginWse29bTFld1,WSE_29B_TFLD_1_LEN);
       localWse29bTFld1Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWse29bTFld1Constraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshWse29bTFld1 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWse29bTFld1() {	 
   		return (substring(getStringValue(),beginWse29bTFld1,beginWse29bTFld1 + WSE_29B_TFLD_1_LEN));
   	}
     int localWse29bTFld2Counter = -1;
     public boolean isWse29bTFld2Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse29bTFld2Counter != sharedCounter;
         localWse29bTFld2Counter = sharedCounter; return hasModified;
     }
	protected static final int WSE_29B_TFLD_2_LEN = 20;
	/**
	 * 	serialize this Wse29bTFld2
	 */
   protected void serializeWse29bTFld2(char[] wse29bTFld2) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wse29bTFld2,0,getStringValue(),beginWse29bTFld2,WSE_29B_TFLD_2_LEN);
       localWse29bTFld2Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWse29bTFld2Constraints(char[] value) {
   			return super.checkConstraints(value , 20 ,false, false);
   }
    /**
	 *	refreshWse29bTFld2 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWse29bTFld2() {	 
   		return (substring(getStringValue(),beginWse29bTFld2,beginWse29bTFld2 + WSE_29B_TFLD_2_LEN));
   	}
     int localWse29bTFld3Counter = -1;
     public boolean isWse29bTFld3Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse29bTFld3Counter != sharedCounter;
         localWse29bTFld3Counter = sharedCounter; return hasModified;
     }
	protected static final int WSE_29B_TFLD_3_LEN = 30;
	/**
	 * 	serialize this Wse29bTFld3
	 */
   protected void serializeWse29bTFld3(char[] wse29bTFld3) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wse29bTFld3,0,getStringValue(),beginWse29bTFld3,WSE_29B_TFLD_3_LEN);
       localWse29bTFld3Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWse29bTFld3Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
    /**
	 *	refreshWse29bTFld3 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWse29bTFld3() {	 
   		return (substring(getStringValue(),beginWse29bTFld3,beginWse29bTFld3 + WSE_29B_TFLD_3_LEN));
   	}




}
  
