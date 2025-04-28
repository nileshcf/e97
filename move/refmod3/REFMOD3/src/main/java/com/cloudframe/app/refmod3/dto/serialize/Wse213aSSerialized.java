package com.cloudframe.app.refmod3.dto.serialize;

/**
*  The class Wse213aSSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 08:00. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Wse213aSSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Wse213aSSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WSE_213A_S_LENGTH = 60;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginWse213aSFld1;
            protected  int beginWse213aSFld2;
	
	/**
	* Constructor for Wse213aSSerialized
	**/
    public Wse213aSSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Wse213aSSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Wse213aSSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Wse213aSSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,3); // serialize this field at offset 3 by default 
    }
    
	/**
	* sets parent for this Wse213aSSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 3 by default
    }    
	/**
	* initializes the field in Wse213aSSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(WSE_213A_S_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginWse213aSFld1 = getStartOffset() + 0;	// set offset for serialization
  
             beginWse213aSFld2 = getStartOffset() + 30;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localWse213aSFld1Counter = -1;
     public boolean isWse213aSFld1Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse213aSFld1Counter != sharedCounter;
         localWse213aSFld1Counter = sharedCounter; return hasModified;
     }
	protected static final int WSE_213A_SFLD_1_LEN = 30;
	/**
	 * 	serialize this Wse213aSFld1
	 */
   protected void serializeWse213aSFld1(char[] wse213aSFld1) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wse213aSFld1,0,getStringValue(),beginWse213aSFld1,WSE_213A_SFLD_1_LEN);
       localWse213aSFld1Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWse213aSFld1Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
    /**
	 *	refreshWse213aSFld1 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWse213aSFld1() {	 
   		return (substring(getStringValue(),beginWse213aSFld1,beginWse213aSFld1 + WSE_213A_SFLD_1_LEN));
   	}
     int localWse213aSFld2Counter = -1;
     public boolean isWse213aSFld2Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse213aSFld2Counter != sharedCounter;
         localWse213aSFld2Counter = sharedCounter; return hasModified;
     }
	protected static final int WSE_213A_SFLD_2_LEN = 30;
	/**
	 * 	serialize this Wse213aSFld2
	 */
   protected void serializeWse213aSFld2(char[] wse213aSFld2) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wse213aSFld2,0,getStringValue(),beginWse213aSFld2,WSE_213A_SFLD_2_LEN);
       localWse213aSFld2Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWse213aSFld2Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
    /**
	 *	refreshWse213aSFld2 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWse213aSFld2() {	 
   		return (substring(getStringValue(),beginWse213aSFld2,beginWse213aSFld2 + WSE_213A_SFLD_2_LEN));
   	}




}
  
