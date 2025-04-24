package com.cloudframe.app.ar640010.dto.serialize;

/**
*  The class FileDcbSpecMsg602Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:49. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class FileDcbSpecMsg602Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(FileDcbSpecMsg602Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int FILE_DCB_SPEC_MSG_602_LENGTH = 67;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginFileRecfm602;
            protected  int beginFileLrecl602;
            protected  int beginFileBlksz602;
	
	/**
	* Constructor for FileDcbSpecMsg602Serialized
	**/
    public FileDcbSpecMsg602Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in FileDcbSpecMsg602Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(FILE_DCB_SPEC_MSG_602_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
             beginFileRecfm602 = getStartOffset() + 26;	// set offset for serialization
  
  
             beginFileLrecl602 = getStartOffset() + 38;	// set offset for serialization
  
  
             beginFileBlksz602 = getStartOffset() + 58;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localFileRecfm602Counter = -1;
     public boolean isFileRecfm602Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFileRecfm602Counter != sharedCounter;
         localFileRecfm602Counter = sharedCounter; return hasModified;
     }
	protected static final int FILE_RECFM_602_LEN = 3;
	/**
	 * 	serialize this FileRecfm602
	 */
   protected void serializeFileRecfm602(char[] fileRecfm602) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(fileRecfm602,0,getStringValue(),beginFileRecfm602,FILE_RECFM_602_LEN);
       localFileRecfm602Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkFileRecfm602Constraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshFileRecfm602 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshFileRecfm602() {	 
   		return (substring(getStringValue(),beginFileRecfm602,beginFileRecfm602 + FILE_RECFM_602_LEN));
   	}
     int localFileLrecl602Counter = -1;
     public boolean isFileLrecl602Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFileLrecl602Counter != sharedCounter;
         localFileLrecl602Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of fileLrecl602
	 *	@return fileLrecl602
	 */
	public char[]  getFileLrecl602String() {
	     return getCharArray(beginFileLrecl602,FILE_LRECL_602_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean fileLrecl602IsNumeric() {
	    return isNumeric(beginFileLrecl602
	                    ,beginFileLrecl602 + FILE_LRECL_602_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int FILE_LRECL_602_LEN = 9;
  	/**
	 * serializeFileLrecl602
	 */
	protected void serializeFileLrecl602(long fileLrecl602) {
		 putNumber(beginFileLrecl602,fileLrecl602,FILE_LRECL_602_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localFileLrecl602Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeFileLrecl602
	 */
   	protected  long serializeFileLrecl602(char[] value) {
	    long  fileLrecl602;
	    if(value.length >0 && value.length!= 9)
            value = new String(value).trim().toCharArray();
	    if (value.length < 9) value = pad(9, value, ' ', LEFT_PAD);
	    else if (value.length > 9) value = substring(value,0,9);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    fileLrecl602 = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(9,value,false/*isSigned?*/)
		       ,beginFileLrecl602
		       ,9
		      );
		 localFileLrecl602Counter = shareString.getSerializedField().getModifiedCounter();
		return  fileLrecl602;
    }

   protected long checkFileLrecl602MaxLimit(long number) {

        return checkMaxLimit(number , MAX_1G/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshFileLrecl602 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshFileLrecl602() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginFileLrecl602
			                 ,FILE_LRECL_602_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("fileLrecl602", beginFileLrecl602,FILE_LRECL_602_LEN);
    }
   	}
     int localFileBlksz602Counter = -1;
     public boolean isFileBlksz602Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFileBlksz602Counter != sharedCounter;
         localFileBlksz602Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of fileBlksz602
	 *	@return fileBlksz602
	 */
	public char[]  getFileBlksz602String() {
	     return getCharArray(beginFileBlksz602,FILE_BLKSZ_602_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean fileBlksz602IsNumeric() {
	    return isNumeric(beginFileBlksz602
	                    ,beginFileBlksz602 + FILE_BLKSZ_602_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int FILE_BLKSZ_602_LEN = 9;
  	/**
	 * serializeFileBlksz602
	 */
	protected void serializeFileBlksz602(long fileBlksz602) {
		 putNumber(beginFileBlksz602,fileBlksz602,FILE_BLKSZ_602_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localFileBlksz602Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeFileBlksz602
	 */
   	protected  long serializeFileBlksz602(char[] value) {
	    long  fileBlksz602;
	    if(value.length >0 && value.length!= 9)
            value = new String(value).trim().toCharArray();
	    if (value.length < 9) value = pad(9, value, ' ', LEFT_PAD);
	    else if (value.length > 9) value = substring(value,0,9);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    fileBlksz602 = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(9,value,false/*isSigned?*/)
		       ,beginFileBlksz602
		       ,9
		      );
		 localFileBlksz602Counter = shareString.getSerializedField().getModifiedCounter();
		return  fileBlksz602;
    }

   protected long checkFileBlksz602MaxLimit(long number) {

        return checkMaxLimit(number , MAX_1G/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshFileBlksz602 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshFileBlksz602() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginFileBlksz602
			                 ,FILE_BLKSZ_602_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("fileBlksz602", beginFileBlksz602,FILE_BLKSZ_602_LEN);
    }
   	}




}
  
