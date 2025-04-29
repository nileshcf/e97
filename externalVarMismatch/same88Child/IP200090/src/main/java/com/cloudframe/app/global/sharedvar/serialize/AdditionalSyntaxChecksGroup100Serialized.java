package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class AdditionalSyntaxChecksGroup100Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:31. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class AdditionalSyntaxChecksGroup100Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(AdditionalSyntaxChecksGroup100Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int ADDITIONAL_SYNTAX_CHECKS_GROUP_100_LENGTH = 1;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginAdditionalSyntaxChecks100;
	
	/**
	* Constructor for AdditionalSyntaxChecksGroup100Serialized
	**/
    public AdditionalSyntaxChecksGroup100Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* initializes the field in AdditionalSyntaxChecksGroup100Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(ADDITIONAL_SYNTAX_CHECKS_GROUP_100_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginAdditionalSyntaxChecks100 = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localAdditionalSyntaxChecks100Counter = -1;
     public boolean isAdditionalSyntaxChecks100Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localAdditionalSyntaxChecks100Counter != sharedCounter;
         localAdditionalSyntaxChecks100Counter = sharedCounter; return hasModified;
     }
	protected static final int ADDITIONAL_SYNTAX_CHECKS_100_LEN = 1;
	/**
	 * 	serialize this AdditionalSyntaxChecks100
	 */
   protected void serializeAdditionalSyntaxChecks100(char[] additionalSyntaxChecks100) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(additionalSyntaxChecks100,0,getStringValue(),beginAdditionalSyntaxChecks100,ADDITIONAL_SYNTAX_CHECKS_100_LEN);
       localAdditionalSyntaxChecks100Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkAdditionalSyntaxChecks100Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshAdditionalSyntaxChecks100 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshAdditionalSyntaxChecks100() {	 
   		return (substring(getStringValue(),beginAdditionalSyntaxChecks100,beginAdditionalSyntaxChecks100 + ADDITIONAL_SYNTAX_CHECKS_100_LEN));
   	}




}
  
