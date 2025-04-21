package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Wse5aSSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:06. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Wse5aSSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Wse5aSSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WSE_5A_S_LENGTH = 60;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginWse5aSFld1;
            protected  int beginWse5aSFld2;
	
	/**
	* Constructor for Wse5aSSerialized
	**/
    public Wse5aSSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Wse5aSSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Wse5aSSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Wse5aSSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,3); // serialize this field at offset 3 by default 
    }
    
	/**
	* sets parent for this Wse5aSSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 3 by default
    }    
	/**
	* initializes the field in Wse5aSSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(WSE_5A_S_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginWse5aSFld1 = getStartOffset() + 0;	// set offset for serialization
  
             beginWse5aSFld2 = getStartOffset() + 30;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localWse5aSFld1Counter = -1;
     public boolean isWse5aSFld1Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse5aSFld1Counter != sharedCounter;
         localWse5aSFld1Counter = sharedCounter; return hasModified;
     }
	protected static final int WSE_5A_SFLD_1_LEN = 30;
	/**
	 * 	serialize this Wse5aSFld1
	 */
   protected void serializeWse5aSFld1(char[] wse5aSFld1) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wse5aSFld1,0,getStringValue(),beginWse5aSFld1,WSE_5A_SFLD_1_LEN);
       localWse5aSFld1Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWse5aSFld1Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
    /**
	 *	refreshWse5aSFld1 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWse5aSFld1() {	 
   		return (substring(getStringValue(),beginWse5aSFld1,beginWse5aSFld1 + WSE_5A_SFLD_1_LEN));
   	}
     int localWse5aSFld2Counter = -1;
     public boolean isWse5aSFld2Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse5aSFld2Counter != sharedCounter;
         localWse5aSFld2Counter = sharedCounter; return hasModified;
     }
	protected static final int WSE_5A_SFLD_2_LEN = 30;
	/**
	 * 	serialize this Wse5aSFld2
	 */
   protected void serializeWse5aSFld2(char[] wse5aSFld2) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wse5aSFld2,0,getStringValue(),beginWse5aSFld2,WSE_5A_SFLD_2_LEN);
       localWse5aSFld2Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWse5aSFld2Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
    /**
	 *	refreshWse5aSFld2 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWse5aSFld2() {	 
   		return (substring(getStringValue(),beginWse5aSFld2,beginWse5aSFld2 + WSE_5A_SFLD_2_LEN));
   	}




}
  
