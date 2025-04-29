package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Wse15aSSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:23. using version 5.0.0.257
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Wse15aSSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Wse15aSSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WSE_15A_S_LENGTH = 60;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginWse15aSFld1;
            protected  int beginWse15aSFld2;
	
	/**
	* Constructor for Wse15aSSerialized
	**/
    public Wse15aSSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Wse15aSSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Wse15aSSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Wse15aSSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,3); // serialize this field at offset 3 by default 
    }
    
	/**
	* sets parent for this Wse15aSSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 3 by default
    }    
	/**
	* initializes the field in Wse15aSSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(WSE_15A_S_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginWse15aSFld1 = getStartOffset() + 0;	// set offset for serialization
  
             beginWse15aSFld2 = getStartOffset() + 30;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localWse15aSFld1Counter = -1;
     public boolean isWse15aSFld1Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse15aSFld1Counter != sharedCounter;
         localWse15aSFld1Counter = sharedCounter; return hasModified;
     }
	protected static final int WSE_15A_SFLD_1_LEN = 30;
	/**
	 * 	serialize this Wse15aSFld1
	 */
   protected void serializeWse15aSFld1(char[] wse15aSFld1) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wse15aSFld1,0,getStringValue(),beginWse15aSFld1,WSE_15A_SFLD_1_LEN);
       localWse15aSFld1Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWse15aSFld1Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
    /**
	 *	refreshWse15aSFld1 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWse15aSFld1() {	 
   		return (substring(getStringValue(),beginWse15aSFld1,beginWse15aSFld1 + WSE_15A_SFLD_1_LEN));
   	}
     int localWse15aSFld2Counter = -1;
     public boolean isWse15aSFld2Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse15aSFld2Counter != sharedCounter;
         localWse15aSFld2Counter = sharedCounter; return hasModified;
     }
	protected static final int WSE_15A_SFLD_2_LEN = 30;
	/**
	 * 	serialize this Wse15aSFld2
	 */
   protected void serializeWse15aSFld2(char[] wse15aSFld2) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wse15aSFld2,0,getStringValue(),beginWse15aSFld2,WSE_15A_SFLD_2_LEN);
       localWse15aSFld2Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWse15aSFld2Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
    /**
	 *	refreshWse15aSFld2 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWse15aSFld2() {	 
   		return (substring(getStringValue(),beginWse15aSFld2,beginWse15aSFld2 + WSE_15A_SFLD_2_LEN));
   	}




}
  
