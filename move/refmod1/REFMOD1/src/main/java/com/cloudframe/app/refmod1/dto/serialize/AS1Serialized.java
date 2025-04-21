package com.cloudframe.app.refmod1.dto.serialize;

/**
*  The class AS1Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:01. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class AS1Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(AS1Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int A_S_1_LENGTH = 70;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginASFld11;
            protected  int beginASFld21;
	
	/**
	* Constructor for AS1Serialized
	**/
    public AS1Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in AS1Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(A_S_1_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginASFld11 = getStartOffset() + 0;	// set offset for serialization
  
             beginASFld21 = getStartOffset() + 30;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localASFld11Counter = -1;
     public boolean isASFld11Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localASFld11Counter != sharedCounter;
         localASFld11Counter = sharedCounter; return hasModified;
     }
	protected static final int A_SFLD_11_LEN = 30;
	/**
	 * 	serialize this ASFld11
	 */
   protected void serializeASFld11(char[] aSFld11) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(aSFld11,0,getStringValue(),beginASFld11,A_SFLD_11_LEN);
       localASFld11Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkASFld11Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
    /**
	 *	refreshASFld11 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshASFld11() {	 
   		return (substring(getStringValue(),beginASFld11,beginASFld11 + A_SFLD_11_LEN));
   	}
     int localASFld21Counter = -1;
     public boolean isASFld21Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localASFld21Counter != sharedCounter;
         localASFld21Counter = sharedCounter; return hasModified;
     }
	protected static final int A_SFLD_21_LEN = 40;
	/**
	 * 	serialize this ASFld21
	 */
   protected void serializeASFld21(char[] aSFld21) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(aSFld21,0,getStringValue(),beginASFld21,A_SFLD_21_LEN);
       localASFld21Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkASFld21Constraints(char[] value) {
   			return super.checkConstraints(value , 40 ,false, false);
   }
    /**
	 *	refreshASFld21 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshASFld21() {	 
   		return (substring(getStringValue(),beginASFld21,beginASFld21 + A_SFLD_21_LEN));
   	}




}
  
