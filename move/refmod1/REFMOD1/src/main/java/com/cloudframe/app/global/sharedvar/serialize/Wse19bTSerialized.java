package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Wse19bTSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:04. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Wse19bTSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Wse19bTSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WSE_19B_T_LENGTH = 60;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginWse19bTFld1;
            protected  int beginWse19bTFld2;
            protected  int beginWse19bTFld3;
	
	/**
	* Constructor for Wse19bTSerialized
	**/
    public Wse19bTSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Wse19bTSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Wse19bTSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Wse19bTSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,5); // serialize this field at offset 5 by default 
    }
    
	/**
	* sets parent for this Wse19bTSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 5 by default
    }    
	/**
	* initializes the field in Wse19bTSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(WSE_19B_T_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginWse19bTFld1 = getStartOffset() + 0;	// set offset for serialization
  
             beginWse19bTFld2 = getStartOffset() + 10;	// set offset for serialization
  
             beginWse19bTFld3 = getStartOffset() + 30;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localWse19bTFld1Counter = -1;
     public boolean isWse19bTFld1Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse19bTFld1Counter != sharedCounter;
         localWse19bTFld1Counter = sharedCounter; return hasModified;
     }
	protected static final int WSE_19B_TFLD_1_LEN = 10;
	/**
	 * 	serialize this Wse19bTFld1
	 */
   protected void serializeWse19bTFld1(char[] wse19bTFld1) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wse19bTFld1,0,getStringValue(),beginWse19bTFld1,WSE_19B_TFLD_1_LEN);
       localWse19bTFld1Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWse19bTFld1Constraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshWse19bTFld1 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWse19bTFld1() {	 
   		return (substring(getStringValue(),beginWse19bTFld1,beginWse19bTFld1 + WSE_19B_TFLD_1_LEN));
   	}
     int localWse19bTFld2Counter = -1;
     public boolean isWse19bTFld2Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse19bTFld2Counter != sharedCounter;
         localWse19bTFld2Counter = sharedCounter; return hasModified;
     }
	protected static final int WSE_19B_TFLD_2_LEN = 20;
	/**
	 * 	serialize this Wse19bTFld2
	 */
   protected void serializeWse19bTFld2(char[] wse19bTFld2) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wse19bTFld2,0,getStringValue(),beginWse19bTFld2,WSE_19B_TFLD_2_LEN);
       localWse19bTFld2Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWse19bTFld2Constraints(char[] value) {
   			return super.checkConstraints(value , 20 ,false, false);
   }
    /**
	 *	refreshWse19bTFld2 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWse19bTFld2() {	 
   		return (substring(getStringValue(),beginWse19bTFld2,beginWse19bTFld2 + WSE_19B_TFLD_2_LEN));
   	}
     int localWse19bTFld3Counter = -1;
     public boolean isWse19bTFld3Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse19bTFld3Counter != sharedCounter;
         localWse19bTFld3Counter = sharedCounter; return hasModified;
     }
	protected static final int WSE_19B_TFLD_3_LEN = 30;
	/**
	 * 	serialize this Wse19bTFld3
	 */
   protected void serializeWse19bTFld3(char[] wse19bTFld3) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wse19bTFld3,0,getStringValue(),beginWse19bTFld3,WSE_19B_TFLD_3_LEN);
       localWse19bTFld3Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWse19bTFld3Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
    /**
	 *	refreshWse19bTFld3 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWse19bTFld3() {	 
   		return (substring(getStringValue(),beginWse19bTFld3,beginWse19bTFld3 + WSE_19B_TFLD_3_LEN));
   	}




}
  
