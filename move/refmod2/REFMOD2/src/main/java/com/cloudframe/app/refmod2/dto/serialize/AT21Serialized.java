package com.cloudframe.app.refmod2.dto.serialize;

/**
*  The class AT21Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 08:02. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class AT21Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(AT21Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int A_T_21_LENGTH = 60;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginATFld121;
            protected  int beginATFld221;
	
	/**
	* Constructor for AT21Serialized
	**/
    public AT21Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in AT21Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(A_T_21_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginATFld121 = getStartOffset() + 0;	// set offset for serialization
  
             beginATFld221 = getStartOffset() + 20;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localATFld121Counter = -1;
     public boolean isATFld121Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localATFld121Counter != sharedCounter;
         localATFld121Counter = sharedCounter; return hasModified;
     }
	protected static final int A_TFLD_121_LEN = 20;
	/**
	 * 	serialize this ATFld121
	 */
   protected void serializeATFld121(char[] aTFld121) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(aTFld121,0,getStringValue(),beginATFld121,A_TFLD_121_LEN);
       localATFld121Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkATFld121Constraints(char[] value) {
   			return super.checkConstraints(value , 20 ,false, false);
   }
    /**
	 *	refreshATFld121 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshATFld121() {	 
   		return (substring(getStringValue(),beginATFld121,beginATFld121 + A_TFLD_121_LEN));
   	}
     int localATFld221Counter = -1;
     public boolean isATFld221Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localATFld221Counter != sharedCounter;
         localATFld221Counter = sharedCounter; return hasModified;
     }
	protected static final int A_TFLD_221_LEN = 40;
	/**
	 * 	serialize this ATFld221
	 */
   protected void serializeATFld221(char[] aTFld221) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(aTFld221,0,getStringValue(),beginATFld221,A_TFLD_221_LEN);
       localATFld221Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkATFld221Constraints(char[] value) {
   			return super.checkConstraints(value , 40 ,false, false);
   }
    /**
	 *	refreshATFld221 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshATFld221() {	 
   		return (substring(getStringValue(),beginATFld221,beginATFld221 + A_TFLD_221_LEN));
   	}




}
  
