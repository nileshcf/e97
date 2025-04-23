package com.cloudframe.app.sf311010.dto.serialize;

/**
*  The class De125WorkAreaB891Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:05. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class De125WorkAreaB891Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(De125WorkAreaB891Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int DE_125_WORK_AREA_B_891_LENGTH = 43;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginBytes516891;
            protected  int beginBytes1718891;
            protected  int beginBytes2128891;
            protected  int beginBytes2930891;
            protected  int beginBytes3336891;
            protected  int beginBytes3738891;
            protected  int beginBytes4143891;
	
	/**
	* Constructor for De125WorkAreaB891Serialized
	**/
    public De125WorkAreaB891Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for De125WorkAreaB891Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public De125WorkAreaB891Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this De125WorkAreaB891Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this De125WorkAreaB891Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in De125WorkAreaB891Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(DE_125_WORK_AREA_B_891_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginBytes516891 = getStartOffset() + 4;	// set offset for serialization
  
             beginBytes1718891 = getStartOffset() + 16;	// set offset for serialization
  
             beginBytes2128891 = getStartOffset() + 20;	// set offset for serialization
  
             beginBytes2930891 = getStartOffset() + 28;	// set offset for serialization
  
             beginBytes3336891 = getStartOffset() + 32;	// set offset for serialization
  
             beginBytes3738891 = getStartOffset() + 36;	// set offset for serialization
  
             beginBytes4143891 = getStartOffset() + 40;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localBytes516891Counter = -1;
     public boolean isBytes516891Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBytes516891Counter != sharedCounter;
         localBytes516891Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of bytes516891
	 *	@return bytes516891
	 */
	public char[]  getBytes516891String() {
	     return getCharArray(beginBytes516891,BYTES_516891_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean bytes516891IsNumeric() {
	    return isNumeric(beginBytes516891
	                    ,beginBytes516891 + BYTES_516891_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int BYTES_516891_LEN = 12;
  	/**
	 * serializeBytes516891
	 */
	protected void serializeBytes516891(long bytes516891) {
		 putNumber(beginBytes516891,bytes516891,BYTES_516891_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localBytes516891Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeBytes516891
	 */
   	protected  long serializeBytes516891(char[] value) {
	    long  bytes516891;
	    if(value.length >0 && value.length!= 12)
            value = new String(value).trim().toCharArray();
	    if (value.length < 12) value = pad(12, value, ' ', LEFT_PAD);
	    else if (value.length > 12) value = substring(value,0,12);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    bytes516891 = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(12,value,false/*isSigned?*/)
		       ,beginBytes516891
		       ,12
		      );
		 localBytes516891Counter = shareString.getSerializedField().getModifiedCounter();
		return  bytes516891;
    }

   protected long checkBytes516891MaxLimit(long number) {

        return checkMaxLimit(number , MAX_1T/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshBytes516891 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshBytes516891() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginBytes516891
			                 ,BYTES_516891_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("bytes516891", beginBytes516891,BYTES_516891_LEN);
    }
   	}
     int localBytes1718891Counter = -1;
     public boolean isBytes1718891Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBytes1718891Counter != sharedCounter;
         localBytes1718891Counter = sharedCounter; return hasModified;
     }
	protected static final int BYTES_1718891_LEN = 2;
	/**
	 * 	serialize this Bytes1718891
	 */
   protected void serializeBytes1718891(char[] bytes1718891) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bytes1718891,0,getStringValue(),beginBytes1718891,BYTES_1718891_LEN);
       localBytes1718891Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBytes1718891Constraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshBytes1718891 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBytes1718891() {	 
   		return (substring(getStringValue(),beginBytes1718891,beginBytes1718891 + BYTES_1718891_LEN));
   	}
     int localBytes2128891Counter = -1;
     public boolean isBytes2128891Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBytes2128891Counter != sharedCounter;
         localBytes2128891Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of bytes2128891
	 *	@return bytes2128891
	 */
	public char[]  getBytes2128891String() {
	     return getCharArray(beginBytes2128891,BYTES_2128891_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean bytes2128891IsNumeric() {
	    return isNumeric(beginBytes2128891
	                    ,beginBytes2128891 + BYTES_2128891_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int BYTES_2128891_LEN = 8;
  	/**
	 * serializeBytes2128891
	 */
	protected void serializeBytes2128891(long bytes2128891) {
		 putNumber(beginBytes2128891,bytes2128891,BYTES_2128891_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localBytes2128891Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeBytes2128891
	 */
   	protected  long serializeBytes2128891(char[] value) {
	    long  bytes2128891;
	    if(value.length >0 && value.length!= 8)
            value = new String(value).trim().toCharArray();
	    if (value.length < 8) value = pad(8, value, ' ', LEFT_PAD);
	    else if (value.length > 8) value = substring(value,0,8);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    bytes2128891 = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(8,value,false/*isSigned?*/)
		       ,beginBytes2128891
		       ,8
		      );
		 localBytes2128891Counter = shareString.getSerializedField().getModifiedCounter();
		return  bytes2128891;
    }

   protected long checkBytes2128891MaxLimit(long number) {

        return checkMaxLimit(number , MAX_100M/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshBytes2128891 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshBytes2128891() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginBytes2128891
			                 ,BYTES_2128891_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("bytes2128891", beginBytes2128891,BYTES_2128891_LEN);
    }
   	}
     int localBytes2930891Counter = -1;
     public boolean isBytes2930891Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBytes2930891Counter != sharedCounter;
         localBytes2930891Counter = sharedCounter; return hasModified;
     }
	protected static final int BYTES_2930891_LEN = 2;
	/**
	 * 	serialize this Bytes2930891
	 */
   protected void serializeBytes2930891(char[] bytes2930891) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bytes2930891,0,getStringValue(),beginBytes2930891,BYTES_2930891_LEN);
       localBytes2930891Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBytes2930891Constraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshBytes2930891 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBytes2930891() {	 
   		return (substring(getStringValue(),beginBytes2930891,beginBytes2930891 + BYTES_2930891_LEN));
   	}
     int localBytes3336891Counter = -1;
     public boolean isBytes3336891Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBytes3336891Counter != sharedCounter;
         localBytes3336891Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of bytes3336891
	 *	@return bytes3336891
	 */
	public char[]  getBytes3336891String() {
	     return getCharArray(beginBytes3336891,BYTES_3336891_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean bytes3336891IsNumeric() {
	    return isNumeric(beginBytes3336891
	                    ,beginBytes3336891 + BYTES_3336891_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int BYTES_3336891_LEN = 4;
  	/**
	 * serializeBytes3336891
	 */
	protected void serializeBytes3336891(int bytes3336891) {
		 putNumber(beginBytes3336891,bytes3336891,BYTES_3336891_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localBytes3336891Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeBytes3336891
	 */
   	protected  int serializeBytes3336891(char[] value) {
	    int  bytes3336891;
	    if(value.length >0 && value.length!= 4)
            value = new String(value).trim().toCharArray();
	    if (value.length < 4) value = pad(4, value, ' ', LEFT_PAD);
	    else if (value.length > 4) value = substring(value,0,4);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    bytes3336891 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(4,value,false/*isSigned?*/)
		       ,beginBytes3336891
		       ,4
		      );
		 localBytes3336891Counter = shareString.getSerializedField().getModifiedCounter();
		return  bytes3336891;
    }

   protected int checkBytes3336891MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10K/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshBytes3336891 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshBytes3336891() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginBytes3336891
			                 ,BYTES_3336891_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("bytes3336891", beginBytes3336891,BYTES_3336891_LEN);
    }
   	}
     int localBytes3738891Counter = -1;
     public boolean isBytes3738891Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBytes3738891Counter != sharedCounter;
         localBytes3738891Counter = sharedCounter; return hasModified;
     }
	protected static final int BYTES_3738891_LEN = 2;
	/**
	 * 	serialize this Bytes3738891
	 */
   protected void serializeBytes3738891(char[] bytes3738891) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bytes3738891,0,getStringValue(),beginBytes3738891,BYTES_3738891_LEN);
       localBytes3738891Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBytes3738891Constraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshBytes3738891 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBytes3738891() {	 
   		return (substring(getStringValue(),beginBytes3738891,beginBytes3738891 + BYTES_3738891_LEN));
   	}
     int localBytes4143891Counter = -1;
     public boolean isBytes4143891Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBytes4143891Counter != sharedCounter;
         localBytes4143891Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of bytes4143891
	 *	@return bytes4143891
	 */
	public char[]  getBytes4143891String() {
	     return getCharArray(beginBytes4143891,BYTES_4143891_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean bytes4143891IsNumeric() {
	    return isNumeric(beginBytes4143891
	                    ,beginBytes4143891 + BYTES_4143891_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int BYTES_4143891_LEN = 3;
  	/**
	 * serializeBytes4143891
	 */
	protected void serializeBytes4143891(int bytes4143891) {
		 putNumber(beginBytes4143891,bytes4143891,BYTES_4143891_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localBytes4143891Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeBytes4143891
	 */
   	protected  int serializeBytes4143891(char[] value) {
	    int  bytes4143891;
	    if(value.length >0 && value.length!= 3)
            value = new String(value).trim().toCharArray();
	    if (value.length < 3) value = pad(3, value, ' ', LEFT_PAD);
	    else if (value.length > 3) value = substring(value,0,3);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    bytes4143891 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(3,value,false/*isSigned?*/)
		       ,beginBytes4143891
		       ,3
		      );
		 localBytes4143891Counter = shareString.getSerializedField().getModifiedCounter();
		return  bytes4143891;
    }

   protected int checkBytes4143891MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_1000/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshBytes4143891 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshBytes4143891() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginBytes4143891
			                 ,BYTES_4143891_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("bytes4143891", beginBytes4143891,BYTES_4143891_LEN);
    }
   	}




}
  
