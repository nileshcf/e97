package com.cloudframe.app.refmod3.dto.serialize;

/**
*  The class AS217Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:20. using version 5.0.0.257
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class AS217Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(AS217Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int A_S_217_LENGTH = 70;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginASFld1217;
            protected  int beginASFld2217;
	
	/**
	* Constructor for AS217Serialized
	**/
    public AS217Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in AS217Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(A_S_217_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginASFld1217 = getStartOffset() + 0;	// set offset for serialization
  
             beginASFld2217 = getStartOffset() + 30;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localASFld1217Counter = -1;
     public boolean isASFld1217Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localASFld1217Counter != sharedCounter;
         localASFld1217Counter = sharedCounter; return hasModified;
     }
	protected static final int A_SFLD_1217_LEN = 30;
	/**
	 * 	serialize this ASFld1217
	 */
   protected void serializeASFld1217(char[] aSFld1217) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(aSFld1217,0,getStringValue(),beginASFld1217,A_SFLD_1217_LEN);
       localASFld1217Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkASFld1217Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
    /**
	 *	refreshASFld1217 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshASFld1217() {	 
   		return (substring(getStringValue(),beginASFld1217,beginASFld1217 + A_SFLD_1217_LEN));
   	}
     int localASFld2217Counter = -1;
     public boolean isASFld2217Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localASFld2217Counter != sharedCounter;
         localASFld2217Counter = sharedCounter; return hasModified;
     }
	protected static final int A_SFLD_2217_LEN = 40;
	/**
	 * 	serialize this ASFld2217
	 */
   protected void serializeASFld2217(char[] aSFld2217) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(aSFld2217,0,getStringValue(),beginASFld2217,A_SFLD_2217_LEN);
       localASFld2217Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkASFld2217Constraints(char[] value) {
   			return super.checkConstraints(value , 40 ,false, false);
   }
    /**
	 *	refreshASFld2217 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshASFld2217() {	 
   		return (substring(getStringValue(),beginASFld2217,beginASFld2217 + A_SFLD_2217_LEN));
   	}




}
  
