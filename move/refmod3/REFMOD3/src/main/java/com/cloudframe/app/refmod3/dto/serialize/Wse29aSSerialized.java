package com.cloudframe.app.refmod3.dto.serialize;

/**
*  The class Wse29aSSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 10:59. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Wse29aSSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Wse29aSSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WSE_29A_S_LENGTH = 60;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginWse29aSFld1;
            protected  int beginWse29aSFld2;
	
	/**
	* Constructor for Wse29aSSerialized
	**/
    public Wse29aSSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Wse29aSSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Wse29aSSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Wse29aSSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,3); // serialize this field at offset 3 by default 
    }
    
	/**
	* sets parent for this Wse29aSSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 3 by default
    }    
	/**
	* initializes the field in Wse29aSSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(WSE_29A_S_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginWse29aSFld1 = getStartOffset() + 0;	// set offset for serialization
  
             beginWse29aSFld2 = getStartOffset() + 30;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localWse29aSFld1Counter = -1;
     public boolean isWse29aSFld1Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse29aSFld1Counter != sharedCounter;
         localWse29aSFld1Counter = sharedCounter; return hasModified;
     }
	protected static final int WSE_29A_SFLD_1_LEN = 30;
	/**
	 * 	serialize this Wse29aSFld1
	 */
   protected void serializeWse29aSFld1(char[] wse29aSFld1) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wse29aSFld1,0,getStringValue(),beginWse29aSFld1,WSE_29A_SFLD_1_LEN);
       localWse29aSFld1Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWse29aSFld1Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
    /**
	 *	refreshWse29aSFld1 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWse29aSFld1() {	 
   		return (substring(getStringValue(),beginWse29aSFld1,beginWse29aSFld1 + WSE_29A_SFLD_1_LEN));
   	}
     int localWse29aSFld2Counter = -1;
     public boolean isWse29aSFld2Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse29aSFld2Counter != sharedCounter;
         localWse29aSFld2Counter = sharedCounter; return hasModified;
     }
	protected static final int WSE_29A_SFLD_2_LEN = 30;
	/**
	 * 	serialize this Wse29aSFld2
	 */
   protected void serializeWse29aSFld2(char[] wse29aSFld2) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wse29aSFld2,0,getStringValue(),beginWse29aSFld2,WSE_29A_SFLD_2_LEN);
       localWse29aSFld2Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWse29aSFld2Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
    /**
	 *	refreshWse29aSFld2 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWse29aSFld2() {	 
   		return (substring(getStringValue(),beginWse29aSFld2,beginWse29aSFld2 + WSE_29A_SFLD_2_LEN));
   	}




}
  
