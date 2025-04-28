package com.cloudframe.app.search2.dto.serialize;

/**
*  The class SbidGroupEntriesSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:05. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class SbidGroupEntriesSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(SbidGroupEntriesSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int SBID_GROUP_ENTRIES_LENGTH = 11;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginTblSbid;
            protected  int beginTblEcp;
	
	/**
	* Constructor for SbidGroupEntriesSerialized
	**/
    public SbidGroupEntriesSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for SbidGroupEntriesSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public SbidGroupEntriesSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this SbidGroupEntriesSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this SbidGroupEntriesSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in SbidGroupEntriesSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(SBID_GROUP_ENTRIES_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginTblSbid = getStartOffset() + 0;	// set offset for serialization
  
             beginTblEcp = getStartOffset() + 5;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localTblSbidCounter = -1;
     public boolean isTblSbidModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTblSbidCounter != sharedCounter;
         localTblSbidCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of tblSbid
	 *	@return tblSbid
	 */
	public char[]  getTblSbidString() {
	     return getCharArray(beginTblSbid,TBL_SBID_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tblSbidIsNumeric() {
	    return isNumeric(beginTblSbid
	                    ,beginTblSbid + TBL_SBID_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int TBL_SBID_LEN = 5;
  	/**
	 * serializeTblSbid
	 */
	protected void serializeTblSbid(long tblSbid) {
		 putNumber(beginTblSbid,tblSbid,TBL_SBID_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localTblSbidCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeTblSbid
	 */
   	protected  long serializeTblSbid(char[] value) {
	    long  tblSbid;
	    if(value.length >0 && value.length!= 5)
            value = new String(value).trim().toCharArray();
	    if (value.length < 5) value = pad(5, value, ' ', LEFT_PAD);
	    else if (value.length > 5) value = substring(value,0,5);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    tblSbid = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(5,value,false/*isSigned?*/)
		       ,beginTblSbid
		       ,5
		      );
		 localTblSbidCounter = shareString.getSerializedField().getModifiedCounter();
		return  tblSbid;
    }

   protected long checkTblSbidMaxLimit(long number) {

        return checkMaxLimit(number , MAX_100K/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshTblSbid is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshTblSbid() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginTblSbid
			                 ,TBL_SBID_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("tblSbid", beginTblSbid,TBL_SBID_LEN);
    }
   	}
     int localTblEcpCounter = -1;
     public boolean isTblEcpModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTblEcpCounter != sharedCounter;
         localTblEcpCounter = sharedCounter; return hasModified;
     }
	protected static final int TBL_ECP_LEN = 6;
	/**
	 * 	serialize this TblEcp
	 */
   protected void serializeTblEcp(char[] tblEcp) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(tblEcp,0,getStringValue(),beginTblEcp,TBL_ECP_LEN);
       localTblEcpCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTblEcpConstraints(char[] value) {
   			return super.checkConstraints(value , 6 ,false, false);
   }
    /**
	 *	refreshTblEcp is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTblEcp() {	 
   		return (substring(getStringValue(),beginTblEcp,beginTblEcp + TBL_ECP_LEN));
   	}




}
  
