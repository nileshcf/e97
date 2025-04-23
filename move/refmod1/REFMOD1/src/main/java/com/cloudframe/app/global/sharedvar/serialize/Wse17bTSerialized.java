package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Wse17bTSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:26. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Wse17bTSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Wse17bTSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WSE_17B_T_LENGTH = 60;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginWse17bTFld1;
            protected  int beginWse17bTFld2;
            protected  int beginWse17bTFld3;
	
	/**
	* Constructor for Wse17bTSerialized
	**/
    public Wse17bTSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Wse17bTSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Wse17bTSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Wse17bTSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,5); // serialize this field at offset 5 by default 
    }
    
	/**
	* sets parent for this Wse17bTSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 5 by default
    }    
	/**
	* initializes the field in Wse17bTSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(WSE_17B_T_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginWse17bTFld1 = getStartOffset() + 0;	// set offset for serialization
  
             beginWse17bTFld2 = getStartOffset() + 10;	// set offset for serialization
  
             beginWse17bTFld3 = getStartOffset() + 30;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localWse17bTFld1Counter = -1;
     public boolean isWse17bTFld1Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse17bTFld1Counter != sharedCounter;
         localWse17bTFld1Counter = sharedCounter; return hasModified;
     }
	protected static final int WSE_17B_TFLD_1_LEN = 10;
	/**
	 * 	serialize this Wse17bTFld1
	 */
   protected void serializeWse17bTFld1(char[] wse17bTFld1) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wse17bTFld1,0,getStringValue(),beginWse17bTFld1,WSE_17B_TFLD_1_LEN);
       localWse17bTFld1Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWse17bTFld1Constraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshWse17bTFld1 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWse17bTFld1() {	 
   		return (substring(getStringValue(),beginWse17bTFld1,beginWse17bTFld1 + WSE_17B_TFLD_1_LEN));
   	}
     int localWse17bTFld2Counter = -1;
     public boolean isWse17bTFld2Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse17bTFld2Counter != sharedCounter;
         localWse17bTFld2Counter = sharedCounter; return hasModified;
     }
	protected static final int WSE_17B_TFLD_2_LEN = 20;
	/**
	 * 	serialize this Wse17bTFld2
	 */
   protected void serializeWse17bTFld2(char[] wse17bTFld2) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wse17bTFld2,0,getStringValue(),beginWse17bTFld2,WSE_17B_TFLD_2_LEN);
       localWse17bTFld2Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWse17bTFld2Constraints(char[] value) {
   			return super.checkConstraints(value , 20 ,false, false);
   }
    /**
	 *	refreshWse17bTFld2 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWse17bTFld2() {	 
   		return (substring(getStringValue(),beginWse17bTFld2,beginWse17bTFld2 + WSE_17B_TFLD_2_LEN));
   	}
     int localWse17bTFld3Counter = -1;
     public boolean isWse17bTFld3Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse17bTFld3Counter != sharedCounter;
         localWse17bTFld3Counter = sharedCounter; return hasModified;
     }
	protected static final int WSE_17B_TFLD_3_LEN = 30;
	/**
	 * 	serialize this Wse17bTFld3
	 */
   protected void serializeWse17bTFld3(char[] wse17bTFld3) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wse17bTFld3,0,getStringValue(),beginWse17bTFld3,WSE_17B_TFLD_3_LEN);
       localWse17bTFld3Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWse17bTFld3Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
    /**
	 *	refreshWse17bTFld3 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWse17bTFld3() {	 
   		return (substring(getStringValue(),beginWse17bTFld3,beginWse17bTFld3 + WSE_17B_TFLD_3_LEN));
   	}




}
  
