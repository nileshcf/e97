package com.cloudframe.app.mcissues.dto.serialize;

/**
*  The class Report1HeadingLine11701Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:44. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Report1HeadingLine11701Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Report1HeadingLine11701Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int REPORT_1_HEADING_LINE_11701_LENGTH = 34;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginSourceMessageNo701;
	
	/**
	* Constructor for Report1HeadingLine11701Serialized
	**/
    public Report1HeadingLine11701Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Report1HeadingLine11701Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Report1HeadingLine11701Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Report1HeadingLine11701Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this Report1HeadingLine11701Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in Report1HeadingLine11701Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(REPORT_1_HEADING_LINE_11701_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
             beginSourceMessageNo701 = getStartOffset() + 20;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localSourceMessageNo701Counter = -1;
     public boolean isSourceMessageNo701Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSourceMessageNo701Counter != sharedCounter;
         localSourceMessageNo701Counter = sharedCounter; return hasModified;
     }
	protected static final int SOURCE_MESSAGE_NO_701_LEN = 9;
	/**
	 * 	serialize this SourceMessageNo701
	 */
   protected void serializeSourceMessageNo701(char[] sourceMessageNo701) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sourceMessageNo701,0,getStringValue(),beginSourceMessageNo701,SOURCE_MESSAGE_NO_701_LEN);
       localSourceMessageNo701Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSourceMessageNo701Constraints(char[] value) {
   			return super.checkConstraints(value , 9 ,false, true);
   }
    /**
	 *	refreshSourceMessageNo701 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSourceMessageNo701() {	 
   		return (substring(getStringValue(),beginSourceMessageNo701,beginSourceMessageNo701 + SOURCE_MESSAGE_NO_701_LEN));
   	}




}
  
