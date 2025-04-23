package com.cloudframe.app.ip305710.dto.serialize;

/**
*  The class Ip005703TableDataSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:31. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip005703TableDataSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip005703TableDataSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_005703_TABLE_DATA_LENGTH = 48;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp005703Tbl57PcCabGrpPtr;
	
	/**
	* Constructor for Ip005703TableDataSerialized
	**/
    public Ip005703TableDataSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in Ip005703TableDataSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_005703_TABLE_DATA_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp005703Tbl57PcCabGrpPtr = getStartOffset() + 0;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localIp005703Tbl57PcCabGrpPtrCounter = -1;
     public boolean isIp005703Tbl57PcCabGrpPtrModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp005703Tbl57PcCabGrpPtrCounter != sharedCounter;
         localIp005703Tbl57PcCabGrpPtrCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ip005703Tbl57PcCabGrpPtr
	 *	@return ip005703Tbl57PcCabGrpPtr
	 */
	public char[]  getIp005703Tbl57PcCabGrpPtrString() {
	     return getCharArray(beginIp005703Tbl57PcCabGrpPtr,IP_005703_TBL_57_PC_CAB_GRP_PTR_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip005703Tbl57PcCabGrpPtrIsNumeric() {
	    return isNumeric(beginIp005703Tbl57PcCabGrpPtr
	                    ,beginIp005703Tbl57PcCabGrpPtr + IP_005703_TBL_57_PC_CAB_GRP_PTR_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int IP_005703_TBL_57_PC_CAB_GRP_PTR_LEN = 11;
  	/**
	 * serializeIp005703Tbl57PcCabGrpPtr
	 */
	protected void serializeIp005703Tbl57PcCabGrpPtr(long ip005703Tbl57PcCabGrpPtr) {
		 putNumber(beginIp005703Tbl57PcCabGrpPtr,ip005703Tbl57PcCabGrpPtr,IP_005703_TBL_57_PC_CAB_GRP_PTR_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localIp005703Tbl57PcCabGrpPtrCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeIp005703Tbl57PcCabGrpPtr
	 */
   	protected  long serializeIp005703Tbl57PcCabGrpPtr(char[] value) {
	    long  ip005703Tbl57PcCabGrpPtr;
	    if(value.length >0 && value.length!= 11)
            value = new String(value).trim().toCharArray();
	    if (value.length < 11) value = pad(11, value, ' ', LEFT_PAD);
	    else if (value.length > 11) value = substring(value,0,11);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ip005703Tbl57PcCabGrpPtr = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(11,value,false/*isSigned?*/)
		       ,beginIp005703Tbl57PcCabGrpPtr
		       ,11
		      );
		 localIp005703Tbl57PcCabGrpPtrCounter = shareString.getSerializedField().getModifiedCounter();
		return  ip005703Tbl57PcCabGrpPtr;
    }

   protected long checkIp005703Tbl57PcCabGrpPtrMaxLimit(long number) {

        return checkMaxLimit(number , MAX_100G/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshIp005703Tbl57PcCabGrpPtr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshIp005703Tbl57PcCabGrpPtr() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginIp005703Tbl57PcCabGrpPtr
			                 ,IP_005703_TBL_57_PC_CAB_GRP_PTR_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ip005703Tbl57PcCabGrpPtr", beginIp005703Tbl57PcCabGrpPtr,IP_005703_TBL_57_PC_CAB_GRP_PTR_LEN);
    }
   	}




}
  
