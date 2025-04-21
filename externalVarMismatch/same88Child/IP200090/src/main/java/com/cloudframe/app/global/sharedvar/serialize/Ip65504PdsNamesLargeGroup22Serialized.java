package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip65504PdsNamesLargeGroup22Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:02. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip65504PdsNamesLargeGroup22Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip65504PdsNamesLargeGroup22Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_65504_PDS_NAMES_LARGE_GROUP_22_LENGTH = 248;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp65504P652TaxtypeS;
            protected  int beginIp65504P652TaxtypeL;
            protected  int beginIp65504P653TaxAmtS;
            protected  int beginIp65504P653TaxAmtL;
            protected  int beginIp65504P654DbcdInS;
            protected  int beginIp65504P654DbcdInL;
            protected  int beginIp65504P655ReservdS;
            protected  int beginIp65504P655ReservdL;
            protected  int beginIp65504P656AltTaxS;
            protected  int beginIp65504P656AltTaxL;
            protected  int beginIp65504P657ReservdS;
            protected  int beginIp65504P657ReservdL;
            protected  int beginIp65504P658ReservdS;
            protected  int beginIp65504P658ReservdL;
            protected  int beginIp65504P659ReservdS;
            protected  int beginIp65504P659ReservdL;
            protected  int beginIp65504P660ReservdS;
            protected  int beginIp65504P660ReservdL;
            protected  int beginIp65504P661ReservdS;
            protected  int beginIp65504P661ReservdL;
            protected  int beginIp65504P662ReservdS;
            protected  int beginIp65504P662ReservdL;
            protected  int beginIp65504P663FreefrmS;
            protected  int beginIp65504P663FreefrmL;
            protected  int beginIp65504P664ReservdS;
            protected  int beginIp65504P664ReservdL;
            protected  int beginIp65504P665ReservdS;
            protected  int beginIp65504P665ReservdL;
            protected  int beginIp65504P666ReservdS;
            protected  int beginIp65504P666ReservdL;
            protected  int beginIp65504P667ReservdS;
            protected  int beginIp65504P667ReservdL;
            protected  int beginIp65504P668ReservdS;
            protected  int beginIp65504P668ReservdL;
            protected  int beginIp65504P669ReservdS;
            protected  int beginIp65504P669ReservdL;
            protected  int beginIp65504P670PayNamIdS;
            protected  int beginIp65504P670PayNamIdL;
            protected  int beginIp65504P671DofReqS;
            protected  int beginIp65504P671DofReqL;
            protected  int beginIp65504P672RcptNamS;
            protected  int beginIp65504P672RcptNamL;
            protected  int beginIp65504P673DtRcptFundS;
            protected  int beginIp65504P673DtRcptFundL;
            protected  int beginIp65504P674AdlTrcRefNoS;
            protected  int beginIp65504P674AdlTrcRefNoL;
            protected  int beginIp65504P675AdlTrnsDescS;
            protected  int beginIp65504P675AdlTrnsDescL;
            protected  int beginIp65504P676CardAccVatnoS;
            protected  int beginIp65504P676CardAccVatnoL;
            protected  int beginIp65504P677CustVatNoS;
            protected  int beginIp65504P677CustVatNoL;
            protected  int beginIp65504P678UniqInvNoS;
            protected  int beginIp65504P678UniqInvNoL;
            protected  int beginIp65504P679CommodityCodeS;
            protected  int beginIp65504P679CommodityCodeL;
            protected  int beginIp65504P680AuthContNameS;
            protected  int beginIp65504P680AuthContNameL;
            protected  int beginIp65504P681AuthContPhonS;
            protected  int beginIp65504P681AuthContPhonL;
            protected  int beginIp65504P682TaxAmount3S;
            protected  int beginIp65504P682TaxAmount3L;
	
	/**
	* Constructor for Ip65504PdsNamesLargeGroup22Serialized
	**/
    public Ip65504PdsNamesLargeGroup22Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ip65504PdsNamesLargeGroup22Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip65504PdsNamesLargeGroup22Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ip65504PdsNamesLargeGroup22Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,5204); // serialize this field at offset 5204 by default 
    }
    
	/**
	* sets parent for this Ip65504PdsNamesLargeGroup22Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 5204 by default
    }    
	/**
	* initializes the field in Ip65504PdsNamesLargeGroup22Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_65504_PDS_NAMES_LARGE_GROUP_22_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp65504P652TaxtypeS = getStartOffset() + 4;	// set offset for serialization
  
             beginIp65504P652TaxtypeL = getStartOffset() + 6;	// set offset for serialization
  
  
             beginIp65504P653TaxAmtS = getStartOffset() + 12;	// set offset for serialization
  
             beginIp65504P653TaxAmtL = getStartOffset() + 14;	// set offset for serialization
  
  
             beginIp65504P654DbcdInS = getStartOffset() + 20;	// set offset for serialization
  
             beginIp65504P654DbcdInL = getStartOffset() + 22;	// set offset for serialization
  
  
             beginIp65504P655ReservdS = getStartOffset() + 28;	// set offset for serialization
  
             beginIp65504P655ReservdL = getStartOffset() + 30;	// set offset for serialization
  
  
             beginIp65504P656AltTaxS = getStartOffset() + 36;	// set offset for serialization
  
             beginIp65504P656AltTaxL = getStartOffset() + 38;	// set offset for serialization
  
  
             beginIp65504P657ReservdS = getStartOffset() + 44;	// set offset for serialization
  
             beginIp65504P657ReservdL = getStartOffset() + 46;	// set offset for serialization
  
  
             beginIp65504P658ReservdS = getStartOffset() + 52;	// set offset for serialization
  
             beginIp65504P658ReservdL = getStartOffset() + 54;	// set offset for serialization
  
  
             beginIp65504P659ReservdS = getStartOffset() + 60;	// set offset for serialization
  
             beginIp65504P659ReservdL = getStartOffset() + 62;	// set offset for serialization
  
  
             beginIp65504P660ReservdS = getStartOffset() + 68;	// set offset for serialization
  
             beginIp65504P660ReservdL = getStartOffset() + 70;	// set offset for serialization
  
  
             beginIp65504P661ReservdS = getStartOffset() + 76;	// set offset for serialization
  
             beginIp65504P661ReservdL = getStartOffset() + 78;	// set offset for serialization
  
  
             beginIp65504P662ReservdS = getStartOffset() + 84;	// set offset for serialization
  
             beginIp65504P662ReservdL = getStartOffset() + 86;	// set offset for serialization
  
  
             beginIp65504P663FreefrmS = getStartOffset() + 92;	// set offset for serialization
  
             beginIp65504P663FreefrmL = getStartOffset() + 94;	// set offset for serialization
  
  
             beginIp65504P664ReservdS = getStartOffset() + 100;	// set offset for serialization
  
             beginIp65504P664ReservdL = getStartOffset() + 102;	// set offset for serialization
  
  
             beginIp65504P665ReservdS = getStartOffset() + 108;	// set offset for serialization
  
             beginIp65504P665ReservdL = getStartOffset() + 110;	// set offset for serialization
  
  
             beginIp65504P666ReservdS = getStartOffset() + 116;	// set offset for serialization
  
             beginIp65504P666ReservdL = getStartOffset() + 118;	// set offset for serialization
  
  
             beginIp65504P667ReservdS = getStartOffset() + 124;	// set offset for serialization
  
             beginIp65504P667ReservdL = getStartOffset() + 126;	// set offset for serialization
  
  
             beginIp65504P668ReservdS = getStartOffset() + 132;	// set offset for serialization
  
             beginIp65504P668ReservdL = getStartOffset() + 134;	// set offset for serialization
  
  
             beginIp65504P669ReservdS = getStartOffset() + 140;	// set offset for serialization
  
             beginIp65504P669ReservdL = getStartOffset() + 142;	// set offset for serialization
  
  
             beginIp65504P670PayNamIdS = getStartOffset() + 148;	// set offset for serialization
  
             beginIp65504P670PayNamIdL = getStartOffset() + 150;	// set offset for serialization
  
  
             beginIp65504P671DofReqS = getStartOffset() + 156;	// set offset for serialization
  
             beginIp65504P671DofReqL = getStartOffset() + 158;	// set offset for serialization
  
  
             beginIp65504P672RcptNamS = getStartOffset() + 164;	// set offset for serialization
  
             beginIp65504P672RcptNamL = getStartOffset() + 166;	// set offset for serialization
  
  
             beginIp65504P673DtRcptFundS = getStartOffset() + 172;	// set offset for serialization
  
             beginIp65504P673DtRcptFundL = getStartOffset() + 174;	// set offset for serialization
  
  
             beginIp65504P674AdlTrcRefNoS = getStartOffset() + 180;	// set offset for serialization
  
             beginIp65504P674AdlTrcRefNoL = getStartOffset() + 182;	// set offset for serialization
  
  
             beginIp65504P675AdlTrnsDescS = getStartOffset() + 188;	// set offset for serialization
  
             beginIp65504P675AdlTrnsDescL = getStartOffset() + 190;	// set offset for serialization
  
  
             beginIp65504P676CardAccVatnoS = getStartOffset() + 196;	// set offset for serialization
  
             beginIp65504P676CardAccVatnoL = getStartOffset() + 198;	// set offset for serialization
  
  
             beginIp65504P677CustVatNoS = getStartOffset() + 204;	// set offset for serialization
  
             beginIp65504P677CustVatNoL = getStartOffset() + 206;	// set offset for serialization
  
  
             beginIp65504P678UniqInvNoS = getStartOffset() + 212;	// set offset for serialization
  
             beginIp65504P678UniqInvNoL = getStartOffset() + 214;	// set offset for serialization
  
  
             beginIp65504P679CommodityCodeS = getStartOffset() + 220;	// set offset for serialization
  
             beginIp65504P679CommodityCodeL = getStartOffset() + 222;	// set offset for serialization
  
  
             beginIp65504P680AuthContNameS = getStartOffset() + 228;	// set offset for serialization
  
             beginIp65504P680AuthContNameL = getStartOffset() + 230;	// set offset for serialization
  
  
             beginIp65504P681AuthContPhonS = getStartOffset() + 236;	// set offset for serialization
  
             beginIp65504P681AuthContPhonL = getStartOffset() + 238;	// set offset for serialization
  
  
             beginIp65504P682TaxAmount3S = getStartOffset() + 244;	// set offset for serialization
  
             beginIp65504P682TaxAmount3L = getStartOffset() + 246;	// set offset for serialization
  
  
	   /*  end of offset */
	}
         int localIp65504P652TaxtypeSCounter = -1;
         public boolean isIp65504P652TaxtypeSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P652TaxtypeSCounter != sharedCounter;
            localIp65504P652TaxtypeSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_652_TAXTYPE_S_LEN = 2;
  	/**
	 * serializeIp65504P652TaxtypeS
	 */
	protected void serializeIp65504P652TaxtypeS(short ip65504P652TaxtypeS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P652TaxtypeS,IP_65504_P_652_TAXTYPE_S_LEN)
                  ,beginIp65504P652TaxtypeS
                  ,IP_65504_P_652_TAXTYPE_S_LEN
                 );
            localIp65504P652TaxtypeSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P652TaxtypeSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P652TaxtypeS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P652TaxtypeS() {	 
			return (getShort(beginIp65504P652TaxtypeS));
   	}
         int localIp65504P652TaxtypeLCounter = -1;
         public boolean isIp65504P652TaxtypeLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P652TaxtypeLCounter != sharedCounter;
            localIp65504P652TaxtypeLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_652_TAXTYPE_L_LEN = 2;
  	/**
	 * serializeIp65504P652TaxtypeL
	 */
	protected void serializeIp65504P652TaxtypeL(short ip65504P652TaxtypeL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P652TaxtypeL,IP_65504_P_652_TAXTYPE_L_LEN)
                  ,beginIp65504P652TaxtypeL
                  ,IP_65504_P_652_TAXTYPE_L_LEN
                 );
            localIp65504P652TaxtypeLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P652TaxtypeLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P652TaxtypeL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P652TaxtypeL() {	 
			return (getShort(beginIp65504P652TaxtypeL));
   	}
         int localIp65504P653TaxAmtSCounter = -1;
         public boolean isIp65504P653TaxAmtSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P653TaxAmtSCounter != sharedCounter;
            localIp65504P653TaxAmtSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_653_TAX_AMT_S_LEN = 2;
  	/**
	 * serializeIp65504P653TaxAmtS
	 */
	protected void serializeIp65504P653TaxAmtS(short ip65504P653TaxAmtS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P653TaxAmtS,IP_65504_P_653_TAX_AMT_S_LEN)
                  ,beginIp65504P653TaxAmtS
                  ,IP_65504_P_653_TAX_AMT_S_LEN
                 );
            localIp65504P653TaxAmtSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P653TaxAmtSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P653TaxAmtS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P653TaxAmtS() {	 
			return (getShort(beginIp65504P653TaxAmtS));
   	}
         int localIp65504P653TaxAmtLCounter = -1;
         public boolean isIp65504P653TaxAmtLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P653TaxAmtLCounter != sharedCounter;
            localIp65504P653TaxAmtLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_653_TAX_AMT_L_LEN = 2;
  	/**
	 * serializeIp65504P653TaxAmtL
	 */
	protected void serializeIp65504P653TaxAmtL(short ip65504P653TaxAmtL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P653TaxAmtL,IP_65504_P_653_TAX_AMT_L_LEN)
                  ,beginIp65504P653TaxAmtL
                  ,IP_65504_P_653_TAX_AMT_L_LEN
                 );
            localIp65504P653TaxAmtLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P653TaxAmtLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P653TaxAmtL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P653TaxAmtL() {	 
			return (getShort(beginIp65504P653TaxAmtL));
   	}
         int localIp65504P654DbcdInSCounter = -1;
         public boolean isIp65504P654DbcdInSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P654DbcdInSCounter != sharedCounter;
            localIp65504P654DbcdInSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_654_DBCD_IN_S_LEN = 2;
  	/**
	 * serializeIp65504P654DbcdInS
	 */
	protected void serializeIp65504P654DbcdInS(short ip65504P654DbcdInS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P654DbcdInS,IP_65504_P_654_DBCD_IN_S_LEN)
                  ,beginIp65504P654DbcdInS
                  ,IP_65504_P_654_DBCD_IN_S_LEN
                 );
            localIp65504P654DbcdInSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P654DbcdInSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P654DbcdInS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P654DbcdInS() {	 
			return (getShort(beginIp65504P654DbcdInS));
   	}
         int localIp65504P654DbcdInLCounter = -1;
         public boolean isIp65504P654DbcdInLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P654DbcdInLCounter != sharedCounter;
            localIp65504P654DbcdInLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_654_DBCD_IN_L_LEN = 2;
  	/**
	 * serializeIp65504P654DbcdInL
	 */
	protected void serializeIp65504P654DbcdInL(short ip65504P654DbcdInL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P654DbcdInL,IP_65504_P_654_DBCD_IN_L_LEN)
                  ,beginIp65504P654DbcdInL
                  ,IP_65504_P_654_DBCD_IN_L_LEN
                 );
            localIp65504P654DbcdInLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P654DbcdInLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P654DbcdInL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P654DbcdInL() {	 
			return (getShort(beginIp65504P654DbcdInL));
   	}
         int localIp65504P655ReservdSCounter = -1;
         public boolean isIp65504P655ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P655ReservdSCounter != sharedCounter;
            localIp65504P655ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_655_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P655ReservdS
	 */
	protected void serializeIp65504P655ReservdS(short ip65504P655ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P655ReservdS,IP_65504_P_655_RESERVD_S_LEN)
                  ,beginIp65504P655ReservdS
                  ,IP_65504_P_655_RESERVD_S_LEN
                 );
            localIp65504P655ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P655ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P655ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P655ReservdS() {	 
			return (getShort(beginIp65504P655ReservdS));
   	}
         int localIp65504P655ReservdLCounter = -1;
         public boolean isIp65504P655ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P655ReservdLCounter != sharedCounter;
            localIp65504P655ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_655_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P655ReservdL
	 */
	protected void serializeIp65504P655ReservdL(short ip65504P655ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P655ReservdL,IP_65504_P_655_RESERVD_L_LEN)
                  ,beginIp65504P655ReservdL
                  ,IP_65504_P_655_RESERVD_L_LEN
                 );
            localIp65504P655ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P655ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P655ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P655ReservdL() {	 
			return (getShort(beginIp65504P655ReservdL));
   	}
         int localIp65504P656AltTaxSCounter = -1;
         public boolean isIp65504P656AltTaxSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P656AltTaxSCounter != sharedCounter;
            localIp65504P656AltTaxSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_656_ALT_TAX_S_LEN = 2;
  	/**
	 * serializeIp65504P656AltTaxS
	 */
	protected void serializeIp65504P656AltTaxS(short ip65504P656AltTaxS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P656AltTaxS,IP_65504_P_656_ALT_TAX_S_LEN)
                  ,beginIp65504P656AltTaxS
                  ,IP_65504_P_656_ALT_TAX_S_LEN
                 );
            localIp65504P656AltTaxSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P656AltTaxSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P656AltTaxS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P656AltTaxS() {	 
			return (getShort(beginIp65504P656AltTaxS));
   	}
         int localIp65504P656AltTaxLCounter = -1;
         public boolean isIp65504P656AltTaxLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P656AltTaxLCounter != sharedCounter;
            localIp65504P656AltTaxLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_656_ALT_TAX_L_LEN = 2;
  	/**
	 * serializeIp65504P656AltTaxL
	 */
	protected void serializeIp65504P656AltTaxL(short ip65504P656AltTaxL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P656AltTaxL,IP_65504_P_656_ALT_TAX_L_LEN)
                  ,beginIp65504P656AltTaxL
                  ,IP_65504_P_656_ALT_TAX_L_LEN
                 );
            localIp65504P656AltTaxLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P656AltTaxLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P656AltTaxL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P656AltTaxL() {	 
			return (getShort(beginIp65504P656AltTaxL));
   	}
         int localIp65504P657ReservdSCounter = -1;
         public boolean isIp65504P657ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P657ReservdSCounter != sharedCounter;
            localIp65504P657ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_657_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P657ReservdS
	 */
	protected void serializeIp65504P657ReservdS(short ip65504P657ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P657ReservdS,IP_65504_P_657_RESERVD_S_LEN)
                  ,beginIp65504P657ReservdS
                  ,IP_65504_P_657_RESERVD_S_LEN
                 );
            localIp65504P657ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P657ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P657ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P657ReservdS() {	 
			return (getShort(beginIp65504P657ReservdS));
   	}
         int localIp65504P657ReservdLCounter = -1;
         public boolean isIp65504P657ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P657ReservdLCounter != sharedCounter;
            localIp65504P657ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_657_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P657ReservdL
	 */
	protected void serializeIp65504P657ReservdL(short ip65504P657ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P657ReservdL,IP_65504_P_657_RESERVD_L_LEN)
                  ,beginIp65504P657ReservdL
                  ,IP_65504_P_657_RESERVD_L_LEN
                 );
            localIp65504P657ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P657ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P657ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P657ReservdL() {	 
			return (getShort(beginIp65504P657ReservdL));
   	}
         int localIp65504P658ReservdSCounter = -1;
         public boolean isIp65504P658ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P658ReservdSCounter != sharedCounter;
            localIp65504P658ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_658_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P658ReservdS
	 */
	protected void serializeIp65504P658ReservdS(short ip65504P658ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P658ReservdS,IP_65504_P_658_RESERVD_S_LEN)
                  ,beginIp65504P658ReservdS
                  ,IP_65504_P_658_RESERVD_S_LEN
                 );
            localIp65504P658ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P658ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P658ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P658ReservdS() {	 
			return (getShort(beginIp65504P658ReservdS));
   	}
         int localIp65504P658ReservdLCounter = -1;
         public boolean isIp65504P658ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P658ReservdLCounter != sharedCounter;
            localIp65504P658ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_658_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P658ReservdL
	 */
	protected void serializeIp65504P658ReservdL(short ip65504P658ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P658ReservdL,IP_65504_P_658_RESERVD_L_LEN)
                  ,beginIp65504P658ReservdL
                  ,IP_65504_P_658_RESERVD_L_LEN
                 );
            localIp65504P658ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P658ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P658ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P658ReservdL() {	 
			return (getShort(beginIp65504P658ReservdL));
   	}
         int localIp65504P659ReservdSCounter = -1;
         public boolean isIp65504P659ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P659ReservdSCounter != sharedCounter;
            localIp65504P659ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_659_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P659ReservdS
	 */
	protected void serializeIp65504P659ReservdS(short ip65504P659ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P659ReservdS,IP_65504_P_659_RESERVD_S_LEN)
                  ,beginIp65504P659ReservdS
                  ,IP_65504_P_659_RESERVD_S_LEN
                 );
            localIp65504P659ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P659ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P659ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P659ReservdS() {	 
			return (getShort(beginIp65504P659ReservdS));
   	}
         int localIp65504P659ReservdLCounter = -1;
         public boolean isIp65504P659ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P659ReservdLCounter != sharedCounter;
            localIp65504P659ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_659_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P659ReservdL
	 */
	protected void serializeIp65504P659ReservdL(short ip65504P659ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P659ReservdL,IP_65504_P_659_RESERVD_L_LEN)
                  ,beginIp65504P659ReservdL
                  ,IP_65504_P_659_RESERVD_L_LEN
                 );
            localIp65504P659ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P659ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P659ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P659ReservdL() {	 
			return (getShort(beginIp65504P659ReservdL));
   	}
         int localIp65504P660ReservdSCounter = -1;
         public boolean isIp65504P660ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P660ReservdSCounter != sharedCounter;
            localIp65504P660ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_660_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P660ReservdS
	 */
	protected void serializeIp65504P660ReservdS(short ip65504P660ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P660ReservdS,IP_65504_P_660_RESERVD_S_LEN)
                  ,beginIp65504P660ReservdS
                  ,IP_65504_P_660_RESERVD_S_LEN
                 );
            localIp65504P660ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P660ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P660ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P660ReservdS() {	 
			return (getShort(beginIp65504P660ReservdS));
   	}
         int localIp65504P660ReservdLCounter = -1;
         public boolean isIp65504P660ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P660ReservdLCounter != sharedCounter;
            localIp65504P660ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_660_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P660ReservdL
	 */
	protected void serializeIp65504P660ReservdL(short ip65504P660ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P660ReservdL,IP_65504_P_660_RESERVD_L_LEN)
                  ,beginIp65504P660ReservdL
                  ,IP_65504_P_660_RESERVD_L_LEN
                 );
            localIp65504P660ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P660ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P660ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P660ReservdL() {	 
			return (getShort(beginIp65504P660ReservdL));
   	}
         int localIp65504P661ReservdSCounter = -1;
         public boolean isIp65504P661ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P661ReservdSCounter != sharedCounter;
            localIp65504P661ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_661_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P661ReservdS
	 */
	protected void serializeIp65504P661ReservdS(short ip65504P661ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P661ReservdS,IP_65504_P_661_RESERVD_S_LEN)
                  ,beginIp65504P661ReservdS
                  ,IP_65504_P_661_RESERVD_S_LEN
                 );
            localIp65504P661ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P661ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P661ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P661ReservdS() {	 
			return (getShort(beginIp65504P661ReservdS));
   	}
         int localIp65504P661ReservdLCounter = -1;
         public boolean isIp65504P661ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P661ReservdLCounter != sharedCounter;
            localIp65504P661ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_661_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P661ReservdL
	 */
	protected void serializeIp65504P661ReservdL(short ip65504P661ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P661ReservdL,IP_65504_P_661_RESERVD_L_LEN)
                  ,beginIp65504P661ReservdL
                  ,IP_65504_P_661_RESERVD_L_LEN
                 );
            localIp65504P661ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P661ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P661ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P661ReservdL() {	 
			return (getShort(beginIp65504P661ReservdL));
   	}
         int localIp65504P662ReservdSCounter = -1;
         public boolean isIp65504P662ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P662ReservdSCounter != sharedCounter;
            localIp65504P662ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_662_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P662ReservdS
	 */
	protected void serializeIp65504P662ReservdS(short ip65504P662ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P662ReservdS,IP_65504_P_662_RESERVD_S_LEN)
                  ,beginIp65504P662ReservdS
                  ,IP_65504_P_662_RESERVD_S_LEN
                 );
            localIp65504P662ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P662ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P662ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P662ReservdS() {	 
			return (getShort(beginIp65504P662ReservdS));
   	}
         int localIp65504P662ReservdLCounter = -1;
         public boolean isIp65504P662ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P662ReservdLCounter != sharedCounter;
            localIp65504P662ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_662_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P662ReservdL
	 */
	protected void serializeIp65504P662ReservdL(short ip65504P662ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P662ReservdL,IP_65504_P_662_RESERVD_L_LEN)
                  ,beginIp65504P662ReservdL
                  ,IP_65504_P_662_RESERVD_L_LEN
                 );
            localIp65504P662ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P662ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P662ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P662ReservdL() {	 
			return (getShort(beginIp65504P662ReservdL));
   	}
         int localIp65504P663FreefrmSCounter = -1;
         public boolean isIp65504P663FreefrmSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P663FreefrmSCounter != sharedCounter;
            localIp65504P663FreefrmSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_663_FREEFRM_S_LEN = 2;
  	/**
	 * serializeIp65504P663FreefrmS
	 */
	protected void serializeIp65504P663FreefrmS(short ip65504P663FreefrmS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P663FreefrmS,IP_65504_P_663_FREEFRM_S_LEN)
                  ,beginIp65504P663FreefrmS
                  ,IP_65504_P_663_FREEFRM_S_LEN
                 );
            localIp65504P663FreefrmSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P663FreefrmSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P663FreefrmS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P663FreefrmS() {	 
			return (getShort(beginIp65504P663FreefrmS));
   	}
         int localIp65504P663FreefrmLCounter = -1;
         public boolean isIp65504P663FreefrmLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P663FreefrmLCounter != sharedCounter;
            localIp65504P663FreefrmLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_663_FREEFRM_L_LEN = 2;
  	/**
	 * serializeIp65504P663FreefrmL
	 */
	protected void serializeIp65504P663FreefrmL(short ip65504P663FreefrmL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P663FreefrmL,IP_65504_P_663_FREEFRM_L_LEN)
                  ,beginIp65504P663FreefrmL
                  ,IP_65504_P_663_FREEFRM_L_LEN
                 );
            localIp65504P663FreefrmLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P663FreefrmLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P663FreefrmL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P663FreefrmL() {	 
			return (getShort(beginIp65504P663FreefrmL));
   	}
         int localIp65504P664ReservdSCounter = -1;
         public boolean isIp65504P664ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P664ReservdSCounter != sharedCounter;
            localIp65504P664ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_664_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P664ReservdS
	 */
	protected void serializeIp65504P664ReservdS(short ip65504P664ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P664ReservdS,IP_65504_P_664_RESERVD_S_LEN)
                  ,beginIp65504P664ReservdS
                  ,IP_65504_P_664_RESERVD_S_LEN
                 );
            localIp65504P664ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P664ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P664ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P664ReservdS() {	 
			return (getShort(beginIp65504P664ReservdS));
   	}
         int localIp65504P664ReservdLCounter = -1;
         public boolean isIp65504P664ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P664ReservdLCounter != sharedCounter;
            localIp65504P664ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_664_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P664ReservdL
	 */
	protected void serializeIp65504P664ReservdL(short ip65504P664ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P664ReservdL,IP_65504_P_664_RESERVD_L_LEN)
                  ,beginIp65504P664ReservdL
                  ,IP_65504_P_664_RESERVD_L_LEN
                 );
            localIp65504P664ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P664ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P664ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P664ReservdL() {	 
			return (getShort(beginIp65504P664ReservdL));
   	}
         int localIp65504P665ReservdSCounter = -1;
         public boolean isIp65504P665ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P665ReservdSCounter != sharedCounter;
            localIp65504P665ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_665_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P665ReservdS
	 */
	protected void serializeIp65504P665ReservdS(short ip65504P665ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P665ReservdS,IP_65504_P_665_RESERVD_S_LEN)
                  ,beginIp65504P665ReservdS
                  ,IP_65504_P_665_RESERVD_S_LEN
                 );
            localIp65504P665ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P665ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P665ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P665ReservdS() {	 
			return (getShort(beginIp65504P665ReservdS));
   	}
         int localIp65504P665ReservdLCounter = -1;
         public boolean isIp65504P665ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P665ReservdLCounter != sharedCounter;
            localIp65504P665ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_665_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P665ReservdL
	 */
	protected void serializeIp65504P665ReservdL(short ip65504P665ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P665ReservdL,IP_65504_P_665_RESERVD_L_LEN)
                  ,beginIp65504P665ReservdL
                  ,IP_65504_P_665_RESERVD_L_LEN
                 );
            localIp65504P665ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P665ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P665ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P665ReservdL() {	 
			return (getShort(beginIp65504P665ReservdL));
   	}
         int localIp65504P666ReservdSCounter = -1;
         public boolean isIp65504P666ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P666ReservdSCounter != sharedCounter;
            localIp65504P666ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_666_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P666ReservdS
	 */
	protected void serializeIp65504P666ReservdS(short ip65504P666ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P666ReservdS,IP_65504_P_666_RESERVD_S_LEN)
                  ,beginIp65504P666ReservdS
                  ,IP_65504_P_666_RESERVD_S_LEN
                 );
            localIp65504P666ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P666ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P666ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P666ReservdS() {	 
			return (getShort(beginIp65504P666ReservdS));
   	}
         int localIp65504P666ReservdLCounter = -1;
         public boolean isIp65504P666ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P666ReservdLCounter != sharedCounter;
            localIp65504P666ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_666_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P666ReservdL
	 */
	protected void serializeIp65504P666ReservdL(short ip65504P666ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P666ReservdL,IP_65504_P_666_RESERVD_L_LEN)
                  ,beginIp65504P666ReservdL
                  ,IP_65504_P_666_RESERVD_L_LEN
                 );
            localIp65504P666ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P666ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P666ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P666ReservdL() {	 
			return (getShort(beginIp65504P666ReservdL));
   	}
         int localIp65504P667ReservdSCounter = -1;
         public boolean isIp65504P667ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P667ReservdSCounter != sharedCounter;
            localIp65504P667ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_667_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P667ReservdS
	 */
	protected void serializeIp65504P667ReservdS(short ip65504P667ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P667ReservdS,IP_65504_P_667_RESERVD_S_LEN)
                  ,beginIp65504P667ReservdS
                  ,IP_65504_P_667_RESERVD_S_LEN
                 );
            localIp65504P667ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P667ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P667ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P667ReservdS() {	 
			return (getShort(beginIp65504P667ReservdS));
   	}
         int localIp65504P667ReservdLCounter = -1;
         public boolean isIp65504P667ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P667ReservdLCounter != sharedCounter;
            localIp65504P667ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_667_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P667ReservdL
	 */
	protected void serializeIp65504P667ReservdL(short ip65504P667ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P667ReservdL,IP_65504_P_667_RESERVD_L_LEN)
                  ,beginIp65504P667ReservdL
                  ,IP_65504_P_667_RESERVD_L_LEN
                 );
            localIp65504P667ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P667ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P667ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P667ReservdL() {	 
			return (getShort(beginIp65504P667ReservdL));
   	}
         int localIp65504P668ReservdSCounter = -1;
         public boolean isIp65504P668ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P668ReservdSCounter != sharedCounter;
            localIp65504P668ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_668_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P668ReservdS
	 */
	protected void serializeIp65504P668ReservdS(short ip65504P668ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P668ReservdS,IP_65504_P_668_RESERVD_S_LEN)
                  ,beginIp65504P668ReservdS
                  ,IP_65504_P_668_RESERVD_S_LEN
                 );
            localIp65504P668ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P668ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P668ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P668ReservdS() {	 
			return (getShort(beginIp65504P668ReservdS));
   	}
         int localIp65504P668ReservdLCounter = -1;
         public boolean isIp65504P668ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P668ReservdLCounter != sharedCounter;
            localIp65504P668ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_668_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P668ReservdL
	 */
	protected void serializeIp65504P668ReservdL(short ip65504P668ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P668ReservdL,IP_65504_P_668_RESERVD_L_LEN)
                  ,beginIp65504P668ReservdL
                  ,IP_65504_P_668_RESERVD_L_LEN
                 );
            localIp65504P668ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P668ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P668ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P668ReservdL() {	 
			return (getShort(beginIp65504P668ReservdL));
   	}
         int localIp65504P669ReservdSCounter = -1;
         public boolean isIp65504P669ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P669ReservdSCounter != sharedCounter;
            localIp65504P669ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_669_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P669ReservdS
	 */
	protected void serializeIp65504P669ReservdS(short ip65504P669ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P669ReservdS,IP_65504_P_669_RESERVD_S_LEN)
                  ,beginIp65504P669ReservdS
                  ,IP_65504_P_669_RESERVD_S_LEN
                 );
            localIp65504P669ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P669ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P669ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P669ReservdS() {	 
			return (getShort(beginIp65504P669ReservdS));
   	}
         int localIp65504P669ReservdLCounter = -1;
         public boolean isIp65504P669ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P669ReservdLCounter != sharedCounter;
            localIp65504P669ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_669_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P669ReservdL
	 */
	protected void serializeIp65504P669ReservdL(short ip65504P669ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P669ReservdL,IP_65504_P_669_RESERVD_L_LEN)
                  ,beginIp65504P669ReservdL
                  ,IP_65504_P_669_RESERVD_L_LEN
                 );
            localIp65504P669ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P669ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P669ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P669ReservdL() {	 
			return (getShort(beginIp65504P669ReservdL));
   	}
         int localIp65504P670PayNamIdSCounter = -1;
         public boolean isIp65504P670PayNamIdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P670PayNamIdSCounter != sharedCounter;
            localIp65504P670PayNamIdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_670_PAY_NAM_ID_S_LEN = 2;
  	/**
	 * serializeIp65504P670PayNamIdS
	 */
	protected void serializeIp65504P670PayNamIdS(short ip65504P670PayNamIdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P670PayNamIdS,IP_65504_P_670_PAY_NAM_ID_S_LEN)
                  ,beginIp65504P670PayNamIdS
                  ,IP_65504_P_670_PAY_NAM_ID_S_LEN
                 );
            localIp65504P670PayNamIdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P670PayNamIdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P670PayNamIdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P670PayNamIdS() {	 
			return (getShort(beginIp65504P670PayNamIdS));
   	}
         int localIp65504P670PayNamIdLCounter = -1;
         public boolean isIp65504P670PayNamIdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P670PayNamIdLCounter != sharedCounter;
            localIp65504P670PayNamIdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_670_PAY_NAM_ID_L_LEN = 2;
  	/**
	 * serializeIp65504P670PayNamIdL
	 */
	protected void serializeIp65504P670PayNamIdL(short ip65504P670PayNamIdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P670PayNamIdL,IP_65504_P_670_PAY_NAM_ID_L_LEN)
                  ,beginIp65504P670PayNamIdL
                  ,IP_65504_P_670_PAY_NAM_ID_L_LEN
                 );
            localIp65504P670PayNamIdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P670PayNamIdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P670PayNamIdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P670PayNamIdL() {	 
			return (getShort(beginIp65504P670PayNamIdL));
   	}
         int localIp65504P671DofReqSCounter = -1;
         public boolean isIp65504P671DofReqSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P671DofReqSCounter != sharedCounter;
            localIp65504P671DofReqSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_671_DOF_REQ_S_LEN = 2;
  	/**
	 * serializeIp65504P671DofReqS
	 */
	protected void serializeIp65504P671DofReqS(short ip65504P671DofReqS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P671DofReqS,IP_65504_P_671_DOF_REQ_S_LEN)
                  ,beginIp65504P671DofReqS
                  ,IP_65504_P_671_DOF_REQ_S_LEN
                 );
            localIp65504P671DofReqSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P671DofReqSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P671DofReqS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P671DofReqS() {	 
			return (getShort(beginIp65504P671DofReqS));
   	}
         int localIp65504P671DofReqLCounter = -1;
         public boolean isIp65504P671DofReqLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P671DofReqLCounter != sharedCounter;
            localIp65504P671DofReqLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_671_DOF_REQ_L_LEN = 2;
  	/**
	 * serializeIp65504P671DofReqL
	 */
	protected void serializeIp65504P671DofReqL(short ip65504P671DofReqL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P671DofReqL,IP_65504_P_671_DOF_REQ_L_LEN)
                  ,beginIp65504P671DofReqL
                  ,IP_65504_P_671_DOF_REQ_L_LEN
                 );
            localIp65504P671DofReqLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P671DofReqLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P671DofReqL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P671DofReqL() {	 
			return (getShort(beginIp65504P671DofReqL));
   	}
         int localIp65504P672RcptNamSCounter = -1;
         public boolean isIp65504P672RcptNamSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P672RcptNamSCounter != sharedCounter;
            localIp65504P672RcptNamSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_672_RCPT_NAM_S_LEN = 2;
  	/**
	 * serializeIp65504P672RcptNamS
	 */
	protected void serializeIp65504P672RcptNamS(short ip65504P672RcptNamS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P672RcptNamS,IP_65504_P_672_RCPT_NAM_S_LEN)
                  ,beginIp65504P672RcptNamS
                  ,IP_65504_P_672_RCPT_NAM_S_LEN
                 );
            localIp65504P672RcptNamSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P672RcptNamSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P672RcptNamS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P672RcptNamS() {	 
			return (getShort(beginIp65504P672RcptNamS));
   	}
         int localIp65504P672RcptNamLCounter = -1;
         public boolean isIp65504P672RcptNamLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P672RcptNamLCounter != sharedCounter;
            localIp65504P672RcptNamLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_672_RCPT_NAM_L_LEN = 2;
  	/**
	 * serializeIp65504P672RcptNamL
	 */
	protected void serializeIp65504P672RcptNamL(short ip65504P672RcptNamL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P672RcptNamL,IP_65504_P_672_RCPT_NAM_L_LEN)
                  ,beginIp65504P672RcptNamL
                  ,IP_65504_P_672_RCPT_NAM_L_LEN
                 );
            localIp65504P672RcptNamLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P672RcptNamLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P672RcptNamL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P672RcptNamL() {	 
			return (getShort(beginIp65504P672RcptNamL));
   	}
         int localIp65504P673DtRcptFundSCounter = -1;
         public boolean isIp65504P673DtRcptFundSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P673DtRcptFundSCounter != sharedCounter;
            localIp65504P673DtRcptFundSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_673_DT_RCPT_FUND_S_LEN = 2;
  	/**
	 * serializeIp65504P673DtRcptFundS
	 */
	protected void serializeIp65504P673DtRcptFundS(short ip65504P673DtRcptFundS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P673DtRcptFundS,IP_65504_P_673_DT_RCPT_FUND_S_LEN)
                  ,beginIp65504P673DtRcptFundS
                  ,IP_65504_P_673_DT_RCPT_FUND_S_LEN
                 );
            localIp65504P673DtRcptFundSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P673DtRcptFundSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P673DtRcptFundS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P673DtRcptFundS() {	 
			return (getShort(beginIp65504P673DtRcptFundS));
   	}
         int localIp65504P673DtRcptFundLCounter = -1;
         public boolean isIp65504P673DtRcptFundLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P673DtRcptFundLCounter != sharedCounter;
            localIp65504P673DtRcptFundLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_673_DT_RCPT_FUND_L_LEN = 2;
  	/**
	 * serializeIp65504P673DtRcptFundL
	 */
	protected void serializeIp65504P673DtRcptFundL(short ip65504P673DtRcptFundL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P673DtRcptFundL,IP_65504_P_673_DT_RCPT_FUND_L_LEN)
                  ,beginIp65504P673DtRcptFundL
                  ,IP_65504_P_673_DT_RCPT_FUND_L_LEN
                 );
            localIp65504P673DtRcptFundLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P673DtRcptFundLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P673DtRcptFundL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P673DtRcptFundL() {	 
			return (getShort(beginIp65504P673DtRcptFundL));
   	}
         int localIp65504P674AdlTrcRefNoSCounter = -1;
         public boolean isIp65504P674AdlTrcRefNoSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P674AdlTrcRefNoSCounter != sharedCounter;
            localIp65504P674AdlTrcRefNoSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_674_ADL_TRC_REF_NO_S_LEN = 2;
  	/**
	 * serializeIp65504P674AdlTrcRefNoS
	 */
	protected void serializeIp65504P674AdlTrcRefNoS(short ip65504P674AdlTrcRefNoS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P674AdlTrcRefNoS,IP_65504_P_674_ADL_TRC_REF_NO_S_LEN)
                  ,beginIp65504P674AdlTrcRefNoS
                  ,IP_65504_P_674_ADL_TRC_REF_NO_S_LEN
                 );
            localIp65504P674AdlTrcRefNoSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P674AdlTrcRefNoSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P674AdlTrcRefNoS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P674AdlTrcRefNoS() {	 
			return (getShort(beginIp65504P674AdlTrcRefNoS));
   	}
         int localIp65504P674AdlTrcRefNoLCounter = -1;
         public boolean isIp65504P674AdlTrcRefNoLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P674AdlTrcRefNoLCounter != sharedCounter;
            localIp65504P674AdlTrcRefNoLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_674_ADL_TRC_REF_NO_L_LEN = 2;
  	/**
	 * serializeIp65504P674AdlTrcRefNoL
	 */
	protected void serializeIp65504P674AdlTrcRefNoL(short ip65504P674AdlTrcRefNoL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P674AdlTrcRefNoL,IP_65504_P_674_ADL_TRC_REF_NO_L_LEN)
                  ,beginIp65504P674AdlTrcRefNoL
                  ,IP_65504_P_674_ADL_TRC_REF_NO_L_LEN
                 );
            localIp65504P674AdlTrcRefNoLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P674AdlTrcRefNoLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P674AdlTrcRefNoL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P674AdlTrcRefNoL() {	 
			return (getShort(beginIp65504P674AdlTrcRefNoL));
   	}
         int localIp65504P675AdlTrnsDescSCounter = -1;
         public boolean isIp65504P675AdlTrnsDescSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P675AdlTrnsDescSCounter != sharedCounter;
            localIp65504P675AdlTrnsDescSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_675_ADL_TRNS_DESC_S_LEN = 2;
  	/**
	 * serializeIp65504P675AdlTrnsDescS
	 */
	protected void serializeIp65504P675AdlTrnsDescS(short ip65504P675AdlTrnsDescS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P675AdlTrnsDescS,IP_65504_P_675_ADL_TRNS_DESC_S_LEN)
                  ,beginIp65504P675AdlTrnsDescS
                  ,IP_65504_P_675_ADL_TRNS_DESC_S_LEN
                 );
            localIp65504P675AdlTrnsDescSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P675AdlTrnsDescSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P675AdlTrnsDescS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P675AdlTrnsDescS() {	 
			return (getShort(beginIp65504P675AdlTrnsDescS));
   	}
         int localIp65504P675AdlTrnsDescLCounter = -1;
         public boolean isIp65504P675AdlTrnsDescLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P675AdlTrnsDescLCounter != sharedCounter;
            localIp65504P675AdlTrnsDescLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_675_ADL_TRNS_DESC_L_LEN = 2;
  	/**
	 * serializeIp65504P675AdlTrnsDescL
	 */
	protected void serializeIp65504P675AdlTrnsDescL(short ip65504P675AdlTrnsDescL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P675AdlTrnsDescL,IP_65504_P_675_ADL_TRNS_DESC_L_LEN)
                  ,beginIp65504P675AdlTrnsDescL
                  ,IP_65504_P_675_ADL_TRNS_DESC_L_LEN
                 );
            localIp65504P675AdlTrnsDescLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P675AdlTrnsDescLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P675AdlTrnsDescL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P675AdlTrnsDescL() {	 
			return (getShort(beginIp65504P675AdlTrnsDescL));
   	}
         int localIp65504P676CardAccVatnoSCounter = -1;
         public boolean isIp65504P676CardAccVatnoSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P676CardAccVatnoSCounter != sharedCounter;
            localIp65504P676CardAccVatnoSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_676_CARD_ACC_VATNO_S_LEN = 2;
  	/**
	 * serializeIp65504P676CardAccVatnoS
	 */
	protected void serializeIp65504P676CardAccVatnoS(short ip65504P676CardAccVatnoS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P676CardAccVatnoS,IP_65504_P_676_CARD_ACC_VATNO_S_LEN)
                  ,beginIp65504P676CardAccVatnoS
                  ,IP_65504_P_676_CARD_ACC_VATNO_S_LEN
                 );
            localIp65504P676CardAccVatnoSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P676CardAccVatnoSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P676CardAccVatnoS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P676CardAccVatnoS() {	 
			return (getShort(beginIp65504P676CardAccVatnoS));
   	}
         int localIp65504P676CardAccVatnoLCounter = -1;
         public boolean isIp65504P676CardAccVatnoLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P676CardAccVatnoLCounter != sharedCounter;
            localIp65504P676CardAccVatnoLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_676_CARD_ACC_VATNO_L_LEN = 2;
  	/**
	 * serializeIp65504P676CardAccVatnoL
	 */
	protected void serializeIp65504P676CardAccVatnoL(short ip65504P676CardAccVatnoL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P676CardAccVatnoL,IP_65504_P_676_CARD_ACC_VATNO_L_LEN)
                  ,beginIp65504P676CardAccVatnoL
                  ,IP_65504_P_676_CARD_ACC_VATNO_L_LEN
                 );
            localIp65504P676CardAccVatnoLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P676CardAccVatnoLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P676CardAccVatnoL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P676CardAccVatnoL() {	 
			return (getShort(beginIp65504P676CardAccVatnoL));
   	}
         int localIp65504P677CustVatNoSCounter = -1;
         public boolean isIp65504P677CustVatNoSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P677CustVatNoSCounter != sharedCounter;
            localIp65504P677CustVatNoSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_677_CUST_VAT_NO_S_LEN = 2;
  	/**
	 * serializeIp65504P677CustVatNoS
	 */
	protected void serializeIp65504P677CustVatNoS(short ip65504P677CustVatNoS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P677CustVatNoS,IP_65504_P_677_CUST_VAT_NO_S_LEN)
                  ,beginIp65504P677CustVatNoS
                  ,IP_65504_P_677_CUST_VAT_NO_S_LEN
                 );
            localIp65504P677CustVatNoSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P677CustVatNoSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P677CustVatNoS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P677CustVatNoS() {	 
			return (getShort(beginIp65504P677CustVatNoS));
   	}
         int localIp65504P677CustVatNoLCounter = -1;
         public boolean isIp65504P677CustVatNoLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P677CustVatNoLCounter != sharedCounter;
            localIp65504P677CustVatNoLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_677_CUST_VAT_NO_L_LEN = 2;
  	/**
	 * serializeIp65504P677CustVatNoL
	 */
	protected void serializeIp65504P677CustVatNoL(short ip65504P677CustVatNoL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P677CustVatNoL,IP_65504_P_677_CUST_VAT_NO_L_LEN)
                  ,beginIp65504P677CustVatNoL
                  ,IP_65504_P_677_CUST_VAT_NO_L_LEN
                 );
            localIp65504P677CustVatNoLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P677CustVatNoLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P677CustVatNoL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P677CustVatNoL() {	 
			return (getShort(beginIp65504P677CustVatNoL));
   	}
         int localIp65504P678UniqInvNoSCounter = -1;
         public boolean isIp65504P678UniqInvNoSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P678UniqInvNoSCounter != sharedCounter;
            localIp65504P678UniqInvNoSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_678_UNIQ_INV_NO_S_LEN = 2;
  	/**
	 * serializeIp65504P678UniqInvNoS
	 */
	protected void serializeIp65504P678UniqInvNoS(short ip65504P678UniqInvNoS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P678UniqInvNoS,IP_65504_P_678_UNIQ_INV_NO_S_LEN)
                  ,beginIp65504P678UniqInvNoS
                  ,IP_65504_P_678_UNIQ_INV_NO_S_LEN
                 );
            localIp65504P678UniqInvNoSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P678UniqInvNoSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P678UniqInvNoS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P678UniqInvNoS() {	 
			return (getShort(beginIp65504P678UniqInvNoS));
   	}
         int localIp65504P678UniqInvNoLCounter = -1;
         public boolean isIp65504P678UniqInvNoLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P678UniqInvNoLCounter != sharedCounter;
            localIp65504P678UniqInvNoLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_678_UNIQ_INV_NO_L_LEN = 2;
  	/**
	 * serializeIp65504P678UniqInvNoL
	 */
	protected void serializeIp65504P678UniqInvNoL(short ip65504P678UniqInvNoL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P678UniqInvNoL,IP_65504_P_678_UNIQ_INV_NO_L_LEN)
                  ,beginIp65504P678UniqInvNoL
                  ,IP_65504_P_678_UNIQ_INV_NO_L_LEN
                 );
            localIp65504P678UniqInvNoLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P678UniqInvNoLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P678UniqInvNoL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P678UniqInvNoL() {	 
			return (getShort(beginIp65504P678UniqInvNoL));
   	}
         int localIp65504P679CommodityCodeSCounter = -1;
         public boolean isIp65504P679CommodityCodeSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P679CommodityCodeSCounter != sharedCounter;
            localIp65504P679CommodityCodeSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_679_COMMODITY_CODE_S_LEN = 2;
  	/**
	 * serializeIp65504P679CommodityCodeS
	 */
	protected void serializeIp65504P679CommodityCodeS(short ip65504P679CommodityCodeS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P679CommodityCodeS,IP_65504_P_679_COMMODITY_CODE_S_LEN)
                  ,beginIp65504P679CommodityCodeS
                  ,IP_65504_P_679_COMMODITY_CODE_S_LEN
                 );
            localIp65504P679CommodityCodeSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P679CommodityCodeSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P679CommodityCodeS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P679CommodityCodeS() {	 
			return (getShort(beginIp65504P679CommodityCodeS));
   	}
         int localIp65504P679CommodityCodeLCounter = -1;
         public boolean isIp65504P679CommodityCodeLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P679CommodityCodeLCounter != sharedCounter;
            localIp65504P679CommodityCodeLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_679_COMMODITY_CODE_L_LEN = 2;
  	/**
	 * serializeIp65504P679CommodityCodeL
	 */
	protected void serializeIp65504P679CommodityCodeL(short ip65504P679CommodityCodeL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P679CommodityCodeL,IP_65504_P_679_COMMODITY_CODE_L_LEN)
                  ,beginIp65504P679CommodityCodeL
                  ,IP_65504_P_679_COMMODITY_CODE_L_LEN
                 );
            localIp65504P679CommodityCodeLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P679CommodityCodeLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P679CommodityCodeL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P679CommodityCodeL() {	 
			return (getShort(beginIp65504P679CommodityCodeL));
   	}
         int localIp65504P680AuthContNameSCounter = -1;
         public boolean isIp65504P680AuthContNameSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P680AuthContNameSCounter != sharedCounter;
            localIp65504P680AuthContNameSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_680_AUTH_CONT_NAME_S_LEN = 2;
  	/**
	 * serializeIp65504P680AuthContNameS
	 */
	protected void serializeIp65504P680AuthContNameS(short ip65504P680AuthContNameS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P680AuthContNameS,IP_65504_P_680_AUTH_CONT_NAME_S_LEN)
                  ,beginIp65504P680AuthContNameS
                  ,IP_65504_P_680_AUTH_CONT_NAME_S_LEN
                 );
            localIp65504P680AuthContNameSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P680AuthContNameSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P680AuthContNameS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P680AuthContNameS() {	 
			return (getShort(beginIp65504P680AuthContNameS));
   	}
         int localIp65504P680AuthContNameLCounter = -1;
         public boolean isIp65504P680AuthContNameLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P680AuthContNameLCounter != sharedCounter;
            localIp65504P680AuthContNameLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_680_AUTH_CONT_NAME_L_LEN = 2;
  	/**
	 * serializeIp65504P680AuthContNameL
	 */
	protected void serializeIp65504P680AuthContNameL(short ip65504P680AuthContNameL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P680AuthContNameL,IP_65504_P_680_AUTH_CONT_NAME_L_LEN)
                  ,beginIp65504P680AuthContNameL
                  ,IP_65504_P_680_AUTH_CONT_NAME_L_LEN
                 );
            localIp65504P680AuthContNameLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P680AuthContNameLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P680AuthContNameL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P680AuthContNameL() {	 
			return (getShort(beginIp65504P680AuthContNameL));
   	}
         int localIp65504P681AuthContPhonSCounter = -1;
         public boolean isIp65504P681AuthContPhonSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P681AuthContPhonSCounter != sharedCounter;
            localIp65504P681AuthContPhonSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_681_AUTH_CONT_PHON_S_LEN = 2;
  	/**
	 * serializeIp65504P681AuthContPhonS
	 */
	protected void serializeIp65504P681AuthContPhonS(short ip65504P681AuthContPhonS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P681AuthContPhonS,IP_65504_P_681_AUTH_CONT_PHON_S_LEN)
                  ,beginIp65504P681AuthContPhonS
                  ,IP_65504_P_681_AUTH_CONT_PHON_S_LEN
                 );
            localIp65504P681AuthContPhonSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P681AuthContPhonSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P681AuthContPhonS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P681AuthContPhonS() {	 
			return (getShort(beginIp65504P681AuthContPhonS));
   	}
         int localIp65504P681AuthContPhonLCounter = -1;
         public boolean isIp65504P681AuthContPhonLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P681AuthContPhonLCounter != sharedCounter;
            localIp65504P681AuthContPhonLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_681_AUTH_CONT_PHON_L_LEN = 2;
  	/**
	 * serializeIp65504P681AuthContPhonL
	 */
	protected void serializeIp65504P681AuthContPhonL(short ip65504P681AuthContPhonL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P681AuthContPhonL,IP_65504_P_681_AUTH_CONT_PHON_L_LEN)
                  ,beginIp65504P681AuthContPhonL
                  ,IP_65504_P_681_AUTH_CONT_PHON_L_LEN
                 );
            localIp65504P681AuthContPhonLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P681AuthContPhonLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P681AuthContPhonL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P681AuthContPhonL() {	 
			return (getShort(beginIp65504P681AuthContPhonL));
   	}
         int localIp65504P682TaxAmount3SCounter = -1;
         public boolean isIp65504P682TaxAmount3SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P682TaxAmount3SCounter != sharedCounter;
            localIp65504P682TaxAmount3SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_682_TAX_AMOUNT_3_S_LEN = 2;
  	/**
	 * serializeIp65504P682TaxAmount3S
	 */
	protected void serializeIp65504P682TaxAmount3S(short ip65504P682TaxAmount3S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P682TaxAmount3S,IP_65504_P_682_TAX_AMOUNT_3_S_LEN)
                  ,beginIp65504P682TaxAmount3S
                  ,IP_65504_P_682_TAX_AMOUNT_3_S_LEN
                 );
            localIp65504P682TaxAmount3SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P682TaxAmount3SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P682TaxAmount3S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P682TaxAmount3S() {	 
			return (getShort(beginIp65504P682TaxAmount3S));
   	}
         int localIp65504P682TaxAmount3LCounter = -1;
         public boolean isIp65504P682TaxAmount3LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P682TaxAmount3LCounter != sharedCounter;
            localIp65504P682TaxAmount3LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_682_TAX_AMOUNT_3_L_LEN = 2;
  	/**
	 * serializeIp65504P682TaxAmount3L
	 */
	protected void serializeIp65504P682TaxAmount3L(short ip65504P682TaxAmount3L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P682TaxAmount3L,IP_65504_P_682_TAX_AMOUNT_3_L_LEN)
                  ,beginIp65504P682TaxAmount3L
                  ,IP_65504_P_682_TAX_AMOUNT_3_L_LEN
                 );
            localIp65504P682TaxAmount3LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P682TaxAmount3LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P682TaxAmount3L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P682TaxAmount3L() {	 
			return (getShort(beginIp65504P682TaxAmount3L));
   	}




}
  
