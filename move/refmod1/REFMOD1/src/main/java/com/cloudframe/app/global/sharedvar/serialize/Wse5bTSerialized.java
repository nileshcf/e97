package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Wse5bTSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:01. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Wse5bTSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Wse5bTSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WSE_5B_T_LENGTH = 90;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginWse5bTFld1;
            protected  int beginWse5bTFld2;
            protected  int beginWse5bTFld3;
	
	/**
	* Constructor for Wse5bTSerialized
	**/
    public Wse5bTSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Wse5bTSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Wse5bTSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Wse5bTSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this Wse5bTSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in Wse5bTSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(WSE_5B_T_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginWse5bTFld1 = getStartOffset() + 0;	// set offset for serialization
  
             beginWse5bTFld2 = getStartOffset() + 20;	// set offset for serialization
  
             beginWse5bTFld3 = getStartOffset() + 60;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localWse5bTFld1Counter = -1;
     public boolean isWse5bTFld1Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse5bTFld1Counter != sharedCounter;
         localWse5bTFld1Counter = sharedCounter; return hasModified;
     }
	protected static final int WSE_5B_TFLD_1_LEN = 20;
	/**
	 * 	serialize this Wse5bTFld1
	 */
   protected void serializeWse5bTFld1(char[] wse5bTFld1) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wse5bTFld1,0,getStringValue(),beginWse5bTFld1,WSE_5B_TFLD_1_LEN);
       localWse5bTFld1Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWse5bTFld1Constraints(char[] value) {
   			return super.checkConstraints(value , 20 ,false, false);
   }
    /**
	 *	refreshWse5bTFld1 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWse5bTFld1() {	 
   		return (substring(getStringValue(),beginWse5bTFld1,beginWse5bTFld1 + WSE_5B_TFLD_1_LEN));
   	}
     int localWse5bTFld2Counter = -1;
     public boolean isWse5bTFld2Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse5bTFld2Counter != sharedCounter;
         localWse5bTFld2Counter = sharedCounter; return hasModified;
     }
	protected static final int WSE_5B_TFLD_2_LEN = 40;
	/**
	 * 	serialize this Wse5bTFld2
	 */
   protected void serializeWse5bTFld2(char[] wse5bTFld2) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wse5bTFld2,0,getStringValue(),beginWse5bTFld2,WSE_5B_TFLD_2_LEN);
       localWse5bTFld2Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWse5bTFld2Constraints(char[] value) {
   			return super.checkConstraints(value , 40 ,false, false);
   }
    /**
	 *	refreshWse5bTFld2 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWse5bTFld2() {	 
   		return (substring(getStringValue(),beginWse5bTFld2,beginWse5bTFld2 + WSE_5B_TFLD_2_LEN));
   	}
     int localWse5bTFld3Counter = -1;
     public boolean isWse5bTFld3Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse5bTFld3Counter != sharedCounter;
         localWse5bTFld3Counter = sharedCounter; return hasModified;
     }
	protected static final int WSE_5B_TFLD_3_LEN = 30;
	/**
	 * 	serialize this Wse5bTFld3
	 */
   protected void serializeWse5bTFld3(char[] wse5bTFld3) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wse5bTFld3,0,getStringValue(),beginWse5bTFld3,WSE_5B_TFLD_3_LEN);
       localWse5bTFld3Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWse5bTFld3Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
    /**
	 *	refreshWse5bTFld3 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWse5bTFld3() {	 
   		return (substring(getStringValue(),beginWse5bTFld3,beginWse5bTFld3 + WSE_5B_TFLD_3_LEN));
   	}




}
  
