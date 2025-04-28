package com.cloudframe.app.ip313010.dto.serialize;

/**
*  The class Ip002103TableDataSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:04. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip002103TableDataSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip002103TableDataSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_002103_TABLE_DATA_LENGTH = 15;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp002103OldElementType;
            protected  int beginIp002103OldElementNo;
            protected  int beginIp002103OldSubfldNo;
            protected  int beginIp002103NewElementType;
            protected  int beginIp002103NewElementNo;
            protected  int beginIp002103NewSubfldNo;
            protected  int beginIp002103Justified;
	
	/**
	* Constructor for Ip002103TableDataSerialized
	**/
    public Ip002103TableDataSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in Ip002103TableDataSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_002103_TABLE_DATA_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp002103OldElementType = getStartOffset() + 0;	// set offset for serialization
  
             beginIp002103OldElementNo = getStartOffset() + 1;	// set offset for serialization
  
             beginIp002103OldSubfldNo = getStartOffset() + 5;	// set offset for serialization
  
             beginIp002103NewElementType = getStartOffset() + 7;	// set offset for serialization
  
             beginIp002103NewElementNo = getStartOffset() + 8;	// set offset for serialization
  
             beginIp002103NewSubfldNo = getStartOffset() + 12;	// set offset for serialization
  
             beginIp002103Justified = getStartOffset() + 14;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localIp002103OldElementTypeCounter = -1;
     public boolean isIp002103OldElementTypeModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp002103OldElementTypeCounter != sharedCounter;
         localIp002103OldElementTypeCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ip002103OldElementType
	 *	@return ip002103OldElementType
	 */
	public char[]  getIp002103OldElementTypeString() {
	     return getCharArray(beginIp002103OldElementType,IP_002103_OLD_ELEMENT_TYPE_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip002103OldElementTypeIsNumeric() {
	    return isNumeric(beginIp002103OldElementType
	                    ,beginIp002103OldElementType + IP_002103_OLD_ELEMENT_TYPE_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int IP_002103_OLD_ELEMENT_TYPE_LEN = 1;
  	/**
	 * serializeIp002103OldElementType
	 */
	protected void serializeIp002103OldElementType(int ip002103OldElementType) {
		 putNumber(beginIp002103OldElementType,ip002103OldElementType,IP_002103_OLD_ELEMENT_TYPE_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localIp002103OldElementTypeCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeIp002103OldElementType
	 */
   	protected  int serializeIp002103OldElementType(char[] value) {
	    int  ip002103OldElementType;
	    if(value.length >0 && value.length!= 1)
            value = new String(value).trim().toCharArray();
	    if (value.length < 1) value = pad(1, value, ' ', LEFT_PAD);
	    else if (value.length > 1) value = substring(value,0,1);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ip002103OldElementType = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(1,value,false/*isSigned?*/)
		       ,beginIp002103OldElementType
		       ,1
		      );
		 localIp002103OldElementTypeCounter = shareString.getSerializedField().getModifiedCounter();
		return  ip002103OldElementType;
    }

   protected int checkIp002103OldElementTypeMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshIp002103OldElementType is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshIp002103OldElementType() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginIp002103OldElementType
			                 ,IP_002103_OLD_ELEMENT_TYPE_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ip002103OldElementType", beginIp002103OldElementType,IP_002103_OLD_ELEMENT_TYPE_LEN);
    }
   	}
     int localIp002103OldElementNoCounter = -1;
     public boolean isIp002103OldElementNoModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp002103OldElementNoCounter != sharedCounter;
         localIp002103OldElementNoCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ip002103OldElementNo
	 *	@return ip002103OldElementNo
	 */
	public char[]  getIp002103OldElementNoString() {
	     return getCharArray(beginIp002103OldElementNo,IP_002103_OLD_ELEMENT_NO_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip002103OldElementNoIsNumeric() {
	    return isNumeric(beginIp002103OldElementNo
	                    ,beginIp002103OldElementNo + IP_002103_OLD_ELEMENT_NO_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int IP_002103_OLD_ELEMENT_NO_LEN = 4;
  	/**
	 * serializeIp002103OldElementNo
	 */
	protected void serializeIp002103OldElementNo(int ip002103OldElementNo) {
		 putNumber(beginIp002103OldElementNo,ip002103OldElementNo,IP_002103_OLD_ELEMENT_NO_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localIp002103OldElementNoCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeIp002103OldElementNo
	 */
   	protected  int serializeIp002103OldElementNo(char[] value) {
	    int  ip002103OldElementNo;
	    if(value.length >0 && value.length!= 4)
            value = new String(value).trim().toCharArray();
	    if (value.length < 4) value = pad(4, value, ' ', LEFT_PAD);
	    else if (value.length > 4) value = substring(value,0,4);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ip002103OldElementNo = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(4,value,false/*isSigned?*/)
		       ,beginIp002103OldElementNo
		       ,4
		      );
		 localIp002103OldElementNoCounter = shareString.getSerializedField().getModifiedCounter();
		return  ip002103OldElementNo;
    }

   protected int checkIp002103OldElementNoMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10K/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshIp002103OldElementNo is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshIp002103OldElementNo() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginIp002103OldElementNo
			                 ,IP_002103_OLD_ELEMENT_NO_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ip002103OldElementNo", beginIp002103OldElementNo,IP_002103_OLD_ELEMENT_NO_LEN);
    }
   	}
     int localIp002103OldSubfldNoCounter = -1;
     public boolean isIp002103OldSubfldNoModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp002103OldSubfldNoCounter != sharedCounter;
         localIp002103OldSubfldNoCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ip002103OldSubfldNo
	 *	@return ip002103OldSubfldNo
	 */
	public char[]  getIp002103OldSubfldNoString() {
	     return getCharArray(beginIp002103OldSubfldNo,IP_002103_OLD_SUBFLD_NO_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip002103OldSubfldNoIsNumeric() {
	    return isNumeric(beginIp002103OldSubfldNo
	                    ,beginIp002103OldSubfldNo + IP_002103_OLD_SUBFLD_NO_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int IP_002103_OLD_SUBFLD_NO_LEN = 2;
  	/**
	 * serializeIp002103OldSubfldNo
	 */
	protected void serializeIp002103OldSubfldNo(int ip002103OldSubfldNo) {
		 putNumber(beginIp002103OldSubfldNo,ip002103OldSubfldNo,IP_002103_OLD_SUBFLD_NO_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localIp002103OldSubfldNoCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeIp002103OldSubfldNo
	 */
   	protected  int serializeIp002103OldSubfldNo(char[] value) {
	    int  ip002103OldSubfldNo;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ip002103OldSubfldNo = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginIp002103OldSubfldNo
		       ,2
		      );
		 localIp002103OldSubfldNoCounter = shareString.getSerializedField().getModifiedCounter();
		return  ip002103OldSubfldNo;
    }

   protected int checkIp002103OldSubfldNoMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshIp002103OldSubfldNo is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshIp002103OldSubfldNo() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginIp002103OldSubfldNo
			                 ,IP_002103_OLD_SUBFLD_NO_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ip002103OldSubfldNo", beginIp002103OldSubfldNo,IP_002103_OLD_SUBFLD_NO_LEN);
    }
   	}
     int localIp002103NewElementTypeCounter = -1;
     public boolean isIp002103NewElementTypeModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp002103NewElementTypeCounter != sharedCounter;
         localIp002103NewElementTypeCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ip002103NewElementType
	 *	@return ip002103NewElementType
	 */
	public char[]  getIp002103NewElementTypeString() {
	     return getCharArray(beginIp002103NewElementType,IP_002103_NEW_ELEMENT_TYPE_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip002103NewElementTypeIsNumeric() {
	    return isNumeric(beginIp002103NewElementType
	                    ,beginIp002103NewElementType + IP_002103_NEW_ELEMENT_TYPE_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int IP_002103_NEW_ELEMENT_TYPE_LEN = 1;
  	/**
	 * serializeIp002103NewElementType
	 */
	protected void serializeIp002103NewElementType(int ip002103NewElementType) {
		 putNumber(beginIp002103NewElementType,ip002103NewElementType,IP_002103_NEW_ELEMENT_TYPE_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localIp002103NewElementTypeCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeIp002103NewElementType
	 */
   	protected  int serializeIp002103NewElementType(char[] value) {
	    int  ip002103NewElementType;
	    if(value.length >0 && value.length!= 1)
            value = new String(value).trim().toCharArray();
	    if (value.length < 1) value = pad(1, value, ' ', LEFT_PAD);
	    else if (value.length > 1) value = substring(value,0,1);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ip002103NewElementType = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(1,value,false/*isSigned?*/)
		       ,beginIp002103NewElementType
		       ,1
		      );
		 localIp002103NewElementTypeCounter = shareString.getSerializedField().getModifiedCounter();
		return  ip002103NewElementType;
    }

   protected int checkIp002103NewElementTypeMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshIp002103NewElementType is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshIp002103NewElementType() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginIp002103NewElementType
			                 ,IP_002103_NEW_ELEMENT_TYPE_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ip002103NewElementType", beginIp002103NewElementType,IP_002103_NEW_ELEMENT_TYPE_LEN);
    }
   	}
     int localIp002103NewElementNoCounter = -1;
     public boolean isIp002103NewElementNoModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp002103NewElementNoCounter != sharedCounter;
         localIp002103NewElementNoCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ip002103NewElementNo
	 *	@return ip002103NewElementNo
	 */
	public char[]  getIp002103NewElementNoString() {
	     return getCharArray(beginIp002103NewElementNo,IP_002103_NEW_ELEMENT_NO_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip002103NewElementNoIsNumeric() {
	    return isNumeric(beginIp002103NewElementNo
	                    ,beginIp002103NewElementNo + IP_002103_NEW_ELEMENT_NO_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int IP_002103_NEW_ELEMENT_NO_LEN = 4;
  	/**
	 * serializeIp002103NewElementNo
	 */
	protected void serializeIp002103NewElementNo(int ip002103NewElementNo) {
		 putNumber(beginIp002103NewElementNo,ip002103NewElementNo,IP_002103_NEW_ELEMENT_NO_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localIp002103NewElementNoCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeIp002103NewElementNo
	 */
   	protected  int serializeIp002103NewElementNo(char[] value) {
	    int  ip002103NewElementNo;
	    if(value.length >0 && value.length!= 4)
            value = new String(value).trim().toCharArray();
	    if (value.length < 4) value = pad(4, value, ' ', LEFT_PAD);
	    else if (value.length > 4) value = substring(value,0,4);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ip002103NewElementNo = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(4,value,false/*isSigned?*/)
		       ,beginIp002103NewElementNo
		       ,4
		      );
		 localIp002103NewElementNoCounter = shareString.getSerializedField().getModifiedCounter();
		return  ip002103NewElementNo;
    }

   protected int checkIp002103NewElementNoMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10K/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshIp002103NewElementNo is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshIp002103NewElementNo() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginIp002103NewElementNo
			                 ,IP_002103_NEW_ELEMENT_NO_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ip002103NewElementNo", beginIp002103NewElementNo,IP_002103_NEW_ELEMENT_NO_LEN);
    }
   	}
     int localIp002103NewSubfldNoCounter = -1;
     public boolean isIp002103NewSubfldNoModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp002103NewSubfldNoCounter != sharedCounter;
         localIp002103NewSubfldNoCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ip002103NewSubfldNo
	 *	@return ip002103NewSubfldNo
	 */
	public char[]  getIp002103NewSubfldNoString() {
	     return getCharArray(beginIp002103NewSubfldNo,IP_002103_NEW_SUBFLD_NO_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip002103NewSubfldNoIsNumeric() {
	    return isNumeric(beginIp002103NewSubfldNo
	                    ,beginIp002103NewSubfldNo + IP_002103_NEW_SUBFLD_NO_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int IP_002103_NEW_SUBFLD_NO_LEN = 2;
  	/**
	 * serializeIp002103NewSubfldNo
	 */
	protected void serializeIp002103NewSubfldNo(int ip002103NewSubfldNo) {
		 putNumber(beginIp002103NewSubfldNo,ip002103NewSubfldNo,IP_002103_NEW_SUBFLD_NO_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localIp002103NewSubfldNoCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeIp002103NewSubfldNo
	 */
   	protected  int serializeIp002103NewSubfldNo(char[] value) {
	    int  ip002103NewSubfldNo;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ip002103NewSubfldNo = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginIp002103NewSubfldNo
		       ,2
		      );
		 localIp002103NewSubfldNoCounter = shareString.getSerializedField().getModifiedCounter();
		return  ip002103NewSubfldNo;
    }

   protected int checkIp002103NewSubfldNoMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshIp002103NewSubfldNo is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshIp002103NewSubfldNo() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginIp002103NewSubfldNo
			                 ,IP_002103_NEW_SUBFLD_NO_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ip002103NewSubfldNo", beginIp002103NewSubfldNo,IP_002103_NEW_SUBFLD_NO_LEN);
    }
   	}
     int localIp002103JustifiedCounter = -1;
     public boolean isIp002103JustifiedModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp002103JustifiedCounter != sharedCounter;
         localIp002103JustifiedCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_002103_JUSTIFIED_LEN = 1;
	/**
	 * 	serialize this Ip002103Justified
	 */
   protected void serializeIp002103Justified(char[] ip002103Justified) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip002103Justified,0,getStringValue(),beginIp002103Justified,IP_002103_JUSTIFIED_LEN);
       localIp002103JustifiedCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp002103JustifiedConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp002103Justified is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp002103Justified() {	 
   		return (substring(getStringValue(),beginIp002103Justified,beginIp002103Justified + IP_002103_JUSTIFIED_LEN));
   	}




}
  
