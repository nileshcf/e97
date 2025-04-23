package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Wse20cSSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:26. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Wse20cSSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Wse20cSSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WSE_20C_S_LENGTH = 60;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginWse20cSFld1;
            protected  int beginWse20cSFld2;
            protected  int beginWse20cSFld3;
	
	/**
	* Constructor for Wse20cSSerialized
	**/
    public Wse20cSSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Wse20cSSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Wse20cSSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Wse20cSSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,5); // serialize this field at offset 5 by default 
    }
    
	/**
	* sets parent for this Wse20cSSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 5 by default
    }    
	/**
	* initializes the field in Wse20cSSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(WSE_20C_S_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginWse20cSFld1 = getStartOffset() + 0;	// set offset for serialization
  
             beginWse20cSFld2 = getStartOffset() + 10;	// set offset for serialization
  
             beginWse20cSFld3 = getStartOffset() + 30;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localWse20cSFld1Counter = -1;
     public boolean isWse20cSFld1Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse20cSFld1Counter != sharedCounter;
         localWse20cSFld1Counter = sharedCounter; return hasModified;
     }
	protected static final int WSE_20C_SFLD_1_LEN = 10;
	/**
	 * 	serialize this Wse20cSFld1
	 */
   protected void serializeWse20cSFld1(char[] wse20cSFld1) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wse20cSFld1,0,getStringValue(),beginWse20cSFld1,WSE_20C_SFLD_1_LEN);
       localWse20cSFld1Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWse20cSFld1Constraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshWse20cSFld1 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWse20cSFld1() {	 
   		return (substring(getStringValue(),beginWse20cSFld1,beginWse20cSFld1 + WSE_20C_SFLD_1_LEN));
   	}
     int localWse20cSFld2Counter = -1;
     public boolean isWse20cSFld2Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse20cSFld2Counter != sharedCounter;
         localWse20cSFld2Counter = sharedCounter; return hasModified;
     }
	protected static final int WSE_20C_SFLD_2_LEN = 20;
	/**
	 * 	serialize this Wse20cSFld2
	 */
   protected void serializeWse20cSFld2(char[] wse20cSFld2) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wse20cSFld2,0,getStringValue(),beginWse20cSFld2,WSE_20C_SFLD_2_LEN);
       localWse20cSFld2Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWse20cSFld2Constraints(char[] value) {
   			return super.checkConstraints(value , 20 ,false, false);
   }
    /**
	 *	refreshWse20cSFld2 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWse20cSFld2() {	 
   		return (substring(getStringValue(),beginWse20cSFld2,beginWse20cSFld2 + WSE_20C_SFLD_2_LEN));
   	}
     int localWse20cSFld3Counter = -1;
     public boolean isWse20cSFld3Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse20cSFld3Counter != sharedCounter;
         localWse20cSFld3Counter = sharedCounter; return hasModified;
     }
	protected static final int WSE_20C_SFLD_3_LEN = 30;
	/**
	 * 	serialize this Wse20cSFld3
	 */
   protected void serializeWse20cSFld3(char[] wse20cSFld3) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wse20cSFld3,0,getStringValue(),beginWse20cSFld3,WSE_20C_SFLD_3_LEN);
       localWse20cSFld3Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWse20cSFld3Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
    /**
	 *	refreshWse20cSFld3 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWse20cSFld3() {	 
   		return (substring(getStringValue(),beginWse20cSFld3,beginWse20cSFld3 + WSE_20C_SFLD_3_LEN));
   	}




}
  
