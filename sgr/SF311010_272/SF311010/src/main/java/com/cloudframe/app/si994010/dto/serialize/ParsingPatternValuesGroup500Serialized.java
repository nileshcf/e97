package com.cloudframe.app.si994010.dto.serialize;

/**
*  The class ParsingPatternValuesGroup500Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:07. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class ParsingPatternValuesGroup500Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(ParsingPatternValuesGroup500Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int PARSING_PATTERN_VALUES_GROUP_500_LENGTH = 2048;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginParsingPatternValues500;
	
	/**
	* Constructor for ParsingPatternValuesGroup500Serialized
	**/
    public ParsingPatternValuesGroup500Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in ParsingPatternValuesGroup500Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(PARSING_PATTERN_VALUES_GROUP_500_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginParsingPatternValues500 = getStartOffset() + 0;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localParsingPatternValues500Counter = -1;
     public boolean isParsingPatternValues500Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localParsingPatternValues500Counter != sharedCounter;
         localParsingPatternValues500Counter = sharedCounter; return hasModified;
     }
	protected static final int PARSING_PATTERN_VALUES_500_LEN = 2048;
	/**
	 * 	serialize this ParsingPatternValues500
	 */
   protected void serializeParsingPatternValues500(char[] parsingPatternValues500) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(parsingPatternValues500,0,getStringValue(),beginParsingPatternValues500,PARSING_PATTERN_VALUES_500_LEN);
       localParsingPatternValues500Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkParsingPatternValues500Constraints(char[] value) {
   			return super.checkConstraints(value , 2048 ,false, false);
   }
    /**
	 *	refreshParsingPatternValues500 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshParsingPatternValues500() {	 
   		return (substring(getStringValue(),beginParsingPatternValues500,beginParsingPatternValues500 + PARSING_PATTERN_VALUES_500_LEN));
   	}




}
  
