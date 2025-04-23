package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Wse6bTSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:26. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Wse6bTSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Wse6bTSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WSE_6B_T_LENGTH = 60;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginWse6bTFld1;
            protected  int beginWse6bTFld2;
            protected  int beginWse6bTFld3;
	
	/**
	* Constructor for Wse6bTSerialized
	**/
    public Wse6bTSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Wse6bTSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Wse6bTSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Wse6bTSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this Wse6bTSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in Wse6bTSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(WSE_6B_T_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginWse6bTFld1 = getStartOffset() + 0;	// set offset for serialization
  
             beginWse6bTFld2 = getStartOffset() + 10;	// set offset for serialization
  
             beginWse6bTFld3 = getStartOffset() + 30;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localWse6bTFld1Counter = -1;
     public boolean isWse6bTFld1Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse6bTFld1Counter != sharedCounter;
         localWse6bTFld1Counter = sharedCounter; return hasModified;
     }
	protected static final int WSE_6B_TFLD_1_LEN = 10;
	/**
	 * 	serialize this Wse6bTFld1
	 */
   protected void serializeWse6bTFld1(char[] wse6bTFld1) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wse6bTFld1,0,getStringValue(),beginWse6bTFld1,WSE_6B_TFLD_1_LEN);
       localWse6bTFld1Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWse6bTFld1Constraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshWse6bTFld1 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWse6bTFld1() {	 
   		return (substring(getStringValue(),beginWse6bTFld1,beginWse6bTFld1 + WSE_6B_TFLD_1_LEN));
   	}
     int localWse6bTFld2Counter = -1;
     public boolean isWse6bTFld2Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse6bTFld2Counter != sharedCounter;
         localWse6bTFld2Counter = sharedCounter; return hasModified;
     }
	protected static final int WSE_6B_TFLD_2_LEN = 20;
	/**
	 * 	serialize this Wse6bTFld2
	 */
   protected void serializeWse6bTFld2(char[] wse6bTFld2) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wse6bTFld2,0,getStringValue(),beginWse6bTFld2,WSE_6B_TFLD_2_LEN);
       localWse6bTFld2Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWse6bTFld2Constraints(char[] value) {
   			return super.checkConstraints(value , 20 ,false, false);
   }
    /**
	 *	refreshWse6bTFld2 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWse6bTFld2() {	 
   		return (substring(getStringValue(),beginWse6bTFld2,beginWse6bTFld2 + WSE_6B_TFLD_2_LEN));
   	}
     int localWse6bTFld3Counter = -1;
     public boolean isWse6bTFld3Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse6bTFld3Counter != sharedCounter;
         localWse6bTFld3Counter = sharedCounter; return hasModified;
     }
	protected static final int WSE_6B_TFLD_3_LEN = 30;
	/**
	 * 	serialize this Wse6bTFld3
	 */
   protected void serializeWse6bTFld3(char[] wse6bTFld3) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wse6bTFld3,0,getStringValue(),beginWse6bTFld3,WSE_6B_TFLD_3_LEN);
       localWse6bTFld3Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWse6bTFld3Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
    /**
	 *	refreshWse6bTFld3 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWse6bTFld3() {	 
   		return (substring(getStringValue(),beginWse6bTFld3,beginWse6bTFld3 + WSE_6B_TFLD_3_LEN));
   	}




}
  
