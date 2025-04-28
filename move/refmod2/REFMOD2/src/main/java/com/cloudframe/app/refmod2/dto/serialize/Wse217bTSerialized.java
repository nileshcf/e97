package com.cloudframe.app.refmod2.dto.serialize;

/**
*  The class Wse217bTSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 06:58. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Wse217bTSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Wse217bTSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WSE_217B_T_LENGTH = 60;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginWse217bTFld1;
            protected  int beginWse217bTFld2;
            protected  int beginWse217bTFld3;
	
	/**
	* Constructor for Wse217bTSerialized
	**/
    public Wse217bTSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Wse217bTSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Wse217bTSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Wse217bTSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,5); // serialize this field at offset 5 by default 
    }
    
	/**
	* sets parent for this Wse217bTSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 5 by default
    }    
	/**
	* initializes the field in Wse217bTSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(WSE_217B_T_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginWse217bTFld1 = getStartOffset() + 0;	// set offset for serialization
  
             beginWse217bTFld2 = getStartOffset() + 10;	// set offset for serialization
  
             beginWse217bTFld3 = getStartOffset() + 30;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localWse217bTFld1Counter = -1;
     public boolean isWse217bTFld1Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse217bTFld1Counter != sharedCounter;
         localWse217bTFld1Counter = sharedCounter; return hasModified;
     }
	protected static final int WSE_217B_TFLD_1_LEN = 10;
	/**
	 * 	serialize this Wse217bTFld1
	 */
   protected void serializeWse217bTFld1(char[] wse217bTFld1) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wse217bTFld1,0,getStringValue(),beginWse217bTFld1,WSE_217B_TFLD_1_LEN);
       localWse217bTFld1Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWse217bTFld1Constraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshWse217bTFld1 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWse217bTFld1() {	 
   		return (substring(getStringValue(),beginWse217bTFld1,beginWse217bTFld1 + WSE_217B_TFLD_1_LEN));
   	}
     int localWse217bTFld2Counter = -1;
     public boolean isWse217bTFld2Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse217bTFld2Counter != sharedCounter;
         localWse217bTFld2Counter = sharedCounter; return hasModified;
     }
	protected static final int WSE_217B_TFLD_2_LEN = 20;
	/**
	 * 	serialize this Wse217bTFld2
	 */
   protected void serializeWse217bTFld2(char[] wse217bTFld2) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wse217bTFld2,0,getStringValue(),beginWse217bTFld2,WSE_217B_TFLD_2_LEN);
       localWse217bTFld2Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWse217bTFld2Constraints(char[] value) {
   			return super.checkConstraints(value , 20 ,false, false);
   }
    /**
	 *	refreshWse217bTFld2 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWse217bTFld2() {	 
   		return (substring(getStringValue(),beginWse217bTFld2,beginWse217bTFld2 + WSE_217B_TFLD_2_LEN));
   	}
     int localWse217bTFld3Counter = -1;
     public boolean isWse217bTFld3Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse217bTFld3Counter != sharedCounter;
         localWse217bTFld3Counter = sharedCounter; return hasModified;
     }
	protected static final int WSE_217B_TFLD_3_LEN = 30;
	/**
	 * 	serialize this Wse217bTFld3
	 */
   protected void serializeWse217bTFld3(char[] wse217bTFld3) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wse217bTFld3,0,getStringValue(),beginWse217bTFld3,WSE_217B_TFLD_3_LEN);
       localWse217bTFld3Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWse217bTFld3Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
    /**
	 *	refreshWse217bTFld3 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWse217bTFld3() {	 
   		return (substring(getStringValue(),beginWse217bTFld3,beginWse217bTFld3 + WSE_217B_TFLD_3_LEN));
   	}




}
  
