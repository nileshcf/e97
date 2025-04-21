package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip65504DeNamesLargeGroup4Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:04. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip65504DeNamesLargeGroup4Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip65504DeNamesLargeGroup4Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_65504_DE_NAMES_LARGE_GROUP_4_LENGTH = 248;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp65504D94TrxOidS;
            protected  int beginIp65504D94TrxOidL;
            protected  int beginIp65504D95CardIsS;
            protected  int beginIp65504D95CardIsL;
            protected  int beginIp65504D96KeyMgtS;
            protected  int beginIp65504D96KeyMgtL;
            protected  int beginIp65504D97NetAmtS;
            protected  int beginIp65504D97NetAmtL;
            protected  int beginIp65504D98PayeeXS;
            protected  int beginIp65504D98PayeeXL;
            protected  int beginIp65504D99StlInsS;
            protected  int beginIp65504D99StlInsL;
            protected  int beginIp65504D100RecInsS;
            protected  int beginIp65504D100RecInsL;
            protected  int beginIp65504D101FileNmS;
            protected  int beginIp65504D101FileNmL;
            protected  int beginIp65504D102ActId1S;
            protected  int beginIp65504D102ActId1L;
            protected  int beginIp65504D103ActId2S;
            protected  int beginIp65504D103ActId2L;
            protected  int beginIp65504D104TrxDesS;
            protected  int beginIp65504D104TrxDesL;
            protected  int beginIp65504D105CrCbamS;
            protected  int beginIp65504D105CrCbamL;
            protected  int beginIp65504D106DbCbamS;
            protected  int beginIp65504D106DbCbamL;
            protected  int beginIp65504D107CrCbnoS;
            protected  int beginIp65504D107CrCbnoL;
            protected  int beginIp65504D108DbCbnoS;
            protected  int beginIp65504D108DbCbnoL;
            protected  int beginIp65504D109CrFeesS;
            protected  int beginIp65504D109CrFeesL;
            protected  int beginIp65504D110DbFeesS;
            protected  int beginIp65504D110DbFeesL;
            protected  int beginIp65504D111ReservdS;
            protected  int beginIp65504D111ReservdL;
            protected  int beginIp65504D112ReservdS;
            protected  int beginIp65504D112ReservdL;
            protected  int beginIp65504D113ReservdS;
            protected  int beginIp65504D113ReservdL;
            protected  int beginIp65504D114ReservdS;
            protected  int beginIp65504D114ReservdL;
            protected  int beginIp65504D115ReservdS;
            protected  int beginIp65504D115ReservdL;
            protected  int beginIp65504D116ReservdS;
            protected  int beginIp65504D116ReservdL;
            protected  int beginIp65504D117ReservdS;
            protected  int beginIp65504D117ReservdL;
            protected  int beginIp65504D118ReservdS;
            protected  int beginIp65504D118ReservdL;
            protected  int beginIp65504D119ReservdS;
            protected  int beginIp65504D119ReservdL;
            protected  int beginIp65504D120ReservdS;
            protected  int beginIp65504D120ReservdL;
            protected  int beginIp65504D121Addtl2S;
            protected  int beginIp65504D121Addtl2L;
            protected  int beginIp65504D122Addtl3S;
            protected  int beginIp65504D122Addtl3L;
            protected  int beginIp65504D123Addtl4S;
            protected  int beginIp65504D123Addtl4L;
            protected  int beginIp65504D124ReservdS;
            protected  int beginIp65504D124ReservdL;
	
	/**
	* Constructor for Ip65504DeNamesLargeGroup4Serialized
	**/
    public Ip65504DeNamesLargeGroup4Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ip65504DeNamesLargeGroup4Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip65504DeNamesLargeGroup4Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ip65504DeNamesLargeGroup4Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,740); // serialize this field at offset 740 by default 
    }
    
	/**
	* sets parent for this Ip65504DeNamesLargeGroup4Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 740 by default
    }    
	/**
	* initializes the field in Ip65504DeNamesLargeGroup4Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_65504_DE_NAMES_LARGE_GROUP_4_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp65504D94TrxOidS = getStartOffset() + 4;	// set offset for serialization
  
             beginIp65504D94TrxOidL = getStartOffset() + 6;	// set offset for serialization
  
  
             beginIp65504D95CardIsS = getStartOffset() + 12;	// set offset for serialization
  
             beginIp65504D95CardIsL = getStartOffset() + 14;	// set offset for serialization
  
  
             beginIp65504D96KeyMgtS = getStartOffset() + 20;	// set offset for serialization
  
             beginIp65504D96KeyMgtL = getStartOffset() + 22;	// set offset for serialization
  
  
             beginIp65504D97NetAmtS = getStartOffset() + 28;	// set offset for serialization
  
             beginIp65504D97NetAmtL = getStartOffset() + 30;	// set offset for serialization
  
  
             beginIp65504D98PayeeXS = getStartOffset() + 36;	// set offset for serialization
  
             beginIp65504D98PayeeXL = getStartOffset() + 38;	// set offset for serialization
  
  
             beginIp65504D99StlInsS = getStartOffset() + 44;	// set offset for serialization
  
             beginIp65504D99StlInsL = getStartOffset() + 46;	// set offset for serialization
  
  
             beginIp65504D100RecInsS = getStartOffset() + 52;	// set offset for serialization
  
             beginIp65504D100RecInsL = getStartOffset() + 54;	// set offset for serialization
  
  
             beginIp65504D101FileNmS = getStartOffset() + 60;	// set offset for serialization
  
             beginIp65504D101FileNmL = getStartOffset() + 62;	// set offset for serialization
  
  
             beginIp65504D102ActId1S = getStartOffset() + 68;	// set offset for serialization
  
             beginIp65504D102ActId1L = getStartOffset() + 70;	// set offset for serialization
  
  
             beginIp65504D103ActId2S = getStartOffset() + 76;	// set offset for serialization
  
             beginIp65504D103ActId2L = getStartOffset() + 78;	// set offset for serialization
  
  
             beginIp65504D104TrxDesS = getStartOffset() + 84;	// set offset for serialization
  
             beginIp65504D104TrxDesL = getStartOffset() + 86;	// set offset for serialization
  
  
             beginIp65504D105CrCbamS = getStartOffset() + 92;	// set offset for serialization
  
             beginIp65504D105CrCbamL = getStartOffset() + 94;	// set offset for serialization
  
  
             beginIp65504D106DbCbamS = getStartOffset() + 100;	// set offset for serialization
  
             beginIp65504D106DbCbamL = getStartOffset() + 102;	// set offset for serialization
  
  
             beginIp65504D107CrCbnoS = getStartOffset() + 108;	// set offset for serialization
  
             beginIp65504D107CrCbnoL = getStartOffset() + 110;	// set offset for serialization
  
  
             beginIp65504D108DbCbnoS = getStartOffset() + 116;	// set offset for serialization
  
             beginIp65504D108DbCbnoL = getStartOffset() + 118;	// set offset for serialization
  
  
             beginIp65504D109CrFeesS = getStartOffset() + 124;	// set offset for serialization
  
             beginIp65504D109CrFeesL = getStartOffset() + 126;	// set offset for serialization
  
  
             beginIp65504D110DbFeesS = getStartOffset() + 132;	// set offset for serialization
  
             beginIp65504D110DbFeesL = getStartOffset() + 134;	// set offset for serialization
  
  
             beginIp65504D111ReservdS = getStartOffset() + 140;	// set offset for serialization
  
             beginIp65504D111ReservdL = getStartOffset() + 142;	// set offset for serialization
  
  
             beginIp65504D112ReservdS = getStartOffset() + 148;	// set offset for serialization
  
             beginIp65504D112ReservdL = getStartOffset() + 150;	// set offset for serialization
  
  
             beginIp65504D113ReservdS = getStartOffset() + 156;	// set offset for serialization
  
             beginIp65504D113ReservdL = getStartOffset() + 158;	// set offset for serialization
  
  
             beginIp65504D114ReservdS = getStartOffset() + 164;	// set offset for serialization
  
             beginIp65504D114ReservdL = getStartOffset() + 166;	// set offset for serialization
  
  
             beginIp65504D115ReservdS = getStartOffset() + 172;	// set offset for serialization
  
             beginIp65504D115ReservdL = getStartOffset() + 174;	// set offset for serialization
  
  
             beginIp65504D116ReservdS = getStartOffset() + 180;	// set offset for serialization
  
             beginIp65504D116ReservdL = getStartOffset() + 182;	// set offset for serialization
  
  
             beginIp65504D117ReservdS = getStartOffset() + 188;	// set offset for serialization
  
             beginIp65504D117ReservdL = getStartOffset() + 190;	// set offset for serialization
  
  
             beginIp65504D118ReservdS = getStartOffset() + 196;	// set offset for serialization
  
             beginIp65504D118ReservdL = getStartOffset() + 198;	// set offset for serialization
  
  
             beginIp65504D119ReservdS = getStartOffset() + 204;	// set offset for serialization
  
             beginIp65504D119ReservdL = getStartOffset() + 206;	// set offset for serialization
  
  
             beginIp65504D120ReservdS = getStartOffset() + 212;	// set offset for serialization
  
             beginIp65504D120ReservdL = getStartOffset() + 214;	// set offset for serialization
  
  
             beginIp65504D121Addtl2S = getStartOffset() + 220;	// set offset for serialization
  
             beginIp65504D121Addtl2L = getStartOffset() + 222;	// set offset for serialization
  
  
             beginIp65504D122Addtl3S = getStartOffset() + 228;	// set offset for serialization
  
             beginIp65504D122Addtl3L = getStartOffset() + 230;	// set offset for serialization
  
  
             beginIp65504D123Addtl4S = getStartOffset() + 236;	// set offset for serialization
  
             beginIp65504D123Addtl4L = getStartOffset() + 238;	// set offset for serialization
  
  
             beginIp65504D124ReservdS = getStartOffset() + 244;	// set offset for serialization
  
             beginIp65504D124ReservdL = getStartOffset() + 246;	// set offset for serialization
  
  
	   /*  end of offset */
	}
         int localIp65504D94TrxOidSCounter = -1;
         public boolean isIp65504D94TrxOidSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504D94TrxOidSCounter != sharedCounter;
            localIp65504D94TrxOidSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_D_94_TRX_OID_S_LEN = 2;
  	/**
	 * serializeIp65504D94TrxOidS
	 */
	protected void serializeIp65504D94TrxOidS(short ip65504D94TrxOidS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504D94TrxOidS,IP_65504_D_94_TRX_OID_S_LEN)
                  ,beginIp65504D94TrxOidS
                  ,IP_65504_D_94_TRX_OID_S_LEN
                 );
            localIp65504D94TrxOidSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504D94TrxOidSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504D94TrxOidS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504D94TrxOidS() {	 
			return (getShort(beginIp65504D94TrxOidS));
   	}
         int localIp65504D94TrxOidLCounter = -1;
         public boolean isIp65504D94TrxOidLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504D94TrxOidLCounter != sharedCounter;
            localIp65504D94TrxOidLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_D_94_TRX_OID_L_LEN = 2;
  	/**
	 * serializeIp65504D94TrxOidL
	 */
	protected void serializeIp65504D94TrxOidL(short ip65504D94TrxOidL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504D94TrxOidL,IP_65504_D_94_TRX_OID_L_LEN)
                  ,beginIp65504D94TrxOidL
                  ,IP_65504_D_94_TRX_OID_L_LEN
                 );
            localIp65504D94TrxOidLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504D94TrxOidLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504D94TrxOidL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504D94TrxOidL() {	 
			return (getShort(beginIp65504D94TrxOidL));
   	}
         int localIp65504D95CardIsSCounter = -1;
         public boolean isIp65504D95CardIsSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504D95CardIsSCounter != sharedCounter;
            localIp65504D95CardIsSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_D_95_CARD_IS_S_LEN = 2;
  	/**
	 * serializeIp65504D95CardIsS
	 */
	protected void serializeIp65504D95CardIsS(short ip65504D95CardIsS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504D95CardIsS,IP_65504_D_95_CARD_IS_S_LEN)
                  ,beginIp65504D95CardIsS
                  ,IP_65504_D_95_CARD_IS_S_LEN
                 );
            localIp65504D95CardIsSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504D95CardIsSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504D95CardIsS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504D95CardIsS() {	 
			return (getShort(beginIp65504D95CardIsS));
   	}
         int localIp65504D95CardIsLCounter = -1;
         public boolean isIp65504D95CardIsLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504D95CardIsLCounter != sharedCounter;
            localIp65504D95CardIsLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_D_95_CARD_IS_L_LEN = 2;
  	/**
	 * serializeIp65504D95CardIsL
	 */
	protected void serializeIp65504D95CardIsL(short ip65504D95CardIsL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504D95CardIsL,IP_65504_D_95_CARD_IS_L_LEN)
                  ,beginIp65504D95CardIsL
                  ,IP_65504_D_95_CARD_IS_L_LEN
                 );
            localIp65504D95CardIsLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504D95CardIsLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504D95CardIsL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504D95CardIsL() {	 
			return (getShort(beginIp65504D95CardIsL));
   	}
         int localIp65504D96KeyMgtSCounter = -1;
         public boolean isIp65504D96KeyMgtSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504D96KeyMgtSCounter != sharedCounter;
            localIp65504D96KeyMgtSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_D_96_KEY_MGT_S_LEN = 2;
  	/**
	 * serializeIp65504D96KeyMgtS
	 */
	protected void serializeIp65504D96KeyMgtS(short ip65504D96KeyMgtS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504D96KeyMgtS,IP_65504_D_96_KEY_MGT_S_LEN)
                  ,beginIp65504D96KeyMgtS
                  ,IP_65504_D_96_KEY_MGT_S_LEN
                 );
            localIp65504D96KeyMgtSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504D96KeyMgtSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504D96KeyMgtS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504D96KeyMgtS() {	 
			return (getShort(beginIp65504D96KeyMgtS));
   	}
         int localIp65504D96KeyMgtLCounter = -1;
         public boolean isIp65504D96KeyMgtLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504D96KeyMgtLCounter != sharedCounter;
            localIp65504D96KeyMgtLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_D_96_KEY_MGT_L_LEN = 2;
  	/**
	 * serializeIp65504D96KeyMgtL
	 */
	protected void serializeIp65504D96KeyMgtL(short ip65504D96KeyMgtL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504D96KeyMgtL,IP_65504_D_96_KEY_MGT_L_LEN)
                  ,beginIp65504D96KeyMgtL
                  ,IP_65504_D_96_KEY_MGT_L_LEN
                 );
            localIp65504D96KeyMgtLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504D96KeyMgtLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504D96KeyMgtL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504D96KeyMgtL() {	 
			return (getShort(beginIp65504D96KeyMgtL));
   	}
         int localIp65504D97NetAmtSCounter = -1;
         public boolean isIp65504D97NetAmtSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504D97NetAmtSCounter != sharedCounter;
            localIp65504D97NetAmtSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_D_97_NET_AMT_S_LEN = 2;
  	/**
	 * serializeIp65504D97NetAmtS
	 */
	protected void serializeIp65504D97NetAmtS(short ip65504D97NetAmtS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504D97NetAmtS,IP_65504_D_97_NET_AMT_S_LEN)
                  ,beginIp65504D97NetAmtS
                  ,IP_65504_D_97_NET_AMT_S_LEN
                 );
            localIp65504D97NetAmtSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504D97NetAmtSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504D97NetAmtS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504D97NetAmtS() {	 
			return (getShort(beginIp65504D97NetAmtS));
   	}
         int localIp65504D97NetAmtLCounter = -1;
         public boolean isIp65504D97NetAmtLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504D97NetAmtLCounter != sharedCounter;
            localIp65504D97NetAmtLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_D_97_NET_AMT_L_LEN = 2;
  	/**
	 * serializeIp65504D97NetAmtL
	 */
	protected void serializeIp65504D97NetAmtL(short ip65504D97NetAmtL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504D97NetAmtL,IP_65504_D_97_NET_AMT_L_LEN)
                  ,beginIp65504D97NetAmtL
                  ,IP_65504_D_97_NET_AMT_L_LEN
                 );
            localIp65504D97NetAmtLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504D97NetAmtLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504D97NetAmtL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504D97NetAmtL() {	 
			return (getShort(beginIp65504D97NetAmtL));
   	}
         int localIp65504D98PayeeXSCounter = -1;
         public boolean isIp65504D98PayeeXSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504D98PayeeXSCounter != sharedCounter;
            localIp65504D98PayeeXSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_D_98_PAYEE_XS_LEN = 2;
  	/**
	 * serializeIp65504D98PayeeXS
	 */
	protected void serializeIp65504D98PayeeXS(short ip65504D98PayeeXS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504D98PayeeXS,IP_65504_D_98_PAYEE_XS_LEN)
                  ,beginIp65504D98PayeeXS
                  ,IP_65504_D_98_PAYEE_XS_LEN
                 );
            localIp65504D98PayeeXSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504D98PayeeXSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504D98PayeeXS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504D98PayeeXS() {	 
			return (getShort(beginIp65504D98PayeeXS));
   	}
         int localIp65504D98PayeeXLCounter = -1;
         public boolean isIp65504D98PayeeXLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504D98PayeeXLCounter != sharedCounter;
            localIp65504D98PayeeXLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_D_98_PAYEE_XL_LEN = 2;
  	/**
	 * serializeIp65504D98PayeeXL
	 */
	protected void serializeIp65504D98PayeeXL(short ip65504D98PayeeXL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504D98PayeeXL,IP_65504_D_98_PAYEE_XL_LEN)
                  ,beginIp65504D98PayeeXL
                  ,IP_65504_D_98_PAYEE_XL_LEN
                 );
            localIp65504D98PayeeXLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504D98PayeeXLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504D98PayeeXL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504D98PayeeXL() {	 
			return (getShort(beginIp65504D98PayeeXL));
   	}
         int localIp65504D99StlInsSCounter = -1;
         public boolean isIp65504D99StlInsSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504D99StlInsSCounter != sharedCounter;
            localIp65504D99StlInsSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_D_99_STL_INS_S_LEN = 2;
  	/**
	 * serializeIp65504D99StlInsS
	 */
	protected void serializeIp65504D99StlInsS(short ip65504D99StlInsS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504D99StlInsS,IP_65504_D_99_STL_INS_S_LEN)
                  ,beginIp65504D99StlInsS
                  ,IP_65504_D_99_STL_INS_S_LEN
                 );
            localIp65504D99StlInsSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504D99StlInsSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504D99StlInsS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504D99StlInsS() {	 
			return (getShort(beginIp65504D99StlInsS));
   	}
         int localIp65504D99StlInsLCounter = -1;
         public boolean isIp65504D99StlInsLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504D99StlInsLCounter != sharedCounter;
            localIp65504D99StlInsLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_D_99_STL_INS_L_LEN = 2;
  	/**
	 * serializeIp65504D99StlInsL
	 */
	protected void serializeIp65504D99StlInsL(short ip65504D99StlInsL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504D99StlInsL,IP_65504_D_99_STL_INS_L_LEN)
                  ,beginIp65504D99StlInsL
                  ,IP_65504_D_99_STL_INS_L_LEN
                 );
            localIp65504D99StlInsLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504D99StlInsLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504D99StlInsL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504D99StlInsL() {	 
			return (getShort(beginIp65504D99StlInsL));
   	}
         int localIp65504D100RecInsSCounter = -1;
         public boolean isIp65504D100RecInsSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504D100RecInsSCounter != sharedCounter;
            localIp65504D100RecInsSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_D_100_REC_INS_S_LEN = 2;
  	/**
	 * serializeIp65504D100RecInsS
	 */
	protected void serializeIp65504D100RecInsS(short ip65504D100RecInsS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504D100RecInsS,IP_65504_D_100_REC_INS_S_LEN)
                  ,beginIp65504D100RecInsS
                  ,IP_65504_D_100_REC_INS_S_LEN
                 );
            localIp65504D100RecInsSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504D100RecInsSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504D100RecInsS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504D100RecInsS() {	 
			return (getShort(beginIp65504D100RecInsS));
   	}
         int localIp65504D100RecInsLCounter = -1;
         public boolean isIp65504D100RecInsLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504D100RecInsLCounter != sharedCounter;
            localIp65504D100RecInsLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_D_100_REC_INS_L_LEN = 2;
  	/**
	 * serializeIp65504D100RecInsL
	 */
	protected void serializeIp65504D100RecInsL(short ip65504D100RecInsL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504D100RecInsL,IP_65504_D_100_REC_INS_L_LEN)
                  ,beginIp65504D100RecInsL
                  ,IP_65504_D_100_REC_INS_L_LEN
                 );
            localIp65504D100RecInsLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504D100RecInsLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504D100RecInsL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504D100RecInsL() {	 
			return (getShort(beginIp65504D100RecInsL));
   	}
         int localIp65504D101FileNmSCounter = -1;
         public boolean isIp65504D101FileNmSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504D101FileNmSCounter != sharedCounter;
            localIp65504D101FileNmSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_D_101_FILE_NM_S_LEN = 2;
  	/**
	 * serializeIp65504D101FileNmS
	 */
	protected void serializeIp65504D101FileNmS(short ip65504D101FileNmS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504D101FileNmS,IP_65504_D_101_FILE_NM_S_LEN)
                  ,beginIp65504D101FileNmS
                  ,IP_65504_D_101_FILE_NM_S_LEN
                 );
            localIp65504D101FileNmSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504D101FileNmSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504D101FileNmS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504D101FileNmS() {	 
			return (getShort(beginIp65504D101FileNmS));
   	}
         int localIp65504D101FileNmLCounter = -1;
         public boolean isIp65504D101FileNmLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504D101FileNmLCounter != sharedCounter;
            localIp65504D101FileNmLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_D_101_FILE_NM_L_LEN = 2;
  	/**
	 * serializeIp65504D101FileNmL
	 */
	protected void serializeIp65504D101FileNmL(short ip65504D101FileNmL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504D101FileNmL,IP_65504_D_101_FILE_NM_L_LEN)
                  ,beginIp65504D101FileNmL
                  ,IP_65504_D_101_FILE_NM_L_LEN
                 );
            localIp65504D101FileNmLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504D101FileNmLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504D101FileNmL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504D101FileNmL() {	 
			return (getShort(beginIp65504D101FileNmL));
   	}
         int localIp65504D102ActId1SCounter = -1;
         public boolean isIp65504D102ActId1SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504D102ActId1SCounter != sharedCounter;
            localIp65504D102ActId1SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_D_102_ACT_ID_1_S_LEN = 2;
  	/**
	 * serializeIp65504D102ActId1S
	 */
	protected void serializeIp65504D102ActId1S(short ip65504D102ActId1S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504D102ActId1S,IP_65504_D_102_ACT_ID_1_S_LEN)
                  ,beginIp65504D102ActId1S
                  ,IP_65504_D_102_ACT_ID_1_S_LEN
                 );
            localIp65504D102ActId1SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504D102ActId1SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504D102ActId1S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504D102ActId1S() {	 
			return (getShort(beginIp65504D102ActId1S));
   	}
         int localIp65504D102ActId1LCounter = -1;
         public boolean isIp65504D102ActId1LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504D102ActId1LCounter != sharedCounter;
            localIp65504D102ActId1LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_D_102_ACT_ID_1_L_LEN = 2;
  	/**
	 * serializeIp65504D102ActId1L
	 */
	protected void serializeIp65504D102ActId1L(short ip65504D102ActId1L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504D102ActId1L,IP_65504_D_102_ACT_ID_1_L_LEN)
                  ,beginIp65504D102ActId1L
                  ,IP_65504_D_102_ACT_ID_1_L_LEN
                 );
            localIp65504D102ActId1LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504D102ActId1LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504D102ActId1L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504D102ActId1L() {	 
			return (getShort(beginIp65504D102ActId1L));
   	}
         int localIp65504D103ActId2SCounter = -1;
         public boolean isIp65504D103ActId2SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504D103ActId2SCounter != sharedCounter;
            localIp65504D103ActId2SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_D_103_ACT_ID_2_S_LEN = 2;
  	/**
	 * serializeIp65504D103ActId2S
	 */
	protected void serializeIp65504D103ActId2S(short ip65504D103ActId2S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504D103ActId2S,IP_65504_D_103_ACT_ID_2_S_LEN)
                  ,beginIp65504D103ActId2S
                  ,IP_65504_D_103_ACT_ID_2_S_LEN
                 );
            localIp65504D103ActId2SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504D103ActId2SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504D103ActId2S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504D103ActId2S() {	 
			return (getShort(beginIp65504D103ActId2S));
   	}
         int localIp65504D103ActId2LCounter = -1;
         public boolean isIp65504D103ActId2LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504D103ActId2LCounter != sharedCounter;
            localIp65504D103ActId2LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_D_103_ACT_ID_2_L_LEN = 2;
  	/**
	 * serializeIp65504D103ActId2L
	 */
	protected void serializeIp65504D103ActId2L(short ip65504D103ActId2L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504D103ActId2L,IP_65504_D_103_ACT_ID_2_L_LEN)
                  ,beginIp65504D103ActId2L
                  ,IP_65504_D_103_ACT_ID_2_L_LEN
                 );
            localIp65504D103ActId2LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504D103ActId2LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504D103ActId2L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504D103ActId2L() {	 
			return (getShort(beginIp65504D103ActId2L));
   	}
         int localIp65504D104TrxDesSCounter = -1;
         public boolean isIp65504D104TrxDesSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504D104TrxDesSCounter != sharedCounter;
            localIp65504D104TrxDesSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_D_104_TRX_DES_S_LEN = 2;
  	/**
	 * serializeIp65504D104TrxDesS
	 */
	protected void serializeIp65504D104TrxDesS(short ip65504D104TrxDesS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504D104TrxDesS,IP_65504_D_104_TRX_DES_S_LEN)
                  ,beginIp65504D104TrxDesS
                  ,IP_65504_D_104_TRX_DES_S_LEN
                 );
            localIp65504D104TrxDesSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504D104TrxDesSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504D104TrxDesS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504D104TrxDesS() {	 
			return (getShort(beginIp65504D104TrxDesS));
   	}
         int localIp65504D104TrxDesLCounter = -1;
         public boolean isIp65504D104TrxDesLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504D104TrxDesLCounter != sharedCounter;
            localIp65504D104TrxDesLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_D_104_TRX_DES_L_LEN = 2;
  	/**
	 * serializeIp65504D104TrxDesL
	 */
	protected void serializeIp65504D104TrxDesL(short ip65504D104TrxDesL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504D104TrxDesL,IP_65504_D_104_TRX_DES_L_LEN)
                  ,beginIp65504D104TrxDesL
                  ,IP_65504_D_104_TRX_DES_L_LEN
                 );
            localIp65504D104TrxDesLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504D104TrxDesLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504D104TrxDesL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504D104TrxDesL() {	 
			return (getShort(beginIp65504D104TrxDesL));
   	}
         int localIp65504D105CrCbamSCounter = -1;
         public boolean isIp65504D105CrCbamSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504D105CrCbamSCounter != sharedCounter;
            localIp65504D105CrCbamSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_D_105_CR_CBAM_S_LEN = 2;
  	/**
	 * serializeIp65504D105CrCbamS
	 */
	protected void serializeIp65504D105CrCbamS(short ip65504D105CrCbamS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504D105CrCbamS,IP_65504_D_105_CR_CBAM_S_LEN)
                  ,beginIp65504D105CrCbamS
                  ,IP_65504_D_105_CR_CBAM_S_LEN
                 );
            localIp65504D105CrCbamSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504D105CrCbamSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504D105CrCbamS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504D105CrCbamS() {	 
			return (getShort(beginIp65504D105CrCbamS));
   	}
         int localIp65504D105CrCbamLCounter = -1;
         public boolean isIp65504D105CrCbamLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504D105CrCbamLCounter != sharedCounter;
            localIp65504D105CrCbamLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_D_105_CR_CBAM_L_LEN = 2;
  	/**
	 * serializeIp65504D105CrCbamL
	 */
	protected void serializeIp65504D105CrCbamL(short ip65504D105CrCbamL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504D105CrCbamL,IP_65504_D_105_CR_CBAM_L_LEN)
                  ,beginIp65504D105CrCbamL
                  ,IP_65504_D_105_CR_CBAM_L_LEN
                 );
            localIp65504D105CrCbamLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504D105CrCbamLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504D105CrCbamL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504D105CrCbamL() {	 
			return (getShort(beginIp65504D105CrCbamL));
   	}
         int localIp65504D106DbCbamSCounter = -1;
         public boolean isIp65504D106DbCbamSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504D106DbCbamSCounter != sharedCounter;
            localIp65504D106DbCbamSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_D_106_DB_CBAM_S_LEN = 2;
  	/**
	 * serializeIp65504D106DbCbamS
	 */
	protected void serializeIp65504D106DbCbamS(short ip65504D106DbCbamS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504D106DbCbamS,IP_65504_D_106_DB_CBAM_S_LEN)
                  ,beginIp65504D106DbCbamS
                  ,IP_65504_D_106_DB_CBAM_S_LEN
                 );
            localIp65504D106DbCbamSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504D106DbCbamSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504D106DbCbamS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504D106DbCbamS() {	 
			return (getShort(beginIp65504D106DbCbamS));
   	}
         int localIp65504D106DbCbamLCounter = -1;
         public boolean isIp65504D106DbCbamLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504D106DbCbamLCounter != sharedCounter;
            localIp65504D106DbCbamLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_D_106_DB_CBAM_L_LEN = 2;
  	/**
	 * serializeIp65504D106DbCbamL
	 */
	protected void serializeIp65504D106DbCbamL(short ip65504D106DbCbamL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504D106DbCbamL,IP_65504_D_106_DB_CBAM_L_LEN)
                  ,beginIp65504D106DbCbamL
                  ,IP_65504_D_106_DB_CBAM_L_LEN
                 );
            localIp65504D106DbCbamLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504D106DbCbamLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504D106DbCbamL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504D106DbCbamL() {	 
			return (getShort(beginIp65504D106DbCbamL));
   	}
         int localIp65504D107CrCbnoSCounter = -1;
         public boolean isIp65504D107CrCbnoSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504D107CrCbnoSCounter != sharedCounter;
            localIp65504D107CrCbnoSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_D_107_CR_CBNO_S_LEN = 2;
  	/**
	 * serializeIp65504D107CrCbnoS
	 */
	protected void serializeIp65504D107CrCbnoS(short ip65504D107CrCbnoS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504D107CrCbnoS,IP_65504_D_107_CR_CBNO_S_LEN)
                  ,beginIp65504D107CrCbnoS
                  ,IP_65504_D_107_CR_CBNO_S_LEN
                 );
            localIp65504D107CrCbnoSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504D107CrCbnoSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504D107CrCbnoS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504D107CrCbnoS() {	 
			return (getShort(beginIp65504D107CrCbnoS));
   	}
         int localIp65504D107CrCbnoLCounter = -1;
         public boolean isIp65504D107CrCbnoLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504D107CrCbnoLCounter != sharedCounter;
            localIp65504D107CrCbnoLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_D_107_CR_CBNO_L_LEN = 2;
  	/**
	 * serializeIp65504D107CrCbnoL
	 */
	protected void serializeIp65504D107CrCbnoL(short ip65504D107CrCbnoL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504D107CrCbnoL,IP_65504_D_107_CR_CBNO_L_LEN)
                  ,beginIp65504D107CrCbnoL
                  ,IP_65504_D_107_CR_CBNO_L_LEN
                 );
            localIp65504D107CrCbnoLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504D107CrCbnoLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504D107CrCbnoL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504D107CrCbnoL() {	 
			return (getShort(beginIp65504D107CrCbnoL));
   	}
         int localIp65504D108DbCbnoSCounter = -1;
         public boolean isIp65504D108DbCbnoSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504D108DbCbnoSCounter != sharedCounter;
            localIp65504D108DbCbnoSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_D_108_DB_CBNO_S_LEN = 2;
  	/**
	 * serializeIp65504D108DbCbnoS
	 */
	protected void serializeIp65504D108DbCbnoS(short ip65504D108DbCbnoS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504D108DbCbnoS,IP_65504_D_108_DB_CBNO_S_LEN)
                  ,beginIp65504D108DbCbnoS
                  ,IP_65504_D_108_DB_CBNO_S_LEN
                 );
            localIp65504D108DbCbnoSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504D108DbCbnoSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504D108DbCbnoS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504D108DbCbnoS() {	 
			return (getShort(beginIp65504D108DbCbnoS));
   	}
         int localIp65504D108DbCbnoLCounter = -1;
         public boolean isIp65504D108DbCbnoLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504D108DbCbnoLCounter != sharedCounter;
            localIp65504D108DbCbnoLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_D_108_DB_CBNO_L_LEN = 2;
  	/**
	 * serializeIp65504D108DbCbnoL
	 */
	protected void serializeIp65504D108DbCbnoL(short ip65504D108DbCbnoL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504D108DbCbnoL,IP_65504_D_108_DB_CBNO_L_LEN)
                  ,beginIp65504D108DbCbnoL
                  ,IP_65504_D_108_DB_CBNO_L_LEN
                 );
            localIp65504D108DbCbnoLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504D108DbCbnoLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504D108DbCbnoL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504D108DbCbnoL() {	 
			return (getShort(beginIp65504D108DbCbnoL));
   	}
         int localIp65504D109CrFeesSCounter = -1;
         public boolean isIp65504D109CrFeesSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504D109CrFeesSCounter != sharedCounter;
            localIp65504D109CrFeesSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_D_109_CR_FEES_S_LEN = 2;
  	/**
	 * serializeIp65504D109CrFeesS
	 */
	protected void serializeIp65504D109CrFeesS(short ip65504D109CrFeesS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504D109CrFeesS,IP_65504_D_109_CR_FEES_S_LEN)
                  ,beginIp65504D109CrFeesS
                  ,IP_65504_D_109_CR_FEES_S_LEN
                 );
            localIp65504D109CrFeesSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504D109CrFeesSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504D109CrFeesS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504D109CrFeesS() {	 
			return (getShort(beginIp65504D109CrFeesS));
   	}
         int localIp65504D109CrFeesLCounter = -1;
         public boolean isIp65504D109CrFeesLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504D109CrFeesLCounter != sharedCounter;
            localIp65504D109CrFeesLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_D_109_CR_FEES_L_LEN = 2;
  	/**
	 * serializeIp65504D109CrFeesL
	 */
	protected void serializeIp65504D109CrFeesL(short ip65504D109CrFeesL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504D109CrFeesL,IP_65504_D_109_CR_FEES_L_LEN)
                  ,beginIp65504D109CrFeesL
                  ,IP_65504_D_109_CR_FEES_L_LEN
                 );
            localIp65504D109CrFeesLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504D109CrFeesLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504D109CrFeesL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504D109CrFeesL() {	 
			return (getShort(beginIp65504D109CrFeesL));
   	}
         int localIp65504D110DbFeesSCounter = -1;
         public boolean isIp65504D110DbFeesSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504D110DbFeesSCounter != sharedCounter;
            localIp65504D110DbFeesSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_D_110_DB_FEES_S_LEN = 2;
  	/**
	 * serializeIp65504D110DbFeesS
	 */
	protected void serializeIp65504D110DbFeesS(short ip65504D110DbFeesS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504D110DbFeesS,IP_65504_D_110_DB_FEES_S_LEN)
                  ,beginIp65504D110DbFeesS
                  ,IP_65504_D_110_DB_FEES_S_LEN
                 );
            localIp65504D110DbFeesSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504D110DbFeesSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504D110DbFeesS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504D110DbFeesS() {	 
			return (getShort(beginIp65504D110DbFeesS));
   	}
         int localIp65504D110DbFeesLCounter = -1;
         public boolean isIp65504D110DbFeesLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504D110DbFeesLCounter != sharedCounter;
            localIp65504D110DbFeesLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_D_110_DB_FEES_L_LEN = 2;
  	/**
	 * serializeIp65504D110DbFeesL
	 */
	protected void serializeIp65504D110DbFeesL(short ip65504D110DbFeesL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504D110DbFeesL,IP_65504_D_110_DB_FEES_L_LEN)
                  ,beginIp65504D110DbFeesL
                  ,IP_65504_D_110_DB_FEES_L_LEN
                 );
            localIp65504D110DbFeesLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504D110DbFeesLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504D110DbFeesL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504D110DbFeesL() {	 
			return (getShort(beginIp65504D110DbFeesL));
   	}
         int localIp65504D111ReservdSCounter = -1;
         public boolean isIp65504D111ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504D111ReservdSCounter != sharedCounter;
            localIp65504D111ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_D_111_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504D111ReservdS
	 */
	protected void serializeIp65504D111ReservdS(short ip65504D111ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504D111ReservdS,IP_65504_D_111_RESERVD_S_LEN)
                  ,beginIp65504D111ReservdS
                  ,IP_65504_D_111_RESERVD_S_LEN
                 );
            localIp65504D111ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504D111ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504D111ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504D111ReservdS() {	 
			return (getShort(beginIp65504D111ReservdS));
   	}
         int localIp65504D111ReservdLCounter = -1;
         public boolean isIp65504D111ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504D111ReservdLCounter != sharedCounter;
            localIp65504D111ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_D_111_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504D111ReservdL
	 */
	protected void serializeIp65504D111ReservdL(short ip65504D111ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504D111ReservdL,IP_65504_D_111_RESERVD_L_LEN)
                  ,beginIp65504D111ReservdL
                  ,IP_65504_D_111_RESERVD_L_LEN
                 );
            localIp65504D111ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504D111ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504D111ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504D111ReservdL() {	 
			return (getShort(beginIp65504D111ReservdL));
   	}
         int localIp65504D112ReservdSCounter = -1;
         public boolean isIp65504D112ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504D112ReservdSCounter != sharedCounter;
            localIp65504D112ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_D_112_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504D112ReservdS
	 */
	protected void serializeIp65504D112ReservdS(short ip65504D112ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504D112ReservdS,IP_65504_D_112_RESERVD_S_LEN)
                  ,beginIp65504D112ReservdS
                  ,IP_65504_D_112_RESERVD_S_LEN
                 );
            localIp65504D112ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504D112ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504D112ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504D112ReservdS() {	 
			return (getShort(beginIp65504D112ReservdS));
   	}
         int localIp65504D112ReservdLCounter = -1;
         public boolean isIp65504D112ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504D112ReservdLCounter != sharedCounter;
            localIp65504D112ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_D_112_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504D112ReservdL
	 */
	protected void serializeIp65504D112ReservdL(short ip65504D112ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504D112ReservdL,IP_65504_D_112_RESERVD_L_LEN)
                  ,beginIp65504D112ReservdL
                  ,IP_65504_D_112_RESERVD_L_LEN
                 );
            localIp65504D112ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504D112ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504D112ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504D112ReservdL() {	 
			return (getShort(beginIp65504D112ReservdL));
   	}
         int localIp65504D113ReservdSCounter = -1;
         public boolean isIp65504D113ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504D113ReservdSCounter != sharedCounter;
            localIp65504D113ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_D_113_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504D113ReservdS
	 */
	protected void serializeIp65504D113ReservdS(short ip65504D113ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504D113ReservdS,IP_65504_D_113_RESERVD_S_LEN)
                  ,beginIp65504D113ReservdS
                  ,IP_65504_D_113_RESERVD_S_LEN
                 );
            localIp65504D113ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504D113ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504D113ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504D113ReservdS() {	 
			return (getShort(beginIp65504D113ReservdS));
   	}
         int localIp65504D113ReservdLCounter = -1;
         public boolean isIp65504D113ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504D113ReservdLCounter != sharedCounter;
            localIp65504D113ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_D_113_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504D113ReservdL
	 */
	protected void serializeIp65504D113ReservdL(short ip65504D113ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504D113ReservdL,IP_65504_D_113_RESERVD_L_LEN)
                  ,beginIp65504D113ReservdL
                  ,IP_65504_D_113_RESERVD_L_LEN
                 );
            localIp65504D113ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504D113ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504D113ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504D113ReservdL() {	 
			return (getShort(beginIp65504D113ReservdL));
   	}
         int localIp65504D114ReservdSCounter = -1;
         public boolean isIp65504D114ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504D114ReservdSCounter != sharedCounter;
            localIp65504D114ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_D_114_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504D114ReservdS
	 */
	protected void serializeIp65504D114ReservdS(short ip65504D114ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504D114ReservdS,IP_65504_D_114_RESERVD_S_LEN)
                  ,beginIp65504D114ReservdS
                  ,IP_65504_D_114_RESERVD_S_LEN
                 );
            localIp65504D114ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504D114ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504D114ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504D114ReservdS() {	 
			return (getShort(beginIp65504D114ReservdS));
   	}
         int localIp65504D114ReservdLCounter = -1;
         public boolean isIp65504D114ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504D114ReservdLCounter != sharedCounter;
            localIp65504D114ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_D_114_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504D114ReservdL
	 */
	protected void serializeIp65504D114ReservdL(short ip65504D114ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504D114ReservdL,IP_65504_D_114_RESERVD_L_LEN)
                  ,beginIp65504D114ReservdL
                  ,IP_65504_D_114_RESERVD_L_LEN
                 );
            localIp65504D114ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504D114ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504D114ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504D114ReservdL() {	 
			return (getShort(beginIp65504D114ReservdL));
   	}
         int localIp65504D115ReservdSCounter = -1;
         public boolean isIp65504D115ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504D115ReservdSCounter != sharedCounter;
            localIp65504D115ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_D_115_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504D115ReservdS
	 */
	protected void serializeIp65504D115ReservdS(short ip65504D115ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504D115ReservdS,IP_65504_D_115_RESERVD_S_LEN)
                  ,beginIp65504D115ReservdS
                  ,IP_65504_D_115_RESERVD_S_LEN
                 );
            localIp65504D115ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504D115ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504D115ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504D115ReservdS() {	 
			return (getShort(beginIp65504D115ReservdS));
   	}
         int localIp65504D115ReservdLCounter = -1;
         public boolean isIp65504D115ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504D115ReservdLCounter != sharedCounter;
            localIp65504D115ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_D_115_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504D115ReservdL
	 */
	protected void serializeIp65504D115ReservdL(short ip65504D115ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504D115ReservdL,IP_65504_D_115_RESERVD_L_LEN)
                  ,beginIp65504D115ReservdL
                  ,IP_65504_D_115_RESERVD_L_LEN
                 );
            localIp65504D115ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504D115ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504D115ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504D115ReservdL() {	 
			return (getShort(beginIp65504D115ReservdL));
   	}
         int localIp65504D116ReservdSCounter = -1;
         public boolean isIp65504D116ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504D116ReservdSCounter != sharedCounter;
            localIp65504D116ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_D_116_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504D116ReservdS
	 */
	protected void serializeIp65504D116ReservdS(short ip65504D116ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504D116ReservdS,IP_65504_D_116_RESERVD_S_LEN)
                  ,beginIp65504D116ReservdS
                  ,IP_65504_D_116_RESERVD_S_LEN
                 );
            localIp65504D116ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504D116ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504D116ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504D116ReservdS() {	 
			return (getShort(beginIp65504D116ReservdS));
   	}
         int localIp65504D116ReservdLCounter = -1;
         public boolean isIp65504D116ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504D116ReservdLCounter != sharedCounter;
            localIp65504D116ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_D_116_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504D116ReservdL
	 */
	protected void serializeIp65504D116ReservdL(short ip65504D116ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504D116ReservdL,IP_65504_D_116_RESERVD_L_LEN)
                  ,beginIp65504D116ReservdL
                  ,IP_65504_D_116_RESERVD_L_LEN
                 );
            localIp65504D116ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504D116ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504D116ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504D116ReservdL() {	 
			return (getShort(beginIp65504D116ReservdL));
   	}
         int localIp65504D117ReservdSCounter = -1;
         public boolean isIp65504D117ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504D117ReservdSCounter != sharedCounter;
            localIp65504D117ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_D_117_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504D117ReservdS
	 */
	protected void serializeIp65504D117ReservdS(short ip65504D117ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504D117ReservdS,IP_65504_D_117_RESERVD_S_LEN)
                  ,beginIp65504D117ReservdS
                  ,IP_65504_D_117_RESERVD_S_LEN
                 );
            localIp65504D117ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504D117ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504D117ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504D117ReservdS() {	 
			return (getShort(beginIp65504D117ReservdS));
   	}
         int localIp65504D117ReservdLCounter = -1;
         public boolean isIp65504D117ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504D117ReservdLCounter != sharedCounter;
            localIp65504D117ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_D_117_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504D117ReservdL
	 */
	protected void serializeIp65504D117ReservdL(short ip65504D117ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504D117ReservdL,IP_65504_D_117_RESERVD_L_LEN)
                  ,beginIp65504D117ReservdL
                  ,IP_65504_D_117_RESERVD_L_LEN
                 );
            localIp65504D117ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504D117ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504D117ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504D117ReservdL() {	 
			return (getShort(beginIp65504D117ReservdL));
   	}
         int localIp65504D118ReservdSCounter = -1;
         public boolean isIp65504D118ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504D118ReservdSCounter != sharedCounter;
            localIp65504D118ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_D_118_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504D118ReservdS
	 */
	protected void serializeIp65504D118ReservdS(short ip65504D118ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504D118ReservdS,IP_65504_D_118_RESERVD_S_LEN)
                  ,beginIp65504D118ReservdS
                  ,IP_65504_D_118_RESERVD_S_LEN
                 );
            localIp65504D118ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504D118ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504D118ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504D118ReservdS() {	 
			return (getShort(beginIp65504D118ReservdS));
   	}
         int localIp65504D118ReservdLCounter = -1;
         public boolean isIp65504D118ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504D118ReservdLCounter != sharedCounter;
            localIp65504D118ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_D_118_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504D118ReservdL
	 */
	protected void serializeIp65504D118ReservdL(short ip65504D118ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504D118ReservdL,IP_65504_D_118_RESERVD_L_LEN)
                  ,beginIp65504D118ReservdL
                  ,IP_65504_D_118_RESERVD_L_LEN
                 );
            localIp65504D118ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504D118ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504D118ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504D118ReservdL() {	 
			return (getShort(beginIp65504D118ReservdL));
   	}
         int localIp65504D119ReservdSCounter = -1;
         public boolean isIp65504D119ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504D119ReservdSCounter != sharedCounter;
            localIp65504D119ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_D_119_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504D119ReservdS
	 */
	protected void serializeIp65504D119ReservdS(short ip65504D119ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504D119ReservdS,IP_65504_D_119_RESERVD_S_LEN)
                  ,beginIp65504D119ReservdS
                  ,IP_65504_D_119_RESERVD_S_LEN
                 );
            localIp65504D119ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504D119ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504D119ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504D119ReservdS() {	 
			return (getShort(beginIp65504D119ReservdS));
   	}
         int localIp65504D119ReservdLCounter = -1;
         public boolean isIp65504D119ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504D119ReservdLCounter != sharedCounter;
            localIp65504D119ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_D_119_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504D119ReservdL
	 */
	protected void serializeIp65504D119ReservdL(short ip65504D119ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504D119ReservdL,IP_65504_D_119_RESERVD_L_LEN)
                  ,beginIp65504D119ReservdL
                  ,IP_65504_D_119_RESERVD_L_LEN
                 );
            localIp65504D119ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504D119ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504D119ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504D119ReservdL() {	 
			return (getShort(beginIp65504D119ReservdL));
   	}
         int localIp65504D120ReservdSCounter = -1;
         public boolean isIp65504D120ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504D120ReservdSCounter != sharedCounter;
            localIp65504D120ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_D_120_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504D120ReservdS
	 */
	protected void serializeIp65504D120ReservdS(short ip65504D120ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504D120ReservdS,IP_65504_D_120_RESERVD_S_LEN)
                  ,beginIp65504D120ReservdS
                  ,IP_65504_D_120_RESERVD_S_LEN
                 );
            localIp65504D120ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504D120ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504D120ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504D120ReservdS() {	 
			return (getShort(beginIp65504D120ReservdS));
   	}
         int localIp65504D120ReservdLCounter = -1;
         public boolean isIp65504D120ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504D120ReservdLCounter != sharedCounter;
            localIp65504D120ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_D_120_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504D120ReservdL
	 */
	protected void serializeIp65504D120ReservdL(short ip65504D120ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504D120ReservdL,IP_65504_D_120_RESERVD_L_LEN)
                  ,beginIp65504D120ReservdL
                  ,IP_65504_D_120_RESERVD_L_LEN
                 );
            localIp65504D120ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504D120ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504D120ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504D120ReservdL() {	 
			return (getShort(beginIp65504D120ReservdL));
   	}
         int localIp65504D121Addtl2SCounter = -1;
         public boolean isIp65504D121Addtl2SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504D121Addtl2SCounter != sharedCounter;
            localIp65504D121Addtl2SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_D_121_ADDTL_2_S_LEN = 2;
  	/**
	 * serializeIp65504D121Addtl2S
	 */
	protected void serializeIp65504D121Addtl2S(short ip65504D121Addtl2S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504D121Addtl2S,IP_65504_D_121_ADDTL_2_S_LEN)
                  ,beginIp65504D121Addtl2S
                  ,IP_65504_D_121_ADDTL_2_S_LEN
                 );
            localIp65504D121Addtl2SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504D121Addtl2SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504D121Addtl2S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504D121Addtl2S() {	 
			return (getShort(beginIp65504D121Addtl2S));
   	}
         int localIp65504D121Addtl2LCounter = -1;
         public boolean isIp65504D121Addtl2LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504D121Addtl2LCounter != sharedCounter;
            localIp65504D121Addtl2LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_D_121_ADDTL_2_L_LEN = 2;
  	/**
	 * serializeIp65504D121Addtl2L
	 */
	protected void serializeIp65504D121Addtl2L(short ip65504D121Addtl2L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504D121Addtl2L,IP_65504_D_121_ADDTL_2_L_LEN)
                  ,beginIp65504D121Addtl2L
                  ,IP_65504_D_121_ADDTL_2_L_LEN
                 );
            localIp65504D121Addtl2LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504D121Addtl2LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504D121Addtl2L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504D121Addtl2L() {	 
			return (getShort(beginIp65504D121Addtl2L));
   	}
         int localIp65504D122Addtl3SCounter = -1;
         public boolean isIp65504D122Addtl3SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504D122Addtl3SCounter != sharedCounter;
            localIp65504D122Addtl3SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_D_122_ADDTL_3_S_LEN = 2;
  	/**
	 * serializeIp65504D122Addtl3S
	 */
	protected void serializeIp65504D122Addtl3S(short ip65504D122Addtl3S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504D122Addtl3S,IP_65504_D_122_ADDTL_3_S_LEN)
                  ,beginIp65504D122Addtl3S
                  ,IP_65504_D_122_ADDTL_3_S_LEN
                 );
            localIp65504D122Addtl3SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504D122Addtl3SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504D122Addtl3S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504D122Addtl3S() {	 
			return (getShort(beginIp65504D122Addtl3S));
   	}
         int localIp65504D122Addtl3LCounter = -1;
         public boolean isIp65504D122Addtl3LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504D122Addtl3LCounter != sharedCounter;
            localIp65504D122Addtl3LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_D_122_ADDTL_3_L_LEN = 2;
  	/**
	 * serializeIp65504D122Addtl3L
	 */
	protected void serializeIp65504D122Addtl3L(short ip65504D122Addtl3L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504D122Addtl3L,IP_65504_D_122_ADDTL_3_L_LEN)
                  ,beginIp65504D122Addtl3L
                  ,IP_65504_D_122_ADDTL_3_L_LEN
                 );
            localIp65504D122Addtl3LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504D122Addtl3LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504D122Addtl3L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504D122Addtl3L() {	 
			return (getShort(beginIp65504D122Addtl3L));
   	}
         int localIp65504D123Addtl4SCounter = -1;
         public boolean isIp65504D123Addtl4SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504D123Addtl4SCounter != sharedCounter;
            localIp65504D123Addtl4SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_D_123_ADDTL_4_S_LEN = 2;
  	/**
	 * serializeIp65504D123Addtl4S
	 */
	protected void serializeIp65504D123Addtl4S(short ip65504D123Addtl4S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504D123Addtl4S,IP_65504_D_123_ADDTL_4_S_LEN)
                  ,beginIp65504D123Addtl4S
                  ,IP_65504_D_123_ADDTL_4_S_LEN
                 );
            localIp65504D123Addtl4SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504D123Addtl4SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504D123Addtl4S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504D123Addtl4S() {	 
			return (getShort(beginIp65504D123Addtl4S));
   	}
         int localIp65504D123Addtl4LCounter = -1;
         public boolean isIp65504D123Addtl4LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504D123Addtl4LCounter != sharedCounter;
            localIp65504D123Addtl4LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_D_123_ADDTL_4_L_LEN = 2;
  	/**
	 * serializeIp65504D123Addtl4L
	 */
	protected void serializeIp65504D123Addtl4L(short ip65504D123Addtl4L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504D123Addtl4L,IP_65504_D_123_ADDTL_4_L_LEN)
                  ,beginIp65504D123Addtl4L
                  ,IP_65504_D_123_ADDTL_4_L_LEN
                 );
            localIp65504D123Addtl4LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504D123Addtl4LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504D123Addtl4L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504D123Addtl4L() {	 
			return (getShort(beginIp65504D123Addtl4L));
   	}
         int localIp65504D124ReservdSCounter = -1;
         public boolean isIp65504D124ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504D124ReservdSCounter != sharedCounter;
            localIp65504D124ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_D_124_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504D124ReservdS
	 */
	protected void serializeIp65504D124ReservdS(short ip65504D124ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504D124ReservdS,IP_65504_D_124_RESERVD_S_LEN)
                  ,beginIp65504D124ReservdS
                  ,IP_65504_D_124_RESERVD_S_LEN
                 );
            localIp65504D124ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504D124ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504D124ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504D124ReservdS() {	 
			return (getShort(beginIp65504D124ReservdS));
   	}
         int localIp65504D124ReservdLCounter = -1;
         public boolean isIp65504D124ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504D124ReservdLCounter != sharedCounter;
            localIp65504D124ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_D_124_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504D124ReservdL
	 */
	protected void serializeIp65504D124ReservdL(short ip65504D124ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504D124ReservdL,IP_65504_D_124_RESERVD_L_LEN)
                  ,beginIp65504D124ReservdL
                  ,IP_65504_D_124_RESERVD_L_LEN
                 );
            localIp65504D124ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504D124ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504D124ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504D124ReservdL() {	 
			return (getShort(beginIp65504D124ReservdL));
   	}




}
  
