package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip65504PdsNamesLargeGroup2Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:01. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip65504PdsNamesLargeGroup2Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip65504PdsNamesLargeGroup2Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_65504_PDS_NAMES_LARGE_GROUP_2_LENGTH = 248;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp65504P032ReservdS;
            protected  int beginIp65504P032ReservdL;
            protected  int beginIp65504P033ReservdS;
            protected  int beginIp65504P033ReservdL;
            protected  int beginIp65504P034ReservdS;
            protected  int beginIp65504P034ReservdL;
            protected  int beginIp65504P035AcqPsrS;
            protected  int beginIp65504P035AcqPsrL;
            protected  int beginIp65504P036IssCodS;
            protected  int beginIp65504P036IssCodL;
            protected  int beginIp65504P037CrdIssS;
            protected  int beginIp65504P037CrdIssL;
            protected  int beginIp65504P038ReservdS;
            protected  int beginIp65504P038ReservdL;
            protected  int beginIp65504P039ReservdS;
            protected  int beginIp65504P039ReservdL;
            protected  int beginIp65504P040ReservdS;
            protected  int beginIp65504P040ReservdL;
            protected  int beginIp65504P041ReservdS;
            protected  int beginIp65504P041ReservdL;
            protected  int beginIp65504P042PgmCodS;
            protected  int beginIp65504P042PgmCodL;
            protected  int beginIp65504P043PgmRegS;
            protected  int beginIp65504P043PgmRegL;
            protected  int beginIp65504P044ReservdS;
            protected  int beginIp65504P044ReservdL;
            protected  int beginIp65504P045ValAddS;
            protected  int beginIp65504P045ValAddL;
            protected  int beginIp65504P046ReservdS;
            protected  int beginIp65504P046ReservdL;
            protected  int beginIp65504P047CusNmeS;
            protected  int beginIp65504P047CusNmeL;
            protected  int beginIp65504P048ChbiadrS;
            protected  int beginIp65504P048ChbiadrL;
            protected  int beginIp65504P049ChspadrS;
            protected  int beginIp65504P049ChspadrL;
            protected  int beginIp65504P050CusId1S;
            protected  int beginIp65504P050CusId1L;
            protected  int beginIp65504P051CusId2S;
            protected  int beginIp65504P051CusId2L;
            protected  int beginIp65504P052CusActS;
            protected  int beginIp65504P052CusActL;
            protected  int beginIp65504P053CusDobS;
            protected  int beginIp65504P053CusDobL;
            protected  int beginIp65504P054ChdrVfS;
            protected  int beginIp65504P054ChdrVfL;
            protected  int beginIp65504P055MercIdS;
            protected  int beginIp65504P055MercIdL;
            protected  int beginIp65504P056ReservdS;
            protected  int beginIp65504P056ReservdL;
            protected  int beginIp65504P057ReservdS;
            protected  int beginIp65504P057ReservdL;
            protected  int beginIp65504P058ReservdS;
            protected  int beginIp65504P058ReservdL;
            protected  int beginIp65504P059ReservdS;
            protected  int beginIp65504P059ReservdL;
            protected  int beginIp65504P060ReservdS;
            protected  int beginIp65504P060ReservdL;
            protected  int beginIp65504P061RefTelS;
            protected  int beginIp65504P061RefTelL;
            protected  int beginIp65504P062ReservdS;
            protected  int beginIp65504P062ReservdL;
	
	/**
	* Constructor for Ip65504PdsNamesLargeGroup2Serialized
	**/
    public Ip65504PdsNamesLargeGroup2Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ip65504PdsNamesLargeGroup2Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip65504PdsNamesLargeGroup2Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ip65504PdsNamesLargeGroup2Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,244); // serialize this field at offset 244 by default 
    }
    
	/**
	* sets parent for this Ip65504PdsNamesLargeGroup2Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 244 by default
    }    
	/**
	* initializes the field in Ip65504PdsNamesLargeGroup2Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_65504_PDS_NAMES_LARGE_GROUP_2_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp65504P032ReservdS = getStartOffset() + 4;	// set offset for serialization
  
             beginIp65504P032ReservdL = getStartOffset() + 6;	// set offset for serialization
  
  
             beginIp65504P033ReservdS = getStartOffset() + 12;	// set offset for serialization
  
             beginIp65504P033ReservdL = getStartOffset() + 14;	// set offset for serialization
  
  
             beginIp65504P034ReservdS = getStartOffset() + 20;	// set offset for serialization
  
             beginIp65504P034ReservdL = getStartOffset() + 22;	// set offset for serialization
  
  
             beginIp65504P035AcqPsrS = getStartOffset() + 28;	// set offset for serialization
  
             beginIp65504P035AcqPsrL = getStartOffset() + 30;	// set offset for serialization
  
  
             beginIp65504P036IssCodS = getStartOffset() + 36;	// set offset for serialization
  
             beginIp65504P036IssCodL = getStartOffset() + 38;	// set offset for serialization
  
  
             beginIp65504P037CrdIssS = getStartOffset() + 44;	// set offset for serialization
  
             beginIp65504P037CrdIssL = getStartOffset() + 46;	// set offset for serialization
  
  
             beginIp65504P038ReservdS = getStartOffset() + 52;	// set offset for serialization
  
             beginIp65504P038ReservdL = getStartOffset() + 54;	// set offset for serialization
  
  
             beginIp65504P039ReservdS = getStartOffset() + 60;	// set offset for serialization
  
             beginIp65504P039ReservdL = getStartOffset() + 62;	// set offset for serialization
  
  
             beginIp65504P040ReservdS = getStartOffset() + 68;	// set offset for serialization
  
             beginIp65504P040ReservdL = getStartOffset() + 70;	// set offset for serialization
  
  
             beginIp65504P041ReservdS = getStartOffset() + 76;	// set offset for serialization
  
             beginIp65504P041ReservdL = getStartOffset() + 78;	// set offset for serialization
  
  
             beginIp65504P042PgmCodS = getStartOffset() + 84;	// set offset for serialization
  
             beginIp65504P042PgmCodL = getStartOffset() + 86;	// set offset for serialization
  
  
             beginIp65504P043PgmRegS = getStartOffset() + 92;	// set offset for serialization
  
             beginIp65504P043PgmRegL = getStartOffset() + 94;	// set offset for serialization
  
  
             beginIp65504P044ReservdS = getStartOffset() + 100;	// set offset for serialization
  
             beginIp65504P044ReservdL = getStartOffset() + 102;	// set offset for serialization
  
  
             beginIp65504P045ValAddS = getStartOffset() + 108;	// set offset for serialization
  
             beginIp65504P045ValAddL = getStartOffset() + 110;	// set offset for serialization
  
  
             beginIp65504P046ReservdS = getStartOffset() + 116;	// set offset for serialization
  
             beginIp65504P046ReservdL = getStartOffset() + 118;	// set offset for serialization
  
  
             beginIp65504P047CusNmeS = getStartOffset() + 124;	// set offset for serialization
  
             beginIp65504P047CusNmeL = getStartOffset() + 126;	// set offset for serialization
  
  
             beginIp65504P048ChbiadrS = getStartOffset() + 132;	// set offset for serialization
  
             beginIp65504P048ChbiadrL = getStartOffset() + 134;	// set offset for serialization
  
  
             beginIp65504P049ChspadrS = getStartOffset() + 140;	// set offset for serialization
  
             beginIp65504P049ChspadrL = getStartOffset() + 142;	// set offset for serialization
  
  
             beginIp65504P050CusId1S = getStartOffset() + 148;	// set offset for serialization
  
             beginIp65504P050CusId1L = getStartOffset() + 150;	// set offset for serialization
  
  
             beginIp65504P051CusId2S = getStartOffset() + 156;	// set offset for serialization
  
             beginIp65504P051CusId2L = getStartOffset() + 158;	// set offset for serialization
  
  
             beginIp65504P052CusActS = getStartOffset() + 164;	// set offset for serialization
  
             beginIp65504P052CusActL = getStartOffset() + 166;	// set offset for serialization
  
  
             beginIp65504P053CusDobS = getStartOffset() + 172;	// set offset for serialization
  
             beginIp65504P053CusDobL = getStartOffset() + 174;	// set offset for serialization
  
  
             beginIp65504P054ChdrVfS = getStartOffset() + 180;	// set offset for serialization
  
             beginIp65504P054ChdrVfL = getStartOffset() + 182;	// set offset for serialization
  
  
             beginIp65504P055MercIdS = getStartOffset() + 188;	// set offset for serialization
  
             beginIp65504P055MercIdL = getStartOffset() + 190;	// set offset for serialization
  
  
             beginIp65504P056ReservdS = getStartOffset() + 196;	// set offset for serialization
  
             beginIp65504P056ReservdL = getStartOffset() + 198;	// set offset for serialization
  
  
             beginIp65504P057ReservdS = getStartOffset() + 204;	// set offset for serialization
  
             beginIp65504P057ReservdL = getStartOffset() + 206;	// set offset for serialization
  
  
             beginIp65504P058ReservdS = getStartOffset() + 212;	// set offset for serialization
  
             beginIp65504P058ReservdL = getStartOffset() + 214;	// set offset for serialization
  
  
             beginIp65504P059ReservdS = getStartOffset() + 220;	// set offset for serialization
  
             beginIp65504P059ReservdL = getStartOffset() + 222;	// set offset for serialization
  
  
             beginIp65504P060ReservdS = getStartOffset() + 228;	// set offset for serialization
  
             beginIp65504P060ReservdL = getStartOffset() + 230;	// set offset for serialization
  
  
             beginIp65504P061RefTelS = getStartOffset() + 236;	// set offset for serialization
  
             beginIp65504P061RefTelL = getStartOffset() + 238;	// set offset for serialization
  
  
             beginIp65504P062ReservdS = getStartOffset() + 244;	// set offset for serialization
  
             beginIp65504P062ReservdL = getStartOffset() + 246;	// set offset for serialization
  
  
	   /*  end of offset */
	}
         int localIp65504P032ReservdSCounter = -1;
         public boolean isIp65504P032ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P032ReservdSCounter != sharedCounter;
            localIp65504P032ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_032_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P032ReservdS
	 */
	protected void serializeIp65504P032ReservdS(short ip65504P032ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P032ReservdS,IP_65504_P_032_RESERVD_S_LEN)
                  ,beginIp65504P032ReservdS
                  ,IP_65504_P_032_RESERVD_S_LEN
                 );
            localIp65504P032ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P032ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P032ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P032ReservdS() {	 
			return (getShort(beginIp65504P032ReservdS));
   	}
         int localIp65504P032ReservdLCounter = -1;
         public boolean isIp65504P032ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P032ReservdLCounter != sharedCounter;
            localIp65504P032ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_032_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P032ReservdL
	 */
	protected void serializeIp65504P032ReservdL(short ip65504P032ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P032ReservdL,IP_65504_P_032_RESERVD_L_LEN)
                  ,beginIp65504P032ReservdL
                  ,IP_65504_P_032_RESERVD_L_LEN
                 );
            localIp65504P032ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P032ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P032ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P032ReservdL() {	 
			return (getShort(beginIp65504P032ReservdL));
   	}
         int localIp65504P033ReservdSCounter = -1;
         public boolean isIp65504P033ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P033ReservdSCounter != sharedCounter;
            localIp65504P033ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_033_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P033ReservdS
	 */
	protected void serializeIp65504P033ReservdS(short ip65504P033ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P033ReservdS,IP_65504_P_033_RESERVD_S_LEN)
                  ,beginIp65504P033ReservdS
                  ,IP_65504_P_033_RESERVD_S_LEN
                 );
            localIp65504P033ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P033ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P033ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P033ReservdS() {	 
			return (getShort(beginIp65504P033ReservdS));
   	}
         int localIp65504P033ReservdLCounter = -1;
         public boolean isIp65504P033ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P033ReservdLCounter != sharedCounter;
            localIp65504P033ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_033_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P033ReservdL
	 */
	protected void serializeIp65504P033ReservdL(short ip65504P033ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P033ReservdL,IP_65504_P_033_RESERVD_L_LEN)
                  ,beginIp65504P033ReservdL
                  ,IP_65504_P_033_RESERVD_L_LEN
                 );
            localIp65504P033ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P033ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P033ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P033ReservdL() {	 
			return (getShort(beginIp65504P033ReservdL));
   	}
         int localIp65504P034ReservdSCounter = -1;
         public boolean isIp65504P034ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P034ReservdSCounter != sharedCounter;
            localIp65504P034ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_034_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P034ReservdS
	 */
	protected void serializeIp65504P034ReservdS(short ip65504P034ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P034ReservdS,IP_65504_P_034_RESERVD_S_LEN)
                  ,beginIp65504P034ReservdS
                  ,IP_65504_P_034_RESERVD_S_LEN
                 );
            localIp65504P034ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P034ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P034ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P034ReservdS() {	 
			return (getShort(beginIp65504P034ReservdS));
   	}
         int localIp65504P034ReservdLCounter = -1;
         public boolean isIp65504P034ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P034ReservdLCounter != sharedCounter;
            localIp65504P034ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_034_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P034ReservdL
	 */
	protected void serializeIp65504P034ReservdL(short ip65504P034ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P034ReservdL,IP_65504_P_034_RESERVD_L_LEN)
                  ,beginIp65504P034ReservdL
                  ,IP_65504_P_034_RESERVD_L_LEN
                 );
            localIp65504P034ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P034ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P034ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P034ReservdL() {	 
			return (getShort(beginIp65504P034ReservdL));
   	}
         int localIp65504P035AcqPsrSCounter = -1;
         public boolean isIp65504P035AcqPsrSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P035AcqPsrSCounter != sharedCounter;
            localIp65504P035AcqPsrSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_035_ACQ_PSR_S_LEN = 2;
  	/**
	 * serializeIp65504P035AcqPsrS
	 */
	protected void serializeIp65504P035AcqPsrS(short ip65504P035AcqPsrS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P035AcqPsrS,IP_65504_P_035_ACQ_PSR_S_LEN)
                  ,beginIp65504P035AcqPsrS
                  ,IP_65504_P_035_ACQ_PSR_S_LEN
                 );
            localIp65504P035AcqPsrSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P035AcqPsrSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P035AcqPsrS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P035AcqPsrS() {	 
			return (getShort(beginIp65504P035AcqPsrS));
   	}
         int localIp65504P035AcqPsrLCounter = -1;
         public boolean isIp65504P035AcqPsrLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P035AcqPsrLCounter != sharedCounter;
            localIp65504P035AcqPsrLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_035_ACQ_PSR_L_LEN = 2;
  	/**
	 * serializeIp65504P035AcqPsrL
	 */
	protected void serializeIp65504P035AcqPsrL(short ip65504P035AcqPsrL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P035AcqPsrL,IP_65504_P_035_ACQ_PSR_L_LEN)
                  ,beginIp65504P035AcqPsrL
                  ,IP_65504_P_035_ACQ_PSR_L_LEN
                 );
            localIp65504P035AcqPsrLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P035AcqPsrLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P035AcqPsrL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P035AcqPsrL() {	 
			return (getShort(beginIp65504P035AcqPsrL));
   	}
         int localIp65504P036IssCodSCounter = -1;
         public boolean isIp65504P036IssCodSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P036IssCodSCounter != sharedCounter;
            localIp65504P036IssCodSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_036_ISS_COD_S_LEN = 2;
  	/**
	 * serializeIp65504P036IssCodS
	 */
	protected void serializeIp65504P036IssCodS(short ip65504P036IssCodS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P036IssCodS,IP_65504_P_036_ISS_COD_S_LEN)
                  ,beginIp65504P036IssCodS
                  ,IP_65504_P_036_ISS_COD_S_LEN
                 );
            localIp65504P036IssCodSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P036IssCodSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P036IssCodS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P036IssCodS() {	 
			return (getShort(beginIp65504P036IssCodS));
   	}
         int localIp65504P036IssCodLCounter = -1;
         public boolean isIp65504P036IssCodLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P036IssCodLCounter != sharedCounter;
            localIp65504P036IssCodLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_036_ISS_COD_L_LEN = 2;
  	/**
	 * serializeIp65504P036IssCodL
	 */
	protected void serializeIp65504P036IssCodL(short ip65504P036IssCodL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P036IssCodL,IP_65504_P_036_ISS_COD_L_LEN)
                  ,beginIp65504P036IssCodL
                  ,IP_65504_P_036_ISS_COD_L_LEN
                 );
            localIp65504P036IssCodLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P036IssCodLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P036IssCodL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P036IssCodL() {	 
			return (getShort(beginIp65504P036IssCodL));
   	}
         int localIp65504P037CrdIssSCounter = -1;
         public boolean isIp65504P037CrdIssSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P037CrdIssSCounter != sharedCounter;
            localIp65504P037CrdIssSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_037_CRD_ISS_S_LEN = 2;
  	/**
	 * serializeIp65504P037CrdIssS
	 */
	protected void serializeIp65504P037CrdIssS(short ip65504P037CrdIssS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P037CrdIssS,IP_65504_P_037_CRD_ISS_S_LEN)
                  ,beginIp65504P037CrdIssS
                  ,IP_65504_P_037_CRD_ISS_S_LEN
                 );
            localIp65504P037CrdIssSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P037CrdIssSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P037CrdIssS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P037CrdIssS() {	 
			return (getShort(beginIp65504P037CrdIssS));
   	}
         int localIp65504P037CrdIssLCounter = -1;
         public boolean isIp65504P037CrdIssLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P037CrdIssLCounter != sharedCounter;
            localIp65504P037CrdIssLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_037_CRD_ISS_L_LEN = 2;
  	/**
	 * serializeIp65504P037CrdIssL
	 */
	protected void serializeIp65504P037CrdIssL(short ip65504P037CrdIssL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P037CrdIssL,IP_65504_P_037_CRD_ISS_L_LEN)
                  ,beginIp65504P037CrdIssL
                  ,IP_65504_P_037_CRD_ISS_L_LEN
                 );
            localIp65504P037CrdIssLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P037CrdIssLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P037CrdIssL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P037CrdIssL() {	 
			return (getShort(beginIp65504P037CrdIssL));
   	}
         int localIp65504P038ReservdSCounter = -1;
         public boolean isIp65504P038ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P038ReservdSCounter != sharedCounter;
            localIp65504P038ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_038_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P038ReservdS
	 */
	protected void serializeIp65504P038ReservdS(short ip65504P038ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P038ReservdS,IP_65504_P_038_RESERVD_S_LEN)
                  ,beginIp65504P038ReservdS
                  ,IP_65504_P_038_RESERVD_S_LEN
                 );
            localIp65504P038ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P038ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P038ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P038ReservdS() {	 
			return (getShort(beginIp65504P038ReservdS));
   	}
         int localIp65504P038ReservdLCounter = -1;
         public boolean isIp65504P038ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P038ReservdLCounter != sharedCounter;
            localIp65504P038ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_038_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P038ReservdL
	 */
	protected void serializeIp65504P038ReservdL(short ip65504P038ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P038ReservdL,IP_65504_P_038_RESERVD_L_LEN)
                  ,beginIp65504P038ReservdL
                  ,IP_65504_P_038_RESERVD_L_LEN
                 );
            localIp65504P038ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P038ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P038ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P038ReservdL() {	 
			return (getShort(beginIp65504P038ReservdL));
   	}
         int localIp65504P039ReservdSCounter = -1;
         public boolean isIp65504P039ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P039ReservdSCounter != sharedCounter;
            localIp65504P039ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_039_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P039ReservdS
	 */
	protected void serializeIp65504P039ReservdS(short ip65504P039ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P039ReservdS,IP_65504_P_039_RESERVD_S_LEN)
                  ,beginIp65504P039ReservdS
                  ,IP_65504_P_039_RESERVD_S_LEN
                 );
            localIp65504P039ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P039ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P039ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P039ReservdS() {	 
			return (getShort(beginIp65504P039ReservdS));
   	}
         int localIp65504P039ReservdLCounter = -1;
         public boolean isIp65504P039ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P039ReservdLCounter != sharedCounter;
            localIp65504P039ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_039_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P039ReservdL
	 */
	protected void serializeIp65504P039ReservdL(short ip65504P039ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P039ReservdL,IP_65504_P_039_RESERVD_L_LEN)
                  ,beginIp65504P039ReservdL
                  ,IP_65504_P_039_RESERVD_L_LEN
                 );
            localIp65504P039ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P039ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P039ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P039ReservdL() {	 
			return (getShort(beginIp65504P039ReservdL));
   	}
         int localIp65504P040ReservdSCounter = -1;
         public boolean isIp65504P040ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P040ReservdSCounter != sharedCounter;
            localIp65504P040ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_040_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P040ReservdS
	 */
	protected void serializeIp65504P040ReservdS(short ip65504P040ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P040ReservdS,IP_65504_P_040_RESERVD_S_LEN)
                  ,beginIp65504P040ReservdS
                  ,IP_65504_P_040_RESERVD_S_LEN
                 );
            localIp65504P040ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P040ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P040ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P040ReservdS() {	 
			return (getShort(beginIp65504P040ReservdS));
   	}
         int localIp65504P040ReservdLCounter = -1;
         public boolean isIp65504P040ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P040ReservdLCounter != sharedCounter;
            localIp65504P040ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_040_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P040ReservdL
	 */
	protected void serializeIp65504P040ReservdL(short ip65504P040ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P040ReservdL,IP_65504_P_040_RESERVD_L_LEN)
                  ,beginIp65504P040ReservdL
                  ,IP_65504_P_040_RESERVD_L_LEN
                 );
            localIp65504P040ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P040ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P040ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P040ReservdL() {	 
			return (getShort(beginIp65504P040ReservdL));
   	}
         int localIp65504P041ReservdSCounter = -1;
         public boolean isIp65504P041ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P041ReservdSCounter != sharedCounter;
            localIp65504P041ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_041_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P041ReservdS
	 */
	protected void serializeIp65504P041ReservdS(short ip65504P041ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P041ReservdS,IP_65504_P_041_RESERVD_S_LEN)
                  ,beginIp65504P041ReservdS
                  ,IP_65504_P_041_RESERVD_S_LEN
                 );
            localIp65504P041ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P041ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P041ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P041ReservdS() {	 
			return (getShort(beginIp65504P041ReservdS));
   	}
         int localIp65504P041ReservdLCounter = -1;
         public boolean isIp65504P041ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P041ReservdLCounter != sharedCounter;
            localIp65504P041ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_041_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P041ReservdL
	 */
	protected void serializeIp65504P041ReservdL(short ip65504P041ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P041ReservdL,IP_65504_P_041_RESERVD_L_LEN)
                  ,beginIp65504P041ReservdL
                  ,IP_65504_P_041_RESERVD_L_LEN
                 );
            localIp65504P041ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P041ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P041ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P041ReservdL() {	 
			return (getShort(beginIp65504P041ReservdL));
   	}
         int localIp65504P042PgmCodSCounter = -1;
         public boolean isIp65504P042PgmCodSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P042PgmCodSCounter != sharedCounter;
            localIp65504P042PgmCodSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_042_PGM_COD_S_LEN = 2;
  	/**
	 * serializeIp65504P042PgmCodS
	 */
	protected void serializeIp65504P042PgmCodS(short ip65504P042PgmCodS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P042PgmCodS,IP_65504_P_042_PGM_COD_S_LEN)
                  ,beginIp65504P042PgmCodS
                  ,IP_65504_P_042_PGM_COD_S_LEN
                 );
            localIp65504P042PgmCodSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P042PgmCodSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P042PgmCodS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P042PgmCodS() {	 
			return (getShort(beginIp65504P042PgmCodS));
   	}
         int localIp65504P042PgmCodLCounter = -1;
         public boolean isIp65504P042PgmCodLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P042PgmCodLCounter != sharedCounter;
            localIp65504P042PgmCodLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_042_PGM_COD_L_LEN = 2;
  	/**
	 * serializeIp65504P042PgmCodL
	 */
	protected void serializeIp65504P042PgmCodL(short ip65504P042PgmCodL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P042PgmCodL,IP_65504_P_042_PGM_COD_L_LEN)
                  ,beginIp65504P042PgmCodL
                  ,IP_65504_P_042_PGM_COD_L_LEN
                 );
            localIp65504P042PgmCodLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P042PgmCodLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P042PgmCodL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P042PgmCodL() {	 
			return (getShort(beginIp65504P042PgmCodL));
   	}
         int localIp65504P043PgmRegSCounter = -1;
         public boolean isIp65504P043PgmRegSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P043PgmRegSCounter != sharedCounter;
            localIp65504P043PgmRegSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_043_PGM_REG_S_LEN = 2;
  	/**
	 * serializeIp65504P043PgmRegS
	 */
	protected void serializeIp65504P043PgmRegS(short ip65504P043PgmRegS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P043PgmRegS,IP_65504_P_043_PGM_REG_S_LEN)
                  ,beginIp65504P043PgmRegS
                  ,IP_65504_P_043_PGM_REG_S_LEN
                 );
            localIp65504P043PgmRegSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P043PgmRegSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P043PgmRegS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P043PgmRegS() {	 
			return (getShort(beginIp65504P043PgmRegS));
   	}
         int localIp65504P043PgmRegLCounter = -1;
         public boolean isIp65504P043PgmRegLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P043PgmRegLCounter != sharedCounter;
            localIp65504P043PgmRegLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_043_PGM_REG_L_LEN = 2;
  	/**
	 * serializeIp65504P043PgmRegL
	 */
	protected void serializeIp65504P043PgmRegL(short ip65504P043PgmRegL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P043PgmRegL,IP_65504_P_043_PGM_REG_L_LEN)
                  ,beginIp65504P043PgmRegL
                  ,IP_65504_P_043_PGM_REG_L_LEN
                 );
            localIp65504P043PgmRegLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P043PgmRegLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P043PgmRegL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P043PgmRegL() {	 
			return (getShort(beginIp65504P043PgmRegL));
   	}
         int localIp65504P044ReservdSCounter = -1;
         public boolean isIp65504P044ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P044ReservdSCounter != sharedCounter;
            localIp65504P044ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_044_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P044ReservdS
	 */
	protected void serializeIp65504P044ReservdS(short ip65504P044ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P044ReservdS,IP_65504_P_044_RESERVD_S_LEN)
                  ,beginIp65504P044ReservdS
                  ,IP_65504_P_044_RESERVD_S_LEN
                 );
            localIp65504P044ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P044ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P044ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P044ReservdS() {	 
			return (getShort(beginIp65504P044ReservdS));
   	}
         int localIp65504P044ReservdLCounter = -1;
         public boolean isIp65504P044ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P044ReservdLCounter != sharedCounter;
            localIp65504P044ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_044_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P044ReservdL
	 */
	protected void serializeIp65504P044ReservdL(short ip65504P044ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P044ReservdL,IP_65504_P_044_RESERVD_L_LEN)
                  ,beginIp65504P044ReservdL
                  ,IP_65504_P_044_RESERVD_L_LEN
                 );
            localIp65504P044ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P044ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P044ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P044ReservdL() {	 
			return (getShort(beginIp65504P044ReservdL));
   	}
         int localIp65504P045ValAddSCounter = -1;
         public boolean isIp65504P045ValAddSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P045ValAddSCounter != sharedCounter;
            localIp65504P045ValAddSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_045_VAL_ADD_S_LEN = 2;
  	/**
	 * serializeIp65504P045ValAddS
	 */
	protected void serializeIp65504P045ValAddS(short ip65504P045ValAddS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P045ValAddS,IP_65504_P_045_VAL_ADD_S_LEN)
                  ,beginIp65504P045ValAddS
                  ,IP_65504_P_045_VAL_ADD_S_LEN
                 );
            localIp65504P045ValAddSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P045ValAddSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P045ValAddS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P045ValAddS() {	 
			return (getShort(beginIp65504P045ValAddS));
   	}
         int localIp65504P045ValAddLCounter = -1;
         public boolean isIp65504P045ValAddLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P045ValAddLCounter != sharedCounter;
            localIp65504P045ValAddLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_045_VAL_ADD_L_LEN = 2;
  	/**
	 * serializeIp65504P045ValAddL
	 */
	protected void serializeIp65504P045ValAddL(short ip65504P045ValAddL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P045ValAddL,IP_65504_P_045_VAL_ADD_L_LEN)
                  ,beginIp65504P045ValAddL
                  ,IP_65504_P_045_VAL_ADD_L_LEN
                 );
            localIp65504P045ValAddLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P045ValAddLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P045ValAddL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P045ValAddL() {	 
			return (getShort(beginIp65504P045ValAddL));
   	}
         int localIp65504P046ReservdSCounter = -1;
         public boolean isIp65504P046ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P046ReservdSCounter != sharedCounter;
            localIp65504P046ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_046_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P046ReservdS
	 */
	protected void serializeIp65504P046ReservdS(short ip65504P046ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P046ReservdS,IP_65504_P_046_RESERVD_S_LEN)
                  ,beginIp65504P046ReservdS
                  ,IP_65504_P_046_RESERVD_S_LEN
                 );
            localIp65504P046ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P046ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P046ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P046ReservdS() {	 
			return (getShort(beginIp65504P046ReservdS));
   	}
         int localIp65504P046ReservdLCounter = -1;
         public boolean isIp65504P046ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P046ReservdLCounter != sharedCounter;
            localIp65504P046ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_046_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P046ReservdL
	 */
	protected void serializeIp65504P046ReservdL(short ip65504P046ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P046ReservdL,IP_65504_P_046_RESERVD_L_LEN)
                  ,beginIp65504P046ReservdL
                  ,IP_65504_P_046_RESERVD_L_LEN
                 );
            localIp65504P046ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P046ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P046ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P046ReservdL() {	 
			return (getShort(beginIp65504P046ReservdL));
   	}
         int localIp65504P047CusNmeSCounter = -1;
         public boolean isIp65504P047CusNmeSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P047CusNmeSCounter != sharedCounter;
            localIp65504P047CusNmeSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_047_CUS_NME_S_LEN = 2;
  	/**
	 * serializeIp65504P047CusNmeS
	 */
	protected void serializeIp65504P047CusNmeS(short ip65504P047CusNmeS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P047CusNmeS,IP_65504_P_047_CUS_NME_S_LEN)
                  ,beginIp65504P047CusNmeS
                  ,IP_65504_P_047_CUS_NME_S_LEN
                 );
            localIp65504P047CusNmeSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P047CusNmeSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P047CusNmeS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P047CusNmeS() {	 
			return (getShort(beginIp65504P047CusNmeS));
   	}
         int localIp65504P047CusNmeLCounter = -1;
         public boolean isIp65504P047CusNmeLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P047CusNmeLCounter != sharedCounter;
            localIp65504P047CusNmeLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_047_CUS_NME_L_LEN = 2;
  	/**
	 * serializeIp65504P047CusNmeL
	 */
	protected void serializeIp65504P047CusNmeL(short ip65504P047CusNmeL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P047CusNmeL,IP_65504_P_047_CUS_NME_L_LEN)
                  ,beginIp65504P047CusNmeL
                  ,IP_65504_P_047_CUS_NME_L_LEN
                 );
            localIp65504P047CusNmeLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P047CusNmeLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P047CusNmeL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P047CusNmeL() {	 
			return (getShort(beginIp65504P047CusNmeL));
   	}
         int localIp65504P048ChbiadrSCounter = -1;
         public boolean isIp65504P048ChbiadrSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P048ChbiadrSCounter != sharedCounter;
            localIp65504P048ChbiadrSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_048_CHBIADR_S_LEN = 2;
  	/**
	 * serializeIp65504P048ChbiadrS
	 */
	protected void serializeIp65504P048ChbiadrS(short ip65504P048ChbiadrS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P048ChbiadrS,IP_65504_P_048_CHBIADR_S_LEN)
                  ,beginIp65504P048ChbiadrS
                  ,IP_65504_P_048_CHBIADR_S_LEN
                 );
            localIp65504P048ChbiadrSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P048ChbiadrSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P048ChbiadrS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P048ChbiadrS() {	 
			return (getShort(beginIp65504P048ChbiadrS));
   	}
         int localIp65504P048ChbiadrLCounter = -1;
         public boolean isIp65504P048ChbiadrLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P048ChbiadrLCounter != sharedCounter;
            localIp65504P048ChbiadrLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_048_CHBIADR_L_LEN = 2;
  	/**
	 * serializeIp65504P048ChbiadrL
	 */
	protected void serializeIp65504P048ChbiadrL(short ip65504P048ChbiadrL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P048ChbiadrL,IP_65504_P_048_CHBIADR_L_LEN)
                  ,beginIp65504P048ChbiadrL
                  ,IP_65504_P_048_CHBIADR_L_LEN
                 );
            localIp65504P048ChbiadrLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P048ChbiadrLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P048ChbiadrL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P048ChbiadrL() {	 
			return (getShort(beginIp65504P048ChbiadrL));
   	}
         int localIp65504P049ChspadrSCounter = -1;
         public boolean isIp65504P049ChspadrSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P049ChspadrSCounter != sharedCounter;
            localIp65504P049ChspadrSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_049_CHSPADR_S_LEN = 2;
  	/**
	 * serializeIp65504P049ChspadrS
	 */
	protected void serializeIp65504P049ChspadrS(short ip65504P049ChspadrS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P049ChspadrS,IP_65504_P_049_CHSPADR_S_LEN)
                  ,beginIp65504P049ChspadrS
                  ,IP_65504_P_049_CHSPADR_S_LEN
                 );
            localIp65504P049ChspadrSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P049ChspadrSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P049ChspadrS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P049ChspadrS() {	 
			return (getShort(beginIp65504P049ChspadrS));
   	}
         int localIp65504P049ChspadrLCounter = -1;
         public boolean isIp65504P049ChspadrLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P049ChspadrLCounter != sharedCounter;
            localIp65504P049ChspadrLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_049_CHSPADR_L_LEN = 2;
  	/**
	 * serializeIp65504P049ChspadrL
	 */
	protected void serializeIp65504P049ChspadrL(short ip65504P049ChspadrL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P049ChspadrL,IP_65504_P_049_CHSPADR_L_LEN)
                  ,beginIp65504P049ChspadrL
                  ,IP_65504_P_049_CHSPADR_L_LEN
                 );
            localIp65504P049ChspadrLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P049ChspadrLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P049ChspadrL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P049ChspadrL() {	 
			return (getShort(beginIp65504P049ChspadrL));
   	}
         int localIp65504P050CusId1SCounter = -1;
         public boolean isIp65504P050CusId1SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P050CusId1SCounter != sharedCounter;
            localIp65504P050CusId1SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_050_CUS_ID_1_S_LEN = 2;
  	/**
	 * serializeIp65504P050CusId1S
	 */
	protected void serializeIp65504P050CusId1S(short ip65504P050CusId1S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P050CusId1S,IP_65504_P_050_CUS_ID_1_S_LEN)
                  ,beginIp65504P050CusId1S
                  ,IP_65504_P_050_CUS_ID_1_S_LEN
                 );
            localIp65504P050CusId1SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P050CusId1SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P050CusId1S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P050CusId1S() {	 
			return (getShort(beginIp65504P050CusId1S));
   	}
         int localIp65504P050CusId1LCounter = -1;
         public boolean isIp65504P050CusId1LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P050CusId1LCounter != sharedCounter;
            localIp65504P050CusId1LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_050_CUS_ID_1_L_LEN = 2;
  	/**
	 * serializeIp65504P050CusId1L
	 */
	protected void serializeIp65504P050CusId1L(short ip65504P050CusId1L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P050CusId1L,IP_65504_P_050_CUS_ID_1_L_LEN)
                  ,beginIp65504P050CusId1L
                  ,IP_65504_P_050_CUS_ID_1_L_LEN
                 );
            localIp65504P050CusId1LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P050CusId1LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P050CusId1L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P050CusId1L() {	 
			return (getShort(beginIp65504P050CusId1L));
   	}
         int localIp65504P051CusId2SCounter = -1;
         public boolean isIp65504P051CusId2SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P051CusId2SCounter != sharedCounter;
            localIp65504P051CusId2SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_051_CUS_ID_2_S_LEN = 2;
  	/**
	 * serializeIp65504P051CusId2S
	 */
	protected void serializeIp65504P051CusId2S(short ip65504P051CusId2S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P051CusId2S,IP_65504_P_051_CUS_ID_2_S_LEN)
                  ,beginIp65504P051CusId2S
                  ,IP_65504_P_051_CUS_ID_2_S_LEN
                 );
            localIp65504P051CusId2SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P051CusId2SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P051CusId2S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P051CusId2S() {	 
			return (getShort(beginIp65504P051CusId2S));
   	}
         int localIp65504P051CusId2LCounter = -1;
         public boolean isIp65504P051CusId2LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P051CusId2LCounter != sharedCounter;
            localIp65504P051CusId2LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_051_CUS_ID_2_L_LEN = 2;
  	/**
	 * serializeIp65504P051CusId2L
	 */
	protected void serializeIp65504P051CusId2L(short ip65504P051CusId2L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P051CusId2L,IP_65504_P_051_CUS_ID_2_L_LEN)
                  ,beginIp65504P051CusId2L
                  ,IP_65504_P_051_CUS_ID_2_L_LEN
                 );
            localIp65504P051CusId2LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P051CusId2LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P051CusId2L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P051CusId2L() {	 
			return (getShort(beginIp65504P051CusId2L));
   	}
         int localIp65504P052CusActSCounter = -1;
         public boolean isIp65504P052CusActSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P052CusActSCounter != sharedCounter;
            localIp65504P052CusActSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_052_CUS_ACT_S_LEN = 2;
  	/**
	 * serializeIp65504P052CusActS
	 */
	protected void serializeIp65504P052CusActS(short ip65504P052CusActS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P052CusActS,IP_65504_P_052_CUS_ACT_S_LEN)
                  ,beginIp65504P052CusActS
                  ,IP_65504_P_052_CUS_ACT_S_LEN
                 );
            localIp65504P052CusActSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P052CusActSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P052CusActS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P052CusActS() {	 
			return (getShort(beginIp65504P052CusActS));
   	}
         int localIp65504P052CusActLCounter = -1;
         public boolean isIp65504P052CusActLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P052CusActLCounter != sharedCounter;
            localIp65504P052CusActLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_052_CUS_ACT_L_LEN = 2;
  	/**
	 * serializeIp65504P052CusActL
	 */
	protected void serializeIp65504P052CusActL(short ip65504P052CusActL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P052CusActL,IP_65504_P_052_CUS_ACT_L_LEN)
                  ,beginIp65504P052CusActL
                  ,IP_65504_P_052_CUS_ACT_L_LEN
                 );
            localIp65504P052CusActLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P052CusActLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P052CusActL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P052CusActL() {	 
			return (getShort(beginIp65504P052CusActL));
   	}
         int localIp65504P053CusDobSCounter = -1;
         public boolean isIp65504P053CusDobSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P053CusDobSCounter != sharedCounter;
            localIp65504P053CusDobSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_053_CUS_DOB_S_LEN = 2;
  	/**
	 * serializeIp65504P053CusDobS
	 */
	protected void serializeIp65504P053CusDobS(short ip65504P053CusDobS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P053CusDobS,IP_65504_P_053_CUS_DOB_S_LEN)
                  ,beginIp65504P053CusDobS
                  ,IP_65504_P_053_CUS_DOB_S_LEN
                 );
            localIp65504P053CusDobSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P053CusDobSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P053CusDobS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P053CusDobS() {	 
			return (getShort(beginIp65504P053CusDobS));
   	}
         int localIp65504P053CusDobLCounter = -1;
         public boolean isIp65504P053CusDobLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P053CusDobLCounter != sharedCounter;
            localIp65504P053CusDobLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_053_CUS_DOB_L_LEN = 2;
  	/**
	 * serializeIp65504P053CusDobL
	 */
	protected void serializeIp65504P053CusDobL(short ip65504P053CusDobL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P053CusDobL,IP_65504_P_053_CUS_DOB_L_LEN)
                  ,beginIp65504P053CusDobL
                  ,IP_65504_P_053_CUS_DOB_L_LEN
                 );
            localIp65504P053CusDobLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P053CusDobLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P053CusDobL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P053CusDobL() {	 
			return (getShort(beginIp65504P053CusDobL));
   	}
         int localIp65504P054ChdrVfSCounter = -1;
         public boolean isIp65504P054ChdrVfSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P054ChdrVfSCounter != sharedCounter;
            localIp65504P054ChdrVfSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_054_CHDR_VF_S_LEN = 2;
  	/**
	 * serializeIp65504P054ChdrVfS
	 */
	protected void serializeIp65504P054ChdrVfS(short ip65504P054ChdrVfS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P054ChdrVfS,IP_65504_P_054_CHDR_VF_S_LEN)
                  ,beginIp65504P054ChdrVfS
                  ,IP_65504_P_054_CHDR_VF_S_LEN
                 );
            localIp65504P054ChdrVfSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P054ChdrVfSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P054ChdrVfS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P054ChdrVfS() {	 
			return (getShort(beginIp65504P054ChdrVfS));
   	}
         int localIp65504P054ChdrVfLCounter = -1;
         public boolean isIp65504P054ChdrVfLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P054ChdrVfLCounter != sharedCounter;
            localIp65504P054ChdrVfLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_054_CHDR_VF_L_LEN = 2;
  	/**
	 * serializeIp65504P054ChdrVfL
	 */
	protected void serializeIp65504P054ChdrVfL(short ip65504P054ChdrVfL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P054ChdrVfL,IP_65504_P_054_CHDR_VF_L_LEN)
                  ,beginIp65504P054ChdrVfL
                  ,IP_65504_P_054_CHDR_VF_L_LEN
                 );
            localIp65504P054ChdrVfLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P054ChdrVfLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P054ChdrVfL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P054ChdrVfL() {	 
			return (getShort(beginIp65504P054ChdrVfL));
   	}
         int localIp65504P055MercIdSCounter = -1;
         public boolean isIp65504P055MercIdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P055MercIdSCounter != sharedCounter;
            localIp65504P055MercIdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_055_MERC_ID_S_LEN = 2;
  	/**
	 * serializeIp65504P055MercIdS
	 */
	protected void serializeIp65504P055MercIdS(short ip65504P055MercIdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P055MercIdS,IP_65504_P_055_MERC_ID_S_LEN)
                  ,beginIp65504P055MercIdS
                  ,IP_65504_P_055_MERC_ID_S_LEN
                 );
            localIp65504P055MercIdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P055MercIdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P055MercIdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P055MercIdS() {	 
			return (getShort(beginIp65504P055MercIdS));
   	}
         int localIp65504P055MercIdLCounter = -1;
         public boolean isIp65504P055MercIdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P055MercIdLCounter != sharedCounter;
            localIp65504P055MercIdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_055_MERC_ID_L_LEN = 2;
  	/**
	 * serializeIp65504P055MercIdL
	 */
	protected void serializeIp65504P055MercIdL(short ip65504P055MercIdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P055MercIdL,IP_65504_P_055_MERC_ID_L_LEN)
                  ,beginIp65504P055MercIdL
                  ,IP_65504_P_055_MERC_ID_L_LEN
                 );
            localIp65504P055MercIdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P055MercIdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P055MercIdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P055MercIdL() {	 
			return (getShort(beginIp65504P055MercIdL));
   	}
         int localIp65504P056ReservdSCounter = -1;
         public boolean isIp65504P056ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P056ReservdSCounter != sharedCounter;
            localIp65504P056ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_056_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P056ReservdS
	 */
	protected void serializeIp65504P056ReservdS(short ip65504P056ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P056ReservdS,IP_65504_P_056_RESERVD_S_LEN)
                  ,beginIp65504P056ReservdS
                  ,IP_65504_P_056_RESERVD_S_LEN
                 );
            localIp65504P056ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P056ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P056ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P056ReservdS() {	 
			return (getShort(beginIp65504P056ReservdS));
   	}
         int localIp65504P056ReservdLCounter = -1;
         public boolean isIp65504P056ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P056ReservdLCounter != sharedCounter;
            localIp65504P056ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_056_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P056ReservdL
	 */
	protected void serializeIp65504P056ReservdL(short ip65504P056ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P056ReservdL,IP_65504_P_056_RESERVD_L_LEN)
                  ,beginIp65504P056ReservdL
                  ,IP_65504_P_056_RESERVD_L_LEN
                 );
            localIp65504P056ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P056ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P056ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P056ReservdL() {	 
			return (getShort(beginIp65504P056ReservdL));
   	}
         int localIp65504P057ReservdSCounter = -1;
         public boolean isIp65504P057ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P057ReservdSCounter != sharedCounter;
            localIp65504P057ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_057_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P057ReservdS
	 */
	protected void serializeIp65504P057ReservdS(short ip65504P057ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P057ReservdS,IP_65504_P_057_RESERVD_S_LEN)
                  ,beginIp65504P057ReservdS
                  ,IP_65504_P_057_RESERVD_S_LEN
                 );
            localIp65504P057ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P057ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P057ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P057ReservdS() {	 
			return (getShort(beginIp65504P057ReservdS));
   	}
         int localIp65504P057ReservdLCounter = -1;
         public boolean isIp65504P057ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P057ReservdLCounter != sharedCounter;
            localIp65504P057ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_057_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P057ReservdL
	 */
	protected void serializeIp65504P057ReservdL(short ip65504P057ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P057ReservdL,IP_65504_P_057_RESERVD_L_LEN)
                  ,beginIp65504P057ReservdL
                  ,IP_65504_P_057_RESERVD_L_LEN
                 );
            localIp65504P057ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P057ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P057ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P057ReservdL() {	 
			return (getShort(beginIp65504P057ReservdL));
   	}
         int localIp65504P058ReservdSCounter = -1;
         public boolean isIp65504P058ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P058ReservdSCounter != sharedCounter;
            localIp65504P058ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_058_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P058ReservdS
	 */
	protected void serializeIp65504P058ReservdS(short ip65504P058ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P058ReservdS,IP_65504_P_058_RESERVD_S_LEN)
                  ,beginIp65504P058ReservdS
                  ,IP_65504_P_058_RESERVD_S_LEN
                 );
            localIp65504P058ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P058ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P058ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P058ReservdS() {	 
			return (getShort(beginIp65504P058ReservdS));
   	}
         int localIp65504P058ReservdLCounter = -1;
         public boolean isIp65504P058ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P058ReservdLCounter != sharedCounter;
            localIp65504P058ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_058_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P058ReservdL
	 */
	protected void serializeIp65504P058ReservdL(short ip65504P058ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P058ReservdL,IP_65504_P_058_RESERVD_L_LEN)
                  ,beginIp65504P058ReservdL
                  ,IP_65504_P_058_RESERVD_L_LEN
                 );
            localIp65504P058ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P058ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P058ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P058ReservdL() {	 
			return (getShort(beginIp65504P058ReservdL));
   	}
         int localIp65504P059ReservdSCounter = -1;
         public boolean isIp65504P059ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P059ReservdSCounter != sharedCounter;
            localIp65504P059ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_059_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P059ReservdS
	 */
	protected void serializeIp65504P059ReservdS(short ip65504P059ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P059ReservdS,IP_65504_P_059_RESERVD_S_LEN)
                  ,beginIp65504P059ReservdS
                  ,IP_65504_P_059_RESERVD_S_LEN
                 );
            localIp65504P059ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P059ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P059ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P059ReservdS() {	 
			return (getShort(beginIp65504P059ReservdS));
   	}
         int localIp65504P059ReservdLCounter = -1;
         public boolean isIp65504P059ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P059ReservdLCounter != sharedCounter;
            localIp65504P059ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_059_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P059ReservdL
	 */
	protected void serializeIp65504P059ReservdL(short ip65504P059ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P059ReservdL,IP_65504_P_059_RESERVD_L_LEN)
                  ,beginIp65504P059ReservdL
                  ,IP_65504_P_059_RESERVD_L_LEN
                 );
            localIp65504P059ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P059ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P059ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P059ReservdL() {	 
			return (getShort(beginIp65504P059ReservdL));
   	}
         int localIp65504P060ReservdSCounter = -1;
         public boolean isIp65504P060ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P060ReservdSCounter != sharedCounter;
            localIp65504P060ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_060_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P060ReservdS
	 */
	protected void serializeIp65504P060ReservdS(short ip65504P060ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P060ReservdS,IP_65504_P_060_RESERVD_S_LEN)
                  ,beginIp65504P060ReservdS
                  ,IP_65504_P_060_RESERVD_S_LEN
                 );
            localIp65504P060ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P060ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P060ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P060ReservdS() {	 
			return (getShort(beginIp65504P060ReservdS));
   	}
         int localIp65504P060ReservdLCounter = -1;
         public boolean isIp65504P060ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P060ReservdLCounter != sharedCounter;
            localIp65504P060ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_060_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P060ReservdL
	 */
	protected void serializeIp65504P060ReservdL(short ip65504P060ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P060ReservdL,IP_65504_P_060_RESERVD_L_LEN)
                  ,beginIp65504P060ReservdL
                  ,IP_65504_P_060_RESERVD_L_LEN
                 );
            localIp65504P060ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P060ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P060ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P060ReservdL() {	 
			return (getShort(beginIp65504P060ReservdL));
   	}
         int localIp65504P061RefTelSCounter = -1;
         public boolean isIp65504P061RefTelSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P061RefTelSCounter != sharedCounter;
            localIp65504P061RefTelSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_061_REF_TEL_S_LEN = 2;
  	/**
	 * serializeIp65504P061RefTelS
	 */
	protected void serializeIp65504P061RefTelS(short ip65504P061RefTelS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P061RefTelS,IP_65504_P_061_REF_TEL_S_LEN)
                  ,beginIp65504P061RefTelS
                  ,IP_65504_P_061_REF_TEL_S_LEN
                 );
            localIp65504P061RefTelSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P061RefTelSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P061RefTelS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P061RefTelS() {	 
			return (getShort(beginIp65504P061RefTelS));
   	}
         int localIp65504P061RefTelLCounter = -1;
         public boolean isIp65504P061RefTelLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P061RefTelLCounter != sharedCounter;
            localIp65504P061RefTelLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_061_REF_TEL_L_LEN = 2;
  	/**
	 * serializeIp65504P061RefTelL
	 */
	protected void serializeIp65504P061RefTelL(short ip65504P061RefTelL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P061RefTelL,IP_65504_P_061_REF_TEL_L_LEN)
                  ,beginIp65504P061RefTelL
                  ,IP_65504_P_061_REF_TEL_L_LEN
                 );
            localIp65504P061RefTelLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P061RefTelLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P061RefTelL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P061RefTelL() {	 
			return (getShort(beginIp65504P061RefTelL));
   	}
         int localIp65504P062ReservdSCounter = -1;
         public boolean isIp65504P062ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P062ReservdSCounter != sharedCounter;
            localIp65504P062ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_062_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P062ReservdS
	 */
	protected void serializeIp65504P062ReservdS(short ip65504P062ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P062ReservdS,IP_65504_P_062_RESERVD_S_LEN)
                  ,beginIp65504P062ReservdS
                  ,IP_65504_P_062_RESERVD_S_LEN
                 );
            localIp65504P062ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P062ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P062ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P062ReservdS() {	 
			return (getShort(beginIp65504P062ReservdS));
   	}
         int localIp65504P062ReservdLCounter = -1;
         public boolean isIp65504P062ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P062ReservdLCounter != sharedCounter;
            localIp65504P062ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_062_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P062ReservdL
	 */
	protected void serializeIp65504P062ReservdL(short ip65504P062ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P062ReservdL,IP_65504_P_062_RESERVD_L_LEN)
                  ,beginIp65504P062ReservdL
                  ,IP_65504_P_062_RESERVD_L_LEN
                 );
            localIp65504P062ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P062ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P062ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P062ReservdL() {	 
			return (getShort(beginIp65504P062ReservdL));
   	}




}
  
