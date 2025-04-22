package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Wse13bTSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:13. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Wse13bTSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Wse13bTSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WSE_13B_T_LENGTH = 60;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginWse13bTFld1;
            protected  int beginWse13bTFld2;
            protected  int beginWse13bTFld3;
	
	/**
	* Constructor for Wse13bTSerialized
	**/
    public Wse13bTSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Wse13bTSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Wse13bTSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Wse13bTSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,5); // serialize this field at offset 5 by default 
    }
    
	/**
	* sets parent for this Wse13bTSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 5 by default
    }    
	/**
	* initializes the field in Wse13bTSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(WSE_13B_T_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginWse13bTFld1 = getStartOffset() + 0;	// set offset for serialization
  
             beginWse13bTFld2 = getStartOffset() + 10;	// set offset for serialization
  
             beginWse13bTFld3 = getStartOffset() + 30;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localWse13bTFld1Counter = -1;
     public boolean isWse13bTFld1Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse13bTFld1Counter != sharedCounter;
         localWse13bTFld1Counter = sharedCounter; return hasModified;
     }
	protected static final int WSE_13B_TFLD_1_LEN = 10;
	/**
	 * 	serialize this Wse13bTFld1
	 */
   protected void serializeWse13bTFld1(char[] wse13bTFld1) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wse13bTFld1,0,getStringValue(),beginWse13bTFld1,WSE_13B_TFLD_1_LEN);
       localWse13bTFld1Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWse13bTFld1Constraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshWse13bTFld1 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWse13bTFld1() {	 
   		return (substring(getStringValue(),beginWse13bTFld1,beginWse13bTFld1 + WSE_13B_TFLD_1_LEN));
   	}
     int localWse13bTFld2Counter = -1;
     public boolean isWse13bTFld2Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse13bTFld2Counter != sharedCounter;
         localWse13bTFld2Counter = sharedCounter; return hasModified;
     }
	protected static final int WSE_13B_TFLD_2_LEN = 20;
	/**
	 * 	serialize this Wse13bTFld2
	 */
   protected void serializeWse13bTFld2(char[] wse13bTFld2) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wse13bTFld2,0,getStringValue(),beginWse13bTFld2,WSE_13B_TFLD_2_LEN);
       localWse13bTFld2Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWse13bTFld2Constraints(char[] value) {
   			return super.checkConstraints(value , 20 ,false, false);
   }
    /**
	 *	refreshWse13bTFld2 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWse13bTFld2() {	 
   		return (substring(getStringValue(),beginWse13bTFld2,beginWse13bTFld2 + WSE_13B_TFLD_2_LEN));
   	}
     int localWse13bTFld3Counter = -1;
     public boolean isWse13bTFld3Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse13bTFld3Counter != sharedCounter;
         localWse13bTFld3Counter = sharedCounter; return hasModified;
     }
	protected static final int WSE_13B_TFLD_3_LEN = 30;
	/**
	 * 	serialize this Wse13bTFld3
	 */
   protected void serializeWse13bTFld3(char[] wse13bTFld3) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wse13bTFld3,0,getStringValue(),beginWse13bTFld3,WSE_13B_TFLD_3_LEN);
       localWse13bTFld3Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWse13bTFld3Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
    /**
	 *	refreshWse13bTFld3 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWse13bTFld3() {	 
   		return (substring(getStringValue(),beginWse13bTFld3,beginWse13bTFld3 + WSE_13B_TFLD_3_LEN));
   	}




}
  
