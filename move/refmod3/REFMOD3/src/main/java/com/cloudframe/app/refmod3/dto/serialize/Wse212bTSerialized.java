package com.cloudframe.app.refmod3.dto.serialize;

/**
*  The class Wse212bTSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 08:00. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Wse212bTSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Wse212bTSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WSE_212B_T_LENGTH = 60;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginWse212bTFld1;
            protected  int beginWse212bTFld2;
            protected  int beginWse212bTFld3;
	
	/**
	* Constructor for Wse212bTSerialized
	**/
    public Wse212bTSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Wse212bTSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Wse212bTSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Wse212bTSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,5); // serialize this field at offset 5 by default 
    }
    
	/**
	* sets parent for this Wse212bTSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 5 by default
    }    
	/**
	* initializes the field in Wse212bTSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(WSE_212B_T_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginWse212bTFld1 = getStartOffset() + 0;	// set offset for serialization
  
             beginWse212bTFld2 = getStartOffset() + 10;	// set offset for serialization
  
             beginWse212bTFld3 = getStartOffset() + 30;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localWse212bTFld1Counter = -1;
     public boolean isWse212bTFld1Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse212bTFld1Counter != sharedCounter;
         localWse212bTFld1Counter = sharedCounter; return hasModified;
     }
	protected static final int WSE_212B_TFLD_1_LEN = 10;
	/**
	 * 	serialize this Wse212bTFld1
	 */
   protected void serializeWse212bTFld1(char[] wse212bTFld1) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wse212bTFld1,0,getStringValue(),beginWse212bTFld1,WSE_212B_TFLD_1_LEN);
       localWse212bTFld1Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWse212bTFld1Constraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshWse212bTFld1 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWse212bTFld1() {	 
   		return (substring(getStringValue(),beginWse212bTFld1,beginWse212bTFld1 + WSE_212B_TFLD_1_LEN));
   	}
     int localWse212bTFld2Counter = -1;
     public boolean isWse212bTFld2Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse212bTFld2Counter != sharedCounter;
         localWse212bTFld2Counter = sharedCounter; return hasModified;
     }
	protected static final int WSE_212B_TFLD_2_LEN = 20;
	/**
	 * 	serialize this Wse212bTFld2
	 */
   protected void serializeWse212bTFld2(char[] wse212bTFld2) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wse212bTFld2,0,getStringValue(),beginWse212bTFld2,WSE_212B_TFLD_2_LEN);
       localWse212bTFld2Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWse212bTFld2Constraints(char[] value) {
   			return super.checkConstraints(value , 20 ,false, false);
   }
    /**
	 *	refreshWse212bTFld2 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWse212bTFld2() {	 
   		return (substring(getStringValue(),beginWse212bTFld2,beginWse212bTFld2 + WSE_212B_TFLD_2_LEN));
   	}
     int localWse212bTFld3Counter = -1;
     public boolean isWse212bTFld3Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse212bTFld3Counter != sharedCounter;
         localWse212bTFld3Counter = sharedCounter; return hasModified;
     }
	protected static final int WSE_212B_TFLD_3_LEN = 30;
	/**
	 * 	serialize this Wse212bTFld3
	 */
   protected void serializeWse212bTFld3(char[] wse212bTFld3) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wse212bTFld3,0,getStringValue(),beginWse212bTFld3,WSE_212B_TFLD_3_LEN);
       localWse212bTFld3Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWse212bTFld3Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
    /**
	 *	refreshWse212bTFld3 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWse212bTFld3() {	 
   		return (substring(getStringValue(),beginWse212bTFld3,beginWse212bTFld3 + WSE_212B_TFLD_3_LEN));
   	}




}
  
