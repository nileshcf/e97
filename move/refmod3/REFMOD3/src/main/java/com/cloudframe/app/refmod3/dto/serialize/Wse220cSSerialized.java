package com.cloudframe.app.refmod3.dto.serialize;

/**
*  The class Wse220cSSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:27. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Wse220cSSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Wse220cSSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WSE_220C_S_LENGTH = 60;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginWse220cSFld1;
            protected  int beginWse220cSFld2;
            protected  int beginWse220cSFld3;
	
	/**
	* Constructor for Wse220cSSerialized
	**/
    public Wse220cSSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Wse220cSSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Wse220cSSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Wse220cSSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,5); // serialize this field at offset 5 by default 
    }
    
	/**
	* sets parent for this Wse220cSSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 5 by default
    }    
	/**
	* initializes the field in Wse220cSSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(WSE_220C_S_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginWse220cSFld1 = getStartOffset() + 0;	// set offset for serialization
  
             beginWse220cSFld2 = getStartOffset() + 10;	// set offset for serialization
  
             beginWse220cSFld3 = getStartOffset() + 30;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localWse220cSFld1Counter = -1;
     public boolean isWse220cSFld1Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse220cSFld1Counter != sharedCounter;
         localWse220cSFld1Counter = sharedCounter; return hasModified;
     }
	protected static final int WSE_220C_SFLD_1_LEN = 10;
	/**
	 * 	serialize this Wse220cSFld1
	 */
   protected void serializeWse220cSFld1(char[] wse220cSFld1) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wse220cSFld1,0,getStringValue(),beginWse220cSFld1,WSE_220C_SFLD_1_LEN);
       localWse220cSFld1Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWse220cSFld1Constraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshWse220cSFld1 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWse220cSFld1() {	 
   		return (substring(getStringValue(),beginWse220cSFld1,beginWse220cSFld1 + WSE_220C_SFLD_1_LEN));
   	}
     int localWse220cSFld2Counter = -1;
     public boolean isWse220cSFld2Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse220cSFld2Counter != sharedCounter;
         localWse220cSFld2Counter = sharedCounter; return hasModified;
     }
	protected static final int WSE_220C_SFLD_2_LEN = 20;
	/**
	 * 	serialize this Wse220cSFld2
	 */
   protected void serializeWse220cSFld2(char[] wse220cSFld2) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wse220cSFld2,0,getStringValue(),beginWse220cSFld2,WSE_220C_SFLD_2_LEN);
       localWse220cSFld2Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWse220cSFld2Constraints(char[] value) {
   			return super.checkConstraints(value , 20 ,false, false);
   }
    /**
	 *	refreshWse220cSFld2 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWse220cSFld2() {	 
   		return (substring(getStringValue(),beginWse220cSFld2,beginWse220cSFld2 + WSE_220C_SFLD_2_LEN));
   	}
     int localWse220cSFld3Counter = -1;
     public boolean isWse220cSFld3Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse220cSFld3Counter != sharedCounter;
         localWse220cSFld3Counter = sharedCounter; return hasModified;
     }
	protected static final int WSE_220C_SFLD_3_LEN = 30;
	/**
	 * 	serialize this Wse220cSFld3
	 */
   protected void serializeWse220cSFld3(char[] wse220cSFld3) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wse220cSFld3,0,getStringValue(),beginWse220cSFld3,WSE_220C_SFLD_3_LEN);
       localWse220cSFld3Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWse220cSFld3Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
    /**
	 *	refreshWse220cSFld3 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWse220cSFld3() {	 
   		return (substring(getStringValue(),beginWse220cSFld3,beginWse220cSFld3 + WSE_220C_SFLD_3_LEN));
   	}




}
  
