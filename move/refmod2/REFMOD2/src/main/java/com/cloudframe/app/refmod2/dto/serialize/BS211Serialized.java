package com.cloudframe.app.refmod2.dto.serialize;

/**
*  The class BS211Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:36. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class BS211Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(BS211Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int B_S_211_LENGTH = 70;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginBSFld1211;
            protected  int beginBSFld2211;
	
	/**
	* Constructor for BS211Serialized
	**/
    public BS211Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in BS211Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(B_S_211_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginBSFld1211 = getStartOffset() + 0;	// set offset for serialization
  
             beginBSFld2211 = getStartOffset() + 30;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localBSFld1211Counter = -1;
     public boolean isBSFld1211Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBSFld1211Counter != sharedCounter;
         localBSFld1211Counter = sharedCounter; return hasModified;
     }
	protected static final int B_SFLD_1211_LEN = 30;
	/**
	 * 	serialize this BSFld1211
	 */
   protected void serializeBSFld1211(char[] bSFld1211) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bSFld1211,0,getStringValue(),beginBSFld1211,B_SFLD_1211_LEN);
       localBSFld1211Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBSFld1211Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
    /**
	 *	refreshBSFld1211 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBSFld1211() {	 
   		return (substring(getStringValue(),beginBSFld1211,beginBSFld1211 + B_SFLD_1211_LEN));
   	}
     int localBSFld2211Counter = -1;
     public boolean isBSFld2211Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBSFld2211Counter != sharedCounter;
         localBSFld2211Counter = sharedCounter; return hasModified;
     }
	protected static final int B_SFLD_2211_LEN = 40;
	/**
	 * 	serialize this BSFld2211
	 */
   protected void serializeBSFld2211(char[] bSFld2211) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bSFld2211,0,getStringValue(),beginBSFld2211,B_SFLD_2211_LEN);
       localBSFld2211Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBSFld2211Constraints(char[] value) {
   			return super.checkConstraints(value , 40 ,false, false);
   }
    /**
	 *	refreshBSFld2211 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBSFld2211() {	 
   		return (substring(getStringValue(),beginBSFld2211,beginBSFld2211 + B_SFLD_2211_LEN));
   	}




}
  
