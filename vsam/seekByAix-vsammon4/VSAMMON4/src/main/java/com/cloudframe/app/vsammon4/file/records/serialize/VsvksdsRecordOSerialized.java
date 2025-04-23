package com.cloudframe.app.vsammon4.file.records.serialize;

/**
*  The class VsvksdsRecordOSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:23. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;

public class VsvksdsRecordOSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(VsvksdsRecordOSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int VSVKSDS_RECORD_O_LENGTH = 221;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginVskOPrimaryKey;
            protected  int beginVskOSysid;
            protected  int beginVskOTaskNo;
            protected  int beginVskOReqSize;
            protected  int beginVskOVarStruct;
	
	/**
	* Constructor for VsvksdsRecordOSerialized
	**/
    public VsvksdsRecordOSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in VsvksdsRecordOSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(VSVKSDS_RECORD_O_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginVskOPrimaryKey = getStartOffset() + 0;	// set offset for serialization
  
             beginVskOSysid = getStartOffset() + 9;	// set offset for serialization
  
             beginVskOTaskNo = getStartOffset() + 13;	// set offset for serialization
  
             beginVskOReqSize = getStartOffset() + 17;	// set offset for serialization
  
             beginVskOVarStruct = getStartOffset() + 21;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localVskOPrimaryKeyCounter = -1;
     public boolean isVskOPrimaryKeyModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localVskOPrimaryKeyCounter != sharedCounter;
         localVskOPrimaryKeyCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of vskOPrimaryKey
	 *	@return vskOPrimaryKey
	 */
	public char[]  getVskOPrimaryKeyString() {
	     return getCharArray(beginVskOPrimaryKey,VSK_OPRIMARY_KEY_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean vskOPrimaryKeyIsNumeric() {
	    return isNumeric(beginVskOPrimaryKey
	                    ,beginVskOPrimaryKey + VSK_OPRIMARY_KEY_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int VSK_OPRIMARY_KEY_LEN = 9;
  	/**
	 * serializeVskOPrimaryKey
	 */
	protected void serializeVskOPrimaryKey(long vskOPrimaryKey) {
		 putNumber(beginVskOPrimaryKey,vskOPrimaryKey,VSK_OPRIMARY_KEY_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localVskOPrimaryKeyCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeVskOPrimaryKey
	 */
   	protected  long serializeVskOPrimaryKey(char[] value) {
	    long  vskOPrimaryKey;
	    if(value.length >0 && value.length!= 9)
            value = new String(value).trim().toCharArray();
	    if (value.length < 9) value = pad(9, value, ' ', LEFT_PAD);
	    else if (value.length > 9) value = substring(value,0,9);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    vskOPrimaryKey = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(9,value,false/*isSigned?*/)
		       ,beginVskOPrimaryKey
		       ,9
		      );
		 localVskOPrimaryKeyCounter = shareString.getSerializedField().getModifiedCounter();
		return  vskOPrimaryKey;
    }

   protected long checkVskOPrimaryKeyMaxLimit(long number) {

        return checkMaxLimit(number , MAX_1G/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshVskOPrimaryKey is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshVskOPrimaryKey() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginVskOPrimaryKey
			                 ,VSK_OPRIMARY_KEY_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("vskOPrimaryKey", beginVskOPrimaryKey,VSK_OPRIMARY_KEY_LEN);
    }
   	}
     int localVskOSysidCounter = -1;
     public boolean isVskOSysidModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localVskOSysidCounter != sharedCounter;
         localVskOSysidCounter = sharedCounter; return hasModified;
     }
	protected static final int VSK_OSYSID_LEN = 4;
	/**
	 * 	serialize this VskOSysid
	 */
   protected void serializeVskOSysid(char[] vskOSysid) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(vskOSysid,0,getStringValue(),beginVskOSysid,VSK_OSYSID_LEN);
       localVskOSysidCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkVskOSysidConstraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshVskOSysid is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshVskOSysid() {	 
   		return (substring(getStringValue(),beginVskOSysid,beginVskOSysid + VSK_OSYSID_LEN));
   	}
        int localVskOTaskNoCounter = -1;
        public boolean isVskOTaskNoModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localVskOTaskNoCounter != sharedCounter;
           localVskOTaskNoCounter = sharedCounter; return hasModified; 
        }
	    public boolean vskOTaskNoIsNumeric() {
	      return decimalIsNumeric(beginVskOTaskNo,VSK_OTASK_NO_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int VSK_OTASK_NO_LEN = 4;
  	/**
	 * 	serializeVskOTaskNo
	 */
	protected void serializeVskOTaskNo(int vskOTaskNo) {
		   putDecimal(beginVskOTaskNo,vskOTaskNo,VSK_OTASK_NO_LEN,true);
   }
   

   protected int checkVskOTaskNoMaxLimit(long number) {
	   return (int)checkMaxLimit(number , MAX_10M /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshVskOTaskNo is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshVskOTaskNo() throws CFException {	
   	try { 
		 return (getIntDecimal(beginVskOTaskNo,VSK_OTASK_NO_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("vskOTaskNo", beginVskOTaskNo,VSK_OTASK_NO_LEN);
     }
   	}
         int localVskOReqSizeCounter = -1;
         public boolean isVskOReqSizeModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localVskOReqSizeCounter != sharedCounter;
            localVskOReqSizeCounter = sharedCounter; return hasModified; 
         }
   protected static final int VSK_OREQ_SIZE_LEN = 4;
  	/**
	 * serializeVskOReqSize
	 */
	protected void serializeVskOReqSize(int vskOReqSize) {
           replaceValue( //  save the value as string
                   getBinaryString( vskOReqSize,VSK_OREQ_SIZE_LEN)
                  ,beginVskOReqSize
                  ,VSK_OREQ_SIZE_LEN
                 );
            localVskOReqSizeCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkVskOReqSizeMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshVskOReqSize is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshVskOReqSize() {	 
			return (getInt(beginVskOReqSize));
   	}
     int localVskOVarStructCounter = -1;
     public boolean isVskOVarStructModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localVskOVarStructCounter != sharedCounter;
         localVskOVarStructCounter = sharedCounter; return hasModified;
     }
	protected static final int VSK_OVAR_STRUCT_LEN = 200;
	/**
	 * 	serialize this VskOVarStruct
	 */
   protected void serializeVskOVarStruct(char[] vskOVarStruct) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(vskOVarStruct,0,getStringValue(),beginVskOVarStruct,VSK_OVAR_STRUCT_LEN);
       localVskOVarStructCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkVskOVarStructConstraints(char[] value) {
   			return super.checkConstraints(value , 200 ,false, false);
   }
    /**
	 *	refreshVskOVarStruct is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshVskOVarStruct() {	 
   		return (substring(getStringValue(),beginVskOVarStruct,beginVskOVarStruct + VSK_OVAR_STRUCT_LEN));
   	}




}
  
