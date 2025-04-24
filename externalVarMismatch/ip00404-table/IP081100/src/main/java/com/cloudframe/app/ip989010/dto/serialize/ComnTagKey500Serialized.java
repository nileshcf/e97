package com.cloudframe.app.ip989010.dto.serialize;

/**
*  The class ComnTagKey500Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:40. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class ComnTagKey500Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(ComnTagKey500Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int COMN_TAG_KEY_500_LENGTH = 13;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginComnTagType500;
            protected  int beginComnTagNum500;
            protected  int beginComnTagSubfldNo500;
            protected  int beginComnTagOccur500;
	
	/**
	* Constructor for ComnTagKey500Serialized
	**/
    public ComnTagKey500Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for ComnTagKey500Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public ComnTagKey500Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this ComnTagKey500Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this ComnTagKey500Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in ComnTagKey500Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(COMN_TAG_KEY_500_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginComnTagType500 = getStartOffset() + 0;	// set offset for serialization
  
             beginComnTagNum500 = getStartOffset() + 1;	// set offset for serialization
  
             beginComnTagSubfldNo500 = getStartOffset() + 5;	// set offset for serialization
  
             beginComnTagOccur500 = getStartOffset() + 9;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localComnTagType500Counter = -1;
     public boolean isComnTagType500Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localComnTagType500Counter != sharedCounter;
         localComnTagType500Counter = sharedCounter; return hasModified;
     }
	protected static final int COMN_TAG_TYPE_500_LEN = 1;
	/**
	 * 	serialize this ComnTagType500
	 */
   protected void serializeComnTagType500(char[] comnTagType500) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(comnTagType500,0,getStringValue(),beginComnTagType500,COMN_TAG_TYPE_500_LEN);
       localComnTagType500Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkComnTagType500Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshComnTagType500 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshComnTagType500() {	 
   		return (substring(getStringValue(),beginComnTagType500,beginComnTagType500 + COMN_TAG_TYPE_500_LEN));
   	}
     int localComnTagNum500Counter = -1;
     public boolean isComnTagNum500Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localComnTagNum500Counter != sharedCounter;
         localComnTagNum500Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of comnTagNum500
	 *	@return comnTagNum500
	 */
	public char[]  getComnTagNum500String() {
	     return getCharArray(beginComnTagNum500,COMN_TAG_NUM_500_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean comnTagNum500IsNumeric() {
	    return isNumeric(beginComnTagNum500
	                    ,beginComnTagNum500 + COMN_TAG_NUM_500_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int COMN_TAG_NUM_500_LEN = 4;
  	/**
	 * serializeComnTagNum500
	 */
	protected void serializeComnTagNum500(int comnTagNum500) {
		 putNumber(beginComnTagNum500,comnTagNum500,COMN_TAG_NUM_500_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localComnTagNum500Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeComnTagNum500
	 */
   	protected  int serializeComnTagNum500(char[] value) {
	    int  comnTagNum500;
	    if(value.length >0 && value.length!= 4)
            value = new String(value).trim().toCharArray();
	    if (value.length < 4) value = pad(4, value, ' ', LEFT_PAD);
	    else if (value.length > 4) value = substring(value,0,4);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    comnTagNum500 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(4,value,false/*isSigned?*/)
		       ,beginComnTagNum500
		       ,4
		      );
		 localComnTagNum500Counter = shareString.getSerializedField().getModifiedCounter();
		return  comnTagNum500;
    }

   protected int checkComnTagNum500MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10K/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshComnTagNum500 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshComnTagNum500() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginComnTagNum500
			                 ,COMN_TAG_NUM_500_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("comnTagNum500", beginComnTagNum500,COMN_TAG_NUM_500_LEN);
    }
   	}
     int localComnTagSubfldNo500Counter = -1;
     public boolean isComnTagSubfldNo500Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localComnTagSubfldNo500Counter != sharedCounter;
         localComnTagSubfldNo500Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of comnTagSubfldNo500
	 *	@return comnTagSubfldNo500
	 */
	public char[]  getComnTagSubfldNo500String() {
	     return getCharArray(beginComnTagSubfldNo500,COMN_TAG_SUBFLD_NO_500_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean comnTagSubfldNo500IsNumeric() {
	    return isNumeric(beginComnTagSubfldNo500
	                    ,beginComnTagSubfldNo500 + COMN_TAG_SUBFLD_NO_500_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int COMN_TAG_SUBFLD_NO_500_LEN = 4;
  	/**
	 * serializeComnTagSubfldNo500
	 */
	protected void serializeComnTagSubfldNo500(int comnTagSubfldNo500) {
		 putNumber(beginComnTagSubfldNo500,comnTagSubfldNo500,COMN_TAG_SUBFLD_NO_500_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localComnTagSubfldNo500Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeComnTagSubfldNo500
	 */
   	protected  int serializeComnTagSubfldNo500(char[] value) {
	    int  comnTagSubfldNo500;
	    if(value.length >0 && value.length!= 4)
            value = new String(value).trim().toCharArray();
	    if (value.length < 4) value = pad(4, value, ' ', LEFT_PAD);
	    else if (value.length > 4) value = substring(value,0,4);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    comnTagSubfldNo500 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(4,value,false/*isSigned?*/)
		       ,beginComnTagSubfldNo500
		       ,4
		      );
		 localComnTagSubfldNo500Counter = shareString.getSerializedField().getModifiedCounter();
		return  comnTagSubfldNo500;
    }

   protected int checkComnTagSubfldNo500MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10K/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshComnTagSubfldNo500 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshComnTagSubfldNo500() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginComnTagSubfldNo500
			                 ,COMN_TAG_SUBFLD_NO_500_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("comnTagSubfldNo500", beginComnTagSubfldNo500,COMN_TAG_SUBFLD_NO_500_LEN);
    }
   	}
     int localComnTagOccur500Counter = -1;
     public boolean isComnTagOccur500Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localComnTagOccur500Counter != sharedCounter;
         localComnTagOccur500Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of comnTagOccur500
	 *	@return comnTagOccur500
	 */
	public char[]  getComnTagOccur500String() {
	     return getCharArray(beginComnTagOccur500,COMN_TAG_OCCUR_500_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean comnTagOccur500IsNumeric() {
	    return isNumeric(beginComnTagOccur500
	                    ,beginComnTagOccur500 + COMN_TAG_OCCUR_500_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int COMN_TAG_OCCUR_500_LEN = 4;
  	/**
	 * serializeComnTagOccur500
	 */
	protected void serializeComnTagOccur500(int comnTagOccur500) {
		 putNumber(beginComnTagOccur500,comnTagOccur500,COMN_TAG_OCCUR_500_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localComnTagOccur500Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeComnTagOccur500
	 */
   	protected  int serializeComnTagOccur500(char[] value) {
	    int  comnTagOccur500;
	    if(value.length >0 && value.length!= 4)
            value = new String(value).trim().toCharArray();
	    if (value.length < 4) value = pad(4, value, ' ', LEFT_PAD);
	    else if (value.length > 4) value = substring(value,0,4);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    comnTagOccur500 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(4,value,false/*isSigned?*/)
		       ,beginComnTagOccur500
		       ,4
		      );
		 localComnTagOccur500Counter = shareString.getSerializedField().getModifiedCounter();
		return  comnTagOccur500;
    }

   protected int checkComnTagOccur500MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10K/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshComnTagOccur500 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshComnTagOccur500() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginComnTagOccur500
			                 ,COMN_TAG_OCCUR_500_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("comnTagOccur500", beginComnTagOccur500,COMN_TAG_OCCUR_500_LEN);
    }
   	}




}
  
