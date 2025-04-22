package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip65504PdsNamesLargeGroup17Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:16. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip65504PdsNamesLargeGroup17Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip65504PdsNamesLargeGroup17Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_65504_PDS_NAMES_LARGE_GROUP_17_LENGTH = 248;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp65504P497ReservdS;
            protected  int beginIp65504P497ReservdL;
            protected  int beginIp65504P498ReservdS;
            protected  int beginIp65504P498ReservdL;
            protected  int beginIp65504P499ReservdS;
            protected  int beginIp65504P499ReservdL;
            protected  int beginIp65504P500ReservdS;
            protected  int beginIp65504P500ReservdL;
            protected  int beginIp65504P501TrxDesS;
            protected  int beginIp65504P501TrxDesL;
            protected  int beginIp65504P502ReservdS;
            protected  int beginIp65504P502ReservdL;
            protected  int beginIp65504P503ReservdS;
            protected  int beginIp65504P503ReservdL;
            protected  int beginIp65504P504ReservdS;
            protected  int beginIp65504P504ReservdL;
            protected  int beginIp65504P505PassNmS;
            protected  int beginIp65504P505PassNmL;
            protected  int beginIp65504P506TktNbrS;
            protected  int beginIp65504P506TktNbrL;
            protected  int beginIp65504P507IssCarS;
            protected  int beginIp65504P507IssCarL;
            protected  int beginIp65504P508CustCdS;
            protected  int beginIp65504P508CustCdL;
            protected  int beginIp65504P509IssDteS;
            protected  int beginIp65504P509IssDteL;
            protected  int beginIp65504P510AgcyCdS;
            protected  int beginIp65504P510AgcyCdL;
            protected  int beginIp65504P511AgcyNmS;
            protected  int beginIp65504P511AgcyNmL;
            protected  int beginIp65504P512TtlFarS;
            protected  int beginIp65504P512TtlFarL;
            protected  int beginIp65504P513TtlFeeS;
            protected  int beginIp65504P513TtlFeeL;
            protected  int beginIp65504P514TtlTaxS;
            protected  int beginIp65504P514TtlTaxL;
            protected  int beginIp65504P515ReservdS;
            protected  int beginIp65504P515ReservdL;
            protected  int beginIp65504P516ReservdS;
            protected  int beginIp65504P516ReservdL;
            protected  int beginIp65504P517ReservdS;
            protected  int beginIp65504P517ReservdL;
            protected  int beginIp65504P518ReservdS;
            protected  int beginIp65504P518ReservdL;
            protected  int beginIp65504P519ReservdS;
            protected  int beginIp65504P519ReservdL;
            protected  int beginIp65504P520TravldtS;
            protected  int beginIp65504P520TravldtL;
            protected  int beginIp65504P521CarrCdS;
            protected  int beginIp65504P521CarrCdL;
            protected  int beginIp65504P522ServCdS;
            protected  int beginIp65504P522ServCdL;
            protected  int beginIp65504P523OrgCtyS;
            protected  int beginIp65504P523OrgCtyL;
            protected  int beginIp65504P524DesCtyS;
            protected  int beginIp65504P524DesCtyL;
            protected  int beginIp65504P525StopCdS;
            protected  int beginIp65504P525StopCdL;
            protected  int beginIp65504P526ConjTkS;
            protected  int beginIp65504P526ConjTkL;
            protected  int beginIp65504P527ExchTkS;
            protected  int beginIp65504P527ExchTkL;
	
	/**
	* Constructor for Ip65504PdsNamesLargeGroup17Serialized
	**/
    public Ip65504PdsNamesLargeGroup17Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ip65504PdsNamesLargeGroup17Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip65504PdsNamesLargeGroup17Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ip65504PdsNamesLargeGroup17Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,3964); // serialize this field at offset 3964 by default 
    }
    
	/**
	* sets parent for this Ip65504PdsNamesLargeGroup17Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 3964 by default
    }    
	/**
	* initializes the field in Ip65504PdsNamesLargeGroup17Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_65504_PDS_NAMES_LARGE_GROUP_17_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp65504P497ReservdS = getStartOffset() + 4;	// set offset for serialization
  
             beginIp65504P497ReservdL = getStartOffset() + 6;	// set offset for serialization
  
  
             beginIp65504P498ReservdS = getStartOffset() + 12;	// set offset for serialization
  
             beginIp65504P498ReservdL = getStartOffset() + 14;	// set offset for serialization
  
  
             beginIp65504P499ReservdS = getStartOffset() + 20;	// set offset for serialization
  
             beginIp65504P499ReservdL = getStartOffset() + 22;	// set offset for serialization
  
  
             beginIp65504P500ReservdS = getStartOffset() + 28;	// set offset for serialization
  
             beginIp65504P500ReservdL = getStartOffset() + 30;	// set offset for serialization
  
  
             beginIp65504P501TrxDesS = getStartOffset() + 36;	// set offset for serialization
  
             beginIp65504P501TrxDesL = getStartOffset() + 38;	// set offset for serialization
  
  
             beginIp65504P502ReservdS = getStartOffset() + 44;	// set offset for serialization
  
             beginIp65504P502ReservdL = getStartOffset() + 46;	// set offset for serialization
  
  
             beginIp65504P503ReservdS = getStartOffset() + 52;	// set offset for serialization
  
             beginIp65504P503ReservdL = getStartOffset() + 54;	// set offset for serialization
  
  
             beginIp65504P504ReservdS = getStartOffset() + 60;	// set offset for serialization
  
             beginIp65504P504ReservdL = getStartOffset() + 62;	// set offset for serialization
  
  
             beginIp65504P505PassNmS = getStartOffset() + 68;	// set offset for serialization
  
             beginIp65504P505PassNmL = getStartOffset() + 70;	// set offset for serialization
  
  
             beginIp65504P506TktNbrS = getStartOffset() + 76;	// set offset for serialization
  
             beginIp65504P506TktNbrL = getStartOffset() + 78;	// set offset for serialization
  
  
             beginIp65504P507IssCarS = getStartOffset() + 84;	// set offset for serialization
  
             beginIp65504P507IssCarL = getStartOffset() + 86;	// set offset for serialization
  
  
             beginIp65504P508CustCdS = getStartOffset() + 92;	// set offset for serialization
  
             beginIp65504P508CustCdL = getStartOffset() + 94;	// set offset for serialization
  
  
             beginIp65504P509IssDteS = getStartOffset() + 100;	// set offset for serialization
  
             beginIp65504P509IssDteL = getStartOffset() + 102;	// set offset for serialization
  
  
             beginIp65504P510AgcyCdS = getStartOffset() + 108;	// set offset for serialization
  
             beginIp65504P510AgcyCdL = getStartOffset() + 110;	// set offset for serialization
  
  
             beginIp65504P511AgcyNmS = getStartOffset() + 116;	// set offset for serialization
  
             beginIp65504P511AgcyNmL = getStartOffset() + 118;	// set offset for serialization
  
  
             beginIp65504P512TtlFarS = getStartOffset() + 124;	// set offset for serialization
  
             beginIp65504P512TtlFarL = getStartOffset() + 126;	// set offset for serialization
  
  
             beginIp65504P513TtlFeeS = getStartOffset() + 132;	// set offset for serialization
  
             beginIp65504P513TtlFeeL = getStartOffset() + 134;	// set offset for serialization
  
  
             beginIp65504P514TtlTaxS = getStartOffset() + 140;	// set offset for serialization
  
             beginIp65504P514TtlTaxL = getStartOffset() + 142;	// set offset for serialization
  
  
             beginIp65504P515ReservdS = getStartOffset() + 148;	// set offset for serialization
  
             beginIp65504P515ReservdL = getStartOffset() + 150;	// set offset for serialization
  
  
             beginIp65504P516ReservdS = getStartOffset() + 156;	// set offset for serialization
  
             beginIp65504P516ReservdL = getStartOffset() + 158;	// set offset for serialization
  
  
             beginIp65504P517ReservdS = getStartOffset() + 164;	// set offset for serialization
  
             beginIp65504P517ReservdL = getStartOffset() + 166;	// set offset for serialization
  
  
             beginIp65504P518ReservdS = getStartOffset() + 172;	// set offset for serialization
  
             beginIp65504P518ReservdL = getStartOffset() + 174;	// set offset for serialization
  
  
             beginIp65504P519ReservdS = getStartOffset() + 180;	// set offset for serialization
  
             beginIp65504P519ReservdL = getStartOffset() + 182;	// set offset for serialization
  
  
             beginIp65504P520TravldtS = getStartOffset() + 188;	// set offset for serialization
  
             beginIp65504P520TravldtL = getStartOffset() + 190;	// set offset for serialization
  
  
             beginIp65504P521CarrCdS = getStartOffset() + 196;	// set offset for serialization
  
             beginIp65504P521CarrCdL = getStartOffset() + 198;	// set offset for serialization
  
  
             beginIp65504P522ServCdS = getStartOffset() + 204;	// set offset for serialization
  
             beginIp65504P522ServCdL = getStartOffset() + 206;	// set offset for serialization
  
  
             beginIp65504P523OrgCtyS = getStartOffset() + 212;	// set offset for serialization
  
             beginIp65504P523OrgCtyL = getStartOffset() + 214;	// set offset for serialization
  
  
             beginIp65504P524DesCtyS = getStartOffset() + 220;	// set offset for serialization
  
             beginIp65504P524DesCtyL = getStartOffset() + 222;	// set offset for serialization
  
  
             beginIp65504P525StopCdS = getStartOffset() + 228;	// set offset for serialization
  
             beginIp65504P525StopCdL = getStartOffset() + 230;	// set offset for serialization
  
  
             beginIp65504P526ConjTkS = getStartOffset() + 236;	// set offset for serialization
  
             beginIp65504P526ConjTkL = getStartOffset() + 238;	// set offset for serialization
  
  
             beginIp65504P527ExchTkS = getStartOffset() + 244;	// set offset for serialization
  
             beginIp65504P527ExchTkL = getStartOffset() + 246;	// set offset for serialization
  
  
	   /*  end of offset */
	}
         int localIp65504P497ReservdSCounter = -1;
         public boolean isIp65504P497ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P497ReservdSCounter != sharedCounter;
            localIp65504P497ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_497_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P497ReservdS
	 */
	protected void serializeIp65504P497ReservdS(short ip65504P497ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P497ReservdS,IP_65504_P_497_RESERVD_S_LEN)
                  ,beginIp65504P497ReservdS
                  ,IP_65504_P_497_RESERVD_S_LEN
                 );
            localIp65504P497ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P497ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P497ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P497ReservdS() {	 
			return (getShort(beginIp65504P497ReservdS));
   	}
         int localIp65504P497ReservdLCounter = -1;
         public boolean isIp65504P497ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P497ReservdLCounter != sharedCounter;
            localIp65504P497ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_497_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P497ReservdL
	 */
	protected void serializeIp65504P497ReservdL(short ip65504P497ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P497ReservdL,IP_65504_P_497_RESERVD_L_LEN)
                  ,beginIp65504P497ReservdL
                  ,IP_65504_P_497_RESERVD_L_LEN
                 );
            localIp65504P497ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P497ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P497ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P497ReservdL() {	 
			return (getShort(beginIp65504P497ReservdL));
   	}
         int localIp65504P498ReservdSCounter = -1;
         public boolean isIp65504P498ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P498ReservdSCounter != sharedCounter;
            localIp65504P498ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_498_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P498ReservdS
	 */
	protected void serializeIp65504P498ReservdS(short ip65504P498ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P498ReservdS,IP_65504_P_498_RESERVD_S_LEN)
                  ,beginIp65504P498ReservdS
                  ,IP_65504_P_498_RESERVD_S_LEN
                 );
            localIp65504P498ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P498ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P498ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P498ReservdS() {	 
			return (getShort(beginIp65504P498ReservdS));
   	}
         int localIp65504P498ReservdLCounter = -1;
         public boolean isIp65504P498ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P498ReservdLCounter != sharedCounter;
            localIp65504P498ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_498_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P498ReservdL
	 */
	protected void serializeIp65504P498ReservdL(short ip65504P498ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P498ReservdL,IP_65504_P_498_RESERVD_L_LEN)
                  ,beginIp65504P498ReservdL
                  ,IP_65504_P_498_RESERVD_L_LEN
                 );
            localIp65504P498ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P498ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P498ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P498ReservdL() {	 
			return (getShort(beginIp65504P498ReservdL));
   	}
         int localIp65504P499ReservdSCounter = -1;
         public boolean isIp65504P499ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P499ReservdSCounter != sharedCounter;
            localIp65504P499ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_499_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P499ReservdS
	 */
	protected void serializeIp65504P499ReservdS(short ip65504P499ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P499ReservdS,IP_65504_P_499_RESERVD_S_LEN)
                  ,beginIp65504P499ReservdS
                  ,IP_65504_P_499_RESERVD_S_LEN
                 );
            localIp65504P499ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P499ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P499ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P499ReservdS() {	 
			return (getShort(beginIp65504P499ReservdS));
   	}
         int localIp65504P499ReservdLCounter = -1;
         public boolean isIp65504P499ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P499ReservdLCounter != sharedCounter;
            localIp65504P499ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_499_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P499ReservdL
	 */
	protected void serializeIp65504P499ReservdL(short ip65504P499ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P499ReservdL,IP_65504_P_499_RESERVD_L_LEN)
                  ,beginIp65504P499ReservdL
                  ,IP_65504_P_499_RESERVD_L_LEN
                 );
            localIp65504P499ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P499ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P499ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P499ReservdL() {	 
			return (getShort(beginIp65504P499ReservdL));
   	}
         int localIp65504P500ReservdSCounter = -1;
         public boolean isIp65504P500ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P500ReservdSCounter != sharedCounter;
            localIp65504P500ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_500_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P500ReservdS
	 */
	protected void serializeIp65504P500ReservdS(short ip65504P500ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P500ReservdS,IP_65504_P_500_RESERVD_S_LEN)
                  ,beginIp65504P500ReservdS
                  ,IP_65504_P_500_RESERVD_S_LEN
                 );
            localIp65504P500ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P500ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P500ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P500ReservdS() {	 
			return (getShort(beginIp65504P500ReservdS));
   	}
         int localIp65504P500ReservdLCounter = -1;
         public boolean isIp65504P500ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P500ReservdLCounter != sharedCounter;
            localIp65504P500ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_500_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P500ReservdL
	 */
	protected void serializeIp65504P500ReservdL(short ip65504P500ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P500ReservdL,IP_65504_P_500_RESERVD_L_LEN)
                  ,beginIp65504P500ReservdL
                  ,IP_65504_P_500_RESERVD_L_LEN
                 );
            localIp65504P500ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P500ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P500ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P500ReservdL() {	 
			return (getShort(beginIp65504P500ReservdL));
   	}
         int localIp65504P501TrxDesSCounter = -1;
         public boolean isIp65504P501TrxDesSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P501TrxDesSCounter != sharedCounter;
            localIp65504P501TrxDesSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_501_TRX_DES_S_LEN = 2;
  	/**
	 * serializeIp65504P501TrxDesS
	 */
	protected void serializeIp65504P501TrxDesS(short ip65504P501TrxDesS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P501TrxDesS,IP_65504_P_501_TRX_DES_S_LEN)
                  ,beginIp65504P501TrxDesS
                  ,IP_65504_P_501_TRX_DES_S_LEN
                 );
            localIp65504P501TrxDesSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P501TrxDesSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P501TrxDesS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P501TrxDesS() {	 
			return (getShort(beginIp65504P501TrxDesS));
   	}
         int localIp65504P501TrxDesLCounter = -1;
         public boolean isIp65504P501TrxDesLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P501TrxDesLCounter != sharedCounter;
            localIp65504P501TrxDesLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_501_TRX_DES_L_LEN = 2;
  	/**
	 * serializeIp65504P501TrxDesL
	 */
	protected void serializeIp65504P501TrxDesL(short ip65504P501TrxDesL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P501TrxDesL,IP_65504_P_501_TRX_DES_L_LEN)
                  ,beginIp65504P501TrxDesL
                  ,IP_65504_P_501_TRX_DES_L_LEN
                 );
            localIp65504P501TrxDesLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P501TrxDesLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P501TrxDesL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P501TrxDesL() {	 
			return (getShort(beginIp65504P501TrxDesL));
   	}
         int localIp65504P502ReservdSCounter = -1;
         public boolean isIp65504P502ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P502ReservdSCounter != sharedCounter;
            localIp65504P502ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_502_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P502ReservdS
	 */
	protected void serializeIp65504P502ReservdS(short ip65504P502ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P502ReservdS,IP_65504_P_502_RESERVD_S_LEN)
                  ,beginIp65504P502ReservdS
                  ,IP_65504_P_502_RESERVD_S_LEN
                 );
            localIp65504P502ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P502ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P502ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P502ReservdS() {	 
			return (getShort(beginIp65504P502ReservdS));
   	}
         int localIp65504P502ReservdLCounter = -1;
         public boolean isIp65504P502ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P502ReservdLCounter != sharedCounter;
            localIp65504P502ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_502_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P502ReservdL
	 */
	protected void serializeIp65504P502ReservdL(short ip65504P502ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P502ReservdL,IP_65504_P_502_RESERVD_L_LEN)
                  ,beginIp65504P502ReservdL
                  ,IP_65504_P_502_RESERVD_L_LEN
                 );
            localIp65504P502ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P502ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P502ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P502ReservdL() {	 
			return (getShort(beginIp65504P502ReservdL));
   	}
         int localIp65504P503ReservdSCounter = -1;
         public boolean isIp65504P503ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P503ReservdSCounter != sharedCounter;
            localIp65504P503ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_503_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P503ReservdS
	 */
	protected void serializeIp65504P503ReservdS(short ip65504P503ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P503ReservdS,IP_65504_P_503_RESERVD_S_LEN)
                  ,beginIp65504P503ReservdS
                  ,IP_65504_P_503_RESERVD_S_LEN
                 );
            localIp65504P503ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P503ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P503ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P503ReservdS() {	 
			return (getShort(beginIp65504P503ReservdS));
   	}
         int localIp65504P503ReservdLCounter = -1;
         public boolean isIp65504P503ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P503ReservdLCounter != sharedCounter;
            localIp65504P503ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_503_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P503ReservdL
	 */
	protected void serializeIp65504P503ReservdL(short ip65504P503ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P503ReservdL,IP_65504_P_503_RESERVD_L_LEN)
                  ,beginIp65504P503ReservdL
                  ,IP_65504_P_503_RESERVD_L_LEN
                 );
            localIp65504P503ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P503ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P503ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P503ReservdL() {	 
			return (getShort(beginIp65504P503ReservdL));
   	}
         int localIp65504P504ReservdSCounter = -1;
         public boolean isIp65504P504ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P504ReservdSCounter != sharedCounter;
            localIp65504P504ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_504_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P504ReservdS
	 */
	protected void serializeIp65504P504ReservdS(short ip65504P504ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P504ReservdS,IP_65504_P_504_RESERVD_S_LEN)
                  ,beginIp65504P504ReservdS
                  ,IP_65504_P_504_RESERVD_S_LEN
                 );
            localIp65504P504ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P504ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P504ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P504ReservdS() {	 
			return (getShort(beginIp65504P504ReservdS));
   	}
         int localIp65504P504ReservdLCounter = -1;
         public boolean isIp65504P504ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P504ReservdLCounter != sharedCounter;
            localIp65504P504ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_504_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P504ReservdL
	 */
	protected void serializeIp65504P504ReservdL(short ip65504P504ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P504ReservdL,IP_65504_P_504_RESERVD_L_LEN)
                  ,beginIp65504P504ReservdL
                  ,IP_65504_P_504_RESERVD_L_LEN
                 );
            localIp65504P504ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P504ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P504ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P504ReservdL() {	 
			return (getShort(beginIp65504P504ReservdL));
   	}
         int localIp65504P505PassNmSCounter = -1;
         public boolean isIp65504P505PassNmSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P505PassNmSCounter != sharedCounter;
            localIp65504P505PassNmSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_505_PASS_NM_S_LEN = 2;
  	/**
	 * serializeIp65504P505PassNmS
	 */
	protected void serializeIp65504P505PassNmS(short ip65504P505PassNmS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P505PassNmS,IP_65504_P_505_PASS_NM_S_LEN)
                  ,beginIp65504P505PassNmS
                  ,IP_65504_P_505_PASS_NM_S_LEN
                 );
            localIp65504P505PassNmSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P505PassNmSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P505PassNmS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P505PassNmS() {	 
			return (getShort(beginIp65504P505PassNmS));
   	}
         int localIp65504P505PassNmLCounter = -1;
         public boolean isIp65504P505PassNmLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P505PassNmLCounter != sharedCounter;
            localIp65504P505PassNmLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_505_PASS_NM_L_LEN = 2;
  	/**
	 * serializeIp65504P505PassNmL
	 */
	protected void serializeIp65504P505PassNmL(short ip65504P505PassNmL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P505PassNmL,IP_65504_P_505_PASS_NM_L_LEN)
                  ,beginIp65504P505PassNmL
                  ,IP_65504_P_505_PASS_NM_L_LEN
                 );
            localIp65504P505PassNmLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P505PassNmLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P505PassNmL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P505PassNmL() {	 
			return (getShort(beginIp65504P505PassNmL));
   	}
         int localIp65504P506TktNbrSCounter = -1;
         public boolean isIp65504P506TktNbrSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P506TktNbrSCounter != sharedCounter;
            localIp65504P506TktNbrSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_506_TKT_NBR_S_LEN = 2;
  	/**
	 * serializeIp65504P506TktNbrS
	 */
	protected void serializeIp65504P506TktNbrS(short ip65504P506TktNbrS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P506TktNbrS,IP_65504_P_506_TKT_NBR_S_LEN)
                  ,beginIp65504P506TktNbrS
                  ,IP_65504_P_506_TKT_NBR_S_LEN
                 );
            localIp65504P506TktNbrSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P506TktNbrSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P506TktNbrS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P506TktNbrS() {	 
			return (getShort(beginIp65504P506TktNbrS));
   	}
         int localIp65504P506TktNbrLCounter = -1;
         public boolean isIp65504P506TktNbrLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P506TktNbrLCounter != sharedCounter;
            localIp65504P506TktNbrLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_506_TKT_NBR_L_LEN = 2;
  	/**
	 * serializeIp65504P506TktNbrL
	 */
	protected void serializeIp65504P506TktNbrL(short ip65504P506TktNbrL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P506TktNbrL,IP_65504_P_506_TKT_NBR_L_LEN)
                  ,beginIp65504P506TktNbrL
                  ,IP_65504_P_506_TKT_NBR_L_LEN
                 );
            localIp65504P506TktNbrLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P506TktNbrLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P506TktNbrL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P506TktNbrL() {	 
			return (getShort(beginIp65504P506TktNbrL));
   	}
         int localIp65504P507IssCarSCounter = -1;
         public boolean isIp65504P507IssCarSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P507IssCarSCounter != sharedCounter;
            localIp65504P507IssCarSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_507_ISS_CAR_S_LEN = 2;
  	/**
	 * serializeIp65504P507IssCarS
	 */
	protected void serializeIp65504P507IssCarS(short ip65504P507IssCarS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P507IssCarS,IP_65504_P_507_ISS_CAR_S_LEN)
                  ,beginIp65504P507IssCarS
                  ,IP_65504_P_507_ISS_CAR_S_LEN
                 );
            localIp65504P507IssCarSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P507IssCarSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P507IssCarS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P507IssCarS() {	 
			return (getShort(beginIp65504P507IssCarS));
   	}
         int localIp65504P507IssCarLCounter = -1;
         public boolean isIp65504P507IssCarLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P507IssCarLCounter != sharedCounter;
            localIp65504P507IssCarLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_507_ISS_CAR_L_LEN = 2;
  	/**
	 * serializeIp65504P507IssCarL
	 */
	protected void serializeIp65504P507IssCarL(short ip65504P507IssCarL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P507IssCarL,IP_65504_P_507_ISS_CAR_L_LEN)
                  ,beginIp65504P507IssCarL
                  ,IP_65504_P_507_ISS_CAR_L_LEN
                 );
            localIp65504P507IssCarLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P507IssCarLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P507IssCarL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P507IssCarL() {	 
			return (getShort(beginIp65504P507IssCarL));
   	}
         int localIp65504P508CustCdSCounter = -1;
         public boolean isIp65504P508CustCdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P508CustCdSCounter != sharedCounter;
            localIp65504P508CustCdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_508_CUST_CD_S_LEN = 2;
  	/**
	 * serializeIp65504P508CustCdS
	 */
	protected void serializeIp65504P508CustCdS(short ip65504P508CustCdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P508CustCdS,IP_65504_P_508_CUST_CD_S_LEN)
                  ,beginIp65504P508CustCdS
                  ,IP_65504_P_508_CUST_CD_S_LEN
                 );
            localIp65504P508CustCdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P508CustCdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P508CustCdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P508CustCdS() {	 
			return (getShort(beginIp65504P508CustCdS));
   	}
         int localIp65504P508CustCdLCounter = -1;
         public boolean isIp65504P508CustCdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P508CustCdLCounter != sharedCounter;
            localIp65504P508CustCdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_508_CUST_CD_L_LEN = 2;
  	/**
	 * serializeIp65504P508CustCdL
	 */
	protected void serializeIp65504P508CustCdL(short ip65504P508CustCdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P508CustCdL,IP_65504_P_508_CUST_CD_L_LEN)
                  ,beginIp65504P508CustCdL
                  ,IP_65504_P_508_CUST_CD_L_LEN
                 );
            localIp65504P508CustCdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P508CustCdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P508CustCdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P508CustCdL() {	 
			return (getShort(beginIp65504P508CustCdL));
   	}
         int localIp65504P509IssDteSCounter = -1;
         public boolean isIp65504P509IssDteSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P509IssDteSCounter != sharedCounter;
            localIp65504P509IssDteSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_509_ISS_DTE_S_LEN = 2;
  	/**
	 * serializeIp65504P509IssDteS
	 */
	protected void serializeIp65504P509IssDteS(short ip65504P509IssDteS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P509IssDteS,IP_65504_P_509_ISS_DTE_S_LEN)
                  ,beginIp65504P509IssDteS
                  ,IP_65504_P_509_ISS_DTE_S_LEN
                 );
            localIp65504P509IssDteSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P509IssDteSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P509IssDteS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P509IssDteS() {	 
			return (getShort(beginIp65504P509IssDteS));
   	}
         int localIp65504P509IssDteLCounter = -1;
         public boolean isIp65504P509IssDteLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P509IssDteLCounter != sharedCounter;
            localIp65504P509IssDteLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_509_ISS_DTE_L_LEN = 2;
  	/**
	 * serializeIp65504P509IssDteL
	 */
	protected void serializeIp65504P509IssDteL(short ip65504P509IssDteL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P509IssDteL,IP_65504_P_509_ISS_DTE_L_LEN)
                  ,beginIp65504P509IssDteL
                  ,IP_65504_P_509_ISS_DTE_L_LEN
                 );
            localIp65504P509IssDteLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P509IssDteLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P509IssDteL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P509IssDteL() {	 
			return (getShort(beginIp65504P509IssDteL));
   	}
         int localIp65504P510AgcyCdSCounter = -1;
         public boolean isIp65504P510AgcyCdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P510AgcyCdSCounter != sharedCounter;
            localIp65504P510AgcyCdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_510_AGCY_CD_S_LEN = 2;
  	/**
	 * serializeIp65504P510AgcyCdS
	 */
	protected void serializeIp65504P510AgcyCdS(short ip65504P510AgcyCdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P510AgcyCdS,IP_65504_P_510_AGCY_CD_S_LEN)
                  ,beginIp65504P510AgcyCdS
                  ,IP_65504_P_510_AGCY_CD_S_LEN
                 );
            localIp65504P510AgcyCdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P510AgcyCdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P510AgcyCdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P510AgcyCdS() {	 
			return (getShort(beginIp65504P510AgcyCdS));
   	}
         int localIp65504P510AgcyCdLCounter = -1;
         public boolean isIp65504P510AgcyCdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P510AgcyCdLCounter != sharedCounter;
            localIp65504P510AgcyCdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_510_AGCY_CD_L_LEN = 2;
  	/**
	 * serializeIp65504P510AgcyCdL
	 */
	protected void serializeIp65504P510AgcyCdL(short ip65504P510AgcyCdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P510AgcyCdL,IP_65504_P_510_AGCY_CD_L_LEN)
                  ,beginIp65504P510AgcyCdL
                  ,IP_65504_P_510_AGCY_CD_L_LEN
                 );
            localIp65504P510AgcyCdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P510AgcyCdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P510AgcyCdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P510AgcyCdL() {	 
			return (getShort(beginIp65504P510AgcyCdL));
   	}
         int localIp65504P511AgcyNmSCounter = -1;
         public boolean isIp65504P511AgcyNmSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P511AgcyNmSCounter != sharedCounter;
            localIp65504P511AgcyNmSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_511_AGCY_NM_S_LEN = 2;
  	/**
	 * serializeIp65504P511AgcyNmS
	 */
	protected void serializeIp65504P511AgcyNmS(short ip65504P511AgcyNmS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P511AgcyNmS,IP_65504_P_511_AGCY_NM_S_LEN)
                  ,beginIp65504P511AgcyNmS
                  ,IP_65504_P_511_AGCY_NM_S_LEN
                 );
            localIp65504P511AgcyNmSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P511AgcyNmSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P511AgcyNmS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P511AgcyNmS() {	 
			return (getShort(beginIp65504P511AgcyNmS));
   	}
         int localIp65504P511AgcyNmLCounter = -1;
         public boolean isIp65504P511AgcyNmLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P511AgcyNmLCounter != sharedCounter;
            localIp65504P511AgcyNmLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_511_AGCY_NM_L_LEN = 2;
  	/**
	 * serializeIp65504P511AgcyNmL
	 */
	protected void serializeIp65504P511AgcyNmL(short ip65504P511AgcyNmL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P511AgcyNmL,IP_65504_P_511_AGCY_NM_L_LEN)
                  ,beginIp65504P511AgcyNmL
                  ,IP_65504_P_511_AGCY_NM_L_LEN
                 );
            localIp65504P511AgcyNmLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P511AgcyNmLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P511AgcyNmL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P511AgcyNmL() {	 
			return (getShort(beginIp65504P511AgcyNmL));
   	}
         int localIp65504P512TtlFarSCounter = -1;
         public boolean isIp65504P512TtlFarSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P512TtlFarSCounter != sharedCounter;
            localIp65504P512TtlFarSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_512_TTL_FAR_S_LEN = 2;
  	/**
	 * serializeIp65504P512TtlFarS
	 */
	protected void serializeIp65504P512TtlFarS(short ip65504P512TtlFarS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P512TtlFarS,IP_65504_P_512_TTL_FAR_S_LEN)
                  ,beginIp65504P512TtlFarS
                  ,IP_65504_P_512_TTL_FAR_S_LEN
                 );
            localIp65504P512TtlFarSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P512TtlFarSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P512TtlFarS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P512TtlFarS() {	 
			return (getShort(beginIp65504P512TtlFarS));
   	}
         int localIp65504P512TtlFarLCounter = -1;
         public boolean isIp65504P512TtlFarLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P512TtlFarLCounter != sharedCounter;
            localIp65504P512TtlFarLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_512_TTL_FAR_L_LEN = 2;
  	/**
	 * serializeIp65504P512TtlFarL
	 */
	protected void serializeIp65504P512TtlFarL(short ip65504P512TtlFarL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P512TtlFarL,IP_65504_P_512_TTL_FAR_L_LEN)
                  ,beginIp65504P512TtlFarL
                  ,IP_65504_P_512_TTL_FAR_L_LEN
                 );
            localIp65504P512TtlFarLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P512TtlFarLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P512TtlFarL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P512TtlFarL() {	 
			return (getShort(beginIp65504P512TtlFarL));
   	}
         int localIp65504P513TtlFeeSCounter = -1;
         public boolean isIp65504P513TtlFeeSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P513TtlFeeSCounter != sharedCounter;
            localIp65504P513TtlFeeSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_513_TTL_FEE_S_LEN = 2;
  	/**
	 * serializeIp65504P513TtlFeeS
	 */
	protected void serializeIp65504P513TtlFeeS(short ip65504P513TtlFeeS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P513TtlFeeS,IP_65504_P_513_TTL_FEE_S_LEN)
                  ,beginIp65504P513TtlFeeS
                  ,IP_65504_P_513_TTL_FEE_S_LEN
                 );
            localIp65504P513TtlFeeSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P513TtlFeeSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P513TtlFeeS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P513TtlFeeS() {	 
			return (getShort(beginIp65504P513TtlFeeS));
   	}
         int localIp65504P513TtlFeeLCounter = -1;
         public boolean isIp65504P513TtlFeeLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P513TtlFeeLCounter != sharedCounter;
            localIp65504P513TtlFeeLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_513_TTL_FEE_L_LEN = 2;
  	/**
	 * serializeIp65504P513TtlFeeL
	 */
	protected void serializeIp65504P513TtlFeeL(short ip65504P513TtlFeeL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P513TtlFeeL,IP_65504_P_513_TTL_FEE_L_LEN)
                  ,beginIp65504P513TtlFeeL
                  ,IP_65504_P_513_TTL_FEE_L_LEN
                 );
            localIp65504P513TtlFeeLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P513TtlFeeLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P513TtlFeeL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P513TtlFeeL() {	 
			return (getShort(beginIp65504P513TtlFeeL));
   	}
         int localIp65504P514TtlTaxSCounter = -1;
         public boolean isIp65504P514TtlTaxSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P514TtlTaxSCounter != sharedCounter;
            localIp65504P514TtlTaxSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_514_TTL_TAX_S_LEN = 2;
  	/**
	 * serializeIp65504P514TtlTaxS
	 */
	protected void serializeIp65504P514TtlTaxS(short ip65504P514TtlTaxS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P514TtlTaxS,IP_65504_P_514_TTL_TAX_S_LEN)
                  ,beginIp65504P514TtlTaxS
                  ,IP_65504_P_514_TTL_TAX_S_LEN
                 );
            localIp65504P514TtlTaxSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P514TtlTaxSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P514TtlTaxS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P514TtlTaxS() {	 
			return (getShort(beginIp65504P514TtlTaxS));
   	}
         int localIp65504P514TtlTaxLCounter = -1;
         public boolean isIp65504P514TtlTaxLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P514TtlTaxLCounter != sharedCounter;
            localIp65504P514TtlTaxLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_514_TTL_TAX_L_LEN = 2;
  	/**
	 * serializeIp65504P514TtlTaxL
	 */
	protected void serializeIp65504P514TtlTaxL(short ip65504P514TtlTaxL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P514TtlTaxL,IP_65504_P_514_TTL_TAX_L_LEN)
                  ,beginIp65504P514TtlTaxL
                  ,IP_65504_P_514_TTL_TAX_L_LEN
                 );
            localIp65504P514TtlTaxLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P514TtlTaxLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P514TtlTaxL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P514TtlTaxL() {	 
			return (getShort(beginIp65504P514TtlTaxL));
   	}
         int localIp65504P515ReservdSCounter = -1;
         public boolean isIp65504P515ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P515ReservdSCounter != sharedCounter;
            localIp65504P515ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_515_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P515ReservdS
	 */
	protected void serializeIp65504P515ReservdS(short ip65504P515ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P515ReservdS,IP_65504_P_515_RESERVD_S_LEN)
                  ,beginIp65504P515ReservdS
                  ,IP_65504_P_515_RESERVD_S_LEN
                 );
            localIp65504P515ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P515ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P515ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P515ReservdS() {	 
			return (getShort(beginIp65504P515ReservdS));
   	}
         int localIp65504P515ReservdLCounter = -1;
         public boolean isIp65504P515ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P515ReservdLCounter != sharedCounter;
            localIp65504P515ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_515_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P515ReservdL
	 */
	protected void serializeIp65504P515ReservdL(short ip65504P515ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P515ReservdL,IP_65504_P_515_RESERVD_L_LEN)
                  ,beginIp65504P515ReservdL
                  ,IP_65504_P_515_RESERVD_L_LEN
                 );
            localIp65504P515ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P515ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P515ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P515ReservdL() {	 
			return (getShort(beginIp65504P515ReservdL));
   	}
         int localIp65504P516ReservdSCounter = -1;
         public boolean isIp65504P516ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P516ReservdSCounter != sharedCounter;
            localIp65504P516ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_516_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P516ReservdS
	 */
	protected void serializeIp65504P516ReservdS(short ip65504P516ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P516ReservdS,IP_65504_P_516_RESERVD_S_LEN)
                  ,beginIp65504P516ReservdS
                  ,IP_65504_P_516_RESERVD_S_LEN
                 );
            localIp65504P516ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P516ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P516ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P516ReservdS() {	 
			return (getShort(beginIp65504P516ReservdS));
   	}
         int localIp65504P516ReservdLCounter = -1;
         public boolean isIp65504P516ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P516ReservdLCounter != sharedCounter;
            localIp65504P516ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_516_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P516ReservdL
	 */
	protected void serializeIp65504P516ReservdL(short ip65504P516ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P516ReservdL,IP_65504_P_516_RESERVD_L_LEN)
                  ,beginIp65504P516ReservdL
                  ,IP_65504_P_516_RESERVD_L_LEN
                 );
            localIp65504P516ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P516ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P516ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P516ReservdL() {	 
			return (getShort(beginIp65504P516ReservdL));
   	}
         int localIp65504P517ReservdSCounter = -1;
         public boolean isIp65504P517ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P517ReservdSCounter != sharedCounter;
            localIp65504P517ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_517_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P517ReservdS
	 */
	protected void serializeIp65504P517ReservdS(short ip65504P517ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P517ReservdS,IP_65504_P_517_RESERVD_S_LEN)
                  ,beginIp65504P517ReservdS
                  ,IP_65504_P_517_RESERVD_S_LEN
                 );
            localIp65504P517ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P517ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P517ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P517ReservdS() {	 
			return (getShort(beginIp65504P517ReservdS));
   	}
         int localIp65504P517ReservdLCounter = -1;
         public boolean isIp65504P517ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P517ReservdLCounter != sharedCounter;
            localIp65504P517ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_517_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P517ReservdL
	 */
	protected void serializeIp65504P517ReservdL(short ip65504P517ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P517ReservdL,IP_65504_P_517_RESERVD_L_LEN)
                  ,beginIp65504P517ReservdL
                  ,IP_65504_P_517_RESERVD_L_LEN
                 );
            localIp65504P517ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P517ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P517ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P517ReservdL() {	 
			return (getShort(beginIp65504P517ReservdL));
   	}
         int localIp65504P518ReservdSCounter = -1;
         public boolean isIp65504P518ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P518ReservdSCounter != sharedCounter;
            localIp65504P518ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_518_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P518ReservdS
	 */
	protected void serializeIp65504P518ReservdS(short ip65504P518ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P518ReservdS,IP_65504_P_518_RESERVD_S_LEN)
                  ,beginIp65504P518ReservdS
                  ,IP_65504_P_518_RESERVD_S_LEN
                 );
            localIp65504P518ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P518ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P518ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P518ReservdS() {	 
			return (getShort(beginIp65504P518ReservdS));
   	}
         int localIp65504P518ReservdLCounter = -1;
         public boolean isIp65504P518ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P518ReservdLCounter != sharedCounter;
            localIp65504P518ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_518_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P518ReservdL
	 */
	protected void serializeIp65504P518ReservdL(short ip65504P518ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P518ReservdL,IP_65504_P_518_RESERVD_L_LEN)
                  ,beginIp65504P518ReservdL
                  ,IP_65504_P_518_RESERVD_L_LEN
                 );
            localIp65504P518ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P518ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P518ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P518ReservdL() {	 
			return (getShort(beginIp65504P518ReservdL));
   	}
         int localIp65504P519ReservdSCounter = -1;
         public boolean isIp65504P519ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P519ReservdSCounter != sharedCounter;
            localIp65504P519ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_519_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P519ReservdS
	 */
	protected void serializeIp65504P519ReservdS(short ip65504P519ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P519ReservdS,IP_65504_P_519_RESERVD_S_LEN)
                  ,beginIp65504P519ReservdS
                  ,IP_65504_P_519_RESERVD_S_LEN
                 );
            localIp65504P519ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P519ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P519ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P519ReservdS() {	 
			return (getShort(beginIp65504P519ReservdS));
   	}
         int localIp65504P519ReservdLCounter = -1;
         public boolean isIp65504P519ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P519ReservdLCounter != sharedCounter;
            localIp65504P519ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_519_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P519ReservdL
	 */
	protected void serializeIp65504P519ReservdL(short ip65504P519ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P519ReservdL,IP_65504_P_519_RESERVD_L_LEN)
                  ,beginIp65504P519ReservdL
                  ,IP_65504_P_519_RESERVD_L_LEN
                 );
            localIp65504P519ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P519ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P519ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P519ReservdL() {	 
			return (getShort(beginIp65504P519ReservdL));
   	}
         int localIp65504P520TravldtSCounter = -1;
         public boolean isIp65504P520TravldtSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P520TravldtSCounter != sharedCounter;
            localIp65504P520TravldtSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_520_TRAVLDT_S_LEN = 2;
  	/**
	 * serializeIp65504P520TravldtS
	 */
	protected void serializeIp65504P520TravldtS(short ip65504P520TravldtS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P520TravldtS,IP_65504_P_520_TRAVLDT_S_LEN)
                  ,beginIp65504P520TravldtS
                  ,IP_65504_P_520_TRAVLDT_S_LEN
                 );
            localIp65504P520TravldtSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P520TravldtSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P520TravldtS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P520TravldtS() {	 
			return (getShort(beginIp65504P520TravldtS));
   	}
         int localIp65504P520TravldtLCounter = -1;
         public boolean isIp65504P520TravldtLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P520TravldtLCounter != sharedCounter;
            localIp65504P520TravldtLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_520_TRAVLDT_L_LEN = 2;
  	/**
	 * serializeIp65504P520TravldtL
	 */
	protected void serializeIp65504P520TravldtL(short ip65504P520TravldtL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P520TravldtL,IP_65504_P_520_TRAVLDT_L_LEN)
                  ,beginIp65504P520TravldtL
                  ,IP_65504_P_520_TRAVLDT_L_LEN
                 );
            localIp65504P520TravldtLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P520TravldtLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P520TravldtL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P520TravldtL() {	 
			return (getShort(beginIp65504P520TravldtL));
   	}
         int localIp65504P521CarrCdSCounter = -1;
         public boolean isIp65504P521CarrCdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P521CarrCdSCounter != sharedCounter;
            localIp65504P521CarrCdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_521_CARR_CD_S_LEN = 2;
  	/**
	 * serializeIp65504P521CarrCdS
	 */
	protected void serializeIp65504P521CarrCdS(short ip65504P521CarrCdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P521CarrCdS,IP_65504_P_521_CARR_CD_S_LEN)
                  ,beginIp65504P521CarrCdS
                  ,IP_65504_P_521_CARR_CD_S_LEN
                 );
            localIp65504P521CarrCdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P521CarrCdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P521CarrCdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P521CarrCdS() {	 
			return (getShort(beginIp65504P521CarrCdS));
   	}
         int localIp65504P521CarrCdLCounter = -1;
         public boolean isIp65504P521CarrCdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P521CarrCdLCounter != sharedCounter;
            localIp65504P521CarrCdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_521_CARR_CD_L_LEN = 2;
  	/**
	 * serializeIp65504P521CarrCdL
	 */
	protected void serializeIp65504P521CarrCdL(short ip65504P521CarrCdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P521CarrCdL,IP_65504_P_521_CARR_CD_L_LEN)
                  ,beginIp65504P521CarrCdL
                  ,IP_65504_P_521_CARR_CD_L_LEN
                 );
            localIp65504P521CarrCdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P521CarrCdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P521CarrCdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P521CarrCdL() {	 
			return (getShort(beginIp65504P521CarrCdL));
   	}
         int localIp65504P522ServCdSCounter = -1;
         public boolean isIp65504P522ServCdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P522ServCdSCounter != sharedCounter;
            localIp65504P522ServCdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_522_SERV_CD_S_LEN = 2;
  	/**
	 * serializeIp65504P522ServCdS
	 */
	protected void serializeIp65504P522ServCdS(short ip65504P522ServCdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P522ServCdS,IP_65504_P_522_SERV_CD_S_LEN)
                  ,beginIp65504P522ServCdS
                  ,IP_65504_P_522_SERV_CD_S_LEN
                 );
            localIp65504P522ServCdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P522ServCdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P522ServCdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P522ServCdS() {	 
			return (getShort(beginIp65504P522ServCdS));
   	}
         int localIp65504P522ServCdLCounter = -1;
         public boolean isIp65504P522ServCdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P522ServCdLCounter != sharedCounter;
            localIp65504P522ServCdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_522_SERV_CD_L_LEN = 2;
  	/**
	 * serializeIp65504P522ServCdL
	 */
	protected void serializeIp65504P522ServCdL(short ip65504P522ServCdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P522ServCdL,IP_65504_P_522_SERV_CD_L_LEN)
                  ,beginIp65504P522ServCdL
                  ,IP_65504_P_522_SERV_CD_L_LEN
                 );
            localIp65504P522ServCdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P522ServCdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P522ServCdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P522ServCdL() {	 
			return (getShort(beginIp65504P522ServCdL));
   	}
         int localIp65504P523OrgCtySCounter = -1;
         public boolean isIp65504P523OrgCtySModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P523OrgCtySCounter != sharedCounter;
            localIp65504P523OrgCtySCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_523_ORG_CTY_S_LEN = 2;
  	/**
	 * serializeIp65504P523OrgCtyS
	 */
	protected void serializeIp65504P523OrgCtyS(short ip65504P523OrgCtyS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P523OrgCtyS,IP_65504_P_523_ORG_CTY_S_LEN)
                  ,beginIp65504P523OrgCtyS
                  ,IP_65504_P_523_ORG_CTY_S_LEN
                 );
            localIp65504P523OrgCtySCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P523OrgCtySMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P523OrgCtyS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P523OrgCtyS() {	 
			return (getShort(beginIp65504P523OrgCtyS));
   	}
         int localIp65504P523OrgCtyLCounter = -1;
         public boolean isIp65504P523OrgCtyLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P523OrgCtyLCounter != sharedCounter;
            localIp65504P523OrgCtyLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_523_ORG_CTY_L_LEN = 2;
  	/**
	 * serializeIp65504P523OrgCtyL
	 */
	protected void serializeIp65504P523OrgCtyL(short ip65504P523OrgCtyL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P523OrgCtyL,IP_65504_P_523_ORG_CTY_L_LEN)
                  ,beginIp65504P523OrgCtyL
                  ,IP_65504_P_523_ORG_CTY_L_LEN
                 );
            localIp65504P523OrgCtyLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P523OrgCtyLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P523OrgCtyL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P523OrgCtyL() {	 
			return (getShort(beginIp65504P523OrgCtyL));
   	}
         int localIp65504P524DesCtySCounter = -1;
         public boolean isIp65504P524DesCtySModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P524DesCtySCounter != sharedCounter;
            localIp65504P524DesCtySCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_524_DES_CTY_S_LEN = 2;
  	/**
	 * serializeIp65504P524DesCtyS
	 */
	protected void serializeIp65504P524DesCtyS(short ip65504P524DesCtyS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P524DesCtyS,IP_65504_P_524_DES_CTY_S_LEN)
                  ,beginIp65504P524DesCtyS
                  ,IP_65504_P_524_DES_CTY_S_LEN
                 );
            localIp65504P524DesCtySCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P524DesCtySMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P524DesCtyS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P524DesCtyS() {	 
			return (getShort(beginIp65504P524DesCtyS));
   	}
         int localIp65504P524DesCtyLCounter = -1;
         public boolean isIp65504P524DesCtyLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P524DesCtyLCounter != sharedCounter;
            localIp65504P524DesCtyLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_524_DES_CTY_L_LEN = 2;
  	/**
	 * serializeIp65504P524DesCtyL
	 */
	protected void serializeIp65504P524DesCtyL(short ip65504P524DesCtyL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P524DesCtyL,IP_65504_P_524_DES_CTY_L_LEN)
                  ,beginIp65504P524DesCtyL
                  ,IP_65504_P_524_DES_CTY_L_LEN
                 );
            localIp65504P524DesCtyLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P524DesCtyLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P524DesCtyL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P524DesCtyL() {	 
			return (getShort(beginIp65504P524DesCtyL));
   	}
         int localIp65504P525StopCdSCounter = -1;
         public boolean isIp65504P525StopCdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P525StopCdSCounter != sharedCounter;
            localIp65504P525StopCdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_525_STOP_CD_S_LEN = 2;
  	/**
	 * serializeIp65504P525StopCdS
	 */
	protected void serializeIp65504P525StopCdS(short ip65504P525StopCdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P525StopCdS,IP_65504_P_525_STOP_CD_S_LEN)
                  ,beginIp65504P525StopCdS
                  ,IP_65504_P_525_STOP_CD_S_LEN
                 );
            localIp65504P525StopCdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P525StopCdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P525StopCdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P525StopCdS() {	 
			return (getShort(beginIp65504P525StopCdS));
   	}
         int localIp65504P525StopCdLCounter = -1;
         public boolean isIp65504P525StopCdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P525StopCdLCounter != sharedCounter;
            localIp65504P525StopCdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_525_STOP_CD_L_LEN = 2;
  	/**
	 * serializeIp65504P525StopCdL
	 */
	protected void serializeIp65504P525StopCdL(short ip65504P525StopCdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P525StopCdL,IP_65504_P_525_STOP_CD_L_LEN)
                  ,beginIp65504P525StopCdL
                  ,IP_65504_P_525_STOP_CD_L_LEN
                 );
            localIp65504P525StopCdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P525StopCdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P525StopCdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P525StopCdL() {	 
			return (getShort(beginIp65504P525StopCdL));
   	}
         int localIp65504P526ConjTkSCounter = -1;
         public boolean isIp65504P526ConjTkSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P526ConjTkSCounter != sharedCounter;
            localIp65504P526ConjTkSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_526_CONJ_TK_S_LEN = 2;
  	/**
	 * serializeIp65504P526ConjTkS
	 */
	protected void serializeIp65504P526ConjTkS(short ip65504P526ConjTkS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P526ConjTkS,IP_65504_P_526_CONJ_TK_S_LEN)
                  ,beginIp65504P526ConjTkS
                  ,IP_65504_P_526_CONJ_TK_S_LEN
                 );
            localIp65504P526ConjTkSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P526ConjTkSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P526ConjTkS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P526ConjTkS() {	 
			return (getShort(beginIp65504P526ConjTkS));
   	}
         int localIp65504P526ConjTkLCounter = -1;
         public boolean isIp65504P526ConjTkLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P526ConjTkLCounter != sharedCounter;
            localIp65504P526ConjTkLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_526_CONJ_TK_L_LEN = 2;
  	/**
	 * serializeIp65504P526ConjTkL
	 */
	protected void serializeIp65504P526ConjTkL(short ip65504P526ConjTkL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P526ConjTkL,IP_65504_P_526_CONJ_TK_L_LEN)
                  ,beginIp65504P526ConjTkL
                  ,IP_65504_P_526_CONJ_TK_L_LEN
                 );
            localIp65504P526ConjTkLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P526ConjTkLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P526ConjTkL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P526ConjTkL() {	 
			return (getShort(beginIp65504P526ConjTkL));
   	}
         int localIp65504P527ExchTkSCounter = -1;
         public boolean isIp65504P527ExchTkSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P527ExchTkSCounter != sharedCounter;
            localIp65504P527ExchTkSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_527_EXCH_TK_S_LEN = 2;
  	/**
	 * serializeIp65504P527ExchTkS
	 */
	protected void serializeIp65504P527ExchTkS(short ip65504P527ExchTkS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P527ExchTkS,IP_65504_P_527_EXCH_TK_S_LEN)
                  ,beginIp65504P527ExchTkS
                  ,IP_65504_P_527_EXCH_TK_S_LEN
                 );
            localIp65504P527ExchTkSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P527ExchTkSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P527ExchTkS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P527ExchTkS() {	 
			return (getShort(beginIp65504P527ExchTkS));
   	}
         int localIp65504P527ExchTkLCounter = -1;
         public boolean isIp65504P527ExchTkLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P527ExchTkLCounter != sharedCounter;
            localIp65504P527ExchTkLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_527_EXCH_TK_L_LEN = 2;
  	/**
	 * serializeIp65504P527ExchTkL
	 */
	protected void serializeIp65504P527ExchTkL(short ip65504P527ExchTkL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P527ExchTkL,IP_65504_P_527_EXCH_TK_L_LEN)
                  ,beginIp65504P527ExchTkL
                  ,IP_65504_P_527_EXCH_TK_L_LEN
                 );
            localIp65504P527ExchTkLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P527ExchTkLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P527ExchTkL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P527ExchTkL() {	 
			return (getShort(beginIp65504P527ExchTkL));
   	}




}
  
