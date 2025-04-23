package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip00724TableEntrySerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:29. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip00724TableEntrySerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip00724TableEntrySerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_00724_TABLE_ENTRY_LENGTH = 126;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp00724Filler3;
            protected  int beginIp00724Filler4;
            protected  int beginIp00724IchgReg;
            protected  int beginIp00724ElectronicQualifier;
            protected  int beginIp00724IntUseIca;
            protected  int beginIp00724AcqSw;
            protected  int beginIp00724AtmInd;
            protected  int beginIp00724RclRegion;
            protected  int beginIp00724Endpoint;
            protected  int beginIp00724WorldIcaChbSw;
            protected  int beginIp00724WorldGrpChbSw1;
            protected  int beginIp00724WorldGrpChbSw2;
            protected  int beginIp00724WorldGrpChbSw3;
            protected  int beginIp00724WorldGrpChbSw4;
            protected  int beginIp00724WorldGrpChbSw5;
            protected  int beginIp00724Filler5;
            protected  int beginIp00724MemberName;
            protected  int beginIp00724CountryCode;
            protected  int beginIp00724CountryIso;
            protected  int beginIp00724ChbConvExclId;
            protected  int beginIp00724ChbConvExprDt;
            protected  int beginIp00724ChbEditExcl;
            protected  int beginIp00724HardshipEffectInd;
            protected  int beginIp00724HardshipEffectDate;
            protected  int beginIp00724HardshipExpireDate;
            protected  int beginIp00724FormatIndicator;
            protected  int beginIp00724McePartcptnCd;
            protected  int beginIp00724EeaAcqCtrySrvIca;
            protected  int beginIp00724IrdDeterminePart;
            protected  int beginIp00724NpgAcqProcInd;
            protected  int beginIp00724PtaParticipantInd;
            protected  int beginIp00724MemberFiller;
	
	/**
	* Constructor for Ip00724TableEntrySerialized
	**/
    public Ip00724TableEntrySerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* initializes the field in Ip00724TableEntrySerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_00724_TABLE_ENTRY_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
             beginIp00724Filler3 = getStartOffset() + 11;	// set offset for serialization
  
             beginIp00724Filler4 = getStartOffset() + 12;	// set offset for serialization
  
             beginIp00724IchgReg = getStartOffset() + 13;	// set offset for serialization
  
  
             beginIp00724ElectronicQualifier = getStartOffset() + 14;	// set offset for serialization
  
             beginIp00724IntUseIca = getStartOffset() + 16;	// set offset for serialization
  
             beginIp00724AcqSw = getStartOffset() + 17;	// set offset for serialization
  
             beginIp00724AtmInd = getStartOffset() + 18;	// set offset for serialization
  
             beginIp00724RclRegion = getStartOffset() + 19;	// set offset for serialization
  
             beginIp00724Endpoint = getStartOffset() + 20;	// set offset for serialization
  
             beginIp00724WorldIcaChbSw = getStartOffset() + 27;	// set offset for serialization
  
             beginIp00724WorldGrpChbSw1 = getStartOffset() + 28;	// set offset for serialization
  
             beginIp00724WorldGrpChbSw2 = getStartOffset() + 29;	// set offset for serialization
  
             beginIp00724WorldGrpChbSw3 = getStartOffset() + 30;	// set offset for serialization
  
             beginIp00724WorldGrpChbSw4 = getStartOffset() + 31;	// set offset for serialization
  
             beginIp00724WorldGrpChbSw5 = getStartOffset() + 32;	// set offset for serialization
  
             beginIp00724Filler5 = getStartOffset() + 33;	// set offset for serialization
  
             beginIp00724MemberName = getStartOffset() + 34;	// set offset for serialization
  
             beginIp00724CountryCode = getStartOffset() + 64;	// set offset for serialization
  
             beginIp00724CountryIso = getStartOffset() + 67;	// set offset for serialization
  
             beginIp00724ChbConvExclId = getStartOffset() + 70;	// set offset for serialization
  
             beginIp00724ChbConvExprDt = getStartOffset() + 71;	// set offset for serialization
  
             beginIp00724ChbEditExcl = getStartOffset() + 77;	// set offset for serialization
  
             beginIp00724HardshipEffectInd = getStartOffset() + 78;	// set offset for serialization
  
             beginIp00724HardshipEffectDate = getStartOffset() + 79;	// set offset for serialization
  
             beginIp00724HardshipExpireDate = getStartOffset() + 85;	// set offset for serialization
  
             beginIp00724FormatIndicator = getStartOffset() + 91;	// set offset for serialization
  
             beginIp00724McePartcptnCd = getStartOffset() + 92;	// set offset for serialization
  
             beginIp00724EeaAcqCtrySrvIca = getStartOffset() + 93;	// set offset for serialization
  
             beginIp00724IrdDeterminePart = getStartOffset() + 94;	// set offset for serialization
  
             beginIp00724NpgAcqProcInd = getStartOffset() + 95;	// set offset for serialization
  
             beginIp00724PtaParticipantInd = getStartOffset() + 96;	// set offset for serialization
  
             beginIp00724MemberFiller = getStartOffset() + 97;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localIp00724Filler3Counter = -1;
     public boolean isIp00724Filler3Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp00724Filler3Counter != sharedCounter;
         localIp00724Filler3Counter = sharedCounter; return hasModified;
     }
	protected static final int IP_00724_FILLER_3_LEN = 1;
	/**
	 * 	serialize this Ip00724Filler3
	 */
   protected void serializeIp00724Filler3(char[] ip00724Filler3) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip00724Filler3,0,getStringValue(),beginIp00724Filler3,IP_00724_FILLER_3_LEN);
       localIp00724Filler3Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp00724Filler3Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp00724Filler3 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp00724Filler3() {	 
   		return (substring(getStringValue(),beginIp00724Filler3,beginIp00724Filler3 + IP_00724_FILLER_3_LEN));
   	}
     int localIp00724Filler4Counter = -1;
     public boolean isIp00724Filler4Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp00724Filler4Counter != sharedCounter;
         localIp00724Filler4Counter = sharedCounter; return hasModified;
     }
	protected static final int IP_00724_FILLER_4_LEN = 1;
	/**
	 * 	serialize this Ip00724Filler4
	 */
   protected void serializeIp00724Filler4(char[] ip00724Filler4) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip00724Filler4,0,getStringValue(),beginIp00724Filler4,IP_00724_FILLER_4_LEN);
       localIp00724Filler4Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp00724Filler4Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp00724Filler4 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp00724Filler4() {	 
   		return (substring(getStringValue(),beginIp00724Filler4,beginIp00724Filler4 + IP_00724_FILLER_4_LEN));
   	}
     int localIp00724IchgRegCounter = -1;
     public boolean isIp00724IchgRegModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp00724IchgRegCounter != sharedCounter;
         localIp00724IchgRegCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_00724_ICHG_REG_LEN = 1;
	/**
	 * 	serialize this Ip00724IchgReg
	 */
   protected void serializeIp00724IchgReg(char[] ip00724IchgReg) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip00724IchgReg,0,getStringValue(),beginIp00724IchgReg,IP_00724_ICHG_REG_LEN);
       localIp00724IchgRegCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp00724IchgRegConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp00724IchgReg is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp00724IchgReg() {	 
   		return (substring(getStringValue(),beginIp00724IchgReg,beginIp00724IchgReg + IP_00724_ICHG_REG_LEN));
   	}
     int localIp00724ElectronicQualifierCounter = -1;
     public boolean isIp00724ElectronicQualifierModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp00724ElectronicQualifierCounter != sharedCounter;
         localIp00724ElectronicQualifierCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_00724_ELECTRONIC_QUALIFIER_LEN = 2;
	/**
	 * 	serialize this Ip00724ElectronicQualifier
	 */
   protected void serializeIp00724ElectronicQualifier(char[] ip00724ElectronicQualifier) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip00724ElectronicQualifier,0,getStringValue(),beginIp00724ElectronicQualifier,IP_00724_ELECTRONIC_QUALIFIER_LEN);
       localIp00724ElectronicQualifierCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp00724ElectronicQualifierConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshIp00724ElectronicQualifier is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp00724ElectronicQualifier() {	 
   		return (substring(getStringValue(),beginIp00724ElectronicQualifier,beginIp00724ElectronicQualifier + IP_00724_ELECTRONIC_QUALIFIER_LEN));
   	}
     int localIp00724IntUseIcaCounter = -1;
     public boolean isIp00724IntUseIcaModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp00724IntUseIcaCounter != sharedCounter;
         localIp00724IntUseIcaCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_00724_INT_USE_ICA_LEN = 1;
	/**
	 * 	serialize this Ip00724IntUseIca
	 */
   protected void serializeIp00724IntUseIca(char[] ip00724IntUseIca) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip00724IntUseIca,0,getStringValue(),beginIp00724IntUseIca,IP_00724_INT_USE_ICA_LEN);
       localIp00724IntUseIcaCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp00724IntUseIcaConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp00724IntUseIca is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp00724IntUseIca() {	 
   		return (substring(getStringValue(),beginIp00724IntUseIca,beginIp00724IntUseIca + IP_00724_INT_USE_ICA_LEN));
   	}
     int localIp00724AcqSwCounter = -1;
     public boolean isIp00724AcqSwModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp00724AcqSwCounter != sharedCounter;
         localIp00724AcqSwCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_00724_ACQ_SW_LEN = 1;
	/**
	 * 	serialize this Ip00724AcqSw
	 */
   protected void serializeIp00724AcqSw(char[] ip00724AcqSw) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip00724AcqSw,0,getStringValue(),beginIp00724AcqSw,IP_00724_ACQ_SW_LEN);
       localIp00724AcqSwCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp00724AcqSwConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp00724AcqSw is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp00724AcqSw() {	 
   		return (substring(getStringValue(),beginIp00724AcqSw,beginIp00724AcqSw + IP_00724_ACQ_SW_LEN));
   	}
     int localIp00724AtmIndCounter = -1;
     public boolean isIp00724AtmIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp00724AtmIndCounter != sharedCounter;
         localIp00724AtmIndCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_00724_ATM_IND_LEN = 1;
	/**
	 * 	serialize this Ip00724AtmInd
	 */
   protected void serializeIp00724AtmInd(char[] ip00724AtmInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip00724AtmInd,0,getStringValue(),beginIp00724AtmInd,IP_00724_ATM_IND_LEN);
       localIp00724AtmIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp00724AtmIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp00724AtmInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp00724AtmInd() {	 
   		return (substring(getStringValue(),beginIp00724AtmInd,beginIp00724AtmInd + IP_00724_ATM_IND_LEN));
   	}
     int localIp00724RclRegionCounter = -1;
     public boolean isIp00724RclRegionModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp00724RclRegionCounter != sharedCounter;
         localIp00724RclRegionCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_00724_RCL_REGION_LEN = 1;
	/**
	 * 	serialize this Ip00724RclRegion
	 */
   protected void serializeIp00724RclRegion(char[] ip00724RclRegion) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip00724RclRegion,0,getStringValue(),beginIp00724RclRegion,IP_00724_RCL_REGION_LEN);
       localIp00724RclRegionCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp00724RclRegionConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp00724RclRegion is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp00724RclRegion() {	 
   		return (substring(getStringValue(),beginIp00724RclRegion,beginIp00724RclRegion + IP_00724_RCL_REGION_LEN));
   	}
     int localIp00724EndpointCounter = -1;
     public boolean isIp00724EndpointModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp00724EndpointCounter != sharedCounter;
         localIp00724EndpointCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ip00724Endpoint
	 *	@return ip00724Endpoint
	 */
	public char[]  getIp00724EndpointString() {
	     return getCharArray(beginIp00724Endpoint,IP_00724_ENDPOINT_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip00724EndpointIsNumeric() {
	    return isNumeric(beginIp00724Endpoint
	                    ,beginIp00724Endpoint + IP_00724_ENDPOINT_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int IP_00724_ENDPOINT_LEN = 7;
  	/**
	 * serializeIp00724Endpoint
	 */
	protected void serializeIp00724Endpoint(long ip00724Endpoint) {
		 putNumber(beginIp00724Endpoint,ip00724Endpoint,IP_00724_ENDPOINT_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localIp00724EndpointCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeIp00724Endpoint
	 */
   	protected  long serializeIp00724Endpoint(char[] value) {
	    long  ip00724Endpoint;
	    if(value.length >0 && value.length!= 7)
            value = new String(value).trim().toCharArray();
	    if (value.length < 7) value = pad(7, value, ' ', LEFT_PAD);
	    else if (value.length > 7) value = substring(value,0,7);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ip00724Endpoint = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(7,value,false/*isSigned?*/)
		       ,beginIp00724Endpoint
		       ,7
		      );
		 localIp00724EndpointCounter = shareString.getSerializedField().getModifiedCounter();
		return  ip00724Endpoint;
    }

   protected long checkIp00724EndpointMaxLimit(long number) {

        return checkMaxLimit(number , MAX_10M/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshIp00724Endpoint is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshIp00724Endpoint() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginIp00724Endpoint
			                 ,IP_00724_ENDPOINT_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ip00724Endpoint", beginIp00724Endpoint,IP_00724_ENDPOINT_LEN);
    }
   	}
     int localIp00724WorldIcaChbSwCounter = -1;
     public boolean isIp00724WorldIcaChbSwModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp00724WorldIcaChbSwCounter != sharedCounter;
         localIp00724WorldIcaChbSwCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_00724_WORLD_ICA_CHB_SW_LEN = 1;
	/**
	 * 	serialize this Ip00724WorldIcaChbSw
	 */
   protected void serializeIp00724WorldIcaChbSw(char[] ip00724WorldIcaChbSw) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip00724WorldIcaChbSw,0,getStringValue(),beginIp00724WorldIcaChbSw,IP_00724_WORLD_ICA_CHB_SW_LEN);
       localIp00724WorldIcaChbSwCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp00724WorldIcaChbSwConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp00724WorldIcaChbSw is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp00724WorldIcaChbSw() {	 
   		return (substring(getStringValue(),beginIp00724WorldIcaChbSw,beginIp00724WorldIcaChbSw + IP_00724_WORLD_ICA_CHB_SW_LEN));
   	}
     int localIp00724WorldGrpChbSw1Counter = -1;
     public boolean isIp00724WorldGrpChbSw1Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp00724WorldGrpChbSw1Counter != sharedCounter;
         localIp00724WorldGrpChbSw1Counter = sharedCounter; return hasModified;
     }
	protected static final int IP_00724_WORLD_GRP_CHB_SW_1_LEN = 1;
	/**
	 * 	serialize this Ip00724WorldGrpChbSw1
	 */
   protected void serializeIp00724WorldGrpChbSw1(char[] ip00724WorldGrpChbSw1) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip00724WorldGrpChbSw1,0,getStringValue(),beginIp00724WorldGrpChbSw1,IP_00724_WORLD_GRP_CHB_SW_1_LEN);
       localIp00724WorldGrpChbSw1Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp00724WorldGrpChbSw1Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp00724WorldGrpChbSw1 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp00724WorldGrpChbSw1() {	 
   		return (substring(getStringValue(),beginIp00724WorldGrpChbSw1,beginIp00724WorldGrpChbSw1 + IP_00724_WORLD_GRP_CHB_SW_1_LEN));
   	}
     int localIp00724WorldGrpChbSw2Counter = -1;
     public boolean isIp00724WorldGrpChbSw2Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp00724WorldGrpChbSw2Counter != sharedCounter;
         localIp00724WorldGrpChbSw2Counter = sharedCounter; return hasModified;
     }
	protected static final int IP_00724_WORLD_GRP_CHB_SW_2_LEN = 1;
	/**
	 * 	serialize this Ip00724WorldGrpChbSw2
	 */
   protected void serializeIp00724WorldGrpChbSw2(char[] ip00724WorldGrpChbSw2) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip00724WorldGrpChbSw2,0,getStringValue(),beginIp00724WorldGrpChbSw2,IP_00724_WORLD_GRP_CHB_SW_2_LEN);
       localIp00724WorldGrpChbSw2Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp00724WorldGrpChbSw2Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp00724WorldGrpChbSw2 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp00724WorldGrpChbSw2() {	 
   		return (substring(getStringValue(),beginIp00724WorldGrpChbSw2,beginIp00724WorldGrpChbSw2 + IP_00724_WORLD_GRP_CHB_SW_2_LEN));
   	}
     int localIp00724WorldGrpChbSw3Counter = -1;
     public boolean isIp00724WorldGrpChbSw3Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp00724WorldGrpChbSw3Counter != sharedCounter;
         localIp00724WorldGrpChbSw3Counter = sharedCounter; return hasModified;
     }
	protected static final int IP_00724_WORLD_GRP_CHB_SW_3_LEN = 1;
	/**
	 * 	serialize this Ip00724WorldGrpChbSw3
	 */
   protected void serializeIp00724WorldGrpChbSw3(char[] ip00724WorldGrpChbSw3) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip00724WorldGrpChbSw3,0,getStringValue(),beginIp00724WorldGrpChbSw3,IP_00724_WORLD_GRP_CHB_SW_3_LEN);
       localIp00724WorldGrpChbSw3Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp00724WorldGrpChbSw3Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp00724WorldGrpChbSw3 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp00724WorldGrpChbSw3() {	 
   		return (substring(getStringValue(),beginIp00724WorldGrpChbSw3,beginIp00724WorldGrpChbSw3 + IP_00724_WORLD_GRP_CHB_SW_3_LEN));
   	}
     int localIp00724WorldGrpChbSw4Counter = -1;
     public boolean isIp00724WorldGrpChbSw4Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp00724WorldGrpChbSw4Counter != sharedCounter;
         localIp00724WorldGrpChbSw4Counter = sharedCounter; return hasModified;
     }
	protected static final int IP_00724_WORLD_GRP_CHB_SW_4_LEN = 1;
	/**
	 * 	serialize this Ip00724WorldGrpChbSw4
	 */
   protected void serializeIp00724WorldGrpChbSw4(char[] ip00724WorldGrpChbSw4) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip00724WorldGrpChbSw4,0,getStringValue(),beginIp00724WorldGrpChbSw4,IP_00724_WORLD_GRP_CHB_SW_4_LEN);
       localIp00724WorldGrpChbSw4Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp00724WorldGrpChbSw4Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp00724WorldGrpChbSw4 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp00724WorldGrpChbSw4() {	 
   		return (substring(getStringValue(),beginIp00724WorldGrpChbSw4,beginIp00724WorldGrpChbSw4 + IP_00724_WORLD_GRP_CHB_SW_4_LEN));
   	}
     int localIp00724WorldGrpChbSw5Counter = -1;
     public boolean isIp00724WorldGrpChbSw5Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp00724WorldGrpChbSw5Counter != sharedCounter;
         localIp00724WorldGrpChbSw5Counter = sharedCounter; return hasModified;
     }
	protected static final int IP_00724_WORLD_GRP_CHB_SW_5_LEN = 1;
	/**
	 * 	serialize this Ip00724WorldGrpChbSw5
	 */
   protected void serializeIp00724WorldGrpChbSw5(char[] ip00724WorldGrpChbSw5) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip00724WorldGrpChbSw5,0,getStringValue(),beginIp00724WorldGrpChbSw5,IP_00724_WORLD_GRP_CHB_SW_5_LEN);
       localIp00724WorldGrpChbSw5Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp00724WorldGrpChbSw5Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp00724WorldGrpChbSw5 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp00724WorldGrpChbSw5() {	 
   		return (substring(getStringValue(),beginIp00724WorldGrpChbSw5,beginIp00724WorldGrpChbSw5 + IP_00724_WORLD_GRP_CHB_SW_5_LEN));
   	}
     int localIp00724Filler5Counter = -1;
     public boolean isIp00724Filler5Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp00724Filler5Counter != sharedCounter;
         localIp00724Filler5Counter = sharedCounter; return hasModified;
     }
	protected static final int IP_00724_FILLER_5_LEN = 1;
	/**
	 * 	serialize this Ip00724Filler5
	 */
   protected void serializeIp00724Filler5(char[] ip00724Filler5) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip00724Filler5,0,getStringValue(),beginIp00724Filler5,IP_00724_FILLER_5_LEN);
       localIp00724Filler5Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp00724Filler5Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp00724Filler5 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp00724Filler5() {	 
   		return (substring(getStringValue(),beginIp00724Filler5,beginIp00724Filler5 + IP_00724_FILLER_5_LEN));
   	}
     int localIp00724MemberNameCounter = -1;
     public boolean isIp00724MemberNameModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp00724MemberNameCounter != sharedCounter;
         localIp00724MemberNameCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_00724_MEMBER_NAME_LEN = 30;
	/**
	 * 	serialize this Ip00724MemberName
	 */
   protected void serializeIp00724MemberName(char[] ip00724MemberName) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip00724MemberName,0,getStringValue(),beginIp00724MemberName,IP_00724_MEMBER_NAME_LEN);
       localIp00724MemberNameCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp00724MemberNameConstraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
    /**
	 *	refreshIp00724MemberName is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp00724MemberName() {	 
   		return (substring(getStringValue(),beginIp00724MemberName,beginIp00724MemberName + IP_00724_MEMBER_NAME_LEN));
   	}
     int localIp00724CountryCodeCounter = -1;
     public boolean isIp00724CountryCodeModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp00724CountryCodeCounter != sharedCounter;
         localIp00724CountryCodeCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_00724_COUNTRY_CODE_LEN = 3;
	/**
	 * 	serialize this Ip00724CountryCode
	 */
   protected void serializeIp00724CountryCode(char[] ip00724CountryCode) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip00724CountryCode,0,getStringValue(),beginIp00724CountryCode,IP_00724_COUNTRY_CODE_LEN);
       localIp00724CountryCodeCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp00724CountryCodeConstraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshIp00724CountryCode is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp00724CountryCode() {	 
   		return (substring(getStringValue(),beginIp00724CountryCode,beginIp00724CountryCode + IP_00724_COUNTRY_CODE_LEN));
   	}
     int localIp00724CountryIsoCounter = -1;
     public boolean isIp00724CountryIsoModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp00724CountryIsoCounter != sharedCounter;
         localIp00724CountryIsoCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ip00724CountryIso
	 *	@return ip00724CountryIso
	 */
	public char[]  getIp00724CountryIsoString() {
	     return getCharArray(beginIp00724CountryIso,IP_00724_COUNTRY_ISO_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip00724CountryIsoIsNumeric() {
	    return isNumeric(beginIp00724CountryIso
	                    ,beginIp00724CountryIso + IP_00724_COUNTRY_ISO_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int IP_00724_COUNTRY_ISO_LEN = 3;
  	/**
	 * serializeIp00724CountryIso
	 */
	protected void serializeIp00724CountryIso(int ip00724CountryIso) {
		 putNumber(beginIp00724CountryIso,ip00724CountryIso,IP_00724_COUNTRY_ISO_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localIp00724CountryIsoCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeIp00724CountryIso
	 */
   	protected  int serializeIp00724CountryIso(char[] value) {
	    int  ip00724CountryIso;
	    if(value.length >0 && value.length!= 3)
            value = new String(value).trim().toCharArray();
	    if (value.length < 3) value = pad(3, value, ' ', LEFT_PAD);
	    else if (value.length > 3) value = substring(value,0,3);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ip00724CountryIso = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(3,value,false/*isSigned?*/)
		       ,beginIp00724CountryIso
		       ,3
		      );
		 localIp00724CountryIsoCounter = shareString.getSerializedField().getModifiedCounter();
		return  ip00724CountryIso;
    }

   protected int checkIp00724CountryIsoMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_1000/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshIp00724CountryIso is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshIp00724CountryIso() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginIp00724CountryIso
			                 ,IP_00724_COUNTRY_ISO_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ip00724CountryIso", beginIp00724CountryIso,IP_00724_COUNTRY_ISO_LEN);
    }
   	}
     int localIp00724ChbConvExclIdCounter = -1;
     public boolean isIp00724ChbConvExclIdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp00724ChbConvExclIdCounter != sharedCounter;
         localIp00724ChbConvExclIdCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_00724_CHB_CONV_EXCL_ID_LEN = 1;
	/**
	 * 	serialize this Ip00724ChbConvExclId
	 */
   protected void serializeIp00724ChbConvExclId(char[] ip00724ChbConvExclId) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip00724ChbConvExclId,0,getStringValue(),beginIp00724ChbConvExclId,IP_00724_CHB_CONV_EXCL_ID_LEN);
       localIp00724ChbConvExclIdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp00724ChbConvExclIdConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp00724ChbConvExclId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp00724ChbConvExclId() {	 
   		return (substring(getStringValue(),beginIp00724ChbConvExclId,beginIp00724ChbConvExclId + IP_00724_CHB_CONV_EXCL_ID_LEN));
   	}
     int localIp00724ChbConvExprDtCounter = -1;
     public boolean isIp00724ChbConvExprDtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp00724ChbConvExprDtCounter != sharedCounter;
         localIp00724ChbConvExprDtCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ip00724ChbConvExprDt
	 *	@return ip00724ChbConvExprDt
	 */
	public char[]  getIp00724ChbConvExprDtString() {
	     return getCharArray(beginIp00724ChbConvExprDt,IP_00724_CHB_CONV_EXPR_DT_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip00724ChbConvExprDtIsNumeric() {
	    return isNumeric(beginIp00724ChbConvExprDt
	                    ,beginIp00724ChbConvExprDt + IP_00724_CHB_CONV_EXPR_DT_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int IP_00724_CHB_CONV_EXPR_DT_LEN = 6;
  	/**
	 * serializeIp00724ChbConvExprDt
	 */
	protected void serializeIp00724ChbConvExprDt(long ip00724ChbConvExprDt) {
		 putNumber(beginIp00724ChbConvExprDt,ip00724ChbConvExprDt,IP_00724_CHB_CONV_EXPR_DT_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localIp00724ChbConvExprDtCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeIp00724ChbConvExprDt
	 */
   	protected  long serializeIp00724ChbConvExprDt(char[] value) {
	    long  ip00724ChbConvExprDt;
	    if(value.length >0 && value.length!= 6)
            value = new String(value).trim().toCharArray();
	    if (value.length < 6) value = pad(6, value, ' ', LEFT_PAD);
	    else if (value.length > 6) value = substring(value,0,6);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ip00724ChbConvExprDt = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(6,value,false/*isSigned?*/)
		       ,beginIp00724ChbConvExprDt
		       ,6
		      );
		 localIp00724ChbConvExprDtCounter = shareString.getSerializedField().getModifiedCounter();
		return  ip00724ChbConvExprDt;
    }

   protected long checkIp00724ChbConvExprDtMaxLimit(long number) {

        return checkMaxLimit(number , MAX_1M/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshIp00724ChbConvExprDt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshIp00724ChbConvExprDt() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginIp00724ChbConvExprDt
			                 ,IP_00724_CHB_CONV_EXPR_DT_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ip00724ChbConvExprDt", beginIp00724ChbConvExprDt,IP_00724_CHB_CONV_EXPR_DT_LEN);
    }
   	}
     int localIp00724ChbEditExclCounter = -1;
     public boolean isIp00724ChbEditExclModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp00724ChbEditExclCounter != sharedCounter;
         localIp00724ChbEditExclCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_00724_CHB_EDIT_EXCL_LEN = 1;
	/**
	 * 	serialize this Ip00724ChbEditExcl
	 */
   protected void serializeIp00724ChbEditExcl(char[] ip00724ChbEditExcl) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip00724ChbEditExcl,0,getStringValue(),beginIp00724ChbEditExcl,IP_00724_CHB_EDIT_EXCL_LEN);
       localIp00724ChbEditExclCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp00724ChbEditExclConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp00724ChbEditExcl is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp00724ChbEditExcl() {	 
   		return (substring(getStringValue(),beginIp00724ChbEditExcl,beginIp00724ChbEditExcl + IP_00724_CHB_EDIT_EXCL_LEN));
   	}
     int localIp00724HardshipEffectIndCounter = -1;
     public boolean isIp00724HardshipEffectIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp00724HardshipEffectIndCounter != sharedCounter;
         localIp00724HardshipEffectIndCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_00724_HARDSHIP_EFFECT_IND_LEN = 1;
	/**
	 * 	serialize this Ip00724HardshipEffectInd
	 */
   protected void serializeIp00724HardshipEffectInd(char[] ip00724HardshipEffectInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip00724HardshipEffectInd,0,getStringValue(),beginIp00724HardshipEffectInd,IP_00724_HARDSHIP_EFFECT_IND_LEN);
       localIp00724HardshipEffectIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp00724HardshipEffectIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp00724HardshipEffectInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp00724HardshipEffectInd() {	 
   		return (substring(getStringValue(),beginIp00724HardshipEffectInd,beginIp00724HardshipEffectInd + IP_00724_HARDSHIP_EFFECT_IND_LEN));
   	}
     int localIp00724HardshipEffectDateCounter = -1;
     public boolean isIp00724HardshipEffectDateModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp00724HardshipEffectDateCounter != sharedCounter;
         localIp00724HardshipEffectDateCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ip00724HardshipEffectDate
	 *	@return ip00724HardshipEffectDate
	 */
	public char[]  getIp00724HardshipEffectDateString() {
	     return getCharArray(beginIp00724HardshipEffectDate,IP_00724_HARDSHIP_EFFECT_DATE_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip00724HardshipEffectDateIsNumeric() {
	    return isNumeric(beginIp00724HardshipEffectDate
	                    ,beginIp00724HardshipEffectDate + IP_00724_HARDSHIP_EFFECT_DATE_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int IP_00724_HARDSHIP_EFFECT_DATE_LEN = 6;
  	/**
	 * serializeIp00724HardshipEffectDate
	 */
	protected void serializeIp00724HardshipEffectDate(long ip00724HardshipEffectDate) {
		 putNumber(beginIp00724HardshipEffectDate,ip00724HardshipEffectDate,IP_00724_HARDSHIP_EFFECT_DATE_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localIp00724HardshipEffectDateCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeIp00724HardshipEffectDate
	 */
   	protected  long serializeIp00724HardshipEffectDate(char[] value) {
	    long  ip00724HardshipEffectDate;
	    if(value.length >0 && value.length!= 6)
            value = new String(value).trim().toCharArray();
	    if (value.length < 6) value = pad(6, value, ' ', LEFT_PAD);
	    else if (value.length > 6) value = substring(value,0,6);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ip00724HardshipEffectDate = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(6,value,false/*isSigned?*/)
		       ,beginIp00724HardshipEffectDate
		       ,6
		      );
		 localIp00724HardshipEffectDateCounter = shareString.getSerializedField().getModifiedCounter();
		return  ip00724HardshipEffectDate;
    }

   protected long checkIp00724HardshipEffectDateMaxLimit(long number) {

        return checkMaxLimit(number , MAX_1M/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshIp00724HardshipEffectDate is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshIp00724HardshipEffectDate() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginIp00724HardshipEffectDate
			                 ,IP_00724_HARDSHIP_EFFECT_DATE_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ip00724HardshipEffectDate", beginIp00724HardshipEffectDate,IP_00724_HARDSHIP_EFFECT_DATE_LEN);
    }
   	}
     int localIp00724HardshipExpireDateCounter = -1;
     public boolean isIp00724HardshipExpireDateModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp00724HardshipExpireDateCounter != sharedCounter;
         localIp00724HardshipExpireDateCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ip00724HardshipExpireDate
	 *	@return ip00724HardshipExpireDate
	 */
	public char[]  getIp00724HardshipExpireDateString() {
	     return getCharArray(beginIp00724HardshipExpireDate,IP_00724_HARDSHIP_EXPIRE_DATE_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip00724HardshipExpireDateIsNumeric() {
	    return isNumeric(beginIp00724HardshipExpireDate
	                    ,beginIp00724HardshipExpireDate + IP_00724_HARDSHIP_EXPIRE_DATE_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int IP_00724_HARDSHIP_EXPIRE_DATE_LEN = 6;
  	/**
	 * serializeIp00724HardshipExpireDate
	 */
	protected void serializeIp00724HardshipExpireDate(long ip00724HardshipExpireDate) {
		 putNumber(beginIp00724HardshipExpireDate,ip00724HardshipExpireDate,IP_00724_HARDSHIP_EXPIRE_DATE_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localIp00724HardshipExpireDateCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeIp00724HardshipExpireDate
	 */
   	protected  long serializeIp00724HardshipExpireDate(char[] value) {
	    long  ip00724HardshipExpireDate;
	    if(value.length >0 && value.length!= 6)
            value = new String(value).trim().toCharArray();
	    if (value.length < 6) value = pad(6, value, ' ', LEFT_PAD);
	    else if (value.length > 6) value = substring(value,0,6);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ip00724HardshipExpireDate = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(6,value,false/*isSigned?*/)
		       ,beginIp00724HardshipExpireDate
		       ,6
		      );
		 localIp00724HardshipExpireDateCounter = shareString.getSerializedField().getModifiedCounter();
		return  ip00724HardshipExpireDate;
    }

   protected long checkIp00724HardshipExpireDateMaxLimit(long number) {

        return checkMaxLimit(number , MAX_1M/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshIp00724HardshipExpireDate is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshIp00724HardshipExpireDate() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginIp00724HardshipExpireDate
			                 ,IP_00724_HARDSHIP_EXPIRE_DATE_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ip00724HardshipExpireDate", beginIp00724HardshipExpireDate,IP_00724_HARDSHIP_EXPIRE_DATE_LEN);
    }
   	}
     int localIp00724FormatIndicatorCounter = -1;
     public boolean isIp00724FormatIndicatorModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp00724FormatIndicatorCounter != sharedCounter;
         localIp00724FormatIndicatorCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_00724_FORMAT_INDICATOR_LEN = 1;
	/**
	 * 	serialize this Ip00724FormatIndicator
	 */
   protected void serializeIp00724FormatIndicator(char[] ip00724FormatIndicator) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip00724FormatIndicator,0,getStringValue(),beginIp00724FormatIndicator,IP_00724_FORMAT_INDICATOR_LEN);
       localIp00724FormatIndicatorCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp00724FormatIndicatorConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp00724FormatIndicator is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp00724FormatIndicator() {	 
   		return (substring(getStringValue(),beginIp00724FormatIndicator,beginIp00724FormatIndicator + IP_00724_FORMAT_INDICATOR_LEN));
   	}
     int localIp00724McePartcptnCdCounter = -1;
     public boolean isIp00724McePartcptnCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp00724McePartcptnCdCounter != sharedCounter;
         localIp00724McePartcptnCdCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_00724_MCE_PARTCPTN_CD_LEN = 1;
	/**
	 * 	serialize this Ip00724McePartcptnCd
	 */
   protected void serializeIp00724McePartcptnCd(char[] ip00724McePartcptnCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip00724McePartcptnCd,0,getStringValue(),beginIp00724McePartcptnCd,IP_00724_MCE_PARTCPTN_CD_LEN);
       localIp00724McePartcptnCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp00724McePartcptnCdConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp00724McePartcptnCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp00724McePartcptnCd() {	 
   		return (substring(getStringValue(),beginIp00724McePartcptnCd,beginIp00724McePartcptnCd + IP_00724_MCE_PARTCPTN_CD_LEN));
   	}
     int localIp00724EeaAcqCtrySrvIcaCounter = -1;
     public boolean isIp00724EeaAcqCtrySrvIcaModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp00724EeaAcqCtrySrvIcaCounter != sharedCounter;
         localIp00724EeaAcqCtrySrvIcaCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_00724_EEA_ACQ_CTRY_SRV_ICA_LEN = 1;
	/**
	 * 	serialize this Ip00724EeaAcqCtrySrvIca
	 */
   protected void serializeIp00724EeaAcqCtrySrvIca(char[] ip00724EeaAcqCtrySrvIca) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip00724EeaAcqCtrySrvIca,0,getStringValue(),beginIp00724EeaAcqCtrySrvIca,IP_00724_EEA_ACQ_CTRY_SRV_ICA_LEN);
       localIp00724EeaAcqCtrySrvIcaCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp00724EeaAcqCtrySrvIcaConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp00724EeaAcqCtrySrvIca is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp00724EeaAcqCtrySrvIca() {	 
   		return (substring(getStringValue(),beginIp00724EeaAcqCtrySrvIca,beginIp00724EeaAcqCtrySrvIca + IP_00724_EEA_ACQ_CTRY_SRV_ICA_LEN));
   	}
     int localIp00724IrdDeterminePartCounter = -1;
     public boolean isIp00724IrdDeterminePartModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp00724IrdDeterminePartCounter != sharedCounter;
         localIp00724IrdDeterminePartCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_00724_IRD_DETERMINE_PART_LEN = 1;
	/**
	 * 	serialize this Ip00724IrdDeterminePart
	 */
   protected void serializeIp00724IrdDeterminePart(char[] ip00724IrdDeterminePart) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip00724IrdDeterminePart,0,getStringValue(),beginIp00724IrdDeterminePart,IP_00724_IRD_DETERMINE_PART_LEN);
       localIp00724IrdDeterminePartCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp00724IrdDeterminePartConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp00724IrdDeterminePart is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp00724IrdDeterminePart() {	 
   		return (substring(getStringValue(),beginIp00724IrdDeterminePart,beginIp00724IrdDeterminePart + IP_00724_IRD_DETERMINE_PART_LEN));
   	}
     int localIp00724NpgAcqProcIndCounter = -1;
     public boolean isIp00724NpgAcqProcIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp00724NpgAcqProcIndCounter != sharedCounter;
         localIp00724NpgAcqProcIndCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_00724_NPG_ACQ_PROC_IND_LEN = 1;
	/**
	 * 	serialize this Ip00724NpgAcqProcInd
	 */
   protected void serializeIp00724NpgAcqProcInd(char[] ip00724NpgAcqProcInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip00724NpgAcqProcInd,0,getStringValue(),beginIp00724NpgAcqProcInd,IP_00724_NPG_ACQ_PROC_IND_LEN);
       localIp00724NpgAcqProcIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp00724NpgAcqProcIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp00724NpgAcqProcInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp00724NpgAcqProcInd() {	 
   		return (substring(getStringValue(),beginIp00724NpgAcqProcInd,beginIp00724NpgAcqProcInd + IP_00724_NPG_ACQ_PROC_IND_LEN));
   	}
     int localIp00724PtaParticipantIndCounter = -1;
     public boolean isIp00724PtaParticipantIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp00724PtaParticipantIndCounter != sharedCounter;
         localIp00724PtaParticipantIndCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_00724_PTA_PARTICIPANT_IND_LEN = 1;
	/**
	 * 	serialize this Ip00724PtaParticipantInd
	 */
   protected void serializeIp00724PtaParticipantInd(char[] ip00724PtaParticipantInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip00724PtaParticipantInd,0,getStringValue(),beginIp00724PtaParticipantInd,IP_00724_PTA_PARTICIPANT_IND_LEN);
       localIp00724PtaParticipantIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp00724PtaParticipantIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp00724PtaParticipantInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp00724PtaParticipantInd() {	 
   		return (substring(getStringValue(),beginIp00724PtaParticipantInd,beginIp00724PtaParticipantInd + IP_00724_PTA_PARTICIPANT_IND_LEN));
   	}
     int localIp00724MemberFillerCounter = -1;
     public boolean isIp00724MemberFillerModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp00724MemberFillerCounter != sharedCounter;
         localIp00724MemberFillerCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_00724_MEMBER_FILLER_LEN = 8;
	/**
	 * 	serialize this Ip00724MemberFiller
	 */
   protected void serializeIp00724MemberFiller(char[] ip00724MemberFiller) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip00724MemberFiller,0,getStringValue(),beginIp00724MemberFiller,IP_00724_MEMBER_FILLER_LEN);
       localIp00724MemberFillerCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp00724MemberFillerConstraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshIp00724MemberFiller is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp00724MemberFiller() {	 
   		return (substring(getStringValue(),beginIp00724MemberFiller,beginIp00724MemberFiller + IP_00724_MEMBER_FILLER_LEN));
   	}




}
  
