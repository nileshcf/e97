package com.cloudframe.app.ip989010.dto.serialize;

/**
*  The class TagKey5001240200Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:17. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class TagKey5001240200Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(TagKey5001240200Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int TAG_KEY_5001240200_LENGTH = 13;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginTagType5001240200;
            protected  int beginTagNum5001240200;
            protected  int beginTagSubfldNo5001240200;
            protected  int beginTagOccur5001240200;
	
	/**
	* Constructor for TagKey5001240200Serialized
	**/
    public TagKey5001240200Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for TagKey5001240200Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public TagKey5001240200Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this TagKey5001240200Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this TagKey5001240200Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in TagKey5001240200Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(TAG_KEY_5001240200_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginTagType5001240200 = getStartOffset() + 0;	// set offset for serialization
  
             beginTagNum5001240200 = getStartOffset() + 1;	// set offset for serialization
  
             beginTagSubfldNo5001240200 = getStartOffset() + 5;	// set offset for serialization
  
             beginTagOccur5001240200 = getStartOffset() + 9;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localTagType5001240200Counter = -1;
     public boolean isTagType5001240200Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTagType5001240200Counter != sharedCounter;
         localTagType5001240200Counter = sharedCounter; return hasModified;
     }
	protected static final int TAG_TYPE_5001240200_LEN = 1;
	/**
	 * 	serialize this TagType5001240200
	 */
   protected void serializeTagType5001240200(char[] tagType5001240200) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(tagType5001240200,0,getStringValue(),beginTagType5001240200,TAG_TYPE_5001240200_LEN);
       localTagType5001240200Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTagType5001240200Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshTagType5001240200 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTagType5001240200() {	 
   		return (substring(getStringValue(),beginTagType5001240200,beginTagType5001240200 + TAG_TYPE_5001240200_LEN));
   	}
     int localTagNum5001240200Counter = -1;
     public boolean isTagNum5001240200Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTagNum5001240200Counter != sharedCounter;
         localTagNum5001240200Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of tagNum5001240200
	 *	@return tagNum5001240200
	 */
	public char[]  getTagNum5001240200String() {
	     return getCharArray(beginTagNum5001240200,TAG_NUM_5001240200_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tagNum5001240200IsNumeric() {
	    return isNumeric(beginTagNum5001240200
	                    ,beginTagNum5001240200 + TAG_NUM_5001240200_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int TAG_NUM_5001240200_LEN = 4;
  	/**
	 * serializeTagNum5001240200
	 */
	protected void serializeTagNum5001240200(int tagNum5001240200) {
		 putNumber(beginTagNum5001240200,tagNum5001240200,TAG_NUM_5001240200_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localTagNum5001240200Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeTagNum5001240200
	 */
   	protected  int serializeTagNum5001240200(char[] value) {
	    int  tagNum5001240200;
	    if(value.length >0 && value.length!= 4)
            value = new String(value).trim().toCharArray();
	    if (value.length < 4) value = pad(4, value, ' ', LEFT_PAD);
	    else if (value.length > 4) value = substring(value,0,4);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    tagNum5001240200 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(4,value,false/*isSigned?*/)
		       ,beginTagNum5001240200
		       ,4
		      );
		 localTagNum5001240200Counter = shareString.getSerializedField().getModifiedCounter();
		return  tagNum5001240200;
    }

   protected int checkTagNum5001240200MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10K/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshTagNum5001240200 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshTagNum5001240200() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginTagNum5001240200
			                 ,TAG_NUM_5001240200_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("tagNum5001240200", beginTagNum5001240200,TAG_NUM_5001240200_LEN);
    }
   	}
     int localTagSubfldNo5001240200Counter = -1;
     public boolean isTagSubfldNo5001240200Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTagSubfldNo5001240200Counter != sharedCounter;
         localTagSubfldNo5001240200Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of tagSubfldNo5001240200
	 *	@return tagSubfldNo5001240200
	 */
	public char[]  getTagSubfldNo5001240200String() {
	     return getCharArray(beginTagSubfldNo5001240200,TAG_SUBFLD_NO_5001240200_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tagSubfldNo5001240200IsNumeric() {
	    return isNumeric(beginTagSubfldNo5001240200
	                    ,beginTagSubfldNo5001240200 + TAG_SUBFLD_NO_5001240200_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int TAG_SUBFLD_NO_5001240200_LEN = 4;
  	/**
	 * serializeTagSubfldNo5001240200
	 */
	protected void serializeTagSubfldNo5001240200(int tagSubfldNo5001240200) {
		 putNumber(beginTagSubfldNo5001240200,tagSubfldNo5001240200,TAG_SUBFLD_NO_5001240200_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localTagSubfldNo5001240200Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeTagSubfldNo5001240200
	 */
   	protected  int serializeTagSubfldNo5001240200(char[] value) {
	    int  tagSubfldNo5001240200;
	    if(value.length >0 && value.length!= 4)
            value = new String(value).trim().toCharArray();
	    if (value.length < 4) value = pad(4, value, ' ', LEFT_PAD);
	    else if (value.length > 4) value = substring(value,0,4);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    tagSubfldNo5001240200 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(4,value,false/*isSigned?*/)
		       ,beginTagSubfldNo5001240200
		       ,4
		      );
		 localTagSubfldNo5001240200Counter = shareString.getSerializedField().getModifiedCounter();
		return  tagSubfldNo5001240200;
    }

   protected int checkTagSubfldNo5001240200MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10K/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshTagSubfldNo5001240200 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshTagSubfldNo5001240200() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginTagSubfldNo5001240200
			                 ,TAG_SUBFLD_NO_5001240200_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("tagSubfldNo5001240200", beginTagSubfldNo5001240200,TAG_SUBFLD_NO_5001240200_LEN);
    }
   	}
     int localTagOccur5001240200Counter = -1;
     public boolean isTagOccur5001240200Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTagOccur5001240200Counter != sharedCounter;
         localTagOccur5001240200Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of tagOccur5001240200
	 *	@return tagOccur5001240200
	 */
	public char[]  getTagOccur5001240200String() {
	     return getCharArray(beginTagOccur5001240200,TAG_OCCUR_5001240200_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tagOccur5001240200IsNumeric() {
	    return isNumeric(beginTagOccur5001240200
	                    ,beginTagOccur5001240200 + TAG_OCCUR_5001240200_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int TAG_OCCUR_5001240200_LEN = 4;
  	/**
	 * serializeTagOccur5001240200
	 */
	protected void serializeTagOccur5001240200(int tagOccur5001240200) {
		 putNumber(beginTagOccur5001240200,tagOccur5001240200,TAG_OCCUR_5001240200_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localTagOccur5001240200Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeTagOccur5001240200
	 */
   	protected  int serializeTagOccur5001240200(char[] value) {
	    int  tagOccur5001240200;
	    if(value.length >0 && value.length!= 4)
            value = new String(value).trim().toCharArray();
	    if (value.length < 4) value = pad(4, value, ' ', LEFT_PAD);
	    else if (value.length > 4) value = substring(value,0,4);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    tagOccur5001240200 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(4,value,false/*isSigned?*/)
		       ,beginTagOccur5001240200
		       ,4
		      );
		 localTagOccur5001240200Counter = shareString.getSerializedField().getModifiedCounter();
		return  tagOccur5001240200;
    }

   protected int checkTagOccur5001240200MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10K/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshTagOccur5001240200 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshTagOccur5001240200() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginTagOccur5001240200
			                 ,TAG_OCCUR_5001240200_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("tagOccur5001240200", beginTagOccur5001240200,TAG_OCCUR_5001240200_LEN);
    }
   	}




}
  
