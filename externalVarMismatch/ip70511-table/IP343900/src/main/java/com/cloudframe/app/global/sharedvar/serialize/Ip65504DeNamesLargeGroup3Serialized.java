package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip65504DeNamesLargeGroup3Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:16. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip65504DeNamesLargeGroup3Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip65504DeNamesLargeGroup3Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_65504_DE_NAMES_LARGE_GROUP_3_LENGTH = 248;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp65504D63TrxCycS;
            protected  int beginIp65504D63TrxCycL;
            protected  int beginIp65504D64MacCodS;
            protected  int beginIp65504D64MacCodL;
            protected  int beginIp65504D65ReservdS;
            protected  int beginIp65504D65ReservdL;
            protected  int beginIp65504D66AmtFeeS;
            protected  int beginIp65504D66AmtFeeL;
            protected  int beginIp65504D67ExtPayS;
            protected  int beginIp65504D67ExtPayL;
            protected  int beginIp65504D68RecvCcS;
            protected  int beginIp65504D68RecvCcL;
            protected  int beginIp65504D69SetlCcS;
            protected  int beginIp65504D69SetlCcL;
            protected  int beginIp65504D70AuthCcS;
            protected  int beginIp65504D70AuthCcL;
            protected  int beginIp65504D71MsgNbrS;
            protected  int beginIp65504D71MsgNbrL;
            protected  int beginIp65504D72DataRdS;
            protected  int beginIp65504D72DataRdL;
            protected  int beginIp65504D73ActDteS;
            protected  int beginIp65504D73ActDteL;
            protected  int beginIp65504D74CrNmbrS;
            protected  int beginIp65504D74CrNmbrL;
            protected  int beginIp65504D75CrRevnS;
            protected  int beginIp65504D75CrRevnL;
            protected  int beginIp65504D76DbNmbrS;
            protected  int beginIp65504D76DbNmbrL;
            protected  int beginIp65504D77DbRevnS;
            protected  int beginIp65504D77DbRevnL;
            protected  int beginIp65504D78TferNoS;
            protected  int beginIp65504D78TferNoL;
            protected  int beginIp65504D79TferRvS;
            protected  int beginIp65504D79TferRcL;
            protected  int beginIp65504D80InqNbrS;
            protected  int beginIp65504D80InqNbrL;
            protected  int beginIp65504D81AuthNoS;
            protected  int beginIp65504D81AuthNoL;
            protected  int beginIp65504D82InqRevS;
            protected  int beginIp65504D82InqRevL;
            protected  int beginIp65504D83PymtNoS;
            protected  int beginIp65504D83PymtNoL;
            protected  int beginIp65504D84PymtRvS;
            protected  int beginIp65504D84PymtRvL;
            protected  int beginIp65504D85FeeColS;
            protected  int beginIp65504D85FeeColL;
            protected  int beginIp65504D86CrAmtsS;
            protected  int beginIp65504D86CrAmtsL;
            protected  int beginIp65504D87CrRevrS;
            protected  int beginIp65504D87CrRevrL;
            protected  int beginIp65504D88DbAmtsS;
            protected  int beginIp65504D88DbAmtsL;
            protected  int beginIp65504D89DbRevrS;
            protected  int beginIp65504D89DbRevrL;
            protected  int beginIp65504D90AuthRvS;
            protected  int beginIp65504D90AuthRvL;
            protected  int beginIp65504D91TrxDccS;
            protected  int beginIp65504D91TrxDccL;
            protected  int beginIp65504D92TrxOccS;
            protected  int beginIp65504D92TrxOccL;
            protected  int beginIp65504D93TrxDidS;
            protected  int beginIp65504D93TrxDidL;
	
	/**
	* Constructor for Ip65504DeNamesLargeGroup3Serialized
	**/
    public Ip65504DeNamesLargeGroup3Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ip65504DeNamesLargeGroup3Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip65504DeNamesLargeGroup3Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ip65504DeNamesLargeGroup3Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,492); // serialize this field at offset 492 by default 
    }
    
	/**
	* sets parent for this Ip65504DeNamesLargeGroup3Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 492 by default
    }    
	/**
	* initializes the field in Ip65504DeNamesLargeGroup3Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_65504_DE_NAMES_LARGE_GROUP_3_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp65504D63TrxCycS = getStartOffset() + 4;	// set offset for serialization
  
             beginIp65504D63TrxCycL = getStartOffset() + 6;	// set offset for serialization
  
  
             beginIp65504D64MacCodS = getStartOffset() + 12;	// set offset for serialization
  
             beginIp65504D64MacCodL = getStartOffset() + 14;	// set offset for serialization
  
  
             beginIp65504D65ReservdS = getStartOffset() + 20;	// set offset for serialization
  
             beginIp65504D65ReservdL = getStartOffset() + 22;	// set offset for serialization
  
  
             beginIp65504D66AmtFeeS = getStartOffset() + 28;	// set offset for serialization
  
             beginIp65504D66AmtFeeL = getStartOffset() + 30;	// set offset for serialization
  
  
             beginIp65504D67ExtPayS = getStartOffset() + 36;	// set offset for serialization
  
             beginIp65504D67ExtPayL = getStartOffset() + 38;	// set offset for serialization
  
  
             beginIp65504D68RecvCcS = getStartOffset() + 44;	// set offset for serialization
  
             beginIp65504D68RecvCcL = getStartOffset() + 46;	// set offset for serialization
  
  
             beginIp65504D69SetlCcS = getStartOffset() + 52;	// set offset for serialization
  
             beginIp65504D69SetlCcL = getStartOffset() + 54;	// set offset for serialization
  
  
             beginIp65504D70AuthCcS = getStartOffset() + 60;	// set offset for serialization
  
             beginIp65504D70AuthCcL = getStartOffset() + 62;	// set offset for serialization
  
  
             beginIp65504D71MsgNbrS = getStartOffset() + 68;	// set offset for serialization
  
             beginIp65504D71MsgNbrL = getStartOffset() + 70;	// set offset for serialization
  
  
             beginIp65504D72DataRdS = getStartOffset() + 76;	// set offset for serialization
  
             beginIp65504D72DataRdL = getStartOffset() + 78;	// set offset for serialization
  
  
             beginIp65504D73ActDteS = getStartOffset() + 84;	// set offset for serialization
  
             beginIp65504D73ActDteL = getStartOffset() + 86;	// set offset for serialization
  
  
             beginIp65504D74CrNmbrS = getStartOffset() + 92;	// set offset for serialization
  
             beginIp65504D74CrNmbrL = getStartOffset() + 94;	// set offset for serialization
  
  
             beginIp65504D75CrRevnS = getStartOffset() + 100;	// set offset for serialization
  
             beginIp65504D75CrRevnL = getStartOffset() + 102;	// set offset for serialization
  
  
             beginIp65504D76DbNmbrS = getStartOffset() + 108;	// set offset for serialization
  
             beginIp65504D76DbNmbrL = getStartOffset() + 110;	// set offset for serialization
  
  
             beginIp65504D77DbRevnS = getStartOffset() + 116;	// set offset for serialization
  
             beginIp65504D77DbRevnL = getStartOffset() + 118;	// set offset for serialization
  
  
             beginIp65504D78TferNoS = getStartOffset() + 124;	// set offset for serialization
  
             beginIp65504D78TferNoL = getStartOffset() + 126;	// set offset for serialization
  
  
             beginIp65504D79TferRvS = getStartOffset() + 132;	// set offset for serialization
  
             beginIp65504D79TferRcL = getStartOffset() + 134;	// set offset for serialization
  
  
             beginIp65504D80InqNbrS = getStartOffset() + 140;	// set offset for serialization
  
             beginIp65504D80InqNbrL = getStartOffset() + 142;	// set offset for serialization
  
  
             beginIp65504D81AuthNoS = getStartOffset() + 148;	// set offset for serialization
  
             beginIp65504D81AuthNoL = getStartOffset() + 150;	// set offset for serialization
  
  
             beginIp65504D82InqRevS = getStartOffset() + 156;	// set offset for serialization
  
             beginIp65504D82InqRevL = getStartOffset() + 158;	// set offset for serialization
  
  
             beginIp65504D83PymtNoS = getStartOffset() + 164;	// set offset for serialization
  
             beginIp65504D83PymtNoL = getStartOffset() + 166;	// set offset for serialization
  
  
             beginIp65504D84PymtRvS = getStartOffset() + 172;	// set offset for serialization
  
             beginIp65504D84PymtRvL = getStartOffset() + 174;	// set offset for serialization
  
  
             beginIp65504D85FeeColS = getStartOffset() + 180;	// set offset for serialization
  
             beginIp65504D85FeeColL = getStartOffset() + 182;	// set offset for serialization
  
  
             beginIp65504D86CrAmtsS = getStartOffset() + 188;	// set offset for serialization
  
             beginIp65504D86CrAmtsL = getStartOffset() + 190;	// set offset for serialization
  
  
             beginIp65504D87CrRevrS = getStartOffset() + 196;	// set offset for serialization
  
             beginIp65504D87CrRevrL = getStartOffset() + 198;	// set offset for serialization
  
  
             beginIp65504D88DbAmtsS = getStartOffset() + 204;	// set offset for serialization
  
             beginIp65504D88DbAmtsL = getStartOffset() + 206;	// set offset for serialization
  
  
             beginIp65504D89DbRevrS = getStartOffset() + 212;	// set offset for serialization
  
             beginIp65504D89DbRevrL = getStartOffset() + 214;	// set offset for serialization
  
  
             beginIp65504D90AuthRvS = getStartOffset() + 220;	// set offset for serialization
  
             beginIp65504D90AuthRvL = getStartOffset() + 222;	// set offset for serialization
  
  
             beginIp65504D91TrxDccS = getStartOffset() + 228;	// set offset for serialization
  
             beginIp65504D91TrxDccL = getStartOffset() + 230;	// set offset for serialization
  
  
             beginIp65504D92TrxOccS = getStartOffset() + 236;	// set offset for serialization
  
             beginIp65504D92TrxOccL = getStartOffset() + 238;	// set offset for serialization
  
  
             beginIp65504D93TrxDidS = getStartOffset() + 244;	// set offset for serialization
  
             beginIp65504D93TrxDidL = getStartOffset() + 246;	// set offset for serialization
  
  
	   /*  end of offset */
	}
         int localIp65504D63TrxCycSCounter = -1;
         public boolean isIp65504D63TrxCycSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504D63TrxCycSCounter != sharedCounter;
            localIp65504D63TrxCycSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_D_63_TRX_CYC_S_LEN = 2;
  	/**
	 * serializeIp65504D63TrxCycS
	 */
	protected void serializeIp65504D63TrxCycS(short ip65504D63TrxCycS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504D63TrxCycS,IP_65504_D_63_TRX_CYC_S_LEN)
                  ,beginIp65504D63TrxCycS
                  ,IP_65504_D_63_TRX_CYC_S_LEN
                 );
            localIp65504D63TrxCycSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504D63TrxCycSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504D63TrxCycS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504D63TrxCycS() {	 
			return (getShort(beginIp65504D63TrxCycS));
   	}
         int localIp65504D63TrxCycLCounter = -1;
         public boolean isIp65504D63TrxCycLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504D63TrxCycLCounter != sharedCounter;
            localIp65504D63TrxCycLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_D_63_TRX_CYC_L_LEN = 2;
  	/**
	 * serializeIp65504D63TrxCycL
	 */
	protected void serializeIp65504D63TrxCycL(short ip65504D63TrxCycL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504D63TrxCycL,IP_65504_D_63_TRX_CYC_L_LEN)
                  ,beginIp65504D63TrxCycL
                  ,IP_65504_D_63_TRX_CYC_L_LEN
                 );
            localIp65504D63TrxCycLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504D63TrxCycLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504D63TrxCycL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504D63TrxCycL() {	 
			return (getShort(beginIp65504D63TrxCycL));
   	}
         int localIp65504D64MacCodSCounter = -1;
         public boolean isIp65504D64MacCodSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504D64MacCodSCounter != sharedCounter;
            localIp65504D64MacCodSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_D_64_MAC_COD_S_LEN = 2;
  	/**
	 * serializeIp65504D64MacCodS
	 */
	protected void serializeIp65504D64MacCodS(short ip65504D64MacCodS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504D64MacCodS,IP_65504_D_64_MAC_COD_S_LEN)
                  ,beginIp65504D64MacCodS
                  ,IP_65504_D_64_MAC_COD_S_LEN
                 );
            localIp65504D64MacCodSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504D64MacCodSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504D64MacCodS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504D64MacCodS() {	 
			return (getShort(beginIp65504D64MacCodS));
   	}
         int localIp65504D64MacCodLCounter = -1;
         public boolean isIp65504D64MacCodLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504D64MacCodLCounter != sharedCounter;
            localIp65504D64MacCodLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_D_64_MAC_COD_L_LEN = 2;
  	/**
	 * serializeIp65504D64MacCodL
	 */
	protected void serializeIp65504D64MacCodL(short ip65504D64MacCodL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504D64MacCodL,IP_65504_D_64_MAC_COD_L_LEN)
                  ,beginIp65504D64MacCodL
                  ,IP_65504_D_64_MAC_COD_L_LEN
                 );
            localIp65504D64MacCodLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504D64MacCodLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504D64MacCodL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504D64MacCodL() {	 
			return (getShort(beginIp65504D64MacCodL));
   	}
         int localIp65504D65ReservdSCounter = -1;
         public boolean isIp65504D65ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504D65ReservdSCounter != sharedCounter;
            localIp65504D65ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_D_65_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504D65ReservdS
	 */
	protected void serializeIp65504D65ReservdS(short ip65504D65ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504D65ReservdS,IP_65504_D_65_RESERVD_S_LEN)
                  ,beginIp65504D65ReservdS
                  ,IP_65504_D_65_RESERVD_S_LEN
                 );
            localIp65504D65ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504D65ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504D65ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504D65ReservdS() {	 
			return (getShort(beginIp65504D65ReservdS));
   	}
         int localIp65504D65ReservdLCounter = -1;
         public boolean isIp65504D65ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504D65ReservdLCounter != sharedCounter;
            localIp65504D65ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_D_65_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504D65ReservdL
	 */
	protected void serializeIp65504D65ReservdL(short ip65504D65ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504D65ReservdL,IP_65504_D_65_RESERVD_L_LEN)
                  ,beginIp65504D65ReservdL
                  ,IP_65504_D_65_RESERVD_L_LEN
                 );
            localIp65504D65ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504D65ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504D65ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504D65ReservdL() {	 
			return (getShort(beginIp65504D65ReservdL));
   	}
         int localIp65504D66AmtFeeSCounter = -1;
         public boolean isIp65504D66AmtFeeSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504D66AmtFeeSCounter != sharedCounter;
            localIp65504D66AmtFeeSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_D_66_AMT_FEE_S_LEN = 2;
  	/**
	 * serializeIp65504D66AmtFeeS
	 */
	protected void serializeIp65504D66AmtFeeS(short ip65504D66AmtFeeS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504D66AmtFeeS,IP_65504_D_66_AMT_FEE_S_LEN)
                  ,beginIp65504D66AmtFeeS
                  ,IP_65504_D_66_AMT_FEE_S_LEN
                 );
            localIp65504D66AmtFeeSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504D66AmtFeeSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504D66AmtFeeS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504D66AmtFeeS() {	 
			return (getShort(beginIp65504D66AmtFeeS));
   	}
         int localIp65504D66AmtFeeLCounter = -1;
         public boolean isIp65504D66AmtFeeLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504D66AmtFeeLCounter != sharedCounter;
            localIp65504D66AmtFeeLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_D_66_AMT_FEE_L_LEN = 2;
  	/**
	 * serializeIp65504D66AmtFeeL
	 */
	protected void serializeIp65504D66AmtFeeL(short ip65504D66AmtFeeL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504D66AmtFeeL,IP_65504_D_66_AMT_FEE_L_LEN)
                  ,beginIp65504D66AmtFeeL
                  ,IP_65504_D_66_AMT_FEE_L_LEN
                 );
            localIp65504D66AmtFeeLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504D66AmtFeeLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504D66AmtFeeL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504D66AmtFeeL() {	 
			return (getShort(beginIp65504D66AmtFeeL));
   	}
         int localIp65504D67ExtPaySCounter = -1;
         public boolean isIp65504D67ExtPaySModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504D67ExtPaySCounter != sharedCounter;
            localIp65504D67ExtPaySCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_D_67_EXT_PAY_S_LEN = 2;
  	/**
	 * serializeIp65504D67ExtPayS
	 */
	protected void serializeIp65504D67ExtPayS(short ip65504D67ExtPayS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504D67ExtPayS,IP_65504_D_67_EXT_PAY_S_LEN)
                  ,beginIp65504D67ExtPayS
                  ,IP_65504_D_67_EXT_PAY_S_LEN
                 );
            localIp65504D67ExtPaySCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504D67ExtPaySMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504D67ExtPayS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504D67ExtPayS() {	 
			return (getShort(beginIp65504D67ExtPayS));
   	}
         int localIp65504D67ExtPayLCounter = -1;
         public boolean isIp65504D67ExtPayLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504D67ExtPayLCounter != sharedCounter;
            localIp65504D67ExtPayLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_D_67_EXT_PAY_L_LEN = 2;
  	/**
	 * serializeIp65504D67ExtPayL
	 */
	protected void serializeIp65504D67ExtPayL(short ip65504D67ExtPayL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504D67ExtPayL,IP_65504_D_67_EXT_PAY_L_LEN)
                  ,beginIp65504D67ExtPayL
                  ,IP_65504_D_67_EXT_PAY_L_LEN
                 );
            localIp65504D67ExtPayLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504D67ExtPayLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504D67ExtPayL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504D67ExtPayL() {	 
			return (getShort(beginIp65504D67ExtPayL));
   	}
         int localIp65504D68RecvCcSCounter = -1;
         public boolean isIp65504D68RecvCcSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504D68RecvCcSCounter != sharedCounter;
            localIp65504D68RecvCcSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_D_68_RECV_CC_S_LEN = 2;
  	/**
	 * serializeIp65504D68RecvCcS
	 */
	protected void serializeIp65504D68RecvCcS(short ip65504D68RecvCcS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504D68RecvCcS,IP_65504_D_68_RECV_CC_S_LEN)
                  ,beginIp65504D68RecvCcS
                  ,IP_65504_D_68_RECV_CC_S_LEN
                 );
            localIp65504D68RecvCcSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504D68RecvCcSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504D68RecvCcS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504D68RecvCcS() {	 
			return (getShort(beginIp65504D68RecvCcS));
   	}
         int localIp65504D68RecvCcLCounter = -1;
         public boolean isIp65504D68RecvCcLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504D68RecvCcLCounter != sharedCounter;
            localIp65504D68RecvCcLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_D_68_RECV_CC_L_LEN = 2;
  	/**
	 * serializeIp65504D68RecvCcL
	 */
	protected void serializeIp65504D68RecvCcL(short ip65504D68RecvCcL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504D68RecvCcL,IP_65504_D_68_RECV_CC_L_LEN)
                  ,beginIp65504D68RecvCcL
                  ,IP_65504_D_68_RECV_CC_L_LEN
                 );
            localIp65504D68RecvCcLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504D68RecvCcLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504D68RecvCcL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504D68RecvCcL() {	 
			return (getShort(beginIp65504D68RecvCcL));
   	}
         int localIp65504D69SetlCcSCounter = -1;
         public boolean isIp65504D69SetlCcSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504D69SetlCcSCounter != sharedCounter;
            localIp65504D69SetlCcSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_D_69_SETL_CC_S_LEN = 2;
  	/**
	 * serializeIp65504D69SetlCcS
	 */
	protected void serializeIp65504D69SetlCcS(short ip65504D69SetlCcS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504D69SetlCcS,IP_65504_D_69_SETL_CC_S_LEN)
                  ,beginIp65504D69SetlCcS
                  ,IP_65504_D_69_SETL_CC_S_LEN
                 );
            localIp65504D69SetlCcSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504D69SetlCcSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504D69SetlCcS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504D69SetlCcS() {	 
			return (getShort(beginIp65504D69SetlCcS));
   	}
         int localIp65504D69SetlCcLCounter = -1;
         public boolean isIp65504D69SetlCcLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504D69SetlCcLCounter != sharedCounter;
            localIp65504D69SetlCcLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_D_69_SETL_CC_L_LEN = 2;
  	/**
	 * serializeIp65504D69SetlCcL
	 */
	protected void serializeIp65504D69SetlCcL(short ip65504D69SetlCcL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504D69SetlCcL,IP_65504_D_69_SETL_CC_L_LEN)
                  ,beginIp65504D69SetlCcL
                  ,IP_65504_D_69_SETL_CC_L_LEN
                 );
            localIp65504D69SetlCcLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504D69SetlCcLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504D69SetlCcL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504D69SetlCcL() {	 
			return (getShort(beginIp65504D69SetlCcL));
   	}
         int localIp65504D70AuthCcSCounter = -1;
         public boolean isIp65504D70AuthCcSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504D70AuthCcSCounter != sharedCounter;
            localIp65504D70AuthCcSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_D_70_AUTH_CC_S_LEN = 2;
  	/**
	 * serializeIp65504D70AuthCcS
	 */
	protected void serializeIp65504D70AuthCcS(short ip65504D70AuthCcS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504D70AuthCcS,IP_65504_D_70_AUTH_CC_S_LEN)
                  ,beginIp65504D70AuthCcS
                  ,IP_65504_D_70_AUTH_CC_S_LEN
                 );
            localIp65504D70AuthCcSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504D70AuthCcSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504D70AuthCcS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504D70AuthCcS() {	 
			return (getShort(beginIp65504D70AuthCcS));
   	}
         int localIp65504D70AuthCcLCounter = -1;
         public boolean isIp65504D70AuthCcLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504D70AuthCcLCounter != sharedCounter;
            localIp65504D70AuthCcLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_D_70_AUTH_CC_L_LEN = 2;
  	/**
	 * serializeIp65504D70AuthCcL
	 */
	protected void serializeIp65504D70AuthCcL(short ip65504D70AuthCcL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504D70AuthCcL,IP_65504_D_70_AUTH_CC_L_LEN)
                  ,beginIp65504D70AuthCcL
                  ,IP_65504_D_70_AUTH_CC_L_LEN
                 );
            localIp65504D70AuthCcLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504D70AuthCcLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504D70AuthCcL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504D70AuthCcL() {	 
			return (getShort(beginIp65504D70AuthCcL));
   	}
         int localIp65504D71MsgNbrSCounter = -1;
         public boolean isIp65504D71MsgNbrSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504D71MsgNbrSCounter != sharedCounter;
            localIp65504D71MsgNbrSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_D_71_MSG_NBR_S_LEN = 2;
  	/**
	 * serializeIp65504D71MsgNbrS
	 */
	protected void serializeIp65504D71MsgNbrS(short ip65504D71MsgNbrS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504D71MsgNbrS,IP_65504_D_71_MSG_NBR_S_LEN)
                  ,beginIp65504D71MsgNbrS
                  ,IP_65504_D_71_MSG_NBR_S_LEN
                 );
            localIp65504D71MsgNbrSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504D71MsgNbrSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504D71MsgNbrS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504D71MsgNbrS() {	 
			return (getShort(beginIp65504D71MsgNbrS));
   	}
         int localIp65504D71MsgNbrLCounter = -1;
         public boolean isIp65504D71MsgNbrLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504D71MsgNbrLCounter != sharedCounter;
            localIp65504D71MsgNbrLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_D_71_MSG_NBR_L_LEN = 2;
  	/**
	 * serializeIp65504D71MsgNbrL
	 */
	protected void serializeIp65504D71MsgNbrL(short ip65504D71MsgNbrL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504D71MsgNbrL,IP_65504_D_71_MSG_NBR_L_LEN)
                  ,beginIp65504D71MsgNbrL
                  ,IP_65504_D_71_MSG_NBR_L_LEN
                 );
            localIp65504D71MsgNbrLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504D71MsgNbrLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504D71MsgNbrL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504D71MsgNbrL() {	 
			return (getShort(beginIp65504D71MsgNbrL));
   	}
         int localIp65504D72DataRdSCounter = -1;
         public boolean isIp65504D72DataRdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504D72DataRdSCounter != sharedCounter;
            localIp65504D72DataRdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_D_72_DATA_RD_S_LEN = 2;
  	/**
	 * serializeIp65504D72DataRdS
	 */
	protected void serializeIp65504D72DataRdS(short ip65504D72DataRdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504D72DataRdS,IP_65504_D_72_DATA_RD_S_LEN)
                  ,beginIp65504D72DataRdS
                  ,IP_65504_D_72_DATA_RD_S_LEN
                 );
            localIp65504D72DataRdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504D72DataRdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504D72DataRdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504D72DataRdS() {	 
			return (getShort(beginIp65504D72DataRdS));
   	}
         int localIp65504D72DataRdLCounter = -1;
         public boolean isIp65504D72DataRdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504D72DataRdLCounter != sharedCounter;
            localIp65504D72DataRdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_D_72_DATA_RD_L_LEN = 2;
  	/**
	 * serializeIp65504D72DataRdL
	 */
	protected void serializeIp65504D72DataRdL(short ip65504D72DataRdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504D72DataRdL,IP_65504_D_72_DATA_RD_L_LEN)
                  ,beginIp65504D72DataRdL
                  ,IP_65504_D_72_DATA_RD_L_LEN
                 );
            localIp65504D72DataRdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504D72DataRdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504D72DataRdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504D72DataRdL() {	 
			return (getShort(beginIp65504D72DataRdL));
   	}
         int localIp65504D73ActDteSCounter = -1;
         public boolean isIp65504D73ActDteSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504D73ActDteSCounter != sharedCounter;
            localIp65504D73ActDteSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_D_73_ACT_DTE_S_LEN = 2;
  	/**
	 * serializeIp65504D73ActDteS
	 */
	protected void serializeIp65504D73ActDteS(short ip65504D73ActDteS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504D73ActDteS,IP_65504_D_73_ACT_DTE_S_LEN)
                  ,beginIp65504D73ActDteS
                  ,IP_65504_D_73_ACT_DTE_S_LEN
                 );
            localIp65504D73ActDteSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504D73ActDteSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504D73ActDteS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504D73ActDteS() {	 
			return (getShort(beginIp65504D73ActDteS));
   	}
         int localIp65504D73ActDteLCounter = -1;
         public boolean isIp65504D73ActDteLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504D73ActDteLCounter != sharedCounter;
            localIp65504D73ActDteLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_D_73_ACT_DTE_L_LEN = 2;
  	/**
	 * serializeIp65504D73ActDteL
	 */
	protected void serializeIp65504D73ActDteL(short ip65504D73ActDteL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504D73ActDteL,IP_65504_D_73_ACT_DTE_L_LEN)
                  ,beginIp65504D73ActDteL
                  ,IP_65504_D_73_ACT_DTE_L_LEN
                 );
            localIp65504D73ActDteLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504D73ActDteLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504D73ActDteL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504D73ActDteL() {	 
			return (getShort(beginIp65504D73ActDteL));
   	}
         int localIp65504D74CrNmbrSCounter = -1;
         public boolean isIp65504D74CrNmbrSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504D74CrNmbrSCounter != sharedCounter;
            localIp65504D74CrNmbrSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_D_74_CR_NMBR_S_LEN = 2;
  	/**
	 * serializeIp65504D74CrNmbrS
	 */
	protected void serializeIp65504D74CrNmbrS(short ip65504D74CrNmbrS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504D74CrNmbrS,IP_65504_D_74_CR_NMBR_S_LEN)
                  ,beginIp65504D74CrNmbrS
                  ,IP_65504_D_74_CR_NMBR_S_LEN
                 );
            localIp65504D74CrNmbrSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504D74CrNmbrSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504D74CrNmbrS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504D74CrNmbrS() {	 
			return (getShort(beginIp65504D74CrNmbrS));
   	}
         int localIp65504D74CrNmbrLCounter = -1;
         public boolean isIp65504D74CrNmbrLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504D74CrNmbrLCounter != sharedCounter;
            localIp65504D74CrNmbrLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_D_74_CR_NMBR_L_LEN = 2;
  	/**
	 * serializeIp65504D74CrNmbrL
	 */
	protected void serializeIp65504D74CrNmbrL(short ip65504D74CrNmbrL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504D74CrNmbrL,IP_65504_D_74_CR_NMBR_L_LEN)
                  ,beginIp65504D74CrNmbrL
                  ,IP_65504_D_74_CR_NMBR_L_LEN
                 );
            localIp65504D74CrNmbrLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504D74CrNmbrLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504D74CrNmbrL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504D74CrNmbrL() {	 
			return (getShort(beginIp65504D74CrNmbrL));
   	}
         int localIp65504D75CrRevnSCounter = -1;
         public boolean isIp65504D75CrRevnSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504D75CrRevnSCounter != sharedCounter;
            localIp65504D75CrRevnSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_D_75_CR_REVN_S_LEN = 2;
  	/**
	 * serializeIp65504D75CrRevnS
	 */
	protected void serializeIp65504D75CrRevnS(short ip65504D75CrRevnS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504D75CrRevnS,IP_65504_D_75_CR_REVN_S_LEN)
                  ,beginIp65504D75CrRevnS
                  ,IP_65504_D_75_CR_REVN_S_LEN
                 );
            localIp65504D75CrRevnSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504D75CrRevnSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504D75CrRevnS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504D75CrRevnS() {	 
			return (getShort(beginIp65504D75CrRevnS));
   	}
         int localIp65504D75CrRevnLCounter = -1;
         public boolean isIp65504D75CrRevnLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504D75CrRevnLCounter != sharedCounter;
            localIp65504D75CrRevnLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_D_75_CR_REVN_L_LEN = 2;
  	/**
	 * serializeIp65504D75CrRevnL
	 */
	protected void serializeIp65504D75CrRevnL(short ip65504D75CrRevnL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504D75CrRevnL,IP_65504_D_75_CR_REVN_L_LEN)
                  ,beginIp65504D75CrRevnL
                  ,IP_65504_D_75_CR_REVN_L_LEN
                 );
            localIp65504D75CrRevnLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504D75CrRevnLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504D75CrRevnL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504D75CrRevnL() {	 
			return (getShort(beginIp65504D75CrRevnL));
   	}
         int localIp65504D76DbNmbrSCounter = -1;
         public boolean isIp65504D76DbNmbrSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504D76DbNmbrSCounter != sharedCounter;
            localIp65504D76DbNmbrSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_D_76_DB_NMBR_S_LEN = 2;
  	/**
	 * serializeIp65504D76DbNmbrS
	 */
	protected void serializeIp65504D76DbNmbrS(short ip65504D76DbNmbrS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504D76DbNmbrS,IP_65504_D_76_DB_NMBR_S_LEN)
                  ,beginIp65504D76DbNmbrS
                  ,IP_65504_D_76_DB_NMBR_S_LEN
                 );
            localIp65504D76DbNmbrSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504D76DbNmbrSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504D76DbNmbrS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504D76DbNmbrS() {	 
			return (getShort(beginIp65504D76DbNmbrS));
   	}
         int localIp65504D76DbNmbrLCounter = -1;
         public boolean isIp65504D76DbNmbrLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504D76DbNmbrLCounter != sharedCounter;
            localIp65504D76DbNmbrLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_D_76_DB_NMBR_L_LEN = 2;
  	/**
	 * serializeIp65504D76DbNmbrL
	 */
	protected void serializeIp65504D76DbNmbrL(short ip65504D76DbNmbrL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504D76DbNmbrL,IP_65504_D_76_DB_NMBR_L_LEN)
                  ,beginIp65504D76DbNmbrL
                  ,IP_65504_D_76_DB_NMBR_L_LEN
                 );
            localIp65504D76DbNmbrLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504D76DbNmbrLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504D76DbNmbrL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504D76DbNmbrL() {	 
			return (getShort(beginIp65504D76DbNmbrL));
   	}
         int localIp65504D77DbRevnSCounter = -1;
         public boolean isIp65504D77DbRevnSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504D77DbRevnSCounter != sharedCounter;
            localIp65504D77DbRevnSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_D_77_DB_REVN_S_LEN = 2;
  	/**
	 * serializeIp65504D77DbRevnS
	 */
	protected void serializeIp65504D77DbRevnS(short ip65504D77DbRevnS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504D77DbRevnS,IP_65504_D_77_DB_REVN_S_LEN)
                  ,beginIp65504D77DbRevnS
                  ,IP_65504_D_77_DB_REVN_S_LEN
                 );
            localIp65504D77DbRevnSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504D77DbRevnSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504D77DbRevnS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504D77DbRevnS() {	 
			return (getShort(beginIp65504D77DbRevnS));
   	}
         int localIp65504D77DbRevnLCounter = -1;
         public boolean isIp65504D77DbRevnLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504D77DbRevnLCounter != sharedCounter;
            localIp65504D77DbRevnLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_D_77_DB_REVN_L_LEN = 2;
  	/**
	 * serializeIp65504D77DbRevnL
	 */
	protected void serializeIp65504D77DbRevnL(short ip65504D77DbRevnL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504D77DbRevnL,IP_65504_D_77_DB_REVN_L_LEN)
                  ,beginIp65504D77DbRevnL
                  ,IP_65504_D_77_DB_REVN_L_LEN
                 );
            localIp65504D77DbRevnLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504D77DbRevnLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504D77DbRevnL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504D77DbRevnL() {	 
			return (getShort(beginIp65504D77DbRevnL));
   	}
         int localIp65504D78TferNoSCounter = -1;
         public boolean isIp65504D78TferNoSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504D78TferNoSCounter != sharedCounter;
            localIp65504D78TferNoSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_D_78_TFER_NO_S_LEN = 2;
  	/**
	 * serializeIp65504D78TferNoS
	 */
	protected void serializeIp65504D78TferNoS(short ip65504D78TferNoS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504D78TferNoS,IP_65504_D_78_TFER_NO_S_LEN)
                  ,beginIp65504D78TferNoS
                  ,IP_65504_D_78_TFER_NO_S_LEN
                 );
            localIp65504D78TferNoSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504D78TferNoSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504D78TferNoS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504D78TferNoS() {	 
			return (getShort(beginIp65504D78TferNoS));
   	}
         int localIp65504D78TferNoLCounter = -1;
         public boolean isIp65504D78TferNoLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504D78TferNoLCounter != sharedCounter;
            localIp65504D78TferNoLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_D_78_TFER_NO_L_LEN = 2;
  	/**
	 * serializeIp65504D78TferNoL
	 */
	protected void serializeIp65504D78TferNoL(short ip65504D78TferNoL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504D78TferNoL,IP_65504_D_78_TFER_NO_L_LEN)
                  ,beginIp65504D78TferNoL
                  ,IP_65504_D_78_TFER_NO_L_LEN
                 );
            localIp65504D78TferNoLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504D78TferNoLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504D78TferNoL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504D78TferNoL() {	 
			return (getShort(beginIp65504D78TferNoL));
   	}
         int localIp65504D79TferRvSCounter = -1;
         public boolean isIp65504D79TferRvSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504D79TferRvSCounter != sharedCounter;
            localIp65504D79TferRvSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_D_79_TFER_RV_S_LEN = 2;
  	/**
	 * serializeIp65504D79TferRvS
	 */
	protected void serializeIp65504D79TferRvS(short ip65504D79TferRvS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504D79TferRvS,IP_65504_D_79_TFER_RV_S_LEN)
                  ,beginIp65504D79TferRvS
                  ,IP_65504_D_79_TFER_RV_S_LEN
                 );
            localIp65504D79TferRvSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504D79TferRvSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504D79TferRvS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504D79TferRvS() {	 
			return (getShort(beginIp65504D79TferRvS));
   	}
         int localIp65504D79TferRcLCounter = -1;
         public boolean isIp65504D79TferRcLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504D79TferRcLCounter != sharedCounter;
            localIp65504D79TferRcLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_D_79_TFER_RC_L_LEN = 2;
  	/**
	 * serializeIp65504D79TferRcL
	 */
	protected void serializeIp65504D79TferRcL(short ip65504D79TferRcL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504D79TferRcL,IP_65504_D_79_TFER_RC_L_LEN)
                  ,beginIp65504D79TferRcL
                  ,IP_65504_D_79_TFER_RC_L_LEN
                 );
            localIp65504D79TferRcLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504D79TferRcLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504D79TferRcL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504D79TferRcL() {	 
			return (getShort(beginIp65504D79TferRcL));
   	}
         int localIp65504D80InqNbrSCounter = -1;
         public boolean isIp65504D80InqNbrSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504D80InqNbrSCounter != sharedCounter;
            localIp65504D80InqNbrSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_D_80_INQ_NBR_S_LEN = 2;
  	/**
	 * serializeIp65504D80InqNbrS
	 */
	protected void serializeIp65504D80InqNbrS(short ip65504D80InqNbrS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504D80InqNbrS,IP_65504_D_80_INQ_NBR_S_LEN)
                  ,beginIp65504D80InqNbrS
                  ,IP_65504_D_80_INQ_NBR_S_LEN
                 );
            localIp65504D80InqNbrSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504D80InqNbrSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504D80InqNbrS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504D80InqNbrS() {	 
			return (getShort(beginIp65504D80InqNbrS));
   	}
         int localIp65504D80InqNbrLCounter = -1;
         public boolean isIp65504D80InqNbrLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504D80InqNbrLCounter != sharedCounter;
            localIp65504D80InqNbrLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_D_80_INQ_NBR_L_LEN = 2;
  	/**
	 * serializeIp65504D80InqNbrL
	 */
	protected void serializeIp65504D80InqNbrL(short ip65504D80InqNbrL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504D80InqNbrL,IP_65504_D_80_INQ_NBR_L_LEN)
                  ,beginIp65504D80InqNbrL
                  ,IP_65504_D_80_INQ_NBR_L_LEN
                 );
            localIp65504D80InqNbrLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504D80InqNbrLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504D80InqNbrL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504D80InqNbrL() {	 
			return (getShort(beginIp65504D80InqNbrL));
   	}
         int localIp65504D81AuthNoSCounter = -1;
         public boolean isIp65504D81AuthNoSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504D81AuthNoSCounter != sharedCounter;
            localIp65504D81AuthNoSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_D_81_AUTH_NO_S_LEN = 2;
  	/**
	 * serializeIp65504D81AuthNoS
	 */
	protected void serializeIp65504D81AuthNoS(short ip65504D81AuthNoS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504D81AuthNoS,IP_65504_D_81_AUTH_NO_S_LEN)
                  ,beginIp65504D81AuthNoS
                  ,IP_65504_D_81_AUTH_NO_S_LEN
                 );
            localIp65504D81AuthNoSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504D81AuthNoSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504D81AuthNoS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504D81AuthNoS() {	 
			return (getShort(beginIp65504D81AuthNoS));
   	}
         int localIp65504D81AuthNoLCounter = -1;
         public boolean isIp65504D81AuthNoLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504D81AuthNoLCounter != sharedCounter;
            localIp65504D81AuthNoLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_D_81_AUTH_NO_L_LEN = 2;
  	/**
	 * serializeIp65504D81AuthNoL
	 */
	protected void serializeIp65504D81AuthNoL(short ip65504D81AuthNoL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504D81AuthNoL,IP_65504_D_81_AUTH_NO_L_LEN)
                  ,beginIp65504D81AuthNoL
                  ,IP_65504_D_81_AUTH_NO_L_LEN
                 );
            localIp65504D81AuthNoLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504D81AuthNoLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504D81AuthNoL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504D81AuthNoL() {	 
			return (getShort(beginIp65504D81AuthNoL));
   	}
         int localIp65504D82InqRevSCounter = -1;
         public boolean isIp65504D82InqRevSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504D82InqRevSCounter != sharedCounter;
            localIp65504D82InqRevSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_D_82_INQ_REV_S_LEN = 2;
  	/**
	 * serializeIp65504D82InqRevS
	 */
	protected void serializeIp65504D82InqRevS(short ip65504D82InqRevS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504D82InqRevS,IP_65504_D_82_INQ_REV_S_LEN)
                  ,beginIp65504D82InqRevS
                  ,IP_65504_D_82_INQ_REV_S_LEN
                 );
            localIp65504D82InqRevSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504D82InqRevSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504D82InqRevS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504D82InqRevS() {	 
			return (getShort(beginIp65504D82InqRevS));
   	}
         int localIp65504D82InqRevLCounter = -1;
         public boolean isIp65504D82InqRevLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504D82InqRevLCounter != sharedCounter;
            localIp65504D82InqRevLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_D_82_INQ_REV_L_LEN = 2;
  	/**
	 * serializeIp65504D82InqRevL
	 */
	protected void serializeIp65504D82InqRevL(short ip65504D82InqRevL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504D82InqRevL,IP_65504_D_82_INQ_REV_L_LEN)
                  ,beginIp65504D82InqRevL
                  ,IP_65504_D_82_INQ_REV_L_LEN
                 );
            localIp65504D82InqRevLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504D82InqRevLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504D82InqRevL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504D82InqRevL() {	 
			return (getShort(beginIp65504D82InqRevL));
   	}
         int localIp65504D83PymtNoSCounter = -1;
         public boolean isIp65504D83PymtNoSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504D83PymtNoSCounter != sharedCounter;
            localIp65504D83PymtNoSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_D_83_PYMT_NO_S_LEN = 2;
  	/**
	 * serializeIp65504D83PymtNoS
	 */
	protected void serializeIp65504D83PymtNoS(short ip65504D83PymtNoS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504D83PymtNoS,IP_65504_D_83_PYMT_NO_S_LEN)
                  ,beginIp65504D83PymtNoS
                  ,IP_65504_D_83_PYMT_NO_S_LEN
                 );
            localIp65504D83PymtNoSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504D83PymtNoSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504D83PymtNoS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504D83PymtNoS() {	 
			return (getShort(beginIp65504D83PymtNoS));
   	}
         int localIp65504D83PymtNoLCounter = -1;
         public boolean isIp65504D83PymtNoLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504D83PymtNoLCounter != sharedCounter;
            localIp65504D83PymtNoLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_D_83_PYMT_NO_L_LEN = 2;
  	/**
	 * serializeIp65504D83PymtNoL
	 */
	protected void serializeIp65504D83PymtNoL(short ip65504D83PymtNoL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504D83PymtNoL,IP_65504_D_83_PYMT_NO_L_LEN)
                  ,beginIp65504D83PymtNoL
                  ,IP_65504_D_83_PYMT_NO_L_LEN
                 );
            localIp65504D83PymtNoLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504D83PymtNoLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504D83PymtNoL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504D83PymtNoL() {	 
			return (getShort(beginIp65504D83PymtNoL));
   	}
         int localIp65504D84PymtRvSCounter = -1;
         public boolean isIp65504D84PymtRvSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504D84PymtRvSCounter != sharedCounter;
            localIp65504D84PymtRvSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_D_84_PYMT_RV_S_LEN = 2;
  	/**
	 * serializeIp65504D84PymtRvS
	 */
	protected void serializeIp65504D84PymtRvS(short ip65504D84PymtRvS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504D84PymtRvS,IP_65504_D_84_PYMT_RV_S_LEN)
                  ,beginIp65504D84PymtRvS
                  ,IP_65504_D_84_PYMT_RV_S_LEN
                 );
            localIp65504D84PymtRvSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504D84PymtRvSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504D84PymtRvS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504D84PymtRvS() {	 
			return (getShort(beginIp65504D84PymtRvS));
   	}
         int localIp65504D84PymtRvLCounter = -1;
         public boolean isIp65504D84PymtRvLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504D84PymtRvLCounter != sharedCounter;
            localIp65504D84PymtRvLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_D_84_PYMT_RV_L_LEN = 2;
  	/**
	 * serializeIp65504D84PymtRvL
	 */
	protected void serializeIp65504D84PymtRvL(short ip65504D84PymtRvL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504D84PymtRvL,IP_65504_D_84_PYMT_RV_L_LEN)
                  ,beginIp65504D84PymtRvL
                  ,IP_65504_D_84_PYMT_RV_L_LEN
                 );
            localIp65504D84PymtRvLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504D84PymtRvLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504D84PymtRvL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504D84PymtRvL() {	 
			return (getShort(beginIp65504D84PymtRvL));
   	}
         int localIp65504D85FeeColSCounter = -1;
         public boolean isIp65504D85FeeColSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504D85FeeColSCounter != sharedCounter;
            localIp65504D85FeeColSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_D_85_FEE_COL_S_LEN = 2;
  	/**
	 * serializeIp65504D85FeeColS
	 */
	protected void serializeIp65504D85FeeColS(short ip65504D85FeeColS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504D85FeeColS,IP_65504_D_85_FEE_COL_S_LEN)
                  ,beginIp65504D85FeeColS
                  ,IP_65504_D_85_FEE_COL_S_LEN
                 );
            localIp65504D85FeeColSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504D85FeeColSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504D85FeeColS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504D85FeeColS() {	 
			return (getShort(beginIp65504D85FeeColS));
   	}
         int localIp65504D85FeeColLCounter = -1;
         public boolean isIp65504D85FeeColLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504D85FeeColLCounter != sharedCounter;
            localIp65504D85FeeColLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_D_85_FEE_COL_L_LEN = 2;
  	/**
	 * serializeIp65504D85FeeColL
	 */
	protected void serializeIp65504D85FeeColL(short ip65504D85FeeColL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504D85FeeColL,IP_65504_D_85_FEE_COL_L_LEN)
                  ,beginIp65504D85FeeColL
                  ,IP_65504_D_85_FEE_COL_L_LEN
                 );
            localIp65504D85FeeColLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504D85FeeColLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504D85FeeColL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504D85FeeColL() {	 
			return (getShort(beginIp65504D85FeeColL));
   	}
         int localIp65504D86CrAmtsSCounter = -1;
         public boolean isIp65504D86CrAmtsSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504D86CrAmtsSCounter != sharedCounter;
            localIp65504D86CrAmtsSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_D_86_CR_AMTS_S_LEN = 2;
  	/**
	 * serializeIp65504D86CrAmtsS
	 */
	protected void serializeIp65504D86CrAmtsS(short ip65504D86CrAmtsS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504D86CrAmtsS,IP_65504_D_86_CR_AMTS_S_LEN)
                  ,beginIp65504D86CrAmtsS
                  ,IP_65504_D_86_CR_AMTS_S_LEN
                 );
            localIp65504D86CrAmtsSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504D86CrAmtsSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504D86CrAmtsS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504D86CrAmtsS() {	 
			return (getShort(beginIp65504D86CrAmtsS));
   	}
         int localIp65504D86CrAmtsLCounter = -1;
         public boolean isIp65504D86CrAmtsLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504D86CrAmtsLCounter != sharedCounter;
            localIp65504D86CrAmtsLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_D_86_CR_AMTS_L_LEN = 2;
  	/**
	 * serializeIp65504D86CrAmtsL
	 */
	protected void serializeIp65504D86CrAmtsL(short ip65504D86CrAmtsL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504D86CrAmtsL,IP_65504_D_86_CR_AMTS_L_LEN)
                  ,beginIp65504D86CrAmtsL
                  ,IP_65504_D_86_CR_AMTS_L_LEN
                 );
            localIp65504D86CrAmtsLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504D86CrAmtsLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504D86CrAmtsL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504D86CrAmtsL() {	 
			return (getShort(beginIp65504D86CrAmtsL));
   	}
         int localIp65504D87CrRevrSCounter = -1;
         public boolean isIp65504D87CrRevrSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504D87CrRevrSCounter != sharedCounter;
            localIp65504D87CrRevrSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_D_87_CR_REVR_S_LEN = 2;
  	/**
	 * serializeIp65504D87CrRevrS
	 */
	protected void serializeIp65504D87CrRevrS(short ip65504D87CrRevrS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504D87CrRevrS,IP_65504_D_87_CR_REVR_S_LEN)
                  ,beginIp65504D87CrRevrS
                  ,IP_65504_D_87_CR_REVR_S_LEN
                 );
            localIp65504D87CrRevrSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504D87CrRevrSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504D87CrRevrS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504D87CrRevrS() {	 
			return (getShort(beginIp65504D87CrRevrS));
   	}
         int localIp65504D87CrRevrLCounter = -1;
         public boolean isIp65504D87CrRevrLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504D87CrRevrLCounter != sharedCounter;
            localIp65504D87CrRevrLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_D_87_CR_REVR_L_LEN = 2;
  	/**
	 * serializeIp65504D87CrRevrL
	 */
	protected void serializeIp65504D87CrRevrL(short ip65504D87CrRevrL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504D87CrRevrL,IP_65504_D_87_CR_REVR_L_LEN)
                  ,beginIp65504D87CrRevrL
                  ,IP_65504_D_87_CR_REVR_L_LEN
                 );
            localIp65504D87CrRevrLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504D87CrRevrLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504D87CrRevrL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504D87CrRevrL() {	 
			return (getShort(beginIp65504D87CrRevrL));
   	}
         int localIp65504D88DbAmtsSCounter = -1;
         public boolean isIp65504D88DbAmtsSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504D88DbAmtsSCounter != sharedCounter;
            localIp65504D88DbAmtsSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_D_88_DB_AMTS_S_LEN = 2;
  	/**
	 * serializeIp65504D88DbAmtsS
	 */
	protected void serializeIp65504D88DbAmtsS(short ip65504D88DbAmtsS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504D88DbAmtsS,IP_65504_D_88_DB_AMTS_S_LEN)
                  ,beginIp65504D88DbAmtsS
                  ,IP_65504_D_88_DB_AMTS_S_LEN
                 );
            localIp65504D88DbAmtsSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504D88DbAmtsSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504D88DbAmtsS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504D88DbAmtsS() {	 
			return (getShort(beginIp65504D88DbAmtsS));
   	}
         int localIp65504D88DbAmtsLCounter = -1;
         public boolean isIp65504D88DbAmtsLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504D88DbAmtsLCounter != sharedCounter;
            localIp65504D88DbAmtsLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_D_88_DB_AMTS_L_LEN = 2;
  	/**
	 * serializeIp65504D88DbAmtsL
	 */
	protected void serializeIp65504D88DbAmtsL(short ip65504D88DbAmtsL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504D88DbAmtsL,IP_65504_D_88_DB_AMTS_L_LEN)
                  ,beginIp65504D88DbAmtsL
                  ,IP_65504_D_88_DB_AMTS_L_LEN
                 );
            localIp65504D88DbAmtsLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504D88DbAmtsLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504D88DbAmtsL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504D88DbAmtsL() {	 
			return (getShort(beginIp65504D88DbAmtsL));
   	}
         int localIp65504D89DbRevrSCounter = -1;
         public boolean isIp65504D89DbRevrSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504D89DbRevrSCounter != sharedCounter;
            localIp65504D89DbRevrSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_D_89_DB_REVR_S_LEN = 2;
  	/**
	 * serializeIp65504D89DbRevrS
	 */
	protected void serializeIp65504D89DbRevrS(short ip65504D89DbRevrS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504D89DbRevrS,IP_65504_D_89_DB_REVR_S_LEN)
                  ,beginIp65504D89DbRevrS
                  ,IP_65504_D_89_DB_REVR_S_LEN
                 );
            localIp65504D89DbRevrSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504D89DbRevrSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504D89DbRevrS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504D89DbRevrS() {	 
			return (getShort(beginIp65504D89DbRevrS));
   	}
         int localIp65504D89DbRevrLCounter = -1;
         public boolean isIp65504D89DbRevrLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504D89DbRevrLCounter != sharedCounter;
            localIp65504D89DbRevrLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_D_89_DB_REVR_L_LEN = 2;
  	/**
	 * serializeIp65504D89DbRevrL
	 */
	protected void serializeIp65504D89DbRevrL(short ip65504D89DbRevrL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504D89DbRevrL,IP_65504_D_89_DB_REVR_L_LEN)
                  ,beginIp65504D89DbRevrL
                  ,IP_65504_D_89_DB_REVR_L_LEN
                 );
            localIp65504D89DbRevrLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504D89DbRevrLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504D89DbRevrL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504D89DbRevrL() {	 
			return (getShort(beginIp65504D89DbRevrL));
   	}
         int localIp65504D90AuthRvSCounter = -1;
         public boolean isIp65504D90AuthRvSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504D90AuthRvSCounter != sharedCounter;
            localIp65504D90AuthRvSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_D_90_AUTH_RV_S_LEN = 2;
  	/**
	 * serializeIp65504D90AuthRvS
	 */
	protected void serializeIp65504D90AuthRvS(short ip65504D90AuthRvS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504D90AuthRvS,IP_65504_D_90_AUTH_RV_S_LEN)
                  ,beginIp65504D90AuthRvS
                  ,IP_65504_D_90_AUTH_RV_S_LEN
                 );
            localIp65504D90AuthRvSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504D90AuthRvSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504D90AuthRvS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504D90AuthRvS() {	 
			return (getShort(beginIp65504D90AuthRvS));
   	}
         int localIp65504D90AuthRvLCounter = -1;
         public boolean isIp65504D90AuthRvLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504D90AuthRvLCounter != sharedCounter;
            localIp65504D90AuthRvLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_D_90_AUTH_RV_L_LEN = 2;
  	/**
	 * serializeIp65504D90AuthRvL
	 */
	protected void serializeIp65504D90AuthRvL(short ip65504D90AuthRvL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504D90AuthRvL,IP_65504_D_90_AUTH_RV_L_LEN)
                  ,beginIp65504D90AuthRvL
                  ,IP_65504_D_90_AUTH_RV_L_LEN
                 );
            localIp65504D90AuthRvLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504D90AuthRvLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504D90AuthRvL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504D90AuthRvL() {	 
			return (getShort(beginIp65504D90AuthRvL));
   	}
         int localIp65504D91TrxDccSCounter = -1;
         public boolean isIp65504D91TrxDccSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504D91TrxDccSCounter != sharedCounter;
            localIp65504D91TrxDccSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_D_91_TRX_DCC_S_LEN = 2;
  	/**
	 * serializeIp65504D91TrxDccS
	 */
	protected void serializeIp65504D91TrxDccS(short ip65504D91TrxDccS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504D91TrxDccS,IP_65504_D_91_TRX_DCC_S_LEN)
                  ,beginIp65504D91TrxDccS
                  ,IP_65504_D_91_TRX_DCC_S_LEN
                 );
            localIp65504D91TrxDccSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504D91TrxDccSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504D91TrxDccS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504D91TrxDccS() {	 
			return (getShort(beginIp65504D91TrxDccS));
   	}
         int localIp65504D91TrxDccLCounter = -1;
         public boolean isIp65504D91TrxDccLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504D91TrxDccLCounter != sharedCounter;
            localIp65504D91TrxDccLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_D_91_TRX_DCC_L_LEN = 2;
  	/**
	 * serializeIp65504D91TrxDccL
	 */
	protected void serializeIp65504D91TrxDccL(short ip65504D91TrxDccL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504D91TrxDccL,IP_65504_D_91_TRX_DCC_L_LEN)
                  ,beginIp65504D91TrxDccL
                  ,IP_65504_D_91_TRX_DCC_L_LEN
                 );
            localIp65504D91TrxDccLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504D91TrxDccLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504D91TrxDccL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504D91TrxDccL() {	 
			return (getShort(beginIp65504D91TrxDccL));
   	}
         int localIp65504D92TrxOccSCounter = -1;
         public boolean isIp65504D92TrxOccSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504D92TrxOccSCounter != sharedCounter;
            localIp65504D92TrxOccSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_D_92_TRX_OCC_S_LEN = 2;
  	/**
	 * serializeIp65504D92TrxOccS
	 */
	protected void serializeIp65504D92TrxOccS(short ip65504D92TrxOccS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504D92TrxOccS,IP_65504_D_92_TRX_OCC_S_LEN)
                  ,beginIp65504D92TrxOccS
                  ,IP_65504_D_92_TRX_OCC_S_LEN
                 );
            localIp65504D92TrxOccSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504D92TrxOccSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504D92TrxOccS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504D92TrxOccS() {	 
			return (getShort(beginIp65504D92TrxOccS));
   	}
         int localIp65504D92TrxOccLCounter = -1;
         public boolean isIp65504D92TrxOccLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504D92TrxOccLCounter != sharedCounter;
            localIp65504D92TrxOccLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_D_92_TRX_OCC_L_LEN = 2;
  	/**
	 * serializeIp65504D92TrxOccL
	 */
	protected void serializeIp65504D92TrxOccL(short ip65504D92TrxOccL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504D92TrxOccL,IP_65504_D_92_TRX_OCC_L_LEN)
                  ,beginIp65504D92TrxOccL
                  ,IP_65504_D_92_TRX_OCC_L_LEN
                 );
            localIp65504D92TrxOccLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504D92TrxOccLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504D92TrxOccL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504D92TrxOccL() {	 
			return (getShort(beginIp65504D92TrxOccL));
   	}
         int localIp65504D93TrxDidSCounter = -1;
         public boolean isIp65504D93TrxDidSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504D93TrxDidSCounter != sharedCounter;
            localIp65504D93TrxDidSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_D_93_TRX_DID_S_LEN = 2;
  	/**
	 * serializeIp65504D93TrxDidS
	 */
	protected void serializeIp65504D93TrxDidS(short ip65504D93TrxDidS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504D93TrxDidS,IP_65504_D_93_TRX_DID_S_LEN)
                  ,beginIp65504D93TrxDidS
                  ,IP_65504_D_93_TRX_DID_S_LEN
                 );
            localIp65504D93TrxDidSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504D93TrxDidSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504D93TrxDidS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504D93TrxDidS() {	 
			return (getShort(beginIp65504D93TrxDidS));
   	}
         int localIp65504D93TrxDidLCounter = -1;
         public boolean isIp65504D93TrxDidLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504D93TrxDidLCounter != sharedCounter;
            localIp65504D93TrxDidLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_D_93_TRX_DID_L_LEN = 2;
  	/**
	 * serializeIp65504D93TrxDidL
	 */
	protected void serializeIp65504D93TrxDidL(short ip65504D93TrxDidL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504D93TrxDidL,IP_65504_D_93_TRX_DID_L_LEN)
                  ,beginIp65504D93TrxDidL
                  ,IP_65504_D_93_TRX_DID_L_LEN
                 );
            localIp65504D93TrxDidLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504D93TrxDidLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504D93TrxDidL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504D93TrxDidL() {	 
			return (getShort(beginIp65504D93TrxDidL));
   	}




}
  
