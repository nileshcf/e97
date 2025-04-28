package com.cloudframe.app.refmod3.dto.serialize;

/**
*  The class BT27Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 08:00. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class BT27Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(BT27Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int B_T_27_LENGTH = 90;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginBTFld127;
            protected  int beginBTFld227;
            protected  int beginBTFld327;
	
	/**
	* Constructor for BT27Serialized
	**/
    public BT27Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for BT27Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public BT27Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this BT27Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,5); // serialize this field at offset 5 by default 
    }
    
	/**
	* sets parent for this BT27Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 5 by default
    }    
	/**
	* initializes the field in BT27Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(B_T_27_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginBTFld127 = getStartOffset() + 0;	// set offset for serialization
  
             beginBTFld227 = getStartOffset() + 20;	// set offset for serialization
  
             beginBTFld327 = getStartOffset() + 60;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localBTFld127Counter = -1;
     public boolean isBTFld127Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBTFld127Counter != sharedCounter;
         localBTFld127Counter = sharedCounter; return hasModified;
     }
	protected static final int B_TFLD_127_LEN = 20;
	/**
	 * 	serialize this BTFld127
	 */
   protected void serializeBTFld127(char[] bTFld127) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bTFld127,0,getStringValue(),beginBTFld127,B_TFLD_127_LEN);
       localBTFld127Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBTFld127Constraints(char[] value) {
   			return super.checkConstraints(value , 20 ,false, false);
   }
    /**
	 *	refreshBTFld127 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBTFld127() {	 
   		return (substring(getStringValue(),beginBTFld127,beginBTFld127 + B_TFLD_127_LEN));
   	}
     int localBTFld227Counter = -1;
     public boolean isBTFld227Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBTFld227Counter != sharedCounter;
         localBTFld227Counter = sharedCounter; return hasModified;
     }
	protected static final int B_TFLD_227_LEN = 40;
	/**
	 * 	serialize this BTFld227
	 */
   protected void serializeBTFld227(char[] bTFld227) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bTFld227,0,getStringValue(),beginBTFld227,B_TFLD_227_LEN);
       localBTFld227Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBTFld227Constraints(char[] value) {
   			return super.checkConstraints(value , 40 ,false, false);
   }
    /**
	 *	refreshBTFld227 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBTFld227() {	 
   		return (substring(getStringValue(),beginBTFld227,beginBTFld227 + B_TFLD_227_LEN));
   	}
     int localBTFld327Counter = -1;
     public boolean isBTFld327Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBTFld327Counter != sharedCounter;
         localBTFld327Counter = sharedCounter; return hasModified;
     }
	protected static final int B_TFLD_327_LEN = 30;
	/**
	 * 	serialize this BTFld327
	 */
   protected void serializeBTFld327(char[] bTFld327) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bTFld327,0,getStringValue(),beginBTFld327,B_TFLD_327_LEN);
       localBTFld327Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBTFld327Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
    /**
	 *	refreshBTFld327 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBTFld327() {	 
   		return (substring(getStringValue(),beginBTFld327,beginBTFld327 + B_TFLD_327_LEN));
   	}




}
  
