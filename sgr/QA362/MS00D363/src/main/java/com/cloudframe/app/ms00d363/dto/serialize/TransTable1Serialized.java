package com.cloudframe.app.ms00d363.dto.serialize;

/**
*  The class TransTable1Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:07. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;

public class TransTable1Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(TransTable1Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int TRANS_TABLE_1_LENGTH = 685;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginTb1TrnId;
            protected  int beginTb1TrnDesc;
            protected  int beginTb1ImpDec;
            protected  int beginTb1ImpDecEp;
            protected  int beginTb1TrnSurchgFreeCntIss;
            protected  int beginTb1TrnSurchgFreeCntAcq;
            protected  int beginTb1TrnAtmAcchrgCntICr;
            protected  int beginTb1TrnAtmAcchrgCntIDb;
            protected  int beginTb1TrnAtmAcchrgAmtICr;
            protected  int beginTb1TrnAtmAcchrgAmtIDb;
            protected  int beginTb1TrnPosAcchrgACntICr;
            protected  int beginTb1TrnPosAcchrgACntIDb;
            protected  int beginTb1TrnPosAcchrgAmtICr;
            protected  int beginTb1TrnPosAcchrgAmtIDb;
            protected  int beginTb1TrnAtmAcchrgRCntICr;
            protected  int beginTb1TrnAtmAcchrgRCntIDb;
            protected  int beginTb1TrnAtmAcchrgRAmtICr;
            protected  int beginTb1TrnAtmAcchrgRAmtIDb;
            protected  int beginTb1TrnPosAcchrgRCntICr;
            protected  int beginTb1TrnPosAcchrgRCntIDb;
            protected  int beginTb1TrnPosAcchrgRAmtICr;
            protected  int beginTb1TrnPosAcchrgRAmtIDb;
            protected  int beginTb1TrnFFinAppCntICr;
            protected  int beginTb1TrnFFinAppCntIDb;
            protected  int beginTb1TrnFFinDenCntICr;
            protected  int beginTb1TrnFFinDenCntIDb;
            protected  int beginTb1TrnFFinAmtICr;
            protected  int beginTb1TrnFFinAmtIDb;
            protected  int beginTb1TrnFFinFeeCntI;
            protected  int beginTb1TrnFPctFeeCntI;
            protected  int beginTb1TrnFNfinFeeCntI;
            protected  int beginTb1TrnFNbilFeeCntI;
            protected  int beginTb1TrnFFeeAmtICr;
            protected  int beginTb1TrnFFeeAmtIDb;
            protected  int beginTb1TrnFMcrAmtICr;
            protected  int beginTb1TrnFMcrAmtIDb;
            protected  int beginTb1TrnFIcrAmtICr;
            protected  int beginTb1TrnFIcrAmtIDb;
            protected  int beginTb1TrnEFinAppCntICr;
            protected  int beginTb1TrnEFinAppCntIDb;
            protected  int beginTb1TrnENsdA15CntICr;
            protected  int beginTb1TrnENsdA15CntIDb;
            protected  int beginTb1TrnEFinA09CntICr;
            protected  int beginTb1TrnEFinA09CntIDb;
            protected  int beginTb1TrnEFinDenCntICr;
            protected  int beginTb1TrnEFinDenCntIDb;
            protected  int beginTb1TrnEFinAmtICr;
            protected  int beginTb1TrnEFinAmtIDb;
            protected  int beginTb1TrnEFinA09AmtICr;
            protected  int beginTb1TrnEFinA09AmtIDb;
            protected  int beginTb1TrnEFinFeeCntI;
            protected  int beginTb1TrnEPctFeeCntI;
            protected  int beginTb1TrnENfinFeeCntI;
            protected  int beginTb1TrnENbilFeeCntI;
            protected  int beginTb1TrnEFeeAmtICr;
            protected  int beginTb1TrnEFeeAmtIDb;
            protected  int beginTb1TrnEMcrAmtICr;
            protected  int beginTb1TrnEMcrAmtIDb;
            protected  int beginTb1TrnEIcrAmtICr;
            protected  int beginTb1TrnEIcrAmtIDb;
            protected  int beginTb1TrnAtmAcchrgCntACr;
            protected  int beginTb1TrnAtmAcchrgCntADb;
            protected  int beginTb1TrnAtmAcchrgAmtACr;
            protected  int beginTb1TrnAtmAcchrgAmtADb;
            protected  int beginTb1TrnPosAcchrgCntACr;
            protected  int beginTb1TrnPosAcchrgCntADb;
            protected  int beginTb1TrnPosAcchrgAmtACr;
            protected  int beginTb1TrnPosAcchrgAmtADb;
            protected  int beginTb1TrnAtmAcchrgRCntACr;
            protected  int beginTb1TrnAtmAcchrgRCntADb;
            protected  int beginTb1TrnAtmAcchrgRAmtACr;
            protected  int beginTb1TrnAtmAcchrgRAmtADb;
            protected  int beginTb1TrnPosAcchrgRCntACr;
            protected  int beginTb1TrnPosAcchrgRCntADb;
            protected  int beginTb1TrnPosAcchrgRAmtACr;
            protected  int beginTb1TrnPosAcchrgRAmtADb;
            protected  int beginTb1TrnFFinAppCntACr;
            protected  int beginTb1TrnFFinAppCntADb;
            protected  int beginTb1TrnFFinDenCntACr;
            protected  int beginTb1TrnFFinDenCntADb;
            protected  int beginTb1TrnFFinAmtACr;
            protected  int beginTb1TrnFFinAmtADb;
            protected  int beginTb1TrnFFinFeeCntA;
            protected  int beginTb1TrnFPctFeeCntA;
            protected  int beginTb1TrnFNfinFeeCntA;
            protected  int beginTb1TrnFNbilFeeCntA;
            protected  int beginTb1TrnFFeeAmtACr;
            protected  int beginTb1TrnFFeeAmtADb;
            protected  int beginTb1TrnEFinAppCntACr;
            protected  int beginTb1TrnEFinAppCntADb;
            protected  int beginTb1TrnEFinA09CntACr;
            protected  int beginTb1TrnEFinA09CntADb;
            protected  int beginTb1TrnENsdA15CntACr;
            protected  int beginTb1TrnENsdA15CntADb;
            protected  int beginTb1TrnEFinDenCntACr;
            protected  int beginTb1TrnEFinDenCntADb;
            protected  int beginTb1TrnEFinAmtACr;
            protected  int beginTb1TrnEFinAmtADb;
            protected  int beginTb1TrnEFinA09AmtACr;
            protected  int beginTb1TrnEFinA09AmtADb;
            protected  int beginTb1TrnEFinFeeCntA;
            protected  int beginTb1TrnEPctFeeCntA;
            protected  int beginTb1TrnENfinFeeCntA;
            protected  int beginTb1TrnENbilFeeCntA;
            protected  int beginTb1TrnEFeeAmtACr;
            protected  int beginTb1TrnEFeeAmtADb;
	
	/**
	* Constructor for TransTable1Serialized
	**/
    public TransTable1Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for TransTable1Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public TransTable1Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this TransTable1Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this TransTable1Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in TransTable1Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(TRANS_TABLE_1_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginTb1TrnId = getStartOffset() + 0;	// set offset for serialization
  
             beginTb1TrnDesc = getStartOffset() + 3;	// set offset for serialization
  
             beginTb1ImpDec = getStartOffset() + 21;	// set offset for serialization
  
             beginTb1ImpDecEp = getStartOffset() + 22;	// set offset for serialization
  
             beginTb1TrnSurchgFreeCntIss = getStartOffset() + 23;	// set offset for serialization
  
             beginTb1TrnSurchgFreeCntAcq = getStartOffset() + 28;	// set offset for serialization
  
             beginTb1TrnAtmAcchrgCntICr = getStartOffset() + 33;	// set offset for serialization
  
             beginTb1TrnAtmAcchrgCntIDb = getStartOffset() + 38;	// set offset for serialization
  
             beginTb1TrnAtmAcchrgAmtICr = getStartOffset() + 43;	// set offset for serialization
  
             beginTb1TrnAtmAcchrgAmtIDb = getStartOffset() + 51;	// set offset for serialization
  
             beginTb1TrnPosAcchrgACntICr = getStartOffset() + 59;	// set offset for serialization
  
             beginTb1TrnPosAcchrgACntIDb = getStartOffset() + 64;	// set offset for serialization
  
             beginTb1TrnPosAcchrgAmtICr = getStartOffset() + 69;	// set offset for serialization
  
             beginTb1TrnPosAcchrgAmtIDb = getStartOffset() + 77;	// set offset for serialization
  
             beginTb1TrnAtmAcchrgRCntICr = getStartOffset() + 85;	// set offset for serialization
  
             beginTb1TrnAtmAcchrgRCntIDb = getStartOffset() + 90;	// set offset for serialization
  
             beginTb1TrnAtmAcchrgRAmtICr = getStartOffset() + 95;	// set offset for serialization
  
             beginTb1TrnAtmAcchrgRAmtIDb = getStartOffset() + 103;	// set offset for serialization
  
             beginTb1TrnPosAcchrgRCntICr = getStartOffset() + 111;	// set offset for serialization
  
             beginTb1TrnPosAcchrgRCntIDb = getStartOffset() + 116;	// set offset for serialization
  
             beginTb1TrnPosAcchrgRAmtICr = getStartOffset() + 121;	// set offset for serialization
  
             beginTb1TrnPosAcchrgRAmtIDb = getStartOffset() + 129;	// set offset for serialization
  
             beginTb1TrnFFinAppCntICr = getStartOffset() + 137;	// set offset for serialization
  
             beginTb1TrnFFinAppCntIDb = getStartOffset() + 142;	// set offset for serialization
  
             beginTb1TrnFFinDenCntICr = getStartOffset() + 147;	// set offset for serialization
  
             beginTb1TrnFFinDenCntIDb = getStartOffset() + 152;	// set offset for serialization
  
             beginTb1TrnFFinAmtICr = getStartOffset() + 157;	// set offset for serialization
  
             beginTb1TrnFFinAmtIDb = getStartOffset() + 166;	// set offset for serialization
  
             beginTb1TrnFFinFeeCntI = getStartOffset() + 175;	// set offset for serialization
  
             beginTb1TrnFPctFeeCntI = getStartOffset() + 180;	// set offset for serialization
  
             beginTb1TrnFNfinFeeCntI = getStartOffset() + 185;	// set offset for serialization
  
             beginTb1TrnFNbilFeeCntI = getStartOffset() + 190;	// set offset for serialization
  
             beginTb1TrnFFeeAmtICr = getStartOffset() + 195;	// set offset for serialization
  
             beginTb1TrnFFeeAmtIDb = getStartOffset() + 204;	// set offset for serialization
  
             beginTb1TrnFMcrAmtICr = getStartOffset() + 213;	// set offset for serialization
  
             beginTb1TrnFMcrAmtIDb = getStartOffset() + 222;	// set offset for serialization
  
             beginTb1TrnFIcrAmtICr = getStartOffset() + 231;	// set offset for serialization
  
             beginTb1TrnFIcrAmtIDb = getStartOffset() + 240;	// set offset for serialization
  
             beginTb1TrnEFinAppCntICr = getStartOffset() + 249;	// set offset for serialization
  
             beginTb1TrnEFinAppCntIDb = getStartOffset() + 254;	// set offset for serialization
  
             beginTb1TrnENsdA15CntICr = getStartOffset() + 259;	// set offset for serialization
  
             beginTb1TrnENsdA15CntIDb = getStartOffset() + 262;	// set offset for serialization
  
             beginTb1TrnEFinA09CntICr = getStartOffset() + 265;	// set offset for serialization
  
             beginTb1TrnEFinA09CntIDb = getStartOffset() + 270;	// set offset for serialization
  
             beginTb1TrnEFinDenCntICr = getStartOffset() + 275;	// set offset for serialization
  
             beginTb1TrnEFinDenCntIDb = getStartOffset() + 280;	// set offset for serialization
  
             beginTb1TrnEFinAmtICr = getStartOffset() + 285;	// set offset for serialization
  
             beginTb1TrnEFinAmtIDb = getStartOffset() + 294;	// set offset for serialization
  
             beginTb1TrnEFinA09AmtICr = getStartOffset() + 303;	// set offset for serialization
  
             beginTb1TrnEFinA09AmtIDb = getStartOffset() + 312;	// set offset for serialization
  
             beginTb1TrnEFinFeeCntI = getStartOffset() + 321;	// set offset for serialization
  
             beginTb1TrnEPctFeeCntI = getStartOffset() + 326;	// set offset for serialization
  
             beginTb1TrnENfinFeeCntI = getStartOffset() + 331;	// set offset for serialization
  
             beginTb1TrnENbilFeeCntI = getStartOffset() + 336;	// set offset for serialization
  
             beginTb1TrnEFeeAmtICr = getStartOffset() + 341;	// set offset for serialization
  
             beginTb1TrnEFeeAmtIDb = getStartOffset() + 349;	// set offset for serialization
  
             beginTb1TrnEMcrAmtICr = getStartOffset() + 357;	// set offset for serialization
  
             beginTb1TrnEMcrAmtIDb = getStartOffset() + 366;	// set offset for serialization
  
             beginTb1TrnEIcrAmtICr = getStartOffset() + 375;	// set offset for serialization
  
             beginTb1TrnEIcrAmtIDb = getStartOffset() + 384;	// set offset for serialization
  
             beginTb1TrnAtmAcchrgCntACr = getStartOffset() + 393;	// set offset for serialization
  
             beginTb1TrnAtmAcchrgCntADb = getStartOffset() + 398;	// set offset for serialization
  
             beginTb1TrnAtmAcchrgAmtACr = getStartOffset() + 403;	// set offset for serialization
  
             beginTb1TrnAtmAcchrgAmtADb = getStartOffset() + 411;	// set offset for serialization
  
             beginTb1TrnPosAcchrgCntACr = getStartOffset() + 419;	// set offset for serialization
  
             beginTb1TrnPosAcchrgCntADb = getStartOffset() + 424;	// set offset for serialization
  
             beginTb1TrnPosAcchrgAmtACr = getStartOffset() + 429;	// set offset for serialization
  
             beginTb1TrnPosAcchrgAmtADb = getStartOffset() + 437;	// set offset for serialization
  
             beginTb1TrnAtmAcchrgRCntACr = getStartOffset() + 445;	// set offset for serialization
  
             beginTb1TrnAtmAcchrgRCntADb = getStartOffset() + 450;	// set offset for serialization
  
             beginTb1TrnAtmAcchrgRAmtACr = getStartOffset() + 455;	// set offset for serialization
  
             beginTb1TrnAtmAcchrgRAmtADb = getStartOffset() + 463;	// set offset for serialization
  
             beginTb1TrnPosAcchrgRCntACr = getStartOffset() + 471;	// set offset for serialization
  
             beginTb1TrnPosAcchrgRCntADb = getStartOffset() + 476;	// set offset for serialization
  
             beginTb1TrnPosAcchrgRAmtACr = getStartOffset() + 481;	// set offset for serialization
  
             beginTb1TrnPosAcchrgRAmtADb = getStartOffset() + 489;	// set offset for serialization
  
             beginTb1TrnFFinAppCntACr = getStartOffset() + 497;	// set offset for serialization
  
             beginTb1TrnFFinAppCntADb = getStartOffset() + 502;	// set offset for serialization
  
             beginTb1TrnFFinDenCntACr = getStartOffset() + 507;	// set offset for serialization
  
             beginTb1TrnFFinDenCntADb = getStartOffset() + 512;	// set offset for serialization
  
             beginTb1TrnFFinAmtACr = getStartOffset() + 517;	// set offset for serialization
  
             beginTb1TrnFFinAmtADb = getStartOffset() + 526;	// set offset for serialization
  
             beginTb1TrnFFinFeeCntA = getStartOffset() + 535;	// set offset for serialization
  
             beginTb1TrnFPctFeeCntA = getStartOffset() + 540;	// set offset for serialization
  
             beginTb1TrnFNfinFeeCntA = getStartOffset() + 545;	// set offset for serialization
  
             beginTb1TrnFNbilFeeCntA = getStartOffset() + 550;	// set offset for serialization
  
             beginTb1TrnFFeeAmtACr = getStartOffset() + 555;	// set offset for serialization
  
             beginTb1TrnFFeeAmtADb = getStartOffset() + 564;	// set offset for serialization
  
             beginTb1TrnEFinAppCntACr = getStartOffset() + 573;	// set offset for serialization
  
             beginTb1TrnEFinAppCntADb = getStartOffset() + 578;	// set offset for serialization
  
             beginTb1TrnEFinA09CntACr = getStartOffset() + 583;	// set offset for serialization
  
             beginTb1TrnEFinA09CntADb = getStartOffset() + 588;	// set offset for serialization
  
             beginTb1TrnENsdA15CntACr = getStartOffset() + 593;	// set offset for serialization
  
             beginTb1TrnENsdA15CntADb = getStartOffset() + 598;	// set offset for serialization
  
             beginTb1TrnEFinDenCntACr = getStartOffset() + 603;	// set offset for serialization
  
             beginTb1TrnEFinDenCntADb = getStartOffset() + 608;	// set offset for serialization
  
             beginTb1TrnEFinAmtACr = getStartOffset() + 613;	// set offset for serialization
  
             beginTb1TrnEFinAmtADb = getStartOffset() + 622;	// set offset for serialization
  
             beginTb1TrnEFinA09AmtACr = getStartOffset() + 631;	// set offset for serialization
  
             beginTb1TrnEFinA09AmtADb = getStartOffset() + 640;	// set offset for serialization
  
             beginTb1TrnEFinFeeCntA = getStartOffset() + 649;	// set offset for serialization
  
             beginTb1TrnEPctFeeCntA = getStartOffset() + 654;	// set offset for serialization
  
             beginTb1TrnENfinFeeCntA = getStartOffset() + 659;	// set offset for serialization
  
             beginTb1TrnENbilFeeCntA = getStartOffset() + 664;	// set offset for serialization
  
             beginTb1TrnEFeeAmtACr = getStartOffset() + 669;	// set offset for serialization
  
             beginTb1TrnEFeeAmtADb = getStartOffset() + 677;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localTb1TrnIdCounter = -1;
     public boolean isTb1TrnIdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTb1TrnIdCounter != sharedCounter;
         localTb1TrnIdCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of tb1TrnId
	 *	@return tb1TrnId
	 */
	public char[]  getTb1TrnIdString() {
	     return getCharArray(beginTb1TrnId,TB_1_TRN_ID_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tb1TrnIdIsNumeric() {
	    return isNumeric(beginTb1TrnId
	                    ,beginTb1TrnId + TB_1_TRN_ID_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int TB_1_TRN_ID_LEN = 3;
  	/**
	 * serializeTb1TrnId
	 */
	protected void serializeTb1TrnId(int tb1TrnId) {
		 putNumber(beginTb1TrnId,tb1TrnId,TB_1_TRN_ID_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localTb1TrnIdCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeTb1TrnId
	 */
   	protected  int serializeTb1TrnId(char[] value) {
	    int  tb1TrnId;
	    if(value.length >0 && value.length!= 3)
            value = new String(value).trim().toCharArray();
	    if (value.length < 3) value = pad(3, value, ' ', LEFT_PAD);
	    else if (value.length > 3) value = substring(value,0,3);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    tb1TrnId = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(3,value,false/*isSigned?*/)
		       ,beginTb1TrnId
		       ,3
		      );
		 localTb1TrnIdCounter = shareString.getSerializedField().getModifiedCounter();
		return  tb1TrnId;
    }

   protected int checkTb1TrnIdMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_1000/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshTb1TrnId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshTb1TrnId() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginTb1TrnId
			                 ,TB_1_TRN_ID_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("tb1TrnId", beginTb1TrnId,TB_1_TRN_ID_LEN);
    }
   	}
     int localTb1TrnDescCounter = -1;
     public boolean isTb1TrnDescModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTb1TrnDescCounter != sharedCounter;
         localTb1TrnDescCounter = sharedCounter; return hasModified;
     }
	protected static final int TB_1_TRN_DESC_LEN = 18;
	/**
	 * 	serialize this Tb1TrnDesc
	 */
   protected void serializeTb1TrnDesc(char[] tb1TrnDesc) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(tb1TrnDesc,0,getStringValue(),beginTb1TrnDesc,TB_1_TRN_DESC_LEN);
       localTb1TrnDescCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTb1TrnDescConstraints(char[] value) {
   			return super.checkConstraints(value , 18 ,false, false);
   }
    /**
	 *	refreshTb1TrnDesc is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTb1TrnDesc() {	 
   		return (substring(getStringValue(),beginTb1TrnDesc,beginTb1TrnDesc + TB_1_TRN_DESC_LEN));
   	}
     int localTb1ImpDecCounter = -1;
     public boolean isTb1ImpDecModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTb1ImpDecCounter != sharedCounter;
         localTb1ImpDecCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of tb1ImpDec
	 *	@return tb1ImpDec
	 */
	public char[]  getTb1ImpDecString() {
	     return getCharArray(beginTb1ImpDec,TB_1_IMP_DEC_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tb1ImpDecIsNumeric() {
	    return isNumeric(beginTb1ImpDec
	                    ,beginTb1ImpDec + TB_1_IMP_DEC_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int TB_1_IMP_DEC_LEN = 1;
  	/**
	 * serializeTb1ImpDec
	 */
	protected void serializeTb1ImpDec(int tb1ImpDec) {
		 putNumber(beginTb1ImpDec,tb1ImpDec,TB_1_IMP_DEC_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localTb1ImpDecCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeTb1ImpDec
	 */
   	protected  int serializeTb1ImpDec(char[] value) {
	    int  tb1ImpDec;
	    if(value.length >0 && value.length!= 1)
            value = new String(value).trim().toCharArray();
	    if (value.length < 1) value = pad(1, value, ' ', LEFT_PAD);
	    else if (value.length > 1) value = substring(value,0,1);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    tb1ImpDec = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(1,value,false/*isSigned?*/)
		       ,beginTb1ImpDec
		       ,1
		      );
		 localTb1ImpDecCounter = shareString.getSerializedField().getModifiedCounter();
		return  tb1ImpDec;
    }

   protected int checkTb1ImpDecMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshTb1ImpDec is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshTb1ImpDec() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginTb1ImpDec
			                 ,TB_1_IMP_DEC_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("tb1ImpDec", beginTb1ImpDec,TB_1_IMP_DEC_LEN);
    }
   	}
     int localTb1ImpDecEpCounter = -1;
     public boolean isTb1ImpDecEpModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTb1ImpDecEpCounter != sharedCounter;
         localTb1ImpDecEpCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of tb1ImpDecEp
	 *	@return tb1ImpDecEp
	 */
	public char[]  getTb1ImpDecEpString() {
	     return getCharArray(beginTb1ImpDecEp,TB_1_IMP_DEC_EP_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tb1ImpDecEpIsNumeric() {
	    return isNumeric(beginTb1ImpDecEp
	                    ,beginTb1ImpDecEp + TB_1_IMP_DEC_EP_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int TB_1_IMP_DEC_EP_LEN = 1;
  	/**
	 * serializeTb1ImpDecEp
	 */
	protected void serializeTb1ImpDecEp(int tb1ImpDecEp) {
		 putNumber(beginTb1ImpDecEp,tb1ImpDecEp,TB_1_IMP_DEC_EP_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localTb1ImpDecEpCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeTb1ImpDecEp
	 */
   	protected  int serializeTb1ImpDecEp(char[] value) {
	    int  tb1ImpDecEp;
	    if(value.length >0 && value.length!= 1)
            value = new String(value).trim().toCharArray();
	    if (value.length < 1) value = pad(1, value, ' ', LEFT_PAD);
	    else if (value.length > 1) value = substring(value,0,1);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    tb1ImpDecEp = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(1,value,false/*isSigned?*/)
		       ,beginTb1ImpDecEp
		       ,1
		      );
		 localTb1ImpDecEpCounter = shareString.getSerializedField().getModifiedCounter();
		return  tb1ImpDecEp;
    }

   protected int checkTb1ImpDecEpMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshTb1ImpDecEp is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshTb1ImpDecEp() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginTb1ImpDecEp
			                 ,TB_1_IMP_DEC_EP_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("tb1ImpDecEp", beginTb1ImpDecEp,TB_1_IMP_DEC_EP_LEN);
    }
   	}
        int localTb1TrnSurchgFreeCntIssCounter = -1;
        public boolean isTb1TrnSurchgFreeCntIssModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localTb1TrnSurchgFreeCntIssCounter != sharedCounter;
           localTb1TrnSurchgFreeCntIssCounter = sharedCounter; return hasModified; 
        }
	    public boolean tb1TrnSurchgFreeCntIssIsNumeric() {
	      return decimalIsNumeric(beginTb1TrnSurchgFreeCntIss,TB_1_TRN_SURCHG_FREE_CNT_ISS_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int TB_1_TRN_SURCHG_FREE_CNT_ISS_LEN = 5;
  	/**
	 * 	serializeTb1TrnSurchgFreeCntIss
	 */
	protected void serializeTb1TrnSurchgFreeCntIss(int tb1TrnSurchgFreeCntIss) {
		   putDecimal(beginTb1TrnSurchgFreeCntIss,tb1TrnSurchgFreeCntIss,TB_1_TRN_SURCHG_FREE_CNT_ISS_LEN,true);
   }
   

   protected int checkTb1TrnSurchgFreeCntIssMaxLimit(long number) {
	   return (int)checkMaxLimit(number , MAX_1G /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshTb1TrnSurchgFreeCntIss is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshTb1TrnSurchgFreeCntIss() throws CFException {	
   	try { 
		 return (getIntDecimal(beginTb1TrnSurchgFreeCntIss,TB_1_TRN_SURCHG_FREE_CNT_ISS_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("tb1TrnSurchgFreeCntIss", beginTb1TrnSurchgFreeCntIss,TB_1_TRN_SURCHG_FREE_CNT_ISS_LEN);
     }
   	}
        int localTb1TrnSurchgFreeCntAcqCounter = -1;
        public boolean isTb1TrnSurchgFreeCntAcqModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localTb1TrnSurchgFreeCntAcqCounter != sharedCounter;
           localTb1TrnSurchgFreeCntAcqCounter = sharedCounter; return hasModified; 
        }
	    public boolean tb1TrnSurchgFreeCntAcqIsNumeric() {
	      return decimalIsNumeric(beginTb1TrnSurchgFreeCntAcq,TB_1_TRN_SURCHG_FREE_CNT_ACQ_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int TB_1_TRN_SURCHG_FREE_CNT_ACQ_LEN = 5;
  	/**
	 * 	serializeTb1TrnSurchgFreeCntAcq
	 */
	protected void serializeTb1TrnSurchgFreeCntAcq(int tb1TrnSurchgFreeCntAcq) {
		   putDecimal(beginTb1TrnSurchgFreeCntAcq,tb1TrnSurchgFreeCntAcq,TB_1_TRN_SURCHG_FREE_CNT_ACQ_LEN,true);
   }
   

   protected int checkTb1TrnSurchgFreeCntAcqMaxLimit(long number) {
	   return (int)checkMaxLimit(number , MAX_1G /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshTb1TrnSurchgFreeCntAcq is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshTb1TrnSurchgFreeCntAcq() throws CFException {	
   	try { 
		 return (getIntDecimal(beginTb1TrnSurchgFreeCntAcq,TB_1_TRN_SURCHG_FREE_CNT_ACQ_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("tb1TrnSurchgFreeCntAcq", beginTb1TrnSurchgFreeCntAcq,TB_1_TRN_SURCHG_FREE_CNT_ACQ_LEN);
     }
   	}
        int localTb1TrnAtmAcchrgCntICrCounter = -1;
        public boolean isTb1TrnAtmAcchrgCntICrModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localTb1TrnAtmAcchrgCntICrCounter != sharedCounter;
           localTb1TrnAtmAcchrgCntICrCounter = sharedCounter; return hasModified; 
        }
	    public boolean tb1TrnAtmAcchrgCntICrIsNumeric() {
	      return decimalIsNumeric(beginTb1TrnAtmAcchrgCntICr,TB_1_TRN_ATM_ACCHRG_CNT_ICR_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int TB_1_TRN_ATM_ACCHRG_CNT_ICR_LEN = 5;
  	/**
	 * 	serializeTb1TrnAtmAcchrgCntICr
	 */
	protected void serializeTb1TrnAtmAcchrgCntICr(int tb1TrnAtmAcchrgCntICr) {
		   putDecimal(beginTb1TrnAtmAcchrgCntICr,tb1TrnAtmAcchrgCntICr,TB_1_TRN_ATM_ACCHRG_CNT_ICR_LEN,true);
   }
   

   protected int checkTb1TrnAtmAcchrgCntICrMaxLimit(long number) {
	   return (int)checkMaxLimit(number , MAX_1G /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshTb1TrnAtmAcchrgCntICr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshTb1TrnAtmAcchrgCntICr() throws CFException {	
   	try { 
		 return (getIntDecimal(beginTb1TrnAtmAcchrgCntICr,TB_1_TRN_ATM_ACCHRG_CNT_ICR_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("tb1TrnAtmAcchrgCntICr", beginTb1TrnAtmAcchrgCntICr,TB_1_TRN_ATM_ACCHRG_CNT_ICR_LEN);
     }
   	}
        int localTb1TrnAtmAcchrgCntIDbCounter = -1;
        public boolean isTb1TrnAtmAcchrgCntIDbModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localTb1TrnAtmAcchrgCntIDbCounter != sharedCounter;
           localTb1TrnAtmAcchrgCntIDbCounter = sharedCounter; return hasModified; 
        }
	    public boolean tb1TrnAtmAcchrgCntIDbIsNumeric() {
	      return decimalIsNumeric(beginTb1TrnAtmAcchrgCntIDb,TB_1_TRN_ATM_ACCHRG_CNT_IDB_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int TB_1_TRN_ATM_ACCHRG_CNT_IDB_LEN = 5;
  	/**
	 * 	serializeTb1TrnAtmAcchrgCntIDb
	 */
	protected void serializeTb1TrnAtmAcchrgCntIDb(int tb1TrnAtmAcchrgCntIDb) {
		   putDecimal(beginTb1TrnAtmAcchrgCntIDb,tb1TrnAtmAcchrgCntIDb,TB_1_TRN_ATM_ACCHRG_CNT_IDB_LEN,true);
   }
   

   protected int checkTb1TrnAtmAcchrgCntIDbMaxLimit(long number) {
	   return (int)checkMaxLimit(number , MAX_1G /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshTb1TrnAtmAcchrgCntIDb is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshTb1TrnAtmAcchrgCntIDb() throws CFException {	
   	try { 
		 return (getIntDecimal(beginTb1TrnAtmAcchrgCntIDb,TB_1_TRN_ATM_ACCHRG_CNT_IDB_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("tb1TrnAtmAcchrgCntIDb", beginTb1TrnAtmAcchrgCntIDb,TB_1_TRN_ATM_ACCHRG_CNT_IDB_LEN);
     }
   	}
        int localTb1TrnAtmAcchrgAmtICrCounter = -1;
        public boolean isTb1TrnAtmAcchrgAmtICrModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localTb1TrnAtmAcchrgAmtICrCounter != sharedCounter;
           localTb1TrnAtmAcchrgAmtICrCounter = sharedCounter; return hasModified; 
        }
	    public boolean tb1TrnAtmAcchrgAmtICrIsNumeric() {
	      return decimalIsNumeric(beginTb1TrnAtmAcchrgAmtICr,TB_1_TRN_ATM_ACCHRG_AMT_ICR_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] tb1TrnAtmAcchrgAmtICrString() {
            return getPackedString(beginTb1TrnAtmAcchrgAmtICr,TB_1_TRN_ATM_ACCHRG_AMT_ICR_LEN);
         }
   protected static final int TB_1_TRN_ATM_ACCHRG_AMT_ICR_LEN = 8;
   protected static final int TB_1_TRN_ATM_ACCHRG_AMT_ICR_SCALE = 2;
  	/**
	 * 	serializeTb1TrnAtmAcchrgAmtICr
	 */
	protected void serializeTb1TrnAtmAcchrgAmtICr(BigDecimal tb1TrnAtmAcchrgAmtICr) {
		   putDecimal(beginTb1TrnAtmAcchrgAmtICr,tb1TrnAtmAcchrgAmtICr,TB_1_TRN_ATM_ACCHRG_AMT_ICR_LEN,TB_1_TRN_ATM_ACCHRG_AMT_ICR_SCALE,true);
		 localTb1TrnAtmAcchrgAmtICrCounter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkTb1TrnAtmAcchrgAmtICrMaxLimit(BigDecimal number) {
			return checkMaxLimit(number,2/*scale*/,15/*precision*/);
   }
     /**
	 *	refreshTb1TrnAtmAcchrgAmtICr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshTb1TrnAtmAcchrgAmtICr() throws CFException {	
   	try { 
		 return (getDecimal(beginTb1TrnAtmAcchrgAmtICr,TB_1_TRN_ATM_ACCHRG_AMT_ICR_LEN,TB_1_TRN_ATM_ACCHRG_AMT_ICR_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("tb1TrnAtmAcchrgAmtICr", beginTb1TrnAtmAcchrgAmtICr,TB_1_TRN_ATM_ACCHRG_AMT_ICR_LEN);
     }
   	}
        int localTb1TrnAtmAcchrgAmtIDbCounter = -1;
        public boolean isTb1TrnAtmAcchrgAmtIDbModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localTb1TrnAtmAcchrgAmtIDbCounter != sharedCounter;
           localTb1TrnAtmAcchrgAmtIDbCounter = sharedCounter; return hasModified; 
        }
	    public boolean tb1TrnAtmAcchrgAmtIDbIsNumeric() {
	      return decimalIsNumeric(beginTb1TrnAtmAcchrgAmtIDb,TB_1_TRN_ATM_ACCHRG_AMT_IDB_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] tb1TrnAtmAcchrgAmtIDbString() {
            return getPackedString(beginTb1TrnAtmAcchrgAmtIDb,TB_1_TRN_ATM_ACCHRG_AMT_IDB_LEN);
         }
   protected static final int TB_1_TRN_ATM_ACCHRG_AMT_IDB_LEN = 8;
   protected static final int TB_1_TRN_ATM_ACCHRG_AMT_IDB_SCALE = 2;
  	/**
	 * 	serializeTb1TrnAtmAcchrgAmtIDb
	 */
	protected void serializeTb1TrnAtmAcchrgAmtIDb(BigDecimal tb1TrnAtmAcchrgAmtIDb) {
		   putDecimal(beginTb1TrnAtmAcchrgAmtIDb,tb1TrnAtmAcchrgAmtIDb,TB_1_TRN_ATM_ACCHRG_AMT_IDB_LEN,TB_1_TRN_ATM_ACCHRG_AMT_IDB_SCALE,true);
		 localTb1TrnAtmAcchrgAmtIDbCounter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkTb1TrnAtmAcchrgAmtIDbMaxLimit(BigDecimal number) {
			return checkMaxLimit(number,2/*scale*/,15/*precision*/);
   }
     /**
	 *	refreshTb1TrnAtmAcchrgAmtIDb is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshTb1TrnAtmAcchrgAmtIDb() throws CFException {	
   	try { 
		 return (getDecimal(beginTb1TrnAtmAcchrgAmtIDb,TB_1_TRN_ATM_ACCHRG_AMT_IDB_LEN,TB_1_TRN_ATM_ACCHRG_AMT_IDB_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("tb1TrnAtmAcchrgAmtIDb", beginTb1TrnAtmAcchrgAmtIDb,TB_1_TRN_ATM_ACCHRG_AMT_IDB_LEN);
     }
   	}
        int localTb1TrnPosAcchrgACntICrCounter = -1;
        public boolean isTb1TrnPosAcchrgACntICrModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localTb1TrnPosAcchrgACntICrCounter != sharedCounter;
           localTb1TrnPosAcchrgACntICrCounter = sharedCounter; return hasModified; 
        }
	    public boolean tb1TrnPosAcchrgACntICrIsNumeric() {
	      return decimalIsNumeric(beginTb1TrnPosAcchrgACntICr,TB_1_TRN_POS_ACCHRG_ACNT_ICR_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int TB_1_TRN_POS_ACCHRG_ACNT_ICR_LEN = 5;
  	/**
	 * 	serializeTb1TrnPosAcchrgACntICr
	 */
	protected void serializeTb1TrnPosAcchrgACntICr(int tb1TrnPosAcchrgACntICr) {
		   putDecimal(beginTb1TrnPosAcchrgACntICr,tb1TrnPosAcchrgACntICr,TB_1_TRN_POS_ACCHRG_ACNT_ICR_LEN,true);
   }
   

   protected int checkTb1TrnPosAcchrgACntICrMaxLimit(long number) {
	   return (int)checkMaxLimit(number , MAX_1G /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshTb1TrnPosAcchrgACntICr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshTb1TrnPosAcchrgACntICr() throws CFException {	
   	try { 
		 return (getIntDecimal(beginTb1TrnPosAcchrgACntICr,TB_1_TRN_POS_ACCHRG_ACNT_ICR_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("tb1TrnPosAcchrgACntICr", beginTb1TrnPosAcchrgACntICr,TB_1_TRN_POS_ACCHRG_ACNT_ICR_LEN);
     }
   	}
        int localTb1TrnPosAcchrgACntIDbCounter = -1;
        public boolean isTb1TrnPosAcchrgACntIDbModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localTb1TrnPosAcchrgACntIDbCounter != sharedCounter;
           localTb1TrnPosAcchrgACntIDbCounter = sharedCounter; return hasModified; 
        }
	    public boolean tb1TrnPosAcchrgACntIDbIsNumeric() {
	      return decimalIsNumeric(beginTb1TrnPosAcchrgACntIDb,TB_1_TRN_POS_ACCHRG_ACNT_IDB_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int TB_1_TRN_POS_ACCHRG_ACNT_IDB_LEN = 5;
  	/**
	 * 	serializeTb1TrnPosAcchrgACntIDb
	 */
	protected void serializeTb1TrnPosAcchrgACntIDb(int tb1TrnPosAcchrgACntIDb) {
		   putDecimal(beginTb1TrnPosAcchrgACntIDb,tb1TrnPosAcchrgACntIDb,TB_1_TRN_POS_ACCHRG_ACNT_IDB_LEN,true);
   }
   

   protected int checkTb1TrnPosAcchrgACntIDbMaxLimit(long number) {
	   return (int)checkMaxLimit(number , MAX_1G /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshTb1TrnPosAcchrgACntIDb is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshTb1TrnPosAcchrgACntIDb() throws CFException {	
   	try { 
		 return (getIntDecimal(beginTb1TrnPosAcchrgACntIDb,TB_1_TRN_POS_ACCHRG_ACNT_IDB_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("tb1TrnPosAcchrgACntIDb", beginTb1TrnPosAcchrgACntIDb,TB_1_TRN_POS_ACCHRG_ACNT_IDB_LEN);
     }
   	}
        int localTb1TrnPosAcchrgAmtICrCounter = -1;
        public boolean isTb1TrnPosAcchrgAmtICrModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localTb1TrnPosAcchrgAmtICrCounter != sharedCounter;
           localTb1TrnPosAcchrgAmtICrCounter = sharedCounter; return hasModified; 
        }
	    public boolean tb1TrnPosAcchrgAmtICrIsNumeric() {
	      return decimalIsNumeric(beginTb1TrnPosAcchrgAmtICr,TB_1_TRN_POS_ACCHRG_AMT_ICR_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] tb1TrnPosAcchrgAmtICrString() {
            return getPackedString(beginTb1TrnPosAcchrgAmtICr,TB_1_TRN_POS_ACCHRG_AMT_ICR_LEN);
         }
   protected static final int TB_1_TRN_POS_ACCHRG_AMT_ICR_LEN = 8;
   protected static final int TB_1_TRN_POS_ACCHRG_AMT_ICR_SCALE = 2;
  	/**
	 * 	serializeTb1TrnPosAcchrgAmtICr
	 */
	protected void serializeTb1TrnPosAcchrgAmtICr(BigDecimal tb1TrnPosAcchrgAmtICr) {
		   putDecimal(beginTb1TrnPosAcchrgAmtICr,tb1TrnPosAcchrgAmtICr,TB_1_TRN_POS_ACCHRG_AMT_ICR_LEN,TB_1_TRN_POS_ACCHRG_AMT_ICR_SCALE,true);
		 localTb1TrnPosAcchrgAmtICrCounter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkTb1TrnPosAcchrgAmtICrMaxLimit(BigDecimal number) {
			return checkMaxLimit(number,2/*scale*/,15/*precision*/);
   }
     /**
	 *	refreshTb1TrnPosAcchrgAmtICr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshTb1TrnPosAcchrgAmtICr() throws CFException {	
   	try { 
		 return (getDecimal(beginTb1TrnPosAcchrgAmtICr,TB_1_TRN_POS_ACCHRG_AMT_ICR_LEN,TB_1_TRN_POS_ACCHRG_AMT_ICR_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("tb1TrnPosAcchrgAmtICr", beginTb1TrnPosAcchrgAmtICr,TB_1_TRN_POS_ACCHRG_AMT_ICR_LEN);
     }
   	}
        int localTb1TrnPosAcchrgAmtIDbCounter = -1;
        public boolean isTb1TrnPosAcchrgAmtIDbModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localTb1TrnPosAcchrgAmtIDbCounter != sharedCounter;
           localTb1TrnPosAcchrgAmtIDbCounter = sharedCounter; return hasModified; 
        }
	    public boolean tb1TrnPosAcchrgAmtIDbIsNumeric() {
	      return decimalIsNumeric(beginTb1TrnPosAcchrgAmtIDb,TB_1_TRN_POS_ACCHRG_AMT_IDB_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] tb1TrnPosAcchrgAmtIDbString() {
            return getPackedString(beginTb1TrnPosAcchrgAmtIDb,TB_1_TRN_POS_ACCHRG_AMT_IDB_LEN);
         }
   protected static final int TB_1_TRN_POS_ACCHRG_AMT_IDB_LEN = 8;
   protected static final int TB_1_TRN_POS_ACCHRG_AMT_IDB_SCALE = 2;
  	/**
	 * 	serializeTb1TrnPosAcchrgAmtIDb
	 */
	protected void serializeTb1TrnPosAcchrgAmtIDb(BigDecimal tb1TrnPosAcchrgAmtIDb) {
		   putDecimal(beginTb1TrnPosAcchrgAmtIDb,tb1TrnPosAcchrgAmtIDb,TB_1_TRN_POS_ACCHRG_AMT_IDB_LEN,TB_1_TRN_POS_ACCHRG_AMT_IDB_SCALE,true);
		 localTb1TrnPosAcchrgAmtIDbCounter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkTb1TrnPosAcchrgAmtIDbMaxLimit(BigDecimal number) {
			return checkMaxLimit(number,2/*scale*/,15/*precision*/);
   }
     /**
	 *	refreshTb1TrnPosAcchrgAmtIDb is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshTb1TrnPosAcchrgAmtIDb() throws CFException {	
   	try { 
		 return (getDecimal(beginTb1TrnPosAcchrgAmtIDb,TB_1_TRN_POS_ACCHRG_AMT_IDB_LEN,TB_1_TRN_POS_ACCHRG_AMT_IDB_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("tb1TrnPosAcchrgAmtIDb", beginTb1TrnPosAcchrgAmtIDb,TB_1_TRN_POS_ACCHRG_AMT_IDB_LEN);
     }
   	}
        int localTb1TrnAtmAcchrgRCntICrCounter = -1;
        public boolean isTb1TrnAtmAcchrgRCntICrModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localTb1TrnAtmAcchrgRCntICrCounter != sharedCounter;
           localTb1TrnAtmAcchrgRCntICrCounter = sharedCounter; return hasModified; 
        }
	    public boolean tb1TrnAtmAcchrgRCntICrIsNumeric() {
	      return decimalIsNumeric(beginTb1TrnAtmAcchrgRCntICr,TB_1_TRN_ATM_ACCHRG_RCNT_ICR_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int TB_1_TRN_ATM_ACCHRG_RCNT_ICR_LEN = 5;
  	/**
	 * 	serializeTb1TrnAtmAcchrgRCntICr
	 */
	protected void serializeTb1TrnAtmAcchrgRCntICr(int tb1TrnAtmAcchrgRCntICr) {
		   putDecimal(beginTb1TrnAtmAcchrgRCntICr,tb1TrnAtmAcchrgRCntICr,TB_1_TRN_ATM_ACCHRG_RCNT_ICR_LEN,true);
   }
   

   protected int checkTb1TrnAtmAcchrgRCntICrMaxLimit(long number) {
	   return (int)checkMaxLimit(number , MAX_1G /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshTb1TrnAtmAcchrgRCntICr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshTb1TrnAtmAcchrgRCntICr() throws CFException {	
   	try { 
		 return (getIntDecimal(beginTb1TrnAtmAcchrgRCntICr,TB_1_TRN_ATM_ACCHRG_RCNT_ICR_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("tb1TrnAtmAcchrgRCntICr", beginTb1TrnAtmAcchrgRCntICr,TB_1_TRN_ATM_ACCHRG_RCNT_ICR_LEN);
     }
   	}
        int localTb1TrnAtmAcchrgRCntIDbCounter = -1;
        public boolean isTb1TrnAtmAcchrgRCntIDbModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localTb1TrnAtmAcchrgRCntIDbCounter != sharedCounter;
           localTb1TrnAtmAcchrgRCntIDbCounter = sharedCounter; return hasModified; 
        }
	    public boolean tb1TrnAtmAcchrgRCntIDbIsNumeric() {
	      return decimalIsNumeric(beginTb1TrnAtmAcchrgRCntIDb,TB_1_TRN_ATM_ACCHRG_RCNT_IDB_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int TB_1_TRN_ATM_ACCHRG_RCNT_IDB_LEN = 5;
  	/**
	 * 	serializeTb1TrnAtmAcchrgRCntIDb
	 */
	protected void serializeTb1TrnAtmAcchrgRCntIDb(int tb1TrnAtmAcchrgRCntIDb) {
		   putDecimal(beginTb1TrnAtmAcchrgRCntIDb,tb1TrnAtmAcchrgRCntIDb,TB_1_TRN_ATM_ACCHRG_RCNT_IDB_LEN,true);
   }
   

   protected int checkTb1TrnAtmAcchrgRCntIDbMaxLimit(long number) {
	   return (int)checkMaxLimit(number , MAX_1G /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshTb1TrnAtmAcchrgRCntIDb is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshTb1TrnAtmAcchrgRCntIDb() throws CFException {	
   	try { 
		 return (getIntDecimal(beginTb1TrnAtmAcchrgRCntIDb,TB_1_TRN_ATM_ACCHRG_RCNT_IDB_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("tb1TrnAtmAcchrgRCntIDb", beginTb1TrnAtmAcchrgRCntIDb,TB_1_TRN_ATM_ACCHRG_RCNT_IDB_LEN);
     }
   	}
        int localTb1TrnAtmAcchrgRAmtICrCounter = -1;
        public boolean isTb1TrnAtmAcchrgRAmtICrModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localTb1TrnAtmAcchrgRAmtICrCounter != sharedCounter;
           localTb1TrnAtmAcchrgRAmtICrCounter = sharedCounter; return hasModified; 
        }
	    public boolean tb1TrnAtmAcchrgRAmtICrIsNumeric() {
	      return decimalIsNumeric(beginTb1TrnAtmAcchrgRAmtICr,TB_1_TRN_ATM_ACCHRG_RAMT_ICR_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] tb1TrnAtmAcchrgRAmtICrString() {
            return getPackedString(beginTb1TrnAtmAcchrgRAmtICr,TB_1_TRN_ATM_ACCHRG_RAMT_ICR_LEN);
         }
   protected static final int TB_1_TRN_ATM_ACCHRG_RAMT_ICR_LEN = 8;
   protected static final int TB_1_TRN_ATM_ACCHRG_RAMT_ICR_SCALE = 2;
  	/**
	 * 	serializeTb1TrnAtmAcchrgRAmtICr
	 */
	protected void serializeTb1TrnAtmAcchrgRAmtICr(BigDecimal tb1TrnAtmAcchrgRAmtICr) {
		   putDecimal(beginTb1TrnAtmAcchrgRAmtICr,tb1TrnAtmAcchrgRAmtICr,TB_1_TRN_ATM_ACCHRG_RAMT_ICR_LEN,TB_1_TRN_ATM_ACCHRG_RAMT_ICR_SCALE,true);
		 localTb1TrnAtmAcchrgRAmtICrCounter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkTb1TrnAtmAcchrgRAmtICrMaxLimit(BigDecimal number) {
			return checkMaxLimit(number,2/*scale*/,15/*precision*/);
   }
     /**
	 *	refreshTb1TrnAtmAcchrgRAmtICr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshTb1TrnAtmAcchrgRAmtICr() throws CFException {	
   	try { 
		 return (getDecimal(beginTb1TrnAtmAcchrgRAmtICr,TB_1_TRN_ATM_ACCHRG_RAMT_ICR_LEN,TB_1_TRN_ATM_ACCHRG_RAMT_ICR_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("tb1TrnAtmAcchrgRAmtICr", beginTb1TrnAtmAcchrgRAmtICr,TB_1_TRN_ATM_ACCHRG_RAMT_ICR_LEN);
     }
   	}
        int localTb1TrnAtmAcchrgRAmtIDbCounter = -1;
        public boolean isTb1TrnAtmAcchrgRAmtIDbModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localTb1TrnAtmAcchrgRAmtIDbCounter != sharedCounter;
           localTb1TrnAtmAcchrgRAmtIDbCounter = sharedCounter; return hasModified; 
        }
	    public boolean tb1TrnAtmAcchrgRAmtIDbIsNumeric() {
	      return decimalIsNumeric(beginTb1TrnAtmAcchrgRAmtIDb,TB_1_TRN_ATM_ACCHRG_RAMT_IDB_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] tb1TrnAtmAcchrgRAmtIDbString() {
            return getPackedString(beginTb1TrnAtmAcchrgRAmtIDb,TB_1_TRN_ATM_ACCHRG_RAMT_IDB_LEN);
         }
   protected static final int TB_1_TRN_ATM_ACCHRG_RAMT_IDB_LEN = 8;
   protected static final int TB_1_TRN_ATM_ACCHRG_RAMT_IDB_SCALE = 2;
  	/**
	 * 	serializeTb1TrnAtmAcchrgRAmtIDb
	 */
	protected void serializeTb1TrnAtmAcchrgRAmtIDb(BigDecimal tb1TrnAtmAcchrgRAmtIDb) {
		   putDecimal(beginTb1TrnAtmAcchrgRAmtIDb,tb1TrnAtmAcchrgRAmtIDb,TB_1_TRN_ATM_ACCHRG_RAMT_IDB_LEN,TB_1_TRN_ATM_ACCHRG_RAMT_IDB_SCALE,true);
		 localTb1TrnAtmAcchrgRAmtIDbCounter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkTb1TrnAtmAcchrgRAmtIDbMaxLimit(BigDecimal number) {
			return checkMaxLimit(number,2/*scale*/,15/*precision*/);
   }
     /**
	 *	refreshTb1TrnAtmAcchrgRAmtIDb is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshTb1TrnAtmAcchrgRAmtIDb() throws CFException {	
   	try { 
		 return (getDecimal(beginTb1TrnAtmAcchrgRAmtIDb,TB_1_TRN_ATM_ACCHRG_RAMT_IDB_LEN,TB_1_TRN_ATM_ACCHRG_RAMT_IDB_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("tb1TrnAtmAcchrgRAmtIDb", beginTb1TrnAtmAcchrgRAmtIDb,TB_1_TRN_ATM_ACCHRG_RAMT_IDB_LEN);
     }
   	}
        int localTb1TrnPosAcchrgRCntICrCounter = -1;
        public boolean isTb1TrnPosAcchrgRCntICrModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localTb1TrnPosAcchrgRCntICrCounter != sharedCounter;
           localTb1TrnPosAcchrgRCntICrCounter = sharedCounter; return hasModified; 
        }
	    public boolean tb1TrnPosAcchrgRCntICrIsNumeric() {
	      return decimalIsNumeric(beginTb1TrnPosAcchrgRCntICr,TB_1_TRN_POS_ACCHRG_RCNT_ICR_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int TB_1_TRN_POS_ACCHRG_RCNT_ICR_LEN = 5;
  	/**
	 * 	serializeTb1TrnPosAcchrgRCntICr
	 */
	protected void serializeTb1TrnPosAcchrgRCntICr(int tb1TrnPosAcchrgRCntICr) {
		   putDecimal(beginTb1TrnPosAcchrgRCntICr,tb1TrnPosAcchrgRCntICr,TB_1_TRN_POS_ACCHRG_RCNT_ICR_LEN,true);
   }
   

   protected int checkTb1TrnPosAcchrgRCntICrMaxLimit(long number) {
	   return (int)checkMaxLimit(number , MAX_1G /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshTb1TrnPosAcchrgRCntICr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshTb1TrnPosAcchrgRCntICr() throws CFException {	
   	try { 
		 return (getIntDecimal(beginTb1TrnPosAcchrgRCntICr,TB_1_TRN_POS_ACCHRG_RCNT_ICR_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("tb1TrnPosAcchrgRCntICr", beginTb1TrnPosAcchrgRCntICr,TB_1_TRN_POS_ACCHRG_RCNT_ICR_LEN);
     }
   	}
        int localTb1TrnPosAcchrgRCntIDbCounter = -1;
        public boolean isTb1TrnPosAcchrgRCntIDbModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localTb1TrnPosAcchrgRCntIDbCounter != sharedCounter;
           localTb1TrnPosAcchrgRCntIDbCounter = sharedCounter; return hasModified; 
        }
	    public boolean tb1TrnPosAcchrgRCntIDbIsNumeric() {
	      return decimalIsNumeric(beginTb1TrnPosAcchrgRCntIDb,TB_1_TRN_POS_ACCHRG_RCNT_IDB_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int TB_1_TRN_POS_ACCHRG_RCNT_IDB_LEN = 5;
  	/**
	 * 	serializeTb1TrnPosAcchrgRCntIDb
	 */
	protected void serializeTb1TrnPosAcchrgRCntIDb(int tb1TrnPosAcchrgRCntIDb) {
		   putDecimal(beginTb1TrnPosAcchrgRCntIDb,tb1TrnPosAcchrgRCntIDb,TB_1_TRN_POS_ACCHRG_RCNT_IDB_LEN,true);
   }
   

   protected int checkTb1TrnPosAcchrgRCntIDbMaxLimit(long number) {
	   return (int)checkMaxLimit(number , MAX_1G /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshTb1TrnPosAcchrgRCntIDb is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshTb1TrnPosAcchrgRCntIDb() throws CFException {	
   	try { 
		 return (getIntDecimal(beginTb1TrnPosAcchrgRCntIDb,TB_1_TRN_POS_ACCHRG_RCNT_IDB_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("tb1TrnPosAcchrgRCntIDb", beginTb1TrnPosAcchrgRCntIDb,TB_1_TRN_POS_ACCHRG_RCNT_IDB_LEN);
     }
   	}
        int localTb1TrnPosAcchrgRAmtICrCounter = -1;
        public boolean isTb1TrnPosAcchrgRAmtICrModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localTb1TrnPosAcchrgRAmtICrCounter != sharedCounter;
           localTb1TrnPosAcchrgRAmtICrCounter = sharedCounter; return hasModified; 
        }
	    public boolean tb1TrnPosAcchrgRAmtICrIsNumeric() {
	      return decimalIsNumeric(beginTb1TrnPosAcchrgRAmtICr,TB_1_TRN_POS_ACCHRG_RAMT_ICR_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] tb1TrnPosAcchrgRAmtICrString() {
            return getPackedString(beginTb1TrnPosAcchrgRAmtICr,TB_1_TRN_POS_ACCHRG_RAMT_ICR_LEN);
         }
   protected static final int TB_1_TRN_POS_ACCHRG_RAMT_ICR_LEN = 8;
   protected static final int TB_1_TRN_POS_ACCHRG_RAMT_ICR_SCALE = 2;
  	/**
	 * 	serializeTb1TrnPosAcchrgRAmtICr
	 */
	protected void serializeTb1TrnPosAcchrgRAmtICr(BigDecimal tb1TrnPosAcchrgRAmtICr) {
		   putDecimal(beginTb1TrnPosAcchrgRAmtICr,tb1TrnPosAcchrgRAmtICr,TB_1_TRN_POS_ACCHRG_RAMT_ICR_LEN,TB_1_TRN_POS_ACCHRG_RAMT_ICR_SCALE,true);
		 localTb1TrnPosAcchrgRAmtICrCounter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkTb1TrnPosAcchrgRAmtICrMaxLimit(BigDecimal number) {
			return checkMaxLimit(number,2/*scale*/,15/*precision*/);
   }
     /**
	 *	refreshTb1TrnPosAcchrgRAmtICr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshTb1TrnPosAcchrgRAmtICr() throws CFException {	
   	try { 
		 return (getDecimal(beginTb1TrnPosAcchrgRAmtICr,TB_1_TRN_POS_ACCHRG_RAMT_ICR_LEN,TB_1_TRN_POS_ACCHRG_RAMT_ICR_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("tb1TrnPosAcchrgRAmtICr", beginTb1TrnPosAcchrgRAmtICr,TB_1_TRN_POS_ACCHRG_RAMT_ICR_LEN);
     }
   	}
        int localTb1TrnPosAcchrgRAmtIDbCounter = -1;
        public boolean isTb1TrnPosAcchrgRAmtIDbModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localTb1TrnPosAcchrgRAmtIDbCounter != sharedCounter;
           localTb1TrnPosAcchrgRAmtIDbCounter = sharedCounter; return hasModified; 
        }
	    public boolean tb1TrnPosAcchrgRAmtIDbIsNumeric() {
	      return decimalIsNumeric(beginTb1TrnPosAcchrgRAmtIDb,TB_1_TRN_POS_ACCHRG_RAMT_IDB_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] tb1TrnPosAcchrgRAmtIDbString() {
            return getPackedString(beginTb1TrnPosAcchrgRAmtIDb,TB_1_TRN_POS_ACCHRG_RAMT_IDB_LEN);
         }
   protected static final int TB_1_TRN_POS_ACCHRG_RAMT_IDB_LEN = 8;
   protected static final int TB_1_TRN_POS_ACCHRG_RAMT_IDB_SCALE = 2;
  	/**
	 * 	serializeTb1TrnPosAcchrgRAmtIDb
	 */
	protected void serializeTb1TrnPosAcchrgRAmtIDb(BigDecimal tb1TrnPosAcchrgRAmtIDb) {
		   putDecimal(beginTb1TrnPosAcchrgRAmtIDb,tb1TrnPosAcchrgRAmtIDb,TB_1_TRN_POS_ACCHRG_RAMT_IDB_LEN,TB_1_TRN_POS_ACCHRG_RAMT_IDB_SCALE,true);
		 localTb1TrnPosAcchrgRAmtIDbCounter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkTb1TrnPosAcchrgRAmtIDbMaxLimit(BigDecimal number) {
			return checkMaxLimit(number,2/*scale*/,15/*precision*/);
   }
     /**
	 *	refreshTb1TrnPosAcchrgRAmtIDb is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshTb1TrnPosAcchrgRAmtIDb() throws CFException {	
   	try { 
		 return (getDecimal(beginTb1TrnPosAcchrgRAmtIDb,TB_1_TRN_POS_ACCHRG_RAMT_IDB_LEN,TB_1_TRN_POS_ACCHRG_RAMT_IDB_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("tb1TrnPosAcchrgRAmtIDb", beginTb1TrnPosAcchrgRAmtIDb,TB_1_TRN_POS_ACCHRG_RAMT_IDB_LEN);
     }
   	}
        int localTb1TrnFFinAppCntICrCounter = -1;
        public boolean isTb1TrnFFinAppCntICrModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localTb1TrnFFinAppCntICrCounter != sharedCounter;
           localTb1TrnFFinAppCntICrCounter = sharedCounter; return hasModified; 
        }
	    public boolean tb1TrnFFinAppCntICrIsNumeric() {
	      return decimalIsNumeric(beginTb1TrnFFinAppCntICr,TB_1_TRN_FFIN_APP_CNT_ICR_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int TB_1_TRN_FFIN_APP_CNT_ICR_LEN = 5;
  	/**
	 * 	serializeTb1TrnFFinAppCntICr
	 */
	protected void serializeTb1TrnFFinAppCntICr(int tb1TrnFFinAppCntICr) {
		   putDecimal(beginTb1TrnFFinAppCntICr,tb1TrnFFinAppCntICr,TB_1_TRN_FFIN_APP_CNT_ICR_LEN,true);
   }
   

   protected int checkTb1TrnFFinAppCntICrMaxLimit(long number) {
	   return (int)checkMaxLimit(number , MAX_1G /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshTb1TrnFFinAppCntICr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshTb1TrnFFinAppCntICr() throws CFException {	
   	try { 
		 return (getIntDecimal(beginTb1TrnFFinAppCntICr,TB_1_TRN_FFIN_APP_CNT_ICR_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("tb1TrnFFinAppCntICr", beginTb1TrnFFinAppCntICr,TB_1_TRN_FFIN_APP_CNT_ICR_LEN);
     }
   	}
        int localTb1TrnFFinAppCntIDbCounter = -1;
        public boolean isTb1TrnFFinAppCntIDbModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localTb1TrnFFinAppCntIDbCounter != sharedCounter;
           localTb1TrnFFinAppCntIDbCounter = sharedCounter; return hasModified; 
        }
	    public boolean tb1TrnFFinAppCntIDbIsNumeric() {
	      return decimalIsNumeric(beginTb1TrnFFinAppCntIDb,TB_1_TRN_FFIN_APP_CNT_IDB_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int TB_1_TRN_FFIN_APP_CNT_IDB_LEN = 5;
  	/**
	 * 	serializeTb1TrnFFinAppCntIDb
	 */
	protected void serializeTb1TrnFFinAppCntIDb(int tb1TrnFFinAppCntIDb) {
		   putDecimal(beginTb1TrnFFinAppCntIDb,tb1TrnFFinAppCntIDb,TB_1_TRN_FFIN_APP_CNT_IDB_LEN,true);
   }
   

   protected int checkTb1TrnFFinAppCntIDbMaxLimit(long number) {
	   return (int)checkMaxLimit(number , MAX_1G /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshTb1TrnFFinAppCntIDb is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshTb1TrnFFinAppCntIDb() throws CFException {	
   	try { 
		 return (getIntDecimal(beginTb1TrnFFinAppCntIDb,TB_1_TRN_FFIN_APP_CNT_IDB_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("tb1TrnFFinAppCntIDb", beginTb1TrnFFinAppCntIDb,TB_1_TRN_FFIN_APP_CNT_IDB_LEN);
     }
   	}
        int localTb1TrnFFinDenCntICrCounter = -1;
        public boolean isTb1TrnFFinDenCntICrModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localTb1TrnFFinDenCntICrCounter != sharedCounter;
           localTb1TrnFFinDenCntICrCounter = sharedCounter; return hasModified; 
        }
	    public boolean tb1TrnFFinDenCntICrIsNumeric() {
	      return decimalIsNumeric(beginTb1TrnFFinDenCntICr,TB_1_TRN_FFIN_DEN_CNT_ICR_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int TB_1_TRN_FFIN_DEN_CNT_ICR_LEN = 5;
  	/**
	 * 	serializeTb1TrnFFinDenCntICr
	 */
	protected void serializeTb1TrnFFinDenCntICr(int tb1TrnFFinDenCntICr) {
		   putDecimal(beginTb1TrnFFinDenCntICr,tb1TrnFFinDenCntICr,TB_1_TRN_FFIN_DEN_CNT_ICR_LEN,true);
   }
   

   protected int checkTb1TrnFFinDenCntICrMaxLimit(long number) {
	   return (int)checkMaxLimit(number , MAX_1G /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshTb1TrnFFinDenCntICr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshTb1TrnFFinDenCntICr() throws CFException {	
   	try { 
		 return (getIntDecimal(beginTb1TrnFFinDenCntICr,TB_1_TRN_FFIN_DEN_CNT_ICR_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("tb1TrnFFinDenCntICr", beginTb1TrnFFinDenCntICr,TB_1_TRN_FFIN_DEN_CNT_ICR_LEN);
     }
   	}
        int localTb1TrnFFinDenCntIDbCounter = -1;
        public boolean isTb1TrnFFinDenCntIDbModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localTb1TrnFFinDenCntIDbCounter != sharedCounter;
           localTb1TrnFFinDenCntIDbCounter = sharedCounter; return hasModified; 
        }
	    public boolean tb1TrnFFinDenCntIDbIsNumeric() {
	      return decimalIsNumeric(beginTb1TrnFFinDenCntIDb,TB_1_TRN_FFIN_DEN_CNT_IDB_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int TB_1_TRN_FFIN_DEN_CNT_IDB_LEN = 5;
  	/**
	 * 	serializeTb1TrnFFinDenCntIDb
	 */
	protected void serializeTb1TrnFFinDenCntIDb(int tb1TrnFFinDenCntIDb) {
		   putDecimal(beginTb1TrnFFinDenCntIDb,tb1TrnFFinDenCntIDb,TB_1_TRN_FFIN_DEN_CNT_IDB_LEN,true);
   }
   

   protected int checkTb1TrnFFinDenCntIDbMaxLimit(long number) {
	   return (int)checkMaxLimit(number , MAX_1G /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshTb1TrnFFinDenCntIDb is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshTb1TrnFFinDenCntIDb() throws CFException {	
   	try { 
		 return (getIntDecimal(beginTb1TrnFFinDenCntIDb,TB_1_TRN_FFIN_DEN_CNT_IDB_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("tb1TrnFFinDenCntIDb", beginTb1TrnFFinDenCntIDb,TB_1_TRN_FFIN_DEN_CNT_IDB_LEN);
     }
   	}
        int localTb1TrnFFinAmtICrCounter = -1;
        public boolean isTb1TrnFFinAmtICrModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localTb1TrnFFinAmtICrCounter != sharedCounter;
           localTb1TrnFFinAmtICrCounter = sharedCounter; return hasModified; 
        }
	    public boolean tb1TrnFFinAmtICrIsNumeric() {
	      return decimalIsNumeric(beginTb1TrnFFinAmtICr,TB_1_TRN_FFIN_AMT_ICR_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int TB_1_TRN_FFIN_AMT_ICR_LEN = 9;
  	/**
	 * 	serializeTb1TrnFFinAmtICr
	 */
	protected void serializeTb1TrnFFinAmtICr(long tb1TrnFFinAmtICr) {
		   putDecimal(beginTb1TrnFFinAmtICr,tb1TrnFFinAmtICr,TB_1_TRN_FFIN_AMT_ICR_LEN,true);
   }
   

   protected long checkTb1TrnFFinAmtICrMaxLimit(long number) {
        return checkMaxLimit(number , MAX_100P /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshTb1TrnFFinAmtICr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshTb1TrnFFinAmtICr() throws CFException {	
   	try { 
		 return (getLongDecimal(beginTb1TrnFFinAmtICr,TB_1_TRN_FFIN_AMT_ICR_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("tb1TrnFFinAmtICr", beginTb1TrnFFinAmtICr,TB_1_TRN_FFIN_AMT_ICR_LEN);
     }
   	}
        int localTb1TrnFFinAmtIDbCounter = -1;
        public boolean isTb1TrnFFinAmtIDbModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localTb1TrnFFinAmtIDbCounter != sharedCounter;
           localTb1TrnFFinAmtIDbCounter = sharedCounter; return hasModified; 
        }
	    public boolean tb1TrnFFinAmtIDbIsNumeric() {
	      return decimalIsNumeric(beginTb1TrnFFinAmtIDb,TB_1_TRN_FFIN_AMT_IDB_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int TB_1_TRN_FFIN_AMT_IDB_LEN = 9;
  	/**
	 * 	serializeTb1TrnFFinAmtIDb
	 */
	protected void serializeTb1TrnFFinAmtIDb(long tb1TrnFFinAmtIDb) {
		   putDecimal(beginTb1TrnFFinAmtIDb,tb1TrnFFinAmtIDb,TB_1_TRN_FFIN_AMT_IDB_LEN,true);
   }
   

   protected long checkTb1TrnFFinAmtIDbMaxLimit(long number) {
        return checkMaxLimit(number , MAX_100P /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshTb1TrnFFinAmtIDb is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshTb1TrnFFinAmtIDb() throws CFException {	
   	try { 
		 return (getLongDecimal(beginTb1TrnFFinAmtIDb,TB_1_TRN_FFIN_AMT_IDB_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("tb1TrnFFinAmtIDb", beginTb1TrnFFinAmtIDb,TB_1_TRN_FFIN_AMT_IDB_LEN);
     }
   	}
        int localTb1TrnFFinFeeCntICounter = -1;
        public boolean isTb1TrnFFinFeeCntIModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localTb1TrnFFinFeeCntICounter != sharedCounter;
           localTb1TrnFFinFeeCntICounter = sharedCounter; return hasModified; 
        }
	    public boolean tb1TrnFFinFeeCntIIsNumeric() {
	      return decimalIsNumeric(beginTb1TrnFFinFeeCntI,TB_1_TRN_FFIN_FEE_CNT_I_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int TB_1_TRN_FFIN_FEE_CNT_I_LEN = 5;
  	/**
	 * 	serializeTb1TrnFFinFeeCntI
	 */
	protected void serializeTb1TrnFFinFeeCntI(int tb1TrnFFinFeeCntI) {
		   putDecimal(beginTb1TrnFFinFeeCntI,tb1TrnFFinFeeCntI,TB_1_TRN_FFIN_FEE_CNT_I_LEN,true);
   }
   

   protected int checkTb1TrnFFinFeeCntIMaxLimit(long number) {
	   return (int)checkMaxLimit(number , MAX_1G /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshTb1TrnFFinFeeCntI is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshTb1TrnFFinFeeCntI() throws CFException {	
   	try { 
		 return (getIntDecimal(beginTb1TrnFFinFeeCntI,TB_1_TRN_FFIN_FEE_CNT_I_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("tb1TrnFFinFeeCntI", beginTb1TrnFFinFeeCntI,TB_1_TRN_FFIN_FEE_CNT_I_LEN);
     }
   	}
        int localTb1TrnFPctFeeCntICounter = -1;
        public boolean isTb1TrnFPctFeeCntIModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localTb1TrnFPctFeeCntICounter != sharedCounter;
           localTb1TrnFPctFeeCntICounter = sharedCounter; return hasModified; 
        }
	    public boolean tb1TrnFPctFeeCntIIsNumeric() {
	      return decimalIsNumeric(beginTb1TrnFPctFeeCntI,TB_1_TRN_FPCT_FEE_CNT_I_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int TB_1_TRN_FPCT_FEE_CNT_I_LEN = 5;
  	/**
	 * 	serializeTb1TrnFPctFeeCntI
	 */
	protected void serializeTb1TrnFPctFeeCntI(int tb1TrnFPctFeeCntI) {
		   putDecimal(beginTb1TrnFPctFeeCntI,tb1TrnFPctFeeCntI,TB_1_TRN_FPCT_FEE_CNT_I_LEN,true);
   }
   

   protected int checkTb1TrnFPctFeeCntIMaxLimit(long number) {
	   return (int)checkMaxLimit(number , MAX_1G /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshTb1TrnFPctFeeCntI is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshTb1TrnFPctFeeCntI() throws CFException {	
   	try { 
		 return (getIntDecimal(beginTb1TrnFPctFeeCntI,TB_1_TRN_FPCT_FEE_CNT_I_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("tb1TrnFPctFeeCntI", beginTb1TrnFPctFeeCntI,TB_1_TRN_FPCT_FEE_CNT_I_LEN);
     }
   	}
        int localTb1TrnFNfinFeeCntICounter = -1;
        public boolean isTb1TrnFNfinFeeCntIModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localTb1TrnFNfinFeeCntICounter != sharedCounter;
           localTb1TrnFNfinFeeCntICounter = sharedCounter; return hasModified; 
        }
	    public boolean tb1TrnFNfinFeeCntIIsNumeric() {
	      return decimalIsNumeric(beginTb1TrnFNfinFeeCntI,TB_1_TRN_FNFIN_FEE_CNT_I_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int TB_1_TRN_FNFIN_FEE_CNT_I_LEN = 5;
  	/**
	 * 	serializeTb1TrnFNfinFeeCntI
	 */
	protected void serializeTb1TrnFNfinFeeCntI(int tb1TrnFNfinFeeCntI) {
		   putDecimal(beginTb1TrnFNfinFeeCntI,tb1TrnFNfinFeeCntI,TB_1_TRN_FNFIN_FEE_CNT_I_LEN,true);
   }
   

   protected int checkTb1TrnFNfinFeeCntIMaxLimit(long number) {
	   return (int)checkMaxLimit(number , MAX_1G /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshTb1TrnFNfinFeeCntI is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshTb1TrnFNfinFeeCntI() throws CFException {	
   	try { 
		 return (getIntDecimal(beginTb1TrnFNfinFeeCntI,TB_1_TRN_FNFIN_FEE_CNT_I_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("tb1TrnFNfinFeeCntI", beginTb1TrnFNfinFeeCntI,TB_1_TRN_FNFIN_FEE_CNT_I_LEN);
     }
   	}
        int localTb1TrnFNbilFeeCntICounter = -1;
        public boolean isTb1TrnFNbilFeeCntIModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localTb1TrnFNbilFeeCntICounter != sharedCounter;
           localTb1TrnFNbilFeeCntICounter = sharedCounter; return hasModified; 
        }
	    public boolean tb1TrnFNbilFeeCntIIsNumeric() {
	      return decimalIsNumeric(beginTb1TrnFNbilFeeCntI,TB_1_TRN_FNBIL_FEE_CNT_I_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int TB_1_TRN_FNBIL_FEE_CNT_I_LEN = 5;
  	/**
	 * 	serializeTb1TrnFNbilFeeCntI
	 */
	protected void serializeTb1TrnFNbilFeeCntI(int tb1TrnFNbilFeeCntI) {
		   putDecimal(beginTb1TrnFNbilFeeCntI,tb1TrnFNbilFeeCntI,TB_1_TRN_FNBIL_FEE_CNT_I_LEN,true);
   }
   

   protected int checkTb1TrnFNbilFeeCntIMaxLimit(long number) {
	   return (int)checkMaxLimit(number , MAX_1G /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshTb1TrnFNbilFeeCntI is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshTb1TrnFNbilFeeCntI() throws CFException {	
   	try { 
		 return (getIntDecimal(beginTb1TrnFNbilFeeCntI,TB_1_TRN_FNBIL_FEE_CNT_I_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("tb1TrnFNbilFeeCntI", beginTb1TrnFNbilFeeCntI,TB_1_TRN_FNBIL_FEE_CNT_I_LEN);
     }
   	}
        int localTb1TrnFFeeAmtICrCounter = -1;
        public boolean isTb1TrnFFeeAmtICrModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localTb1TrnFFeeAmtICrCounter != sharedCounter;
           localTb1TrnFFeeAmtICrCounter = sharedCounter; return hasModified; 
        }
	    public boolean tb1TrnFFeeAmtICrIsNumeric() {
	      return decimalIsNumeric(beginTb1TrnFFeeAmtICr,TB_1_TRN_FFEE_AMT_ICR_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int TB_1_TRN_FFEE_AMT_ICR_LEN = 9;
  	/**
	 * 	serializeTb1TrnFFeeAmtICr
	 */
	protected void serializeTb1TrnFFeeAmtICr(long tb1TrnFFeeAmtICr) {
		   putDecimal(beginTb1TrnFFeeAmtICr,tb1TrnFFeeAmtICr,TB_1_TRN_FFEE_AMT_ICR_LEN,true);
   }
   

   protected long checkTb1TrnFFeeAmtICrMaxLimit(long number) {
        return checkMaxLimit(number , MAX_100P /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshTb1TrnFFeeAmtICr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshTb1TrnFFeeAmtICr() throws CFException {	
   	try { 
		 return (getLongDecimal(beginTb1TrnFFeeAmtICr,TB_1_TRN_FFEE_AMT_ICR_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("tb1TrnFFeeAmtICr", beginTb1TrnFFeeAmtICr,TB_1_TRN_FFEE_AMT_ICR_LEN);
     }
   	}
        int localTb1TrnFFeeAmtIDbCounter = -1;
        public boolean isTb1TrnFFeeAmtIDbModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localTb1TrnFFeeAmtIDbCounter != sharedCounter;
           localTb1TrnFFeeAmtIDbCounter = sharedCounter; return hasModified; 
        }
	    public boolean tb1TrnFFeeAmtIDbIsNumeric() {
	      return decimalIsNumeric(beginTb1TrnFFeeAmtIDb,TB_1_TRN_FFEE_AMT_IDB_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int TB_1_TRN_FFEE_AMT_IDB_LEN = 9;
  	/**
	 * 	serializeTb1TrnFFeeAmtIDb
	 */
	protected void serializeTb1TrnFFeeAmtIDb(long tb1TrnFFeeAmtIDb) {
		   putDecimal(beginTb1TrnFFeeAmtIDb,tb1TrnFFeeAmtIDb,TB_1_TRN_FFEE_AMT_IDB_LEN,true);
   }
   

   protected long checkTb1TrnFFeeAmtIDbMaxLimit(long number) {
        return checkMaxLimit(number , MAX_100P /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshTb1TrnFFeeAmtIDb is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshTb1TrnFFeeAmtIDb() throws CFException {	
   	try { 
		 return (getLongDecimal(beginTb1TrnFFeeAmtIDb,TB_1_TRN_FFEE_AMT_IDB_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("tb1TrnFFeeAmtIDb", beginTb1TrnFFeeAmtIDb,TB_1_TRN_FFEE_AMT_IDB_LEN);
     }
   	}
        int localTb1TrnFMcrAmtICrCounter = -1;
        public boolean isTb1TrnFMcrAmtICrModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localTb1TrnFMcrAmtICrCounter != sharedCounter;
           localTb1TrnFMcrAmtICrCounter = sharedCounter; return hasModified; 
        }
	    public boolean tb1TrnFMcrAmtICrIsNumeric() {
	      return decimalIsNumeric(beginTb1TrnFMcrAmtICr,TB_1_TRN_FMCR_AMT_ICR_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int TB_1_TRN_FMCR_AMT_ICR_LEN = 9;
  	/**
	 * 	serializeTb1TrnFMcrAmtICr
	 */
	protected void serializeTb1TrnFMcrAmtICr(long tb1TrnFMcrAmtICr) {
		   putDecimal(beginTb1TrnFMcrAmtICr,tb1TrnFMcrAmtICr,TB_1_TRN_FMCR_AMT_ICR_LEN,true);
   }
   

   protected long checkTb1TrnFMcrAmtICrMaxLimit(long number) {
        return checkMaxLimit(number , MAX_100P /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshTb1TrnFMcrAmtICr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshTb1TrnFMcrAmtICr() throws CFException {	
   	try { 
		 return (getLongDecimal(beginTb1TrnFMcrAmtICr,TB_1_TRN_FMCR_AMT_ICR_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("tb1TrnFMcrAmtICr", beginTb1TrnFMcrAmtICr,TB_1_TRN_FMCR_AMT_ICR_LEN);
     }
   	}
        int localTb1TrnFMcrAmtIDbCounter = -1;
        public boolean isTb1TrnFMcrAmtIDbModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localTb1TrnFMcrAmtIDbCounter != sharedCounter;
           localTb1TrnFMcrAmtIDbCounter = sharedCounter; return hasModified; 
        }
	    public boolean tb1TrnFMcrAmtIDbIsNumeric() {
	      return decimalIsNumeric(beginTb1TrnFMcrAmtIDb,TB_1_TRN_FMCR_AMT_IDB_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int TB_1_TRN_FMCR_AMT_IDB_LEN = 9;
  	/**
	 * 	serializeTb1TrnFMcrAmtIDb
	 */
	protected void serializeTb1TrnFMcrAmtIDb(long tb1TrnFMcrAmtIDb) {
		   putDecimal(beginTb1TrnFMcrAmtIDb,tb1TrnFMcrAmtIDb,TB_1_TRN_FMCR_AMT_IDB_LEN,true);
   }
   

   protected long checkTb1TrnFMcrAmtIDbMaxLimit(long number) {
        return checkMaxLimit(number , MAX_100P /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshTb1TrnFMcrAmtIDb is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshTb1TrnFMcrAmtIDb() throws CFException {	
   	try { 
		 return (getLongDecimal(beginTb1TrnFMcrAmtIDb,TB_1_TRN_FMCR_AMT_IDB_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("tb1TrnFMcrAmtIDb", beginTb1TrnFMcrAmtIDb,TB_1_TRN_FMCR_AMT_IDB_LEN);
     }
   	}
        int localTb1TrnFIcrAmtICrCounter = -1;
        public boolean isTb1TrnFIcrAmtICrModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localTb1TrnFIcrAmtICrCounter != sharedCounter;
           localTb1TrnFIcrAmtICrCounter = sharedCounter; return hasModified; 
        }
	    public boolean tb1TrnFIcrAmtICrIsNumeric() {
	      return decimalIsNumeric(beginTb1TrnFIcrAmtICr,TB_1_TRN_FICR_AMT_ICR_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int TB_1_TRN_FICR_AMT_ICR_LEN = 9;
  	/**
	 * 	serializeTb1TrnFIcrAmtICr
	 */
	protected void serializeTb1TrnFIcrAmtICr(long tb1TrnFIcrAmtICr) {
		   putDecimal(beginTb1TrnFIcrAmtICr,tb1TrnFIcrAmtICr,TB_1_TRN_FICR_AMT_ICR_LEN,true);
   }
   

   protected long checkTb1TrnFIcrAmtICrMaxLimit(long number) {
        return checkMaxLimit(number , MAX_100P /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshTb1TrnFIcrAmtICr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshTb1TrnFIcrAmtICr() throws CFException {	
   	try { 
		 return (getLongDecimal(beginTb1TrnFIcrAmtICr,TB_1_TRN_FICR_AMT_ICR_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("tb1TrnFIcrAmtICr", beginTb1TrnFIcrAmtICr,TB_1_TRN_FICR_AMT_ICR_LEN);
     }
   	}
        int localTb1TrnFIcrAmtIDbCounter = -1;
        public boolean isTb1TrnFIcrAmtIDbModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localTb1TrnFIcrAmtIDbCounter != sharedCounter;
           localTb1TrnFIcrAmtIDbCounter = sharedCounter; return hasModified; 
        }
	    public boolean tb1TrnFIcrAmtIDbIsNumeric() {
	      return decimalIsNumeric(beginTb1TrnFIcrAmtIDb,TB_1_TRN_FICR_AMT_IDB_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int TB_1_TRN_FICR_AMT_IDB_LEN = 9;
  	/**
	 * 	serializeTb1TrnFIcrAmtIDb
	 */
	protected void serializeTb1TrnFIcrAmtIDb(long tb1TrnFIcrAmtIDb) {
		   putDecimal(beginTb1TrnFIcrAmtIDb,tb1TrnFIcrAmtIDb,TB_1_TRN_FICR_AMT_IDB_LEN,true);
   }
   

   protected long checkTb1TrnFIcrAmtIDbMaxLimit(long number) {
        return checkMaxLimit(number , MAX_100P /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshTb1TrnFIcrAmtIDb is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshTb1TrnFIcrAmtIDb() throws CFException {	
   	try { 
		 return (getLongDecimal(beginTb1TrnFIcrAmtIDb,TB_1_TRN_FICR_AMT_IDB_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("tb1TrnFIcrAmtIDb", beginTb1TrnFIcrAmtIDb,TB_1_TRN_FICR_AMT_IDB_LEN);
     }
   	}
        int localTb1TrnEFinAppCntICrCounter = -1;
        public boolean isTb1TrnEFinAppCntICrModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localTb1TrnEFinAppCntICrCounter != sharedCounter;
           localTb1TrnEFinAppCntICrCounter = sharedCounter; return hasModified; 
        }
	    public boolean tb1TrnEFinAppCntICrIsNumeric() {
	      return decimalIsNumeric(beginTb1TrnEFinAppCntICr,TB_1_TRN_EFIN_APP_CNT_ICR_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int TB_1_TRN_EFIN_APP_CNT_ICR_LEN = 5;
  	/**
	 * 	serializeTb1TrnEFinAppCntICr
	 */
	protected void serializeTb1TrnEFinAppCntICr(int tb1TrnEFinAppCntICr) {
		   putDecimal(beginTb1TrnEFinAppCntICr,tb1TrnEFinAppCntICr,TB_1_TRN_EFIN_APP_CNT_ICR_LEN,true);
   }
   

   protected int checkTb1TrnEFinAppCntICrMaxLimit(long number) {
	   return (int)checkMaxLimit(number , MAX_1G /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshTb1TrnEFinAppCntICr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshTb1TrnEFinAppCntICr() throws CFException {	
   	try { 
		 return (getIntDecimal(beginTb1TrnEFinAppCntICr,TB_1_TRN_EFIN_APP_CNT_ICR_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("tb1TrnEFinAppCntICr", beginTb1TrnEFinAppCntICr,TB_1_TRN_EFIN_APP_CNT_ICR_LEN);
     }
   	}
        int localTb1TrnEFinAppCntIDbCounter = -1;
        public boolean isTb1TrnEFinAppCntIDbModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localTb1TrnEFinAppCntIDbCounter != sharedCounter;
           localTb1TrnEFinAppCntIDbCounter = sharedCounter; return hasModified; 
        }
	    public boolean tb1TrnEFinAppCntIDbIsNumeric() {
	      return decimalIsNumeric(beginTb1TrnEFinAppCntIDb,TB_1_TRN_EFIN_APP_CNT_IDB_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int TB_1_TRN_EFIN_APP_CNT_IDB_LEN = 5;
  	/**
	 * 	serializeTb1TrnEFinAppCntIDb
	 */
	protected void serializeTb1TrnEFinAppCntIDb(int tb1TrnEFinAppCntIDb) {
		   putDecimal(beginTb1TrnEFinAppCntIDb,tb1TrnEFinAppCntIDb,TB_1_TRN_EFIN_APP_CNT_IDB_LEN,true);
   }
   

   protected int checkTb1TrnEFinAppCntIDbMaxLimit(long number) {
	   return (int)checkMaxLimit(number , MAX_1G /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshTb1TrnEFinAppCntIDb is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshTb1TrnEFinAppCntIDb() throws CFException {	
   	try { 
		 return (getIntDecimal(beginTb1TrnEFinAppCntIDb,TB_1_TRN_EFIN_APP_CNT_IDB_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("tb1TrnEFinAppCntIDb", beginTb1TrnEFinAppCntIDb,TB_1_TRN_EFIN_APP_CNT_IDB_LEN);
     }
   	}
        int localTb1TrnENsdA15CntICrCounter = -1;
        public boolean isTb1TrnENsdA15CntICrModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localTb1TrnENsdA15CntICrCounter != sharedCounter;
           localTb1TrnENsdA15CntICrCounter = sharedCounter; return hasModified; 
        }
	    public boolean tb1TrnENsdA15CntICrIsNumeric() {
	      return decimalIsNumeric(beginTb1TrnENsdA15CntICr,TB_1_TRN_ENSD_A_15_CNT_ICR_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int TB_1_TRN_ENSD_A_15_CNT_ICR_LEN = 3;
  	/**
	 * 	serializeTb1TrnENsdA15CntICr
	 */
	protected void serializeTb1TrnENsdA15CntICr(int tb1TrnENsdA15CntICr) {
		   putDecimal(beginTb1TrnENsdA15CntICr,tb1TrnENsdA15CntICr,TB_1_TRN_ENSD_A_15_CNT_ICR_LEN,true);
   }
   

   protected int checkTb1TrnENsdA15CntICrMaxLimit(long number) {
	   return (int)checkMaxLimit(number , MAX_100K /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshTb1TrnENsdA15CntICr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshTb1TrnENsdA15CntICr() throws CFException {	
   	try { 
		 return (getIntDecimal(beginTb1TrnENsdA15CntICr,TB_1_TRN_ENSD_A_15_CNT_ICR_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("tb1TrnENsdA15CntICr", beginTb1TrnENsdA15CntICr,TB_1_TRN_ENSD_A_15_CNT_ICR_LEN);
     }
   	}
        int localTb1TrnENsdA15CntIDbCounter = -1;
        public boolean isTb1TrnENsdA15CntIDbModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localTb1TrnENsdA15CntIDbCounter != sharedCounter;
           localTb1TrnENsdA15CntIDbCounter = sharedCounter; return hasModified; 
        }
	    public boolean tb1TrnENsdA15CntIDbIsNumeric() {
	      return decimalIsNumeric(beginTb1TrnENsdA15CntIDb,TB_1_TRN_ENSD_A_15_CNT_IDB_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int TB_1_TRN_ENSD_A_15_CNT_IDB_LEN = 3;
  	/**
	 * 	serializeTb1TrnENsdA15CntIDb
	 */
	protected void serializeTb1TrnENsdA15CntIDb(int tb1TrnENsdA15CntIDb) {
		   putDecimal(beginTb1TrnENsdA15CntIDb,tb1TrnENsdA15CntIDb,TB_1_TRN_ENSD_A_15_CNT_IDB_LEN,true);
   }
   

   protected int checkTb1TrnENsdA15CntIDbMaxLimit(long number) {
	   return (int)checkMaxLimit(number , MAX_100K /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshTb1TrnENsdA15CntIDb is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshTb1TrnENsdA15CntIDb() throws CFException {	
   	try { 
		 return (getIntDecimal(beginTb1TrnENsdA15CntIDb,TB_1_TRN_ENSD_A_15_CNT_IDB_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("tb1TrnENsdA15CntIDb", beginTb1TrnENsdA15CntIDb,TB_1_TRN_ENSD_A_15_CNT_IDB_LEN);
     }
   	}
        int localTb1TrnEFinA09CntICrCounter = -1;
        public boolean isTb1TrnEFinA09CntICrModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localTb1TrnEFinA09CntICrCounter != sharedCounter;
           localTb1TrnEFinA09CntICrCounter = sharedCounter; return hasModified; 
        }
	    public boolean tb1TrnEFinA09CntICrIsNumeric() {
	      return decimalIsNumeric(beginTb1TrnEFinA09CntICr,TB_1_TRN_EFIN_A_09_CNT_ICR_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int TB_1_TRN_EFIN_A_09_CNT_ICR_LEN = 5;
  	/**
	 * 	serializeTb1TrnEFinA09CntICr
	 */
	protected void serializeTb1TrnEFinA09CntICr(int tb1TrnEFinA09CntICr) {
		   putDecimal(beginTb1TrnEFinA09CntICr,tb1TrnEFinA09CntICr,TB_1_TRN_EFIN_A_09_CNT_ICR_LEN,true);
   }
   

   protected int checkTb1TrnEFinA09CntICrMaxLimit(long number) {
	   return (int)checkMaxLimit(number , MAX_1G /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshTb1TrnEFinA09CntICr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshTb1TrnEFinA09CntICr() throws CFException {	
   	try { 
		 return (getIntDecimal(beginTb1TrnEFinA09CntICr,TB_1_TRN_EFIN_A_09_CNT_ICR_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("tb1TrnEFinA09CntICr", beginTb1TrnEFinA09CntICr,TB_1_TRN_EFIN_A_09_CNT_ICR_LEN);
     }
   	}
        int localTb1TrnEFinA09CntIDbCounter = -1;
        public boolean isTb1TrnEFinA09CntIDbModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localTb1TrnEFinA09CntIDbCounter != sharedCounter;
           localTb1TrnEFinA09CntIDbCounter = sharedCounter; return hasModified; 
        }
	    public boolean tb1TrnEFinA09CntIDbIsNumeric() {
	      return decimalIsNumeric(beginTb1TrnEFinA09CntIDb,TB_1_TRN_EFIN_A_09_CNT_IDB_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int TB_1_TRN_EFIN_A_09_CNT_IDB_LEN = 5;
  	/**
	 * 	serializeTb1TrnEFinA09CntIDb
	 */
	protected void serializeTb1TrnEFinA09CntIDb(int tb1TrnEFinA09CntIDb) {
		   putDecimal(beginTb1TrnEFinA09CntIDb,tb1TrnEFinA09CntIDb,TB_1_TRN_EFIN_A_09_CNT_IDB_LEN,true);
   }
   

   protected int checkTb1TrnEFinA09CntIDbMaxLimit(long number) {
	   return (int)checkMaxLimit(number , MAX_1G /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshTb1TrnEFinA09CntIDb is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshTb1TrnEFinA09CntIDb() throws CFException {	
   	try { 
		 return (getIntDecimal(beginTb1TrnEFinA09CntIDb,TB_1_TRN_EFIN_A_09_CNT_IDB_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("tb1TrnEFinA09CntIDb", beginTb1TrnEFinA09CntIDb,TB_1_TRN_EFIN_A_09_CNT_IDB_LEN);
     }
   	}
        int localTb1TrnEFinDenCntICrCounter = -1;
        public boolean isTb1TrnEFinDenCntICrModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localTb1TrnEFinDenCntICrCounter != sharedCounter;
           localTb1TrnEFinDenCntICrCounter = sharedCounter; return hasModified; 
        }
	    public boolean tb1TrnEFinDenCntICrIsNumeric() {
	      return decimalIsNumeric(beginTb1TrnEFinDenCntICr,TB_1_TRN_EFIN_DEN_CNT_ICR_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int TB_1_TRN_EFIN_DEN_CNT_ICR_LEN = 5;
  	/**
	 * 	serializeTb1TrnEFinDenCntICr
	 */
	protected void serializeTb1TrnEFinDenCntICr(int tb1TrnEFinDenCntICr) {
		   putDecimal(beginTb1TrnEFinDenCntICr,tb1TrnEFinDenCntICr,TB_1_TRN_EFIN_DEN_CNT_ICR_LEN,true);
   }
   

   protected int checkTb1TrnEFinDenCntICrMaxLimit(long number) {
	   return (int)checkMaxLimit(number , MAX_1G /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshTb1TrnEFinDenCntICr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshTb1TrnEFinDenCntICr() throws CFException {	
   	try { 
		 return (getIntDecimal(beginTb1TrnEFinDenCntICr,TB_1_TRN_EFIN_DEN_CNT_ICR_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("tb1TrnEFinDenCntICr", beginTb1TrnEFinDenCntICr,TB_1_TRN_EFIN_DEN_CNT_ICR_LEN);
     }
   	}
        int localTb1TrnEFinDenCntIDbCounter = -1;
        public boolean isTb1TrnEFinDenCntIDbModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localTb1TrnEFinDenCntIDbCounter != sharedCounter;
           localTb1TrnEFinDenCntIDbCounter = sharedCounter; return hasModified; 
        }
	    public boolean tb1TrnEFinDenCntIDbIsNumeric() {
	      return decimalIsNumeric(beginTb1TrnEFinDenCntIDb,TB_1_TRN_EFIN_DEN_CNT_IDB_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int TB_1_TRN_EFIN_DEN_CNT_IDB_LEN = 5;
  	/**
	 * 	serializeTb1TrnEFinDenCntIDb
	 */
	protected void serializeTb1TrnEFinDenCntIDb(int tb1TrnEFinDenCntIDb) {
		   putDecimal(beginTb1TrnEFinDenCntIDb,tb1TrnEFinDenCntIDb,TB_1_TRN_EFIN_DEN_CNT_IDB_LEN,true);
   }
   

   protected int checkTb1TrnEFinDenCntIDbMaxLimit(long number) {
	   return (int)checkMaxLimit(number , MAX_1G /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshTb1TrnEFinDenCntIDb is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshTb1TrnEFinDenCntIDb() throws CFException {	
   	try { 
		 return (getIntDecimal(beginTb1TrnEFinDenCntIDb,TB_1_TRN_EFIN_DEN_CNT_IDB_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("tb1TrnEFinDenCntIDb", beginTb1TrnEFinDenCntIDb,TB_1_TRN_EFIN_DEN_CNT_IDB_LEN);
     }
   	}
        int localTb1TrnEFinAmtICrCounter = -1;
        public boolean isTb1TrnEFinAmtICrModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localTb1TrnEFinAmtICrCounter != sharedCounter;
           localTb1TrnEFinAmtICrCounter = sharedCounter; return hasModified; 
        }
	    public boolean tb1TrnEFinAmtICrIsNumeric() {
	      return decimalIsNumeric(beginTb1TrnEFinAmtICr,TB_1_TRN_EFIN_AMT_ICR_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int TB_1_TRN_EFIN_AMT_ICR_LEN = 9;
  	/**
	 * 	serializeTb1TrnEFinAmtICr
	 */
	protected void serializeTb1TrnEFinAmtICr(long tb1TrnEFinAmtICr) {
		   putDecimal(beginTb1TrnEFinAmtICr,tb1TrnEFinAmtICr,TB_1_TRN_EFIN_AMT_ICR_LEN,true);
   }
   

   protected long checkTb1TrnEFinAmtICrMaxLimit(long number) {
        return checkMaxLimit(number , MAX_100P /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshTb1TrnEFinAmtICr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshTb1TrnEFinAmtICr() throws CFException {	
   	try { 
		 return (getLongDecimal(beginTb1TrnEFinAmtICr,TB_1_TRN_EFIN_AMT_ICR_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("tb1TrnEFinAmtICr", beginTb1TrnEFinAmtICr,TB_1_TRN_EFIN_AMT_ICR_LEN);
     }
   	}
        int localTb1TrnEFinAmtIDbCounter = -1;
        public boolean isTb1TrnEFinAmtIDbModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localTb1TrnEFinAmtIDbCounter != sharedCounter;
           localTb1TrnEFinAmtIDbCounter = sharedCounter; return hasModified; 
        }
	    public boolean tb1TrnEFinAmtIDbIsNumeric() {
	      return decimalIsNumeric(beginTb1TrnEFinAmtIDb,TB_1_TRN_EFIN_AMT_IDB_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int TB_1_TRN_EFIN_AMT_IDB_LEN = 9;
  	/**
	 * 	serializeTb1TrnEFinAmtIDb
	 */
	protected void serializeTb1TrnEFinAmtIDb(long tb1TrnEFinAmtIDb) {
		   putDecimal(beginTb1TrnEFinAmtIDb,tb1TrnEFinAmtIDb,TB_1_TRN_EFIN_AMT_IDB_LEN,true);
   }
   

   protected long checkTb1TrnEFinAmtIDbMaxLimit(long number) {
        return checkMaxLimit(number , MAX_100P /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshTb1TrnEFinAmtIDb is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshTb1TrnEFinAmtIDb() throws CFException {	
   	try { 
		 return (getLongDecimal(beginTb1TrnEFinAmtIDb,TB_1_TRN_EFIN_AMT_IDB_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("tb1TrnEFinAmtIDb", beginTb1TrnEFinAmtIDb,TB_1_TRN_EFIN_AMT_IDB_LEN);
     }
   	}
        int localTb1TrnEFinA09AmtICrCounter = -1;
        public boolean isTb1TrnEFinA09AmtICrModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localTb1TrnEFinA09AmtICrCounter != sharedCounter;
           localTb1TrnEFinA09AmtICrCounter = sharedCounter; return hasModified; 
        }
	    public boolean tb1TrnEFinA09AmtICrIsNumeric() {
	      return decimalIsNumeric(beginTb1TrnEFinA09AmtICr,TB_1_TRN_EFIN_A_09_AMT_ICR_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int TB_1_TRN_EFIN_A_09_AMT_ICR_LEN = 9;
  	/**
	 * 	serializeTb1TrnEFinA09AmtICr
	 */
	protected void serializeTb1TrnEFinA09AmtICr(long tb1TrnEFinA09AmtICr) {
		   putDecimal(beginTb1TrnEFinA09AmtICr,tb1TrnEFinA09AmtICr,TB_1_TRN_EFIN_A_09_AMT_ICR_LEN,true);
   }
   

   protected long checkTb1TrnEFinA09AmtICrMaxLimit(long number) {
        return checkMaxLimit(number , MAX_100P /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshTb1TrnEFinA09AmtICr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshTb1TrnEFinA09AmtICr() throws CFException {	
   	try { 
		 return (getLongDecimal(beginTb1TrnEFinA09AmtICr,TB_1_TRN_EFIN_A_09_AMT_ICR_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("tb1TrnEFinA09AmtICr", beginTb1TrnEFinA09AmtICr,TB_1_TRN_EFIN_A_09_AMT_ICR_LEN);
     }
   	}
        int localTb1TrnEFinA09AmtIDbCounter = -1;
        public boolean isTb1TrnEFinA09AmtIDbModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localTb1TrnEFinA09AmtIDbCounter != sharedCounter;
           localTb1TrnEFinA09AmtIDbCounter = sharedCounter; return hasModified; 
        }
	    public boolean tb1TrnEFinA09AmtIDbIsNumeric() {
	      return decimalIsNumeric(beginTb1TrnEFinA09AmtIDb,TB_1_TRN_EFIN_A_09_AMT_IDB_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int TB_1_TRN_EFIN_A_09_AMT_IDB_LEN = 9;
  	/**
	 * 	serializeTb1TrnEFinA09AmtIDb
	 */
	protected void serializeTb1TrnEFinA09AmtIDb(long tb1TrnEFinA09AmtIDb) {
		   putDecimal(beginTb1TrnEFinA09AmtIDb,tb1TrnEFinA09AmtIDb,TB_1_TRN_EFIN_A_09_AMT_IDB_LEN,true);
   }
   

   protected long checkTb1TrnEFinA09AmtIDbMaxLimit(long number) {
        return checkMaxLimit(number , MAX_100P /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshTb1TrnEFinA09AmtIDb is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshTb1TrnEFinA09AmtIDb() throws CFException {	
   	try { 
		 return (getLongDecimal(beginTb1TrnEFinA09AmtIDb,TB_1_TRN_EFIN_A_09_AMT_IDB_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("tb1TrnEFinA09AmtIDb", beginTb1TrnEFinA09AmtIDb,TB_1_TRN_EFIN_A_09_AMT_IDB_LEN);
     }
   	}
        int localTb1TrnEFinFeeCntICounter = -1;
        public boolean isTb1TrnEFinFeeCntIModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localTb1TrnEFinFeeCntICounter != sharedCounter;
           localTb1TrnEFinFeeCntICounter = sharedCounter; return hasModified; 
        }
	    public boolean tb1TrnEFinFeeCntIIsNumeric() {
	      return decimalIsNumeric(beginTb1TrnEFinFeeCntI,TB_1_TRN_EFIN_FEE_CNT_I_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int TB_1_TRN_EFIN_FEE_CNT_I_LEN = 5;
  	/**
	 * 	serializeTb1TrnEFinFeeCntI
	 */
	protected void serializeTb1TrnEFinFeeCntI(int tb1TrnEFinFeeCntI) {
		   putDecimal(beginTb1TrnEFinFeeCntI,tb1TrnEFinFeeCntI,TB_1_TRN_EFIN_FEE_CNT_I_LEN,true);
   }
   

   protected int checkTb1TrnEFinFeeCntIMaxLimit(long number) {
	   return (int)checkMaxLimit(number , MAX_1G /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshTb1TrnEFinFeeCntI is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshTb1TrnEFinFeeCntI() throws CFException {	
   	try { 
		 return (getIntDecimal(beginTb1TrnEFinFeeCntI,TB_1_TRN_EFIN_FEE_CNT_I_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("tb1TrnEFinFeeCntI", beginTb1TrnEFinFeeCntI,TB_1_TRN_EFIN_FEE_CNT_I_LEN);
     }
   	}
        int localTb1TrnEPctFeeCntICounter = -1;
        public boolean isTb1TrnEPctFeeCntIModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localTb1TrnEPctFeeCntICounter != sharedCounter;
           localTb1TrnEPctFeeCntICounter = sharedCounter; return hasModified; 
        }
	    public boolean tb1TrnEPctFeeCntIIsNumeric() {
	      return decimalIsNumeric(beginTb1TrnEPctFeeCntI,TB_1_TRN_EPCT_FEE_CNT_I_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int TB_1_TRN_EPCT_FEE_CNT_I_LEN = 5;
  	/**
	 * 	serializeTb1TrnEPctFeeCntI
	 */
	protected void serializeTb1TrnEPctFeeCntI(int tb1TrnEPctFeeCntI) {
		   putDecimal(beginTb1TrnEPctFeeCntI,tb1TrnEPctFeeCntI,TB_1_TRN_EPCT_FEE_CNT_I_LEN,true);
   }
   

   protected int checkTb1TrnEPctFeeCntIMaxLimit(long number) {
	   return (int)checkMaxLimit(number , MAX_1G /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshTb1TrnEPctFeeCntI is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshTb1TrnEPctFeeCntI() throws CFException {	
   	try { 
		 return (getIntDecimal(beginTb1TrnEPctFeeCntI,TB_1_TRN_EPCT_FEE_CNT_I_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("tb1TrnEPctFeeCntI", beginTb1TrnEPctFeeCntI,TB_1_TRN_EPCT_FEE_CNT_I_LEN);
     }
   	}
        int localTb1TrnENfinFeeCntICounter = -1;
        public boolean isTb1TrnENfinFeeCntIModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localTb1TrnENfinFeeCntICounter != sharedCounter;
           localTb1TrnENfinFeeCntICounter = sharedCounter; return hasModified; 
        }
	    public boolean tb1TrnENfinFeeCntIIsNumeric() {
	      return decimalIsNumeric(beginTb1TrnENfinFeeCntI,TB_1_TRN_ENFIN_FEE_CNT_I_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int TB_1_TRN_ENFIN_FEE_CNT_I_LEN = 5;
  	/**
	 * 	serializeTb1TrnENfinFeeCntI
	 */
	protected void serializeTb1TrnENfinFeeCntI(int tb1TrnENfinFeeCntI) {
		   putDecimal(beginTb1TrnENfinFeeCntI,tb1TrnENfinFeeCntI,TB_1_TRN_ENFIN_FEE_CNT_I_LEN,true);
   }
   

   protected int checkTb1TrnENfinFeeCntIMaxLimit(long number) {
	   return (int)checkMaxLimit(number , MAX_1G /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshTb1TrnENfinFeeCntI is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshTb1TrnENfinFeeCntI() throws CFException {	
   	try { 
		 return (getIntDecimal(beginTb1TrnENfinFeeCntI,TB_1_TRN_ENFIN_FEE_CNT_I_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("tb1TrnENfinFeeCntI", beginTb1TrnENfinFeeCntI,TB_1_TRN_ENFIN_FEE_CNT_I_LEN);
     }
   	}
        int localTb1TrnENbilFeeCntICounter = -1;
        public boolean isTb1TrnENbilFeeCntIModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localTb1TrnENbilFeeCntICounter != sharedCounter;
           localTb1TrnENbilFeeCntICounter = sharedCounter; return hasModified; 
        }
	    public boolean tb1TrnENbilFeeCntIIsNumeric() {
	      return decimalIsNumeric(beginTb1TrnENbilFeeCntI,TB_1_TRN_ENBIL_FEE_CNT_I_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int TB_1_TRN_ENBIL_FEE_CNT_I_LEN = 5;
  	/**
	 * 	serializeTb1TrnENbilFeeCntI
	 */
	protected void serializeTb1TrnENbilFeeCntI(int tb1TrnENbilFeeCntI) {
		   putDecimal(beginTb1TrnENbilFeeCntI,tb1TrnENbilFeeCntI,TB_1_TRN_ENBIL_FEE_CNT_I_LEN,true);
   }
   

   protected int checkTb1TrnENbilFeeCntIMaxLimit(long number) {
	   return (int)checkMaxLimit(number , MAX_1G /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshTb1TrnENbilFeeCntI is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshTb1TrnENbilFeeCntI() throws CFException {	
   	try { 
		 return (getIntDecimal(beginTb1TrnENbilFeeCntI,TB_1_TRN_ENBIL_FEE_CNT_I_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("tb1TrnENbilFeeCntI", beginTb1TrnENbilFeeCntI,TB_1_TRN_ENBIL_FEE_CNT_I_LEN);
     }
   	}
        int localTb1TrnEFeeAmtICrCounter = -1;
        public boolean isTb1TrnEFeeAmtICrModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localTb1TrnEFeeAmtICrCounter != sharedCounter;
           localTb1TrnEFeeAmtICrCounter = sharedCounter; return hasModified; 
        }
	    public boolean tb1TrnEFeeAmtICrIsNumeric() {
	      return decimalIsNumeric(beginTb1TrnEFeeAmtICr,TB_1_TRN_EFEE_AMT_ICR_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int TB_1_TRN_EFEE_AMT_ICR_LEN = 8;
  	/**
	 * 	serializeTb1TrnEFeeAmtICr
	 */
	protected void serializeTb1TrnEFeeAmtICr(long tb1TrnEFeeAmtICr) {
		   putDecimal(beginTb1TrnEFeeAmtICr,tb1TrnEFeeAmtICr,TB_1_TRN_EFEE_AMT_ICR_LEN,true);
   }
   

   protected long checkTb1TrnEFeeAmtICrMaxLimit(long number) {
        return checkMaxLimit(number , MAX_1P /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshTb1TrnEFeeAmtICr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshTb1TrnEFeeAmtICr() throws CFException {	
   	try { 
		 return (getLongDecimal(beginTb1TrnEFeeAmtICr,TB_1_TRN_EFEE_AMT_ICR_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("tb1TrnEFeeAmtICr", beginTb1TrnEFeeAmtICr,TB_1_TRN_EFEE_AMT_ICR_LEN);
     }
   	}
        int localTb1TrnEFeeAmtIDbCounter = -1;
        public boolean isTb1TrnEFeeAmtIDbModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localTb1TrnEFeeAmtIDbCounter != sharedCounter;
           localTb1TrnEFeeAmtIDbCounter = sharedCounter; return hasModified; 
        }
	    public boolean tb1TrnEFeeAmtIDbIsNumeric() {
	      return decimalIsNumeric(beginTb1TrnEFeeAmtIDb,TB_1_TRN_EFEE_AMT_IDB_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int TB_1_TRN_EFEE_AMT_IDB_LEN = 8;
  	/**
	 * 	serializeTb1TrnEFeeAmtIDb
	 */
	protected void serializeTb1TrnEFeeAmtIDb(long tb1TrnEFeeAmtIDb) {
		   putDecimal(beginTb1TrnEFeeAmtIDb,tb1TrnEFeeAmtIDb,TB_1_TRN_EFEE_AMT_IDB_LEN,true);
   }
   

   protected long checkTb1TrnEFeeAmtIDbMaxLimit(long number) {
        return checkMaxLimit(number , MAX_1P /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshTb1TrnEFeeAmtIDb is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshTb1TrnEFeeAmtIDb() throws CFException {	
   	try { 
		 return (getLongDecimal(beginTb1TrnEFeeAmtIDb,TB_1_TRN_EFEE_AMT_IDB_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("tb1TrnEFeeAmtIDb", beginTb1TrnEFeeAmtIDb,TB_1_TRN_EFEE_AMT_IDB_LEN);
     }
   	}
        int localTb1TrnEMcrAmtICrCounter = -1;
        public boolean isTb1TrnEMcrAmtICrModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localTb1TrnEMcrAmtICrCounter != sharedCounter;
           localTb1TrnEMcrAmtICrCounter = sharedCounter; return hasModified; 
        }
	    public boolean tb1TrnEMcrAmtICrIsNumeric() {
	      return decimalIsNumeric(beginTb1TrnEMcrAmtICr,TB_1_TRN_EMCR_AMT_ICR_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int TB_1_TRN_EMCR_AMT_ICR_LEN = 9;
  	/**
	 * 	serializeTb1TrnEMcrAmtICr
	 */
	protected void serializeTb1TrnEMcrAmtICr(long tb1TrnEMcrAmtICr) {
		   putDecimal(beginTb1TrnEMcrAmtICr,tb1TrnEMcrAmtICr,TB_1_TRN_EMCR_AMT_ICR_LEN,true);
   }
   

   protected long checkTb1TrnEMcrAmtICrMaxLimit(long number) {
        return checkMaxLimit(number , MAX_100P /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshTb1TrnEMcrAmtICr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshTb1TrnEMcrAmtICr() throws CFException {	
   	try { 
		 return (getLongDecimal(beginTb1TrnEMcrAmtICr,TB_1_TRN_EMCR_AMT_ICR_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("tb1TrnEMcrAmtICr", beginTb1TrnEMcrAmtICr,TB_1_TRN_EMCR_AMT_ICR_LEN);
     }
   	}
        int localTb1TrnEMcrAmtIDbCounter = -1;
        public boolean isTb1TrnEMcrAmtIDbModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localTb1TrnEMcrAmtIDbCounter != sharedCounter;
           localTb1TrnEMcrAmtIDbCounter = sharedCounter; return hasModified; 
        }
	    public boolean tb1TrnEMcrAmtIDbIsNumeric() {
	      return decimalIsNumeric(beginTb1TrnEMcrAmtIDb,TB_1_TRN_EMCR_AMT_IDB_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int TB_1_TRN_EMCR_AMT_IDB_LEN = 9;
  	/**
	 * 	serializeTb1TrnEMcrAmtIDb
	 */
	protected void serializeTb1TrnEMcrAmtIDb(long tb1TrnEMcrAmtIDb) {
		   putDecimal(beginTb1TrnEMcrAmtIDb,tb1TrnEMcrAmtIDb,TB_1_TRN_EMCR_AMT_IDB_LEN,true);
   }
   

   protected long checkTb1TrnEMcrAmtIDbMaxLimit(long number) {
        return checkMaxLimit(number , MAX_100P /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshTb1TrnEMcrAmtIDb is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshTb1TrnEMcrAmtIDb() throws CFException {	
   	try { 
		 return (getLongDecimal(beginTb1TrnEMcrAmtIDb,TB_1_TRN_EMCR_AMT_IDB_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("tb1TrnEMcrAmtIDb", beginTb1TrnEMcrAmtIDb,TB_1_TRN_EMCR_AMT_IDB_LEN);
     }
   	}
        int localTb1TrnEIcrAmtICrCounter = -1;
        public boolean isTb1TrnEIcrAmtICrModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localTb1TrnEIcrAmtICrCounter != sharedCounter;
           localTb1TrnEIcrAmtICrCounter = sharedCounter; return hasModified; 
        }
	    public boolean tb1TrnEIcrAmtICrIsNumeric() {
	      return decimalIsNumeric(beginTb1TrnEIcrAmtICr,TB_1_TRN_EICR_AMT_ICR_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int TB_1_TRN_EICR_AMT_ICR_LEN = 9;
  	/**
	 * 	serializeTb1TrnEIcrAmtICr
	 */
	protected void serializeTb1TrnEIcrAmtICr(long tb1TrnEIcrAmtICr) {
		   putDecimal(beginTb1TrnEIcrAmtICr,tb1TrnEIcrAmtICr,TB_1_TRN_EICR_AMT_ICR_LEN,true);
   }
   

   protected long checkTb1TrnEIcrAmtICrMaxLimit(long number) {
        return checkMaxLimit(number , MAX_100P /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshTb1TrnEIcrAmtICr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshTb1TrnEIcrAmtICr() throws CFException {	
   	try { 
		 return (getLongDecimal(beginTb1TrnEIcrAmtICr,TB_1_TRN_EICR_AMT_ICR_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("tb1TrnEIcrAmtICr", beginTb1TrnEIcrAmtICr,TB_1_TRN_EICR_AMT_ICR_LEN);
     }
   	}
        int localTb1TrnEIcrAmtIDbCounter = -1;
        public boolean isTb1TrnEIcrAmtIDbModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localTb1TrnEIcrAmtIDbCounter != sharedCounter;
           localTb1TrnEIcrAmtIDbCounter = sharedCounter; return hasModified; 
        }
	    public boolean tb1TrnEIcrAmtIDbIsNumeric() {
	      return decimalIsNumeric(beginTb1TrnEIcrAmtIDb,TB_1_TRN_EICR_AMT_IDB_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int TB_1_TRN_EICR_AMT_IDB_LEN = 9;
  	/**
	 * 	serializeTb1TrnEIcrAmtIDb
	 */
	protected void serializeTb1TrnEIcrAmtIDb(long tb1TrnEIcrAmtIDb) {
		   putDecimal(beginTb1TrnEIcrAmtIDb,tb1TrnEIcrAmtIDb,TB_1_TRN_EICR_AMT_IDB_LEN,true);
   }
   

   protected long checkTb1TrnEIcrAmtIDbMaxLimit(long number) {
        return checkMaxLimit(number , MAX_100P /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshTb1TrnEIcrAmtIDb is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshTb1TrnEIcrAmtIDb() throws CFException {	
   	try { 
		 return (getLongDecimal(beginTb1TrnEIcrAmtIDb,TB_1_TRN_EICR_AMT_IDB_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("tb1TrnEIcrAmtIDb", beginTb1TrnEIcrAmtIDb,TB_1_TRN_EICR_AMT_IDB_LEN);
     }
   	}
        int localTb1TrnAtmAcchrgCntACrCounter = -1;
        public boolean isTb1TrnAtmAcchrgCntACrModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localTb1TrnAtmAcchrgCntACrCounter != sharedCounter;
           localTb1TrnAtmAcchrgCntACrCounter = sharedCounter; return hasModified; 
        }
	    public boolean tb1TrnAtmAcchrgCntACrIsNumeric() {
	      return decimalIsNumeric(beginTb1TrnAtmAcchrgCntACr,TB_1_TRN_ATM_ACCHRG_CNT_ACR_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int TB_1_TRN_ATM_ACCHRG_CNT_ACR_LEN = 5;
  	/**
	 * 	serializeTb1TrnAtmAcchrgCntACr
	 */
	protected void serializeTb1TrnAtmAcchrgCntACr(int tb1TrnAtmAcchrgCntACr) {
		   putDecimal(beginTb1TrnAtmAcchrgCntACr,tb1TrnAtmAcchrgCntACr,TB_1_TRN_ATM_ACCHRG_CNT_ACR_LEN,true);
   }
   

   protected int checkTb1TrnAtmAcchrgCntACrMaxLimit(long number) {
	   return (int)checkMaxLimit(number , MAX_1G /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshTb1TrnAtmAcchrgCntACr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshTb1TrnAtmAcchrgCntACr() throws CFException {	
   	try { 
		 return (getIntDecimal(beginTb1TrnAtmAcchrgCntACr,TB_1_TRN_ATM_ACCHRG_CNT_ACR_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("tb1TrnAtmAcchrgCntACr", beginTb1TrnAtmAcchrgCntACr,TB_1_TRN_ATM_ACCHRG_CNT_ACR_LEN);
     }
   	}
        int localTb1TrnAtmAcchrgCntADbCounter = -1;
        public boolean isTb1TrnAtmAcchrgCntADbModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localTb1TrnAtmAcchrgCntADbCounter != sharedCounter;
           localTb1TrnAtmAcchrgCntADbCounter = sharedCounter; return hasModified; 
        }
	    public boolean tb1TrnAtmAcchrgCntADbIsNumeric() {
	      return decimalIsNumeric(beginTb1TrnAtmAcchrgCntADb,TB_1_TRN_ATM_ACCHRG_CNT_ADB_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int TB_1_TRN_ATM_ACCHRG_CNT_ADB_LEN = 5;
  	/**
	 * 	serializeTb1TrnAtmAcchrgCntADb
	 */
	protected void serializeTb1TrnAtmAcchrgCntADb(int tb1TrnAtmAcchrgCntADb) {
		   putDecimal(beginTb1TrnAtmAcchrgCntADb,tb1TrnAtmAcchrgCntADb,TB_1_TRN_ATM_ACCHRG_CNT_ADB_LEN,true);
   }
   

   protected int checkTb1TrnAtmAcchrgCntADbMaxLimit(long number) {
	   return (int)checkMaxLimit(number , MAX_1G /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshTb1TrnAtmAcchrgCntADb is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshTb1TrnAtmAcchrgCntADb() throws CFException {	
   	try { 
		 return (getIntDecimal(beginTb1TrnAtmAcchrgCntADb,TB_1_TRN_ATM_ACCHRG_CNT_ADB_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("tb1TrnAtmAcchrgCntADb", beginTb1TrnAtmAcchrgCntADb,TB_1_TRN_ATM_ACCHRG_CNT_ADB_LEN);
     }
   	}
        int localTb1TrnAtmAcchrgAmtACrCounter = -1;
        public boolean isTb1TrnAtmAcchrgAmtACrModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localTb1TrnAtmAcchrgAmtACrCounter != sharedCounter;
           localTb1TrnAtmAcchrgAmtACrCounter = sharedCounter; return hasModified; 
        }
	    public boolean tb1TrnAtmAcchrgAmtACrIsNumeric() {
	      return decimalIsNumeric(beginTb1TrnAtmAcchrgAmtACr,TB_1_TRN_ATM_ACCHRG_AMT_ACR_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] tb1TrnAtmAcchrgAmtACrString() {
            return getPackedString(beginTb1TrnAtmAcchrgAmtACr,TB_1_TRN_ATM_ACCHRG_AMT_ACR_LEN);
         }
   protected static final int TB_1_TRN_ATM_ACCHRG_AMT_ACR_LEN = 8;
   protected static final int TB_1_TRN_ATM_ACCHRG_AMT_ACR_SCALE = 2;
  	/**
	 * 	serializeTb1TrnAtmAcchrgAmtACr
	 */
	protected void serializeTb1TrnAtmAcchrgAmtACr(BigDecimal tb1TrnAtmAcchrgAmtACr) {
		   putDecimal(beginTb1TrnAtmAcchrgAmtACr,tb1TrnAtmAcchrgAmtACr,TB_1_TRN_ATM_ACCHRG_AMT_ACR_LEN,TB_1_TRN_ATM_ACCHRG_AMT_ACR_SCALE,true);
		 localTb1TrnAtmAcchrgAmtACrCounter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkTb1TrnAtmAcchrgAmtACrMaxLimit(BigDecimal number) {
			return checkMaxLimit(number,2/*scale*/,15/*precision*/);
   }
     /**
	 *	refreshTb1TrnAtmAcchrgAmtACr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshTb1TrnAtmAcchrgAmtACr() throws CFException {	
   	try { 
		 return (getDecimal(beginTb1TrnAtmAcchrgAmtACr,TB_1_TRN_ATM_ACCHRG_AMT_ACR_LEN,TB_1_TRN_ATM_ACCHRG_AMT_ACR_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("tb1TrnAtmAcchrgAmtACr", beginTb1TrnAtmAcchrgAmtACr,TB_1_TRN_ATM_ACCHRG_AMT_ACR_LEN);
     }
   	}
        int localTb1TrnAtmAcchrgAmtADbCounter = -1;
        public boolean isTb1TrnAtmAcchrgAmtADbModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localTb1TrnAtmAcchrgAmtADbCounter != sharedCounter;
           localTb1TrnAtmAcchrgAmtADbCounter = sharedCounter; return hasModified; 
        }
	    public boolean tb1TrnAtmAcchrgAmtADbIsNumeric() {
	      return decimalIsNumeric(beginTb1TrnAtmAcchrgAmtADb,TB_1_TRN_ATM_ACCHRG_AMT_ADB_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] tb1TrnAtmAcchrgAmtADbString() {
            return getPackedString(beginTb1TrnAtmAcchrgAmtADb,TB_1_TRN_ATM_ACCHRG_AMT_ADB_LEN);
         }
   protected static final int TB_1_TRN_ATM_ACCHRG_AMT_ADB_LEN = 8;
   protected static final int TB_1_TRN_ATM_ACCHRG_AMT_ADB_SCALE = 2;
  	/**
	 * 	serializeTb1TrnAtmAcchrgAmtADb
	 */
	protected void serializeTb1TrnAtmAcchrgAmtADb(BigDecimal tb1TrnAtmAcchrgAmtADb) {
		   putDecimal(beginTb1TrnAtmAcchrgAmtADb,tb1TrnAtmAcchrgAmtADb,TB_1_TRN_ATM_ACCHRG_AMT_ADB_LEN,TB_1_TRN_ATM_ACCHRG_AMT_ADB_SCALE,true);
		 localTb1TrnAtmAcchrgAmtADbCounter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkTb1TrnAtmAcchrgAmtADbMaxLimit(BigDecimal number) {
			return checkMaxLimit(number,2/*scale*/,15/*precision*/);
   }
     /**
	 *	refreshTb1TrnAtmAcchrgAmtADb is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshTb1TrnAtmAcchrgAmtADb() throws CFException {	
   	try { 
		 return (getDecimal(beginTb1TrnAtmAcchrgAmtADb,TB_1_TRN_ATM_ACCHRG_AMT_ADB_LEN,TB_1_TRN_ATM_ACCHRG_AMT_ADB_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("tb1TrnAtmAcchrgAmtADb", beginTb1TrnAtmAcchrgAmtADb,TB_1_TRN_ATM_ACCHRG_AMT_ADB_LEN);
     }
   	}
        int localTb1TrnPosAcchrgCntACrCounter = -1;
        public boolean isTb1TrnPosAcchrgCntACrModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localTb1TrnPosAcchrgCntACrCounter != sharedCounter;
           localTb1TrnPosAcchrgCntACrCounter = sharedCounter; return hasModified; 
        }
	    public boolean tb1TrnPosAcchrgCntACrIsNumeric() {
	      return decimalIsNumeric(beginTb1TrnPosAcchrgCntACr,TB_1_TRN_POS_ACCHRG_CNT_ACR_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int TB_1_TRN_POS_ACCHRG_CNT_ACR_LEN = 5;
  	/**
	 * 	serializeTb1TrnPosAcchrgCntACr
	 */
	protected void serializeTb1TrnPosAcchrgCntACr(int tb1TrnPosAcchrgCntACr) {
		   putDecimal(beginTb1TrnPosAcchrgCntACr,tb1TrnPosAcchrgCntACr,TB_1_TRN_POS_ACCHRG_CNT_ACR_LEN,true);
   }
   

   protected int checkTb1TrnPosAcchrgCntACrMaxLimit(long number) {
	   return (int)checkMaxLimit(number , MAX_1G /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshTb1TrnPosAcchrgCntACr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshTb1TrnPosAcchrgCntACr() throws CFException {	
   	try { 
		 return (getIntDecimal(beginTb1TrnPosAcchrgCntACr,TB_1_TRN_POS_ACCHRG_CNT_ACR_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("tb1TrnPosAcchrgCntACr", beginTb1TrnPosAcchrgCntACr,TB_1_TRN_POS_ACCHRG_CNT_ACR_LEN);
     }
   	}
        int localTb1TrnPosAcchrgCntADbCounter = -1;
        public boolean isTb1TrnPosAcchrgCntADbModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localTb1TrnPosAcchrgCntADbCounter != sharedCounter;
           localTb1TrnPosAcchrgCntADbCounter = sharedCounter; return hasModified; 
        }
	    public boolean tb1TrnPosAcchrgCntADbIsNumeric() {
	      return decimalIsNumeric(beginTb1TrnPosAcchrgCntADb,TB_1_TRN_POS_ACCHRG_CNT_ADB_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int TB_1_TRN_POS_ACCHRG_CNT_ADB_LEN = 5;
  	/**
	 * 	serializeTb1TrnPosAcchrgCntADb
	 */
	protected void serializeTb1TrnPosAcchrgCntADb(int tb1TrnPosAcchrgCntADb) {
		   putDecimal(beginTb1TrnPosAcchrgCntADb,tb1TrnPosAcchrgCntADb,TB_1_TRN_POS_ACCHRG_CNT_ADB_LEN,true);
   }
   

   protected int checkTb1TrnPosAcchrgCntADbMaxLimit(long number) {
	   return (int)checkMaxLimit(number , MAX_1G /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshTb1TrnPosAcchrgCntADb is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshTb1TrnPosAcchrgCntADb() throws CFException {	
   	try { 
		 return (getIntDecimal(beginTb1TrnPosAcchrgCntADb,TB_1_TRN_POS_ACCHRG_CNT_ADB_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("tb1TrnPosAcchrgCntADb", beginTb1TrnPosAcchrgCntADb,TB_1_TRN_POS_ACCHRG_CNT_ADB_LEN);
     }
   	}
        int localTb1TrnPosAcchrgAmtACrCounter = -1;
        public boolean isTb1TrnPosAcchrgAmtACrModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localTb1TrnPosAcchrgAmtACrCounter != sharedCounter;
           localTb1TrnPosAcchrgAmtACrCounter = sharedCounter; return hasModified; 
        }
	    public boolean tb1TrnPosAcchrgAmtACrIsNumeric() {
	      return decimalIsNumeric(beginTb1TrnPosAcchrgAmtACr,TB_1_TRN_POS_ACCHRG_AMT_ACR_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] tb1TrnPosAcchrgAmtACrString() {
            return getPackedString(beginTb1TrnPosAcchrgAmtACr,TB_1_TRN_POS_ACCHRG_AMT_ACR_LEN);
         }
   protected static final int TB_1_TRN_POS_ACCHRG_AMT_ACR_LEN = 8;
   protected static final int TB_1_TRN_POS_ACCHRG_AMT_ACR_SCALE = 2;
  	/**
	 * 	serializeTb1TrnPosAcchrgAmtACr
	 */
	protected void serializeTb1TrnPosAcchrgAmtACr(BigDecimal tb1TrnPosAcchrgAmtACr) {
		   putDecimal(beginTb1TrnPosAcchrgAmtACr,tb1TrnPosAcchrgAmtACr,TB_1_TRN_POS_ACCHRG_AMT_ACR_LEN,TB_1_TRN_POS_ACCHRG_AMT_ACR_SCALE,true);
		 localTb1TrnPosAcchrgAmtACrCounter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkTb1TrnPosAcchrgAmtACrMaxLimit(BigDecimal number) {
			return checkMaxLimit(number,2/*scale*/,15/*precision*/);
   }
     /**
	 *	refreshTb1TrnPosAcchrgAmtACr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshTb1TrnPosAcchrgAmtACr() throws CFException {	
   	try { 
		 return (getDecimal(beginTb1TrnPosAcchrgAmtACr,TB_1_TRN_POS_ACCHRG_AMT_ACR_LEN,TB_1_TRN_POS_ACCHRG_AMT_ACR_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("tb1TrnPosAcchrgAmtACr", beginTb1TrnPosAcchrgAmtACr,TB_1_TRN_POS_ACCHRG_AMT_ACR_LEN);
     }
   	}
        int localTb1TrnPosAcchrgAmtADbCounter = -1;
        public boolean isTb1TrnPosAcchrgAmtADbModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localTb1TrnPosAcchrgAmtADbCounter != sharedCounter;
           localTb1TrnPosAcchrgAmtADbCounter = sharedCounter; return hasModified; 
        }
	    public boolean tb1TrnPosAcchrgAmtADbIsNumeric() {
	      return decimalIsNumeric(beginTb1TrnPosAcchrgAmtADb,TB_1_TRN_POS_ACCHRG_AMT_ADB_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] tb1TrnPosAcchrgAmtADbString() {
            return getPackedString(beginTb1TrnPosAcchrgAmtADb,TB_1_TRN_POS_ACCHRG_AMT_ADB_LEN);
         }
   protected static final int TB_1_TRN_POS_ACCHRG_AMT_ADB_LEN = 8;
   protected static final int TB_1_TRN_POS_ACCHRG_AMT_ADB_SCALE = 2;
  	/**
	 * 	serializeTb1TrnPosAcchrgAmtADb
	 */
	protected void serializeTb1TrnPosAcchrgAmtADb(BigDecimal tb1TrnPosAcchrgAmtADb) {
		   putDecimal(beginTb1TrnPosAcchrgAmtADb,tb1TrnPosAcchrgAmtADb,TB_1_TRN_POS_ACCHRG_AMT_ADB_LEN,TB_1_TRN_POS_ACCHRG_AMT_ADB_SCALE,true);
		 localTb1TrnPosAcchrgAmtADbCounter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkTb1TrnPosAcchrgAmtADbMaxLimit(BigDecimal number) {
			return checkMaxLimit(number,2/*scale*/,15/*precision*/);
   }
     /**
	 *	refreshTb1TrnPosAcchrgAmtADb is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshTb1TrnPosAcchrgAmtADb() throws CFException {	
   	try { 
		 return (getDecimal(beginTb1TrnPosAcchrgAmtADb,TB_1_TRN_POS_ACCHRG_AMT_ADB_LEN,TB_1_TRN_POS_ACCHRG_AMT_ADB_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("tb1TrnPosAcchrgAmtADb", beginTb1TrnPosAcchrgAmtADb,TB_1_TRN_POS_ACCHRG_AMT_ADB_LEN);
     }
   	}
        int localTb1TrnAtmAcchrgRCntACrCounter = -1;
        public boolean isTb1TrnAtmAcchrgRCntACrModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localTb1TrnAtmAcchrgRCntACrCounter != sharedCounter;
           localTb1TrnAtmAcchrgRCntACrCounter = sharedCounter; return hasModified; 
        }
	    public boolean tb1TrnAtmAcchrgRCntACrIsNumeric() {
	      return decimalIsNumeric(beginTb1TrnAtmAcchrgRCntACr,TB_1_TRN_ATM_ACCHRG_RCNT_ACR_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int TB_1_TRN_ATM_ACCHRG_RCNT_ACR_LEN = 5;
  	/**
	 * 	serializeTb1TrnAtmAcchrgRCntACr
	 */
	protected void serializeTb1TrnAtmAcchrgRCntACr(int tb1TrnAtmAcchrgRCntACr) {
		   putDecimal(beginTb1TrnAtmAcchrgRCntACr,tb1TrnAtmAcchrgRCntACr,TB_1_TRN_ATM_ACCHRG_RCNT_ACR_LEN,true);
   }
   

   protected int checkTb1TrnAtmAcchrgRCntACrMaxLimit(long number) {
	   return (int)checkMaxLimit(number , MAX_1G /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshTb1TrnAtmAcchrgRCntACr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshTb1TrnAtmAcchrgRCntACr() throws CFException {	
   	try { 
		 return (getIntDecimal(beginTb1TrnAtmAcchrgRCntACr,TB_1_TRN_ATM_ACCHRG_RCNT_ACR_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("tb1TrnAtmAcchrgRCntACr", beginTb1TrnAtmAcchrgRCntACr,TB_1_TRN_ATM_ACCHRG_RCNT_ACR_LEN);
     }
   	}
        int localTb1TrnAtmAcchrgRCntADbCounter = -1;
        public boolean isTb1TrnAtmAcchrgRCntADbModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localTb1TrnAtmAcchrgRCntADbCounter != sharedCounter;
           localTb1TrnAtmAcchrgRCntADbCounter = sharedCounter; return hasModified; 
        }
	    public boolean tb1TrnAtmAcchrgRCntADbIsNumeric() {
	      return decimalIsNumeric(beginTb1TrnAtmAcchrgRCntADb,TB_1_TRN_ATM_ACCHRG_RCNT_ADB_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int TB_1_TRN_ATM_ACCHRG_RCNT_ADB_LEN = 5;
  	/**
	 * 	serializeTb1TrnAtmAcchrgRCntADb
	 */
	protected void serializeTb1TrnAtmAcchrgRCntADb(int tb1TrnAtmAcchrgRCntADb) {
		   putDecimal(beginTb1TrnAtmAcchrgRCntADb,tb1TrnAtmAcchrgRCntADb,TB_1_TRN_ATM_ACCHRG_RCNT_ADB_LEN,true);
   }
   

   protected int checkTb1TrnAtmAcchrgRCntADbMaxLimit(long number) {
	   return (int)checkMaxLimit(number , MAX_1G /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshTb1TrnAtmAcchrgRCntADb is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshTb1TrnAtmAcchrgRCntADb() throws CFException {	
   	try { 
		 return (getIntDecimal(beginTb1TrnAtmAcchrgRCntADb,TB_1_TRN_ATM_ACCHRG_RCNT_ADB_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("tb1TrnAtmAcchrgRCntADb", beginTb1TrnAtmAcchrgRCntADb,TB_1_TRN_ATM_ACCHRG_RCNT_ADB_LEN);
     }
   	}
        int localTb1TrnAtmAcchrgRAmtACrCounter = -1;
        public boolean isTb1TrnAtmAcchrgRAmtACrModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localTb1TrnAtmAcchrgRAmtACrCounter != sharedCounter;
           localTb1TrnAtmAcchrgRAmtACrCounter = sharedCounter; return hasModified; 
        }
	    public boolean tb1TrnAtmAcchrgRAmtACrIsNumeric() {
	      return decimalIsNumeric(beginTb1TrnAtmAcchrgRAmtACr,TB_1_TRN_ATM_ACCHRG_RAMT_ACR_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] tb1TrnAtmAcchrgRAmtACrString() {
            return getPackedString(beginTb1TrnAtmAcchrgRAmtACr,TB_1_TRN_ATM_ACCHRG_RAMT_ACR_LEN);
         }
   protected static final int TB_1_TRN_ATM_ACCHRG_RAMT_ACR_LEN = 8;
   protected static final int TB_1_TRN_ATM_ACCHRG_RAMT_ACR_SCALE = 2;
  	/**
	 * 	serializeTb1TrnAtmAcchrgRAmtACr
	 */
	protected void serializeTb1TrnAtmAcchrgRAmtACr(BigDecimal tb1TrnAtmAcchrgRAmtACr) {
		   putDecimal(beginTb1TrnAtmAcchrgRAmtACr,tb1TrnAtmAcchrgRAmtACr,TB_1_TRN_ATM_ACCHRG_RAMT_ACR_LEN,TB_1_TRN_ATM_ACCHRG_RAMT_ACR_SCALE,true);
		 localTb1TrnAtmAcchrgRAmtACrCounter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkTb1TrnAtmAcchrgRAmtACrMaxLimit(BigDecimal number) {
			return checkMaxLimit(number,2/*scale*/,15/*precision*/);
   }
     /**
	 *	refreshTb1TrnAtmAcchrgRAmtACr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshTb1TrnAtmAcchrgRAmtACr() throws CFException {	
   	try { 
		 return (getDecimal(beginTb1TrnAtmAcchrgRAmtACr,TB_1_TRN_ATM_ACCHRG_RAMT_ACR_LEN,TB_1_TRN_ATM_ACCHRG_RAMT_ACR_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("tb1TrnAtmAcchrgRAmtACr", beginTb1TrnAtmAcchrgRAmtACr,TB_1_TRN_ATM_ACCHRG_RAMT_ACR_LEN);
     }
   	}
        int localTb1TrnAtmAcchrgRAmtADbCounter = -1;
        public boolean isTb1TrnAtmAcchrgRAmtADbModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localTb1TrnAtmAcchrgRAmtADbCounter != sharedCounter;
           localTb1TrnAtmAcchrgRAmtADbCounter = sharedCounter; return hasModified; 
        }
	    public boolean tb1TrnAtmAcchrgRAmtADbIsNumeric() {
	      return decimalIsNumeric(beginTb1TrnAtmAcchrgRAmtADb,TB_1_TRN_ATM_ACCHRG_RAMT_ADB_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] tb1TrnAtmAcchrgRAmtADbString() {
            return getPackedString(beginTb1TrnAtmAcchrgRAmtADb,TB_1_TRN_ATM_ACCHRG_RAMT_ADB_LEN);
         }
   protected static final int TB_1_TRN_ATM_ACCHRG_RAMT_ADB_LEN = 8;
   protected static final int TB_1_TRN_ATM_ACCHRG_RAMT_ADB_SCALE = 2;
  	/**
	 * 	serializeTb1TrnAtmAcchrgRAmtADb
	 */
	protected void serializeTb1TrnAtmAcchrgRAmtADb(BigDecimal tb1TrnAtmAcchrgRAmtADb) {
		   putDecimal(beginTb1TrnAtmAcchrgRAmtADb,tb1TrnAtmAcchrgRAmtADb,TB_1_TRN_ATM_ACCHRG_RAMT_ADB_LEN,TB_1_TRN_ATM_ACCHRG_RAMT_ADB_SCALE,true);
		 localTb1TrnAtmAcchrgRAmtADbCounter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkTb1TrnAtmAcchrgRAmtADbMaxLimit(BigDecimal number) {
			return checkMaxLimit(number,2/*scale*/,15/*precision*/);
   }
     /**
	 *	refreshTb1TrnAtmAcchrgRAmtADb is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshTb1TrnAtmAcchrgRAmtADb() throws CFException {	
   	try { 
		 return (getDecimal(beginTb1TrnAtmAcchrgRAmtADb,TB_1_TRN_ATM_ACCHRG_RAMT_ADB_LEN,TB_1_TRN_ATM_ACCHRG_RAMT_ADB_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("tb1TrnAtmAcchrgRAmtADb", beginTb1TrnAtmAcchrgRAmtADb,TB_1_TRN_ATM_ACCHRG_RAMT_ADB_LEN);
     }
   	}
        int localTb1TrnPosAcchrgRCntACrCounter = -1;
        public boolean isTb1TrnPosAcchrgRCntACrModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localTb1TrnPosAcchrgRCntACrCounter != sharedCounter;
           localTb1TrnPosAcchrgRCntACrCounter = sharedCounter; return hasModified; 
        }
	    public boolean tb1TrnPosAcchrgRCntACrIsNumeric() {
	      return decimalIsNumeric(beginTb1TrnPosAcchrgRCntACr,TB_1_TRN_POS_ACCHRG_RCNT_ACR_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int TB_1_TRN_POS_ACCHRG_RCNT_ACR_LEN = 5;
  	/**
	 * 	serializeTb1TrnPosAcchrgRCntACr
	 */
	protected void serializeTb1TrnPosAcchrgRCntACr(int tb1TrnPosAcchrgRCntACr) {
		   putDecimal(beginTb1TrnPosAcchrgRCntACr,tb1TrnPosAcchrgRCntACr,TB_1_TRN_POS_ACCHRG_RCNT_ACR_LEN,true);
   }
   

   protected int checkTb1TrnPosAcchrgRCntACrMaxLimit(long number) {
	   return (int)checkMaxLimit(number , MAX_1G /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshTb1TrnPosAcchrgRCntACr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshTb1TrnPosAcchrgRCntACr() throws CFException {	
   	try { 
		 return (getIntDecimal(beginTb1TrnPosAcchrgRCntACr,TB_1_TRN_POS_ACCHRG_RCNT_ACR_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("tb1TrnPosAcchrgRCntACr", beginTb1TrnPosAcchrgRCntACr,TB_1_TRN_POS_ACCHRG_RCNT_ACR_LEN);
     }
   	}
        int localTb1TrnPosAcchrgRCntADbCounter = -1;
        public boolean isTb1TrnPosAcchrgRCntADbModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localTb1TrnPosAcchrgRCntADbCounter != sharedCounter;
           localTb1TrnPosAcchrgRCntADbCounter = sharedCounter; return hasModified; 
        }
	    public boolean tb1TrnPosAcchrgRCntADbIsNumeric() {
	      return decimalIsNumeric(beginTb1TrnPosAcchrgRCntADb,TB_1_TRN_POS_ACCHRG_RCNT_ADB_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int TB_1_TRN_POS_ACCHRG_RCNT_ADB_LEN = 5;
  	/**
	 * 	serializeTb1TrnPosAcchrgRCntADb
	 */
	protected void serializeTb1TrnPosAcchrgRCntADb(int tb1TrnPosAcchrgRCntADb) {
		   putDecimal(beginTb1TrnPosAcchrgRCntADb,tb1TrnPosAcchrgRCntADb,TB_1_TRN_POS_ACCHRG_RCNT_ADB_LEN,true);
   }
   

   protected int checkTb1TrnPosAcchrgRCntADbMaxLimit(long number) {
	   return (int)checkMaxLimit(number , MAX_1G /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshTb1TrnPosAcchrgRCntADb is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshTb1TrnPosAcchrgRCntADb() throws CFException {	
   	try { 
		 return (getIntDecimal(beginTb1TrnPosAcchrgRCntADb,TB_1_TRN_POS_ACCHRG_RCNT_ADB_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("tb1TrnPosAcchrgRCntADb", beginTb1TrnPosAcchrgRCntADb,TB_1_TRN_POS_ACCHRG_RCNT_ADB_LEN);
     }
   	}
        int localTb1TrnPosAcchrgRAmtACrCounter = -1;
        public boolean isTb1TrnPosAcchrgRAmtACrModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localTb1TrnPosAcchrgRAmtACrCounter != sharedCounter;
           localTb1TrnPosAcchrgRAmtACrCounter = sharedCounter; return hasModified; 
        }
	    public boolean tb1TrnPosAcchrgRAmtACrIsNumeric() {
	      return decimalIsNumeric(beginTb1TrnPosAcchrgRAmtACr,TB_1_TRN_POS_ACCHRG_RAMT_ACR_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] tb1TrnPosAcchrgRAmtACrString() {
            return getPackedString(beginTb1TrnPosAcchrgRAmtACr,TB_1_TRN_POS_ACCHRG_RAMT_ACR_LEN);
         }
   protected static final int TB_1_TRN_POS_ACCHRG_RAMT_ACR_LEN = 8;
   protected static final int TB_1_TRN_POS_ACCHRG_RAMT_ACR_SCALE = 2;
  	/**
	 * 	serializeTb1TrnPosAcchrgRAmtACr
	 */
	protected void serializeTb1TrnPosAcchrgRAmtACr(BigDecimal tb1TrnPosAcchrgRAmtACr) {
		   putDecimal(beginTb1TrnPosAcchrgRAmtACr,tb1TrnPosAcchrgRAmtACr,TB_1_TRN_POS_ACCHRG_RAMT_ACR_LEN,TB_1_TRN_POS_ACCHRG_RAMT_ACR_SCALE,true);
		 localTb1TrnPosAcchrgRAmtACrCounter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkTb1TrnPosAcchrgRAmtACrMaxLimit(BigDecimal number) {
			return checkMaxLimit(number,2/*scale*/,15/*precision*/);
   }
     /**
	 *	refreshTb1TrnPosAcchrgRAmtACr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshTb1TrnPosAcchrgRAmtACr() throws CFException {	
   	try { 
		 return (getDecimal(beginTb1TrnPosAcchrgRAmtACr,TB_1_TRN_POS_ACCHRG_RAMT_ACR_LEN,TB_1_TRN_POS_ACCHRG_RAMT_ACR_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("tb1TrnPosAcchrgRAmtACr", beginTb1TrnPosAcchrgRAmtACr,TB_1_TRN_POS_ACCHRG_RAMT_ACR_LEN);
     }
   	}
        int localTb1TrnPosAcchrgRAmtADbCounter = -1;
        public boolean isTb1TrnPosAcchrgRAmtADbModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localTb1TrnPosAcchrgRAmtADbCounter != sharedCounter;
           localTb1TrnPosAcchrgRAmtADbCounter = sharedCounter; return hasModified; 
        }
	    public boolean tb1TrnPosAcchrgRAmtADbIsNumeric() {
	      return decimalIsNumeric(beginTb1TrnPosAcchrgRAmtADb,TB_1_TRN_POS_ACCHRG_RAMT_ADB_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] tb1TrnPosAcchrgRAmtADbString() {
            return getPackedString(beginTb1TrnPosAcchrgRAmtADb,TB_1_TRN_POS_ACCHRG_RAMT_ADB_LEN);
         }
   protected static final int TB_1_TRN_POS_ACCHRG_RAMT_ADB_LEN = 8;
   protected static final int TB_1_TRN_POS_ACCHRG_RAMT_ADB_SCALE = 2;
  	/**
	 * 	serializeTb1TrnPosAcchrgRAmtADb
	 */
	protected void serializeTb1TrnPosAcchrgRAmtADb(BigDecimal tb1TrnPosAcchrgRAmtADb) {
		   putDecimal(beginTb1TrnPosAcchrgRAmtADb,tb1TrnPosAcchrgRAmtADb,TB_1_TRN_POS_ACCHRG_RAMT_ADB_LEN,TB_1_TRN_POS_ACCHRG_RAMT_ADB_SCALE,true);
		 localTb1TrnPosAcchrgRAmtADbCounter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkTb1TrnPosAcchrgRAmtADbMaxLimit(BigDecimal number) {
			return checkMaxLimit(number,2/*scale*/,15/*precision*/);
   }
     /**
	 *	refreshTb1TrnPosAcchrgRAmtADb is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshTb1TrnPosAcchrgRAmtADb() throws CFException {	
   	try { 
		 return (getDecimal(beginTb1TrnPosAcchrgRAmtADb,TB_1_TRN_POS_ACCHRG_RAMT_ADB_LEN,TB_1_TRN_POS_ACCHRG_RAMT_ADB_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("tb1TrnPosAcchrgRAmtADb", beginTb1TrnPosAcchrgRAmtADb,TB_1_TRN_POS_ACCHRG_RAMT_ADB_LEN);
     }
   	}
        int localTb1TrnFFinAppCntACrCounter = -1;
        public boolean isTb1TrnFFinAppCntACrModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localTb1TrnFFinAppCntACrCounter != sharedCounter;
           localTb1TrnFFinAppCntACrCounter = sharedCounter; return hasModified; 
        }
	    public boolean tb1TrnFFinAppCntACrIsNumeric() {
	      return decimalIsNumeric(beginTb1TrnFFinAppCntACr,TB_1_TRN_FFIN_APP_CNT_ACR_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int TB_1_TRN_FFIN_APP_CNT_ACR_LEN = 5;
  	/**
	 * 	serializeTb1TrnFFinAppCntACr
	 */
	protected void serializeTb1TrnFFinAppCntACr(int tb1TrnFFinAppCntACr) {
		   putDecimal(beginTb1TrnFFinAppCntACr,tb1TrnFFinAppCntACr,TB_1_TRN_FFIN_APP_CNT_ACR_LEN,true);
   }
   

   protected int checkTb1TrnFFinAppCntACrMaxLimit(long number) {
	   return (int)checkMaxLimit(number , MAX_1G /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshTb1TrnFFinAppCntACr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshTb1TrnFFinAppCntACr() throws CFException {	
   	try { 
		 return (getIntDecimal(beginTb1TrnFFinAppCntACr,TB_1_TRN_FFIN_APP_CNT_ACR_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("tb1TrnFFinAppCntACr", beginTb1TrnFFinAppCntACr,TB_1_TRN_FFIN_APP_CNT_ACR_LEN);
     }
   	}
        int localTb1TrnFFinAppCntADbCounter = -1;
        public boolean isTb1TrnFFinAppCntADbModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localTb1TrnFFinAppCntADbCounter != sharedCounter;
           localTb1TrnFFinAppCntADbCounter = sharedCounter; return hasModified; 
        }
	    public boolean tb1TrnFFinAppCntADbIsNumeric() {
	      return decimalIsNumeric(beginTb1TrnFFinAppCntADb,TB_1_TRN_FFIN_APP_CNT_ADB_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int TB_1_TRN_FFIN_APP_CNT_ADB_LEN = 5;
  	/**
	 * 	serializeTb1TrnFFinAppCntADb
	 */
	protected void serializeTb1TrnFFinAppCntADb(int tb1TrnFFinAppCntADb) {
		   putDecimal(beginTb1TrnFFinAppCntADb,tb1TrnFFinAppCntADb,TB_1_TRN_FFIN_APP_CNT_ADB_LEN,true);
   }
   

   protected int checkTb1TrnFFinAppCntADbMaxLimit(long number) {
	   return (int)checkMaxLimit(number , MAX_1G /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshTb1TrnFFinAppCntADb is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshTb1TrnFFinAppCntADb() throws CFException {	
   	try { 
		 return (getIntDecimal(beginTb1TrnFFinAppCntADb,TB_1_TRN_FFIN_APP_CNT_ADB_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("tb1TrnFFinAppCntADb", beginTb1TrnFFinAppCntADb,TB_1_TRN_FFIN_APP_CNT_ADB_LEN);
     }
   	}
        int localTb1TrnFFinDenCntACrCounter = -1;
        public boolean isTb1TrnFFinDenCntACrModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localTb1TrnFFinDenCntACrCounter != sharedCounter;
           localTb1TrnFFinDenCntACrCounter = sharedCounter; return hasModified; 
        }
	    public boolean tb1TrnFFinDenCntACrIsNumeric() {
	      return decimalIsNumeric(beginTb1TrnFFinDenCntACr,TB_1_TRN_FFIN_DEN_CNT_ACR_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int TB_1_TRN_FFIN_DEN_CNT_ACR_LEN = 5;
  	/**
	 * 	serializeTb1TrnFFinDenCntACr
	 */
	protected void serializeTb1TrnFFinDenCntACr(int tb1TrnFFinDenCntACr) {
		   putDecimal(beginTb1TrnFFinDenCntACr,tb1TrnFFinDenCntACr,TB_1_TRN_FFIN_DEN_CNT_ACR_LEN,true);
   }
   

   protected int checkTb1TrnFFinDenCntACrMaxLimit(long number) {
	   return (int)checkMaxLimit(number , MAX_1G /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshTb1TrnFFinDenCntACr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshTb1TrnFFinDenCntACr() throws CFException {	
   	try { 
		 return (getIntDecimal(beginTb1TrnFFinDenCntACr,TB_1_TRN_FFIN_DEN_CNT_ACR_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("tb1TrnFFinDenCntACr", beginTb1TrnFFinDenCntACr,TB_1_TRN_FFIN_DEN_CNT_ACR_LEN);
     }
   	}
        int localTb1TrnFFinDenCntADbCounter = -1;
        public boolean isTb1TrnFFinDenCntADbModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localTb1TrnFFinDenCntADbCounter != sharedCounter;
           localTb1TrnFFinDenCntADbCounter = sharedCounter; return hasModified; 
        }
	    public boolean tb1TrnFFinDenCntADbIsNumeric() {
	      return decimalIsNumeric(beginTb1TrnFFinDenCntADb,TB_1_TRN_FFIN_DEN_CNT_ADB_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int TB_1_TRN_FFIN_DEN_CNT_ADB_LEN = 5;
  	/**
	 * 	serializeTb1TrnFFinDenCntADb
	 */
	protected void serializeTb1TrnFFinDenCntADb(int tb1TrnFFinDenCntADb) {
		   putDecimal(beginTb1TrnFFinDenCntADb,tb1TrnFFinDenCntADb,TB_1_TRN_FFIN_DEN_CNT_ADB_LEN,true);
   }
   

   protected int checkTb1TrnFFinDenCntADbMaxLimit(long number) {
	   return (int)checkMaxLimit(number , MAX_1G /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshTb1TrnFFinDenCntADb is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshTb1TrnFFinDenCntADb() throws CFException {	
   	try { 
		 return (getIntDecimal(beginTb1TrnFFinDenCntADb,TB_1_TRN_FFIN_DEN_CNT_ADB_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("tb1TrnFFinDenCntADb", beginTb1TrnFFinDenCntADb,TB_1_TRN_FFIN_DEN_CNT_ADB_LEN);
     }
   	}
        int localTb1TrnFFinAmtACrCounter = -1;
        public boolean isTb1TrnFFinAmtACrModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localTb1TrnFFinAmtACrCounter != sharedCounter;
           localTb1TrnFFinAmtACrCounter = sharedCounter; return hasModified; 
        }
	    public boolean tb1TrnFFinAmtACrIsNumeric() {
	      return decimalIsNumeric(beginTb1TrnFFinAmtACr,TB_1_TRN_FFIN_AMT_ACR_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int TB_1_TRN_FFIN_AMT_ACR_LEN = 9;
  	/**
	 * 	serializeTb1TrnFFinAmtACr
	 */
	protected void serializeTb1TrnFFinAmtACr(long tb1TrnFFinAmtACr) {
		   putDecimal(beginTb1TrnFFinAmtACr,tb1TrnFFinAmtACr,TB_1_TRN_FFIN_AMT_ACR_LEN,true);
   }
   

   protected long checkTb1TrnFFinAmtACrMaxLimit(long number) {
        return checkMaxLimit(number , MAX_100P /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshTb1TrnFFinAmtACr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshTb1TrnFFinAmtACr() throws CFException {	
   	try { 
		 return (getLongDecimal(beginTb1TrnFFinAmtACr,TB_1_TRN_FFIN_AMT_ACR_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("tb1TrnFFinAmtACr", beginTb1TrnFFinAmtACr,TB_1_TRN_FFIN_AMT_ACR_LEN);
     }
   	}
        int localTb1TrnFFinAmtADbCounter = -1;
        public boolean isTb1TrnFFinAmtADbModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localTb1TrnFFinAmtADbCounter != sharedCounter;
           localTb1TrnFFinAmtADbCounter = sharedCounter; return hasModified; 
        }
	    public boolean tb1TrnFFinAmtADbIsNumeric() {
	      return decimalIsNumeric(beginTb1TrnFFinAmtADb,TB_1_TRN_FFIN_AMT_ADB_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int TB_1_TRN_FFIN_AMT_ADB_LEN = 9;
  	/**
	 * 	serializeTb1TrnFFinAmtADb
	 */
	protected void serializeTb1TrnFFinAmtADb(long tb1TrnFFinAmtADb) {
		   putDecimal(beginTb1TrnFFinAmtADb,tb1TrnFFinAmtADb,TB_1_TRN_FFIN_AMT_ADB_LEN,true);
   }
   

   protected long checkTb1TrnFFinAmtADbMaxLimit(long number) {
        return checkMaxLimit(number , MAX_100P /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshTb1TrnFFinAmtADb is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshTb1TrnFFinAmtADb() throws CFException {	
   	try { 
		 return (getLongDecimal(beginTb1TrnFFinAmtADb,TB_1_TRN_FFIN_AMT_ADB_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("tb1TrnFFinAmtADb", beginTb1TrnFFinAmtADb,TB_1_TRN_FFIN_AMT_ADB_LEN);
     }
   	}
        int localTb1TrnFFinFeeCntACounter = -1;
        public boolean isTb1TrnFFinFeeCntAModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localTb1TrnFFinFeeCntACounter != sharedCounter;
           localTb1TrnFFinFeeCntACounter = sharedCounter; return hasModified; 
        }
	    public boolean tb1TrnFFinFeeCntAIsNumeric() {
	      return decimalIsNumeric(beginTb1TrnFFinFeeCntA,TB_1_TRN_FFIN_FEE_CNT_A_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int TB_1_TRN_FFIN_FEE_CNT_A_LEN = 5;
  	/**
	 * 	serializeTb1TrnFFinFeeCntA
	 */
	protected void serializeTb1TrnFFinFeeCntA(int tb1TrnFFinFeeCntA) {
		   putDecimal(beginTb1TrnFFinFeeCntA,tb1TrnFFinFeeCntA,TB_1_TRN_FFIN_FEE_CNT_A_LEN,true);
   }
   

   protected int checkTb1TrnFFinFeeCntAMaxLimit(long number) {
	   return (int)checkMaxLimit(number , MAX_1G /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshTb1TrnFFinFeeCntA is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshTb1TrnFFinFeeCntA() throws CFException {	
   	try { 
		 return (getIntDecimal(beginTb1TrnFFinFeeCntA,TB_1_TRN_FFIN_FEE_CNT_A_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("tb1TrnFFinFeeCntA", beginTb1TrnFFinFeeCntA,TB_1_TRN_FFIN_FEE_CNT_A_LEN);
     }
   	}
        int localTb1TrnFPctFeeCntACounter = -1;
        public boolean isTb1TrnFPctFeeCntAModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localTb1TrnFPctFeeCntACounter != sharedCounter;
           localTb1TrnFPctFeeCntACounter = sharedCounter; return hasModified; 
        }
	    public boolean tb1TrnFPctFeeCntAIsNumeric() {
	      return decimalIsNumeric(beginTb1TrnFPctFeeCntA,TB_1_TRN_FPCT_FEE_CNT_A_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int TB_1_TRN_FPCT_FEE_CNT_A_LEN = 5;
  	/**
	 * 	serializeTb1TrnFPctFeeCntA
	 */
	protected void serializeTb1TrnFPctFeeCntA(int tb1TrnFPctFeeCntA) {
		   putDecimal(beginTb1TrnFPctFeeCntA,tb1TrnFPctFeeCntA,TB_1_TRN_FPCT_FEE_CNT_A_LEN,true);
   }
   

   protected int checkTb1TrnFPctFeeCntAMaxLimit(long number) {
	   return (int)checkMaxLimit(number , MAX_1G /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshTb1TrnFPctFeeCntA is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshTb1TrnFPctFeeCntA() throws CFException {	
   	try { 
		 return (getIntDecimal(beginTb1TrnFPctFeeCntA,TB_1_TRN_FPCT_FEE_CNT_A_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("tb1TrnFPctFeeCntA", beginTb1TrnFPctFeeCntA,TB_1_TRN_FPCT_FEE_CNT_A_LEN);
     }
   	}
        int localTb1TrnFNfinFeeCntACounter = -1;
        public boolean isTb1TrnFNfinFeeCntAModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localTb1TrnFNfinFeeCntACounter != sharedCounter;
           localTb1TrnFNfinFeeCntACounter = sharedCounter; return hasModified; 
        }
	    public boolean tb1TrnFNfinFeeCntAIsNumeric() {
	      return decimalIsNumeric(beginTb1TrnFNfinFeeCntA,TB_1_TRN_FNFIN_FEE_CNT_A_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int TB_1_TRN_FNFIN_FEE_CNT_A_LEN = 5;
  	/**
	 * 	serializeTb1TrnFNfinFeeCntA
	 */
	protected void serializeTb1TrnFNfinFeeCntA(int tb1TrnFNfinFeeCntA) {
		   putDecimal(beginTb1TrnFNfinFeeCntA,tb1TrnFNfinFeeCntA,TB_1_TRN_FNFIN_FEE_CNT_A_LEN,true);
   }
   

   protected int checkTb1TrnFNfinFeeCntAMaxLimit(long number) {
	   return (int)checkMaxLimit(number , MAX_1G /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshTb1TrnFNfinFeeCntA is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshTb1TrnFNfinFeeCntA() throws CFException {	
   	try { 
		 return (getIntDecimal(beginTb1TrnFNfinFeeCntA,TB_1_TRN_FNFIN_FEE_CNT_A_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("tb1TrnFNfinFeeCntA", beginTb1TrnFNfinFeeCntA,TB_1_TRN_FNFIN_FEE_CNT_A_LEN);
     }
   	}
        int localTb1TrnFNbilFeeCntACounter = -1;
        public boolean isTb1TrnFNbilFeeCntAModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localTb1TrnFNbilFeeCntACounter != sharedCounter;
           localTb1TrnFNbilFeeCntACounter = sharedCounter; return hasModified; 
        }
	    public boolean tb1TrnFNbilFeeCntAIsNumeric() {
	      return decimalIsNumeric(beginTb1TrnFNbilFeeCntA,TB_1_TRN_FNBIL_FEE_CNT_A_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int TB_1_TRN_FNBIL_FEE_CNT_A_LEN = 5;
  	/**
	 * 	serializeTb1TrnFNbilFeeCntA
	 */
	protected void serializeTb1TrnFNbilFeeCntA(int tb1TrnFNbilFeeCntA) {
		   putDecimal(beginTb1TrnFNbilFeeCntA,tb1TrnFNbilFeeCntA,TB_1_TRN_FNBIL_FEE_CNT_A_LEN,true);
   }
   

   protected int checkTb1TrnFNbilFeeCntAMaxLimit(long number) {
	   return (int)checkMaxLimit(number , MAX_1G /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshTb1TrnFNbilFeeCntA is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshTb1TrnFNbilFeeCntA() throws CFException {	
   	try { 
		 return (getIntDecimal(beginTb1TrnFNbilFeeCntA,TB_1_TRN_FNBIL_FEE_CNT_A_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("tb1TrnFNbilFeeCntA", beginTb1TrnFNbilFeeCntA,TB_1_TRN_FNBIL_FEE_CNT_A_LEN);
     }
   	}
        int localTb1TrnFFeeAmtACrCounter = -1;
        public boolean isTb1TrnFFeeAmtACrModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localTb1TrnFFeeAmtACrCounter != sharedCounter;
           localTb1TrnFFeeAmtACrCounter = sharedCounter; return hasModified; 
        }
	    public boolean tb1TrnFFeeAmtACrIsNumeric() {
	      return decimalIsNumeric(beginTb1TrnFFeeAmtACr,TB_1_TRN_FFEE_AMT_ACR_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int TB_1_TRN_FFEE_AMT_ACR_LEN = 9;
  	/**
	 * 	serializeTb1TrnFFeeAmtACr
	 */
	protected void serializeTb1TrnFFeeAmtACr(long tb1TrnFFeeAmtACr) {
		   putDecimal(beginTb1TrnFFeeAmtACr,tb1TrnFFeeAmtACr,TB_1_TRN_FFEE_AMT_ACR_LEN,true);
   }
   

   protected long checkTb1TrnFFeeAmtACrMaxLimit(long number) {
        return checkMaxLimit(number , MAX_100P /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshTb1TrnFFeeAmtACr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshTb1TrnFFeeAmtACr() throws CFException {	
   	try { 
		 return (getLongDecimal(beginTb1TrnFFeeAmtACr,TB_1_TRN_FFEE_AMT_ACR_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("tb1TrnFFeeAmtACr", beginTb1TrnFFeeAmtACr,TB_1_TRN_FFEE_AMT_ACR_LEN);
     }
   	}
        int localTb1TrnFFeeAmtADbCounter = -1;
        public boolean isTb1TrnFFeeAmtADbModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localTb1TrnFFeeAmtADbCounter != sharedCounter;
           localTb1TrnFFeeAmtADbCounter = sharedCounter; return hasModified; 
        }
	    public boolean tb1TrnFFeeAmtADbIsNumeric() {
	      return decimalIsNumeric(beginTb1TrnFFeeAmtADb,TB_1_TRN_FFEE_AMT_ADB_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int TB_1_TRN_FFEE_AMT_ADB_LEN = 9;
  	/**
	 * 	serializeTb1TrnFFeeAmtADb
	 */
	protected void serializeTb1TrnFFeeAmtADb(long tb1TrnFFeeAmtADb) {
		   putDecimal(beginTb1TrnFFeeAmtADb,tb1TrnFFeeAmtADb,TB_1_TRN_FFEE_AMT_ADB_LEN,true);
   }
   

   protected long checkTb1TrnFFeeAmtADbMaxLimit(long number) {
        return checkMaxLimit(number , MAX_100P /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshTb1TrnFFeeAmtADb is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshTb1TrnFFeeAmtADb() throws CFException {	
   	try { 
		 return (getLongDecimal(beginTb1TrnFFeeAmtADb,TB_1_TRN_FFEE_AMT_ADB_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("tb1TrnFFeeAmtADb", beginTb1TrnFFeeAmtADb,TB_1_TRN_FFEE_AMT_ADB_LEN);
     }
   	}
        int localTb1TrnEFinAppCntACrCounter = -1;
        public boolean isTb1TrnEFinAppCntACrModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localTb1TrnEFinAppCntACrCounter != sharedCounter;
           localTb1TrnEFinAppCntACrCounter = sharedCounter; return hasModified; 
        }
	    public boolean tb1TrnEFinAppCntACrIsNumeric() {
	      return decimalIsNumeric(beginTb1TrnEFinAppCntACr,TB_1_TRN_EFIN_APP_CNT_ACR_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int TB_1_TRN_EFIN_APP_CNT_ACR_LEN = 5;
  	/**
	 * 	serializeTb1TrnEFinAppCntACr
	 */
	protected void serializeTb1TrnEFinAppCntACr(int tb1TrnEFinAppCntACr) {
		   putDecimal(beginTb1TrnEFinAppCntACr,tb1TrnEFinAppCntACr,TB_1_TRN_EFIN_APP_CNT_ACR_LEN,true);
   }
   

   protected int checkTb1TrnEFinAppCntACrMaxLimit(long number) {
	   return (int)checkMaxLimit(number , MAX_1G /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshTb1TrnEFinAppCntACr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshTb1TrnEFinAppCntACr() throws CFException {	
   	try { 
		 return (getIntDecimal(beginTb1TrnEFinAppCntACr,TB_1_TRN_EFIN_APP_CNT_ACR_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("tb1TrnEFinAppCntACr", beginTb1TrnEFinAppCntACr,TB_1_TRN_EFIN_APP_CNT_ACR_LEN);
     }
   	}
        int localTb1TrnEFinAppCntADbCounter = -1;
        public boolean isTb1TrnEFinAppCntADbModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localTb1TrnEFinAppCntADbCounter != sharedCounter;
           localTb1TrnEFinAppCntADbCounter = sharedCounter; return hasModified; 
        }
	    public boolean tb1TrnEFinAppCntADbIsNumeric() {
	      return decimalIsNumeric(beginTb1TrnEFinAppCntADb,TB_1_TRN_EFIN_APP_CNT_ADB_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int TB_1_TRN_EFIN_APP_CNT_ADB_LEN = 5;
  	/**
	 * 	serializeTb1TrnEFinAppCntADb
	 */
	protected void serializeTb1TrnEFinAppCntADb(int tb1TrnEFinAppCntADb) {
		   putDecimal(beginTb1TrnEFinAppCntADb,tb1TrnEFinAppCntADb,TB_1_TRN_EFIN_APP_CNT_ADB_LEN,true);
   }
   

   protected int checkTb1TrnEFinAppCntADbMaxLimit(long number) {
	   return (int)checkMaxLimit(number , MAX_1G /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshTb1TrnEFinAppCntADb is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshTb1TrnEFinAppCntADb() throws CFException {	
   	try { 
		 return (getIntDecimal(beginTb1TrnEFinAppCntADb,TB_1_TRN_EFIN_APP_CNT_ADB_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("tb1TrnEFinAppCntADb", beginTb1TrnEFinAppCntADb,TB_1_TRN_EFIN_APP_CNT_ADB_LEN);
     }
   	}
        int localTb1TrnEFinA09CntACrCounter = -1;
        public boolean isTb1TrnEFinA09CntACrModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localTb1TrnEFinA09CntACrCounter != sharedCounter;
           localTb1TrnEFinA09CntACrCounter = sharedCounter; return hasModified; 
        }
	    public boolean tb1TrnEFinA09CntACrIsNumeric() {
	      return decimalIsNumeric(beginTb1TrnEFinA09CntACr,TB_1_TRN_EFIN_A_09_CNT_ACR_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int TB_1_TRN_EFIN_A_09_CNT_ACR_LEN = 5;
  	/**
	 * 	serializeTb1TrnEFinA09CntACr
	 */
	protected void serializeTb1TrnEFinA09CntACr(int tb1TrnEFinA09CntACr) {
		   putDecimal(beginTb1TrnEFinA09CntACr,tb1TrnEFinA09CntACr,TB_1_TRN_EFIN_A_09_CNT_ACR_LEN,true);
   }
   

   protected int checkTb1TrnEFinA09CntACrMaxLimit(long number) {
	   return (int)checkMaxLimit(number , MAX_1G /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshTb1TrnEFinA09CntACr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshTb1TrnEFinA09CntACr() throws CFException {	
   	try { 
		 return (getIntDecimal(beginTb1TrnEFinA09CntACr,TB_1_TRN_EFIN_A_09_CNT_ACR_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("tb1TrnEFinA09CntACr", beginTb1TrnEFinA09CntACr,TB_1_TRN_EFIN_A_09_CNT_ACR_LEN);
     }
   	}
        int localTb1TrnEFinA09CntADbCounter = -1;
        public boolean isTb1TrnEFinA09CntADbModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localTb1TrnEFinA09CntADbCounter != sharedCounter;
           localTb1TrnEFinA09CntADbCounter = sharedCounter; return hasModified; 
        }
	    public boolean tb1TrnEFinA09CntADbIsNumeric() {
	      return decimalIsNumeric(beginTb1TrnEFinA09CntADb,TB_1_TRN_EFIN_A_09_CNT_ADB_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int TB_1_TRN_EFIN_A_09_CNT_ADB_LEN = 5;
  	/**
	 * 	serializeTb1TrnEFinA09CntADb
	 */
	protected void serializeTb1TrnEFinA09CntADb(int tb1TrnEFinA09CntADb) {
		   putDecimal(beginTb1TrnEFinA09CntADb,tb1TrnEFinA09CntADb,TB_1_TRN_EFIN_A_09_CNT_ADB_LEN,true);
   }
   

   protected int checkTb1TrnEFinA09CntADbMaxLimit(long number) {
	   return (int)checkMaxLimit(number , MAX_1G /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshTb1TrnEFinA09CntADb is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshTb1TrnEFinA09CntADb() throws CFException {	
   	try { 
		 return (getIntDecimal(beginTb1TrnEFinA09CntADb,TB_1_TRN_EFIN_A_09_CNT_ADB_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("tb1TrnEFinA09CntADb", beginTb1TrnEFinA09CntADb,TB_1_TRN_EFIN_A_09_CNT_ADB_LEN);
     }
   	}
        int localTb1TrnENsdA15CntACrCounter = -1;
        public boolean isTb1TrnENsdA15CntACrModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localTb1TrnENsdA15CntACrCounter != sharedCounter;
           localTb1TrnENsdA15CntACrCounter = sharedCounter; return hasModified; 
        }
	    public boolean tb1TrnENsdA15CntACrIsNumeric() {
	      return decimalIsNumeric(beginTb1TrnENsdA15CntACr,TB_1_TRN_ENSD_A_15_CNT_ACR_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int TB_1_TRN_ENSD_A_15_CNT_ACR_LEN = 5;
  	/**
	 * 	serializeTb1TrnENsdA15CntACr
	 */
	protected void serializeTb1TrnENsdA15CntACr(int tb1TrnENsdA15CntACr) {
		   putDecimal(beginTb1TrnENsdA15CntACr,tb1TrnENsdA15CntACr,TB_1_TRN_ENSD_A_15_CNT_ACR_LEN,true);
   }
   

   protected int checkTb1TrnENsdA15CntACrMaxLimit(long number) {
	   return (int)checkMaxLimit(number , MAX_1G /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshTb1TrnENsdA15CntACr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshTb1TrnENsdA15CntACr() throws CFException {	
   	try { 
		 return (getIntDecimal(beginTb1TrnENsdA15CntACr,TB_1_TRN_ENSD_A_15_CNT_ACR_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("tb1TrnENsdA15CntACr", beginTb1TrnENsdA15CntACr,TB_1_TRN_ENSD_A_15_CNT_ACR_LEN);
     }
   	}
        int localTb1TrnENsdA15CntADbCounter = -1;
        public boolean isTb1TrnENsdA15CntADbModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localTb1TrnENsdA15CntADbCounter != sharedCounter;
           localTb1TrnENsdA15CntADbCounter = sharedCounter; return hasModified; 
        }
	    public boolean tb1TrnENsdA15CntADbIsNumeric() {
	      return decimalIsNumeric(beginTb1TrnENsdA15CntADb,TB_1_TRN_ENSD_A_15_CNT_ADB_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int TB_1_TRN_ENSD_A_15_CNT_ADB_LEN = 5;
  	/**
	 * 	serializeTb1TrnENsdA15CntADb
	 */
	protected void serializeTb1TrnENsdA15CntADb(int tb1TrnENsdA15CntADb) {
		   putDecimal(beginTb1TrnENsdA15CntADb,tb1TrnENsdA15CntADb,TB_1_TRN_ENSD_A_15_CNT_ADB_LEN,true);
   }
   

   protected int checkTb1TrnENsdA15CntADbMaxLimit(long number) {
	   return (int)checkMaxLimit(number , MAX_1G /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshTb1TrnENsdA15CntADb is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshTb1TrnENsdA15CntADb() throws CFException {	
   	try { 
		 return (getIntDecimal(beginTb1TrnENsdA15CntADb,TB_1_TRN_ENSD_A_15_CNT_ADB_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("tb1TrnENsdA15CntADb", beginTb1TrnENsdA15CntADb,TB_1_TRN_ENSD_A_15_CNT_ADB_LEN);
     }
   	}
        int localTb1TrnEFinDenCntACrCounter = -1;
        public boolean isTb1TrnEFinDenCntACrModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localTb1TrnEFinDenCntACrCounter != sharedCounter;
           localTb1TrnEFinDenCntACrCounter = sharedCounter; return hasModified; 
        }
	    public boolean tb1TrnEFinDenCntACrIsNumeric() {
	      return decimalIsNumeric(beginTb1TrnEFinDenCntACr,TB_1_TRN_EFIN_DEN_CNT_ACR_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int TB_1_TRN_EFIN_DEN_CNT_ACR_LEN = 5;
  	/**
	 * 	serializeTb1TrnEFinDenCntACr
	 */
	protected void serializeTb1TrnEFinDenCntACr(int tb1TrnEFinDenCntACr) {
		   putDecimal(beginTb1TrnEFinDenCntACr,tb1TrnEFinDenCntACr,TB_1_TRN_EFIN_DEN_CNT_ACR_LEN,true);
   }
   

   protected int checkTb1TrnEFinDenCntACrMaxLimit(long number) {
	   return (int)checkMaxLimit(number , MAX_1G /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshTb1TrnEFinDenCntACr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshTb1TrnEFinDenCntACr() throws CFException {	
   	try { 
		 return (getIntDecimal(beginTb1TrnEFinDenCntACr,TB_1_TRN_EFIN_DEN_CNT_ACR_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("tb1TrnEFinDenCntACr", beginTb1TrnEFinDenCntACr,TB_1_TRN_EFIN_DEN_CNT_ACR_LEN);
     }
   	}
        int localTb1TrnEFinDenCntADbCounter = -1;
        public boolean isTb1TrnEFinDenCntADbModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localTb1TrnEFinDenCntADbCounter != sharedCounter;
           localTb1TrnEFinDenCntADbCounter = sharedCounter; return hasModified; 
        }
	    public boolean tb1TrnEFinDenCntADbIsNumeric() {
	      return decimalIsNumeric(beginTb1TrnEFinDenCntADb,TB_1_TRN_EFIN_DEN_CNT_ADB_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int TB_1_TRN_EFIN_DEN_CNT_ADB_LEN = 5;
  	/**
	 * 	serializeTb1TrnEFinDenCntADb
	 */
	protected void serializeTb1TrnEFinDenCntADb(int tb1TrnEFinDenCntADb) {
		   putDecimal(beginTb1TrnEFinDenCntADb,tb1TrnEFinDenCntADb,TB_1_TRN_EFIN_DEN_CNT_ADB_LEN,true);
   }
   

   protected int checkTb1TrnEFinDenCntADbMaxLimit(long number) {
	   return (int)checkMaxLimit(number , MAX_1G /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshTb1TrnEFinDenCntADb is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshTb1TrnEFinDenCntADb() throws CFException {	
   	try { 
		 return (getIntDecimal(beginTb1TrnEFinDenCntADb,TB_1_TRN_EFIN_DEN_CNT_ADB_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("tb1TrnEFinDenCntADb", beginTb1TrnEFinDenCntADb,TB_1_TRN_EFIN_DEN_CNT_ADB_LEN);
     }
   	}
        int localTb1TrnEFinAmtACrCounter = -1;
        public boolean isTb1TrnEFinAmtACrModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localTb1TrnEFinAmtACrCounter != sharedCounter;
           localTb1TrnEFinAmtACrCounter = sharedCounter; return hasModified; 
        }
	    public boolean tb1TrnEFinAmtACrIsNumeric() {
	      return decimalIsNumeric(beginTb1TrnEFinAmtACr,TB_1_TRN_EFIN_AMT_ACR_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int TB_1_TRN_EFIN_AMT_ACR_LEN = 9;
  	/**
	 * 	serializeTb1TrnEFinAmtACr
	 */
	protected void serializeTb1TrnEFinAmtACr(long tb1TrnEFinAmtACr) {
		   putDecimal(beginTb1TrnEFinAmtACr,tb1TrnEFinAmtACr,TB_1_TRN_EFIN_AMT_ACR_LEN,true);
   }
   

   protected long checkTb1TrnEFinAmtACrMaxLimit(long number) {
        return checkMaxLimit(number , MAX_100P /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshTb1TrnEFinAmtACr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshTb1TrnEFinAmtACr() throws CFException {	
   	try { 
		 return (getLongDecimal(beginTb1TrnEFinAmtACr,TB_1_TRN_EFIN_AMT_ACR_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("tb1TrnEFinAmtACr", beginTb1TrnEFinAmtACr,TB_1_TRN_EFIN_AMT_ACR_LEN);
     }
   	}
        int localTb1TrnEFinAmtADbCounter = -1;
        public boolean isTb1TrnEFinAmtADbModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localTb1TrnEFinAmtADbCounter != sharedCounter;
           localTb1TrnEFinAmtADbCounter = sharedCounter; return hasModified; 
        }
	    public boolean tb1TrnEFinAmtADbIsNumeric() {
	      return decimalIsNumeric(beginTb1TrnEFinAmtADb,TB_1_TRN_EFIN_AMT_ADB_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int TB_1_TRN_EFIN_AMT_ADB_LEN = 9;
  	/**
	 * 	serializeTb1TrnEFinAmtADb
	 */
	protected void serializeTb1TrnEFinAmtADb(long tb1TrnEFinAmtADb) {
		   putDecimal(beginTb1TrnEFinAmtADb,tb1TrnEFinAmtADb,TB_1_TRN_EFIN_AMT_ADB_LEN,true);
   }
   

   protected long checkTb1TrnEFinAmtADbMaxLimit(long number) {
        return checkMaxLimit(number , MAX_100P /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshTb1TrnEFinAmtADb is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshTb1TrnEFinAmtADb() throws CFException {	
   	try { 
		 return (getLongDecimal(beginTb1TrnEFinAmtADb,TB_1_TRN_EFIN_AMT_ADB_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("tb1TrnEFinAmtADb", beginTb1TrnEFinAmtADb,TB_1_TRN_EFIN_AMT_ADB_LEN);
     }
   	}
        int localTb1TrnEFinA09AmtACrCounter = -1;
        public boolean isTb1TrnEFinA09AmtACrModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localTb1TrnEFinA09AmtACrCounter != sharedCounter;
           localTb1TrnEFinA09AmtACrCounter = sharedCounter; return hasModified; 
        }
	    public boolean tb1TrnEFinA09AmtACrIsNumeric() {
	      return decimalIsNumeric(beginTb1TrnEFinA09AmtACr,TB_1_TRN_EFIN_A_09_AMT_ACR_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int TB_1_TRN_EFIN_A_09_AMT_ACR_LEN = 9;
  	/**
	 * 	serializeTb1TrnEFinA09AmtACr
	 */
	protected void serializeTb1TrnEFinA09AmtACr(long tb1TrnEFinA09AmtACr) {
		   putDecimal(beginTb1TrnEFinA09AmtACr,tb1TrnEFinA09AmtACr,TB_1_TRN_EFIN_A_09_AMT_ACR_LEN,true);
   }
   

   protected long checkTb1TrnEFinA09AmtACrMaxLimit(long number) {
        return checkMaxLimit(number , MAX_100P /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshTb1TrnEFinA09AmtACr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshTb1TrnEFinA09AmtACr() throws CFException {	
   	try { 
		 return (getLongDecimal(beginTb1TrnEFinA09AmtACr,TB_1_TRN_EFIN_A_09_AMT_ACR_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("tb1TrnEFinA09AmtACr", beginTb1TrnEFinA09AmtACr,TB_1_TRN_EFIN_A_09_AMT_ACR_LEN);
     }
   	}
        int localTb1TrnEFinA09AmtADbCounter = -1;
        public boolean isTb1TrnEFinA09AmtADbModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localTb1TrnEFinA09AmtADbCounter != sharedCounter;
           localTb1TrnEFinA09AmtADbCounter = sharedCounter; return hasModified; 
        }
	    public boolean tb1TrnEFinA09AmtADbIsNumeric() {
	      return decimalIsNumeric(beginTb1TrnEFinA09AmtADb,TB_1_TRN_EFIN_A_09_AMT_ADB_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int TB_1_TRN_EFIN_A_09_AMT_ADB_LEN = 9;
  	/**
	 * 	serializeTb1TrnEFinA09AmtADb
	 */
	protected void serializeTb1TrnEFinA09AmtADb(long tb1TrnEFinA09AmtADb) {
		   putDecimal(beginTb1TrnEFinA09AmtADb,tb1TrnEFinA09AmtADb,TB_1_TRN_EFIN_A_09_AMT_ADB_LEN,true);
   }
   

   protected long checkTb1TrnEFinA09AmtADbMaxLimit(long number) {
        return checkMaxLimit(number , MAX_100P /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshTb1TrnEFinA09AmtADb is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshTb1TrnEFinA09AmtADb() throws CFException {	
   	try { 
		 return (getLongDecimal(beginTb1TrnEFinA09AmtADb,TB_1_TRN_EFIN_A_09_AMT_ADB_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("tb1TrnEFinA09AmtADb", beginTb1TrnEFinA09AmtADb,TB_1_TRN_EFIN_A_09_AMT_ADB_LEN);
     }
   	}
        int localTb1TrnEFinFeeCntACounter = -1;
        public boolean isTb1TrnEFinFeeCntAModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localTb1TrnEFinFeeCntACounter != sharedCounter;
           localTb1TrnEFinFeeCntACounter = sharedCounter; return hasModified; 
        }
	    public boolean tb1TrnEFinFeeCntAIsNumeric() {
	      return decimalIsNumeric(beginTb1TrnEFinFeeCntA,TB_1_TRN_EFIN_FEE_CNT_A_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int TB_1_TRN_EFIN_FEE_CNT_A_LEN = 5;
  	/**
	 * 	serializeTb1TrnEFinFeeCntA
	 */
	protected void serializeTb1TrnEFinFeeCntA(int tb1TrnEFinFeeCntA) {
		   putDecimal(beginTb1TrnEFinFeeCntA,tb1TrnEFinFeeCntA,TB_1_TRN_EFIN_FEE_CNT_A_LEN,true);
   }
   

   protected int checkTb1TrnEFinFeeCntAMaxLimit(long number) {
	   return (int)checkMaxLimit(number , MAX_1G /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshTb1TrnEFinFeeCntA is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshTb1TrnEFinFeeCntA() throws CFException {	
   	try { 
		 return (getIntDecimal(beginTb1TrnEFinFeeCntA,TB_1_TRN_EFIN_FEE_CNT_A_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("tb1TrnEFinFeeCntA", beginTb1TrnEFinFeeCntA,TB_1_TRN_EFIN_FEE_CNT_A_LEN);
     }
   	}
        int localTb1TrnEPctFeeCntACounter = -1;
        public boolean isTb1TrnEPctFeeCntAModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localTb1TrnEPctFeeCntACounter != sharedCounter;
           localTb1TrnEPctFeeCntACounter = sharedCounter; return hasModified; 
        }
	    public boolean tb1TrnEPctFeeCntAIsNumeric() {
	      return decimalIsNumeric(beginTb1TrnEPctFeeCntA,TB_1_TRN_EPCT_FEE_CNT_A_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int TB_1_TRN_EPCT_FEE_CNT_A_LEN = 5;
  	/**
	 * 	serializeTb1TrnEPctFeeCntA
	 */
	protected void serializeTb1TrnEPctFeeCntA(int tb1TrnEPctFeeCntA) {
		   putDecimal(beginTb1TrnEPctFeeCntA,tb1TrnEPctFeeCntA,TB_1_TRN_EPCT_FEE_CNT_A_LEN,true);
   }
   

   protected int checkTb1TrnEPctFeeCntAMaxLimit(long number) {
	   return (int)checkMaxLimit(number , MAX_1G /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshTb1TrnEPctFeeCntA is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshTb1TrnEPctFeeCntA() throws CFException {	
   	try { 
		 return (getIntDecimal(beginTb1TrnEPctFeeCntA,TB_1_TRN_EPCT_FEE_CNT_A_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("tb1TrnEPctFeeCntA", beginTb1TrnEPctFeeCntA,TB_1_TRN_EPCT_FEE_CNT_A_LEN);
     }
   	}
        int localTb1TrnENfinFeeCntACounter = -1;
        public boolean isTb1TrnENfinFeeCntAModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localTb1TrnENfinFeeCntACounter != sharedCounter;
           localTb1TrnENfinFeeCntACounter = sharedCounter; return hasModified; 
        }
	    public boolean tb1TrnENfinFeeCntAIsNumeric() {
	      return decimalIsNumeric(beginTb1TrnENfinFeeCntA,TB_1_TRN_ENFIN_FEE_CNT_A_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int TB_1_TRN_ENFIN_FEE_CNT_A_LEN = 5;
  	/**
	 * 	serializeTb1TrnENfinFeeCntA
	 */
	protected void serializeTb1TrnENfinFeeCntA(int tb1TrnENfinFeeCntA) {
		   putDecimal(beginTb1TrnENfinFeeCntA,tb1TrnENfinFeeCntA,TB_1_TRN_ENFIN_FEE_CNT_A_LEN,true);
   }
   

   protected int checkTb1TrnENfinFeeCntAMaxLimit(long number) {
	   return (int)checkMaxLimit(number , MAX_1G /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshTb1TrnENfinFeeCntA is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshTb1TrnENfinFeeCntA() throws CFException {	
   	try { 
		 return (getIntDecimal(beginTb1TrnENfinFeeCntA,TB_1_TRN_ENFIN_FEE_CNT_A_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("tb1TrnENfinFeeCntA", beginTb1TrnENfinFeeCntA,TB_1_TRN_ENFIN_FEE_CNT_A_LEN);
     }
   	}
        int localTb1TrnENbilFeeCntACounter = -1;
        public boolean isTb1TrnENbilFeeCntAModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localTb1TrnENbilFeeCntACounter != sharedCounter;
           localTb1TrnENbilFeeCntACounter = sharedCounter; return hasModified; 
        }
	    public boolean tb1TrnENbilFeeCntAIsNumeric() {
	      return decimalIsNumeric(beginTb1TrnENbilFeeCntA,TB_1_TRN_ENBIL_FEE_CNT_A_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int TB_1_TRN_ENBIL_FEE_CNT_A_LEN = 5;
  	/**
	 * 	serializeTb1TrnENbilFeeCntA
	 */
	protected void serializeTb1TrnENbilFeeCntA(int tb1TrnENbilFeeCntA) {
		   putDecimal(beginTb1TrnENbilFeeCntA,tb1TrnENbilFeeCntA,TB_1_TRN_ENBIL_FEE_CNT_A_LEN,true);
   }
   

   protected int checkTb1TrnENbilFeeCntAMaxLimit(long number) {
	   return (int)checkMaxLimit(number , MAX_1G /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshTb1TrnENbilFeeCntA is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshTb1TrnENbilFeeCntA() throws CFException {	
   	try { 
		 return (getIntDecimal(beginTb1TrnENbilFeeCntA,TB_1_TRN_ENBIL_FEE_CNT_A_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("tb1TrnENbilFeeCntA", beginTb1TrnENbilFeeCntA,TB_1_TRN_ENBIL_FEE_CNT_A_LEN);
     }
   	}
        int localTb1TrnEFeeAmtACrCounter = -1;
        public boolean isTb1TrnEFeeAmtACrModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localTb1TrnEFeeAmtACrCounter != sharedCounter;
           localTb1TrnEFeeAmtACrCounter = sharedCounter; return hasModified; 
        }
	    public boolean tb1TrnEFeeAmtACrIsNumeric() {
	      return decimalIsNumeric(beginTb1TrnEFeeAmtACr,TB_1_TRN_EFEE_AMT_ACR_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int TB_1_TRN_EFEE_AMT_ACR_LEN = 8;
  	/**
	 * 	serializeTb1TrnEFeeAmtACr
	 */
	protected void serializeTb1TrnEFeeAmtACr(long tb1TrnEFeeAmtACr) {
		   putDecimal(beginTb1TrnEFeeAmtACr,tb1TrnEFeeAmtACr,TB_1_TRN_EFEE_AMT_ACR_LEN,true);
   }
   

   protected long checkTb1TrnEFeeAmtACrMaxLimit(long number) {
        return checkMaxLimit(number , MAX_1P /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshTb1TrnEFeeAmtACr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshTb1TrnEFeeAmtACr() throws CFException {	
   	try { 
		 return (getLongDecimal(beginTb1TrnEFeeAmtACr,TB_1_TRN_EFEE_AMT_ACR_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("tb1TrnEFeeAmtACr", beginTb1TrnEFeeAmtACr,TB_1_TRN_EFEE_AMT_ACR_LEN);
     }
   	}
        int localTb1TrnEFeeAmtADbCounter = -1;
        public boolean isTb1TrnEFeeAmtADbModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localTb1TrnEFeeAmtADbCounter != sharedCounter;
           localTb1TrnEFeeAmtADbCounter = sharedCounter; return hasModified; 
        }
	    public boolean tb1TrnEFeeAmtADbIsNumeric() {
	      return decimalIsNumeric(beginTb1TrnEFeeAmtADb,TB_1_TRN_EFEE_AMT_ADB_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int TB_1_TRN_EFEE_AMT_ADB_LEN = 8;
  	/**
	 * 	serializeTb1TrnEFeeAmtADb
	 */
	protected void serializeTb1TrnEFeeAmtADb(long tb1TrnEFeeAmtADb) {
		   putDecimal(beginTb1TrnEFeeAmtADb,tb1TrnEFeeAmtADb,TB_1_TRN_EFEE_AMT_ADB_LEN,true);
   }
   

   protected long checkTb1TrnEFeeAmtADbMaxLimit(long number) {
        return checkMaxLimit(number , MAX_1P /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshTb1TrnEFeeAmtADb is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshTb1TrnEFeeAmtADb() throws CFException {	
   	try { 
		 return (getLongDecimal(beginTb1TrnEFeeAmtADb,TB_1_TRN_EFEE_AMT_ADB_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("tb1TrnEFeeAmtADb", beginTb1TrnEFeeAmtADb,TB_1_TRN_EFEE_AMT_ADB_LEN);
     }
   	}




}
  
