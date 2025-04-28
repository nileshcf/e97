package com.cloudframe.app.db2varch.dto.serialize;

/**
*  The class PublishedDateSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:05. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class PublishedDateSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(PublishedDateSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int PUBLISHED_DATE_LENGTH = 257;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginPublishedDateLen;
            protected  int beginPublishedDateText;
	
	/**
	* Constructor for PublishedDateSerialized
	**/
    public PublishedDateSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for PublishedDateSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public PublishedDateSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this PublishedDateSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,8); // serialize this field at offset 8 by default 
    }
    
	/**
	* sets parent for this PublishedDateSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 8 by default
    }    
	/**
	* initializes the field in PublishedDateSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(PUBLISHED_DATE_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginPublishedDateLen = getStartOffset() + 0;	// set offset for serialization
  
             beginPublishedDateText = getStartOffset() + 2;	// set offset for serialization
  
	   /*  end of offset */
	}
         int localPublishedDateLenCounter = -1;
         public boolean isPublishedDateLenModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localPublishedDateLenCounter != sharedCounter;
            localPublishedDateLenCounter = sharedCounter; return hasModified; 
         }
   protected static final int PUBLISHED_DATE_LEN_LEN = 2;
  	/**
	 * serializePublishedDateLen
	 */
	protected void serializePublishedDateLen(short publishedDateLen) {
           replaceValue( //  save the value as string
                   getBinaryString( publishedDateLen,PUBLISHED_DATE_LEN_LEN)
                  ,beginPublishedDateLen
                  ,PUBLISHED_DATE_LEN_LEN
                 );
            localPublishedDateLenCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkPublishedDateLenMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshPublishedDateLen is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshPublishedDateLen() {	 
			return (getShort(beginPublishedDateLen));
   	}
     int localPublishedDateTextCounter = -1;
     public boolean isPublishedDateTextModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPublishedDateTextCounter != sharedCounter;
         localPublishedDateTextCounter = sharedCounter; return hasModified;
     }
	protected static final int PUBLISHED_DATE_TEXT_LEN = 255;
	/**
	 * 	serialize this PublishedDateText
	 */
   protected void serializePublishedDateText(char[] publishedDateText) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(publishedDateText,0,getStringValue(),beginPublishedDateText,PUBLISHED_DATE_TEXT_LEN);
       localPublishedDateTextCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkPublishedDateTextConstraints(char[] value) {
   			return super.checkConstraints(value , 255 ,false, false);
   }
    /**
	 *	refreshPublishedDateText is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshPublishedDateText() {	 
   		return (substring(getStringValue(),beginPublishedDateText,beginPublishedDateText + PUBLISHED_DATE_TEXT_LEN));
   	}




}
  
