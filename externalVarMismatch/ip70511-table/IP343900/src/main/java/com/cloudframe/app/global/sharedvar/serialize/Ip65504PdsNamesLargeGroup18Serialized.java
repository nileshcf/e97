package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip65504PdsNamesLargeGroup18Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 08:07. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip65504PdsNamesLargeGroup18Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip65504PdsNamesLargeGroup18Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_65504_PDS_NAMES_LARGE_GROUP_18_LENGTH = 248;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp65504P528CoupNoS;
            protected  int beginIp65504P528CoupNoL;
            protected  int beginIp65504P529FarebasS;
            protected  int beginIp65504P529FarebasL;
            protected  int beginIp65504P530FltNbrS;
            protected  int beginIp65504P530FltNbrL;
            protected  int beginIp65504P531DeptTmS;
            protected  int beginIp65504P531DeptTmL;
            protected  int beginIp65504P532ReservdS;
            protected  int beginIp65504P532ReservdL;
            protected  int beginIp65504P533ArrvTmS;
            protected  int beginIp65504P533ArrvTmL;
            protected  int beginIp65504P534ReservdS;
            protected  int beginIp65504P534ReservdL;
            protected  int beginIp65504P535FareXxS;
            protected  int beginIp65504P535FareXxL;
            protected  int beginIp65504P536FeeXxxS;
            protected  int beginIp65504P536FeeXxxL;
            protected  int beginIp65504P537TaxesXS;
            protected  int beginIp65504P537TaxesSL;
            protected  int beginIp65504P538EndorseS;
            protected  int beginIp65504P538EndorseL;
            protected  int beginIp65504P539ReservdS;
            protected  int beginIp65504P539ReservdL;
            protected  int beginIp65504P540ReservdS;
            protected  int beginIp65504P540ReservdL;
            protected  int beginIp65504P541ReservdS;
            protected  int beginIp65504P541ReservdL;
            protected  int beginIp65504P542ReservdS;
            protected  int beginIp65504P542ReservdL;
            protected  int beginIp65504P543ReservdS;
            protected  int beginIp65504P543ReservdL;
            protected  int beginIp65504P544RentNoS;
            protected  int beginIp65504P544RentNoL;
            protected  int beginIp65504P545RentNmS;
            protected  int beginIp65504P545RentNmL;
            protected  int beginIp65504P546RentCyS;
            protected  int beginIp65504P546RentCyL;
            protected  int beginIp65504P547RentStS;
            protected  int beginIp65504P547RentStL;
            protected  int beginIp65504P548RntCtyS;
            protected  int beginIp65504P548RntCtyL;
            protected  int beginIp65504P549RntLocS;
            protected  int beginIp65504P549RntLocL;
            protected  int beginIp65504P550RntRetS;
            protected  int beginIp65504P550RntRetL;
            protected  int beginIp65504P551RntChkS;
            protected  int beginIp65504P551RntChkL;
            protected  int beginIp65504P552CusSvcS;
            protected  int beginIp65504P552CusSvcL;
            protected  int beginIp65504P553RntRteS;
            protected  int beginIp65504P553RntRteL;
            protected  int beginIp65504P554ReservdS;
            protected  int beginIp65504P554ReservdL;
            protected  int beginIp65504P555RtPMlS;
            protected  int beginIp65504P555RtPMlL;
            protected  int beginIp65504P556TtlMlsS;
            protected  int beginIp65504P556TtlMlsL;
            protected  int beginIp65504P557MaxfreeS;
            protected  int beginIp65504P557MaxfreeL;
            protected  int beginIp65504P558MiKmIS;
            protected  int beginIp65504P558MiKmIL;
	
	/**
	* Constructor for Ip65504PdsNamesLargeGroup18Serialized
	**/
    public Ip65504PdsNamesLargeGroup18Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ip65504PdsNamesLargeGroup18Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip65504PdsNamesLargeGroup18Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ip65504PdsNamesLargeGroup18Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,4212); // serialize this field at offset 4212 by default 
    }
    
	/**
	* sets parent for this Ip65504PdsNamesLargeGroup18Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 4212 by default
    }    
	/**
	* initializes the field in Ip65504PdsNamesLargeGroup18Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_65504_PDS_NAMES_LARGE_GROUP_18_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp65504P528CoupNoS = getStartOffset() + 4;	// set offset for serialization
  
             beginIp65504P528CoupNoL = getStartOffset() + 6;	// set offset for serialization
  
  
             beginIp65504P529FarebasS = getStartOffset() + 12;	// set offset for serialization
  
             beginIp65504P529FarebasL = getStartOffset() + 14;	// set offset for serialization
  
  
             beginIp65504P530FltNbrS = getStartOffset() + 20;	// set offset for serialization
  
             beginIp65504P530FltNbrL = getStartOffset() + 22;	// set offset for serialization
  
  
             beginIp65504P531DeptTmS = getStartOffset() + 28;	// set offset for serialization
  
             beginIp65504P531DeptTmL = getStartOffset() + 30;	// set offset for serialization
  
  
             beginIp65504P532ReservdS = getStartOffset() + 36;	// set offset for serialization
  
             beginIp65504P532ReservdL = getStartOffset() + 38;	// set offset for serialization
  
  
             beginIp65504P533ArrvTmS = getStartOffset() + 44;	// set offset for serialization
  
             beginIp65504P533ArrvTmL = getStartOffset() + 46;	// set offset for serialization
  
  
             beginIp65504P534ReservdS = getStartOffset() + 52;	// set offset for serialization
  
             beginIp65504P534ReservdL = getStartOffset() + 54;	// set offset for serialization
  
  
             beginIp65504P535FareXxS = getStartOffset() + 60;	// set offset for serialization
  
             beginIp65504P535FareXxL = getStartOffset() + 62;	// set offset for serialization
  
  
             beginIp65504P536FeeXxxS = getStartOffset() + 68;	// set offset for serialization
  
             beginIp65504P536FeeXxxL = getStartOffset() + 70;	// set offset for serialization
  
  
             beginIp65504P537TaxesXS = getStartOffset() + 76;	// set offset for serialization
  
             beginIp65504P537TaxesSL = getStartOffset() + 78;	// set offset for serialization
  
  
             beginIp65504P538EndorseS = getStartOffset() + 84;	// set offset for serialization
  
             beginIp65504P538EndorseL = getStartOffset() + 86;	// set offset for serialization
  
  
             beginIp65504P539ReservdS = getStartOffset() + 92;	// set offset for serialization
  
             beginIp65504P539ReservdL = getStartOffset() + 94;	// set offset for serialization
  
  
             beginIp65504P540ReservdS = getStartOffset() + 100;	// set offset for serialization
  
             beginIp65504P540ReservdL = getStartOffset() + 102;	// set offset for serialization
  
  
             beginIp65504P541ReservdS = getStartOffset() + 108;	// set offset for serialization
  
             beginIp65504P541ReservdL = getStartOffset() + 110;	// set offset for serialization
  
  
             beginIp65504P542ReservdS = getStartOffset() + 116;	// set offset for serialization
  
             beginIp65504P542ReservdL = getStartOffset() + 118;	// set offset for serialization
  
  
             beginIp65504P543ReservdS = getStartOffset() + 124;	// set offset for serialization
  
             beginIp65504P543ReservdL = getStartOffset() + 126;	// set offset for serialization
  
  
             beginIp65504P544RentNoS = getStartOffset() + 132;	// set offset for serialization
  
             beginIp65504P544RentNoL = getStartOffset() + 134;	// set offset for serialization
  
  
             beginIp65504P545RentNmS = getStartOffset() + 140;	// set offset for serialization
  
             beginIp65504P545RentNmL = getStartOffset() + 142;	// set offset for serialization
  
  
             beginIp65504P546RentCyS = getStartOffset() + 148;	// set offset for serialization
  
             beginIp65504P546RentCyL = getStartOffset() + 150;	// set offset for serialization
  
  
             beginIp65504P547RentStS = getStartOffset() + 156;	// set offset for serialization
  
             beginIp65504P547RentStL = getStartOffset() + 158;	// set offset for serialization
  
  
             beginIp65504P548RntCtyS = getStartOffset() + 164;	// set offset for serialization
  
             beginIp65504P548RntCtyL = getStartOffset() + 166;	// set offset for serialization
  
  
             beginIp65504P549RntLocS = getStartOffset() + 172;	// set offset for serialization
  
             beginIp65504P549RntLocL = getStartOffset() + 174;	// set offset for serialization
  
  
             beginIp65504P550RntRetS = getStartOffset() + 180;	// set offset for serialization
  
             beginIp65504P550RntRetL = getStartOffset() + 182;	// set offset for serialization
  
  
             beginIp65504P551RntChkS = getStartOffset() + 188;	// set offset for serialization
  
             beginIp65504P551RntChkL = getStartOffset() + 190;	// set offset for serialization
  
  
             beginIp65504P552CusSvcS = getStartOffset() + 196;	// set offset for serialization
  
             beginIp65504P552CusSvcL = getStartOffset() + 198;	// set offset for serialization
  
  
             beginIp65504P553RntRteS = getStartOffset() + 204;	// set offset for serialization
  
             beginIp65504P553RntRteL = getStartOffset() + 206;	// set offset for serialization
  
  
             beginIp65504P554ReservdS = getStartOffset() + 212;	// set offset for serialization
  
             beginIp65504P554ReservdL = getStartOffset() + 214;	// set offset for serialization
  
  
             beginIp65504P555RtPMlS = getStartOffset() + 220;	// set offset for serialization
  
             beginIp65504P555RtPMlL = getStartOffset() + 222;	// set offset for serialization
  
  
             beginIp65504P556TtlMlsS = getStartOffset() + 228;	// set offset for serialization
  
             beginIp65504P556TtlMlsL = getStartOffset() + 230;	// set offset for serialization
  
  
             beginIp65504P557MaxfreeS = getStartOffset() + 236;	// set offset for serialization
  
             beginIp65504P557MaxfreeL = getStartOffset() + 238;	// set offset for serialization
  
  
             beginIp65504P558MiKmIS = getStartOffset() + 244;	// set offset for serialization
  
             beginIp65504P558MiKmIL = getStartOffset() + 246;	// set offset for serialization
  
  
	   /*  end of offset */
	}
         int localIp65504P528CoupNoSCounter = -1;
         public boolean isIp65504P528CoupNoSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P528CoupNoSCounter != sharedCounter;
            localIp65504P528CoupNoSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_528_COUP_NO_S_LEN = 2;
  	/**
	 * serializeIp65504P528CoupNoS
	 */
	protected void serializeIp65504P528CoupNoS(short ip65504P528CoupNoS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P528CoupNoS,IP_65504_P_528_COUP_NO_S_LEN)
                  ,beginIp65504P528CoupNoS
                  ,IP_65504_P_528_COUP_NO_S_LEN
                 );
            localIp65504P528CoupNoSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P528CoupNoSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P528CoupNoS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P528CoupNoS() {	 
			return (getShort(beginIp65504P528CoupNoS));
   	}
         int localIp65504P528CoupNoLCounter = -1;
         public boolean isIp65504P528CoupNoLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P528CoupNoLCounter != sharedCounter;
            localIp65504P528CoupNoLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_528_COUP_NO_L_LEN = 2;
  	/**
	 * serializeIp65504P528CoupNoL
	 */
	protected void serializeIp65504P528CoupNoL(short ip65504P528CoupNoL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P528CoupNoL,IP_65504_P_528_COUP_NO_L_LEN)
                  ,beginIp65504P528CoupNoL
                  ,IP_65504_P_528_COUP_NO_L_LEN
                 );
            localIp65504P528CoupNoLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P528CoupNoLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P528CoupNoL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P528CoupNoL() {	 
			return (getShort(beginIp65504P528CoupNoL));
   	}
         int localIp65504P529FarebasSCounter = -1;
         public boolean isIp65504P529FarebasSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P529FarebasSCounter != sharedCounter;
            localIp65504P529FarebasSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_529_FAREBAS_S_LEN = 2;
  	/**
	 * serializeIp65504P529FarebasS
	 */
	protected void serializeIp65504P529FarebasS(short ip65504P529FarebasS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P529FarebasS,IP_65504_P_529_FAREBAS_S_LEN)
                  ,beginIp65504P529FarebasS
                  ,IP_65504_P_529_FAREBAS_S_LEN
                 );
            localIp65504P529FarebasSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P529FarebasSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P529FarebasS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P529FarebasS() {	 
			return (getShort(beginIp65504P529FarebasS));
   	}
         int localIp65504P529FarebasLCounter = -1;
         public boolean isIp65504P529FarebasLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P529FarebasLCounter != sharedCounter;
            localIp65504P529FarebasLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_529_FAREBAS_L_LEN = 2;
  	/**
	 * serializeIp65504P529FarebasL
	 */
	protected void serializeIp65504P529FarebasL(short ip65504P529FarebasL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P529FarebasL,IP_65504_P_529_FAREBAS_L_LEN)
                  ,beginIp65504P529FarebasL
                  ,IP_65504_P_529_FAREBAS_L_LEN
                 );
            localIp65504P529FarebasLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P529FarebasLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P529FarebasL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P529FarebasL() {	 
			return (getShort(beginIp65504P529FarebasL));
   	}
         int localIp65504P530FltNbrSCounter = -1;
         public boolean isIp65504P530FltNbrSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P530FltNbrSCounter != sharedCounter;
            localIp65504P530FltNbrSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_530_FLT_NBR_S_LEN = 2;
  	/**
	 * serializeIp65504P530FltNbrS
	 */
	protected void serializeIp65504P530FltNbrS(short ip65504P530FltNbrS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P530FltNbrS,IP_65504_P_530_FLT_NBR_S_LEN)
                  ,beginIp65504P530FltNbrS
                  ,IP_65504_P_530_FLT_NBR_S_LEN
                 );
            localIp65504P530FltNbrSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P530FltNbrSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P530FltNbrS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P530FltNbrS() {	 
			return (getShort(beginIp65504P530FltNbrS));
   	}
         int localIp65504P530FltNbrLCounter = -1;
         public boolean isIp65504P530FltNbrLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P530FltNbrLCounter != sharedCounter;
            localIp65504P530FltNbrLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_530_FLT_NBR_L_LEN = 2;
  	/**
	 * serializeIp65504P530FltNbrL
	 */
	protected void serializeIp65504P530FltNbrL(short ip65504P530FltNbrL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P530FltNbrL,IP_65504_P_530_FLT_NBR_L_LEN)
                  ,beginIp65504P530FltNbrL
                  ,IP_65504_P_530_FLT_NBR_L_LEN
                 );
            localIp65504P530FltNbrLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P530FltNbrLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P530FltNbrL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P530FltNbrL() {	 
			return (getShort(beginIp65504P530FltNbrL));
   	}
         int localIp65504P531DeptTmSCounter = -1;
         public boolean isIp65504P531DeptTmSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P531DeptTmSCounter != sharedCounter;
            localIp65504P531DeptTmSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_531_DEPT_TM_S_LEN = 2;
  	/**
	 * serializeIp65504P531DeptTmS
	 */
	protected void serializeIp65504P531DeptTmS(short ip65504P531DeptTmS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P531DeptTmS,IP_65504_P_531_DEPT_TM_S_LEN)
                  ,beginIp65504P531DeptTmS
                  ,IP_65504_P_531_DEPT_TM_S_LEN
                 );
            localIp65504P531DeptTmSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P531DeptTmSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P531DeptTmS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P531DeptTmS() {	 
			return (getShort(beginIp65504P531DeptTmS));
   	}
         int localIp65504P531DeptTmLCounter = -1;
         public boolean isIp65504P531DeptTmLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P531DeptTmLCounter != sharedCounter;
            localIp65504P531DeptTmLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_531_DEPT_TM_L_LEN = 2;
  	/**
	 * serializeIp65504P531DeptTmL
	 */
	protected void serializeIp65504P531DeptTmL(short ip65504P531DeptTmL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P531DeptTmL,IP_65504_P_531_DEPT_TM_L_LEN)
                  ,beginIp65504P531DeptTmL
                  ,IP_65504_P_531_DEPT_TM_L_LEN
                 );
            localIp65504P531DeptTmLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P531DeptTmLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P531DeptTmL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P531DeptTmL() {	 
			return (getShort(beginIp65504P531DeptTmL));
   	}
         int localIp65504P532ReservdSCounter = -1;
         public boolean isIp65504P532ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P532ReservdSCounter != sharedCounter;
            localIp65504P532ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_532_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P532ReservdS
	 */
	protected void serializeIp65504P532ReservdS(short ip65504P532ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P532ReservdS,IP_65504_P_532_RESERVD_S_LEN)
                  ,beginIp65504P532ReservdS
                  ,IP_65504_P_532_RESERVD_S_LEN
                 );
            localIp65504P532ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P532ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P532ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P532ReservdS() {	 
			return (getShort(beginIp65504P532ReservdS));
   	}
         int localIp65504P532ReservdLCounter = -1;
         public boolean isIp65504P532ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P532ReservdLCounter != sharedCounter;
            localIp65504P532ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_532_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P532ReservdL
	 */
	protected void serializeIp65504P532ReservdL(short ip65504P532ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P532ReservdL,IP_65504_P_532_RESERVD_L_LEN)
                  ,beginIp65504P532ReservdL
                  ,IP_65504_P_532_RESERVD_L_LEN
                 );
            localIp65504P532ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P532ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P532ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P532ReservdL() {	 
			return (getShort(beginIp65504P532ReservdL));
   	}
         int localIp65504P533ArrvTmSCounter = -1;
         public boolean isIp65504P533ArrvTmSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P533ArrvTmSCounter != sharedCounter;
            localIp65504P533ArrvTmSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_533_ARRV_TM_S_LEN = 2;
  	/**
	 * serializeIp65504P533ArrvTmS
	 */
	protected void serializeIp65504P533ArrvTmS(short ip65504P533ArrvTmS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P533ArrvTmS,IP_65504_P_533_ARRV_TM_S_LEN)
                  ,beginIp65504P533ArrvTmS
                  ,IP_65504_P_533_ARRV_TM_S_LEN
                 );
            localIp65504P533ArrvTmSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P533ArrvTmSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P533ArrvTmS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P533ArrvTmS() {	 
			return (getShort(beginIp65504P533ArrvTmS));
   	}
         int localIp65504P533ArrvTmLCounter = -1;
         public boolean isIp65504P533ArrvTmLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P533ArrvTmLCounter != sharedCounter;
            localIp65504P533ArrvTmLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_533_ARRV_TM_L_LEN = 2;
  	/**
	 * serializeIp65504P533ArrvTmL
	 */
	protected void serializeIp65504P533ArrvTmL(short ip65504P533ArrvTmL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P533ArrvTmL,IP_65504_P_533_ARRV_TM_L_LEN)
                  ,beginIp65504P533ArrvTmL
                  ,IP_65504_P_533_ARRV_TM_L_LEN
                 );
            localIp65504P533ArrvTmLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P533ArrvTmLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P533ArrvTmL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P533ArrvTmL() {	 
			return (getShort(beginIp65504P533ArrvTmL));
   	}
         int localIp65504P534ReservdSCounter = -1;
         public boolean isIp65504P534ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P534ReservdSCounter != sharedCounter;
            localIp65504P534ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_534_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P534ReservdS
	 */
	protected void serializeIp65504P534ReservdS(short ip65504P534ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P534ReservdS,IP_65504_P_534_RESERVD_S_LEN)
                  ,beginIp65504P534ReservdS
                  ,IP_65504_P_534_RESERVD_S_LEN
                 );
            localIp65504P534ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P534ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P534ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P534ReservdS() {	 
			return (getShort(beginIp65504P534ReservdS));
   	}
         int localIp65504P534ReservdLCounter = -1;
         public boolean isIp65504P534ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P534ReservdLCounter != sharedCounter;
            localIp65504P534ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_534_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P534ReservdL
	 */
	protected void serializeIp65504P534ReservdL(short ip65504P534ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P534ReservdL,IP_65504_P_534_RESERVD_L_LEN)
                  ,beginIp65504P534ReservdL
                  ,IP_65504_P_534_RESERVD_L_LEN
                 );
            localIp65504P534ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P534ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P534ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P534ReservdL() {	 
			return (getShort(beginIp65504P534ReservdL));
   	}
         int localIp65504P535FareXxSCounter = -1;
         public boolean isIp65504P535FareXxSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P535FareXxSCounter != sharedCounter;
            localIp65504P535FareXxSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_535_FARE_XX_S_LEN = 2;
  	/**
	 * serializeIp65504P535FareXxS
	 */
	protected void serializeIp65504P535FareXxS(short ip65504P535FareXxS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P535FareXxS,IP_65504_P_535_FARE_XX_S_LEN)
                  ,beginIp65504P535FareXxS
                  ,IP_65504_P_535_FARE_XX_S_LEN
                 );
            localIp65504P535FareXxSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P535FareXxSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P535FareXxS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P535FareXxS() {	 
			return (getShort(beginIp65504P535FareXxS));
   	}
         int localIp65504P535FareXxLCounter = -1;
         public boolean isIp65504P535FareXxLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P535FareXxLCounter != sharedCounter;
            localIp65504P535FareXxLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_535_FARE_XX_L_LEN = 2;
  	/**
	 * serializeIp65504P535FareXxL
	 */
	protected void serializeIp65504P535FareXxL(short ip65504P535FareXxL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P535FareXxL,IP_65504_P_535_FARE_XX_L_LEN)
                  ,beginIp65504P535FareXxL
                  ,IP_65504_P_535_FARE_XX_L_LEN
                 );
            localIp65504P535FareXxLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P535FareXxLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P535FareXxL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P535FareXxL() {	 
			return (getShort(beginIp65504P535FareXxL));
   	}
         int localIp65504P536FeeXxxSCounter = -1;
         public boolean isIp65504P536FeeXxxSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P536FeeXxxSCounter != sharedCounter;
            localIp65504P536FeeXxxSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_536_FEE_XXX_S_LEN = 2;
  	/**
	 * serializeIp65504P536FeeXxxS
	 */
	protected void serializeIp65504P536FeeXxxS(short ip65504P536FeeXxxS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P536FeeXxxS,IP_65504_P_536_FEE_XXX_S_LEN)
                  ,beginIp65504P536FeeXxxS
                  ,IP_65504_P_536_FEE_XXX_S_LEN
                 );
            localIp65504P536FeeXxxSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P536FeeXxxSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P536FeeXxxS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P536FeeXxxS() {	 
			return (getShort(beginIp65504P536FeeXxxS));
   	}
         int localIp65504P536FeeXxxLCounter = -1;
         public boolean isIp65504P536FeeXxxLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P536FeeXxxLCounter != sharedCounter;
            localIp65504P536FeeXxxLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_536_FEE_XXX_L_LEN = 2;
  	/**
	 * serializeIp65504P536FeeXxxL
	 */
	protected void serializeIp65504P536FeeXxxL(short ip65504P536FeeXxxL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P536FeeXxxL,IP_65504_P_536_FEE_XXX_L_LEN)
                  ,beginIp65504P536FeeXxxL
                  ,IP_65504_P_536_FEE_XXX_L_LEN
                 );
            localIp65504P536FeeXxxLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P536FeeXxxLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P536FeeXxxL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P536FeeXxxL() {	 
			return (getShort(beginIp65504P536FeeXxxL));
   	}
         int localIp65504P537TaxesXSCounter = -1;
         public boolean isIp65504P537TaxesXSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P537TaxesXSCounter != sharedCounter;
            localIp65504P537TaxesXSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_537_TAXES_XS_LEN = 2;
  	/**
	 * serializeIp65504P537TaxesXS
	 */
	protected void serializeIp65504P537TaxesXS(short ip65504P537TaxesXS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P537TaxesXS,IP_65504_P_537_TAXES_XS_LEN)
                  ,beginIp65504P537TaxesXS
                  ,IP_65504_P_537_TAXES_XS_LEN
                 );
            localIp65504P537TaxesXSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P537TaxesXSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P537TaxesXS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P537TaxesXS() {	 
			return (getShort(beginIp65504P537TaxesXS));
   	}
         int localIp65504P537TaxesSLCounter = -1;
         public boolean isIp65504P537TaxesSLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P537TaxesSLCounter != sharedCounter;
            localIp65504P537TaxesSLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_537_TAXES_SL_LEN = 2;
  	/**
	 * serializeIp65504P537TaxesSL
	 */
	protected void serializeIp65504P537TaxesSL(short ip65504P537TaxesSL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P537TaxesSL,IP_65504_P_537_TAXES_SL_LEN)
                  ,beginIp65504P537TaxesSL
                  ,IP_65504_P_537_TAXES_SL_LEN
                 );
            localIp65504P537TaxesSLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P537TaxesSLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P537TaxesSL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P537TaxesSL() {	 
			return (getShort(beginIp65504P537TaxesSL));
   	}
         int localIp65504P538EndorseSCounter = -1;
         public boolean isIp65504P538EndorseSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P538EndorseSCounter != sharedCounter;
            localIp65504P538EndorseSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_538_ENDORSE_S_LEN = 2;
  	/**
	 * serializeIp65504P538EndorseS
	 */
	protected void serializeIp65504P538EndorseS(short ip65504P538EndorseS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P538EndorseS,IP_65504_P_538_ENDORSE_S_LEN)
                  ,beginIp65504P538EndorseS
                  ,IP_65504_P_538_ENDORSE_S_LEN
                 );
            localIp65504P538EndorseSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P538EndorseSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P538EndorseS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P538EndorseS() {	 
			return (getShort(beginIp65504P538EndorseS));
   	}
         int localIp65504P538EndorseLCounter = -1;
         public boolean isIp65504P538EndorseLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P538EndorseLCounter != sharedCounter;
            localIp65504P538EndorseLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_538_ENDORSE_L_LEN = 2;
  	/**
	 * serializeIp65504P538EndorseL
	 */
	protected void serializeIp65504P538EndorseL(short ip65504P538EndorseL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P538EndorseL,IP_65504_P_538_ENDORSE_L_LEN)
                  ,beginIp65504P538EndorseL
                  ,IP_65504_P_538_ENDORSE_L_LEN
                 );
            localIp65504P538EndorseLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P538EndorseLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P538EndorseL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P538EndorseL() {	 
			return (getShort(beginIp65504P538EndorseL));
   	}
         int localIp65504P539ReservdSCounter = -1;
         public boolean isIp65504P539ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P539ReservdSCounter != sharedCounter;
            localIp65504P539ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_539_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P539ReservdS
	 */
	protected void serializeIp65504P539ReservdS(short ip65504P539ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P539ReservdS,IP_65504_P_539_RESERVD_S_LEN)
                  ,beginIp65504P539ReservdS
                  ,IP_65504_P_539_RESERVD_S_LEN
                 );
            localIp65504P539ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P539ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P539ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P539ReservdS() {	 
			return (getShort(beginIp65504P539ReservdS));
   	}
         int localIp65504P539ReservdLCounter = -1;
         public boolean isIp65504P539ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P539ReservdLCounter != sharedCounter;
            localIp65504P539ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_539_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P539ReservdL
	 */
	protected void serializeIp65504P539ReservdL(short ip65504P539ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P539ReservdL,IP_65504_P_539_RESERVD_L_LEN)
                  ,beginIp65504P539ReservdL
                  ,IP_65504_P_539_RESERVD_L_LEN
                 );
            localIp65504P539ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P539ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P539ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P539ReservdL() {	 
			return (getShort(beginIp65504P539ReservdL));
   	}
         int localIp65504P540ReservdSCounter = -1;
         public boolean isIp65504P540ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P540ReservdSCounter != sharedCounter;
            localIp65504P540ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_540_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P540ReservdS
	 */
	protected void serializeIp65504P540ReservdS(short ip65504P540ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P540ReservdS,IP_65504_P_540_RESERVD_S_LEN)
                  ,beginIp65504P540ReservdS
                  ,IP_65504_P_540_RESERVD_S_LEN
                 );
            localIp65504P540ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P540ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P540ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P540ReservdS() {	 
			return (getShort(beginIp65504P540ReservdS));
   	}
         int localIp65504P540ReservdLCounter = -1;
         public boolean isIp65504P540ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P540ReservdLCounter != sharedCounter;
            localIp65504P540ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_540_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P540ReservdL
	 */
	protected void serializeIp65504P540ReservdL(short ip65504P540ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P540ReservdL,IP_65504_P_540_RESERVD_L_LEN)
                  ,beginIp65504P540ReservdL
                  ,IP_65504_P_540_RESERVD_L_LEN
                 );
            localIp65504P540ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P540ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P540ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P540ReservdL() {	 
			return (getShort(beginIp65504P540ReservdL));
   	}
         int localIp65504P541ReservdSCounter = -1;
         public boolean isIp65504P541ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P541ReservdSCounter != sharedCounter;
            localIp65504P541ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_541_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P541ReservdS
	 */
	protected void serializeIp65504P541ReservdS(short ip65504P541ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P541ReservdS,IP_65504_P_541_RESERVD_S_LEN)
                  ,beginIp65504P541ReservdS
                  ,IP_65504_P_541_RESERVD_S_LEN
                 );
            localIp65504P541ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P541ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P541ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P541ReservdS() {	 
			return (getShort(beginIp65504P541ReservdS));
   	}
         int localIp65504P541ReservdLCounter = -1;
         public boolean isIp65504P541ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P541ReservdLCounter != sharedCounter;
            localIp65504P541ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_541_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P541ReservdL
	 */
	protected void serializeIp65504P541ReservdL(short ip65504P541ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P541ReservdL,IP_65504_P_541_RESERVD_L_LEN)
                  ,beginIp65504P541ReservdL
                  ,IP_65504_P_541_RESERVD_L_LEN
                 );
            localIp65504P541ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P541ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P541ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P541ReservdL() {	 
			return (getShort(beginIp65504P541ReservdL));
   	}
         int localIp65504P542ReservdSCounter = -1;
         public boolean isIp65504P542ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P542ReservdSCounter != sharedCounter;
            localIp65504P542ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_542_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P542ReservdS
	 */
	protected void serializeIp65504P542ReservdS(short ip65504P542ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P542ReservdS,IP_65504_P_542_RESERVD_S_LEN)
                  ,beginIp65504P542ReservdS
                  ,IP_65504_P_542_RESERVD_S_LEN
                 );
            localIp65504P542ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P542ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P542ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P542ReservdS() {	 
			return (getShort(beginIp65504P542ReservdS));
   	}
         int localIp65504P542ReservdLCounter = -1;
         public boolean isIp65504P542ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P542ReservdLCounter != sharedCounter;
            localIp65504P542ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_542_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P542ReservdL
	 */
	protected void serializeIp65504P542ReservdL(short ip65504P542ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P542ReservdL,IP_65504_P_542_RESERVD_L_LEN)
                  ,beginIp65504P542ReservdL
                  ,IP_65504_P_542_RESERVD_L_LEN
                 );
            localIp65504P542ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P542ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P542ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P542ReservdL() {	 
			return (getShort(beginIp65504P542ReservdL));
   	}
         int localIp65504P543ReservdSCounter = -1;
         public boolean isIp65504P543ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P543ReservdSCounter != sharedCounter;
            localIp65504P543ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_543_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P543ReservdS
	 */
	protected void serializeIp65504P543ReservdS(short ip65504P543ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P543ReservdS,IP_65504_P_543_RESERVD_S_LEN)
                  ,beginIp65504P543ReservdS
                  ,IP_65504_P_543_RESERVD_S_LEN
                 );
            localIp65504P543ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P543ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P543ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P543ReservdS() {	 
			return (getShort(beginIp65504P543ReservdS));
   	}
         int localIp65504P543ReservdLCounter = -1;
         public boolean isIp65504P543ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P543ReservdLCounter != sharedCounter;
            localIp65504P543ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_543_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P543ReservdL
	 */
	protected void serializeIp65504P543ReservdL(short ip65504P543ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P543ReservdL,IP_65504_P_543_RESERVD_L_LEN)
                  ,beginIp65504P543ReservdL
                  ,IP_65504_P_543_RESERVD_L_LEN
                 );
            localIp65504P543ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P543ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P543ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P543ReservdL() {	 
			return (getShort(beginIp65504P543ReservdL));
   	}
         int localIp65504P544RentNoSCounter = -1;
         public boolean isIp65504P544RentNoSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P544RentNoSCounter != sharedCounter;
            localIp65504P544RentNoSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_544_RENT_NO_S_LEN = 2;
  	/**
	 * serializeIp65504P544RentNoS
	 */
	protected void serializeIp65504P544RentNoS(short ip65504P544RentNoS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P544RentNoS,IP_65504_P_544_RENT_NO_S_LEN)
                  ,beginIp65504P544RentNoS
                  ,IP_65504_P_544_RENT_NO_S_LEN
                 );
            localIp65504P544RentNoSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P544RentNoSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P544RentNoS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P544RentNoS() {	 
			return (getShort(beginIp65504P544RentNoS));
   	}
         int localIp65504P544RentNoLCounter = -1;
         public boolean isIp65504P544RentNoLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P544RentNoLCounter != sharedCounter;
            localIp65504P544RentNoLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_544_RENT_NO_L_LEN = 2;
  	/**
	 * serializeIp65504P544RentNoL
	 */
	protected void serializeIp65504P544RentNoL(short ip65504P544RentNoL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P544RentNoL,IP_65504_P_544_RENT_NO_L_LEN)
                  ,beginIp65504P544RentNoL
                  ,IP_65504_P_544_RENT_NO_L_LEN
                 );
            localIp65504P544RentNoLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P544RentNoLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P544RentNoL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P544RentNoL() {	 
			return (getShort(beginIp65504P544RentNoL));
   	}
         int localIp65504P545RentNmSCounter = -1;
         public boolean isIp65504P545RentNmSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P545RentNmSCounter != sharedCounter;
            localIp65504P545RentNmSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_545_RENT_NM_S_LEN = 2;
  	/**
	 * serializeIp65504P545RentNmS
	 */
	protected void serializeIp65504P545RentNmS(short ip65504P545RentNmS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P545RentNmS,IP_65504_P_545_RENT_NM_S_LEN)
                  ,beginIp65504P545RentNmS
                  ,IP_65504_P_545_RENT_NM_S_LEN
                 );
            localIp65504P545RentNmSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P545RentNmSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P545RentNmS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P545RentNmS() {	 
			return (getShort(beginIp65504P545RentNmS));
   	}
         int localIp65504P545RentNmLCounter = -1;
         public boolean isIp65504P545RentNmLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P545RentNmLCounter != sharedCounter;
            localIp65504P545RentNmLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_545_RENT_NM_L_LEN = 2;
  	/**
	 * serializeIp65504P545RentNmL
	 */
	protected void serializeIp65504P545RentNmL(short ip65504P545RentNmL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P545RentNmL,IP_65504_P_545_RENT_NM_L_LEN)
                  ,beginIp65504P545RentNmL
                  ,IP_65504_P_545_RENT_NM_L_LEN
                 );
            localIp65504P545RentNmLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P545RentNmLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P545RentNmL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P545RentNmL() {	 
			return (getShort(beginIp65504P545RentNmL));
   	}
         int localIp65504P546RentCySCounter = -1;
         public boolean isIp65504P546RentCySModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P546RentCySCounter != sharedCounter;
            localIp65504P546RentCySCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_546_RENT_CY_S_LEN = 2;
  	/**
	 * serializeIp65504P546RentCyS
	 */
	protected void serializeIp65504P546RentCyS(short ip65504P546RentCyS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P546RentCyS,IP_65504_P_546_RENT_CY_S_LEN)
                  ,beginIp65504P546RentCyS
                  ,IP_65504_P_546_RENT_CY_S_LEN
                 );
            localIp65504P546RentCySCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P546RentCySMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P546RentCyS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P546RentCyS() {	 
			return (getShort(beginIp65504P546RentCyS));
   	}
         int localIp65504P546RentCyLCounter = -1;
         public boolean isIp65504P546RentCyLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P546RentCyLCounter != sharedCounter;
            localIp65504P546RentCyLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_546_RENT_CY_L_LEN = 2;
  	/**
	 * serializeIp65504P546RentCyL
	 */
	protected void serializeIp65504P546RentCyL(short ip65504P546RentCyL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P546RentCyL,IP_65504_P_546_RENT_CY_L_LEN)
                  ,beginIp65504P546RentCyL
                  ,IP_65504_P_546_RENT_CY_L_LEN
                 );
            localIp65504P546RentCyLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P546RentCyLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P546RentCyL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P546RentCyL() {	 
			return (getShort(beginIp65504P546RentCyL));
   	}
         int localIp65504P547RentStSCounter = -1;
         public boolean isIp65504P547RentStSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P547RentStSCounter != sharedCounter;
            localIp65504P547RentStSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_547_RENT_ST_S_LEN = 2;
  	/**
	 * serializeIp65504P547RentStS
	 */
	protected void serializeIp65504P547RentStS(short ip65504P547RentStS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P547RentStS,IP_65504_P_547_RENT_ST_S_LEN)
                  ,beginIp65504P547RentStS
                  ,IP_65504_P_547_RENT_ST_S_LEN
                 );
            localIp65504P547RentStSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P547RentStSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P547RentStS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P547RentStS() {	 
			return (getShort(beginIp65504P547RentStS));
   	}
         int localIp65504P547RentStLCounter = -1;
         public boolean isIp65504P547RentStLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P547RentStLCounter != sharedCounter;
            localIp65504P547RentStLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_547_RENT_ST_L_LEN = 2;
  	/**
	 * serializeIp65504P547RentStL
	 */
	protected void serializeIp65504P547RentStL(short ip65504P547RentStL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P547RentStL,IP_65504_P_547_RENT_ST_L_LEN)
                  ,beginIp65504P547RentStL
                  ,IP_65504_P_547_RENT_ST_L_LEN
                 );
            localIp65504P547RentStLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P547RentStLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P547RentStL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P547RentStL() {	 
			return (getShort(beginIp65504P547RentStL));
   	}
         int localIp65504P548RntCtySCounter = -1;
         public boolean isIp65504P548RntCtySModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P548RntCtySCounter != sharedCounter;
            localIp65504P548RntCtySCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_548_RNT_CTY_S_LEN = 2;
  	/**
	 * serializeIp65504P548RntCtyS
	 */
	protected void serializeIp65504P548RntCtyS(short ip65504P548RntCtyS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P548RntCtyS,IP_65504_P_548_RNT_CTY_S_LEN)
                  ,beginIp65504P548RntCtyS
                  ,IP_65504_P_548_RNT_CTY_S_LEN
                 );
            localIp65504P548RntCtySCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P548RntCtySMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P548RntCtyS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P548RntCtyS() {	 
			return (getShort(beginIp65504P548RntCtyS));
   	}
         int localIp65504P548RntCtyLCounter = -1;
         public boolean isIp65504P548RntCtyLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P548RntCtyLCounter != sharedCounter;
            localIp65504P548RntCtyLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_548_RNT_CTY_L_LEN = 2;
  	/**
	 * serializeIp65504P548RntCtyL
	 */
	protected void serializeIp65504P548RntCtyL(short ip65504P548RntCtyL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P548RntCtyL,IP_65504_P_548_RNT_CTY_L_LEN)
                  ,beginIp65504P548RntCtyL
                  ,IP_65504_P_548_RNT_CTY_L_LEN
                 );
            localIp65504P548RntCtyLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P548RntCtyLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P548RntCtyL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P548RntCtyL() {	 
			return (getShort(beginIp65504P548RntCtyL));
   	}
         int localIp65504P549RntLocSCounter = -1;
         public boolean isIp65504P549RntLocSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P549RntLocSCounter != sharedCounter;
            localIp65504P549RntLocSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_549_RNT_LOC_S_LEN = 2;
  	/**
	 * serializeIp65504P549RntLocS
	 */
	protected void serializeIp65504P549RntLocS(short ip65504P549RntLocS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P549RntLocS,IP_65504_P_549_RNT_LOC_S_LEN)
                  ,beginIp65504P549RntLocS
                  ,IP_65504_P_549_RNT_LOC_S_LEN
                 );
            localIp65504P549RntLocSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P549RntLocSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P549RntLocS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P549RntLocS() {	 
			return (getShort(beginIp65504P549RntLocS));
   	}
         int localIp65504P549RntLocLCounter = -1;
         public boolean isIp65504P549RntLocLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P549RntLocLCounter != sharedCounter;
            localIp65504P549RntLocLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_549_RNT_LOC_L_LEN = 2;
  	/**
	 * serializeIp65504P549RntLocL
	 */
	protected void serializeIp65504P549RntLocL(short ip65504P549RntLocL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P549RntLocL,IP_65504_P_549_RNT_LOC_L_LEN)
                  ,beginIp65504P549RntLocL
                  ,IP_65504_P_549_RNT_LOC_L_LEN
                 );
            localIp65504P549RntLocLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P549RntLocLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P549RntLocL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P549RntLocL() {	 
			return (getShort(beginIp65504P549RntLocL));
   	}
         int localIp65504P550RntRetSCounter = -1;
         public boolean isIp65504P550RntRetSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P550RntRetSCounter != sharedCounter;
            localIp65504P550RntRetSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_550_RNT_RET_S_LEN = 2;
  	/**
	 * serializeIp65504P550RntRetS
	 */
	protected void serializeIp65504P550RntRetS(short ip65504P550RntRetS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P550RntRetS,IP_65504_P_550_RNT_RET_S_LEN)
                  ,beginIp65504P550RntRetS
                  ,IP_65504_P_550_RNT_RET_S_LEN
                 );
            localIp65504P550RntRetSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P550RntRetSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P550RntRetS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P550RntRetS() {	 
			return (getShort(beginIp65504P550RntRetS));
   	}
         int localIp65504P550RntRetLCounter = -1;
         public boolean isIp65504P550RntRetLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P550RntRetLCounter != sharedCounter;
            localIp65504P550RntRetLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_550_RNT_RET_L_LEN = 2;
  	/**
	 * serializeIp65504P550RntRetL
	 */
	protected void serializeIp65504P550RntRetL(short ip65504P550RntRetL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P550RntRetL,IP_65504_P_550_RNT_RET_L_LEN)
                  ,beginIp65504P550RntRetL
                  ,IP_65504_P_550_RNT_RET_L_LEN
                 );
            localIp65504P550RntRetLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P550RntRetLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P550RntRetL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P550RntRetL() {	 
			return (getShort(beginIp65504P550RntRetL));
   	}
         int localIp65504P551RntChkSCounter = -1;
         public boolean isIp65504P551RntChkSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P551RntChkSCounter != sharedCounter;
            localIp65504P551RntChkSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_551_RNT_CHK_S_LEN = 2;
  	/**
	 * serializeIp65504P551RntChkS
	 */
	protected void serializeIp65504P551RntChkS(short ip65504P551RntChkS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P551RntChkS,IP_65504_P_551_RNT_CHK_S_LEN)
                  ,beginIp65504P551RntChkS
                  ,IP_65504_P_551_RNT_CHK_S_LEN
                 );
            localIp65504P551RntChkSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P551RntChkSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P551RntChkS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P551RntChkS() {	 
			return (getShort(beginIp65504P551RntChkS));
   	}
         int localIp65504P551RntChkLCounter = -1;
         public boolean isIp65504P551RntChkLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P551RntChkLCounter != sharedCounter;
            localIp65504P551RntChkLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_551_RNT_CHK_L_LEN = 2;
  	/**
	 * serializeIp65504P551RntChkL
	 */
	protected void serializeIp65504P551RntChkL(short ip65504P551RntChkL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P551RntChkL,IP_65504_P_551_RNT_CHK_L_LEN)
                  ,beginIp65504P551RntChkL
                  ,IP_65504_P_551_RNT_CHK_L_LEN
                 );
            localIp65504P551RntChkLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P551RntChkLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P551RntChkL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P551RntChkL() {	 
			return (getShort(beginIp65504P551RntChkL));
   	}
         int localIp65504P552CusSvcSCounter = -1;
         public boolean isIp65504P552CusSvcSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P552CusSvcSCounter != sharedCounter;
            localIp65504P552CusSvcSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_552_CUS_SVC_S_LEN = 2;
  	/**
	 * serializeIp65504P552CusSvcS
	 */
	protected void serializeIp65504P552CusSvcS(short ip65504P552CusSvcS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P552CusSvcS,IP_65504_P_552_CUS_SVC_S_LEN)
                  ,beginIp65504P552CusSvcS
                  ,IP_65504_P_552_CUS_SVC_S_LEN
                 );
            localIp65504P552CusSvcSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P552CusSvcSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P552CusSvcS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P552CusSvcS() {	 
			return (getShort(beginIp65504P552CusSvcS));
   	}
         int localIp65504P552CusSvcLCounter = -1;
         public boolean isIp65504P552CusSvcLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P552CusSvcLCounter != sharedCounter;
            localIp65504P552CusSvcLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_552_CUS_SVC_L_LEN = 2;
  	/**
	 * serializeIp65504P552CusSvcL
	 */
	protected void serializeIp65504P552CusSvcL(short ip65504P552CusSvcL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P552CusSvcL,IP_65504_P_552_CUS_SVC_L_LEN)
                  ,beginIp65504P552CusSvcL
                  ,IP_65504_P_552_CUS_SVC_L_LEN
                 );
            localIp65504P552CusSvcLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P552CusSvcLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P552CusSvcL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P552CusSvcL() {	 
			return (getShort(beginIp65504P552CusSvcL));
   	}
         int localIp65504P553RntRteSCounter = -1;
         public boolean isIp65504P553RntRteSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P553RntRteSCounter != sharedCounter;
            localIp65504P553RntRteSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_553_RNT_RTE_S_LEN = 2;
  	/**
	 * serializeIp65504P553RntRteS
	 */
	protected void serializeIp65504P553RntRteS(short ip65504P553RntRteS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P553RntRteS,IP_65504_P_553_RNT_RTE_S_LEN)
                  ,beginIp65504P553RntRteS
                  ,IP_65504_P_553_RNT_RTE_S_LEN
                 );
            localIp65504P553RntRteSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P553RntRteSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P553RntRteS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P553RntRteS() {	 
			return (getShort(beginIp65504P553RntRteS));
   	}
         int localIp65504P553RntRteLCounter = -1;
         public boolean isIp65504P553RntRteLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P553RntRteLCounter != sharedCounter;
            localIp65504P553RntRteLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_553_RNT_RTE_L_LEN = 2;
  	/**
	 * serializeIp65504P553RntRteL
	 */
	protected void serializeIp65504P553RntRteL(short ip65504P553RntRteL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P553RntRteL,IP_65504_P_553_RNT_RTE_L_LEN)
                  ,beginIp65504P553RntRteL
                  ,IP_65504_P_553_RNT_RTE_L_LEN
                 );
            localIp65504P553RntRteLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P553RntRteLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P553RntRteL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P553RntRteL() {	 
			return (getShort(beginIp65504P553RntRteL));
   	}
         int localIp65504P554ReservdSCounter = -1;
         public boolean isIp65504P554ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P554ReservdSCounter != sharedCounter;
            localIp65504P554ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_554_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P554ReservdS
	 */
	protected void serializeIp65504P554ReservdS(short ip65504P554ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P554ReservdS,IP_65504_P_554_RESERVD_S_LEN)
                  ,beginIp65504P554ReservdS
                  ,IP_65504_P_554_RESERVD_S_LEN
                 );
            localIp65504P554ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P554ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P554ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P554ReservdS() {	 
			return (getShort(beginIp65504P554ReservdS));
   	}
         int localIp65504P554ReservdLCounter = -1;
         public boolean isIp65504P554ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P554ReservdLCounter != sharedCounter;
            localIp65504P554ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_554_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P554ReservdL
	 */
	protected void serializeIp65504P554ReservdL(short ip65504P554ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P554ReservdL,IP_65504_P_554_RESERVD_L_LEN)
                  ,beginIp65504P554ReservdL
                  ,IP_65504_P_554_RESERVD_L_LEN
                 );
            localIp65504P554ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P554ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P554ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P554ReservdL() {	 
			return (getShort(beginIp65504P554ReservdL));
   	}
         int localIp65504P555RtPMlSCounter = -1;
         public boolean isIp65504P555RtPMlSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P555RtPMlSCounter != sharedCounter;
            localIp65504P555RtPMlSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_555_RT_PML_S_LEN = 2;
  	/**
	 * serializeIp65504P555RtPMlS
	 */
	protected void serializeIp65504P555RtPMlS(short ip65504P555RtPMlS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P555RtPMlS,IP_65504_P_555_RT_PML_S_LEN)
                  ,beginIp65504P555RtPMlS
                  ,IP_65504_P_555_RT_PML_S_LEN
                 );
            localIp65504P555RtPMlSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P555RtPMlSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P555RtPMlS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P555RtPMlS() {	 
			return (getShort(beginIp65504P555RtPMlS));
   	}
         int localIp65504P555RtPMlLCounter = -1;
         public boolean isIp65504P555RtPMlLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P555RtPMlLCounter != sharedCounter;
            localIp65504P555RtPMlLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_555_RT_PML_L_LEN = 2;
  	/**
	 * serializeIp65504P555RtPMlL
	 */
	protected void serializeIp65504P555RtPMlL(short ip65504P555RtPMlL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P555RtPMlL,IP_65504_P_555_RT_PML_L_LEN)
                  ,beginIp65504P555RtPMlL
                  ,IP_65504_P_555_RT_PML_L_LEN
                 );
            localIp65504P555RtPMlLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P555RtPMlLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P555RtPMlL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P555RtPMlL() {	 
			return (getShort(beginIp65504P555RtPMlL));
   	}
         int localIp65504P556TtlMlsSCounter = -1;
         public boolean isIp65504P556TtlMlsSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P556TtlMlsSCounter != sharedCounter;
            localIp65504P556TtlMlsSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_556_TTL_MLS_S_LEN = 2;
  	/**
	 * serializeIp65504P556TtlMlsS
	 */
	protected void serializeIp65504P556TtlMlsS(short ip65504P556TtlMlsS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P556TtlMlsS,IP_65504_P_556_TTL_MLS_S_LEN)
                  ,beginIp65504P556TtlMlsS
                  ,IP_65504_P_556_TTL_MLS_S_LEN
                 );
            localIp65504P556TtlMlsSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P556TtlMlsSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P556TtlMlsS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P556TtlMlsS() {	 
			return (getShort(beginIp65504P556TtlMlsS));
   	}
         int localIp65504P556TtlMlsLCounter = -1;
         public boolean isIp65504P556TtlMlsLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P556TtlMlsLCounter != sharedCounter;
            localIp65504P556TtlMlsLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_556_TTL_MLS_L_LEN = 2;
  	/**
	 * serializeIp65504P556TtlMlsL
	 */
	protected void serializeIp65504P556TtlMlsL(short ip65504P556TtlMlsL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P556TtlMlsL,IP_65504_P_556_TTL_MLS_L_LEN)
                  ,beginIp65504P556TtlMlsL
                  ,IP_65504_P_556_TTL_MLS_L_LEN
                 );
            localIp65504P556TtlMlsLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P556TtlMlsLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P556TtlMlsL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P556TtlMlsL() {	 
			return (getShort(beginIp65504P556TtlMlsL));
   	}
         int localIp65504P557MaxfreeSCounter = -1;
         public boolean isIp65504P557MaxfreeSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P557MaxfreeSCounter != sharedCounter;
            localIp65504P557MaxfreeSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_557_MAXFREE_S_LEN = 2;
  	/**
	 * serializeIp65504P557MaxfreeS
	 */
	protected void serializeIp65504P557MaxfreeS(short ip65504P557MaxfreeS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P557MaxfreeS,IP_65504_P_557_MAXFREE_S_LEN)
                  ,beginIp65504P557MaxfreeS
                  ,IP_65504_P_557_MAXFREE_S_LEN
                 );
            localIp65504P557MaxfreeSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P557MaxfreeSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P557MaxfreeS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P557MaxfreeS() {	 
			return (getShort(beginIp65504P557MaxfreeS));
   	}
         int localIp65504P557MaxfreeLCounter = -1;
         public boolean isIp65504P557MaxfreeLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P557MaxfreeLCounter != sharedCounter;
            localIp65504P557MaxfreeLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_557_MAXFREE_L_LEN = 2;
  	/**
	 * serializeIp65504P557MaxfreeL
	 */
	protected void serializeIp65504P557MaxfreeL(short ip65504P557MaxfreeL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P557MaxfreeL,IP_65504_P_557_MAXFREE_L_LEN)
                  ,beginIp65504P557MaxfreeL
                  ,IP_65504_P_557_MAXFREE_L_LEN
                 );
            localIp65504P557MaxfreeLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P557MaxfreeLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P557MaxfreeL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P557MaxfreeL() {	 
			return (getShort(beginIp65504P557MaxfreeL));
   	}
         int localIp65504P558MiKmISCounter = -1;
         public boolean isIp65504P558MiKmISModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P558MiKmISCounter != sharedCounter;
            localIp65504P558MiKmISCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_558_MI_KM_IS_LEN = 2;
  	/**
	 * serializeIp65504P558MiKmIS
	 */
	protected void serializeIp65504P558MiKmIS(short ip65504P558MiKmIS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P558MiKmIS,IP_65504_P_558_MI_KM_IS_LEN)
                  ,beginIp65504P558MiKmIS
                  ,IP_65504_P_558_MI_KM_IS_LEN
                 );
            localIp65504P558MiKmISCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P558MiKmISMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P558MiKmIS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P558MiKmIS() {	 
			return (getShort(beginIp65504P558MiKmIS));
   	}
         int localIp65504P558MiKmILCounter = -1;
         public boolean isIp65504P558MiKmILModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P558MiKmILCounter != sharedCounter;
            localIp65504P558MiKmILCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_558_MI_KM_IL_LEN = 2;
  	/**
	 * serializeIp65504P558MiKmIL
	 */
	protected void serializeIp65504P558MiKmIL(short ip65504P558MiKmIL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P558MiKmIL,IP_65504_P_558_MI_KM_IL_LEN)
                  ,beginIp65504P558MiKmIL
                  ,IP_65504_P_558_MI_KM_IL_LEN
                 );
            localIp65504P558MiKmILCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P558MiKmILMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P558MiKmIL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P558MiKmIL() {	 
			return (getShort(beginIp65504P558MiKmIL));
   	}




}
  
