package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class AS11Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 06:59. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class AS11Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(AS11Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int A_S_11_LENGTH = 70;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginASFld111;
            protected  int beginASFld211;
	
	/**
	* Constructor for AS11Serialized
	**/
    public AS11Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* initializes the field in AS11Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(A_S_11_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginASFld111 = getStartOffset() + 0;	// set offset for serialization
  
             beginASFld211 = getStartOffset() + 30;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localASFld111Counter = -1;
     public boolean isASFld111Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localASFld111Counter != sharedCounter;
         localASFld111Counter = sharedCounter; return hasModified;
     }
	protected static final int A_SFLD_111_LEN = 30;
	/**
	 * 	serialize this ASFld111
	 */
   protected void serializeASFld111(char[] aSFld111) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(aSFld111,0,getStringValue(),beginASFld111,A_SFLD_111_LEN);
       localASFld111Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkASFld111Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
    /**
	 *	refreshASFld111 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshASFld111() {	 
   		return (substring(getStringValue(),beginASFld111,beginASFld111 + A_SFLD_111_LEN));
   	}
     int localASFld211Counter = -1;
     public boolean isASFld211Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localASFld211Counter != sharedCounter;
         localASFld211Counter = sharedCounter; return hasModified;
     }
	protected static final int A_SFLD_211_LEN = 40;
	/**
	 * 	serialize this ASFld211
	 */
   protected void serializeASFld211(char[] aSFld211) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(aSFld211,0,getStringValue(),beginASFld211,A_SFLD_211_LEN);
       localASFld211Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkASFld211Constraints(char[] value) {
   			return super.checkConstraints(value , 40 ,false, false);
   }
    /**
	 *	refreshASFld211 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshASFld211() {	 
   		return (substring(getStringValue(),beginASFld211,beginASFld211 + A_SFLD_211_LEN));
   	}




}
  
