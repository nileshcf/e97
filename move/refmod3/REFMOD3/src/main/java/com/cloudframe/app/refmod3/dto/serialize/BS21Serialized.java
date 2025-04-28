package com.cloudframe.app.refmod3.dto.serialize;

/**
*  The class BS21Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 06:57. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class BS21Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(BS21Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int B_S_21_LENGTH = 70;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginBSFld121;
            protected  int beginBSFld221;
	
	/**
	* Constructor for BS21Serialized
	**/
    public BS21Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in BS21Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(B_S_21_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginBSFld121 = getStartOffset() + 0;	// set offset for serialization
  
             beginBSFld221 = getStartOffset() + 30;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localBSFld121Counter = -1;
     public boolean isBSFld121Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBSFld121Counter != sharedCounter;
         localBSFld121Counter = sharedCounter; return hasModified;
     }
	protected static final int B_SFLD_121_LEN = 30;
	/**
	 * 	serialize this BSFld121
	 */
   protected void serializeBSFld121(char[] bSFld121) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bSFld121,0,getStringValue(),beginBSFld121,B_SFLD_121_LEN);
       localBSFld121Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBSFld121Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
    /**
	 *	refreshBSFld121 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBSFld121() {	 
   		return (substring(getStringValue(),beginBSFld121,beginBSFld121 + B_SFLD_121_LEN));
   	}
     int localBSFld221Counter = -1;
     public boolean isBSFld221Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBSFld221Counter != sharedCounter;
         localBSFld221Counter = sharedCounter; return hasModified;
     }
	protected static final int B_SFLD_221_LEN = 40;
	/**
	 * 	serialize this BSFld221
	 */
   protected void serializeBSFld221(char[] bSFld221) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bSFld221,0,getStringValue(),beginBSFld221,B_SFLD_221_LEN);
       localBSFld221Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBSFld221Constraints(char[] value) {
   			return super.checkConstraints(value , 40 ,false, false);
   }
    /**
	 *	refreshBSFld221 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBSFld221() {	 
   		return (substring(getStringValue(),beginBSFld221,beginBSFld221 + B_SFLD_221_LEN));
   	}




}
  
