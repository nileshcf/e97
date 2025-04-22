package com.cloudframe.app.divide0.dto.serialize;

/**
*  The class DaReportTableSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:21. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;

public class DaReportTableSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(DaReportTableSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int DA_REPORT_TABLE_LENGTH = 2745;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginDaFileArea;
            protected  int beginDaSub;
            protected  int beginDaSubPfx;
            protected  int beginDaIx;
            protected  int beginDaSubSave;
            protected  int beginDaColMax;
            protected  int beginDaTblMax;
            protected  int beginDaHoldMax;
           protected int beginDaTblEntries;
           protected static final int DA_TBL_ENTRIES_SIZE = 150;
            protected  int beginDaPcntHold;
	
	/**
	* Constructor for DaReportTableSerialized
	**/
    public DaReportTableSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in DaReportTableSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(DA_REPORT_TABLE_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginDaFileArea = getStartOffset() + 0;	// set offset for serialization
  
             beginDaSub = getStartOffset() + 10;	// set offset for serialization
  
             beginDaSubPfx = getStartOffset() + 14;	// set offset for serialization
  
             beginDaIx = getStartOffset() + 18;	// set offset for serialization
  
             beginDaSubSave = getStartOffset() + 22;	// set offset for serialization
  
             beginDaColMax = getStartOffset() + 26;	// set offset for serialization
  
             beginDaTblMax = getStartOffset() + 30;	// set offset for serialization
  
             beginDaHoldMax = getStartOffset() + 34;	// set offset for serialization
  
	        beginDaTblEntries = getStartOffset() + 38; // set offset for serialization
  
             beginDaPcntHold = getStartOffset() + 2738;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localDaFileAreaCounter = -1;
     public boolean isDaFileAreaModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDaFileAreaCounter != sharedCounter;
         localDaFileAreaCounter = sharedCounter; return hasModified;
     }
	protected static final int DA_FILE_AREA_LEN = 10;
	/**
	 * 	serialize this DaFileArea
	 */
   protected void serializeDaFileArea(char[] daFileArea) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(daFileArea,0,getStringValue(),beginDaFileArea,DA_FILE_AREA_LEN);
       localDaFileAreaCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDaFileAreaConstraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshDaFileArea is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDaFileArea() {	 
   		return (substring(getStringValue(),beginDaFileArea,beginDaFileArea + DA_FILE_AREA_LEN));
   	}
     int localDaSubCounter = -1;
     public boolean isDaSubModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDaSubCounter != sharedCounter;
         localDaSubCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of daSub
	 *	@return daSub
	 */
	public char[]  getDaSubString() {
	     return getCharArray(beginDaSub,DA_SUB_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean daSubIsNumeric() {
	    return isNumeric(beginDaSub
	                    ,beginDaSub + DA_SUB_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int DA_SUB_LEN = 4;
  	/**
	 * serializeDaSub
	 */
	protected void serializeDaSub(int daSub) {
		 putNumber(beginDaSub,daSub,DA_SUB_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localDaSubCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeDaSub
	 */
   	protected  int serializeDaSub(char[] value) {
	    int  daSub;
	    if(value.length >0 && value.length!= 4)
            value = new String(value).trim().toCharArray();
	    if (value.length < 4) value = pad(4, value, ' ', LEFT_PAD);
	    else if (value.length > 4) value = substring(value,0,4);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    daSub = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(4,value,false/*isSigned?*/)
		       ,beginDaSub
		       ,4
		      );
		 localDaSubCounter = shareString.getSerializedField().getModifiedCounter();
		return  daSub;
    }

   protected int checkDaSubMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10K/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshDaSub is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshDaSub() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginDaSub
			                 ,DA_SUB_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("daSub", beginDaSub,DA_SUB_LEN);
    }
   	}
     int localDaSubPfxCounter = -1;
     public boolean isDaSubPfxModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDaSubPfxCounter != sharedCounter;
         localDaSubPfxCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of daSubPfx
	 *	@return daSubPfx
	 */
	public char[]  getDaSubPfxString() {
	     return getCharArray(beginDaSubPfx,DA_SUB_PFX_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean daSubPfxIsNumeric() {
	    return isNumeric(beginDaSubPfx
	                    ,beginDaSubPfx + DA_SUB_PFX_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int DA_SUB_PFX_LEN = 4;
  	/**
	 * serializeDaSubPfx
	 */
	protected void serializeDaSubPfx(int daSubPfx) {
		 putNumber(beginDaSubPfx,daSubPfx,DA_SUB_PFX_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localDaSubPfxCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeDaSubPfx
	 */
   	protected  int serializeDaSubPfx(char[] value) {
	    int  daSubPfx;
	    if(value.length >0 && value.length!= 4)
            value = new String(value).trim().toCharArray();
	    if (value.length < 4) value = pad(4, value, ' ', LEFT_PAD);
	    else if (value.length > 4) value = substring(value,0,4);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    daSubPfx = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(4,value,false/*isSigned?*/)
		       ,beginDaSubPfx
		       ,4
		      );
		 localDaSubPfxCounter = shareString.getSerializedField().getModifiedCounter();
		return  daSubPfx;
    }

   protected int checkDaSubPfxMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10K/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshDaSubPfx is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshDaSubPfx() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginDaSubPfx
			                 ,DA_SUB_PFX_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("daSubPfx", beginDaSubPfx,DA_SUB_PFX_LEN);
    }
   	}
     int localDaIxCounter = -1;
     public boolean isDaIxModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDaIxCounter != sharedCounter;
         localDaIxCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of daIx
	 *	@return daIx
	 */
	public char[]  getDaIxString() {
	     return getCharArray(beginDaIx,DA_IX_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean daIxIsNumeric() {
	    return isNumeric(beginDaIx
	                    ,beginDaIx + DA_IX_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int DA_IX_LEN = 4;
  	/**
	 * serializeDaIx
	 */
	protected void serializeDaIx(int daIx) {
		 putNumber(beginDaIx,daIx,DA_IX_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localDaIxCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeDaIx
	 */
   	protected  int serializeDaIx(char[] value) {
	    int  daIx;
	    if(value.length >0 && value.length!= 4)
            value = new String(value).trim().toCharArray();
	    if (value.length < 4) value = pad(4, value, ' ', LEFT_PAD);
	    else if (value.length > 4) value = substring(value,0,4);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    daIx = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(4,value,false/*isSigned?*/)
		       ,beginDaIx
		       ,4
		      );
		 localDaIxCounter = shareString.getSerializedField().getModifiedCounter();
		return  daIx;
    }

   protected int checkDaIxMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10K/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshDaIx is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshDaIx() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginDaIx
			                 ,DA_IX_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("daIx", beginDaIx,DA_IX_LEN);
    }
   	}
     int localDaSubSaveCounter = -1;
     public boolean isDaSubSaveModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDaSubSaveCounter != sharedCounter;
         localDaSubSaveCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of daSubSave
	 *	@return daSubSave
	 */
	public char[]  getDaSubSaveString() {
	     return getCharArray(beginDaSubSave,DA_SUB_SAVE_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean daSubSaveIsNumeric() {
	    return isNumeric(beginDaSubSave
	                    ,beginDaSubSave + DA_SUB_SAVE_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int DA_SUB_SAVE_LEN = 4;
  	/**
	 * serializeDaSubSave
	 */
	protected void serializeDaSubSave(int daSubSave) {
		 putNumber(beginDaSubSave,daSubSave,DA_SUB_SAVE_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localDaSubSaveCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeDaSubSave
	 */
   	protected  int serializeDaSubSave(char[] value) {
	    int  daSubSave;
	    if(value.length >0 && value.length!= 4)
            value = new String(value).trim().toCharArray();
	    if (value.length < 4) value = pad(4, value, ' ', LEFT_PAD);
	    else if (value.length > 4) value = substring(value,0,4);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    daSubSave = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(4,value,false/*isSigned?*/)
		       ,beginDaSubSave
		       ,4
		      );
		 localDaSubSaveCounter = shareString.getSerializedField().getModifiedCounter();
		return  daSubSave;
    }

   protected int checkDaSubSaveMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10K/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshDaSubSave is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshDaSubSave() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginDaSubSave
			                 ,DA_SUB_SAVE_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("daSubSave", beginDaSubSave,DA_SUB_SAVE_LEN);
    }
   	}
     int localDaColMaxCounter = -1;
     public boolean isDaColMaxModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDaColMaxCounter != sharedCounter;
         localDaColMaxCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of daColMax
	 *	@return daColMax
	 */
	public char[]  getDaColMaxString() {
	     return getCharArray(beginDaColMax,DA_COL_MAX_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean daColMaxIsNumeric() {
	    return isNumeric(beginDaColMax
	                    ,beginDaColMax + DA_COL_MAX_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int DA_COL_MAX_LEN = 4;
  	/**
	 * serializeDaColMax
	 */
	protected void serializeDaColMax(int daColMax) {
		 putNumber(beginDaColMax,daColMax,DA_COL_MAX_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localDaColMaxCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeDaColMax
	 */
   	protected  int serializeDaColMax(char[] value) {
	    int  daColMax;
	    if(value.length >0 && value.length!= 4)
            value = new String(value).trim().toCharArray();
	    if (value.length < 4) value = pad(4, value, ' ', LEFT_PAD);
	    else if (value.length > 4) value = substring(value,0,4);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    daColMax = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(4,value,false/*isSigned?*/)
		       ,beginDaColMax
		       ,4
		      );
		 localDaColMaxCounter = shareString.getSerializedField().getModifiedCounter();
		return  daColMax;
    }

   protected int checkDaColMaxMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10K/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshDaColMax is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshDaColMax() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginDaColMax
			                 ,DA_COL_MAX_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("daColMax", beginDaColMax,DA_COL_MAX_LEN);
    }
   	}
     int localDaTblMaxCounter = -1;
     public boolean isDaTblMaxModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDaTblMaxCounter != sharedCounter;
         localDaTblMaxCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of daTblMax
	 *	@return daTblMax
	 */
	public char[]  getDaTblMaxString() {
	     return getCharArray(beginDaTblMax,DA_TBL_MAX_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean daTblMaxIsNumeric() {
	    return isNumeric(beginDaTblMax
	                    ,beginDaTblMax + DA_TBL_MAX_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int DA_TBL_MAX_LEN = 4;
  	/**
	 * serializeDaTblMax
	 */
	protected void serializeDaTblMax(int daTblMax) {
		 putNumber(beginDaTblMax,daTblMax,DA_TBL_MAX_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localDaTblMaxCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeDaTblMax
	 */
   	protected  int serializeDaTblMax(char[] value) {
	    int  daTblMax;
	    if(value.length >0 && value.length!= 4)
            value = new String(value).trim().toCharArray();
	    if (value.length < 4) value = pad(4, value, ' ', LEFT_PAD);
	    else if (value.length > 4) value = substring(value,0,4);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    daTblMax = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(4,value,false/*isSigned?*/)
		       ,beginDaTblMax
		       ,4
		      );
		 localDaTblMaxCounter = shareString.getSerializedField().getModifiedCounter();
		return  daTblMax;
    }

   protected int checkDaTblMaxMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10K/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshDaTblMax is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshDaTblMax() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginDaTblMax
			                 ,DA_TBL_MAX_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("daTblMax", beginDaTblMax,DA_TBL_MAX_LEN);
    }
   	}
     int localDaHoldMaxCounter = -1;
     public boolean isDaHoldMaxModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDaHoldMaxCounter != sharedCounter;
         localDaHoldMaxCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of daHoldMax
	 *	@return daHoldMax
	 */
	public char[]  getDaHoldMaxString() {
	     return getCharArray(beginDaHoldMax,DA_HOLD_MAX_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean daHoldMaxIsNumeric() {
	    return isNumeric(beginDaHoldMax
	                    ,beginDaHoldMax + DA_HOLD_MAX_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int DA_HOLD_MAX_LEN = 4;
  	/**
	 * serializeDaHoldMax
	 */
	protected void serializeDaHoldMax(int daHoldMax) {
		 putNumber(beginDaHoldMax,daHoldMax,DA_HOLD_MAX_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localDaHoldMaxCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeDaHoldMax
	 */
   	protected  int serializeDaHoldMax(char[] value) {
	    int  daHoldMax;
	    if(value.length >0 && value.length!= 4)
            value = new String(value).trim().toCharArray();
	    if (value.length < 4) value = pad(4, value, ' ', LEFT_PAD);
	    else if (value.length > 4) value = substring(value,0,4);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    daHoldMax = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(4,value,false/*isSigned?*/)
		       ,beginDaHoldMax
		       ,4
		      );
		 localDaHoldMaxCounter = shareString.getSerializedField().getModifiedCounter();
		return  daHoldMax;
    }

   protected int checkDaHoldMaxMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10K/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshDaHoldMax is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshDaHoldMax() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginDaHoldMax
			                 ,DA_HOLD_MAX_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("daHoldMax", beginDaHoldMax,DA_HOLD_MAX_LEN);
    }
   	}
     int localDaPcntHoldCounter = -1;
     
     public boolean isDaPcntHoldModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDaPcntHoldCounter != sharedCounter;
         localDaPcntHoldCounter = sharedCounter; return hasModified; 
     }  	
	
	 /**
	 *	Returns String value of daPcntHold
	 *	@return daPcntHold
	 */
	public char[]  getDaPcntHoldString() {
	    return getCharArray(beginDaPcntHold,DA_PCNT_HOLD_LEN);
	}

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean daPcntHoldIsNumeric() {
		    return isNumeric(beginDaPcntHold
	                    ,beginDaPcntHold + DA_PCNT_HOLD_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
  protected  static final int DA_PCNT_HOLD_LEN = 7;
  protected  static final int DA_PCNT_HOLD_SCALE = 4;

   protected BigDecimal checkDaPcntHoldMaxLimit(BigDecimal number) {
		return checkMaxLimit(number,4/*scale*/,7/*precision*/);
   }

  	/**
	 * serializeDaPcntHold
	 */
	protected void serializeDaPcntHold(BigDecimal daPcntHold) {
	       putNumber(beginDaPcntHold,daPcntHold,DA_PCNT_HOLD_LEN,DA_PCNT_HOLD_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localDaPcntHoldCounter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeDaPcntHold
	 */
   	protected  BigDecimal serializeDaPcntHold(char[] value) throws CFException {
        if (value.length < 7) value = pad(7, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(7,value,false/*isSigned?*/)
		       ,beginDaPcntHold
		       ,7
		      );		 localDaPcntHoldCounter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,DA_PCNT_HOLD_LEN,DA_PCNT_HOLD_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("daPcntHold", beginDaPcntHold,DA_PCNT_HOLD_LEN);
    	}
    }
    /**
	 *	refreshDaPcntHold is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshDaPcntHold() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginDaPcntHold
			            ,DA_PCNT_HOLD_LEN
			            ,DA_PCNT_HOLD_SCALE
			            ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 			        
			        );
	} catch(Exception ex) {
    	throw getSoc7ABend("daPcntHold", beginDaPcntHold,DA_PCNT_HOLD_LEN);
    }
   	}

		public int daTblEntriesSize() {
			return DA_TBL_ENTRIES_SIZE;
		}



}
  
