package com.cloudframe.app.refmod3.dto.serialize;

/**
*  The class AS211Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:34. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class AS211Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(AS211Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int A_S_211_LENGTH = 70;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginASFld1211;
            protected  int beginASFld2211;
	
	/**
	* Constructor for AS211Serialized
	**/
    public AS211Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in AS211Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(A_S_211_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginASFld1211 = getStartOffset() + 0;	// set offset for serialization
  
             beginASFld2211 = getStartOffset() + 30;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localASFld1211Counter = -1;
     public boolean isASFld1211Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localASFld1211Counter != sharedCounter;
         localASFld1211Counter = sharedCounter; return hasModified;
     }
	protected static final int A_SFLD_1211_LEN = 30;
	/**
	 * 	serialize this ASFld1211
	 */
   protected void serializeASFld1211(char[] aSFld1211) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(aSFld1211,0,getStringValue(),beginASFld1211,A_SFLD_1211_LEN);
       localASFld1211Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkASFld1211Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
    /**
	 *	refreshASFld1211 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshASFld1211() {	 
   		return (substring(getStringValue(),beginASFld1211,beginASFld1211 + A_SFLD_1211_LEN));
   	}
     int localASFld2211Counter = -1;
     public boolean isASFld2211Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localASFld2211Counter != sharedCounter;
         localASFld2211Counter = sharedCounter; return hasModified;
     }
	protected static final int A_SFLD_2211_LEN = 40;
	/**
	 * 	serialize this ASFld2211
	 */
   protected void serializeASFld2211(char[] aSFld2211) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(aSFld2211,0,getStringValue(),beginASFld2211,A_SFLD_2211_LEN);
       localASFld2211Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkASFld2211Constraints(char[] value) {
   			return super.checkConstraints(value , 40 ,false, false);
   }
    /**
	 *	refreshASFld2211 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshASFld2211() {	 
   		return (substring(getStringValue(),beginASFld2211,beginASFld2211 + A_SFLD_2211_LEN));
   	}




}
  
