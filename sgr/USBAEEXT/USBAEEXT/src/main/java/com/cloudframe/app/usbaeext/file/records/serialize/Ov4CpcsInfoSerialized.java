package com.cloudframe.app.usbaeext.file.records.serialize;

/**
*  The class Ov4CpcsInfoSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 08:04. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ov4CpcsInfoSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ov4CpcsInfoSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int OV_4_CPCS_INFO_LENGTH = 52;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginOv4CycleDate;
            protected  int beginOv4CycleNo;
            protected  int beginOv4EntryNumber;
            protected  int beginOv4TrcrNo;
            protected  int beginOv4BlkNo;
            protected  int beginOv4SeqNo;
	
	/**
	* Constructor for Ov4CpcsInfoSerialized
	**/
    public Ov4CpcsInfoSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ov4CpcsInfoSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ov4CpcsInfoSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ov4CpcsInfoSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,73); // serialize this field at offset 73 by default 
    }
    
	/**
	* sets parent for this Ov4CpcsInfoSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 73 by default
    }    
	/**
	* initializes the field in Ov4CpcsInfoSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(OV_4_CPCS_INFO_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginOv4CycleDate = getStartOffset() + 0;	// set offset for serialization
  
  
             beginOv4CycleNo = getStartOffset() + 6;	// set offset for serialization
  
             beginOv4EntryNumber = getStartOffset() + 8;	// set offset for serialization
  
             beginOv4TrcrNo = getStartOffset() + 12;	// set offset for serialization
  
             beginOv4BlkNo = getStartOffset() + 16;	// set offset for serialization
  
             beginOv4SeqNo = getStartOffset() + 20;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localOv4CycleDateCounter = -1;
     public boolean isOv4CycleDateModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localOv4CycleDateCounter != sharedCounter;
         localOv4CycleDateCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ov4CycleDate
	 *	@return ov4CycleDate
	 */
	public char[]  getOv4CycleDateString() {
	     return getCharArray(beginOv4CycleDate,OV_4_CYCLE_DATE_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ov4CycleDateIsNumeric() {
	    return isNumeric(beginOv4CycleDate
	                    ,beginOv4CycleDate + OV_4_CYCLE_DATE_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int OV_4_CYCLE_DATE_LEN = 6;
  	/**
	 * serializeOv4CycleDate
	 */
	protected void serializeOv4CycleDate(long ov4CycleDate) {
		 putNumber(beginOv4CycleDate,ov4CycleDate,OV_4_CYCLE_DATE_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localOv4CycleDateCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeOv4CycleDate
	 */
   	protected  long serializeOv4CycleDate(char[] value) {
	    long  ov4CycleDate;
	    if(value.length >0 && value.length!= 6)
            value = new String(value).trim().toCharArray();
	    if (value.length < 6) value = pad(6, value, ' ', LEFT_PAD);
	    else if (value.length > 6) value = substring(value,0,6);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ov4CycleDate = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(6,value,false/*isSigned?*/)
		       ,beginOv4CycleDate
		       ,6
		      );
		 localOv4CycleDateCounter = shareString.getSerializedField().getModifiedCounter();
		return  ov4CycleDate;
    }

   protected long checkOv4CycleDateMaxLimit(long number) {

        return checkMaxLimit(number , MAX_1M/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshOv4CycleDate is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshOv4CycleDate() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginOv4CycleDate
			                 ,OV_4_CYCLE_DATE_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ov4CycleDate", beginOv4CycleDate,OV_4_CYCLE_DATE_LEN);
    }
   	}
     int localOv4CycleNoCounter = -1;
     public boolean isOv4CycleNoModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localOv4CycleNoCounter != sharedCounter;
         localOv4CycleNoCounter = sharedCounter; return hasModified;
     }
	protected static final int OV_4_CYCLE_NO_LEN = 2;
	/**
	 * 	serialize this Ov4CycleNo
	 */
   protected void serializeOv4CycleNo(char[] ov4CycleNo) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ov4CycleNo,0,getStringValue(),beginOv4CycleNo,OV_4_CYCLE_NO_LEN);
       localOv4CycleNoCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkOv4CycleNoConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshOv4CycleNo is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshOv4CycleNo() {	 
   		return (substring(getStringValue(),beginOv4CycleNo,beginOv4CycleNo + OV_4_CYCLE_NO_LEN));
   	}
     int localOv4EntryNumberCounter = -1;
     public boolean isOv4EntryNumberModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localOv4EntryNumberCounter != sharedCounter;
         localOv4EntryNumberCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ov4EntryNumber
	 *	@return ov4EntryNumber
	 */
	public char[]  getOv4EntryNumberString() {
	     return getCharArray(beginOv4EntryNumber,OV_4_ENTRY_NUMBER_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ov4EntryNumberIsNumeric() {
	    return isNumeric(beginOv4EntryNumber
	                    ,beginOv4EntryNumber + OV_4_ENTRY_NUMBER_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int OV_4_ENTRY_NUMBER_LEN = 4;
  	/**
	 * serializeOv4EntryNumber
	 */
	protected void serializeOv4EntryNumber(int ov4EntryNumber) {
		 putNumber(beginOv4EntryNumber,ov4EntryNumber,OV_4_ENTRY_NUMBER_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localOv4EntryNumberCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeOv4EntryNumber
	 */
   	protected  int serializeOv4EntryNumber(char[] value) {
	    int  ov4EntryNumber;
	    if(value.length >0 && value.length!= 4)
            value = new String(value).trim().toCharArray();
	    if (value.length < 4) value = pad(4, value, ' ', LEFT_PAD);
	    else if (value.length > 4) value = substring(value,0,4);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ov4EntryNumber = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(4,value,false/*isSigned?*/)
		       ,beginOv4EntryNumber
		       ,4
		      );
		 localOv4EntryNumberCounter = shareString.getSerializedField().getModifiedCounter();
		return  ov4EntryNumber;
    }

   protected int checkOv4EntryNumberMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10K/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshOv4EntryNumber is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshOv4EntryNumber() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginOv4EntryNumber
			                 ,OV_4_ENTRY_NUMBER_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ov4EntryNumber", beginOv4EntryNumber,OV_4_ENTRY_NUMBER_LEN);
    }
   	}
     int localOv4TrcrNoCounter = -1;
     public boolean isOv4TrcrNoModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localOv4TrcrNoCounter != sharedCounter;
         localOv4TrcrNoCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ov4TrcrNo
	 *	@return ov4TrcrNo
	 */
	public char[]  getOv4TrcrNoString() {
	     return getCharArray(beginOv4TrcrNo,OV_4_TRCR_NO_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ov4TrcrNoIsNumeric() {
	    return isNumeric(beginOv4TrcrNo
	                    ,beginOv4TrcrNo + OV_4_TRCR_NO_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int OV_4_TRCR_NO_LEN = 4;
  	/**
	 * serializeOv4TrcrNo
	 */
	protected void serializeOv4TrcrNo(int ov4TrcrNo) {
		 putNumber(beginOv4TrcrNo,ov4TrcrNo,OV_4_TRCR_NO_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localOv4TrcrNoCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeOv4TrcrNo
	 */
   	protected  int serializeOv4TrcrNo(char[] value) {
	    int  ov4TrcrNo;
	    if(value.length >0 && value.length!= 4)
            value = new String(value).trim().toCharArray();
	    if (value.length < 4) value = pad(4, value, ' ', LEFT_PAD);
	    else if (value.length > 4) value = substring(value,0,4);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ov4TrcrNo = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(4,value,false/*isSigned?*/)
		       ,beginOv4TrcrNo
		       ,4
		      );
		 localOv4TrcrNoCounter = shareString.getSerializedField().getModifiedCounter();
		return  ov4TrcrNo;
    }

   protected int checkOv4TrcrNoMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10K/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshOv4TrcrNo is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshOv4TrcrNo() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginOv4TrcrNo
			                 ,OV_4_TRCR_NO_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ov4TrcrNo", beginOv4TrcrNo,OV_4_TRCR_NO_LEN);
    }
   	}
     int localOv4BlkNoCounter = -1;
     public boolean isOv4BlkNoModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localOv4BlkNoCounter != sharedCounter;
         localOv4BlkNoCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ov4BlkNo
	 *	@return ov4BlkNo
	 */
	public char[]  getOv4BlkNoString() {
	     return getCharArray(beginOv4BlkNo,OV_4_BLK_NO_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ov4BlkNoIsNumeric() {
	    return isNumeric(beginOv4BlkNo
	                    ,beginOv4BlkNo + OV_4_BLK_NO_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int OV_4_BLK_NO_LEN = 4;
  	/**
	 * serializeOv4BlkNo
	 */
	protected void serializeOv4BlkNo(int ov4BlkNo) {
		 putNumber(beginOv4BlkNo,ov4BlkNo,OV_4_BLK_NO_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localOv4BlkNoCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeOv4BlkNo
	 */
   	protected  int serializeOv4BlkNo(char[] value) {
	    int  ov4BlkNo;
	    if(value.length >0 && value.length!= 4)
            value = new String(value).trim().toCharArray();
	    if (value.length < 4) value = pad(4, value, ' ', LEFT_PAD);
	    else if (value.length > 4) value = substring(value,0,4);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ov4BlkNo = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(4,value,false/*isSigned?*/)
		       ,beginOv4BlkNo
		       ,4
		      );
		 localOv4BlkNoCounter = shareString.getSerializedField().getModifiedCounter();
		return  ov4BlkNo;
    }

   protected int checkOv4BlkNoMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10K/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshOv4BlkNo is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshOv4BlkNo() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginOv4BlkNo
			                 ,OV_4_BLK_NO_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ov4BlkNo", beginOv4BlkNo,OV_4_BLK_NO_LEN);
    }
   	}
     int localOv4SeqNoCounter = -1;
     public boolean isOv4SeqNoModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localOv4SeqNoCounter != sharedCounter;
         localOv4SeqNoCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ov4SeqNo
	 *	@return ov4SeqNo
	 */
	public char[]  getOv4SeqNoString() {
	     return getCharArray(beginOv4SeqNo,OV_4_SEQ_NO_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ov4SeqNoIsNumeric() {
	    return isNumeric(beginOv4SeqNo
	                    ,beginOv4SeqNo + OV_4_SEQ_NO_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int OV_4_SEQ_NO_LEN = 12;
  	/**
	 * serializeOv4SeqNo
	 */
	protected void serializeOv4SeqNo(long ov4SeqNo) {
		 putNumber(beginOv4SeqNo,ov4SeqNo,OV_4_SEQ_NO_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localOv4SeqNoCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeOv4SeqNo
	 */
   	protected  long serializeOv4SeqNo(char[] value) {
	    long  ov4SeqNo;
	    if(value.length >0 && value.length!= 12)
            value = new String(value).trim().toCharArray();
	    if (value.length < 12) value = pad(12, value, ' ', LEFT_PAD);
	    else if (value.length > 12) value = substring(value,0,12);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ov4SeqNo = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(12,value,false/*isSigned?*/)
		       ,beginOv4SeqNo
		       ,12
		      );
		 localOv4SeqNoCounter = shareString.getSerializedField().getModifiedCounter();
		return  ov4SeqNo;
    }

   protected long checkOv4SeqNoMaxLimit(long number) {

        return checkMaxLimit(number , MAX_1T/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshOv4SeqNo is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshOv4SeqNo() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginOv4SeqNo
			                 ,OV_4_SEQ_NO_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ov4SeqNo", beginOv4SeqNo,OV_4_SEQ_NO_LEN);
    }
   	}




}
  
