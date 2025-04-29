package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip65504PdsNamesLargeGroup21Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:26. using version 5.0.0.257
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip65504PdsNamesLargeGroup21Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip65504PdsNamesLargeGroup21Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_65504_PDS_NAMES_LARGE_GROUP_21_LENGTH = 248;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp65504P621PurTimS;
            protected  int beginIp65504P621PurTimL;
            protected  int beginIp65504P622MtrSvcS;
            protected  int beginIp65504P622MtrSvcL;
            protected  int beginIp65504P623MtrfuelS;
            protected  int beginIp65504P623MtrfuelL;
            protected  int beginIp65504P624ReservdS;
            protected  int beginIp65504P624ReservdL;
            protected  int beginIp65504P625ReservdS;
            protected  int beginIp65504P625ReservdL;
            protected  int beginIp65504P626ReservdS;
            protected  int beginIp65504P626ReservdL;
            protected  int beginIp65504P627ReservdS;
            protected  int beginIp65504P627ReservdL;
            protected  int beginIp65504P628ReservdS;
            protected  int beginIp65504P628ReservdL;
            protected  int beginIp65504P629OdometrS;
            protected  int beginIp65504P629OdometrL;
            protected  int beginIp65504P630VehNbrS;
            protected  int beginIp65504P630VehNbrL;
            protected  int beginIp65504P631DrvrNoS;
            protected  int beginIp65504P631DrvrNoL;
            protected  int beginIp65504P632ProdCdS;
            protected  int beginIp65504P632ProdCdL;
            protected  int beginIp65504P633CoupamtS;
            protected  int beginIp65504P633CoupamtL;
            protected  int beginIp65504P634Taxamt1S;
            protected  int beginIp65504P634Taxamt1L;
            protected  int beginIp65504P635Taxamt2S;
            protected  int beginIp65504P635Taxamt2L;
            protected  int beginIp65504P636ReservdS;
            protected  int beginIp65504P636ReservdL;
            protected  int beginIp65504P637ReservdS;
            protected  int beginIp65504P637ReservdL;
            protected  int beginIp65504P638ReservdS;
            protected  int beginIp65504P638ReservdL;
            protected  int beginIp65504P639ReservdS;
            protected  int beginIp65504P639ReservdL;
            protected  int beginIp65504P640ReservdS;
            protected  int beginIp65504P640ReservdL;
            protected  int beginIp65504P641ProdCdS;
            protected  int beginIp65504P641ProdCdL;
            protected  int beginIp65504P642ItmDesS;
            protected  int beginIp65504P642ItmDesL;
            protected  int beginIp65504P643ItmQtyS;
            protected  int beginIp65504P643ItmQtyL;
            protected  int beginIp65504P644ReservdS;
            protected  int beginIp65504P644ReservdL;
            protected  int beginIp65504P645ItmUomS;
            protected  int beginIp65504P645ItmUomL;
            protected  int beginIp65504P646UnitprcS;
            protected  int beginIp65504P646UnitprcL;
            protected  int beginIp65504P647ExtAmtS;
            protected  int beginIp65504P647ExtAmtL;
            protected  int beginIp65504P648ItmdsctS;
            protected  int beginIp65504P648ItmdsctL;
            protected  int beginIp65504P649ReservdS;
            protected  int beginIp65504P649ReservdL;
            protected  int beginIp65504P650NetGrsS;
            protected  int beginIp65504P650NetGrsL;
            protected  int beginIp65504P651TaxRteS;
            protected  int beginIp65504P651TaxRteL;
	
	/**
	* Constructor for Ip65504PdsNamesLargeGroup21Serialized
	**/
    public Ip65504PdsNamesLargeGroup21Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ip65504PdsNamesLargeGroup21Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip65504PdsNamesLargeGroup21Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ip65504PdsNamesLargeGroup21Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,4956); // serialize this field at offset 4956 by default 
    }
    
	/**
	* sets parent for this Ip65504PdsNamesLargeGroup21Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 4956 by default
    }    
	/**
	* initializes the field in Ip65504PdsNamesLargeGroup21Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_65504_PDS_NAMES_LARGE_GROUP_21_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp65504P621PurTimS = getStartOffset() + 4;	// set offset for serialization
  
             beginIp65504P621PurTimL = getStartOffset() + 6;	// set offset for serialization
  
  
             beginIp65504P622MtrSvcS = getStartOffset() + 12;	// set offset for serialization
  
             beginIp65504P622MtrSvcL = getStartOffset() + 14;	// set offset for serialization
  
  
             beginIp65504P623MtrfuelS = getStartOffset() + 20;	// set offset for serialization
  
             beginIp65504P623MtrfuelL = getStartOffset() + 22;	// set offset for serialization
  
  
             beginIp65504P624ReservdS = getStartOffset() + 28;	// set offset for serialization
  
             beginIp65504P624ReservdL = getStartOffset() + 30;	// set offset for serialization
  
  
             beginIp65504P625ReservdS = getStartOffset() + 36;	// set offset for serialization
  
             beginIp65504P625ReservdL = getStartOffset() + 38;	// set offset for serialization
  
  
             beginIp65504P626ReservdS = getStartOffset() + 44;	// set offset for serialization
  
             beginIp65504P626ReservdL = getStartOffset() + 46;	// set offset for serialization
  
  
             beginIp65504P627ReservdS = getStartOffset() + 52;	// set offset for serialization
  
             beginIp65504P627ReservdL = getStartOffset() + 54;	// set offset for serialization
  
  
             beginIp65504P628ReservdS = getStartOffset() + 60;	// set offset for serialization
  
             beginIp65504P628ReservdL = getStartOffset() + 62;	// set offset for serialization
  
  
             beginIp65504P629OdometrS = getStartOffset() + 68;	// set offset for serialization
  
             beginIp65504P629OdometrL = getStartOffset() + 70;	// set offset for serialization
  
  
             beginIp65504P630VehNbrS = getStartOffset() + 76;	// set offset for serialization
  
             beginIp65504P630VehNbrL = getStartOffset() + 78;	// set offset for serialization
  
  
             beginIp65504P631DrvrNoS = getStartOffset() + 84;	// set offset for serialization
  
             beginIp65504P631DrvrNoL = getStartOffset() + 86;	// set offset for serialization
  
  
             beginIp65504P632ProdCdS = getStartOffset() + 92;	// set offset for serialization
  
             beginIp65504P632ProdCdL = getStartOffset() + 94;	// set offset for serialization
  
  
             beginIp65504P633CoupamtS = getStartOffset() + 100;	// set offset for serialization
  
             beginIp65504P633CoupamtL = getStartOffset() + 102;	// set offset for serialization
  
  
             beginIp65504P634Taxamt1S = getStartOffset() + 108;	// set offset for serialization
  
             beginIp65504P634Taxamt1L = getStartOffset() + 110;	// set offset for serialization
  
  
             beginIp65504P635Taxamt2S = getStartOffset() + 116;	// set offset for serialization
  
             beginIp65504P635Taxamt2L = getStartOffset() + 118;	// set offset for serialization
  
  
             beginIp65504P636ReservdS = getStartOffset() + 124;	// set offset for serialization
  
             beginIp65504P636ReservdL = getStartOffset() + 126;	// set offset for serialization
  
  
             beginIp65504P637ReservdS = getStartOffset() + 132;	// set offset for serialization
  
             beginIp65504P637ReservdL = getStartOffset() + 134;	// set offset for serialization
  
  
             beginIp65504P638ReservdS = getStartOffset() + 140;	// set offset for serialization
  
             beginIp65504P638ReservdL = getStartOffset() + 142;	// set offset for serialization
  
  
             beginIp65504P639ReservdS = getStartOffset() + 148;	// set offset for serialization
  
             beginIp65504P639ReservdL = getStartOffset() + 150;	// set offset for serialization
  
  
             beginIp65504P640ReservdS = getStartOffset() + 156;	// set offset for serialization
  
             beginIp65504P640ReservdL = getStartOffset() + 158;	// set offset for serialization
  
  
             beginIp65504P641ProdCdS = getStartOffset() + 164;	// set offset for serialization
  
             beginIp65504P641ProdCdL = getStartOffset() + 166;	// set offset for serialization
  
  
             beginIp65504P642ItmDesS = getStartOffset() + 172;	// set offset for serialization
  
             beginIp65504P642ItmDesL = getStartOffset() + 174;	// set offset for serialization
  
  
             beginIp65504P643ItmQtyS = getStartOffset() + 180;	// set offset for serialization
  
             beginIp65504P643ItmQtyL = getStartOffset() + 182;	// set offset for serialization
  
  
             beginIp65504P644ReservdS = getStartOffset() + 188;	// set offset for serialization
  
             beginIp65504P644ReservdL = getStartOffset() + 190;	// set offset for serialization
  
  
             beginIp65504P645ItmUomS = getStartOffset() + 196;	// set offset for serialization
  
             beginIp65504P645ItmUomL = getStartOffset() + 198;	// set offset for serialization
  
  
             beginIp65504P646UnitprcS = getStartOffset() + 204;	// set offset for serialization
  
             beginIp65504P646UnitprcL = getStartOffset() + 206;	// set offset for serialization
  
  
             beginIp65504P647ExtAmtS = getStartOffset() + 212;	// set offset for serialization
  
             beginIp65504P647ExtAmtL = getStartOffset() + 214;	// set offset for serialization
  
  
             beginIp65504P648ItmdsctS = getStartOffset() + 220;	// set offset for serialization
  
             beginIp65504P648ItmdsctL = getStartOffset() + 222;	// set offset for serialization
  
  
             beginIp65504P649ReservdS = getStartOffset() + 228;	// set offset for serialization
  
             beginIp65504P649ReservdL = getStartOffset() + 230;	// set offset for serialization
  
  
             beginIp65504P650NetGrsS = getStartOffset() + 236;	// set offset for serialization
  
             beginIp65504P650NetGrsL = getStartOffset() + 238;	// set offset for serialization
  
  
             beginIp65504P651TaxRteS = getStartOffset() + 244;	// set offset for serialization
  
             beginIp65504P651TaxRteL = getStartOffset() + 246;	// set offset for serialization
  
  
	   /*  end of offset */
	}
         int localIp65504P621PurTimSCounter = -1;
         public boolean isIp65504P621PurTimSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P621PurTimSCounter != sharedCounter;
            localIp65504P621PurTimSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_621_PUR_TIM_S_LEN = 2;
  	/**
	 * serializeIp65504P621PurTimS
	 */
	protected void serializeIp65504P621PurTimS(short ip65504P621PurTimS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P621PurTimS,IP_65504_P_621_PUR_TIM_S_LEN)
                  ,beginIp65504P621PurTimS
                  ,IP_65504_P_621_PUR_TIM_S_LEN
                 );
            localIp65504P621PurTimSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P621PurTimSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P621PurTimS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P621PurTimS() {	 
			return (getShort(beginIp65504P621PurTimS));
   	}
         int localIp65504P621PurTimLCounter = -1;
         public boolean isIp65504P621PurTimLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P621PurTimLCounter != sharedCounter;
            localIp65504P621PurTimLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_621_PUR_TIM_L_LEN = 2;
  	/**
	 * serializeIp65504P621PurTimL
	 */
	protected void serializeIp65504P621PurTimL(short ip65504P621PurTimL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P621PurTimL,IP_65504_P_621_PUR_TIM_L_LEN)
                  ,beginIp65504P621PurTimL
                  ,IP_65504_P_621_PUR_TIM_L_LEN
                 );
            localIp65504P621PurTimLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P621PurTimLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P621PurTimL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P621PurTimL() {	 
			return (getShort(beginIp65504P621PurTimL));
   	}
         int localIp65504P622MtrSvcSCounter = -1;
         public boolean isIp65504P622MtrSvcSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P622MtrSvcSCounter != sharedCounter;
            localIp65504P622MtrSvcSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_622_MTR_SVC_S_LEN = 2;
  	/**
	 * serializeIp65504P622MtrSvcS
	 */
	protected void serializeIp65504P622MtrSvcS(short ip65504P622MtrSvcS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P622MtrSvcS,IP_65504_P_622_MTR_SVC_S_LEN)
                  ,beginIp65504P622MtrSvcS
                  ,IP_65504_P_622_MTR_SVC_S_LEN
                 );
            localIp65504P622MtrSvcSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P622MtrSvcSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P622MtrSvcS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P622MtrSvcS() {	 
			return (getShort(beginIp65504P622MtrSvcS));
   	}
         int localIp65504P622MtrSvcLCounter = -1;
         public boolean isIp65504P622MtrSvcLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P622MtrSvcLCounter != sharedCounter;
            localIp65504P622MtrSvcLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_622_MTR_SVC_L_LEN = 2;
  	/**
	 * serializeIp65504P622MtrSvcL
	 */
	protected void serializeIp65504P622MtrSvcL(short ip65504P622MtrSvcL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P622MtrSvcL,IP_65504_P_622_MTR_SVC_L_LEN)
                  ,beginIp65504P622MtrSvcL
                  ,IP_65504_P_622_MTR_SVC_L_LEN
                 );
            localIp65504P622MtrSvcLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P622MtrSvcLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P622MtrSvcL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P622MtrSvcL() {	 
			return (getShort(beginIp65504P622MtrSvcL));
   	}
         int localIp65504P623MtrfuelSCounter = -1;
         public boolean isIp65504P623MtrfuelSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P623MtrfuelSCounter != sharedCounter;
            localIp65504P623MtrfuelSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_623_MTRFUEL_S_LEN = 2;
  	/**
	 * serializeIp65504P623MtrfuelS
	 */
	protected void serializeIp65504P623MtrfuelS(short ip65504P623MtrfuelS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P623MtrfuelS,IP_65504_P_623_MTRFUEL_S_LEN)
                  ,beginIp65504P623MtrfuelS
                  ,IP_65504_P_623_MTRFUEL_S_LEN
                 );
            localIp65504P623MtrfuelSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P623MtrfuelSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P623MtrfuelS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P623MtrfuelS() {	 
			return (getShort(beginIp65504P623MtrfuelS));
   	}
         int localIp65504P623MtrfuelLCounter = -1;
         public boolean isIp65504P623MtrfuelLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P623MtrfuelLCounter != sharedCounter;
            localIp65504P623MtrfuelLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_623_MTRFUEL_L_LEN = 2;
  	/**
	 * serializeIp65504P623MtrfuelL
	 */
	protected void serializeIp65504P623MtrfuelL(short ip65504P623MtrfuelL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P623MtrfuelL,IP_65504_P_623_MTRFUEL_L_LEN)
                  ,beginIp65504P623MtrfuelL
                  ,IP_65504_P_623_MTRFUEL_L_LEN
                 );
            localIp65504P623MtrfuelLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P623MtrfuelLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P623MtrfuelL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P623MtrfuelL() {	 
			return (getShort(beginIp65504P623MtrfuelL));
   	}
         int localIp65504P624ReservdSCounter = -1;
         public boolean isIp65504P624ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P624ReservdSCounter != sharedCounter;
            localIp65504P624ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_624_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P624ReservdS
	 */
	protected void serializeIp65504P624ReservdS(short ip65504P624ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P624ReservdS,IP_65504_P_624_RESERVD_S_LEN)
                  ,beginIp65504P624ReservdS
                  ,IP_65504_P_624_RESERVD_S_LEN
                 );
            localIp65504P624ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P624ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P624ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P624ReservdS() {	 
			return (getShort(beginIp65504P624ReservdS));
   	}
         int localIp65504P624ReservdLCounter = -1;
         public boolean isIp65504P624ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P624ReservdLCounter != sharedCounter;
            localIp65504P624ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_624_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P624ReservdL
	 */
	protected void serializeIp65504P624ReservdL(short ip65504P624ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P624ReservdL,IP_65504_P_624_RESERVD_L_LEN)
                  ,beginIp65504P624ReservdL
                  ,IP_65504_P_624_RESERVD_L_LEN
                 );
            localIp65504P624ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P624ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P624ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P624ReservdL() {	 
			return (getShort(beginIp65504P624ReservdL));
   	}
         int localIp65504P625ReservdSCounter = -1;
         public boolean isIp65504P625ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P625ReservdSCounter != sharedCounter;
            localIp65504P625ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_625_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P625ReservdS
	 */
	protected void serializeIp65504P625ReservdS(short ip65504P625ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P625ReservdS,IP_65504_P_625_RESERVD_S_LEN)
                  ,beginIp65504P625ReservdS
                  ,IP_65504_P_625_RESERVD_S_LEN
                 );
            localIp65504P625ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P625ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P625ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P625ReservdS() {	 
			return (getShort(beginIp65504P625ReservdS));
   	}
         int localIp65504P625ReservdLCounter = -1;
         public boolean isIp65504P625ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P625ReservdLCounter != sharedCounter;
            localIp65504P625ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_625_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P625ReservdL
	 */
	protected void serializeIp65504P625ReservdL(short ip65504P625ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P625ReservdL,IP_65504_P_625_RESERVD_L_LEN)
                  ,beginIp65504P625ReservdL
                  ,IP_65504_P_625_RESERVD_L_LEN
                 );
            localIp65504P625ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P625ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P625ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P625ReservdL() {	 
			return (getShort(beginIp65504P625ReservdL));
   	}
         int localIp65504P626ReservdSCounter = -1;
         public boolean isIp65504P626ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P626ReservdSCounter != sharedCounter;
            localIp65504P626ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_626_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P626ReservdS
	 */
	protected void serializeIp65504P626ReservdS(short ip65504P626ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P626ReservdS,IP_65504_P_626_RESERVD_S_LEN)
                  ,beginIp65504P626ReservdS
                  ,IP_65504_P_626_RESERVD_S_LEN
                 );
            localIp65504P626ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P626ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P626ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P626ReservdS() {	 
			return (getShort(beginIp65504P626ReservdS));
   	}
         int localIp65504P626ReservdLCounter = -1;
         public boolean isIp65504P626ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P626ReservdLCounter != sharedCounter;
            localIp65504P626ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_626_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P626ReservdL
	 */
	protected void serializeIp65504P626ReservdL(short ip65504P626ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P626ReservdL,IP_65504_P_626_RESERVD_L_LEN)
                  ,beginIp65504P626ReservdL
                  ,IP_65504_P_626_RESERVD_L_LEN
                 );
            localIp65504P626ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P626ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P626ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P626ReservdL() {	 
			return (getShort(beginIp65504P626ReservdL));
   	}
         int localIp65504P627ReservdSCounter = -1;
         public boolean isIp65504P627ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P627ReservdSCounter != sharedCounter;
            localIp65504P627ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_627_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P627ReservdS
	 */
	protected void serializeIp65504P627ReservdS(short ip65504P627ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P627ReservdS,IP_65504_P_627_RESERVD_S_LEN)
                  ,beginIp65504P627ReservdS
                  ,IP_65504_P_627_RESERVD_S_LEN
                 );
            localIp65504P627ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P627ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P627ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P627ReservdS() {	 
			return (getShort(beginIp65504P627ReservdS));
   	}
         int localIp65504P627ReservdLCounter = -1;
         public boolean isIp65504P627ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P627ReservdLCounter != sharedCounter;
            localIp65504P627ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_627_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P627ReservdL
	 */
	protected void serializeIp65504P627ReservdL(short ip65504P627ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P627ReservdL,IP_65504_P_627_RESERVD_L_LEN)
                  ,beginIp65504P627ReservdL
                  ,IP_65504_P_627_RESERVD_L_LEN
                 );
            localIp65504P627ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P627ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P627ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P627ReservdL() {	 
			return (getShort(beginIp65504P627ReservdL));
   	}
         int localIp65504P628ReservdSCounter = -1;
         public boolean isIp65504P628ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P628ReservdSCounter != sharedCounter;
            localIp65504P628ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_628_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P628ReservdS
	 */
	protected void serializeIp65504P628ReservdS(short ip65504P628ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P628ReservdS,IP_65504_P_628_RESERVD_S_LEN)
                  ,beginIp65504P628ReservdS
                  ,IP_65504_P_628_RESERVD_S_LEN
                 );
            localIp65504P628ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P628ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P628ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P628ReservdS() {	 
			return (getShort(beginIp65504P628ReservdS));
   	}
         int localIp65504P628ReservdLCounter = -1;
         public boolean isIp65504P628ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P628ReservdLCounter != sharedCounter;
            localIp65504P628ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_628_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P628ReservdL
	 */
	protected void serializeIp65504P628ReservdL(short ip65504P628ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P628ReservdL,IP_65504_P_628_RESERVD_L_LEN)
                  ,beginIp65504P628ReservdL
                  ,IP_65504_P_628_RESERVD_L_LEN
                 );
            localIp65504P628ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P628ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P628ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P628ReservdL() {	 
			return (getShort(beginIp65504P628ReservdL));
   	}
         int localIp65504P629OdometrSCounter = -1;
         public boolean isIp65504P629OdometrSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P629OdometrSCounter != sharedCounter;
            localIp65504P629OdometrSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_629_ODOMETR_S_LEN = 2;
  	/**
	 * serializeIp65504P629OdometrS
	 */
	protected void serializeIp65504P629OdometrS(short ip65504P629OdometrS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P629OdometrS,IP_65504_P_629_ODOMETR_S_LEN)
                  ,beginIp65504P629OdometrS
                  ,IP_65504_P_629_ODOMETR_S_LEN
                 );
            localIp65504P629OdometrSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P629OdometrSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P629OdometrS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P629OdometrS() {	 
			return (getShort(beginIp65504P629OdometrS));
   	}
         int localIp65504P629OdometrLCounter = -1;
         public boolean isIp65504P629OdometrLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P629OdometrLCounter != sharedCounter;
            localIp65504P629OdometrLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_629_ODOMETR_L_LEN = 2;
  	/**
	 * serializeIp65504P629OdometrL
	 */
	protected void serializeIp65504P629OdometrL(short ip65504P629OdometrL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P629OdometrL,IP_65504_P_629_ODOMETR_L_LEN)
                  ,beginIp65504P629OdometrL
                  ,IP_65504_P_629_ODOMETR_L_LEN
                 );
            localIp65504P629OdometrLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P629OdometrLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P629OdometrL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P629OdometrL() {	 
			return (getShort(beginIp65504P629OdometrL));
   	}
         int localIp65504P630VehNbrSCounter = -1;
         public boolean isIp65504P630VehNbrSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P630VehNbrSCounter != sharedCounter;
            localIp65504P630VehNbrSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_630_VEH_NBR_S_LEN = 2;
  	/**
	 * serializeIp65504P630VehNbrS
	 */
	protected void serializeIp65504P630VehNbrS(short ip65504P630VehNbrS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P630VehNbrS,IP_65504_P_630_VEH_NBR_S_LEN)
                  ,beginIp65504P630VehNbrS
                  ,IP_65504_P_630_VEH_NBR_S_LEN
                 );
            localIp65504P630VehNbrSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P630VehNbrSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P630VehNbrS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P630VehNbrS() {	 
			return (getShort(beginIp65504P630VehNbrS));
   	}
         int localIp65504P630VehNbrLCounter = -1;
         public boolean isIp65504P630VehNbrLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P630VehNbrLCounter != sharedCounter;
            localIp65504P630VehNbrLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_630_VEH_NBR_L_LEN = 2;
  	/**
	 * serializeIp65504P630VehNbrL
	 */
	protected void serializeIp65504P630VehNbrL(short ip65504P630VehNbrL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P630VehNbrL,IP_65504_P_630_VEH_NBR_L_LEN)
                  ,beginIp65504P630VehNbrL
                  ,IP_65504_P_630_VEH_NBR_L_LEN
                 );
            localIp65504P630VehNbrLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P630VehNbrLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P630VehNbrL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P630VehNbrL() {	 
			return (getShort(beginIp65504P630VehNbrL));
   	}
         int localIp65504P631DrvrNoSCounter = -1;
         public boolean isIp65504P631DrvrNoSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P631DrvrNoSCounter != sharedCounter;
            localIp65504P631DrvrNoSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_631_DRVR_NO_S_LEN = 2;
  	/**
	 * serializeIp65504P631DrvrNoS
	 */
	protected void serializeIp65504P631DrvrNoS(short ip65504P631DrvrNoS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P631DrvrNoS,IP_65504_P_631_DRVR_NO_S_LEN)
                  ,beginIp65504P631DrvrNoS
                  ,IP_65504_P_631_DRVR_NO_S_LEN
                 );
            localIp65504P631DrvrNoSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P631DrvrNoSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P631DrvrNoS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P631DrvrNoS() {	 
			return (getShort(beginIp65504P631DrvrNoS));
   	}
         int localIp65504P631DrvrNoLCounter = -1;
         public boolean isIp65504P631DrvrNoLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P631DrvrNoLCounter != sharedCounter;
            localIp65504P631DrvrNoLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_631_DRVR_NO_L_LEN = 2;
  	/**
	 * serializeIp65504P631DrvrNoL
	 */
	protected void serializeIp65504P631DrvrNoL(short ip65504P631DrvrNoL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P631DrvrNoL,IP_65504_P_631_DRVR_NO_L_LEN)
                  ,beginIp65504P631DrvrNoL
                  ,IP_65504_P_631_DRVR_NO_L_LEN
                 );
            localIp65504P631DrvrNoLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P631DrvrNoLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P631DrvrNoL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P631DrvrNoL() {	 
			return (getShort(beginIp65504P631DrvrNoL));
   	}
         int localIp65504P632ProdCdSCounter = -1;
         public boolean isIp65504P632ProdCdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P632ProdCdSCounter != sharedCounter;
            localIp65504P632ProdCdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_632_PROD_CD_S_LEN = 2;
  	/**
	 * serializeIp65504P632ProdCdS
	 */
	protected void serializeIp65504P632ProdCdS(short ip65504P632ProdCdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P632ProdCdS,IP_65504_P_632_PROD_CD_S_LEN)
                  ,beginIp65504P632ProdCdS
                  ,IP_65504_P_632_PROD_CD_S_LEN
                 );
            localIp65504P632ProdCdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P632ProdCdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P632ProdCdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P632ProdCdS() {	 
			return (getShort(beginIp65504P632ProdCdS));
   	}
         int localIp65504P632ProdCdLCounter = -1;
         public boolean isIp65504P632ProdCdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P632ProdCdLCounter != sharedCounter;
            localIp65504P632ProdCdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_632_PROD_CD_L_LEN = 2;
  	/**
	 * serializeIp65504P632ProdCdL
	 */
	protected void serializeIp65504P632ProdCdL(short ip65504P632ProdCdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P632ProdCdL,IP_65504_P_632_PROD_CD_L_LEN)
                  ,beginIp65504P632ProdCdL
                  ,IP_65504_P_632_PROD_CD_L_LEN
                 );
            localIp65504P632ProdCdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P632ProdCdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P632ProdCdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P632ProdCdL() {	 
			return (getShort(beginIp65504P632ProdCdL));
   	}
         int localIp65504P633CoupamtSCounter = -1;
         public boolean isIp65504P633CoupamtSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P633CoupamtSCounter != sharedCounter;
            localIp65504P633CoupamtSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_633_COUPAMT_S_LEN = 2;
  	/**
	 * serializeIp65504P633CoupamtS
	 */
	protected void serializeIp65504P633CoupamtS(short ip65504P633CoupamtS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P633CoupamtS,IP_65504_P_633_COUPAMT_S_LEN)
                  ,beginIp65504P633CoupamtS
                  ,IP_65504_P_633_COUPAMT_S_LEN
                 );
            localIp65504P633CoupamtSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P633CoupamtSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P633CoupamtS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P633CoupamtS() {	 
			return (getShort(beginIp65504P633CoupamtS));
   	}
         int localIp65504P633CoupamtLCounter = -1;
         public boolean isIp65504P633CoupamtLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P633CoupamtLCounter != sharedCounter;
            localIp65504P633CoupamtLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_633_COUPAMT_L_LEN = 2;
  	/**
	 * serializeIp65504P633CoupamtL
	 */
	protected void serializeIp65504P633CoupamtL(short ip65504P633CoupamtL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P633CoupamtL,IP_65504_P_633_COUPAMT_L_LEN)
                  ,beginIp65504P633CoupamtL
                  ,IP_65504_P_633_COUPAMT_L_LEN
                 );
            localIp65504P633CoupamtLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P633CoupamtLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P633CoupamtL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P633CoupamtL() {	 
			return (getShort(beginIp65504P633CoupamtL));
   	}
         int localIp65504P634Taxamt1SCounter = -1;
         public boolean isIp65504P634Taxamt1SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P634Taxamt1SCounter != sharedCounter;
            localIp65504P634Taxamt1SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_634_TAXAMT_1_S_LEN = 2;
  	/**
	 * serializeIp65504P634Taxamt1S
	 */
	protected void serializeIp65504P634Taxamt1S(short ip65504P634Taxamt1S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P634Taxamt1S,IP_65504_P_634_TAXAMT_1_S_LEN)
                  ,beginIp65504P634Taxamt1S
                  ,IP_65504_P_634_TAXAMT_1_S_LEN
                 );
            localIp65504P634Taxamt1SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P634Taxamt1SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P634Taxamt1S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P634Taxamt1S() {	 
			return (getShort(beginIp65504P634Taxamt1S));
   	}
         int localIp65504P634Taxamt1LCounter = -1;
         public boolean isIp65504P634Taxamt1LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P634Taxamt1LCounter != sharedCounter;
            localIp65504P634Taxamt1LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_634_TAXAMT_1_L_LEN = 2;
  	/**
	 * serializeIp65504P634Taxamt1L
	 */
	protected void serializeIp65504P634Taxamt1L(short ip65504P634Taxamt1L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P634Taxamt1L,IP_65504_P_634_TAXAMT_1_L_LEN)
                  ,beginIp65504P634Taxamt1L
                  ,IP_65504_P_634_TAXAMT_1_L_LEN
                 );
            localIp65504P634Taxamt1LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P634Taxamt1LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P634Taxamt1L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P634Taxamt1L() {	 
			return (getShort(beginIp65504P634Taxamt1L));
   	}
         int localIp65504P635Taxamt2SCounter = -1;
         public boolean isIp65504P635Taxamt2SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P635Taxamt2SCounter != sharedCounter;
            localIp65504P635Taxamt2SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_635_TAXAMT_2_S_LEN = 2;
  	/**
	 * serializeIp65504P635Taxamt2S
	 */
	protected void serializeIp65504P635Taxamt2S(short ip65504P635Taxamt2S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P635Taxamt2S,IP_65504_P_635_TAXAMT_2_S_LEN)
                  ,beginIp65504P635Taxamt2S
                  ,IP_65504_P_635_TAXAMT_2_S_LEN
                 );
            localIp65504P635Taxamt2SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P635Taxamt2SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P635Taxamt2S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P635Taxamt2S() {	 
			return (getShort(beginIp65504P635Taxamt2S));
   	}
         int localIp65504P635Taxamt2LCounter = -1;
         public boolean isIp65504P635Taxamt2LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P635Taxamt2LCounter != sharedCounter;
            localIp65504P635Taxamt2LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_635_TAXAMT_2_L_LEN = 2;
  	/**
	 * serializeIp65504P635Taxamt2L
	 */
	protected void serializeIp65504P635Taxamt2L(short ip65504P635Taxamt2L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P635Taxamt2L,IP_65504_P_635_TAXAMT_2_L_LEN)
                  ,beginIp65504P635Taxamt2L
                  ,IP_65504_P_635_TAXAMT_2_L_LEN
                 );
            localIp65504P635Taxamt2LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P635Taxamt2LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P635Taxamt2L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P635Taxamt2L() {	 
			return (getShort(beginIp65504P635Taxamt2L));
   	}
         int localIp65504P636ReservdSCounter = -1;
         public boolean isIp65504P636ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P636ReservdSCounter != sharedCounter;
            localIp65504P636ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_636_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P636ReservdS
	 */
	protected void serializeIp65504P636ReservdS(short ip65504P636ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P636ReservdS,IP_65504_P_636_RESERVD_S_LEN)
                  ,beginIp65504P636ReservdS
                  ,IP_65504_P_636_RESERVD_S_LEN
                 );
            localIp65504P636ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P636ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P636ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P636ReservdS() {	 
			return (getShort(beginIp65504P636ReservdS));
   	}
         int localIp65504P636ReservdLCounter = -1;
         public boolean isIp65504P636ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P636ReservdLCounter != sharedCounter;
            localIp65504P636ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_636_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P636ReservdL
	 */
	protected void serializeIp65504P636ReservdL(short ip65504P636ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P636ReservdL,IP_65504_P_636_RESERVD_L_LEN)
                  ,beginIp65504P636ReservdL
                  ,IP_65504_P_636_RESERVD_L_LEN
                 );
            localIp65504P636ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P636ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P636ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P636ReservdL() {	 
			return (getShort(beginIp65504P636ReservdL));
   	}
         int localIp65504P637ReservdSCounter = -1;
         public boolean isIp65504P637ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P637ReservdSCounter != sharedCounter;
            localIp65504P637ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_637_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P637ReservdS
	 */
	protected void serializeIp65504P637ReservdS(short ip65504P637ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P637ReservdS,IP_65504_P_637_RESERVD_S_LEN)
                  ,beginIp65504P637ReservdS
                  ,IP_65504_P_637_RESERVD_S_LEN
                 );
            localIp65504P637ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P637ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P637ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P637ReservdS() {	 
			return (getShort(beginIp65504P637ReservdS));
   	}
         int localIp65504P637ReservdLCounter = -1;
         public boolean isIp65504P637ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P637ReservdLCounter != sharedCounter;
            localIp65504P637ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_637_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P637ReservdL
	 */
	protected void serializeIp65504P637ReservdL(short ip65504P637ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P637ReservdL,IP_65504_P_637_RESERVD_L_LEN)
                  ,beginIp65504P637ReservdL
                  ,IP_65504_P_637_RESERVD_L_LEN
                 );
            localIp65504P637ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P637ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P637ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P637ReservdL() {	 
			return (getShort(beginIp65504P637ReservdL));
   	}
         int localIp65504P638ReservdSCounter = -1;
         public boolean isIp65504P638ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P638ReservdSCounter != sharedCounter;
            localIp65504P638ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_638_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P638ReservdS
	 */
	protected void serializeIp65504P638ReservdS(short ip65504P638ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P638ReservdS,IP_65504_P_638_RESERVD_S_LEN)
                  ,beginIp65504P638ReservdS
                  ,IP_65504_P_638_RESERVD_S_LEN
                 );
            localIp65504P638ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P638ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P638ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P638ReservdS() {	 
			return (getShort(beginIp65504P638ReservdS));
   	}
         int localIp65504P638ReservdLCounter = -1;
         public boolean isIp65504P638ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P638ReservdLCounter != sharedCounter;
            localIp65504P638ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_638_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P638ReservdL
	 */
	protected void serializeIp65504P638ReservdL(short ip65504P638ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P638ReservdL,IP_65504_P_638_RESERVD_L_LEN)
                  ,beginIp65504P638ReservdL
                  ,IP_65504_P_638_RESERVD_L_LEN
                 );
            localIp65504P638ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P638ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P638ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P638ReservdL() {	 
			return (getShort(beginIp65504P638ReservdL));
   	}
         int localIp65504P639ReservdSCounter = -1;
         public boolean isIp65504P639ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P639ReservdSCounter != sharedCounter;
            localIp65504P639ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_639_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P639ReservdS
	 */
	protected void serializeIp65504P639ReservdS(short ip65504P639ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P639ReservdS,IP_65504_P_639_RESERVD_S_LEN)
                  ,beginIp65504P639ReservdS
                  ,IP_65504_P_639_RESERVD_S_LEN
                 );
            localIp65504P639ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P639ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P639ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P639ReservdS() {	 
			return (getShort(beginIp65504P639ReservdS));
   	}
         int localIp65504P639ReservdLCounter = -1;
         public boolean isIp65504P639ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P639ReservdLCounter != sharedCounter;
            localIp65504P639ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_639_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P639ReservdL
	 */
	protected void serializeIp65504P639ReservdL(short ip65504P639ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P639ReservdL,IP_65504_P_639_RESERVD_L_LEN)
                  ,beginIp65504P639ReservdL
                  ,IP_65504_P_639_RESERVD_L_LEN
                 );
            localIp65504P639ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P639ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P639ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P639ReservdL() {	 
			return (getShort(beginIp65504P639ReservdL));
   	}
         int localIp65504P640ReservdSCounter = -1;
         public boolean isIp65504P640ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P640ReservdSCounter != sharedCounter;
            localIp65504P640ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_640_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P640ReservdS
	 */
	protected void serializeIp65504P640ReservdS(short ip65504P640ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P640ReservdS,IP_65504_P_640_RESERVD_S_LEN)
                  ,beginIp65504P640ReservdS
                  ,IP_65504_P_640_RESERVD_S_LEN
                 );
            localIp65504P640ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P640ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P640ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P640ReservdS() {	 
			return (getShort(beginIp65504P640ReservdS));
   	}
         int localIp65504P640ReservdLCounter = -1;
         public boolean isIp65504P640ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P640ReservdLCounter != sharedCounter;
            localIp65504P640ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_640_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P640ReservdL
	 */
	protected void serializeIp65504P640ReservdL(short ip65504P640ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P640ReservdL,IP_65504_P_640_RESERVD_L_LEN)
                  ,beginIp65504P640ReservdL
                  ,IP_65504_P_640_RESERVD_L_LEN
                 );
            localIp65504P640ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P640ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P640ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P640ReservdL() {	 
			return (getShort(beginIp65504P640ReservdL));
   	}
         int localIp65504P641ProdCdSCounter = -1;
         public boolean isIp65504P641ProdCdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P641ProdCdSCounter != sharedCounter;
            localIp65504P641ProdCdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_641_PROD_CD_S_LEN = 2;
  	/**
	 * serializeIp65504P641ProdCdS
	 */
	protected void serializeIp65504P641ProdCdS(short ip65504P641ProdCdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P641ProdCdS,IP_65504_P_641_PROD_CD_S_LEN)
                  ,beginIp65504P641ProdCdS
                  ,IP_65504_P_641_PROD_CD_S_LEN
                 );
            localIp65504P641ProdCdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P641ProdCdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P641ProdCdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P641ProdCdS() {	 
			return (getShort(beginIp65504P641ProdCdS));
   	}
         int localIp65504P641ProdCdLCounter = -1;
         public boolean isIp65504P641ProdCdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P641ProdCdLCounter != sharedCounter;
            localIp65504P641ProdCdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_641_PROD_CD_L_LEN = 2;
  	/**
	 * serializeIp65504P641ProdCdL
	 */
	protected void serializeIp65504P641ProdCdL(short ip65504P641ProdCdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P641ProdCdL,IP_65504_P_641_PROD_CD_L_LEN)
                  ,beginIp65504P641ProdCdL
                  ,IP_65504_P_641_PROD_CD_L_LEN
                 );
            localIp65504P641ProdCdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P641ProdCdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P641ProdCdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P641ProdCdL() {	 
			return (getShort(beginIp65504P641ProdCdL));
   	}
         int localIp65504P642ItmDesSCounter = -1;
         public boolean isIp65504P642ItmDesSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P642ItmDesSCounter != sharedCounter;
            localIp65504P642ItmDesSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_642_ITM_DES_S_LEN = 2;
  	/**
	 * serializeIp65504P642ItmDesS
	 */
	protected void serializeIp65504P642ItmDesS(short ip65504P642ItmDesS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P642ItmDesS,IP_65504_P_642_ITM_DES_S_LEN)
                  ,beginIp65504P642ItmDesS
                  ,IP_65504_P_642_ITM_DES_S_LEN
                 );
            localIp65504P642ItmDesSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P642ItmDesSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P642ItmDesS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P642ItmDesS() {	 
			return (getShort(beginIp65504P642ItmDesS));
   	}
         int localIp65504P642ItmDesLCounter = -1;
         public boolean isIp65504P642ItmDesLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P642ItmDesLCounter != sharedCounter;
            localIp65504P642ItmDesLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_642_ITM_DES_L_LEN = 2;
  	/**
	 * serializeIp65504P642ItmDesL
	 */
	protected void serializeIp65504P642ItmDesL(short ip65504P642ItmDesL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P642ItmDesL,IP_65504_P_642_ITM_DES_L_LEN)
                  ,beginIp65504P642ItmDesL
                  ,IP_65504_P_642_ITM_DES_L_LEN
                 );
            localIp65504P642ItmDesLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P642ItmDesLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P642ItmDesL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P642ItmDesL() {	 
			return (getShort(beginIp65504P642ItmDesL));
   	}
         int localIp65504P643ItmQtySCounter = -1;
         public boolean isIp65504P643ItmQtySModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P643ItmQtySCounter != sharedCounter;
            localIp65504P643ItmQtySCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_643_ITM_QTY_S_LEN = 2;
  	/**
	 * serializeIp65504P643ItmQtyS
	 */
	protected void serializeIp65504P643ItmQtyS(short ip65504P643ItmQtyS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P643ItmQtyS,IP_65504_P_643_ITM_QTY_S_LEN)
                  ,beginIp65504P643ItmQtyS
                  ,IP_65504_P_643_ITM_QTY_S_LEN
                 );
            localIp65504P643ItmQtySCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P643ItmQtySMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P643ItmQtyS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P643ItmQtyS() {	 
			return (getShort(beginIp65504P643ItmQtyS));
   	}
         int localIp65504P643ItmQtyLCounter = -1;
         public boolean isIp65504P643ItmQtyLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P643ItmQtyLCounter != sharedCounter;
            localIp65504P643ItmQtyLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_643_ITM_QTY_L_LEN = 2;
  	/**
	 * serializeIp65504P643ItmQtyL
	 */
	protected void serializeIp65504P643ItmQtyL(short ip65504P643ItmQtyL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P643ItmQtyL,IP_65504_P_643_ITM_QTY_L_LEN)
                  ,beginIp65504P643ItmQtyL
                  ,IP_65504_P_643_ITM_QTY_L_LEN
                 );
            localIp65504P643ItmQtyLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P643ItmQtyLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P643ItmQtyL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P643ItmQtyL() {	 
			return (getShort(beginIp65504P643ItmQtyL));
   	}
         int localIp65504P644ReservdSCounter = -1;
         public boolean isIp65504P644ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P644ReservdSCounter != sharedCounter;
            localIp65504P644ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_644_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P644ReservdS
	 */
	protected void serializeIp65504P644ReservdS(short ip65504P644ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P644ReservdS,IP_65504_P_644_RESERVD_S_LEN)
                  ,beginIp65504P644ReservdS
                  ,IP_65504_P_644_RESERVD_S_LEN
                 );
            localIp65504P644ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P644ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P644ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P644ReservdS() {	 
			return (getShort(beginIp65504P644ReservdS));
   	}
         int localIp65504P644ReservdLCounter = -1;
         public boolean isIp65504P644ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P644ReservdLCounter != sharedCounter;
            localIp65504P644ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_644_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P644ReservdL
	 */
	protected void serializeIp65504P644ReservdL(short ip65504P644ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P644ReservdL,IP_65504_P_644_RESERVD_L_LEN)
                  ,beginIp65504P644ReservdL
                  ,IP_65504_P_644_RESERVD_L_LEN
                 );
            localIp65504P644ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P644ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P644ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P644ReservdL() {	 
			return (getShort(beginIp65504P644ReservdL));
   	}
         int localIp65504P645ItmUomSCounter = -1;
         public boolean isIp65504P645ItmUomSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P645ItmUomSCounter != sharedCounter;
            localIp65504P645ItmUomSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_645_ITM_UOM_S_LEN = 2;
  	/**
	 * serializeIp65504P645ItmUomS
	 */
	protected void serializeIp65504P645ItmUomS(short ip65504P645ItmUomS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P645ItmUomS,IP_65504_P_645_ITM_UOM_S_LEN)
                  ,beginIp65504P645ItmUomS
                  ,IP_65504_P_645_ITM_UOM_S_LEN
                 );
            localIp65504P645ItmUomSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P645ItmUomSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P645ItmUomS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P645ItmUomS() {	 
			return (getShort(beginIp65504P645ItmUomS));
   	}
         int localIp65504P645ItmUomLCounter = -1;
         public boolean isIp65504P645ItmUomLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P645ItmUomLCounter != sharedCounter;
            localIp65504P645ItmUomLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_645_ITM_UOM_L_LEN = 2;
  	/**
	 * serializeIp65504P645ItmUomL
	 */
	protected void serializeIp65504P645ItmUomL(short ip65504P645ItmUomL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P645ItmUomL,IP_65504_P_645_ITM_UOM_L_LEN)
                  ,beginIp65504P645ItmUomL
                  ,IP_65504_P_645_ITM_UOM_L_LEN
                 );
            localIp65504P645ItmUomLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P645ItmUomLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P645ItmUomL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P645ItmUomL() {	 
			return (getShort(beginIp65504P645ItmUomL));
   	}
         int localIp65504P646UnitprcSCounter = -1;
         public boolean isIp65504P646UnitprcSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P646UnitprcSCounter != sharedCounter;
            localIp65504P646UnitprcSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_646_UNITPRC_S_LEN = 2;
  	/**
	 * serializeIp65504P646UnitprcS
	 */
	protected void serializeIp65504P646UnitprcS(short ip65504P646UnitprcS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P646UnitprcS,IP_65504_P_646_UNITPRC_S_LEN)
                  ,beginIp65504P646UnitprcS
                  ,IP_65504_P_646_UNITPRC_S_LEN
                 );
            localIp65504P646UnitprcSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P646UnitprcSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P646UnitprcS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P646UnitprcS() {	 
			return (getShort(beginIp65504P646UnitprcS));
   	}
         int localIp65504P646UnitprcLCounter = -1;
         public boolean isIp65504P646UnitprcLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P646UnitprcLCounter != sharedCounter;
            localIp65504P646UnitprcLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_646_UNITPRC_L_LEN = 2;
  	/**
	 * serializeIp65504P646UnitprcL
	 */
	protected void serializeIp65504P646UnitprcL(short ip65504P646UnitprcL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P646UnitprcL,IP_65504_P_646_UNITPRC_L_LEN)
                  ,beginIp65504P646UnitprcL
                  ,IP_65504_P_646_UNITPRC_L_LEN
                 );
            localIp65504P646UnitprcLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P646UnitprcLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P646UnitprcL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P646UnitprcL() {	 
			return (getShort(beginIp65504P646UnitprcL));
   	}
         int localIp65504P647ExtAmtSCounter = -1;
         public boolean isIp65504P647ExtAmtSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P647ExtAmtSCounter != sharedCounter;
            localIp65504P647ExtAmtSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_647_EXT_AMT_S_LEN = 2;
  	/**
	 * serializeIp65504P647ExtAmtS
	 */
	protected void serializeIp65504P647ExtAmtS(short ip65504P647ExtAmtS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P647ExtAmtS,IP_65504_P_647_EXT_AMT_S_LEN)
                  ,beginIp65504P647ExtAmtS
                  ,IP_65504_P_647_EXT_AMT_S_LEN
                 );
            localIp65504P647ExtAmtSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P647ExtAmtSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P647ExtAmtS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P647ExtAmtS() {	 
			return (getShort(beginIp65504P647ExtAmtS));
   	}
         int localIp65504P647ExtAmtLCounter = -1;
         public boolean isIp65504P647ExtAmtLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P647ExtAmtLCounter != sharedCounter;
            localIp65504P647ExtAmtLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_647_EXT_AMT_L_LEN = 2;
  	/**
	 * serializeIp65504P647ExtAmtL
	 */
	protected void serializeIp65504P647ExtAmtL(short ip65504P647ExtAmtL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P647ExtAmtL,IP_65504_P_647_EXT_AMT_L_LEN)
                  ,beginIp65504P647ExtAmtL
                  ,IP_65504_P_647_EXT_AMT_L_LEN
                 );
            localIp65504P647ExtAmtLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P647ExtAmtLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P647ExtAmtL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P647ExtAmtL() {	 
			return (getShort(beginIp65504P647ExtAmtL));
   	}
         int localIp65504P648ItmdsctSCounter = -1;
         public boolean isIp65504P648ItmdsctSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P648ItmdsctSCounter != sharedCounter;
            localIp65504P648ItmdsctSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_648_ITMDSCT_S_LEN = 2;
  	/**
	 * serializeIp65504P648ItmdsctS
	 */
	protected void serializeIp65504P648ItmdsctS(short ip65504P648ItmdsctS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P648ItmdsctS,IP_65504_P_648_ITMDSCT_S_LEN)
                  ,beginIp65504P648ItmdsctS
                  ,IP_65504_P_648_ITMDSCT_S_LEN
                 );
            localIp65504P648ItmdsctSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P648ItmdsctSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P648ItmdsctS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P648ItmdsctS() {	 
			return (getShort(beginIp65504P648ItmdsctS));
   	}
         int localIp65504P648ItmdsctLCounter = -1;
         public boolean isIp65504P648ItmdsctLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P648ItmdsctLCounter != sharedCounter;
            localIp65504P648ItmdsctLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_648_ITMDSCT_L_LEN = 2;
  	/**
	 * serializeIp65504P648ItmdsctL
	 */
	protected void serializeIp65504P648ItmdsctL(short ip65504P648ItmdsctL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P648ItmdsctL,IP_65504_P_648_ITMDSCT_L_LEN)
                  ,beginIp65504P648ItmdsctL
                  ,IP_65504_P_648_ITMDSCT_L_LEN
                 );
            localIp65504P648ItmdsctLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P648ItmdsctLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P648ItmdsctL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P648ItmdsctL() {	 
			return (getShort(beginIp65504P648ItmdsctL));
   	}
         int localIp65504P649ReservdSCounter = -1;
         public boolean isIp65504P649ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P649ReservdSCounter != sharedCounter;
            localIp65504P649ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_649_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P649ReservdS
	 */
	protected void serializeIp65504P649ReservdS(short ip65504P649ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P649ReservdS,IP_65504_P_649_RESERVD_S_LEN)
                  ,beginIp65504P649ReservdS
                  ,IP_65504_P_649_RESERVD_S_LEN
                 );
            localIp65504P649ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P649ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P649ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P649ReservdS() {	 
			return (getShort(beginIp65504P649ReservdS));
   	}
         int localIp65504P649ReservdLCounter = -1;
         public boolean isIp65504P649ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P649ReservdLCounter != sharedCounter;
            localIp65504P649ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_649_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P649ReservdL
	 */
	protected void serializeIp65504P649ReservdL(short ip65504P649ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P649ReservdL,IP_65504_P_649_RESERVD_L_LEN)
                  ,beginIp65504P649ReservdL
                  ,IP_65504_P_649_RESERVD_L_LEN
                 );
            localIp65504P649ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P649ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P649ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P649ReservdL() {	 
			return (getShort(beginIp65504P649ReservdL));
   	}
         int localIp65504P650NetGrsSCounter = -1;
         public boolean isIp65504P650NetGrsSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P650NetGrsSCounter != sharedCounter;
            localIp65504P650NetGrsSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_650_NET_GRS_S_LEN = 2;
  	/**
	 * serializeIp65504P650NetGrsS
	 */
	protected void serializeIp65504P650NetGrsS(short ip65504P650NetGrsS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P650NetGrsS,IP_65504_P_650_NET_GRS_S_LEN)
                  ,beginIp65504P650NetGrsS
                  ,IP_65504_P_650_NET_GRS_S_LEN
                 );
            localIp65504P650NetGrsSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P650NetGrsSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P650NetGrsS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P650NetGrsS() {	 
			return (getShort(beginIp65504P650NetGrsS));
   	}
         int localIp65504P650NetGrsLCounter = -1;
         public boolean isIp65504P650NetGrsLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P650NetGrsLCounter != sharedCounter;
            localIp65504P650NetGrsLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_650_NET_GRS_L_LEN = 2;
  	/**
	 * serializeIp65504P650NetGrsL
	 */
	protected void serializeIp65504P650NetGrsL(short ip65504P650NetGrsL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P650NetGrsL,IP_65504_P_650_NET_GRS_L_LEN)
                  ,beginIp65504P650NetGrsL
                  ,IP_65504_P_650_NET_GRS_L_LEN
                 );
            localIp65504P650NetGrsLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P650NetGrsLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P650NetGrsL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P650NetGrsL() {	 
			return (getShort(beginIp65504P650NetGrsL));
   	}
         int localIp65504P651TaxRteSCounter = -1;
         public boolean isIp65504P651TaxRteSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P651TaxRteSCounter != sharedCounter;
            localIp65504P651TaxRteSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_651_TAX_RTE_S_LEN = 2;
  	/**
	 * serializeIp65504P651TaxRteS
	 */
	protected void serializeIp65504P651TaxRteS(short ip65504P651TaxRteS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P651TaxRteS,IP_65504_P_651_TAX_RTE_S_LEN)
                  ,beginIp65504P651TaxRteS
                  ,IP_65504_P_651_TAX_RTE_S_LEN
                 );
            localIp65504P651TaxRteSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P651TaxRteSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P651TaxRteS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P651TaxRteS() {	 
			return (getShort(beginIp65504P651TaxRteS));
   	}
         int localIp65504P651TaxRteLCounter = -1;
         public boolean isIp65504P651TaxRteLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P651TaxRteLCounter != sharedCounter;
            localIp65504P651TaxRteLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_651_TAX_RTE_L_LEN = 2;
  	/**
	 * serializeIp65504P651TaxRteL
	 */
	protected void serializeIp65504P651TaxRteL(short ip65504P651TaxRteL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P651TaxRteL,IP_65504_P_651_TAX_RTE_L_LEN)
                  ,beginIp65504P651TaxRteL
                  ,IP_65504_P_651_TAX_RTE_L_LEN
                 );
            localIp65504P651TaxRteLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P651TaxRteLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P651TaxRteL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P651TaxRteL() {	 
			return (getShort(beginIp65504P651TaxRteL));
   	}




}
  
