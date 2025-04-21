package com.cloudframe.app.db2varch.dto.serialize;

/**
*  The class BreqPublishedDateSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 10:58. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class BreqPublishedDateSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(BreqPublishedDateSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int BREQ_PUBLISHED_DATE_LENGTH = 257;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginBreqPublishedDateLen;
            protected  int beginBreqPublishedDateText;
	
	/**
	* Constructor for BreqPublishedDateSerialized
	**/
    public BreqPublishedDateSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for BreqPublishedDateSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public BreqPublishedDateSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this BreqPublishedDateSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,8); // serialize this field at offset 8 by default 
    }
    
	/**
	* sets parent for this BreqPublishedDateSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 8 by default
    }    
	/**
	* initializes the field in BreqPublishedDateSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(BREQ_PUBLISHED_DATE_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginBreqPublishedDateLen = getStartOffset() + 0;	// set offset for serialization
  
             beginBreqPublishedDateText = getStartOffset() + 2;	// set offset for serialization
  
	   /*  end of offset */
	}
         int localBreqPublishedDateLenCounter = -1;
         public boolean isBreqPublishedDateLenModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localBreqPublishedDateLenCounter != sharedCounter;
            localBreqPublishedDateLenCounter = sharedCounter; return hasModified; 
         }
   protected static final int BREQ_PUBLISHED_DATE_LEN_LEN = 2;
  	/**
	 * serializeBreqPublishedDateLen
	 */
	protected void serializeBreqPublishedDateLen(short breqPublishedDateLen) {
           replaceValue( //  save the value as string
                   getBinaryString( breqPublishedDateLen,BREQ_PUBLISHED_DATE_LEN_LEN)
                  ,beginBreqPublishedDateLen
                  ,BREQ_PUBLISHED_DATE_LEN_LEN
                 );
            localBreqPublishedDateLenCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkBreqPublishedDateLenMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshBreqPublishedDateLen is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshBreqPublishedDateLen() {	 
			return (getShort(beginBreqPublishedDateLen));
   	}
     int localBreqPublishedDateTextCounter = -1;
     public boolean isBreqPublishedDateTextModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBreqPublishedDateTextCounter != sharedCounter;
         localBreqPublishedDateTextCounter = sharedCounter; return hasModified;
     }
	protected static final int BREQ_PUBLISHED_DATE_TEXT_LEN = 255;
	/**
	 * 	serialize this BreqPublishedDateText
	 */
   protected void serializeBreqPublishedDateText(char[] breqPublishedDateText) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(breqPublishedDateText,0,getStringValue(),beginBreqPublishedDateText,BREQ_PUBLISHED_DATE_TEXT_LEN);
       localBreqPublishedDateTextCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBreqPublishedDateTextConstraints(char[] value) {
   			return super.checkConstraints(value , 255 ,false, false);
   }
    /**
	 *	refreshBreqPublishedDateText is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBreqPublishedDateText() {	 
   		return (substring(getStringValue(),beginBreqPublishedDateText,beginBreqPublishedDateText + BREQ_PUBLISHED_DATE_TEXT_LEN));
   	}




}
  
