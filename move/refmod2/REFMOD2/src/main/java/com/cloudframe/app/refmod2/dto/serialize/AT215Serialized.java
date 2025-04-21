package com.cloudframe.app.refmod2.dto.serialize;

/**
*  The class AT215Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:00. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class AT215Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(AT215Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int A_T_215_LENGTH = 60;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginATFld1215;
            protected  int beginATFld2215;
	
	/**
	* Constructor for AT215Serialized
	**/
    public AT215Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in AT215Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(A_T_215_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginATFld1215 = getStartOffset() + 0;	// set offset for serialization
  
             beginATFld2215 = getStartOffset() + 20;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localATFld1215Counter = -1;
     public boolean isATFld1215Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localATFld1215Counter != sharedCounter;
         localATFld1215Counter = sharedCounter; return hasModified;
     }
	protected static final int A_TFLD_1215_LEN = 20;
	/**
	 * 	serialize this ATFld1215
	 */
   protected void serializeATFld1215(char[] aTFld1215) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(aTFld1215,0,getStringValue(),beginATFld1215,A_TFLD_1215_LEN);
       localATFld1215Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkATFld1215Constraints(char[] value) {
   			return super.checkConstraints(value , 20 ,false, false);
   }
    /**
	 *	refreshATFld1215 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshATFld1215() {	 
   		return (substring(getStringValue(),beginATFld1215,beginATFld1215 + A_TFLD_1215_LEN));
   	}
     int localATFld2215Counter = -1;
     public boolean isATFld2215Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localATFld2215Counter != sharedCounter;
         localATFld2215Counter = sharedCounter; return hasModified;
     }
	protected static final int A_TFLD_2215_LEN = 40;
	/**
	 * 	serialize this ATFld2215
	 */
   protected void serializeATFld2215(char[] aTFld2215) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(aTFld2215,0,getStringValue(),beginATFld2215,A_TFLD_2215_LEN);
       localATFld2215Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkATFld2215Constraints(char[] value) {
   			return super.checkConstraints(value , 40 ,false, false);
   }
    /**
	 *	refreshATFld2215 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshATFld2215() {	 
   		return (substring(getStringValue(),beginATFld2215,beginATFld2215 + A_TFLD_2215_LEN));
   	}




}
  
