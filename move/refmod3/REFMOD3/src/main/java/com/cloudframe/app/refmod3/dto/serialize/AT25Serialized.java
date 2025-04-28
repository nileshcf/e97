package com.cloudframe.app.refmod3.dto.serialize;

/**
*  The class AT25Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 06:57. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class AT25Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(AT25Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int A_T_25_LENGTH = 60;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginATFld125;
            protected  int beginATFld225;
	
	/**
	* Constructor for AT25Serialized
	**/
    public AT25Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in AT25Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(A_T_25_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginATFld125 = getStartOffset() + 0;	// set offset for serialization
  
             beginATFld225 = getStartOffset() + 20;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localATFld125Counter = -1;
     public boolean isATFld125Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localATFld125Counter != sharedCounter;
         localATFld125Counter = sharedCounter; return hasModified;
     }
	protected static final int A_TFLD_125_LEN = 20;
	/**
	 * 	serialize this ATFld125
	 */
   protected void serializeATFld125(char[] aTFld125) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(aTFld125,0,getStringValue(),beginATFld125,A_TFLD_125_LEN);
       localATFld125Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkATFld125Constraints(char[] value) {
   			return super.checkConstraints(value , 20 ,false, false);
   }
    /**
	 *	refreshATFld125 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshATFld125() {	 
   		return (substring(getStringValue(),beginATFld125,beginATFld125 + A_TFLD_125_LEN));
   	}
     int localATFld225Counter = -1;
     public boolean isATFld225Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localATFld225Counter != sharedCounter;
         localATFld225Counter = sharedCounter; return hasModified;
     }
	protected static final int A_TFLD_225_LEN = 40;
	/**
	 * 	serialize this ATFld225
	 */
   protected void serializeATFld225(char[] aTFld225) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(aTFld225,0,getStringValue(),beginATFld225,A_TFLD_225_LEN);
       localATFld225Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkATFld225Constraints(char[] value) {
   			return super.checkConstraints(value , 40 ,false, false);
   }
    /**
	 *	refreshATFld225 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshATFld225() {	 
   		return (substring(getStringValue(),beginATFld225,beginATFld225 + A_TFLD_225_LEN));
   	}




}
  
