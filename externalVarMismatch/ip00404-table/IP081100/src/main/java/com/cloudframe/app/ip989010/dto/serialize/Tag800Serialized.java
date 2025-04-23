package com.cloudframe.app.ip989010.dto.serialize;

/**
*  The class Tag800Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:31. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Tag800Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Tag800Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int TAG_800_LENGTH = 24;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginTagType800;
            protected  int beginTagNum800;
            protected  int beginTagOccur800;
            protected  int beginTagSubfldNo800;
            protected  int beginTagStart800;
            protected  int beginTagLngth800;
	
	/**
	* Constructor for Tag800Serialized
	**/
    public Tag800Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Tag800Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Tag800Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Tag800Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this Tag800Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in Tag800Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(TAG_800_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginTagType800 = getStartOffset() + 0;	// set offset for serialization
  
             beginTagNum800 = getStartOffset() + 4;	// set offset for serialization
  
             beginTagOccur800 = getStartOffset() + 8;	// set offset for serialization
  
             beginTagSubfldNo800 = getStartOffset() + 12;	// set offset for serialization
  
             beginTagStart800 = getStartOffset() + 16;	// set offset for serialization
  
             beginTagLngth800 = getStartOffset() + 20;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localTagType800Counter = -1;
     public boolean isTagType800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTagType800Counter != sharedCounter;
         localTagType800Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of tagType800
	 *	@return tagType800
	 */
	public char[]  getTagType800String() {
	     return getCharArray(beginTagType800,TAG_TYPE_800_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tagType800IsNumeric() {
	    return isNumeric(beginTagType800
	                    ,beginTagType800 + TAG_TYPE_800_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int TAG_TYPE_800_LEN = 4;
  	/**
	 * serializeTagType800
	 */
	protected void serializeTagType800(int tagType800) {
		 putNumber(beginTagType800,tagType800,TAG_TYPE_800_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localTagType800Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeTagType800
	 */
   	protected  int serializeTagType800(char[] value) {
	    int  tagType800;
	    if(value.length >0 && value.length!= 4)
            value = new String(value).trim().toCharArray();
	    if (value.length < 4) value = pad(4, value, ' ', LEFT_PAD);
	    else if (value.length > 4) value = substring(value,0,4);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    tagType800 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(4,value,false/*isSigned?*/)
		       ,beginTagType800
		       ,4
		      );
		 localTagType800Counter = shareString.getSerializedField().getModifiedCounter();
		return  tagType800;
    }

   protected int checkTagType800MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10K/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshTagType800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshTagType800() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginTagType800
			                 ,TAG_TYPE_800_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("tagType800", beginTagType800,TAG_TYPE_800_LEN);
    }
   	}
     int localTagNum800Counter = -1;
     public boolean isTagNum800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTagNum800Counter != sharedCounter;
         localTagNum800Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of tagNum800
	 *	@return tagNum800
	 */
	public char[]  getTagNum800String() {
	     return getCharArray(beginTagNum800,TAG_NUM_800_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tagNum800IsNumeric() {
	    return isNumeric(beginTagNum800
	                    ,beginTagNum800 + TAG_NUM_800_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int TAG_NUM_800_LEN = 4;
  	/**
	 * serializeTagNum800
	 */
	protected void serializeTagNum800(int tagNum800) {
		 putNumber(beginTagNum800,tagNum800,TAG_NUM_800_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localTagNum800Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeTagNum800
	 */
   	protected  int serializeTagNum800(char[] value) {
	    int  tagNum800;
	    if(value.length >0 && value.length!= 4)
            value = new String(value).trim().toCharArray();
	    if (value.length < 4) value = pad(4, value, ' ', LEFT_PAD);
	    else if (value.length > 4) value = substring(value,0,4);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    tagNum800 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(4,value,false/*isSigned?*/)
		       ,beginTagNum800
		       ,4
		      );
		 localTagNum800Counter = shareString.getSerializedField().getModifiedCounter();
		return  tagNum800;
    }

   protected int checkTagNum800MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10K/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshTagNum800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshTagNum800() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginTagNum800
			                 ,TAG_NUM_800_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("tagNum800", beginTagNum800,TAG_NUM_800_LEN);
    }
   	}
     int localTagOccur800Counter = -1;
     public boolean isTagOccur800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTagOccur800Counter != sharedCounter;
         localTagOccur800Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of tagOccur800
	 *	@return tagOccur800
	 */
	public char[]  getTagOccur800String() {
	     return getCharArray(beginTagOccur800,TAG_OCCUR_800_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tagOccur800IsNumeric() {
	    return isNumeric(beginTagOccur800
	                    ,beginTagOccur800 + TAG_OCCUR_800_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int TAG_OCCUR_800_LEN = 4;
  	/**
	 * serializeTagOccur800
	 */
	protected void serializeTagOccur800(int tagOccur800) {
		 putNumber(beginTagOccur800,tagOccur800,TAG_OCCUR_800_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localTagOccur800Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeTagOccur800
	 */
   	protected  int serializeTagOccur800(char[] value) {
	    int  tagOccur800;
	    if(value.length >0 && value.length!= 4)
            value = new String(value).trim().toCharArray();
	    if (value.length < 4) value = pad(4, value, ' ', LEFT_PAD);
	    else if (value.length > 4) value = substring(value,0,4);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    tagOccur800 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(4,value,false/*isSigned?*/)
		       ,beginTagOccur800
		       ,4
		      );
		 localTagOccur800Counter = shareString.getSerializedField().getModifiedCounter();
		return  tagOccur800;
    }

   protected int checkTagOccur800MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10K/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshTagOccur800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshTagOccur800() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginTagOccur800
			                 ,TAG_OCCUR_800_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("tagOccur800", beginTagOccur800,TAG_OCCUR_800_LEN);
    }
   	}
     int localTagSubfldNo800Counter = -1;
     public boolean isTagSubfldNo800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTagSubfldNo800Counter != sharedCounter;
         localTagSubfldNo800Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of tagSubfldNo800
	 *	@return tagSubfldNo800
	 */
	public char[]  getTagSubfldNo800String() {
	     return getCharArray(beginTagSubfldNo800,TAG_SUBFLD_NO_800_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tagSubfldNo800IsNumeric() {
	    return isNumeric(beginTagSubfldNo800
	                    ,beginTagSubfldNo800 + TAG_SUBFLD_NO_800_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int TAG_SUBFLD_NO_800_LEN = 4;
  	/**
	 * serializeTagSubfldNo800
	 */
	protected void serializeTagSubfldNo800(int tagSubfldNo800) {
		 putNumber(beginTagSubfldNo800,tagSubfldNo800,TAG_SUBFLD_NO_800_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localTagSubfldNo800Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeTagSubfldNo800
	 */
   	protected  int serializeTagSubfldNo800(char[] value) {
	    int  tagSubfldNo800;
	    if(value.length >0 && value.length!= 4)
            value = new String(value).trim().toCharArray();
	    if (value.length < 4) value = pad(4, value, ' ', LEFT_PAD);
	    else if (value.length > 4) value = substring(value,0,4);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    tagSubfldNo800 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(4,value,false/*isSigned?*/)
		       ,beginTagSubfldNo800
		       ,4
		      );
		 localTagSubfldNo800Counter = shareString.getSerializedField().getModifiedCounter();
		return  tagSubfldNo800;
    }

   protected int checkTagSubfldNo800MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10K/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshTagSubfldNo800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshTagSubfldNo800() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginTagSubfldNo800
			                 ,TAG_SUBFLD_NO_800_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("tagSubfldNo800", beginTagSubfldNo800,TAG_SUBFLD_NO_800_LEN);
    }
   	}
     int localTagStart800Counter = -1;
     public boolean isTagStart800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTagStart800Counter != sharedCounter;
         localTagStart800Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of tagStart800
	 *	@return tagStart800
	 */
	public char[]  getTagStart800String() {
	     return getCharArray(beginTagStart800,TAG_START_800_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tagStart800IsNumeric() {
	    return isNumeric(beginTagStart800
	                    ,beginTagStart800 + TAG_START_800_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int TAG_START_800_LEN = 4;
  	/**
	 * serializeTagStart800
	 */
	protected void serializeTagStart800(int tagStart800) {
		 putNumber(beginTagStart800,tagStart800,TAG_START_800_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localTagStart800Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeTagStart800
	 */
   	protected  int serializeTagStart800(char[] value) {
	    int  tagStart800;
	    if(value.length >0 && value.length!= 4)
            value = new String(value).trim().toCharArray();
	    if (value.length < 4) value = pad(4, value, ' ', LEFT_PAD);
	    else if (value.length > 4) value = substring(value,0,4);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    tagStart800 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(4,value,false/*isSigned?*/)
		       ,beginTagStart800
		       ,4
		      );
		 localTagStart800Counter = shareString.getSerializedField().getModifiedCounter();
		return  tagStart800;
    }

   protected int checkTagStart800MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10K/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshTagStart800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshTagStart800() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginTagStart800
			                 ,TAG_START_800_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("tagStart800", beginTagStart800,TAG_START_800_LEN);
    }
   	}
     int localTagLngth800Counter = -1;
     public boolean isTagLngth800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTagLngth800Counter != sharedCounter;
         localTagLngth800Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of tagLngth800
	 *	@return tagLngth800
	 */
	public char[]  getTagLngth800String() {
	     return getCharArray(beginTagLngth800,TAG_LNGTH_800_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tagLngth800IsNumeric() {
	    return isNumeric(beginTagLngth800
	                    ,beginTagLngth800 + TAG_LNGTH_800_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int TAG_LNGTH_800_LEN = 4;
  	/**
	 * serializeTagLngth800
	 */
	protected void serializeTagLngth800(int tagLngth800) {
		 putNumber(beginTagLngth800,tagLngth800,TAG_LNGTH_800_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localTagLngth800Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeTagLngth800
	 */
   	protected  int serializeTagLngth800(char[] value) {
	    int  tagLngth800;
	    if(value.length >0 && value.length!= 4)
            value = new String(value).trim().toCharArray();
	    if (value.length < 4) value = pad(4, value, ' ', LEFT_PAD);
	    else if (value.length > 4) value = substring(value,0,4);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    tagLngth800 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(4,value,false/*isSigned?*/)
		       ,beginTagLngth800
		       ,4
		      );
		 localTagLngth800Counter = shareString.getSerializedField().getModifiedCounter();
		return  tagLngth800;
    }

   protected int checkTagLngth800MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10K/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshTagLngth800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshTagLngth800() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginTagLngth800
			                 ,TAG_LNGTH_800_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("tagLngth800", beginTagLngth800,TAG_LNGTH_800_LEN);
    }
   	}




}
  
