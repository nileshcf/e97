package com.cloudframe.app.refmod3.dto.serialize;

/**
*  The class AS27Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:24. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class AS27Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(AS27Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int A_S_27_LENGTH = 70;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginASFld127;
            protected  int beginASFld227;
	
	/**
	* Constructor for AS27Serialized
	**/
    public AS27Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in AS27Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(A_S_27_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginASFld127 = getStartOffset() + 0;	// set offset for serialization
  
             beginASFld227 = getStartOffset() + 30;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localASFld127Counter = -1;
     public boolean isASFld127Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localASFld127Counter != sharedCounter;
         localASFld127Counter = sharedCounter; return hasModified;
     }
	protected static final int A_SFLD_127_LEN = 30;
	/**
	 * 	serialize this ASFld127
	 */
   protected void serializeASFld127(char[] aSFld127) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(aSFld127,0,getStringValue(),beginASFld127,A_SFLD_127_LEN);
       localASFld127Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkASFld127Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
    /**
	 *	refreshASFld127 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshASFld127() {	 
   		return (substring(getStringValue(),beginASFld127,beginASFld127 + A_SFLD_127_LEN));
   	}
     int localASFld227Counter = -1;
     public boolean isASFld227Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localASFld227Counter != sharedCounter;
         localASFld227Counter = sharedCounter; return hasModified;
     }
	protected static final int A_SFLD_227_LEN = 40;
	/**
	 * 	serialize this ASFld227
	 */
   protected void serializeASFld227(char[] aSFld227) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(aSFld227,0,getStringValue(),beginASFld227,A_SFLD_227_LEN);
       localASFld227Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkASFld227Constraints(char[] value) {
   			return super.checkConstraints(value , 40 ,false, false);
   }
    /**
	 *	refreshASFld227 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshASFld227() {	 
   		return (substring(getStringValue(),beginASFld227,beginASFld227 + A_SFLD_227_LEN));
   	}




}
  
