package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Wse13aSSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:26. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Wse13aSSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Wse13aSSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WSE_13A_S_LENGTH = 60;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginWse13aSFld1;
            protected  int beginWse13aSFld2;
	
	/**
	* Constructor for Wse13aSSerialized
	**/
    public Wse13aSSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Wse13aSSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Wse13aSSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Wse13aSSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,3); // serialize this field at offset 3 by default 
    }
    
	/**
	* sets parent for this Wse13aSSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 3 by default
    }    
	/**
	* initializes the field in Wse13aSSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(WSE_13A_S_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginWse13aSFld1 = getStartOffset() + 0;	// set offset for serialization
  
             beginWse13aSFld2 = getStartOffset() + 30;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localWse13aSFld1Counter = -1;
     public boolean isWse13aSFld1Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse13aSFld1Counter != sharedCounter;
         localWse13aSFld1Counter = sharedCounter; return hasModified;
     }
	protected static final int WSE_13A_SFLD_1_LEN = 30;
	/**
	 * 	serialize this Wse13aSFld1
	 */
   protected void serializeWse13aSFld1(char[] wse13aSFld1) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wse13aSFld1,0,getStringValue(),beginWse13aSFld1,WSE_13A_SFLD_1_LEN);
       localWse13aSFld1Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWse13aSFld1Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
    /**
	 *	refreshWse13aSFld1 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWse13aSFld1() {	 
   		return (substring(getStringValue(),beginWse13aSFld1,beginWse13aSFld1 + WSE_13A_SFLD_1_LEN));
   	}
     int localWse13aSFld2Counter = -1;
     public boolean isWse13aSFld2Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse13aSFld2Counter != sharedCounter;
         localWse13aSFld2Counter = sharedCounter; return hasModified;
     }
	protected static final int WSE_13A_SFLD_2_LEN = 30;
	/**
	 * 	serialize this Wse13aSFld2
	 */
   protected void serializeWse13aSFld2(char[] wse13aSFld2) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wse13aSFld2,0,getStringValue(),beginWse13aSFld2,WSE_13A_SFLD_2_LEN);
       localWse13aSFld2Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWse13aSFld2Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
    /**
	 *	refreshWse13aSFld2 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWse13aSFld2() {	 
   		return (substring(getStringValue(),beginWse13aSFld2,beginWse13aSFld2 + WSE_13A_SFLD_2_LEN));
   	}




}
  
