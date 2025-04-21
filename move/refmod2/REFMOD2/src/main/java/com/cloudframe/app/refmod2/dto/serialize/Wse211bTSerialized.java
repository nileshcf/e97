package com.cloudframe.app.refmod2.dto.serialize;

/**
*  The class Wse211bTSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:00. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Wse211bTSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Wse211bTSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WSE_211B_T_LENGTH = 60;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginWse211bTFld1;
            protected  int beginWse211bTFld2;
            protected  int beginWse211bTFld3;
	
	/**
	* Constructor for Wse211bTSerialized
	**/
    public Wse211bTSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Wse211bTSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Wse211bTSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Wse211bTSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,5); // serialize this field at offset 5 by default 
    }
    
	/**
	* sets parent for this Wse211bTSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 5 by default
    }    
	/**
	* initializes the field in Wse211bTSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(WSE_211B_T_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginWse211bTFld1 = getStartOffset() + 0;	// set offset for serialization
  
             beginWse211bTFld2 = getStartOffset() + 10;	// set offset for serialization
  
             beginWse211bTFld3 = getStartOffset() + 30;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localWse211bTFld1Counter = -1;
     public boolean isWse211bTFld1Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse211bTFld1Counter != sharedCounter;
         localWse211bTFld1Counter = sharedCounter; return hasModified;
     }
	protected static final int WSE_211B_TFLD_1_LEN = 10;
	/**
	 * 	serialize this Wse211bTFld1
	 */
   protected void serializeWse211bTFld1(char[] wse211bTFld1) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wse211bTFld1,0,getStringValue(),beginWse211bTFld1,WSE_211B_TFLD_1_LEN);
       localWse211bTFld1Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWse211bTFld1Constraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshWse211bTFld1 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWse211bTFld1() {	 
   		return (substring(getStringValue(),beginWse211bTFld1,beginWse211bTFld1 + WSE_211B_TFLD_1_LEN));
   	}
     int localWse211bTFld2Counter = -1;
     public boolean isWse211bTFld2Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse211bTFld2Counter != sharedCounter;
         localWse211bTFld2Counter = sharedCounter; return hasModified;
     }
	protected static final int WSE_211B_TFLD_2_LEN = 20;
	/**
	 * 	serialize this Wse211bTFld2
	 */
   protected void serializeWse211bTFld2(char[] wse211bTFld2) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wse211bTFld2,0,getStringValue(),beginWse211bTFld2,WSE_211B_TFLD_2_LEN);
       localWse211bTFld2Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWse211bTFld2Constraints(char[] value) {
   			return super.checkConstraints(value , 20 ,false, false);
   }
    /**
	 *	refreshWse211bTFld2 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWse211bTFld2() {	 
   		return (substring(getStringValue(),beginWse211bTFld2,beginWse211bTFld2 + WSE_211B_TFLD_2_LEN));
   	}
     int localWse211bTFld3Counter = -1;
     public boolean isWse211bTFld3Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse211bTFld3Counter != sharedCounter;
         localWse211bTFld3Counter = sharedCounter; return hasModified;
     }
	protected static final int WSE_211B_TFLD_3_LEN = 30;
	/**
	 * 	serialize this Wse211bTFld3
	 */
   protected void serializeWse211bTFld3(char[] wse211bTFld3) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wse211bTFld3,0,getStringValue(),beginWse211bTFld3,WSE_211B_TFLD_3_LEN);
       localWse211bTFld3Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWse211bTFld3Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
    /**
	 *	refreshWse211bTFld3 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWse211bTFld3() {	 
   		return (substring(getStringValue(),beginWse211bTFld3,beginWse211bTFld3 + WSE_211B_TFLD_3_LEN));
   	}




}
  
