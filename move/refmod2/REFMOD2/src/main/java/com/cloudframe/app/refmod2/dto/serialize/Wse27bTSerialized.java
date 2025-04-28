package com.cloudframe.app.refmod2.dto.serialize;

/**
*  The class Wse27bTSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 08:02. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Wse27bTSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Wse27bTSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WSE_27B_T_LENGTH = 60;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginWse27bTFld1;
            protected  int beginWse27bTFld2;
            protected  int beginWse27bTFld3;
	
	/**
	* Constructor for Wse27bTSerialized
	**/
    public Wse27bTSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Wse27bTSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Wse27bTSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Wse27bTSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,5); // serialize this field at offset 5 by default 
    }
    
	/**
	* sets parent for this Wse27bTSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 5 by default
    }    
	/**
	* initializes the field in Wse27bTSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(WSE_27B_T_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginWse27bTFld1 = getStartOffset() + 0;	// set offset for serialization
  
             beginWse27bTFld2 = getStartOffset() + 10;	// set offset for serialization
  
             beginWse27bTFld3 = getStartOffset() + 30;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localWse27bTFld1Counter = -1;
     public boolean isWse27bTFld1Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse27bTFld1Counter != sharedCounter;
         localWse27bTFld1Counter = sharedCounter; return hasModified;
     }
	protected static final int WSE_27B_TFLD_1_LEN = 10;
	/**
	 * 	serialize this Wse27bTFld1
	 */
   protected void serializeWse27bTFld1(char[] wse27bTFld1) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wse27bTFld1,0,getStringValue(),beginWse27bTFld1,WSE_27B_TFLD_1_LEN);
       localWse27bTFld1Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWse27bTFld1Constraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshWse27bTFld1 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWse27bTFld1() {	 
   		return (substring(getStringValue(),beginWse27bTFld1,beginWse27bTFld1 + WSE_27B_TFLD_1_LEN));
   	}
     int localWse27bTFld2Counter = -1;
     public boolean isWse27bTFld2Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse27bTFld2Counter != sharedCounter;
         localWse27bTFld2Counter = sharedCounter; return hasModified;
     }
	protected static final int WSE_27B_TFLD_2_LEN = 20;
	/**
	 * 	serialize this Wse27bTFld2
	 */
   protected void serializeWse27bTFld2(char[] wse27bTFld2) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wse27bTFld2,0,getStringValue(),beginWse27bTFld2,WSE_27B_TFLD_2_LEN);
       localWse27bTFld2Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWse27bTFld2Constraints(char[] value) {
   			return super.checkConstraints(value , 20 ,false, false);
   }
    /**
	 *	refreshWse27bTFld2 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWse27bTFld2() {	 
   		return (substring(getStringValue(),beginWse27bTFld2,beginWse27bTFld2 + WSE_27B_TFLD_2_LEN));
   	}
     int localWse27bTFld3Counter = -1;
     public boolean isWse27bTFld3Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse27bTFld3Counter != sharedCounter;
         localWse27bTFld3Counter = sharedCounter; return hasModified;
     }
	protected static final int WSE_27B_TFLD_3_LEN = 30;
	/**
	 * 	serialize this Wse27bTFld3
	 */
   protected void serializeWse27bTFld3(char[] wse27bTFld3) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wse27bTFld3,0,getStringValue(),beginWse27bTFld3,WSE_27B_TFLD_3_LEN);
       localWse27bTFld3Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWse27bTFld3Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
    /**
	 *	refreshWse27bTFld3 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWse27bTFld3() {	 
   		return (substring(getStringValue(),beginWse27bTFld3,beginWse27bTFld3 + WSE_27B_TFLD_3_LEN));
   	}




}
  
