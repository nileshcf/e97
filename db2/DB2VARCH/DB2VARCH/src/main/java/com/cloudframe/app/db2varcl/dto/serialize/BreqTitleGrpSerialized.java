package com.cloudframe.app.db2varcl.dto.serialize;

/**
*  The class BreqTitleGrpSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:20. using version 5.0.0.257
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class BreqTitleGrpSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(BreqTitleGrpSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int BREQ_TITLE_GRP_LENGTH = 257;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginBreqTitleLen;
            protected  int beginBreqTitleText;
	
	/**
	* Constructor for BreqTitleGrpSerialized
	**/
    public BreqTitleGrpSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for BreqTitleGrpSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public BreqTitleGrpSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this BreqTitleGrpSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,273); // serialize this field at offset 273 by default 
    }
    
	/**
	* sets parent for this BreqTitleGrpSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 273 by default
    }    
	/**
	* initializes the field in BreqTitleGrpSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(BREQ_TITLE_GRP_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginBreqTitleLen = getStartOffset() + 0;	// set offset for serialization
  
             beginBreqTitleText = getStartOffset() + 2;	// set offset for serialization
  
	   /*  end of offset */
	}
         int localBreqTitleLenCounter = -1;
         public boolean isBreqTitleLenModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localBreqTitleLenCounter != sharedCounter;
            localBreqTitleLenCounter = sharedCounter; return hasModified; 
         }
   protected static final int BREQ_TITLE_LEN_LEN = 2;
  	/**
	 * serializeBreqTitleLen
	 */
	protected void serializeBreqTitleLen(short breqTitleLen) {
           replaceValue( //  save the value as string
                   getBinaryString( breqTitleLen,BREQ_TITLE_LEN_LEN)
                  ,beginBreqTitleLen
                  ,BREQ_TITLE_LEN_LEN
                 );
            localBreqTitleLenCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkBreqTitleLenMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshBreqTitleLen is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshBreqTitleLen() {	 
			return (getShort(beginBreqTitleLen));
   	}
     int localBreqTitleTextCounter = -1;
     public boolean isBreqTitleTextModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBreqTitleTextCounter != sharedCounter;
         localBreqTitleTextCounter = sharedCounter; return hasModified;
     }
	protected static final int BREQ_TITLE_TEXT_LEN = 255;
	/**
	 * 	serialize this BreqTitleText
	 */
   protected void serializeBreqTitleText(char[] breqTitleText) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(breqTitleText,0,getStringValue(),beginBreqTitleText,BREQ_TITLE_TEXT_LEN);
       localBreqTitleTextCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBreqTitleTextConstraints(char[] value) {
   			return super.checkConstraints(value , 255 ,false, false);
   }
    /**
	 *	refreshBreqTitleText is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBreqTitleText() {	 
   		return (substring(getStringValue(),beginBreqTitleText,beginBreqTitleText + BREQ_TITLE_TEXT_LEN));
   	}




}
  
