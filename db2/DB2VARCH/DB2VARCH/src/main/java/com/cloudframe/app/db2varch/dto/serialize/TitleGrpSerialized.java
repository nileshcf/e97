package com.cloudframe.app.db2varch.dto.serialize;

/**
*  The class TitleGrpSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:24. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class TitleGrpSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(TitleGrpSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int TITLE_GRP_LENGTH = 257;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginTitleLen;
            protected  int beginTitleText;
	
	/**
	* Constructor for TitleGrpSerialized
	**/
    public TitleGrpSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for TitleGrpSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public TitleGrpSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this TitleGrpSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,273); // serialize this field at offset 273 by default 
    }
    
	/**
	* sets parent for this TitleGrpSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 273 by default
    }    
	/**
	* initializes the field in TitleGrpSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(TITLE_GRP_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginTitleLen = getStartOffset() + 0;	// set offset for serialization
  
             beginTitleText = getStartOffset() + 2;	// set offset for serialization
  
	   /*  end of offset */
	}
         int localTitleLenCounter = -1;
         public boolean isTitleLenModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTitleLenCounter != sharedCounter;
            localTitleLenCounter = sharedCounter; return hasModified; 
         }
   protected static final int TITLE_LEN_LEN = 2;
  	/**
	 * serializeTitleLen
	 */
	protected void serializeTitleLen(short titleLen) {
           replaceValue( //  save the value as string
                   getBinaryString( titleLen,TITLE_LEN_LEN)
                  ,beginTitleLen
                  ,TITLE_LEN_LEN
                 );
            localTitleLenCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkTitleLenMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshTitleLen is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshTitleLen() {	 
			return (getShort(beginTitleLen));
   	}
     int localTitleTextCounter = -1;
     public boolean isTitleTextModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTitleTextCounter != sharedCounter;
         localTitleTextCounter = sharedCounter; return hasModified;
     }
	protected static final int TITLE_TEXT_LEN = 255;
	/**
	 * 	serialize this TitleText
	 */
   protected void serializeTitleText(char[] titleText) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(titleText,0,getStringValue(),beginTitleText,TITLE_TEXT_LEN);
       localTitleTextCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTitleTextConstraints(char[] value) {
   			return super.checkConstraints(value , 255 ,false, false);
   }
    /**
	 *	refreshTitleText is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTitleText() {	 
   		return (substring(getStringValue(),beginTitleText,beginTitleText + TITLE_TEXT_LEN));
   	}




}
  
