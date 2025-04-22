package com.cloudframe.app.refmod3.dto.serialize;

/**
*  The class Wse214bTSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:10. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Wse214bTSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Wse214bTSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WSE_214B_T_LENGTH = 60;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginWse214bTFld1;
            protected  int beginWse214bTFld2;
            protected  int beginWse214bTFld3;
	
	/**
	* Constructor for Wse214bTSerialized
	**/
    public Wse214bTSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Wse214bTSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Wse214bTSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Wse214bTSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,5); // serialize this field at offset 5 by default 
    }
    
	/**
	* sets parent for this Wse214bTSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 5 by default
    }    
	/**
	* initializes the field in Wse214bTSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(WSE_214B_T_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginWse214bTFld1 = getStartOffset() + 0;	// set offset for serialization
  
             beginWse214bTFld2 = getStartOffset() + 10;	// set offset for serialization
  
             beginWse214bTFld3 = getStartOffset() + 30;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localWse214bTFld1Counter = -1;
     public boolean isWse214bTFld1Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse214bTFld1Counter != sharedCounter;
         localWse214bTFld1Counter = sharedCounter; return hasModified;
     }
	protected static final int WSE_214B_TFLD_1_LEN = 10;
	/**
	 * 	serialize this Wse214bTFld1
	 */
   protected void serializeWse214bTFld1(char[] wse214bTFld1) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wse214bTFld1,0,getStringValue(),beginWse214bTFld1,WSE_214B_TFLD_1_LEN);
       localWse214bTFld1Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWse214bTFld1Constraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshWse214bTFld1 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWse214bTFld1() {	 
   		return (substring(getStringValue(),beginWse214bTFld1,beginWse214bTFld1 + WSE_214B_TFLD_1_LEN));
   	}
     int localWse214bTFld2Counter = -1;
     public boolean isWse214bTFld2Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse214bTFld2Counter != sharedCounter;
         localWse214bTFld2Counter = sharedCounter; return hasModified;
     }
	protected static final int WSE_214B_TFLD_2_LEN = 20;
	/**
	 * 	serialize this Wse214bTFld2
	 */
   protected void serializeWse214bTFld2(char[] wse214bTFld2) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wse214bTFld2,0,getStringValue(),beginWse214bTFld2,WSE_214B_TFLD_2_LEN);
       localWse214bTFld2Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWse214bTFld2Constraints(char[] value) {
   			return super.checkConstraints(value , 20 ,false, false);
   }
    /**
	 *	refreshWse214bTFld2 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWse214bTFld2() {	 
   		return (substring(getStringValue(),beginWse214bTFld2,beginWse214bTFld2 + WSE_214B_TFLD_2_LEN));
   	}
     int localWse214bTFld3Counter = -1;
     public boolean isWse214bTFld3Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse214bTFld3Counter != sharedCounter;
         localWse214bTFld3Counter = sharedCounter; return hasModified;
     }
	protected static final int WSE_214B_TFLD_3_LEN = 30;
	/**
	 * 	serialize this Wse214bTFld3
	 */
   protected void serializeWse214bTFld3(char[] wse214bTFld3) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wse214bTFld3,0,getStringValue(),beginWse214bTFld3,WSE_214B_TFLD_3_LEN);
       localWse214bTFld3Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWse214bTFld3Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
    /**
	 *	refreshWse214bTFld3 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWse214bTFld3() {	 
   		return (substring(getStringValue(),beginWse214bTFld3,beginWse214bTFld3 + WSE_214B_TFLD_3_LEN));
   	}




}
  
