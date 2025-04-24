package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Wse10bTSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:36. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Wse10bTSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Wse10bTSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WSE_10B_T_LENGTH = 60;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginWse10bTFld1;
            protected  int beginWse10bTFld2;
            protected  int beginWse10bTFld3;
	
	/**
	* Constructor for Wse10bTSerialized
	**/
    public Wse10bTSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Wse10bTSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Wse10bTSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Wse10bTSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,5); // serialize this field at offset 5 by default 
    }
    
	/**
	* sets parent for this Wse10bTSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 5 by default
    }    
	/**
	* initializes the field in Wse10bTSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(WSE_10B_T_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginWse10bTFld1 = getStartOffset() + 0;	// set offset for serialization
  
             beginWse10bTFld2 = getStartOffset() + 10;	// set offset for serialization
  
             beginWse10bTFld3 = getStartOffset() + 30;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localWse10bTFld1Counter = -1;
     public boolean isWse10bTFld1Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse10bTFld1Counter != sharedCounter;
         localWse10bTFld1Counter = sharedCounter; return hasModified;
     }
	protected static final int WSE_10B_TFLD_1_LEN = 10;
	/**
	 * 	serialize this Wse10bTFld1
	 */
   protected void serializeWse10bTFld1(char[] wse10bTFld1) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wse10bTFld1,0,getStringValue(),beginWse10bTFld1,WSE_10B_TFLD_1_LEN);
       localWse10bTFld1Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWse10bTFld1Constraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshWse10bTFld1 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWse10bTFld1() {	 
   		return (substring(getStringValue(),beginWse10bTFld1,beginWse10bTFld1 + WSE_10B_TFLD_1_LEN));
   	}
     int localWse10bTFld2Counter = -1;
     public boolean isWse10bTFld2Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse10bTFld2Counter != sharedCounter;
         localWse10bTFld2Counter = sharedCounter; return hasModified;
     }
	protected static final int WSE_10B_TFLD_2_LEN = 20;
	/**
	 * 	serialize this Wse10bTFld2
	 */
   protected void serializeWse10bTFld2(char[] wse10bTFld2) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wse10bTFld2,0,getStringValue(),beginWse10bTFld2,WSE_10B_TFLD_2_LEN);
       localWse10bTFld2Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWse10bTFld2Constraints(char[] value) {
   			return super.checkConstraints(value , 20 ,false, false);
   }
    /**
	 *	refreshWse10bTFld2 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWse10bTFld2() {	 
   		return (substring(getStringValue(),beginWse10bTFld2,beginWse10bTFld2 + WSE_10B_TFLD_2_LEN));
   	}
     int localWse10bTFld3Counter = -1;
     public boolean isWse10bTFld3Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse10bTFld3Counter != sharedCounter;
         localWse10bTFld3Counter = sharedCounter; return hasModified;
     }
	protected static final int WSE_10B_TFLD_3_LEN = 30;
	/**
	 * 	serialize this Wse10bTFld3
	 */
   protected void serializeWse10bTFld3(char[] wse10bTFld3) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wse10bTFld3,0,getStringValue(),beginWse10bTFld3,WSE_10B_TFLD_3_LEN);
       localWse10bTFld3Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWse10bTFld3Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
    /**
	 *	refreshWse10bTFld3 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWse10bTFld3() {	 
   		return (substring(getStringValue(),beginWse10bTFld3,beginWse10bTFld3 + WSE_10B_TFLD_3_LEN));
   	}




}
  
