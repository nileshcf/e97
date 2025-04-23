package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip65504PdsNamesLargeGroup4Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 09:59. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip65504PdsNamesLargeGroup4Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip65504PdsNamesLargeGroup4Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_65504_PDS_NAMES_LARGE_GROUP_4_LENGTH = 248;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp65504P094ReservdS;
            protected  int beginIp65504P094ReservdL;
            protected  int beginIp65504P095CardsecS;
            protected  int beginIp65504P095CardsecL;
            protected  int beginIp65504P096ReservdS;
            protected  int beginIp65504P096ReservdL;
            protected  int beginIp65504P097ReservdS;
            protected  int beginIp65504P097ReservdL;
            protected  int beginIp65504P098ReservdS;
            protected  int beginIp65504P098ReservdL;
            protected  int beginIp65504P099ReservdS;
            protected  int beginIp65504P099ReservdL;
            protected  int beginIp65504P100ReservdS;
            protected  int beginIp65504P100ReservdL;
            protected  int beginIp65504P101ReservdS;
            protected  int beginIp65504P101ReservdL;
            protected  int beginIp65504P102ReservdS;
            protected  int beginIp65504P102ReservdL;
            protected  int beginIp65504P103TrxDesS;
            protected  int beginIp65504P103TrxDesL;
            protected  int beginIp65504P104ReservdS;
            protected  int beginIp65504P104ReservdL;
            protected  int beginIp65504P105FileIdS;
            protected  int beginIp65504P105FileIdL;
            protected  int beginIp65504P106ReservdS;
            protected  int beginIp65504P106ReservdL;
            protected  int beginIp65504P107ReservdS;
            protected  int beginIp65504P107ReservdL;
            protected  int beginIp65504P108ReservdS;
            protected  int beginIp65504P108ReservdL;
            protected  int beginIp65504P109ReservdS;
            protected  int beginIp65504P109ReservdL;
            protected  int beginIp65504P110TranIdS;
            protected  int beginIp65504P110TranIdL;
            protected  int beginIp65504P111ReservdS;
            protected  int beginIp65504P111ReservdL;
            protected  int beginIp65504P112ReservdS;
            protected  int beginIp65504P112ReservdL;
            protected  int beginIp65504P113ReservdS;
            protected  int beginIp65504P113ReservdL;
            protected  int beginIp65504P114ReservdS;
            protected  int beginIp65504P114ReservdL;
            protected  int beginIp65504P115ReservdS;
            protected  int beginIp65504P115ReservdL;
            protected  int beginIp65504P116ReservdS;
            protected  int beginIp65504P116ReservdL;
            protected  int beginIp65504P117ReservdS;
            protected  int beginIp65504P117ReservdL;
            protected  int beginIp65504P118ReservdS;
            protected  int beginIp65504P118ReservdL;
            protected  int beginIp65504P119ReservdS;
            protected  int beginIp65504P119ReservdL;
            protected  int beginIp65504P120ReservdS;
            protected  int beginIp65504P120ReservdL;
            protected  int beginIp65504P121ReservdS;
            protected  int beginIp65504P121ReservdL;
            protected  int beginIp65504P122ProcMdS;
            protected  int beginIp65504P122ProcMdL;
            protected  int beginIp65504P123ReservdS;
            protected  int beginIp65504P123ReservdL;
            protected  int beginIp65504P124ReservdS;
            protected  int beginIp65504P124ReservdL;
	
	/**
	* Constructor for Ip65504PdsNamesLargeGroup4Serialized
	**/
    public Ip65504PdsNamesLargeGroup4Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ip65504PdsNamesLargeGroup4Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip65504PdsNamesLargeGroup4Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ip65504PdsNamesLargeGroup4Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,740); // serialize this field at offset 740 by default 
    }
    
	/**
	* sets parent for this Ip65504PdsNamesLargeGroup4Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 740 by default
    }    
	/**
	* initializes the field in Ip65504PdsNamesLargeGroup4Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_65504_PDS_NAMES_LARGE_GROUP_4_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp65504P094ReservdS = getStartOffset() + 4;	// set offset for serialization
  
             beginIp65504P094ReservdL = getStartOffset() + 6;	// set offset for serialization
  
  
             beginIp65504P095CardsecS = getStartOffset() + 12;	// set offset for serialization
  
             beginIp65504P095CardsecL = getStartOffset() + 14;	// set offset for serialization
  
  
             beginIp65504P096ReservdS = getStartOffset() + 20;	// set offset for serialization
  
             beginIp65504P096ReservdL = getStartOffset() + 22;	// set offset for serialization
  
  
             beginIp65504P097ReservdS = getStartOffset() + 28;	// set offset for serialization
  
             beginIp65504P097ReservdL = getStartOffset() + 30;	// set offset for serialization
  
  
             beginIp65504P098ReservdS = getStartOffset() + 36;	// set offset for serialization
  
             beginIp65504P098ReservdL = getStartOffset() + 38;	// set offset for serialization
  
  
             beginIp65504P099ReservdS = getStartOffset() + 44;	// set offset for serialization
  
             beginIp65504P099ReservdL = getStartOffset() + 46;	// set offset for serialization
  
  
             beginIp65504P100ReservdS = getStartOffset() + 52;	// set offset for serialization
  
             beginIp65504P100ReservdL = getStartOffset() + 54;	// set offset for serialization
  
  
             beginIp65504P101ReservdS = getStartOffset() + 60;	// set offset for serialization
  
             beginIp65504P101ReservdL = getStartOffset() + 62;	// set offset for serialization
  
  
             beginIp65504P102ReservdS = getStartOffset() + 68;	// set offset for serialization
  
             beginIp65504P102ReservdL = getStartOffset() + 70;	// set offset for serialization
  
  
             beginIp65504P103TrxDesS = getStartOffset() + 76;	// set offset for serialization
  
             beginIp65504P103TrxDesL = getStartOffset() + 78;	// set offset for serialization
  
  
             beginIp65504P104ReservdS = getStartOffset() + 84;	// set offset for serialization
  
             beginIp65504P104ReservdL = getStartOffset() + 86;	// set offset for serialization
  
  
             beginIp65504P105FileIdS = getStartOffset() + 92;	// set offset for serialization
  
             beginIp65504P105FileIdL = getStartOffset() + 94;	// set offset for serialization
  
  
             beginIp65504P106ReservdS = getStartOffset() + 100;	// set offset for serialization
  
             beginIp65504P106ReservdL = getStartOffset() + 102;	// set offset for serialization
  
  
             beginIp65504P107ReservdS = getStartOffset() + 108;	// set offset for serialization
  
             beginIp65504P107ReservdL = getStartOffset() + 110;	// set offset for serialization
  
  
             beginIp65504P108ReservdS = getStartOffset() + 116;	// set offset for serialization
  
             beginIp65504P108ReservdL = getStartOffset() + 118;	// set offset for serialization
  
  
             beginIp65504P109ReservdS = getStartOffset() + 124;	// set offset for serialization
  
             beginIp65504P109ReservdL = getStartOffset() + 126;	// set offset for serialization
  
  
             beginIp65504P110TranIdS = getStartOffset() + 132;	// set offset for serialization
  
             beginIp65504P110TranIdL = getStartOffset() + 134;	// set offset for serialization
  
  
             beginIp65504P111ReservdS = getStartOffset() + 140;	// set offset for serialization
  
             beginIp65504P111ReservdL = getStartOffset() + 142;	// set offset for serialization
  
  
             beginIp65504P112ReservdS = getStartOffset() + 148;	// set offset for serialization
  
             beginIp65504P112ReservdL = getStartOffset() + 150;	// set offset for serialization
  
  
             beginIp65504P113ReservdS = getStartOffset() + 156;	// set offset for serialization
  
             beginIp65504P113ReservdL = getStartOffset() + 158;	// set offset for serialization
  
  
             beginIp65504P114ReservdS = getStartOffset() + 164;	// set offset for serialization
  
             beginIp65504P114ReservdL = getStartOffset() + 166;	// set offset for serialization
  
  
             beginIp65504P115ReservdS = getStartOffset() + 172;	// set offset for serialization
  
             beginIp65504P115ReservdL = getStartOffset() + 174;	// set offset for serialization
  
  
             beginIp65504P116ReservdS = getStartOffset() + 180;	// set offset for serialization
  
             beginIp65504P116ReservdL = getStartOffset() + 182;	// set offset for serialization
  
  
             beginIp65504P117ReservdS = getStartOffset() + 188;	// set offset for serialization
  
             beginIp65504P117ReservdL = getStartOffset() + 190;	// set offset for serialization
  
  
             beginIp65504P118ReservdS = getStartOffset() + 196;	// set offset for serialization
  
             beginIp65504P118ReservdL = getStartOffset() + 198;	// set offset for serialization
  
  
             beginIp65504P119ReservdS = getStartOffset() + 204;	// set offset for serialization
  
             beginIp65504P119ReservdL = getStartOffset() + 206;	// set offset for serialization
  
  
             beginIp65504P120ReservdS = getStartOffset() + 212;	// set offset for serialization
  
             beginIp65504P120ReservdL = getStartOffset() + 214;	// set offset for serialization
  
  
             beginIp65504P121ReservdS = getStartOffset() + 220;	// set offset for serialization
  
             beginIp65504P121ReservdL = getStartOffset() + 222;	// set offset for serialization
  
  
             beginIp65504P122ProcMdS = getStartOffset() + 228;	// set offset for serialization
  
             beginIp65504P122ProcMdL = getStartOffset() + 230;	// set offset for serialization
  
  
             beginIp65504P123ReservdS = getStartOffset() + 236;	// set offset for serialization
  
             beginIp65504P123ReservdL = getStartOffset() + 238;	// set offset for serialization
  
  
             beginIp65504P124ReservdS = getStartOffset() + 244;	// set offset for serialization
  
             beginIp65504P124ReservdL = getStartOffset() + 246;	// set offset for serialization
  
  
	   /*  end of offset */
	}
         int localIp65504P094ReservdSCounter = -1;
         public boolean isIp65504P094ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P094ReservdSCounter != sharedCounter;
            localIp65504P094ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_094_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P094ReservdS
	 */
	protected void serializeIp65504P094ReservdS(short ip65504P094ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P094ReservdS,IP_65504_P_094_RESERVD_S_LEN)
                  ,beginIp65504P094ReservdS
                  ,IP_65504_P_094_RESERVD_S_LEN
                 );
            localIp65504P094ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P094ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P094ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P094ReservdS() {	 
			return (getShort(beginIp65504P094ReservdS));
   	}
         int localIp65504P094ReservdLCounter = -1;
         public boolean isIp65504P094ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P094ReservdLCounter != sharedCounter;
            localIp65504P094ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_094_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P094ReservdL
	 */
	protected void serializeIp65504P094ReservdL(short ip65504P094ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P094ReservdL,IP_65504_P_094_RESERVD_L_LEN)
                  ,beginIp65504P094ReservdL
                  ,IP_65504_P_094_RESERVD_L_LEN
                 );
            localIp65504P094ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P094ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P094ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P094ReservdL() {	 
			return (getShort(beginIp65504P094ReservdL));
   	}
         int localIp65504P095CardsecSCounter = -1;
         public boolean isIp65504P095CardsecSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P095CardsecSCounter != sharedCounter;
            localIp65504P095CardsecSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_095_CARDSEC_S_LEN = 2;
  	/**
	 * serializeIp65504P095CardsecS
	 */
	protected void serializeIp65504P095CardsecS(short ip65504P095CardsecS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P095CardsecS,IP_65504_P_095_CARDSEC_S_LEN)
                  ,beginIp65504P095CardsecS
                  ,IP_65504_P_095_CARDSEC_S_LEN
                 );
            localIp65504P095CardsecSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P095CardsecSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P095CardsecS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P095CardsecS() {	 
			return (getShort(beginIp65504P095CardsecS));
   	}
         int localIp65504P095CardsecLCounter = -1;
         public boolean isIp65504P095CardsecLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P095CardsecLCounter != sharedCounter;
            localIp65504P095CardsecLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_095_CARDSEC_L_LEN = 2;
  	/**
	 * serializeIp65504P095CardsecL
	 */
	protected void serializeIp65504P095CardsecL(short ip65504P095CardsecL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P095CardsecL,IP_65504_P_095_CARDSEC_L_LEN)
                  ,beginIp65504P095CardsecL
                  ,IP_65504_P_095_CARDSEC_L_LEN
                 );
            localIp65504P095CardsecLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P095CardsecLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P095CardsecL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P095CardsecL() {	 
			return (getShort(beginIp65504P095CardsecL));
   	}
         int localIp65504P096ReservdSCounter = -1;
         public boolean isIp65504P096ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P096ReservdSCounter != sharedCounter;
            localIp65504P096ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_096_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P096ReservdS
	 */
	protected void serializeIp65504P096ReservdS(short ip65504P096ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P096ReservdS,IP_65504_P_096_RESERVD_S_LEN)
                  ,beginIp65504P096ReservdS
                  ,IP_65504_P_096_RESERVD_S_LEN
                 );
            localIp65504P096ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P096ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P096ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P096ReservdS() {	 
			return (getShort(beginIp65504P096ReservdS));
   	}
         int localIp65504P096ReservdLCounter = -1;
         public boolean isIp65504P096ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P096ReservdLCounter != sharedCounter;
            localIp65504P096ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_096_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P096ReservdL
	 */
	protected void serializeIp65504P096ReservdL(short ip65504P096ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P096ReservdL,IP_65504_P_096_RESERVD_L_LEN)
                  ,beginIp65504P096ReservdL
                  ,IP_65504_P_096_RESERVD_L_LEN
                 );
            localIp65504P096ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P096ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P096ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P096ReservdL() {	 
			return (getShort(beginIp65504P096ReservdL));
   	}
         int localIp65504P097ReservdSCounter = -1;
         public boolean isIp65504P097ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P097ReservdSCounter != sharedCounter;
            localIp65504P097ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_097_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P097ReservdS
	 */
	protected void serializeIp65504P097ReservdS(short ip65504P097ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P097ReservdS,IP_65504_P_097_RESERVD_S_LEN)
                  ,beginIp65504P097ReservdS
                  ,IP_65504_P_097_RESERVD_S_LEN
                 );
            localIp65504P097ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P097ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P097ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P097ReservdS() {	 
			return (getShort(beginIp65504P097ReservdS));
   	}
         int localIp65504P097ReservdLCounter = -1;
         public boolean isIp65504P097ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P097ReservdLCounter != sharedCounter;
            localIp65504P097ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_097_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P097ReservdL
	 */
	protected void serializeIp65504P097ReservdL(short ip65504P097ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P097ReservdL,IP_65504_P_097_RESERVD_L_LEN)
                  ,beginIp65504P097ReservdL
                  ,IP_65504_P_097_RESERVD_L_LEN
                 );
            localIp65504P097ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P097ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P097ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P097ReservdL() {	 
			return (getShort(beginIp65504P097ReservdL));
   	}
         int localIp65504P098ReservdSCounter = -1;
         public boolean isIp65504P098ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P098ReservdSCounter != sharedCounter;
            localIp65504P098ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_098_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P098ReservdS
	 */
	protected void serializeIp65504P098ReservdS(short ip65504P098ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P098ReservdS,IP_65504_P_098_RESERVD_S_LEN)
                  ,beginIp65504P098ReservdS
                  ,IP_65504_P_098_RESERVD_S_LEN
                 );
            localIp65504P098ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P098ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P098ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P098ReservdS() {	 
			return (getShort(beginIp65504P098ReservdS));
   	}
         int localIp65504P098ReservdLCounter = -1;
         public boolean isIp65504P098ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P098ReservdLCounter != sharedCounter;
            localIp65504P098ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_098_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P098ReservdL
	 */
	protected void serializeIp65504P098ReservdL(short ip65504P098ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P098ReservdL,IP_65504_P_098_RESERVD_L_LEN)
                  ,beginIp65504P098ReservdL
                  ,IP_65504_P_098_RESERVD_L_LEN
                 );
            localIp65504P098ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P098ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P098ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P098ReservdL() {	 
			return (getShort(beginIp65504P098ReservdL));
   	}
         int localIp65504P099ReservdSCounter = -1;
         public boolean isIp65504P099ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P099ReservdSCounter != sharedCounter;
            localIp65504P099ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_099_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P099ReservdS
	 */
	protected void serializeIp65504P099ReservdS(short ip65504P099ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P099ReservdS,IP_65504_P_099_RESERVD_S_LEN)
                  ,beginIp65504P099ReservdS
                  ,IP_65504_P_099_RESERVD_S_LEN
                 );
            localIp65504P099ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P099ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P099ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P099ReservdS() {	 
			return (getShort(beginIp65504P099ReservdS));
   	}
         int localIp65504P099ReservdLCounter = -1;
         public boolean isIp65504P099ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P099ReservdLCounter != sharedCounter;
            localIp65504P099ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_099_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P099ReservdL
	 */
	protected void serializeIp65504P099ReservdL(short ip65504P099ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P099ReservdL,IP_65504_P_099_RESERVD_L_LEN)
                  ,beginIp65504P099ReservdL
                  ,IP_65504_P_099_RESERVD_L_LEN
                 );
            localIp65504P099ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P099ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P099ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P099ReservdL() {	 
			return (getShort(beginIp65504P099ReservdL));
   	}
         int localIp65504P100ReservdSCounter = -1;
         public boolean isIp65504P100ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P100ReservdSCounter != sharedCounter;
            localIp65504P100ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_100_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P100ReservdS
	 */
	protected void serializeIp65504P100ReservdS(short ip65504P100ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P100ReservdS,IP_65504_P_100_RESERVD_S_LEN)
                  ,beginIp65504P100ReservdS
                  ,IP_65504_P_100_RESERVD_S_LEN
                 );
            localIp65504P100ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P100ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P100ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P100ReservdS() {	 
			return (getShort(beginIp65504P100ReservdS));
   	}
         int localIp65504P100ReservdLCounter = -1;
         public boolean isIp65504P100ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P100ReservdLCounter != sharedCounter;
            localIp65504P100ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_100_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P100ReservdL
	 */
	protected void serializeIp65504P100ReservdL(short ip65504P100ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P100ReservdL,IP_65504_P_100_RESERVD_L_LEN)
                  ,beginIp65504P100ReservdL
                  ,IP_65504_P_100_RESERVD_L_LEN
                 );
            localIp65504P100ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P100ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P100ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P100ReservdL() {	 
			return (getShort(beginIp65504P100ReservdL));
   	}
         int localIp65504P101ReservdSCounter = -1;
         public boolean isIp65504P101ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P101ReservdSCounter != sharedCounter;
            localIp65504P101ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_101_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P101ReservdS
	 */
	protected void serializeIp65504P101ReservdS(short ip65504P101ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P101ReservdS,IP_65504_P_101_RESERVD_S_LEN)
                  ,beginIp65504P101ReservdS
                  ,IP_65504_P_101_RESERVD_S_LEN
                 );
            localIp65504P101ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P101ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P101ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P101ReservdS() {	 
			return (getShort(beginIp65504P101ReservdS));
   	}
         int localIp65504P101ReservdLCounter = -1;
         public boolean isIp65504P101ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P101ReservdLCounter != sharedCounter;
            localIp65504P101ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_101_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P101ReservdL
	 */
	protected void serializeIp65504P101ReservdL(short ip65504P101ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P101ReservdL,IP_65504_P_101_RESERVD_L_LEN)
                  ,beginIp65504P101ReservdL
                  ,IP_65504_P_101_RESERVD_L_LEN
                 );
            localIp65504P101ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P101ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P101ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P101ReservdL() {	 
			return (getShort(beginIp65504P101ReservdL));
   	}
         int localIp65504P102ReservdSCounter = -1;
         public boolean isIp65504P102ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P102ReservdSCounter != sharedCounter;
            localIp65504P102ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_102_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P102ReservdS
	 */
	protected void serializeIp65504P102ReservdS(short ip65504P102ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P102ReservdS,IP_65504_P_102_RESERVD_S_LEN)
                  ,beginIp65504P102ReservdS
                  ,IP_65504_P_102_RESERVD_S_LEN
                 );
            localIp65504P102ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P102ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P102ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P102ReservdS() {	 
			return (getShort(beginIp65504P102ReservdS));
   	}
         int localIp65504P102ReservdLCounter = -1;
         public boolean isIp65504P102ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P102ReservdLCounter != sharedCounter;
            localIp65504P102ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_102_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P102ReservdL
	 */
	protected void serializeIp65504P102ReservdL(short ip65504P102ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P102ReservdL,IP_65504_P_102_RESERVD_L_LEN)
                  ,beginIp65504P102ReservdL
                  ,IP_65504_P_102_RESERVD_L_LEN
                 );
            localIp65504P102ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P102ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P102ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P102ReservdL() {	 
			return (getShort(beginIp65504P102ReservdL));
   	}
         int localIp65504P103TrxDesSCounter = -1;
         public boolean isIp65504P103TrxDesSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P103TrxDesSCounter != sharedCounter;
            localIp65504P103TrxDesSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_103_TRX_DES_S_LEN = 2;
  	/**
	 * serializeIp65504P103TrxDesS
	 */
	protected void serializeIp65504P103TrxDesS(short ip65504P103TrxDesS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P103TrxDesS,IP_65504_P_103_TRX_DES_S_LEN)
                  ,beginIp65504P103TrxDesS
                  ,IP_65504_P_103_TRX_DES_S_LEN
                 );
            localIp65504P103TrxDesSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P103TrxDesSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P103TrxDesS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P103TrxDesS() {	 
			return (getShort(beginIp65504P103TrxDesS));
   	}
         int localIp65504P103TrxDesLCounter = -1;
         public boolean isIp65504P103TrxDesLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P103TrxDesLCounter != sharedCounter;
            localIp65504P103TrxDesLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_103_TRX_DES_L_LEN = 2;
  	/**
	 * serializeIp65504P103TrxDesL
	 */
	protected void serializeIp65504P103TrxDesL(short ip65504P103TrxDesL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P103TrxDesL,IP_65504_P_103_TRX_DES_L_LEN)
                  ,beginIp65504P103TrxDesL
                  ,IP_65504_P_103_TRX_DES_L_LEN
                 );
            localIp65504P103TrxDesLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P103TrxDesLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P103TrxDesL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P103TrxDesL() {	 
			return (getShort(beginIp65504P103TrxDesL));
   	}
         int localIp65504P104ReservdSCounter = -1;
         public boolean isIp65504P104ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P104ReservdSCounter != sharedCounter;
            localIp65504P104ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_104_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P104ReservdS
	 */
	protected void serializeIp65504P104ReservdS(short ip65504P104ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P104ReservdS,IP_65504_P_104_RESERVD_S_LEN)
                  ,beginIp65504P104ReservdS
                  ,IP_65504_P_104_RESERVD_S_LEN
                 );
            localIp65504P104ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P104ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P104ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P104ReservdS() {	 
			return (getShort(beginIp65504P104ReservdS));
   	}
         int localIp65504P104ReservdLCounter = -1;
         public boolean isIp65504P104ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P104ReservdLCounter != sharedCounter;
            localIp65504P104ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_104_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P104ReservdL
	 */
	protected void serializeIp65504P104ReservdL(short ip65504P104ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P104ReservdL,IP_65504_P_104_RESERVD_L_LEN)
                  ,beginIp65504P104ReservdL
                  ,IP_65504_P_104_RESERVD_L_LEN
                 );
            localIp65504P104ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P104ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P104ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P104ReservdL() {	 
			return (getShort(beginIp65504P104ReservdL));
   	}
         int localIp65504P105FileIdSCounter = -1;
         public boolean isIp65504P105FileIdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P105FileIdSCounter != sharedCounter;
            localIp65504P105FileIdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_105_FILE_ID_S_LEN = 2;
  	/**
	 * serializeIp65504P105FileIdS
	 */
	protected void serializeIp65504P105FileIdS(short ip65504P105FileIdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P105FileIdS,IP_65504_P_105_FILE_ID_S_LEN)
                  ,beginIp65504P105FileIdS
                  ,IP_65504_P_105_FILE_ID_S_LEN
                 );
            localIp65504P105FileIdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P105FileIdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P105FileIdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P105FileIdS() {	 
			return (getShort(beginIp65504P105FileIdS));
   	}
         int localIp65504P105FileIdLCounter = -1;
         public boolean isIp65504P105FileIdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P105FileIdLCounter != sharedCounter;
            localIp65504P105FileIdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_105_FILE_ID_L_LEN = 2;
  	/**
	 * serializeIp65504P105FileIdL
	 */
	protected void serializeIp65504P105FileIdL(short ip65504P105FileIdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P105FileIdL,IP_65504_P_105_FILE_ID_L_LEN)
                  ,beginIp65504P105FileIdL
                  ,IP_65504_P_105_FILE_ID_L_LEN
                 );
            localIp65504P105FileIdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P105FileIdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P105FileIdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P105FileIdL() {	 
			return (getShort(beginIp65504P105FileIdL));
   	}
         int localIp65504P106ReservdSCounter = -1;
         public boolean isIp65504P106ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P106ReservdSCounter != sharedCounter;
            localIp65504P106ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_106_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P106ReservdS
	 */
	protected void serializeIp65504P106ReservdS(short ip65504P106ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P106ReservdS,IP_65504_P_106_RESERVD_S_LEN)
                  ,beginIp65504P106ReservdS
                  ,IP_65504_P_106_RESERVD_S_LEN
                 );
            localIp65504P106ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P106ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P106ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P106ReservdS() {	 
			return (getShort(beginIp65504P106ReservdS));
   	}
         int localIp65504P106ReservdLCounter = -1;
         public boolean isIp65504P106ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P106ReservdLCounter != sharedCounter;
            localIp65504P106ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_106_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P106ReservdL
	 */
	protected void serializeIp65504P106ReservdL(short ip65504P106ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P106ReservdL,IP_65504_P_106_RESERVD_L_LEN)
                  ,beginIp65504P106ReservdL
                  ,IP_65504_P_106_RESERVD_L_LEN
                 );
            localIp65504P106ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P106ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P106ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P106ReservdL() {	 
			return (getShort(beginIp65504P106ReservdL));
   	}
         int localIp65504P107ReservdSCounter = -1;
         public boolean isIp65504P107ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P107ReservdSCounter != sharedCounter;
            localIp65504P107ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_107_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P107ReservdS
	 */
	protected void serializeIp65504P107ReservdS(short ip65504P107ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P107ReservdS,IP_65504_P_107_RESERVD_S_LEN)
                  ,beginIp65504P107ReservdS
                  ,IP_65504_P_107_RESERVD_S_LEN
                 );
            localIp65504P107ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P107ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P107ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P107ReservdS() {	 
			return (getShort(beginIp65504P107ReservdS));
   	}
         int localIp65504P107ReservdLCounter = -1;
         public boolean isIp65504P107ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P107ReservdLCounter != sharedCounter;
            localIp65504P107ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_107_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P107ReservdL
	 */
	protected void serializeIp65504P107ReservdL(short ip65504P107ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P107ReservdL,IP_65504_P_107_RESERVD_L_LEN)
                  ,beginIp65504P107ReservdL
                  ,IP_65504_P_107_RESERVD_L_LEN
                 );
            localIp65504P107ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P107ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P107ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P107ReservdL() {	 
			return (getShort(beginIp65504P107ReservdL));
   	}
         int localIp65504P108ReservdSCounter = -1;
         public boolean isIp65504P108ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P108ReservdSCounter != sharedCounter;
            localIp65504P108ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_108_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P108ReservdS
	 */
	protected void serializeIp65504P108ReservdS(short ip65504P108ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P108ReservdS,IP_65504_P_108_RESERVD_S_LEN)
                  ,beginIp65504P108ReservdS
                  ,IP_65504_P_108_RESERVD_S_LEN
                 );
            localIp65504P108ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P108ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P108ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P108ReservdS() {	 
			return (getShort(beginIp65504P108ReservdS));
   	}
         int localIp65504P108ReservdLCounter = -1;
         public boolean isIp65504P108ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P108ReservdLCounter != sharedCounter;
            localIp65504P108ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_108_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P108ReservdL
	 */
	protected void serializeIp65504P108ReservdL(short ip65504P108ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P108ReservdL,IP_65504_P_108_RESERVD_L_LEN)
                  ,beginIp65504P108ReservdL
                  ,IP_65504_P_108_RESERVD_L_LEN
                 );
            localIp65504P108ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P108ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P108ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P108ReservdL() {	 
			return (getShort(beginIp65504P108ReservdL));
   	}
         int localIp65504P109ReservdSCounter = -1;
         public boolean isIp65504P109ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P109ReservdSCounter != sharedCounter;
            localIp65504P109ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_109_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P109ReservdS
	 */
	protected void serializeIp65504P109ReservdS(short ip65504P109ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P109ReservdS,IP_65504_P_109_RESERVD_S_LEN)
                  ,beginIp65504P109ReservdS
                  ,IP_65504_P_109_RESERVD_S_LEN
                 );
            localIp65504P109ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P109ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P109ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P109ReservdS() {	 
			return (getShort(beginIp65504P109ReservdS));
   	}
         int localIp65504P109ReservdLCounter = -1;
         public boolean isIp65504P109ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P109ReservdLCounter != sharedCounter;
            localIp65504P109ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_109_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P109ReservdL
	 */
	protected void serializeIp65504P109ReservdL(short ip65504P109ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P109ReservdL,IP_65504_P_109_RESERVD_L_LEN)
                  ,beginIp65504P109ReservdL
                  ,IP_65504_P_109_RESERVD_L_LEN
                 );
            localIp65504P109ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P109ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P109ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P109ReservdL() {	 
			return (getShort(beginIp65504P109ReservdL));
   	}
         int localIp65504P110TranIdSCounter = -1;
         public boolean isIp65504P110TranIdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P110TranIdSCounter != sharedCounter;
            localIp65504P110TranIdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_110_TRAN_ID_S_LEN = 2;
  	/**
	 * serializeIp65504P110TranIdS
	 */
	protected void serializeIp65504P110TranIdS(short ip65504P110TranIdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P110TranIdS,IP_65504_P_110_TRAN_ID_S_LEN)
                  ,beginIp65504P110TranIdS
                  ,IP_65504_P_110_TRAN_ID_S_LEN
                 );
            localIp65504P110TranIdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P110TranIdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P110TranIdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P110TranIdS() {	 
			return (getShort(beginIp65504P110TranIdS));
   	}
         int localIp65504P110TranIdLCounter = -1;
         public boolean isIp65504P110TranIdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P110TranIdLCounter != sharedCounter;
            localIp65504P110TranIdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_110_TRAN_ID_L_LEN = 2;
  	/**
	 * serializeIp65504P110TranIdL
	 */
	protected void serializeIp65504P110TranIdL(short ip65504P110TranIdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P110TranIdL,IP_65504_P_110_TRAN_ID_L_LEN)
                  ,beginIp65504P110TranIdL
                  ,IP_65504_P_110_TRAN_ID_L_LEN
                 );
            localIp65504P110TranIdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P110TranIdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P110TranIdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P110TranIdL() {	 
			return (getShort(beginIp65504P110TranIdL));
   	}
         int localIp65504P111ReservdSCounter = -1;
         public boolean isIp65504P111ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P111ReservdSCounter != sharedCounter;
            localIp65504P111ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_111_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P111ReservdS
	 */
	protected void serializeIp65504P111ReservdS(short ip65504P111ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P111ReservdS,IP_65504_P_111_RESERVD_S_LEN)
                  ,beginIp65504P111ReservdS
                  ,IP_65504_P_111_RESERVD_S_LEN
                 );
            localIp65504P111ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P111ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P111ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P111ReservdS() {	 
			return (getShort(beginIp65504P111ReservdS));
   	}
         int localIp65504P111ReservdLCounter = -1;
         public boolean isIp65504P111ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P111ReservdLCounter != sharedCounter;
            localIp65504P111ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_111_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P111ReservdL
	 */
	protected void serializeIp65504P111ReservdL(short ip65504P111ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P111ReservdL,IP_65504_P_111_RESERVD_L_LEN)
                  ,beginIp65504P111ReservdL
                  ,IP_65504_P_111_RESERVD_L_LEN
                 );
            localIp65504P111ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P111ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P111ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P111ReservdL() {	 
			return (getShort(beginIp65504P111ReservdL));
   	}
         int localIp65504P112ReservdSCounter = -1;
         public boolean isIp65504P112ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P112ReservdSCounter != sharedCounter;
            localIp65504P112ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_112_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P112ReservdS
	 */
	protected void serializeIp65504P112ReservdS(short ip65504P112ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P112ReservdS,IP_65504_P_112_RESERVD_S_LEN)
                  ,beginIp65504P112ReservdS
                  ,IP_65504_P_112_RESERVD_S_LEN
                 );
            localIp65504P112ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P112ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P112ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P112ReservdS() {	 
			return (getShort(beginIp65504P112ReservdS));
   	}
         int localIp65504P112ReservdLCounter = -1;
         public boolean isIp65504P112ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P112ReservdLCounter != sharedCounter;
            localIp65504P112ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_112_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P112ReservdL
	 */
	protected void serializeIp65504P112ReservdL(short ip65504P112ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P112ReservdL,IP_65504_P_112_RESERVD_L_LEN)
                  ,beginIp65504P112ReservdL
                  ,IP_65504_P_112_RESERVD_L_LEN
                 );
            localIp65504P112ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P112ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P112ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P112ReservdL() {	 
			return (getShort(beginIp65504P112ReservdL));
   	}
         int localIp65504P113ReservdSCounter = -1;
         public boolean isIp65504P113ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P113ReservdSCounter != sharedCounter;
            localIp65504P113ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_113_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P113ReservdS
	 */
	protected void serializeIp65504P113ReservdS(short ip65504P113ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P113ReservdS,IP_65504_P_113_RESERVD_S_LEN)
                  ,beginIp65504P113ReservdS
                  ,IP_65504_P_113_RESERVD_S_LEN
                 );
            localIp65504P113ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P113ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P113ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P113ReservdS() {	 
			return (getShort(beginIp65504P113ReservdS));
   	}
         int localIp65504P113ReservdLCounter = -1;
         public boolean isIp65504P113ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P113ReservdLCounter != sharedCounter;
            localIp65504P113ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_113_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P113ReservdL
	 */
	protected void serializeIp65504P113ReservdL(short ip65504P113ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P113ReservdL,IP_65504_P_113_RESERVD_L_LEN)
                  ,beginIp65504P113ReservdL
                  ,IP_65504_P_113_RESERVD_L_LEN
                 );
            localIp65504P113ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P113ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P113ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P113ReservdL() {	 
			return (getShort(beginIp65504P113ReservdL));
   	}
         int localIp65504P114ReservdSCounter = -1;
         public boolean isIp65504P114ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P114ReservdSCounter != sharedCounter;
            localIp65504P114ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_114_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P114ReservdS
	 */
	protected void serializeIp65504P114ReservdS(short ip65504P114ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P114ReservdS,IP_65504_P_114_RESERVD_S_LEN)
                  ,beginIp65504P114ReservdS
                  ,IP_65504_P_114_RESERVD_S_LEN
                 );
            localIp65504P114ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P114ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P114ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P114ReservdS() {	 
			return (getShort(beginIp65504P114ReservdS));
   	}
         int localIp65504P114ReservdLCounter = -1;
         public boolean isIp65504P114ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P114ReservdLCounter != sharedCounter;
            localIp65504P114ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_114_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P114ReservdL
	 */
	protected void serializeIp65504P114ReservdL(short ip65504P114ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P114ReservdL,IP_65504_P_114_RESERVD_L_LEN)
                  ,beginIp65504P114ReservdL
                  ,IP_65504_P_114_RESERVD_L_LEN
                 );
            localIp65504P114ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P114ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P114ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P114ReservdL() {	 
			return (getShort(beginIp65504P114ReservdL));
   	}
         int localIp65504P115ReservdSCounter = -1;
         public boolean isIp65504P115ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P115ReservdSCounter != sharedCounter;
            localIp65504P115ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_115_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P115ReservdS
	 */
	protected void serializeIp65504P115ReservdS(short ip65504P115ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P115ReservdS,IP_65504_P_115_RESERVD_S_LEN)
                  ,beginIp65504P115ReservdS
                  ,IP_65504_P_115_RESERVD_S_LEN
                 );
            localIp65504P115ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P115ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P115ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P115ReservdS() {	 
			return (getShort(beginIp65504P115ReservdS));
   	}
         int localIp65504P115ReservdLCounter = -1;
         public boolean isIp65504P115ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P115ReservdLCounter != sharedCounter;
            localIp65504P115ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_115_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P115ReservdL
	 */
	protected void serializeIp65504P115ReservdL(short ip65504P115ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P115ReservdL,IP_65504_P_115_RESERVD_L_LEN)
                  ,beginIp65504P115ReservdL
                  ,IP_65504_P_115_RESERVD_L_LEN
                 );
            localIp65504P115ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P115ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P115ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P115ReservdL() {	 
			return (getShort(beginIp65504P115ReservdL));
   	}
         int localIp65504P116ReservdSCounter = -1;
         public boolean isIp65504P116ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P116ReservdSCounter != sharedCounter;
            localIp65504P116ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_116_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P116ReservdS
	 */
	protected void serializeIp65504P116ReservdS(short ip65504P116ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P116ReservdS,IP_65504_P_116_RESERVD_S_LEN)
                  ,beginIp65504P116ReservdS
                  ,IP_65504_P_116_RESERVD_S_LEN
                 );
            localIp65504P116ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P116ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P116ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P116ReservdS() {	 
			return (getShort(beginIp65504P116ReservdS));
   	}
         int localIp65504P116ReservdLCounter = -1;
         public boolean isIp65504P116ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P116ReservdLCounter != sharedCounter;
            localIp65504P116ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_116_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P116ReservdL
	 */
	protected void serializeIp65504P116ReservdL(short ip65504P116ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P116ReservdL,IP_65504_P_116_RESERVD_L_LEN)
                  ,beginIp65504P116ReservdL
                  ,IP_65504_P_116_RESERVD_L_LEN
                 );
            localIp65504P116ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P116ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P116ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P116ReservdL() {	 
			return (getShort(beginIp65504P116ReservdL));
   	}
         int localIp65504P117ReservdSCounter = -1;
         public boolean isIp65504P117ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P117ReservdSCounter != sharedCounter;
            localIp65504P117ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_117_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P117ReservdS
	 */
	protected void serializeIp65504P117ReservdS(short ip65504P117ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P117ReservdS,IP_65504_P_117_RESERVD_S_LEN)
                  ,beginIp65504P117ReservdS
                  ,IP_65504_P_117_RESERVD_S_LEN
                 );
            localIp65504P117ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P117ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P117ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P117ReservdS() {	 
			return (getShort(beginIp65504P117ReservdS));
   	}
         int localIp65504P117ReservdLCounter = -1;
         public boolean isIp65504P117ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P117ReservdLCounter != sharedCounter;
            localIp65504P117ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_117_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P117ReservdL
	 */
	protected void serializeIp65504P117ReservdL(short ip65504P117ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P117ReservdL,IP_65504_P_117_RESERVD_L_LEN)
                  ,beginIp65504P117ReservdL
                  ,IP_65504_P_117_RESERVD_L_LEN
                 );
            localIp65504P117ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P117ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P117ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P117ReservdL() {	 
			return (getShort(beginIp65504P117ReservdL));
   	}
         int localIp65504P118ReservdSCounter = -1;
         public boolean isIp65504P118ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P118ReservdSCounter != sharedCounter;
            localIp65504P118ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_118_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P118ReservdS
	 */
	protected void serializeIp65504P118ReservdS(short ip65504P118ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P118ReservdS,IP_65504_P_118_RESERVD_S_LEN)
                  ,beginIp65504P118ReservdS
                  ,IP_65504_P_118_RESERVD_S_LEN
                 );
            localIp65504P118ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P118ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P118ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P118ReservdS() {	 
			return (getShort(beginIp65504P118ReservdS));
   	}
         int localIp65504P118ReservdLCounter = -1;
         public boolean isIp65504P118ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P118ReservdLCounter != sharedCounter;
            localIp65504P118ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_118_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P118ReservdL
	 */
	protected void serializeIp65504P118ReservdL(short ip65504P118ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P118ReservdL,IP_65504_P_118_RESERVD_L_LEN)
                  ,beginIp65504P118ReservdL
                  ,IP_65504_P_118_RESERVD_L_LEN
                 );
            localIp65504P118ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P118ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P118ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P118ReservdL() {	 
			return (getShort(beginIp65504P118ReservdL));
   	}
         int localIp65504P119ReservdSCounter = -1;
         public boolean isIp65504P119ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P119ReservdSCounter != sharedCounter;
            localIp65504P119ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_119_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P119ReservdS
	 */
	protected void serializeIp65504P119ReservdS(short ip65504P119ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P119ReservdS,IP_65504_P_119_RESERVD_S_LEN)
                  ,beginIp65504P119ReservdS
                  ,IP_65504_P_119_RESERVD_S_LEN
                 );
            localIp65504P119ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P119ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P119ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P119ReservdS() {	 
			return (getShort(beginIp65504P119ReservdS));
   	}
         int localIp65504P119ReservdLCounter = -1;
         public boolean isIp65504P119ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P119ReservdLCounter != sharedCounter;
            localIp65504P119ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_119_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P119ReservdL
	 */
	protected void serializeIp65504P119ReservdL(short ip65504P119ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P119ReservdL,IP_65504_P_119_RESERVD_L_LEN)
                  ,beginIp65504P119ReservdL
                  ,IP_65504_P_119_RESERVD_L_LEN
                 );
            localIp65504P119ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P119ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P119ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P119ReservdL() {	 
			return (getShort(beginIp65504P119ReservdL));
   	}
         int localIp65504P120ReservdSCounter = -1;
         public boolean isIp65504P120ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P120ReservdSCounter != sharedCounter;
            localIp65504P120ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_120_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P120ReservdS
	 */
	protected void serializeIp65504P120ReservdS(short ip65504P120ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P120ReservdS,IP_65504_P_120_RESERVD_S_LEN)
                  ,beginIp65504P120ReservdS
                  ,IP_65504_P_120_RESERVD_S_LEN
                 );
            localIp65504P120ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P120ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P120ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P120ReservdS() {	 
			return (getShort(beginIp65504P120ReservdS));
   	}
         int localIp65504P120ReservdLCounter = -1;
         public boolean isIp65504P120ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P120ReservdLCounter != sharedCounter;
            localIp65504P120ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_120_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P120ReservdL
	 */
	protected void serializeIp65504P120ReservdL(short ip65504P120ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P120ReservdL,IP_65504_P_120_RESERVD_L_LEN)
                  ,beginIp65504P120ReservdL
                  ,IP_65504_P_120_RESERVD_L_LEN
                 );
            localIp65504P120ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P120ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P120ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P120ReservdL() {	 
			return (getShort(beginIp65504P120ReservdL));
   	}
         int localIp65504P121ReservdSCounter = -1;
         public boolean isIp65504P121ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P121ReservdSCounter != sharedCounter;
            localIp65504P121ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_121_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P121ReservdS
	 */
	protected void serializeIp65504P121ReservdS(short ip65504P121ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P121ReservdS,IP_65504_P_121_RESERVD_S_LEN)
                  ,beginIp65504P121ReservdS
                  ,IP_65504_P_121_RESERVD_S_LEN
                 );
            localIp65504P121ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P121ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P121ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P121ReservdS() {	 
			return (getShort(beginIp65504P121ReservdS));
   	}
         int localIp65504P121ReservdLCounter = -1;
         public boolean isIp65504P121ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P121ReservdLCounter != sharedCounter;
            localIp65504P121ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_121_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P121ReservdL
	 */
	protected void serializeIp65504P121ReservdL(short ip65504P121ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P121ReservdL,IP_65504_P_121_RESERVD_L_LEN)
                  ,beginIp65504P121ReservdL
                  ,IP_65504_P_121_RESERVD_L_LEN
                 );
            localIp65504P121ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P121ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P121ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P121ReservdL() {	 
			return (getShort(beginIp65504P121ReservdL));
   	}
         int localIp65504P122ProcMdSCounter = -1;
         public boolean isIp65504P122ProcMdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P122ProcMdSCounter != sharedCounter;
            localIp65504P122ProcMdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_122_PROC_MD_S_LEN = 2;
  	/**
	 * serializeIp65504P122ProcMdS
	 */
	protected void serializeIp65504P122ProcMdS(short ip65504P122ProcMdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P122ProcMdS,IP_65504_P_122_PROC_MD_S_LEN)
                  ,beginIp65504P122ProcMdS
                  ,IP_65504_P_122_PROC_MD_S_LEN
                 );
            localIp65504P122ProcMdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P122ProcMdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P122ProcMdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P122ProcMdS() {	 
			return (getShort(beginIp65504P122ProcMdS));
   	}
         int localIp65504P122ProcMdLCounter = -1;
         public boolean isIp65504P122ProcMdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P122ProcMdLCounter != sharedCounter;
            localIp65504P122ProcMdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_122_PROC_MD_L_LEN = 2;
  	/**
	 * serializeIp65504P122ProcMdL
	 */
	protected void serializeIp65504P122ProcMdL(short ip65504P122ProcMdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P122ProcMdL,IP_65504_P_122_PROC_MD_L_LEN)
                  ,beginIp65504P122ProcMdL
                  ,IP_65504_P_122_PROC_MD_L_LEN
                 );
            localIp65504P122ProcMdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P122ProcMdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P122ProcMdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P122ProcMdL() {	 
			return (getShort(beginIp65504P122ProcMdL));
   	}
         int localIp65504P123ReservdSCounter = -1;
         public boolean isIp65504P123ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P123ReservdSCounter != sharedCounter;
            localIp65504P123ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_123_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P123ReservdS
	 */
	protected void serializeIp65504P123ReservdS(short ip65504P123ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P123ReservdS,IP_65504_P_123_RESERVD_S_LEN)
                  ,beginIp65504P123ReservdS
                  ,IP_65504_P_123_RESERVD_S_LEN
                 );
            localIp65504P123ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P123ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P123ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P123ReservdS() {	 
			return (getShort(beginIp65504P123ReservdS));
   	}
         int localIp65504P123ReservdLCounter = -1;
         public boolean isIp65504P123ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P123ReservdLCounter != sharedCounter;
            localIp65504P123ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_123_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P123ReservdL
	 */
	protected void serializeIp65504P123ReservdL(short ip65504P123ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P123ReservdL,IP_65504_P_123_RESERVD_L_LEN)
                  ,beginIp65504P123ReservdL
                  ,IP_65504_P_123_RESERVD_L_LEN
                 );
            localIp65504P123ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P123ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P123ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P123ReservdL() {	 
			return (getShort(beginIp65504P123ReservdL));
   	}
         int localIp65504P124ReservdSCounter = -1;
         public boolean isIp65504P124ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P124ReservdSCounter != sharedCounter;
            localIp65504P124ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_124_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P124ReservdS
	 */
	protected void serializeIp65504P124ReservdS(short ip65504P124ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P124ReservdS,IP_65504_P_124_RESERVD_S_LEN)
                  ,beginIp65504P124ReservdS
                  ,IP_65504_P_124_RESERVD_S_LEN
                 );
            localIp65504P124ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P124ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P124ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P124ReservdS() {	 
			return (getShort(beginIp65504P124ReservdS));
   	}
         int localIp65504P124ReservdLCounter = -1;
         public boolean isIp65504P124ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P124ReservdLCounter != sharedCounter;
            localIp65504P124ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_124_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P124ReservdL
	 */
	protected void serializeIp65504P124ReservdL(short ip65504P124ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P124ReservdL,IP_65504_P_124_RESERVD_L_LEN)
                  ,beginIp65504P124ReservdL
                  ,IP_65504_P_124_RESERVD_L_LEN
                 );
            localIp65504P124ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P124ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P124ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P124ReservdL() {	 
			return (getShort(beginIp65504P124ReservdL));
   	}




}
  
