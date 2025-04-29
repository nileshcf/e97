package com.cloudframe.app.vsammon4.file.records.serialize;

/**
*  The class VsvksdsRecordIoSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:27. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;

public class VsvksdsRecordIoSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(VsvksdsRecordIoSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int VSVKSDS_RECORD_IO_LENGTH = 221;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginVskIoPrimaryKey;
            protected  int beginVskIoSysid;
            protected  int beginVskIoTaskNo;
            protected  int beginVskIoReqSize;
            protected  int beginVskIoVarStruct;
	
	/**
	* Constructor for VsvksdsRecordIoSerialized
	**/
    public VsvksdsRecordIoSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in VsvksdsRecordIoSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(VSVKSDS_RECORD_IO_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginVskIoPrimaryKey = getStartOffset() + 0;	// set offset for serialization
  
             beginVskIoSysid = getStartOffset() + 9;	// set offset for serialization
  
             beginVskIoTaskNo = getStartOffset() + 13;	// set offset for serialization
  
             beginVskIoReqSize = getStartOffset() + 17;	// set offset for serialization
  
             beginVskIoVarStruct = getStartOffset() + 21;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localVskIoPrimaryKeyCounter = -1;
     public boolean isVskIoPrimaryKeyModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localVskIoPrimaryKeyCounter != sharedCounter;
         localVskIoPrimaryKeyCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of vskIoPrimaryKey
	 *	@return vskIoPrimaryKey
	 */
	public char[]  getVskIoPrimaryKeyString() {
	     return getCharArray(beginVskIoPrimaryKey,VSK_IO_PRIMARY_KEY_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean vskIoPrimaryKeyIsNumeric() {
	    return isNumeric(beginVskIoPrimaryKey
	                    ,beginVskIoPrimaryKey + VSK_IO_PRIMARY_KEY_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int VSK_IO_PRIMARY_KEY_LEN = 9;
  	/**
	 * serializeVskIoPrimaryKey
	 */
	protected void serializeVskIoPrimaryKey(long vskIoPrimaryKey) {
		 putNumber(beginVskIoPrimaryKey,vskIoPrimaryKey,VSK_IO_PRIMARY_KEY_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localVskIoPrimaryKeyCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeVskIoPrimaryKey
	 */
   	protected  long serializeVskIoPrimaryKey(char[] value) {
	    long  vskIoPrimaryKey;
	    if(value.length >0 && value.length!= 9)
            value = new String(value).trim().toCharArray();
	    if (value.length < 9) value = pad(9, value, ' ', LEFT_PAD);
	    else if (value.length > 9) value = substring(value,0,9);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    vskIoPrimaryKey = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(9,value,false/*isSigned?*/)
		       ,beginVskIoPrimaryKey
		       ,9
		      );
		 localVskIoPrimaryKeyCounter = shareString.getSerializedField().getModifiedCounter();
		return  vskIoPrimaryKey;
    }

   protected long checkVskIoPrimaryKeyMaxLimit(long number) {

        return checkMaxLimit(number , MAX_1G/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshVskIoPrimaryKey is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshVskIoPrimaryKey() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginVskIoPrimaryKey
			                 ,VSK_IO_PRIMARY_KEY_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("vskIoPrimaryKey", beginVskIoPrimaryKey,VSK_IO_PRIMARY_KEY_LEN);
    }
   	}
     int localVskIoSysidCounter = -1;
     public boolean isVskIoSysidModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localVskIoSysidCounter != sharedCounter;
         localVskIoSysidCounter = sharedCounter; return hasModified;
     }
	protected static final int VSK_IO_SYSID_LEN = 4;
	/**
	 * 	serialize this VskIoSysid
	 */
   protected void serializeVskIoSysid(char[] vskIoSysid) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(vskIoSysid,0,getStringValue(),beginVskIoSysid,VSK_IO_SYSID_LEN);
       localVskIoSysidCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkVskIoSysidConstraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshVskIoSysid is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshVskIoSysid() {	 
   		return (substring(getStringValue(),beginVskIoSysid,beginVskIoSysid + VSK_IO_SYSID_LEN));
   	}
        int localVskIoTaskNoCounter = -1;
        public boolean isVskIoTaskNoModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localVskIoTaskNoCounter != sharedCounter;
           localVskIoTaskNoCounter = sharedCounter; return hasModified; 
        }
	    public boolean vskIoTaskNoIsNumeric() {
	      return decimalIsNumeric(beginVskIoTaskNo,VSK_IO_TASK_NO_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int VSK_IO_TASK_NO_LEN = 4;
  	/**
	 * 	serializeVskIoTaskNo
	 */
	protected void serializeVskIoTaskNo(int vskIoTaskNo) {
		   putDecimal(beginVskIoTaskNo,vskIoTaskNo,VSK_IO_TASK_NO_LEN,true);
   }
   

   protected int checkVskIoTaskNoMaxLimit(long number) {
	   return (int)checkMaxLimit(number , MAX_10M /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshVskIoTaskNo is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshVskIoTaskNo() throws CFException {	
   	try { 
		 return (getIntDecimal(beginVskIoTaskNo,VSK_IO_TASK_NO_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("vskIoTaskNo", beginVskIoTaskNo,VSK_IO_TASK_NO_LEN);
     }
   	}
         int localVskIoReqSizeCounter = -1;
         public boolean isVskIoReqSizeModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localVskIoReqSizeCounter != sharedCounter;
            localVskIoReqSizeCounter = sharedCounter; return hasModified; 
         }
   protected static final int VSK_IO_REQ_SIZE_LEN = 4;
  	/**
	 * serializeVskIoReqSize
	 */
	protected void serializeVskIoReqSize(int vskIoReqSize) {
           replaceValue( //  save the value as string
                   getBinaryString( vskIoReqSize,VSK_IO_REQ_SIZE_LEN)
                  ,beginVskIoReqSize
                  ,VSK_IO_REQ_SIZE_LEN
                 );
            localVskIoReqSizeCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkVskIoReqSizeMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshVskIoReqSize is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshVskIoReqSize() {	 
			return (getInt(beginVskIoReqSize));
   	}
     int localVskIoVarStructCounter = -1;
     public boolean isVskIoVarStructModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localVskIoVarStructCounter != sharedCounter;
         localVskIoVarStructCounter = sharedCounter; return hasModified;
     }
	protected static final int VSK_IO_VAR_STRUCT_LEN = 200;
	/**
	 * 	serialize this VskIoVarStruct
	 */
   protected void serializeVskIoVarStruct(char[] vskIoVarStruct) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(vskIoVarStruct,0,getStringValue(),beginVskIoVarStruct,VSK_IO_VAR_STRUCT_LEN);
       localVskIoVarStructCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkVskIoVarStructConstraints(char[] value) {
   			return super.checkConstraints(value , 200 ,false, false);
   }
    /**
	 *	refreshVskIoVarStruct is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshVskIoVarStruct() {	 
   		return (substring(getStringValue(),beginVskIoVarStruct,beginVskIoVarStruct + VSK_IO_VAR_STRUCT_LEN));
   	}




}
  
