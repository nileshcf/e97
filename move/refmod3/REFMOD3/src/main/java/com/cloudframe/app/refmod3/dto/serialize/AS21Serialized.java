package com.cloudframe.app.refmod3.dto.serialize;

/**
*  The class AS21Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:34. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class AS21Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(AS21Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int A_S_21_LENGTH = 70;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginASFld121;
            protected  int beginASFld221;
	
	/**
	* Constructor for AS21Serialized
	**/
    public AS21Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in AS21Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(A_S_21_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginASFld121 = getStartOffset() + 0;	// set offset for serialization
  
             beginASFld221 = getStartOffset() + 30;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localASFld121Counter = -1;
     public boolean isASFld121Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localASFld121Counter != sharedCounter;
         localASFld121Counter = sharedCounter; return hasModified;
     }
	protected static final int A_SFLD_121_LEN = 30;
	/**
	 * 	serialize this ASFld121
	 */
   protected void serializeASFld121(char[] aSFld121) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(aSFld121,0,getStringValue(),beginASFld121,A_SFLD_121_LEN);
       localASFld121Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkASFld121Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
    /**
	 *	refreshASFld121 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshASFld121() {	 
   		return (substring(getStringValue(),beginASFld121,beginASFld121 + A_SFLD_121_LEN));
   	}
     int localASFld221Counter = -1;
     public boolean isASFld221Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localASFld221Counter != sharedCounter;
         localASFld221Counter = sharedCounter; return hasModified;
     }
	protected static final int A_SFLD_221_LEN = 40;
	/**
	 * 	serialize this ASFld221
	 */
   protected void serializeASFld221(char[] aSFld221) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(aSFld221,0,getStringValue(),beginASFld221,A_SFLD_221_LEN);
       localASFld221Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkASFld221Constraints(char[] value) {
   			return super.checkConstraints(value , 40 ,false, false);
   }
    /**
	 *	refreshASFld221 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshASFld221() {	 
   		return (substring(getStringValue(),beginASFld221,beginASFld221 + A_SFLD_221_LEN));
   	}




}
  
