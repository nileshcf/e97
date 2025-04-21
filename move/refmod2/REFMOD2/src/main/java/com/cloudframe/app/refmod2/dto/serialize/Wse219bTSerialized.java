package com.cloudframe.app.refmod2.dto.serialize;

/**
*  The class Wse219bTSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:05. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Wse219bTSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Wse219bTSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WSE_219B_T_LENGTH = 60;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginWse219bTFld1;
            protected  int beginWse219bTFld2;
            protected  int beginWse219bTFld3;
	
	/**
	* Constructor for Wse219bTSerialized
	**/
    public Wse219bTSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Wse219bTSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Wse219bTSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Wse219bTSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,5); // serialize this field at offset 5 by default 
    }
    
	/**
	* sets parent for this Wse219bTSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 5 by default
    }    
	/**
	* initializes the field in Wse219bTSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(WSE_219B_T_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginWse219bTFld1 = getStartOffset() + 0;	// set offset for serialization
  
             beginWse219bTFld2 = getStartOffset() + 10;	// set offset for serialization
  
             beginWse219bTFld3 = getStartOffset() + 30;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localWse219bTFld1Counter = -1;
     public boolean isWse219bTFld1Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse219bTFld1Counter != sharedCounter;
         localWse219bTFld1Counter = sharedCounter; return hasModified;
     }
	protected static final int WSE_219B_TFLD_1_LEN = 10;
	/**
	 * 	serialize this Wse219bTFld1
	 */
   protected void serializeWse219bTFld1(char[] wse219bTFld1) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wse219bTFld1,0,getStringValue(),beginWse219bTFld1,WSE_219B_TFLD_1_LEN);
       localWse219bTFld1Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWse219bTFld1Constraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshWse219bTFld1 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWse219bTFld1() {	 
   		return (substring(getStringValue(),beginWse219bTFld1,beginWse219bTFld1 + WSE_219B_TFLD_1_LEN));
   	}
     int localWse219bTFld2Counter = -1;
     public boolean isWse219bTFld2Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse219bTFld2Counter != sharedCounter;
         localWse219bTFld2Counter = sharedCounter; return hasModified;
     }
	protected static final int WSE_219B_TFLD_2_LEN = 20;
	/**
	 * 	serialize this Wse219bTFld2
	 */
   protected void serializeWse219bTFld2(char[] wse219bTFld2) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wse219bTFld2,0,getStringValue(),beginWse219bTFld2,WSE_219B_TFLD_2_LEN);
       localWse219bTFld2Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWse219bTFld2Constraints(char[] value) {
   			return super.checkConstraints(value , 20 ,false, false);
   }
    /**
	 *	refreshWse219bTFld2 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWse219bTFld2() {	 
   		return (substring(getStringValue(),beginWse219bTFld2,beginWse219bTFld2 + WSE_219B_TFLD_2_LEN));
   	}
     int localWse219bTFld3Counter = -1;
     public boolean isWse219bTFld3Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse219bTFld3Counter != sharedCounter;
         localWse219bTFld3Counter = sharedCounter; return hasModified;
     }
	protected static final int WSE_219B_TFLD_3_LEN = 30;
	/**
	 * 	serialize this Wse219bTFld3
	 */
   protected void serializeWse219bTFld3(char[] wse219bTFld3) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wse219bTFld3,0,getStringValue(),beginWse219bTFld3,WSE_219B_TFLD_3_LEN);
       localWse219bTFld3Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWse219bTFld3Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
    /**
	 *	refreshWse219bTFld3 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWse219bTFld3() {	 
   		return (substring(getStringValue(),beginWse219bTFld3,beginWse219bTFld3 + WSE_219B_TFLD_3_LEN));
   	}




}
  
