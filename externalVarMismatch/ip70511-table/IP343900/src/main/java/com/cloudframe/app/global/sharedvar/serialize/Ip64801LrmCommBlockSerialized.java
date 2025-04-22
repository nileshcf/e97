package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip64801LrmCommBlockSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:15. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip64801LrmCommBlockSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip64801LrmCommBlockSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_64801_LRM_COMM_BLOCK_LENGTH = 77;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp64801LrmRequest;
            protected  int beginIp64801LrmJobgrpName;
            protected  int beginIp64801LrmJobgrpNum;
            protected  int beginIp64801LrmSelSqlCnt;
           protected int beginIp64801LrmSelSqlDtl;
           protected static final int IP_64801_LRM_SEL_SQL_DTL_SIZE = 4;
            protected  int beginIp64801LrmUpdComSql;
            protected  int beginIp64801LrmUpdComMod;
            protected  int beginIp64801LrmReqStat;
            protected  int beginIp64801LrmBadRsn;
            protected  int beginIp64801LrmJobgrpId;
	
	/**
	* Constructor for Ip64801LrmCommBlockSerialized
	**/
    public Ip64801LrmCommBlockSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* initializes the field in Ip64801LrmCommBlockSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_64801_LRM_COMM_BLOCK_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp64801LrmRequest = getStartOffset() + 0;	// set offset for serialization
  
             beginIp64801LrmJobgrpName = getStartOffset() + 4;	// set offset for serialization
  
             beginIp64801LrmJobgrpNum = getStartOffset() + 10;	// set offset for serialization
  
             beginIp64801LrmSelSqlCnt = getStartOffset() + 12;	// set offset for serialization
  
	        beginIp64801LrmSelSqlDtl = getStartOffset() + 14; // set offset for serialization
  
             beginIp64801LrmUpdComSql = getStartOffset() + 54;	// set offset for serialization
  
             beginIp64801LrmUpdComMod = getStartOffset() + 56;	// set offset for serialization
  
             beginIp64801LrmReqStat = getStartOffset() + 64;	// set offset for serialization
  
             beginIp64801LrmBadRsn = getStartOffset() + 67;	// set offset for serialization
  
             beginIp64801LrmJobgrpId = getStartOffset() + 69;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localIp64801LrmRequestCounter = -1;
     public boolean isIp64801LrmRequestModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp64801LrmRequestCounter != sharedCounter;
         localIp64801LrmRequestCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_64801_LRM_REQUEST_LEN = 4;
	/**
	 * 	serialize this Ip64801LrmRequest
	 */
   protected void serializeIp64801LrmRequest(char[] ip64801LrmRequest) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip64801LrmRequest,0,getStringValue(),beginIp64801LrmRequest,IP_64801_LRM_REQUEST_LEN);
       localIp64801LrmRequestCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp64801LrmRequestConstraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshIp64801LrmRequest is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp64801LrmRequest() {	 
   		return (substring(getStringValue(),beginIp64801LrmRequest,beginIp64801LrmRequest + IP_64801_LRM_REQUEST_LEN));
   	}
     int localIp64801LrmJobgrpNameCounter = -1;
     public boolean isIp64801LrmJobgrpNameModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp64801LrmJobgrpNameCounter != sharedCounter;
         localIp64801LrmJobgrpNameCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_64801_LRM_JOBGRP_NAME_LEN = 6;
	/**
	 * 	serialize this Ip64801LrmJobgrpName
	 */
   protected void serializeIp64801LrmJobgrpName(char[] ip64801LrmJobgrpName) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip64801LrmJobgrpName,0,getStringValue(),beginIp64801LrmJobgrpName,IP_64801_LRM_JOBGRP_NAME_LEN);
       localIp64801LrmJobgrpNameCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp64801LrmJobgrpNameConstraints(char[] value) {
   			return super.checkConstraints(value , 6 ,false, false);
   }
    /**
	 *	refreshIp64801LrmJobgrpName is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp64801LrmJobgrpName() {	 
   		return (substring(getStringValue(),beginIp64801LrmJobgrpName,beginIp64801LrmJobgrpName + IP_64801_LRM_JOBGRP_NAME_LEN));
   	}
     int localIp64801LrmJobgrpNumCounter = -1;
     public boolean isIp64801LrmJobgrpNumModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp64801LrmJobgrpNumCounter != sharedCounter;
         localIp64801LrmJobgrpNumCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ip64801LrmJobgrpNum
	 *	@return ip64801LrmJobgrpNum
	 */
	public char[]  getIp64801LrmJobgrpNumString() {
	     return getCharArray(beginIp64801LrmJobgrpNum,IP_64801_LRM_JOBGRP_NUM_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip64801LrmJobgrpNumIsNumeric() {
	    return isNumeric(beginIp64801LrmJobgrpNum
	                    ,beginIp64801LrmJobgrpNum + IP_64801_LRM_JOBGRP_NUM_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int IP_64801_LRM_JOBGRP_NUM_LEN = 2;
  	/**
	 * serializeIp64801LrmJobgrpNum
	 */
	protected void serializeIp64801LrmJobgrpNum(int ip64801LrmJobgrpNum) {
		 putNumber(beginIp64801LrmJobgrpNum,ip64801LrmJobgrpNum,IP_64801_LRM_JOBGRP_NUM_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localIp64801LrmJobgrpNumCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeIp64801LrmJobgrpNum
	 */
   	protected  int serializeIp64801LrmJobgrpNum(char[] value) {
	    int  ip64801LrmJobgrpNum;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ip64801LrmJobgrpNum = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginIp64801LrmJobgrpNum
		       ,2
		      );
		 localIp64801LrmJobgrpNumCounter = shareString.getSerializedField().getModifiedCounter();
		return  ip64801LrmJobgrpNum;
    }

   protected int checkIp64801LrmJobgrpNumMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshIp64801LrmJobgrpNum is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshIp64801LrmJobgrpNum() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginIp64801LrmJobgrpNum
			                 ,IP_64801_LRM_JOBGRP_NUM_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ip64801LrmJobgrpNum", beginIp64801LrmJobgrpNum,IP_64801_LRM_JOBGRP_NUM_LEN);
    }
   	}
     int localIp64801LrmSelSqlCntCounter = -1;
     public boolean isIp64801LrmSelSqlCntModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp64801LrmSelSqlCntCounter != sharedCounter;
         localIp64801LrmSelSqlCntCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ip64801LrmSelSqlCnt
	 *	@return ip64801LrmSelSqlCnt
	 */
	public char[]  getIp64801LrmSelSqlCntString() {
	     return getCharArray(beginIp64801LrmSelSqlCnt,IP_64801_LRM_SEL_SQL_CNT_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip64801LrmSelSqlCntIsNumeric() {
	    return isNumeric(beginIp64801LrmSelSqlCnt
	                    ,beginIp64801LrmSelSqlCnt + IP_64801_LRM_SEL_SQL_CNT_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int IP_64801_LRM_SEL_SQL_CNT_LEN = 2;
  	/**
	 * serializeIp64801LrmSelSqlCnt
	 */
	protected void serializeIp64801LrmSelSqlCnt(int ip64801LrmSelSqlCnt) {
		 putNumber(beginIp64801LrmSelSqlCnt,ip64801LrmSelSqlCnt,IP_64801_LRM_SEL_SQL_CNT_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localIp64801LrmSelSqlCntCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeIp64801LrmSelSqlCnt
	 */
   	protected  int serializeIp64801LrmSelSqlCnt(char[] value) {
	    int  ip64801LrmSelSqlCnt;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ip64801LrmSelSqlCnt = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginIp64801LrmSelSqlCnt
		       ,2
		      );
		 localIp64801LrmSelSqlCntCounter = shareString.getSerializedField().getModifiedCounter();
		return  ip64801LrmSelSqlCnt;
    }

   protected int checkIp64801LrmSelSqlCntMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshIp64801LrmSelSqlCnt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshIp64801LrmSelSqlCnt() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginIp64801LrmSelSqlCnt
			                 ,IP_64801_LRM_SEL_SQL_CNT_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ip64801LrmSelSqlCnt", beginIp64801LrmSelSqlCnt,IP_64801_LRM_SEL_SQL_CNT_LEN);
    }
   	}
     int localIp64801LrmUpdComSqlCounter = -1;
     public boolean isIp64801LrmUpdComSqlModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp64801LrmUpdComSqlCounter != sharedCounter;
         localIp64801LrmUpdComSqlCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ip64801LrmUpdComSql
	 *	@return ip64801LrmUpdComSql
	 */
	public char[]  getIp64801LrmUpdComSqlString() {
	     return getCharArray(beginIp64801LrmUpdComSql,IP_64801_LRM_UPD_COM_SQL_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip64801LrmUpdComSqlIsNumeric() {
	    return isNumeric(beginIp64801LrmUpdComSql
	                    ,beginIp64801LrmUpdComSql + IP_64801_LRM_UPD_COM_SQL_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int IP_64801_LRM_UPD_COM_SQL_LEN = 2;
  	/**
	 * serializeIp64801LrmUpdComSql
	 */
	protected void serializeIp64801LrmUpdComSql(int ip64801LrmUpdComSql) {
		 putNumber(beginIp64801LrmUpdComSql,ip64801LrmUpdComSql,IP_64801_LRM_UPD_COM_SQL_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localIp64801LrmUpdComSqlCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeIp64801LrmUpdComSql
	 */
   	protected  int serializeIp64801LrmUpdComSql(char[] value) {
	    int  ip64801LrmUpdComSql;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ip64801LrmUpdComSql = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginIp64801LrmUpdComSql
		       ,2
		      );
		 localIp64801LrmUpdComSqlCounter = shareString.getSerializedField().getModifiedCounter();
		return  ip64801LrmUpdComSql;
    }

   protected int checkIp64801LrmUpdComSqlMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshIp64801LrmUpdComSql is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshIp64801LrmUpdComSql() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginIp64801LrmUpdComSql
			                 ,IP_64801_LRM_UPD_COM_SQL_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ip64801LrmUpdComSql", beginIp64801LrmUpdComSql,IP_64801_LRM_UPD_COM_SQL_LEN);
    }
   	}
     int localIp64801LrmUpdComModCounter = -1;
     public boolean isIp64801LrmUpdComModModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp64801LrmUpdComModCounter != sharedCounter;
         localIp64801LrmUpdComModCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_64801_LRM_UPD_COM_MOD_LEN = 8;
	/**
	 * 	serialize this Ip64801LrmUpdComMod
	 */
   protected void serializeIp64801LrmUpdComMod(char[] ip64801LrmUpdComMod) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip64801LrmUpdComMod,0,getStringValue(),beginIp64801LrmUpdComMod,IP_64801_LRM_UPD_COM_MOD_LEN);
       localIp64801LrmUpdComModCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp64801LrmUpdComModConstraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshIp64801LrmUpdComMod is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp64801LrmUpdComMod() {	 
   		return (substring(getStringValue(),beginIp64801LrmUpdComMod,beginIp64801LrmUpdComMod + IP_64801_LRM_UPD_COM_MOD_LEN));
   	}
     int localIp64801LrmReqStatCounter = -1;
     public boolean isIp64801LrmReqStatModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp64801LrmReqStatCounter != sharedCounter;
         localIp64801LrmReqStatCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_64801_LRM_REQ_STAT_LEN = 3;
	/**
	 * 	serialize this Ip64801LrmReqStat
	 */
   protected void serializeIp64801LrmReqStat(char[] ip64801LrmReqStat) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip64801LrmReqStat,0,getStringValue(),beginIp64801LrmReqStat,IP_64801_LRM_REQ_STAT_LEN);
       localIp64801LrmReqStatCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp64801LrmReqStatConstraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshIp64801LrmReqStat is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp64801LrmReqStat() {	 
   		return (substring(getStringValue(),beginIp64801LrmReqStat,beginIp64801LrmReqStat + IP_64801_LRM_REQ_STAT_LEN));
   	}
     int localIp64801LrmBadRsnCounter = -1;
     public boolean isIp64801LrmBadRsnModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp64801LrmBadRsnCounter != sharedCounter;
         localIp64801LrmBadRsnCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ip64801LrmBadRsn
	 *	@return ip64801LrmBadRsn
	 */
	public char[]  getIp64801LrmBadRsnString() {
	     return getCharArray(beginIp64801LrmBadRsn,IP_64801_LRM_BAD_RSN_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip64801LrmBadRsnIsNumeric() {
	    return isNumeric(beginIp64801LrmBadRsn
	                    ,beginIp64801LrmBadRsn + IP_64801_LRM_BAD_RSN_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int IP_64801_LRM_BAD_RSN_LEN = 2;
  	/**
	 * serializeIp64801LrmBadRsn
	 */
	protected void serializeIp64801LrmBadRsn(int ip64801LrmBadRsn) {
		 putNumber(beginIp64801LrmBadRsn,ip64801LrmBadRsn,IP_64801_LRM_BAD_RSN_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localIp64801LrmBadRsnCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeIp64801LrmBadRsn
	 */
   	protected  int serializeIp64801LrmBadRsn(char[] value) {
	    int  ip64801LrmBadRsn;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ip64801LrmBadRsn = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginIp64801LrmBadRsn
		       ,2
		      );
		 localIp64801LrmBadRsnCounter = shareString.getSerializedField().getModifiedCounter();
		return  ip64801LrmBadRsn;
    }

   protected int checkIp64801LrmBadRsnMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshIp64801LrmBadRsn is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshIp64801LrmBadRsn() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginIp64801LrmBadRsn
			                 ,IP_64801_LRM_BAD_RSN_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ip64801LrmBadRsn", beginIp64801LrmBadRsn,IP_64801_LRM_BAD_RSN_LEN);
    }
   	}
     int localIp64801LrmJobgrpIdCounter = -1;
     public boolean isIp64801LrmJobgrpIdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp64801LrmJobgrpIdCounter != sharedCounter;
         localIp64801LrmJobgrpIdCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_64801_LRM_JOBGRP_ID_LEN = 8;
	/**
	 * 	serialize this Ip64801LrmJobgrpId
	 */
   protected void serializeIp64801LrmJobgrpId(char[] ip64801LrmJobgrpId) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip64801LrmJobgrpId,0,getStringValue(),beginIp64801LrmJobgrpId,IP_64801_LRM_JOBGRP_ID_LEN);
       localIp64801LrmJobgrpIdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp64801LrmJobgrpIdConstraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshIp64801LrmJobgrpId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp64801LrmJobgrpId() {	 
   		return (substring(getStringValue(),beginIp64801LrmJobgrpId,beginIp64801LrmJobgrpId + IP_64801_LRM_JOBGRP_ID_LEN));
   	}

		public int ip64801LrmSelSqlDtlSize() {
			return IP_64801_LRM_SEL_SQL_DTL_SIZE;
		}



}
  
