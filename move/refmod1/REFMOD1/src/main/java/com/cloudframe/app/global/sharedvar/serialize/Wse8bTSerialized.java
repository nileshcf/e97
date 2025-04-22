package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Wse8bTSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:13. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Wse8bTSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Wse8bTSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WSE_8B_T_LENGTH = 60;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginWse8bTFld1;
            protected  int beginWse8bTFld2;
            protected  int beginWse8bTFld3;
	
	/**
	* Constructor for Wse8bTSerialized
	**/
    public Wse8bTSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Wse8bTSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Wse8bTSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Wse8bTSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,5); // serialize this field at offset 5 by default 
    }
    
	/**
	* sets parent for this Wse8bTSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 5 by default
    }    
	/**
	* initializes the field in Wse8bTSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(WSE_8B_T_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginWse8bTFld1 = getStartOffset() + 0;	// set offset for serialization
  
             beginWse8bTFld2 = getStartOffset() + 10;	// set offset for serialization
  
             beginWse8bTFld3 = getStartOffset() + 30;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localWse8bTFld1Counter = -1;
     public boolean isWse8bTFld1Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse8bTFld1Counter != sharedCounter;
         localWse8bTFld1Counter = sharedCounter; return hasModified;
     }
	protected static final int WSE_8B_TFLD_1_LEN = 10;
	/**
	 * 	serialize this Wse8bTFld1
	 */
   protected void serializeWse8bTFld1(char[] wse8bTFld1) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wse8bTFld1,0,getStringValue(),beginWse8bTFld1,WSE_8B_TFLD_1_LEN);
       localWse8bTFld1Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWse8bTFld1Constraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshWse8bTFld1 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWse8bTFld1() {	 
   		return (substring(getStringValue(),beginWse8bTFld1,beginWse8bTFld1 + WSE_8B_TFLD_1_LEN));
   	}
     int localWse8bTFld2Counter = -1;
     public boolean isWse8bTFld2Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse8bTFld2Counter != sharedCounter;
         localWse8bTFld2Counter = sharedCounter; return hasModified;
     }
	protected static final int WSE_8B_TFLD_2_LEN = 20;
	/**
	 * 	serialize this Wse8bTFld2
	 */
   protected void serializeWse8bTFld2(char[] wse8bTFld2) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wse8bTFld2,0,getStringValue(),beginWse8bTFld2,WSE_8B_TFLD_2_LEN);
       localWse8bTFld2Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWse8bTFld2Constraints(char[] value) {
   			return super.checkConstraints(value , 20 ,false, false);
   }
    /**
	 *	refreshWse8bTFld2 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWse8bTFld2() {	 
   		return (substring(getStringValue(),beginWse8bTFld2,beginWse8bTFld2 + WSE_8B_TFLD_2_LEN));
   	}
     int localWse8bTFld3Counter = -1;
     public boolean isWse8bTFld3Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse8bTFld3Counter != sharedCounter;
         localWse8bTFld3Counter = sharedCounter; return hasModified;
     }
	protected static final int WSE_8B_TFLD_3_LEN = 30;
	/**
	 * 	serialize this Wse8bTFld3
	 */
   protected void serializeWse8bTFld3(char[] wse8bTFld3) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wse8bTFld3,0,getStringValue(),beginWse8bTFld3,WSE_8B_TFLD_3_LEN);
       localWse8bTFld3Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWse8bTFld3Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
    /**
	 *	refreshWse8bTFld3 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWse8bTFld3() {	 
   		return (substring(getStringValue(),beginWse8bTFld3,beginWse8bTFld3 + WSE_8B_TFLD_3_LEN));
   	}




}
  
