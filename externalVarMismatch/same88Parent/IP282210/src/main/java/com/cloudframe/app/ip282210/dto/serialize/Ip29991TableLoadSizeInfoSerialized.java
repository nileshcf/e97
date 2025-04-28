package com.cloudframe.app.ip282210.dto.serialize;

/**
*  The class Ip29991TableLoadSizeInfoSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:03. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip29991TableLoadSizeInfoSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip29991TableLoadSizeInfoSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_29991_TABLE_LOAD_SIZE_INFO_LENGTH = 112;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp29991LoadSearchPgm;
            protected  int beginIp29991TableId;
            protected  int beginIp29991FillerText;
            protected  int beginIp29991TableRowsLoaded;
            protected  int beginIp29991FillerText01;
            protected  int beginIp29991TableRowOccurs;
            protected  int beginIp29991TableName;
	
	/**
	* Constructor for Ip29991TableLoadSizeInfoSerialized
	**/
    public Ip29991TableLoadSizeInfoSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in Ip29991TableLoadSizeInfoSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_29991_TABLE_LOAD_SIZE_INFO_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp29991LoadSearchPgm = getStartOffset() + 0;	// set offset for serialization
  
  
             beginIp29991TableId = getStartOffset() + 9;	// set offset for serialization
  
  
             beginIp29991FillerText = getStartOffset() + 18;	// set offset for serialization
  
             beginIp29991TableRowsLoaded = getStartOffset() + 39;	// set offset for serialization
  
             beginIp29991FillerText01 = getStartOffset() + 47;	// set offset for serialization
  
             beginIp29991TableRowOccurs = getStartOffset() + 67;	// set offset for serialization
  
  
             beginIp29991TableName = getStartOffset() + 77;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localIp29991LoadSearchPgmCounter = -1;
     public boolean isIp29991LoadSearchPgmModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp29991LoadSearchPgmCounter != sharedCounter;
         localIp29991LoadSearchPgmCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_29991_LOAD_SEARCH_PGM_LEN = 8;
	/**
	 * 	serialize this Ip29991LoadSearchPgm
	 */
   protected void serializeIp29991LoadSearchPgm(char[] ip29991LoadSearchPgm) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip29991LoadSearchPgm,0,getStringValue(),beginIp29991LoadSearchPgm,IP_29991_LOAD_SEARCH_PGM_LEN);
       localIp29991LoadSearchPgmCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp29991LoadSearchPgmConstraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshIp29991LoadSearchPgm is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp29991LoadSearchPgm() {	 
   		return (substring(getStringValue(),beginIp29991LoadSearchPgm,beginIp29991LoadSearchPgm + IP_29991_LOAD_SEARCH_PGM_LEN));
   	}
     int localIp29991TableIdCounter = -1;
     public boolean isIp29991TableIdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp29991TableIdCounter != sharedCounter;
         localIp29991TableIdCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_29991_TABLE_ID_LEN = 8;
	/**
	 * 	serialize this Ip29991TableId
	 */
   protected void serializeIp29991TableId(char[] ip29991TableId) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip29991TableId,0,getStringValue(),beginIp29991TableId,IP_29991_TABLE_ID_LEN);
       localIp29991TableIdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp29991TableIdConstraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshIp29991TableId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp29991TableId() {	 
   		return (substring(getStringValue(),beginIp29991TableId,beginIp29991TableId + IP_29991_TABLE_ID_LEN));
   	}
     int localIp29991FillerTextCounter = -1;
     public boolean isIp29991FillerTextModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp29991FillerTextCounter != sharedCounter;
         localIp29991FillerTextCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_29991_FILLER_TEXT_LEN = 21;
	/**
	 * 	serialize this Ip29991FillerText
	 */
   protected void serializeIp29991FillerText(char[] ip29991FillerText) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip29991FillerText,0,getStringValue(),beginIp29991FillerText,IP_29991_FILLER_TEXT_LEN);
       localIp29991FillerTextCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp29991FillerTextConstraints(char[] value) {
   			return super.checkConstraints(value , 21 ,false, false);
   }
    /**
	 *	refreshIp29991FillerText is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp29991FillerText() {	 
   		return (substring(getStringValue(),beginIp29991FillerText,beginIp29991FillerText + IP_29991_FILLER_TEXT_LEN));
   	}
     int localIp29991TableRowsLoadedCounter = -1;
     public boolean isIp29991TableRowsLoadedModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp29991TableRowsLoadedCounter != sharedCounter;
         localIp29991TableRowsLoadedCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ip29991TableRowsLoaded
	 *	@return ip29991TableRowsLoaded
	 */
	public char[]  getIp29991TableRowsLoadedString() {
	     return getCharArray(beginIp29991TableRowsLoaded,IP_29991_TABLE_ROWS_LOADED_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip29991TableRowsLoadedIsNumeric() {
	    return isNumeric(beginIp29991TableRowsLoaded
	                    ,beginIp29991TableRowsLoaded + IP_29991_TABLE_ROWS_LOADED_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int IP_29991_TABLE_ROWS_LOADED_LEN = 8;
  	/**
	 * serializeIp29991TableRowsLoaded
	 */
	protected void serializeIp29991TableRowsLoaded(long ip29991TableRowsLoaded) {
		 putNumber(beginIp29991TableRowsLoaded,ip29991TableRowsLoaded,IP_29991_TABLE_ROWS_LOADED_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localIp29991TableRowsLoadedCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeIp29991TableRowsLoaded
	 */
   	protected  long serializeIp29991TableRowsLoaded(char[] value) {
	    long  ip29991TableRowsLoaded;
	    if(value.length >0 && value.length!= 8)
            value = new String(value).trim().toCharArray();
	    if (value.length < 8) value = pad(8, value, ' ', LEFT_PAD);
	    else if (value.length > 8) value = substring(value,0,8);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ip29991TableRowsLoaded = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(8,value,false/*isSigned?*/)
		       ,beginIp29991TableRowsLoaded
		       ,8
		      );
		 localIp29991TableRowsLoadedCounter = shareString.getSerializedField().getModifiedCounter();
		return  ip29991TableRowsLoaded;
    }

   protected long checkIp29991TableRowsLoadedMaxLimit(long number) {

        return checkMaxLimit(number , MAX_100M/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshIp29991TableRowsLoaded is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshIp29991TableRowsLoaded() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginIp29991TableRowsLoaded
			                 ,IP_29991_TABLE_ROWS_LOADED_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ip29991TableRowsLoaded", beginIp29991TableRowsLoaded,IP_29991_TABLE_ROWS_LOADED_LEN);
    }
   	}
     int localIp29991FillerText01Counter = -1;
     public boolean isIp29991FillerText01Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp29991FillerText01Counter != sharedCounter;
         localIp29991FillerText01Counter = sharedCounter; return hasModified;
     }
	protected static final int IP_29991_FILLER_TEXT_01_LEN = 20;
	/**
	 * 	serialize this Ip29991FillerText01
	 */
   protected void serializeIp29991FillerText01(char[] ip29991FillerText01) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip29991FillerText01,0,getStringValue(),beginIp29991FillerText01,IP_29991_FILLER_TEXT_01_LEN);
       localIp29991FillerText01Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp29991FillerText01Constraints(char[] value) {
   			return super.checkConstraints(value , 20 ,false, false);
   }
    /**
	 *	refreshIp29991FillerText01 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp29991FillerText01() {	 
   		return (substring(getStringValue(),beginIp29991FillerText01,beginIp29991FillerText01 + IP_29991_FILLER_TEXT_01_LEN));
   	}
     int localIp29991TableRowOccursCounter = -1;
     public boolean isIp29991TableRowOccursModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp29991TableRowOccursCounter != sharedCounter;
         localIp29991TableRowOccursCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ip29991TableRowOccurs
	 *	@return ip29991TableRowOccurs
	 */
	public char[]  getIp29991TableRowOccursString() {
	     return getCharArray(beginIp29991TableRowOccurs,IP_29991_TABLE_ROW_OCCURS_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip29991TableRowOccursIsNumeric() {
	    return isNumeric(beginIp29991TableRowOccurs
	                    ,beginIp29991TableRowOccurs + IP_29991_TABLE_ROW_OCCURS_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int IP_29991_TABLE_ROW_OCCURS_LEN = 8;
  	/**
	 * serializeIp29991TableRowOccurs
	 */
	protected void serializeIp29991TableRowOccurs(long ip29991TableRowOccurs) {
		 putNumber(beginIp29991TableRowOccurs,ip29991TableRowOccurs,IP_29991_TABLE_ROW_OCCURS_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localIp29991TableRowOccursCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeIp29991TableRowOccurs
	 */
   	protected  long serializeIp29991TableRowOccurs(char[] value) {
	    long  ip29991TableRowOccurs;
	    if(value.length >0 && value.length!= 8)
            value = new String(value).trim().toCharArray();
	    if (value.length < 8) value = pad(8, value, ' ', LEFT_PAD);
	    else if (value.length > 8) value = substring(value,0,8);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ip29991TableRowOccurs = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(8,value,false/*isSigned?*/)
		       ,beginIp29991TableRowOccurs
		       ,8
		      );
		 localIp29991TableRowOccursCounter = shareString.getSerializedField().getModifiedCounter();
		return  ip29991TableRowOccurs;
    }

   protected long checkIp29991TableRowOccursMaxLimit(long number) {

        return checkMaxLimit(number , MAX_100M/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshIp29991TableRowOccurs is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshIp29991TableRowOccurs() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginIp29991TableRowOccurs
			                 ,IP_29991_TABLE_ROW_OCCURS_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ip29991TableRowOccurs", beginIp29991TableRowOccurs,IP_29991_TABLE_ROW_OCCURS_LEN);
    }
   	}
     int localIp29991TableNameCounter = -1;
     public boolean isIp29991TableNameModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp29991TableNameCounter != sharedCounter;
         localIp29991TableNameCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_29991_TABLE_NAME_LEN = 35;
	/**
	 * 	serialize this Ip29991TableName
	 */
   protected void serializeIp29991TableName(char[] ip29991TableName) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip29991TableName,0,getStringValue(),beginIp29991TableName,IP_29991_TABLE_NAME_LEN);
       localIp29991TableNameCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp29991TableNameConstraints(char[] value) {
   			return super.checkConstraints(value , 35 ,false, false);
   }
    /**
	 *	refreshIp29991TableName is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp29991TableName() {	 
   		return (substring(getStringValue(),beginIp29991TableName,beginIp29991TableName + IP_29991_TABLE_NAME_LEN));
   	}




}
  
