package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class MiscDataSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:05. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class MiscDataSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(MiscDataSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int MISC_DATA_LENGTH = 8;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginXmlStat;
            protected  int beginRecLenIn;
            protected  int beginEofFlag;
	
	/**
	* Constructor for MiscDataSerialized
	**/
    public MiscDataSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* initializes the field in MiscDataSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(MISC_DATA_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginXmlStat = getStartOffset() + 0;	// set offset for serialization
  
             beginRecLenIn = getStartOffset() + 2;	// set offset for serialization
  
             beginEofFlag = getStartOffset() + 6;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localXmlStatCounter = -1;
     public boolean isXmlStatModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localXmlStatCounter != sharedCounter;
         localXmlStatCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of xmlStat
	 *	@return xmlStat
	 */
	public char[]  getXmlStatString() {
	     return getCharArray(beginXmlStat,XML_STAT_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean xmlStatIsNumeric() {
	    return isNumeric(beginXmlStat
	                    ,beginXmlStat + XML_STAT_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int XML_STAT_LEN = 2;
  	/**
	 * serializeXmlStat
	 */
	protected void serializeXmlStat(int xmlStat) {
		 putNumber(beginXmlStat,xmlStat,XML_STAT_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localXmlStatCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeXmlStat
	 */
   	protected  int serializeXmlStat(char[] value) {
	    int  xmlStat;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    xmlStat = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginXmlStat
		       ,2
		      );
		 localXmlStatCounter = shareString.getSerializedField().getModifiedCounter();
		return  xmlStat;
    }

   protected int checkXmlStatMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshXmlStat is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshXmlStat() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginXmlStat
			                 ,XML_STAT_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("xmlStat", beginXmlStat,XML_STAT_LEN);
    }
   	}
         int localRecLenInCounter = -1;
         public boolean isRecLenInModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localRecLenInCounter != sharedCounter;
            localRecLenInCounter = sharedCounter; return hasModified; 
         }
   protected static final int REC_LEN_IN_LEN = 4;
  	/**
	 * serializeRecLenIn
	 */
	protected void serializeRecLenIn(long recLenIn) {
           replaceValue( //  save the value as string
                   getBinaryString( recLenIn,REC_LEN_IN_LEN)
                  ,beginRecLenIn
                  ,REC_LEN_IN_LEN
                 );
            localRecLenInCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected long checkRecLenInMaxLimit(long number) {
        return checkMaxLimit(number, false/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshRecLenIn is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshRecLenIn() {	 
			return (getUnsignedInt(beginRecLenIn));
   	}
         int localEofFlagCounter = -1;
         public boolean isEofFlagModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localEofFlagCounter != sharedCounter;
            localEofFlagCounter = sharedCounter; return hasModified; 
         }
   protected static final int EOF_FLAG_LEN = 2;
  	/**
	 * serializeEofFlag
	 */
	protected void serializeEofFlag(short eofFlag) {
           replaceValue( //  save the value as string
                   getBinaryString( eofFlag,EOF_FLAG_LEN)
                  ,beginEofFlag
                  ,EOF_FLAG_LEN
                 );
            localEofFlagCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkEofFlagMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshEofFlag is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshEofFlag() {	 
			return (getShort(beginEofFlag));
   	}




}
  
