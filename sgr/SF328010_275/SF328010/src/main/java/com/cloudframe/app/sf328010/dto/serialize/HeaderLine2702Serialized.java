package com.cloudframe.app.sf328010.dto.serialize;

/**
*  The class HeaderLine2702Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 06:58. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class HeaderLine2702Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(HeaderLine2702Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int HEADER_LINE_2702_LENGTH = 129;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginPageNum702;
	
	/**
	* Constructor for HeaderLine2702Serialized
	**/
    public HeaderLine2702Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in HeaderLine2702Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(HEADER_LINE_2702_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
  
  
  
  
             beginPageNum702 = getStartOffset() + 117;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localPageNum702Counter = -1;
     public boolean isPageNum702Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPageNum702Counter != sharedCounter;
         localPageNum702Counter = sharedCounter; return hasModified;
     }
	protected static final int PAGE_NUM_702_LEN = 11;
	/**
	 * 	serialize this PageNum702
	 */
   protected void serializePageNum702(char[] pageNum702) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(pageNum702,0,getStringValue(),beginPageNum702,PAGE_NUM_702_LEN);
       localPageNum702Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkPageNum702Constraints(char[] value) {
   			return super.checkConstraints(value , 11 ,false, false);
   }
    /**
	 *	refreshPageNum702 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshPageNum702() {	 
   		return (substring(getStringValue(),beginPageNum702,beginPageNum702 + PAGE_NUM_702_LEN));
   	}




}
  
