package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Wse20bTSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:06. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Wse20bTSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Wse20bTSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WSE_20B_T_LENGTH = 60;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginWse20bTFld1;
            protected  int beginWse20bTFld2;
            protected  int beginWse20bTFld3;
	
	/**
	* Constructor for Wse20bTSerialized
	**/
    public Wse20bTSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Wse20bTSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Wse20bTSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Wse20bTSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,5); // serialize this field at offset 5 by default 
    }
    
	/**
	* sets parent for this Wse20bTSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 5 by default
    }    
	/**
	* initializes the field in Wse20bTSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(WSE_20B_T_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginWse20bTFld1 = getStartOffset() + 0;	// set offset for serialization
  
             beginWse20bTFld2 = getStartOffset() + 10;	// set offset for serialization
  
             beginWse20bTFld3 = getStartOffset() + 30;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localWse20bTFld1Counter = -1;
     public boolean isWse20bTFld1Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse20bTFld1Counter != sharedCounter;
         localWse20bTFld1Counter = sharedCounter; return hasModified;
     }
	protected static final int WSE_20B_TFLD_1_LEN = 10;
	/**
	 * 	serialize this Wse20bTFld1
	 */
   protected void serializeWse20bTFld1(char[] wse20bTFld1) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wse20bTFld1,0,getStringValue(),beginWse20bTFld1,WSE_20B_TFLD_1_LEN);
       localWse20bTFld1Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWse20bTFld1Constraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshWse20bTFld1 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWse20bTFld1() {	 
   		return (substring(getStringValue(),beginWse20bTFld1,beginWse20bTFld1 + WSE_20B_TFLD_1_LEN));
   	}
     int localWse20bTFld2Counter = -1;
     public boolean isWse20bTFld2Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse20bTFld2Counter != sharedCounter;
         localWse20bTFld2Counter = sharedCounter; return hasModified;
     }
	protected static final int WSE_20B_TFLD_2_LEN = 20;
	/**
	 * 	serialize this Wse20bTFld2
	 */
   protected void serializeWse20bTFld2(char[] wse20bTFld2) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wse20bTFld2,0,getStringValue(),beginWse20bTFld2,WSE_20B_TFLD_2_LEN);
       localWse20bTFld2Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWse20bTFld2Constraints(char[] value) {
   			return super.checkConstraints(value , 20 ,false, false);
   }
    /**
	 *	refreshWse20bTFld2 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWse20bTFld2() {	 
   		return (substring(getStringValue(),beginWse20bTFld2,beginWse20bTFld2 + WSE_20B_TFLD_2_LEN));
   	}
     int localWse20bTFld3Counter = -1;
     public boolean isWse20bTFld3Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse20bTFld3Counter != sharedCounter;
         localWse20bTFld3Counter = sharedCounter; return hasModified;
     }
	protected static final int WSE_20B_TFLD_3_LEN = 30;
	/**
	 * 	serialize this Wse20bTFld3
	 */
   protected void serializeWse20bTFld3(char[] wse20bTFld3) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wse20bTFld3,0,getStringValue(),beginWse20bTFld3,WSE_20B_TFLD_3_LEN);
       localWse20bTFld3Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWse20bTFld3Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
    /**
	 *	refreshWse20bTFld3 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWse20bTFld3() {	 
   		return (substring(getStringValue(),beginWse20bTFld3,beginWse20bTFld3 + WSE_20B_TFLD_3_LEN));
   	}




}
  
