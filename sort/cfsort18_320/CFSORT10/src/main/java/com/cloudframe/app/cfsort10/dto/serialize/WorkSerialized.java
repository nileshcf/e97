package com.cloudframe.app.cfsort10.dto.serialize;

/**
*  The class WorkSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:29. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class WorkSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(WorkSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WORK_LENGTH = 4;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginCfoutStat;
            protected  int beginCfinStat;
	
	/**
	* Constructor for WorkSerialized
	**/
    public WorkSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in WorkSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(WORK_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginCfoutStat = getStartOffset() + 0;	// set offset for serialization
  
             beginCfinStat = getStartOffset() + 2;	// set offset for serialization
  
  
  
	   /*  end of offset */
	}
     int localCfoutStatCounter = -1;
     public boolean isCfoutStatModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCfoutStatCounter != sharedCounter;
         localCfoutStatCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of cfoutStat
	 *	@return cfoutStat
	 */
	public char[]  getCfoutStatString() {
	     return getCharArray(beginCfoutStat,CFOUT_STAT_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean cfoutStatIsNumeric() {
	    return isNumeric(beginCfoutStat
	                    ,beginCfoutStat + CFOUT_STAT_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int CFOUT_STAT_LEN = 2;
  	/**
	 * serializeCfoutStat
	 */
	protected void serializeCfoutStat(int cfoutStat) {
		 putNumber(beginCfoutStat,cfoutStat,CFOUT_STAT_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localCfoutStatCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeCfoutStat
	 */
   	protected  int serializeCfoutStat(char[] value) {
	    int  cfoutStat;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    cfoutStat = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginCfoutStat
		       ,2
		      );
		 localCfoutStatCounter = shareString.getSerializedField().getModifiedCounter();
		return  cfoutStat;
    }

   protected int checkCfoutStatMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshCfoutStat is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshCfoutStat() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginCfoutStat
			                 ,CFOUT_STAT_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("cfoutStat", beginCfoutStat,CFOUT_STAT_LEN);
    }
   	}
     int localCfinStatCounter = -1;
     public boolean isCfinStatModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCfinStatCounter != sharedCounter;
         localCfinStatCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of cfinStat
	 *	@return cfinStat
	 */
	public char[]  getCfinStatString() {
	     return getCharArray(beginCfinStat,CFIN_STAT_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean cfinStatIsNumeric() {
	    return isNumeric(beginCfinStat
	                    ,beginCfinStat + CFIN_STAT_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int CFIN_STAT_LEN = 2;
  	/**
	 * serializeCfinStat
	 */
	protected void serializeCfinStat(int cfinStat) {
		 putNumber(beginCfinStat,cfinStat,CFIN_STAT_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localCfinStatCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeCfinStat
	 */
   	protected  int serializeCfinStat(char[] value) {
	    int  cfinStat;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    cfinStat = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginCfinStat
		       ,2
		      );
		 localCfinStatCounter = shareString.getSerializedField().getModifiedCounter();
		return  cfinStat;
    }

   protected int checkCfinStatMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshCfinStat is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshCfinStat() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginCfinStat
			                 ,CFIN_STAT_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("cfinStat", beginCfinStat,CFIN_STAT_LEN);
    }
   	}
         int localNoMoreRecordsSwCounter = -1;
         public boolean isNoMoreRecordsSwModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localNoMoreRecordsSwCounter != sharedCounter;
            localNoMoreRecordsSwCounter = sharedCounter; return hasModified; 
         }
       
      
   protected short checkNoMoreRecordsSwMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     int localEofSwCounter = -1;
     public boolean isEofSwModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localEofSwCounter != sharedCounter;
         localEofSwCounter = sharedCounter; return hasModified;
     }

   protected char[] checkEofSwConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }




}
  
