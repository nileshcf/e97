package com.cloudframe.app.refmod2.dto.serialize;

/**
*  The class BS27Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:03. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class BS27Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(BS27Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int B_S_27_LENGTH = 70;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginBSFld127;
            protected  int beginBSFld227;
	
	/**
	* Constructor for BS27Serialized
	**/
    public BS27Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in BS27Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(B_S_27_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginBSFld127 = getStartOffset() + 0;	// set offset for serialization
  
             beginBSFld227 = getStartOffset() + 30;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localBSFld127Counter = -1;
     public boolean isBSFld127Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBSFld127Counter != sharedCounter;
         localBSFld127Counter = sharedCounter; return hasModified;
     }
	protected static final int B_SFLD_127_LEN = 30;
	/**
	 * 	serialize this BSFld127
	 */
   protected void serializeBSFld127(char[] bSFld127) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bSFld127,0,getStringValue(),beginBSFld127,B_SFLD_127_LEN);
       localBSFld127Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBSFld127Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
    /**
	 *	refreshBSFld127 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBSFld127() {	 
   		return (substring(getStringValue(),beginBSFld127,beginBSFld127 + B_SFLD_127_LEN));
   	}
     int localBSFld227Counter = -1;
     public boolean isBSFld227Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBSFld227Counter != sharedCounter;
         localBSFld227Counter = sharedCounter; return hasModified;
     }
	protected static final int B_SFLD_227_LEN = 40;
	/**
	 * 	serialize this BSFld227
	 */
   protected void serializeBSFld227(char[] bSFld227) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bSFld227,0,getStringValue(),beginBSFld227,B_SFLD_227_LEN);
       localBSFld227Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBSFld227Constraints(char[] value) {
   			return super.checkConstraints(value , 40 ,false, false);
   }
    /**
	 *	refreshBSFld227 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBSFld227() {	 
   		return (substring(getStringValue(),beginBSFld227,beginBSFld227 + B_SFLD_227_LEN));
   	}




}
  
