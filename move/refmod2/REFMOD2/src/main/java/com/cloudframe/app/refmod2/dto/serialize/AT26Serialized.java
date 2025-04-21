package com.cloudframe.app.refmod2.dto.serialize;

/**
*  The class AT26Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:05. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class AT26Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(AT26Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int A_T_26_LENGTH = 60;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginATFld126;
            protected  int beginATFld226;
	
	/**
	* Constructor for AT26Serialized
	**/
    public AT26Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in AT26Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(A_T_26_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginATFld126 = getStartOffset() + 0;	// set offset for serialization
  
             beginATFld226 = getStartOffset() + 20;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localATFld126Counter = -1;
     public boolean isATFld126Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localATFld126Counter != sharedCounter;
         localATFld126Counter = sharedCounter; return hasModified;
     }
	protected static final int A_TFLD_126_LEN = 20;
	/**
	 * 	serialize this ATFld126
	 */
   protected void serializeATFld126(char[] aTFld126) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(aTFld126,0,getStringValue(),beginATFld126,A_TFLD_126_LEN);
       localATFld126Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkATFld126Constraints(char[] value) {
   			return super.checkConstraints(value , 20 ,false, false);
   }
    /**
	 *	refreshATFld126 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshATFld126() {	 
   		return (substring(getStringValue(),beginATFld126,beginATFld126 + A_TFLD_126_LEN));
   	}
     int localATFld226Counter = -1;
     public boolean isATFld226Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localATFld226Counter != sharedCounter;
         localATFld226Counter = sharedCounter; return hasModified;
     }
	protected static final int A_TFLD_226_LEN = 40;
	/**
	 * 	serialize this ATFld226
	 */
   protected void serializeATFld226(char[] aTFld226) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(aTFld226,0,getStringValue(),beginATFld226,A_TFLD_226_LEN);
       localATFld226Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkATFld226Constraints(char[] value) {
   			return super.checkConstraints(value , 40 ,false, false);
   }
    /**
	 *	refreshATFld226 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshATFld226() {	 
   		return (substring(getStringValue(),beginATFld226,beginATFld226 + A_TFLD_226_LEN));
   	}




}
  
