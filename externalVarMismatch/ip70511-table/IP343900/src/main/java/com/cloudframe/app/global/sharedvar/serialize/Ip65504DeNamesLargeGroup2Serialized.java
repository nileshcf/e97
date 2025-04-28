package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip65504DeNamesLargeGroup2Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 08:07. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip65504DeNamesLargeGroup2Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip65504DeNamesLargeGroup2Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_65504_DE_NAMES_LARGE_GROUP_2_LENGTH = 248;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp65504D32AcqInsS;
            protected  int beginIp65504D32AcqInsL;
            protected  int beginIp65504D33FwdInsS;
            protected  int beginIp65504D33FwdInsL;
            protected  int beginIp65504D34PanExtS;
            protected  int beginIp65504D34PanExtL;
            protected  int beginIp65504D35Track2S;
            protected  int beginIp65504D35Track2L;
            protected  int beginIp65504D36Track3S;
            protected  int beginIp65504D36Track3L;
            protected  int beginIp65504D37RetrNoS;
            protected  int beginIp65504D37RetrNoL;
            protected  int beginIp65504D38AprvcodS;
            protected  int beginIp65504D38AprvcodL;
            protected  int beginIp65504D39ActnCdS;
            protected  int beginIp65504D39ActnCdL;
            protected  int beginIp65504D40ServCdS;
            protected  int beginIp65504D40ServCdL;
            protected  int beginIp65504D41TermIdS;
            protected  int beginIp65504D41TermIdL;
            protected  int beginIp65504D42CardIdS;
            protected  int beginIp65504D42CardIdL;
            protected  int beginIp65504D43NmeLocS;
            protected  int beginIp65504D43NmeLocL;
            protected  int beginIp65504D44AddldatS;
            protected  int beginIp65504D44AddldatL;
            protected  int beginIp65504D45Track1S;
            protected  int beginIp65504D45Track1L;
            protected  int beginIp65504D46AmtFeeS;
            protected  int beginIp65504D46AmtFeeL;
            protected  int beginIp65504D47AddldatS;
            protected  int beginIp65504D47AddldatL;
            protected  int beginIp65504D48AddldatS;
            protected  int beginIp65504D48AddldatL;
            protected  int beginIp65504D49TrxCurS;
            protected  int beginIp65504D49TrxCurL;
            protected  int beginIp65504D50RecCurS;
            protected  int beginIp65504D50RecCurL;
            protected  int beginIp65504D51BilCurS;
            protected  int beginIp65504D51BilCurL;
            protected  int beginIp65504D52PinDatS;
            protected  int beginIp65504D52PinDatL;
            protected  int beginIp65504D53SecCtlS;
            protected  int beginIp65504D53SecCtlL;
            protected  int beginIp65504D54AddlamtS;
            protected  int beginIp65504D54AddlamtL;
            protected  int beginIp65504D55IccDatS;
            protected  int beginIp65504D55IccDatL;
            protected  int beginIp65504D56OrigElS;
            protected  int beginIp65504D56OrigElL;
            protected  int beginIp65504D57AuthCyS;
            protected  int beginIp65504D57AuthCyL;
            protected  int beginIp65504D58AuthAgS;
            protected  int beginIp65504D58AuthAgL;
            protected  int beginIp65504D59TransptS;
            protected  int beginIp65504D59TransptL;
            protected  int beginIp65504D60ReservdS;
            protected  int beginIp65504D60ReservdL;
            protected  int beginIp65504D61ReservdS;
            protected  int beginIp65504D61ReservdL;
            protected  int beginIp65504D62FmtVerS;
            protected  int beginIp65504D62FmtVerL;
	
	/**
	* Constructor for Ip65504DeNamesLargeGroup2Serialized
	**/
    public Ip65504DeNamesLargeGroup2Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ip65504DeNamesLargeGroup2Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip65504DeNamesLargeGroup2Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ip65504DeNamesLargeGroup2Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,244); // serialize this field at offset 244 by default 
    }
    
	/**
	* sets parent for this Ip65504DeNamesLargeGroup2Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 244 by default
    }    
	/**
	* initializes the field in Ip65504DeNamesLargeGroup2Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_65504_DE_NAMES_LARGE_GROUP_2_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp65504D32AcqInsS = getStartOffset() + 4;	// set offset for serialization
  
             beginIp65504D32AcqInsL = getStartOffset() + 6;	// set offset for serialization
  
  
             beginIp65504D33FwdInsS = getStartOffset() + 12;	// set offset for serialization
  
             beginIp65504D33FwdInsL = getStartOffset() + 14;	// set offset for serialization
  
  
             beginIp65504D34PanExtS = getStartOffset() + 20;	// set offset for serialization
  
             beginIp65504D34PanExtL = getStartOffset() + 22;	// set offset for serialization
  
  
             beginIp65504D35Track2S = getStartOffset() + 28;	// set offset for serialization
  
             beginIp65504D35Track2L = getStartOffset() + 30;	// set offset for serialization
  
  
             beginIp65504D36Track3S = getStartOffset() + 36;	// set offset for serialization
  
             beginIp65504D36Track3L = getStartOffset() + 38;	// set offset for serialization
  
  
             beginIp65504D37RetrNoS = getStartOffset() + 44;	// set offset for serialization
  
             beginIp65504D37RetrNoL = getStartOffset() + 46;	// set offset for serialization
  
  
             beginIp65504D38AprvcodS = getStartOffset() + 52;	// set offset for serialization
  
             beginIp65504D38AprvcodL = getStartOffset() + 54;	// set offset for serialization
  
  
             beginIp65504D39ActnCdS = getStartOffset() + 60;	// set offset for serialization
  
             beginIp65504D39ActnCdL = getStartOffset() + 62;	// set offset for serialization
  
  
             beginIp65504D40ServCdS = getStartOffset() + 68;	// set offset for serialization
  
             beginIp65504D40ServCdL = getStartOffset() + 70;	// set offset for serialization
  
  
             beginIp65504D41TermIdS = getStartOffset() + 76;	// set offset for serialization
  
             beginIp65504D41TermIdL = getStartOffset() + 78;	// set offset for serialization
  
  
             beginIp65504D42CardIdS = getStartOffset() + 84;	// set offset for serialization
  
             beginIp65504D42CardIdL = getStartOffset() + 86;	// set offset for serialization
  
  
             beginIp65504D43NmeLocS = getStartOffset() + 92;	// set offset for serialization
  
             beginIp65504D43NmeLocL = getStartOffset() + 94;	// set offset for serialization
  
  
             beginIp65504D44AddldatS = getStartOffset() + 100;	// set offset for serialization
  
             beginIp65504D44AddldatL = getStartOffset() + 102;	// set offset for serialization
  
  
             beginIp65504D45Track1S = getStartOffset() + 108;	// set offset for serialization
  
             beginIp65504D45Track1L = getStartOffset() + 110;	// set offset for serialization
  
  
             beginIp65504D46AmtFeeS = getStartOffset() + 116;	// set offset for serialization
  
             beginIp65504D46AmtFeeL = getStartOffset() + 118;	// set offset for serialization
  
  
             beginIp65504D47AddldatS = getStartOffset() + 124;	// set offset for serialization
  
             beginIp65504D47AddldatL = getStartOffset() + 126;	// set offset for serialization
  
  
             beginIp65504D48AddldatS = getStartOffset() + 132;	// set offset for serialization
  
             beginIp65504D48AddldatL = getStartOffset() + 134;	// set offset for serialization
  
  
             beginIp65504D49TrxCurS = getStartOffset() + 140;	// set offset for serialization
  
             beginIp65504D49TrxCurL = getStartOffset() + 142;	// set offset for serialization
  
  
             beginIp65504D50RecCurS = getStartOffset() + 148;	// set offset for serialization
  
             beginIp65504D50RecCurL = getStartOffset() + 150;	// set offset for serialization
  
  
             beginIp65504D51BilCurS = getStartOffset() + 156;	// set offset for serialization
  
             beginIp65504D51BilCurL = getStartOffset() + 158;	// set offset for serialization
  
  
             beginIp65504D52PinDatS = getStartOffset() + 164;	// set offset for serialization
  
             beginIp65504D52PinDatL = getStartOffset() + 166;	// set offset for serialization
  
  
             beginIp65504D53SecCtlS = getStartOffset() + 172;	// set offset for serialization
  
             beginIp65504D53SecCtlL = getStartOffset() + 174;	// set offset for serialization
  
  
             beginIp65504D54AddlamtS = getStartOffset() + 180;	// set offset for serialization
  
             beginIp65504D54AddlamtL = getStartOffset() + 182;	// set offset for serialization
  
  
             beginIp65504D55IccDatS = getStartOffset() + 188;	// set offset for serialization
  
             beginIp65504D55IccDatL = getStartOffset() + 190;	// set offset for serialization
  
  
             beginIp65504D56OrigElS = getStartOffset() + 196;	// set offset for serialization
  
             beginIp65504D56OrigElL = getStartOffset() + 198;	// set offset for serialization
  
  
             beginIp65504D57AuthCyS = getStartOffset() + 204;	// set offset for serialization
  
             beginIp65504D57AuthCyL = getStartOffset() + 206;	// set offset for serialization
  
  
             beginIp65504D58AuthAgS = getStartOffset() + 212;	// set offset for serialization
  
             beginIp65504D58AuthAgL = getStartOffset() + 214;	// set offset for serialization
  
  
             beginIp65504D59TransptS = getStartOffset() + 220;	// set offset for serialization
  
             beginIp65504D59TransptL = getStartOffset() + 222;	// set offset for serialization
  
  
             beginIp65504D60ReservdS = getStartOffset() + 228;	// set offset for serialization
  
             beginIp65504D60ReservdL = getStartOffset() + 230;	// set offset for serialization
  
  
             beginIp65504D61ReservdS = getStartOffset() + 236;	// set offset for serialization
  
             beginIp65504D61ReservdL = getStartOffset() + 238;	// set offset for serialization
  
  
             beginIp65504D62FmtVerS = getStartOffset() + 244;	// set offset for serialization
  
             beginIp65504D62FmtVerL = getStartOffset() + 246;	// set offset for serialization
  
  
	   /*  end of offset */
	}
         int localIp65504D32AcqInsSCounter = -1;
         public boolean isIp65504D32AcqInsSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504D32AcqInsSCounter != sharedCounter;
            localIp65504D32AcqInsSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_D_32_ACQ_INS_S_LEN = 2;
  	/**
	 * serializeIp65504D32AcqInsS
	 */
	protected void serializeIp65504D32AcqInsS(short ip65504D32AcqInsS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504D32AcqInsS,IP_65504_D_32_ACQ_INS_S_LEN)
                  ,beginIp65504D32AcqInsS
                  ,IP_65504_D_32_ACQ_INS_S_LEN
                 );
            localIp65504D32AcqInsSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504D32AcqInsSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504D32AcqInsS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504D32AcqInsS() {	 
			return (getShort(beginIp65504D32AcqInsS));
   	}
         int localIp65504D32AcqInsLCounter = -1;
         public boolean isIp65504D32AcqInsLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504D32AcqInsLCounter != sharedCounter;
            localIp65504D32AcqInsLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_D_32_ACQ_INS_L_LEN = 2;
  	/**
	 * serializeIp65504D32AcqInsL
	 */
	protected void serializeIp65504D32AcqInsL(short ip65504D32AcqInsL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504D32AcqInsL,IP_65504_D_32_ACQ_INS_L_LEN)
                  ,beginIp65504D32AcqInsL
                  ,IP_65504_D_32_ACQ_INS_L_LEN
                 );
            localIp65504D32AcqInsLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504D32AcqInsLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504D32AcqInsL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504D32AcqInsL() {	 
			return (getShort(beginIp65504D32AcqInsL));
   	}
         int localIp65504D33FwdInsSCounter = -1;
         public boolean isIp65504D33FwdInsSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504D33FwdInsSCounter != sharedCounter;
            localIp65504D33FwdInsSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_D_33_FWD_INS_S_LEN = 2;
  	/**
	 * serializeIp65504D33FwdInsS
	 */
	protected void serializeIp65504D33FwdInsS(short ip65504D33FwdInsS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504D33FwdInsS,IP_65504_D_33_FWD_INS_S_LEN)
                  ,beginIp65504D33FwdInsS
                  ,IP_65504_D_33_FWD_INS_S_LEN
                 );
            localIp65504D33FwdInsSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504D33FwdInsSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504D33FwdInsS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504D33FwdInsS() {	 
			return (getShort(beginIp65504D33FwdInsS));
   	}
         int localIp65504D33FwdInsLCounter = -1;
         public boolean isIp65504D33FwdInsLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504D33FwdInsLCounter != sharedCounter;
            localIp65504D33FwdInsLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_D_33_FWD_INS_L_LEN = 2;
  	/**
	 * serializeIp65504D33FwdInsL
	 */
	protected void serializeIp65504D33FwdInsL(short ip65504D33FwdInsL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504D33FwdInsL,IP_65504_D_33_FWD_INS_L_LEN)
                  ,beginIp65504D33FwdInsL
                  ,IP_65504_D_33_FWD_INS_L_LEN
                 );
            localIp65504D33FwdInsLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504D33FwdInsLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504D33FwdInsL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504D33FwdInsL() {	 
			return (getShort(beginIp65504D33FwdInsL));
   	}
         int localIp65504D34PanExtSCounter = -1;
         public boolean isIp65504D34PanExtSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504D34PanExtSCounter != sharedCounter;
            localIp65504D34PanExtSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_D_34_PAN_EXT_S_LEN = 2;
  	/**
	 * serializeIp65504D34PanExtS
	 */
	protected void serializeIp65504D34PanExtS(short ip65504D34PanExtS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504D34PanExtS,IP_65504_D_34_PAN_EXT_S_LEN)
                  ,beginIp65504D34PanExtS
                  ,IP_65504_D_34_PAN_EXT_S_LEN
                 );
            localIp65504D34PanExtSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504D34PanExtSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504D34PanExtS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504D34PanExtS() {	 
			return (getShort(beginIp65504D34PanExtS));
   	}
         int localIp65504D34PanExtLCounter = -1;
         public boolean isIp65504D34PanExtLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504D34PanExtLCounter != sharedCounter;
            localIp65504D34PanExtLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_D_34_PAN_EXT_L_LEN = 2;
  	/**
	 * serializeIp65504D34PanExtL
	 */
	protected void serializeIp65504D34PanExtL(short ip65504D34PanExtL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504D34PanExtL,IP_65504_D_34_PAN_EXT_L_LEN)
                  ,beginIp65504D34PanExtL
                  ,IP_65504_D_34_PAN_EXT_L_LEN
                 );
            localIp65504D34PanExtLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504D34PanExtLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504D34PanExtL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504D34PanExtL() {	 
			return (getShort(beginIp65504D34PanExtL));
   	}
         int localIp65504D35Track2SCounter = -1;
         public boolean isIp65504D35Track2SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504D35Track2SCounter != sharedCounter;
            localIp65504D35Track2SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_D_35_TRACK_2_S_LEN = 2;
  	/**
	 * serializeIp65504D35Track2S
	 */
	protected void serializeIp65504D35Track2S(short ip65504D35Track2S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504D35Track2S,IP_65504_D_35_TRACK_2_S_LEN)
                  ,beginIp65504D35Track2S
                  ,IP_65504_D_35_TRACK_2_S_LEN
                 );
            localIp65504D35Track2SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504D35Track2SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504D35Track2S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504D35Track2S() {	 
			return (getShort(beginIp65504D35Track2S));
   	}
         int localIp65504D35Track2LCounter = -1;
         public boolean isIp65504D35Track2LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504D35Track2LCounter != sharedCounter;
            localIp65504D35Track2LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_D_35_TRACK_2_L_LEN = 2;
  	/**
	 * serializeIp65504D35Track2L
	 */
	protected void serializeIp65504D35Track2L(short ip65504D35Track2L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504D35Track2L,IP_65504_D_35_TRACK_2_L_LEN)
                  ,beginIp65504D35Track2L
                  ,IP_65504_D_35_TRACK_2_L_LEN
                 );
            localIp65504D35Track2LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504D35Track2LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504D35Track2L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504D35Track2L() {	 
			return (getShort(beginIp65504D35Track2L));
   	}
         int localIp65504D36Track3SCounter = -1;
         public boolean isIp65504D36Track3SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504D36Track3SCounter != sharedCounter;
            localIp65504D36Track3SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_D_36_TRACK_3_S_LEN = 2;
  	/**
	 * serializeIp65504D36Track3S
	 */
	protected void serializeIp65504D36Track3S(short ip65504D36Track3S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504D36Track3S,IP_65504_D_36_TRACK_3_S_LEN)
                  ,beginIp65504D36Track3S
                  ,IP_65504_D_36_TRACK_3_S_LEN
                 );
            localIp65504D36Track3SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504D36Track3SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504D36Track3S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504D36Track3S() {	 
			return (getShort(beginIp65504D36Track3S));
   	}
         int localIp65504D36Track3LCounter = -1;
         public boolean isIp65504D36Track3LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504D36Track3LCounter != sharedCounter;
            localIp65504D36Track3LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_D_36_TRACK_3_L_LEN = 2;
  	/**
	 * serializeIp65504D36Track3L
	 */
	protected void serializeIp65504D36Track3L(short ip65504D36Track3L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504D36Track3L,IP_65504_D_36_TRACK_3_L_LEN)
                  ,beginIp65504D36Track3L
                  ,IP_65504_D_36_TRACK_3_L_LEN
                 );
            localIp65504D36Track3LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504D36Track3LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504D36Track3L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504D36Track3L() {	 
			return (getShort(beginIp65504D36Track3L));
   	}
         int localIp65504D37RetrNoSCounter = -1;
         public boolean isIp65504D37RetrNoSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504D37RetrNoSCounter != sharedCounter;
            localIp65504D37RetrNoSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_D_37_RETR_NO_S_LEN = 2;
  	/**
	 * serializeIp65504D37RetrNoS
	 */
	protected void serializeIp65504D37RetrNoS(short ip65504D37RetrNoS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504D37RetrNoS,IP_65504_D_37_RETR_NO_S_LEN)
                  ,beginIp65504D37RetrNoS
                  ,IP_65504_D_37_RETR_NO_S_LEN
                 );
            localIp65504D37RetrNoSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504D37RetrNoSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504D37RetrNoS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504D37RetrNoS() {	 
			return (getShort(beginIp65504D37RetrNoS));
   	}
         int localIp65504D37RetrNoLCounter = -1;
         public boolean isIp65504D37RetrNoLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504D37RetrNoLCounter != sharedCounter;
            localIp65504D37RetrNoLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_D_37_RETR_NO_L_LEN = 2;
  	/**
	 * serializeIp65504D37RetrNoL
	 */
	protected void serializeIp65504D37RetrNoL(short ip65504D37RetrNoL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504D37RetrNoL,IP_65504_D_37_RETR_NO_L_LEN)
                  ,beginIp65504D37RetrNoL
                  ,IP_65504_D_37_RETR_NO_L_LEN
                 );
            localIp65504D37RetrNoLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504D37RetrNoLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504D37RetrNoL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504D37RetrNoL() {	 
			return (getShort(beginIp65504D37RetrNoL));
   	}
         int localIp65504D38AprvcodSCounter = -1;
         public boolean isIp65504D38AprvcodSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504D38AprvcodSCounter != sharedCounter;
            localIp65504D38AprvcodSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_D_38_APRVCOD_S_LEN = 2;
  	/**
	 * serializeIp65504D38AprvcodS
	 */
	protected void serializeIp65504D38AprvcodS(short ip65504D38AprvcodS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504D38AprvcodS,IP_65504_D_38_APRVCOD_S_LEN)
                  ,beginIp65504D38AprvcodS
                  ,IP_65504_D_38_APRVCOD_S_LEN
                 );
            localIp65504D38AprvcodSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504D38AprvcodSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504D38AprvcodS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504D38AprvcodS() {	 
			return (getShort(beginIp65504D38AprvcodS));
   	}
         int localIp65504D38AprvcodLCounter = -1;
         public boolean isIp65504D38AprvcodLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504D38AprvcodLCounter != sharedCounter;
            localIp65504D38AprvcodLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_D_38_APRVCOD_L_LEN = 2;
  	/**
	 * serializeIp65504D38AprvcodL
	 */
	protected void serializeIp65504D38AprvcodL(short ip65504D38AprvcodL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504D38AprvcodL,IP_65504_D_38_APRVCOD_L_LEN)
                  ,beginIp65504D38AprvcodL
                  ,IP_65504_D_38_APRVCOD_L_LEN
                 );
            localIp65504D38AprvcodLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504D38AprvcodLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504D38AprvcodL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504D38AprvcodL() {	 
			return (getShort(beginIp65504D38AprvcodL));
   	}
         int localIp65504D39ActnCdSCounter = -1;
         public boolean isIp65504D39ActnCdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504D39ActnCdSCounter != sharedCounter;
            localIp65504D39ActnCdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_D_39_ACTN_CD_S_LEN = 2;
  	/**
	 * serializeIp65504D39ActnCdS
	 */
	protected void serializeIp65504D39ActnCdS(short ip65504D39ActnCdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504D39ActnCdS,IP_65504_D_39_ACTN_CD_S_LEN)
                  ,beginIp65504D39ActnCdS
                  ,IP_65504_D_39_ACTN_CD_S_LEN
                 );
            localIp65504D39ActnCdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504D39ActnCdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504D39ActnCdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504D39ActnCdS() {	 
			return (getShort(beginIp65504D39ActnCdS));
   	}
         int localIp65504D39ActnCdLCounter = -1;
         public boolean isIp65504D39ActnCdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504D39ActnCdLCounter != sharedCounter;
            localIp65504D39ActnCdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_D_39_ACTN_CD_L_LEN = 2;
  	/**
	 * serializeIp65504D39ActnCdL
	 */
	protected void serializeIp65504D39ActnCdL(short ip65504D39ActnCdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504D39ActnCdL,IP_65504_D_39_ACTN_CD_L_LEN)
                  ,beginIp65504D39ActnCdL
                  ,IP_65504_D_39_ACTN_CD_L_LEN
                 );
            localIp65504D39ActnCdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504D39ActnCdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504D39ActnCdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504D39ActnCdL() {	 
			return (getShort(beginIp65504D39ActnCdL));
   	}
         int localIp65504D40ServCdSCounter = -1;
         public boolean isIp65504D40ServCdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504D40ServCdSCounter != sharedCounter;
            localIp65504D40ServCdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_D_40_SERV_CD_S_LEN = 2;
  	/**
	 * serializeIp65504D40ServCdS
	 */
	protected void serializeIp65504D40ServCdS(short ip65504D40ServCdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504D40ServCdS,IP_65504_D_40_SERV_CD_S_LEN)
                  ,beginIp65504D40ServCdS
                  ,IP_65504_D_40_SERV_CD_S_LEN
                 );
            localIp65504D40ServCdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504D40ServCdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504D40ServCdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504D40ServCdS() {	 
			return (getShort(beginIp65504D40ServCdS));
   	}
         int localIp65504D40ServCdLCounter = -1;
         public boolean isIp65504D40ServCdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504D40ServCdLCounter != sharedCounter;
            localIp65504D40ServCdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_D_40_SERV_CD_L_LEN = 2;
  	/**
	 * serializeIp65504D40ServCdL
	 */
	protected void serializeIp65504D40ServCdL(short ip65504D40ServCdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504D40ServCdL,IP_65504_D_40_SERV_CD_L_LEN)
                  ,beginIp65504D40ServCdL
                  ,IP_65504_D_40_SERV_CD_L_LEN
                 );
            localIp65504D40ServCdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504D40ServCdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504D40ServCdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504D40ServCdL() {	 
			return (getShort(beginIp65504D40ServCdL));
   	}
         int localIp65504D41TermIdSCounter = -1;
         public boolean isIp65504D41TermIdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504D41TermIdSCounter != sharedCounter;
            localIp65504D41TermIdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_D_41_TERM_ID_S_LEN = 2;
  	/**
	 * serializeIp65504D41TermIdS
	 */
	protected void serializeIp65504D41TermIdS(short ip65504D41TermIdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504D41TermIdS,IP_65504_D_41_TERM_ID_S_LEN)
                  ,beginIp65504D41TermIdS
                  ,IP_65504_D_41_TERM_ID_S_LEN
                 );
            localIp65504D41TermIdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504D41TermIdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504D41TermIdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504D41TermIdS() {	 
			return (getShort(beginIp65504D41TermIdS));
   	}
         int localIp65504D41TermIdLCounter = -1;
         public boolean isIp65504D41TermIdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504D41TermIdLCounter != sharedCounter;
            localIp65504D41TermIdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_D_41_TERM_ID_L_LEN = 2;
  	/**
	 * serializeIp65504D41TermIdL
	 */
	protected void serializeIp65504D41TermIdL(short ip65504D41TermIdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504D41TermIdL,IP_65504_D_41_TERM_ID_L_LEN)
                  ,beginIp65504D41TermIdL
                  ,IP_65504_D_41_TERM_ID_L_LEN
                 );
            localIp65504D41TermIdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504D41TermIdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504D41TermIdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504D41TermIdL() {	 
			return (getShort(beginIp65504D41TermIdL));
   	}
         int localIp65504D42CardIdSCounter = -1;
         public boolean isIp65504D42CardIdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504D42CardIdSCounter != sharedCounter;
            localIp65504D42CardIdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_D_42_CARD_ID_S_LEN = 2;
  	/**
	 * serializeIp65504D42CardIdS
	 */
	protected void serializeIp65504D42CardIdS(short ip65504D42CardIdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504D42CardIdS,IP_65504_D_42_CARD_ID_S_LEN)
                  ,beginIp65504D42CardIdS
                  ,IP_65504_D_42_CARD_ID_S_LEN
                 );
            localIp65504D42CardIdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504D42CardIdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504D42CardIdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504D42CardIdS() {	 
			return (getShort(beginIp65504D42CardIdS));
   	}
         int localIp65504D42CardIdLCounter = -1;
         public boolean isIp65504D42CardIdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504D42CardIdLCounter != sharedCounter;
            localIp65504D42CardIdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_D_42_CARD_ID_L_LEN = 2;
  	/**
	 * serializeIp65504D42CardIdL
	 */
	protected void serializeIp65504D42CardIdL(short ip65504D42CardIdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504D42CardIdL,IP_65504_D_42_CARD_ID_L_LEN)
                  ,beginIp65504D42CardIdL
                  ,IP_65504_D_42_CARD_ID_L_LEN
                 );
            localIp65504D42CardIdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504D42CardIdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504D42CardIdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504D42CardIdL() {	 
			return (getShort(beginIp65504D42CardIdL));
   	}
         int localIp65504D43NmeLocSCounter = -1;
         public boolean isIp65504D43NmeLocSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504D43NmeLocSCounter != sharedCounter;
            localIp65504D43NmeLocSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_D_43_NME_LOC_S_LEN = 2;
  	/**
	 * serializeIp65504D43NmeLocS
	 */
	protected void serializeIp65504D43NmeLocS(short ip65504D43NmeLocS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504D43NmeLocS,IP_65504_D_43_NME_LOC_S_LEN)
                  ,beginIp65504D43NmeLocS
                  ,IP_65504_D_43_NME_LOC_S_LEN
                 );
            localIp65504D43NmeLocSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504D43NmeLocSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504D43NmeLocS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504D43NmeLocS() {	 
			return (getShort(beginIp65504D43NmeLocS));
   	}
         int localIp65504D43NmeLocLCounter = -1;
         public boolean isIp65504D43NmeLocLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504D43NmeLocLCounter != sharedCounter;
            localIp65504D43NmeLocLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_D_43_NME_LOC_L_LEN = 2;
  	/**
	 * serializeIp65504D43NmeLocL
	 */
	protected void serializeIp65504D43NmeLocL(short ip65504D43NmeLocL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504D43NmeLocL,IP_65504_D_43_NME_LOC_L_LEN)
                  ,beginIp65504D43NmeLocL
                  ,IP_65504_D_43_NME_LOC_L_LEN
                 );
            localIp65504D43NmeLocLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504D43NmeLocLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504D43NmeLocL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504D43NmeLocL() {	 
			return (getShort(beginIp65504D43NmeLocL));
   	}
         int localIp65504D44AddldatSCounter = -1;
         public boolean isIp65504D44AddldatSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504D44AddldatSCounter != sharedCounter;
            localIp65504D44AddldatSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_D_44_ADDLDAT_S_LEN = 2;
  	/**
	 * serializeIp65504D44AddldatS
	 */
	protected void serializeIp65504D44AddldatS(short ip65504D44AddldatS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504D44AddldatS,IP_65504_D_44_ADDLDAT_S_LEN)
                  ,beginIp65504D44AddldatS
                  ,IP_65504_D_44_ADDLDAT_S_LEN
                 );
            localIp65504D44AddldatSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504D44AddldatSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504D44AddldatS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504D44AddldatS() {	 
			return (getShort(beginIp65504D44AddldatS));
   	}
         int localIp65504D44AddldatLCounter = -1;
         public boolean isIp65504D44AddldatLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504D44AddldatLCounter != sharedCounter;
            localIp65504D44AddldatLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_D_44_ADDLDAT_L_LEN = 2;
  	/**
	 * serializeIp65504D44AddldatL
	 */
	protected void serializeIp65504D44AddldatL(short ip65504D44AddldatL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504D44AddldatL,IP_65504_D_44_ADDLDAT_L_LEN)
                  ,beginIp65504D44AddldatL
                  ,IP_65504_D_44_ADDLDAT_L_LEN
                 );
            localIp65504D44AddldatLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504D44AddldatLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504D44AddldatL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504D44AddldatL() {	 
			return (getShort(beginIp65504D44AddldatL));
   	}
         int localIp65504D45Track1SCounter = -1;
         public boolean isIp65504D45Track1SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504D45Track1SCounter != sharedCounter;
            localIp65504D45Track1SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_D_45_TRACK_1_S_LEN = 2;
  	/**
	 * serializeIp65504D45Track1S
	 */
	protected void serializeIp65504D45Track1S(short ip65504D45Track1S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504D45Track1S,IP_65504_D_45_TRACK_1_S_LEN)
                  ,beginIp65504D45Track1S
                  ,IP_65504_D_45_TRACK_1_S_LEN
                 );
            localIp65504D45Track1SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504D45Track1SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504D45Track1S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504D45Track1S() {	 
			return (getShort(beginIp65504D45Track1S));
   	}
         int localIp65504D45Track1LCounter = -1;
         public boolean isIp65504D45Track1LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504D45Track1LCounter != sharedCounter;
            localIp65504D45Track1LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_D_45_TRACK_1_L_LEN = 2;
  	/**
	 * serializeIp65504D45Track1L
	 */
	protected void serializeIp65504D45Track1L(short ip65504D45Track1L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504D45Track1L,IP_65504_D_45_TRACK_1_L_LEN)
                  ,beginIp65504D45Track1L
                  ,IP_65504_D_45_TRACK_1_L_LEN
                 );
            localIp65504D45Track1LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504D45Track1LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504D45Track1L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504D45Track1L() {	 
			return (getShort(beginIp65504D45Track1L));
   	}
         int localIp65504D46AmtFeeSCounter = -1;
         public boolean isIp65504D46AmtFeeSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504D46AmtFeeSCounter != sharedCounter;
            localIp65504D46AmtFeeSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_D_46_AMT_FEE_S_LEN = 2;
  	/**
	 * serializeIp65504D46AmtFeeS
	 */
	protected void serializeIp65504D46AmtFeeS(short ip65504D46AmtFeeS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504D46AmtFeeS,IP_65504_D_46_AMT_FEE_S_LEN)
                  ,beginIp65504D46AmtFeeS
                  ,IP_65504_D_46_AMT_FEE_S_LEN
                 );
            localIp65504D46AmtFeeSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504D46AmtFeeSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504D46AmtFeeS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504D46AmtFeeS() {	 
			return (getShort(beginIp65504D46AmtFeeS));
   	}
         int localIp65504D46AmtFeeLCounter = -1;
         public boolean isIp65504D46AmtFeeLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504D46AmtFeeLCounter != sharedCounter;
            localIp65504D46AmtFeeLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_D_46_AMT_FEE_L_LEN = 2;
  	/**
	 * serializeIp65504D46AmtFeeL
	 */
	protected void serializeIp65504D46AmtFeeL(short ip65504D46AmtFeeL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504D46AmtFeeL,IP_65504_D_46_AMT_FEE_L_LEN)
                  ,beginIp65504D46AmtFeeL
                  ,IP_65504_D_46_AMT_FEE_L_LEN
                 );
            localIp65504D46AmtFeeLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504D46AmtFeeLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504D46AmtFeeL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504D46AmtFeeL() {	 
			return (getShort(beginIp65504D46AmtFeeL));
   	}
         int localIp65504D47AddldatSCounter = -1;
         public boolean isIp65504D47AddldatSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504D47AddldatSCounter != sharedCounter;
            localIp65504D47AddldatSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_D_47_ADDLDAT_S_LEN = 2;
  	/**
	 * serializeIp65504D47AddldatS
	 */
	protected void serializeIp65504D47AddldatS(short ip65504D47AddldatS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504D47AddldatS,IP_65504_D_47_ADDLDAT_S_LEN)
                  ,beginIp65504D47AddldatS
                  ,IP_65504_D_47_ADDLDAT_S_LEN
                 );
            localIp65504D47AddldatSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504D47AddldatSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504D47AddldatS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504D47AddldatS() {	 
			return (getShort(beginIp65504D47AddldatS));
   	}
         int localIp65504D47AddldatLCounter = -1;
         public boolean isIp65504D47AddldatLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504D47AddldatLCounter != sharedCounter;
            localIp65504D47AddldatLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_D_47_ADDLDAT_L_LEN = 2;
  	/**
	 * serializeIp65504D47AddldatL
	 */
	protected void serializeIp65504D47AddldatL(short ip65504D47AddldatL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504D47AddldatL,IP_65504_D_47_ADDLDAT_L_LEN)
                  ,beginIp65504D47AddldatL
                  ,IP_65504_D_47_ADDLDAT_L_LEN
                 );
            localIp65504D47AddldatLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504D47AddldatLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504D47AddldatL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504D47AddldatL() {	 
			return (getShort(beginIp65504D47AddldatL));
   	}
         int localIp65504D48AddldatSCounter = -1;
         public boolean isIp65504D48AddldatSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504D48AddldatSCounter != sharedCounter;
            localIp65504D48AddldatSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_D_48_ADDLDAT_S_LEN = 2;
  	/**
	 * serializeIp65504D48AddldatS
	 */
	protected void serializeIp65504D48AddldatS(short ip65504D48AddldatS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504D48AddldatS,IP_65504_D_48_ADDLDAT_S_LEN)
                  ,beginIp65504D48AddldatS
                  ,IP_65504_D_48_ADDLDAT_S_LEN
                 );
            localIp65504D48AddldatSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504D48AddldatSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504D48AddldatS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504D48AddldatS() {	 
			return (getShort(beginIp65504D48AddldatS));
   	}
         int localIp65504D48AddldatLCounter = -1;
         public boolean isIp65504D48AddldatLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504D48AddldatLCounter != sharedCounter;
            localIp65504D48AddldatLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_D_48_ADDLDAT_L_LEN = 2;
  	/**
	 * serializeIp65504D48AddldatL
	 */
	protected void serializeIp65504D48AddldatL(short ip65504D48AddldatL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504D48AddldatL,IP_65504_D_48_ADDLDAT_L_LEN)
                  ,beginIp65504D48AddldatL
                  ,IP_65504_D_48_ADDLDAT_L_LEN
                 );
            localIp65504D48AddldatLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504D48AddldatLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504D48AddldatL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504D48AddldatL() {	 
			return (getShort(beginIp65504D48AddldatL));
   	}
         int localIp65504D49TrxCurSCounter = -1;
         public boolean isIp65504D49TrxCurSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504D49TrxCurSCounter != sharedCounter;
            localIp65504D49TrxCurSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_D_49_TRX_CUR_S_LEN = 2;
  	/**
	 * serializeIp65504D49TrxCurS
	 */
	protected void serializeIp65504D49TrxCurS(short ip65504D49TrxCurS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504D49TrxCurS,IP_65504_D_49_TRX_CUR_S_LEN)
                  ,beginIp65504D49TrxCurS
                  ,IP_65504_D_49_TRX_CUR_S_LEN
                 );
            localIp65504D49TrxCurSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504D49TrxCurSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504D49TrxCurS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504D49TrxCurS() {	 
			return (getShort(beginIp65504D49TrxCurS));
   	}
         int localIp65504D49TrxCurLCounter = -1;
         public boolean isIp65504D49TrxCurLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504D49TrxCurLCounter != sharedCounter;
            localIp65504D49TrxCurLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_D_49_TRX_CUR_L_LEN = 2;
  	/**
	 * serializeIp65504D49TrxCurL
	 */
	protected void serializeIp65504D49TrxCurL(short ip65504D49TrxCurL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504D49TrxCurL,IP_65504_D_49_TRX_CUR_L_LEN)
                  ,beginIp65504D49TrxCurL
                  ,IP_65504_D_49_TRX_CUR_L_LEN
                 );
            localIp65504D49TrxCurLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504D49TrxCurLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504D49TrxCurL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504D49TrxCurL() {	 
			return (getShort(beginIp65504D49TrxCurL));
   	}
         int localIp65504D50RecCurSCounter = -1;
         public boolean isIp65504D50RecCurSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504D50RecCurSCounter != sharedCounter;
            localIp65504D50RecCurSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_D_50_REC_CUR_S_LEN = 2;
  	/**
	 * serializeIp65504D50RecCurS
	 */
	protected void serializeIp65504D50RecCurS(short ip65504D50RecCurS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504D50RecCurS,IP_65504_D_50_REC_CUR_S_LEN)
                  ,beginIp65504D50RecCurS
                  ,IP_65504_D_50_REC_CUR_S_LEN
                 );
            localIp65504D50RecCurSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504D50RecCurSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504D50RecCurS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504D50RecCurS() {	 
			return (getShort(beginIp65504D50RecCurS));
   	}
         int localIp65504D50RecCurLCounter = -1;
         public boolean isIp65504D50RecCurLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504D50RecCurLCounter != sharedCounter;
            localIp65504D50RecCurLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_D_50_REC_CUR_L_LEN = 2;
  	/**
	 * serializeIp65504D50RecCurL
	 */
	protected void serializeIp65504D50RecCurL(short ip65504D50RecCurL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504D50RecCurL,IP_65504_D_50_REC_CUR_L_LEN)
                  ,beginIp65504D50RecCurL
                  ,IP_65504_D_50_REC_CUR_L_LEN
                 );
            localIp65504D50RecCurLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504D50RecCurLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504D50RecCurL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504D50RecCurL() {	 
			return (getShort(beginIp65504D50RecCurL));
   	}
         int localIp65504D51BilCurSCounter = -1;
         public boolean isIp65504D51BilCurSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504D51BilCurSCounter != sharedCounter;
            localIp65504D51BilCurSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_D_51_BIL_CUR_S_LEN = 2;
  	/**
	 * serializeIp65504D51BilCurS
	 */
	protected void serializeIp65504D51BilCurS(short ip65504D51BilCurS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504D51BilCurS,IP_65504_D_51_BIL_CUR_S_LEN)
                  ,beginIp65504D51BilCurS
                  ,IP_65504_D_51_BIL_CUR_S_LEN
                 );
            localIp65504D51BilCurSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504D51BilCurSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504D51BilCurS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504D51BilCurS() {	 
			return (getShort(beginIp65504D51BilCurS));
   	}
         int localIp65504D51BilCurLCounter = -1;
         public boolean isIp65504D51BilCurLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504D51BilCurLCounter != sharedCounter;
            localIp65504D51BilCurLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_D_51_BIL_CUR_L_LEN = 2;
  	/**
	 * serializeIp65504D51BilCurL
	 */
	protected void serializeIp65504D51BilCurL(short ip65504D51BilCurL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504D51BilCurL,IP_65504_D_51_BIL_CUR_L_LEN)
                  ,beginIp65504D51BilCurL
                  ,IP_65504_D_51_BIL_CUR_L_LEN
                 );
            localIp65504D51BilCurLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504D51BilCurLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504D51BilCurL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504D51BilCurL() {	 
			return (getShort(beginIp65504D51BilCurL));
   	}
         int localIp65504D52PinDatSCounter = -1;
         public boolean isIp65504D52PinDatSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504D52PinDatSCounter != sharedCounter;
            localIp65504D52PinDatSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_D_52_PIN_DAT_S_LEN = 2;
  	/**
	 * serializeIp65504D52PinDatS
	 */
	protected void serializeIp65504D52PinDatS(short ip65504D52PinDatS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504D52PinDatS,IP_65504_D_52_PIN_DAT_S_LEN)
                  ,beginIp65504D52PinDatS
                  ,IP_65504_D_52_PIN_DAT_S_LEN
                 );
            localIp65504D52PinDatSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504D52PinDatSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504D52PinDatS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504D52PinDatS() {	 
			return (getShort(beginIp65504D52PinDatS));
   	}
         int localIp65504D52PinDatLCounter = -1;
         public boolean isIp65504D52PinDatLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504D52PinDatLCounter != sharedCounter;
            localIp65504D52PinDatLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_D_52_PIN_DAT_L_LEN = 2;
  	/**
	 * serializeIp65504D52PinDatL
	 */
	protected void serializeIp65504D52PinDatL(short ip65504D52PinDatL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504D52PinDatL,IP_65504_D_52_PIN_DAT_L_LEN)
                  ,beginIp65504D52PinDatL
                  ,IP_65504_D_52_PIN_DAT_L_LEN
                 );
            localIp65504D52PinDatLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504D52PinDatLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504D52PinDatL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504D52PinDatL() {	 
			return (getShort(beginIp65504D52PinDatL));
   	}
         int localIp65504D53SecCtlSCounter = -1;
         public boolean isIp65504D53SecCtlSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504D53SecCtlSCounter != sharedCounter;
            localIp65504D53SecCtlSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_D_53_SEC_CTL_S_LEN = 2;
  	/**
	 * serializeIp65504D53SecCtlS
	 */
	protected void serializeIp65504D53SecCtlS(short ip65504D53SecCtlS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504D53SecCtlS,IP_65504_D_53_SEC_CTL_S_LEN)
                  ,beginIp65504D53SecCtlS
                  ,IP_65504_D_53_SEC_CTL_S_LEN
                 );
            localIp65504D53SecCtlSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504D53SecCtlSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504D53SecCtlS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504D53SecCtlS() {	 
			return (getShort(beginIp65504D53SecCtlS));
   	}
         int localIp65504D53SecCtlLCounter = -1;
         public boolean isIp65504D53SecCtlLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504D53SecCtlLCounter != sharedCounter;
            localIp65504D53SecCtlLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_D_53_SEC_CTL_L_LEN = 2;
  	/**
	 * serializeIp65504D53SecCtlL
	 */
	protected void serializeIp65504D53SecCtlL(short ip65504D53SecCtlL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504D53SecCtlL,IP_65504_D_53_SEC_CTL_L_LEN)
                  ,beginIp65504D53SecCtlL
                  ,IP_65504_D_53_SEC_CTL_L_LEN
                 );
            localIp65504D53SecCtlLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504D53SecCtlLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504D53SecCtlL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504D53SecCtlL() {	 
			return (getShort(beginIp65504D53SecCtlL));
   	}
         int localIp65504D54AddlamtSCounter = -1;
         public boolean isIp65504D54AddlamtSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504D54AddlamtSCounter != sharedCounter;
            localIp65504D54AddlamtSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_D_54_ADDLAMT_S_LEN = 2;
  	/**
	 * serializeIp65504D54AddlamtS
	 */
	protected void serializeIp65504D54AddlamtS(short ip65504D54AddlamtS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504D54AddlamtS,IP_65504_D_54_ADDLAMT_S_LEN)
                  ,beginIp65504D54AddlamtS
                  ,IP_65504_D_54_ADDLAMT_S_LEN
                 );
            localIp65504D54AddlamtSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504D54AddlamtSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504D54AddlamtS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504D54AddlamtS() {	 
			return (getShort(beginIp65504D54AddlamtS));
   	}
         int localIp65504D54AddlamtLCounter = -1;
         public boolean isIp65504D54AddlamtLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504D54AddlamtLCounter != sharedCounter;
            localIp65504D54AddlamtLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_D_54_ADDLAMT_L_LEN = 2;
  	/**
	 * serializeIp65504D54AddlamtL
	 */
	protected void serializeIp65504D54AddlamtL(short ip65504D54AddlamtL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504D54AddlamtL,IP_65504_D_54_ADDLAMT_L_LEN)
                  ,beginIp65504D54AddlamtL
                  ,IP_65504_D_54_ADDLAMT_L_LEN
                 );
            localIp65504D54AddlamtLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504D54AddlamtLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504D54AddlamtL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504D54AddlamtL() {	 
			return (getShort(beginIp65504D54AddlamtL));
   	}
         int localIp65504D55IccDatSCounter = -1;
         public boolean isIp65504D55IccDatSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504D55IccDatSCounter != sharedCounter;
            localIp65504D55IccDatSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_D_55_ICC_DAT_S_LEN = 2;
  	/**
	 * serializeIp65504D55IccDatS
	 */
	protected void serializeIp65504D55IccDatS(short ip65504D55IccDatS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504D55IccDatS,IP_65504_D_55_ICC_DAT_S_LEN)
                  ,beginIp65504D55IccDatS
                  ,IP_65504_D_55_ICC_DAT_S_LEN
                 );
            localIp65504D55IccDatSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504D55IccDatSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504D55IccDatS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504D55IccDatS() {	 
			return (getShort(beginIp65504D55IccDatS));
   	}
         int localIp65504D55IccDatLCounter = -1;
         public boolean isIp65504D55IccDatLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504D55IccDatLCounter != sharedCounter;
            localIp65504D55IccDatLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_D_55_ICC_DAT_L_LEN = 2;
  	/**
	 * serializeIp65504D55IccDatL
	 */
	protected void serializeIp65504D55IccDatL(short ip65504D55IccDatL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504D55IccDatL,IP_65504_D_55_ICC_DAT_L_LEN)
                  ,beginIp65504D55IccDatL
                  ,IP_65504_D_55_ICC_DAT_L_LEN
                 );
            localIp65504D55IccDatLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504D55IccDatLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504D55IccDatL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504D55IccDatL() {	 
			return (getShort(beginIp65504D55IccDatL));
   	}
         int localIp65504D56OrigElSCounter = -1;
         public boolean isIp65504D56OrigElSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504D56OrigElSCounter != sharedCounter;
            localIp65504D56OrigElSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_D_56_ORIG_EL_S_LEN = 2;
  	/**
	 * serializeIp65504D56OrigElS
	 */
	protected void serializeIp65504D56OrigElS(short ip65504D56OrigElS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504D56OrigElS,IP_65504_D_56_ORIG_EL_S_LEN)
                  ,beginIp65504D56OrigElS
                  ,IP_65504_D_56_ORIG_EL_S_LEN
                 );
            localIp65504D56OrigElSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504D56OrigElSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504D56OrigElS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504D56OrigElS() {	 
			return (getShort(beginIp65504D56OrigElS));
   	}
         int localIp65504D56OrigElLCounter = -1;
         public boolean isIp65504D56OrigElLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504D56OrigElLCounter != sharedCounter;
            localIp65504D56OrigElLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_D_56_ORIG_EL_L_LEN = 2;
  	/**
	 * serializeIp65504D56OrigElL
	 */
	protected void serializeIp65504D56OrigElL(short ip65504D56OrigElL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504D56OrigElL,IP_65504_D_56_ORIG_EL_L_LEN)
                  ,beginIp65504D56OrigElL
                  ,IP_65504_D_56_ORIG_EL_L_LEN
                 );
            localIp65504D56OrigElLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504D56OrigElLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504D56OrigElL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504D56OrigElL() {	 
			return (getShort(beginIp65504D56OrigElL));
   	}
         int localIp65504D57AuthCySCounter = -1;
         public boolean isIp65504D57AuthCySModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504D57AuthCySCounter != sharedCounter;
            localIp65504D57AuthCySCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_D_57_AUTH_CY_S_LEN = 2;
  	/**
	 * serializeIp65504D57AuthCyS
	 */
	protected void serializeIp65504D57AuthCyS(short ip65504D57AuthCyS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504D57AuthCyS,IP_65504_D_57_AUTH_CY_S_LEN)
                  ,beginIp65504D57AuthCyS
                  ,IP_65504_D_57_AUTH_CY_S_LEN
                 );
            localIp65504D57AuthCySCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504D57AuthCySMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504D57AuthCyS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504D57AuthCyS() {	 
			return (getShort(beginIp65504D57AuthCyS));
   	}
         int localIp65504D57AuthCyLCounter = -1;
         public boolean isIp65504D57AuthCyLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504D57AuthCyLCounter != sharedCounter;
            localIp65504D57AuthCyLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_D_57_AUTH_CY_L_LEN = 2;
  	/**
	 * serializeIp65504D57AuthCyL
	 */
	protected void serializeIp65504D57AuthCyL(short ip65504D57AuthCyL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504D57AuthCyL,IP_65504_D_57_AUTH_CY_L_LEN)
                  ,beginIp65504D57AuthCyL
                  ,IP_65504_D_57_AUTH_CY_L_LEN
                 );
            localIp65504D57AuthCyLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504D57AuthCyLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504D57AuthCyL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504D57AuthCyL() {	 
			return (getShort(beginIp65504D57AuthCyL));
   	}
         int localIp65504D58AuthAgSCounter = -1;
         public boolean isIp65504D58AuthAgSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504D58AuthAgSCounter != sharedCounter;
            localIp65504D58AuthAgSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_D_58_AUTH_AG_S_LEN = 2;
  	/**
	 * serializeIp65504D58AuthAgS
	 */
	protected void serializeIp65504D58AuthAgS(short ip65504D58AuthAgS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504D58AuthAgS,IP_65504_D_58_AUTH_AG_S_LEN)
                  ,beginIp65504D58AuthAgS
                  ,IP_65504_D_58_AUTH_AG_S_LEN
                 );
            localIp65504D58AuthAgSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504D58AuthAgSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504D58AuthAgS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504D58AuthAgS() {	 
			return (getShort(beginIp65504D58AuthAgS));
   	}
         int localIp65504D58AuthAgLCounter = -1;
         public boolean isIp65504D58AuthAgLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504D58AuthAgLCounter != sharedCounter;
            localIp65504D58AuthAgLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_D_58_AUTH_AG_L_LEN = 2;
  	/**
	 * serializeIp65504D58AuthAgL
	 */
	protected void serializeIp65504D58AuthAgL(short ip65504D58AuthAgL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504D58AuthAgL,IP_65504_D_58_AUTH_AG_L_LEN)
                  ,beginIp65504D58AuthAgL
                  ,IP_65504_D_58_AUTH_AG_L_LEN
                 );
            localIp65504D58AuthAgLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504D58AuthAgLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504D58AuthAgL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504D58AuthAgL() {	 
			return (getShort(beginIp65504D58AuthAgL));
   	}
         int localIp65504D59TransptSCounter = -1;
         public boolean isIp65504D59TransptSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504D59TransptSCounter != sharedCounter;
            localIp65504D59TransptSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_D_59_TRANSPT_S_LEN = 2;
  	/**
	 * serializeIp65504D59TransptS
	 */
	protected void serializeIp65504D59TransptS(short ip65504D59TransptS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504D59TransptS,IP_65504_D_59_TRANSPT_S_LEN)
                  ,beginIp65504D59TransptS
                  ,IP_65504_D_59_TRANSPT_S_LEN
                 );
            localIp65504D59TransptSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504D59TransptSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504D59TransptS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504D59TransptS() {	 
			return (getShort(beginIp65504D59TransptS));
   	}
         int localIp65504D59TransptLCounter = -1;
         public boolean isIp65504D59TransptLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504D59TransptLCounter != sharedCounter;
            localIp65504D59TransptLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_D_59_TRANSPT_L_LEN = 2;
  	/**
	 * serializeIp65504D59TransptL
	 */
	protected void serializeIp65504D59TransptL(short ip65504D59TransptL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504D59TransptL,IP_65504_D_59_TRANSPT_L_LEN)
                  ,beginIp65504D59TransptL
                  ,IP_65504_D_59_TRANSPT_L_LEN
                 );
            localIp65504D59TransptLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504D59TransptLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504D59TransptL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504D59TransptL() {	 
			return (getShort(beginIp65504D59TransptL));
   	}
         int localIp65504D60ReservdSCounter = -1;
         public boolean isIp65504D60ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504D60ReservdSCounter != sharedCounter;
            localIp65504D60ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_D_60_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504D60ReservdS
	 */
	protected void serializeIp65504D60ReservdS(short ip65504D60ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504D60ReservdS,IP_65504_D_60_RESERVD_S_LEN)
                  ,beginIp65504D60ReservdS
                  ,IP_65504_D_60_RESERVD_S_LEN
                 );
            localIp65504D60ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504D60ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504D60ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504D60ReservdS() {	 
			return (getShort(beginIp65504D60ReservdS));
   	}
         int localIp65504D60ReservdLCounter = -1;
         public boolean isIp65504D60ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504D60ReservdLCounter != sharedCounter;
            localIp65504D60ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_D_60_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504D60ReservdL
	 */
	protected void serializeIp65504D60ReservdL(short ip65504D60ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504D60ReservdL,IP_65504_D_60_RESERVD_L_LEN)
                  ,beginIp65504D60ReservdL
                  ,IP_65504_D_60_RESERVD_L_LEN
                 );
            localIp65504D60ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504D60ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504D60ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504D60ReservdL() {	 
			return (getShort(beginIp65504D60ReservdL));
   	}
         int localIp65504D61ReservdSCounter = -1;
         public boolean isIp65504D61ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504D61ReservdSCounter != sharedCounter;
            localIp65504D61ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_D_61_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504D61ReservdS
	 */
	protected void serializeIp65504D61ReservdS(short ip65504D61ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504D61ReservdS,IP_65504_D_61_RESERVD_S_LEN)
                  ,beginIp65504D61ReservdS
                  ,IP_65504_D_61_RESERVD_S_LEN
                 );
            localIp65504D61ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504D61ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504D61ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504D61ReservdS() {	 
			return (getShort(beginIp65504D61ReservdS));
   	}
         int localIp65504D61ReservdLCounter = -1;
         public boolean isIp65504D61ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504D61ReservdLCounter != sharedCounter;
            localIp65504D61ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_D_61_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504D61ReservdL
	 */
	protected void serializeIp65504D61ReservdL(short ip65504D61ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504D61ReservdL,IP_65504_D_61_RESERVD_L_LEN)
                  ,beginIp65504D61ReservdL
                  ,IP_65504_D_61_RESERVD_L_LEN
                 );
            localIp65504D61ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504D61ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504D61ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504D61ReservdL() {	 
			return (getShort(beginIp65504D61ReservdL));
   	}
         int localIp65504D62FmtVerSCounter = -1;
         public boolean isIp65504D62FmtVerSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504D62FmtVerSCounter != sharedCounter;
            localIp65504D62FmtVerSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_D_62_FMT_VER_S_LEN = 2;
  	/**
	 * serializeIp65504D62FmtVerS
	 */
	protected void serializeIp65504D62FmtVerS(short ip65504D62FmtVerS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504D62FmtVerS,IP_65504_D_62_FMT_VER_S_LEN)
                  ,beginIp65504D62FmtVerS
                  ,IP_65504_D_62_FMT_VER_S_LEN
                 );
            localIp65504D62FmtVerSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504D62FmtVerSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504D62FmtVerS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504D62FmtVerS() {	 
			return (getShort(beginIp65504D62FmtVerS));
   	}
         int localIp65504D62FmtVerLCounter = -1;
         public boolean isIp65504D62FmtVerLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504D62FmtVerLCounter != sharedCounter;
            localIp65504D62FmtVerLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_D_62_FMT_VER_L_LEN = 2;
  	/**
	 * serializeIp65504D62FmtVerL
	 */
	protected void serializeIp65504D62FmtVerL(short ip65504D62FmtVerL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504D62FmtVerL,IP_65504_D_62_FMT_VER_L_LEN)
                  ,beginIp65504D62FmtVerL
                  ,IP_65504_D_62_FMT_VER_L_LEN
                 );
            localIp65504D62FmtVerLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504D62FmtVerLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504D62FmtVerL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504D62FmtVerL() {	 
			return (getShort(beginIp65504D62FmtVerL));
   	}




}
  
