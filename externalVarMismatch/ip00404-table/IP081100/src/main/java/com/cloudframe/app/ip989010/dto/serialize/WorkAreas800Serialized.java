package com.cloudframe.app.ip989010.dto.serialize;

/**
*  The class WorkAreas800Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:34. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;

public class WorkAreas800Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(WorkAreas800Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WORK_AREAS_800_LENGTH = 4634;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginTrnAmt8001240;
            protected  int beginTrnAmt8001740;
            protected  int beginAcqAmt800;
            protected  int beginIssAmt800;
            protected  int beginMcAmt800;
            protected  int beginMerchAmt800;
            protected  int beginRcvr8001740;
            protected  int beginDe43s1800;
            protected  int beginDe43s1Len800;
            protected  int beginDe63s2800;
            protected  int beginFieldLen800;
            protected  int beginFieldPtr800;
            protected  int beginFldStrt800;
            protected  int beginFieldVal800;
            protected  int beginFileid800;
            protected  int beginFundOpt800;
            protected  int beginInternalMbrId800;
            protected  int beginIndent800;
            protected  int beginIlvl800;
            protected  int beginJulianDate800;
            protected  int beginMccCd800;
            protected  int beginMccCdLen800;
            protected  int beginMerchId800;
            protected  int beginMerchIdLen800;
            protected  int beginNewElem800;
            protected  int beginPan800;
            protected  int beginPanLen800;
            protected  int beginPtrVal800;
            protected  int beginRandom800;
            protected  int beginRevInd800;
            protected  int beginRevIndLen800;
            protected  int beginRewardAmt800;
            protected  int beginRewardPgmId800;
            protected  int beginSaveEntry800;
            protected  int beginSaveTagNum800;
            protected  int beginSeed800;
            protected  int beginSender800;
            protected  int beginSeqNum8800;
            protected  int beginSeqNumP0137800;
            protected  int beginSys101Rdw800;
            protected  int beginSys201Rdw800;
            protected  int beginSys001Status800;
            protected  int beginSys002Status800;
            protected  int beginSys005Status800;
            protected  int beginSys003Status800;
            protected  int beginSys004Status800;
            protected  int beginSys101Status800;
            protected  int beginSys201Status800;
            protected  int beginSys202Status800;
            protected  int beginSys204Status800;
            protected  int beginSys205Status800;
            protected  int beginTagTblPtr800;
            protected  int beginTranAmt800;
            protected  int beginTranAmtLen800;
            protected  int beginType1800;
            protected  int beginIca1800;
            protected  int beginBin1800;
            protected  int beginMaid1800;
            protected  int beginEndpoint1800;
            protected  int beginType2800;
            protected  int beginIca2800;
            protected  int beginBin2800;
            protected  int beginMaid2800;
            protected  int beginEndpoint2800;
            protected  int beginDonationAmount800;
            protected  int beginIrd800;
	
	/**
	* Constructor for WorkAreas800Serialized
	**/
    public WorkAreas800Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in WorkAreas800Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(WORK_AREAS_800_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
             beginTrnAmt8001240 = getStartOffset() + 24;	// set offset for serialization
  
             beginTrnAmt8001740 = getStartOffset() + 36;	// set offset for serialization
  
             beginAcqAmt800 = getStartOffset() + 48;	// set offset for serialization
  
             beginIssAmt800 = getStartOffset() + 60;	// set offset for serialization
  
             beginMcAmt800 = getStartOffset() + 72;	// set offset for serialization
  
             beginMerchAmt800 = getStartOffset() + 84;	// set offset for serialization
  
             beginRcvr8001740 = getStartOffset() + 96;	// set offset for serialization
  
  
             beginDe43s1800 = getStartOffset() + 130;	// set offset for serialization
  
             beginDe43s1Len800 = getStartOffset() + 210;	// set offset for serialization
  
             beginDe63s2800 = getStartOffset() + 213;	// set offset for serialization
  
             beginFieldLen800 = getStartOffset() + 228;	// set offset for serialization
  
             beginFieldPtr800 = getStartOffset() + 231;	// set offset for serialization
  
             beginFldStrt800 = getStartOffset() + 234;	// set offset for serialization
  
             beginFieldVal800 = getStartOffset() + 239;	// set offset for serialization
  
             beginFileid800 = getStartOffset() + 1238;	// set offset for serialization
  
             beginFundOpt800 = getStartOffset() + 1263;	// set offset for serialization
  
  
             beginInternalMbrId800 = getStartOffset() + 1272;	// set offset for serialization
  
             beginIndent800 = getStartOffset() + 1283;	// set offset for serialization
  
             beginIlvl800 = getStartOffset() + 1295;	// set offset for serialization
  
             beginJulianDate800 = getStartOffset() + 1297;	// set offset for serialization
  
  
             beginMccCd800 = getStartOffset() + 1308;	// set offset for serialization
  
             beginMccCdLen800 = getStartOffset() + 1312;	// set offset for serialization
  
             beginMerchId800 = getStartOffset() + 1315;	// set offset for serialization
  
             beginMerchIdLen800 = getStartOffset() + 1330;	// set offset for serialization
  
             beginNewElem800 = getStartOffset() + 1333;	// set offset for serialization
  
  
             beginPan800 = getStartOffset() + 2348;	// set offset for serialization
  
             beginPanLen800 = getStartOffset() + 2364;	// set offset for serialization
  
             beginPtrVal800 = getStartOffset() + 2367;	// set offset for serialization
  
             beginRandom800 = getStartOffset() + 2375;	// set offset for serialization
  
  
             beginRevInd800 = getStartOffset() + 2383;	// set offset for serialization
  
             beginRevIndLen800 = getStartOffset() + 2384;	// set offset for serialization
  
             beginRewardAmt800 = getStartOffset() + 2387;	// set offset for serialization
  
             beginRewardPgmId800 = getStartOffset() + 2399;	// set offset for serialization
  
             beginSaveEntry800 = getStartOffset() + 2410;	// set offset for serialization
  
             beginSaveTagNum800 = getStartOffset() + 3425;	// set offset for serialization
  
             beginSeed800 = getStartOffset() + 3429;	// set offset for serialization
  
             beginSender800 = getStartOffset() + 3437;	// set offset for serialization
  
             beginSeqNum8800 = getStartOffset() + 3448;	// set offset for serialization
  
             beginSeqNumP0137800 = getStartOffset() + 3456;	// set offset for serialization
  
             beginSys101Rdw800 = getStartOffset() + 3472;	// set offset for serialization
  
             beginSys201Rdw800 = getStartOffset() + 3476;	// set offset for serialization
  
             beginSys001Status800 = getStartOffset() + 3484;	// set offset for serialization
  
             beginSys002Status800 = getStartOffset() + 3486;	// set offset for serialization
  
             beginSys005Status800 = getStartOffset() + 3488;	// set offset for serialization
  
             beginSys003Status800 = getStartOffset() + 3490;	// set offset for serialization
  
             beginSys004Status800 = getStartOffset() + 3492;	// set offset for serialization
  
             beginSys101Status800 = getStartOffset() + 3494;	// set offset for serialization
  
             beginSys201Status800 = getStartOffset() + 3496;	// set offset for serialization
  
             beginSys202Status800 = getStartOffset() + 3498;	// set offset for serialization
  
             beginSys204Status800 = getStartOffset() + 3500;	// set offset for serialization
  
             beginSys205Status800 = getStartOffset() + 3502;	// set offset for serialization
  
             beginTagTblPtr800 = getStartOffset() + 3504;	// set offset for serialization
  
             beginTranAmt800 = getStartOffset() + 3509;	// set offset for serialization
  
             beginTranAmtLen800 = getStartOffset() + 3521;	// set offset for serialization
  
             beginType1800 = getStartOffset() + 3524;	// set offset for serialization
  
             beginIca1800 = getStartOffset() + 3546;	// set offset for serialization
  
             beginBin1800 = getStartOffset() + 3552;	// set offset for serialization
  
             beginMaid1800 = getStartOffset() + 3558;	// set offset for serialization
  
             beginEndpoint1800 = getStartOffset() + 3564;	// set offset for serialization
  
             beginType2800 = getStartOffset() + 3571;	// set offset for serialization
  
             beginIca2800 = getStartOffset() + 3593;	// set offset for serialization
  
             beginBin2800 = getStartOffset() + 3604;	// set offset for serialization
  
             beginMaid2800 = getStartOffset() + 3610;	// set offset for serialization
  
             beginEndpoint2800 = getStartOffset() + 3616;	// set offset for serialization
  
             beginDonationAmount800 = getStartOffset() + 3623;	// set offset for serialization
  
             beginIrd800 = getStartOffset() + 4632;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localTrnAmt8001240Counter = -1;
     public boolean isTrnAmt8001240Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTrnAmt8001240Counter != sharedCounter;
         localTrnAmt8001240Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of trnAmt8001240
	 *	@return trnAmt8001240
	 */
	public char[]  getTrnAmt8001240String() {
	     return getCharArray(beginTrnAmt8001240,TRN_AMT_8001240_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean trnAmt8001240IsNumeric() {
	    return isNumeric(beginTrnAmt8001240
	                    ,beginTrnAmt8001240 + TRN_AMT_8001240_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int TRN_AMT_8001240_LEN = 12;
  	/**
	 * serializeTrnAmt8001240
	 */
	protected void serializeTrnAmt8001240(long trnAmt8001240) {
		 putNumber(beginTrnAmt8001240,trnAmt8001240,TRN_AMT_8001240_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localTrnAmt8001240Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeTrnAmt8001240
	 */
   	protected  long serializeTrnAmt8001240(char[] value) {
	    long  trnAmt8001240;
	    if(value.length >0 && value.length!= 12)
            value = new String(value).trim().toCharArray();
	    if (value.length < 12) value = pad(12, value, ' ', LEFT_PAD);
	    else if (value.length > 12) value = substring(value,0,12);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    trnAmt8001240 = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(12,value,false/*isSigned?*/)
		       ,beginTrnAmt8001240
		       ,12
		      );
		 localTrnAmt8001240Counter = shareString.getSerializedField().getModifiedCounter();
		return  trnAmt8001240;
    }

   protected long checkTrnAmt8001240MaxLimit(long number) {

        return checkMaxLimit(number , MAX_1T/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshTrnAmt8001240 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshTrnAmt8001240() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginTrnAmt8001240
			                 ,TRN_AMT_8001240_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("trnAmt8001240", beginTrnAmt8001240,TRN_AMT_8001240_LEN);
    }
   	}
     int localTrnAmt8001740Counter = -1;
     public boolean isTrnAmt8001740Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTrnAmt8001740Counter != sharedCounter;
         localTrnAmt8001740Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of trnAmt8001740
	 *	@return trnAmt8001740
	 */
	public char[]  getTrnAmt8001740String() {
	     return getCharArray(beginTrnAmt8001740,TRN_AMT_8001740_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean trnAmt8001740IsNumeric() {
	    return isNumeric(beginTrnAmt8001740
	                    ,beginTrnAmt8001740 + TRN_AMT_8001740_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int TRN_AMT_8001740_LEN = 12;
  	/**
	 * serializeTrnAmt8001740
	 */
	protected void serializeTrnAmt8001740(long trnAmt8001740) {
		 putNumber(beginTrnAmt8001740,trnAmt8001740,TRN_AMT_8001740_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localTrnAmt8001740Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeTrnAmt8001740
	 */
   	protected  long serializeTrnAmt8001740(char[] value) {
	    long  trnAmt8001740;
	    if(value.length >0 && value.length!= 12)
            value = new String(value).trim().toCharArray();
	    if (value.length < 12) value = pad(12, value, ' ', LEFT_PAD);
	    else if (value.length > 12) value = substring(value,0,12);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    trnAmt8001740 = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(12,value,false/*isSigned?*/)
		       ,beginTrnAmt8001740
		       ,12
		      );
		 localTrnAmt8001740Counter = shareString.getSerializedField().getModifiedCounter();
		return  trnAmt8001740;
    }

   protected long checkTrnAmt8001740MaxLimit(long number) {

        return checkMaxLimit(number , MAX_1T/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshTrnAmt8001740 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshTrnAmt8001740() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginTrnAmt8001740
			                 ,TRN_AMT_8001740_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("trnAmt8001740", beginTrnAmt8001740,TRN_AMT_8001740_LEN);
    }
   	}
     int localAcqAmt800Counter = -1;
     public boolean isAcqAmt800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localAcqAmt800Counter != sharedCounter;
         localAcqAmt800Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of acqAmt800
	 *	@return acqAmt800
	 */
	public char[]  getAcqAmt800String() {
	     return getCharArray(beginAcqAmt800,ACQ_AMT_800_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean acqAmt800IsNumeric() {
	    return isNumeric(beginAcqAmt800
	                    ,beginAcqAmt800 + ACQ_AMT_800_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int ACQ_AMT_800_LEN = 12;
  	/**
	 * serializeAcqAmt800
	 */
	protected void serializeAcqAmt800(long acqAmt800) {
		 putNumber(beginAcqAmt800,acqAmt800,ACQ_AMT_800_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localAcqAmt800Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeAcqAmt800
	 */
   	protected  long serializeAcqAmt800(char[] value) {
	    long  acqAmt800;
	    if(value.length >0 && value.length!= 12)
            value = new String(value).trim().toCharArray();
	    if (value.length < 12) value = pad(12, value, ' ', LEFT_PAD);
	    else if (value.length > 12) value = substring(value,0,12);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    acqAmt800 = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(12,value,false/*isSigned?*/)
		       ,beginAcqAmt800
		       ,12
		      );
		 localAcqAmt800Counter = shareString.getSerializedField().getModifiedCounter();
		return  acqAmt800;
    }

   protected long checkAcqAmt800MaxLimit(long number) {

        return checkMaxLimit(number , MAX_1T/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshAcqAmt800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshAcqAmt800() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginAcqAmt800
			                 ,ACQ_AMT_800_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("acqAmt800", beginAcqAmt800,ACQ_AMT_800_LEN);
    }
   	}
     int localIssAmt800Counter = -1;
     public boolean isIssAmt800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIssAmt800Counter != sharedCounter;
         localIssAmt800Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of issAmt800
	 *	@return issAmt800
	 */
	public char[]  getIssAmt800String() {
	     return getCharArray(beginIssAmt800,ISS_AMT_800_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean issAmt800IsNumeric() {
	    return isNumeric(beginIssAmt800
	                    ,beginIssAmt800 + ISS_AMT_800_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int ISS_AMT_800_LEN = 12;
  	/**
	 * serializeIssAmt800
	 */
	protected void serializeIssAmt800(long issAmt800) {
		 putNumber(beginIssAmt800,issAmt800,ISS_AMT_800_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localIssAmt800Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeIssAmt800
	 */
   	protected  long serializeIssAmt800(char[] value) {
	    long  issAmt800;
	    if(value.length >0 && value.length!= 12)
            value = new String(value).trim().toCharArray();
	    if (value.length < 12) value = pad(12, value, ' ', LEFT_PAD);
	    else if (value.length > 12) value = substring(value,0,12);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    issAmt800 = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(12,value,false/*isSigned?*/)
		       ,beginIssAmt800
		       ,12
		      );
		 localIssAmt800Counter = shareString.getSerializedField().getModifiedCounter();
		return  issAmt800;
    }

   protected long checkIssAmt800MaxLimit(long number) {

        return checkMaxLimit(number , MAX_1T/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshIssAmt800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshIssAmt800() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginIssAmt800
			                 ,ISS_AMT_800_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("issAmt800", beginIssAmt800,ISS_AMT_800_LEN);
    }
   	}
     int localMcAmt800Counter = -1;
     public boolean isMcAmt800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMcAmt800Counter != sharedCounter;
         localMcAmt800Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of mcAmt800
	 *	@return mcAmt800
	 */
	public char[]  getMcAmt800String() {
	     return getCharArray(beginMcAmt800,MC_AMT_800_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean mcAmt800IsNumeric() {
	    return isNumeric(beginMcAmt800
	                    ,beginMcAmt800 + MC_AMT_800_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int MC_AMT_800_LEN = 12;
  	/**
	 * serializeMcAmt800
	 */
	protected void serializeMcAmt800(long mcAmt800) {
		 putNumber(beginMcAmt800,mcAmt800,MC_AMT_800_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localMcAmt800Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeMcAmt800
	 */
   	protected  long serializeMcAmt800(char[] value) {
	    long  mcAmt800;
	    if(value.length >0 && value.length!= 12)
            value = new String(value).trim().toCharArray();
	    if (value.length < 12) value = pad(12, value, ' ', LEFT_PAD);
	    else if (value.length > 12) value = substring(value,0,12);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    mcAmt800 = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(12,value,false/*isSigned?*/)
		       ,beginMcAmt800
		       ,12
		      );
		 localMcAmt800Counter = shareString.getSerializedField().getModifiedCounter();
		return  mcAmt800;
    }

   protected long checkMcAmt800MaxLimit(long number) {

        return checkMaxLimit(number , MAX_1T/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshMcAmt800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshMcAmt800() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginMcAmt800
			                 ,MC_AMT_800_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("mcAmt800", beginMcAmt800,MC_AMT_800_LEN);
    }
   	}
     int localMerchAmt800Counter = -1;
     public boolean isMerchAmt800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMerchAmt800Counter != sharedCounter;
         localMerchAmt800Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of merchAmt800
	 *	@return merchAmt800
	 */
	public char[]  getMerchAmt800String() {
	     return getCharArray(beginMerchAmt800,MERCH_AMT_800_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean merchAmt800IsNumeric() {
	    return isNumeric(beginMerchAmt800
	                    ,beginMerchAmt800 + MERCH_AMT_800_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int MERCH_AMT_800_LEN = 12;
  	/**
	 * serializeMerchAmt800
	 */
	protected void serializeMerchAmt800(long merchAmt800) {
		 putNumber(beginMerchAmt800,merchAmt800,MERCH_AMT_800_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localMerchAmt800Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeMerchAmt800
	 */
   	protected  long serializeMerchAmt800(char[] value) {
	    long  merchAmt800;
	    if(value.length >0 && value.length!= 12)
            value = new String(value).trim().toCharArray();
	    if (value.length < 12) value = pad(12, value, ' ', LEFT_PAD);
	    else if (value.length > 12) value = substring(value,0,12);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    merchAmt800 = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(12,value,false/*isSigned?*/)
		       ,beginMerchAmt800
		       ,12
		      );
		 localMerchAmt800Counter = shareString.getSerializedField().getModifiedCounter();
		return  merchAmt800;
    }

   protected long checkMerchAmt800MaxLimit(long number) {

        return checkMaxLimit(number , MAX_1T/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshMerchAmt800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshMerchAmt800() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginMerchAmt800
			                 ,MERCH_AMT_800_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("merchAmt800", beginMerchAmt800,MERCH_AMT_800_LEN);
    }
   	}
     int localRcvr8001740Counter = -1;
     public boolean isRcvr8001740Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRcvr8001740Counter != sharedCounter;
         localRcvr8001740Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of rcvr8001740
	 *	@return rcvr8001740
	 */
	public char[]  getRcvr8001740String() {
	     return getCharArray(beginRcvr8001740,RCVR_8001740_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean rcvr8001740IsNumeric() {
	    return isNumeric(beginRcvr8001740
	                    ,beginRcvr8001740 + RCVR_8001740_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int RCVR_8001740_LEN = 11;
  	/**
	 * serializeRcvr8001740
	 */
	protected void serializeRcvr8001740(long rcvr8001740) {
		 putNumber(beginRcvr8001740,rcvr8001740,RCVR_8001740_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localRcvr8001740Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeRcvr8001740
	 */
   	protected  long serializeRcvr8001740(char[] value) {
	    long  rcvr8001740;
	    if(value.length >0 && value.length!= 11)
            value = new String(value).trim().toCharArray();
	    if (value.length < 11) value = pad(11, value, ' ', LEFT_PAD);
	    else if (value.length > 11) value = substring(value,0,11);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    rcvr8001740 = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(11,value,false/*isSigned?*/)
		       ,beginRcvr8001740
		       ,11
		      );
		 localRcvr8001740Counter = shareString.getSerializedField().getModifiedCounter();
		return  rcvr8001740;
    }

   protected long checkRcvr8001740MaxLimit(long number) {

        return checkMaxLimit(number , MAX_100G/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshRcvr8001740 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshRcvr8001740() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginRcvr8001740
			                 ,RCVR_8001740_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("rcvr8001740", beginRcvr8001740,RCVR_8001740_LEN);
    }
   	}
     int localDe43s1800Counter = -1;
     public boolean isDe43s1800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDe43s1800Counter != sharedCounter;
         localDe43s1800Counter = sharedCounter; return hasModified;
     }
	protected static final int DE_43S_1800_LEN = 80;
	/**
	 * 	serialize this De43s1800
	 */
   protected void serializeDe43s1800(char[] de43s1800) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(de43s1800,0,getStringValue(),beginDe43s1800,DE_43S_1800_LEN);
       localDe43s1800Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDe43s1800Constraints(char[] value) {
   			return super.checkConstraints(value , 80 ,false, false);
   }
    /**
	 *	refreshDe43s1800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDe43s1800() {	 
   		return (substring(getStringValue(),beginDe43s1800,beginDe43s1800 + DE_43S_1800_LEN));
   	}
     int localDe43s1Len800Counter = -1;
     public boolean isDe43s1Len800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDe43s1Len800Counter != sharedCounter;
         localDe43s1Len800Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of de43s1Len800
	 *	@return de43s1Len800
	 */
	public char[]  getDe43s1Len800String() {
	     return getCharArray(beginDe43s1Len800,DE_43S_1_LEN_800_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean de43s1Len800IsNumeric() {
	    return isNumeric(beginDe43s1Len800
	                    ,beginDe43s1Len800 + DE_43S_1_LEN_800_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int DE_43S_1_LEN_800_LEN = 3;
  	/**
	 * serializeDe43s1Len800
	 */
	protected void serializeDe43s1Len800(int de43s1Len800) {
		 putNumber(beginDe43s1Len800,de43s1Len800,DE_43S_1_LEN_800_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localDe43s1Len800Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeDe43s1Len800
	 */
   	protected  int serializeDe43s1Len800(char[] value) {
	    int  de43s1Len800;
	    if(value.length >0 && value.length!= 3)
            value = new String(value).trim().toCharArray();
	    if (value.length < 3) value = pad(3, value, ' ', LEFT_PAD);
	    else if (value.length > 3) value = substring(value,0,3);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    de43s1Len800 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(3,value,false/*isSigned?*/)
		       ,beginDe43s1Len800
		       ,3
		      );
		 localDe43s1Len800Counter = shareString.getSerializedField().getModifiedCounter();
		return  de43s1Len800;
    }

   protected int checkDe43s1Len800MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_1000/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshDe43s1Len800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshDe43s1Len800() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginDe43s1Len800
			                 ,DE_43S_1_LEN_800_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("de43s1Len800", beginDe43s1Len800,DE_43S_1_LEN_800_LEN);
    }
   	}
     int localDe63s2800Counter = -1;
     public boolean isDe63s2800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDe63s2800Counter != sharedCounter;
         localDe63s2800Counter = sharedCounter; return hasModified;
     }
	protected static final int DE_63S_2800_LEN = 15;
	/**
	 * 	serialize this De63s2800
	 */
   protected void serializeDe63s2800(char[] de63s2800) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(de63s2800,0,getStringValue(),beginDe63s2800,DE_63S_2800_LEN);
       localDe63s2800Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDe63s2800Constraints(char[] value) {
   			return super.checkConstraints(value , 15 ,false, false);
   }
    /**
	 *	refreshDe63s2800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDe63s2800() {	 
   		return (substring(getStringValue(),beginDe63s2800,beginDe63s2800 + DE_63S_2800_LEN));
   	}
     int localFieldLen800Counter = -1;
     public boolean isFieldLen800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFieldLen800Counter != sharedCounter;
         localFieldLen800Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of fieldLen800
	 *	@return fieldLen800
	 */
	public char[]  getFieldLen800String() {
	     return getCharArray(beginFieldLen800,FIELD_LEN_800_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean fieldLen800IsNumeric() {
	    return isNumeric(beginFieldLen800
	                    ,beginFieldLen800 + FIELD_LEN_800_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int FIELD_LEN_800_LEN = 3;
  	/**
	 * serializeFieldLen800
	 */
	protected void serializeFieldLen800(int fieldLen800) {
		 putNumber(beginFieldLen800,fieldLen800,FIELD_LEN_800_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localFieldLen800Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeFieldLen800
	 */
   	protected  int serializeFieldLen800(char[] value) {
	    int  fieldLen800;
	    if(value.length >0 && value.length!= 3)
            value = new String(value).trim().toCharArray();
	    if (value.length < 3) value = pad(3, value, ' ', LEFT_PAD);
	    else if (value.length > 3) value = substring(value,0,3);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    fieldLen800 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(3,value,false/*isSigned?*/)
		       ,beginFieldLen800
		       ,3
		      );
		 localFieldLen800Counter = shareString.getSerializedField().getModifiedCounter();
		return  fieldLen800;
    }

   protected int checkFieldLen800MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_1000/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshFieldLen800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshFieldLen800() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginFieldLen800
			                 ,FIELD_LEN_800_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("fieldLen800", beginFieldLen800,FIELD_LEN_800_LEN);
    }
   	}
     int localFieldPtr800Counter = -1;
     public boolean isFieldPtr800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFieldPtr800Counter != sharedCounter;
         localFieldPtr800Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of fieldPtr800
	 *	@return fieldPtr800
	 */
	public char[]  getFieldPtr800String() {
	     return getCharArray(beginFieldPtr800,FIELD_PTR_800_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean fieldPtr800IsNumeric() {
	    return isNumeric(beginFieldPtr800
	                    ,beginFieldPtr800 + FIELD_PTR_800_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int FIELD_PTR_800_LEN = 3;
  	/**
	 * serializeFieldPtr800
	 */
	protected void serializeFieldPtr800(int fieldPtr800) {
		 putNumber(beginFieldPtr800,fieldPtr800,FIELD_PTR_800_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localFieldPtr800Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeFieldPtr800
	 */
   	protected  int serializeFieldPtr800(char[] value) {
	    int  fieldPtr800;
	    if(value.length >0 && value.length!= 3)
            value = new String(value).trim().toCharArray();
	    if (value.length < 3) value = pad(3, value, ' ', LEFT_PAD);
	    else if (value.length > 3) value = substring(value,0,3);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    fieldPtr800 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(3,value,false/*isSigned?*/)
		       ,beginFieldPtr800
		       ,3
		      );
		 localFieldPtr800Counter = shareString.getSerializedField().getModifiedCounter();
		return  fieldPtr800;
    }

   protected int checkFieldPtr800MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_1000/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshFieldPtr800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshFieldPtr800() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginFieldPtr800
			                 ,FIELD_PTR_800_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("fieldPtr800", beginFieldPtr800,FIELD_PTR_800_LEN);
    }
   	}
     int localFldStrt800Counter = -1;
     public boolean isFldStrt800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFldStrt800Counter != sharedCounter;
         localFldStrt800Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of fldStrt800
	 *	@return fldStrt800
	 */
	public char[]  getFldStrt800String() {
	     return getCharArray(beginFldStrt800,FLD_STRT_800_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean fldStrt800IsNumeric() {
	    return isNumeric(beginFldStrt800
	                    ,beginFldStrt800 + FLD_STRT_800_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int FLD_STRT_800_LEN = 5;
  	/**
	 * serializeFldStrt800
	 */
	protected void serializeFldStrt800(long fldStrt800) {
		 putNumber(beginFldStrt800,fldStrt800,FLD_STRT_800_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localFldStrt800Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeFldStrt800
	 */
   	protected  long serializeFldStrt800(char[] value) {
	    long  fldStrt800;
	    if(value.length >0 && value.length!= 5)
            value = new String(value).trim().toCharArray();
	    if (value.length < 5) value = pad(5, value, ' ', LEFT_PAD);
	    else if (value.length > 5) value = substring(value,0,5);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    fldStrt800 = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(5,value,false/*isSigned?*/)
		       ,beginFldStrt800
		       ,5
		      );
		 localFldStrt800Counter = shareString.getSerializedField().getModifiedCounter();
		return  fldStrt800;
    }

   protected long checkFldStrt800MaxLimit(long number) {

        return checkMaxLimit(number , MAX_100K/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshFldStrt800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshFldStrt800() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginFldStrt800
			                 ,FLD_STRT_800_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("fldStrt800", beginFldStrt800,FLD_STRT_800_LEN);
    }
   	}
     int localFieldVal800Counter = -1;
     public boolean isFieldVal800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFieldVal800Counter != sharedCounter;
         localFieldVal800Counter = sharedCounter; return hasModified;
     }
	protected static final int FIELD_VAL_800_LEN = 999;
	/**
	 * 	serialize this FieldVal800
	 */
   protected void serializeFieldVal800(char[] fieldVal800) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(fieldVal800,0,getStringValue(),beginFieldVal800,FIELD_VAL_800_LEN);
       localFieldVal800Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkFieldVal800Constraints(char[] value) {
   			return super.checkConstraints(value , 999 ,false, false);
   }
    /**
	 *	refreshFieldVal800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshFieldVal800() {	 
   		return (substring(getStringValue(),beginFieldVal800,beginFieldVal800 + FIELD_VAL_800_LEN));
   	}
     int localFileid800Counter = -1;
     public boolean isFileid800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFileid800Counter != sharedCounter;
         localFileid800Counter = sharedCounter; return hasModified;
     }
	protected static final int FILEID_800_LEN = 25;
	/**
	 * 	serialize this Fileid800
	 */
   protected void serializeFileid800(char[] fileid800) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(fileid800,0,getStringValue(),beginFileid800,FILEID_800_LEN);
       localFileid800Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkFileid800Constraints(char[] value) {
   			return super.checkConstraints(value , 25 ,false, false);
   }
    /**
	 *	refreshFileid800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshFileid800() {	 
   		return (substring(getStringValue(),beginFileid800,beginFileid800 + FILEID_800_LEN));
   	}
     int localFundOpt800Counter = -1;
     public boolean isFundOpt800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFundOpt800Counter != sharedCounter;
         localFundOpt800Counter = sharedCounter; return hasModified;
     }
	protected static final int FUND_OPT_800_LEN = 1;
	/**
	 * 	serialize this FundOpt800
	 */
   protected void serializeFundOpt800(char[] fundOpt800) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(fundOpt800,0,getStringValue(),beginFundOpt800,FUND_OPT_800_LEN);
       localFundOpt800Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkFundOpt800Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshFundOpt800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshFundOpt800() {	 
   		return (substring(getStringValue(),beginFundOpt800,beginFundOpt800 + FUND_OPT_800_LEN));
   	}
     int localInternalMbrId800Counter = -1;
     public boolean isInternalMbrId800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localInternalMbrId800Counter != sharedCounter;
         localInternalMbrId800Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of internalMbrId800
	 *	@return internalMbrId800
	 */
	public char[]  getInternalMbrId800String() {
	     return getCharArray(beginInternalMbrId800,INTERNAL_MBR_ID_800_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean internalMbrId800IsNumeric() {
	    return isNumeric(beginInternalMbrId800
	                    ,beginInternalMbrId800 + INTERNAL_MBR_ID_800_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int INTERNAL_MBR_ID_800_LEN = 11;
  	/**
	 * serializeInternalMbrId800
	 */
	protected void serializeInternalMbrId800(long internalMbrId800) {
		 putNumber(beginInternalMbrId800,internalMbrId800,INTERNAL_MBR_ID_800_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localInternalMbrId800Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeInternalMbrId800
	 */
   	protected  long serializeInternalMbrId800(char[] value) {
	    long  internalMbrId800;
	    if(value.length >0 && value.length!= 11)
            value = new String(value).trim().toCharArray();
	    if (value.length < 11) value = pad(11, value, ' ', LEFT_PAD);
	    else if (value.length > 11) value = substring(value,0,11);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    internalMbrId800 = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(11,value,false/*isSigned?*/)
		       ,beginInternalMbrId800
		       ,11
		      );
		 localInternalMbrId800Counter = shareString.getSerializedField().getModifiedCounter();
		return  internalMbrId800;
    }

   protected long checkInternalMbrId800MaxLimit(long number) {

        return checkMaxLimit(number , MAX_100G/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshInternalMbrId800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshInternalMbrId800() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginInternalMbrId800
			                 ,INTERNAL_MBR_ID_800_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("internalMbrId800", beginInternalMbrId800,INTERNAL_MBR_ID_800_LEN);
    }
   	}
     int localIndent800Counter = -1;
     public boolean isIndent800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIndent800Counter != sharedCounter;
         localIndent800Counter = sharedCounter; return hasModified;
     }
	protected static final int INDENT_800_LEN = 12;
	/**
	 * 	serialize this Indent800
	 */
   protected void serializeIndent800(char[] indent800) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(indent800,0,getStringValue(),beginIndent800,INDENT_800_LEN);
       localIndent800Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIndent800Constraints(char[] value) {
   			return super.checkConstraints(value , 12 ,false, false);
   }
    /**
	 *	refreshIndent800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIndent800() {	 
   		return (substring(getStringValue(),beginIndent800,beginIndent800 + INDENT_800_LEN));
   	}
     int localIlvl800Counter = -1;
     public boolean isIlvl800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIlvl800Counter != sharedCounter;
         localIlvl800Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ilvl800
	 *	@return ilvl800
	 */
	public char[]  getIlvl800String() {
	     return getCharArray(beginIlvl800,ILVL_800_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ilvl800IsNumeric() {
	    return isNumeric(beginIlvl800
	                    ,beginIlvl800 + ILVL_800_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int ILVL_800_LEN = 2;
  	/**
	 * serializeIlvl800
	 */
	protected void serializeIlvl800(int ilvl800) {
		 putNumber(beginIlvl800,ilvl800,ILVL_800_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localIlvl800Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeIlvl800
	 */
   	protected  int serializeIlvl800(char[] value) {
	    int  ilvl800;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ilvl800 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginIlvl800
		       ,2
		      );
		 localIlvl800Counter = shareString.getSerializedField().getModifiedCounter();
		return  ilvl800;
    }

   protected int checkIlvl800MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshIlvl800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshIlvl800() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginIlvl800
			                 ,ILVL_800_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ilvl800", beginIlvl800,ILVL_800_LEN);
    }
   	}
     int localJulianDate800Counter = -1;
     public boolean isJulianDate800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localJulianDate800Counter != sharedCounter;
         localJulianDate800Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of julianDate800
	 *	@return julianDate800
	 */
	public char[]  getJulianDate800String() {
	     return getCharArray(beginJulianDate800,JULIAN_DATE_800_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean julianDate800IsNumeric() {
	    return isNumeric(beginJulianDate800
	                    ,beginJulianDate800 + JULIAN_DATE_800_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int JULIAN_DATE_800_LEN = 5;
  	/**
	 * serializeJulianDate800
	 */
	protected void serializeJulianDate800(long julianDate800) {
		 putNumber(beginJulianDate800,julianDate800,JULIAN_DATE_800_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localJulianDate800Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeJulianDate800
	 */
   	protected  long serializeJulianDate800(char[] value) {
	    long  julianDate800;
	    if(value.length >0 && value.length!= 5)
            value = new String(value).trim().toCharArray();
	    if (value.length < 5) value = pad(5, value, ' ', LEFT_PAD);
	    else if (value.length > 5) value = substring(value,0,5);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    julianDate800 = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(5,value,false/*isSigned?*/)
		       ,beginJulianDate800
		       ,5
		      );
		 localJulianDate800Counter = shareString.getSerializedField().getModifiedCounter();
		return  julianDate800;
    }

   protected long checkJulianDate800MaxLimit(long number) {

        return checkMaxLimit(number , MAX_100K/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshJulianDate800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshJulianDate800() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginJulianDate800
			                 ,JULIAN_DATE_800_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("julianDate800", beginJulianDate800,JULIAN_DATE_800_LEN);
    }
   	}
     int localMccCd800Counter = -1;
     public boolean isMccCd800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMccCd800Counter != sharedCounter;
         localMccCd800Counter = sharedCounter; return hasModified;
     }
	protected static final int MCC_CD_800_LEN = 4;
	/**
	 * 	serialize this MccCd800
	 */
   protected void serializeMccCd800(char[] mccCd800) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(mccCd800,0,getStringValue(),beginMccCd800,MCC_CD_800_LEN);
       localMccCd800Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkMccCd800Constraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshMccCd800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshMccCd800() {	 
   		return (substring(getStringValue(),beginMccCd800,beginMccCd800 + MCC_CD_800_LEN));
   	}
     int localMccCdLen800Counter = -1;
     public boolean isMccCdLen800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMccCdLen800Counter != sharedCounter;
         localMccCdLen800Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of mccCdLen800
	 *	@return mccCdLen800
	 */
	public char[]  getMccCdLen800String() {
	     return getCharArray(beginMccCdLen800,MCC_CD_LEN_800_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean mccCdLen800IsNumeric() {
	    return isNumeric(beginMccCdLen800
	                    ,beginMccCdLen800 + MCC_CD_LEN_800_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int MCC_CD_LEN_800_LEN = 3;
  	/**
	 * serializeMccCdLen800
	 */
	protected void serializeMccCdLen800(int mccCdLen800) {
		 putNumber(beginMccCdLen800,mccCdLen800,MCC_CD_LEN_800_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localMccCdLen800Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeMccCdLen800
	 */
   	protected  int serializeMccCdLen800(char[] value) {
	    int  mccCdLen800;
	    if(value.length >0 && value.length!= 3)
            value = new String(value).trim().toCharArray();
	    if (value.length < 3) value = pad(3, value, ' ', LEFT_PAD);
	    else if (value.length > 3) value = substring(value,0,3);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    mccCdLen800 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(3,value,false/*isSigned?*/)
		       ,beginMccCdLen800
		       ,3
		      );
		 localMccCdLen800Counter = shareString.getSerializedField().getModifiedCounter();
		return  mccCdLen800;
    }

   protected int checkMccCdLen800MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_1000/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshMccCdLen800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshMccCdLen800() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginMccCdLen800
			                 ,MCC_CD_LEN_800_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("mccCdLen800", beginMccCdLen800,MCC_CD_LEN_800_LEN);
    }
   	}
     int localMerchId800Counter = -1;
     public boolean isMerchId800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMerchId800Counter != sharedCounter;
         localMerchId800Counter = sharedCounter; return hasModified;
     }
	protected static final int MERCH_ID_800_LEN = 15;
	/**
	 * 	serialize this MerchId800
	 */
   protected void serializeMerchId800(char[] merchId800) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(merchId800,0,getStringValue(),beginMerchId800,MERCH_ID_800_LEN);
       localMerchId800Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkMerchId800Constraints(char[] value) {
   			return super.checkConstraints(value , 15 ,false, false);
   }
    /**
	 *	refreshMerchId800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshMerchId800() {	 
   		return (substring(getStringValue(),beginMerchId800,beginMerchId800 + MERCH_ID_800_LEN));
   	}
     int localMerchIdLen800Counter = -1;
     public boolean isMerchIdLen800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMerchIdLen800Counter != sharedCounter;
         localMerchIdLen800Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of merchIdLen800
	 *	@return merchIdLen800
	 */
	public char[]  getMerchIdLen800String() {
	     return getCharArray(beginMerchIdLen800,MERCH_ID_LEN_800_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean merchIdLen800IsNumeric() {
	    return isNumeric(beginMerchIdLen800
	                    ,beginMerchIdLen800 + MERCH_ID_LEN_800_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int MERCH_ID_LEN_800_LEN = 3;
  	/**
	 * serializeMerchIdLen800
	 */
	protected void serializeMerchIdLen800(int merchIdLen800) {
		 putNumber(beginMerchIdLen800,merchIdLen800,MERCH_ID_LEN_800_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localMerchIdLen800Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeMerchIdLen800
	 */
   	protected  int serializeMerchIdLen800(char[] value) {
	    int  merchIdLen800;
	    if(value.length >0 && value.length!= 3)
            value = new String(value).trim().toCharArray();
	    if (value.length < 3) value = pad(3, value, ' ', LEFT_PAD);
	    else if (value.length > 3) value = substring(value,0,3);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    merchIdLen800 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(3,value,false/*isSigned?*/)
		       ,beginMerchIdLen800
		       ,3
		      );
		 localMerchIdLen800Counter = shareString.getSerializedField().getModifiedCounter();
		return  merchIdLen800;
    }

   protected int checkMerchIdLen800MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_1000/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshMerchIdLen800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshMerchIdLen800() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginMerchIdLen800
			                 ,MERCH_ID_LEN_800_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("merchIdLen800", beginMerchIdLen800,MERCH_ID_LEN_800_LEN);
    }
   	}
     int localNewElem800Counter = -1;
     public boolean isNewElem800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localNewElem800Counter != sharedCounter;
         localNewElem800Counter = sharedCounter; return hasModified;
     }
	protected static final int NEW_ELEM_800_LEN = 13;
	/**
	 * 	serialize this NewElem800
	 */
   protected void serializeNewElem800(char[] newElem800) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(newElem800,0,getStringValue(),beginNewElem800,NEW_ELEM_800_LEN);
       localNewElem800Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkNewElem800Constraints(char[] value) {
   			return super.checkConstraints(value , 13 ,false, false);
   }
    /**
	 *	refreshNewElem800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshNewElem800() {	 
   		return (substring(getStringValue(),beginNewElem800,beginNewElem800 + NEW_ELEM_800_LEN));
   	}
     int localPan800Counter = -1;
     public boolean isPan800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPan800Counter != sharedCounter;
         localPan800Counter = sharedCounter; return hasModified;
     }
	protected static final int PAN_800_LEN = 16;
	/**
	 * 	serialize this Pan800
	 */
   protected void serializePan800(char[] pan800) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(pan800,0,getStringValue(),beginPan800,PAN_800_LEN);
       localPan800Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkPan800Constraints(char[] value) {
   			return super.checkConstraints(value , 16 ,false, false);
   }
    /**
	 *	refreshPan800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshPan800() {	 
   		return (substring(getStringValue(),beginPan800,beginPan800 + PAN_800_LEN));
   	}
     int localPanLen800Counter = -1;
     public boolean isPanLen800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPanLen800Counter != sharedCounter;
         localPanLen800Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of panLen800
	 *	@return panLen800
	 */
	public char[]  getPanLen800String() {
	     return getCharArray(beginPanLen800,PAN_LEN_800_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean panLen800IsNumeric() {
	    return isNumeric(beginPanLen800
	                    ,beginPanLen800 + PAN_LEN_800_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int PAN_LEN_800_LEN = 3;
  	/**
	 * serializePanLen800
	 */
	protected void serializePanLen800(int panLen800) {
		 putNumber(beginPanLen800,panLen800,PAN_LEN_800_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localPanLen800Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializePanLen800
	 */
   	protected  int serializePanLen800(char[] value) {
	    int  panLen800;
	    if(value.length >0 && value.length!= 3)
            value = new String(value).trim().toCharArray();
	    if (value.length < 3) value = pad(3, value, ' ', LEFT_PAD);
	    else if (value.length > 3) value = substring(value,0,3);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    panLen800 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(3,value,false/*isSigned?*/)
		       ,beginPanLen800
		       ,3
		      );
		 localPanLen800Counter = shareString.getSerializedField().getModifiedCounter();
		return  panLen800;
    }

   protected int checkPanLen800MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_1000/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshPanLen800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshPanLen800() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginPanLen800
			                 ,PAN_LEN_800_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("panLen800", beginPanLen800,PAN_LEN_800_LEN);
    }
   	}
     int localPtrVal800Counter = -1;
     public boolean isPtrVal800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPtrVal800Counter != sharedCounter;
         localPtrVal800Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ptrVal800
	 *	@return ptrVal800
	 */
	public char[]  getPtrVal800String() {
	     return getCharArray(beginPtrVal800,PTR_VAL_800_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ptrVal800IsNumeric() {
	    return isNumeric(beginPtrVal800
	                    ,beginPtrVal800 + PTR_VAL_800_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int PTR_VAL_800_LEN = 8;
  	/**
	 * serializePtrVal800
	 */
	protected void serializePtrVal800(long ptrVal800) {
		 putNumber(beginPtrVal800,ptrVal800,PTR_VAL_800_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localPtrVal800Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializePtrVal800
	 */
   	protected  long serializePtrVal800(char[] value) {
	    long  ptrVal800;
	    if(value.length >0 && value.length!= 8)
            value = new String(value).trim().toCharArray();
	    if (value.length < 8) value = pad(8, value, ' ', LEFT_PAD);
	    else if (value.length > 8) value = substring(value,0,8);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ptrVal800 = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(8,value,false/*isSigned?*/)
		       ,beginPtrVal800
		       ,8
		      );
		 localPtrVal800Counter = shareString.getSerializedField().getModifiedCounter();
		return  ptrVal800;
    }

   protected long checkPtrVal800MaxLimit(long number) {

        return checkMaxLimit(number , MAX_100M/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshPtrVal800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshPtrVal800() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginPtrVal800
			                 ,PTR_VAL_800_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ptrVal800", beginPtrVal800,PTR_VAL_800_LEN);
    }
   	}
     int localRandom800Counter = -1;
     
     public boolean isRandom800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRandom800Counter != sharedCounter;
         localRandom800Counter = sharedCounter; return hasModified; 
     }  	
	
	 /**
	 *	Returns String value of random800
	 *	@return random800
	 */
	public char[]  getRandom800String() {
	    return getCharArray(beginRandom800,RANDOM_800_LEN);
	}

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean random800IsNumeric() {
		    return isNumeric(beginRandom800
	                    ,beginRandom800 + RANDOM_800_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
  protected  static final int RANDOM_800_LEN = 8;
  protected  static final int RANDOM_800_SCALE = 7;

   protected BigDecimal checkRandom800MaxLimit(BigDecimal number) {
		return checkMaxLimit(number,7/*scale*/,8/*precision*/);
   }

  	/**
	 * serializeRandom800
	 */
	protected void serializeRandom800(BigDecimal random800) {
	       putNumber(beginRandom800,random800,RANDOM_800_LEN,RANDOM_800_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localRandom800Counter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeRandom800
	 */
   	protected  BigDecimal serializeRandom800(char[] value) throws CFException {
        if (value.length < 8) value = pad(8, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(8,value,false/*isSigned?*/)
		       ,beginRandom800
		       ,8
		      );		 localRandom800Counter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,RANDOM_800_LEN,RANDOM_800_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("random800", beginRandom800,RANDOM_800_LEN);
    	}
    }
    /**
	 *	refreshRandom800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshRandom800() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginRandom800
			            ,RANDOM_800_LEN
			            ,RANDOM_800_SCALE
			            ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 			        
			        );
	} catch(Exception ex) {
    	throw getSoc7ABend("random800", beginRandom800,RANDOM_800_LEN);
    }
   	}
     int localRevInd800Counter = -1;
     public boolean isRevInd800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRevInd800Counter != sharedCounter;
         localRevInd800Counter = sharedCounter; return hasModified;
     }
	protected static final int REV_IND_800_LEN = 1;
	/**
	 * 	serialize this RevInd800
	 */
   protected void serializeRevInd800(char[] revInd800) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(revInd800,0,getStringValue(),beginRevInd800,REV_IND_800_LEN);
       localRevInd800Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkRevInd800Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshRevInd800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshRevInd800() {	 
   		return (substring(getStringValue(),beginRevInd800,beginRevInd800 + REV_IND_800_LEN));
   	}
     int localRevIndLen800Counter = -1;
     public boolean isRevIndLen800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRevIndLen800Counter != sharedCounter;
         localRevIndLen800Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of revIndLen800
	 *	@return revIndLen800
	 */
	public char[]  getRevIndLen800String() {
	     return getCharArray(beginRevIndLen800,REV_IND_LEN_800_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean revIndLen800IsNumeric() {
	    return isNumeric(beginRevIndLen800
	                    ,beginRevIndLen800 + REV_IND_LEN_800_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int REV_IND_LEN_800_LEN = 3;
  	/**
	 * serializeRevIndLen800
	 */
	protected void serializeRevIndLen800(int revIndLen800) {
		 putNumber(beginRevIndLen800,revIndLen800,REV_IND_LEN_800_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localRevIndLen800Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeRevIndLen800
	 */
   	protected  int serializeRevIndLen800(char[] value) {
	    int  revIndLen800;
	    if(value.length >0 && value.length!= 3)
            value = new String(value).trim().toCharArray();
	    if (value.length < 3) value = pad(3, value, ' ', LEFT_PAD);
	    else if (value.length > 3) value = substring(value,0,3);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    revIndLen800 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(3,value,false/*isSigned?*/)
		       ,beginRevIndLen800
		       ,3
		      );
		 localRevIndLen800Counter = shareString.getSerializedField().getModifiedCounter();
		return  revIndLen800;
    }

   protected int checkRevIndLen800MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_1000/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshRevIndLen800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshRevIndLen800() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginRevIndLen800
			                 ,REV_IND_LEN_800_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("revIndLen800", beginRevIndLen800,REV_IND_LEN_800_LEN);
    }
   	}
     int localRewardAmt800Counter = -1;
     public boolean isRewardAmt800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRewardAmt800Counter != sharedCounter;
         localRewardAmt800Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of rewardAmt800
	 *	@return rewardAmt800
	 */
	public char[]  getRewardAmt800String() {
	     return getCharArray(beginRewardAmt800,REWARD_AMT_800_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean rewardAmt800IsNumeric() {
	    return isNumeric(beginRewardAmt800
	                    ,beginRewardAmt800 + REWARD_AMT_800_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int REWARD_AMT_800_LEN = 12;
  	/**
	 * serializeRewardAmt800
	 */
	protected void serializeRewardAmt800(long rewardAmt800) {
		 putNumber(beginRewardAmt800,rewardAmt800,REWARD_AMT_800_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localRewardAmt800Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeRewardAmt800
	 */
   	protected  long serializeRewardAmt800(char[] value) {
	    long  rewardAmt800;
	    if(value.length >0 && value.length!= 12)
            value = new String(value).trim().toCharArray();
	    if (value.length < 12) value = pad(12, value, ' ', LEFT_PAD);
	    else if (value.length > 12) value = substring(value,0,12);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    rewardAmt800 = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(12,value,false/*isSigned?*/)
		       ,beginRewardAmt800
		       ,12
		      );
		 localRewardAmt800Counter = shareString.getSerializedField().getModifiedCounter();
		return  rewardAmt800;
    }

   protected long checkRewardAmt800MaxLimit(long number) {

        return checkMaxLimit(number , MAX_1T/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshRewardAmt800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshRewardAmt800() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginRewardAmt800
			                 ,REWARD_AMT_800_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("rewardAmt800", beginRewardAmt800,REWARD_AMT_800_LEN);
    }
   	}
     int localRewardPgmId800Counter = -1;
     public boolean isRewardPgmId800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRewardPgmId800Counter != sharedCounter;
         localRewardPgmId800Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of rewardPgmId800
	 *	@return rewardPgmId800
	 */
	public char[]  getRewardPgmId800String() {
	     return getCharArray(beginRewardPgmId800,REWARD_PGM_ID_800_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean rewardPgmId800IsNumeric() {
	    return isNumeric(beginRewardPgmId800
	                    ,beginRewardPgmId800 + REWARD_PGM_ID_800_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int REWARD_PGM_ID_800_LEN = 11;
  	/**
	 * serializeRewardPgmId800
	 */
	protected void serializeRewardPgmId800(long rewardPgmId800) {
		 putNumber(beginRewardPgmId800,rewardPgmId800,REWARD_PGM_ID_800_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localRewardPgmId800Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeRewardPgmId800
	 */
   	protected  long serializeRewardPgmId800(char[] value) {
	    long  rewardPgmId800;
	    if(value.length >0 && value.length!= 11)
            value = new String(value).trim().toCharArray();
	    if (value.length < 11) value = pad(11, value, ' ', LEFT_PAD);
	    else if (value.length > 11) value = substring(value,0,11);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    rewardPgmId800 = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(11,value,false/*isSigned?*/)
		       ,beginRewardPgmId800
		       ,11
		      );
		 localRewardPgmId800Counter = shareString.getSerializedField().getModifiedCounter();
		return  rewardPgmId800;
    }

   protected long checkRewardPgmId800MaxLimit(long number) {

        return checkMaxLimit(number , MAX_100G/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshRewardPgmId800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshRewardPgmId800() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginRewardPgmId800
			                 ,REWARD_PGM_ID_800_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("rewardPgmId800", beginRewardPgmId800,REWARD_PGM_ID_800_LEN);
    }
   	}
     int localSaveEntry800Counter = -1;
     public boolean isSaveEntry800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSaveEntry800Counter != sharedCounter;
         localSaveEntry800Counter = sharedCounter; return hasModified;
     }
	protected static final int SAVE_ENTRY_800_LEN = 1015;
	/**
	 * 	serialize this SaveEntry800
	 */
   protected void serializeSaveEntry800(char[] saveEntry800) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(saveEntry800,0,getStringValue(),beginSaveEntry800,SAVE_ENTRY_800_LEN);
       localSaveEntry800Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSaveEntry800Constraints(char[] value) {
   			return super.checkConstraints(value , 1015 ,false, false);
   }
    /**
	 *	refreshSaveEntry800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSaveEntry800() {	 
   		return (substring(getStringValue(),beginSaveEntry800,beginSaveEntry800 + SAVE_ENTRY_800_LEN));
   	}
     int localSaveTagNum800Counter = -1;
     public boolean isSaveTagNum800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSaveTagNum800Counter != sharedCounter;
         localSaveTagNum800Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of saveTagNum800
	 *	@return saveTagNum800
	 */
	public char[]  getSaveTagNum800String() {
	     return getCharArray(beginSaveTagNum800,SAVE_TAG_NUM_800_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean saveTagNum800IsNumeric() {
	    return isNumeric(beginSaveTagNum800
	                    ,beginSaveTagNum800 + SAVE_TAG_NUM_800_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int SAVE_TAG_NUM_800_LEN = 4;
  	/**
	 * serializeSaveTagNum800
	 */
	protected void serializeSaveTagNum800(int saveTagNum800) {
		 putNumber(beginSaveTagNum800,saveTagNum800,SAVE_TAG_NUM_800_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localSaveTagNum800Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeSaveTagNum800
	 */
   	protected  int serializeSaveTagNum800(char[] value) {
	    int  saveTagNum800;
	    if(value.length >0 && value.length!= 4)
            value = new String(value).trim().toCharArray();
	    if (value.length < 4) value = pad(4, value, ' ', LEFT_PAD);
	    else if (value.length > 4) value = substring(value,0,4);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    saveTagNum800 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(4,value,false/*isSigned?*/)
		       ,beginSaveTagNum800
		       ,4
		      );
		 localSaveTagNum800Counter = shareString.getSerializedField().getModifiedCounter();
		return  saveTagNum800;
    }

   protected int checkSaveTagNum800MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10K/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshSaveTagNum800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshSaveTagNum800() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginSaveTagNum800
			                 ,SAVE_TAG_NUM_800_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("saveTagNum800", beginSaveTagNum800,SAVE_TAG_NUM_800_LEN);
    }
   	}
     int localSeed800Counter = -1;
     public boolean isSeed800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSeed800Counter != sharedCounter;
         localSeed800Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of seed800
	 *	@return seed800
	 */
	public char[]  getSeed800String() {
	     return getCharArray(beginSeed800,SEED_800_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean seed800IsNumeric() {
	    return isNumeric(beginSeed800
	                    ,beginSeed800 + SEED_800_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int SEED_800_LEN = 8;
  	/**
	 * serializeSeed800
	 */
	protected void serializeSeed800(long seed800) {
		 putNumber(beginSeed800,seed800,SEED_800_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localSeed800Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeSeed800
	 */
   	protected  long serializeSeed800(char[] value) {
	    long  seed800;
	    if(value.length >0 && value.length!= 8)
            value = new String(value).trim().toCharArray();
	    if (value.length < 8) value = pad(8, value, ' ', LEFT_PAD);
	    else if (value.length > 8) value = substring(value,0,8);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    seed800 = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(8,value,false/*isSigned?*/)
		       ,beginSeed800
		       ,8
		      );
		 localSeed800Counter = shareString.getSerializedField().getModifiedCounter();
		return  seed800;
    }

   protected long checkSeed800MaxLimit(long number) {

        return checkMaxLimit(number , MAX_100M/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshSeed800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshSeed800() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginSeed800
			                 ,SEED_800_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("seed800", beginSeed800,SEED_800_LEN);
    }
   	}
     int localSender800Counter = -1;
     public boolean isSender800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSender800Counter != sharedCounter;
         localSender800Counter = sharedCounter; return hasModified;
     }
	protected static final int SENDER_800_LEN = 11;
	/**
	 * 	serialize this Sender800
	 */
   protected void serializeSender800(char[] sender800) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sender800,0,getStringValue(),beginSender800,SENDER_800_LEN);
       localSender800Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSender800Constraints(char[] value) {
   			return super.checkConstraints(value , 11 ,false, false);
   }
    /**
	 *	refreshSender800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSender800() {	 
   		return (substring(getStringValue(),beginSender800,beginSender800 + SENDER_800_LEN));
   	}
     int localSeqNum8800Counter = -1;
     public boolean isSeqNum8800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSeqNum8800Counter != sharedCounter;
         localSeqNum8800Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of seqNum8800
	 *	@return seqNum8800
	 */
	public char[]  getSeqNum8800String() {
	     return getCharArray(beginSeqNum8800,SEQ_NUM_8800_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean seqNum8800IsNumeric() {
	    return isNumeric(beginSeqNum8800
	                    ,beginSeqNum8800 + SEQ_NUM_8800_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int SEQ_NUM_8800_LEN = 8;
  	/**
	 * serializeSeqNum8800
	 */
	protected void serializeSeqNum8800(long seqNum8800) {
		 putNumber(beginSeqNum8800,seqNum8800,SEQ_NUM_8800_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localSeqNum8800Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeSeqNum8800
	 */
   	protected  long serializeSeqNum8800(char[] value) {
	    long  seqNum8800;
	    if(value.length >0 && value.length!= 8)
            value = new String(value).trim().toCharArray();
	    if (value.length < 8) value = pad(8, value, ' ', LEFT_PAD);
	    else if (value.length > 8) value = substring(value,0,8);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    seqNum8800 = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(8,value,false/*isSigned?*/)
		       ,beginSeqNum8800
		       ,8
		      );
		 localSeqNum8800Counter = shareString.getSerializedField().getModifiedCounter();
		return  seqNum8800;
    }

   protected long checkSeqNum8800MaxLimit(long number) {

        return checkMaxLimit(number , MAX_100M/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshSeqNum8800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshSeqNum8800() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginSeqNum8800
			                 ,SEQ_NUM_8800_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("seqNum8800", beginSeqNum8800,SEQ_NUM_8800_LEN);
    }
   	}
     int localSeqNumP0137800Counter = -1;
     public boolean isSeqNumP0137800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSeqNumP0137800Counter != sharedCounter;
         localSeqNumP0137800Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of seqNumP0137800
	 *	@return seqNumP0137800
	 */
	public char[]  getSeqNumP0137800String() {
	     return getCharArray(beginSeqNumP0137800,SEQ_NUM_P_0137800_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean seqNumP0137800IsNumeric() {
	    return isNumeric(beginSeqNumP0137800
	                    ,beginSeqNumP0137800 + SEQ_NUM_P_0137800_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int SEQ_NUM_P_0137800_LEN = 8;
  	/**
	 * serializeSeqNumP0137800
	 */
	protected void serializeSeqNumP0137800(long seqNumP0137800) {
		 putNumber(beginSeqNumP0137800,seqNumP0137800,SEQ_NUM_P_0137800_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localSeqNumP0137800Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeSeqNumP0137800
	 */
   	protected  long serializeSeqNumP0137800(char[] value) {
	    long  seqNumP0137800;
	    if(value.length >0 && value.length!= 8)
            value = new String(value).trim().toCharArray();
	    if (value.length < 8) value = pad(8, value, ' ', LEFT_PAD);
	    else if (value.length > 8) value = substring(value,0,8);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    seqNumP0137800 = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(8,value,false/*isSigned?*/)
		       ,beginSeqNumP0137800
		       ,8
		      );
		 localSeqNumP0137800Counter = shareString.getSerializedField().getModifiedCounter();
		return  seqNumP0137800;
    }

   protected long checkSeqNumP0137800MaxLimit(long number) {

        return checkMaxLimit(number , MAX_100M/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshSeqNumP0137800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshSeqNumP0137800() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginSeqNumP0137800
			                 ,SEQ_NUM_P_0137800_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("seqNumP0137800", beginSeqNumP0137800,SEQ_NUM_P_0137800_LEN);
    }
   	}
         int localSys101Rdw800Counter = -1;
         public boolean isSys101Rdw800Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSys101Rdw800Counter != sharedCounter;
            localSys101Rdw800Counter = sharedCounter; return hasModified; 
         }
   protected static final int SYS_101_RDW_800_LEN = 4;
  	/**
	 * serializeSys101Rdw800
	 */
	protected void serializeSys101Rdw800(long sys101Rdw800) {
           replaceValue( //  save the value as string
                   getBinaryString( sys101Rdw800,SYS_101_RDW_800_LEN)
                  ,beginSys101Rdw800
                  ,SYS_101_RDW_800_LEN
                 );
            localSys101Rdw800Counter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected long checkSys101Rdw800MaxLimit(long number) {
        return checkMaxLimit(number, false/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshSys101Rdw800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshSys101Rdw800() {	 
			return (getUnsignedInt(beginSys101Rdw800));
   	}
         int localSys201Rdw800Counter = -1;
         public boolean isSys201Rdw800Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSys201Rdw800Counter != sharedCounter;
            localSys201Rdw800Counter = sharedCounter; return hasModified; 
         }
   protected static final int SYS_201_RDW_800_LEN = 4;
  	/**
	 * serializeSys201Rdw800
	 */
	protected void serializeSys201Rdw800(long sys201Rdw800) {
           replaceValue( //  save the value as string
                   getBinaryString( sys201Rdw800,SYS_201_RDW_800_LEN)
                  ,beginSys201Rdw800
                  ,SYS_201_RDW_800_LEN
                 );
            localSys201Rdw800Counter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected long checkSys201Rdw800MaxLimit(long number) {
        return checkMaxLimit(number, false/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshSys201Rdw800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshSys201Rdw800() {	 
			return (getUnsignedInt(beginSys201Rdw800));
   	}
     int localSys001Status800Counter = -1;
     public boolean isSys001Status800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSys001Status800Counter != sharedCounter;
         localSys001Status800Counter = sharedCounter; return hasModified;
     }
	protected static final int SYS_001_STATUS_800_LEN = 2;
	/**
	 * 	serialize this Sys001Status800
	 */
   protected void serializeSys001Status800(char[] sys001Status800) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sys001Status800,0,getStringValue(),beginSys001Status800,SYS_001_STATUS_800_LEN);
       localSys001Status800Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSys001Status800Constraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshSys001Status800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSys001Status800() {	 
   		return (substring(getStringValue(),beginSys001Status800,beginSys001Status800 + SYS_001_STATUS_800_LEN));
   	}
     int localSys002Status800Counter = -1;
     public boolean isSys002Status800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSys002Status800Counter != sharedCounter;
         localSys002Status800Counter = sharedCounter; return hasModified;
     }
	protected static final int SYS_002_STATUS_800_LEN = 2;
	/**
	 * 	serialize this Sys002Status800
	 */
   protected void serializeSys002Status800(char[] sys002Status800) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sys002Status800,0,getStringValue(),beginSys002Status800,SYS_002_STATUS_800_LEN);
       localSys002Status800Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSys002Status800Constraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshSys002Status800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSys002Status800() {	 
   		return (substring(getStringValue(),beginSys002Status800,beginSys002Status800 + SYS_002_STATUS_800_LEN));
   	}
     int localSys005Status800Counter = -1;
     public boolean isSys005Status800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSys005Status800Counter != sharedCounter;
         localSys005Status800Counter = sharedCounter; return hasModified;
     }
	protected static final int SYS_005_STATUS_800_LEN = 2;
	/**
	 * 	serialize this Sys005Status800
	 */
   protected void serializeSys005Status800(char[] sys005Status800) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sys005Status800,0,getStringValue(),beginSys005Status800,SYS_005_STATUS_800_LEN);
       localSys005Status800Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSys005Status800Constraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshSys005Status800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSys005Status800() {	 
   		return (substring(getStringValue(),beginSys005Status800,beginSys005Status800 + SYS_005_STATUS_800_LEN));
   	}
     int localSys003Status800Counter = -1;
     public boolean isSys003Status800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSys003Status800Counter != sharedCounter;
         localSys003Status800Counter = sharedCounter; return hasModified;
     }
	protected static final int SYS_003_STATUS_800_LEN = 2;
	/**
	 * 	serialize this Sys003Status800
	 */
   protected void serializeSys003Status800(char[] sys003Status800) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sys003Status800,0,getStringValue(),beginSys003Status800,SYS_003_STATUS_800_LEN);
       localSys003Status800Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSys003Status800Constraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshSys003Status800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSys003Status800() {	 
   		return (substring(getStringValue(),beginSys003Status800,beginSys003Status800 + SYS_003_STATUS_800_LEN));
   	}
     int localSys004Status800Counter = -1;
     public boolean isSys004Status800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSys004Status800Counter != sharedCounter;
         localSys004Status800Counter = sharedCounter; return hasModified;
     }
	protected static final int SYS_004_STATUS_800_LEN = 2;
	/**
	 * 	serialize this Sys004Status800
	 */
   protected void serializeSys004Status800(char[] sys004Status800) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sys004Status800,0,getStringValue(),beginSys004Status800,SYS_004_STATUS_800_LEN);
       localSys004Status800Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSys004Status800Constraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshSys004Status800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSys004Status800() {	 
   		return (substring(getStringValue(),beginSys004Status800,beginSys004Status800 + SYS_004_STATUS_800_LEN));
   	}
     int localSys101Status800Counter = -1;
     public boolean isSys101Status800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSys101Status800Counter != sharedCounter;
         localSys101Status800Counter = sharedCounter; return hasModified;
     }
	protected static final int SYS_101_STATUS_800_LEN = 2;
	/**
	 * 	serialize this Sys101Status800
	 */
   protected void serializeSys101Status800(char[] sys101Status800) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sys101Status800,0,getStringValue(),beginSys101Status800,SYS_101_STATUS_800_LEN);
       localSys101Status800Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSys101Status800Constraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshSys101Status800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSys101Status800() {	 
   		return (substring(getStringValue(),beginSys101Status800,beginSys101Status800 + SYS_101_STATUS_800_LEN));
   	}
     int localSys201Status800Counter = -1;
     public boolean isSys201Status800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSys201Status800Counter != sharedCounter;
         localSys201Status800Counter = sharedCounter; return hasModified;
     }
	protected static final int SYS_201_STATUS_800_LEN = 2;
	/**
	 * 	serialize this Sys201Status800
	 */
   protected void serializeSys201Status800(char[] sys201Status800) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sys201Status800,0,getStringValue(),beginSys201Status800,SYS_201_STATUS_800_LEN);
       localSys201Status800Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSys201Status800Constraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshSys201Status800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSys201Status800() {	 
   		return (substring(getStringValue(),beginSys201Status800,beginSys201Status800 + SYS_201_STATUS_800_LEN));
   	}
     int localSys202Status800Counter = -1;
     public boolean isSys202Status800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSys202Status800Counter != sharedCounter;
         localSys202Status800Counter = sharedCounter; return hasModified;
     }
	protected static final int SYS_202_STATUS_800_LEN = 2;
	/**
	 * 	serialize this Sys202Status800
	 */
   protected void serializeSys202Status800(char[] sys202Status800) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sys202Status800,0,getStringValue(),beginSys202Status800,SYS_202_STATUS_800_LEN);
       localSys202Status800Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSys202Status800Constraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshSys202Status800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSys202Status800() {	 
   		return (substring(getStringValue(),beginSys202Status800,beginSys202Status800 + SYS_202_STATUS_800_LEN));
   	}
     int localSys204Status800Counter = -1;
     public boolean isSys204Status800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSys204Status800Counter != sharedCounter;
         localSys204Status800Counter = sharedCounter; return hasModified;
     }
	protected static final int SYS_204_STATUS_800_LEN = 2;
	/**
	 * 	serialize this Sys204Status800
	 */
   protected void serializeSys204Status800(char[] sys204Status800) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sys204Status800,0,getStringValue(),beginSys204Status800,SYS_204_STATUS_800_LEN);
       localSys204Status800Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSys204Status800Constraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshSys204Status800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSys204Status800() {	 
   		return (substring(getStringValue(),beginSys204Status800,beginSys204Status800 + SYS_204_STATUS_800_LEN));
   	}
     int localSys205Status800Counter = -1;
     public boolean isSys205Status800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSys205Status800Counter != sharedCounter;
         localSys205Status800Counter = sharedCounter; return hasModified;
     }
	protected static final int SYS_205_STATUS_800_LEN = 2;
	/**
	 * 	serialize this Sys205Status800
	 */
   protected void serializeSys205Status800(char[] sys205Status800) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sys205Status800,0,getStringValue(),beginSys205Status800,SYS_205_STATUS_800_LEN);
       localSys205Status800Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSys205Status800Constraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshSys205Status800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSys205Status800() {	 
   		return (substring(getStringValue(),beginSys205Status800,beginSys205Status800 + SYS_205_STATUS_800_LEN));
   	}
     int localTagTblPtr800Counter = -1;
     public boolean isTagTblPtr800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTagTblPtr800Counter != sharedCounter;
         localTagTblPtr800Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of tagTblPtr800
	 *	@return tagTblPtr800
	 */
	public char[]  getTagTblPtr800String() {
	     return getCharArray(beginTagTblPtr800,TAG_TBL_PTR_800_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tagTblPtr800IsNumeric() {
	    return isNumeric(beginTagTblPtr800
	                    ,beginTagTblPtr800 + TAG_TBL_PTR_800_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int TAG_TBL_PTR_800_LEN = 5;
  	/**
	 * serializeTagTblPtr800
	 */
	protected void serializeTagTblPtr800(long tagTblPtr800) {
		 putNumber(beginTagTblPtr800,tagTblPtr800,TAG_TBL_PTR_800_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localTagTblPtr800Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeTagTblPtr800
	 */
   	protected  long serializeTagTblPtr800(char[] value) {
	    long  tagTblPtr800;
	    if(value.length >0 && value.length!= 5)
            value = new String(value).trim().toCharArray();
	    if (value.length < 5) value = pad(5, value, ' ', LEFT_PAD);
	    else if (value.length > 5) value = substring(value,0,5);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    tagTblPtr800 = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(5,value,false/*isSigned?*/)
		       ,beginTagTblPtr800
		       ,5
		      );
		 localTagTblPtr800Counter = shareString.getSerializedField().getModifiedCounter();
		return  tagTblPtr800;
    }

   protected long checkTagTblPtr800MaxLimit(long number) {

        return checkMaxLimit(number , MAX_100K/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshTagTblPtr800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshTagTblPtr800() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginTagTblPtr800
			                 ,TAG_TBL_PTR_800_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("tagTblPtr800", beginTagTblPtr800,TAG_TBL_PTR_800_LEN);
    }
   	}
     int localTranAmt800Counter = -1;
     public boolean isTranAmt800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTranAmt800Counter != sharedCounter;
         localTranAmt800Counter = sharedCounter; return hasModified;
     }
	protected static final int TRAN_AMT_800_LEN = 12;
	/**
	 * 	serialize this TranAmt800
	 */
   protected void serializeTranAmt800(char[] tranAmt800) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(tranAmt800,0,getStringValue(),beginTranAmt800,TRAN_AMT_800_LEN);
       localTranAmt800Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTranAmt800Constraints(char[] value) {
   			return super.checkConstraints(value , 12 ,false, false);
   }
    /**
	 *	refreshTranAmt800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTranAmt800() {	 
   		return (substring(getStringValue(),beginTranAmt800,beginTranAmt800 + TRAN_AMT_800_LEN));
   	}
     int localTranAmtLen800Counter = -1;
     public boolean isTranAmtLen800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTranAmtLen800Counter != sharedCounter;
         localTranAmtLen800Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of tranAmtLen800
	 *	@return tranAmtLen800
	 */
	public char[]  getTranAmtLen800String() {
	     return getCharArray(beginTranAmtLen800,TRAN_AMT_LEN_800_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tranAmtLen800IsNumeric() {
	    return isNumeric(beginTranAmtLen800
	                    ,beginTranAmtLen800 + TRAN_AMT_LEN_800_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int TRAN_AMT_LEN_800_LEN = 3;
  	/**
	 * serializeTranAmtLen800
	 */
	protected void serializeTranAmtLen800(int tranAmtLen800) {
		 putNumber(beginTranAmtLen800,tranAmtLen800,TRAN_AMT_LEN_800_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localTranAmtLen800Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeTranAmtLen800
	 */
   	protected  int serializeTranAmtLen800(char[] value) {
	    int  tranAmtLen800;
	    if(value.length >0 && value.length!= 3)
            value = new String(value).trim().toCharArray();
	    if (value.length < 3) value = pad(3, value, ' ', LEFT_PAD);
	    else if (value.length > 3) value = substring(value,0,3);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    tranAmtLen800 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(3,value,false/*isSigned?*/)
		       ,beginTranAmtLen800
		       ,3
		      );
		 localTranAmtLen800Counter = shareString.getSerializedField().getModifiedCounter();
		return  tranAmtLen800;
    }

   protected int checkTranAmtLen800MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_1000/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshTranAmtLen800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshTranAmtLen800() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginTranAmtLen800
			                 ,TRAN_AMT_LEN_800_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("tranAmtLen800", beginTranAmtLen800,TRAN_AMT_LEN_800_LEN);
    }
   	}
     int localType1800Counter = -1;
     public boolean isType1800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localType1800Counter != sharedCounter;
         localType1800Counter = sharedCounter; return hasModified;
     }
	protected static final int TYPE_1800_LEN = 22;
	/**
	 * 	serialize this Type1800
	 */
   protected void serializeType1800(char[] type1800) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(type1800,0,getStringValue(),beginType1800,TYPE_1800_LEN);
       localType1800Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkType1800Constraints(char[] value) {
   			return super.checkConstraints(value , 22 ,false, false);
   }
    /**
	 *	refreshType1800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshType1800() {	 
   		return (substring(getStringValue(),beginType1800,beginType1800 + TYPE_1800_LEN));
   	}
     int localIca1800Counter = -1;
     public boolean isIca1800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIca1800Counter != sharedCounter;
         localIca1800Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ica1800
	 *	@return ica1800
	 */
	public char[]  getIca1800String() {
	     return getCharArray(beginIca1800,ICA_1800_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ica1800IsNumeric() {
	    return isNumeric(beginIca1800
	                    ,beginIca1800 + ICA_1800_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int ICA_1800_LEN = 6;
  	/**
	 * serializeIca1800
	 */
	protected void serializeIca1800(long ica1800) {
		 putNumber(beginIca1800,ica1800,ICA_1800_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localIca1800Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeIca1800
	 */
   	protected  long serializeIca1800(char[] value) {
	    long  ica1800;
	    if(value.length >0 && value.length!= 6)
            value = new String(value).trim().toCharArray();
	    if (value.length < 6) value = pad(6, value, ' ', LEFT_PAD);
	    else if (value.length > 6) value = substring(value,0,6);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ica1800 = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(6,value,false/*isSigned?*/)
		       ,beginIca1800
		       ,6
		      );
		 localIca1800Counter = shareString.getSerializedField().getModifiedCounter();
		return  ica1800;
    }

   protected long checkIca1800MaxLimit(long number) {

        return checkMaxLimit(number , MAX_1M/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshIca1800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshIca1800() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginIca1800
			                 ,ICA_1800_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ica1800", beginIca1800,ICA_1800_LEN);
    }
   	}
     int localBin1800Counter = -1;
     public boolean isBin1800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBin1800Counter != sharedCounter;
         localBin1800Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of bin1800
	 *	@return bin1800
	 */
	public char[]  getBin1800String() {
	     return getCharArray(beginBin1800,BIN_1800_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean bin1800IsNumeric() {
	    return isNumeric(beginBin1800
	                    ,beginBin1800 + BIN_1800_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int BIN_1800_LEN = 6;
  	/**
	 * serializeBin1800
	 */
	protected void serializeBin1800(long bin1800) {
		 putNumber(beginBin1800,bin1800,BIN_1800_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localBin1800Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeBin1800
	 */
   	protected  long serializeBin1800(char[] value) {
	    long  bin1800;
	    if(value.length >0 && value.length!= 6)
            value = new String(value).trim().toCharArray();
	    if (value.length < 6) value = pad(6, value, ' ', LEFT_PAD);
	    else if (value.length > 6) value = substring(value,0,6);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    bin1800 = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(6,value,false/*isSigned?*/)
		       ,beginBin1800
		       ,6
		      );
		 localBin1800Counter = shareString.getSerializedField().getModifiedCounter();
		return  bin1800;
    }

   protected long checkBin1800MaxLimit(long number) {

        return checkMaxLimit(number , MAX_1M/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshBin1800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshBin1800() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginBin1800
			                 ,BIN_1800_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("bin1800", beginBin1800,BIN_1800_LEN);
    }
   	}
     int localMaid1800Counter = -1;
     public boolean isMaid1800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMaid1800Counter != sharedCounter;
         localMaid1800Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of maid1800
	 *	@return maid1800
	 */
	public char[]  getMaid1800String() {
	     return getCharArray(beginMaid1800,MAID_1800_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean maid1800IsNumeric() {
	    return isNumeric(beginMaid1800
	                    ,beginMaid1800 + MAID_1800_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int MAID_1800_LEN = 6;
  	/**
	 * serializeMaid1800
	 */
	protected void serializeMaid1800(long maid1800) {
		 putNumber(beginMaid1800,maid1800,MAID_1800_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localMaid1800Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeMaid1800
	 */
   	protected  long serializeMaid1800(char[] value) {
	    long  maid1800;
	    if(value.length >0 && value.length!= 6)
            value = new String(value).trim().toCharArray();
	    if (value.length < 6) value = pad(6, value, ' ', LEFT_PAD);
	    else if (value.length > 6) value = substring(value,0,6);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    maid1800 = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(6,value,false/*isSigned?*/)
		       ,beginMaid1800
		       ,6
		      );
		 localMaid1800Counter = shareString.getSerializedField().getModifiedCounter();
		return  maid1800;
    }

   protected long checkMaid1800MaxLimit(long number) {

        return checkMaxLimit(number , MAX_1M/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshMaid1800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshMaid1800() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginMaid1800
			                 ,MAID_1800_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("maid1800", beginMaid1800,MAID_1800_LEN);
    }
   	}
     int localEndpoint1800Counter = -1;
     public boolean isEndpoint1800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localEndpoint1800Counter != sharedCounter;
         localEndpoint1800Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of endpoint1800
	 *	@return endpoint1800
	 */
	public char[]  getEndpoint1800String() {
	     return getCharArray(beginEndpoint1800,ENDPOINT_1800_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean endpoint1800IsNumeric() {
	    return isNumeric(beginEndpoint1800
	                    ,beginEndpoint1800 + ENDPOINT_1800_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int ENDPOINT_1800_LEN = 7;
  	/**
	 * serializeEndpoint1800
	 */
	protected void serializeEndpoint1800(long endpoint1800) {
		 putNumber(beginEndpoint1800,endpoint1800,ENDPOINT_1800_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localEndpoint1800Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeEndpoint1800
	 */
   	protected  long serializeEndpoint1800(char[] value) {
	    long  endpoint1800;
	    if(value.length >0 && value.length!= 7)
            value = new String(value).trim().toCharArray();
	    if (value.length < 7) value = pad(7, value, ' ', LEFT_PAD);
	    else if (value.length > 7) value = substring(value,0,7);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    endpoint1800 = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(7,value,false/*isSigned?*/)
		       ,beginEndpoint1800
		       ,7
		      );
		 localEndpoint1800Counter = shareString.getSerializedField().getModifiedCounter();
		return  endpoint1800;
    }

   protected long checkEndpoint1800MaxLimit(long number) {

        return checkMaxLimit(number , MAX_10M/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshEndpoint1800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshEndpoint1800() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginEndpoint1800
			                 ,ENDPOINT_1800_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("endpoint1800", beginEndpoint1800,ENDPOINT_1800_LEN);
    }
   	}
     int localType2800Counter = -1;
     public boolean isType2800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localType2800Counter != sharedCounter;
         localType2800Counter = sharedCounter; return hasModified;
     }
	protected static final int TYPE_2800_LEN = 22;
	/**
	 * 	serialize this Type2800
	 */
   protected void serializeType2800(char[] type2800) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(type2800,0,getStringValue(),beginType2800,TYPE_2800_LEN);
       localType2800Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkType2800Constraints(char[] value) {
   			return super.checkConstraints(value , 22 ,false, false);
   }
    /**
	 *	refreshType2800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshType2800() {	 
   		return (substring(getStringValue(),beginType2800,beginType2800 + TYPE_2800_LEN));
   	}
     int localIca2800Counter = -1;
     public boolean isIca2800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIca2800Counter != sharedCounter;
         localIca2800Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ica2800
	 *	@return ica2800
	 */
	public char[]  getIca2800String() {
	     return getCharArray(beginIca2800,ICA_2800_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ica2800IsNumeric() {
	    return isNumeric(beginIca2800
	                    ,beginIca2800 + ICA_2800_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int ICA_2800_LEN = 11;
  	/**
	 * serializeIca2800
	 */
	protected void serializeIca2800(long ica2800) {
		 putNumber(beginIca2800,ica2800,ICA_2800_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localIca2800Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeIca2800
	 */
   	protected  long serializeIca2800(char[] value) {
	    long  ica2800;
	    if(value.length >0 && value.length!= 11)
            value = new String(value).trim().toCharArray();
	    if (value.length < 11) value = pad(11, value, ' ', LEFT_PAD);
	    else if (value.length > 11) value = substring(value,0,11);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ica2800 = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(11,value,false/*isSigned?*/)
		       ,beginIca2800
		       ,11
		      );
		 localIca2800Counter = shareString.getSerializedField().getModifiedCounter();
		return  ica2800;
    }

   protected long checkIca2800MaxLimit(long number) {

        return checkMaxLimit(number , MAX_100G/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshIca2800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshIca2800() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginIca2800
			                 ,ICA_2800_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ica2800", beginIca2800,ICA_2800_LEN);
    }
   	}
     int localBin2800Counter = -1;
     public boolean isBin2800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBin2800Counter != sharedCounter;
         localBin2800Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of bin2800
	 *	@return bin2800
	 */
	public char[]  getBin2800String() {
	     return getCharArray(beginBin2800,BIN_2800_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean bin2800IsNumeric() {
	    return isNumeric(beginBin2800
	                    ,beginBin2800 + BIN_2800_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int BIN_2800_LEN = 6;
  	/**
	 * serializeBin2800
	 */
	protected void serializeBin2800(long bin2800) {
		 putNumber(beginBin2800,bin2800,BIN_2800_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localBin2800Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeBin2800
	 */
   	protected  long serializeBin2800(char[] value) {
	    long  bin2800;
	    if(value.length >0 && value.length!= 6)
            value = new String(value).trim().toCharArray();
	    if (value.length < 6) value = pad(6, value, ' ', LEFT_PAD);
	    else if (value.length > 6) value = substring(value,0,6);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    bin2800 = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(6,value,false/*isSigned?*/)
		       ,beginBin2800
		       ,6
		      );
		 localBin2800Counter = shareString.getSerializedField().getModifiedCounter();
		return  bin2800;
    }

   protected long checkBin2800MaxLimit(long number) {

        return checkMaxLimit(number , MAX_1M/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshBin2800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshBin2800() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginBin2800
			                 ,BIN_2800_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("bin2800", beginBin2800,BIN_2800_LEN);
    }
   	}
     int localMaid2800Counter = -1;
     public boolean isMaid2800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMaid2800Counter != sharedCounter;
         localMaid2800Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of maid2800
	 *	@return maid2800
	 */
	public char[]  getMaid2800String() {
	     return getCharArray(beginMaid2800,MAID_2800_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean maid2800IsNumeric() {
	    return isNumeric(beginMaid2800
	                    ,beginMaid2800 + MAID_2800_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int MAID_2800_LEN = 6;
  	/**
	 * serializeMaid2800
	 */
	protected void serializeMaid2800(long maid2800) {
		 putNumber(beginMaid2800,maid2800,MAID_2800_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localMaid2800Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeMaid2800
	 */
   	protected  long serializeMaid2800(char[] value) {
	    long  maid2800;
	    if(value.length >0 && value.length!= 6)
            value = new String(value).trim().toCharArray();
	    if (value.length < 6) value = pad(6, value, ' ', LEFT_PAD);
	    else if (value.length > 6) value = substring(value,0,6);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    maid2800 = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(6,value,false/*isSigned?*/)
		       ,beginMaid2800
		       ,6
		      );
		 localMaid2800Counter = shareString.getSerializedField().getModifiedCounter();
		return  maid2800;
    }

   protected long checkMaid2800MaxLimit(long number) {

        return checkMaxLimit(number , MAX_1M/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshMaid2800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshMaid2800() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginMaid2800
			                 ,MAID_2800_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("maid2800", beginMaid2800,MAID_2800_LEN);
    }
   	}
     int localEndpoint2800Counter = -1;
     public boolean isEndpoint2800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localEndpoint2800Counter != sharedCounter;
         localEndpoint2800Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of endpoint2800
	 *	@return endpoint2800
	 */
	public char[]  getEndpoint2800String() {
	     return getCharArray(beginEndpoint2800,ENDPOINT_2800_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean endpoint2800IsNumeric() {
	    return isNumeric(beginEndpoint2800
	                    ,beginEndpoint2800 + ENDPOINT_2800_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int ENDPOINT_2800_LEN = 7;
  	/**
	 * serializeEndpoint2800
	 */
	protected void serializeEndpoint2800(long endpoint2800) {
		 putNumber(beginEndpoint2800,endpoint2800,ENDPOINT_2800_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localEndpoint2800Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeEndpoint2800
	 */
   	protected  long serializeEndpoint2800(char[] value) {
	    long  endpoint2800;
	    if(value.length >0 && value.length!= 7)
            value = new String(value).trim().toCharArray();
	    if (value.length < 7) value = pad(7, value, ' ', LEFT_PAD);
	    else if (value.length > 7) value = substring(value,0,7);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    endpoint2800 = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(7,value,false/*isSigned?*/)
		       ,beginEndpoint2800
		       ,7
		      );
		 localEndpoint2800Counter = shareString.getSerializedField().getModifiedCounter();
		return  endpoint2800;
    }

   protected long checkEndpoint2800MaxLimit(long number) {

        return checkMaxLimit(number , MAX_10M/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshEndpoint2800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshEndpoint2800() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginEndpoint2800
			                 ,ENDPOINT_2800_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("endpoint2800", beginEndpoint2800,ENDPOINT_2800_LEN);
    }
   	}
     int localDonationAmount800Counter = -1;
     public boolean isDonationAmount800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDonationAmount800Counter != sharedCounter;
         localDonationAmount800Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of donationAmount800
	 *	@return donationAmount800
	 */
	public char[]  getDonationAmount800String() {
	     return getCharArray(beginDonationAmount800,DONATION_AMOUNT_800_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean donationAmount800IsNumeric() {
	    return isNumeric(beginDonationAmount800
	                    ,beginDonationAmount800 + DONATION_AMOUNT_800_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int DONATION_AMOUNT_800_LEN = 8;
  	/**
	 * serializeDonationAmount800
	 */
	protected void serializeDonationAmount800(long donationAmount800) {
		 putNumber(beginDonationAmount800,donationAmount800,DONATION_AMOUNT_800_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localDonationAmount800Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeDonationAmount800
	 */
   	protected  long serializeDonationAmount800(char[] value) {
	    long  donationAmount800;
	    if(value.length >0 && value.length!= 8)
            value = new String(value).trim().toCharArray();
	    if (value.length < 8) value = pad(8, value, ' ', LEFT_PAD);
	    else if (value.length > 8) value = substring(value,0,8);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    donationAmount800 = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(8,value,false/*isSigned?*/)
		       ,beginDonationAmount800
		       ,8
		      );
		 localDonationAmount800Counter = shareString.getSerializedField().getModifiedCounter();
		return  donationAmount800;
    }

   protected long checkDonationAmount800MaxLimit(long number) {

        return checkMaxLimit(number , MAX_100M/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshDonationAmount800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshDonationAmount800() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginDonationAmount800
			                 ,DONATION_AMOUNT_800_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("donationAmount800", beginDonationAmount800,DONATION_AMOUNT_800_LEN);
    }
   	}
     int localIrd800Counter = -1;
     public boolean isIrd800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIrd800Counter != sharedCounter;
         localIrd800Counter = sharedCounter; return hasModified;
     }
	protected static final int IRD_800_LEN = 2;
	/**
	 * 	serialize this Ird800
	 */
   protected void serializeIrd800(char[] ird800) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ird800,0,getStringValue(),beginIrd800,IRD_800_LEN);
       localIrd800Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIrd800Constraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshIrd800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIrd800() {	 
   		return (substring(getStringValue(),beginIrd800,beginIrd800 + IRD_800_LEN));
   	}




}
  
