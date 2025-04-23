package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip38201DcbInfoSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:06. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip38201DcbInfoSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip38201DcbInfoSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_38201_DCB_INFO_LENGTH = 39;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp38201Recfm;
            protected  int beginIp38201Lrecl;
            protected  int beginIp38201Blksize;
            protected  int beginIp38201Bufno;
            protected  int beginIp38201AverageLrecl;
            protected  int beginIp38201RecordCount;
            protected  int beginIp38201BlockLength;
	
	/**
	* Constructor for Ip38201DcbInfoSerialized
	**/
    public Ip38201DcbInfoSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ip38201DcbInfoSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip38201DcbInfoSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ip38201DcbInfoSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,79); // serialize this field at offset 79 by default 
    }
    
	/**
	* sets parent for this Ip38201DcbInfoSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 79 by default
    }    
	/**
	* initializes the field in Ip38201DcbInfoSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_38201_DCB_INFO_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp38201Recfm = getStartOffset() + 0;	// set offset for serialization
  
             beginIp38201Lrecl = getStartOffset() + 3;	// set offset for serialization
  
             beginIp38201Blksize = getStartOffset() + 8;	// set offset for serialization
  
             beginIp38201Bufno = getStartOffset() + 13;	// set offset for serialization
  
             beginIp38201AverageLrecl = getStartOffset() + 18;	// set offset for serialization
  
             beginIp38201RecordCount = getStartOffset() + 23;	// set offset for serialization
  
             beginIp38201BlockLength = getStartOffset() + 32;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localIp38201RecfmCounter = -1;
     public boolean isIp38201RecfmModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp38201RecfmCounter != sharedCounter;
         localIp38201RecfmCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_38201_RECFM_LEN = 3;
	/**
	 * 	serialize this Ip38201Recfm
	 */
   protected void serializeIp38201Recfm(char[] ip38201Recfm) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip38201Recfm,0,getStringValue(),beginIp38201Recfm,IP_38201_RECFM_LEN);
       localIp38201RecfmCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp38201RecfmConstraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshIp38201Recfm is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp38201Recfm() {	 
   		return (substring(getStringValue(),beginIp38201Recfm,beginIp38201Recfm + IP_38201_RECFM_LEN));
   	}
     int localIp38201LreclCounter = -1;
     public boolean isIp38201LreclModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp38201LreclCounter != sharedCounter;
         localIp38201LreclCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ip38201Lrecl
	 *	@return ip38201Lrecl
	 */
	public char[]  getIp38201LreclString() {
	     return getCharArray(beginIp38201Lrecl,IP_38201_LRECL_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip38201LreclIsNumeric() {
	    return isNumeric(beginIp38201Lrecl
	                    ,beginIp38201Lrecl + IP_38201_LRECL_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int IP_38201_LRECL_LEN = 5;
  	/**
	 * serializeIp38201Lrecl
	 */
	protected void serializeIp38201Lrecl(long ip38201Lrecl) {
		 putNumber(beginIp38201Lrecl,ip38201Lrecl,IP_38201_LRECL_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localIp38201LreclCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeIp38201Lrecl
	 */
   	protected  long serializeIp38201Lrecl(char[] value) {
	    long  ip38201Lrecl;
	    if(value.length >0 && value.length!= 5)
            value = new String(value).trim().toCharArray();
	    if (value.length < 5) value = pad(5, value, ' ', LEFT_PAD);
	    else if (value.length > 5) value = substring(value,0,5);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ip38201Lrecl = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(5,value,false/*isSigned?*/)
		       ,beginIp38201Lrecl
		       ,5
		      );
		 localIp38201LreclCounter = shareString.getSerializedField().getModifiedCounter();
		return  ip38201Lrecl;
    }

   protected long checkIp38201LreclMaxLimit(long number) {

        return checkMaxLimit(number , MAX_100K/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshIp38201Lrecl is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshIp38201Lrecl() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginIp38201Lrecl
			                 ,IP_38201_LRECL_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ip38201Lrecl", beginIp38201Lrecl,IP_38201_LRECL_LEN);
    }
   	}
     int localIp38201BlksizeCounter = -1;
     public boolean isIp38201BlksizeModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp38201BlksizeCounter != sharedCounter;
         localIp38201BlksizeCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ip38201Blksize
	 *	@return ip38201Blksize
	 */
	public char[]  getIp38201BlksizeString() {
	     return getCharArray(beginIp38201Blksize,IP_38201_BLKSIZE_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip38201BlksizeIsNumeric() {
	    return isNumeric(beginIp38201Blksize
	                    ,beginIp38201Blksize + IP_38201_BLKSIZE_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int IP_38201_BLKSIZE_LEN = 5;
  	/**
	 * serializeIp38201Blksize
	 */
	protected void serializeIp38201Blksize(long ip38201Blksize) {
		 putNumber(beginIp38201Blksize,ip38201Blksize,IP_38201_BLKSIZE_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localIp38201BlksizeCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeIp38201Blksize
	 */
   	protected  long serializeIp38201Blksize(char[] value) {
	    long  ip38201Blksize;
	    if(value.length >0 && value.length!= 5)
            value = new String(value).trim().toCharArray();
	    if (value.length < 5) value = pad(5, value, ' ', LEFT_PAD);
	    else if (value.length > 5) value = substring(value,0,5);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ip38201Blksize = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(5,value,false/*isSigned?*/)
		       ,beginIp38201Blksize
		       ,5
		      );
		 localIp38201BlksizeCounter = shareString.getSerializedField().getModifiedCounter();
		return  ip38201Blksize;
    }

   protected long checkIp38201BlksizeMaxLimit(long number) {

        return checkMaxLimit(number , MAX_100K/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshIp38201Blksize is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshIp38201Blksize() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginIp38201Blksize
			                 ,IP_38201_BLKSIZE_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ip38201Blksize", beginIp38201Blksize,IP_38201_BLKSIZE_LEN);
    }
   	}
     int localIp38201BufnoCounter = -1;
     public boolean isIp38201BufnoModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp38201BufnoCounter != sharedCounter;
         localIp38201BufnoCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ip38201Bufno
	 *	@return ip38201Bufno
	 */
	public char[]  getIp38201BufnoString() {
	     return getCharArray(beginIp38201Bufno,IP_38201_BUFNO_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip38201BufnoIsNumeric() {
	    return isNumeric(beginIp38201Bufno
	                    ,beginIp38201Bufno + IP_38201_BUFNO_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int IP_38201_BUFNO_LEN = 5;
  	/**
	 * serializeIp38201Bufno
	 */
	protected void serializeIp38201Bufno(long ip38201Bufno) {
		 putNumber(beginIp38201Bufno,ip38201Bufno,IP_38201_BUFNO_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localIp38201BufnoCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeIp38201Bufno
	 */
   	protected  long serializeIp38201Bufno(char[] value) {
	    long  ip38201Bufno;
	    if(value.length >0 && value.length!= 5)
            value = new String(value).trim().toCharArray();
	    if (value.length < 5) value = pad(5, value, ' ', LEFT_PAD);
	    else if (value.length > 5) value = substring(value,0,5);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ip38201Bufno = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(5,value,false/*isSigned?*/)
		       ,beginIp38201Bufno
		       ,5
		      );
		 localIp38201BufnoCounter = shareString.getSerializedField().getModifiedCounter();
		return  ip38201Bufno;
    }

   protected long checkIp38201BufnoMaxLimit(long number) {

        return checkMaxLimit(number , MAX_100K/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshIp38201Bufno is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshIp38201Bufno() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginIp38201Bufno
			                 ,IP_38201_BUFNO_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ip38201Bufno", beginIp38201Bufno,IP_38201_BUFNO_LEN);
    }
   	}
     int localIp38201AverageLreclCounter = -1;
     public boolean isIp38201AverageLreclModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp38201AverageLreclCounter != sharedCounter;
         localIp38201AverageLreclCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ip38201AverageLrecl
	 *	@return ip38201AverageLrecl
	 */
	public char[]  getIp38201AverageLreclString() {
	     return getCharArray(beginIp38201AverageLrecl,IP_38201_AVERAGE_LRECL_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip38201AverageLreclIsNumeric() {
	    return isNumeric(beginIp38201AverageLrecl
	                    ,beginIp38201AverageLrecl + IP_38201_AVERAGE_LRECL_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int IP_38201_AVERAGE_LRECL_LEN = 5;
  	/**
	 * serializeIp38201AverageLrecl
	 */
	protected void serializeIp38201AverageLrecl(long ip38201AverageLrecl) {
		 putNumber(beginIp38201AverageLrecl,ip38201AverageLrecl,IP_38201_AVERAGE_LRECL_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localIp38201AverageLreclCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeIp38201AverageLrecl
	 */
   	protected  long serializeIp38201AverageLrecl(char[] value) {
	    long  ip38201AverageLrecl;
	    if(value.length >0 && value.length!= 5)
            value = new String(value).trim().toCharArray();
	    if (value.length < 5) value = pad(5, value, ' ', LEFT_PAD);
	    else if (value.length > 5) value = substring(value,0,5);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ip38201AverageLrecl = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(5,value,false/*isSigned?*/)
		       ,beginIp38201AverageLrecl
		       ,5
		      );
		 localIp38201AverageLreclCounter = shareString.getSerializedField().getModifiedCounter();
		return  ip38201AverageLrecl;
    }

   protected long checkIp38201AverageLreclMaxLimit(long number) {

        return checkMaxLimit(number , MAX_100K/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshIp38201AverageLrecl is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshIp38201AverageLrecl() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginIp38201AverageLrecl
			                 ,IP_38201_AVERAGE_LRECL_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ip38201AverageLrecl", beginIp38201AverageLrecl,IP_38201_AVERAGE_LRECL_LEN);
    }
   	}
     int localIp38201RecordCountCounter = -1;
     public boolean isIp38201RecordCountModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp38201RecordCountCounter != sharedCounter;
         localIp38201RecordCountCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ip38201RecordCount
	 *	@return ip38201RecordCount
	 */
	public char[]  getIp38201RecordCountString() {
	     return getCharArray(beginIp38201RecordCount,IP_38201_RECORD_COUNT_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip38201RecordCountIsNumeric() {
	    return isNumeric(beginIp38201RecordCount
	                    ,beginIp38201RecordCount + IP_38201_RECORD_COUNT_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int IP_38201_RECORD_COUNT_LEN = 9;
  	/**
	 * serializeIp38201RecordCount
	 */
	protected void serializeIp38201RecordCount(long ip38201RecordCount) {
		 putNumber(beginIp38201RecordCount,ip38201RecordCount,IP_38201_RECORD_COUNT_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localIp38201RecordCountCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeIp38201RecordCount
	 */
   	protected  long serializeIp38201RecordCount(char[] value) {
	    long  ip38201RecordCount;
	    if(value.length >0 && value.length!= 9)
            value = new String(value).trim().toCharArray();
	    if (value.length < 9) value = pad(9, value, ' ', LEFT_PAD);
	    else if (value.length > 9) value = substring(value,0,9);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ip38201RecordCount = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(9,value,false/*isSigned?*/)
		       ,beginIp38201RecordCount
		       ,9
		      );
		 localIp38201RecordCountCounter = shareString.getSerializedField().getModifiedCounter();
		return  ip38201RecordCount;
    }

   protected long checkIp38201RecordCountMaxLimit(long number) {

        return checkMaxLimit(number , MAX_1G/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshIp38201RecordCount is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshIp38201RecordCount() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginIp38201RecordCount
			                 ,IP_38201_RECORD_COUNT_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ip38201RecordCount", beginIp38201RecordCount,IP_38201_RECORD_COUNT_LEN);
    }
   	}
     int localIp38201BlockLengthCounter = -1;
     public boolean isIp38201BlockLengthModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp38201BlockLengthCounter != sharedCounter;
         localIp38201BlockLengthCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ip38201BlockLength
	 *	@return ip38201BlockLength
	 */
	public char[]  getIp38201BlockLengthString() {
	     return getCharArray(beginIp38201BlockLength,IP_38201_BLOCK_LENGTH_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip38201BlockLengthIsNumeric() {
	    return isNumeric(beginIp38201BlockLength
	                    ,beginIp38201BlockLength + IP_38201_BLOCK_LENGTH_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int IP_38201_BLOCK_LENGTH_LEN = 7;
  	/**
	 * serializeIp38201BlockLength
	 */
	protected void serializeIp38201BlockLength(long ip38201BlockLength) {
		 putNumber(beginIp38201BlockLength,ip38201BlockLength,IP_38201_BLOCK_LENGTH_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localIp38201BlockLengthCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeIp38201BlockLength
	 */
   	protected  long serializeIp38201BlockLength(char[] value) {
	    long  ip38201BlockLength;
	    if(value.length >0 && value.length!= 7)
            value = new String(value).trim().toCharArray();
	    if (value.length < 7) value = pad(7, value, ' ', LEFT_PAD);
	    else if (value.length > 7) value = substring(value,0,7);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ip38201BlockLength = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(7,value,false/*isSigned?*/)
		       ,beginIp38201BlockLength
		       ,7
		      );
		 localIp38201BlockLengthCounter = shareString.getSerializedField().getModifiedCounter();
		return  ip38201BlockLength;
    }

   protected long checkIp38201BlockLengthMaxLimit(long number) {

        return checkMaxLimit(number , MAX_10M/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshIp38201BlockLength is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshIp38201BlockLength() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginIp38201BlockLength
			                 ,IP_38201_BLOCK_LENGTH_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ip38201BlockLength", beginIp38201BlockLength,IP_38201_BLOCK_LENGTH_LEN);
    }
   	}




}
  
