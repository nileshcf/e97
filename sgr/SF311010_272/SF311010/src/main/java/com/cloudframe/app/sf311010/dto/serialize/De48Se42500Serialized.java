package com.cloudframe.app.sf311010.dto.serialize;

/**
*  The class De48Se42500Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:01. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class De48Se42500Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(De48Se42500Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int DE_48_SE_42500_LENGTH = 3;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginSe4212500;
            protected  int beginSe423500;
	
	/**
	* Constructor for De48Se42500Serialized
	**/
    public De48Se42500Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in De48Se42500Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(DE_48_SE_42500_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginSe4212500 = getStartOffset() + 0;	// set offset for serialization
  
             beginSe423500 = getStartOffset() + 2;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localSe4212500Counter = -1;
     public boolean isSe4212500Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSe4212500Counter != sharedCounter;
         localSe4212500Counter = sharedCounter; return hasModified;
     }
	protected static final int SE_4212500_LEN = 2;
	/**
	 * 	serialize this Se4212500
	 */
   protected void serializeSe4212500(char[] se4212500) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(se4212500,0,getStringValue(),beginSe4212500,SE_4212500_LEN);
       localSe4212500Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSe4212500Constraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshSe4212500 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSe4212500() {	 
   		return (substring(getStringValue(),beginSe4212500,beginSe4212500 + SE_4212500_LEN));
   	}
     int localSe423500Counter = -1;
     public boolean isSe423500Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSe423500Counter != sharedCounter;
         localSe423500Counter = sharedCounter; return hasModified;
     }
	protected static final int SE_423500_LEN = 1;
	/**
	 * 	serialize this Se423500
	 */
   protected void serializeSe423500(char[] se423500) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(se423500,0,getStringValue(),beginSe423500,SE_423500_LEN);
       localSe423500Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSe423500Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshSe423500 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSe423500() {	 
   		return (substring(getStringValue(),beginSe423500,beginSe423500 + SE_423500_LEN));
   	}




}
  
