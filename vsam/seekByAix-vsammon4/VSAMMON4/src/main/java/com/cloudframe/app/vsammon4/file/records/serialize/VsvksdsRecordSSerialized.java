package com.cloudframe.app.vsammon4.file.records.serialize;

/**
*  The class VsvksdsRecordSSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 10:57. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;

public class VsvksdsRecordSSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(VsvksdsRecordSSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int VSVKSDS_RECORD_S_LENGTH = 221;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginVskSPrimaryKey;
            protected  int beginVskSSysid;
            protected  int beginVskSTaskNo;
            protected  int beginVskSReqSize;
            protected  int beginVskSVarStruct;
	
	/**
	* Constructor for VsvksdsRecordSSerialized
	**/
    public VsvksdsRecordSSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in VsvksdsRecordSSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(VSVKSDS_RECORD_S_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginVskSPrimaryKey = getStartOffset() + 0;	// set offset for serialization
  
             beginVskSSysid = getStartOffset() + 9;	// set offset for serialization
  
             beginVskSTaskNo = getStartOffset() + 13;	// set offset for serialization
  
             beginVskSReqSize = getStartOffset() + 17;	// set offset for serialization
  
             beginVskSVarStruct = getStartOffset() + 21;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localVskSPrimaryKeyCounter = -1;
     public boolean isVskSPrimaryKeyModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localVskSPrimaryKeyCounter != sharedCounter;
         localVskSPrimaryKeyCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of vskSPrimaryKey
	 *	@return vskSPrimaryKey
	 */
	public char[]  getVskSPrimaryKeyString() {
	     return getCharArray(beginVskSPrimaryKey,VSK_SPRIMARY_KEY_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean vskSPrimaryKeyIsNumeric() {
	    return isNumeric(beginVskSPrimaryKey
	                    ,beginVskSPrimaryKey + VSK_SPRIMARY_KEY_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int VSK_SPRIMARY_KEY_LEN = 9;
  	/**
	 * serializeVskSPrimaryKey
	 */
	protected void serializeVskSPrimaryKey(long vskSPrimaryKey) {
		 putNumber(beginVskSPrimaryKey,vskSPrimaryKey,VSK_SPRIMARY_KEY_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localVskSPrimaryKeyCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeVskSPrimaryKey
	 */
   	protected  long serializeVskSPrimaryKey(char[] value) {
	    long  vskSPrimaryKey;
	    if(value.length >0 && value.length!= 9)
            value = new String(value).trim().toCharArray();
	    if (value.length < 9) value = pad(9, value, ' ', LEFT_PAD);
	    else if (value.length > 9) value = substring(value,0,9);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    vskSPrimaryKey = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(9,value,false/*isSigned?*/)
		       ,beginVskSPrimaryKey
		       ,9
		      );
		 localVskSPrimaryKeyCounter = shareString.getSerializedField().getModifiedCounter();
		return  vskSPrimaryKey;
    }

   protected long checkVskSPrimaryKeyMaxLimit(long number) {

        return checkMaxLimit(number , MAX_1G/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshVskSPrimaryKey is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshVskSPrimaryKey() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginVskSPrimaryKey
			                 ,VSK_SPRIMARY_KEY_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("vskSPrimaryKey", beginVskSPrimaryKey,VSK_SPRIMARY_KEY_LEN);
    }
   	}
     int localVskSSysidCounter = -1;
     public boolean isVskSSysidModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localVskSSysidCounter != sharedCounter;
         localVskSSysidCounter = sharedCounter; return hasModified;
     }
	protected static final int VSK_SSYSID_LEN = 4;
	/**
	 * 	serialize this VskSSysid
	 */
   protected void serializeVskSSysid(char[] vskSSysid) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(vskSSysid,0,getStringValue(),beginVskSSysid,VSK_SSYSID_LEN);
       localVskSSysidCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkVskSSysidConstraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshVskSSysid is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshVskSSysid() {	 
   		return (substring(getStringValue(),beginVskSSysid,beginVskSSysid + VSK_SSYSID_LEN));
   	}
        int localVskSTaskNoCounter = -1;
        public boolean isVskSTaskNoModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localVskSTaskNoCounter != sharedCounter;
           localVskSTaskNoCounter = sharedCounter; return hasModified; 
        }
	    public boolean vskSTaskNoIsNumeric() {
	      return decimalIsNumeric(beginVskSTaskNo,VSK_STASK_NO_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int VSK_STASK_NO_LEN = 4;
  	/**
	 * 	serializeVskSTaskNo
	 */
	protected void serializeVskSTaskNo(int vskSTaskNo) {
		   putDecimal(beginVskSTaskNo,vskSTaskNo,VSK_STASK_NO_LEN,true);
   }
   

   protected int checkVskSTaskNoMaxLimit(long number) {
	   return (int)checkMaxLimit(number , MAX_10M /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshVskSTaskNo is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshVskSTaskNo() throws CFException {	
   	try { 
		 return (getIntDecimal(beginVskSTaskNo,VSK_STASK_NO_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("vskSTaskNo", beginVskSTaskNo,VSK_STASK_NO_LEN);
     }
   	}
         int localVskSReqSizeCounter = -1;
         public boolean isVskSReqSizeModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localVskSReqSizeCounter != sharedCounter;
            localVskSReqSizeCounter = sharedCounter; return hasModified; 
         }
   protected static final int VSK_SREQ_SIZE_LEN = 4;
  	/**
	 * serializeVskSReqSize
	 */
	protected void serializeVskSReqSize(int vskSReqSize) {
           replaceValue( //  save the value as string
                   getBinaryString( vskSReqSize,VSK_SREQ_SIZE_LEN)
                  ,beginVskSReqSize
                  ,VSK_SREQ_SIZE_LEN
                 );
            localVskSReqSizeCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkVskSReqSizeMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshVskSReqSize is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshVskSReqSize() {	 
			return (getInt(beginVskSReqSize));
   	}
     int localVskSVarStructCounter = -1;
     public boolean isVskSVarStructModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localVskSVarStructCounter != sharedCounter;
         localVskSVarStructCounter = sharedCounter; return hasModified;
     }
	protected static final int VSK_SVAR_STRUCT_LEN = 200;
	/**
	 * 	serialize this VskSVarStruct
	 */
   protected void serializeVskSVarStruct(char[] vskSVarStruct) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(vskSVarStruct,0,getStringValue(),beginVskSVarStruct,VSK_SVAR_STRUCT_LEN);
       localVskSVarStructCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkVskSVarStructConstraints(char[] value) {
   			return super.checkConstraints(value , 200 ,false, false);
   }
    /**
	 *	refreshVskSVarStruct is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshVskSVarStruct() {	 
   		return (substring(getStringValue(),beginVskSVarStruct,beginVskSVarStruct + VSK_SVAR_STRUCT_LEN));
   	}




}
  
