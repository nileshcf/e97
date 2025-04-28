package com.cloudframe.app.refmod3.dto.serialize;

/**
*  The class Wse25aSSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 06:57. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Wse25aSSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Wse25aSSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WSE_25A_S_LENGTH = 60;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginWse25aSFld1;
            protected  int beginWse25aSFld2;
	
	/**
	* Constructor for Wse25aSSerialized
	**/
    public Wse25aSSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Wse25aSSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Wse25aSSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Wse25aSSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,3); // serialize this field at offset 3 by default 
    }
    
	/**
	* sets parent for this Wse25aSSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 3 by default
    }    
	/**
	* initializes the field in Wse25aSSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(WSE_25A_S_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginWse25aSFld1 = getStartOffset() + 0;	// set offset for serialization
  
             beginWse25aSFld2 = getStartOffset() + 30;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localWse25aSFld1Counter = -1;
     public boolean isWse25aSFld1Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse25aSFld1Counter != sharedCounter;
         localWse25aSFld1Counter = sharedCounter; return hasModified;
     }
	protected static final int WSE_25A_SFLD_1_LEN = 30;
	/**
	 * 	serialize this Wse25aSFld1
	 */
   protected void serializeWse25aSFld1(char[] wse25aSFld1) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wse25aSFld1,0,getStringValue(),beginWse25aSFld1,WSE_25A_SFLD_1_LEN);
       localWse25aSFld1Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWse25aSFld1Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
    /**
	 *	refreshWse25aSFld1 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWse25aSFld1() {	 
   		return (substring(getStringValue(),beginWse25aSFld1,beginWse25aSFld1 + WSE_25A_SFLD_1_LEN));
   	}
     int localWse25aSFld2Counter = -1;
     public boolean isWse25aSFld2Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse25aSFld2Counter != sharedCounter;
         localWse25aSFld2Counter = sharedCounter; return hasModified;
     }
	protected static final int WSE_25A_SFLD_2_LEN = 30;
	/**
	 * 	serialize this Wse25aSFld2
	 */
   protected void serializeWse25aSFld2(char[] wse25aSFld2) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wse25aSFld2,0,getStringValue(),beginWse25aSFld2,WSE_25A_SFLD_2_LEN);
       localWse25aSFld2Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWse25aSFld2Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
    /**
	 *	refreshWse25aSFld2 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWse25aSFld2() {	 
   		return (substring(getStringValue(),beginWse25aSFld2,beginWse25aSFld2 + WSE_25A_SFLD_2_LEN));
   	}




}
  
