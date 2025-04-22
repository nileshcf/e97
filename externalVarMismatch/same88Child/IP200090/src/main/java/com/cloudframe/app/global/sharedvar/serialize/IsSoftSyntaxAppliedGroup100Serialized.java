package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class IsSoftSyntaxAppliedGroup100Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:14. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class IsSoftSyntaxAppliedGroup100Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(IsSoftSyntaxAppliedGroup100Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IS_SOFT_SYNTAX_APPLIED_GROUP_100_LENGTH = 1;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIsSoftSyntaxApplied100;
	
	/**
	* Constructor for IsSoftSyntaxAppliedGroup100Serialized
	**/
    public IsSoftSyntaxAppliedGroup100Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* initializes the field in IsSoftSyntaxAppliedGroup100Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IS_SOFT_SYNTAX_APPLIED_GROUP_100_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIsSoftSyntaxApplied100 = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localIsSoftSyntaxApplied100Counter = -1;
     public boolean isIsSoftSyntaxApplied100Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIsSoftSyntaxApplied100Counter != sharedCounter;
         localIsSoftSyntaxApplied100Counter = sharedCounter; return hasModified;
     }
	protected static final int IS_SOFT_SYNTAX_APPLIED_100_LEN = 1;
	/**
	 * 	serialize this IsSoftSyntaxApplied100
	 */
   protected void serializeIsSoftSyntaxApplied100(char[] isSoftSyntaxApplied100) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(isSoftSyntaxApplied100,0,getStringValue(),beginIsSoftSyntaxApplied100,IS_SOFT_SYNTAX_APPLIED_100_LEN);
       localIsSoftSyntaxApplied100Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIsSoftSyntaxApplied100Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIsSoftSyntaxApplied100 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIsSoftSyntaxApplied100() {	 
   		return (substring(getStringValue(),beginIsSoftSyntaxApplied100,beginIsSoftSyntaxApplied100 + IS_SOFT_SYNTAX_APPLIED_100_LEN));
   	}




}
  
