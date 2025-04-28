package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip65504PdsNamesLargeGroup23Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:58. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip65504PdsNamesLargeGroup23Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip65504PdsNamesLargeGroup23Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_65504_PDS_NAMES_LARGE_GROUP_23_LENGTH = 248;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp65504P683TaxAmount4S;
            protected  int beginIp65504P683TaxAmount4L;
            protected  int beginIp65504P684TaxAmount5S;
            protected  int beginIp65504P684TaxAmount5L;
            protected  int beginIp65504P685TypeOfSupplyS;
            protected  int beginIp65504P685TypeOfSupplyL;
            protected  int beginIp65504P686TaxExmptIndS;
            protected  int beginIp65504P686TaxExmptIndL;
            protected  int beginIp65504P687UnqvatInvrfnoS;
            protected  int beginIp65504P687UnqvatInvrfnoL;
            protected  int beginIp65504P688ReservdS;
            protected  int beginIp65504P688ReservdL;
            protected  int beginIp65504P689CorpIdS;
            protected  int beginIp65504P689CorpIdL;
            protected  int beginIp65504P690NoShowIndS;
            protected  int beginIp65504P690NoShowIndL;
            protected  int beginIp65504P691DaysRentedS;
            protected  int beginIp65504P691DaysRentedL;
            protected  int beginIp65504P692WeekRentAmtS;
            protected  int beginIp65504P692WeekRentAmtL;
            protected  int beginIp65504P693TotAuthAmtS;
            protected  int beginIp65504P693TotAuthAmtL;
            protected  int beginIp65504P6941waydropChrgeS;
            protected  int beginIp65504P6941waydropChrgeL;
            protected  int beginIp65504P695RegMileChrgeS;
            protected  int beginIp65504P695RegMileChrgeL;
            protected  int beginIp65504P696ExtMileChrgeS;
            protected  int beginIp65504P696ExtMileChrgeL;
            protected  int beginIp65504P697LateChrgeS;
            protected  int beginIp65504P697LateChrgeL;
            protected  int beginIp65504P698FuelChrgeS;
            protected  int beginIp65504P698FuelChrgeL;
            protected  int beginIp65504P699TotTaxAmtS;
            protected  int beginIp65504P699TotTaxAmtL;
            protected  int beginIp65504P700TowingChrgeS;
            protected  int beginIp65504P700TowingChrgeL;
            protected  int beginIp65504P701ExtraChrgeS;
            protected  int beginIp65504P701ExtraChrgeL;
            protected  int beginIp65504P702OtherChrgeS;
            protected  int beginIp65504P702OtherChrgeL;
            protected  int beginIp65504P703TotRoomNightS;
            protected  int beginIp65504P703TotRoomNightL;
            protected  int beginIp65504P704PrepaidExpnseS;
            protected  int beginIp65504P704PrepaidExpnseL;
            protected  int beginIp65504P705TotroomTaxamtS;
            protected  int beginIp65504P705TotroomTaxamtL;
            protected  int beginIp65504P706CashAdvanceS;
            protected  int beginIp65504P706CashAdvanceL;
            protected  int beginIp65504P707ValetChrgeS;
            protected  int beginIp65504P707ValetChrgeL;
            protected  int beginIp65504P708MovieChrgeS;
            protected  int beginIp65504P708MovieChrgeL;
            protected  int beginIp65504P709BsnsCntrChrgS;
            protected  int beginIp65504P709BsnsCntrChrgL;
            protected  int beginIp65504P710HelthclubChrgS;
            protected  int beginIp65504P710HelthclubChrgL;
            protected  int beginIp65504P711FireSfactIndS;
            protected  int beginIp65504P711FireSfactIndL;
            protected  int beginIp65504P712NetFuelPriceS;
            protected  int beginIp65504P712NetFuelPriceL;
            protected  int beginIp65504P713RestrctTktindS;
            protected  int beginIp65504P713RestrctTktindL;
	
	/**
	* Constructor for Ip65504PdsNamesLargeGroup23Serialized
	**/
    public Ip65504PdsNamesLargeGroup23Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ip65504PdsNamesLargeGroup23Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip65504PdsNamesLargeGroup23Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ip65504PdsNamesLargeGroup23Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,5452); // serialize this field at offset 5452 by default 
    }
    
	/**
	* sets parent for this Ip65504PdsNamesLargeGroup23Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 5452 by default
    }    
	/**
	* initializes the field in Ip65504PdsNamesLargeGroup23Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_65504_PDS_NAMES_LARGE_GROUP_23_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp65504P683TaxAmount4S = getStartOffset() + 4;	// set offset for serialization
  
             beginIp65504P683TaxAmount4L = getStartOffset() + 6;	// set offset for serialization
  
  
             beginIp65504P684TaxAmount5S = getStartOffset() + 12;	// set offset for serialization
  
             beginIp65504P684TaxAmount5L = getStartOffset() + 14;	// set offset for serialization
  
  
             beginIp65504P685TypeOfSupplyS = getStartOffset() + 20;	// set offset for serialization
  
             beginIp65504P685TypeOfSupplyL = getStartOffset() + 22;	// set offset for serialization
  
  
             beginIp65504P686TaxExmptIndS = getStartOffset() + 28;	// set offset for serialization
  
             beginIp65504P686TaxExmptIndL = getStartOffset() + 30;	// set offset for serialization
  
  
             beginIp65504P687UnqvatInvrfnoS = getStartOffset() + 36;	// set offset for serialization
  
             beginIp65504P687UnqvatInvrfnoL = getStartOffset() + 38;	// set offset for serialization
  
  
             beginIp65504P688ReservdS = getStartOffset() + 44;	// set offset for serialization
  
             beginIp65504P688ReservdL = getStartOffset() + 46;	// set offset for serialization
  
  
             beginIp65504P689CorpIdS = getStartOffset() + 52;	// set offset for serialization
  
             beginIp65504P689CorpIdL = getStartOffset() + 54;	// set offset for serialization
  
  
             beginIp65504P690NoShowIndS = getStartOffset() + 60;	// set offset for serialization
  
             beginIp65504P690NoShowIndL = getStartOffset() + 62;	// set offset for serialization
  
  
             beginIp65504P691DaysRentedS = getStartOffset() + 68;	// set offset for serialization
  
             beginIp65504P691DaysRentedL = getStartOffset() + 70;	// set offset for serialization
  
  
             beginIp65504P692WeekRentAmtS = getStartOffset() + 76;	// set offset for serialization
  
             beginIp65504P692WeekRentAmtL = getStartOffset() + 78;	// set offset for serialization
  
  
             beginIp65504P693TotAuthAmtS = getStartOffset() + 84;	// set offset for serialization
  
             beginIp65504P693TotAuthAmtL = getStartOffset() + 86;	// set offset for serialization
  
  
             beginIp65504P6941waydropChrgeS = getStartOffset() + 92;	// set offset for serialization
  
             beginIp65504P6941waydropChrgeL = getStartOffset() + 94;	// set offset for serialization
  
  
             beginIp65504P695RegMileChrgeS = getStartOffset() + 100;	// set offset for serialization
  
             beginIp65504P695RegMileChrgeL = getStartOffset() + 102;	// set offset for serialization
  
  
             beginIp65504P696ExtMileChrgeS = getStartOffset() + 108;	// set offset for serialization
  
             beginIp65504P696ExtMileChrgeL = getStartOffset() + 110;	// set offset for serialization
  
  
             beginIp65504P697LateChrgeS = getStartOffset() + 116;	// set offset for serialization
  
             beginIp65504P697LateChrgeL = getStartOffset() + 118;	// set offset for serialization
  
  
             beginIp65504P698FuelChrgeS = getStartOffset() + 124;	// set offset for serialization
  
             beginIp65504P698FuelChrgeL = getStartOffset() + 126;	// set offset for serialization
  
  
             beginIp65504P699TotTaxAmtS = getStartOffset() + 132;	// set offset for serialization
  
             beginIp65504P699TotTaxAmtL = getStartOffset() + 134;	// set offset for serialization
  
  
             beginIp65504P700TowingChrgeS = getStartOffset() + 140;	// set offset for serialization
  
             beginIp65504P700TowingChrgeL = getStartOffset() + 142;	// set offset for serialization
  
  
             beginIp65504P701ExtraChrgeS = getStartOffset() + 148;	// set offset for serialization
  
             beginIp65504P701ExtraChrgeL = getStartOffset() + 150;	// set offset for serialization
  
  
             beginIp65504P702OtherChrgeS = getStartOffset() + 156;	// set offset for serialization
  
             beginIp65504P702OtherChrgeL = getStartOffset() + 158;	// set offset for serialization
  
  
             beginIp65504P703TotRoomNightS = getStartOffset() + 164;	// set offset for serialization
  
             beginIp65504P703TotRoomNightL = getStartOffset() + 166;	// set offset for serialization
  
  
             beginIp65504P704PrepaidExpnseS = getStartOffset() + 172;	// set offset for serialization
  
             beginIp65504P704PrepaidExpnseL = getStartOffset() + 174;	// set offset for serialization
  
  
             beginIp65504P705TotroomTaxamtS = getStartOffset() + 180;	// set offset for serialization
  
             beginIp65504P705TotroomTaxamtL = getStartOffset() + 182;	// set offset for serialization
  
  
             beginIp65504P706CashAdvanceS = getStartOffset() + 188;	// set offset for serialization
  
             beginIp65504P706CashAdvanceL = getStartOffset() + 190;	// set offset for serialization
  
  
             beginIp65504P707ValetChrgeS = getStartOffset() + 196;	// set offset for serialization
  
             beginIp65504P707ValetChrgeL = getStartOffset() + 198;	// set offset for serialization
  
  
             beginIp65504P708MovieChrgeS = getStartOffset() + 204;	// set offset for serialization
  
             beginIp65504P708MovieChrgeL = getStartOffset() + 206;	// set offset for serialization
  
  
             beginIp65504P709BsnsCntrChrgS = getStartOffset() + 212;	// set offset for serialization
  
             beginIp65504P709BsnsCntrChrgL = getStartOffset() + 214;	// set offset for serialization
  
  
             beginIp65504P710HelthclubChrgS = getStartOffset() + 220;	// set offset for serialization
  
             beginIp65504P710HelthclubChrgL = getStartOffset() + 222;	// set offset for serialization
  
  
             beginIp65504P711FireSfactIndS = getStartOffset() + 228;	// set offset for serialization
  
             beginIp65504P711FireSfactIndL = getStartOffset() + 230;	// set offset for serialization
  
  
             beginIp65504P712NetFuelPriceS = getStartOffset() + 236;	// set offset for serialization
  
             beginIp65504P712NetFuelPriceL = getStartOffset() + 238;	// set offset for serialization
  
  
             beginIp65504P713RestrctTktindS = getStartOffset() + 244;	// set offset for serialization
  
             beginIp65504P713RestrctTktindL = getStartOffset() + 246;	// set offset for serialization
  
  
	   /*  end of offset */
	}
         int localIp65504P683TaxAmount4SCounter = -1;
         public boolean isIp65504P683TaxAmount4SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P683TaxAmount4SCounter != sharedCounter;
            localIp65504P683TaxAmount4SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_683_TAX_AMOUNT_4_S_LEN = 2;
  	/**
	 * serializeIp65504P683TaxAmount4S
	 */
	protected void serializeIp65504P683TaxAmount4S(short ip65504P683TaxAmount4S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P683TaxAmount4S,IP_65504_P_683_TAX_AMOUNT_4_S_LEN)
                  ,beginIp65504P683TaxAmount4S
                  ,IP_65504_P_683_TAX_AMOUNT_4_S_LEN
                 );
            localIp65504P683TaxAmount4SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P683TaxAmount4SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P683TaxAmount4S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P683TaxAmount4S() {	 
			return (getShort(beginIp65504P683TaxAmount4S));
   	}
         int localIp65504P683TaxAmount4LCounter = -1;
         public boolean isIp65504P683TaxAmount4LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P683TaxAmount4LCounter != sharedCounter;
            localIp65504P683TaxAmount4LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_683_TAX_AMOUNT_4_L_LEN = 2;
  	/**
	 * serializeIp65504P683TaxAmount4L
	 */
	protected void serializeIp65504P683TaxAmount4L(short ip65504P683TaxAmount4L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P683TaxAmount4L,IP_65504_P_683_TAX_AMOUNT_4_L_LEN)
                  ,beginIp65504P683TaxAmount4L
                  ,IP_65504_P_683_TAX_AMOUNT_4_L_LEN
                 );
            localIp65504P683TaxAmount4LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P683TaxAmount4LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P683TaxAmount4L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P683TaxAmount4L() {	 
			return (getShort(beginIp65504P683TaxAmount4L));
   	}
         int localIp65504P684TaxAmount5SCounter = -1;
         public boolean isIp65504P684TaxAmount5SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P684TaxAmount5SCounter != sharedCounter;
            localIp65504P684TaxAmount5SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_684_TAX_AMOUNT_5_S_LEN = 2;
  	/**
	 * serializeIp65504P684TaxAmount5S
	 */
	protected void serializeIp65504P684TaxAmount5S(short ip65504P684TaxAmount5S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P684TaxAmount5S,IP_65504_P_684_TAX_AMOUNT_5_S_LEN)
                  ,beginIp65504P684TaxAmount5S
                  ,IP_65504_P_684_TAX_AMOUNT_5_S_LEN
                 );
            localIp65504P684TaxAmount5SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P684TaxAmount5SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P684TaxAmount5S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P684TaxAmount5S() {	 
			return (getShort(beginIp65504P684TaxAmount5S));
   	}
         int localIp65504P684TaxAmount5LCounter = -1;
         public boolean isIp65504P684TaxAmount5LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P684TaxAmount5LCounter != sharedCounter;
            localIp65504P684TaxAmount5LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_684_TAX_AMOUNT_5_L_LEN = 2;
  	/**
	 * serializeIp65504P684TaxAmount5L
	 */
	protected void serializeIp65504P684TaxAmount5L(short ip65504P684TaxAmount5L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P684TaxAmount5L,IP_65504_P_684_TAX_AMOUNT_5_L_LEN)
                  ,beginIp65504P684TaxAmount5L
                  ,IP_65504_P_684_TAX_AMOUNT_5_L_LEN
                 );
            localIp65504P684TaxAmount5LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P684TaxAmount5LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P684TaxAmount5L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P684TaxAmount5L() {	 
			return (getShort(beginIp65504P684TaxAmount5L));
   	}
         int localIp65504P685TypeOfSupplySCounter = -1;
         public boolean isIp65504P685TypeOfSupplySModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P685TypeOfSupplySCounter != sharedCounter;
            localIp65504P685TypeOfSupplySCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_685_TYPE_OF_SUPPLY_S_LEN = 2;
  	/**
	 * serializeIp65504P685TypeOfSupplyS
	 */
	protected void serializeIp65504P685TypeOfSupplyS(short ip65504P685TypeOfSupplyS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P685TypeOfSupplyS,IP_65504_P_685_TYPE_OF_SUPPLY_S_LEN)
                  ,beginIp65504P685TypeOfSupplyS
                  ,IP_65504_P_685_TYPE_OF_SUPPLY_S_LEN
                 );
            localIp65504P685TypeOfSupplySCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P685TypeOfSupplySMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P685TypeOfSupplyS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P685TypeOfSupplyS() {	 
			return (getShort(beginIp65504P685TypeOfSupplyS));
   	}
         int localIp65504P685TypeOfSupplyLCounter = -1;
         public boolean isIp65504P685TypeOfSupplyLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P685TypeOfSupplyLCounter != sharedCounter;
            localIp65504P685TypeOfSupplyLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_685_TYPE_OF_SUPPLY_L_LEN = 2;
  	/**
	 * serializeIp65504P685TypeOfSupplyL
	 */
	protected void serializeIp65504P685TypeOfSupplyL(short ip65504P685TypeOfSupplyL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P685TypeOfSupplyL,IP_65504_P_685_TYPE_OF_SUPPLY_L_LEN)
                  ,beginIp65504P685TypeOfSupplyL
                  ,IP_65504_P_685_TYPE_OF_SUPPLY_L_LEN
                 );
            localIp65504P685TypeOfSupplyLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P685TypeOfSupplyLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P685TypeOfSupplyL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P685TypeOfSupplyL() {	 
			return (getShort(beginIp65504P685TypeOfSupplyL));
   	}
         int localIp65504P686TaxExmptIndSCounter = -1;
         public boolean isIp65504P686TaxExmptIndSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P686TaxExmptIndSCounter != sharedCounter;
            localIp65504P686TaxExmptIndSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_686_TAX_EXMPT_IND_S_LEN = 2;
  	/**
	 * serializeIp65504P686TaxExmptIndS
	 */
	protected void serializeIp65504P686TaxExmptIndS(short ip65504P686TaxExmptIndS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P686TaxExmptIndS,IP_65504_P_686_TAX_EXMPT_IND_S_LEN)
                  ,beginIp65504P686TaxExmptIndS
                  ,IP_65504_P_686_TAX_EXMPT_IND_S_LEN
                 );
            localIp65504P686TaxExmptIndSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P686TaxExmptIndSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P686TaxExmptIndS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P686TaxExmptIndS() {	 
			return (getShort(beginIp65504P686TaxExmptIndS));
   	}
         int localIp65504P686TaxExmptIndLCounter = -1;
         public boolean isIp65504P686TaxExmptIndLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P686TaxExmptIndLCounter != sharedCounter;
            localIp65504P686TaxExmptIndLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_686_TAX_EXMPT_IND_L_LEN = 2;
  	/**
	 * serializeIp65504P686TaxExmptIndL
	 */
	protected void serializeIp65504P686TaxExmptIndL(short ip65504P686TaxExmptIndL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P686TaxExmptIndL,IP_65504_P_686_TAX_EXMPT_IND_L_LEN)
                  ,beginIp65504P686TaxExmptIndL
                  ,IP_65504_P_686_TAX_EXMPT_IND_L_LEN
                 );
            localIp65504P686TaxExmptIndLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P686TaxExmptIndLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P686TaxExmptIndL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P686TaxExmptIndL() {	 
			return (getShort(beginIp65504P686TaxExmptIndL));
   	}
         int localIp65504P687UnqvatInvrfnoSCounter = -1;
         public boolean isIp65504P687UnqvatInvrfnoSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P687UnqvatInvrfnoSCounter != sharedCounter;
            localIp65504P687UnqvatInvrfnoSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_687_UNQVAT_INVRFNO_S_LEN = 2;
  	/**
	 * serializeIp65504P687UnqvatInvrfnoS
	 */
	protected void serializeIp65504P687UnqvatInvrfnoS(short ip65504P687UnqvatInvrfnoS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P687UnqvatInvrfnoS,IP_65504_P_687_UNQVAT_INVRFNO_S_LEN)
                  ,beginIp65504P687UnqvatInvrfnoS
                  ,IP_65504_P_687_UNQVAT_INVRFNO_S_LEN
                 );
            localIp65504P687UnqvatInvrfnoSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P687UnqvatInvrfnoSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P687UnqvatInvrfnoS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P687UnqvatInvrfnoS() {	 
			return (getShort(beginIp65504P687UnqvatInvrfnoS));
   	}
         int localIp65504P687UnqvatInvrfnoLCounter = -1;
         public boolean isIp65504P687UnqvatInvrfnoLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P687UnqvatInvrfnoLCounter != sharedCounter;
            localIp65504P687UnqvatInvrfnoLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_687_UNQVAT_INVRFNO_L_LEN = 2;
  	/**
	 * serializeIp65504P687UnqvatInvrfnoL
	 */
	protected void serializeIp65504P687UnqvatInvrfnoL(short ip65504P687UnqvatInvrfnoL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P687UnqvatInvrfnoL,IP_65504_P_687_UNQVAT_INVRFNO_L_LEN)
                  ,beginIp65504P687UnqvatInvrfnoL
                  ,IP_65504_P_687_UNQVAT_INVRFNO_L_LEN
                 );
            localIp65504P687UnqvatInvrfnoLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P687UnqvatInvrfnoLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P687UnqvatInvrfnoL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P687UnqvatInvrfnoL() {	 
			return (getShort(beginIp65504P687UnqvatInvrfnoL));
   	}
         int localIp65504P688ReservdSCounter = -1;
         public boolean isIp65504P688ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P688ReservdSCounter != sharedCounter;
            localIp65504P688ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_688_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P688ReservdS
	 */
	protected void serializeIp65504P688ReservdS(short ip65504P688ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P688ReservdS,IP_65504_P_688_RESERVD_S_LEN)
                  ,beginIp65504P688ReservdS
                  ,IP_65504_P_688_RESERVD_S_LEN
                 );
            localIp65504P688ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P688ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P688ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P688ReservdS() {	 
			return (getShort(beginIp65504P688ReservdS));
   	}
         int localIp65504P688ReservdLCounter = -1;
         public boolean isIp65504P688ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P688ReservdLCounter != sharedCounter;
            localIp65504P688ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_688_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P688ReservdL
	 */
	protected void serializeIp65504P688ReservdL(short ip65504P688ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P688ReservdL,IP_65504_P_688_RESERVD_L_LEN)
                  ,beginIp65504P688ReservdL
                  ,IP_65504_P_688_RESERVD_L_LEN
                 );
            localIp65504P688ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P688ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P688ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P688ReservdL() {	 
			return (getShort(beginIp65504P688ReservdL));
   	}
         int localIp65504P689CorpIdSCounter = -1;
         public boolean isIp65504P689CorpIdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P689CorpIdSCounter != sharedCounter;
            localIp65504P689CorpIdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_689_CORP_ID_S_LEN = 2;
  	/**
	 * serializeIp65504P689CorpIdS
	 */
	protected void serializeIp65504P689CorpIdS(short ip65504P689CorpIdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P689CorpIdS,IP_65504_P_689_CORP_ID_S_LEN)
                  ,beginIp65504P689CorpIdS
                  ,IP_65504_P_689_CORP_ID_S_LEN
                 );
            localIp65504P689CorpIdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P689CorpIdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P689CorpIdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P689CorpIdS() {	 
			return (getShort(beginIp65504P689CorpIdS));
   	}
         int localIp65504P689CorpIdLCounter = -1;
         public boolean isIp65504P689CorpIdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P689CorpIdLCounter != sharedCounter;
            localIp65504P689CorpIdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_689_CORP_ID_L_LEN = 2;
  	/**
	 * serializeIp65504P689CorpIdL
	 */
	protected void serializeIp65504P689CorpIdL(short ip65504P689CorpIdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P689CorpIdL,IP_65504_P_689_CORP_ID_L_LEN)
                  ,beginIp65504P689CorpIdL
                  ,IP_65504_P_689_CORP_ID_L_LEN
                 );
            localIp65504P689CorpIdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P689CorpIdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P689CorpIdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P689CorpIdL() {	 
			return (getShort(beginIp65504P689CorpIdL));
   	}
         int localIp65504P690NoShowIndSCounter = -1;
         public boolean isIp65504P690NoShowIndSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P690NoShowIndSCounter != sharedCounter;
            localIp65504P690NoShowIndSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_690_NO_SHOW_IND_S_LEN = 2;
  	/**
	 * serializeIp65504P690NoShowIndS
	 */
	protected void serializeIp65504P690NoShowIndS(short ip65504P690NoShowIndS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P690NoShowIndS,IP_65504_P_690_NO_SHOW_IND_S_LEN)
                  ,beginIp65504P690NoShowIndS
                  ,IP_65504_P_690_NO_SHOW_IND_S_LEN
                 );
            localIp65504P690NoShowIndSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P690NoShowIndSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P690NoShowIndS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P690NoShowIndS() {	 
			return (getShort(beginIp65504P690NoShowIndS));
   	}
         int localIp65504P690NoShowIndLCounter = -1;
         public boolean isIp65504P690NoShowIndLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P690NoShowIndLCounter != sharedCounter;
            localIp65504P690NoShowIndLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_690_NO_SHOW_IND_L_LEN = 2;
  	/**
	 * serializeIp65504P690NoShowIndL
	 */
	protected void serializeIp65504P690NoShowIndL(short ip65504P690NoShowIndL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P690NoShowIndL,IP_65504_P_690_NO_SHOW_IND_L_LEN)
                  ,beginIp65504P690NoShowIndL
                  ,IP_65504_P_690_NO_SHOW_IND_L_LEN
                 );
            localIp65504P690NoShowIndLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P690NoShowIndLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P690NoShowIndL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P690NoShowIndL() {	 
			return (getShort(beginIp65504P690NoShowIndL));
   	}
         int localIp65504P691DaysRentedSCounter = -1;
         public boolean isIp65504P691DaysRentedSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P691DaysRentedSCounter != sharedCounter;
            localIp65504P691DaysRentedSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_691_DAYS_RENTED_S_LEN = 2;
  	/**
	 * serializeIp65504P691DaysRentedS
	 */
	protected void serializeIp65504P691DaysRentedS(short ip65504P691DaysRentedS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P691DaysRentedS,IP_65504_P_691_DAYS_RENTED_S_LEN)
                  ,beginIp65504P691DaysRentedS
                  ,IP_65504_P_691_DAYS_RENTED_S_LEN
                 );
            localIp65504P691DaysRentedSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P691DaysRentedSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P691DaysRentedS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P691DaysRentedS() {	 
			return (getShort(beginIp65504P691DaysRentedS));
   	}
         int localIp65504P691DaysRentedLCounter = -1;
         public boolean isIp65504P691DaysRentedLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P691DaysRentedLCounter != sharedCounter;
            localIp65504P691DaysRentedLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_691_DAYS_RENTED_L_LEN = 2;
  	/**
	 * serializeIp65504P691DaysRentedL
	 */
	protected void serializeIp65504P691DaysRentedL(short ip65504P691DaysRentedL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P691DaysRentedL,IP_65504_P_691_DAYS_RENTED_L_LEN)
                  ,beginIp65504P691DaysRentedL
                  ,IP_65504_P_691_DAYS_RENTED_L_LEN
                 );
            localIp65504P691DaysRentedLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P691DaysRentedLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P691DaysRentedL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P691DaysRentedL() {	 
			return (getShort(beginIp65504P691DaysRentedL));
   	}
         int localIp65504P692WeekRentAmtSCounter = -1;
         public boolean isIp65504P692WeekRentAmtSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P692WeekRentAmtSCounter != sharedCounter;
            localIp65504P692WeekRentAmtSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_692_WEEK_RENT_AMT_S_LEN = 2;
  	/**
	 * serializeIp65504P692WeekRentAmtS
	 */
	protected void serializeIp65504P692WeekRentAmtS(short ip65504P692WeekRentAmtS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P692WeekRentAmtS,IP_65504_P_692_WEEK_RENT_AMT_S_LEN)
                  ,beginIp65504P692WeekRentAmtS
                  ,IP_65504_P_692_WEEK_RENT_AMT_S_LEN
                 );
            localIp65504P692WeekRentAmtSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P692WeekRentAmtSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P692WeekRentAmtS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P692WeekRentAmtS() {	 
			return (getShort(beginIp65504P692WeekRentAmtS));
   	}
         int localIp65504P692WeekRentAmtLCounter = -1;
         public boolean isIp65504P692WeekRentAmtLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P692WeekRentAmtLCounter != sharedCounter;
            localIp65504P692WeekRentAmtLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_692_WEEK_RENT_AMT_L_LEN = 2;
  	/**
	 * serializeIp65504P692WeekRentAmtL
	 */
	protected void serializeIp65504P692WeekRentAmtL(short ip65504P692WeekRentAmtL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P692WeekRentAmtL,IP_65504_P_692_WEEK_RENT_AMT_L_LEN)
                  ,beginIp65504P692WeekRentAmtL
                  ,IP_65504_P_692_WEEK_RENT_AMT_L_LEN
                 );
            localIp65504P692WeekRentAmtLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P692WeekRentAmtLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P692WeekRentAmtL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P692WeekRentAmtL() {	 
			return (getShort(beginIp65504P692WeekRentAmtL));
   	}
         int localIp65504P693TotAuthAmtSCounter = -1;
         public boolean isIp65504P693TotAuthAmtSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P693TotAuthAmtSCounter != sharedCounter;
            localIp65504P693TotAuthAmtSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_693_TOT_AUTH_AMT_S_LEN = 2;
  	/**
	 * serializeIp65504P693TotAuthAmtS
	 */
	protected void serializeIp65504P693TotAuthAmtS(short ip65504P693TotAuthAmtS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P693TotAuthAmtS,IP_65504_P_693_TOT_AUTH_AMT_S_LEN)
                  ,beginIp65504P693TotAuthAmtS
                  ,IP_65504_P_693_TOT_AUTH_AMT_S_LEN
                 );
            localIp65504P693TotAuthAmtSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P693TotAuthAmtSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P693TotAuthAmtS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P693TotAuthAmtS() {	 
			return (getShort(beginIp65504P693TotAuthAmtS));
   	}
         int localIp65504P693TotAuthAmtLCounter = -1;
         public boolean isIp65504P693TotAuthAmtLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P693TotAuthAmtLCounter != sharedCounter;
            localIp65504P693TotAuthAmtLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_693_TOT_AUTH_AMT_L_LEN = 2;
  	/**
	 * serializeIp65504P693TotAuthAmtL
	 */
	protected void serializeIp65504P693TotAuthAmtL(short ip65504P693TotAuthAmtL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P693TotAuthAmtL,IP_65504_P_693_TOT_AUTH_AMT_L_LEN)
                  ,beginIp65504P693TotAuthAmtL
                  ,IP_65504_P_693_TOT_AUTH_AMT_L_LEN
                 );
            localIp65504P693TotAuthAmtLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P693TotAuthAmtLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P693TotAuthAmtL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P693TotAuthAmtL() {	 
			return (getShort(beginIp65504P693TotAuthAmtL));
   	}
         int localIp65504P6941waydropChrgeSCounter = -1;
         public boolean isIp65504P6941waydropChrgeSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P6941waydropChrgeSCounter != sharedCounter;
            localIp65504P6941waydropChrgeSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_6941WAYDROP_CHRGE_S_LEN = 2;
  	/**
	 * serializeIp65504P6941waydropChrgeS
	 */
	protected void serializeIp65504P6941waydropChrgeS(short ip65504P6941waydropChrgeS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P6941waydropChrgeS,IP_65504_P_6941WAYDROP_CHRGE_S_LEN)
                  ,beginIp65504P6941waydropChrgeS
                  ,IP_65504_P_6941WAYDROP_CHRGE_S_LEN
                 );
            localIp65504P6941waydropChrgeSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P6941waydropChrgeSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P6941waydropChrgeS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P6941waydropChrgeS() {	 
			return (getShort(beginIp65504P6941waydropChrgeS));
   	}
         int localIp65504P6941waydropChrgeLCounter = -1;
         public boolean isIp65504P6941waydropChrgeLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P6941waydropChrgeLCounter != sharedCounter;
            localIp65504P6941waydropChrgeLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_6941WAYDROP_CHRGE_L_LEN = 2;
  	/**
	 * serializeIp65504P6941waydropChrgeL
	 */
	protected void serializeIp65504P6941waydropChrgeL(short ip65504P6941waydropChrgeL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P6941waydropChrgeL,IP_65504_P_6941WAYDROP_CHRGE_L_LEN)
                  ,beginIp65504P6941waydropChrgeL
                  ,IP_65504_P_6941WAYDROP_CHRGE_L_LEN
                 );
            localIp65504P6941waydropChrgeLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P6941waydropChrgeLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P6941waydropChrgeL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P6941waydropChrgeL() {	 
			return (getShort(beginIp65504P6941waydropChrgeL));
   	}
         int localIp65504P695RegMileChrgeSCounter = -1;
         public boolean isIp65504P695RegMileChrgeSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P695RegMileChrgeSCounter != sharedCounter;
            localIp65504P695RegMileChrgeSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_695_REG_MILE_CHRGE_S_LEN = 2;
  	/**
	 * serializeIp65504P695RegMileChrgeS
	 */
	protected void serializeIp65504P695RegMileChrgeS(short ip65504P695RegMileChrgeS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P695RegMileChrgeS,IP_65504_P_695_REG_MILE_CHRGE_S_LEN)
                  ,beginIp65504P695RegMileChrgeS
                  ,IP_65504_P_695_REG_MILE_CHRGE_S_LEN
                 );
            localIp65504P695RegMileChrgeSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P695RegMileChrgeSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P695RegMileChrgeS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P695RegMileChrgeS() {	 
			return (getShort(beginIp65504P695RegMileChrgeS));
   	}
         int localIp65504P695RegMileChrgeLCounter = -1;
         public boolean isIp65504P695RegMileChrgeLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P695RegMileChrgeLCounter != sharedCounter;
            localIp65504P695RegMileChrgeLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_695_REG_MILE_CHRGE_L_LEN = 2;
  	/**
	 * serializeIp65504P695RegMileChrgeL
	 */
	protected void serializeIp65504P695RegMileChrgeL(short ip65504P695RegMileChrgeL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P695RegMileChrgeL,IP_65504_P_695_REG_MILE_CHRGE_L_LEN)
                  ,beginIp65504P695RegMileChrgeL
                  ,IP_65504_P_695_REG_MILE_CHRGE_L_LEN
                 );
            localIp65504P695RegMileChrgeLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P695RegMileChrgeLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P695RegMileChrgeL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P695RegMileChrgeL() {	 
			return (getShort(beginIp65504P695RegMileChrgeL));
   	}
         int localIp65504P696ExtMileChrgeSCounter = -1;
         public boolean isIp65504P696ExtMileChrgeSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P696ExtMileChrgeSCounter != sharedCounter;
            localIp65504P696ExtMileChrgeSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_696_EXT_MILE_CHRGE_S_LEN = 2;
  	/**
	 * serializeIp65504P696ExtMileChrgeS
	 */
	protected void serializeIp65504P696ExtMileChrgeS(short ip65504P696ExtMileChrgeS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P696ExtMileChrgeS,IP_65504_P_696_EXT_MILE_CHRGE_S_LEN)
                  ,beginIp65504P696ExtMileChrgeS
                  ,IP_65504_P_696_EXT_MILE_CHRGE_S_LEN
                 );
            localIp65504P696ExtMileChrgeSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P696ExtMileChrgeSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P696ExtMileChrgeS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P696ExtMileChrgeS() {	 
			return (getShort(beginIp65504P696ExtMileChrgeS));
   	}
         int localIp65504P696ExtMileChrgeLCounter = -1;
         public boolean isIp65504P696ExtMileChrgeLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P696ExtMileChrgeLCounter != sharedCounter;
            localIp65504P696ExtMileChrgeLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_696_EXT_MILE_CHRGE_L_LEN = 2;
  	/**
	 * serializeIp65504P696ExtMileChrgeL
	 */
	protected void serializeIp65504P696ExtMileChrgeL(short ip65504P696ExtMileChrgeL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P696ExtMileChrgeL,IP_65504_P_696_EXT_MILE_CHRGE_L_LEN)
                  ,beginIp65504P696ExtMileChrgeL
                  ,IP_65504_P_696_EXT_MILE_CHRGE_L_LEN
                 );
            localIp65504P696ExtMileChrgeLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P696ExtMileChrgeLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P696ExtMileChrgeL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P696ExtMileChrgeL() {	 
			return (getShort(beginIp65504P696ExtMileChrgeL));
   	}
         int localIp65504P697LateChrgeSCounter = -1;
         public boolean isIp65504P697LateChrgeSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P697LateChrgeSCounter != sharedCounter;
            localIp65504P697LateChrgeSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_697_LATE_CHRGE_S_LEN = 2;
  	/**
	 * serializeIp65504P697LateChrgeS
	 */
	protected void serializeIp65504P697LateChrgeS(short ip65504P697LateChrgeS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P697LateChrgeS,IP_65504_P_697_LATE_CHRGE_S_LEN)
                  ,beginIp65504P697LateChrgeS
                  ,IP_65504_P_697_LATE_CHRGE_S_LEN
                 );
            localIp65504P697LateChrgeSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P697LateChrgeSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P697LateChrgeS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P697LateChrgeS() {	 
			return (getShort(beginIp65504P697LateChrgeS));
   	}
         int localIp65504P697LateChrgeLCounter = -1;
         public boolean isIp65504P697LateChrgeLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P697LateChrgeLCounter != sharedCounter;
            localIp65504P697LateChrgeLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_697_LATE_CHRGE_L_LEN = 2;
  	/**
	 * serializeIp65504P697LateChrgeL
	 */
	protected void serializeIp65504P697LateChrgeL(short ip65504P697LateChrgeL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P697LateChrgeL,IP_65504_P_697_LATE_CHRGE_L_LEN)
                  ,beginIp65504P697LateChrgeL
                  ,IP_65504_P_697_LATE_CHRGE_L_LEN
                 );
            localIp65504P697LateChrgeLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P697LateChrgeLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P697LateChrgeL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P697LateChrgeL() {	 
			return (getShort(beginIp65504P697LateChrgeL));
   	}
         int localIp65504P698FuelChrgeSCounter = -1;
         public boolean isIp65504P698FuelChrgeSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P698FuelChrgeSCounter != sharedCounter;
            localIp65504P698FuelChrgeSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_698_FUEL_CHRGE_S_LEN = 2;
  	/**
	 * serializeIp65504P698FuelChrgeS
	 */
	protected void serializeIp65504P698FuelChrgeS(short ip65504P698FuelChrgeS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P698FuelChrgeS,IP_65504_P_698_FUEL_CHRGE_S_LEN)
                  ,beginIp65504P698FuelChrgeS
                  ,IP_65504_P_698_FUEL_CHRGE_S_LEN
                 );
            localIp65504P698FuelChrgeSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P698FuelChrgeSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P698FuelChrgeS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P698FuelChrgeS() {	 
			return (getShort(beginIp65504P698FuelChrgeS));
   	}
         int localIp65504P698FuelChrgeLCounter = -1;
         public boolean isIp65504P698FuelChrgeLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P698FuelChrgeLCounter != sharedCounter;
            localIp65504P698FuelChrgeLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_698_FUEL_CHRGE_L_LEN = 2;
  	/**
	 * serializeIp65504P698FuelChrgeL
	 */
	protected void serializeIp65504P698FuelChrgeL(short ip65504P698FuelChrgeL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P698FuelChrgeL,IP_65504_P_698_FUEL_CHRGE_L_LEN)
                  ,beginIp65504P698FuelChrgeL
                  ,IP_65504_P_698_FUEL_CHRGE_L_LEN
                 );
            localIp65504P698FuelChrgeLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P698FuelChrgeLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P698FuelChrgeL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P698FuelChrgeL() {	 
			return (getShort(beginIp65504P698FuelChrgeL));
   	}
         int localIp65504P699TotTaxAmtSCounter = -1;
         public boolean isIp65504P699TotTaxAmtSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P699TotTaxAmtSCounter != sharedCounter;
            localIp65504P699TotTaxAmtSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_699_TOT_TAX_AMT_S_LEN = 2;
  	/**
	 * serializeIp65504P699TotTaxAmtS
	 */
	protected void serializeIp65504P699TotTaxAmtS(short ip65504P699TotTaxAmtS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P699TotTaxAmtS,IP_65504_P_699_TOT_TAX_AMT_S_LEN)
                  ,beginIp65504P699TotTaxAmtS
                  ,IP_65504_P_699_TOT_TAX_AMT_S_LEN
                 );
            localIp65504P699TotTaxAmtSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P699TotTaxAmtSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P699TotTaxAmtS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P699TotTaxAmtS() {	 
			return (getShort(beginIp65504P699TotTaxAmtS));
   	}
         int localIp65504P699TotTaxAmtLCounter = -1;
         public boolean isIp65504P699TotTaxAmtLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P699TotTaxAmtLCounter != sharedCounter;
            localIp65504P699TotTaxAmtLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_699_TOT_TAX_AMT_L_LEN = 2;
  	/**
	 * serializeIp65504P699TotTaxAmtL
	 */
	protected void serializeIp65504P699TotTaxAmtL(short ip65504P699TotTaxAmtL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P699TotTaxAmtL,IP_65504_P_699_TOT_TAX_AMT_L_LEN)
                  ,beginIp65504P699TotTaxAmtL
                  ,IP_65504_P_699_TOT_TAX_AMT_L_LEN
                 );
            localIp65504P699TotTaxAmtLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P699TotTaxAmtLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P699TotTaxAmtL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P699TotTaxAmtL() {	 
			return (getShort(beginIp65504P699TotTaxAmtL));
   	}
         int localIp65504P700TowingChrgeSCounter = -1;
         public boolean isIp65504P700TowingChrgeSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P700TowingChrgeSCounter != sharedCounter;
            localIp65504P700TowingChrgeSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_700_TOWING_CHRGE_S_LEN = 2;
  	/**
	 * serializeIp65504P700TowingChrgeS
	 */
	protected void serializeIp65504P700TowingChrgeS(short ip65504P700TowingChrgeS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P700TowingChrgeS,IP_65504_P_700_TOWING_CHRGE_S_LEN)
                  ,beginIp65504P700TowingChrgeS
                  ,IP_65504_P_700_TOWING_CHRGE_S_LEN
                 );
            localIp65504P700TowingChrgeSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P700TowingChrgeSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P700TowingChrgeS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P700TowingChrgeS() {	 
			return (getShort(beginIp65504P700TowingChrgeS));
   	}
         int localIp65504P700TowingChrgeLCounter = -1;
         public boolean isIp65504P700TowingChrgeLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P700TowingChrgeLCounter != sharedCounter;
            localIp65504P700TowingChrgeLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_700_TOWING_CHRGE_L_LEN = 2;
  	/**
	 * serializeIp65504P700TowingChrgeL
	 */
	protected void serializeIp65504P700TowingChrgeL(short ip65504P700TowingChrgeL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P700TowingChrgeL,IP_65504_P_700_TOWING_CHRGE_L_LEN)
                  ,beginIp65504P700TowingChrgeL
                  ,IP_65504_P_700_TOWING_CHRGE_L_LEN
                 );
            localIp65504P700TowingChrgeLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P700TowingChrgeLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P700TowingChrgeL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P700TowingChrgeL() {	 
			return (getShort(beginIp65504P700TowingChrgeL));
   	}
         int localIp65504P701ExtraChrgeSCounter = -1;
         public boolean isIp65504P701ExtraChrgeSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P701ExtraChrgeSCounter != sharedCounter;
            localIp65504P701ExtraChrgeSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_701_EXTRA_CHRGE_S_LEN = 2;
  	/**
	 * serializeIp65504P701ExtraChrgeS
	 */
	protected void serializeIp65504P701ExtraChrgeS(short ip65504P701ExtraChrgeS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P701ExtraChrgeS,IP_65504_P_701_EXTRA_CHRGE_S_LEN)
                  ,beginIp65504P701ExtraChrgeS
                  ,IP_65504_P_701_EXTRA_CHRGE_S_LEN
                 );
            localIp65504P701ExtraChrgeSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P701ExtraChrgeSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P701ExtraChrgeS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P701ExtraChrgeS() {	 
			return (getShort(beginIp65504P701ExtraChrgeS));
   	}
         int localIp65504P701ExtraChrgeLCounter = -1;
         public boolean isIp65504P701ExtraChrgeLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P701ExtraChrgeLCounter != sharedCounter;
            localIp65504P701ExtraChrgeLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_701_EXTRA_CHRGE_L_LEN = 2;
  	/**
	 * serializeIp65504P701ExtraChrgeL
	 */
	protected void serializeIp65504P701ExtraChrgeL(short ip65504P701ExtraChrgeL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P701ExtraChrgeL,IP_65504_P_701_EXTRA_CHRGE_L_LEN)
                  ,beginIp65504P701ExtraChrgeL
                  ,IP_65504_P_701_EXTRA_CHRGE_L_LEN
                 );
            localIp65504P701ExtraChrgeLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P701ExtraChrgeLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P701ExtraChrgeL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P701ExtraChrgeL() {	 
			return (getShort(beginIp65504P701ExtraChrgeL));
   	}
         int localIp65504P702OtherChrgeSCounter = -1;
         public boolean isIp65504P702OtherChrgeSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P702OtherChrgeSCounter != sharedCounter;
            localIp65504P702OtherChrgeSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_702_OTHER_CHRGE_S_LEN = 2;
  	/**
	 * serializeIp65504P702OtherChrgeS
	 */
	protected void serializeIp65504P702OtherChrgeS(short ip65504P702OtherChrgeS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P702OtherChrgeS,IP_65504_P_702_OTHER_CHRGE_S_LEN)
                  ,beginIp65504P702OtherChrgeS
                  ,IP_65504_P_702_OTHER_CHRGE_S_LEN
                 );
            localIp65504P702OtherChrgeSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P702OtherChrgeSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P702OtherChrgeS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P702OtherChrgeS() {	 
			return (getShort(beginIp65504P702OtherChrgeS));
   	}
         int localIp65504P702OtherChrgeLCounter = -1;
         public boolean isIp65504P702OtherChrgeLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P702OtherChrgeLCounter != sharedCounter;
            localIp65504P702OtherChrgeLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_702_OTHER_CHRGE_L_LEN = 2;
  	/**
	 * serializeIp65504P702OtherChrgeL
	 */
	protected void serializeIp65504P702OtherChrgeL(short ip65504P702OtherChrgeL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P702OtherChrgeL,IP_65504_P_702_OTHER_CHRGE_L_LEN)
                  ,beginIp65504P702OtherChrgeL
                  ,IP_65504_P_702_OTHER_CHRGE_L_LEN
                 );
            localIp65504P702OtherChrgeLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P702OtherChrgeLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P702OtherChrgeL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P702OtherChrgeL() {	 
			return (getShort(beginIp65504P702OtherChrgeL));
   	}
         int localIp65504P703TotRoomNightSCounter = -1;
         public boolean isIp65504P703TotRoomNightSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P703TotRoomNightSCounter != sharedCounter;
            localIp65504P703TotRoomNightSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_703_TOT_ROOM_NIGHT_S_LEN = 2;
  	/**
	 * serializeIp65504P703TotRoomNightS
	 */
	protected void serializeIp65504P703TotRoomNightS(short ip65504P703TotRoomNightS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P703TotRoomNightS,IP_65504_P_703_TOT_ROOM_NIGHT_S_LEN)
                  ,beginIp65504P703TotRoomNightS
                  ,IP_65504_P_703_TOT_ROOM_NIGHT_S_LEN
                 );
            localIp65504P703TotRoomNightSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P703TotRoomNightSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P703TotRoomNightS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P703TotRoomNightS() {	 
			return (getShort(beginIp65504P703TotRoomNightS));
   	}
         int localIp65504P703TotRoomNightLCounter = -1;
         public boolean isIp65504P703TotRoomNightLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P703TotRoomNightLCounter != sharedCounter;
            localIp65504P703TotRoomNightLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_703_TOT_ROOM_NIGHT_L_LEN = 2;
  	/**
	 * serializeIp65504P703TotRoomNightL
	 */
	protected void serializeIp65504P703TotRoomNightL(short ip65504P703TotRoomNightL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P703TotRoomNightL,IP_65504_P_703_TOT_ROOM_NIGHT_L_LEN)
                  ,beginIp65504P703TotRoomNightL
                  ,IP_65504_P_703_TOT_ROOM_NIGHT_L_LEN
                 );
            localIp65504P703TotRoomNightLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P703TotRoomNightLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P703TotRoomNightL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P703TotRoomNightL() {	 
			return (getShort(beginIp65504P703TotRoomNightL));
   	}
         int localIp65504P704PrepaidExpnseSCounter = -1;
         public boolean isIp65504P704PrepaidExpnseSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P704PrepaidExpnseSCounter != sharedCounter;
            localIp65504P704PrepaidExpnseSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_704_PREPAID_EXPNSE_S_LEN = 2;
  	/**
	 * serializeIp65504P704PrepaidExpnseS
	 */
	protected void serializeIp65504P704PrepaidExpnseS(short ip65504P704PrepaidExpnseS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P704PrepaidExpnseS,IP_65504_P_704_PREPAID_EXPNSE_S_LEN)
                  ,beginIp65504P704PrepaidExpnseS
                  ,IP_65504_P_704_PREPAID_EXPNSE_S_LEN
                 );
            localIp65504P704PrepaidExpnseSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P704PrepaidExpnseSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P704PrepaidExpnseS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P704PrepaidExpnseS() {	 
			return (getShort(beginIp65504P704PrepaidExpnseS));
   	}
         int localIp65504P704PrepaidExpnseLCounter = -1;
         public boolean isIp65504P704PrepaidExpnseLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P704PrepaidExpnseLCounter != sharedCounter;
            localIp65504P704PrepaidExpnseLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_704_PREPAID_EXPNSE_L_LEN = 2;
  	/**
	 * serializeIp65504P704PrepaidExpnseL
	 */
	protected void serializeIp65504P704PrepaidExpnseL(short ip65504P704PrepaidExpnseL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P704PrepaidExpnseL,IP_65504_P_704_PREPAID_EXPNSE_L_LEN)
                  ,beginIp65504P704PrepaidExpnseL
                  ,IP_65504_P_704_PREPAID_EXPNSE_L_LEN
                 );
            localIp65504P704PrepaidExpnseLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P704PrepaidExpnseLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P704PrepaidExpnseL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P704PrepaidExpnseL() {	 
			return (getShort(beginIp65504P704PrepaidExpnseL));
   	}
         int localIp65504P705TotroomTaxamtSCounter = -1;
         public boolean isIp65504P705TotroomTaxamtSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P705TotroomTaxamtSCounter != sharedCounter;
            localIp65504P705TotroomTaxamtSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_705_TOTROOM_TAXAMT_S_LEN = 2;
  	/**
	 * serializeIp65504P705TotroomTaxamtS
	 */
	protected void serializeIp65504P705TotroomTaxamtS(short ip65504P705TotroomTaxamtS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P705TotroomTaxamtS,IP_65504_P_705_TOTROOM_TAXAMT_S_LEN)
                  ,beginIp65504P705TotroomTaxamtS
                  ,IP_65504_P_705_TOTROOM_TAXAMT_S_LEN
                 );
            localIp65504P705TotroomTaxamtSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P705TotroomTaxamtSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P705TotroomTaxamtS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P705TotroomTaxamtS() {	 
			return (getShort(beginIp65504P705TotroomTaxamtS));
   	}
         int localIp65504P705TotroomTaxamtLCounter = -1;
         public boolean isIp65504P705TotroomTaxamtLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P705TotroomTaxamtLCounter != sharedCounter;
            localIp65504P705TotroomTaxamtLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_705_TOTROOM_TAXAMT_L_LEN = 2;
  	/**
	 * serializeIp65504P705TotroomTaxamtL
	 */
	protected void serializeIp65504P705TotroomTaxamtL(short ip65504P705TotroomTaxamtL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P705TotroomTaxamtL,IP_65504_P_705_TOTROOM_TAXAMT_L_LEN)
                  ,beginIp65504P705TotroomTaxamtL
                  ,IP_65504_P_705_TOTROOM_TAXAMT_L_LEN
                 );
            localIp65504P705TotroomTaxamtLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P705TotroomTaxamtLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P705TotroomTaxamtL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P705TotroomTaxamtL() {	 
			return (getShort(beginIp65504P705TotroomTaxamtL));
   	}
         int localIp65504P706CashAdvanceSCounter = -1;
         public boolean isIp65504P706CashAdvanceSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P706CashAdvanceSCounter != sharedCounter;
            localIp65504P706CashAdvanceSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_706_CASH_ADVANCE_S_LEN = 2;
  	/**
	 * serializeIp65504P706CashAdvanceS
	 */
	protected void serializeIp65504P706CashAdvanceS(short ip65504P706CashAdvanceS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P706CashAdvanceS,IP_65504_P_706_CASH_ADVANCE_S_LEN)
                  ,beginIp65504P706CashAdvanceS
                  ,IP_65504_P_706_CASH_ADVANCE_S_LEN
                 );
            localIp65504P706CashAdvanceSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P706CashAdvanceSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P706CashAdvanceS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P706CashAdvanceS() {	 
			return (getShort(beginIp65504P706CashAdvanceS));
   	}
         int localIp65504P706CashAdvanceLCounter = -1;
         public boolean isIp65504P706CashAdvanceLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P706CashAdvanceLCounter != sharedCounter;
            localIp65504P706CashAdvanceLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_706_CASH_ADVANCE_L_LEN = 2;
  	/**
	 * serializeIp65504P706CashAdvanceL
	 */
	protected void serializeIp65504P706CashAdvanceL(short ip65504P706CashAdvanceL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P706CashAdvanceL,IP_65504_P_706_CASH_ADVANCE_L_LEN)
                  ,beginIp65504P706CashAdvanceL
                  ,IP_65504_P_706_CASH_ADVANCE_L_LEN
                 );
            localIp65504P706CashAdvanceLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P706CashAdvanceLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P706CashAdvanceL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P706CashAdvanceL() {	 
			return (getShort(beginIp65504P706CashAdvanceL));
   	}
         int localIp65504P707ValetChrgeSCounter = -1;
         public boolean isIp65504P707ValetChrgeSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P707ValetChrgeSCounter != sharedCounter;
            localIp65504P707ValetChrgeSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_707_VALET_CHRGE_S_LEN = 2;
  	/**
	 * serializeIp65504P707ValetChrgeS
	 */
	protected void serializeIp65504P707ValetChrgeS(short ip65504P707ValetChrgeS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P707ValetChrgeS,IP_65504_P_707_VALET_CHRGE_S_LEN)
                  ,beginIp65504P707ValetChrgeS
                  ,IP_65504_P_707_VALET_CHRGE_S_LEN
                 );
            localIp65504P707ValetChrgeSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P707ValetChrgeSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P707ValetChrgeS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P707ValetChrgeS() {	 
			return (getShort(beginIp65504P707ValetChrgeS));
   	}
         int localIp65504P707ValetChrgeLCounter = -1;
         public boolean isIp65504P707ValetChrgeLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P707ValetChrgeLCounter != sharedCounter;
            localIp65504P707ValetChrgeLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_707_VALET_CHRGE_L_LEN = 2;
  	/**
	 * serializeIp65504P707ValetChrgeL
	 */
	protected void serializeIp65504P707ValetChrgeL(short ip65504P707ValetChrgeL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P707ValetChrgeL,IP_65504_P_707_VALET_CHRGE_L_LEN)
                  ,beginIp65504P707ValetChrgeL
                  ,IP_65504_P_707_VALET_CHRGE_L_LEN
                 );
            localIp65504P707ValetChrgeLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P707ValetChrgeLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P707ValetChrgeL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P707ValetChrgeL() {	 
			return (getShort(beginIp65504P707ValetChrgeL));
   	}
         int localIp65504P708MovieChrgeSCounter = -1;
         public boolean isIp65504P708MovieChrgeSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P708MovieChrgeSCounter != sharedCounter;
            localIp65504P708MovieChrgeSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_708_MOVIE_CHRGE_S_LEN = 2;
  	/**
	 * serializeIp65504P708MovieChrgeS
	 */
	protected void serializeIp65504P708MovieChrgeS(short ip65504P708MovieChrgeS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P708MovieChrgeS,IP_65504_P_708_MOVIE_CHRGE_S_LEN)
                  ,beginIp65504P708MovieChrgeS
                  ,IP_65504_P_708_MOVIE_CHRGE_S_LEN
                 );
            localIp65504P708MovieChrgeSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P708MovieChrgeSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P708MovieChrgeS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P708MovieChrgeS() {	 
			return (getShort(beginIp65504P708MovieChrgeS));
   	}
         int localIp65504P708MovieChrgeLCounter = -1;
         public boolean isIp65504P708MovieChrgeLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P708MovieChrgeLCounter != sharedCounter;
            localIp65504P708MovieChrgeLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_708_MOVIE_CHRGE_L_LEN = 2;
  	/**
	 * serializeIp65504P708MovieChrgeL
	 */
	protected void serializeIp65504P708MovieChrgeL(short ip65504P708MovieChrgeL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P708MovieChrgeL,IP_65504_P_708_MOVIE_CHRGE_L_LEN)
                  ,beginIp65504P708MovieChrgeL
                  ,IP_65504_P_708_MOVIE_CHRGE_L_LEN
                 );
            localIp65504P708MovieChrgeLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P708MovieChrgeLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P708MovieChrgeL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P708MovieChrgeL() {	 
			return (getShort(beginIp65504P708MovieChrgeL));
   	}
         int localIp65504P709BsnsCntrChrgSCounter = -1;
         public boolean isIp65504P709BsnsCntrChrgSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P709BsnsCntrChrgSCounter != sharedCounter;
            localIp65504P709BsnsCntrChrgSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_709_BSNS_CNTR_CHRG_S_LEN = 2;
  	/**
	 * serializeIp65504P709BsnsCntrChrgS
	 */
	protected void serializeIp65504P709BsnsCntrChrgS(short ip65504P709BsnsCntrChrgS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P709BsnsCntrChrgS,IP_65504_P_709_BSNS_CNTR_CHRG_S_LEN)
                  ,beginIp65504P709BsnsCntrChrgS
                  ,IP_65504_P_709_BSNS_CNTR_CHRG_S_LEN
                 );
            localIp65504P709BsnsCntrChrgSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P709BsnsCntrChrgSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P709BsnsCntrChrgS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P709BsnsCntrChrgS() {	 
			return (getShort(beginIp65504P709BsnsCntrChrgS));
   	}
         int localIp65504P709BsnsCntrChrgLCounter = -1;
         public boolean isIp65504P709BsnsCntrChrgLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P709BsnsCntrChrgLCounter != sharedCounter;
            localIp65504P709BsnsCntrChrgLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_709_BSNS_CNTR_CHRG_L_LEN = 2;
  	/**
	 * serializeIp65504P709BsnsCntrChrgL
	 */
	protected void serializeIp65504P709BsnsCntrChrgL(short ip65504P709BsnsCntrChrgL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P709BsnsCntrChrgL,IP_65504_P_709_BSNS_CNTR_CHRG_L_LEN)
                  ,beginIp65504P709BsnsCntrChrgL
                  ,IP_65504_P_709_BSNS_CNTR_CHRG_L_LEN
                 );
            localIp65504P709BsnsCntrChrgLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P709BsnsCntrChrgLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P709BsnsCntrChrgL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P709BsnsCntrChrgL() {	 
			return (getShort(beginIp65504P709BsnsCntrChrgL));
   	}
         int localIp65504P710HelthclubChrgSCounter = -1;
         public boolean isIp65504P710HelthclubChrgSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P710HelthclubChrgSCounter != sharedCounter;
            localIp65504P710HelthclubChrgSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_710_HELTHCLUB_CHRG_S_LEN = 2;
  	/**
	 * serializeIp65504P710HelthclubChrgS
	 */
	protected void serializeIp65504P710HelthclubChrgS(short ip65504P710HelthclubChrgS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P710HelthclubChrgS,IP_65504_P_710_HELTHCLUB_CHRG_S_LEN)
                  ,beginIp65504P710HelthclubChrgS
                  ,IP_65504_P_710_HELTHCLUB_CHRG_S_LEN
                 );
            localIp65504P710HelthclubChrgSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P710HelthclubChrgSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P710HelthclubChrgS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P710HelthclubChrgS() {	 
			return (getShort(beginIp65504P710HelthclubChrgS));
   	}
         int localIp65504P710HelthclubChrgLCounter = -1;
         public boolean isIp65504P710HelthclubChrgLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P710HelthclubChrgLCounter != sharedCounter;
            localIp65504P710HelthclubChrgLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_710_HELTHCLUB_CHRG_L_LEN = 2;
  	/**
	 * serializeIp65504P710HelthclubChrgL
	 */
	protected void serializeIp65504P710HelthclubChrgL(short ip65504P710HelthclubChrgL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P710HelthclubChrgL,IP_65504_P_710_HELTHCLUB_CHRG_L_LEN)
                  ,beginIp65504P710HelthclubChrgL
                  ,IP_65504_P_710_HELTHCLUB_CHRG_L_LEN
                 );
            localIp65504P710HelthclubChrgLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P710HelthclubChrgLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P710HelthclubChrgL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P710HelthclubChrgL() {	 
			return (getShort(beginIp65504P710HelthclubChrgL));
   	}
         int localIp65504P711FireSfactIndSCounter = -1;
         public boolean isIp65504P711FireSfactIndSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P711FireSfactIndSCounter != sharedCounter;
            localIp65504P711FireSfactIndSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_711_FIRE_SFACT_IND_S_LEN = 2;
  	/**
	 * serializeIp65504P711FireSfactIndS
	 */
	protected void serializeIp65504P711FireSfactIndS(short ip65504P711FireSfactIndS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P711FireSfactIndS,IP_65504_P_711_FIRE_SFACT_IND_S_LEN)
                  ,beginIp65504P711FireSfactIndS
                  ,IP_65504_P_711_FIRE_SFACT_IND_S_LEN
                 );
            localIp65504P711FireSfactIndSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P711FireSfactIndSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P711FireSfactIndS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P711FireSfactIndS() {	 
			return (getShort(beginIp65504P711FireSfactIndS));
   	}
         int localIp65504P711FireSfactIndLCounter = -1;
         public boolean isIp65504P711FireSfactIndLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P711FireSfactIndLCounter != sharedCounter;
            localIp65504P711FireSfactIndLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_711_FIRE_SFACT_IND_L_LEN = 2;
  	/**
	 * serializeIp65504P711FireSfactIndL
	 */
	protected void serializeIp65504P711FireSfactIndL(short ip65504P711FireSfactIndL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P711FireSfactIndL,IP_65504_P_711_FIRE_SFACT_IND_L_LEN)
                  ,beginIp65504P711FireSfactIndL
                  ,IP_65504_P_711_FIRE_SFACT_IND_L_LEN
                 );
            localIp65504P711FireSfactIndLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P711FireSfactIndLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P711FireSfactIndL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P711FireSfactIndL() {	 
			return (getShort(beginIp65504P711FireSfactIndL));
   	}
         int localIp65504P712NetFuelPriceSCounter = -1;
         public boolean isIp65504P712NetFuelPriceSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P712NetFuelPriceSCounter != sharedCounter;
            localIp65504P712NetFuelPriceSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_712_NET_FUEL_PRICE_S_LEN = 2;
  	/**
	 * serializeIp65504P712NetFuelPriceS
	 */
	protected void serializeIp65504P712NetFuelPriceS(short ip65504P712NetFuelPriceS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P712NetFuelPriceS,IP_65504_P_712_NET_FUEL_PRICE_S_LEN)
                  ,beginIp65504P712NetFuelPriceS
                  ,IP_65504_P_712_NET_FUEL_PRICE_S_LEN
                 );
            localIp65504P712NetFuelPriceSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P712NetFuelPriceSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P712NetFuelPriceS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P712NetFuelPriceS() {	 
			return (getShort(beginIp65504P712NetFuelPriceS));
   	}
         int localIp65504P712NetFuelPriceLCounter = -1;
         public boolean isIp65504P712NetFuelPriceLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P712NetFuelPriceLCounter != sharedCounter;
            localIp65504P712NetFuelPriceLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_712_NET_FUEL_PRICE_L_LEN = 2;
  	/**
	 * serializeIp65504P712NetFuelPriceL
	 */
	protected void serializeIp65504P712NetFuelPriceL(short ip65504P712NetFuelPriceL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P712NetFuelPriceL,IP_65504_P_712_NET_FUEL_PRICE_L_LEN)
                  ,beginIp65504P712NetFuelPriceL
                  ,IP_65504_P_712_NET_FUEL_PRICE_L_LEN
                 );
            localIp65504P712NetFuelPriceLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P712NetFuelPriceLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P712NetFuelPriceL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P712NetFuelPriceL() {	 
			return (getShort(beginIp65504P712NetFuelPriceL));
   	}
         int localIp65504P713RestrctTktindSCounter = -1;
         public boolean isIp65504P713RestrctTktindSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P713RestrctTktindSCounter != sharedCounter;
            localIp65504P713RestrctTktindSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_713_RESTRCT_TKTIND_S_LEN = 2;
  	/**
	 * serializeIp65504P713RestrctTktindS
	 */
	protected void serializeIp65504P713RestrctTktindS(short ip65504P713RestrctTktindS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P713RestrctTktindS,IP_65504_P_713_RESTRCT_TKTIND_S_LEN)
                  ,beginIp65504P713RestrctTktindS
                  ,IP_65504_P_713_RESTRCT_TKTIND_S_LEN
                 );
            localIp65504P713RestrctTktindSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P713RestrctTktindSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P713RestrctTktindS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P713RestrctTktindS() {	 
			return (getShort(beginIp65504P713RestrctTktindS));
   	}
         int localIp65504P713RestrctTktindLCounter = -1;
         public boolean isIp65504P713RestrctTktindLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P713RestrctTktindLCounter != sharedCounter;
            localIp65504P713RestrctTktindLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_713_RESTRCT_TKTIND_L_LEN = 2;
  	/**
	 * serializeIp65504P713RestrctTktindL
	 */
	protected void serializeIp65504P713RestrctTktindL(short ip65504P713RestrctTktindL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P713RestrctTktindL,IP_65504_P_713_RESTRCT_TKTIND_L_LEN)
                  ,beginIp65504P713RestrctTktindL
                  ,IP_65504_P_713_RESTRCT_TKTIND_L_LEN
                 );
            localIp65504P713RestrctTktindLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P713RestrctTktindLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P713RestrctTktindL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P713RestrctTktindL() {	 
			return (getShort(beginIp65504P713RestrctTktindL));
   	}




}
  
