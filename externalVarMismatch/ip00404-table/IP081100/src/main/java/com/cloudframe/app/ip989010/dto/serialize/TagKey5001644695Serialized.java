package com.cloudframe.app.ip989010.dto.serialize;

/**
*  The class TagKey5001644695Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:11. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class TagKey5001644695Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(TagKey5001644695Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int TAG_KEY_5001644695_LENGTH = 13;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginTagType5001644695;
            protected  int beginTagNum5001644695;
            protected  int beginTagSubfldNo5001644695;
            protected  int beginTagOccur5001644695;
	
	/**
	* Constructor for TagKey5001644695Serialized
	**/
    public TagKey5001644695Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for TagKey5001644695Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public TagKey5001644695Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this TagKey5001644695Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this TagKey5001644695Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in TagKey5001644695Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(TAG_KEY_5001644695_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginTagType5001644695 = getStartOffset() + 0;	// set offset for serialization
  
             beginTagNum5001644695 = getStartOffset() + 1;	// set offset for serialization
  
             beginTagSubfldNo5001644695 = getStartOffset() + 5;	// set offset for serialization
  
             beginTagOccur5001644695 = getStartOffset() + 9;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localTagType5001644695Counter = -1;
     public boolean isTagType5001644695Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTagType5001644695Counter != sharedCounter;
         localTagType5001644695Counter = sharedCounter; return hasModified;
     }
	protected static final int TAG_TYPE_5001644695_LEN = 1;
	/**
	 * 	serialize this TagType5001644695
	 */
   protected void serializeTagType5001644695(char[] tagType5001644695) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(tagType5001644695,0,getStringValue(),beginTagType5001644695,TAG_TYPE_5001644695_LEN);
       localTagType5001644695Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTagType5001644695Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshTagType5001644695 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTagType5001644695() {	 
   		return (substring(getStringValue(),beginTagType5001644695,beginTagType5001644695 + TAG_TYPE_5001644695_LEN));
   	}
     int localTagNum5001644695Counter = -1;
     public boolean isTagNum5001644695Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTagNum5001644695Counter != sharedCounter;
         localTagNum5001644695Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of tagNum5001644695
	 *	@return tagNum5001644695
	 */
	public char[]  getTagNum5001644695String() {
	     return getCharArray(beginTagNum5001644695,TAG_NUM_5001644695_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tagNum5001644695IsNumeric() {
	    return isNumeric(beginTagNum5001644695
	                    ,beginTagNum5001644695 + TAG_NUM_5001644695_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int TAG_NUM_5001644695_LEN = 4;
  	/**
	 * serializeTagNum5001644695
	 */
	protected void serializeTagNum5001644695(int tagNum5001644695) {
		 putNumber(beginTagNum5001644695,tagNum5001644695,TAG_NUM_5001644695_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localTagNum5001644695Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeTagNum5001644695
	 */
   	protected  int serializeTagNum5001644695(char[] value) {
	    int  tagNum5001644695;
	    if(value.length >0 && value.length!= 4)
            value = new String(value).trim().toCharArray();
	    if (value.length < 4) value = pad(4, value, ' ', LEFT_PAD);
	    else if (value.length > 4) value = substring(value,0,4);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    tagNum5001644695 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(4,value,false/*isSigned?*/)
		       ,beginTagNum5001644695
		       ,4
		      );
		 localTagNum5001644695Counter = shareString.getSerializedField().getModifiedCounter();
		return  tagNum5001644695;
    }

   protected int checkTagNum5001644695MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10K/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshTagNum5001644695 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshTagNum5001644695() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginTagNum5001644695
			                 ,TAG_NUM_5001644695_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("tagNum5001644695", beginTagNum5001644695,TAG_NUM_5001644695_LEN);
    }
   	}
     int localTagSubfldNo5001644695Counter = -1;
     public boolean isTagSubfldNo5001644695Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTagSubfldNo5001644695Counter != sharedCounter;
         localTagSubfldNo5001644695Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of tagSubfldNo5001644695
	 *	@return tagSubfldNo5001644695
	 */
	public char[]  getTagSubfldNo5001644695String() {
	     return getCharArray(beginTagSubfldNo5001644695,TAG_SUBFLD_NO_5001644695_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tagSubfldNo5001644695IsNumeric() {
	    return isNumeric(beginTagSubfldNo5001644695
	                    ,beginTagSubfldNo5001644695 + TAG_SUBFLD_NO_5001644695_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int TAG_SUBFLD_NO_5001644695_LEN = 4;
  	/**
	 * serializeTagSubfldNo5001644695
	 */
	protected void serializeTagSubfldNo5001644695(int tagSubfldNo5001644695) {
		 putNumber(beginTagSubfldNo5001644695,tagSubfldNo5001644695,TAG_SUBFLD_NO_5001644695_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localTagSubfldNo5001644695Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeTagSubfldNo5001644695
	 */
   	protected  int serializeTagSubfldNo5001644695(char[] value) {
	    int  tagSubfldNo5001644695;
	    if(value.length >0 && value.length!= 4)
            value = new String(value).trim().toCharArray();
	    if (value.length < 4) value = pad(4, value, ' ', LEFT_PAD);
	    else if (value.length > 4) value = substring(value,0,4);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    tagSubfldNo5001644695 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(4,value,false/*isSigned?*/)
		       ,beginTagSubfldNo5001644695
		       ,4
		      );
		 localTagSubfldNo5001644695Counter = shareString.getSerializedField().getModifiedCounter();
		return  tagSubfldNo5001644695;
    }

   protected int checkTagSubfldNo5001644695MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10K/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshTagSubfldNo5001644695 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshTagSubfldNo5001644695() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginTagSubfldNo5001644695
			                 ,TAG_SUBFLD_NO_5001644695_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("tagSubfldNo5001644695", beginTagSubfldNo5001644695,TAG_SUBFLD_NO_5001644695_LEN);
    }
   	}
     int localTagOccur5001644695Counter = -1;
     public boolean isTagOccur5001644695Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTagOccur5001644695Counter != sharedCounter;
         localTagOccur5001644695Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of tagOccur5001644695
	 *	@return tagOccur5001644695
	 */
	public char[]  getTagOccur5001644695String() {
	     return getCharArray(beginTagOccur5001644695,TAG_OCCUR_5001644695_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tagOccur5001644695IsNumeric() {
	    return isNumeric(beginTagOccur5001644695
	                    ,beginTagOccur5001644695 + TAG_OCCUR_5001644695_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int TAG_OCCUR_5001644695_LEN = 4;
  	/**
	 * serializeTagOccur5001644695
	 */
	protected void serializeTagOccur5001644695(int tagOccur5001644695) {
		 putNumber(beginTagOccur5001644695,tagOccur5001644695,TAG_OCCUR_5001644695_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localTagOccur5001644695Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeTagOccur5001644695
	 */
   	protected  int serializeTagOccur5001644695(char[] value) {
	    int  tagOccur5001644695;
	    if(value.length >0 && value.length!= 4)
            value = new String(value).trim().toCharArray();
	    if (value.length < 4) value = pad(4, value, ' ', LEFT_PAD);
	    else if (value.length > 4) value = substring(value,0,4);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    tagOccur5001644695 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(4,value,false/*isSigned?*/)
		       ,beginTagOccur5001644695
		       ,4
		      );
		 localTagOccur5001644695Counter = shareString.getSerializedField().getModifiedCounter();
		return  tagOccur5001644695;
    }

   protected int checkTagOccur5001644695MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10K/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshTagOccur5001644695 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshTagOccur5001644695() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginTagOccur5001644695
			                 ,TAG_OCCUR_5001644695_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("tagOccur5001644695", beginTagOccur5001644695,TAG_OCCUR_5001644695_LEN);
    }
   	}




}
  
